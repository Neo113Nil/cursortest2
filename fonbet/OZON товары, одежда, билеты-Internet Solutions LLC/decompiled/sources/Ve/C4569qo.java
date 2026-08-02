package Ve;

import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Ve.qo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4569qo extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z2 f31914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F1 f31915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4569qo(Z2 z22, F1 f12) {
        super(0);
        this.f31914b = z22;
        this.f31915c = f12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Z2 z22 = this.f31914b;
        C6788a a11 = androidx.lifecycle.x0.a(z22);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new Nn(z22, this.f31915c, null), 2);
        return Unit.f71690a;
    }
}
