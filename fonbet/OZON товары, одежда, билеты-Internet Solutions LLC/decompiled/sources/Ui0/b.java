package Ui0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mj0.InterfaceC8344a;
import qj0.InterfaceC9075e;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<InterfaceC9075e<?>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f27825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar) {
        super(1);
        this.f27825b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC9075e<?> interfaceC9075e) {
        InterfaceC9075e<?> config = interfaceC9075e;
        Intrinsics.checkNotNullParameter(config, "config");
        this.f27825b.i0(new InterfaceC8344a.b(config));
        return Unit.f71690a;
    }
}
