package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeex implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzeex(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzeex zza(com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzeex(zzindVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.lang.String valueOf;
        com.google.android.gms.internal.ads.zzfky zza = ((com.google.android.gms.internal.ads.zzdci) this.zza).zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzil)).booleanValue()) {
            java.lang.String str = zza.zzd.zzx;
            if (!android.text.TextUtils.isEmpty(str)) {
                try {
                    valueOf = new org.json.JSONObject(str).getString("request_id");
                } catch (org.json.JSONException unused) {
                }
            }
            com.google.android.gms.ads.internal.client.zzc zzcVar = zza.zzd.zzs;
            if (zzcVar != null) {
                try {
                    valueOf = new org.json.JSONObject(zzcVar.zza).getString("request_id");
                } catch (org.json.JSONException unused2) {
                }
            }
        }
        valueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
        com.google.android.gms.internal.ads.zzinc.zzb(valueOf);
        return valueOf;
    }
}
