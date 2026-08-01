package com.unity3d.player.a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* renamed from: com.unity3d.player.a.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4882k extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4887p f11767a;

    public C4882k(C4887p c4887p) {
        this.f11767a = c4887p;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C4887p c4887p = this.f11767a;
        if (c4887p.b == null) {
            return;
        }
        synchronized (c4887p.s) {
            C4887p c4887p2 = this.f11767a;
            c4887p2.r = cameraCaptureSession;
            try {
                c4887p2.q = c4887p2.b.createCaptureRequest(1);
                C4887p c4887p3 = this.f11767a;
                c4887p3.q.addTarget(c4887p3.v);
                C4887p c4887p4 = this.f11767a;
                c4887p4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c4887p4.n);
                this.f11767a.e();
            } catch (CameraAccessException e) {
                AbstractC4890t.Log(6, "Camera2: CameraAccessException " + e);
            } catch (IllegalStateException e2) {
                AbstractC4890t.Log(6, "Camera2: IllegalStateException " + e2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC4890t.Log(6, "Camera2: CaptureSession configuration failed.");
    }
}
