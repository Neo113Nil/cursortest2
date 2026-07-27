package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｼ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1294 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f3677;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3678;

    public C1294(C1284 c1284, ArrayList arrayList) {
        this.f3677 = c1284;
        this.f3678 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        ArrayList m5343 = AbstractC4297a.m5343(this.f3677.f3667.f3381, this.f3678);
        Iterator it = this.f3678.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Iterator it2 = this.f3677.f3667.f3381.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((WeakReference) it2.next()).get() == view) {
                        break;
                    }
                } else {
                    this.f3677.f3667.f3381.add(new WeakReference(view));
                    AbstractC1145.m5891(new C1299(this, view));
                    break;
                }
            }
        }
        for (int i = 0; i < m5343.size(); i++) {
            AbstractC1145.m5891(new C1296(this, (View) m5343.get(i)));
        }
    }
}
