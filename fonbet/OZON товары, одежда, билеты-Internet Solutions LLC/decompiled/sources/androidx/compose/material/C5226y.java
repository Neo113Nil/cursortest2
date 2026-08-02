package androidx.compose.material;

import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: androidx.compose.material.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5226y extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3326o1 f40154b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f40155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5226y(C3326o1 c3326o1, xe.M m11) {
        super(0);
        this.f40154b = c3326o1;
        this.f40155c = m11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C3326o1 c3326o1 = this.f40154b;
        if (c3326o1.c().o().invoke(EnumC3337r1.Hidden).booleanValue()) {
            C10727i.c(this.f40155c, null, null, new C5225x(c3326o1, null), 3);
        }
        return Unit.f71690a;
    }
}
