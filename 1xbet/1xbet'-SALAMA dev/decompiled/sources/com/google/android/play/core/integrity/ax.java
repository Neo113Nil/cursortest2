package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f11617a;

    public static synchronized aw a(Context context) {
        try {
            if (f11617a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f11617a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11617a;
    }
}
