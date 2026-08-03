package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxHelper {
    private static final java.lang.String PREFS_NAME = "Cocos2dxPrefsFile";
    private static final int RUNNABLES_PER_FRAME = 5;
    private static final java.lang.String TAG = "Cocos2dxHelper";
    private static boolean sAccelerometerEnabled;
    public static android.app.Activity sActivity;
    private static boolean sActivityVisible;
    private static android.content.res.AssetManager sAssetManager;
    private static org.cocos2dx.lib.Cocos2dxMusic sCocos2dMusic;
    private static org.cocos2dx.lib.Cocos2dxSound sCocos2dSound;
    private static org.cocos2dx.lib.Cocos2dxAccelerometer sCocos2dxAccelerometer;
    private static org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener sCocos2dxHelperListener;
    private static java.lang.String sFileDirectory;
    private static java.lang.String sPackageName;
    private static java.util.Set<android.preference.PreferenceManager.OnActivityResultListener> onActivityResultListeners = new java.util.LinkedHashSet();
    private static java.util.ArrayList<java.lang.String> arrayCbParams = new java.util.ArrayList<>();
    private static int lastRequestCode = 0;
    private static boolean sInited = false;

    public interface Cocos2dxHelperListener {
        void runOnGLThread(java.lang.Runnable runnable);

        void showDialog(java.lang.String str, java.lang.String str2);

        void showEditTextDialog(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4);
    }

    private static native void nativeSetApkPath(java.lang.String str);

    private static native void nativeSetAudioDeviceInfo(boolean z, int i, int i2);

    private static native void nativeSetContext(android.content.Context context, android.content.res.AssetManager assetManager);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetEditTextDialogResult(byte[] bArr);

    private static native void nativeSetValueForKey(java.lang.String str, java.lang.String str2);

    public static void sendSMS(java.lang.String str, java.lang.String str2, boolean z) {
    }

    public static void shareViaSystem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
    }

    private class RequestPermissionCode {
        public static final int REQ_CODE_SHARE_INTENT = 1;
        public static final int REQ_CODE_SHARE_MAIL = 4;
        public static final int REQ_CODE_SHARE_SCHEME = 2;
        public static final int REQ_CODE_SHARE_SMS = 3;

        private RequestPermissionCode() {
        }
    }

    public static void runOnGLThread(java.lang.Runnable runnable) {
        ((org.cocos2dx.lib.Cocos2dxActivity) sActivity).runOnGLThread(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void init(android.app.Activity activity) {
        int i;
        int i2;
        if (sInited) {
            return;
        }
        boolean hasSystemFeature = activity.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        android.util.Log.d(TAG, "isSupportLowLatency:" + hasSystemFeature);
        android.media.AudioManager audioManager = (android.media.AudioManager) activity.getSystemService("audio");
        java.lang.String str = (java.lang.String) org.cocos2dx.lib.Cocos2dxReflectionHelper.invokeInstanceMethod(audioManager, "getProperty", new java.lang.Class[]{java.lang.String.class}, new java.lang.Object[]{org.cocos2dx.lib.Cocos2dxReflectionHelper.getConstantValue(android.media.AudioManager.class, "PROPERTY_OUTPUT_SAMPLE_RATE")});
        java.lang.String str2 = (java.lang.String) org.cocos2dx.lib.Cocos2dxReflectionHelper.invokeInstanceMethod(audioManager, "getProperty", new java.lang.Class[]{java.lang.String.class}, new java.lang.Object[]{org.cocos2dx.lib.Cocos2dxReflectionHelper.getConstantValue(android.media.AudioManager.class, "PROPERTY_OUTPUT_FRAMES_PER_BUFFER")});
        try {
            i = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException e) {
            e = e;
            i = 44100;
        }
        try {
            i2 = java.lang.Integer.parseInt(str2);
        } catch (java.lang.NumberFormatException e2) {
            e = e2;
            android.util.Log.e(TAG, "parseInt failed", e);
            i2 = 192;
            android.util.Log.d(TAG, "sampleRate: " + i + ", framesPerBuffer: " + i2);
            nativeSetAudioDeviceInfo(hasSystemFeature, i, i2);
            android.content.pm.ApplicationInfo applicationInfo = activity.getApplicationInfo();
            sCocos2dxHelperListener = (org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener) activity;
            sPackageName = applicationInfo.packageName;
            sFileDirectory = activity.getFilesDir().getAbsolutePath();
            nativeSetApkPath(applicationInfo.sourceDir);
            sCocos2dxAccelerometer = new org.cocos2dx.lib.Cocos2dxAccelerometer(activity);
            sCocos2dMusic = new org.cocos2dx.lib.Cocos2dxMusic(activity);
            sCocos2dSound = new org.cocos2dx.lib.Cocos2dxSound(activity);
            android.content.res.AssetManager assets = activity.getAssets();
            sAssetManager = assets;
            nativeSetContext(activity, assets);
            org.cocos2dx.lib.Cocos2dxBitmap.setContext(activity);
            sActivity = activity;
            sInited = true;
        }
        android.util.Log.d(TAG, "sampleRate: " + i + ", framesPerBuffer: " + i2);
        nativeSetAudioDeviceInfo(hasSystemFeature, i, i2);
        android.content.pm.ApplicationInfo applicationInfo2 = activity.getApplicationInfo();
        sCocos2dxHelperListener = (org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener) activity;
        sPackageName = applicationInfo2.packageName;
        sFileDirectory = activity.getFilesDir().getAbsolutePath();
        nativeSetApkPath(applicationInfo2.sourceDir);
        sCocos2dxAccelerometer = new org.cocos2dx.lib.Cocos2dxAccelerometer(activity);
        sCocos2dMusic = new org.cocos2dx.lib.Cocos2dxMusic(activity);
        sCocos2dSound = new org.cocos2dx.lib.Cocos2dxSound(activity);
        android.content.res.AssetManager assets2 = activity.getAssets();
        sAssetManager = assets2;
        nativeSetContext(activity, assets2);
        org.cocos2dx.lib.Cocos2dxBitmap.setContext(activity);
        sActivity = activity;
        sInited = true;
    }

    public static android.app.Activity getActivity() {
        return sActivity;
    }

    public static void addOnActivityResultListener(android.preference.PreferenceManager.OnActivityResultListener onActivityResultListener) {
        onActivityResultListeners.add(onActivityResultListener);
    }

    public static java.util.Set<android.preference.PreferenceManager.OnActivityResultListener> getOnActivityResultListeners() {
        return onActivityResultListeners;
    }

    public static boolean isActivityVisible() {
        return sActivityVisible;
    }

    public static java.lang.String getCocos2dxPackageName() {
        return sPackageName;
    }

    public static java.lang.String getCocos2dxWritablePath() {
        return sFileDirectory;
    }

    public static java.lang.String getCurrentLanguage() {
        return java.util.Locale.getDefault().getLanguage();
    }

    public static java.lang.String getDeviceModel() {
        return android.os.Build.MODEL;
    }

    public static android.content.res.AssetManager getAssetManager() {
        return sAssetManager;
    }

    public static void enableAccelerometer() {
        sAccelerometerEnabled = true;
        sCocos2dxAccelerometer.enable();
    }

    public static void setAccelerometerInterval(float f) {
        sCocos2dxAccelerometer.setInterval(f);
    }

    public static void disableAccelerometer() {
        sAccelerometerEnabled = false;
        sCocos2dxAccelerometer.disable();
    }

    public static void setKeepScreenOn(boolean z) {
        ((org.cocos2dx.lib.Cocos2dxActivity) sActivity).setKeepScreenOn(z);
    }

    public static boolean openURL(java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            sActivity.startActivity(intent);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void preloadBackgroundMusic(java.lang.String str) {
        sCocos2dMusic.preloadBackgroundMusic(str);
    }

    public static void playBackgroundMusic(java.lang.String str, boolean z) {
        sCocos2dMusic.playBackgroundMusic(str, z);
    }

    public static void resumeBackgroundMusic() {
        sCocos2dMusic.resumeBackgroundMusic();
    }

    public static void pauseBackgroundMusic() {
        sCocos2dMusic.pauseBackgroundMusic();
    }

    public static void stopBackgroundMusic() {
        sCocos2dMusic.stopBackgroundMusic();
    }

    public static void rewindBackgroundMusic() {
        sCocos2dMusic.rewindBackgroundMusic();
    }

    public static boolean isBackgroundMusicPlaying() {
        return sCocos2dMusic.isBackgroundMusicPlaying();
    }

    public static float getBackgroundMusicVolume() {
        return sCocos2dMusic.getBackgroundVolume();
    }

    public static void setBackgroundMusicVolume(float f) {
        sCocos2dMusic.setBackgroundVolume(f);
    }

    public static void preloadEffect(java.lang.String str) {
        sCocos2dSound.preloadEffect(str);
    }

    public static int playEffect(java.lang.String str, boolean z, float f, float f2, float f3) {
        return sCocos2dSound.playEffect(str, z, f, f2, f3);
    }

    public static void resumeEffect(int i) {
        sCocos2dSound.resumeEffect(i);
    }

    public static void pauseEffect(int i) {
        sCocos2dSound.pauseEffect(i);
    }

    public static void stopEffect(int i) {
        sCocos2dSound.stopEffect(i);
    }

    public static float getEffectsVolume() {
        return sCocos2dSound.getEffectsVolume();
    }

    public static void setEffectsVolume(float f) {
        sCocos2dSound.setEffectsVolume(f);
    }

    public static void unloadEffect(java.lang.String str) {
        sCocos2dSound.unloadEffect(str);
    }

    public static void pauseAllEffects() {
        sCocos2dSound.pauseAllEffects();
    }

    public static void resumeAllEffects() {
        sCocos2dSound.resumeAllEffects();
    }

    public static void stopAllEffects() {
        sCocos2dSound.stopAllEffects();
    }

    public static void end() {
        sCocos2dMusic.end();
        sCocos2dSound.end();
    }

    public static void onResume() {
        sActivityVisible = true;
        if (sAccelerometerEnabled) {
            sCocos2dxAccelerometer.enable();
        }
    }

    public static void onPause() {
        sActivityVisible = false;
        if (sAccelerometerEnabled) {
            sCocos2dxAccelerometer.disable();
        }
    }

    public static void onEnterBackground() {
        sCocos2dSound.onEnterBackground();
        sCocos2dMusic.onEnterBackground();
    }

    public static void onEnterForeground() {
        sCocos2dSound.onEnterForeground();
        sCocos2dMusic.onEnterForeground();
    }

    public static void terminateProcess() {
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    private static void showDialog(java.lang.String str, java.lang.String str2) {
        sCocos2dxHelperListener.showDialog(str, str2);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxHelper$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ boolean val$cancelable;
        final /* synthetic */ java.lang.String val$pMessage;
        final /* synthetic */ java.lang.String val$pTitle;

        AnonymousClass1(java.lang.String str, java.lang.String str2, boolean z) {
            this.val$pTitle = str;
            this.val$pMessage = str2;
            this.val$cancelable = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            new android.app.AlertDialog.Builder(org.cocos2dx.lib.Cocos2dxHelper.sActivity).setTitle(this.val$pTitle).setMessage(this.val$pMessage).setCancelable(this.val$cancelable).setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() { // from class: org.cocos2dx.lib.Cocos2dxHelper.1.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, final int i) {
                    org.cocos2dx.lib.Cocos2dxHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            org.cocos2dx.lib.Cocos2dxLuaJavaBridge.callLuaGlobalFunctionWithString("Dialog_Click", org.cocos2dx.lib.Cocos2dxHelper.AnonymousClass1.this.val$pMessage + "|" + i);
                        }
                    });
                }
            }).create().show();
        }
    }

    private static void showDialogWithParams(java.lang.String str, java.lang.String str2, boolean z) {
        ((org.cocos2dx.lib.Cocos2dxActivity) sActivity).runOnUiThread(new org.cocos2dx.lib.Cocos2dxHelper.AnonymousClass1(str, str2, z));
    }

    private static void showEditTextDialog(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4) {
        sCocos2dxHelperListener.showEditTextDialog(str, str2, i, i2, i3, i4);
    }

    public static void setEditTextDialogResult(java.lang.String str) {
        try {
            final byte[] bytes = str.getBytes("UTF8");
            sCocos2dxHelperListener.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxHelper.nativeSetEditTextDialogResult(bytes);
                }
            });
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }

    public static int getDPI() {
        android.view.Display defaultDisplay;
        if (sActivity == null) {
            return -1;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = sActivity.getWindowManager();
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return -1;
        }
        defaultDisplay.getMetrics(displayMetrics);
        return (int) (displayMetrics.density * 160.0f);
    }

    public static boolean getBoolForKey(java.lang.String str, boolean z) {
        return sActivity.getSharedPreferences(PREFS_NAME, 0).getBoolean(str, z);
    }

    public static int getIntegerForKey(java.lang.String str, int i) {
        return sActivity.getSharedPreferences(PREFS_NAME, 0).getInt(str, i);
    }

    public static float getFloatForKey(java.lang.String str, float f) {
        return sActivity.getSharedPreferences(PREFS_NAME, 0).getFloat(str, f);
    }

    public static double getDoubleForKey(java.lang.String str, double d) {
        return sActivity.getSharedPreferences(PREFS_NAME, 0).getFloat(str, (float) d);
    }

    public static java.lang.String getStringForKey(java.lang.String str, java.lang.String str2) {
        return sActivity.getSharedPreferences(PREFS_NAME, 0).getString(str, str2);
    }

    public static void setBoolForKey(java.lang.String str, boolean z) {
        android.content.SharedPreferences.Editor edit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    public static void setIntegerForKey(java.lang.String str, int i) {
        android.content.SharedPreferences.Editor edit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public static void setFloatForKey(java.lang.String str, float f) {
        android.content.SharedPreferences.Editor edit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putFloat(str, f);
        edit.commit();
    }

    public static void setDoubleForKey(java.lang.String str, double d) {
        android.content.SharedPreferences.Editor edit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putFloat(str, (float) d);
        edit.commit();
    }

    public static void setStringForKey(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static void migrateData() {
        for (java.util.Map.Entry<java.lang.String, ?> entry : sActivity.getSharedPreferences(PREFS_NAME, 0).getAll().entrySet()) {
            nativeSetValueForKey(entry.getKey(), entry.getValue().toString());
        }
    }

    private static void showToast(final java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        sActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.3
            @Override // java.lang.Runnable
            public void run() {
                android.widget.Toast.makeText(org.cocos2dx.lib.Cocos2dxHelper.sActivity, str, 0).show();
            }
        });
    }

    private static android.net.Uri getUriFromFile(java.io.File file) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.FileProvider.getUriForFile(sActivity, sActivity.getPackageName() + ".fileprovider", file);
        }
        return android.net.Uri.fromFile(file);
    }

    public static void copyText(java.lang.String str, java.lang.String str2) {
        if (android.os.Looper.myLooper() == null) {
            android.os.Looper.prepare();
        }
        ((android.content.ClipboardManager) sActivity.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText(androidx.compose.material.TextFieldImplKt.LabelId, str));
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        showToast(str2);
    }

    public static java.lang.String getCopiedText() {
        android.content.ClipData.Item itemAt;
        if (android.os.Looper.myLooper() == null) {
            android.os.Looper.prepare();
        }
        java.lang.String str = "";
        try {
            android.content.ClipData primaryClip = ((android.content.ClipboardManager) sActivity.getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0 && (itemAt = primaryClip.getItemAt(0)) != null) {
                str = itemAt.getText().toString();
            }
        } catch (java.lang.Exception unused) {
        }
        android.util.Log.i("bole", "clipStr = " + str);
        return str;
    }

    public static void openOtherApps(final java.lang.String str, final java.lang.String str2) {
        sActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.cocos2dx.lib.Cocos2dxHelper.sActivity.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str + android.net.Uri.encode(str2))));
                } catch (android.content.ActivityNotFoundException e) {
                    e.printStackTrace();
                    android.widget.Toast.makeText(org.cocos2dx.lib.Cocos2dxHelper.sActivity, "NO RELATED APP", 0).show();
                }
            }
        });
    }

    public static void sendEmail(java.lang.String str, java.lang.String str2, boolean z) {
        if (z) {
            shareViaIntent(str, str2, "", "", "android.intent.action.CHOOSER");
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(androidx.core.net.MailTo.MAILTO_SCHEME);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND", parse);
        android.net.Uri uriFromFile = getUriFromFile(new java.io.File(sActivity.getFilesDir(), str2));
        java.lang.System.out.println("Content uri :" + uriFromFile.toString());
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.STREAM", uriFromFile);
        java.util.Iterator<android.content.pm.ResolveInfo> it = sActivity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            sActivity.grantUriPermission(it.next().activityInfo.packageName, uriFromFile, 3);
        }
        intent.addFlags(3);
        intent.setDataAndType(parse, "image/*");
        sActivity.startActivity(intent);
    }

    public static void shareLinkViaSystem(final java.lang.String str, java.lang.String str2) {
        sActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
                    android.content.Intent createChooser = android.content.Intent.createChooser(intent, "Share to:");
                    if (createChooser.resolveActivity(org.cocos2dx.lib.Cocos2dxHelper.sActivity.getPackageManager()) != null) {
                        org.cocos2dx.lib.Cocos2dxHelper.sActivity.startActivity(createChooser);
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void shareViaIntentSend(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        shareViaIntent(str, str2, str3, str4, "android.intent.action.SEND");
    }

    public static void shareViaIntent(final java.lang.String str, java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5) {
        if (str3 == null || str3.isEmpty()) {
            java.lang.System.out.println("no useful data");
        } else {
            java.lang.System.out.println("Func: share via intent");
            sActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.6
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.String str6;
                    try {
                        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
                        java.lang.String str7 = str3;
                        if (str7 != null && !str7.isEmpty() && (str6 = str4) != null && !str6.isEmpty()) {
                            intent.setComponent(new android.content.ComponentName(str3, str4));
                        } else {
                            java.lang.String str8 = str3;
                            if (str8 != null && !str8.isEmpty()) {
                                intent.setPackage(str3);
                                intent.putExtra("android.intent.extra.TEXT", str);
                            }
                        }
                        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
                        if (str5 != "android.intent.action.CHOOSER") {
                            intent.putExtra("android.intent.extra.TEXT", str);
                            if (intent.resolveActivity(org.cocos2dx.lib.Cocos2dxHelper.sActivity.getPackageManager()) != null) {
                                org.cocos2dx.lib.Cocos2dxHelper.sActivity.startActivity(intent);
                                return;
                            }
                            return;
                        }
                        android.content.Intent createChooser = android.content.Intent.createChooser(intent, "Share via");
                        if (createChooser.resolveActivity(org.cocos2dx.lib.Cocos2dxHelper.sActivity.getPackageManager()) != null) {
                            org.cocos2dx.lib.Cocos2dxHelper.sActivity.startActivity(createChooser);
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static boolean isAppInstalled(java.lang.String str) {
        java.lang.System.out.println("Func: check app installed");
        try {
            sActivity.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void goToMarket(java.lang.String str) {
        try {
            sActivity.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details?id=" + str)));
        } catch (android.content.ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean removeDirectory(java.lang.String str) {
        try {
            recursionDeleteFile(new java.io.File(str));
            android.util.Log.i("bole", "removeDirectory");
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void recursionDeleteFile(java.io.File file) {
        if (file.isFile()) {
            file.delete();
            return;
        }
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                file.delete();
                return;
            }
            for (java.io.File file2 : listFiles) {
                recursionDeleteFile(file2);
            }
            file.delete();
        }
    }

    public static java.lang.String listDir(java.lang.String str, boolean z) {
        java.io.File[] listFiles;
        java.io.File file = new java.io.File(str);
        java.lang.String str2 = "";
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                if (!z || file2.isDirectory()) {
                    str2 = str2 + file2.getName() + "\n";
                }
            }
        }
        return str2;
    }

    public static int getSDKVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }
}
