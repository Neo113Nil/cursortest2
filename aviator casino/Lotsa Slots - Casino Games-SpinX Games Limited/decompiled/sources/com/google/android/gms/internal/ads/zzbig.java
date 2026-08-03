package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbig extends com.google.android.gms.internal.ads.zzbih {
    zzbig(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(zze())) : (java.lang.String) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ void zzb(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putString(zze(), (java.lang.String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(org.json.JSONObject jSONObject) {
        return jSONObject.optString(zze(), (java.lang.String) zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final /* bridge */ /* synthetic */ java.lang.Object zzd(android.content.SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zze(), (java.lang.String) zzf());
    }
}
