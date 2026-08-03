package P1;

/* renamed from: P1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0058f {

    /* renamed from: a, reason: collision with root package name */
    public static final P1.C0055c[] f1477a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f1478b;

    static {
        P1.C0055c c0055c = new P1.C0055c(P1.C0055c.f1457i, "");
        V1.j jVar = P1.C0055c.f1454f;
        P1.C0055c c0055c2 = new P1.C0055c(jVar, "GET");
        P1.C0055c c0055c3 = new P1.C0055c(jVar, "POST");
        V1.j jVar2 = P1.C0055c.f1455g;
        P1.C0055c c0055c4 = new P1.C0055c(jVar2, "/");
        P1.C0055c c0055c5 = new P1.C0055c(jVar2, "/index.html");
        V1.j jVar3 = P1.C0055c.f1456h;
        P1.C0055c c0055c6 = new P1.C0055c(jVar3, "http");
        P1.C0055c c0055c7 = new P1.C0055c(jVar3, "https");
        V1.j jVar4 = P1.C0055c.f1453e;
        P1.C0055c[] c0055cArr = {c0055c, c0055c2, c0055c3, c0055c4, c0055c5, c0055c6, c0055c7, new P1.C0055c(jVar4, "200"), new P1.C0055c(jVar4, "204"), new P1.C0055c(jVar4, "206"), new P1.C0055c(jVar4, "304"), new P1.C0055c(jVar4, "400"), new P1.C0055c(jVar4, "404"), new P1.C0055c(jVar4, "500"), new P1.C0055c("accept-charset", ""), new P1.C0055c("accept-encoding", "gzip, deflate"), new P1.C0055c("accept-language", ""), new P1.C0055c("accept-ranges", ""), new P1.C0055c("accept", ""), new P1.C0055c("access-control-allow-origin", ""), new P1.C0055c("age", ""), new P1.C0055c("allow", ""), new P1.C0055c("authorization", ""), new P1.C0055c("cache-control", ""), new P1.C0055c("content-disposition", ""), new P1.C0055c("content-encoding", ""), new P1.C0055c("content-language", ""), new P1.C0055c("content-length", ""), new P1.C0055c("content-location", ""), new P1.C0055c("content-range", ""), new P1.C0055c("content-type", ""), new P1.C0055c("cookie", ""), new P1.C0055c("date", ""), new P1.C0055c("etag", ""), new P1.C0055c("expect", ""), new P1.C0055c("expires", ""), new P1.C0055c("from", ""), new P1.C0055c("host", ""), new P1.C0055c("if-match", ""), new P1.C0055c("if-modified-since", ""), new P1.C0055c("if-none-match", ""), new P1.C0055c("if-range", ""), new P1.C0055c("if-unmodified-since", ""), new P1.C0055c("last-modified", ""), new P1.C0055c("link", ""), new P1.C0055c("location", ""), new P1.C0055c("max-forwards", ""), new P1.C0055c("proxy-authenticate", ""), new P1.C0055c("proxy-authorization", ""), new P1.C0055c("range", ""), new P1.C0055c("referer", ""), new P1.C0055c("refresh", ""), new P1.C0055c("retry-after", ""), new P1.C0055c("server", ""), new P1.C0055c("set-cookie", ""), new P1.C0055c("strict-transport-security", ""), new P1.C0055c("transfer-encoding", ""), new P1.C0055c("user-agent", ""), new P1.C0055c("vary", ""), new P1.C0055c("via", ""), new P1.C0055c("www-authenticate", "")};
        f1477a = c0055cArr;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61);
        int i2 = 0;
        while (i2 < 61) {
            int i3 = i2 + 1;
            if (!linkedHashMap.containsKey(c0055cArr[i2].f1458a)) {
                linkedHashMap.put(c0055cArr[i2].f1458a, java.lang.Integer.valueOf(i2));
            }
            i2 = i3;
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(result)");
        f1478b = unmodifiableMap;
    }

    public static void a(V1.j name) {
        kotlin.jvm.internal.i.e(name, "name");
        int a2 = name.a();
        int i2 = 0;
        while (i2 < a2) {
            int i3 = i2 + 1;
            byte d2 = name.d(i2);
            if (65 <= d2 && d2 <= 90) {
                throw new java.io.IOException(kotlin.jvm.internal.i.h(name.h(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i2 = i3;
        }
    }
}
