package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import za0.InterfaceC11014a;

/* loaded from: classes7.dex */
final class x extends AbstractC7737t implements Function0<InterfaceC11014a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(J j11) {
        super(0);
        this.f4949b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC11014a invoke() {
        Ld0.c cVar;
        cVar = this.f4949b.f4844a;
        return (InterfaceC11014a) cVar.e(InterfaceC11014a.class);
    }
}
