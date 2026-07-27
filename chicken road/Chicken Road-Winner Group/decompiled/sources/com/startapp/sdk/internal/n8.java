package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;

/* loaded from: classes.dex */
public final class n8 {
    public static final q8 f = new q8(new byte[0], "text/plain", null);

    /* renamed from: a, reason: collision with root package name */
    public final o8 f4094a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4095b;

    /* renamed from: c, reason: collision with root package name */
    public q8 f4096c = f;

    /* renamed from: d, reason: collision with root package name */
    public TimeoutConfig f4097d;

    /* renamed from: e, reason: collision with root package name */
    public g7 f4098e;

    public n8(o8 o8Var, String str) {
        this.f4094a = o8Var;
        this.f4095b = str;
    }

    public final r8 a() {
        o8 o8Var = this.f4094a;
        try {
            return o8Var.a(this);
        } catch (Throwable th) {
            if (!o8Var.a(1)) {
                return null;
            }
            d9.a(th);
            return null;
        }
    }

    public final r8 b() {
        o8 o8Var = this.f4094a;
        try {
            return o8Var.b(this);
        } catch (Throwable th) {
            if (!o8Var.a(4)) {
                return null;
            }
            d9.a(th);
            return null;
        }
    }
}
