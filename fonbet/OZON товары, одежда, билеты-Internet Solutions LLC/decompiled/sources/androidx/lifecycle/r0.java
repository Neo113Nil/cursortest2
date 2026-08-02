package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class r0 extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T<Object> f43382b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f43383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r0(T<Object> t2, kotlin.jvm.internal.I i11) {
        super(1);
        this.f43382b = t2;
        this.f43383c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        T<Object> t2 = this.f43382b;
        Object value = t2.getValue();
        kotlin.jvm.internal.I i11 = this.f43383c;
        if (i11.f71783a || ((value == null && obj != null) || (value != null && !value.equals(obj)))) {
            i11.f71783a = false;
            t2.setValue(obj);
        }
        return Unit.f71690a;
    }
}
