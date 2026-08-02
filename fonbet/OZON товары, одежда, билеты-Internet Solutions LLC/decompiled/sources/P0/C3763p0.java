package P0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: P0.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3763p0 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21296b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f21297c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3763p0(C3787x1 c3787x1, xe.M m11, C3787x1 c3787x12) {
        super(0);
        this.f21296b = c3787x1;
        this.f21297c = m11;
        this.f21298d = c3787x12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (this.f21296b.c().o().invoke(EnumC3790y1.Expanded).booleanValue()) {
            C10727i.c(this.f21297c, null, null, new C3760o0(this.f21298d, null), 3);
        }
        return Boolean.TRUE;
    }
}
