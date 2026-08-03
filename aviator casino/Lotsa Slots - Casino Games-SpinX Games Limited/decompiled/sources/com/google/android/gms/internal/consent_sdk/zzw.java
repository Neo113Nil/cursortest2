package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzw {
    private final android.app.Application zza;
    private final android.os.Handler zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.consent_sdk.zzaq zzd;
    private final com.google.android.gms.internal.consent_sdk.zzbq zze;
    private final com.google.android.gms.internal.consent_sdk.zzn zzf;
    private final com.google.android.gms.internal.consent_sdk.zzz zzg;
    private final com.google.android.gms.internal.consent_sdk.zze zzh;
    private final com.google.android.gms.internal.consent_sdk.zzcr zzi;

    zzw(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzad zzadVar, android.os.Handler handler, java.util.concurrent.Executor executor, com.google.android.gms.internal.consent_sdk.zzaq zzaqVar, com.google.android.gms.internal.consent_sdk.zzbq zzbqVar, com.google.android.gms.internal.consent_sdk.zzn zznVar, com.google.android.gms.internal.consent_sdk.zzz zzzVar, com.google.android.gms.internal.consent_sdk.zze zzeVar, com.google.android.gms.internal.consent_sdk.zzcr zzcrVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zznVar;
        this.zzg = zzzVar;
        this.zzh = zzeVar;
        this.zzi = zzcrVar;
    }

    public static /* synthetic */ void zza(final com.google.android.gms.internal.consent_sdk.zzw zzwVar, android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            com.google.android.ump.ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                android.util.Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + com.google.android.gms.internal.consent_sdk.zzct.zza(zzwVar.zza) + "\") to set this as a debug device.");
            }
            final com.google.android.gms.internal.consent_sdk.zzab zzb = zzwVar.zzg.zzb(zzwVar.zzd(zzwVar.zzf.zzc(activity, consentRequestParameters)));
            com.google.android.gms.internal.consent_sdk.zzaq zzaqVar = zzwVar.zzd;
            zzaqVar.zzg(zzb.zza);
            zzaqVar.zzi(zzb.zzb);
            zzwVar.zze.zzd(zzb.zzc);
            zzwVar.zzi.zzg(null);
            zzwVar.zzh.zza().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.consent_sdk.zzw.zzb(com.google.android.gms.internal.consent_sdk.zzw.this, onConsentInfoUpdateSuccessListener, zzb);
                }
            });
        } catch (com.google.android.gms.internal.consent_sdk.zzg e) {
            zzwVar.zzi.zzg("RequestConsentUpdate exception. Error: " + e.getMessage() + ", cause: " + java.lang.String.valueOf(e.getCause()));
            zzwVar.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(e.zza());
                }
            });
        } catch (java.lang.RuntimeException e2) {
            zzwVar.zzi.zzg("RequestConsentUpdate RuntimeException. ".concat(java.lang.String.valueOf(e2.getMessage())));
            final com.google.android.gms.internal.consent_sdk.zzg zzgVar = new com.google.android.gms.internal.consent_sdk.zzg(1, "Caught exception when trying to request consent info update: ".concat(java.lang.String.valueOf(android.util.Log.getStackTraceString(e2))));
            zzwVar.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public static /* synthetic */ void zzb(com.google.android.gms.internal.consent_sdk.zzw zzwVar, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, com.google.android.gms.internal.consent_sdk.zzab zzabVar) {
        java.util.Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        zzwVar.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener.this.onConsentInfoUpdateSuccess();
            }
        });
        if (zzabVar.zzb != com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzwVar.zze.zzc();
        }
    }

    private final com.google.android.gms.internal.consent_sdk.zzcn zzd(com.google.android.gms.internal.consent_sdk.zzcl zzclVar) throws com.google.android.gms.internal.consent_sdk.zzg {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, android.webkit.WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", com.ironsource.B5.M);
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                android.util.JsonWriter jsonWriter = new android.util.JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    java.lang.String str = zzclVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    java.lang.String str2 = zzclVar.zzb;
                    if (str2 != null) {
                        jsonWriter.name("consent_syncing_id");
                        jsonWriter.value(str2);
                    }
                    com.google.android.gms.internal.consent_sdk.zzch zzchVar = zzclVar.zzc;
                    if (zzchVar != null) {
                        jsonWriter.name(com.facebook.devicerequests.internal.DeviceRequestsHelper.DEVICE_INFO_PARAM);
                        jsonWriter.beginObject();
                        int i = zzchVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value(com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
                            }
                        }
                        java.lang.String str3 = zzchVar.zza;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        java.lang.Integer num = zzchVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    java.lang.String str4 = zzclVar.zzd;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    java.lang.Boolean bool = zzclVar.zze;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    java.util.Map map = zzclVar.zzf;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((java.lang.String) entry.getKey());
                            jsonWriter.value((java.lang.String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    com.google.android.gms.internal.consent_sdk.zzcj zzcjVar = zzclVar.zzg;
                    if (zzcjVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        java.lang.Integer num2 = zzcjVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        java.lang.Integer num3 = zzcjVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        java.lang.Double d = zzcjVar.zzc;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        java.util.List<com.google.android.gms.internal.consent_sdk.zzci> list = zzcjVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (com.google.android.gms.internal.consent_sdk.zzci zzciVar : list) {
                                jsonWriter.beginObject();
                                java.lang.Integer num4 = zzciVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                java.lang.Integer num5 = zzciVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                java.lang.Integer num6 = zzciVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                java.lang.Integer num7 = zzciVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM);
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    com.google.android.gms.internal.consent_sdk.zzcf zzcfVar = zzclVar.zzh;
                    if (zzcfVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        java.lang.String str5 = zzcfVar.zza;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        java.lang.String str6 = zzcfVar.zzb;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        java.lang.String str7 = zzcfVar.zzc;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    com.google.android.gms.internal.consent_sdk.zzck zzckVar = zzclVar.zzi;
                    if (zzckVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        java.lang.String str8 = zzckVar.zza;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    java.util.List list2 = zzclVar.zzj;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        java.util.Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch ((com.google.android.gms.internal.consent_sdk.zzcg) it.next()) {
                                case DEBUG_PARAM_UNKNOWN:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case ALWAYS_SHOW:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case GEO_OVERRIDE_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case GEO_OVERRIDE_REGULATED_US_STATE:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case GEO_OVERRIDE_OTHER:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case GEO_OVERRIDE_NON_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case PREVIEWING_DEBUG_MESSAGES:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case GEO_OVERRIDE_USFL:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new java.io.IOException("Http error code - " + responseCode + ".\n" + new java.util.Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    java.lang.String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        com.google.android.gms.internal.consent_sdk.zzcn zza = com.google.android.gms.internal.consent_sdk.zzcn.zza(new android.util.JsonReader(new java.io.StringReader(headerField)));
                        zza.zza = new java.util.Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza;
                    }
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        android.util.JsonReader jsonReader = new android.util.JsonReader(bufferedReader);
                        try {
                            com.google.android.gms.internal.consent_sdk.zzcn zza2 = com.google.android.gms.internal.consent_sdk.zzcn.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zza2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.net.SocketTimeoutException e) {
            throw new com.google.android.gms.internal.consent_sdk.zzg(4, "The server timed out.", e);
        } catch (java.io.IOException e2) {
            throw new com.google.android.gms.internal.consent_sdk.zzg(2, "Error making request.", e2);
        }
    }

    final void zzc(final android.app.Activity activity, final com.google.android.ump.ConsentRequestParameters consentRequestParameters, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.consent_sdk.zzw.zza(com.google.android.gms.internal.consent_sdk.zzw.this, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
            }
        });
    }
}
