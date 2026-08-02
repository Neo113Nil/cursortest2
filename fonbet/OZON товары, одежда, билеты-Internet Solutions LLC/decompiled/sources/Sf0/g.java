package Sf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f26206b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26207c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f26208d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Unit> f26209e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f26210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(androidx.compose.ui.e eVar, String str, int i11, Function1 function1, int i12) {
        super(2);
        this.f26206b = eVar;
        this.f26207c = str;
        this.f26208d = i11;
        this.f26209e = function1;
        this.f26210f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f26210f | 1);
        String str = this.f26207c;
        int i11 = this.f26208d;
        j.a(this.f26206b, str, i11, this.f26209e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
