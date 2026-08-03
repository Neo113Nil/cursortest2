package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbii {
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzc = new java.util.ArrayList();

    public final void zza(com.google.android.gms.internal.ads.zzbih zzbihVar) {
        this.zza.add(zzbihVar);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzbih zzbihVar) {
        this.zzb.add(zzbihVar);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbih zzbihVar) {
        this.zzc.add(zzbihVar);
    }

    public final void zzd(android.content.SharedPreferences.Editor editor, int i, org.json.JSONObject jSONObject) {
        for (com.google.android.gms.internal.ads.zzbih zzbihVar : this.zza) {
            if (zzbihVar.zzm() == 1) {
                zzbihVar.zzb(editor, zzbihVar.zzc(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Flag Json is null.");
        }
    }

    public final java.util.List zze() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd((com.google.android.gms.internal.ads.zzbih) it.next());
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(com.google.android.gms.internal.ads.zzbir.zza());
        return arrayList;
    }

    public final java.util.List zzf() {
        java.util.List zze = zze();
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd((com.google.android.gms.internal.ads.zzbih) it.next());
            if (!android.text.TextUtils.isEmpty(str)) {
                zze.add(str);
            }
        }
        zze.addAll(com.google.android.gms.internal.ads.zzbir.zzb());
        return zze;
    }
}
