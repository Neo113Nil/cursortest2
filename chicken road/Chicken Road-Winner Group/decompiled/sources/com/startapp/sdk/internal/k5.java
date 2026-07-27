package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class k5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3950b;

    public k5(com.startapp.sdk.components.a aVar, Context context) {
        this.f3950b = aVar;
        this.f3949a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new q(this.f3949a, this.f3950b.f3360h, new j5());
    }
}
