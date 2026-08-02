package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import q20.InterfaceC8978a;
import q20.InterfaceC8979b;

/* renamed from: Cf0.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C2775p extends AbstractC7737t implements Function0<InterfaceC8979b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2775p(J j11) {
        super(0);
        this.f4941b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC8979b invoke() {
        Ld0.c cVar;
        cVar = this.f4941b.f4844a;
        return (InterfaceC8979b) cVar.e(InterfaceC8978a.class);
    }
}
