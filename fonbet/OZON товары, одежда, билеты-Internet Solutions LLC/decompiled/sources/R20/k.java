package R20;

import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f24519b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.i f24520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(u uVar, a.i iVar) {
        super(1);
        this.f24519b = uVar;
        this.f24520c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f24519b.i0(num.intValue(), this.f24520c.getId());
        return Unit.f71690a;
    }
}
