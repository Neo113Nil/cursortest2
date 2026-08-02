package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb0 {

    /* JADX INFO: renamed from: a */
    public static final C0836wd f3890a;

    /* JADX INFO: renamed from: b */
    public static final qa0[] f3891b;

    /* JADX INFO: renamed from: c */
    public static final Map f3892c;

    static {
        C0836wd c0836wd = C0836wd.f8510m;
        f3890a = n80.m3494c(":");
        qa0 qa0Var = new qa0(qa0.f6439h, "");
        C0836wd c0836wd2 = qa0.f6436e;
        qa0 qa0Var2 = new qa0(c0836wd2, "GET");
        qa0 qa0Var3 = new qa0(c0836wd2, "POST");
        C0836wd c0836wd3 = qa0.f6437f;
        qa0 qa0Var4 = new qa0(c0836wd3, "/");
        qa0 qa0Var5 = new qa0(c0836wd3, "/index.html");
        C0836wd c0836wd4 = qa0.f6438g;
        qa0 qa0Var6 = new qa0(c0836wd4, "http");
        qa0 qa0Var7 = new qa0(c0836wd4, "https");
        C0836wd c0836wd5 = qa0.f6435d;
        qa0[] qa0VarArr = {qa0Var, qa0Var2, qa0Var3, qa0Var4, qa0Var5, qa0Var6, qa0Var7, new qa0(c0836wd5, "200"), new qa0(c0836wd5, "204"), new qa0(c0836wd5, "206"), new qa0(c0836wd5, "304"), new qa0(c0836wd5, "400"), new qa0(c0836wd5, "404"), new qa0(c0836wd5, "500"), new qa0("accept-charset", ""), new qa0("accept-encoding", "gzip, deflate"), new qa0("accept-language", ""), new qa0("accept-ranges", ""), new qa0("accept", ""), new qa0("access-control-allow-origin", ""), new qa0("age", ""), new qa0("allow", ""), new qa0("authorization", ""), new qa0("cache-control", ""), new qa0("content-disposition", ""), new qa0("content-encoding", ""), new qa0("content-language", ""), new qa0("content-length", ""), new qa0("content-location", ""), new qa0("content-range", ""), new qa0("content-type", ""), new qa0("cookie", ""), new qa0("date", ""), new qa0("etag", ""), new qa0("expect", ""), new qa0("expires", ""), new qa0("from", ""), new qa0("host", ""), new qa0("if-match", ""), new qa0("if-modified-since", ""), new qa0("if-none-match", ""), new qa0("if-range", ""), new qa0("if-unmodified-since", ""), new qa0("last-modified", ""), new qa0("link", ""), new qa0("location", ""), new qa0("max-forwards", ""), new qa0("proxy-authenticate", ""), new qa0("proxy-authorization", ""), new qa0("range", ""), new qa0("referer", ""), new qa0("refresh", ""), new qa0("retry-after", ""), new qa0("server", ""), new qa0("set-cookie", ""), new qa0("strict-transport-security", ""), new qa0("transfer-encoding", ""), new qa0("user-agent", ""), new qa0("vary", ""), new qa0("via", ""), new qa0("www-authenticate", "")};
        f3891b = qa0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(qa0VarArr[i].f6440a)) {
                linkedHashMap.put(qa0VarArr[i].f6440a, Integer.valueOf(i));
            }
        }
        f3892c = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m2842a(C0836wd c0836wd) throws IOException {
        int iMo2556b = c0836wd.mo2556b();
        for (int i = 0; i < iMo2556b; i++) {
            byte bMo2559e = c0836wd.mo2559e(i);
            if (bMo2559e >= 65 && bMo2559e <= 90) {
                C0270h1.m2187c("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0836wd.m5317k()));
                return;
            }
        }
    }
}
