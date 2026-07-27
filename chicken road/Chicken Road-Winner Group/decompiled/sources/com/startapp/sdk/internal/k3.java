package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class k3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f3947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3948c;

    public k3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f3948c = aVar;
        this.f3946a = context;
        this.f3947b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new vh(this.f3946a, this.f3948c.f3339E, new ib(new j3(this)), this.f3948c.f3362j, this.f3947b);
    }
}
