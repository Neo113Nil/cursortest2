package androidx.compose.ui.input.pointer;

import E.InterfaceC0104i0;
import b0.o;
import kotlin.jvm.internal.l;
import t0.H;
import t0.z;
import z0.Z;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final Object f6930k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6931l;

    /* renamed from: m, reason: collision with root package name */
    public final z f6932m;

    public SuspendPointerInputElement(Object obj, InterfaceC0104i0 interfaceC0104i0, z zVar, int i) {
        interfaceC0104i0 = (i & 2) != 0 ? null : interfaceC0104i0;
        this.f6930k = obj;
        this.f6931l = interfaceC0104i0;
        this.f6932m = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return l.a(this.f6930k, suspendPointerInputElement.f6930k) && l.a(this.f6931l, suspendPointerInputElement.f6931l) && this.f6932m == suspendPointerInputElement.f6932m;
    }

    public final int hashCode() {
        Object obj = this.f6930k;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f6931l;
        return this.f6932m.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // z0.Z
    public final o i() {
        return new H(this.f6930k, this.f6931l, this.f6932m);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        H h3 = (H) oVar;
        Object obj = h3.f19458y;
        Object obj2 = this.f6930k;
        boolean z3 = !l.a(obj, obj2);
        h3.f19458y = obj2;
        Object obj3 = h3.f19459z;
        Object obj4 = this.f6931l;
        if (!l.a(obj3, obj4)) {
            z3 = true;
        }
        h3.f19459z = obj4;
        Class<?> cls = h3.f19450B.getClass();
        z zVar = this.f6932m;
        if (cls == z.class ? z3 : true) {
            h3.A0();
        }
        h3.f19450B = zVar;
    }
}
