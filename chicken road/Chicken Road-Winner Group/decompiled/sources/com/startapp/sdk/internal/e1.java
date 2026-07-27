package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class e1 extends com.startapp.sdk.adsbase.model.a {

    /* renamed from: V0, reason: collision with root package name */
    public boolean f3608V0;
    public int W0;

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a("fixedSize", Boolean.valueOf(this.f3608V0), false, true);
        seVar.a("bnrt", Integer.valueOf(this.W0), false, true);
    }

    @Override // com.startapp.sdk.adsbase.model.a
    public final void g(Context context) {
        pg pgVar = (pg) com.startapp.sdk.components.a.a(context).f3364l.a();
        AdPreferences.Placement placement = this.n0;
        this.f3281z0 = placement == null ? null : (String) pgVar.f4227a.get(new og(placement, this.W0));
    }
}
