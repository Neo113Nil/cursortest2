package androidx.compose.foundation.lazy.layout;

import B1.W;
import B1.z0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import x0.C10574C;
import x0.InterfaceC10573B;

/* loaded from: classes.dex */
final class j extends AbstractC7737t implements Function2<z0, Z1.b, W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f39652b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC10573B, Z1.b, W> f39653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    j(f fVar, Function2<? super InterfaceC10573B, ? super Z1.b, ? extends W> function2) {
        super(2);
        this.f39652b = fVar;
        this.f39653c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final W invoke(z0 z0Var, Z1.b bVar) {
        long p11 = bVar.p();
        return this.f39653c.invoke(new C10574C(this.f39652b, z0Var), Z1.b.a(p11));
    }
}
