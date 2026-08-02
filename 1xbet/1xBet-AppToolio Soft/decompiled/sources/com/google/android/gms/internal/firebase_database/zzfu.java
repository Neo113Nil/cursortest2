package com.google.android.gms.internal.firebase_database;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfu implements zzfv {
    private boolean zzbt = false;

    private final void zzn() {
        zzkq.zza(this.zzbt, "Transaction expected to already be in progress.");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final <T> T zza(Callable<T> callable) {
        zzkq.zza(!this.zzbt, "runInTransaction called when an existing transaction is already in progress.");
        this.zzbt = true;
        try {
            try {
                return callable.call();
            } catch (Throwable th) {
                Log.e("NoopPersistenceManager", "Caught Throwable.", th);
                throw new RuntimeException(th);
            }
        } finally {
            this.zzbt = false;
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(long j) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzch zzchVar, zzbv zzbvVar, long j) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzch zzchVar, zzja zzjaVar, long j) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzhh zzhhVar, zzja zzjaVar) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzhh zzhhVar, Set<zzid> set) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzhh zzhhVar, Set<zzid> set, Set<zzid> set2) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzc(zzch zzchVar, zzbv zzbvVar) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzd(zzch zzchVar, zzbv zzbvVar) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final zzgu zzf(zzhh zzhhVar) {
        return new zzgu(zzit.zza(zzir.zzfv(), zzhhVar.zzeg()), false, false);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzg(zzhh zzhhVar) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzh(zzhh zzhhVar) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzi(zzhh zzhhVar) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final List<zzfa> zzj() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzk(zzch zzchVar, zzja zzjaVar) {
        zzn();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzm() {
        zzn();
    }
}
