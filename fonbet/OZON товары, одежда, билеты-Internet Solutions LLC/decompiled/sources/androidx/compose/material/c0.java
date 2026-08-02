package androidx.compose.material;

import hd.C6915b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class c0 extends AbstractC7737t implements Function1<Z1.d, Z1.m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Float> f39992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(Function0<Float> function0) {
        super(1);
        this.f39992b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Z1.m invoke(Z1.d dVar) {
        return Z1.m.a(Z1.n.a(C6915b.c(this.f39992b.invoke().floatValue()), 0));
    }
}
