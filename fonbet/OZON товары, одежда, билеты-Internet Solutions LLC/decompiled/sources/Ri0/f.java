package Ri0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f25138b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f25139c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f25140d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f25141e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f25142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(q qVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i11) {
        super(2);
        this.f25138b = qVar;
        this.f25139c = function0;
        this.f25140d = function02;
        this.f25141e = function03;
        this.f25142f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f25142f | 1);
        Function0<Unit> function0 = this.f25140d;
        Function0<Unit> function02 = this.f25141e;
        q.f(this.f25138b, this.f25139c, function0, function02, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
