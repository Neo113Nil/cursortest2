package o1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b[] f6279a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f6280b;

    static {
        b bVar = new b(b.f6259i, "");
        s1.h hVar = b.f6256f;
        b bVar2 = new b(hVar, "GET");
        b bVar3 = new b(hVar, "POST");
        s1.h hVar2 = b.f6257g;
        b bVar4 = new b(hVar2, "/");
        b bVar5 = new b(hVar2, "/index.html");
        s1.h hVar3 = b.f6258h;
        b bVar6 = new b(hVar3, "http");
        b bVar7 = new b(hVar3, "https");
        s1.h hVar4 = b.f6255e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(hVar4, "200"), new b(hVar4, "204"), new b(hVar4, "206"), new b(hVar4, "304"), new b(hVar4, "400"), new b(hVar4, "404"), new b(hVar4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f6279a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            if (!linkedHashMap.containsKey(bVarArr[i2].f6260a)) {
                linkedHashMap.put(bVarArr[i2].f6260a, Integer.valueOf(i2));
            }
        }
        f6280b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(s1.h hVar) {
        int i2 = hVar.i();
        for (int i3 = 0; i3 < i2; i3++) {
            byte d2 = hVar.d(i3);
            if (d2 >= 65 && d2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.l());
            }
        }
    }
}
