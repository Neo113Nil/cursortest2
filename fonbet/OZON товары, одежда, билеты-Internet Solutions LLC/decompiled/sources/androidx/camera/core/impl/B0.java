package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class B0 {
    @NonNull
    public static B0 a(@NonNull Surface surface, @NonNull Size size, int i11) {
        return new C5097i(surface, size, i11);
    }

    public abstract int b();

    @NonNull
    public abstract Size c();

    @NonNull
    public abstract Surface d();
}
