package J0;

import S0.InterfaceC3972m0;
import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3348u0 extends AbstractC3289f0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z1.d f13415a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13416b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f13417c;

    C3348u0(Z1.d dVar, InterfaceC3972m0 interfaceC3972m0, InterfaceC3972m0 interfaceC3972m02) {
        this.f13415a = dVar;
        this.f13416b = interfaceC3972m0;
        this.f13417c = interfaceC3972m02;
    }

    @Override // J0.AbstractC3289f0
    @NotNull
    public final androidx.compose.ui.e b(@NotNull e.a aVar) {
        int intValue = this.f13416b.getIntValue();
        Z1.d dVar = this.f13415a;
        return androidx.compose.foundation.layout.a0.r(androidx.compose.foundation.layout.a0.h(aVar, 0.0f, dVar.B(intValue), 1), dVar.B(this.f13417c.getIntValue()));
    }
}
