package com.google.android.gms.internal.firebase_database;

import android.support.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.internal.InternalTokenResult;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzn implements FirebaseApp.IdTokenListener {
    final /* synthetic */ zzbs zzbf;
    private final /* synthetic */ zzk zzbg;

    zzn(zzk zzkVar, zzbs zzbsVar) {
        this.zzbg = zzkVar;
        this.zzbf = zzbsVar;
    }

    @Override // com.google.firebase.FirebaseApp.IdTokenListener
    public final void onIdTokenChanged(@NonNull InternalTokenResult internalTokenResult) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzbg.zzbc;
        scheduledExecutorService.execute(new zzo(this, internalTokenResult));
    }
}
