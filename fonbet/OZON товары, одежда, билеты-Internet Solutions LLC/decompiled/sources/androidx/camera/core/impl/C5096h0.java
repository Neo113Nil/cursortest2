package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.h;
import androidx.camera.core.impl.T;

/* renamed from: androidx.camera.core.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5096h0 implements b1<androidx.camera.core.h>, InterfaceC5102k0, J.n {

    /* renamed from: H, reason: collision with root package name */
    public static final T.a<Integer> f38303H = T.a.a(h.b.class, "camerax.core.imageAnalysis.backpressureStrategy");

    /* renamed from: I, reason: collision with root package name */
    public static final T.a<Integer> f38304I = T.a.a(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");

    /* renamed from: J, reason: collision with root package name */
    public static final T.a<C.O> f38305J = T.a.a(C.O.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");

    /* renamed from: K, reason: collision with root package name */
    public static final T.a<Integer> f38306K = T.a.a(h.e.class, "camerax.core.imageAnalysis.outputImageFormat");

    /* renamed from: L, reason: collision with root package name */
    public static final T.a<Boolean> f38307L = T.a.a(Boolean.class, "camerax.core.imageAnalysis.onePixelShiftEnabled");

    /* renamed from: M, reason: collision with root package name */
    public static final T.a<Boolean> f38308M = T.a.a(Boolean.class, "camerax.core.imageAnalysis.outputImageRotationEnabled");

    /* renamed from: G, reason: collision with root package name */
    private final A0 f38309G;

    public C5096h0(@NonNull A0 a02) {
        this.f38309G = a02;
    }

    @Override // androidx.camera.core.impl.InterfaceC5100j0
    public final int i() {
        return 35;
    }

    @Override // androidx.camera.core.impl.J0
    @NonNull
    public final T s() {
        return this.f38309G;
    }
}
