package com.chartboost.sdk.tracking;

import com.chartboost.sdk.tracking.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5138a = c.f5139a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements g {
        public static final a c = new a("IGNORED", 0, "cache_ignored");
        public static final a d = new a("START", 1, "cache_start");
        public static final a e = new a("FINISH_SUCCESS", 2, "cache_finish_success");
        public static final a f = new a("FINISH_FAILURE", 3, "cache_finish_failure");
        public static final a g = new a("GET_RESPONSE_PARSING_ERROR", 4, "cache_get_response_parsing_error");
        public static final a h = new a("BID_RESPONSE_PARSING_ERROR", 5, "cache_bid_response_parsing_error");
        public static final a i = new a("ASSET_DOWNLOAD_ERROR", 6, "cache_asset_download_error");
        public static final a j = new a("REQUEST_ERROR", 7, "cache_request_error");
        public static final a k = new a("SERVER_ERROR", 8, "cache_server_error");
        public static final /* synthetic */ a[] l;
        public static final /* synthetic */ EnumEntries m;
        public final String b;

        static {
            a[] a2 = a();
            l = a2;
            m = EnumEntriesKt.enumEntries(a2);
        }

        public a(String str, int i2, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{c, d, e, f, g, h, i, j, k};
        }

        public static EnumEntries b() {
            return m;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) l.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements g {
        public static final b c = new b("SUCCESS", 0, "click_success");
        public static final b d = new b("FAILURE", 1, "click_failure");
        public static final b e = new b("INVALID_URL_ERROR", 2, "click_invalid_url_error");
        public static final /* synthetic */ b[] f;
        public static final /* synthetic */ EnumEntries g;
        public final String b;

        static {
            b[] a2 = a();
            f = a2;
            g = EnumEntriesKt.enumEntries(a2);
        }

        public b(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{c, d, e};
        }

        public static EnumEntries b() {
            return g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d implements g {
        public static final d c = new d("SUBCLASSING_ERROR", 0, "consent_subclassing_error");
        public static final d d = new d("DECODING_ERROR", 1, "consent_decoding_error");
        public static final d e = new d("CREATION_ERROR", 2, "consent_creation_error");
        public static final d f = new d("PERSISTED_DATA_READING_ERROR", 3, "consent_persisted_data_reading_error");
        public static final d g = new d("PERSISTENCE_ERROR", 4, "consent_persistence_error");
        public static final /* synthetic */ d[] h;
        public static final /* synthetic */ EnumEntries i;
        public final String b;

        static {
            d[] a2 = a();
            h = a2;
            i = EnumEntriesKt.enumEntries(a2);
        }

        public d(String str, int i2, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{c, d, e, f, g};
        }

        public static EnumEntries b() {
            return i;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) h.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e implements g {
        public static final e c = new e("IMPRESSION_TRACKER_FAILURE", 0, "imptracker_failure");
        public static final /* synthetic */ e[] d;
        public static final /* synthetic */ EnumEntries e;
        public final String b;

        static {
            e[] a2 = a();
            d = a2;
            e = EnumEntriesKt.enumEntries(a2);
        }

        public e(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ e[] a() {
            return new e[]{c};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) d.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f implements g {
        public static final f c = new f("USER_AGENT_UPDATE_ERROR", 0, "user_agent_update_error");
        public static final f d = new f("PREFETCH_REQUEST_ERROR", 1, "prefetch_request_error");
        public static final f e = new f("CONFIG_REQUEST_ERROR", 2, "config_request_error");
        public static final f f = new f("INSTALL_REQUEST_ERROR", 3, "install_request_error");
        public static final f g = new f("IMPRESSION_RECORDED", 4, "impression_recorded");
        public static final f h = new f("UNSUPPORTED_OS_VERSION", 5, "unsupported_os_version");
        public static final f i = new f("TOO_MANY_EVENTS", 6, "too_many_events");
        public static final /* synthetic */ f[] j;
        public static final /* synthetic */ EnumEntries k;
        public final String b;

        static {
            f[] a2 = a();
            j = a2;
            k = EnumEntriesKt.enumEntries(a2);
        }

        public f(String str, int i2, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ f[] a() {
            return new f[]{c, d, e, f, g, h, i};
        }

        public static EnumEntries b() {
            return k;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) j.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.tracking.g$g, reason: collision with other inner class name */
    public static final class EnumC0233g implements g {
        public static final EnumC0233g c = new EnumC0233g("SUCCESS", 0, "navigation_success");
        public static final EnumC0233g d = new EnumC0233g("FAILURE", 1, "navigation_failure");
        public static final /* synthetic */ EnumC0233g[] e;
        public static final /* synthetic */ EnumEntries f;
        public final String b;

        static {
            EnumC0233g[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public EnumC0233g(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ EnumC0233g[] a() {
            return new EnumC0233g[]{c, d};
        }

        public static EnumEntries b() {
            return f;
        }

        public static EnumC0233g valueOf(String str) {
            return (EnumC0233g) Enum.valueOf(EnumC0233g.class, str);
        }

        public static EnumC0233g[] values() {
            return (EnumC0233g[]) e.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class h implements g {
        public static final h c = new h("REQUEST_JSON_SERIALIZATION_ERROR", 0, "request_json_serialization_error");
        public static final h d = new h("RESPONSE_JSON_SERIALIZATION_ERROR", 1, "response_json_serialization_error");
        public static final h e = new h("RESPONSE_DATA_WRITE_ERROR", 2, "response_data_write_error");
        public static final h f = new h("DISPATCHER_EXCEPTION", 3, "network_failure_dispatcher_exception");
        public static final /* synthetic */ h[] g;
        public static final /* synthetic */ EnumEntries h;
        public final String b;

        static {
            h[] a2 = a();
            g = a2;
            h = EnumEntriesKt.enumEntries(a2);
        }

        public h(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ h[] a() {
            return new h[]{c, d, e, f};
        }

        public static EnumEntries b() {
            return h;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) g.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class i implements g {
        public static final i c = new i("START", 0, "show_start");
        public static final i d = new i("FINISH_SUCCESS", 1, "show_finish_success");
        public static final i e = new i("FINISH_FAILURE", 2, "show_finish_failure");
        public static final i f = new i("UNAVAILABLE_ASSET_ERROR", 3, "show_unavailable_asset_error");
        public static final i g = new i("TIMEOUT_EVENT", 4, "show_timeout_error");
        public static final i h = new i("HTML_MISSING_MUSTACHE_ERROR", 5, "show_html_missing_mustache_error");
        public static final i i = new i("WEBVIEW_SSL_ERROR", 6, "show_webview_ssl_error");
        public static final i j = new i("WEBVIEW_ERROR", 7, "show_webview_error");
        public static final i k = new i("WEBVIEW_CRASH", 8, "show_webview_crash");
        public static final i l = new i("UNEXPECTED_DISMISS_ERROR", 9, "show_unexpected_dismiss_error");
        public static final i m = new i("REQUEST_ERROR", 10, "show_request_error");
        public static final i n = new i("CLOSE_BEFORE_TEMPLATE_SHOW_ERROR", 11, "show_close_before_template_show_error");
        public static final i o = new i("DISMISS_MISSING", 12, "dismiss_missing");
        public static final /* synthetic */ i[] p;
        public static final /* synthetic */ EnumEntries q;
        public final String b;

        static {
            i[] a2 = a();
            p = a2;
            q = EnumEntriesKt.enumEntries(a2);
        }

        public i(String str, int i2, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ i[] a() {
            return new i[]{c, d, e, f, g, h, i, j, k, l, m, n, o};
        }

        public static EnumEntries b() {
            return q;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) p.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j implements g {
        public static final j c = new j("FINISH_SUCCESS", 0, "video_finish_success");
        public static final j d = new j("FINISH_FAILURE", 1, "video_finish_failure");
        public static final /* synthetic */ j[] e;
        public static final /* synthetic */ EnumEntries f;
        public final String b;

        static {
            j[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public j(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ j[] a() {
            return new j[]{c, d};
        }

        public static EnumEntries b() {
            return f;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) e.clone();
        }

        @Override // com.chartboost.sdk.tracking.g
        public String getValue() {
            return this.b;
        }
    }

    String getValue();

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ c f5139a = new c();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.tracking.g$c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.c.a();
            }
        });

        public static final List a() {
            return ArraysKt.flatten(new Object[][]{a.b().toArray(new a[0]), i.b().toArray(new i[0]), b.b().toArray(new b[0]), d.b().toArray(new d[0]), EnumC0233g.b().toArray(new EnumC0233g[0]), h.b().toArray(new h[0]), j.b().toArray(new j[0]), f.b().toArray(new f[0])});
        }

        public final List b() {
            return (List) b.getValue();
        }

        public final List a(List values) {
            Intrinsics.checkNotNullParameter(values, "values");
            List b2 = b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : b2) {
                if (values.contains(((g) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }
}
