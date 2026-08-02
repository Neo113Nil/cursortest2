package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.material.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5215m extends AbstractC7737t implements Function0<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f40079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5215m(C5210h<Object> c5210h) {
        super(0);
        this.f40079b = c5210h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object j11;
        C5210h<Object> c5210h = this.f40079b;
        Object c11 = C5210h.c(c5210h);
        if (c11 != null) {
            return c11;
        }
        float s11 = c5210h.s();
        if (Float.isNaN(s11)) {
            return c5210h.p();
        }
        j11 = c5210h.j(s11, 0.0f, c5210h.p());
        return j11;
    }
}
