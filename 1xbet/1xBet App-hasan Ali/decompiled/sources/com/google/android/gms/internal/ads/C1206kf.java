package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206kf extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f14252a;

    /* renamed from: b, reason: collision with root package name */
    public Context f14253b;

    /* renamed from: c, reason: collision with root package name */
    public Context f14254c;

    public final void a(Intent intent) {
        if (this.f14252a == null) {
            intent.setFlags(268435456);
            this.f14253b.startActivity(intent);
            return;
        }
        T2.G.m("Starting activity for result with intent: " + String.valueOf(intent.getData()) + " and requestCode: 236");
        this.f14252a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f14254c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f14253b = applicationContext;
        this.f14252a = context instanceof Activity ? (Activity) context : null;
        this.f14254c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f14252a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f14253b.startActivity(intent);
        }
    }
}
