package androidx.camera.core.impl.utils;

import android.view.Surface;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public class SurfaceUtil {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f38393a;

        /* renamed from: b, reason: collision with root package name */
        public int f38394b;

        /* renamed from: c, reason: collision with root package name */
        public int f38395c;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    @NonNull
    public static a a(@NonNull Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f38393a = 0;
        aVar.f38394b = 0;
        aVar.f38395c = 0;
        aVar.f38393a = nativeGetSurfaceInfo[0];
        aVar.f38394b = nativeGetSurfaceInfo[1];
        aVar.f38395c = nativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
