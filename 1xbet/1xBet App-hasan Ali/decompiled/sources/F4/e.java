package F4;

import L4.C0229l;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0122b[] f1588a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1589b;

    static {
        C0122b c0122b = new C0122b(C0122b.i, "");
        C0229l c0229l = C0122b.f;
        C0122b c0122b2 = new C0122b(c0229l, "GET");
        C0122b c0122b3 = new C0122b(c0229l, "POST");
        C0229l c0229l2 = C0122b.f1570g;
        C0122b c0122b4 = new C0122b(c0229l2, "/");
        C0122b c0122b5 = new C0122b(c0229l2, "/index.html");
        C0229l c0229l3 = C0122b.f1571h;
        C0122b c0122b6 = new C0122b(c0229l3, "http");
        C0122b c0122b7 = new C0122b(c0229l3, "https");
        C0229l c0229l4 = C0122b.f1569e;
        C0122b[] c0122bArr = {c0122b, c0122b2, c0122b3, c0122b4, c0122b5, c0122b6, c0122b7, new C0122b(c0229l4, "200"), new C0122b(c0229l4, "204"), new C0122b(c0229l4, "206"), new C0122b(c0229l4, "304"), new C0122b(c0229l4, "400"), new C0122b(c0229l4, "404"), new C0122b(c0229l4, "500"), new C0122b("accept-charset", ""), new C0122b("accept-encoding", "gzip, deflate"), new C0122b("accept-language", ""), new C0122b("accept-ranges", ""), new C0122b("accept", ""), new C0122b("access-control-allow-origin", ""), new C0122b("age", ""), new C0122b("allow", ""), new C0122b("authorization", ""), new C0122b("cache-control", ""), new C0122b("content-disposition", ""), new C0122b("content-encoding", ""), new C0122b("content-language", ""), new C0122b("content-length", ""), new C0122b("content-location", ""), new C0122b("content-range", ""), new C0122b("content-type", ""), new C0122b("cookie", ""), new C0122b("date", ""), new C0122b("etag", ""), new C0122b("expect", ""), new C0122b("expires", ""), new C0122b("from", ""), new C0122b("host", ""), new C0122b("if-match", ""), new C0122b("if-modified-since", ""), new C0122b("if-none-match", ""), new C0122b("if-range", ""), new C0122b("if-unmodified-since", ""), new C0122b("last-modified", ""), new C0122b("link", ""), new C0122b("location", ""), new C0122b("max-forwards", ""), new C0122b("proxy-authenticate", ""), new C0122b("proxy-authorization", ""), new C0122b("range", ""), new C0122b("referer", ""), new C0122b("refresh", ""), new C0122b("retry-after", ""), new C0122b("server", ""), new C0122b("set-cookie", ""), new C0122b("strict-transport-security", ""), new C0122b("transfer-encoding", ""), new C0122b("user-agent", ""), new C0122b("vary", ""), new C0122b("via", ""), new C0122b("www-authenticate", "")};
        f1588a = c0122bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0122bArr[i].f1572a)) {
                linkedHashMap.put(c0122bArr[i].f1572a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.l.e("unmodifiableMap(result)", unmodifiableMap);
        f1589b = unmodifiableMap;
    }

    public static void a(C0229l c0229l) {
        kotlin.jvm.internal.l.f("name", c0229l);
        int c5 = c0229l.c();
        for (int i = 0; i < c5; i++) {
            byte h3 = c0229l.h(i);
            if (65 <= h3 && h3 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0229l.p()));
            }
        }
    }
}
