package com.pgl.ssdk;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* loaded from: classes7.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static int f11645a = -1;

    public static int a(Context context) {
        int i = f11645a;
        if (i != -1) {
            return i;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f11645a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f11645a = -1;
            }
        } else {
            f11645a = -2;
        }
        return f11645a;
    }
}
