package Ih0;

import Ih0.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f12544b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f12545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(b bVar, m mVar) {
        super(0);
        this.f12544b = bVar;
        this.f12545c = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Ch0.b bVar;
        e eVar;
        m mVar = this.f12545c;
        bVar = mVar.f12550c;
        Kh0.a deviceStats = bVar.a();
        b data = this.f12544b;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deviceStats, "deviceStats");
        m.c(mVar, new c(data.d(), data.h(), Long.valueOf(data.a()), 0, deviceStats, data.g(), data.b(), data.i(), data.f(), data.e(), data.c()));
        eVar = mVar.f12549b;
        ((Hh0.a) eVar).a(new e.a(data.d(), data.h()), true);
        return Unit.f71690a;
    }
}
