#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK OZON товары, одежда, билеты."""

import json
import os

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
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20,
                    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16,
                    spaceBefore=12, spaceAfter=6,
                    textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4,
                      alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
CELL_SM = ParagraphStyle("CELL_SM", fontName="DJ", fontSize=6.6, leading=8.2)
CELL_SM_B = ParagraphStyle("CELL_SM_B", fontName="DJ-B", fontSize=6.6, leading=8.2)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
                       textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None, compact=False):
    key_style = CELL_SM_B if compact else CELL_B
    val_style = CELL_SM if compact else CELL
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]),
                      CELL_SM_B if compact else CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]),
                      CELL_SM_B if compact else CELL_B),
        ])
    for k, v in rows:
        data.append([Paragraph(esc(k), key_style), Paragraph(esc(v), val_style)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("TOPPADDING", (0, 0), (-1, -1), 2 if compact else 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 2 if compact else 3),
    ]
    if header:
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.BLUETOOTH, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.DETECT_SCREEN_RECORDING, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.INTERNET, "
    "android.permission.NFC, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_BASIC_PHONE_STATE, "
    "android.permission.READ_CALL_LOG, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "ru.ozon.app.android.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "ru.ozon.fintech.permission.WRITE_PROVIDER_DATA"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "Firebase Analytics, Google Analytics / Measurement, Google Tag Manager, "
    "AppsFlyer 6.13.1 (атрибуция установок и deeplink), "
    "Google Play Install Referrer, Google Advertising ID, "
    "Sentry (io.sentry + ru.ozon.ozonSentryHelper), "
    "AppTracer (sdk-api.apptracer.ru), "
    "Ozon Tracker / Trinity (собственная аналитика: appsflyerId, advertisingId, "
    "firebaseInstallId, deviceModel, osVersion, userAgent и др.), "
    "Ozon Logger / HAR Logger"
)

LIBRARIES = (
    "androidx.appcompat, androidx.activity (+compose, ktx), androidx.fragment "
    "(+ktx), androidx.core (+ktx, splashscreen), androidx.compose (runtime, ui, "
    "foundation, material, material3, animation), androidx.constraintlayout "
    "(+compose), androidx.lifecycle, androidx.navigation (+compose, fragment), "
    "androidx.paging (+rxjava2), androidx.room, androidx.sqlite, androidx.work, "
    "androidx.datastore, androidx.browser (Custom Tabs), androidx.webkit, "
    "androidx.biometric, androidx.credentials (+play-services-auth), "
    "androidx.camera, androidx.media, androidx.recyclerview, androidx.viewpager2, "
    "androidx.preference, androidx.security-crypto, androidx.startup, "
    "androidx.profileinstaller, androidx.window, androidx.emoji2, "
    "com.google.android.material 1.6.1, Dagger 2.48.1, Kotlin 2.0.21, "
    "kotlinx-coroutines, OkHttp3, Retrofit2, Moshi (com.squareup.moshi + "
    "ru.ozon.moshi), Glide, Coil, Lottie (com.airbnb.lottie), Facebook Shimmer, "
    "RxJava2 (io.reactivex), Jsoup, Chromium Cronet (org.chromium.net), "
    "Google Play Services (ads-identifier, analytics, auth, auth-api-phone, "
    "base, basement, cloud-messaging, fido, identity, location, maps, "
    "measurement, mlkit barcode/text-recognition, stats, tagmanager, "
    "tapandpay, tasks, wallet), Firebase (analytics, messaging, installations, "
    "datatransport, iid), AppsFlyer, Sentry, ML Kit Barcode/Text Recognition, "
    "Yandex MapKit, VK ID SDK, RuStore Push SDK, Tinkoff / SberDevices "
    "(SaluteVision), Ozon Composer / Uni UI / Fintech / Push / Tracker / "
    "MapSDK / InAppUpdate / Pikazon"
)

SHARED_PREFS = (
    "Основное хранилище OZON_PREFS и шифрованное OZON_PREFS_ENCRYPTED "
    "(AES256_SIV/GCM через security-crypto): UNIQUE_APPLICATION_ID (постоянный "
    "номер установки), версии приложения (version_name / version_code). Отдельно: "
    "app_version_preferences, adult_preference (доступ к товарам 18+), "
    "LocaleDataStorePreferences / LOCALIZATION_DEBUG_PREFS, MAP_PREFERENCES, "
    "PLAYER_PREFERENCES, SBER_PAY_PREFERENCES, BARCODE_PREFERENCES, "
    "CACHE_PREFERENCES, cronet_prefs_name, preload_cache, "
    "StartupArgsServiceSharedPreferences, ServiceMeshSharedPreferences, "
    "THIRD_PARTY_LIBRARIES_CONFIG, SUGGEST_PUSH_ENABLE, ORDER_COUNTS_SHARED, "
    "scan_it_prefs, OfflineWidgetPreferences, onboarding prefs, "
    "PREFERENCES_FILTER_STATES (чат), railway_mock_preference / OZON_PREFS.QA "
    "(отладка). Fintech хранит URL банковских экранов и флаги стенда в своих "
    "SharedPreferences / ContentProvider. Ключей с URL оффера / gate / "
    "white-page нет."
)

