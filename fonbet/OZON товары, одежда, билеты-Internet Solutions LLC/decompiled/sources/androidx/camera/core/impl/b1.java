package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.c1;
import androidx.camera.core.w;

/* loaded from: classes8.dex */
public interface b1<T extends androidx.camera.core.w> extends J.m<T>, InterfaceC5100j0 {

    /* renamed from: A, reason: collision with root package name */
    public static final T.a<Range<Integer>> f38261A;

    /* renamed from: B, reason: collision with root package name */
    public static final T.a<Boolean> f38262B;

    /* renamed from: C, reason: collision with root package name */
    public static final T.a<Boolean> f38263C;

    /* renamed from: D, reason: collision with root package name */
    public static final T.a<c1.b> f38264D;

    /* renamed from: E, reason: collision with root package name */
    public static final T.a<Integer> f38265E;

    /* renamed from: F, reason: collision with root package name */
    public static final T.a<Integer> f38266F;

    /* renamed from: v, reason: collision with root package name */
    public static final T.a<O0> f38267v = T.a.a(O0.class, "camerax.core.useCase.defaultSessionConfig");

    /* renamed from: w, reason: collision with root package name */
    public static final T.a<Q> f38268w = T.a.a(Q.class, "camerax.core.useCase.defaultCaptureConfig");

    /* renamed from: x, reason: collision with root package name */
    public static final T.a<O0.e> f38269x = T.a.a(O0.e.class, "camerax.core.useCase.sessionConfigUnpacker");

    /* renamed from: y, reason: collision with root package name */
    public static final T.a<Q.b> f38270y = T.a.a(Q.b.class, "camerax.core.useCase.captureConfigUnpacker");

    /* renamed from: z, reason: collision with root package name */
    public static final T.a<Integer> f38271z;

    public interface a<T extends androidx.camera.core.w, C extends b1<T>, B> extends C.B<T> {
        @NonNull
        C b();
    }

    static {
        Class cls = Integer.TYPE;
        f38271z = T.a.a(cls, "camerax.core.useCase.surfaceOccupancyPriority");
        f38261A = T.a.a(Range.class, "camerax.core.useCase.targetFrameRate");
        Class cls2 = Boolean.TYPE;
        f38262B = T.a.a(cls2, "camerax.core.useCase.zslDisabled");
        f38263C = T.a.a(cls2, "camerax.core.useCase.highResolutionDisabled");
        f38264D = T.a.a(c1.b.class, "camerax.core.useCase.captureType");
        f38265E = T.a.a(cls, "camerax.core.useCase.previewStabilizationMode");
        f38266F = T.a.a(cls, "camerax.core.useCase.videoStabilizationMode");
    }

    default Range<Integer> I(Range<Integer> range) {
        return (Range) c(f38261A, range);
    }

    default int L() {
        return ((Integer) c(f38271z, 0)).intValue();
    }

    default O0.e M() {
        return (O0.e) c(f38269x, null);
    }

    @NonNull
    default c1.b N() {
        return (c1.b) a(f38264D);
    }

    default boolean j() {
        return ((Boolean) c(f38263C, Boolean.FALSE)).booleanValue();
    }

    default int o() {
        return ((Integer) c(f38266F, 0)).intValue();
    }

    default int p() {
        return ((Integer) c(f38265E, 0)).intValue();
    }

    default boolean r() {
        return ((Boolean) c(f38262B, Boolean.FALSE)).booleanValue();
    }

    default O0 x() {
        return (O0) c(f38267v, null);
    }

    @NonNull
    default O0 z() {
        return (O0) a(f38267v);
    }
}
