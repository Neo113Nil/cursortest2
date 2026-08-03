package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzu implements com.google.android.gms.internal.ads.zzgta {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzu zza = new com.google.android.gms.internal.ads.zzu();

    private /* synthetic */ zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzx zzxVar = (com.google.android.gms.internal.ads.zzx) obj;
        int i = com.google.android.gms.internal.ads.zzv.zzP;
        java.lang.String str = zzxVar.zza;
        java.lang.String str2 = zzxVar.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 2 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }
}
