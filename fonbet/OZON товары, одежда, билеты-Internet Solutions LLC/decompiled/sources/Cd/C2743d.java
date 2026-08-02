package Cd;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;
import td.c0;

/* renamed from: Cd.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2743d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final c0 f4753a;

    public C2743d(c0 c0Var) {
        this.f4753a = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        linkedHashMap = Q.f4741i;
        return Boolean.valueOf(linkedHashMap.containsKey(Ld.D.b(this.f4753a)));
    }
}
