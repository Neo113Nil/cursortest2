package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class c5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3528a;

    public c5(Context context) {
        this.f3528a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f3528a.getSharedPreferences("com.startapp.sdk.extras", 0), new b5(this));
    }
}
