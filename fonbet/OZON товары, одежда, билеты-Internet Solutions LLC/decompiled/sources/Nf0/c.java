package Nf0;

import androidx.lifecycle.x0;
import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f19508b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f19509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(j jVar, int i11) {
        super(0);
        this.f19508b = jVar;
        this.f19509c = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        j jVar = this.f19508b;
        C6788a a11 = x0.a(jVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new k(jVar, this.f19509c, null), 2);
        return Unit.f71690a;
    }
}
