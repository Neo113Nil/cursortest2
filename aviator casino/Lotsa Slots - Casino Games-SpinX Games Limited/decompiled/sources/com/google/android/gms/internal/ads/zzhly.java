package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhly extends com.google.android.gms.internal.ads.zzheh {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzhtm zzb;

    /* synthetic */ zzhly(java.lang.String str, com.google.android.gms.internal.ads.zzhtm zzhtmVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhtmVar;
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.zza;
        int ordinal = this.zzb.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzb != com.google.android.gms.internal.ads.zzhtm.RAW;
    }
}
