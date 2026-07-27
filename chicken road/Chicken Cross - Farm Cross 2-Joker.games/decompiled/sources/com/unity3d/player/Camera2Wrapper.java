package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import com.unity3d.player.a.AbstractC4890t;
import com.unity3d.player.a.C4887p;
import com.unity3d.player.a.InterfaceC4889s;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class Camera2Wrapper implements InterfaceC4889s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11703a;
    public C4887p b = null;

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public Camera2Wrapper(Context context) {
        this.f11703a = context;
        initCamera2Jni();
    }

    public int getCamera2Count() {
        return C4887p.a(this.f11703a).length;
    }

    public int getCamera2SensorOrientation(int i) {
        return C4887p.c(this.f11703a, i);
    }

    public boolean isCamera2FrontFacing(int i) {
        return C4887p.e(this.f11703a, i);
    }

    public int getCamera2FocalLengthEquivalent(int i) {
        return C4887p.a(this.f11703a, i);
    }

    public int[] getCamera2Resolutions(int i) {
        return C4887p.b(this.f11703a, i);
    }

    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C4887p c4887p = new C4887p(this);
        this.b = c4887p;
        return c4887p.a(this.f11703a, i, i2, i3, i4, i5, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i) {
        return C4887p.d(this.f11703a, i);
    }

    public boolean setAutoFocusPoint(float f, float f2) {
        C4887p c4887p = this.b;
        if (c4887p != null && c4887p.h > 0) {
            if (!c4887p.m) {
                c4887p.i = f;
                c4887p.j = f2;
                synchronized (c4887p.s) {
                    if (c4887p.r != null && c4887p.A != 2) {
                        c4887p.d();
                    }
                }
                return true;
            }
            AbstractC4890t.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public Rect getFrameSizeCamera2() {
        C4887p c4887p = this.b;
        if (c4887p == null) {
            return new Rect();
        }
        return c4887p.e;
    }

    public void closeCamera2() {
        C4887p c4887p = this.b;
        if (c4887p != null) {
            c4887p.a();
        }
        this.b = null;
    }

    public void startCamera2() {
        C4887p c4887p = this.b;
        if (c4887p != null) {
            c4887p.f();
        }
    }

    public void pauseCamera2() {
        C4887p c4887p = this.b;
        if (c4887p != null) {
            c4887p.c();
        }
    }

    public void stopCamera2() {
        C4887p c4887p = this.b;
        if (c4887p != null) {
            c4887p.g();
        }
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }
}
