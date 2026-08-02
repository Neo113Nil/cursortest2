package J0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: J0.k2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3311k2 extends AbstractC7737t implements Function1<A0<InterfaceC3295g2>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3311k2(InterfaceC3295g2 interfaceC3295g2) {
        super(1);
        this.f13262b = interfaceC3295g2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(A0<InterfaceC3295g2> a02) {
        return Boolean.valueOf(Intrinsics.d(a02.c(), this.f13262b));
    }
}
