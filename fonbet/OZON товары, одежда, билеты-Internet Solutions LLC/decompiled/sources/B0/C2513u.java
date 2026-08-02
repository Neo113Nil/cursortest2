package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2513u extends AbstractC7737t implements Function1<K1.K, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U1 f1970b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f1971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2513u(U1 u12, Function1<? super K1.K, Unit> function1) {
        super(1);
        this.f1970b = u12;
        this.f1971c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(K1.K k11) {
        K1.K k12 = k11;
        U1 u12 = this.f1970b;
        if (u12 != null) {
            u12.h(k12);
        }
        Function1<K1.K, Unit> function1 = this.f1971c;
        if (function1 != null) {
            function1.invoke(k12);
        }
        return Unit.f71690a;
    }
}
