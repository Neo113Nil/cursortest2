package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class zzz {
    /* synthetic */ zzz(byte[] bArr) {
    }

    public android.webkit.CookieManager zza(android.content.Context context) {
        throw null;
    }

    public com.google.android.gms.internal.ads.zzclf zzb(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, boolean z, com.google.android.gms.internal.ads.zzekr zzekrVar) {
        throw null;
    }

    public android.webkit.WebResourceResponse zzc(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.util.Map map, java.io.InputStream inputStream) {
        throw null;
    }

    public boolean zzd(android.app.Activity activity, android.content.res.Configuration configuration) {
        return false;
    }

    public com.google.android.gms.internal.ads.zzbhv.zzq zzf(android.content.Context context, android.telephony.TelephonyManager telephonyManager) {
        return com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_UNKNOWN;
    }

    public void zzg(android.content.Context context, java.lang.String str, java.lang.String str2) {
    }

    public boolean zzh(android.content.Context context, java.lang.String str) {
        return false;
    }

    public android.content.Intent zzi(android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void zzj(android.app.Activity activity) {
    }

    public int zzk(android.media.AudioManager audioManager) {
        return 0;
    }

    public int zzm(android.content.Context context) {
        return ((android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE)).getNetworkType();
    }
}
