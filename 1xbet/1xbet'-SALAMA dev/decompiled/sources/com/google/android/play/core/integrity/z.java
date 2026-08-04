package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f11701a;

    public static synchronized s a(Context context) {
        try {
            if (f11701a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f11701a = qVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11701a;
    }
}
