package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class f4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g4 f3672a;

    public f4(g4 g4Var) {
        this.f3672a = g4Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f3672a.f3748a.getSharedPreferences("StartApp-dfeaf103310003d9", 0));
    }
}
