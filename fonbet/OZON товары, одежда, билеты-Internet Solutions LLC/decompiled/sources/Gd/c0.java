package Gd;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9839e;
import te.b;

/* loaded from: classes10.dex */
public final class c0 extends b.AbstractC2189b<InterfaceC9839e, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3085o f10013a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LinkedHashSet f10014b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<ce.l, Collection<Object>> f10015c;

    c0(C3085o c3085o, LinkedHashSet linkedHashSet, Function1 function1) {
        this.f10013a = c3085o;
        this.f10014b = linkedHashSet;
        this.f10015c = function1;
    }

    @Override // te.b.d
    public final /* bridge */ /* synthetic */ Object a() {
        return Unit.f71690a;
    }

    @Override // te.b.d
    public final boolean b(Object obj) {
        InterfaceC9839e current = (InterfaceC9839e) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == this.f10013a) {
            return true;
        }
        ce.l q02 = current.q0();
        Intrinsics.checkNotNullExpressionValue(q02, "getStaticScope(...)");
        if (!(q02 instanceof e0)) {
            return true;
        }
        this.f10014b.addAll(this.f10015c.invoke(q02));
        return false;
    }
}
