package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: I0.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3204q0 extends AbstractC7737t implements Function1<C3218y, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f11585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3204q0(kotlin.jvm.internal.I i11) {
        super(1);
        this.f11585b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C3218y c3218y) {
        if (c3218y.b().length() > 0) {
            this.f11585b.f71783a = false;
        }
        return Unit.f71690a;
    }
}
