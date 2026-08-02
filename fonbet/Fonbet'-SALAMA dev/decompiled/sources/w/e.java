package w;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements InterfaceC1671d {

    /* renamed from: d, reason: collision with root package name */
    public final n f17228d;

    /* renamed from: f, reason: collision with root package name */
    public int f17230f;

    /* renamed from: g, reason: collision with root package name */
    public int f17231g;

    /* renamed from: a, reason: collision with root package name */
    public n f17225a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17226b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17227c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f17229e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f17232h = 1;

    /* renamed from: i, reason: collision with root package name */
    public f f17233i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f17234k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f17235l = new ArrayList();

    public e(n nVar) {
        this.f17228d = nVar;
    }

    @Override // w.InterfaceC1671d
    public final void a(InterfaceC1671d interfaceC1671d) {
        ArrayList arrayList = this.f17235l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).j) {
                return;
            }
        }
        this.f17227c = true;
        n nVar = this.f17225a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f17226b) {
            this.f17228d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        e eVar = null;
        int i7 = 0;
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (!(eVar2 instanceof f)) {
                i7++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i7 == 1 && eVar.j) {
            f fVar = this.f17233i;
            if (fVar != null) {
                if (!fVar.j) {
                    return;
                } else {
                    this.f17230f = this.f17232h * fVar.f17231g;
                }
            }
            d(eVar.f17231g + this.f17230f);
        }
        n nVar2 = this.f17225a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(n nVar) {
        this.f17234k.add(nVar);
        if (this.j) {
            nVar.a(nVar);
        }
    }

    public final void c() {
        this.f17235l.clear();
        this.f17234k.clear();
        this.j = false;
        this.f17231g = 0;
        this.f17227c = false;
        this.f17226b = false;
    }

    public void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f17231g = i7;
        Iterator it = this.f17234k.iterator();
        while (it.hasNext()) {
            InterfaceC1671d interfaceC1671d = (InterfaceC1671d) it.next();
            interfaceC1671d.a(interfaceC1671d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17228d.f17250b.f16962k0);
        sb.append(":");
        switch (this.f17229e) {
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
        sb.append(this.j ? Integer.valueOf(this.f17231g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f17235l.size());
        sb.append(":d=");
        sb.append(this.f17234k.size());
        sb.append(">");
        return sb.toString();
    }
}
