package Ih0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f12533b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f12534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(b bVar, g gVar) {
        super(0);
        this.f12533b = bVar;
        this.f12534c = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Ch0.b bVar;
        Ch0.a aVar;
        g gVar = this.f12534c;
        bVar = gVar.f12536b;
        Kh0.a deviceStats = bVar.a();
        b data = this.f12533b;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deviceStats, "deviceStats");
        c cVar = new c(data.d(), data.h(), Long.valueOf(data.a()), 0, deviceStats, data.g(), data.b(), data.i(), data.f(), data.e(), data.c());
        aVar = gVar.f12535a;
        aVar.a(cVar);
        return Unit.f71690a;
    }
}
