package Bl0;

import Bl0.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class C extends AbstractC7737t implements Function1<Unit, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f3915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(I i11) {
        super(1);
        this.f3915b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        b0.b bVar = this.f3915b.f3925e;
        A messageBuilder = A.f3914b;
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        return Unit.f71690a;
    }
}
