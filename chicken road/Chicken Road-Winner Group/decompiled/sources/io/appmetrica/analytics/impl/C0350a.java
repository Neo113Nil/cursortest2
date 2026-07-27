package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6926a;

    public C0350a(Context context) {
        this.f6926a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0654lj.a(new StringBuilder(this.f6926a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0654lj.a(this.f6926a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
