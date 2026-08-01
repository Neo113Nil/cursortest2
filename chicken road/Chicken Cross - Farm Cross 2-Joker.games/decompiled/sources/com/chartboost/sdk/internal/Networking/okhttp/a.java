package com.chartboost.sdk.internal.Networking.okhttp;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.AnalyticsEvents;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a extends Exception {
    public static final d c = new d(null);
    public static final Map d = MapsKt.mapOf(TuplesKt.to(400, "Bad Request"), TuplesKt.to(401, "Unauthorized"), TuplesKt.to(403, "Forbidden"), TuplesKt.to(404, "Not Found"), TuplesKt.to(408, "Request Timeout"), TuplesKt.to(409, "Conflict"), TuplesKt.to(Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), "Too Many Requests"), TuplesKt.to(500, "Internal Server Error"), TuplesKt.to(502, "Bad Gateway"), TuplesKt.to(Integer.valueOf(PglCryptUtils.COMPRESS_FAILED), "Service Unavailable"), TuplesKt.to(Integer.valueOf(PglCryptUtils.BASE64_FAILED), "Gateway Timeout"));
    public final int b;

    /* renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$a, reason: collision with other inner class name */
    public static final class C0228a extends a {
        public static final C0228a e = new C0228a();

        public C0228a() {
            super(502, a.c.a(502), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0228a);
        }

        public int hashCode() {
            return -1600884457;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadGateway";
        }
    }

    public static final class b extends a {
        public static final b e = new b();

        public b() {
            super(400, a.c.a(400), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -316072606;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadRequest";
        }
    }

    public static final class c extends a {
        public final int e;

        public c(int i) {
            super(i, a.c.a(i), null);
            this.e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.e == ((c) obj).e;
        }

        public int hashCode() {
            return Integer.hashCode(this.e);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ClientError(status=" + this.e + ")";
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a b(int i) {
            return i == 400 ? b.e : i == 401 ? n.e : i == 403 ? f.e : i == 404 ? i.e : i == 408 ? j.e : i == 409 ? e.e : i == 429 ? m.e : i == 500 ? h.e : i == 502 ? C0228a.e : i == 503 ? l.e : i == 504 ? g.e : (400 > i || i >= 500) ? (500 > i || i >= 600) ? new o(i) : new k(i) : new c(i);
        }

        public d() {
        }

        public final String a(int i) {
            String str = (String) a.d.get(Integer.valueOf(i));
            if (str == null) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            return "HTTP " + i + ServerSentEventKt.SPACE + str;
        }
    }

    public static final class e extends a {
        public static final e e = new e();

        public e() {
            super(409, a.c.a(409), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 488153194;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Conflict";
        }
    }

    public static final class f extends a {
        public static final f e = new f();

        public f() {
            super(403, a.c.a(403), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 258062945;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Forbidden";
        }
    }

    public static final class g extends a {
        public static final g e = new g();

        public g() {
            super(PglCryptUtils.BASE64_FAILED, a.c.a(PglCryptUtils.BASE64_FAILED), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1275433707;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GatewayTimeout";
        }
    }

    public static final class h extends a {
        public static final h e = new h();

        public h() {
            super(500, a.c.a(500), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 693189104;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InternalServerError";
        }
    }

    public static final class i extends a {
        public static final i e = new i();

        public i() {
            super(404, a.c.a(404), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1673446137;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NotFound";
        }
    }

    public static final class j extends a {
        public static final j e = new j();

        public j() {
            super(408, a.c.a(408), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1845205398;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RequestTimeout";
        }
    }

    public static final class k extends a {
        public final int e;

        public k(int i) {
            super(i, a.c.a(i), null);
            this.e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.e == ((k) obj).e;
        }

        public int hashCode() {
            return Integer.hashCode(this.e);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServerError(status=" + this.e + ")";
        }
    }

    public static final class l extends a {
        public static final l e = new l();

        public l() {
            super(PglCryptUtils.COMPRESS_FAILED, a.c.a(PglCryptUtils.COMPRESS_FAILED), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return 315784435;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServiceUnavailable";
        }
    }

    public static final class m extends a {
        public static final m e = new m();

        public m() {
            super(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, a.c.a(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return 1422549791;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyRequests";
        }
    }

    public static final class n extends a {
        public static final n e = new n();

        public n() {
            super(401, a.c.a(401), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 36815244;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class o extends a {
        public final int e;

        public o(int i) {
            super(i, a.c.a(i), null);
            this.e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.e == ((o) obj).e;
        }

        public int hashCode() {
            return Integer.hashCode(this.e);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(status=" + this.e + ")";
        }
    }

    public /* synthetic */ a(int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str);
    }

    public final int b() {
        return this.b;
    }

    public a(int i2, String str) {
        super(str);
        this.b = i2;
    }
}
