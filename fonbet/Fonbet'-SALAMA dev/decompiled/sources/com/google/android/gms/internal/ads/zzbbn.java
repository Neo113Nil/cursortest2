package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbbn extends zzbbp {
    public zzbbn(int i7, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbbp
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return jSONObject.optString(zzl(), (String) zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzbbp
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(zzl())) : (String) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbbp
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzl(), (String) zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzbbp
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zzl(), (String) obj);
    }
}
