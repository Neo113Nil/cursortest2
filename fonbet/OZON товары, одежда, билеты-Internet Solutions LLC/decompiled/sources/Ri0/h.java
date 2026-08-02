package Ri0;

import dj0.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function1<f.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final h f25144b = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(f.a aVar) {
        f.a TrackerIsland = aVar;
        Intrinsics.checkNotNullParameter(TrackerIsland, "$this$TrackerIsland");
        TrackerIsland.b(g.f25143b);
        return Unit.f71690a;
    }
}
