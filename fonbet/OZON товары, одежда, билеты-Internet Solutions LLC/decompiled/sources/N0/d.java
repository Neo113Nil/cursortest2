package N0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f18298b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f18299c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Z1.s f18300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(s sVar, Function0<Unit> function0, String str, Z1.s sVar2) {
        super(0);
        this.f18298b = sVar;
        this.f18299c = function0;
        this.f18300d = sVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f18298b.k(this.f18299c, this.f18300d);
        return Unit.f71690a;
    }
}
