package R;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.O0;
import androidx.camera.core.w;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class g extends AbstractC5111p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f23872a;

    g(h hVar) {
        this.f23872a = hVar;
    }

    @Override // androidx.camera.core.impl.AbstractC5111p
    public final void b(int i11, @NonNull InterfaceC5130z interfaceC5130z) {
        Iterator it = this.f23872a.f23873a.iterator();
        while (it.hasNext()) {
            O0 t2 = ((w) it.next()).t();
            Iterator<AbstractC5111p> it2 = t2.j().iterator();
            while (it2.hasNext()) {
                it2.next().b(i11, new i(t2.k().i(), interfaceC5130z));
            }
        }
    }
}
