package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzca extends android.database.ContentObserver {
    zzca(android.os.Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = com.google.android.gms.internal.auth.zzcb.zzl;
        atomicBoolean.set(true);
    }
}
