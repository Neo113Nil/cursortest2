package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class r1 implements qi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f4280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f4281b;

    public r1(s1 s1Var, s1 s1Var2) {
        this.f4281b = s1Var;
        this.f4280a = s1Var2;
    }

    @Override // com.startapp.sdk.internal.qi
    public final void a() {
        ((y6) ((x6) this.f4281b.f3192i.a())).c(this.f4280a, fi.f3726v);
        s1 s1Var = this.f4281b;
        Context context = s1Var.f3185a;
        AdEventListener adEventListener = s1Var.f3188d;
        s1Var.f3188d = null;
        a0.b(context, adEventListener, s1Var.f3186b, false);
    }

    @Override // com.startapp.sdk.internal.qi
    public final void a(String str) {
        ((y6) ((x6) this.f4281b.f3192i.a())).c(this.f4280a, fi.f3727w);
        this.f4281b.f3186b.setErrorMessage(str);
        s1 s1Var = this.f4281b;
        Context context = s1Var.f3185a;
        AdEventListener adEventListener = s1Var.f3188d;
        s1Var.f3188d = null;
        a0.a(context, adEventListener, s1Var.f3186b, false);
    }
}
