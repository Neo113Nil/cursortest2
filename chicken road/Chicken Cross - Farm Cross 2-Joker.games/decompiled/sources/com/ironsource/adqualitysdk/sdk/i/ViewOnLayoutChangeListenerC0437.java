package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʼ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC0437 implements View.OnLayoutChangeListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0447 f594;

    public ViewOnLayoutChangeListenerC0437(C0447 c0447) {
        this.f594 = c0447;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.f594.m5444(view);
        } catch (Throwable th) {
            AbstractC0480.m5464(StringFog.decrypt("Cm6zw1wrImk9abLYeD0=\n", "XAfWtB1PUSE=\n"), StringFog.decrypt("EPNK8W4hQHp17lbSfXhGYSHCUP9yZkw=\n", "VYE4nhwBKRQ=\n"), th, false);
        }
    }
}
