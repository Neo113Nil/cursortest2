package B0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2491m0 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1857b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j1.r f1858c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f1859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2491m0(O0 o02, j1.r rVar, boolean z11) {
        super(0);
        this.f1857b = o02;
        this.f1858c = rVar;
        this.f1859d = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        androidx.compose.ui.platform.P1 h11;
        O0 o02 = this.f1857b;
        if (!o02.e()) {
            this.f1858c.d();
        } else if (!this.f1859d && (h11 = o02.h()) != null) {
            h11.show();
        }
        return Boolean.TRUE;
    }
}
