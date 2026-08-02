package com.google.android.gms.internal.firebase_database;

import com.google.firebase.internal.InternalTokenResult;

/* loaded from: classes.dex */
final class zzo implements Runnable {
    private final /* synthetic */ InternalTokenResult zzbh;
    private final /* synthetic */ zzn zzbi;

    zzo(zzn zznVar, InternalTokenResult internalTokenResult) {
        this.zzbi = zznVar;
        this.zzbh = internalTokenResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbi.zzbf.zzo(this.zzbh.getToken());
    }
}
