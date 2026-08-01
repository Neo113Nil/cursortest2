package com.iab.omid.library.bigosg.b;

import android.content.Context;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f6098a = new d();
    private Context b;

    private d() {
    }

    public static d a() {
        return f6098a;
    }

    public Context b() {
        return this.b;
    }

    public void a(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
    }
}
