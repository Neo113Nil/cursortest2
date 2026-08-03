package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public interface zzbsn extends com.google.android.gms.internal.ads.zzbsy, com.google.android.gms.internal.ads.zzbsm {

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    /* renamed from: com.google.android.gms.internal.ads.zzbsn$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$zzc(com.google.android.gms.internal.ads.zzbsn _this, java.lang.String str, java.lang.String str2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + java.lang.String.valueOf(str2).length() + 2);
            sb.append(str);
            sb.append("(");
            sb.append(str2);
            sb.append(");");
            _this.zza(sb.toString());
        }

        public static void $default$zzd(com.google.android.gms.internal.ads.zzbsn _this, java.lang.String str, org.json.JSONObject jSONObject) {
            java.lang.String jSONObject2 = jSONObject.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
            sb.append(str);
            sb.append("',");
            sb.append(jSONObject2);
            sb.append(");");
            java.lang.String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(sb2));
            _this.zza(sb.toString());
        }

        public static void $default$zze(com.google.android.gms.internal.ads.zzbsn _this, java.lang.String str, java.util.Map map) {
            try {
                _this.zzd(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
            } catch (org.json.JSONException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    void zza(java.lang.String str);

    @Override // com.google.android.gms.internal.ads.zzbsy
    void zzb(java.lang.String str, org.json.JSONObject jSONObject);

    @Override // com.google.android.gms.internal.ads.zzbsy
    void zzc(java.lang.String str, java.lang.String str2);

    @Override // com.google.android.gms.internal.ads.zzbsm
    void zzd(java.lang.String str, org.json.JSONObject jSONObject);

    @Override // com.google.android.gms.internal.ads.zzbsm
    void zze(java.lang.String str, java.util.Map map);
}
