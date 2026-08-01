package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ȑ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC0381 implements View.OnLayoutChangeListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1312 f489;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f490;

    public ViewOnLayoutChangeListenerC0381(C1312 c1312, ViewGroup viewGroup) {
        this.f489 = c1312;
        this.f490 = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        C0932 m5751 = C0932.m5751();
        synchronized (m5751) {
            z = m5751.f2619;
        }
        if (z) {
            return;
        }
        try {
            C1312.m5946(this.f489, this.f490, this);
        } catch (Throwable th) {
            AbstractC0480.m5464(StringFog.decrypt("fnSNMaN4bExMe4ofq2dMRld9kACnZk5KWn0=\n", "ORjiU8IUOCM=\n"), StringFog.decrypt("k2sO0tSvEf/2dhLxx/YX5KJaFNzI6B0=\n", "1hl8vaaPeJE=\n"), th, false);
        }
    }
}
