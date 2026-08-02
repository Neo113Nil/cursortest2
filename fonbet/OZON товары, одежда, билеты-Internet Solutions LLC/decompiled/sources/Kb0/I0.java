package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class I0 extends AbstractC7737t implements Function0<Oc0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K0 f15464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I0(K0 k02) {
        super(0);
        this.f15464b = k02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Oc0.a invoke() {
        Bc0.f m11;
        Bc0.a c11 = this.f15464b.f15522a.b0().c();
        if (c11 == null || (m11 = c11.m()) == null) {
            return null;
        }
        return m11.f();
    }
}
