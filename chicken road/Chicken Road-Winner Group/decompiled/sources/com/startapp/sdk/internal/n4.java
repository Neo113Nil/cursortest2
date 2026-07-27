package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class n4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4086b;

    public n4(com.startapp.sdk.components.a aVar, Context context) {
        this.f4086b = aVar;
        this.f4085a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new pf(this.f4085a, this.f4086b.f3338D, new m4());
    }
}
