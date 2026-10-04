# Cloaking hints (Betclic / ZHYRAF TOV / ClickQuest Challenge)

- Play / карточка: «Betclic». application-label внутри APK (снято локально до анализа): «ClickQuest Challenge». package: `com.tapput.questchallejnge`.
- Описание в магазине — про заметки и организацию. Скриншоты Play — мини-игры (Quick Touch, Collection, Records, Settings), не букмекер.
- Папки `betclick/Betclic-ZHYRAF TOV` не было в git. `agent_base.apk` / `agent_src` / сплиты `-2*.apk` в репозитории отсутствуют.
- Google Play details = 404 (снято). APKCombo карточка есть, POST `/dl` и downloader: «Sorry, the application was not found». APKPure/Aptoide/apkeep apk-pure — пусто.
- `domain_checks` пайплайна: подозрительных доменов не найдено.
- Клоака = да: Play-название ≠ APK-label (белая оболочка). First-party Java не декомпилирован — файла APK нет.
