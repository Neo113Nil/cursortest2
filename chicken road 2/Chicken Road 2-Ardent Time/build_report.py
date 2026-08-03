#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Chicken Road 2 (Ardent Time / com.watchfacestudio.huasi_urx110)."""

import json
import os
import re

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS_MD = os.path.join(BASE, "domain_checks.md")
CHECKS_JSON = os.path.join(BASE, "domain_checks.json")

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
        (
            "Подозрительные домены",
            "api.githubcopilot.com, app.uaas.yandex.ru, appmetrica.io, config.ru, dispatchers.io",
        ),
        (
            "SharedPreferences",
            "FlutterSharedPreferences (egg_balance, score_ledger и игровые флаги); "
            "пакет_varioqub_pref (etag, experiments, fetched_config_key, activated_config_key, "
            "identifier, last_fetched_time_ms_key); AppMetrica UUID/startup",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "openCrossing, trail, lane_crossing, uri, url, fetchConfig, activateConfig, getString",
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

    domain_tables = parse_domain_checks_md(CHECKS_MD)
    for domain, rows in domain_tables:
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(rows, header=("Параметр / движок", "Значение / вердикт")))

    story.append(Paragraph("Какие данные собираются", H2))
    bullets = [
        "язык телефона → на каком языке настроен телефон; уходит в проверку удалённых настроек и часто влияет на то, какую ссылку вернут",
        "номер устройства в аналитике (device id) → служебный идентификатор телефона из AppMetrica; сервер отличает одно устройство от другого",
        "номер пользователя в аналитике (user id / uuid) → дополнительный служебный номер учёта в AppMetrica",
        "рекламный номер устройства → номер для рекламы из Google Play services; AppMetrica читает его для аналитики и связки с проверкой",
        "имя приложения в системе → техническое имя пакета com.watchfacestudio.huasi_urx110",
        "версия приложения (название и код) → какая сборка стоит на телефоне",
        "версия Android и уровень API → какая система у человека",
        "платформа → пометка, что это Android",
        "версия библиотеки удалённых настроек → служебная версия Varioqub (0.7.0)",
        "имя адаптера аналитики → пометка AppMetricaAdapter",
        "клиентские признаки (client features) → дополнительные пары «ключ–значение», если приложение их задало при запуске настроек",
        "идентификатор конфигурации / etag → служебная метка уже скачанных настроек, чтобы не качать то же самое повторно",
        "идентификатор клиента Varioqub → номер проекта удалённых настроек (в сборке виден UUID ee5d8da7-d77c-4f09-a8b9-8cd8fddc4804)",
        "модель устройства → марка и модель телефона через плагин сведений об устройстве",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу после запуска открывается главный экран Flutter. Без отдельного окна с разрешением "
                "приложение само поднимает аналитику AppMetrica и удалённые настройки Varioqub. "
                "Язык берётся из настроек телефона, версия приложения и Android — из системы, "
                "номера устройства и пользователя — из AppMetrica, рекламный номер — через Google Play services. "
                "Модель телефона читается плагином сведений об устройстве. Человек этого обычно не замечает: "
                "сбор идёт в фоне, пока показывается обычный экран приложения."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Флаг и результаты проверки потом лежат в памяти приложения: игровые значения — в FlutterSharedPreferences, "
                "скачанные удалённые настройки — в файле настроек с суффиксом _varioqub_pref."
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
                "Это не показ рекламы на экране, а проверка «какие настройки и какую ссылку выдать этому человеку». "
                "Параллельно аналитика AppMetrica общается со своими служебными адресами "
                "(в том числе startup.mobile.yandex.net и связанные хосты вроде dispatchers.io / appmetrica.io). "
                "Адрес проверки в коде задан шаблоном; при желании его можно переопределить при инициализации."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Ответ с настройками сохраняется на телефоне (etag, experiments, fetched_config_key, activated_config_key), "
                "чтобы при следующем запуске не начинать с нуля."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "На проверку уходят язык телефона, номера устройства и пользователя, версии приложения и системы, "
                "платформа и связанные служебные признаки. В самом приложении нет жёсткого списка стран или «белых» языков: "
                "решение «кому показать внешнюю ссылку, а кому обычное приложение» делает сервер удалённых настроек. "
                "Приложение лишь отправляет признаки и потом читает строку из ответа."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если запрос заблокировали по частоте или не пришли идентификаторы, конфиг не обновляется — "
                "тогда остаётся прошлый сохранённый вариант или пустое значение по умолчанию."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "Сервер Varioqub отвечает набором ключей настроек. Приложение через getString читает строковое значение "
                "(по смыслу ссылка / uri / url). Если строка непустая — это «боевой» вариант: есть куда вести человека. "
                "Если строка пустая или ключ не задан — считаем, что внешней страницы нет и можно остаться в обычном режиме. "
                "После удачной загрузки конфиг активируют (activateConfig), и выбранные значения начинают действовать в сессии."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Если из удалённых настроек пришла непустая ссылка, Flutter вызывает канал "
                "com.watchfacestudio.huasi_urx110/lane_crossing методом openCrossing и передаёт ссылку в поле trail. "
                "Нативный код открывает её во внешнем браузере телефона через Custom Tabs (системный просмотр страниц "
                "с заголовком Accept-Language). Отдельного встроенного окна сайта для оффера в приложении нет."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если ссылки нет или она пустая, человеку просто остаётся обычное приложение — без перехода на внешнюю страницу."
            ),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
