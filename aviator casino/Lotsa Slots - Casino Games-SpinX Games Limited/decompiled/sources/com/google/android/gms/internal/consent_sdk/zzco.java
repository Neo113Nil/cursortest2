package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzco {
    private final android.app.Application zza;
    private com.google.android.gms.internal.consent_sdk.zzha zzb;
    private com.google.android.gms.internal.consent_sdk.zzgw zzd;
    private com.google.android.gms.internal.consent_sdk.zzgt zzc = null;
    private java.lang.String zze = null;

    zzco(android.app.Application application) {
        this.zza = application;
    }

    public final com.google.android.gms.internal.consent_sdk.zzif zza(int i, java.lang.String str, long j) {
        android.os.Bundle bundle;
        com.google.android.gms.internal.consent_sdk.zzid zza = com.google.android.gms.internal.consent_sdk.zzif.zza();
        com.google.android.gms.internal.consent_sdk.zzgu zza2 = com.google.android.gms.internal.consent_sdk.zzhc.zza();
        com.google.android.gms.internal.consent_sdk.zzgx zza3 = com.google.android.gms.internal.consent_sdk.zzgy.zza();
        zza3.zzc(i);
        if (str != null) {
            zza3.zza(str);
        }
        if (j > 0) {
            zza3.zzb(j);
        }
        zza2.zze((com.google.android.gms.internal.consent_sdk.zzgy) zza3.zzi());
        java.lang.String str2 = this.zze;
        android.content.pm.PackageInfo packageInfo = null;
        if (str2 == null) {
            try {
                android.app.Application application = this.zza;
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                this.zze = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (android.text.TextUtils.isEmpty(this.zze)) {
                android.util.Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
            str2 = this.zze;
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        com.google.android.gms.internal.consent_sdk.zzha zzhaVar = this.zzb;
        if (zzhaVar == null) {
            com.google.android.gms.internal.consent_sdk.zzgz zza4 = com.google.android.gms.internal.consent_sdk.zzha.zza();
            zza4.zza("4.0.0");
            zzhaVar = (com.google.android.gms.internal.consent_sdk.zzha) zza4.zzi();
            this.zzb = zzhaVar;
        }
        zza2.zzf(zzhaVar);
        com.google.android.gms.internal.consent_sdk.zzgw zzgwVar = this.zzd;
        if (zzgwVar == null) {
            com.google.android.gms.internal.consent_sdk.zzgv zza5 = com.google.android.gms.internal.consent_sdk.zzgw.zza();
            zza5.zza(android.os.Build.VERSION.SDK_INT);
            zza5.zzb(android.os.Build.MODEL);
            zza5.zzd(3);
            zza5.zzc(android.os.Build.VERSION.RELEASE);
            zzgwVar = (com.google.android.gms.internal.consent_sdk.zzgw) zza5.zzi();
            this.zzd = zzgwVar;
        }
        zza2.zzd(zzgwVar);
        com.google.android.gms.internal.consent_sdk.zzgt zzgtVar = this.zzc;
        if (zzgtVar == null) {
            android.app.Application application2 = this.zza;
            java.lang.String packageName = application2.getPackageName();
            try {
                packageInfo = application2.getPackageManager().getPackageInfo(packageName, 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            }
            if (packageInfo != null) {
                com.google.android.gms.internal.consent_sdk.zzgs zza6 = com.google.android.gms.internal.consent_sdk.zzgt.zza();
                zza6.zzb(java.lang.Long.toString(android.os.Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
                zza6.zza(packageName);
                this.zzc = (com.google.android.gms.internal.consent_sdk.zzgt) zza6.zzi();
            }
            zzgtVar = this.zzc;
        }
        if (zzgtVar != null) {
            zza2.zzc(zzgtVar);
        }
        java.lang.String string = android.preference.PreferenceManager.getDefaultSharedPreferences(this.zza).getString("UMP_eids", "");
        if (string != null && !string.isEmpty()) {
            java.util.Iterator it = com.google.android.gms.internal.consent_sdk.zzdo.zza(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).zzb(string).iterator();
            while (it.hasNext()) {
                zza2.zza((java.lang.String) it.next());
            }
        }
        zza.zza((com.google.android.gms.internal.consent_sdk.zzhc) zza2.zzi());
        zza.zzb(java.lang.System.currentTimeMillis());
        return (com.google.android.gms.internal.consent_sdk.zzif) zza.zzi();
    }
}
