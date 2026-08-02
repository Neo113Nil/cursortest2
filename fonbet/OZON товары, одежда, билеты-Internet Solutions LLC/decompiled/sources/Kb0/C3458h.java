package Kb0;

import Hb0.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3458h extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3458h(K k11) {
        super(0);
        this.f15645b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        K k11 = this.f15645b;
        Fb0.e primaryDomain = k11.N().getPrimaryDomain();
        return ((Boolean) k11.z().getValue().b(f.o.f10813a)).booleanValue() ? primaryDomain.g() : primaryDomain.e();
    }
}
