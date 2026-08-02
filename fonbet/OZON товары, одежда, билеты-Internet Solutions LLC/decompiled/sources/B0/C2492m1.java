package B0;

import B0.O0;
import Q1.C3843l;
import Q1.InterfaceC3841j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2492m1 extends AbstractC7737t implements Function1<List<? extends InterfaceC3841j>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3843l f1860b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Q1.K, Unit> f1861c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Q1.V> f1862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2492m1(C3843l c3843l, Function1<? super Q1.K, Unit> function1, kotlin.jvm.internal.M<Q1.V> m11) {
        super(1);
        this.f1860b = c3843l;
        this.f1861c = function1;
        this.f1862d = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends InterfaceC3841j> list) {
        Q1.V v11 = this.f1862d.f71787a;
        Q1.K a11 = this.f1860b.a(list);
        if (v11 != null) {
            v11.c(null, a11);
        }
        ((O0.b) this.f1861c).invoke(a11);
        return Unit.f71690a;
    }
}
