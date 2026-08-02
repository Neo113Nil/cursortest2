package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Intrinsics;
import r0.InterfaceC9122b;
import r0.InterfaceC9133m;

/* renamed from: androidx.compose.foundation.gestures.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5168k implements InterfaceC9122b {

    /* renamed from: a, reason: collision with root package name */
    private Object f39204a;

    /* renamed from: b, reason: collision with root package name */
    private Object f39205b;

    /* renamed from: c, reason: collision with root package name */
    private float f39206c = Float.NaN;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5167j<Object> f39207d;

    C5168k(C5167j<Object> c5167j) {
        this.f39207d = c5167j;
    }

    @Override // r0.InterfaceC9122b
    public final void a(float f7, float f11) {
        C5167j<Object> c5167j = this.f39207d;
        float o11 = c5167j.o();
        C5167j.f(c5167j, f7);
        C5167j.e(c5167j, f11);
        if (Float.isNaN(o11)) {
            return;
        }
        boolean z11 = f7 >= o11;
        if (c5167j.o() == c5167j.j().e(c5167j.l())) {
            Object a11 = c5167j.j().a(c5167j.o() + (z11 ? 1.0f : -1.0f), z11);
            if (a11 == null) {
                a11 = c5167j.l();
            }
            if (z11) {
                this.f39204a = c5167j.l();
                this.f39205b = a11;
            } else {
                this.f39204a = a11;
                this.f39205b = c5167j.l();
            }
        } else {
            Object a12 = c5167j.j().a(c5167j.o(), false);
            if (a12 == null) {
                a12 = c5167j.l();
            }
            Object a13 = c5167j.j().a(c5167j.o(), true);
            if (a13 == null) {
                a13 = c5167j.l();
            }
            this.f39204a = a12;
            this.f39205b = a13;
        }
        InterfaceC9133m<Object> j11 = c5167j.j();
        Object obj = this.f39204a;
        Intrinsics.f(obj);
        float e11 = j11.e(obj);
        InterfaceC9133m<Object> j12 = c5167j.j();
        Object obj2 = this.f39205b;
        Intrinsics.f(obj2);
        this.f39206c = Math.abs(e11 - j12.e(obj2));
        if (Math.abs(c5167j.o() - c5167j.j().e(c5167j.l())) >= this.f39206c / 2.0f) {
            Object obj3 = z11 ? this.f39205b : this.f39204a;
            if (obj3 == null) {
                obj3 = c5167j.l();
            }
            if (c5167j.k().invoke(obj3).booleanValue()) {
                C5167j.c(c5167j, obj3);
            }
        }
    }
}
