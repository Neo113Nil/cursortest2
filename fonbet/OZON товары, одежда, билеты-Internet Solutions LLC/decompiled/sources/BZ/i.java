package BZ;

import CZ.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tZ.C9786a;
import xZ.j;

/* loaded from: classes3.dex */
public final class i extends j {

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            i.this.getFragmentManager().S0();
            return Unit.f71690a;
        }
    }

    @Override // xZ.j, EZ.g
    public final void navigate(@NotNull EZ.e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (!(b11 instanceof CZ.e)) {
            if (!(b11 instanceof C9786a)) {
                super.navigate(response, i11);
                return;
            } else if (getFragmentManager().l0() <= 1) {
                next(response.e(new CZ.b((pZ.f) null, b.a.CURRENT, 1)), i11);
                return;
            } else {
                safeTransaction(new a());
                return;
            }
        }
        CZ.e eVar = (CZ.e) b11;
        if (!Intrinsics.d(eVar.a(), getHostName$compass_release())) {
            next(response, i11);
            return;
        }
        pZ.f c11 = eVar.c();
        if (c11 != null) {
            EZ.g.redirect$default(this, response.e(c11), 0, 2, null);
        }
    }
}
