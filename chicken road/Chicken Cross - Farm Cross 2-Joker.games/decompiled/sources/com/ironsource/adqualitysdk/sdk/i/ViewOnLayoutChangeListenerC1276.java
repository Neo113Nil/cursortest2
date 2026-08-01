package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｧ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC1276 implements View.OnLayoutChangeListener {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f3651;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3652;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3653;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3654;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3655;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ List f3656;

    public ViewOnLayoutChangeListenerC1276(C0900 c0900, C0623 c0623, C1226 c1226, C1074 c1074, List list, boolean z) {
        this.f3651 = c0900;
        this.f3656 = list;
        this.f3655 = z;
        this.f3654 = c0623;
        this.f3653 = c1074;
        this.f3652 = c1226;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            ArrayList m5707 = C0900.m5707(this.f3651, this.f3656, new Object[]{this, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)});
            if (this.f3655) {
                this.f3654.m5583(this.f3653, this.f3652, m5707);
            } else {
                AbstractC1145.m5892(new C1287(this, m5707));
            }
        } catch (Throwable th) {
            AbstractC1086.m5875(this.f3652.m5929(), StringFog.decrypt("ApS46CEtLqlnqaTLMnQosjOlouY9aiKLLpW+4j1oNecuiLnuN2hn\n", "R+bKh1MNR8c=\n") + this.f3654.f1642, th, null);
        }
    }
}
