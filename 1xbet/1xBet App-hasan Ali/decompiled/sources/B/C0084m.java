package B;

import java.util.ArrayList;
import z0.C2733I;
import z0.InterfaceC2757n;

/* renamed from: B.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084m extends b0.o implements InterfaceC2757n {

    /* renamed from: y, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f688y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0084m) && kotlin.jvm.internal.l.a(this.f688y, ((C0084m) obj).f688y);
    }

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        ArrayList arrayList = this.f688y.f6884h;
        if (arrayList.size() <= 0) {
            c2733i.a();
        } else {
            L1.a.t(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.f688y.hashCode();
    }

    @Override // b0.o
    public final void o0() {
        this.f688y.getClass();
    }

    @Override // b0.o
    public final void q0() {
        this.f688y.c();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f688y + ')';
    }
}
