package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxRenderer implements android.opengl.GLSurfaceView.Renderer {
    private static final long NANOSECONDSPERMICROSECOND = 1000000;
    private static final long NANOSECONDSPERSECOND = 1000000000;
    private static long frameTime = 16666666;
    private static long sAnimationInterval = 16666666;
    private long mLastTickInNanoSeconds;
    private boolean mNativeInitCompleted = false;
    private int mScreenHeight;
    private int mScreenWidth;

    private static native void nativeDeleteBackward();

    private static native java.lang.String nativeGetContentText();

    private static native void nativeInit(int i, int i2);

    private static native void nativeInsertText(java.lang.String str);

    private static native boolean nativeKeyEvent(int i, int i2);

    private static native void nativeOnLowMemory();

    private static native void nativeOnMainThreadPause();

    private static native void nativeOnMainThreadResume();

    private static native void nativeOnNavigationBarChanged(int i, int i2, int i3, int i4);

    private static native void nativeOnPause();

    private static native void nativeOnResume();

    private static native void nativeOnSurfaceChanged(int i, int i2);

    private static native void nativeRender();

    private static native void nativeTouchesBegin(int i, float f, float f2);

    private static native void nativeTouchesCancel(int[] iArr, float[] fArr, float[] fArr2);

    private static native void nativeTouchesEnd(int i, float f, float f2);

    private static native void nativeTouchesMove(int[] iArr, float[] fArr, float[] fArr2);

    public static void setAnimationInterval(double d) {
        sAnimationInterval = (long) (d * 1.0E9d);
    }

    public static void setFrameRate(float f) {
        frameTime = (long) ((1.0d / f) * 1.0E9d);
    }

    public void setScreenWidthAndHeight(int i, int i2) {
        this.mScreenWidth = i;
        this.mScreenHeight = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        nativeInit(this.mScreenWidth, this.mScreenHeight);
        this.mLastTickInNanoSeconds = java.lang.System.nanoTime();
        this.mNativeInitCompleted = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i, int i2) {
        nativeOnSurfaceChanged(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        long j = frameTime;
        long j2 = sAnimationInterval;
        if (j >= j2 && j2 <= 1.6666666666666666E7d) {
            nativeRender();
            return;
        }
        long nanoTime = java.lang.System.nanoTime() - this.mLastTickInNanoSeconds;
        long j3 = sAnimationInterval;
        if (nanoTime < j3) {
            try {
                java.lang.Thread.sleep((j3 - nanoTime) / 1000000);
            } catch (java.lang.Exception unused) {
            }
        }
        this.mLastTickInNanoSeconds = java.lang.System.nanoTime();
        nativeRender();
    }

    public void handleActionDown(int i, float f, float f2) {
        nativeTouchesBegin(i, f, f2);
    }

    public void handleActionUp(int i, float f, float f2) {
        nativeTouchesEnd(i, f, f2);
    }

    public void handleActionCancel(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesCancel(iArr, fArr, fArr2);
    }

    public void handleActionMove(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesMove(iArr, fArr, fArr2);
    }

    public void handleKeyEvent(int i, int i2) {
        nativeKeyEvent(i, i2);
    }

    public void handleOnPause() {
        if (this.mNativeInitCompleted) {
            org.cocos2dx.lib.Cocos2dxHelper.onEnterBackground();
            nativeOnPause();
        }
    }

    public void handleOnLowMemory() {
        if (this.mNativeInitCompleted) {
            nativeOnLowMemory();
        }
    }

    public void handleOnMainThreadResume() {
        if (this.mNativeInitCompleted) {
            nativeOnMainThreadResume();
        }
    }

    public void handleOnMainThreadPause() {
        if (this.mNativeInitCompleted) {
            nativeOnMainThreadPause();
        }
    }

    public void handleOnResume() {
        org.cocos2dx.lib.Cocos2dxHelper.onEnterForeground();
        nativeOnResume();
    }

    public void onNavigationBarChanged(int i, int i2, int i3, int i4) {
        if (this.mNativeInitCompleted) {
            nativeOnNavigationBarChanged(i, i2, i3, i4);
        }
    }

    public void handleInsertText(java.lang.String str) {
        nativeInsertText(str);
    }

    public void handleDeleteBackward() {
        nativeDeleteBackward();
    }

    public java.lang.String getContentText() {
        return nativeGetContentText();
    }
}
