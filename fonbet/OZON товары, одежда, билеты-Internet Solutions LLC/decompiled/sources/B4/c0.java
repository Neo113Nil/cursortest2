package B4;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class c0 extends AbstractC7737t implements Function1<C2581j, C2581j> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0<H> f2609b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S f2610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(b0 b0Var, S s11) {
        super(1);
        this.f2609b = b0Var;
        this.f2610c = s11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2581j invoke(C2581j c2581j) {
        C2581j backStackEntry = c2581j;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        H d11 = backStackEntry.d();
        if (d11 == null) {
            d11 = null;
        }
        if (d11 != null) {
            Bundle c11 = backStackEntry.c();
            S s11 = this.f2610c;
            b0<H> b0Var = this.f2609b;
            H d12 = b0Var.d(d11, c11, s11);
            if (d12 != null) {
                return d12.equals(d11) ? backStackEntry : b0Var.b().a(d12, d12.e(backStackEntry.c()));
            }
        }
        return null;
    }
}
