package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class n6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0257k f4088b;

    public n6(Context context, C0257k c0257k) {
        this.f4087a = context;
        this.f4088b = c0257k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e7.a(this.f4087a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new m6(this));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
