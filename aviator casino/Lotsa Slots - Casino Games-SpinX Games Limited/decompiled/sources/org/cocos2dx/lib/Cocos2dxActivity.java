package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public abstract class Cocos2dxActivity extends android.app.Activity implements org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener {
    private static final java.lang.String TAG = "Cocos2dxActivity";
    public static int openWay;
    private static org.cocos2dx.lib.Cocos2dxActivity sContext;
    private static org.cocos2dx.lib.SurfaceTextureVideo surfaceTextureVideo;
    private org.cocos2dx.lib.Cocos2dxGLSurfaceView mGLSurfaceView = null;
    private int[] mGLContextAttrs = null;
    private org.cocos2dx.lib.Cocos2dxHandler mHandler = null;
    private org.cocos2dx.lib.Cocos2dxVideoHelper mVideoHelper = null;
    private org.cocos2dx.lib.Cocos2dxWebViewHelper mWebViewHelper = null;
    private boolean hasFocus = false;
    private boolean isLoadso = false;
    protected android.widget.FrameLayout mFrameLayout = null;

    /* JADX INFO: Access modifiers changed from: private */
    public static native int[] getGLContextAttrs();

    public class Cocos2dxEGLConfigChooser implements android.opengl.GLSurfaceView.EGLConfigChooser {
        protected int[] configAttribs;

        public Cocos2dxEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            this.configAttribs = new int[]{i, i2, i3, i4, i5, i6};
        }

        public Cocos2dxEGLConfigChooser(int[] iArr) {
            this.configAttribs = iArr;
        }

        public javax.microedition.khronos.egl.EGLConfig selectConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr, int[] iArr) {
            for (javax.microedition.khronos.egl.EGLConfig eGLConfig : eGLConfigArr) {
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= iArr[4] && findConfigAttrib2 >= iArr[5]) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 >= iArr[0] && findConfigAttrib4 >= iArr[1] && findConfigAttrib5 >= iArr[2] && findConfigAttrib6 >= iArr[3]) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i, int i2) {
            int[] iArr = new int[1];
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr) ? iArr[0] : i2;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
            int[] iArr;
            int[] iArr2 = new int[1];
            if (egl10.eglGetConfigs(eGLDisplay, null, 0, iArr2)) {
                int i = iArr2[0];
                javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i];
                int[] iArr3 = this.configAttribs;
                int[] iArr4 = new int[1];
                egl10.eglChooseConfig(eGLDisplay, new int[]{12324, iArr3[0], 12323, iArr3[1], 12322, iArr3[2], 12321, iArr3[3], 12325, iArr3[4], 12326, iArr3[5], 12352, 4, 12344}, eGLConfigArr, i, iArr4);
                if (iArr4[0] > 0) {
                    return selectConfig(egl10, eGLDisplay, eGLConfigArr, this.configAttribs);
                }
                int[] iArr5 = {12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12344};
                int[] iArr6 = {12324, 4, 12323, 4, 12322, 4, 12321, 4, 12325, 0, 12326, 0, 12352, 4, 12344};
                if (this.configAttribs[3] == 0) {
                    egl10.eglChooseConfig(eGLDisplay, iArr5, eGLConfigArr, iArr2[0], iArr4);
                    iArr = new int[]{5, 6, 5, 0, 0, 0};
                } else {
                    egl10.eglChooseConfig(eGLDisplay, iArr6, eGLConfigArr, iArr2[0], iArr4);
                    iArr = new int[]{4, 4, 4, 4, 0, 0};
                }
                if (iArr4[0] > 0) {
                    return selectConfig(egl10, eGLDisplay, eGLConfigArr, iArr);
                }
                android.util.Log.e("device_policy", "Can not select an EGLConfig for rendering.");
                return null;
            }
            android.util.Log.e("device_policy", "Can not select an EGLConfig for rendering.");
            return null;
        }
    }

    public static android.content.Context getContext() {
        return sContext;
    }

    public void setKeepScreenOn(final boolean z) {
        if (this.isLoadso) {
            runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxActivity.this.mGLSurfaceView.setKeepScreenOn(z);
                }
            });
        }
    }

    protected boolean onLoadNativeLibraries() {
        try {
            java.lang.System.loadLibrary(getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("android.app.lib_name"));
            return true;
        } catch (java.lang.Error | java.lang.Exception e) {
            e.printStackTrace();
            quietExit(e.getMessage());
            return false;
        }
    }

    void quietExit(java.lang.String str) {
        android.util.Log.e(TAG, str);
        finish();
        java.lang.System.exit(0);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initOpenWay();
        sContext = this;
        new java.lang.Thread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (org.cocos2dx.lib.Cocos2dxActivity.this.onLoadNativeLibraries()) {
                    org.cocos2dx.lib.Cocos2dxActivity.sContext.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxActivity.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                org.cocos2dx.lib.Cocos2dxActivity.this.isLoadso = true;
                                org.cocos2dx.lib.Cocos2dxActivity.sContext.mHandler = new org.cocos2dx.lib.Cocos2dxHandler(org.cocos2dx.lib.Cocos2dxActivity.sContext);
                                org.cocos2dx.lib.Cocos2dxHelper.init(org.cocos2dx.lib.Cocos2dxActivity.sContext);
                                org.cocos2dx.lib.Cocos2dxActivity.sContext.mGLContextAttrs = org.cocos2dx.lib.Cocos2dxActivity.getGLContextAttrs();
                                org.cocos2dx.lib.Cocos2dxActivity.sContext.init();
                                if (org.cocos2dx.lib.Cocos2dxActivity.this.mVideoHelper == null) {
                                    org.cocos2dx.lib.Cocos2dxActivity.this.mVideoHelper = new org.cocos2dx.lib.Cocos2dxVideoHelper(org.cocos2dx.lib.Cocos2dxActivity.sContext, org.cocos2dx.lib.Cocos2dxActivity.this.mFrameLayout);
                                }
                                if (org.cocos2dx.lib.Cocos2dxActivity.this.mWebViewHelper == null) {
                                    org.cocos2dx.lib.Cocos2dxActivity.this.mWebViewHelper = new org.cocos2dx.lib.Cocos2dxWebViewHelper(org.cocos2dx.lib.Cocos2dxActivity.this.mFrameLayout);
                                }
                                org.cocos2dx.lib.SurfaceTextureVideo unused = org.cocos2dx.lib.Cocos2dxActivity.surfaceTextureVideo = new org.cocos2dx.lib.SurfaceTextureVideo(org.cocos2dx.lib.Cocos2dxActivity.sContext);
                                org.cocos2dx.lib.Cocos2dxActivity.this.hideSystemUI();
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                                org.cocos2dx.lib.Cocos2dxActivity.this.quietExit(e.getMessage());
                            }
                        }
                    });
                }
            }
        }).start();
    }

    public void initOpenWay() {
        java.lang.String action = getIntent().getAction();
        if (action == null || openWay != 0) {
            return;
        }
        if ("android.intent.action.MAIN".equals(action)) {
            openWay = 1;
        } else if ("android.intent.action.VIEW".equals(action)) {
            openWay = 2;
        }
    }

    public void onNavigationBarChanged(int i, int i2, int i3, int i4) {
        if (this.isLoadso) {
            this.mGLSurfaceView.onNavigationBarChanged(i, i2, i3, i4);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.isLoadso) {
            resumeIfHasFocus();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.hasFocus = z;
        if (this.isLoadso) {
            android.util.Log.d(TAG, "onWindowFocusChanged() hasFocus=" + z);
            resumeIfHasFocus();
        }
    }

    private void resumeIfHasFocus() {
        if (this.isLoadso) {
            boolean z = (isDeviceLocked() || isDeviceAsleep()) ? false : true;
            if (this.hasFocus && z) {
                org.cocos2dx.lib.Cocos2dxHelper.onResume();
                this.mGLSurfaceView.onResume();
            }
        }
    }

    private static boolean isDeviceLocked() {
        return ((android.app.KeyguardManager) getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private static boolean isDeviceAsleep() {
        if (((android.os.PowerManager) getContext().getSystemService("power")) == null) {
            return false;
        }
        return !r0.isInteractive();
    }

    public void hideSystemUI() {
        org.cocos2dx.lib.Cocos2dxGLSurfaceView cocos2dxGLSurfaceView;
        if (!this.isLoadso || (cocos2dxGLSurfaceView = this.mGLSurfaceView) == null) {
            return;
        }
        cocos2dxGLSurfaceView.hideSystemUI();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.isLoadso) {
            org.cocos2dx.lib.Cocos2dxHelper.onPause();
            this.mGLSurfaceView.onPause();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        if (this.isLoadso) {
            this.mGLSurfaceView.onLowMemory();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void showDialog(java.lang.String str, java.lang.String str2) {
        android.os.Message message = new android.os.Message();
        message.what = 1;
        message.obj = new org.cocos2dx.lib.Cocos2dxHandler.DialogMessage(str, str2);
        this.mHandler.sendMessage(message);
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void showEditTextDialog(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4) {
        android.os.Message message = new android.os.Message();
        message.what = 2;
        message.obj = new org.cocos2dx.lib.Cocos2dxHandler.EditBoxMessage(str, str2, i, i2, i3, i4);
        this.mHandler.sendMessage(message);
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void runOnGLThread(java.lang.Runnable runnable) {
        if (this.isLoadso) {
            this.mGLSurfaceView.queueEvent(runnable);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.util.Iterator<android.preference.PreferenceManager.OnActivityResultListener> it = org.cocos2dx.lib.Cocos2dxHelper.getOnActivityResultListeners().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void init() {
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        this.mFrameLayout = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(-1, -2);
        org.cocos2dx.lib.Cocos2dxEditText cocos2dxEditText = new org.cocos2dx.lib.Cocos2dxEditText(this);
        cocos2dxEditText.setLayoutParams(layoutParams2);
        this.mFrameLayout.addView(cocos2dxEditText);
        org.cocos2dx.lib.Cocos2dxGLSurfaceView onCreateView = onCreateView();
        this.mGLSurfaceView = onCreateView;
        this.mFrameLayout.addView(onCreateView);
        if (isAndroidEmulator()) {
            this.mGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        }
        org.cocos2dx.lib.Cocos2dxRenderer.setFrameRate(getWindowManager().getDefaultDisplay().getRefreshRate());
        this.mGLSurfaceView.setCocos2dxRenderer(new org.cocos2dx.lib.Cocos2dxRenderer());
        this.mGLSurfaceView.setCocos2dxEditText(cocos2dxEditText);
        setContentView(this.mFrameLayout);
    }

    public org.cocos2dx.lib.Cocos2dxGLSurfaceView onCreateView() {
        org.cocos2dx.lib.Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = new org.cocos2dx.lib.Cocos2dxGLSurfaceView(this);
        if (this.mGLContextAttrs[3] > 0) {
            cocos2dxGLSurfaceView.getHolder().setFormat(-3);
        }
        cocos2dxGLSurfaceView.setEGLConfigChooser(new org.cocos2dx.lib.Cocos2dxActivity.Cocos2dxEGLConfigChooser(this.mGLContextAttrs));
        return cocos2dxGLSurfaceView;
    }

    private static final boolean isAndroidEmulator() {
        java.lang.String str = android.os.Build.MODEL;
        java.lang.String str2 = TAG;
        android.util.Log.d(str2, "model=" + str);
        java.lang.String str3 = android.os.Build.PRODUCT;
        android.util.Log.d(str2, "product=" + str3);
        boolean z = false;
        if (str3 != null && (str3.equals("sdk") || str3.contains("_sdk") || str3.contains("sdk_"))) {
            z = true;
        }
        android.util.Log.d(str2, "isEmulator=" + z);
        return z;
    }
}
