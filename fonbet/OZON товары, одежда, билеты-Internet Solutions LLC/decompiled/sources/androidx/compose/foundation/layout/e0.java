package androidx.compose.foundation.layout;

import e1.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class e0 extends AbstractC7737t implements Function2<Z1.q, Z1.s, Z1.m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d.b f39477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(d.b bVar) {
        super(2);
        this.f39477b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Z1.m invoke(Z1.q qVar, Z1.s sVar) {
        return Z1.m.a(Z1.n.a(0, this.f39477b.a(0, (int) (4294967295L & qVar.e()))));
    }
}
