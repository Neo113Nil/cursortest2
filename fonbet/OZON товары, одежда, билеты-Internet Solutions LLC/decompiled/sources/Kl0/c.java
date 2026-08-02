package Kl0;

import jb.InterfaceC7332a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC7913b;

/* loaded from: classes4.dex */
public final class c extends AbstractC7737t implements Function2<InterfaceC7332a, InterfaceC7913b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f16011b = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC7332a interfaceC7332a, InterfaceC7913b interfaceC7913b) {
        InterfaceC7332a service = interfaceC7332a;
        InterfaceC7913b callback = interfaceC7913b;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(callback, "callback");
        service.t(callback);
        return Unit.f71690a;
    }
}
