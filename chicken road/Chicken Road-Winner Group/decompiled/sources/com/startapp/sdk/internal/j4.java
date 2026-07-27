package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class j4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3896b;

    public j4(com.startapp.sdk.components.a aVar, Context context) {
        this.f3896b = aVar;
        this.f3895a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f3895a;
        ib ibVar = new ib(new i4(this));
        com.startapp.sdk.components.a aVar = this.f3896b;
        return new jg(context, ibVar, aVar.f3362j, aVar.f3339E, new h4());
    }
}
