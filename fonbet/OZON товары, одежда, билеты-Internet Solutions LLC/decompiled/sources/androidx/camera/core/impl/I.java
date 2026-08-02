package androidx.camera.core.impl;

import C.InterfaceC2688h;
import C.InterfaceC2689i;
import C.InterfaceC2694n;
import androidx.annotation.NonNull;
import androidx.camera.core.w;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public interface I extends InterfaceC2688h, w.b {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        a(boolean z11) {
            this.mHoldsCameraSlot = z11;
        }

        final boolean a() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // C.InterfaceC2688h
    @NonNull
    default InterfaceC2689i a() {
        return k();
    }

    @Override // C.InterfaceC2688h
    @NonNull
    default InterfaceC2694n b() {
        return e();
    }

    @NonNull
    InterfaceC5129y0<a> c();

    @NonNull
    H e();

    default boolean f() {
        return b().e() == 0;
    }

    default void g(A a11) {
    }

    void h(@NonNull ArrayList arrayList);

    default void i(boolean z11) {
    }

    @NonNull
    E k();

    @NonNull
    default A l() {
        return D.a();
    }

    default void n(boolean z11) {
    }

    void o(@NonNull ArrayList arrayList);

    default boolean p() {
        return true;
    }
}
