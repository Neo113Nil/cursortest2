package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzclr implements com.google.android.gms.internal.ads.zzbpq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzclx zza;

    zzclr(com.google.android.gms.internal.ads.zzclx zzclxVar) {
        java.util.Objects.requireNonNull(zzclxVar);
        this.zza = zzclxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        if (map != null) {
            java.lang.String str = (java.lang.String) map.get("height");
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = java.lang.Integer.parseInt(str);
                com.google.android.gms.internal.ads.zzclx zzclxVar = this.zza;
                synchronized (zzclxVar) {
                    if (zzclxVar.zzaX() != parseInt) {
                        zzclxVar.zzaY(parseInt);
                        zzclxVar.requestLayout();
                    }
                }
            } catch (java.lang.Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
