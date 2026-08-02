package androidx.compose.foundation.lazy.layout;

import D1.H0;
import D1.I0;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

/* loaded from: classes.dex */
final class u extends AbstractC7737t implements Function1<I0, H0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<List<o>> f39702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(M<List<o>> m11) {
        super(1);
        this.f39702b = m11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final H0 invoke(I0 i02) {
        T t2;
        I0 i03 = i02;
        Intrinsics.g(i03, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
        o I12 = ((v) i03).I1();
        M<List<o>> m11 = this.f39702b;
        List<o> list = m11.f71787a;
        if (list != null) {
            list.add(I12);
            t2 = list;
        } else {
            t2 = C7714v.m0(I12);
        }
        m11.f71787a = t2;
        return H0.SkipSubtreeAndContinueTraversal;
    }
}
