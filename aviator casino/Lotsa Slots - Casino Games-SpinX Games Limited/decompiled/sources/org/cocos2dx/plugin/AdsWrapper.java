package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class AdsWrapper {
    public static final int POS_BOTTOM = 4;
    public static final int POS_BOTTOM_LEFT = 5;
    public static final int POS_BOTTOM_RIGHT = 6;
    public static final int POS_CENTER = 0;
    public static final int POS_TOP = 1;
    public static final int POS_TOP_LEFT = 2;
    public static final int POS_TOP_RIGHT = 3;
    public static final int RESULT_CODE_AdsDismissed = 2;
    public static final int RESULT_CODE_AdsReceived = 0;
    public static final int RESULT_CODE_AdsShown = 1;
    public static final int RESULT_CODE_NetworkError = 5;
    public static final int RESULT_CODE_PointsSpendFailed = 4;
    public static final int RESULT_CODE_PointsSpendSucceed = 3;
    public static final int RESULT_CODE_UnknownError = 6;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnAdsResult(java.lang.String str, int i, java.lang.String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnPlayerGetPoints(java.lang.String str, int i);

    public static void addAdView(android.view.WindowManager windowManager, android.view.View view, int i) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = 1000;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.flags |= 8;
        switch (i) {
            case 0:
                layoutParams.gravity = 17;
                break;
            case 1:
                layoutParams.gravity = 48;
                break;
            case 2:
                layoutParams.gravity = 51;
                break;
            case 3:
                layoutParams.gravity = 53;
                break;
            case 4:
                layoutParams.gravity = 80;
                break;
            case 5:
                layoutParams.gravity = 83;
                break;
            case 6:
                layoutParams.gravity = 85;
                break;
        }
        windowManager.addView(view, layoutParams);
    }

    public static void onAdsResult(final org.cocos2dx.plugin.InterfaceAds interfaceAds, final int i, final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.AdsWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.plugin.AdsWrapper.nativeOnAdsResult(org.cocos2dx.plugin.InterfaceAds.this.getClass().getName().replace('.', kotlinx.io.files.FileSystemKt.UnixPathSeparator), i, str);
            }
        });
    }

    public static void onPlayerGetPoints(final org.cocos2dx.plugin.InterfaceAds interfaceAds, final int i) {
        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.AdsWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.plugin.AdsWrapper.nativeOnPlayerGetPoints(org.cocos2dx.plugin.InterfaceAds.this.getClass().getName().replace('.', kotlinx.io.files.FileSystemKt.UnixPathSeparator), i);
            }
        });
    }
}
