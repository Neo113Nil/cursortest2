package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;

/* loaded from: classes8.dex */
public interface A extends J0 {

    /* renamed from: e, reason: collision with root package name */
    public static final T.a<c1> f38102e = T.a.a(c1.class, "camerax.core.camera.useCaseConfigFactory");

    /* renamed from: f, reason: collision with root package name */
    public static final T.a<Integer> f38103f;

    /* renamed from: g, reason: collision with root package name */
    public static final T.a<Q0> f38104g;

    /* renamed from: h, reason: collision with root package name */
    public static final T.a<Boolean> f38105h;

    /* renamed from: i, reason: collision with root package name */
    public static final T.a<Boolean> f38106i;

    static {
        T.a.a(AbstractC5094g0.class, "camerax.core.camera.compatibilityId");
        f38103f = T.a.a(Integer.class, "camerax.core.camera.useCaseCombinationRequiredRule");
        f38104g = T.a.a(Q0.class, "camerax.core.camera.SessionProcessor");
        T.a.a(Boolean.class, "camerax.core.camera.isZslDisabled");
        f38105h = T.a.a(Boolean.class, "camerax.core.camera.isPostviewSupported");
        f38106i = T.a.a(Boolean.class, "camerax.core.camera.isCaptureProcessProgressSupported");
    }

    @NonNull
    AbstractC5094g0 B();

    default Q0 H() {
        return (Q0) c(f38104g, null);
    }
}
