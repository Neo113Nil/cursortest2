package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class h3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i3 f3825a;

    public h3(i3 i3Var) {
        this.f3825a = i3Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f3825a.f3851a.getSharedPreferences("StartApp-6d5362e8ecc8a910", 0));
    }
}
