package B0;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import v1.C10177b;

/* renamed from: B0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2517v0 extends AbstractC7737t implements Function1<C10177b, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1992b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2517v0(O0 o02, I0.W0 w02) {
        super(1);
        this.f1992b = o02;
        this.f1993c = w02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C10177b c10177b) {
        boolean z11;
        KeyEvent b11 = c10177b.b();
        if (this.f1992b.d() == EnumC2529z0.Selection && G0.a(b11)) {
            this.f1993c.s(null);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
