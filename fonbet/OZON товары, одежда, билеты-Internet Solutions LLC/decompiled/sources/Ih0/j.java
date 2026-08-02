package Ih0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f12541b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f12542c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n f12543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(b bVar, m mVar, n nVar) {
        super(0);
        this.f12541b = bVar;
        this.f12542c = mVar;
        this.f12543d = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Ch0.b bVar;
        m mVar = this.f12542c;
        bVar = mVar.f12550c;
        Kh0.a deviceStats = bVar.a();
        b data = this.f12541b;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deviceStats, "deviceStats");
        m.c(mVar, new c(data.d(), data.h(), Long.valueOf(data.a()), 0, deviceStats, data.g(), data.b(), data.i(), data.f(), data.e(), data.c()));
        m.d(mVar, data, this.f12543d, true, true);
        return Unit.f71690a;
    }
}
