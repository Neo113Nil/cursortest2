package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzen implements Callable<List<? extends zzgy>> {
    private final /* synthetic */ zzee zzlb;

    zzen(zzee zzeeVar) {
        this.zzlb = zzeeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends zzgy> call() throws Exception {
        zzfv zzfvVar;
        zzfd zzfdVar;
        List<? extends zzgy> zza;
        zzfvVar = this.zzlb.zzkp;
        zzfvVar.zzm();
        zzfdVar = this.zzlb.zzkr;
        if (zzfdVar.zzct().isEmpty()) {
            return Collections.emptyList();
        }
        zza = this.zzlb.zza(new zzfi(zzch.zzbt(), new zzgj(true), true));
        return zza;
    }
}
