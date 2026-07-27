package a5;

import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0205g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0202d[] f3951a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3952b;

    static {
        C0202d c0202d = new C0202d(C0202d.f3931i, "");
        j5.i iVar = C0202d.f3928f;
        C0202d c0202d2 = new C0202d(iVar, "GET");
        C0202d c0202d3 = new C0202d(iVar, "POST");
        j5.i iVar2 = C0202d.f3929g;
        C0202d c0202d4 = new C0202d(iVar2, "/");
        C0202d c0202d5 = new C0202d(iVar2, "/index.html");
        j5.i iVar3 = C0202d.f3930h;
        C0202d c0202d6 = new C0202d(iVar3, "http");
        C0202d c0202d7 = new C0202d(iVar3, "https");
        j5.i iVar4 = C0202d.f3927e;
        C0202d[] c0202dArr = {c0202d, c0202d2, c0202d3, c0202d4, c0202d5, c0202d6, c0202d7, new C0202d(iVar4, "200"), new C0202d(iVar4, "204"), new C0202d(iVar4, "206"), new C0202d(iVar4, "304"), new C0202d(iVar4, "400"), new C0202d(iVar4, "404"), new C0202d(iVar4, "500"), new C0202d("accept-charset", ""), new C0202d("accept-encoding", "gzip, deflate"), new C0202d("accept-language", ""), new C0202d("accept-ranges", ""), new C0202d("accept", ""), new C0202d("access-control-allow-origin", ""), new C0202d("age", ""), new C0202d("allow", ""), new C0202d("authorization", ""), new C0202d("cache-control", ""), new C0202d("content-disposition", ""), new C0202d("content-encoding", ""), new C0202d("content-language", ""), new C0202d("content-length", ""), new C0202d("content-location", ""), new C0202d("content-range", ""), new C0202d("content-type", ""), new C0202d("cookie", ""), new C0202d("date", ""), new C0202d("etag", ""), new C0202d("expect", ""), new C0202d("expires", ""), new C0202d("from", ""), new C0202d("host", ""), new C0202d("if-match", ""), new C0202d("if-modified-since", ""), new C0202d("if-none-match", ""), new C0202d("if-range", ""), new C0202d("if-unmodified-since", ""), new C0202d("last-modified", ""), new C0202d("link", ""), new C0202d(InAppMessagePromptTypes.LOCATION_PROMPT_KEY, ""), new C0202d("max-forwards", ""), new C0202d("proxy-authenticate", ""), new C0202d("proxy-authorization", ""), new C0202d("range", ""), new C0202d("referer", ""), new C0202d("refresh", ""), new C0202d("retry-after", ""), new C0202d("server", ""), new C0202d("set-cookie", ""), new C0202d("strict-transport-security", ""), new C0202d("transfer-encoding", ""), new C0202d("user-agent", ""), new C0202d("vary", ""), new C0202d("via", ""), new C0202d("www-authenticate", "")};
        f3951a = c0202dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i2 = 0; i2 < 61; i2++) {
            if (!linkedHashMap.containsKey(c0202dArr[i2].f3932a)) {
                linkedHashMap.put(c0202dArr[i2].f3932a, Integer.valueOf(i2));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(...)");
        f3952b = unmodifiableMap;
    }

    public static void a(j5.i name) {
        kotlin.jvm.internal.i.e(name, "name");
        int a6 = name.a();
        for (int i2 = 0; i2 < a6; i2++) {
            byte d6 = name.d(i2);
            if (65 <= d6 && d6 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.k()));
            }
        }
    }
}
