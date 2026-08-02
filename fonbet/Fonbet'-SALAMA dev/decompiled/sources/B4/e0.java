package B4;

import a.AbstractC0603a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f1151c = new e0(false, null);

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f1152d = new e0(true, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final I4.f f1154b;

    public e0(boolean z4, I4.f fVar) {
        AbstractC0603a.e("Cannot specify a fieldMask for non-merge sets()", fVar == null || z4, new Object[0]);
        this.f1153a = z4;
        this.f1154b = fVar;
    }

    public static e0 a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0074s) it.next()).f1192a);
        }
        return new e0(true, new I4.f(hashSet));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f1153a != e0Var.f1153a) {
            return false;
        }
        I4.f fVar = e0Var.f1154b;
        I4.f fVar2 = this.f1154b;
        return fVar2 != null ? fVar2.equals(fVar) : fVar == null;
    }

    public final int hashCode() {
        int i7 = (this.f1153a ? 1 : 0) * 31;
        I4.f fVar = this.f1154b;
        return i7 + (fVar != null ? fVar.f3667a.hashCode() : 0);
    }
}
