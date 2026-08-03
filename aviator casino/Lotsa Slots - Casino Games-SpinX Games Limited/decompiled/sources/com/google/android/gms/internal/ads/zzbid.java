package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbid extends com.google.android.gms.internal.ads.zzbih {
    zzbid(int i, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        super(1, str, num, num2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? java.lang.Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(zze()))) : (java.lang.Integer) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ void zzb(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putInt(zze(), ((java.lang.Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(org.json.JSONObject jSONObject) {
        return java.lang.Integer.valueOf(jSONObject.optInt(zze(), ((java.lang.Integer) zzf()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzd(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Integer.valueOf(sharedPreferences.getInt(zze(), ((java.lang.Integer) zzf()).intValue()));
    }
}
