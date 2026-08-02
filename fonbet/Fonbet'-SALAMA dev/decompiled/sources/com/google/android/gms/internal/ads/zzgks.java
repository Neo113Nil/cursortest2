package com.google.android.gms.internal.ads;

import w1.L;

/* loaded from: classes.dex */
final class zzgks extends zzgdf {
    private final String zza;
    private final zzgte zzb;

    public /* synthetic */ zzgks(String str, zzgte zzgteVar, zzgkt zzgktVar) {
        this.zza = str;
        this.zzb = zzgteVar;
    }

    public final String toString() {
        String str = this.zza;
        int ordinal = this.zzb.ordinal();
        return L.j("(typeUrl=", str, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zzb != zzgte.RAW;
    }
}
