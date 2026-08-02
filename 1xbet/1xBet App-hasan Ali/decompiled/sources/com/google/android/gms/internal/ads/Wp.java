package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Wp implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12094a;

    public Wp(Context context) {
        this.f12094a = C0375o.M(context, U2.a.a());
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        return ((Boolean) Q2.r.f5053d.f5056c.a(F7.zb)).booleanValue() ? AbstractC1400ot.c0(new Vp()) : AbstractC1400ot.c0(new C1845yp(2, this));
    }
}
