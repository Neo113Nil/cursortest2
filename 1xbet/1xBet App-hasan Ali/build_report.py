#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK 1xBet App (hasan Ali / game.betting133.sports1xbet)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (
    Paragraph,
    SimpleDocTemplate,
    Spacer,
    Table,
    TableStyle,
)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle(
    "H1",
    fontName="DJ-B",
    fontSize=16,
    leading=20,
    spaceAfter=8,
    textColor=colors.HexColor("#12263f"),
)
H2 = ParagraphStyle(
    "H2",
    fontName="DJ-B",
    fontSize=12.5,
    leading=16,
    spaceBefore=12,
    spaceAfter=6,
    textColor=colors.HexColor("#12263f"),
)
BODY = ParagraphStyle(
    "BODY",
    fontName="DJ",
    fontSize=9.3,
    leading=13.4,
    alignment=TA_LEFT,
    spaceAfter=5,
)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle(
    "SMALL",
    fontName="DJ",
    fontSize=8.4,
    leading=11.6,
    textColor=colors.HexColor("#444444"),
    spaceAfter=6,
)
BULLET = ParagraphStyle(
    "BULLET",
    fontName="DJ",
    fontSize=9.3,
    leading=13.4,
    leftIndent=10,
    spaceAfter=3,
)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (
        str(text)
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
    )


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B
                ),
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B
                ),
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
        style += [
            ("BACKGROUND", (0, 0), (-1, 0), HEAD_BG),
            ("BACKGROUND", (0, 1), (-1, 1), ALT_BG),
        ]
        for i in range(2, len(data)):
            if i % 2 == 1:
                style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    else:
        for i in range(len(data)):
            if i % 2 == 1:
                style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.READ_PHONE_STATE, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.WAKE_LOCK, "
    "android.permission.FOREGROUND_SERVICE, "
    "game.betting133.sports1xbet.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.android.vending.CHECK_LICENSE"
)

LIBRARIES = (
    "Kotlin 2.0.21 + kotlinx-coroutines 1.9.0, Jetpack Compose (ui/material3/foundation/"
    "animation/runtime 1.7–1.9), androidx.activity 1.13.0, androidx.appcompat 1.7.1, "
    "androidx.core 1.18.0, androidx.browser 1.8.0, androidx.webkit 1.11.0-alpha02, "
    "androidx.navigation 2.8.9, androidx.lifecycle 2.10.0, androidx.work 2.7.0, "
    "androidx.room 2.2.5, androidx.startup, Coil, OkHttp3, Retrofit2 (встроенный клиент), "
    "Gson, Google Play Services Ads / Ads Identifier / AppSet / Basement / Tasks / "
    "Measurement, Google Mobile Ads (AdMob), Google Pairip licensecheck"
)

SHARED_PREFS = (
    "admob_user_agent / admob / google_ads_flags / app_set_id_storage — служебные "
    "настройки Google Ads и App Set ID; результат удалённого конфига (landingUrl, "
    "returnUrl, adMarker, adUnitId) хранится в оперативной памяти процесса, не в "
    "именованных SharedPreferences приложения"
)

SUSPICIOUS_WORDS = (
    "betting, slots, offer, landing, landingUrl, returnUrl, partnerConfig, "
    "adMarker, adMarkerQureka, adMarkerAdx, gatekeeper, language, redirect, "
    "webview, loadUrl, whitelist, bot, Config URL"
)

SUSPICIOUS_DOMAINS = [
    "vlt7vk43axcwg6zhr7m63cwawi0ltfof.lambda-url.ap-southeast-1.on.aws",
    "316.multigamezone.com",
    "media.api-sports.io",
    "config.ru",
]

