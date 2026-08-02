package androidx.compose.material;

import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.T0;

/* loaded from: classes8.dex */
final class N extends AbstractC7737t implements Function0<C3326o1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EnumC3337r1 f39926b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z1.d f39927c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<EnumC3337r1, Boolean> f39928d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ T0 f39929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(EnumC3337r1 enumC3337r1, Z1.d dVar, Function1 function1, T0 t02) {
        super(0);
        this.f39926b = enumC3337r1;
        this.f39927c = dVar;
        this.f39928d = function1;
        this.f39929e = t02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C3326o1 invoke() {
        return new C3326o1(this.f39926b, this.f39927c, this.f39928d, this.f39929e);
    }
}
