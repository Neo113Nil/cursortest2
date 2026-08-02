package Ud;

import Ud.InterfaceC4059b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f27601a = new m();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w withOptions = (w) obj;
        u uVar = n.f27602a;
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.b();
        withOptions.g(InterfaceC4059b.a.f27588a);
        withOptions.c(v.ALL);
        return Unit.f71690a;
    }
}
