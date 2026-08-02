package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3321n0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f13323b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3321n0(Function1<? super Boolean, Unit> function1, boolean z11) {
        super(0);
        this.f13323b = function1;
        this.f13324c = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f13323b.invoke(Boolean.valueOf(!this.f13324c));
        return Unit.f71690a;
    }
}
