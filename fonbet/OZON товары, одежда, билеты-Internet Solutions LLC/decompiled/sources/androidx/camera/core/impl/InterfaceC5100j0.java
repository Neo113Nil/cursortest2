package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;

/* renamed from: androidx.camera.core.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5100j0 extends J0 {

    /* renamed from: j, reason: collision with root package name */
    public static final T.a<Integer> f38330j = T.a.a(Integer.TYPE, "camerax.core.imageInput.inputFormat");

    /* renamed from: k, reason: collision with root package name */
    public static final T.a<C.A> f38331k = T.a.a(C.A.class, "camerax.core.imageInput.inputDynamicRange");

    default int i() {
        return ((Integer) a(f38330j)).intValue();
    }

    @NonNull
    default C.A u() {
        C.A a11 = (C.A) c(f38331k, C.A.f4075c);
        a11.getClass();
        return a11;
    }

    default boolean w() {
        return d(f38331k);
    }
}
