package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzgaf extends zzgad {
    private zzgaf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final int zza(zzgah zzgahVar) {
        int i7;
        synchronized (zzgahVar) {
            i7 = zzgahVar.remaining - 1;
            zzgahVar.remaining = i7;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final void zzb(zzgah zzgahVar, Set set, Set set2) {
        synchronized (zzgahVar) {
            try {
                if (zzgahVar.seenExceptions == null) {
                    zzgahVar.seenExceptions = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzgaf(zzgag zzgagVar) {
        super(null);
    }
}
