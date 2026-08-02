package H4;

import G4.C0269b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3297e = new c(0, b.f3303d);

    /* renamed from: f, reason: collision with root package name */
    public static final C0269b f3298f = new C0269b(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f3299a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3300b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3301c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3302d;

    public a(int i7, String str, ArrayList arrayList, c cVar) {
        this.f3299a = i7;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f3300b = str;
        this.f3301c = arrayList;
        if (cVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f3302d = cVar;
    }

    public final d a() {
        Iterator it = this.f3301c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (t.e.b(dVar.f3311b, 3)) {
                return dVar;
            }
        }
        return null;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3301c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!t.e.b(dVar.f3311b, 3)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3299a == aVar.f3299a && this.f3300b.equals(aVar.f3300b) && this.f3301c.equals(aVar.f3301c) && this.f3302d.equals(aVar.f3302d);
    }

    public final int hashCode() {
        return this.f3302d.hashCode() ^ ((((((this.f3299a ^ 1000003) * 1000003) ^ this.f3300b.hashCode()) * 1000003) ^ this.f3301c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.f3299a + ", collectionGroup=" + this.f3300b + ", segments=" + this.f3301c + ", indexState=" + this.f3302d + "}";
    }
}
