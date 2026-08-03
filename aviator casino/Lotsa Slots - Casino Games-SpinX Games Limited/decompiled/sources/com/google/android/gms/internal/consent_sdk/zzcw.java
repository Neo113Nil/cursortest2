package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzcw {
    public static com.google.android.gms.internal.consent_sdk.zzcu zza(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] split = str.split(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, -1);
        int length = split.length;
        if (length == 1) {
            java.lang.String valueOf = java.lang.String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            return null;
        }
        return new com.google.android.gms.internal.consent_sdk.zzcu(str2, str3);
    }

    public static void zzb(android.content.Context context, java.util.Set set) {
        android.content.SharedPreferences.Editor zzf;
        com.google.android.gms.internal.consent_sdk.zzcv zzcvVar = new com.google.android.gms.internal.consent_sdk.zzcv(context);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.google.android.gms.internal.consent_sdk.zzcu zza = zza(context, str);
            if (zza == null) {
                android.util.Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(java.lang.String.valueOf(str)));
            } else {
                zzf = zzcvVar.zzf(zza.zza);
                zzf.remove(zza.zzb);
            }
        }
        zzcvVar.zzc();
    }
}
