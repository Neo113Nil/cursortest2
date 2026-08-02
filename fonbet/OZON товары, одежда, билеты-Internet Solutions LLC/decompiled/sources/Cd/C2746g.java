package Cd;

import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;
import td.InterfaceC9857w;

/* renamed from: Cd.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2746g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2746g f4756a = new C2746g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        Set set;
        InterfaceC9836b it = (InterfaceC9836b) obj;
        int i11 = C2747h.f4757m;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InterfaceC9857w) {
            set = Q.f4738f;
            if (C7714v.A(set, Ld.D.b(it))) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
