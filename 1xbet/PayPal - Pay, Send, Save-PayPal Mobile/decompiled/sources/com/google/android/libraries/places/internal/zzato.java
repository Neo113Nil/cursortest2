package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzato {
    private final com.google.android.libraries.places.internal.zzbnp zza;
    private final int zzb;

    static com.google.android.libraries.places.internal.zzato zzb(int i) {
        com.google.common.base.Preconditions.checkState(true);
        return new com.google.android.libraries.places.internal.zzato(i, null);
    }

    static com.google.android.libraries.places.internal.zzato zzc(int i, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        if (i != 4) {
            i = 5;
        }
        com.google.common.base.Preconditions.checkState(true);
        return new com.google.android.libraries.places.internal.zzato(i, (com.google.android.libraries.places.internal.zzbnp) com.google.common.base.Preconditions.checkNotNull(zzbnpVar));
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza() {
        return this.zza;
    }

    private zzato(int i, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zzb = i;
        this.zza = zzbnpVar;
    }
}
