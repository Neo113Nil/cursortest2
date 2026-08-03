package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class IAPWrapper {
    public static final int BILLING_SETUP = 100;
    public static final int BILLING_SETUP_FAILED = 101;
    public static final int CONSUME_FAILED = 103;
    public static final int CONSUME_SUCCESS = 102;
    public static final int IN_APP_MESSAGES = 200;
    public static final int PAYRESULT_CANCEL = 2;
    public static final int PAYRESULT_FAIL = 1;
    public static final int PAYRESULT_SUCCESS = 0;
    public static final int PAYRESULT_TIMEOUT = 3;
    public static final int SKU_DETAIL_FAILED = 105;
    public static final int SKU_DETAIL_SUCCESS = 104;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnPayResult(java.lang.String str, int i, java.lang.String str2);

    public static void onPayResult(final org.cocos2dx.plugin.InterfaceIAP interfaceIAP, final int i, final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.plugin.IAPWrapper.nativeOnPayResult(org.cocos2dx.plugin.InterfaceIAP.this.getClass().getName().replace('.', kotlinx.io.files.FileSystemKt.UnixPathSeparator), i, str);
            }
        });
    }
}
