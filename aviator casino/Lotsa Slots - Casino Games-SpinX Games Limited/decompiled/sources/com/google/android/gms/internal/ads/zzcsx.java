package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcsx implements com.google.android.gms.internal.ads.zzcrt {
    private final com.google.android.gms.internal.ads.zzecr zza;

    zzcsx(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zza = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("test_mode_enabled");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals("true"));
    }
}
