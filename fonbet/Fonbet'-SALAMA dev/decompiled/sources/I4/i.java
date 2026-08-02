package I4;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3673a;

    /* renamed from: b, reason: collision with root package name */
    public final Timestamp f3674b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3675c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3676d;

    public i(int i7, Timestamp timestamp, ArrayList arrayList, List list) {
        p3.f.O("Cannot create an empty mutation batch", !list.isEmpty(), new Object[0]);
        this.f3673a = i7;
        this.f3674b = timestamp;
        this.f3675c = arrayList;
        this.f3676d = list;
    }

    public final f a(H4.k kVar, f fVar) {
        Timestamp timestamp;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f3675c;
            int size = arrayList.size();
            timestamp = this.f3674b;
            if (i8 >= size) {
                break;
            }
            h hVar = (h) arrayList.get(i8);
            if (hVar.f3670a.equals(kVar.f3323a)) {
                fVar = hVar.a(kVar, fVar, timestamp);
            }
            i8++;
        }
        while (true) {
            List list = this.f3676d;
            if (i7 >= list.size()) {
                return fVar;
            }
            h hVar2 = (h) list.get(i7);
            if (hVar2.f3670a.equals(kVar.f3323a)) {
                fVar = hVar2.a(kVar, fVar, timestamp);
            }
            i7++;
        }
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f3676d.iterator();
        while (it.hasNext()) {
            hashSet.add(((h) it.next()).f3670a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3673a == iVar.f3673a && this.f3674b.equals(iVar.f3674b) && this.f3675c.equals(iVar.f3675c) && this.f3676d.equals(iVar.f3676d);
    }

    public final int hashCode() {
        return this.f3676d.hashCode() + ((this.f3675c.hashCode() + ((this.f3674b.hashCode() + (this.f3673a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutationBatch(batchId=" + this.f3673a + ", localWriteTime=" + this.f3674b + ", baseMutations=" + this.f3675c + ", mutations=" + this.f3676d + ')';
    }
}
