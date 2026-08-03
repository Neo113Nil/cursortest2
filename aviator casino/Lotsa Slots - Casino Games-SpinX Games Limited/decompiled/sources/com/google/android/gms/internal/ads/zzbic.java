package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbic extends com.google.android.gms.internal.ads.zzbih {
    zzbic(int i, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        super(i, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? java.lang.Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zze()))) : (java.lang.Boolean) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ void zzb(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putBoolean(zze(), ((java.lang.Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(org.json.JSONObject jSONObject) {
        return java.lang.Boolean.valueOf(jSONObject.optBoolean(zze(), ((java.lang.Boolean) zzf()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzd(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(zze(), ((java.lang.Boolean) zzf()).booleanValue()));
    }
}
