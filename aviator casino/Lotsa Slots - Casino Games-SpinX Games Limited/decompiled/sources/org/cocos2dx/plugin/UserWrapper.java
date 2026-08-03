package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class UserWrapper {
    public static final int ACTION_RET_LOGIN_FAILED = 1;
    public static final int ACTION_RET_LOGIN_SUCCEED = 0;
    public static final int ACTION_RET_LOGOUT_SUCCEED = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnActionResult(java.lang.String str, int i, java.lang.String str2);

    public static void onActionResult(final org.cocos2dx.plugin.InterfaceUser interfaceUser, final int i, final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.UserWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.plugin.UserWrapper.nativeOnActionResult(org.cocos2dx.plugin.InterfaceUser.this.getClass().getName().replace('.', kotlinx.io.files.FileSystemKt.UnixPathSeparator), i, str);
            }
        });
    }
}
