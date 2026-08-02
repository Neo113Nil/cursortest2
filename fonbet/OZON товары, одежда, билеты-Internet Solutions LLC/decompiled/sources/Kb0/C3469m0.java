package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.m0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3469m0 extends AbstractC7737t implements Function0<Ub0.c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15718b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3469m0(K k11) {
        super(0);
        this.f15718b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Ub0.c invoke() {
        return new Ub0.c(this.f15718b.N().getLocaleProvider());
    }
}
