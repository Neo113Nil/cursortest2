package Kb0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class J0 extends AbstractC7737t implements Function0<Oc0.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K0 f15465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J0(K0 k02) {
        super(0);
        this.f15465b = k02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Oc0.e invoke() {
        Bc0.f m11;
        InterfaceC4008j<Oc0.e> g10;
        Bc0.a c11 = this.f15465b.f15522a.b0().c();
        if (c11 == null || (m11 = c11.m()) == null || (g10 = m11.g()) == null) {
            return null;
        }
        return g10.getValue();
    }
}
