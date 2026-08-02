package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J20.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3375e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.b f13713b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3375e(a.b bVar, androidx.compose.ui.e eVar, int i11) {
        super(2);
        this.f13713b = bVar;
        this.f13714c = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        C3376f.a(this.f13713b, this.f13714c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
