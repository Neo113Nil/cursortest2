package p154w;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f17234d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17237g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f17231a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17232b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17233c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17235e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17238h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f17239i = null;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f17240k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f17241l = new ArrayList();

    public e(n nVar) {
        this.f17234d = nVar;
    }

    @Override // p154w.d
    public final void a(d dVar) {
        ArrayList<e> arrayList = this.f17241l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).j) {
                return;
            }
        }
        this.f17233c = true;
        n nVar = this.f17231a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f17232b) {
            this.f17234d.a(this);
            return;
        }
        e eVar = null;
        int i7 = 0;
        for (e eVar2 : arrayList) {
            if (!(eVar2 instanceof f)) {
                i7++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i7 == 1 && eVar.j) {
            f fVar = this.f17239i;
            if (fVar != null) {
                if (!fVar.j) {
                    return;
                } else {
                    this.f17236f = this.f17238h * fVar.f17237g;
                }
            }
            d(eVar.f17237g + this.f17236f);
        }
        n nVar2 = this.f17231a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(n nVar) {
        this.f17240k.add(nVar);
        if (this.j) {
            nVar.a(nVar);
        }
    }

    public final void c() {
        this.f17241l.clear();
        this.f17240k.clear();
        this.j = false;
        this.f17237g = 0;
        this.f17233c = false;
        this.f17232b = false;
    }

    public void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f17237g = i7;
        for (d dVar : this.f17240k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17234d.f17256b.f16968k0);
        sb.append(":");
        switch (this.f17235e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.f17237g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f17241l.size());
        sb.append(":d=");
        sb.append(this.f17240k.size());
        sb.append(">");
        return sb.toString();
    }
}
