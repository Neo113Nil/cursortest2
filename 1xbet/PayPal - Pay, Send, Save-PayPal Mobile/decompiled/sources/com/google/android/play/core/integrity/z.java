package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static com.google.android.play.core.integrity.s f3836a;

    static com.google.android.play.core.integrity.s a(android.content.Context context) {
        com.google.android.play.core.integrity.s sVar;
        synchronized (com.google.android.play.core.integrity.z.class) {
            if (f3836a == null) {
                com.google.android.play.core.integrity.q qVar = new com.google.android.play.core.integrity.q(null);
                qVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f3836a = qVar.b();
            }
            sVar = f3836a;
        }
        return sVar;
    }
}
