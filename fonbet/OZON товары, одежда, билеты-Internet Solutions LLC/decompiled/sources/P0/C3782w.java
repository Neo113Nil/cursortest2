package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3782w extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f21422b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f21423c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f21424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3782w(e.a aVar, float f7, long j11, int i11) {
        super(2);
        this.f21422b = aVar;
        this.f21423c = f7;
        this.f21424d = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(55);
        C3785x.a(this.f21422b, this.f21423c, this.f21424d, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
