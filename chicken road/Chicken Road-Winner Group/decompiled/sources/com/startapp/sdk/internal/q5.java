package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class q5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4244b;

    public q5(com.startapp.sdk.components.a aVar, Context context) {
        this.f4244b = aVar;
        this.f4243a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f4243a;
        com.startapp.sdk.components.a aVar = this.f4244b;
        return new di(context, aVar.f3340F, aVar.f3338D, new p5());
    }
}
