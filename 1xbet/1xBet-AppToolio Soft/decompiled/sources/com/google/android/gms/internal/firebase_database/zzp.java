package com.google.android.gms.internal.firebase_database;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzp implements zzcg {
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.google.android.gms.internal.firebase_database.zzcg
    public final void restart() {
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcg
    public final void shutdown() {
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcg
    public final void zza(Runnable runnable) {
        this.handler.post(runnable);
    }
}
