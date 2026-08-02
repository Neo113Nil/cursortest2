package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: P0.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3727d0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f20998b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f20999c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3727d0(C3787x1 c3787x1, Function0 function0, xe.M m11) {
        super(0);
        this.f20998b = c3787x1;
        this.f20999c = m11;
        this.f21000d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C3787x1 c3787x1 = this.f20998b;
        if (c3787x1.c().o().invoke(EnumC3790y1.Hidden).booleanValue()) {
            ((xe.H0) C10727i.c(this.f20999c, null, null, new C3721b0(c3787x1, null), 3)).y(new C3724c0(c3787x1, this.f21000d));
        }
        return Unit.f71690a;
    }
}
