package J00;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;

/* loaded from: classes3.dex */
final class n extends AbstractC7737t implements Function1<P00.k<C7854a>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A00.e f13653b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f13654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(A00.e eVar, AtomicBoolean atomicBoolean) {
        super(1);
        this.f13653b = eVar;
        this.f13654c = atomicBoolean;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(P00.k<C7854a> kVar) {
        boolean z11;
        P00.k<C7854a> it = kVar;
        Intrinsics.checkNotNullParameter(it, "it");
        A00.e eVar = this.f13653b;
        int u02 = eVar.f().u0(it.d());
        AtomicBoolean atomicBoolean = this.f13654c;
        if (u02 != -1) {
            z11 = true;
            if (A00.f.b(eVar.e())) {
                int e11 = eVar.e();
                if (!A00.f.b(e11)) {
                    e11 = 0;
                }
                if (e11 != 0) {
                    z11 = atomicBoolean.getAndSet(true);
                }
            }
        } else {
            z11 = atomicBoolean.get();
        }
        return Boolean.valueOf(z11);
    }
}
