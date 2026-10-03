# Cloaking hints (Betclic / SAJID EXPRESS LLC / com.muzourobhaz.zenaghn)

- Play title «Betclic» = APK application-label «Betclic».
- Application: StudioApplication.onCreate — Firebase Crashlytics + MatchLink.install (лог-тег ZenLink).
- MatchLinkConfig: baseUrl `https://spots-clicplay.com/`, routes full=`sports` / quick=`spots-update`, GET, timeout 12s, attestation 10s.
- Заголовки: X-Instance-Id (UUID install_uid), X-Integrity-Token (Play Integrity), X-Device-Token (сохранённый token ответа).
- SharedPreferences `zenaghn.matchlink.state`: install_uid, device_pass.
- Ответ LinkPayload(url, token). Если url есть — Custom Tabs / Trusted Web Activity (запасной путь Custom Tabs Intent). Если нет/ошибка — обычное Compose-приложение.
- WebView в first-party нет. Custom Tabs: да (queries + androidx.browser).
