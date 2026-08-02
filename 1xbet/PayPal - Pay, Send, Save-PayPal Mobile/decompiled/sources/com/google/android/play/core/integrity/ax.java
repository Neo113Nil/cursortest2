package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static com.google.android.play.core.integrity.aw f3804a;

    static com.google.android.play.core.integrity.aw a(android.content.Context context) {
        com.google.android.play.core.integrity.aw awVar;
        synchronized (com.google.android.play.core.integrity.ax.class) {
            if (f3804a == null) {
                com.google.android.play.core.integrity.u uVar = new com.google.android.play.core.integrity.u(null);
                uVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f3804a = uVar.b();
            }
            awVar = f3804a;
        }
        return awVar;
    }
}
