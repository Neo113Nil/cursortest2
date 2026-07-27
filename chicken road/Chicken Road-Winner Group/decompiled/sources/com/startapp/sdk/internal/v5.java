package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class v5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4511b;

    public v5(com.startapp.sdk.components.a aVar, Context context) {
        this.f4511b = aVar;
        this.f4510a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new pk(this.f4510a, this.f4511b.f3355b);
    }
}
