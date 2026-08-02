package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
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
