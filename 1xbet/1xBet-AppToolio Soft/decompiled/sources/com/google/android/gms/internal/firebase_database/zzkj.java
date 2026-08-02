package com.google.android.gms.internal.firebase_database;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class zzkj implements ThreadFactory {
    final /* synthetic */ zzkh zzuj;

    private zzkj(zzkh zzkhVar) {
        this.zzuj = zzkhVar;
    }

    /* synthetic */ zzkj(zzkh zzkhVar, zzki zzkiVar) {
        this(zzkhVar);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        zzey zzeyVar = zzey.zzlr;
        zzeyVar.zza(newThread, "FirebaseDatabaseWorker");
        zzeyVar.zza(newThread, true);
        zzeyVar.zza(newThread, new zzkk(this));
        return newThread;
    }
}
