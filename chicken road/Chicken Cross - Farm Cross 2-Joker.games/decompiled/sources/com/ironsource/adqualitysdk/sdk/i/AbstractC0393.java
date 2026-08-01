package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɤ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0393 {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5394(Application application, Activity activity) {
        AbstractC0554.m5521().mo5525(application, activity);
        C0594 m5547 = C0594.m5547();
        synchronized (m5547) {
            AbstractC1145.m5892(new C0698(m5547));
        }
        C1312.m5944().m5948();
    }
}
