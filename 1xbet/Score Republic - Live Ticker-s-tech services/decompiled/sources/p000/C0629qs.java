package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: qs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0629qs implements InterfaceC0518ns {

    /* JADX INFO: renamed from: d */
    public final bj1 f6575d;

    /* JADX INFO: renamed from: f */
    public int f6577f;

    /* JADX INFO: renamed from: g */
    public int f6578g;

    /* JADX INFO: renamed from: a */
    public bj1 f6572a = null;

    /* JADX INFO: renamed from: b */
    public boolean f6573b = false;

    /* JADX INFO: renamed from: c */
    public boolean f6574c = false;

    /* JADX INFO: renamed from: e */
    public int f6576e = 1;

    /* JADX INFO: renamed from: h */
    public int f6579h = 1;

    /* JADX INFO: renamed from: i */
    public C0074bt f6580i = null;

    /* JADX INFO: renamed from: j */
    public boolean f6581j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f6582k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f6583l = new ArrayList();

    public C0629qs(bj1 bj1Var) {
        this.f6575d = bj1Var;
    }

    @Override // p000.InterfaceC0518ns
    /* JADX INFO: renamed from: a */
    public final void mo1751a(InterfaceC0518ns interfaceC0518ns) {
        ArrayList arrayList = this.f6583l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((C0629qs) obj).f6581j) {
                return;
            }
        }
        this.f6574c = true;
        bj1 bj1Var = this.f6572a;
        if (bj1Var != null) {
            bj1Var.mo1751a(this);
        }
        if (this.f6573b) {
            this.f6575d.mo1751a(this);
            return;
        }
        int size2 = arrayList.size();
        C0629qs c0629qs = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            C0629qs c0629qs2 = (C0629qs) obj2;
            if (!(c0629qs2 instanceof C0074bt)) {
                i++;
                c0629qs = c0629qs2;
            }
        }
        if (c0629qs != null && i == 1 && c0629qs.f6581j) {
            C0074bt c0074bt = this.f6580i;
            if (c0074bt != null) {
                if (!c0074bt.f6581j) {
                    return;
                } else {
                    this.f6577f = this.f6579h * c0074bt.f6578g;
                }
            }
            mo759d(c0629qs.f6578g + this.f6577f);
        }
        bj1 bj1Var2 = this.f6572a;
        if (bj1Var2 != null) {
            bj1Var2.mo1751a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4136b(bj1 bj1Var) {
        this.f6582k.add(bj1Var);
        if (this.f6581j) {
            bj1Var.mo1751a(bj1Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4137c() {
        this.f6583l.clear();
        this.f6582k.clear();
        this.f6581j = false;
        this.f6578g = 0;
        this.f6574c = false;
        this.f6573b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo759d(int i) {
        if (this.f6581j) {
            return;
        }
        this.f6581j = true;
        this.f6578g = i;
        ArrayList arrayList = this.f6582k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            InterfaceC0518ns interfaceC0518ns = (InterfaceC0518ns) obj;
            interfaceC0518ns.mo1751a(interfaceC0518ns);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6575d.f890b.f1720g0);
        sb.append(":");
        switch (this.f6576e) {
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
        sb.append(this.f6581j ? Integer.valueOf(this.f6578g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6583l.size());
        sb.append(":d=");
        sb.append(this.f6582k.size());
        sb.append(">");
        return sb.toString();
    }
}
