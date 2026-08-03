package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class SocialWrapper {
    public static final int SOCIAL_SUBMITSCORE_FAILED = 2;
    public static final int SOCIAL_SUBMITSCORE_SUCCESS = 1;
    public static final int SOCIAL_UNLOCKACH_FAILED = 4;
    public static final int SOCIAL_UNLOCKACH_SUCCESS = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnSocialResult(java.lang.String str, int i, java.lang.String str2);

    public static void onSocialResult(final org.cocos2dx.plugin.InterfaceSocial interfaceSocial, final int i, final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.SocialWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.plugin.SocialWrapper.nativeOnSocialResult(org.cocos2dx.plugin.InterfaceSocial.this.getClass().getName().replace('.', kotlinx.io.files.FileSystemKt.UnixPathSeparator), i, str);
            }
        });
    }
}
