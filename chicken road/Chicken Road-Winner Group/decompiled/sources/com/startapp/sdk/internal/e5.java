package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class e5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3613b;

    public e5(com.startapp.sdk.components.a aVar, Context context) {
        this.f3613b = aVar;
        this.f3612a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f3612a;
        com.startapp.sdk.components.a aVar = this.f3613b;
        return new hj(context, aVar.f3336B, aVar.f3346M);
    }
}
