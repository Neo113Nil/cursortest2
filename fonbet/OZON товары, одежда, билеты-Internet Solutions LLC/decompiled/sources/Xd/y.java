package Xd;

import je.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9815F;

/* loaded from: classes.dex */
final class y implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final N f34416a;

    public y(N n11) {
        this.f34416a = n11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9815F it = (InterfaceC9815F) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f34416a;
    }
}
