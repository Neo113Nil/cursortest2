package M;

import C.L;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.EnumC5118t;
import androidx.camera.core.impl.EnumC5122v;
import androidx.camera.core.impl.EnumC5126x;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.p;

/* loaded from: classes8.dex */
public final class d extends a<p> {
    @Override // M.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(@NonNull p pVar) {
        L x02 = pVar.x0();
        InterfaceC5130z d11 = x02 instanceof J.c ? ((J.c) x02).d() : null;
        if ((d11.c() == EnumC5122v.LOCKED_FOCUSED || d11.c() == EnumC5122v.PASSIVE_FOCUSED) && d11.e() == EnumC5118t.CONVERGED && d11.d() == EnumC5126x.CONVERGED) {
            super.b(pVar);
        } else {
            this.f17198d.getClass();
            pVar.close();
        }
    }
}
