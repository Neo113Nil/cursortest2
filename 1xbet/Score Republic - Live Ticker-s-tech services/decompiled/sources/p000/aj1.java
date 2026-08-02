package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 {

    /* JADX INFO: renamed from: f */
    public static int f215f;

    /* JADX INFO: renamed from: a */
    public ArrayList f216a;

    /* JADX INFO: renamed from: b */
    public int f217b;

    /* JADX INFO: renamed from: c */
    public int f218c;

    /* JADX INFO: renamed from: d */
    public ArrayList f219d;

    /* JADX INFO: renamed from: e */
    public int f220e;

    /* JADX INFO: renamed from: a */
    public final void m261a(ArrayList arrayList) {
        int size = this.f216a.size();
        if (this.f220e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                aj1 aj1Var = (aj1) arrayList.get(i);
                if (this.f220e == aj1Var.f217b) {
                    m263c(this.f218c, aj1Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m262b(gi0 gi0Var, int i) {
        int iM2079n;
        int iM2079n2;
        ArrayList arrayList = this.f216a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0179em c0179em = (C0179em) ((C0143dm) arrayList.get(0)).f1699S;
        gi0Var.m2098t();
        c0179em.mo1249b(gi0Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0143dm) arrayList.get(i2)).mo1249b(gi0Var, false);
        }
        if (i == 0 && c0179em.f2141y0 > 0) {
            a90.m117a(c0179em, gi0Var, arrayList, 0);
        }
        if (i == 1 && c0179em.f2142z0 > 0) {
            a90.m117a(c0179em, gi0Var, arrayList, 1);
        }
        try {
            gi0Var.m2094p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f219d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0143dm c0143dm = (C0143dm) arrayList.get(i3);
            x80 x80Var = new x80(21);
            new WeakReference(c0143dm);
            gi0.m2079n(c0143dm.f1688H);
            gi0.m2079n(c0143dm.f1689I);
            gi0.m2079n(c0143dm.f1690J);
            gi0.m2079n(c0143dm.f1691K);
            gi0.m2079n(c0143dm.f1692L);
            this.f219d.add(x80Var);
        }
        if (i == 0) {
            iM2079n = gi0.m2079n(c0179em.f1688H);
            iM2079n2 = gi0.m2079n(c0179em.f1690J);
            gi0Var.m2098t();
        } else {
            iM2079n = gi0.m2079n(c0179em.f1689I);
            iM2079n2 = gi0.m2079n(c0179em.f1691K);
            gi0Var.m2098t();
        }
        return iM2079n2 - iM2079n;
    }

    /* JADX INFO: renamed from: c */
    public final void m263c(int i, aj1 aj1Var) {
        int i2 = aj1Var.f217b;
        ArrayList arrayList = this.f216a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C0143dm c0143dm = (C0143dm) obj;
            ArrayList arrayList2 = aj1Var.f216a;
            if (!arrayList2.contains(c0143dm)) {
                arrayList2.add(c0143dm);
            }
            if (i == 0) {
                c0143dm.f1732m0 = i2;
            } else {
                c0143dm.f1734n0 = i2;
            }
        }
        this.f220e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f218c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f217b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.f216a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            string = string + " " + ((C0143dm) obj).f1720g0;
        }
        return string.concat(" >");
    }
}
