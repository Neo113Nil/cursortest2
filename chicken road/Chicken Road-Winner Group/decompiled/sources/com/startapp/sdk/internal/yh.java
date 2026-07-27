package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class yh implements yf {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4730a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4731b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f4732c = Executors.newScheduledThreadPool(1, new u5("scheduler"));

    public yh(Context context) {
        this.f4730a = new WeakReference(context);
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(de deVar, long j3) {
        Context context = (Context) this.f4730a.get();
        if (context == null) {
            return false;
        }
        return new wh(this, deVar, j3).a(context, deVar.f3589a, new xh(), null);
    }

    @Override // com.startapp.sdk.internal.yf
    public final synchronized boolean a(int i3) {
        Future future = (Future) this.f4731b.get(Integer.valueOf(i3));
        if (future == null) {
            return false;
        }
        this.f4731b.remove(Integer.valueOf(i3));
        return future.cancel(true);
    }
}
