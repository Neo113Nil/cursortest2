package com.google.android.gms.internal.ads;

import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
final class zzgks extends zzgdf {
    private final String zza;
    private final zzgte zzb;

    public /* synthetic */ zzgks(String str, zzgte zzgteVar, zzgkt zzgktVar) {
        this.zza = str;
        this.zzb = zzgteVar;
    }

    public final String toString() {
        String str;
        String str2 = this.zza;
        int iOrdinal = this.zzb.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return L.j("(typeUrl=", str2, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzb != zzgte.RAW;
    }
}
