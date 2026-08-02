package Q;

import I.C0160m;
import P.C0280a;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public final int f4808a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4809b;

    public I(int i, int i5) {
        this.f4808a = i;
        this.f4809b = i5;
    }

    public abstract void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5);

    public C0280a b(C0160m c0160m) {
        return null;
    }

    public final String toString() {
        String b3 = kotlin.jvm.internal.x.a(getClass()).b();
        return b3 == null ? "" : b3;
    }

    public /* synthetic */ I(int i, int i5, int i6) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i5);
    }
}
