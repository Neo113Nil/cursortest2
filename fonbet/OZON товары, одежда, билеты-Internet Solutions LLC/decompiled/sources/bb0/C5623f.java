package bb0;

import eb0.C6340a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: bb0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5623f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C6340a, Unit> f55805b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6340a f55806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5623f(Function1<? super C6340a, Unit> function1, C6340a c6340a) {
        super(0);
        this.f55805b = function1;
        this.f55806c = c6340a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55805b.invoke(this.f55806c);
        return Unit.f71690a;
    }
}
