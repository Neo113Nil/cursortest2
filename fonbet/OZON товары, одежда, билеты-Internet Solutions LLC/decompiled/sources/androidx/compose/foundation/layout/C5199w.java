package androidx.compose.foundation.layout;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.layout.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5199w extends AbstractC7737t implements Function1<m0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<m0> f39567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5199w(kotlin.jvm.internal.M<m0> m11) {
        super(1);
        this.f39567b = m11;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B1.m0, T] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0 m0Var) {
        this.f39567b.f71787a = m0Var;
        return Unit.f71690a;
    }
}
