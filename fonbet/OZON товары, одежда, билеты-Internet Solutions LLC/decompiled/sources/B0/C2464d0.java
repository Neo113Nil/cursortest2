package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2464d0 extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2464d0(O0 o02) {
        super(1);
        this.f1699b = o02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.f1699b.C(bool.booleanValue());
        return Unit.f71690a;
    }
}
