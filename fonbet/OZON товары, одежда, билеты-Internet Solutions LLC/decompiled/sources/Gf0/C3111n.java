package Gf0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Gf0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3111n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f10199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3111n(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.f10199b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f10199b.setValue(Boolean.FALSE);
        return Unit.f71690a;
    }
}
