package androidx.camera.core.impl;

import C.I;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;

/* renamed from: androidx.camera.core.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5098i0 implements b1<C.I>, InterfaceC5102k0, J.h {

    /* renamed from: H, reason: collision with root package name */
    public static final T.a<Integer> f38313H;

    /* renamed from: I, reason: collision with root package name */
    public static final T.a<Integer> f38314I;

    /* renamed from: J, reason: collision with root package name */
    public static final T.a<P> f38315J;

    /* renamed from: K, reason: collision with root package name */
    public static final T.a<Integer> f38316K;

    /* renamed from: L, reason: collision with root package name */
    public static final T.a<Integer> f38317L;

    /* renamed from: M, reason: collision with root package name */
    public static final T.a<C.O> f38318M;

    /* renamed from: N, reason: collision with root package name */
    public static final T.a<Boolean> f38319N;

    /* renamed from: O, reason: collision with root package name */
    public static final T.a<Integer> f38320O;

    /* renamed from: P, reason: collision with root package name */
    public static final T.a<Integer> f38321P;

    /* renamed from: Q, reason: collision with root package name */
    public static final T.a<I.i> f38322Q;

    /* renamed from: R, reason: collision with root package name */
    public static final T.a<Q.b> f38323R;

    /* renamed from: S, reason: collision with root package name */
    public static final T.a<Boolean> f38324S;

    /* renamed from: G, reason: collision with root package name */
    private final A0 f38325G;

    static {
        Class cls = Integer.TYPE;
        f38313H = T.a.a(cls, "camerax.core.imageCapture.captureMode");
        f38314I = T.a.a(cls, "camerax.core.imageCapture.flashMode");
        f38315J = T.a.a(P.class, "camerax.core.imageCapture.captureBundle");
        f38316K = T.a.a(Integer.class, "camerax.core.imageCapture.bufferFormat");
        f38317L = T.a.a(Integer.class, "camerax.core.imageCapture.outputFormat");
        T.a.a(Integer.class, "camerax.core.imageCapture.maxCaptureStages");
        f38318M = T.a.a(C.O.class, "camerax.core.imageCapture.imageReaderProxyProvider");
        f38319N = T.a.a(Boolean.TYPE, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        f38320O = T.a.a(cls, "camerax.core.imageCapture.flashType");
        f38321P = T.a.a(cls, "camerax.core.imageCapture.jpegCompressionQuality");
        f38322Q = T.a.a(I.i.class, "camerax.core.imageCapture.screenFlash");
        f38323R = T.a.a(Q.b.class, "camerax.core.useCase.postviewResolutionSelector");
        f38324S = T.a.a(Boolean.class, "camerax.core.useCase.isPostviewEnabled");
    }

    public C5098i0(@NonNull A0 a02) {
        this.f38325G = a02;
    }

    @Override // androidx.camera.core.impl.InterfaceC5100j0
    public final int i() {
        return ((Integer) a(InterfaceC5100j0.f38330j)).intValue();
    }

    @Override // androidx.camera.core.impl.J0
    @NonNull
    public final T s() {
        return this.f38325G;
    }
}
