package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˏ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0452 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0447 f837;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f838;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f839;

    public C0452(C0447 c0447, Activity activity, View view) {
        this.f837 = c0447;
        this.f839 = activity;
        this.f838 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f837.f743.clear();
        C0447 c0447 = this.f837;
        Activity activity = this.f839;
        View view = this.f838;
        Class cls = c0447.f745;
        C0448 c0448 = c0447.f744;
        boolean z = c0448.f759;
        List list = c0448.f755;
        List list2 = c0448.f753;
        ArrayList arrayList = c0447.f743;
        if (view != null) {
            AbstractC4297a.m5341(view, cls, null, false, z, list, list2, arrayList);
        } else {
            AbstractC4297a.m5344(activity, cls, -1, null, false, z, list, list2, arrayList);
        }
        View view2 = this.f838;
        C0447 c04472 = this.f837;
        Class cls2 = c04472.f745;
        C0448 c04482 = c04472.f744;
        if (AbstractC4297a.m5346(view2, cls2, null, c04482.f755, c04482.f753)) {
            this.f837.f743.add(this.f838);
        }
        ArrayList arrayList2 = new ArrayList(this.f837.f743);
        C0447 c04473 = this.f837;
        if (c04473.f744.f756) {
            AbstractC1145.m5893(new C0741(this, arrayList2));
        } else {
            C0447.m5443(c04473, arrayList2);
        }
    }
}
