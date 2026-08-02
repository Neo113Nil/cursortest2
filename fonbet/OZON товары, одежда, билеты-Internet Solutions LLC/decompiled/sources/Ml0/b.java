package Ml0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC7913b;
import tb.InterfaceC9792a;

/* loaded from: classes4.dex */
public final class b extends AbstractC7737t implements Function2<InterfaceC9792a, InterfaceC7913b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f18162b = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC9792a interfaceC9792a, InterfaceC7913b interfaceC7913b) {
        InterfaceC9792a service = interfaceC9792a;
        InterfaceC7913b callback = interfaceC7913b;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(callback, "callback");
        service.s(callback);
        return Unit.f71690a;
    }
}
