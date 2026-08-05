#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Chicken Road 2 (Ardent Time / com.watchfacestudio.huasi_urx110)."""

import os
import re

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS_MD = os.path.join(BASE, "domain_checks.md")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20, spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16, spaceBefore=12, spaceAfter=6, textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4, alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
BULLET = ParagraphStyle("BULLET", fontName="DJ", fontSize=9.3, leading=13.4, leftIndent=10, spaceAfter=3)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return str(text).replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 5),
        ("RIGHTPADDING", (0, 0), (-1, -1), 5),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style += [("BACKGROUND", (0, 0), (-1, 0), HEAD_BG)]
        start = 1
    else:
        start = 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


def parse_domain_checks_md(path):
    text = open(path, encoding="utf-8").read()
    parts = re.split(r"(?m)^## Проверка домена:\s*", text)
    domains = []
    for part in parts[1:]:
        lines = part.strip().splitlines()
        domain = lines[0].strip()
        rows = []
        for line in lines:
            m = re.match(r"^\|\s*(.*?)\s*\|\s*(.*?)\s*\|$", line)
            if not m:
                continue
            k, v = m.group(1).strip(), m.group(2).strip()
            if k.startswith("---") or k in ("Параметр / движок",):
                continue
            rows.append((k, v))
        domains.append((domain, rows))
    return domains


