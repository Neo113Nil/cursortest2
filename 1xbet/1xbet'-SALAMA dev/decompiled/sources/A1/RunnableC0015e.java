package A1;

import C1.C0101g;
import G4.C0279l;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: A1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0015e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f344c;

    public /* synthetic */ RunnableC0015e(Object obj, int i7, int i8) {
        this.f342a = i8;
        this.f344c = obj;
        this.f343b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f342a) {
            case 0:
                C0019g c0019g = ((C0017f) this.f344c).f351b;
                c0019g.getClass();
                int i7 = this.f343b;
                if (i7 == -3 || i7 == -2) {
                    if (i7 != -2) {
                        C0101g c0101g = c0019g.f359d;
                        if (!(c0101g != null && c0101g.f1485a == 1)) {
                            c0019g.c(3);
                        }
                    }
                    K k7 = c0019g.f358c;
                    if (k7 != null) {
                        N n2 = k7.f109a;
                        boolean zD = n2.D();
                        n2.T(0, zD ? 2 : 1, zD);
                    }
                    c0019g.c(2);
                } else if (i7 == -1) {
                    K k8 = c0019g.f358c;
                    if (k8 != null) {
                        N n7 = k8.f109a;
                        boolean zD2 = n7.D();
                        n7.T(-1, zD2 ? 2 : 1, zD2);
                    }
                    c0019g.a();
                } else if (i7 == 1) {
                    c0019g.c(1);
                    K k9 = c0019g.f358c;
                    if (k9 != null) {
                        N n8 = k9.f109a;
                        n8.T(1, 1, n8.D());
                    }
                } else {
                    p150v0.a.j(i7, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 1:
                C0279l c0279l = (C0279l) this.f344c;
                SparseArray sparseArray = c0279l.f3000k;
                int i8 = this.f343b;
                G4.Z z4 = (G4.Z) sparseArray.get(i8);
                p113p3.f.O("Tried to release nonexistent target: %s", z4 != null, Integer.valueOf(i8));
                Iterator it = c0279l.f2998h.W(i8).iterator();
                while (true) {
                    E3.F f7 = (E3.F) it;
                    boolean zHasNext = ((Iterator) f7.f1994b).hasNext();
                    P6.b bVar = c0279l.f2991a;
                    if (!zHasNext) {
                        bVar.r().a(z4);
                        sparseArray.remove(i8);
                        c0279l.f3001l.remove(z4.f2953a);
                    } else {
                        bVar.r().q((H4.h) f7.next());
                    }
                    break;
                }
                break;
            default:
                int i9 = this.f343b & 4;
                O1.k kVar = ((io.flutter.plugin.platform.e) this.f344c).f14153b;
                if (i9 != 0) {
                    p028d6.k kVar2 = (p028d6.k) kVar.f4972c;
                    kVar2.getClass();
                    ((A5.s) kVar2.f12447b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                } else {
                    p028d6.k kVar3 = (p028d6.k) kVar.f4972c;
                    kVar3.getClass();
                    ((A5.s) kVar3.f12447b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                }
                break;
        }
    }
}
