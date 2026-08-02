package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import nd0.C8578a;

/* renamed from: Kb0.s0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3480s0 extends AbstractC7737t implements Function0<C8578a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3480s0(K k11) {
        super(0);
        this.f15730b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C8578a invoke() {
        K k11 = this.f15730b;
        return new C8578a(k11.N(), k11.M().o());
    }
}
