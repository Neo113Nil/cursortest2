package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C5092f0 implements H {

    /* renamed from: a, reason: collision with root package name */
    private final H f38291a;

    public C5092f0(@NonNull H h11) {
        this.f38291a = h11;
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final Set<C.A> a() {
        return this.f38291a.a();
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public String b() {
        return this.f38291a.b();
    }

    @Override // C.InterfaceC2694n
    @NonNull
    public final androidx.lifecycle.P<C.r> c() {
        return this.f38291a.c();
    }

    @Override // androidx.camera.core.impl.H
    public final void d(@NonNull Executor executor, @NonNull AbstractC5111p abstractC5111p) {
        this.f38291a.d(executor, abstractC5111p);
    }

    @Override // C.InterfaceC2694n
    public final int e() {
        return this.f38291a.e();
    }

    @Override // androidx.camera.core.impl.H
    public final void f(@NonNull AbstractC5111p abstractC5111p) {
        this.f38291a.f(abstractC5111p);
    }

    @Override // C.InterfaceC2694n
    public int g(int i11) {
        return this.f38291a.g(i11);
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final InterfaceC5084b0 h() {
        return this.f38291a.h();
    }

    @Override // C.InterfaceC2694n
    public int i() {
        return this.f38291a.i();
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final List<Size> j(int i11) {
        return this.f38291a.j(i11);
    }

    @Override // C.InterfaceC2694n
    public boolean k() {
        return this.f38291a.k();
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final I0 l() {
        return this.f38291a.l();
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final List<Size> m(int i11) {
        return this.f38291a.m(i11);
    }

    @Override // androidx.camera.core.impl.H
    public final boolean n() {
        return this.f38291a.n();
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public H o() {
        return this.f38291a.o();
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final Y0 p() {
        return this.f38291a.p();
    }

    @Override // C.InterfaceC2694n
    @NonNull
    public final String q() {
        return this.f38291a.q();
    }
}
