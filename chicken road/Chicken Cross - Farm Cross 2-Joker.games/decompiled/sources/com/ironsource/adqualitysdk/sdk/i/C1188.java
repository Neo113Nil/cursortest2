package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1188 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C1188 f3378;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList f3381 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList f3380 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1284 f3379 = new C1284(this);

    static {
        StringFog.decrypt("zlQjkYwHtLHqSSibhgKrvetLJJaG\n", "mT1N9eNw+Ng=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C1188 m5907() {
        C1188 c1188;
        synchronized (C1188.class) {
            if (f3378 == null) {
                f3378 = new C1188();
            }
            c1188 = f3378;
        }
        return c1188;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5908(X x) {
        synchronized (this) {
            this.f3380.remove(x);
            if (this.f3380.size() == 0) {
                C0594 m5547 = C0594.m5547();
                C1284 c1284 = this.f3379;
                m5547.getClass();
                AbstractC1145.m5892(new C0615(m5547, c1284));
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5909(X x) {
        synchronized (this) {
            this.f3380.add(x);
        }
        C0594 m5547 = C0594.m5547();
        C1284 c1284 = this.f3379;
        m5547.getClass();
        AbstractC1145.m5892(new C0632(m5547, c1284));
        AbstractC1145.m5892(new C1238(this, x));
    }
}
