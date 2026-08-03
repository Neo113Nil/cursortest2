package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5442a;

    public C0213a(android.content.Context context) {
        this.f5442a = context;
    }

    public final byte[] a() {
        try {
            return io.appmetrica.analytics.impl.AbstractC0388gj.a(new java.lang.StringBuilder(this.f5442a.getPackageName()).reverse().toString());
        } catch (java.lang.Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return io.appmetrica.analytics.impl.AbstractC0388gj.a(this.f5442a.getPackageName());
        } catch (java.lang.Throwable unused) {
            return new byte[16];
        }
    }
}
