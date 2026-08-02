package p000;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0028a;
import androidx.fragment.app.FragmentContainerView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t50 {

    /* JADX INFO: renamed from: A */
    public final n50 f7281A;

    /* JADX INFO: renamed from: B */
    public final o31 f7282B;

    /* JADX INFO: renamed from: C */
    public C0312i6 f7283C;

    /* JADX INFO: renamed from: D */
    public C0312i6 f7284D;

    /* JADX INFO: renamed from: E */
    public C0312i6 f7285E;

    /* JADX INFO: renamed from: F */
    public ArrayDeque f7286F;

    /* JADX INFO: renamed from: G */
    public boolean f7287G;

    /* JADX INFO: renamed from: H */
    public boolean f7288H;

    /* JADX INFO: renamed from: I */
    public boolean f7289I;

    /* JADX INFO: renamed from: J */
    public boolean f7290J;

    /* JADX INFO: renamed from: K */
    public boolean f7291K;

    /* JADX INFO: renamed from: L */
    public ArrayList f7292L;

    /* JADX INFO: renamed from: M */
    public ArrayList f7293M;

    /* JADX INFO: renamed from: N */
    public ArrayList f7294N;

    /* JADX INFO: renamed from: O */
    public v50 f7295O;

    /* JADX INFO: renamed from: P */
    public final RunnableC0897y0 f7296P;

    /* JADX INFO: renamed from: b */
    public boolean f7298b;

    /* JADX INFO: renamed from: e */
    public ArrayList f7301e;

    /* JADX INFO: renamed from: g */
    public gu0 f7303g;

    /* JADX INFO: renamed from: n */
    public final ArrayList f7310n;

    /* JADX INFO: renamed from: o */
    public final f50 f7311o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList f7312p;

    /* JADX INFO: renamed from: q */
    public final j50 f7313q;

    /* JADX INFO: renamed from: r */
    public final j50 f7314r;

    /* JADX INFO: renamed from: s */
    public final j50 f7315s;

    /* JADX INFO: renamed from: t */
    public final j50 f7316t;

    /* JADX INFO: renamed from: u */
    public final m50 f7317u;

    /* JADX INFO: renamed from: v */
    public int f7318v;

    /* JADX INFO: renamed from: w */
    public e50 f7319w;

    /* JADX INFO: renamed from: x */
    public o80 f7320x;

    /* JADX INFO: renamed from: y */
    public c50 f7321y;

    /* JADX INFO: renamed from: z */
    public c50 f7322z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f7297a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final f71 f7299c = new f71(7);

    /* JADX INFO: renamed from: d */
    public ArrayList f7300d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final i50 f7302f = new i50(this);

    /* JADX INFO: renamed from: h */
    public C0722ta f7304h = null;

    /* JADX INFO: renamed from: i */
    public boolean f7305i = false;

    /* JADX INFO: renamed from: j */
    public final l50 f7306j = new l50(0, this);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f7307k = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    public final Map f7308l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final Map f7309m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [j50] */
    /* JADX WARN: Type inference failed for: r0v17, types: [j50] */
    /* JADX WARN: Type inference failed for: r0v18, types: [j50] */
    /* JADX WARN: Type inference failed for: r0v19, types: [j50] */
    public t50() {
        final int i = 0;
        Collections.synchronizedMap(new HashMap());
        this.f7310n = new ArrayList();
        this.f7311o = new f50(this);
        this.f7312p = new CopyOnWriteArrayList();
        this.f7313q = new InterfaceC0291hm(this) { // from class: j50

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t50 f3822b;

            {
                this.f3822b = this;
            }

            @Override // p000.InterfaceC0291hm
            public final void accept(Object obj) {
                int i2 = i;
                t50 t50Var = this.f3822b;
                switch (i2) {
                    case 0:
                        if (t50Var.m4704L()) {
                            t50Var.m4729i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t50Var.m4704L() && num.intValue() == 80) {
                            t50Var.m4733m(false);
                            break;
                        }
                        break;
                    case 2:
                        vq0 vq0Var = (vq0) obj;
                        if (t50Var.m4704L()) {
                            boolean z = vq0Var.f8250a;
                            t50Var.m4734n(false);
                        }
                        break;
                    default:
                        zv0 zv0Var = (zv0) obj;
                        if (t50Var.m4704L()) {
                            boolean z2 = zv0Var.f9968a;
                            t50Var.m4739s(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f7314r = new InterfaceC0291hm(this) { // from class: j50

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t50 f3822b;

            {
                this.f3822b = this;
            }

            @Override // p000.InterfaceC0291hm
            public final void accept(Object obj) {
                int i3 = i2;
                t50 t50Var = this.f3822b;
                switch (i3) {
                    case 0:
                        if (t50Var.m4704L()) {
                            t50Var.m4729i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t50Var.m4704L() && num.intValue() == 80) {
                            t50Var.m4733m(false);
                            break;
                        }
                        break;
                    case 2:
                        vq0 vq0Var = (vq0) obj;
                        if (t50Var.m4704L()) {
                            boolean z = vq0Var.f8250a;
                            t50Var.m4734n(false);
                        }
                        break;
                    default:
                        zv0 zv0Var = (zv0) obj;
                        if (t50Var.m4704L()) {
                            boolean z2 = zv0Var.f9968a;
                            t50Var.m4739s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f7315s = new InterfaceC0291hm(this) { // from class: j50

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t50 f3822b;

            {
                this.f3822b = this;
            }

            @Override // p000.InterfaceC0291hm
            public final void accept(Object obj) {
                int i4 = i3;
                t50 t50Var = this.f3822b;
                switch (i4) {
                    case 0:
                        if (t50Var.m4704L()) {
                            t50Var.m4729i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t50Var.m4704L() && num.intValue() == 80) {
                            t50Var.m4733m(false);
                            break;
                        }
                        break;
                    case 2:
                        vq0 vq0Var = (vq0) obj;
                        if (t50Var.m4704L()) {
                            boolean z = vq0Var.f8250a;
                            t50Var.m4734n(false);
                        }
                        break;
                    default:
                        zv0 zv0Var = (zv0) obj;
                        if (t50Var.m4704L()) {
                            boolean z2 = zv0Var.f9968a;
                            t50Var.m4739s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f7316t = new InterfaceC0291hm(this) { // from class: j50

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t50 f3822b;

            {
                this.f3822b = this;
            }

            @Override // p000.InterfaceC0291hm
            public final void accept(Object obj) {
                int i5 = i4;
                t50 t50Var = this.f3822b;
                switch (i5) {
                    case 0:
                        if (t50Var.m4704L()) {
                            t50Var.m4729i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (t50Var.m4704L() && num.intValue() == 80) {
                            t50Var.m4733m(false);
                            break;
                        }
                        break;
                    case 2:
                        vq0 vq0Var = (vq0) obj;
                        if (t50Var.m4704L()) {
                            boolean z = vq0Var.f8250a;
                            t50Var.m4734n(false);
                        }
                        break;
                    default:
                        zv0 zv0Var = (zv0) obj;
                        if (t50Var.m4704L()) {
                            boolean z2 = zv0Var.f9968a;
                            t50Var.m4739s(false);
                        }
                        break;
                }
            }
        };
        this.f7317u = new m50(this);
        this.f7318v = -1;
        this.f7281A = new n50(this);
        this.f7282B = new o31(26);
        this.f7286F = new ArrayDeque();
        this.f7296P = new RunnableC0897y0(10, this);
    }

    /* JADX INFO: renamed from: E */
    public static HashSet m4690E(C0722ta c0722ta) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c0722ta.f7374a.size(); i++) {
            c50 c50Var = ((b60) c0722ta.f7374a.get(i)).f734b;
            if (c50Var != null && c0722ta.f7380g) {
                hashSet.add(c50Var);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m4691J(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m4692K(c50 c50Var) {
        c50Var.getClass();
        ArrayList arrayListM1666l = c50Var.f1101E.f7299c.m1666l();
        int size = arrayListM1666l.size();
        boolean zM4692K = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListM1666l.get(i);
            i++;
            c50 c50Var2 = (c50) obj;
            if (c50Var2 != null) {
                zM4692K = m4692K(c50Var2);
            }
            if (zM4692K) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m4693M(c50 c50Var) {
        if (c50Var == null) {
            return true;
        }
        if (c50Var.f1109M) {
            return c50Var.f1099C == null || m4693M(c50Var.f1102F);
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public static boolean m4694N(c50 c50Var) {
        if (c50Var == null) {
            return true;
        }
        t50 t50Var = c50Var.f1099C;
        return c50Var == t50Var.f7322z && m4694N(t50Var.f7321y);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m4695b0(c50 c50Var) {
        if (m4691J(2)) {
            Log.v("FragmentManager", "show: " + c50Var);
        }
        if (c50Var.f1106J) {
            c50Var.f1106J = false;
            c50Var.f1116T = !c50Var.f1116T;
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m4696A(boolean z) {
        boolean zMo4037a;
        ArrayList arrayList;
        C0722ta c0722ta;
        m4746z(z);
        if (!this.f7305i && (c0722ta = this.f7304h) != null) {
            c0722ta.f7391r = false;
            c0722ta.m4776d();
            if (m4691J(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f7304h + " as part of execPendingActions for actions " + this.f7297a);
            }
            this.f7304h.m4777e(false, false);
            this.f7297a.add(0, this.f7304h);
            ArrayList arrayList2 = this.f7304h.f7374a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                c50 c50Var = ((b60) obj).f734b;
                if (c50Var != null) {
                    c50Var.f1139v = false;
                }
            }
            this.f7304h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList3 = this.f7292L;
            ArrayList arrayList4 = this.f7293M;
            synchronized (this.f7297a) {
                if (this.f7297a.isEmpty()) {
                    zMo4037a = false;
                } else {
                    try {
                        int size2 = this.f7297a.size();
                        int i2 = 0;
                        zMo4037a = false;
                        while (true) {
                            arrayList = this.f7297a;
                            if (i2 >= size2) {
                                break;
                            }
                            zMo4037a |= ((q50) arrayList.get(i2)).mo4037a(arrayList3, arrayList4);
                            i2++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f7319w.f1953p.removeCallbacks(this.f7296P);
                    } catch (Throwable th) {
                        this.f7297a.clear();
                        this.f7319w.f1953p.removeCallbacks(this.f7296P);
                        throw th;
                    }
                }
            }
            if (!zMo4037a) {
                m4725e0();
                m4742v();
                ((HashMap) this.f7299c.f2335l).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.f7298b = true;
            try {
                m4710T(this.f7292L, this.f7293M);
                m4722d();
            } catch (Throwable th2) {
                m4722d();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0225 A[PHI: r10
      0x0225: PHI (r10v51 int) = (r10v47 int), (r10v52 int) binds: [B:103:0x0212, B:105:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:223:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX INFO: renamed from: B */
    public final void m4697B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object obj;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        f71 f71Var = this.f7299c;
        ArrayList arrayList3 = this.f7310n;
        boolean z5 = ((C0722ta) arrayList.get(i)).f7388o;
        ArrayList arrayList4 = this.f7294N;
        if (arrayList4 == null) {
            this.f7294N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f7294N.addAll(f71Var.m1668n());
        c50 c50Var = this.f7322z;
        int i5 = i;
        boolean z6 = false;
        while (i5 < i2) {
            C0722ta c0722ta = (C0722ta) arrayList.get(i5);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            ArrayList arrayList5 = this.f7294N;
            if (zBooleanValue) {
                z2 = z5;
                i3 = i5;
                z3 = z6;
                int i6 = 1;
                ArrayList arrayList6 = c0722ta.f7374a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    b60 b60Var = (b60) arrayList6.get(size);
                    int i7 = b60Var.f733a;
                    if (i7 != i6) {
                        if (i7 != 3) {
                            switch (i7) {
                                case 6:
                                    arrayList5.add(b60Var.f734b);
                                    break;
                                case 8:
                                    c50Var = null;
                                    break;
                                case 9:
                                    c50Var = b60Var.f734b;
                                    break;
                                case 10:
                                    b60Var.f741i = b60Var.f740h;
                                    break;
                            }
                        } else {
                            arrayList5.add(b60Var.f734b);
                        }
                        size--;
                        i6 = 1;
                    }
                    arrayList5.remove(b60Var.f734b);
                    size--;
                    i6 = 1;
                }
            } else {
                ArrayList arrayList7 = c0722ta.f7374a;
                int i8 = 0;
                while (i8 < arrayList7.size()) {
                    b60 b60Var2 = (b60) arrayList7.get(i8);
                    boolean z7 = z5;
                    int i9 = b60Var2.f733a;
                    int i10 = i5;
                    int i11 = 1;
                    if (i9 == 1) {
                        z4 = z6;
                        arrayList5.add(b60Var2.f734b);
                    } else if (i9 != 2) {
                        if (i9 == 3 || i9 == 6) {
                            z4 = z6;
                            arrayList5.remove(b60Var2.f734b);
                            c50 c50Var2 = b60Var2.f734b;
                            if (c50Var2 == c50Var) {
                                arrayList7.add(i8, new b60(9, c50Var2));
                                i8++;
                                c50Var = null;
                            }
                        } else if (i9 == 7) {
                            i11 = 1;
                            z4 = z6;
                            arrayList5.add(b60Var2.f734b);
                        } else if (i9 != 8) {
                            z4 = z6;
                        } else {
                            z4 = z6;
                            arrayList7.add(i8, new b60(9, c50Var, 0));
                            b60Var2.f735c = true;
                            i8++;
                            c50Var = b60Var2.f734b;
                        }
                        i11 = 1;
                    } else {
                        z4 = z6;
                        c50 c50Var3 = b60Var2.f734b;
                        int i12 = c50Var3.f1104H;
                        int size2 = arrayList5.size() - 1;
                        boolean z8 = false;
                        while (size2 >= 0) {
                            int i13 = size2;
                            c50 c50Var4 = (c50) arrayList5.get(size2);
                            if (c50Var4.f1104H != i12) {
                                i12 = i12;
                            } else if (c50Var4 == c50Var3) {
                                i12 = i12;
                                z8 = true;
                            } else {
                                if (c50Var4 == c50Var) {
                                    arrayList7.add(i8, new b60(9, c50Var4, 0));
                                    i8++;
                                    i4 = 0;
                                    c50Var = null;
                                } else {
                                    i4 = 0;
                                }
                                b60 b60Var3 = new b60(3, c50Var4, i4);
                                b60Var3.f736d = b60Var2.f736d;
                                b60Var3.f738f = b60Var2.f738f;
                                b60Var3.f737e = b60Var2.f737e;
                                b60Var3.f739g = b60Var2.f739g;
                                arrayList7.add(i8, b60Var3);
                                arrayList5.remove(c50Var4);
                                i8++;
                                c50Var = c50Var;
                            }
                            size2 = i13 - 1;
                            i12 = i12;
                        }
                        i11 = 1;
                        if (z8) {
                            arrayList7.remove(i8);
                            i8--;
                        } else {
                            b60Var2.f733a = 1;
                            b60Var2.f735c = true;
                            arrayList5.add(c50Var3);
                        }
                    }
                    i8 += i11;
                    z5 = z7;
                    i5 = i10;
                    z6 = z4;
                }
                z2 = z5;
                i3 = i5;
                z3 = z6;
            }
            z6 = z3 || c0722ta.f7380g;
            i5 = i3 + 1;
            z5 = z2;
        }
        boolean z9 = z5;
        boolean z10 = z6;
        this.f7294N.clear();
        if (!z9 && this.f7318v >= 1) {
            for (int i14 = i; i14 < i2; i14++) {
                ArrayList arrayList8 = ((C0722ta) arrayList.get(i14)).f7374a;
                int size3 = arrayList8.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj2 = arrayList8.get(i15);
                    i15++;
                    c50 c50Var5 = ((b60) obj2).f734b;
                    if (c50Var5 != null && c50Var5.f1099C != null) {
                        f71Var.m1671r(m4727g(c50Var5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i;
        while (i16 < i2) {
            C0722ta c0722ta2 = (C0722ta) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                c0722ta2.m4775c(-1);
                t50 t50Var = c0722ta2.f7390q;
                ArrayList arrayList9 = c0722ta2.f7374a;
                boolean z11 = true;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    b60 b60Var4 = (b60) arrayList9.get(size4);
                    c50 c50Var6 = b60Var4.f734b;
                    if (c50Var6 != null) {
                        if (c50Var6.f1115S != null) {
                            c50Var6.m864f().f715a = z11;
                        }
                        int i17 = c0722ta2.f7379f;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i19 = 4100;
                                if (i17 != 8197) {
                                    i18 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    }
                                } else {
                                    i18 = i19;
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (c50Var6.f1115S != null || i18 != 0) {
                            c50Var6.m864f();
                            c50Var6.f1115S.f720f = i18;
                        }
                        c50Var6.m864f();
                        c50Var6.f1115S.getClass();
                    }
                    switch (b60Var4.f733a) {
                        case 1:
                            c50Var6.m858F(b60Var4.f736d, b60Var4.f737e, b60Var4.f738f, b60Var4.f739g);
                            z = true;
                            t50Var.m4714X(c50Var6, true);
                            t50Var.m4709S(c50Var6);
                            size4--;
                            z11 = z;
                            break;
                        case 2:
                        default:
                            C0042ay.m528e(str, b60Var4.f733a);
                            return;
                        case 3:
                            c50Var6.m858F(b60Var4.f736d, b60Var4.f737e, b60Var4.f738f, b60Var4.f739g);
                            t50Var.m4717a(c50Var6);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                        case 4:
                            c50Var6.m858F(b60Var4.f736d, b60Var4.f737e, b60Var4.f738f, b60Var4.f739g);
                            t50Var.getClass();
                            m4695b0(c50Var6);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                        case 5:
                            c50Var6.m858F(b60Var4.f736d, b60Var4.f737e, b60Var4.f738f, b60Var4.f739g);
                            t50Var.m4714X(c50Var6, true);
                            t50Var.m4703I(c50Var6);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                        case 6:
                            c50Var6.m858F(b60Var4.f736d, b60Var4.f737e, b60Var4.f738f, b60Var4.f739g);
                            t50Var.m4720c(c50Var6);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                        case 7:
                            c50Var6.m858F(b60Var4.f736d, b60Var4.f737e, b60Var4.f738f, b60Var4.f739g);
                            t50Var.m4714X(c50Var6, true);
                            t50Var.m4728h(c50Var6);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                        case 8:
                            t50Var.m4716Z(null);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                        case 9:
                            t50Var.m4716Z(c50Var6);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                        case 10:
                            b60Var4.f741i = c50Var6.f1119W;
                            t50Var.m4715Y(c50Var6, b60Var4.f740h);
                            z = true;
                            size4--;
                            z11 = z;
                            break;
                    }
                }
            } else {
                c0722ta2.m4775c(1);
                t50 t50Var2 = c0722ta2.f7390q;
                ArrayList arrayList10 = c0722ta2.f7374a;
                int size5 = arrayList10.size();
                int i20 = 0;
                while (i20 < size5) {
                    b60 b60Var5 = (b60) arrayList10.get(i20);
                    c50 c50Var7 = b60Var5.f734b;
                    if (c50Var7 != null) {
                        if (c50Var7.f1115S != null) {
                            c50Var7.m864f().f715a = false;
                        }
                        int i21 = c0722ta2.f7379f;
                        if (c50Var7.f1115S != null || i21 != 0) {
                            c50Var7.m864f();
                            c50Var7.f1115S.f720f = i21;
                        }
                        c50Var7.m864f();
                        c50Var7.f1115S.getClass();
                    }
                    switch (b60Var5.f733a) {
                        case 1:
                            c50Var7.m858F(b60Var5.f736d, b60Var5.f737e, b60Var5.f738f, b60Var5.f739g);
                            t50Var2.m4714X(c50Var7, false);
                            t50Var2.m4717a(c50Var7);
                            i20++;
                            str = str;
                            break;
                        case 2:
                        default:
                            C0042ay.m528e(str, b60Var5.f733a);
                            return;
                        case 3:
                            c50Var7.m858F(b60Var5.f736d, b60Var5.f737e, b60Var5.f738f, b60Var5.f739g);
                            t50Var2.m4709S(c50Var7);
                            i20++;
                            str = str;
                            break;
                        case 4:
                            c50Var7.m858F(b60Var5.f736d, b60Var5.f737e, b60Var5.f738f, b60Var5.f739g);
                            t50Var2.m4703I(c50Var7);
                            i20++;
                            str = str;
                            break;
                        case 5:
                            c50Var7.m858F(b60Var5.f736d, b60Var5.f737e, b60Var5.f738f, b60Var5.f739g);
                            t50Var2.m4714X(c50Var7, false);
                            m4695b0(c50Var7);
                            i20++;
                            str = str;
                            break;
                        case 6:
                            c50Var7.m858F(b60Var5.f736d, b60Var5.f737e, b60Var5.f738f, b60Var5.f739g);
                            t50Var2.m4728h(c50Var7);
                            i20++;
                            str = str;
                            break;
                        case 7:
                            c50Var7.m858F(b60Var5.f736d, b60Var5.f737e, b60Var5.f738f, b60Var5.f739g);
                            t50Var2.m4714X(c50Var7, false);
                            t50Var2.m4720c(c50Var7);
                            i20++;
                            str = str;
                            break;
                        case 8:
                            t50Var2.m4716Z(c50Var7);
                            i20++;
                            str = str;
                            break;
                        case 9:
                            t50Var2.m4716Z(null);
                            i20++;
                            str = str;
                            break;
                        case 10:
                            b60Var5.f740h = c50Var7.f1119W;
                            t50Var2.m4715Y(c50Var7, b60Var5.f741i);
                            i20++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z10 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i22 = 0;
            while (i22 < size6) {
                Object obj3 = arrayList.get(i22);
                i22++;
                linkedHashSet.addAll(m4690E((C0722ta) obj3));
            }
            if (this.f7304h == null) {
                int size7 = arrayList3.size();
                int i23 = 0;
                while (i23 < size7) {
                    Object obj4 = arrayList3.get(i23);
                    i23++;
                    if (obj4 != null) {
                        dd0.m1158c();
                        return;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i24 = 0;
                while (i24 < size8) {
                    Object obj5 = arrayList3.get(i24);
                    i24++;
                    if (obj5 != null) {
                        dd0.m1158c();
                        return;
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i25 = i; i25 < i2; i25++) {
            C0722ta c0722ta3 = (C0722ta) arrayList.get(i25);
            if (zBooleanValue2) {
                for (int size9 = c0722ta3.f7374a.size() - 1; size9 >= 0; size9--) {
                    c50 c50Var8 = ((b60) c0722ta3.f7374a.get(size9)).f734b;
                    if (c50Var8 != null) {
                        m4727g(c50Var8).m427k();
                    }
                }
            } else {
                ArrayList arrayList11 = c0722ta3.f7374a;
                int size10 = arrayList11.size();
                int i26 = 0;
                while (i26 < size10) {
                    Object obj6 = arrayList11.get(i26);
                    i26++;
                    c50 c50Var9 = ((b60) obj6).f734b;
                    if (c50Var9 != null) {
                        m4727g(c50Var9).m427k();
                    }
                }
            }
        }
        m4705O(this.f7318v, true);
        int i27 = i;
        for (C0443lr c0443lr : m4726f(arrayList, i27, i2)) {
            c0443lr.f4887e = zBooleanValue2;
            synchronized (c0443lr.f4884b) {
                try {
                    c0443lr.m3287l();
                    ArrayList arrayList12 = c0443lr.f4884b;
                    ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            i91 i91Var = (i91) objPrevious;
                            View view = i91Var.f3488c.f1112P;
                            view.getClass();
                            char c = 4;
                            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    c = 2;
                                } else if (visibility != 4) {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                    c = 3;
                                }
                            }
                            if (i91Var.f3486a == 2 && c != 2) {
                                obj = objPrevious;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    c0443lr.f4888f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0443lr.m3282e();
        }
        while (i27 < i2) {
            C0722ta c0722ta4 = (C0722ta) arrayList.get(i27);
            if (((Boolean) arrayList2.get(i27)).booleanValue() && c0722ta4.f7392s >= 0) {
                c0722ta4.f7392s = -1;
            }
            if (c0722ta4.f7389p != null) {
                for (int i28 = 0; i28 < c0722ta4.f7389p.size(); i28++) {
                    ((Runnable) c0722ta4.f7389p.get(i28)).run();
                }
                c0722ta4.f7389p = null;
            }
            i27++;
        }
        if (!z10 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        dd0.m1158c();
    }

    /* JADX INFO: renamed from: C */
    public final c50 m4698C(int i) {
        f71 f71Var = this.f7299c;
        ArrayList arrayList = (ArrayList) f71Var.f2334k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c50 c50Var = (c50) arrayList.get(size);
            if (c50Var != null && c50Var.f1103G == i) {
                return c50Var;
            }
        }
        for (C0028a c0028a : ((HashMap) f71Var.f2335l).values()) {
            if (c0028a != null) {
                c50 c50Var2 = c0028a.f537c;
                if (c50Var2.f1103G == i) {
                    return c50Var2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final void m4699D() {
        for (C0443lr c0443lr : m4724e()) {
            if (c0443lr.f4888f) {
                if (m4691J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0443lr.f4888f = false;
                c0443lr.m3282e();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final ViewGroup m4700F(c50 c50Var) {
        ViewGroup viewGroup = c50Var.f1111O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (c50Var.f1104H <= 0 || !this.f7320x.mo25u()) {
            return null;
        }
        View viewMo24t = this.f7320x.mo24t(c50Var.f1104H);
        if (viewMo24t instanceof ViewGroup) {
            return (ViewGroup) viewMo24t;
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final n50 m4701G() {
        c50 c50Var = this.f7321y;
        return c50Var != null ? c50Var.f1099C.m4701G() : this.f7281A;
    }

    /* JADX INFO: renamed from: H */
    public final o31 m4702H() {
        c50 c50Var = this.f7321y;
        return c50Var != null ? c50Var.f1099C.m4702H() : this.f7282B;
    }

    /* JADX INFO: renamed from: I */
    public final void m4703I(c50 c50Var) {
        if (m4691J(2)) {
            Log.v("FragmentManager", "hide: " + c50Var);
        }
        if (c50Var.f1106J) {
            return;
        }
        c50Var.f1106J = true;
        c50Var.f1116T = true ^ c50Var.f1116T;
        m4718a0(c50Var);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m4704L() {
        c50 c50Var = this.f7321y;
        if (c50Var == null) {
            return true;
        }
        return c50Var.f1100D != null && c50Var.f1137t && c50Var.m868j().m4704L();
    }

    /* JADX INFO: renamed from: O */
    public final void m4705O(int i, boolean z) {
        e50 e50Var;
        if (this.f7319w == null && i != -1) {
            C0270h1.m2191g("No activity");
            return;
        }
        if (z || i != this.f7318v) {
            this.f7318v = i;
            f71 f71Var = this.f7299c;
            HashMap map = (HashMap) f71Var.f2335l;
            ArrayList arrayList = (ArrayList) f71Var.f2334k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C0028a c0028a = (C0028a) map.get(((c50) obj).f1131n);
                if (c0028a != null) {
                    c0028a.m427k();
                }
            }
            for (C0028a c0028a2 : map.values()) {
                if (c0028a2 != null) {
                    c0028a2.m427k();
                    c50 c50Var = c0028a2.f537c;
                    if (c50Var.f1138u && !c50Var.m872n()) {
                        f71Var.m1672s(c0028a2);
                    }
                }
            }
            m4721c0();
            if (this.f7287G && (e50Var = this.f7319w) != null && this.f7318v == 7) {
                e50Var.f1955r.invalidateOptionsMenu();
                this.f7287G = false;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m4706P() {
        if (this.f7319w == null) {
            return;
        }
        this.f7288H = false;
        this.f7289I = false;
        this.f7295O.f8094h = false;
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null) {
                c50Var.f1101E.m4706P();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m4707Q() {
        m4696A(false);
        m4746z(true);
        c50 c50Var = this.f7322z;
        if (c50Var != null && c50Var.m866h().m4707Q()) {
            return true;
        }
        boolean zM4708R = m4708R(this.f7292L, this.f7293M, -1, 0);
        if (zM4708R) {
            this.f7298b = true;
            try {
                m4710T(this.f7292L, this.f7293M);
                m4722d();
            } catch (Throwable th) {
                m4722d();
                throw th;
            }
        }
        m4725e0();
        m4742v();
        ((HashMap) this.f7299c.f2335l).values().removeAll(Collections.singleton(null));
        return zM4708R;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4708R(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.f7300d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f7300d.size() - 1;
            } else {
                int size2 = this.f7300d.size() - 1;
                while (size2 >= 0) {
                    C0722ta c0722ta = (C0722ta) this.f7300d.get(size2);
                    if (i >= 0 && i == c0722ta.f7392s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C0722ta c0722ta2 = (C0722ta) this.f7300d.get(size - 1);
                        if (i < 0 || i != c0722ta2.f7392s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f7300d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f7300d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0722ta) this.f7300d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final void m4709S(c50 c50Var) {
        if (m4691J(2)) {
            Log.v("FragmentManager", "remove: " + c50Var + " nesting=" + c50Var.f1098B);
        }
        boolean zM872n = c50Var.m872n();
        if (c50Var.f1107K && zM872n) {
            return;
        }
        f71 f71Var = this.f7299c;
        synchronized (((ArrayList) f71Var.f2334k)) {
            ((ArrayList) f71Var.f2334k).remove(c50Var);
        }
        c50Var.f1137t = false;
        if (m4692K(c50Var)) {
            this.f7287G = true;
        }
        c50Var.f1138u = true;
        m4718a0(c50Var);
    }

    /* JADX INFO: renamed from: T */
    public final void m4710T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C0270h1.m2191g("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0722ta) arrayList.get(i)).f7388o) {
                if (i2 != i) {
                    m4697B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0722ta) arrayList.get(i2)).f7388o) {
                        i2++;
                    }
                }
                m4697B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m4697B(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m4711U(Bundle bundle) {
        f50 f50Var;
        int i;
        Bundle bundle2;
        C0028a c0028a;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f7319w.f1952o.getClassLoader());
                this.f7309m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f7319w.f1952o.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        f71 f71Var = this.f7299c;
        HashMap map2 = (HashMap) f71Var.f2336m;
        HashMap map3 = (HashMap) f71Var.f2335l;
        map2.clear();
        map2.putAll(map);
        u50 u50Var = (u50) bundle.getParcelable("state");
        if (u50Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = u50Var.f7673j;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            f50Var = this.f7311o;
            int i3 = 2;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            Bundle bundleM1676w = f71Var.m1676w(null, (String) obj);
            if (bundleM1676w != null) {
                c50 c50Var = (c50) this.f7295O.f8089c.get(((y50) bundleM1676w.getParcelable("state")).f9161k);
                if (c50Var != null) {
                    if (m4691J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + c50Var);
                    }
                    c0028a = new C0028a(f50Var, f71Var, c50Var, bundleM1676w);
                    bundle2 = bundleM1676w;
                } else {
                    i3 = 2;
                    bundle2 = bundleM1676w;
                    c0028a = new C0028a(this.f7311o, this.f7299c, this.f7319w.f1952o.getClassLoader(), m4701G(), bundleM1676w);
                }
                c50 c50Var2 = c0028a.f537c;
                c50Var2.f1128k = bundle2;
                c50Var2.f1099C = this;
                if (m4691J(i3)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + c50Var2.f1131n + "): " + c50Var2);
                }
                c0028a.m429m(this.f7319w.f1952o.getClassLoader());
                f71Var.m1671r(c0028a);
                c0028a.f539e = this.f7318v;
            }
        }
        v50 v50Var = this.f7295O;
        v50Var.getClass();
        ArrayList arrayList2 = new ArrayList(v50Var.f8089c.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            c50 c50Var3 = (c50) obj2;
            if (map3.get(c50Var3.f1131n) == null) {
                if (m4691J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + c50Var3 + " that was not found in the set of active Fragments " + u50Var.f7673j);
                }
                this.f7295O.m5076f(c50Var3);
                c50Var3.f1099C = this;
                C0028a c0028a2 = new C0028a(f50Var, f71Var, c50Var3);
                c0028a2.f539e = 1;
                c0028a2.m427k();
                c50Var3.f1138u = true;
                c0028a2.m427k();
            }
        }
        ArrayList arrayList3 = u50Var.f7674k;
        ((ArrayList) f71Var.f2334k).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                c50 c50VarM1662h = f71Var.m1662h(str3);
                if (c50VarM1662h == null) {
                    C0270h1.m2191g(AbstractC0024an.m284g("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (m4691J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c50VarM1662h);
                }
                f71Var.m1655a(c50VarM1662h);
            }
        }
        if (u50Var.f7675l != null) {
            this.f7300d = new ArrayList(u50Var.f7675l.length);
            int i6 = 0;
            while (true) {
                C0759ua[] c0759uaArr = u50Var.f7675l;
                if (i6 >= c0759uaArr.length) {
                    break;
                }
                C0759ua c0759ua = c0759uaArr[i6];
                ArrayList arrayList4 = c0759ua.f7721k;
                C0722ta c0722ta = new C0722ta(this);
                int[] iArr = c0759ua.f7720j;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    b60 b60Var = new b60();
                    int i9 = i7 + 1;
                    b60Var.f733a = iArr[i7];
                    if (m4691J(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0722ta + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    b60Var.f740h = qh0.values()[c0759ua.f7722l[i8]];
                    b60Var.f741i = qh0.values()[c0759ua.f7723m[i8]];
                    int i10 = i7 + 2;
                    b60Var.f735c = iArr[i9] != 0;
                    int i11 = iArr[i10];
                    b60Var.f736d = i11;
                    int i12 = iArr[i7 + 3];
                    b60Var.f737e = i12;
                    int i13 = i7 + 5;
                    int i14 = iArr[i7 + 4];
                    b60Var.f738f = i14;
                    i7 += 6;
                    int[] iArr2 = iArr;
                    int i15 = iArr2[i13];
                    b60Var.f739g = i15;
                    c0722ta.f7375b = i11;
                    c0722ta.f7376c = i12;
                    c0722ta.f7377d = i14;
                    c0722ta.f7378e = i15;
                    c0722ta.m4774b(b60Var);
                    i8++;
                    iArr = iArr2;
                }
                c0722ta.f7379f = c0759ua.f7724n;
                c0722ta.f7381h = c0759ua.f7725o;
                c0722ta.f7380g = true;
                c0722ta.f7382i = c0759ua.f7727q;
                c0722ta.f7383j = c0759ua.f7728r;
                c0722ta.f7384k = c0759ua.f7729s;
                c0722ta.f7385l = c0759ua.f7730t;
                c0722ta.f7386m = c0759ua.f7731u;
                c0722ta.f7387n = c0759ua.f7732v;
                c0722ta.f7388o = c0759ua.f7733w;
                c0722ta.f7392s = c0759ua.f7726p;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str4 = (String) arrayList4.get(i16);
                    if (str4 != null) {
                        ((b60) c0722ta.f7374a.get(i16)).f734b = f71Var.m1662h(str4);
                    }
                }
                c0722ta.m4775c(1);
                if (m4691J(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + c0722ta.f7392s + "): " + c0722ta);
                    PrintWriter printWriter = new PrintWriter(new ik0());
                    c0722ta.m4779g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f7300d.add(c0722ta);
                i6++;
            }
            i = 0;
        } else {
            i = 0;
            this.f7300d = new ArrayList();
        }
        this.f7307k.set(u50Var.f7676m);
        String str5 = u50Var.f7677n;
        if (str5 != null) {
            c50 c50VarM1662h2 = f71Var.m1662h(str5);
            this.f7322z = c50VarM1662h2;
            m4738r(c50VarM1662h2);
        }
        ArrayList arrayList5 = u50Var.f7678o;
        if (arrayList5 != null) {
            for (int i17 = i; i17 < arrayList5.size(); i17++) {
                this.f7308l.put((String) arrayList5.get(i17), (C0796va) u50Var.f7679p.get(i17));
            }
        }
        this.f7286F = new ArrayDeque(u50Var.f7680q);
    }

    /* JADX INFO: renamed from: V */
    public final Bundle m4712V() {
        int i;
        ArrayList arrayList;
        C0759ua[] c0759uaArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        m4699D();
        m4744x();
        m4696A(true);
        this.f7288H = true;
        this.f7295O.f8094h = true;
        f71 f71Var = this.f7299c;
        f71Var.getClass();
        HashMap map = (HashMap) f71Var.f2335l;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0028a c0028a = (C0028a) it.next();
            if (c0028a != null) {
                c50 c50Var = c0028a.f537c;
                String str = c50Var.f1131n;
                Bundle bundle3 = new Bundle();
                c50 c50Var2 = c0028a.f537c;
                if (c50Var2.f1127j == -1 && (bundle = c50Var2.f1128k) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new y50(c50Var2));
                if (c50Var2.f1127j > 0) {
                    Bundle bundle4 = new Bundle();
                    c50Var2.mo881w(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c0028a.f535a.m1598A(c50Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    c50Var2.f1123a0.m3359h(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM4712V = c50Var2.f1101E.m4712V();
                    if (!bundleM4712V.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM4712V);
                    }
                    if (c50Var2.f1112P != null) {
                        c0028a.m431o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = c50Var2.f1129l;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = c50Var2.f1130m;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = c50Var2.f1132o;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                f71Var.m1676w(bundle3, str);
                arrayList2.add(c50Var.f1131n);
                if (m4691J(2)) {
                    Log.v("FragmentManager", "Saved state of " + c50Var + ": " + c50Var.f1128k);
                }
            }
        }
        HashMap map2 = (HashMap) this.f7299c.f2336m;
        if (!map2.isEmpty()) {
            f71 f71Var2 = this.f7299c;
            synchronized (((ArrayList) f71Var2.f2334k)) {
                try {
                    if (((ArrayList) f71Var2.f2334k).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) f71Var2.f2334k).size());
                        ArrayList arrayList3 = (ArrayList) f71Var2.f2334k;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            c50 c50Var3 = (c50) obj;
                            arrayList.add(c50Var3.f1131n);
                            if (m4691J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + c50Var3.f1131n + "): " + c50Var3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.f7300d.size();
            if (size2 > 0) {
                c0759uaArr = new C0759ua[size2];
                for (i = 0; i < size2; i++) {
                    c0759uaArr[i] = new C0759ua((C0722ta) this.f7300d.get(i));
                    if (m4691J(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f7300d.get(i));
                    }
                }
            } else {
                c0759uaArr = null;
            }
            u50 u50Var = new u50();
            u50Var.f7677n = null;
            ArrayList arrayList4 = new ArrayList();
            u50Var.f7678o = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            u50Var.f7679p = arrayList5;
            u50Var.f7673j = arrayList2;
            u50Var.f7674k = arrayList;
            u50Var.f7675l = c0759uaArr;
            u50Var.f7676m = this.f7307k.get();
            c50 c50Var4 = this.f7322z;
            if (c50Var4 != null) {
                u50Var.f7677n = c50Var4.f1131n;
            }
            arrayList4.addAll(this.f7308l.keySet());
            arrayList5.addAll(this.f7308l.values());
            u50Var.f7680q = new ArrayList(this.f7286F);
            bundle2.putParcelable("state", u50Var);
            for (String str2 : this.f7309m.keySet()) {
                bundle2.putBundle(AbstractC0024an.m283f("result_", str2), (Bundle) this.f7309m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC0024an.m283f("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (m4691J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: W */
    public final void m4713W() {
        synchronized (this.f7297a) {
            try {
                if (this.f7297a.size() == 1) {
                    this.f7319w.f1953p.removeCallbacks(this.f7296P);
                    this.f7319w.f1953p.post(this.f7296P);
                    m4725e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m4714X(c50 c50Var, boolean z) {
        ViewGroup viewGroupM4700F = m4700F(c50Var);
        if (viewGroupM4700F == null || !(viewGroupM4700F instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM4700F).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: Y */
    public final void m4715Y(c50 c50Var, qh0 qh0Var) {
        if (c50Var == this.f7299c.m1662h(c50Var.f1131n) && (c50Var.f1100D == null || c50Var.f1099C == this)) {
            c50Var.f1119W = qh0Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + c50Var + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: Z */
    public final void m4716Z(c50 c50Var) {
        if (c50Var != null) {
            if (c50Var != this.f7299c.m1662h(c50Var.f1131n) || (c50Var.f1100D != null && c50Var.f1099C != this)) {
                throw new IllegalArgumentException("Fragment " + c50Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        c50 c50Var2 = this.f7322z;
        this.f7322z = c50Var;
        m4738r(c50Var2);
        m4738r(this.f7322z);
    }

    /* JADX INFO: renamed from: a */
    public final C0028a m4717a(c50 c50Var) {
        String str = c50Var.f1118V;
        if (str != null) {
            a60.m33c(c50Var, str);
        }
        if (m4691J(2)) {
            Log.v("FragmentManager", "add: " + c50Var);
        }
        C0028a c0028aM4727g = m4727g(c50Var);
        c50Var.f1099C = this;
        f71 f71Var = this.f7299c;
        f71Var.m1671r(c0028aM4727g);
        if (!c50Var.f1107K) {
            f71Var.m1655a(c50Var);
            c50Var.f1138u = false;
            if (c50Var.f1112P == null) {
                c50Var.f1116T = false;
            }
            if (m4692K(c50Var)) {
                this.f7287G = true;
            }
        }
        return c0028aM4727g;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4718a0(c50 c50Var) {
        ViewGroup viewGroupM4700F = m4700F(c50Var);
        if (viewGroupM4700F != null) {
            b50 b50Var = c50Var.f1115S;
            if ((b50Var == null ? 0 : b50Var.f719e) + (b50Var == null ? 0 : b50Var.f718d) + (b50Var == null ? 0 : b50Var.f717c) + (b50Var == null ? 0 : b50Var.f716b) > 0) {
                if (viewGroupM4700F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM4700F.setTag(R.id.visible_removing_fragment_view_tag, c50Var);
                }
                c50 c50Var2 = (c50) viewGroupM4700F.getTag(R.id.visible_removing_fragment_view_tag);
                b50 b50Var2 = c50Var.f1115S;
                boolean z = b50Var2 != null ? b50Var2.f715a : false;
                if (c50Var2.f1115S == null) {
                    return;
                }
                c50Var2.m864f().f715a = z;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4719b(e50 e50Var, o80 o80Var, c50 c50Var) {
        if (this.f7319w != null) {
            C0270h1.m2191g("Already attached");
            return;
        }
        this.f7319w = e50Var;
        this.f7320x = o80Var;
        this.f7321y = c50Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7312p;
        if (c50Var != null) {
            copyOnWriteArrayList.add(new o50(c50Var));
        } else if (e50Var != null) {
            copyOnWriteArrayList.add(e50Var);
        }
        if (this.f7321y != null) {
            m4725e0();
        }
        if (e50Var != null) {
            gu0 gu0VarM2118h = e50Var.f1955r.m2118h();
            this.f7303g = gu0VarM2118h;
            gu0VarM2118h.m2151a(this.f7306j, c50Var != null ? c50Var : e50Var);
        }
        int i = 0;
        if (c50Var != null) {
            v50 v50Var = c50Var.f1099C.f7295O;
            HashMap map = v50Var.f8090d;
            v50 v50Var2 = (v50) map.get(c50Var.f1131n);
            if (v50Var2 == null) {
                v50Var2 = new v50(v50Var.f8092f);
                map.put(c50Var.f1131n, v50Var2);
            }
            this.f7295O = v50Var2;
        } else if (e50Var != null) {
            oq0 oq0Var = new oq0(e50Var.f1955r.mo861c(), v50.f8088i, C0772un.f7861k);
            String canonicalName = v50.class.getCanonicalName();
            if (canonicalName == null) {
                C0270h1.m2190f("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.f7295O = (v50) oq0Var.m3733c(v50.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.f7295O = new v50(false);
        }
        v50 v50Var3 = this.f7295O;
        int i2 = 1;
        v50Var3.f8094h = this.f7288H || this.f7289I;
        this.f7299c.f2337n = v50Var3;
        e50 e50Var2 = this.f7319w;
        int i3 = 2;
        if (e50Var2 != null && c50Var == null) {
            C0086c5 c0086c5Mo859a = e50Var2.mo859a();
            c0086c5Mo859a.m851e("android:support:fragments", new C0021ak(i3, this));
            Bundle bundleM849c = c0086c5Mo859a.m849c("android:support:fragments");
            if (bundleM849c != null) {
                m4711U(bundleM849c);
            }
        }
        e50 e50Var3 = this.f7319w;
        if (e50Var3 != null) {
            C0177ek c0177ek = e50Var3.f1955r.f2781q;
            String strConcat = "FragmentManager:".concat(c50Var != null ? AbstractC0024an.m285h(new StringBuilder(), c50Var.f1131n, ":") : "");
            this.f7283C = c0177ek.m1433b(strConcat.concat("StartActivityForResult"), new C0084c3(i2), new b90(23, this));
            this.f7284D = c0177ek.m1433b(strConcat.concat("StartIntentSenderForResult"), new C0084c3(i3), new k50(this, i2));
            this.f7285E = c0177ek.m1433b(strConcat.concat("RequestPermissions"), new C0084c3(i), new k50(this, i));
        }
        e50 e50Var4 = this.f7319w;
        if (e50Var4 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v4 = e50Var4.f1955r;
            j50 j50Var = this.f7313q;
            j50Var.getClass();
            abstractActivityC0790v4.f2782r.add(j50Var);
        }
        e50 e50Var5 = this.f7319w;
        if (e50Var5 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v5 = e50Var5.f1955r;
            j50 j50Var2 = this.f7314r;
            j50Var2.getClass();
            abstractActivityC0790v5.f2783s.add(j50Var2);
        }
        e50 e50Var6 = this.f7319w;
        if (e50Var6 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v6 = e50Var6.f1955r;
            j50 j50Var3 = this.f7315s;
            j50Var3.getClass();
            abstractActivityC0790v6.f2785u.add(j50Var3);
        }
        e50 e50Var7 = this.f7319w;
        if (e50Var7 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v7 = e50Var7.f1955r;
            j50 j50Var4 = this.f7316t;
            j50Var4.getClass();
            abstractActivityC0790v7.f2786v.add(j50Var4);
        }
        e50 e50Var8 = this.f7319w;
        if (e50Var8 == null || c50Var != null) {
            return;
        }
        AbstractActivityC0790v4 abstractActivityC0790v8 = e50Var8.f1955r;
        m50 m50Var = this.f7317u;
        m50Var.getClass();
        qd0 qd0Var = abstractActivityC0790v8.f2776l;
        ((CopyOnWriteArrayList) qd0Var.f6472l).add(m50Var);
        ((Runnable) qd0Var.f6471k).run();
    }

    /* JADX INFO: renamed from: c */
    public final void m4720c(c50 c50Var) {
        if (m4691J(2)) {
            Log.v("FragmentManager", "attach: " + c50Var);
        }
        if (c50Var.f1107K) {
            c50Var.f1107K = false;
            if (c50Var.f1137t) {
                return;
            }
            this.f7299c.m1655a(c50Var);
            if (m4691J(2)) {
                Log.v("FragmentManager", "add from attach: " + c50Var);
            }
            if (m4692K(c50Var)) {
                this.f7287G = true;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4721c0() {
        ArrayList arrayListM1665k = this.f7299c.m1665k();
        int size = arrayListM1665k.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM1665k.get(i);
            i++;
            C0028a c0028a = (C0028a) obj;
            c50 c50Var = c0028a.f537c;
            if (c50Var.f1113Q) {
                if (this.f7298b) {
                    this.f7291K = true;
                } else {
                    c50Var.f1113Q = false;
                    c0028a.m427k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4722d() {
        this.f7298b = false;
        this.f7293M.clear();
        this.f7292L.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4723d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ik0());
        e50 e50Var = this.f7319w;
        if (e50Var == null) {
            try {
                m4743w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            e50Var.f1955r.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m4724e() {
        C0443lr c0443lr;
        HashSet hashSet = new HashSet();
        ArrayList arrayListM1665k = this.f7299c.m1665k();
        int size = arrayListM1665k.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM1665k.get(i);
            i++;
            ViewGroup viewGroup = ((C0028a) obj).f537c.f1111O;
            if (viewGroup != null) {
                m4702H().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0443lr) {
                    c0443lr = (C0443lr) tag;
                } else {
                    c0443lr = new C0443lr(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0443lr);
                }
                hashSet.add(c0443lr);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m4725e0() {
        synchronized (this.f7297a) {
            try {
                if (!this.f7297a.isEmpty()) {
                    this.f7306j.m3175e(true);
                    if (m4691J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.f7300d.size() + (this.f7304h != null ? 1 : 0) > 0 && m4694N(this.f7321y);
                if (m4691J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.f7306j.m3175e(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m4726f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((C0722ta) arrayList.get(i)).f7374a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                c50 c50Var = ((b60) obj).f734b;
                if (c50Var != null && (viewGroup = c50Var.f1111O) != null) {
                    hashSet.add(C0443lr.m3276i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: g */
    public final C0028a m4727g(c50 c50Var) {
        String str = c50Var.f1131n;
        f71 f71Var = this.f7299c;
        C0028a c0028a = (C0028a) ((HashMap) f71Var.f2335l).get(str);
        if (c0028a != null) {
            return c0028a;
        }
        C0028a c0028a2 = new C0028a(this.f7311o, f71Var, c50Var);
        c0028a2.m429m(this.f7319w.f1952o.getClassLoader());
        c0028a2.f539e = this.f7318v;
        return c0028a2;
    }

    /* JADX INFO: renamed from: h */
    public final void m4728h(c50 c50Var) {
        if (m4691J(2)) {
            Log.v("FragmentManager", "detach: " + c50Var);
        }
        if (c50Var.f1107K) {
            return;
        }
        c50Var.f1107K = true;
        if (c50Var.f1137t) {
            if (m4691J(2)) {
                Log.v("FragmentManager", "remove from detach: " + c50Var);
            }
            f71 f71Var = this.f7299c;
            synchronized (((ArrayList) f71Var.f2334k)) {
                ((ArrayList) f71Var.f2334k).remove(c50Var);
            }
            c50Var.f1137t = false;
            if (m4692K(c50Var)) {
                this.f7287G = true;
            }
            m4718a0(c50Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4729i(boolean z) {
        if (z && this.f7319w != null) {
            m4723d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null) {
                c50Var.f1110N = true;
                if (z) {
                    c50Var.f1101E.m4729i(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4730j() {
        if (this.f7318v >= 1) {
            for (c50 c50Var : this.f7299c.m1668n()) {
                if (c50Var != null) {
                    if (!c50Var.f1106J ? c50Var.f1101E.m4730j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4731k() {
        if (this.f7318v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null && m4693M(c50Var)) {
                if (!c50Var.f1106J ? c50Var.f1101E.m4731k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c50Var);
                    z = true;
                }
            }
        }
        if (this.f7301e != null) {
            for (int i = 0; i < this.f7301e.size(); i++) {
                c50 c50Var2 = (c50) this.f7301e.get(i);
                if (arrayList == null || !arrayList.contains(c50Var2)) {
                    c50Var2.getClass();
                }
            }
        }
        this.f7301e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final void m4732l() throws Exception {
        boolean z;
        boolean zIsTerminated;
        this.f7290J = true;
        m4696A(true);
        m4744x();
        e50 e50Var = this.f7319w;
        f71 f71Var = this.f7299c;
        if (e50Var != null) {
            z = ((v50) f71Var.f2337n).f8093g;
        } else {
            AbstractActivityC0790v4 abstractActivityC0790v4 = e50Var.f1952o;
            z = abstractActivityC0790v4 != null ? !abstractActivityC0790v4.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z) {
            Iterator it = this.f7308l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((C0796va) it.next()).f8146j;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((v50) f71Var.f2337n).m5074d((String) obj, false);
                }
            }
        }
        m4741u(-1);
        e50 e50Var2 = this.f7319w;
        if (e50Var2 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v5 = e50Var2.f1955r;
            j50 j50Var = this.f7314r;
            j50Var.getClass();
            abstractActivityC0790v5.f2783s.remove(j50Var);
        }
        e50 e50Var3 = this.f7319w;
        if (e50Var3 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v6 = e50Var3.f1955r;
            j50 j50Var2 = this.f7313q;
            j50Var2.getClass();
            abstractActivityC0790v6.f2782r.remove(j50Var2);
        }
        e50 e50Var4 = this.f7319w;
        if (e50Var4 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v7 = e50Var4.f1955r;
            j50 j50Var3 = this.f7315s;
            j50Var3.getClass();
            abstractActivityC0790v7.f2785u.remove(j50Var3);
        }
        e50 e50Var5 = this.f7319w;
        if (e50Var5 != null) {
            AbstractActivityC0790v4 abstractActivityC0790v8 = e50Var5.f1955r;
            j50 j50Var4 = this.f7316t;
            j50Var4.getClass();
            abstractActivityC0790v8.f2786v.remove(j50Var4);
        }
        e50 e50Var6 = this.f7319w;
        if (e50Var6 != null && this.f7321y == null) {
            AbstractActivityC0790v4 abstractActivityC0790v9 = e50Var6.f1955r;
            m50 m50Var = this.f7317u;
            m50Var.getClass();
            qd0 qd0Var = abstractActivityC0790v9.f2776l;
            ((CopyOnWriteArrayList) qd0Var.f6472l).remove(m50Var);
            if (((HashMap) qd0Var.f6473m).remove(m50Var) == null) {
                ((Runnable) qd0Var.f6471k).run();
            } else {
                dd0.m1158c();
            }
        }
        this.f7319w = null;
        this.f7320x = null;
        this.f7321y = null;
        if (this.f7303g != null) {
            l50 l50Var = this.f7306j;
            ArrayList arrayList2 = l50Var.f4679a;
            CopyOnWriteArrayList copyOnWriteArrayList = l50Var.f4681c;
            Iterator it2 = copyOnWriteArrayList.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it2.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    if (!(autoCloseable instanceof TypedArray)) {
                        throw new IllegalArgumentException();
                    }
                    ((TypedArray) autoCloseable).recycle();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((bu0) obj2).m776a();
            }
            arrayList2.clear();
            this.f7303g = null;
        }
        C0312i6 c0312i6 = this.f7283C;
        if (c0312i6 != null) {
            c0312i6.m2539D();
            this.f7284D.m2539D();
            this.f7285E.m2539D();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4733m(boolean z) {
        if (z && this.f7319w != null) {
            m4723d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null) {
                c50Var.f1110N = true;
                if (z) {
                    c50Var.f1101E.m4733m(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4734n(boolean z) {
        if (z && this.f7319w != null) {
            m4723d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null && z) {
                c50Var.f1101E.m4734n(true);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4735o() {
        ArrayList arrayListM1666l = this.f7299c.m1666l();
        int size = arrayListM1666l.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM1666l.get(i);
            i++;
            c50 c50Var = (c50) obj;
            if (c50Var != null) {
                c50Var.m871m();
                c50Var.f1101E.m4735o();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4736p() {
        if (this.f7318v >= 1) {
            for (c50 c50Var : this.f7299c.m1668n()) {
                if (c50Var != null) {
                    if (!c50Var.f1106J ? c50Var.f1101E.m4736p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m4737q() {
        if (this.f7318v < 1) {
            return;
        }
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null && !c50Var.f1106J) {
                c50Var.f1101E.m4737q();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4738r(c50 c50Var) {
        if (c50Var != null) {
            if (c50Var != this.f7299c.m1662h(c50Var.f1131n)) {
                return;
            }
            c50Var.f1099C.getClass();
            boolean zM4694N = m4694N(c50Var);
            Boolean bool = c50Var.f1136s;
            if (bool == null || bool.booleanValue() != zM4694N) {
                c50Var.f1136s = Boolean.valueOf(zM4694N);
                t50 t50Var = c50Var.f1101E;
                t50Var.m4725e0();
                t50Var.m4738r(t50Var.f7322z);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4739s(boolean z) {
        if (z && this.f7319w != null) {
            m4723d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null && z) {
                c50Var.f1101E.m4739s(true);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4740t() {
        if (this.f7318v < 1) {
            return false;
        }
        boolean z = false;
        for (c50 c50Var : this.f7299c.m1668n()) {
            if (c50Var != null && m4693M(c50Var)) {
                if (!c50Var.f1106J ? c50Var.f1101E.m4740t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c50 c50Var = this.f7321y;
        if (c50Var != null) {
            sb.append(c50Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f7321y)));
            sb.append("}");
        } else {
            e50 e50Var = this.f7319w;
            if (e50Var != null) {
                sb.append(e50Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f7319w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m4741u(int i) {
        try {
            this.f7298b = true;
            for (C0028a c0028a : ((HashMap) this.f7299c.f2335l).values()) {
                if (c0028a != null) {
                    c0028a.f539e = i;
                }
            }
            m4705O(i, false);
            Iterator it = m4724e().iterator();
            while (it.hasNext()) {
                ((C0443lr) it.next()).m3285h();
            }
            this.f7298b = false;
            m4696A(true);
        } catch (Throwable th) {
            this.f7298b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m4742v() {
        if (this.f7291K) {
            this.f7291K = false;
            m4721c0();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m4743w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String str3 = str + "    ";
        f71 f71Var = this.f7299c;
        ArrayList arrayList = (ArrayList) f71Var.f2334k;
        String str4 = str + "    ";
        HashMap map = (HashMap) f71Var.f2335l;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0028a c0028a : map.values()) {
                printWriter.print(str);
                if (c0028a != null) {
                    c50 c50Var = c0028a.f537c;
                    printWriter.println(c50Var);
                    c50Var.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(c50Var.f1103G));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(c50Var.f1104H));
                    printWriter.print(" mTag=");
                    printWriter.println(c50Var.f1105I);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(c50Var.f1127j);
                    printWriter.print(" mWho=");
                    printWriter.print(c50Var.f1131n);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(c50Var.f1098B);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(c50Var.f1137t);
                    printWriter.print(" mRemoving=");
                    printWriter.print(c50Var.f1138u);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(c50Var.f1140w);
                    printWriter.print(" mInLayout=");
                    printWriter.println(c50Var.f1141x);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(c50Var.f1106J);
                    printWriter.print(" mDetached=");
                    printWriter.print(c50Var.f1107K);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(c50Var.f1109M);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(c50Var.f1108L);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(c50Var.f1114R);
                    if (c50Var.f1099C != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(c50Var.f1099C);
                    }
                    if (c50Var.f1100D != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(c50Var.f1100D);
                    }
                    if (c50Var.f1102F != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(c50Var.f1102F);
                    }
                    if (c50Var.f1132o != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(c50Var.f1132o);
                    }
                    if (c50Var.f1128k != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(c50Var.f1128k);
                    }
                    if (c50Var.f1129l != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(c50Var.f1129l);
                    }
                    if (c50Var.f1130m != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(c50Var.f1130m);
                    }
                    Object objM1662h = c50Var.f1133p;
                    if (objM1662h == null) {
                        t50 t50Var = c50Var.f1099C;
                        objM1662h = (t50Var == null || (str2 = c50Var.f1134q) == null) ? null : t50Var.f7299c.m1662h(str2);
                    }
                    if (objM1662h != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objM1662h);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(c50Var.f1135r);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    b50 b50Var = c50Var.f1115S;
                    printWriter.println(b50Var == null ? false : b50Var.f715a);
                    b50 b50Var2 = c50Var.f1115S;
                    if ((b50Var2 == null ? 0 : b50Var2.f716b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        b50 b50Var3 = c50Var.f1115S;
                        printWriter.println(b50Var3 == null ? 0 : b50Var3.f716b);
                    }
                    b50 b50Var4 = c50Var.f1115S;
                    if ((b50Var4 == null ? 0 : b50Var4.f717c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        b50 b50Var5 = c50Var.f1115S;
                        printWriter.println(b50Var5 == null ? 0 : b50Var5.f717c);
                    }
                    b50 b50Var6 = c50Var.f1115S;
                    if ((b50Var6 == null ? 0 : b50Var6.f718d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        b50 b50Var7 = c50Var.f1115S;
                        printWriter.println(b50Var7 == null ? 0 : b50Var7.f718d);
                    }
                    b50 b50Var8 = c50Var.f1115S;
                    if ((b50Var8 == null ? 0 : b50Var8.f719e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        b50 b50Var9 = c50Var.f1115S;
                        printWriter.println(b50Var9 == null ? 0 : b50Var9.f719e);
                    }
                    if (c50Var.f1111O != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(c50Var.f1111O);
                    }
                    if (c50Var.f1112P != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(c50Var.f1112P);
                    }
                    e50 e50Var = c50Var.f1100D;
                    if ((e50Var == null ? null : e50Var.f1952o) != null) {
                        oq0 oq0Var = new oq0(c50Var.mo861c(), rj0.f6861d);
                        String canonicalName = rj0.class.getCanonicalName();
                        if (canonicalName != null) {
                            g91 g91Var = ((rj0) oq0Var.m3733c(rj0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f6862c;
                            if (g91Var.f2669l > 0) {
                                printWriter.print(str4);
                                printWriter.println("Loaders:");
                                if (g91Var.f2669l > 0) {
                                    if (g91Var.f2668k[0] == null) {
                                        printWriter.print(str4);
                                        printWriter.print("  #");
                                        printWriter.print(g91Var.f2667j[0]);
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    dd0.m1158c();
                                }
                            }
                        } else {
                            C0270h1.m2190f("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + c50Var.f1101E + ":");
                    c50Var.f1101E.m4743w(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                c50 c50Var2 = (c50) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(c50Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f7301e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                c50 c50Var3 = (c50) this.f7301e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c50Var3.toString());
            }
        }
        int size3 = this.f7300d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C0722ta c0722ta = (C0722ta) this.f7300d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0722ta.toString());
                c0722ta.m4779g(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f7307k.get());
        synchronized (this.f7297a) {
            try {
                int size4 = this.f7297a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (q50) this.f7297a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f7319w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7320x);
        if (this.f7321y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7321y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7318v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f7288H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f7289I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f7290J);
        if (this.f7287G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f7287G);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m4744x() {
        Iterator it = m4724e().iterator();
        while (it.hasNext()) {
            ((C0443lr) it.next()).m3285h();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4745y(q50 q50Var, boolean z) {
        if (!z) {
            if (this.f7319w == null) {
                if (this.f7290J) {
                    C0270h1.m2191g("FragmentManager has been destroyed");
                    return;
                } else {
                    C0270h1.m2191g("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f7288H || this.f7289I) {
                C0270h1.m2191g("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f7297a) {
            try {
                if (this.f7319w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f7297a.add(q50Var);
                    m4713W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m4746z(boolean z) {
        if (this.f7298b) {
            C0270h1.m2191g("FragmentManager is already executing transactions");
            return;
        }
        if (this.f7319w == null) {
            if (this.f7290J) {
                C0270h1.m2191g("FragmentManager has been destroyed");
                return;
            } else {
                C0270h1.m2191g("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f7319w.f1953p.getLooper()) {
            C0270h1.m2191g("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f7288H || this.f7289I)) {
            C0270h1.m2191g("Can not perform this action after onSaveInstanceState");
        } else if (this.f7292L == null) {
            this.f7292L = new ArrayList();
            this.f7293M = new ArrayList();
        }
    }
}
