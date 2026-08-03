package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbtw implements com.google.android.gms.internal.ads.zzbsn, com.google.android.gms.internal.ads.zzbtv {
    private final com.google.android.gms.internal.ads.zzbtv zza;
    private final java.util.HashSet zzb = new java.util.HashSet();

    public zzbtw(com.google.android.gms.internal.ads.zzbtv zzbtvVar) {
        this.zza = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn, com.google.android.gms.internal.ads.zzbsy
    public final void zza(java.lang.String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn, com.google.android.gms.internal.ads.zzbsy
    public /* synthetic */ void zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsn, com.google.android.gms.internal.ads.zzbsy
    public /* synthetic */ void zzc(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbsn.CC.$default$zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn, com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zzd(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbsn.CC.$default$zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn, com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zze(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzbsn.CC.$default$zze(this, str, map);
    }

    public final void zzf() {
        java.util.HashSet hashSet = this.zzb;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.util.AbstractMap.SimpleEntry simpleEntry = (java.util.AbstractMap.SimpleEntry) it.next();
            java.lang.String obj = ((com.google.android.gms.internal.ads.zzbpq) simpleEntry.getValue()).toString();
            java.lang.String.valueOf(obj);
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(java.lang.String.valueOf(obj)));
            this.zza.zzn((java.lang.String) simpleEntry.getKey(), (com.google.android.gms.internal.ads.zzbpq) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzm(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        this.zza.zzm(str, zzbpqVar);
        this.zzb.add(new java.util.AbstractMap.SimpleEntry(str, zzbpqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzn(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        this.zza.zzn(str, zzbpqVar);
        this.zzb.remove(new java.util.AbstractMap.SimpleEntry(str, zzbpqVar));
    }
}
