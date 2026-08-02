package androidx.compose.foundation.layout;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.layout.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5190m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39520b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e1.d f39521c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f39522d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f39523e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f39524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5190m(androidx.compose.ui.e eVar, e1.d dVar, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f39520b = eVar;
        this.f39521c = dVar;
        this.f39522d = c4912a;
        this.f39523e = i11;
        this.f39524f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f39523e | 1);
        C4912a c4912a = this.f39522d;
        e1.d dVar = this.f39521c;
        C5191n.a(this.f39520b, dVar, c4912a, interfaceC3967k, e11, this.f39524f);
        return Unit.f71690a;
    }
}
