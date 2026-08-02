package Ff0;

import Gf0.C3101d;
import If0.C3241g;
import Mf0.C3629k;
import af0.C5018a;
import df0.C6195b;
import ef0.C6361a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    static final class a extends AbstractC7737t implements Function1<kf0.c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9456b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(kf0.c cVar) {
            kf0.c graph = cVar;
            Intrinsics.checkNotNullParameter(graph, "$this$graph");
            graph.a(new C6195b(c.f9454d, N.b(C3629k.class), new C5018a()));
            graph.a(new C6195b(b.f9453d, N.b(C3241g.class), new C5018a()));
            graph.a(new C6195b(Ff0.a.f9452d, N.b(C3101d.class), new C5018a()));
            graph.a(new C6195b(g.f9458d, N.b(Pf0.b.class), new C5018a()));
            graph.a(new C6195b(f.f9457d, N.b(Nf0.f.class), new C5018a()));
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull kf0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        C6361a.a(cVar, d.f9455b, c.f9454d, a.f9456b);
    }
}
