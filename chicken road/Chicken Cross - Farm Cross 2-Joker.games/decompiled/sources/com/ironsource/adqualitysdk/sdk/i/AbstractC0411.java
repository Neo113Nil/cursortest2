package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʈ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0411 {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5425(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (!z) {
                sb.append(StringFog.decrypt("55M=\n", "y7Mpcp8hcoc=\n"));
            }
            if (obj instanceof String) {
                sb.append(StringFog.decrypt("6w==\n", "ydl+Q1cywuA=\n"));
                sb.append(obj);
                sb.append(StringFog.decrypt("WA==\n", "egHneWKu+2w=\n"));
            } else {
                sb.append(obj);
            }
            i++;
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1192 m5426(C1074 c1074, C1226 c1226) {
        C1192 mo5387 = mo5387(c1074, c1226);
        if (mo5387 != null) {
            Object obj = mo5387.f3386;
            if (obj instanceof AbstractC0411) {
                return ((AbstractC0411) obj).m5426(c1074, c1226);
            }
        }
        return mo5387;
    }

    /* renamed from: ﾒ */
    public abstract C1192 mo5387(C1074 c1074, C1226 c1226);
}
