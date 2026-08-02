package androidx.compose.foundation.layout;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.layout.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5197u extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39557b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5179b.e f39558c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5179b.l f39559d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f39560e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f39561f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ J f39562g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f39563h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f39564i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f39565j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5197u(androidx.compose.ui.e eVar, C5179b.e eVar2, C5179b.l lVar, int i11, int i12, J j11, C4912a c4912a, int i13, int i14) {
        super(2);
        this.f39557b = eVar;
        this.f39558c = eVar2;
        this.f39559d = lVar;
        this.f39560e = i11;
        this.f39561f = i12;
        this.f39562g = j11;
        this.f39563h = c4912a;
        this.f39564i = i13;
        this.f39565j = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f39564i | 1);
        C4912a c4912a = this.f39563h;
        int i11 = this.f39561f;
        B.a(this.f39557b, this.f39558c, this.f39559d, this.f39560e, i11, this.f39562g, c4912a, interfaceC3967k, e11, this.f39565j);
        return Unit.f71690a;
    }
}
