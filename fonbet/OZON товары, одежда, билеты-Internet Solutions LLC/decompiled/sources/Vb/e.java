package Vb;

import Hf.AbstractC3139b;
import Hf.u;
import Hf.w;
import Ub.l;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class e implements l.b<w> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // Ub.l.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NonNull u uVar, @NonNull Ub.l lVar) {
        boolean z11;
        w wVar = (w) uVar;
        AbstractC3139b m11 = wVar.m();
        if (m11 != null) {
            u f7 = m11.f();
            if (f7 instanceof Hf.s) {
                z11 = ((Hf.s) f7).n();
                if (!z11) {
                    lVar.k();
                }
                int length = lVar.length();
                lVar.b(wVar);
                q.f28497f.e(lVar.i(), Boolean.valueOf(z11));
                lVar.E(wVar, length);
                if (z11) {
                    lVar.q(wVar);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        int length2 = lVar.length();
        lVar.b(wVar);
        q.f28497f.e(lVar.i(), Boolean.valueOf(z11));
        lVar.E(wVar, length2);
        if (z11) {
        }
    }
}
