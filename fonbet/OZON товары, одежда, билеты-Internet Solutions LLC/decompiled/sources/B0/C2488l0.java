package B0;

import B0.O0;
import Q1.C3848q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2488l0 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1838b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q1.r f1839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2488l0(O0 o02, Q1.r rVar) {
        super(0);
        this.f1838b = o02;
        this.f1839c = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ((O0.a) this.f1838b.l()).invoke(C3848q.a(this.f1839c.e()));
        return Boolean.TRUE;
    }
}
