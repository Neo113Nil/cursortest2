package androidx.compose.foundation.layout;

import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class g0 extends AbstractC7737t implements Function2<Z1.q, Z1.s, Z1.m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b.InterfaceC0966b f39484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(InterfaceC6250b.InterfaceC0966b interfaceC0966b) {
        super(2);
        this.f39484b = interfaceC0966b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Z1.m invoke(Z1.q qVar, Z1.s sVar) {
        int e11 = (int) (qVar.e() >> 32);
        return Z1.m.a(Z1.n.a(this.f39484b.a(0, e11, sVar), 0));
    }
}
