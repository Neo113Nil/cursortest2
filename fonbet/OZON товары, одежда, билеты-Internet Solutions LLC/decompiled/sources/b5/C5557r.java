package b5;

import a5.C4946d;
import a5.C4947e;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import b5.AbstractC5540a;
import b5.AbstractC5555p;
import b5.C5558s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: b5.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5557r {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC5540a.i f55536a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5540a.d f55537b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC5540a.h f55538c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC5540a.d f55539d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC5540a.d f55540e;

    /* renamed from: b5.r$a */
    final class a extends AbstractC5540a.i {

        /* renamed from: d, reason: collision with root package name */
        private final Pattern f55541d;

        a() {
            super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
            this.f55541d = Pattern.compile("\\A\\d+");
        }

        @Override // b5.AbstractC5540a
        public final boolean d() {
            boolean d11 = super.d();
            if (!d11 || Build.VERSION.SDK_INT >= 29) {
                return d11;
            }
            int i11 = C4946d.f36265a;
            PackageInfo a11 = C5541b.a();
            if (a11 == null) {
                return false;
            }
            Matcher matcher = this.f55541d.matcher(a11.versionName);
            return matcher.find() && Integer.parseInt(a11.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* renamed from: b5.r$b */
    final class b extends AbstractC5540a.d {
        @Override // b5.AbstractC5540a
        public final boolean d() {
            if (!super.d() || !C4947e.a("MULTI_PROCESS")) {
                return false;
            }
            int i11 = C4946d.f36265a;
            if (C5557r.f55537b.d()) {
                return C5558s.b.f55543a.getStatics().isMultiProcessEnabled();
            }
            throw C5557r.a();
        }
    }

    static {
        new AbstractC5540a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new AbstractC5540a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new AbstractC5540a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new AbstractC5540a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new AbstractC5540a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new AbstractC5540a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new AbstractC5540a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new AbstractC5540a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new AbstractC5540a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new AbstractC5540a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new AbstractC5540a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new AbstractC5540a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new AbstractC5540a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new AbstractC5540a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new AbstractC5540a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new AbstractC5540a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new AbstractC5540a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new AbstractC5540a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new AbstractC5540a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new AbstractC5540a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new AbstractC5540a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new AbstractC5540a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new AbstractC5540a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new AbstractC5540a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new AbstractC5540a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new AbstractC5540a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new AbstractC5540a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new AbstractC5540a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        new AbstractC5540a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        new AbstractC5540a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new AbstractC5540a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new AbstractC5540a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new AbstractC5540a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new AbstractC5540a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new AbstractC5540a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new AbstractC5540a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new AbstractC5540a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new AbstractC5540a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        new AbstractC5555p.b();
        new AbstractC5555p.a();
        new AbstractC5540a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        f55536a = new a();
        new AbstractC5540a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        f55537b = new AbstractC5540a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        f55538c = new AbstractC5540a.h("FORCE_DARK", "FORCE_DARK");
        f55539d = new AbstractC5540a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        new AbstractC5540a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        new AbstractC5540a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new AbstractC5540a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new AbstractC5540a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new AbstractC5540a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        f55540e = new AbstractC5540a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new AbstractC5540a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new AbstractC5540a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new b("MULTI_PROFILE", "MULTI_PROFILE");
        new AbstractC5540a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
    }

    @NonNull
    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
