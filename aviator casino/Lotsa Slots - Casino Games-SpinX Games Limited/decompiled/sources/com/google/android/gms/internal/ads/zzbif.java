package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbif extends com.google.android.gms.internal.ads.zzbih {
    zzbif(int i, java.lang.String str, java.lang.Float f, java.lang.Float f2) {
        super(1, str, f, f2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? java.lang.Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zze()))) : (java.lang.Float) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ void zzb(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putFloat(zze(), ((java.lang.Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(org.json.JSONObject jSONObject) {
        return java.lang.Float.valueOf((float) jSONObject.optDouble(zze(), ((java.lang.Float) zzf()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzd(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Float.valueOf(sharedPreferences.getFloat(zze(), ((java.lang.Float) zzf()).floatValue()));
    }
}
