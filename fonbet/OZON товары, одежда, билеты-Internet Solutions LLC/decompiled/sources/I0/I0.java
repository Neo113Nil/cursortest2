package I0;

import S0.InterfaceC3978p0;
import android.os.Build;
import androidx.compose.ui.e;
import k1.C7459e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8371L;

/* loaded from: classes8.dex */
final class I0 extends AbstractC7737t implements Function1<Function0<? extends C7459e>, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z1.d f11325b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.q> f11326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I0(Z1.d dVar, InterfaceC3978p0<Z1.q> interfaceC3978p0) {
        super(1);
        this.f11325b = dVar;
        this.f11326c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final androidx.compose.ui.e invoke(Function0<? extends C7459e> function0) {
        e.a aVar = androidx.compose.ui.e.f40358c0;
        G0 g02 = new G0(function0);
        H0 h02 = new H0(this.f11325b, this.f11326c);
        if (C8371L.b()) {
            return C8371L.c(aVar, g02, h02, Build.VERSION.SDK_INT == 28 ? n0.Z.f76125a : n0.a0.f76146a);
        }
        throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
    }
}
