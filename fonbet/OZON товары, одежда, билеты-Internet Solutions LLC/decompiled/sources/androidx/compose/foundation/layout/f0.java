package androidx.compose.foundation.layout;

import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class f0 extends AbstractC7737t implements Function2<Z1.q, Z1.s, Z1.m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b f39481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(InterfaceC6250b interfaceC6250b) {
        super(2);
        this.f39481b = interfaceC6250b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Z1.m invoke(Z1.q qVar, Z1.s sVar) {
        return Z1.m.a(this.f39481b.a(0L, qVar.e(), sVar));
    }
}
