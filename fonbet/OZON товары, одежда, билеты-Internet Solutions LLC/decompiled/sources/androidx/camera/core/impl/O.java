package androidx.camera.core.impl;

import C.C2697q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private static final C2697q f38149a;

    private static class a {
        static int a(@NonNull Context context) {
            return context.getDeviceId();
        }
    }

    public static class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private int f38150a;

        public b(String str, int i11, IllegalArgumentException illegalArgumentException) {
            super(str, illegalArgumentException);
            this.f38150a = i11;
        }

        public final int a() {
            return this.f38150a;
        }
    }

    static {
        C2697q.a aVar = new C2697q.a();
        aVar.c(2);
        f38149a = aVar.b();
    }

    public static void a(@NonNull Context context, @NonNull L l11, C2697q c2697q) throws b {
        Integer c11;
        int i11 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            LinkedHashSet<I> a11 = l11.a();
            if (a11.isEmpty()) {
                throw new b("No cameras available", 0, null);
            }
            C.S.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + a11.size() + " cameras. Skipping validation.");
            return;
        }
        if (c2697q != null) {
            try {
                c11 = c2697q.c();
                if (c11 == null) {
                    C.S.k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e11) {
                C.S.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e11);
                return;
            }
        } else {
            c11 = null;
        }
        C.S.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + c11);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (c2697q != null) {
                    if (c11.intValue() == 1) {
                    }
                }
                C2697q.f4215c.d(l11.a());
                i11 = 1;
            }
        } catch (IllegalArgumentException e12) {
            illegalArgumentException = e12;
            C.S.l("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c2697q != null) {
                    if (c11.intValue() == 0) {
                    }
                }
                C2697q.f4214b.d(l11.a());
                i11++;
            }
        } catch (IllegalArgumentException e13) {
            illegalArgumentException = e13;
            C.S.l("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f38149a.d(l11.a());
            C.S.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i11++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        C.S.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + l11.a());
        throw new b("Expected camera missing from device.", i11, illegalArgumentException);
    }
}
