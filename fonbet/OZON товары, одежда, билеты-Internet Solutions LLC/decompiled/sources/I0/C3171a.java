package I0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: I0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3171a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3214w f11438b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b f11439c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f11440d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f11441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3171a(InterfaceC3214w interfaceC3214w, InterfaceC6250b interfaceC6250b, C4912a c4912a, int i11) {
        super(2);
        this.f11438b = interfaceC3214w;
        this.f11439c = interfaceC6250b;
        this.f11440d = c4912a;
        this.f11441e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f11441e | 1);
        InterfaceC6250b interfaceC6250b = this.f11439c;
        C4912a c4912a = this.f11440d;
        C3181f.a(this.f11438b, interfaceC6250b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
