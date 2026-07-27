package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class i3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f3852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3853c;

    public i3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f3853c = aVar;
        this.f3851a = context;
        this.f3852b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f3851a;
        ib ibVar = new ib(new h3(this));
        com.startapp.sdk.components.a aVar = this.f3853c;
        return new mh(context, ibVar, aVar.f3339E, aVar.f3362j, this.f3852b, new g3());
    }
}
