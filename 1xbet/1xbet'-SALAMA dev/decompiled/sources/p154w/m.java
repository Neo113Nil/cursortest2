package p154w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p136t.c;
import p149v.e;
import p149v.f;
import p149v.k;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f17249f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f17250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f17253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17254e;

    public final void a(ArrayList arrayList) {
        int size = this.f17250a.size();
        if (this.f17254e != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                m mVar = (m) arrayList.get(i7);
                if (this.f17254e == mVar.f17251b) {
                    c(this.f17252c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(c cVar, int i7) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f17250a;
        if (arrayList.size() == 0) {
            return 0;
        }
        f fVar = (f) ((e) arrayList.get(0)).f16944V;
        cVar.t();
        fVar.b(cVar, false);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ((e) arrayList.get(i8)).b(cVar, false);
        }
        if (i7 == 0 && fVar.f16996D0 > 0) {
            k.a(fVar, cVar, arrayList, 0);
        }
        if (i7 == 1 && fVar.f16997E0 > 0) {
            k.a(fVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        this.f17253d = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            e eVar = (e) arrayList.get(i9);
            p036e6.c cVar2 = new p036e6.c(26);
            new WeakReference(eVar);
            c.n(eVar.f16932J);
            c.n(eVar.f16933K);
            c.n(eVar.f16934L);
            c.n(eVar.f16935M);
            c.n(eVar.f16936N);
            this.f17253d.add(cVar2);
        }
        if (i7 == 0) {
            iN = c.n(fVar.f16932J);
            iN2 = c.n(fVar.f16934L);
            cVar.t();
        } else {
            iN = c.n(fVar.f16933K);
            iN2 = c.n(fVar.f16935M);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i7, m mVar) {
        for (e eVar : this.f17250a) {
            ArrayList arrayList = mVar.f17250a;
            if (!arrayList.contains(eVar)) {
                arrayList.add(eVar);
            }
            int i8 = mVar.f17251b;
            if (i7 == 0) {
                eVar.f16984s0 = i8;
            } else {
                eVar.f16986t0 = i8;
            }
        }
        this.f17254e = mVar.f17251b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i7 = this.f17252c;
        if (i7 == 0) {
            str = "Horizontal";
        } else if (i7 == 1) {
            str = "Vertical";
        } else {
            str = i7 == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strG = p031e1.k.g(sb, this.f17251b, "] <");
        for (e eVar : this.f17250a) {
            StringBuilder sbD = p136t.e.d(strG, " ");
            sbD.append(eVar.f16968k0);
            strG = sbD.toString();
        }
        return p031e1.k.e(strG, " >");
    }
}
