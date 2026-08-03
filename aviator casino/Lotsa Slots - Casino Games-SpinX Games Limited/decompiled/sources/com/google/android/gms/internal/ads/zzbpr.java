package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbpr implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzecr zza;

    public zzbpr(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzecrVar, "The Inspector Manager must not be null");
        this.zza = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (map == null || !map.containsKey("persistentData") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((java.lang.String) map.get("persistentData"));
    }
}
