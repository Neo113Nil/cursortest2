package B0;

import E0.AbstractC2923g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2505r0 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1912b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j1.r f1913c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.r f1914d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2923g0 f1915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2505r0(O0 o02, j1.r rVar, Q1.r rVar2, AbstractC2923g0 abstractC2923g0) {
        super(0);
        this.f1912b = o02;
        this.f1913c = rVar;
        this.f1914d = rVar2;
        this.f1915e = abstractC2923g0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (!this.f1912b.e()) {
            this.f1913c.d();
        }
        Q1.r rVar = this.f1914d;
        if (rVar.f() != 7 && rVar.f() != 8) {
            this.f1915e.k();
        }
        return Boolean.TRUE;
    }
}
