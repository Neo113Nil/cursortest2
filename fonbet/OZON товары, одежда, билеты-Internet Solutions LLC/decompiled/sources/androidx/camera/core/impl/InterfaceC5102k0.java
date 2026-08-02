package androidx.camera.core.impl;

import C.C2681a;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.core.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5102k0 extends J0 {

    /* renamed from: l, reason: collision with root package name */
    public static final T.a<Integer> f38342l = T.a.a(C2681a.class, "camerax.core.imageOutput.targetAspectRatio");

    /* renamed from: m, reason: collision with root package name */
    public static final T.a<Integer> f38343m;

    /* renamed from: n, reason: collision with root package name */
    public static final T.a<Integer> f38344n;

    /* renamed from: o, reason: collision with root package name */
    public static final T.a<Integer> f38345o;

    /* renamed from: p, reason: collision with root package name */
    public static final T.a<Size> f38346p;

    /* renamed from: q, reason: collision with root package name */
    public static final T.a<Size> f38347q;

    /* renamed from: r, reason: collision with root package name */
    public static final T.a<Size> f38348r;

    /* renamed from: s, reason: collision with root package name */
    public static final T.a<List<Pair<Integer, Size[]>>> f38349s;

    /* renamed from: t, reason: collision with root package name */
    public static final T.a<Q.b> f38350t;

    /* renamed from: u, reason: collision with root package name */
    public static final T.a<List<Size>> f38351u;

    static {
        Class cls = Integer.TYPE;
        f38343m = T.a.a(cls, "camerax.core.imageOutput.targetRotation");
        f38344n = T.a.a(cls, "camerax.core.imageOutput.appTargetRotation");
        f38345o = T.a.a(cls, "camerax.core.imageOutput.mirrorMode");
        f38346p = T.a.a(Size.class, "camerax.core.imageOutput.targetResolution");
        f38347q = T.a.a(Size.class, "camerax.core.imageOutput.defaultResolution");
        f38348r = T.a.a(Size.class, "camerax.core.imageOutput.maxResolution");
        f38349s = T.a.a(List.class, "camerax.core.imageOutput.supportedResolutions");
        f38350t = T.a.a(Q.b.class, "camerax.core.imageOutput.resolutionSelector");
        f38351u = T.a.a(List.class, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void G(@NonNull InterfaceC5102k0 interfaceC5102k0) {
        boolean J11 = interfaceC5102k0.J();
        boolean z11 = interfaceC5102k0.n() != null;
        if (J11 && z11) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC5102k0.E() != null) {
            if (J11 || z11) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int C() {
        return ((Integer) c(f38344n, -1)).intValue();
    }

    default List D() {
        return (List) c(f38349s, null);
    }

    default Q.b E() {
        return (Q.b) c(f38350t, null);
    }

    default Size F() {
        return (Size) c(f38347q, null);
    }

    default boolean J() {
        return d(f38342l);
    }

    default int K() {
        return ((Integer) a(f38342l)).intValue();
    }

    @NonNull
    default Q.b k() {
        return (Q.b) a(f38350t);
    }

    default int m() {
        return ((Integer) c(f38343m, 0)).intValue();
    }

    default Size n() {
        return (Size) c(f38346p, null);
    }

    default Size q() {
        return (Size) c(f38348r, null);
    }

    default int v() {
        return ((Integer) c(f38345o, -1)).intValue();
    }

    default ArrayList y() {
        List list = (List) c(f38351u, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }
}
