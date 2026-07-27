package com.startapp.sdk.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3897a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3898b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f3899c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3900d;

    public j6(Context context) {
        this.f3897a = context;
        this.f3900d = 900000L;
    }

    public Object a() {
        return null;
    }

    public final Object b() {
        Object obj = this.f3898b;
        if (obj == null || this.f3899c + this.f3900d < SystemClock.uptimeMillis()) {
            synchronized (this) {
                try {
                    obj = this.f3898b;
                    boolean z3 = this.f3899c + this.f3900d < SystemClock.uptimeMillis();
                    if (obj == null || z3) {
                        try {
                            obj = a(z3);
                        } catch (Throwable th) {
                            if (!si.a(th, RemoteException.class)) {
                                d9.a(th);
                            }
                        }
                        if (obj != null) {
                            this.f3898b = obj;
                            this.f3899c = SystemClock.uptimeMillis();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj != null ? obj : c();
    }

    public abstract Object c();

    public Object a(boolean z3) {
        return a();
    }

    public j6(Context context, long j3) {
        this.f3897a = context;
        this.f3900d = j3;
    }
}
