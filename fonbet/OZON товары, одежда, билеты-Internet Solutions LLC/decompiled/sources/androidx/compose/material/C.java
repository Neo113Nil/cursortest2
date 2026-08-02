package androidx.compose.material;

import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes8.dex */
final class C extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3326o1 f39878b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f39879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(C3326o1 c3326o1, xe.M m11) {
        super(0);
        this.f39878b = c3326o1;
        this.f39879c = m11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C3326o1 c3326o1 = this.f39878b;
        if (c3326o1.c().o().invoke(EnumC3337r1.Expanded).booleanValue()) {
            C10727i.c(this.f39879c, null, null, new B(c3326o1, null), 3);
        }
        return Boolean.TRUE;
    }
}
