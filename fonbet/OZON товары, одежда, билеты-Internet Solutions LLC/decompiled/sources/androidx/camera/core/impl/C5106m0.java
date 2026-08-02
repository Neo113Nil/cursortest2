package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* renamed from: androidx.camera.core.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5106m0 extends W {

    /* renamed from: o, reason: collision with root package name */
    private final Surface f38363o;

    public C5106m0(@NonNull Surface surface, @NonNull Size size, int i11) {
        super(size, i11);
        this.f38363o = surface;
    }

    @Override // androidx.camera.core.impl.W
    @NonNull
    public final com.google.common.util.concurrent.m<Surface> o() {
        return I.k.h(this.f38363o);
    }

    public C5106m0(@NonNull Surface surface) {
        this.f38363o = surface;
    }
}
