package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴖ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0923 implements InterfaceC1002 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2571;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2572;

    public C0923(C1226 c1226, ArrayList arrayList) {
        this.f2571 = c1226;
        this.f2572 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1002
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo5725(Activity activity) {
        String decrypt = StringFog.decrypt("O7/iy45ohrwxotDLn3iR\n", "VNGkpO0d9e4=\n");
        if (C1226.m5927(this.f2571, activity, this.f2572)) {
            String m5514 = AbstractC0548.m5514("Qn9QlwTv1JVPZlOlDuLElC0=\n", "Aw8g0WuMoeY=\n", new StringBuilder(), decrypt);
            C1226.m5926(this.f2571, m5514, true, false, Collections.singletonList(activity));
            AbstractC1145.m5892(new C0935(this, m5514, activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1002
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5726(Activity activity) {
        String decrypt = StringFog.decrypt("IhM/GjbGslgiDg0=\n", "TX15dVWzwRQ=\n");
        if (C1226.m5927(this.f2571, activity, this.f2572)) {
            String m5514 = AbstractC0548.m5514("Qn9QlwTv1JVPZlOlDuLElC0=\n", "Aw8g0WuMoeY=\n", new StringBuilder(), decrypt);
            C1226.m5926(this.f2571, m5514, true, false, Collections.singletonList(activity));
            AbstractC1145.m5892(new C0935(this, m5514, activity));
        }
    }
}
