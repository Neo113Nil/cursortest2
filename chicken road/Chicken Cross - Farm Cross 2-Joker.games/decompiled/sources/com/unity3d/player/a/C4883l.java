package com.unity3d.player.a;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.unity3d.player.a.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4883l extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4887p f11768a;

    public C4883l(C4887p c4887p) {
        this.f11768a = c4887p;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f11768a.b = cameraDevice;
        C4887p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C4887p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC4890t.Log(5, "Camera2: CameraDevice disconnected.");
        this.f11768a.a(cameraDevice);
        C4887p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        AbstractC4890t.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.f11768a.a(cameraDevice);
        C4887p.D.release();
    }
}
