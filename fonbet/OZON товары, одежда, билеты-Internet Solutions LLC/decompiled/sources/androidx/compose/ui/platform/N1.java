package androidx.compose.ui.platform;

import D1.AbstractC2810k0;
import I1.C3222a;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.collection.C5145n;
import c2.C5728b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.C7460f;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C7460f f40726a = new C7460f(0.0f, 0.0f, 10.0f, 10.0f);

    public static final K1 a(int i11, @NotNull ArrayList arrayList) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((K1) arrayList.get(i12)).d() == i11) {
                return (K1) arrayList.get(i12);
            }
        }
        return null;
    }

    @NotNull
    public static final androidx.collection.C b(@NotNull I1.t tVar) {
        I1.r a11 = tVar.a();
        int i11 = C5145n.f38723b;
        androidx.collection.C c11 = new androidx.collection.C();
        if (a11.n().B0() && a11.n().z0()) {
            C7460f g10 = a11.g();
            c(new Region(Math.round(g10.n()), Math.round(g10.q()), Math.round(g10.o()), Math.round(g10.h())), a11, c11, a11, new Region());
        }
        return c11;
    }

    private static final void c(Region region, I1.r rVar, androidx.collection.C<M1> c11, I1.r rVar2, Region region2) {
        boolean z11 = (rVar2.n().B0() && rVar2.n().z0()) ? false : true;
        if (!region.isEmpty() || rVar2.l() == rVar.l()) {
            if (!z11 || rVar2.r()) {
                C7460f p11 = rVar2.p();
                int round = Math.round(p11.n());
                int round2 = Math.round(p11.q());
                int round3 = Math.round(p11.o());
                int round4 = Math.round(p11.h());
                region2.set(round, round2, round3, round4);
                int l11 = rVar2.l() == rVar.l() ? -1 : rVar2.l();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (rVar2.r()) {
                        I1.r o11 = rVar2.o();
                        C7460f g10 = (o11 == null || !o11.m().B0()) ? f40726a : o11.g();
                        c11.j(l11, new M1(rVar2, new Rect(Math.round(g10.n()), Math.round(g10.q()), Math.round(g10.o()), Math.round(g10.h()))));
                        return;
                    } else {
                        if (l11 == -1) {
                            c11.j(l11, new M1(rVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c11.j(l11, new M1(rVar2, region2.getBounds()));
                List j11 = I1.r.j(rVar2, 4);
                for (int size = j11.size() - 1; -1 < size; size--) {
                    c(region, rVar, c11, (I1.r) j11.get(size), region2);
                }
                if (e(rVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final K1.K d(@NotNull I1.l lVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        C3222a c3222a = (C3222a) I1.m.a(lVar, I1.k.i());
        if (c3222a == null || (function1 = (Function1) c3222a.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (K1.K) arrayList.get(0);
    }

    public static final boolean e(@NotNull I1.r rVar) {
        if (f(rVar)) {
            return rVar.q().o() || rVar.q().h();
        }
        return false;
    }

    public static final boolean f(@NotNull I1.r rVar) {
        AbstractC2810k0 d11 = rVar.d();
        if (!(d11 != null ? d11.n2() : false)) {
            I1.l q11 = rVar.q();
            int i11 = I1.u.f11751H;
            if (!q11.e(I1.u.l())) {
                return true;
            }
        }
        return false;
    }

    public static final C5728b g(@NotNull C5288u0 c5288u0, int i11) {
        Object obj;
        Iterator<T> it = c5288u0.b().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((D1.H) ((Map.Entry) obj).getKey()).i0() == i11) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (C5728b) entry.getValue();
        }
        return null;
    }

    public static final String h(int i11) {
        if (i11 == 0) {
            return "android.widget.Button";
        }
        if (i11 == 1) {
            return "android.widget.CheckBox";
        }
        if (i11 == 3) {
            return "android.widget.RadioButton";
        }
        if (i11 == 5) {
            return "android.widget.ImageView";
        }
        if (i11 == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
