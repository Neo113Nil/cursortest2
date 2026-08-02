package androidx.compose.foundation.layout;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class A extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U0.b<B1.W> f39297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(U0.b<B1.W> bVar) {
        super(1);
        this.f39297b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        U0.b<B1.W> bVar = this.f39297b;
        int m11 = bVar.m();
        if (m11 > 0) {
            B1.W[] l11 = bVar.l();
            int i11 = 0;
            do {
                l11[i11].u();
                i11++;
            } while (i11 < m11);
        }
        return Unit.f71690a;
    }
}
