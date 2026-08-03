package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzatx {
    long zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final java.util.List zzh;

    private zzatx(java.lang.String str, java.lang.String str2, long j, long j2, long j3, long j4, java.util.List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    static com.google.android.gms.internal.ads.zzatx zza(com.google.android.gms.internal.ads.zzaty zzatyVar) throws java.io.IOException {
        if (com.google.android.gms.internal.ads.zzaua.zzi(zzatyVar) != 538247942) {
            throw new java.io.IOException();
        }
        java.lang.String zzm = com.google.android.gms.internal.ads.zzaua.zzm(zzatyVar);
        java.lang.String zzm2 = com.google.android.gms.internal.ads.zzaua.zzm(zzatyVar);
        long zzk = com.google.android.gms.internal.ads.zzaua.zzk(zzatyVar);
        long zzk2 = com.google.android.gms.internal.ads.zzaua.zzk(zzatyVar);
        long zzk3 = com.google.android.gms.internal.ads.zzaua.zzk(zzatyVar);
        long zzk4 = com.google.android.gms.internal.ads.zzaua.zzk(zzatyVar);
        int zzi = com.google.android.gms.internal.ads.zzaua.zzi(zzatyVar);
        if (zzi < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(zzi);
            throw new java.io.IOException(sb.toString());
        }
        java.util.List emptyList = zzi == 0 ? java.util.Collections.emptyList() : new java.util.ArrayList();
        for (int i = 0; i < zzi; i++) {
            emptyList.add(new com.google.android.gms.internal.ads.zzasw(com.google.android.gms.internal.ads.zzaua.zzm(zzatyVar).intern(), com.google.android.gms.internal.ads.zzaua.zzm(zzatyVar).intern()));
        }
        return new com.google.android.gms.internal.ads.zzatx(zzm, zzm2, zzk, zzk2, zzk3, zzk4, emptyList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzatx(java.lang.String str, com.google.android.gms.internal.ads.zzasn zzasnVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        java.lang.String str2 = zzasnVar.zzb;
        long j = zzasnVar.zzc;
        long j2 = zzasnVar.zzd;
        long j3 = zzasnVar.zze;
        long j4 = zzasnVar.zzf;
        java.util.List list = zzasnVar.zzh;
        if (list == null) {
            java.util.Map map = zzasnVar.zzg;
            list = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                list.add(new com.google.android.gms.internal.ads.zzasw((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
            }
        }
    }
}
