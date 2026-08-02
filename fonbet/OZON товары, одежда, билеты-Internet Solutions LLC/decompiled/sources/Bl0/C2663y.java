package Bl0;

import Bl0.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Bl0.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2663y extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f3999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2663y(I i11) {
        super(1);
        this.f3999b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        Throwable it = th2;
        Intrinsics.checkNotNullParameter(it, "it");
        b0.b bVar = this.f3999b.f3925e;
        C2659u messageBuilder = C2659u.f3993b;
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        return Unit.f71690a;
    }
}
