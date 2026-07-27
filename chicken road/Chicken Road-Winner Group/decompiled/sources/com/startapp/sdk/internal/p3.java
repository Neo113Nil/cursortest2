package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class p3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4204b;

    public p3(com.startapp.sdk.components.a aVar, Context context) {
        this.f4204b = aVar;
        this.f4203a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f4203a;
        com.startapp.sdk.components.a aVar = this.f4204b;
        return new g6(context, aVar.f3341G, aVar.f3360h);
    }
}
