package Ub;

import Ub.h;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class q implements h.b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f27516a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f27517b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f27518c = new HashSet(3);

    q(@NonNull ArrayList arrayList) {
        this.f27516a = arrayList;
        this.f27517b = new ArrayList(arrayList.size());
    }

    private void b(@NonNull h hVar) {
        ArrayList arrayList = this.f27517b;
        if (arrayList.contains(hVar)) {
            return;
        }
        HashSet hashSet = this.f27518c;
        if (hashSet.contains(hVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(hVar);
        hVar.configure(this);
        hashSet.remove(hVar);
        if (arrayList.contains(hVar)) {
            return;
        }
        if (Vb.p.class.isAssignableFrom(hVar.getClass())) {
            arrayList.add(0, hVar);
        } else {
            arrayList.add(hVar);
        }
    }

    @Override // Ub.h.b
    public final void a(@NonNull h.a aVar) {
        h hVar;
        h hVar2;
        Iterator it = this.f27517b.iterator();
        while (true) {
            hVar = null;
            if (!it.hasNext()) {
                hVar2 = null;
                break;
            } else {
                hVar2 = (h) it.next();
                if (Vb.p.class.isAssignableFrom(hVar2.getClass())) {
                    break;
                }
            }
        }
        if (hVar2 == null) {
            ArrayList arrayList = this.f27516a;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                h hVar3 = (h) it2.next();
                if (Vb.p.class.isAssignableFrom(hVar3.getClass())) {
                    hVar = hVar3;
                    break;
                }
            }
            if (hVar == null) {
                throw new IllegalStateException("Requested plugin is not added: " + Vb.p.class.getName() + ", plugins: " + arrayList);
            }
            b(hVar);
            hVar2 = hVar;
        }
        aVar.a(hVar2);
    }

    @NonNull
    final ArrayList c() {
        Iterator it = this.f27516a.iterator();
        while (it.hasNext()) {
            b((h) it.next());
        }
        return this.f27517b;
    }
}
