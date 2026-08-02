package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class u0 extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T<Object> f43391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u0(T<Object> t2) {
        super(1);
        this.f43391b = t2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f43391b.setValue(obj);
        return Unit.f71690a;
    }
}
