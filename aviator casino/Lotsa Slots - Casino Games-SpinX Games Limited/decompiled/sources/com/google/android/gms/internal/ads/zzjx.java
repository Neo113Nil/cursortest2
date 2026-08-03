package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzjx {
    private final java.util.Map zza;
    private com.google.android.gms.internal.ads.zziz zzb;

    /* synthetic */ zzjx(com.google.android.gms.internal.ads.zzlh zzlhVar, int i, byte[] bArr) {
        java.util.Objects.requireNonNull(zzlhVar);
        this.zza = new java.util.HashMap();
        this.zzb = com.google.android.gms.internal.ads.zziz.zza;
    }

    private static final com.google.android.gms.internal.ads.zziz zzb(com.google.android.gms.internal.ads.zziz zzizVar, java.util.List list) {
        com.google.android.gms.internal.ads.zziy zziyVar = new com.google.android.gms.internal.ads.zziy(zzizVar, null);
        java.util.HashSet hashSet = new java.util.HashSet(list);
        for (java.lang.String str : zzizVar.zza()) {
            if (!hashSet.contains(str)) {
                zziyVar.zzf(str);
            }
        }
        return zziyVar.zzg();
    }

    final /* synthetic */ void zza(com.google.android.gms.internal.ads.zziz zzizVar) {
        for (java.util.Map.Entry entry : new java.util.HashMap(this.zza).entrySet()) {
            com.google.android.gms.internal.ads.zzja zzjaVar = (com.google.android.gms.internal.ads.zzja) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (!zzb(zzizVar, list).equals(zzb(this.zzb, list))) {
                zzjaVar.zza();
            }
        }
        this.zzb = zzizVar;
    }
}
