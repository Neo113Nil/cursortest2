package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class ShareWrapper {
    public static final int SHARERESULT_CANCEL = 2;
    public static final int SHARERESULT_FAIL = 1;
    public static final int SHARERESULT_SUCCESS = 0;
    public static final int SHARERESULT_TIMEOUT = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnShareResult(java.lang.String str, int i, java.lang.String str2);

    public static void onShareResult(final org.cocos2dx.plugin.InterfaceShare interfaceShare, final int i, final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.ShareWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.plugin.ShareWrapper.nativeOnShareResult(org.cocos2dx.plugin.InterfaceShare.this.getClass().getName().replace('.', kotlinx.io.files.FileSystemKt.UnixPathSeparator), i, str);
            }
        });
    }
}
