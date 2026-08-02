package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xb0.InterfaceC10696a;
import xb0.InterfaceC10697b;
import zb0.AbstractC11016a;

/* renamed from: Cf0.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C2774o extends AbstractC7737t implements Function0<AbstractC11016a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2774o(J j11) {
        super(0);
        this.f4940b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC11016a invoke() {
        Ld0.c cVar;
        cVar = this.f4940b.f4844a;
        return ((InterfaceC10697b) cVar.e(InterfaceC10696a.class)).M();
    }
}
