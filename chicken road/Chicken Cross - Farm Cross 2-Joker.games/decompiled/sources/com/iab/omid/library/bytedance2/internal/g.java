package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class g {
    private static g b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f6132a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.f6132a;
    }

    public void a(Context context) {
        this.f6132a = context != null ? context.getApplicationContext() : null;
    }
}
