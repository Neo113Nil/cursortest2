package androidx.compose.material;

import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.T0;

/* loaded from: classes8.dex */
final class P extends AbstractC7737t implements Function1<EnumC3337r1, C3326o1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z1.d f39931b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<EnumC3337r1, Boolean> f39932c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ T0 f39933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(Z1.d dVar, Function1 function1, T0 t02) {
        super(1);
        this.f39931b = dVar;
        this.f39932c = function1;
        this.f39933d = t02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3326o1 invoke(EnumC3337r1 enumC3337r1) {
        return new C3326o1(enumC3337r1, this.f39931b, this.f39932c, this.f39933d);
    }
}
