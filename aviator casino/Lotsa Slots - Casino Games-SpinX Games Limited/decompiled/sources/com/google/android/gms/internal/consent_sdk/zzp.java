package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzp {
    private final com.google.android.gms.internal.consent_sdk.zzn zza;
    private final android.app.Activity zzb;
    private final com.google.android.ump.ConsentDebugSettings zzc;
    private final com.google.android.ump.ConsentRequestParameters zzd;

    /* synthetic */ zzp(com.google.android.gms.internal.consent_sdk.zzn zznVar, android.app.Activity activity, com.google.android.ump.ConsentDebugSettings consentDebugSettings, com.google.android.ump.ConsentRequestParameters consentRequestParameters, com.google.android.gms.internal.consent_sdk.zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzcl zza(com.google.android.gms.internal.consent_sdk.zzp zzpVar) {
        android.os.Bundle bundle;
        java.util.List list;
        java.util.List list2;
        android.content.pm.PackageInfo packageInfo;
        com.google.android.gms.internal.consent_sdk.zzcl zzclVar = new com.google.android.gms.internal.consent_sdk.zzcl();
        java.lang.String zza = zzpVar.zzd.zza();
        if (android.text.TextUtils.isEmpty(zza)) {
            try {
                com.google.android.gms.internal.consent_sdk.zzn zznVar = zzpVar.zza;
                bundle = zznVar.zza.getPackageManager().getApplicationInfo(zznVar.zza.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                zza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (android.text.TextUtils.isEmpty(zza)) {
                throw new com.google.android.gms.internal.consent_sdk.zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzclVar.zza = zza;
        com.google.android.ump.ConsentDebugSettings consentDebugSettings = zzpVar.zzc;
        if (consentDebugSettings.isTestDevice()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzcg.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzcg.GEO_OVERRIDE_NON_EEA);
            } else if (debugGeography == 3) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzcg.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (debugGeography == 4) {
                arrayList.add(com.google.android.gms.internal.consent_sdk.zzcg.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(com.google.android.gms.internal.consent_sdk.zzcg.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = java.util.Collections.emptyList();
        }
        zzclVar.zzj = list;
        com.google.android.gms.internal.consent_sdk.zzn zznVar2 = zzpVar.zza;
        zzclVar.zzf = zznVar2.zzb.zzc();
        zzclVar.zze = java.lang.Boolean.valueOf(zzpVar.zzd.isTagForUnderAgeOfConsent());
        zzclVar.zzd = java.util.Locale.getDefault().toLanguageTag();
        com.google.android.gms.internal.consent_sdk.zzch zzchVar = new com.google.android.gms.internal.consent_sdk.zzch();
        zzchVar.zzb = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        zzchVar.zza = android.os.Build.MODEL;
        zzchVar.zzc = 2;
        zzclVar.zzc = zzchVar;
        android.content.res.Configuration configuration = zznVar2.zza.getResources().getConfiguration();
        zznVar2.zza.getResources().getConfiguration();
        com.google.android.gms.internal.consent_sdk.zzcj zzcjVar = new com.google.android.gms.internal.consent_sdk.zzcj();
        zzcjVar.zza = java.lang.Integer.valueOf(configuration.screenWidthDp);
        zzcjVar.zzb = java.lang.Integer.valueOf(configuration.screenHeightDp);
        zzcjVar.zzc = java.lang.Double.valueOf(zznVar2.zza.getResources().getDisplayMetrics().density);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            list2 = java.util.Collections.emptyList();
        } else {
            android.app.Activity activity = zzpVar.zzb;
            android.view.Window window = activity == null ? null : activity.getWindow();
            android.view.View decorView = window == null ? null : window.getDecorView();
            android.view.WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            android.view.DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = java.util.Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        com.google.android.gms.internal.consent_sdk.zzci zzciVar = new com.google.android.gms.internal.consent_sdk.zzci();
                        zzciVar.zzb = java.lang.Integer.valueOf(rect.left);
                        zzciVar.zzc = java.lang.Integer.valueOf(rect.right);
                        zzciVar.zza = java.lang.Integer.valueOf(rect.top);
                        zzciVar.zzd = java.lang.Integer.valueOf(rect.bottom);
                        arrayList2.add(zzciVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzcjVar.zzd = list2;
        zzclVar.zzg = zzcjVar;
        android.app.Application application = zznVar2.zza;
        try {
            packageInfo = zznVar2.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        com.google.android.gms.internal.consent_sdk.zzcf zzcfVar = new com.google.android.gms.internal.consent_sdk.zzcf();
        zzcfVar.zza = application.getPackageName();
        com.google.android.gms.internal.consent_sdk.zzn zznVar3 = zzpVar.zza;
        java.lang.CharSequence applicationLabel = zznVar3.zza.getPackageManager().getApplicationLabel(zznVar3.zza.getApplicationInfo());
        zzcfVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcfVar.zzc = java.lang.Long.toString(android.os.Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzclVar.zzh = zzcfVar;
        com.google.android.gms.internal.consent_sdk.zzck zzckVar = new com.google.android.gms.internal.consent_sdk.zzck();
        zzckVar.zza = "4.0.0";
        zzclVar.zzi = zzckVar;
        zzclVar.zzb = zzpVar.zzd.getConsentSyncId();
        return zzclVar;
    }
}
