package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾄ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1299 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1294 f3687;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View f3688;

    public C1299(C1294 c1294, View view) {
        this.f3687 = c1294;
        this.f3688 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1188 c1188 = this.f3687.f3677.f3667;
        View view = this.f3688;
        C1188 c11882 = C1188.f3378;
        synchronized (c1188) {
            Iterator it = c1188.f3380.iterator();
            while (it.hasNext()) {
                ((X) it.next()).mo5333(view);
            }
        }
    }
}
