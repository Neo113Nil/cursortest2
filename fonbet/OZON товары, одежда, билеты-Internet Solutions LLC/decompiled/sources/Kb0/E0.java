package Kb0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pd0.C8899a;

/* loaded from: classes7.dex */
final class E0 extends AbstractC7737t implements Function0<C8899a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E0(K k11) {
        super(0);
        this.f15447b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C8899a invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f15447b.f15514t;
        return new C8899a(interfaceC4008j);
    }
}