SUSPICIOUS_WORDS = (
    "antibot / AntiBot (AntibotEmptyActivity, FullScreenAntibotActivity — "
    "защита заказов от роботов, не cloaking), whitelist (DomainsWhitelistFlag "
    "для безопасных доменов WebView; WhiteListApps для банковских приложений), "
    "slots (UI-слоты видео/форм, не игровые автоматы), offer "
    "(delivery_review_poll_offer — «тайный покупатель»), redirect "
    "(навигация / OAuth / payment redirect), bridge / NativeBridge "
    "(мост JS↔Android в fintech WebView), deposit (иконки вкладов Ozon "
    "Finance, не казино), landing (экраны онбординга), bot (antibot), "
    "webview url / loadUrl (PaymentActivity, MiniAppWebActivity, fintech "
    "WebView на ozon.ru / finance.ozon.ru)"
)

DOMAIN_NOTES = {
    "alekberg.net": (
        "Адрес из встроенного списка DNS-over-HTTPS (рядом встречается "
        "dnsnl.alekberg.net) сетевого стека Chromium Cronet. Сейчас домен "
        "припаркован у Onamae.com и отдаёт страницу Cloudflare «Attention "
        "Required»; детекций VirusTotal нет (0/91). Это запасной DNS-резолвер "
        "браузерного движка, а не скрытый «gate» оффера."
    ),
    "am.ozon.com": (
        "Региональный хост Ozon из списка bx_prod_native_domains рядом с "
        "ozon.ru / ozon.com / uz.ozon.com / mn.ozon.com — нативные домены "
        "витрины. Прямой запрос показывает страницу Ozon про отсутствие "
        "соединения; VirusTotal 0/91. Штатный адрес магазина, не внешний оффер."
    ),
    "cdn-qa.ozonru.me": (
        "Тестовый CDN Ozon (среда QA, зона ozonru.me). Сейчас отвечает "
        "403 Forbidden от nginx; детекций VirusTotal нет. В проде приложение "
        "ходит на боевые CDN, а этот хост остаётся в конфигах стендов / "
        "отладки — безопасный служебный адрес компании."
    ),
    "cdn-stg.ozonru.me": (
        "Staging-CDN Ozon (предпрод). При проверке соединение оборвалось по "
        "таймауту; VirusTotal 0/91. Используется для тестовых сборок и "
        "переключения стенда, а не для раздачи «грязного» трафика или офферов."
    ),
    "cdn1.ozone.ru": (
        "Основной CDN картинок, иконок, карты и статики Ozon (cdn1.ozone.ru "
        "зашит в карты, финансы, онбординг, messenger). Один движок "
        "(Forcepoint ThreatSeeker) пометил домен Malicious (1/91), остальные "
        "Clean/Unrated; прямой ответ при проверке не открылся по таймауту. "
        "По коду это штатный контент-CDN официального магазина, не cloaking-домен."
    ),
    "checkout.ozon.ru": (
        "Боевой адрес оформления оплаты и checkout Ozon (CoreHosts.fintechUrls). "
        "На стейдже подменяется на checkout.ozonru.me. VirusTotal 0/91. Это "
        "платёжный контур маркетплейса, а не внешняя рекламная витрина."
    ),
    "chrome.cloudflare-dns.com": (
        "Публичный DNS-over-HTTPS Cloudflare, который тянет Chromium/Chrome "
        "Custom Tabs / Cronet. VirusTotal 0/91. Нужен только для безопасного "
        "разрешения имён сайтов, не связан с офферами или фильтрацией «белого» "
        "трафика внутри Ozon."
    ),
    "com.meizu.cloud": (
        "Не веб-сайт, а имя пакета Meizu в queries манифеста и в списке "
        "FLYME_PUSH (com.meizu.cloud / flyme.push / mzsyncservice) — чтобы "
        "приложение видело облако/пуш Meizu на устройстве. DNS для такой "
        "«доменной» записи бессмысленен; VirusTotal 0/91. Это межприложенческая "
        "видимость производителя, не cloaking-хост."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    ("Название приложения",
     "OZON товары, одежда, билеты (ru.ozon.app.android), версия 19.28.0 "
     "(versionCode 2698), разработчик Internet Solutions LLC"),
    ("Android Gradle Plugin", "8.9.2"),
    ("minSdk", "26"),
    ("targetSdk", "35"),
    ("Kotlin", "да, 2.0.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены",
     ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет"),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — OZON товары, одежда, билеты",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "OZON товары, одежда, билеты &mdash; Internet Solutions LLC &mdash; "
        "ru.ozon.app.android (версия 19.28.0)", BODY))
    story.append(Paragraph(
        "Разобраны: ru.ozon.app.android.xapk, apk/ru.ozon.app.android.apk, "
        "apk/config.arm64_v8a.apk, apk/config.xxhdpi.apk, meta.json, "
        "domain_checks.json / domain_checks.md, "
        "decompiled/resources/AndroidManifest.xml, res/values/strings.xml и "
        "декомпилированные исходники (в т.ч. A…A9 и пакеты ru.ozon.*, "
        "com.appsflyer, com.google.firebase, io.sentry, androidx, okhttp3). "
        "Точка входа: OzonApplication → AppHostActivity "
        "(deeplink: DeeplinkActivity).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(
        MAIN_ROWS, widths=(42 * mm, 128 * mm),
        header=("Параметр", "Значение"), compact=True))

    if CHECKED_DOMAINS:
        story.append(Paragraph("Проверка подозрительных доменов", H2))
        story.append(Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный "
            "список Security vendors' analysis и три дополнительных пункта "
            "в конце.", SMALL))

        for dom in CHECKED_DOMAINS:
            rec = by_domain.get(dom)
            if not rec:
                continue
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
            story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
            story.append(kv_table(
                rows, widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт")))
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
