package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhfk implements com.google.android.gms.internal.ads.zzhln {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhfk zza = new com.google.android.gms.internal.ads.zzhfk();

    private /* synthetic */ zzhfk() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzhfo zzhfoVar = (com.google.android.gms.internal.ads.zzhfo) zzhehVar;
        int i = com.google.android.gms.internal.ads.zzhfl.zza;
        if (zzhfoVar.zzc() == 24) {
            throw new java.security.GeneralSecurityException("192 bit AES EAX Parameters are not valid");
        }
        com.google.android.gms.internal.ads.zzhfh zzhfhVar = new com.google.android.gms.internal.ads.zzhfh(null);
        zzhfhVar.zza(zzhfoVar);
        zzhfhVar.zzc(num);
        zzhfhVar.zzb(com.google.android.gms.internal.ads.zzibb.zzb(zzhfoVar.zzc()));
        return zzhfhVar.zzd();
    }
}
