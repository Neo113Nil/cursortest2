package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class i4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j4 f3854a;

    public i4(j4 j4Var) {
        this.f3854a = j4Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f3854a.f3895a.getSharedPreferences("StartApp-6cd3cac226013e8e", 0));
    }
}
