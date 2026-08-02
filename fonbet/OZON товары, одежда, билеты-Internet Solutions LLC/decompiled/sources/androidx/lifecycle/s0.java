package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class s0 extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T<Object> f43384b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Object> f43385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s0(T<Object> t2, Function1<Object, Object> function1) {
        super(1);
        this.f43384b = t2;
        this.f43385c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f43384b.setValue(this.f43385c.invoke(obj));
        return Unit.f71690a;
    }
}
