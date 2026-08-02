package q4;

import android.content.Context;
import android.content.res.Resources;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.Iterator;
import u.C1614c;
import u.C1617f;
import u.C1618g;
import v4.n;
import v4.o;
import v4.p;
import v4.r;
import v4.v;

/* loaded from: classes2.dex */
public abstract class d {
    public static long a(n nVar) {
        long j = 8;
        if (!(nVar instanceof v4.i) && !(nVar instanceof o)) {
            if (nVar instanceof v4.a) {
                j = 4;
            } else {
                if (!(nVar instanceof v)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + nVar.getClass());
                }
                j = ((v) nVar).f17203c.length() + 2;
            }
        }
        if (nVar.f17190a.isEmpty()) {
            return j;
        }
        return a((n) nVar.f17190a) + j + 24;
    }

    public static long b(r rVar) {
        if (rVar.isEmpty()) {
            return 4L;
        }
        if (rVar.r()) {
            return a((n) rVar);
        }
        k.b("Unexpected node type: " + rVar.getClass(), rVar instanceof v4.f);
        Iterator it = rVar.iterator();
        long j = 1;
        while (it.hasNext()) {
            j = j + r5.f17195a.f17173a.length() + 4 + b(((p) it.next()).f17196b);
        }
        return !rVar.e().isEmpty() ? j + 12 + a((n) rVar.e()) : j;
    }

    public static d c(int i7, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i7 = 2;
        }
        if (i7 == 0) {
            return new C1618g(dArr, dArr2);
        }
        if (i7 == 2) {
            double d7 = dArr[0];
            double[] dArr3 = dArr2[0];
            C1614c c1614c = new C1614c();
            c1614c.f16494a = d7;
            c1614c.f16495b = dArr3;
            return c1614c;
        }
        C1617f c1617f = new C1617f();
        int length = dArr2[0].length;
        c1617f.f16506c = new double[length];
        c1617f.f16504a = dArr;
        c1617f.f16505b = dArr2;
        if (length > 2) {
            double d8 = 0.0d;
            int i8 = 0;
            while (true) {
                double d9 = d8;
                if (i8 >= dArr.length) {
                    break;
                }
                double d10 = dArr2[i8][0];
                if (i8 > 0) {
                    Math.hypot(d10 - d8, d10 - d9);
                }
                i8++;
                d8 = d10;
            }
        }
        return c1617f;
    }

    public static int j(r rVar) {
        int i7 = 0;
        if (rVar.isEmpty()) {
            return 0;
        }
        if (rVar.r()) {
            return 1;
        }
        k.b("Unexpected node type: " + rVar.getClass(), rVar instanceof v4.f);
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            i7 += j(((p) it.next()).f17196b);
        }
        return i7;
    }

    public static String k(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public abstract double d(double d7);

    public abstract void e(double d7, double[] dArr);

    public abstract void f(double d7, float[] fArr);

    public abstract double g(double d7);

    public abstract void h(double d7, double[] dArr);

    public abstract double[] i();
}
