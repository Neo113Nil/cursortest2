package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1296 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1294 f3680;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View f3681;

    public C1296(C1294 c1294, View view) {
        this.f3680 = c1294;
        this.f3681 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1188 c1188 = this.f3680.f3677.f3667;
        View view = this.f3681;
        C1188 c11882 = C1188.f3378;
        synchronized (c1188) {
            Iterator it = c1188.f3380.iterator();
            while (it.hasNext()) {
                ((X) it.next()).mo5332(view);
            }
        }
    }
}
