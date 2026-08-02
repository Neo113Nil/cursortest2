package Mf0;

import gf0.C6730b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mf0.C8143e;
import mf0.InterfaceC8142d;

/* renamed from: Mf0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3628j extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f18035b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3628j(InterfaceC8142d interfaceC8142d) {
        super(0);
        this.f18035b = interfaceC8142d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Ff0.f fVar = Ff0.f.f9457d;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        this.f18035b.c(new C6730b(fVar), C8143e.f74843b);
        return Unit.f71690a;
    }
}
