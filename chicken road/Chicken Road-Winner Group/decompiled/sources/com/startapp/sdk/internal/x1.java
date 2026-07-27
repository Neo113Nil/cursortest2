package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4616a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f4617b;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f4619d = new G0.m(17, this);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4618c = new Handler(Looper.getMainLooper());

    public x1(Context context, wd wdVar) {
        this.f4616a = context;
        this.f4617b = new w1(this, wdVar);
    }

    public abstract void a();
}
