package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzcd implements com.google.android.gms.internal.consent_sdk.zzd {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzbz zzb;
    private final android.os.Handler zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.consent_sdk.zze zze;
    private final com.google.android.gms.internal.consent_sdk.zzao zzf;
    private final com.google.android.gms.internal.consent_sdk.zzbe zzg;
    private final com.google.android.gms.internal.consent_sdk.zzaq zzh;

    zzcd(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzbz zzbzVar, android.os.Handler handler, java.util.concurrent.Executor executor, com.google.android.gms.internal.consent_sdk.zze zzeVar, com.google.android.gms.internal.consent_sdk.zzao zzaoVar, com.google.android.gms.internal.consent_sdk.zzbe zzbeVar, com.google.android.gms.internal.consent_sdk.zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzbzVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzaoVar;
        this.zzg = zzbeVar;
        this.zzh = zzaqVar;
    }

    public static /* synthetic */ void zzc(com.google.android.gms.internal.consent_sdk.zzcd zzcdVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.app.Application application = zzcdVar.zza;
        try {
            jSONObject.put(com.facebook.internal.NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            android.graphics.drawable.Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            java.lang.String str = null;
            if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                createBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = "data:image/png;base64,".concat(java.lang.String.valueOf(android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.google.android.gms.internal.consent_sdk.zzaq zzaqVar = zzcdVar.zzh;
            for (java.lang.String str2 : zzaqVar.zzc().keySet()) {
                jSONObject2.put(str2, zzaqVar.zzc().get(str2));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        zzcdVar.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void zzg(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("url");
        if (android.text.TextUtils.isEmpty(optString)) {
            android.util.Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        android.net.Uri parse = android.net.Uri.parse(optString);
        if (parse.getScheme() == null) {
            android.util.Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(java.lang.String.valueOf(optString)));
        }
        try {
            this.zzb.startActivity(new android.content.Intent("android.intent.action.VIEW", parse));
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(java.lang.String.valueOf(optString)), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final java.util.concurrent.Executor zza() {
        final android.os.Handler handler = this.zzc;
        java.util.Objects.requireNonNull(handler);
        return new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzcb
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        char c;
        char c2 = 65535;
        int i = 3;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.zzg.zzi();
            return true;
        }
        if (c != 1) {
            if (c == 2) {
                zzg(jSONObject);
                return true;
            }
            if (c != 3) {
                return false;
            }
            zzd();
            return true;
        }
        java.lang.String optString = jSONObject.optString("status");
        switch (optString.hashCode()) {
            case -954325659:
                if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    c2 = 3;
                    break;
                }
                break;
            case -258041904:
                if (optString.equals("personalized")) {
                    c2 = 0;
                    break;
                }
                break;
            case 429411856:
                if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    c2 = 4;
                    break;
                }
                break;
            case 467888915:
                if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1666911234:
                if (optString.equals("non_personalized")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1725474845:
                if (optString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4) {
            if (c2 != 5) {
                this.zzg.zzh(new com.google.android.gms.internal.consent_sdk.zzg(1, "We are getting something wrong with the webview."));
                return true;
            }
            i = 1;
        }
        this.zzg.zzg(i);
        return true;
    }

    public final void zzd() {
        this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcc
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.consent_sdk.zzcd.zzc(com.google.android.gms.internal.consent_sdk.zzcd.this);
            }
        });
    }

    final void zze(java.lang.String str) {
        android.util.Log.d("UserMessagingPlatform", "Receive consent action: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri parse = android.net.Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    final void zzf(int i, java.lang.String str, java.lang.String str2) {
        this.zzg.zzj(new com.google.android.gms.internal.consent_sdk.zzg(2, java.lang.String.format(java.util.Locale.US, "WebResourceError(%d, %s): %s", java.lang.Integer.valueOf(i), str2, str)));
    }
}
