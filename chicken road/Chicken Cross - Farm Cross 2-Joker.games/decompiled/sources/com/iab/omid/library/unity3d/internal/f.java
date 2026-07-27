package com.iab.omid.library.unity3d.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class f {
    private static f b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f6357a;

    private f() {
    }

    public static f b() {
        return b;
    }

    public Context a() {
        return this.f6357a;
    }

    public void a(Context context) {
        this.f6357a = context != null ? context.getApplicationContext() : null;
    }
}
