package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7805a;

    public C0499a(Context context) {
        this.f7805a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0803lj.a(new StringBuilder(this.f7805a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0803lj.a(this.f7805a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
