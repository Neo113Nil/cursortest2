package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzf {
    public static final android.os.Handler zza = new com.google.android.gms.internal.ads.zzgam(android.os.Looper.getMainLooper());
    private static final java.lang.String zzb = com.google.android.gms.ads.AdView.class.getName();
    private static final java.lang.String zzc = com.google.android.gms.ads.interstitial.InterstitialAd.class.getName();
    private static final java.lang.String zzd = com.google.android.gms.ads.admanager.AdManagerAdView.class.getName();
    private static final java.lang.String zze = com.google.android.gms.ads.admanager.AdManagerInterstitialAd.class.getName();
    private static final java.lang.String zzf = com.google.android.gms.ads.AdLoader.class.getName();
    private float zzg = -1.0f;

    public static final boolean zzA(android.content.Context context) {
        int isGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzB() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static final int zzC(android.util.DisplayMetrics displayMetrics, int i) {
        return java.lang.Math.round(i / displayMetrics.density);
    }

    public static final void zzD(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, com.google.android.gms.ads.internal.util.client.zze zzeVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(com.ironsource.M6.F, android.os.Build.VERSION.RELEASE);
        bundle.putString("api", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        bundle.putString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID, applicationContext.getPackageName());
        if (str == null) {
            int apkVersion = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(apkVersion).length() + 10);
            sb.append(apkVersion);
            sb.append(".261210000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        android.net.Uri.Builder appendQueryParameter = new android.net.Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (java.lang.String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(appendQueryParameter.toString());
    }

    public static final int zzE(android.content.Context context, int i) {
        return zzw(context.getResources().getDisplayMetrics(), i);
    }

    public static final java.lang.String zzF(android.content.Context context) {
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String string = contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzy()) {
            string = "emulator";
        }
        return zzG(string, "MD5");
    }

    private static java.lang.String zzG(java.lang.String str, java.lang.String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, messageDigest.digest()));
            } catch (java.lang.ArithmeticException unused) {
                return null;
            } catch (java.security.NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final org.json.JSONArray zzH(java.util.Collection collection) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzI(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzI(org.json.JSONArray jSONArray, java.lang.Object obj) throws org.json.JSONException {
        if (obj instanceof android.os.Bundle) {
            jSONArray.put(zzo((android.os.Bundle) obj));
            return;
        }
        if (obj instanceof java.util.Map) {
            jSONArray.put(zzm((java.util.Map) obj));
            return;
        }
        if (obj instanceof java.util.Collection) {
            jSONArray.put(zzH((java.util.Collection) obj));
        } else if (obj instanceof java.lang.Object[]) {
            jSONArray.put(zzp((java.lang.Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzJ(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) throws org.json.JSONException {
        java.lang.Boolean[] boolArr;
        java.lang.Long[] lArr;
        java.lang.Double[] dArr;
        java.lang.Integer[] numArr;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzs)).booleanValue()) {
            str = java.lang.String.valueOf(str);
        }
        if (obj instanceof android.os.Bundle) {
            jSONObject.put(str, zzo((android.os.Bundle) obj));
            return;
        }
        if (obj instanceof java.util.Map) {
            jSONObject.put(str, zzm((java.util.Map) obj));
            return;
        }
        if (obj instanceof java.util.Collection) {
            jSONObject.put(java.lang.String.valueOf(str), zzH((java.util.Collection) obj));
            return;
        }
        if (obj instanceof java.lang.Object[]) {
            jSONObject.put(str, zzH(java.util.Arrays.asList((java.lang.Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new java.lang.Integer[0];
            } else {
                int length = iArr.length;
                java.lang.Integer[] numArr2 = new java.lang.Integer[length];
                while (i < length) {
                    numArr2[i] = java.lang.Integer.valueOf(iArr[i]);
                    i++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, zzp(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new java.lang.Double[0];
            } else {
                int length2 = dArr2.length;
                java.lang.Double[] dArr3 = new java.lang.Double[length2];
                while (i < length2) {
                    dArr3[i] = java.lang.Double.valueOf(dArr2[i]);
                    i++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, zzp(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new java.lang.Long[0];
            } else {
                int length3 = jArr.length;
                java.lang.Long[] lArr2 = new java.lang.Long[length3];
                while (i < length3) {
                    lArr2[i] = java.lang.Long.valueOf(jArr[i]);
                    i++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, zzp(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new java.lang.Boolean[0];
        } else {
            int length4 = zArr.length;
            java.lang.Boolean[] boolArr2 = new java.lang.Boolean[length4];
            while (i < length4) {
                boolArr2[i] = java.lang.Boolean.valueOf(zArr[i]);
                i++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, zzp(boolArr));
    }

    private static final void zzK(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        android.content.Context context = viewGroup.getContext();
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int zzE = zzE(context, 3);
        int i3 = zzrVar.zzf;
        int i4 = zzrVar.zzc;
        frameLayout.addView(textView, new android.widget.FrameLayout.LayoutParams(i3 - zzE, i4 - zzE, 17));
        viewGroup.addView(frameLayout, i3, i4);
    }

    public static java.lang.Object zzd(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    public static android.app.ActivityManager.MemoryInfo zze(android.content.Context context) {
        android.app.ActivityManager activityManager;
        if (context == null || (activityManager = (android.app.ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
        } catch (java.lang.NullPointerException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error retrieving the memory information.");
        }
        return memoryInfo;
    }

    public static java.lang.String zzf(android.content.Context context) {
        if (context == null) {
            return null;
        }
        try {
            android.os.Bundle bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                return bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static java.lang.String zzg(java.lang.String str) {
        return zzG(str, "MD5");
    }

    public static java.lang.String zzh(java.lang.String str) {
        return zzG(str, "SHA-256");
    }

    public static java.lang.String zzj() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        byte[] byteArray = java.math.BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = java.math.BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        java.lang.String bigInteger = new java.math.BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                java.lang.System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new java.math.BigInteger(1, bArr).toString();
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static com.google.android.gms.ads.AdSize zzk(android.content.Context context, int i, int i2, int i3) {
        int zzr = zzr(context, i3);
        if (zzr == -1) {
            return com.google.android.gms.ads.AdSize.INVALID;
        }
        return new com.google.android.gms.ads.AdSize(i, java.lang.Math.max(java.lang.Math.min(i > 655 ? java.lang.Math.round((i / 728.0f) * 90.0f) : i > 632 ? 81 : i > 526 ? java.lang.Math.round((i / 468.0f) * 60.0f) : i > 432 ? 68 : java.lang.Math.round((i / 320.0f) * 50.0f), java.lang.Math.min(90, java.lang.Math.round(zzr * 0.15f))), 50));
    }

    public static com.google.android.gms.ads.AdSize zzl(android.content.Context context, int i, int i2) {
        int zzr = zzr(context, i2);
        if (zzr == -1) {
            return com.google.android.gms.ads.AdSize.INVALID;
        }
        return new com.google.android.gms.ads.AdSize(i, java.lang.Math.max(java.lang.Math.min(java.lang.Math.max(100, java.lang.Math.round((i / 320.0f) * 100.0f)), java.lang.Math.min(androidx.compose.material.TextFieldImplKt.AnimationDuration, java.lang.Math.round(zzr * 0.2f))), 50));
    }

    public static boolean zzq(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((java.lang.String) com.google.android.gms.internal.ads.zzbkz.zzd.zze());
    }

    public static int zzr(android.content.Context context, int i) {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        android.content.res.Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return i == i2 ? java.lang.Math.round(displayMetrics.heightPixels / displayMetrics.density) : java.lang.Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static com.google.android.gms.ads.preload.PreloadConfiguration zzs(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        com.google.android.gms.ads.preload.PreloadConfiguration zzt = zzt(zzfpVar);
        if (zzt == null) {
            return null;
        }
        com.google.android.gms.ads.preload.PreloadConfiguration.Builder builder = new com.google.android.gms.ads.preload.PreloadConfiguration.Builder(zzt.getAdUnitId());
        builder.setAdRequest(zzt.getAdRequest());
        builder.setBufferSize(zzt.getBufferSize());
        return builder.build();
    }

    public static com.google.android.gms.ads.preload.PreloadConfiguration zzt(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        java.lang.String str = zzfpVar.zza;
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfpVar.zzc;
        com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
        java.util.List list = zzmVar.zze;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((java.lang.String) it.next());
            }
        }
        builder.zza(zzmVar.zzm);
        android.os.Bundle bundle = zzmVar.zzn;
        for (java.lang.String str2 : bundle.keySet()) {
            builder.addCustomTargeting(str2, bundle.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        java.lang.String str3 = zzmVar.zzl;
        if (str3 != null) {
            builder.setContentUrl(str3);
        }
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        com.google.android.gms.ads.AdRequest build = builder.build();
        com.google.android.gms.ads.preload.PreloadConfiguration.Builder builder2 = new com.google.android.gms.ads.preload.PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(build);
        builder2.setBufferSize(zzfpVar.zzd);
        return builder2.build();
    }

    public static com.google.android.gms.ads.internal.client.zzfp zzu(android.content.Context context, com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration, com.google.android.gms.ads.AdFormat adFormat) {
        com.google.android.gms.ads.preload.PreloadConfiguration.Builder builder = new com.google.android.gms.ads.preload.PreloadConfiguration.Builder(preloadConfiguration.getAdUnitId(), adFormat);
        builder.setAdRequest(preloadConfiguration.getAdRequest());
        builder.setBufferSize(preloadConfiguration.getBufferSize());
        return zzv(context, builder.build(), 2);
    }

    public static com.google.android.gms.ads.internal.client.zzfp zzv(android.content.Context context, com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration, int i) {
        boolean z;
        int intValue;
        com.google.android.gms.ads.internal.client.zzm zza2 = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, preloadConfiguration.getAdRequest().zza());
        int i2 = 1;
        if (i == 1) {
            zza2.zzc.putBoolean("is_sdk_preload", true);
        } else {
            zza2.zzc.putBoolean("zenith_v2", true);
        }
        int bufferSize = preloadConfiguration.getBufferSize();
        if (bufferSize <= 0) {
            com.google.android.gms.ads.AdFormat adFormat = preloadConfiguration.getAdFormat();
            com.google.android.gms.ads.AdFormat adFormat2 = com.google.android.gms.ads.AdFormat.BANNER;
            int ordinal = adFormat.ordinal();
            if (ordinal == 1) {
                bufferSize = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzag)).intValue();
            } else if (ordinal == 2) {
                bufferSize = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzah)).intValue();
            } else if (ordinal != 5) {
                bufferSize = 1;
            } else {
                bufferSize = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaf)).intValue();
            }
            z = true;
        } else {
            z = false;
        }
        com.google.android.gms.ads.AdFormat adFormat3 = preloadConfiguration.getAdFormat();
        com.google.android.gms.ads.AdFormat adFormat4 = com.google.android.gms.ads.AdFormat.BANNER;
        int ordinal2 = adFormat3.ordinal();
        if (ordinal2 == 1) {
            intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzad)).intValue();
        } else if (ordinal2 == 2) {
            intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzae)).intValue();
        } else if (ordinal2 != 5) {
            intValue = 1;
        } else {
            intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzac)).intValue();
        }
        int max = java.lang.Math.max(java.lang.Math.min(intValue, 15), 1);
        int ordinal3 = preloadConfiguration.getAdFormat().ordinal();
        if (ordinal3 == 1) {
            i2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaj)).intValue();
        } else if (ordinal3 == 2) {
            i2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzak)).intValue();
        } else if (ordinal3 == 5) {
            i2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzai)).intValue();
        }
        return new com.google.android.gms.ads.internal.client.zzfp(preloadConfiguration.getAdUnitId(), preloadConfiguration.getAdFormat().getValue(), zza2, java.lang.Math.max(java.lang.Math.min(bufferSize, max), java.lang.Math.min(i2, max)), z);
    }

    public static final int zzw(android.util.DisplayMetrics displayMetrics, int i) {
        return (int) android.util.TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static final java.lang.String zzx(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        int i;
        int i2;
        java.lang.String str2;
        while (true) {
            i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i];
            java.lang.String className = stackTraceElement.getClassName();
            i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className) || zzc.equalsIgnoreCase(className) || zzd.equalsIgnoreCase(className) || zze.equalsIgnoreCase(className) || zzf.equalsIgnoreCase(className))) ? 0 : i2;
        }
        str2 = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzy() {
        boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmP)).booleanValue();
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return android.os.Build.DEVICE.startsWith("generic");
        }
        if (android.os.Build.FINGERPRINT.contains("generic") || android.os.Build.FINGERPRINT.contains("emulator")) {
            return true;
        }
        return booleanValue && android.os.Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzz(android.content.Context context, int i) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    public final int zza(android.content.Context context, int i) {
        if (this.zzg < 0.0f) {
            synchronized (this) {
                if (this.zzg < 0.0f) {
                    android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzg = displayMetrics.density;
                }
            }
        }
        return java.lang.Math.round(i / this.zzg);
    }

    public final void zzb(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi(str2);
        }
        zzK(viewGroup, zzrVar, str, androidx.core.internal.view.SupportMenu.CATEGORY_MASK, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    public final void zzc(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str) {
        zzK(viewGroup, zzrVar, "Ads by Google", androidx.core.view.ViewCompat.MEASURED_STATE_MASK, -1);
    }

    public final void zzi(final android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z) {
        zzD(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.client.zzd
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str3) {
                new com.google.android.gms.ads.internal.util.client.zzc(com.google.android.gms.ads.internal.util.client.zzf.this, context, str3).start();
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final org.json.JSONObject zzm(java.util.Map map) throws org.json.JSONException {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : map.keySet()) {
                zzJ(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (java.lang.ClassCastException e) {
            java.lang.String message = e.getMessage();
            java.lang.String.valueOf(message);
            throw new org.json.JSONException("Could not convert map to JSON: ".concat(java.lang.String.valueOf(message)));
        }
    }

    public final org.json.JSONObject zzn(android.os.Bundle bundle, org.json.JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzo(bundle);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error converting Bundle to JSON", e);
            return null;
        }
    }

    public final org.json.JSONObject zzo(android.os.Bundle bundle) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : bundle.keySet()) {
            zzJ(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    final org.json.JSONArray zzp(java.lang.Object[] objArr) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.Object obj : objArr) {
            zzI(jSONArray, obj);
        }
        return jSONArray;
    }
}
