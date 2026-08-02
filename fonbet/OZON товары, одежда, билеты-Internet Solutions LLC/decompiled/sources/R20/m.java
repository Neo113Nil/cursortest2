package R20;

import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class m extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f24523b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.j f24524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(u uVar, a.j jVar) {
        super(1);
        this.f24523b = uVar;
        this.f24524c = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.f24523b.j0(this.f24524c.getId(), booleanValue);
        return Unit.f71690a;
    }
}
