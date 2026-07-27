package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class s3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4320a;

    public s3(Context context) {
        this.f4320a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new q0(new sf(this.f4320a.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0)));
    }
}
