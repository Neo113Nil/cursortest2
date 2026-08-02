package X;

import J.n;
import W.f0;
import W.s0;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.b1;
import d0.W;
import d0.Y;
import p.InterfaceC8822a;
import x2.i;

/* loaded from: classes8.dex */
public final class a<T extends s0> implements b1<f0<T>>, InterfaceC5102k0, n {

    /* renamed from: H, reason: collision with root package name */
    public static final T.a<s0> f33906H = T.a.a(s0.class, "camerax.video.VideoCapture.videoOutput");

    /* renamed from: I, reason: collision with root package name */
    public static final T.a<InterfaceC8822a<W, Y>> f33907I = T.a.a(InterfaceC8822a.class, "camerax.video.VideoCapture.videoEncoderInfoFinder");

    /* renamed from: J, reason: collision with root package name */
    public static final T.a<Boolean> f33908J = T.a.a(Boolean.class, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");

    /* renamed from: G, reason: collision with root package name */
    private final A0 f33909G;

    public a(@NonNull A0 a02) {
        i.b(a02.d(f33906H));
        this.f33909G = a02;
    }

    @Override // androidx.camera.core.impl.InterfaceC5100j0
    public final int i() {
        return 34;
    }

    @Override // androidx.camera.core.impl.J0
    @NonNull
    public final T s() {
        return this.f33909G;
    }
}
