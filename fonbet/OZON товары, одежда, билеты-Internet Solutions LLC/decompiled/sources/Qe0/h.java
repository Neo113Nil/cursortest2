package Qe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function1<ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f23388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(long j11) {
        super(1);
        this.f23388b = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
        ru.ozon.mapsdk.libre.placemark.view.b<?> marker = bVar;
        Intrinsics.checkNotNullParameter(marker, "marker");
        long j11 = this.f23388b;
        if (j11 != 0) {
            marker.m(j11);
        }
        return Unit.f71690a;
    }
}
