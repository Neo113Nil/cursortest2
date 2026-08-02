package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.material.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5216n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f40080b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5216n(C5210h<Object> c5210h, Object obj) {
        super(0);
        this.f40080b = c5210h;
        this.f40081c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C5210h<Object> c5210h = this.f40080b;
        C5211i c5211i = ((C5210h) c5210h).f40056o;
        J0.M<Object> l11 = c5210h.l();
        Object obj = this.f40081c;
        float e11 = l11.e(obj);
        if (!Float.isNaN(e11)) {
            c5211i.a(e11, 0.0f);
            C5210h.e(c5210h, null);
        }
        c5210h.x(obj);
        return Unit.f71690a;
    }
}
