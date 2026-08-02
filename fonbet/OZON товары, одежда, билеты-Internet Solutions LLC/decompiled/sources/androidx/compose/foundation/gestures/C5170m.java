package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.gestures.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5170m extends AbstractC7737t implements Function0<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5167j<Object> f39209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5170m(C5167j<Object> c5167j) {
        super(0);
        this.f39209b = c5167j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object b11;
        C5167j<Object> c5167j = this.f39209b;
        Object b12 = C5167j.b(c5167j);
        return b12 == null ? (Float.isNaN(c5167j.o()) || (b11 = c5167j.j().b(c5167j.o())) == null) ? c5167j.l() : b11 : b12;
    }
}
