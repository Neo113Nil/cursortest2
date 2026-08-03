package org.cocos2dx.bole;

/* loaded from: classes6.dex */
public class BoleJavaUtil {
    static java.lang.String adid = "";
    public static float batteryPct = 0.0f;
    static java.lang.String diskLog = "";
    static java.lang.String tag = "bole";
    static java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static java.util.HashMap<java.lang.String, java.lang.Object> config = null;

    static /* synthetic */ void lambda$showGoogleStoreReView$0(com.google.android.gms.tasks.Task task) {
    }

    public static void removeGoogleRegistrationId() {
    }

    public static long getAppFilesDirectorySize(android.content.Context context) {
        return getDirectorySize(context.getFilesDir());
    }

    private static long getDirectorySize(java.io.File file) {
        java.io.File[] listFiles;
        long directorySize;
        long j = 0;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                if (file2.isFile()) {
                    directorySize = file2.length();
                } else if (file2.isDirectory()) {
                    directorySize = getDirectorySize(file2);
                }
                j += directorySize;
            }
        }
        return j;
    }

    public static void executeTask(java.lang.Runnable runnable) {
        executor.execute(runnable);
    }

    public static void getADID(final android.content.Context context) {
        executeTask(new java.lang.Runnable() { // from class: org.cocos2dx.bole.BoleJavaUtil.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.cocos2dx.bole.BoleJavaUtil.adid = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static java.lang.String getMacID() {
        return "";
    }

    public static java.lang.String getReferrer() {
        java.lang.String string;
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity != null && (string = activity.getSharedPreferences(org.cocos2dx.bole.ReferrerReceiver.preferences, 0).getString(org.cocos2dx.bole.ReferrerReceiver.sharedKey, null)) != null) {
            return string;
        }
        android.util.Log.w(tag, "Failed to get referrer");
        return "";
    }

    public static void keepScreenOn(boolean z) {
        org.cocos2dx.lib.Cocos2dxHelper.setKeepScreenOn(z);
        android.util.Log.d(tag, com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_KEEP_SCREEN_ON);
    }

    public static boolean checkPermission(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static java.lang.String getIMEI() {
        return "";
    }

    public static java.lang.String addNotification(java.lang.String str, java.lang.String str2, int i) {
        return "";
    }

    public static int getResId(java.lang.String str, java.lang.String str2) {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        return activity.getResources().getIdentifier(str, str2, activity.getPackageName());
    }

    public static void addShortCut() {
        executeTask(new java.lang.Runnable() { // from class: org.cocos2dx.bole.BoleJavaUtil.2
            @Override // java.lang.Runnable
            public void run() {
                android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
                android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(activity);
                boolean z = defaultSharedPreferences.getBoolean("isAppInstalled", false);
                java.lang.Boolean.valueOf(z).getClass();
                if (z) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                intent.putExtra("duplicate", false);
                intent.putExtra("android.intent.extra.shortcut.NAME", activity.getString(org.cocos2dx.bole.BoleJavaUtil.getResId(com.facebook.internal.NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, "string")));
                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(activity.getApplicationContext(), org.cocos2dx.bole.BoleJavaUtil.getResId("icon", "drawable")));
                intent.putExtra("android.intent.extra.shortcut.INTENT", new android.content.Intent(activity.getApplicationContext(), activity.getClass()));
                activity.sendBroadcast(intent);
                android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putBoolean("isAppInstalled", true);
                edit.commit();
            }
        });
    }

    public static java.lang.String setBootNotification(java.lang.String str, java.lang.String str2, int i) {
        return "";
    }

    public static java.lang.String clearAllNotifications() {
        return "";
    }

    public static java.lang.String getCountry() {
        return org.cocos2dx.lib.Cocos2dxHelper.getActivity().getResources().getConfiguration().locale.getCountry();
    }

    public static java.lang.String getPhoneNumber() {
        try {
            return ((android.telephony.TelephonyManager) org.cocos2dx.lib.Cocos2dxHelper.getActivity().getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE)).getLine1Number();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String getDeviceInfo(int i) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.content.pm.PackageManager packageManager = org.cocos2dx.lib.Cocos2dxHelper.getActivity().getPackageManager();
        android.content.pm.PackageInfo packageInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(org.cocos2dx.lib.Cocos2dxHelper.getActivity().getApplicationInfo().packageName, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e = e;
            applicationInfo = null;
        }
        try {
            packageInfo = packageManager.getPackageInfo(org.cocos2dx.lib.Cocos2dxHelper.getActivity().getApplicationInfo().packageName, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            e = e2;
            android.util.Log.w(tag, e.toString());
            if (i != 0) {
            }
        }
        if (i != 0) {
            return android.os.Build.MODEL;
        }
        if (i == 1) {
            return packageInfo.packageName;
        }
        if (i == 2) {
            return (java.lang.String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
        }
        if (i == 3) {
            return packageInfo.versionName;
        }
        if (i == 4) {
            return android.os.Build.VERSION.RELEASE;
        }
        if (i != 5) {
            return "";
        }
        return java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
    }

    public static int getDeviceOrientation() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null || activity.getResources().getConfiguration().orientation != 2) {
            return 0;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0 || rotation == 1) {
            return 2;
        }
        return (rotation == 2 || rotation == 3) ? 1 : 0;
    }

    public static java.lang.String getDeviceId() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity != null) {
            return android.provider.Settings.Secure.getString(activity.getContentResolver(), "android_id");
        }
        android.util.Log.w(tag, "Failed to get deviceId");
        return "";
    }

    public static java.lang.String getTotalMemorySize() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null) {
            android.util.Log.w(tag, "Failed to get getTotalMemorySize");
            return "";
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) activity.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return android.text.format.Formatter.formatFileSize(activity, memoryInfo.totalMem);
    }

    public static java.lang.String getSystemAvaialbeMemorySize() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null) {
            android.util.Log.w(tag, "Failed to get getSystemAvaialbeMemorySize");
            return "";
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) activity.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return android.text.format.Formatter.formatFileSize(activity, memoryInfo.availMem);
    }

    public static float getAvaialbeMemSize() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null) {
            android.util.Log.w(tag, "Failed to get getSystemAvaialbeMemorySize");
            return -1.0f;
        }
        ((android.app.ActivityManager) activity.getSystemService("activity")).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        return r1.availMem / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r3 = java.lang.Long.parseLong(r3[1].trim().split(io.ktor.sse.ServerSentEventKt.SPACE)[0]) / 1024;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float getFreeMemSize() {
        long j;
        java.io.BufferedReader bufferedReader;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO)), 1000);
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    j = 0;
                    break;
                }
                java.lang.String[] split = readLine.split(":");
                if (split[0].equals("MemFree")) {
                    break;
                }
            }
        } catch (java.lang.Exception e) {
            e = e;
            j = 0;
        }
        try {
            bufferedReader.close();
        } catch (java.lang.Exception e2) {
            e = e2;
            e.printStackTrace();
            if (j > 0) {
            }
        }
        return j > 0 ? getAvaialbeMemSize() : j;
    }

    public static boolean isLowMemory() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null) {
            android.util.Log.w(tag, "Failed to get isLowMemory");
            return false;
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) activity.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static float getTotalMemSize() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null) {
            android.util.Log.w(tag, "Failed to get getTotalMemSize");
            return -1.0f;
        }
        ((android.app.ActivityManager) activity.getSystemService("activity")).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        return r1.totalMem / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public static java.lang.String getAdvertisingId() {
        return adid;
    }

    public static java.lang.String getCurrentTimeZone() {
        return java.util.TimeZone.getDefault().getDisplayName(false, 0);
    }

    public static java.lang.String getAppKey(java.lang.String str) {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null) {
            return "";
        }
        return android.preference.PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).getString(str, "");
    }

    public static void setAppKey(java.lang.String str, java.lang.String str2) {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity != null) {
            android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).edit();
            edit.putString(str, str2);
            edit.commit();
        }
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> getConfig(android.content.Context context) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = config;
        if (hashMap != null) {
            return hashMap;
        }
        config = new java.util.HashMap<>();
        try {
            org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getApplicationContext().getResources().getAssets().open("src/config.plist")));
            java.lang.String str = "";
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = str + readLine.replaceAll("[\n\r]", "").trim();
            }
            org.xmlpull.v1.XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new java.io.StringReader(str));
            try {
                newPullParser.next();
                java.lang.String str2 = null;
                java.lang.String str3 = null;
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                    if (eventType == 2) {
                        java.lang.String name = newPullParser.getName();
                        if ("array".equalsIgnoreCase(name)) {
                            config.put(str3, new java.util.ArrayList());
                        }
                        str2 = name;
                    } else if (eventType == 4) {
                        if (com.ironsource.X3.i.W.equalsIgnoreCase(str2)) {
                            java.lang.String trim = newPullParser.getText().trim();
                            if (trim != null && !trim.isEmpty() && trim.length() > 0) {
                                str3 = trim;
                            }
                        } else if ("string".equalsIgnoreCase(str2)) {
                            java.lang.String trim2 = newPullParser.getText().trim();
                            if (config.containsKey(str3) && (config.get(str3) instanceof java.util.ArrayList)) {
                                ((java.util.ArrayList) config.get(str3)).add(trim2);
                            } else {
                                config.put(str3, trim2);
                            }
                        } else if ("integer".equalsIgnoreCase(str2)) {
                            java.lang.Integer num = new java.lang.Integer(newPullParser.getText().trim());
                            if (config.containsKey(str3) && (config.get(str3) instanceof java.util.ArrayList)) {
                                ((java.util.ArrayList) config.get(str3)).add(num);
                            } else {
                                config.put(str3, num);
                            }
                        }
                    }
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            } catch (org.xmlpull.v1.XmlPullParserException e2) {
                e2.printStackTrace();
            }
            bufferedReader.close();
        } catch (java.lang.Exception e3) {
            android.util.Log.i(tag, "failed to parse:" + e3.toString());
        }
        return config;
    }

    public static void firebaseLogEvent(final java.lang.String str, java.lang.String str2) {
        try {
            final android.os.Bundle bundle = new android.os.Bundle();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                double optDouble = jSONObject.optDouble(next);
                java.lang.Double valueOf = java.lang.Double.valueOf(optDouble);
                valueOf.getClass();
                if (!java.lang.Double.isNaN(optDouble)) {
                    valueOf.getClass();
                    bundle.putDouble(next, optDouble);
                } else {
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
            final android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
            if (activity != null) {
                org.cocos2dx.lib.Cocos2dxHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.BoleJavaUtil.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.google.firebase.analytics.FirebaseAnalytics.getInstance(activity.getApplicationContext()).logEvent(str, bundle);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void addFirebaseCrashCustomKey(java.lang.String str, java.lang.String str2) {
        if (org.cocos2dx.lib.Cocos2dxHelper.getActivity() == null) {
            return;
        }
        try {
            com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance();
            if (str.equals("user_id")) {
                firebaseCrashlytics.setUserId(str2);
            } else {
                firebaseCrashlytics.setCustomKey(str, str2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void addFirebaseCrashLog(java.lang.String str) {
        try {
            com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance().log(str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isPC() {
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        if (activity == null) {
            return false;
        }
        try {
            return activity.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setFBAutoEventEnable(boolean z) {
        com.facebook.FacebookSdk.setAutoLogAppEventsEnabled(z);
    }

    public static void checkPushOpen() {
        ((org.cocos2dx.lua.AppActivity) org.cocos2dx.lib.Cocos2dxHelper.getActivity()).checkPush();
    }

    public static void vibrator(int i, int i2) {
        android.util.Log.d("vibrator", "vibrator: " + i + io.ktor.sse.ServerSentEventKt.SPACE + i2);
        android.os.Vibrator vibrator = (android.os.Vibrator) ((org.cocos2dx.lua.AppActivity) org.cocos2dx.lib.Cocos2dxHelper.getActivity()).getSystemService("vibrator");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(i, i2));
        } else {
            vibrator.vibrate(i);
        }
    }

    public static void openSetting() {
        try {
            org.cocos2dx.lua.AppActivity appActivity = (org.cocos2dx.lua.AppActivity) org.cocos2dx.lib.Cocos2dxHelper.getActivity();
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.fromParts("package", appActivity.getPackageName(), null));
            appActivity.startActivity(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void openPushSetting() {
        org.cocos2dx.lua.AppActivity appActivity = (org.cocos2dx.lua.AppActivity) org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", appActivity.getPackageName());
            intent.putExtra("app_uid", appActivity.getApplicationInfo().uid);
            intent.addFlags(268435456);
            intent.putExtra("android.provider.extra.APP_PACKAGE", appActivity.getPackageName());
            appActivity.startActivity(intent);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            openSetting();
        }
    }

    public static void requeset() {
    }

    public static void showNotificationAuthorization(int i) {
        org.cocos2dx.lua.AppActivity appActivity = (org.cocos2dx.lua.AppActivity) org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(appActivity.getApplicationContext());
        java.lang.String string = defaultSharedPreferences.getString("notification_authorization", "0");
        android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            if (androidx.core.content.ContextCompat.checkSelfPermission(appActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
                edit.putString("notification_authorization", "1");
                edit.commit();
                return;
            } else if (appActivity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                edit.putString("notification_authorization", com.ironsource.C2945a2.f);
                edit.commit();
                appActivity.requestPermission("android.permission.POST_NOTIFICATIONS");
                return;
            } else if (string != com.ironsource.C2945a2.f) {
                appActivity.requestPermission("android.permission.POST_NOTIFICATIONS");
                return;
            } else {
                openPushSetting();
                return;
            }
        }
        openPushSetting();
    }

    public static void restartApp() {
        org.cocos2dx.lua.AppActivity appActivity = (org.cocos2dx.lua.AppActivity) org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        ((android.app.AlarmManager) appActivity.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM)).set(1, java.lang.System.currentTimeMillis() + 1000, android.app.PendingIntent.getActivity(appActivity, 0, appActivity.getPackageManager().getLaunchIntentForPackage(appActivity.getPackageName()), 1140850688));
        java.lang.System.exit(0);
    }

    public static void showGoogleStoreReView() {
        android.util.Log.v(tag, "showGoogleStoreReView");
        final android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        final com.google.android.play.core.review.ReviewManager create = com.google.android.play.core.review.ReviewManagerFactory.create(activity.getApplicationContext());
        create.requestReviewFlow().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: org.cocos2dx.bole.BoleJavaUtil$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                org.cocos2dx.bole.BoleJavaUtil.lambda$showGoogleStoreReView$1(com.google.android.play.core.review.ReviewManager.this, activity, task);
            }
        });
    }

    static /* synthetic */ void lambda$showGoogleStoreReView$1(com.google.android.play.core.review.ReviewManager reviewManager, android.app.Activity activity, com.google.android.gms.tasks.Task task) {
        if (task.isSuccessful()) {
            com.google.android.play.core.review.ReviewInfo reviewInfo = (com.google.android.play.core.review.ReviewInfo) task.getResult();
            reviewManager.launchReviewFlow(activity, reviewInfo).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: org.cocos2dx.bole.BoleJavaUtil$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task2) {
                    org.cocos2dx.bole.BoleJavaUtil.lambda$showGoogleStoreReView$0(task2);
                }
            });
            android.util.Log.v(tag, "showGoogleStoreReView suc:" + reviewInfo);
        }
    }

    public static float getBatteryPercent() {
        return batteryPct;
    }

    public static boolean didCrashOnPreviousExecution() {
        return com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution();
    }

    public static void callsdkmethod(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.cocos2dx.bole.sdk.SDKHelper.callsdkmethod(str, str2, str3);
    }

    public static float getTotalStorageSize() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return (((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1024) / 1024) / 1024;
    }

    public static float getAvailableStorageSize() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return (((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024.0f) / 1024.0f) / 1024.0f;
    }

    public static float getAppStorageSize() {
        java.util.UUID uuid;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return 0.0f;
        }
        android.app.Activity activity = org.cocos2dx.lib.Cocos2dxHelper.getActivity();
        android.content.Context context = org.cocos2dx.lua.AppActivity.getContext();
        android.app.usage.StorageStatsManager storageStatsManager = (android.app.usage.StorageStatsManager) context.getSystemService("storagestats");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) context.getSystemService(com.ironsource.X3.a.k)).getStorageVolumes();
        java.lang.String packageName = activity.getPackageName();
        java.util.Iterator<android.os.storage.StorageVolume> it = storageVolumes.iterator();
        long j = 0;
        while (it.hasNext()) {
            java.lang.String uuid2 = it.next().getUuid();
            try {
                if (android.text.TextUtils.isEmpty(uuid2)) {
                    uuid = android.os.storage.StorageManager.UUID_DEFAULT;
                } else {
                    uuid = java.util.UUID.fromString(uuid2);
                }
            } catch (java.lang.Exception unused) {
                uuid = android.os.storage.StorageManager.UUID_DEFAULT;
            }
            try {
                android.app.usage.StorageStats queryStatsForPackage = storageStatsManager.queryStatsForPackage(uuid, packageName, android.os.Process.myUserHandle());
                j += queryStatsForPackage.getAppBytes() + queryStatsForPackage.getDataBytes() + queryStatsForPackage.getCacheBytes();
            } catch (android.content.pm.PackageManager.NameNotFoundException | java.io.IOException e) {
                e.printStackTrace();
                return 0.0f;
            }
        }
        android.util.Log.w(tag, "getAppStorageSize " + j);
        return ((j / 1024.0f) / 1024.0f) / 1024.0f;
    }

    public static int getAppOpenWay() {
        android.util.Log.w(tag, "openWay: " + org.cocos2dx.lib.Cocos2dxActivity.openWay);
        return org.cocos2dx.lib.Cocos2dxActivity.openWay;
    }
}
