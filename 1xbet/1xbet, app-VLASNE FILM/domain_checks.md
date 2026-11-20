# Проверка подозрительных доменов

`config.ru` в пайплайне — это языковой сплит Android App Bundle (`split="config.ru"` в `splits0.xml`), не сетевой хост приложения.

Реальный кастомный хост из first-party кода (XOR + AES-GCM в SplashActivity / DataSyncProvider):

## Проверка домена: steadywindowbridge.site

Пайплайн VirusTotal этот хост не проверял (адрес спрятан в зашифрованной строке). Не выдумывать детекции.

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | steadywindowbridge.site |
| VirusTotal URL | https://www.virustotal.com/gui/domain/steadywindowbridge.site |
| Детекции | нет |
| Куда редиректит | нет |
| Что выводит (кратко) | нет |
| Где припаркован | нет |
