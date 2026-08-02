package D5;

import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f5955a = new ArrayList();

    final void a(u uVar) {
        this.f5955a.add(uVar);
    }

    public final void b(Path path) {
        ArrayList arrayList = this.f5955a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            int i11 = O5.g.f19991f;
            if (uVar != null && !uVar.k()) {
                O5.g.a(path, uVar.i().n() / 100.0f, uVar.d().n() / 100.0f, uVar.h().n() / 360.0f);
            }
        }
    }
}
