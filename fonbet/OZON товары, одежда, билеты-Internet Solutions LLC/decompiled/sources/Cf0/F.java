package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xb0.InterfaceC10696a;
import xb0.InterfaceC10697b;

/* loaded from: classes7.dex */
final class F extends AbstractC7737t implements Function0<InterfaceC10697b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(J j11) {
        super(0);
        this.f4840b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC10697b invoke() {
        Ld0.c cVar;
        cVar = this.f4840b.f4844a;
        return (InterfaceC10697b) cVar.e(InterfaceC10696a.class);
    }
}
