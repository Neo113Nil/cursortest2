package Xa0;

import Xa0.a;
import af0.C5018a;
import df0.C6195b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function1<kf0.c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f34240b = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(kf0.c cVar) {
        kf0.c graph = cVar;
        Intrinsics.checkNotNullParameter(graph, "$this$graph");
        a.C0612a c0612a = a.C0612a.f34236d;
        d b11 = N.b(Za0.b.class);
        C5018a c5018a = new C5018a();
        b.f34239b.invoke(c5018a);
        graph.a(new C6195b(c0612a, b11, c5018a));
        return Unit.f71690a;
    }
}
