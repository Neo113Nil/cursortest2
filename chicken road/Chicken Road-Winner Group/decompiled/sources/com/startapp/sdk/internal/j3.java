package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class j3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f3894a;

    public j3(k3 k3Var) {
        this.f3894a = k3Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f3894a.f3946a.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0));
    }
}
