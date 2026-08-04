#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Fonbet' (Neptune soft, com.neptunesoft.bacdz)."""

import json
import os
import re

import arabic_reshaper
from bidi.algorithm import get_display
from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (ListFlowable, ListItem, Paragraph,
                                SimpleDocTemplate, Spacer, Table, TableStyle)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

DEJAVU = "/usr/share/fonts/truetype/dejavu"
NOTO = "/usr/share/fonts/truetype/noto"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(DEJAVU, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(DEJAVU, "DejaVuSans-Bold.ttf")))
pdfmetrics.registerFont(TTFont("AR", os.path.join(NOTO, "NotoNaskhArabic-Regular.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20,
                    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16,
                    spaceBefore=12, spaceAfter=6,
                    textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4,
                      alignment=TA_LEFT, spaceAfter=5)
BULLET = ParagraphStyle("BULLET", fontName="DJ", fontSize=9.3, leading=13.4,
                        alignment=TA_LEFT, spaceAfter=3)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
                       textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")

ARABIC = r"\u0600-\u06FF\u0750-\u077F\uFB50-\uFDFF\uFE70-\uFEFF"
# Арабский фрагмент: от первой до последней арабской буквы, пробелы и цифры внутри.
ARABIC_RUN = re.compile("[%s][%s\\s0-9]*[%s]|[%s]" % (ARABIC, ARABIC, ARABIC, ARABIC))


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def rich(text):
    """Экранирование + арабские фрагменты в арабском шрифте с правильной формой."""
    out = []
    pos = 0
    for m in ARABIC_RUN.finditer(str(text)):
        out.append(esc(str(text)[pos:m.start()]))
        shaped = get_display(arabic_reshaper.reshape(m.group(0).strip()))
        out.append('<font name="AR">%s</font>' % esc(shaped))
        pos = m.end()
    out.append(esc(str(text)[pos:]))
    return "".join(out)


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
        ])
    for k, v in rows:
        data.append([Paragraph(rich(k), CELL_B), Paragraph(rich(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


def bullets(items):
    return ListFlowable(
        [ListItem(Paragraph(rich(x), BULLET), leftIndent=10) for x in items],
        bulletType="bullet", bulletFontName="DJ", bulletFontSize=8,
        leftIndent=10, start="\u2022")


PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.SCHEDULE_EXACT_ALARM, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "com.neptunesoft.bacdz.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION "
    "(объявлено самим приложением, protectionLevel=signature)"
)

AD_NETWORKS = (
    "AdMob / Google Mobile Ads 24.5.0 — четыре межстраничных блока: "
    "ca-app-pub-4925450921422120/7261253209 (Quiz), "
    "ca-app-pub-4925450921422120/3743204583 (Reload Files), "
    "ca-app-pub-4925450921422120/5129913884 (Topics Solutions), "
    "ca-app-pub-4925450921422120/8722257384; "
    "приложение AdMob: ca-app-pub-4925450921422120~2822228983; "
    "Meta Audience Network (com.facebook.ads + assets/audience_network.dex) "
    "как источник в медиации; "
    "адаптер медиации com.google.ads.mediation.facebook / .admob; "
    "Google User Messaging Platform 3.2.0 (окно согласия на персонализированную рекламу)"
)

ANALYTICS = (
    "Firebase Analytics / Google Measurement 20.1.2 "
    "(play-services-measurement-base, measurement-sdk-api, "
    "firebase-measurement-connector 19.0.0), "
    "Firebase Cloud Messaging (push, класс "
    "com.neptunesoft.bacdz.services.MyFireBaseInstanceServices), "
    "Firebase Installations, Firebase App Check, "
    "Firebase Datatransport / firebase-encoders (отправка событий), "
    "Firebase Realtime Database neptune-soft.firebaseio.com "
    "(форма обратной связи), "
    "Firebase Storage neptune-soft.appspot.com (скачивание PDF), "
    "Google Play Services ads-identifier 18.0.0 и appset 16.0.1 "
    "(рекламный идентификатор для AdMob), "
    "play-services-stats 17.0.2, Google Play In-App Review 2.0.2"
)

LIBRARIES = (
    "androidx.appcompat 1.7.1, androidx.activity 1.8.0, androidx.fragment 1.5.4, "
    "androidx.core / core-ktx 1.13.0, androidx.annotation-experimental 1.4.1, "
    "androidx.browser 1.8.0, androidx.webkit 1.11.0-alpha02, "
    "androidx.cardview 1.0.0, androidx.constraintlayout 2.2.1, "
    "androidx.coordinatorlayout 1.1.0, androidx.recyclerview 1.4.0, "
    "androidx.viewpager 1.0.0, androidx.viewpager2 1.1.0-beta02, "
    "androidx.room 2.7.2, androidx.sqlite 2.5.1, "
    "androidx.datastore 1.1.3 (core + preferences), androidx.lifecycle, "
    "androidx.savedstate 1.2.1, androidx.startup 1.1.1, "
    "androidx.swiperefreshlayout 1.0.0, androidx.work 2.7.0, "
    "androidx.emoji2 1.3.0, androidx.transition 1.5.0, "
    "androidx.vectordrawable 1.1.0 (+ animated), androidx.print 1.0.0, "
    "androidx.media 1.0.0, androidx.documentfile 1.0.0, "
    "androidx.drawerlayout 1.1.1, androidx.dynamicanimation 1.0.0, "
    "androidx.legacy-support-v4 1.0.0, androidx.localbroadcastmanager 1.0.0, "
    "androidx.loader 1.0.0, androidx.tracing 1.0.0, "
    "androidx.profileinstaller 1.4.0, "
    "androidx.privacysandbox.ads 1.0.0-beta05, "
    "com.google.android.material 1.12.0, "
    "kotlin-stdlib 2.1.10, kotlinx-coroutines-core / -android / "
    "-play-services 1.9.0, okio, "
    "Google Play Services: ads 24.5.0, ads-api 24.5.0, ads-identifier 18.0.0, "
    "appset 16.0.1, base 18.1.0, basement 18.4.0, cloud-messaging 17.2.0, "
    "measurement 20.1.2, stats 17.0.2, tasks 18.2.0, "
    "Firebase: common, analytics, messaging, database "
    "(+ database-collection 18.0.1), storage, installations, appcheck, "
    "auth-interop 20.0.0, iid-interop 17.1.0, encoders 17.0.0 / -json 18.0.0 / "
    "-proto 16.0.0, datatransport, "
    "Google Play core: review 2.0.2, app-update 2.1.0, core-common 2.0.4, "
    "user-messaging-platform 3.2.0, "
    "com.github.barteksc.pdfviewer + com.shockwave.pdfium "
    "(нативные libjniPdfium.so, libmodpdfium.so, libmodft2.so, libmodpng.so, "
    "libc++_shared.so, libdatastore_shared_counter.so), "
    "com.makeramen.roundedimageview, com.intuit.sdp / com.intuit.ssp, "
    "Meta Audience Network (com.facebook.ads, com.instagram.common.viewpoint)"
)

SHARED_PREFS = (
    "Два небольших файла настроек и ничего больше. "
    "DARKMODE с ключом switchkey1 — включена ли тёмная тема (читается на старте "
    "в SplashScreen.init(), меняется в меню HomeActivity). "
    "USEAPP с ключом switchkey2 — счётчик запусков приложения: "
    "SplashScreen.increment() увеличивает его на каждом открытии, а начиная с "
    "двадцатого запуска экран PdfGalleryActivity предлагает поставить оценку в "
    "Google Play через встроенное окно Play In-App Review. "
    "Ни идентификаторов пользователя, ни ссылок, ни ответов сервера в настройках "
    "не сохраняется. Отдельно androidx.datastore и Room хранят локальные заметки, "
    "задачи и оценки, введённые самим человеком."
)

SUSPICIOUS_DOMAINS = [
    "bacalgeria.com",
    "click-v4.exmainclcknew.com",
    "config.ru",
    "dzetude.com",
    "eddirasa.com",
    "ency-education.com",
    "neptune-soft.com",
]

# Готовая проверка для редирект-хоста, переданная вместе с заданием (как есть).
EXTRA_CHECKS = {
    "click-v4.exmainclcknew.com": [
        ("Домен", "click-v4.exmainclcknew.com"),
        ("VirusTotal URL",
         "https://www.virustotal.com/gui/domain/click-v4.exmainclcknew.com"),
        ("Детекции", "6/91 (malicious=5, suspicious=1)"),
        ("Security vendors' analysis", "ниже построчно, как на VirusTotal"),
        ("ADMINUSLabs", "Malicious"),
        ("Bkav", "Malicious"),
        ("CRDF", "Malicious"),
        ("Forcepoint ThreatSeeker", "Malicious"),
        ("Gridinsoft", "Suspicious"),
        ("Webroot", "Malicious"),
        ("Abusix", "Clean"),
        ("Acronis", "Clean"),
        ("AILabs (MONITORAPP)", "Clean"),
        ("AlienVault", "Clean"),
        ("alphaMountain.ai", "Clean"),
        ("Antiy-AVL", "Clean"),
        ("BitDefender", "Clean"),
        ("Blueliv", "Clean"),
        ("Certego", "Clean"),
        ("CINS Army", "Clean"),
        ("CMC Threat Intelligence", "Clean"),
        ("CTX AI", "Clean"),
        ("Cyble", "Clean"),
        ("CyRadar", "Clean"),
        ("desenmascara.me", "Clean"),
        ("Dr.Web", "Clean"),
        ("EmergingThreats", "Clean"),
        ("Emsisoft", "Clean"),
        ("ESET", "Clean"),
        ("ESTsecurity", "Clean"),
        ("Fortinet", "Clean"),
        ("G-Data", "Clean"),
        ("Google Safe Browsing", "Clean"),
        ("GreenSnow", "Clean"),
        ("Heimdal Security", "Clean"),
        ("IPsum", "Clean"),
        ("Juniper Networks", "Clean"),
        ("Kaspersky", "Clean"),
        ("LevelBlue", "Clean"),
        ("Lionic", "Clean"),
        ("Malwared", "Clean"),
        ("MalwarePatrol", "Clean"),
        ("OpenPhish", "Clean"),
        ("Phishing Database", "Clean"),
        ("Phishtank", "Clean"),
        ("PREBYTES", "Clean"),
        ("Quick Heal", "Clean"),
        ("Quttera", "Clean"),
        ("Scantitan", "Clean"),
        ("SCUMWARE.org", "Clean"),
        ("Seclookup", "Clean"),
        ("Sophos", "Clean"),
        ("StopForumSpam", "Clean"),
        ("Sucuri SiteCheck", "Clean"),
        ("ThreatHive", "Clean"),
        ("URLhaus", "Clean"),
        ("Viettel Threat Intelligence", "Clean"),
        ("ViriBack", "Clean"),
        ("VX Vault", "Clean"),
        ("Xcitium Verdict Cloud", "Clean"),
        ("Yandex Safebrowsing", "Clean"),
        ("ZeroCERT", "Clean"),
        ("ZeroFox", "Clean"),
        ("0xSI_f33d", "Unrated"),
        ("AlphaSOC", "Unrated"),
        ("ArcSight Threat Intelligence", "Unrated"),
        ("AutoShun", "Unrated"),
        ("Axur", "Unrated"),
        ("Bfore.Ai PreCrime", "Unrated"),
        ("ChainPatrol", "Unrated"),
        ("Chong Lua Dao", "Unrated"),
        ("Cluster25", "Unrated"),
        ("Criminal IP", "Unrated"),
        ("CSIS Security Group", "Unrated"),
        ("Cyan", "Unrated"),
        ("DNS8", "Unrated"),
        ("Ermes", "Unrated"),
        ("Fortra", "Unrated"),
        ("GCP Abuse Intelligence", "Unrated"),
        ("GreyNoise", "Unrated"),
        ("Guardpot", "Unrated"),
        ("Hunt.io Intelligence", "Unrated"),
        ("Lumu", "Unrated"),
        ("MalwareURL", "Unrated"),
        ("Mimecast", "Unrated"),
        ("Netcraft", "Unrated"),
        ("PhishFort", "Unrated"),
        ("PrecisionSec", "Unrated"),
        ("SafeToOpen", "Unrated"),
        ("Sansec eComscan", "Unrated"),
        ("SecureBrain", "Unrated"),
        ("Snort IP sample list", "Unrated"),
        ("SOCRadar", "Unrated"),
        ("URLQuery", "Unrated"),
        ("VIPRE", "Unrated"),
        ("Куда редиректит", "https://explorads.media/"),
        ("Что выводит (кратко)",
         "title: ExplorAds. ExplorAds Skip to content Main Menu Home What We Do "
         "Careers Contact Us Start To Explore The World Of Ads ExplorAds is a "
         "leading online marketing platform that connects people to the services "
         "and ads they need. Building dedicated ads placement that change the way "
         "brands reach thei"),
        ("Где припаркован", "нет данных"),
    ],
}

DOMAIN_NOTES = {
    "bacalgeria.com": (
        "Этот адрес лежит в приложении открытым списком на экране «ресурсы» "
        "(класс ResourcesActivity, подпись «сайт бакалавриата Алжира»): человек "
        "сам нажимает на карточку, и телефон открывает сайт во внешнем браузере. "
        "Никакой предварительной проверки, скрытого запроса или подстановки "
        "другой ссылки в коде нет — адрес прописан жёстко и одинаков для всех. "
        "По готовой проверке пайплайна у самого домена в VirusTotal нет ни одной "
        "детекции (0/91), но сейчас он уже не открывает учебную страницу, а "
        "перебрасывает посетителя на трекер кликов click-v4.exmainclcknew.com. "
        "Это изменение на стороне сайта, а не поведение приложения: сам сайт, "
        "видимо, был перепродан или сдан под рекламный трафик."
    ),
    "click-v4.exmainclcknew.com": (
        "В файлах приложения такого адреса нет вообще — он появился только "
        "потому, что пайплайн прошёл по цепочке переходов от bacalgeria.com. "
        "Это технический сервис учёта кликов, который дальше уводит на "
        "рекламную площадку explorads.media. Именно у него хуже всего репутация "
        "среди всех разобранных адресов: шесть проверяющих движков из 91 "
        "считают его вредоносным или подозрительным. Для человека это выглядит "
        "так: он нажимает в приложении на учебный сайт, а браузер вместо "
        "уроков увозит его на рекламу; ответственность здесь на владельце "
        "домена bacalgeria.com, приложение просто хранит старую ссылку."
    ),
    "config.ru": (
        "Внутри программы такого адреса нет: ни в коде, ни в строках, ни в "
        "манифесте. Имя попало в список автоматически, потому что рядом с "
        "основным файлом приложения лежит языковой довесок config.ru.apk "
        "(набор русских строк для системных библиотек), и его название "
        "случайно совпало с настоящим доменом «config.ru». По проверке "
        "пайплайна детекций нет (0/91), сайт стоит на регистраторе RU-CENTER и "
        "открыть его страницу не удалось. К работе приложения этот домен не "
        "имеет отношения — это ложное совпадение имени файла."
    ),
    "dzetude.com": (
        "Ещё один алжирский учебный сайт из того же открытого списка ресурсов: "
        "карточка ведёт на раздел для старших классов "
        "(https://www.dzetude.com/category/secondaire/3as/). Ссылка "
        "срабатывает только после нажатия человеком и открывается во внешнем "
        "браузере, никаких скрытых обращений к этому адресу в фоне нет. "
        "Проверка показывает, что сайт живой и действительно образовательный, "
        "детекций в VirusTotal ноль из 91. На вид безопасен."
    ),
    "eddirasa.com": (
        "Это популярный алжирский образовательный портал; в приложении он "
        "встречается дважды — как карточка в списке ресурсов и как приставка "
        "в названиях PDF-файлов с прошлыми экзаменами, которые скачиваются из "
        "хранилища Firebase. Открывается он только по нажатию человека, во "
        "внешнем браузере, и без переадресаций куда-либо ещё. В VirusTotal "
        "детекций нет (0/91), содержимое страницы — обычные учебные разделы. "
        "Выглядит безопасно."
    ),
    "ency-education.com": (
        "Справочный учебный сайт, карточка в списке ресурсов ведёт на его "
        "раздел для средней школы (secondaire.html). Как и остальные пункты "
        "этого списка, адрес зашит в коде открытым текстом и открывается "
        "только вручную, без всякой предварительной проверки «кому что "
        "показать». Проверка пайплайна: ноль детекций из 91, содержимое — "
        "образовательный портал, переадресация только на собственную "
        "www-версию. Признаков вреда нет."
    ),
    "neptune-soft.com": (
        "Это сайт самого разработчика: адрес открывается кнопкой «веб» на "
        "экране «О приложении». Под тем же именем работает и облачный проект "
        "разработчика в Firebase — neptune-soft.firebaseio.com для отзывов из "
        "формы обратной связи и neptune-soft.appspot.com для скачивания "
        "PDF-файлов с уроками и экзаменами. По проверке пайплайна детекций "
        "нет (0/91), но сам домен сейчас не отзывается: доменное имя не "
        "разрешается в адрес сервера, то есть страница-визитка просто не "
        "работает. Рекламных страниц и офферов с него не приходит."
    ),
}

MAIN_ROWS = [
    ("Название приложения", "Fonbet' (Neptune soft, com.neptunesoft.bacdz, "
                            "версия 2.3.20 / код 2320)"),
    ("Android Gradle Plugin", "8.12.1"),
    ("minSdk", "23"),
    ("targetSdk", "35"),
    ("Kotlin", "да (kotlin-stdlib 2.1.10, kotlinx-coroutines 1.9.0)"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", "нет"),
]

CLOSING = [
    "Приложение под витринным названием «Fonbet'» на самом деле является "
    "справочником для алжирского школьного выпускного экзамена: уроки, прошлые "
    "экзамены в PDF, викторина, калькулятор среднего балла, заметки и таймер. "
    "Развилки «кому показать рекламную страницу, а кому обычное приложение» в "
    "нём нет, и поэтому в таблице стоит «нет».",
    "Проверялось это не по одному-двум местам. Точка входа (SplashScreen) "
    "только читает настройку тёмной темы, увеличивает счётчик запусков и через "
    "три секунды открывает главный экран — никаких обращений в интернет на "
    "старте. Главный экран (HomeActivity) просто раскладывает кнопки разделов. "
    "Во всём собственном коде программы нет ни встроенного окна сайта, ни "
    "сборки ссылки из кусков, ни чтения языка, страны, модели телефона или "
    "рекламного номера устройства для отправки на сервер, ни ветвления по "
    "ответу сервера.",
    "Сеть используется всего в трёх понятных местах: скачивание PDF-файлов из "
    "хранилища Firebase (адрес файла выдаёт сам Firebase, дальше файл "
    "качается обычным соединением), отправка формы обратной связи с именем, "
    "почтой, телефоном и текстом, которые человек вводит руками и видит на "
    "экране, и загрузка рекламы у AdMob с подключённой площадкой Meta "
    "Audience Network. Push-сообщения умеют только показать заголовок и текст "
    "уведомления — открыть по ним ссылку приложение не может, такой код в нём "
    "отсутствует.",
    "Все внешние адреса лежат в коде открытым текстом и открываются лишь "
    "после нажатия человеком: список учебных сайтов и каналов на экране "
    "«ресурсы», кнопки соцсетей на экране «о приложении», ссылки на страницу "
    "приложения в Google Play. Слов вроде cloak, offer, landing, whitelist, "
    "clickid и подобных в коде и ресурсах нет. Слово casino в файлах "
    "встречается, но только внутри служебного перечня всех доменных окончаний "
    "интернета (.car, .cash, .casino, .cat и так далее), который приносит с "
    "собой стандартная библиотека разбора адресов, — к гемблингу это "
    "отношения не имеет, поэтому в таблице стоит «нет».",
]


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Fonbet' (Neptune soft)",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Fonbet' &mdash; Neptune soft &mdash; com.neptunesoft.bacdz "
        "&mdash; на устройстве подписано как بكالوريا علوم تجريبية "
        "(справочник для выпускного экзамена в Алжире)", BODY))
    story.append(Paragraph(
        "Разобрано: com.neptunesoft.bacdz.xapk и com.neptunesoft.lettrebacdz.xapk, "
        "основной apk и все языковые/плотностные сплиты (config.ar, .de, .en, .es, "
        ".fr, .hi, .in, .it, .ja, .ko, .my, .pt, .ru, .th, .tr, .vi, .zh, "
        ".xhdpi, .armeabi_v7a), meta.json, domain_checks.json / .md, "
        "AndroidManifest.xml, res/values/strings.xml, network_security_config.xml, "
        "нативные библиотеки и весь decompiled/sources (собственные классы "
        "SplashScreen, HomeActivity, ResourcesActivity, AboutActivity, "
        "FeedbackActivity, PdfGalleryActivity, QuizActivity, "
        "services/MyFireBaseInstanceServices, broadcast/ReminderBroadcast, "
        "а также строки внутри dex и .so).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(Paragraph(
        "Строки таблиц ниже перенесены как есть из готовых проверок "
        "(domain_checks.json / domain_checks.md и переданная проверка "
        "редирект-хоста): сводка VirusTotal, полный список "
        "Security vendors' analysis по каждому движку и три дополнительных "
        "пункта в конце.", SMALL))

    for dom in SUSPICIOUS_DOMAINS:
        rec = by_domain.get(dom)
        if rec:
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
        else:
            rows = EXTRA_CHECKS.get(dom)
        if not rows:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
        story.append(kv_table(rows, widths=(62 * mm, 108 * mm),
                              header=("Параметр / движок", "Значение / вердикт")))
        note = DOMAIN_NOTES.get(dom)
        if note:
            story.append(Paragraph(rich(note), BODY))
        story.append(Spacer(1, 3 * mm))

    story.append(Paragraph("Пояснение сложных мест", H2))
    for para in CLOSING:
        story.append(Paragraph(rich(para), BODY))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
