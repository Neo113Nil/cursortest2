package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
final class zzgaf extends zzgad {
    private zzgaf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final int zza(zzgah zzgahVar) {
        int i7;
        int i8;
        synchronized (zzgahVar) {
            i7 = zzgahVar.remaining;
            i8 = i7 - 1;
            zzgahVar.remaining = i8;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final void zzb(zzgah zzgahVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgahVar) {
            try {
                set3 = zzgahVar.seenExceptions;
                if (set3 == null) {
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
