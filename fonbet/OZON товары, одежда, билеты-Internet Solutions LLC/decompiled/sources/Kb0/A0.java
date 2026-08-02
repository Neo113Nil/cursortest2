package Kb0;

import Hb0.f;
import java.net.URI;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class A0 extends AbstractC7737t implements Function0<URI> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A0(K k11) {
        super(0);
        this.f15442b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final URI invoke() {
        K k11 = this.f15442b;
        boolean booleanValue = ((Boolean) k11.z().getValue().b(f.o.f10813a)).booleanValue();
        Fb0.e primaryDomain = k11.N().getPrimaryDomain();
        return URI.create(booleanValue ? primaryDomain.g() : primaryDomain.i());
    }
}
