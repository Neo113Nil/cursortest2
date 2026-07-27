package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺰ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1238 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f3519;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ X f3520;

    public C1238(C1188 c1188, X x) {
        this.f3519 = c1188;
        this.f3520 = x;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        Iterator it = this.f3519.f3381.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null) {
                AbstractC1145.m5891(new C1254(this, view));
            }
        }
    }
}
