package p120q4;

import android.content.Context;
import android.content.res.Resources;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.Iterator;
import p143u.c;
import p143u.g;
import v4.a;
import v4.f;
import v4.i;
import v4.n;
import v4.o;
import v4.p;
import v4.r;
import v4.v;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static long a(n nVar) {
        long length = 8;
        if (!(nVar instanceof i) && !(nVar instanceof o)) {
            if (nVar instanceof a) {
                length = 4;
            } else {
                if (!(nVar instanceof v)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + nVar.getClass());
                }
                length = ((long) ((v) nVar).f17209c.length()) + 2;
            }
        }
        if (nVar.f17196a.isEmpty()) {
            return length;
        }
        return a((n) nVar.f17196a) + length + 24;
    }

    public static long b(r rVar) {
        if (rVar.isEmpty()) {
            return 4L;
        }
        if (rVar.r()) {
            return a((n) rVar);
        }
        k.b("Unexpected node type: " + rVar.getClass(), rVar instanceof f);
        Iterator it = rVar.iterator();
        long length = 1;
        while (it.hasNext()) {
            p pVar = (p) it.next();
            length = length + ((long) pVar.f17201a.f17179a.length()) + 4 + b(pVar.f17202b);
        }
        return !rVar.e().isEmpty() ? length + 12 + a((n) rVar.e()) : length;
    }

    public static d c(int i7, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i7 = 2;
        }
        if (i7 == 0) {
            return new g(dArr, dArr2);
        }
        if (i7 == 2) {
            double d7 = dArr[0];
            double[] dArr3 = dArr2[0];
            c cVar = new c();
            cVar.f16500a = d7;
            cVar.f16501b = dArr3;
            return cVar;
        }
        p143u.f fVar = new p143u.f();
        int length = dArr2[0].length;
        fVar.f16512c = new double[length];
        fVar.f16510a = dArr;
        fVar.f16511b = dArr2;
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
        return fVar;
    }

    public static int j(r rVar) {
        int iJ = 0;
        if (rVar.isEmpty()) {
            return 0;
        }
        if (rVar.r()) {
            return 1;
        }
        k.b("Unexpected node type: " + rVar.getClass(), rVar instanceof f);
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            iJ += j(((p) it.next()).f17202b);
        }
        return iJ;
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
