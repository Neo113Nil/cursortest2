package Kb0;

import Sc.InterfaceC4008j;
import f3.AbstractC6409a;
import jd0.AbstractC7348a;
import jd0.C7349b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob0.C8685A;

/* loaded from: classes3.dex */
final class V0 extends AbstractC7737t implements Function1<AbstractC6409a, AbstractC7348a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ X0 f15581b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f15582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V0(X0 x02, String str) {
        super(1);
        this.f15581b = x02;
        this.f15582c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC7348a invoke(AbstractC6409a abstractC6409a) {
        K k11;
        K k12;
        AbstractC6409a addInitializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(addInitializer, "$this$addInitializer");
        X0 x02 = this.f15581b;
        k11 = x02.f15594a;
        InterfaceC4008j<C8685A> n11 = k11.l().n();
        k12 = x02.f15594a;
        return new C7349b(n11, this.f15582c, k12.C());
    }
}
