package Gf0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Gf0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3112o extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f10200b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f10201c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f10202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3112o(Function1<Object, Unit> function1, Object obj, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.f10200b = function1;
        this.f10201c = obj;
        this.f10202d = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f10200b.invoke(this.f10201c);
        this.f10202d.setValue(Boolean.FALSE);
        return Unit.f71690a;
    }
}
