package com.startapp.sdk.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    public final String f3864a;

    /* renamed from: b, reason: collision with root package name */
    public volatile i7 f3865b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f3866c;

    public ib(i7 i7Var) {
        this.f3865b = i7Var;
        this.f3864a = i7Var.toString();
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f3866c;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f3866c;
                if (obj == null) {
                    i7 i7Var = this.f3865b;
                    this.f3865b = null;
                    if (i7Var == null) {
                        throw new IllegalStateException("3, " + this.f3864a);
                    }
                    try {
                        obj = i7Var.a();
                        if (obj == null) {
                            throw new IllegalStateException("2, " + this.f3864a);
                        }
                        this.f3866c = obj;
                    } catch (Error e3) {
                        e = e3;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f3864a));
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f3864a));
                        throw e;
                    }
                }
            } finally {
            }
        }
        return obj;
    }
}
