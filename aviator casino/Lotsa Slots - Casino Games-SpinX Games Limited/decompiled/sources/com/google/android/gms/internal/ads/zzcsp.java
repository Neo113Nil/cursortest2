package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcsp implements com.google.android.gms.internal.ads.zzcrt {
    private final com.google.android.gms.internal.ads.zzfke zza;

    public zzcsp(com.google.android.gms.internal.ads.zzfke zzfkeVar) {
        this.zza = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("render_in_browser");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zza(java.lang.Boolean.parseBoolean(str));
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}
