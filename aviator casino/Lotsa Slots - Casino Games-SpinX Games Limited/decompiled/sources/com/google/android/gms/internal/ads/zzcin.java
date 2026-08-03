package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcin extends com.google.android.gms.internal.ads.zzaul {
    static final com.google.android.gms.internal.ads.zzcin zzb = new com.google.android.gms.internal.ads.zzcin();

    zzcin() {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final com.google.android.gms.internal.ads.zzaup zza(java.lang.String str, byte[] bArr, java.lang.String str2) {
        return "moov".equals(str) ? new com.google.android.gms.internal.ads.zzaur() : "mvhd".equals(str) ? new com.google.android.gms.internal.ads.zzaus() : new com.google.android.gms.internal.ads.zzaut(str);
    }
}
