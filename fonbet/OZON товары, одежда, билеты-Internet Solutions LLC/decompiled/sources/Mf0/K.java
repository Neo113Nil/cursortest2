package Mf0;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9895d;

/* loaded from: classes3.dex */
final class K extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f17959b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f17960c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f17961d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f17962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(float f7, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(3);
        this.f17959b = f7;
        this.f17960c = function0;
        this.f17961d = function02;
        this.f17962e = function03;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9895d Block = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(Block, "$this$Block");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            float f7 = this.f17959b;
            Sf0.e.a("Сервисы", androidx.compose.foundation.layout.T.h(aVar, f7, 0.0f, 2), interfaceC3967k2, 54, 0);
            M.c("Domain reachability", f7, this.f17960c, interfaceC3967k2, 54);
            M.c("Whitelisting", f7, this.f17961d, interfaceC3967k2, 54);
            M.c("Tests", f7, this.f17962e, interfaceC3967k2, 54);
        }
        return Unit.f71690a;
    }
}
