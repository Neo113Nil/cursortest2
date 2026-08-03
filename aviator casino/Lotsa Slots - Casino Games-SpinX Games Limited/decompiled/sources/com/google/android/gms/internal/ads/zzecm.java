package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzecm {
    private final com.google.android.gms.internal.ads.zzebw zza;
    private final com.google.android.gms.internal.ads.zzdwz zzb;
    private final java.lang.Object zzc = new java.lang.Object();
    private final java.util.List zzd = new java.util.ArrayList();
    private boolean zze;

    zzecm(com.google.android.gms.internal.ads.zzebw zzebwVar, com.google.android.gms.internal.ads.zzdwz zzdwzVar) {
        this.zza = zzebwVar;
        this.zzb = zzdwzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(java.util.List list) {
        java.lang.String str;
        boolean z;
        com.google.android.gms.internal.ads.zzdwy zzc;
        com.google.android.gms.internal.ads.zzbxq zzbxqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.zzbrp zzbrpVar = (com.google.android.gms.internal.ads.zzbrp) it.next();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkK)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzdwy zzc2 = this.zzb.zzc(zzbrpVar.zza);
                    if (zzc2 != null && (zzbxqVar = zzc2.zzc) != null) {
                        str = zzbxqVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                java.lang.String str2 = str;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkL)).booleanValue() && (zzc = this.zzb.zzc(zzbrpVar.zza)) != null && zzc.zzd) {
                    z = true;
                    java.util.List list2 = this.zzd;
                    java.lang.String str3 = zzbrpVar.zza;
                    list2.add(new com.google.android.gms.internal.ads.zzecl(str3, str2, this.zzb.zzd(str3), zzbrpVar.zzb ? 1 : 0, zzbrpVar.zzd, zzbrpVar.zzc, z));
                }
                z = false;
                java.util.List list22 = this.zzd;
                java.lang.String str32 = zzbrpVar.zza;
                list22.add(new com.google.android.gms.internal.ads.zzecl(str32, str2, this.zzb.zzd(str32), zzbrpVar.zzb ? 1 : 0, zzbrpVar.zzd, zzbrpVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new com.google.android.gms.internal.ads.zzeck(this));
    }

    public final org.json.JSONArray zzb() throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                com.google.android.gms.internal.ads.zzebw zzebwVar = this.zza;
                if (zzebwVar.zze()) {
                    zzc(zzebwVar.zzd());
                } else {
                    zza();
                }
            }
            java.util.Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.google.android.gms.internal.ads.zzecl) it.next()).zza());
            }
        }
        return jSONArray;
    }
}
