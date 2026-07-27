package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0395 {
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1192 m5395(C1074 c1074, C1226 c1226) {
        try {
            c1074.f3180.add(this);
            C1192 mo5331 = mo5331(c1074, c1226);
            c1074.f3179.remove(this);
            int lastIndexOf = c1074.f3180.lastIndexOf(this);
            if (lastIndexOf >= 0) {
                c1074.f3180 = new ArrayList(c1074.f3180.subList(0, lastIndexOf));
            }
            return mo5331;
        } catch (AbstractC0587 e) {
            throw e;
        } catch (Throwable th) {
            throw new C0364(c1226, c1074, th.getMessage() != null ? th.getMessage() : StringFog.decrypt("DHhgqWozRfkvXkXmQQ==\n", "XyosiS9LJpw=\n"), th);
        }
    }

    /* renamed from: ﾒ */
    public int mo5330() {
        return 1;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public int mo5396(C1074 c1074) {
        return 1;
    }

    /* renamed from: ﾒ */
    public abstract C1192 mo5331(C1074 c1074, C1226 c1226);
}
