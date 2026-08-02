package androidx.camera.core.impl;

import C.I;
import C.InterfaceC2689i;
import E.InterfaceC2894j;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.O0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public interface E extends InterfaceC2689i {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final E f38114a = new b();

    final class a implements InterfaceC2894j {
        @Override // E.InterfaceC2894j
        @NonNull
        public final com.google.common.util.concurrent.m<Void> a() {
            return I.k.h(null);
        }

        @Override // E.InterfaceC2894j
        @NonNull
        public final com.google.common.util.concurrent.m<Void> b() {
            return I.k.h(null);
        }
    }

    final class b implements E {
        @Override // C.InterfaceC2689i
        @NonNull
        public final com.google.common.util.concurrent.m<Void> a(float f7) {
            return I.k.h(null);
        }

        @Override // androidx.camera.core.impl.E
        public final void b(int i11) {
        }

        @Override // C.InterfaceC2689i
        @NonNull
        public final com.google.common.util.concurrent.m<Void> d(float f7) {
            return I.k.h(null);
        }

        @Override // C.InterfaceC2689i
        @NonNull
        public final com.google.common.util.concurrent.m<Void> e(boolean z11) {
            return I.k.h(null);
        }

        @Override // C.InterfaceC2689i
        @NonNull
        public final com.google.common.util.concurrent.m<C.D> f(@NonNull C.C c11) {
            return I.k.h(new C.D());
        }

        @Override // androidx.camera.core.impl.E
        public final void i(@NonNull T t2) {
        }

        @Override // androidx.camera.core.impl.E
        @NonNull
        public final com.google.common.util.concurrent.m j(int i11, int i12, @NonNull List list) {
            return I.k.h(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.impl.E
        @NonNull
        public final Rect k() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.E
        @NonNull
        public final T l() {
            return null;
        }

        @Override // androidx.camera.core.impl.E
        public final void m(@NonNull O0.b bVar) {
        }

        @Override // androidx.camera.core.impl.E
        public final void o() {
        }
    }

    public static final class c extends Exception {
    }

    public interface d {
    }

    void b(int i11);

    default void c() {
    }

    default void g() {
    }

    default void h(I.i iVar) {
    }

    void i(@NonNull T t2);

    @NonNull
    com.google.common.util.concurrent.m j(int i11, int i12, @NonNull List list);

    @NonNull
    Rect k();

    @NonNull
    T l();

    void m(@NonNull O0.b bVar);

    @NonNull
    default com.google.common.util.concurrent.m<InterfaceC2894j> n(int i11, int i12) {
        return I.k.h(new a());
    }

    void o();
}
