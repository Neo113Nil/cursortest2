package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

/* loaded from: classes.dex */
final class F extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC8972b f20621b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f20622c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20623d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f20624e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f20625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(AbstractC8972b abstractC8972b, String str, androidx.compose.ui.e eVar, long j11, int i11) {
        super(2);
        this.f20621b = abstractC8972b;
        this.f20622c = str;
        this.f20623d = eVar;
        this.f20624e = j11;
        this.f20625f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        E.a(this.f20621b, this.f20622c, this.f20623d, this.f20624e, interfaceC3967k, C2652m.e(this.f20625f | 1));
        return Unit.f71690a;
    }
}