def main():
    domain_tables = parse_domain_checks_md(CHECKS_MD)
    # Кастомные/неочевидные из domain_checks (без крупных SDK: Яндекс AppMetrica/Varioqub, GitHub).
    # config.ru — имя language-split в APK; dispatchers.io — совпадение с Kotlin Dispatchers.IO;
    # оба попали в пайплайн проверки и остаются как неочевидные хосты из артефактов.
    suspicious = [
        d
        for d, _ in domain_tables
        if d
        not in {
            "api.githubcopilot.com",
            "app.uaas.yandex.ru",
            "appmetrica.io",
        }
    ]
    suspicious_cell = ", ".join(suspicious) if suspicious else "нет"

    sdk_rows = [
        ("Название приложения", "Chicken Road 2"),
        ("Android Gradle Plugin", "8.6.0"),
        ("minSdk", "25"),
        ("targetSdk", "36"),
        ("Kotlin", "да 2.1.0"),
        ("Web View", "нет"),
        ("Custom Tabs", "да"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "AppMetrica, Varioqub"),
        (
            "Permissions",
            "android.permission.INTERNET, android.permission.ACCESS_NETWORK_STATE, "
            "com.google.android.gms.permission.AD_ID, "
            "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
            "com.watchfacestudio.huasi_urx110.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION",
        ),
        (
            "Libraries",
            "Flutter, io.appmetrica.analytics, com.yandex.varioqub, OkHttp, "
            "androidx.browser, androidx.datastore, shared_preferences, "
            "device_info_plus, com.android.installreferrer, "
            "com.google.android.gms (ads-identifier, basement, tasks), "
            "kotlinx-coroutines",
        ),
        ("Подозрительные домены", suspicious_cell),
        (
            "SharedPreferences",
            "FlutterSharedPreferences (игровые значения и флаги); "
            "com.watchfacestudio.huasi_urx110_varioqub_pref "
            "(etag, experiments, fetched_config_key, activated_config_key, "
            "identifier, config_version, last_fetched_time_ms_key, "
            "last_successful_fetched_time_ms_key, should_notify_adapter, varioqub_testids); "
            "служебные настройки AppMetrica (UUID/startup)",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "openCrossing, trail, lane_crossing, fetchConfig, activateConfig",
        ),
    ]

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
    )
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(kv_table(sdk_rows, header=("Параметр", "Значение")))

    suspicious_set = set(suspicious)
    for domain, rows in domain_tables:
        if domain not in suspicious_set:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(rows, header=("Параметр / движок", "Значение / вердикт")))

    story.append(Paragraph("Какие данные собираются", H2))
    bullets = [
        "идентификатор клиента удалённых настроек → номер проекта на сервере удалённых настроек; "
        "подставляется в адрес проверки как client_id, чтобы сервер понял, о каком приложении речь",
        "служебный идентификатор конфигурации → внутренний номер уже выданных настроек; "
        "нужен, чтобы сервер связал устройство с прошлым ответом",
        "номер пользователя в аналитике → служебный номер учёта из AppMetrica; "
        "по нему сервер отличает одного человека от другого между запусками",
        "номер устройства в аналитике → служебный номер телефона из AppMetrica; "
        "помогает узнать то же устройство при повторном открытии",
        "рекламный номер устройства → номер телефона для рекламы из служб Google; "
        "AppMetrica читает его и связывает с номерами устройства и пользователя",
        "язык телефона → на каком языке настроен телефон; часто по языку решают, "
        "какую ссылку или пустой ответ вернуть",
        "название версии приложения → какая сборка по названию стоит на телефоне",
        "код версии приложения → числовой номер сборки",
        "платформа → пометка, что это Android",
        "версия Android → какая система у человека (например 14)",
        "уровень API Android → технический номер версии системы",
        "версия библиотеки удалённых настроек → служебная версия Varioqub (0.7.0)",
        "имя адаптера аналитики → пометка AppMetricaAdapter, через которую идут номера устройства и пользователя",
        "клиентские признаки → дополнительные пары «ключ–значение», если приложение задало их при запуске настроек",
        "метки времени и служебные замеры → короткие служебные числа о работе библиотеки на телефоне",
        "метка уже скачанных настроек (etag) → уходит в заголовке запроса, чтобы не качать тот же ответ повторно",
        "модель и марка телефона → читаются плагином сведений об устройстве и уходят в аналитику AppMetrica",
        "имя приложения в системе → техническое имя пакета com.watchfacestudio.huasi_urx110; "
        "известно аналитике и привязано к идентификатору клиента на сервере",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу после запуска открывается главный экран на движке Flutter. "
                "Отдельного окна с вопросом «разрешить сбор данных?» нет: приложение само поднимает "
                "аналитику AppMetrica и библиотеку удалённых настроек Varioqub. "
                "Человек обычно видит только обычный старт программы и не замечает фоновой проверки."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Язык берётся из настроек телефона. Версия приложения и код сборки — из сведений "
                "установленной программы. Версия Android и уровень API — из системы. "
                "Номера устройства и пользователя библиотека просит у AppMetrica и ждёт их до десяти секунд; "
                "если номера не пришли, запрос настроек даже не отправляется. "
                "Рекламный номер читается через службы Google Play. "
                "Модель и марка телефона читаются плагином сведений об устройстве."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Идентификатор клиента удалённых настроек передаётся из кода Flutter при инициализации библиотеки. "
                "Уже скачанные настройки, etag и служебные флаги потом лежат в памяти приложения "
                "(файл настроек с суффиксом _varioqub_pref и FlutterSharedPreferences). "
                "Повторный запуск может опереться на сохранённый ответ, а не начинать всё с нуля."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Тихий запрос уходит на адрес удалённых настроек Яндекса: "
                "https://app.uaas.yandex.ru/v1/app?client_id=<идентификатор_клиента>. "
                "Это не показ баннера на экране, а фоновая проверка «какие настройки и какую ссылку "
                "выдать этому человеку». Адрес в коде задан шаблоном; при инициализации его можно "
                "подменить, но по умолчанию используется именно этот хост."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Тело запроса собирается библиотекой и уходит методом POST вместе с заголовком "
                "If-None-Match (метка etag). Параллельно аналитика AppMetrica общается со своими "
                "служебными адресами (в проверках доменов фигурируют appmetrica.io и связанные хосты). "
                "Ответ с настройками сохраняется на телефоне: etag, experiments, fetched_config_key, "
                "activated_config_key, identifier и время последней удачной загрузки."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Запасного «боевого» адреса оффера в нативном коде нет: внешняя страница появляется "
                "только если сервер положит ссылку в удалённые настройки, а Flutter потом передаст "
                "её в канал открытия страницы."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "На проверку уходят язык телефона, номера устройства и пользователя, версии приложения "
                "и системы, платформа, идентификатор клиента и связанные служебные признаки. "
                "В самом приложении нет жёсткого списка стран, «белых» языков или списка ботов: "
                "на телефоне не написано «этим показывать ссылку, а этим — нет»."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Решение «кому показать внешнюю ссылку, а кому обычное приложение» делает сервер "
                "удалённых настроек по присланным признакам. Приложение лишь отправляет данные и потом "
                "читает строку из ответа. Если запрос заблокировали по частоте или не пришли "
                "идентификаторы, конфиг не обновляется — тогда остаётся прошлый сохранённый вариант "
                "или пустое значение по умолчанию."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Плагин сведений об устройстве умеет отличать обычный телефон от эмулятора, "
                "но в цепочке удалённых настроек отдельного локального «запрета для ботов» не видно: "
                "фильтр по смыслу остаётся на стороне сервера."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "Сервер Varioqub отвечает набором ключей настроек. Flutter через getString читает "
                "строковое значение (по смыслу ссылка на внешний сайт). Если строка непустая — это "
                "«боевой» вариант: есть куда вести человека. Если строка пустая или ключ не задан — "
                "считаем, что внешней страницы нет и можно остаться в обычном режиме."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "После удачной загрузки конфиг активируют (activateConfig), и выбранные значения "
                "начинают действовать в текущей сессии. Вместе с ключами могут прийти служебные "
                "данные экспериментов и новый identifier; их сохраняют в памяти приложения. "
                "Отдельного поля вроде «можно / нельзя» в нативном коде не разбирают — развилка "
                "идёт по наличию непустой ссылки в строке настроек."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Если из удалённых настроек пришла непустая ссылка, Flutter вызывает канал "
                "com.watchfacestudio.huasi_urx110/lane_crossing методом openCrossing и передаёт "
                "ссылку в поле trail. Нативный код открывает её во внешнем браузере телефона "
                "через Custom Tabs (системный просмотр страниц) и добавляет заголовок Accept-Language "
                "с языком телефона. Отдельного встроенного окна сайта для оффера в приложении нет."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если ссылка пустая или её нет, вызов открытия страницы сразу завершается без перехода, "
                "и человеку просто остаётся обычное приложение — без внешнего сайта. "
                "Повторно сохранённая непустая ссылка может снова открыть внешнюю страницу "
                "при следующих запусках, пока сервер не вернёт пустое значение."
            ),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
