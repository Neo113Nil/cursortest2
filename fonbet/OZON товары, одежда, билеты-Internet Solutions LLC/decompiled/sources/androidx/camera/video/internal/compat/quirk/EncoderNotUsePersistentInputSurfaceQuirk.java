package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f38500a = Arrays.asList("SM-N9208", "SM-G920V");

    static boolean e() {
        return f38500a.contains(Build.MODEL.toUpperCase());
    }
}
