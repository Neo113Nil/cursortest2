package androidx.lifecycle;

import androidx.lifecycle.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class v0 extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f43395b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<P<Object>> f43396c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ T<Object> f43397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    v0(Function1<Object, P<Object>> function1, kotlin.jvm.internal.M<P<Object>> m11, T<Object> t2) {
        super(1);
        this.f43395b = (AbstractC7737t) function1;
        this.f43396c = m11;
        this.f43397d = t2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.P] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        ?? r42 = (P) this.f43395b.invoke(obj);
        kotlin.jvm.internal.M<P<Object>> m11 = this.f43396c;
        P<Object> p11 = m11.f71787a;
        if (p11 != r42) {
            T<Object> t2 = this.f43397d;
            if (p11 != null) {
                t2.b(p11);
            }
            m11.f71787a = r42;
            if (r42 != 0) {
                t2.a(r42, new t0.a(new u0(t2)));
            }
        }
        return Unit.f71690a;
    }
}
