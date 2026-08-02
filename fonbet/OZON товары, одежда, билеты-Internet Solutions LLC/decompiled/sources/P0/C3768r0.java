package P0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: P0.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3768r0 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21321b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f21322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3768r0(C3787x1 c3787x1, xe.M m11) {
        super(0);
        this.f21321b = c3787x1;
        this.f21322c = m11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C3787x1 c3787x1 = this.f21321b;
        if (c3787x1.c().o().invoke(EnumC3790y1.PartiallyExpanded).booleanValue()) {
            C10727i.c(this.f21322c, null, null, new C3766q0(c3787x1, null), 3);
        }
        return Boolean.TRUE;
    }
}
