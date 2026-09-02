package i1;

import java.util.Collections;
import java.util.Map;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public o f1425a;

    /* renamed from: d, reason: collision with root package name */
    public H0.b f1428d;

    /* renamed from: e, reason: collision with root package name */
    public Map f1429e = Collections.emptyMap();

    /* renamed from: b, reason: collision with root package name */
    public String f1426b = "GET";

    /* renamed from: c, reason: collision with root package name */
    public l f1427c = new l(0);

    public final w a() {
        if (this.f1425a != null) {
            return new w(this);
        }
        throw new IllegalStateException("url == null");
    }

    public final void b(String str, H0.b bVar) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (bVar != null && !V.a.t(str)) {
            throw new IllegalArgumentException(AbstractC0819i.a("method ", str, " must not have a request body."));
        }
        if (bVar == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(AbstractC0819i.a("method ", str, " must have a request body."));
        }
        this.f1426b = str;
        this.f1428d = bVar;
    }

    public final void c(String str) {
        this.f1427c.c(str);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        n nVar = new n();
        nVar.b(null, str);
        this.f1425a = nVar.a();
    }
}
