package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5104l0;

/* loaded from: classes8.dex */
public final class q {
    @NonNull
    public static InterfaceC5104l0 a(int i11, int i12, int i13, int i14) {
        return new d(ImageReader.newInstance(i11, i12, i13, i14));
    }
}
