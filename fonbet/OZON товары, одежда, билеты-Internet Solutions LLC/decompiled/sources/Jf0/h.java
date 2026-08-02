package Jf0;

import Ae.InterfaceC2395h;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class h extends AbstractC7737t implements Function0<InterfaceC2395h<? extends Collection<? extends Lf0.c>>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f14740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(b bVar) {
        super(0);
        this.f14740b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2395h<? extends Collection<? extends Lf0.c>> invoke() {
        return new g(b.f(this.f14740b));
    }
}
