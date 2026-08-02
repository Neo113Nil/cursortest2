package Mf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Mf0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3630l extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18036b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3630l(String str, int i11) {
        super(2);
        this.f18036b = str;
        this.f18037c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f18037c | 1);
        M.a(this.f18036b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
