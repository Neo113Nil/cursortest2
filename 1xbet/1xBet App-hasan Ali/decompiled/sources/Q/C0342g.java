package Q;

import I.C0160m;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;
import java.util.List;

/* renamed from: Q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342g extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final C0342g f4828c = new C0342g(0, 2, 1);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        int i = ((X.f) c0160m.e(0)).f6057a;
        List list = (List) c0160m.e(1);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            int i6 = i + i5;
            interfaceC0284c.a(i6, obj);
            interfaceC0284c.h(i6, obj);
        }
    }
}
