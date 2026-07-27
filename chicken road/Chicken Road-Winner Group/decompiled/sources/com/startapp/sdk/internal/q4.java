package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class q4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4242a;

    public q4(Context context) {
        this.f4242a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f4242a;
        return new mc(context, new sf(context.getSharedPreferences("StartApp-b36110d5cb803404", 0)), new p4(), new Handler(Looper.getMainLooper()));
    }
}
