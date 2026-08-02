package Cd;

import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;

/* renamed from: Cd.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2745f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2745f f4755a = new C2745f();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set set;
        InterfaceC9836b it = (InterfaceC9836b) obj;
        int i11 = C2747h.f4757m;
        Intrinsics.checkNotNullParameter(it, "it");
        set = Q.f4738f;
        return Boolean.valueOf(C7714v.A(set, Ld.D.b(it)));
    }
}
