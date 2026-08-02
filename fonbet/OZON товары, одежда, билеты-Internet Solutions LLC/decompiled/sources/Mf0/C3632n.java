package Mf0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Mf0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3632n extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O f18043b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<String> f18044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3632n(O o11, InterfaceC3978p0<String> interfaceC3978p0) {
        super(1);
        this.f18043b = o11;
        this.f18044c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        String X9 = kotlin.text.h.X(kotlin.text.h.X(it, "\n", " ", false), "\r", "", false);
        int length = X9.length();
        O o11 = this.f18043b;
        if (length == 0) {
            o11.i0("x-o3-meshversion");
        } else {
            o11.j0("x-o3-meshversion", X9);
        }
        this.f18044c.setValue(X9);
        return Unit.f71690a;
    }
}
