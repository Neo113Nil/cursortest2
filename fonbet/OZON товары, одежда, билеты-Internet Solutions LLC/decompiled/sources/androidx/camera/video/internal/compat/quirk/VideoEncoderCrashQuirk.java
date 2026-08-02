package androidx.camera.video.internal.compat.quirk;

import W.C4852x;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;

/* loaded from: classes8.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean c(@NonNull H h11, @NonNull C4852x c4852x) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && h11.e() == 0 && c4852x == C4852x.f33147a;
    }
}
