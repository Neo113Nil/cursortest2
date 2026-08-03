package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class GameControllerAdapter {
    private static java.util.ArrayList<java.lang.Runnable> sRunnableFrameStartList;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerAxisEvent(java.lang.String str, int i, int i2, float f, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerButtonEvent(java.lang.String str, int i, int i2, boolean z, float f, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerConnected(java.lang.String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeControllerDisconnected(java.lang.String str, int i);

    public static void addRunnableToFrameStartList(java.lang.Runnable runnable) {
        if (sRunnableFrameStartList == null) {
            sRunnableFrameStartList = new java.util.ArrayList<>();
        }
        sRunnableFrameStartList.add(runnable);
    }

    public static void removeRunnableFromFrameStartList(java.lang.Runnable runnable) {
        java.util.ArrayList<java.lang.Runnable> arrayList = sRunnableFrameStartList;
        if (arrayList != null) {
            arrayList.remove(runnable);
        }
    }

    public static void onDrawFrameStart() {
        java.util.ArrayList<java.lang.Runnable> arrayList = sRunnableFrameStartList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sRunnableFrameStartList.get(i).run();
            }
        }
    }

    public static void onConnected(final java.lang.String str, final int i) {
        org.cocos2dx.lib.Cocos2dxHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.GameControllerAdapter.nativeControllerConnected(str, i);
            }
        });
    }

    public static void onDisconnected(final java.lang.String str, final int i) {
        org.cocos2dx.lib.Cocos2dxHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.GameControllerAdapter.nativeControllerDisconnected(str, i);
            }
        });
    }

    public static void onButtonEvent(final java.lang.String str, final int i, final int i2, final boolean z, final float f, final boolean z2) {
        org.cocos2dx.lib.Cocos2dxHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.GameControllerAdapter.nativeControllerButtonEvent(str, i, i2, z, f, z2);
            }
        });
    }

    public static void onAxisEvent(final java.lang.String str, final int i, final int i2, final float f, final boolean z) {
        org.cocos2dx.lib.Cocos2dxHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.GameControllerAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.GameControllerAdapter.nativeControllerAxisEvent(str, i, i2, f, z);
            }
        });
    }
}
