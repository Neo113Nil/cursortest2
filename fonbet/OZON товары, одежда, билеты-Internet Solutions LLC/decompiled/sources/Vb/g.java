package Vb;

import Hf.u;
import Hf.z;
import Ub.l;
import Vb.p;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class g implements l.b<z> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f28490a;

    g(p pVar) {
        this.f28490a = pVar;
    }

    @Override // Ub.l.b
    public final void a(@NonNull u uVar, @NonNull Ub.l lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String m11 = ((z) uVar).m();
        lVar.d().c(m11);
        p pVar = this.f28490a;
        arrayList = pVar.f28491a;
        if (arrayList.isEmpty()) {
            return;
        }
        int length = lVar.length() - m11.length();
        arrayList2 = pVar.f28491a;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((p.a) it.next()).a(lVar, m11, length);
        }
    }
}
