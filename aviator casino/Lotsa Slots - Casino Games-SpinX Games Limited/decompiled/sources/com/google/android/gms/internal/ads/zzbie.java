package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbie extends com.google.android.gms.internal.ads.zzbih {
    zzbie(int i, java.lang.String str, java.lang.Long l, java.lang.Long l2) {
        super(1, str, l, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? java.lang.Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zze()))) : (java.lang.Long) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ void zzb(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putLong(zze(), ((java.lang.Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(org.json.JSONObject jSONObject) {
        return java.lang.Long.valueOf(jSONObject.optLong(zze(), ((java.lang.Long) zzf()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzd(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Long.valueOf(sharedPreferences.getLong(zze(), ((java.lang.Long) zzf()).longValue()));
    }
}
