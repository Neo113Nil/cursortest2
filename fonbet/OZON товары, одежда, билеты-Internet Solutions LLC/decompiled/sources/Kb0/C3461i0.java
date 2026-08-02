package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.i0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3461i0 extends AbstractC7737t implements Function0<Jc0.c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3461i0(K k11) {
        super(0);
        this.f15680b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Jc0.c invoke() {
        K k11 = this.f15680b;
        return new Jc0.c(k11.m(), k11.W().n(), k11.W().i(), k11.R(), k11.p());
    }
}
