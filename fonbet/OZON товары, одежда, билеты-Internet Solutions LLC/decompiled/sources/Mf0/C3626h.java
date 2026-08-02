package Mf0;

import gf0.C6730b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mf0.C8143e;
import mf0.InterfaceC8142d;

/* renamed from: Mf0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3626h extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f18033b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3626h(InterfaceC8142d interfaceC8142d) {
        super(0);
        this.f18033b = interfaceC8142d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Ff0.b bVar = Ff0.b.f9453d;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        this.f18033b.c(new C6730b(bVar), C8143e.f74843b);
        return Unit.f71690a;
    }
}