MAIN_ROWS = [
    ("Название приложения", "1xBet App (в приложении: 1xBet Guide)"),
    ("Android Gradle Plugin", "8.10.1"),
    ("minSdk", "23"),
    ("targetSdk", "36"),
    ("Kotlin", "да, 2.0.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", "AdMob (Google Mobile Ads: app open, native, banner, interstitial)"),
    (
        "Аналитика",
        "Google Play Services Measurement (measurement-base / measurement-sdk-api), "
        "рекламный идентификатор / App Set ID",
    ),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "да"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def domain_rows_from_check(entry):
    rows = []
    for item in entry.get("table_rows") or []:
        rows.append((item.get("param", ""), item.get("value", "")))
    if rows:
        return rows
    vt = entry.get("virustotal") or {}
    rows = [
        ("Домен", entry.get("domain", "")),
        ("VirusTotal URL", vt.get("vt_url", "")),
        ("Детекции", vt.get("detections", "")),
        ("Security vendors' analysis", "ниже построчно, как на VirusTotal"),
    ]
    for name, verdict in vt.get("vendor_rows") or []:
        rows.append((name, verdict))
    rows.append(("Куда редиректит", entry.get("redirects_to", "нет")))
    rows.append(("Что выводит (кратко)", entry.get("page_output", "нет")))
    rows.append(("Где припаркован", entry.get("parked_at", "нет")))
    return rows


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=18 * mm,
        rightMargin=18 * mm,
        topMargin=15 * mm,
        bottomMargin=15 * mm,
        title="Отчёт по анализу APK — 1xBet App (hasan Ali)",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "1xBet App &mdash; hasan Ali &mdash; game.betting133.sports1xbet "
            "(в ресурсах: 1xBet Guide, версия 1.0 / 1)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: game.betting133.sports1xbet.xapk, apk/* (base + config splits), "
            "meta.json, domain_checks, AndroidManifest.xml, strings.xml, "
            "decompiled/sources (AquaLaunchBridgeActivity, AquaGuideDeckActivity, "
            "AquaSportsDefaults/ApiService, O3.e Custom Tabs, AquaPayloadCodec AES, "
            "удалённый конфиг hasali02).",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    # Domain VT tables only for domains present in domain_checks
    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(
        Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, "
            "полный список Security vendors' analysis и три дополнительных "
            "пункта в конце.",
            SMALL,
        )
    )

    for domain in SUSPICIOUS_DOMAINS:
        entry = by_domain.get(domain)
        if not entry:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(
            kv_table(
                domain_rows_from_check(entry),
                widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт"),
            )
        )
        story.append(Spacer(1, 3 * mm))

    # Cloak blocks (клоака = да)
    story.append(Paragraph("Какие данные собираются", H2))
    data_items = [
        "код страны SIM-карты → двухбуквенный код страны с SIM (приложение читает его через службу телефона и подставляет в параметр language); по нему удалённый сервер решает, какой режим показать",
        "адрес проверки (зашифрованный в приложении) → секретный интернет-адрес «ворот», который расшифровывается на телефоне перед запросом",
        "маркер режима (adMarker) → метка из ответа сервера: партнёрский оффер, рекламный режим Adx или обычный",
        "ссылка на рекламную страницу (landingUrl) → адрес внешнего сайта из ответа; если он не пустой и режим партнёрский, страницу открывают",
        "обратная ссылка (returnUrl) → запасной адрес из ответа; если он задан, его предпочитают при открытии страницы",
        "идентификаторы рекламных блоков (adUnitId) → номера блоков запуска, нативной ленты, баннера и межстраничной рекламы из ответа сервера",
        "состояние сети → есть ли у телефона рабочий интернет перед запуском проверки",
    ]
    for item in data_items:
        story.append(Paragraph("• " + esc(item), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            "Сразу после открытия стартового экрана приложение само, без отдельного "
            "окна с вопросом, проверяет, есть ли интернет. Если сеть есть, через "
            "примерно две с половиной секунды в фоне запускается тихая проверка: "
            "из зашифрованной строки достаётся адрес «ворот», из системы Android "
            "читается код страны SIM-карты, и эти сведения уходят на сервер. "
            "Человек этого обычно не замечает: отдельного экрана согласия на эту "
            "проверку нет. После ответа серверные поля просто запоминаются в памяти "
            "запущенного приложения.",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Позже, уже внутри обычного режима спортивного гида, приложение отдельно "
            "подтягивает расписания матчей и картинки клубов с сервиса спортивных "
            "данных — это уже работа «белой» части, а не сама развилка оффера.",
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            "Тихий запрос уходит на расшифрованный адрес "
            "https://vlt7vk43axcwg6zhr7m63cwawi0ltfof.lambda-url.ap-southeast-1.on.aws/hasali02. "
            "К нему дописывают параметр language с кодом страны SIM. Это не показ "
            "рекламы на экране, а фоновая проверка «что показать этому человеку». "
            "Запасной зашитый адрес для открытия страницы без ответа сервера — "
            "https://316.multigamezone.com/action-game.html (открывается во вкладке Chrome). "
            "Сам адрес «ворот» в открытом виде в ресурсах не лежит: он спрятан "
            "шифрованием и расшифровывается только перед запросом.",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Отдельно спортивные данные идут на api-football через RapidAPI и "
            "картинки — на media.api-sports.io; эти адреса нужны гиду по матчам, "
            "а не решению «оффер или обычное приложение».",
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            "На проверку уходит код страны SIM-карты (в запросе он назван language). "
            "В самом приложении нет жёсткого списка «разрешённых» или «запрещённых» "
            "стран: оно лишь отправляет этот признак и читает ответ. Само решение "
            "«кому оффер, кому рекламный режим, кому обычный гид» делает сервер по "
            "полю-маркеру и наличию ссылки на страницу.",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Дальше телефон сам разбирает маркер: партнёрский режим (adMarkerQureka) "
            "ведёт на внешнюю страницу; рекламный режим (adMarkerAdx) оставляет "
            "спортивный гид и включает блоки AdMob; если маркер не совпал — "
            "открывается обычный гид без партнёрской страницы. То есть фильтр по "
            "стране/трафику на сервере, а на телефоне — развилка по ответу.",
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            "Сервер отвечает текстовым объектом с настройками. Там есть блок "
            "partnerConfig со ссылками landingUrl и returnUrl, поле-маркер adMarker "
            "и блок placements с номерами рекламных мест (запуск, нативная лента, "
            "баннер, межстраничная). Приложение читает эти поля и записывает их "
            "в память.",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Если маркер партнёрский и ссылка не пустая — считается, что можно "
            "открыть внешнюю страницу. Если маркер рекламный — ссылку на оффер "
            "не открывают, а подключают рекламные блоки из ответа. Если ссылок нет "
            "или маркер «обычный» — человеку остаётся спортивный гид. На момент "
            "проверки ответ часто приходит с пустыми ссылками и маркером Adx: "
            "тогда оффер не показывают, но сама развилка в коде остаётся.",
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            "В «боевом» партнёрском варианте адрес страницы открывают во внешней "
            "вкладке браузера Chrome на телефоне (специальный режим вкладок Chrome), "
            "а не внутри обычного экрана гида. Если с сервера ссылка не пришла, "
            "есть запасной зашитый адрес игровой/рекламной страницы на "
            "multigamezone.com. Часто это страница с играми или похожий рекламный "
            "лендинг, а не сам интерфейс гида.",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "В «белом» варианте человеку просто показывают обычное приложение — "
            "спортивный гид с расписаниями и составами, без перехода на внешнюю "
            "партнёрскую страницу. Параллельно могут показываться обычные "
            "рекламные блоки AdMob, если сервер выдал их номера.",
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
