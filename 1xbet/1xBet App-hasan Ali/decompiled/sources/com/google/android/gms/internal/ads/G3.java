package com.google.android.gms.internal.ads;

import B.C0072a;
import android.content.SharedPreferences;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class G3 implements InterfaceC1856z, Yj {

    /* renamed from: o, reason: collision with root package name */
    public static final C1589t2 f9163o = new C1589t2(2);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9164k;

    /* renamed from: l, reason: collision with root package name */
    public int f9165l;

    /* renamed from: m, reason: collision with root package name */
    public Object f9166m;

    /* renamed from: n, reason: collision with root package name */
    public Object f9167n;

    public /* synthetic */ G3(int i, C1327n9 c1327n9, C1327n9 c1327n92) {
        this.f9164k = 8;
        this.f9165l = i;
        this.f9166m = c1327n9;
        this.f9167n = c1327n92;
    }

    public static G3 h(String str, long j5) {
        return new G3(2, Long.valueOf(j5), str);
    }

    private final synchronized void p() {
        while (this.f9165l > 4096) {
            byte[] bArr = (byte[]) ((ArrayList) this.f9166m).remove(0);
            ((ArrayList) this.f9167n).remove(bArr);
            this.f9165l -= bArr.length;
        }
    }

    private final synchronized void q() {
        ((ExecutorService) ((D3.l) this.f9167n).f963n).execute(new K4(7, this));
    }

    public static G3 r(String str, boolean z3) {
        return new G3(1, Boolean.valueOf(z3), str);
    }

    public int a() {
        int i = this.f9165l;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Object b(int i) {
        SparseArray sparseArray;
        if (this.f9165l == -1) {
            this.f9165l = 0;
        }
        while (true) {
            int i5 = this.f9165l;
            sparseArray = (SparseArray) this.f9166m;
            if (i5 > 0 && i < sparseArray.keyAt(i5)) {
                this.f9165l--;
            }
        }
        while (this.f9165l < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f9165l + 1)) {
            this.f9165l++;
        }
        return sparseArray.valueAt(this.f9165l);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1856z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1811y c(B b3, long j5) {
        switch (this.f9164k) {
            case 1:
                long j6 = b3.f7752n;
                long m5 = m(b3);
                long b5 = b3.b();
                b3.g(Math.max(6, ((K) this.f9166m).f10091c), false);
                long m6 = m(b3);
                return (m5 > j5 || m6 <= j5) ? m6 <= j5 ? new C1811y(-2, m6, b3.b()) : new C1811y(-1, m5, j6) : new C1811y(0, -9223372036854775807L, b5);
            default:
                long j7 = b3.f7752n;
                int min = (int) Math.min(112800L, b3.f7751m - j7);
                C1617tm c1617tm = (C1617tm) this.f9167n;
                c1617tm.g(min);
                b3.G(c1617tm.f15724a, 0, min, false);
                int i = c1617tm.f15726c;
                long j8 = -1;
                long j9 = -9223372036854775807L;
                long j10 = -1;
                while (c1617tm.o() >= 188) {
                    byte[] bArr = c1617tm.f15724a;
                    int i5 = c1617tm.f15725b;
                    while (i5 < i && bArr[i5] != 71) {
                        i5++;
                    }
                    int i6 = i5 + 188;
                    if (i6 > i) {
                        return j9 == -9223372036854775807L ? new C1811y(-2, j9, j7 + j8) : C1811y.f16372d;
                    }
                    long w5 = AbstractC1668us.w(c1617tm, i5, this.f9165l);
                    if (w5 != -9223372036854775807L) {
                        long b6 = ((Kn) this.f9166m).b(w5);
                        if (b6 > j5) {
                            return j9 == -9223372036854775807L ? new C1811y(-1, b6, j7) : new C1811y(0, -9223372036854775807L, j7 + j10);
                        }
                        j9 = b6;
                        long j11 = i5;
                        if (100000 + j9 > j5) {
                            return new C1811y(0, -9223372036854775807L, j7 + j11);
                        }
                        j10 = j11;
                    }
                    c1617tm.j(i6);
                    j8 = i6;
                }
                if (j9 == -9223372036854775807L) {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1856z
    /* renamed from: d */
    public void mo18d() {
        switch (this.f9164k) {
            case 1:
                break;
            default:
                byte[] bArr = AbstractC1260lo.f;
                int length = bArr.length;
                ((C1617tm) this.f9167n).h(0, bArr);
                break;
        }
    }

    public void e(Q5 q5) {
        synchronized (this.f9166m) {
            try {
                if (((LinkedList) this.f9167n).size() >= 10) {
                    U2.j.d("Queue is full, current size = " + ((LinkedList) this.f9167n).size());
                    ((LinkedList) this.f9167n).remove(0);
                }
                int i = this.f9165l;
                this.f9165l = i + 1;
                q5.f11177l = i;
                q5.c();
                ((LinkedList) this.f9167n).add(q5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(Object obj, Object obj2) {
        int i = this.f9165l + 1;
        Object[] objArr = (Object[]) this.f9166m;
        int length = objArr.length;
        int i5 = i + i;
        if (i5 > length) {
            this.f9166m = Arrays.copyOf(objArr, AbstractC0776av.d(length, i5));
        }
        AbstractC0952et.I(obj, obj2);
        Object[] objArr2 = (Object[]) this.f9166m;
        int i6 = this.f9165l;
        int i7 = i6 + i6;
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        this.f9165l = i6 + 1;
    }

    public synchronized void g(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f9166m).add(bArr);
                int binarySearch = Collections.binarySearch((ArrayList) this.f9167n, bArr, f9163o);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                ((ArrayList) this.f9167n).add(binarySearch, bArr);
                this.f9165l += length;
                o();
            }
        }
    }

    public void i(Q5 q5) {
        synchronized (this.f9166m) {
            try {
                Iterator it = ((LinkedList) this.f9167n).iterator();
                while (it.hasNext()) {
                    Q5 q52 = (Q5) it.next();
                    P2.o oVar = P2.o.f4767B;
                    if (oVar.f4774g.d().k()) {
                        if (!oVar.f4774g.d().l() && !q5.equals(q52) && q52.f11182q.equals(q5.f11182q)) {
                            it.remove();
                            return;
                        }
                    } else if (!q5.equals(q52) && q52.f11180o.equals(q5.f11180o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized byte[] j(int i) {
        for (int i5 = 0; i5 < ((ArrayList) this.f9167n).size(); i5++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f9167n).get(i5);
            int length = bArr.length;
            if (length >= i) {
                this.f9165l -= length;
                ((ArrayList) this.f9167n).remove(i5);
                ((ArrayList) this.f9166m).remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public void mo11k(Object obj) {
        SE se = (SE) obj;
        int i = C1109iE.f13882f0;
        int i5 = this.f9165l;
        if (i5 == 1) {
            se.i = false;
            i5 = 1;
        }
        ME me = se.f11526g;
        me.getClass();
        C1324n6 c1324n6 = se.f11524d;
        c1324n6.f14581n = C1324n6.v(me, (AbstractC1044gv) c1324n6.f14579l, (C1603tG) c1324n6.f14582o, (C1785xa) c1324n6.f14578k);
        OE g5 = se.g();
        se.i(g5, 11, new f2.m(g5, i5, (C1327n9) this.f9166m, (C1327n9) this.f9167n));
    }

    public long m(B b3) {
        long j5;
        C0072a c0072a;
        K k5;
        long j6;
        int f;
        while (true) {
            long b5 = b3.b();
            j5 = b3.f7751m;
            long j7 = j5 - 6;
            c0072a = (C0072a) this.f9167n;
            k5 = (K) this.f9166m;
            if (b5 >= j7) {
                j6 = -6;
                break;
            }
            long b6 = b3.b();
            byte[] bArr = new byte[2];
            b3.G(bArr, 0, 2, false);
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i5 = this.f9165l;
            if (i == i5) {
                j6 = -6;
                C1617tm c1617tm = new C1617tm(16);
                System.arraycopy(bArr, 0, c1617tm.f15724a, 0, 2);
                byte[] bArr2 = c1617tm.f15724a;
                int i6 = 0;
                for (int i7 = 2; i6 < 14 && (f = b3.f(bArr2, i7 + i6, 14 - i6)) != -1; i7 = 2) {
                    i6 += f;
                }
                c1617tm.i(i6);
                b3.f7754p = 0;
                b3.g((int) (b6 - b3.f7752n), false);
                if (AbstractC1803xs.G(c1617tm, k5, i5, c0072a)) {
                    break;
                }
            } else {
                b3.f7754p = 0;
                b3.g((int) (b6 - b3.f7752n), false);
            }
            b3.g(1, false);
        }
        if (b3.b() < j5 + j6) {
            return c0072a.f658a;
        }
        b3.g((int) (j5 - b3.b()), false);
        return k5.f10096j;
    }

    public Cv n() {
        C1089hv c1089hv = (C1089hv) this.f9167n;
        if (c1089hv != null) {
            throw c1089hv.a();
        }
        Cv c5 = Cv.c(this.f9165l, (Object[]) this.f9166m, this);
        C1089hv c1089hv2 = (C1089hv) this.f9167n;
        if (c1089hv2 == null) {
            return c5;
        }
        throw c1089hv2.a();
    }

    public synchronized void o() {
        switch (this.f9164k) {
            case 0:
                p();
                break;
            default:
                q();
                break;
        }
    }

    public Object s() {
        C7 c7 = (C7) AbstractC1640u8.f15795a.get();
        Object obj = this.f9167n;
        if (c7 == null) {
            if (AbstractC1640u8.f15796b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        int i = this.f9165l - 1;
        String str = (String) this.f9166m;
        SharedPreferences sharedPreferences = c7.f7966a;
        if (i == 0) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(booleanValue)));
            }
        }
        if (i == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r1));
            }
        }
        if (i != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r1));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    public G3(int i, Object obj, String str) {
        this.f9164k = 6;
        this.f9166m = str;
        this.f9167n = obj;
        this.f9165l = i;
    }

    public /* synthetic */ G3(D3.l lVar, byte[] bArr) {
        this.f9164k = 5;
        this.f9167n = lVar;
        this.f9166m = bArr;
    }

    public G3(K k5, int i) {
        this.f9164k = 1;
        this.f9166m = k5;
        this.f9165l = i;
        this.f9167n = new C0072a();
    }

    public G3(AH ah, KF kf, int i, long j5) {
        this.f9164k = 10;
        this.f9166m = kf;
        this.f9165l = i;
        this.f9167n = ah;
    }

    public G3(int i, byte b3) {
        this.f9164k = i;
        switch (i) {
            case 4:
                this.f9166m = new Object();
                this.f9167n = new LinkedList();
                break;
            default:
                this.f9166m = new ArrayList();
                this.f9167n = new ArrayList(64);
                this.f9165l = 0;
                break;
        }
    }

    public G3(int i, Kn kn) {
        this.f9164k = 2;
        this.f9165l = i;
        this.f9166m = kn;
        this.f9167n = new C1617tm();
    }

    public G3(int i, String str, int i5, ArrayList arrayList, byte[] bArr) {
        this.f9164k = 3;
        this.f9165l = i5;
        this.f9166m = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f9167n = bArr;
    }

    public G3(int i) {
        this.f9164k = 7;
        this.f9166m = new Object[i + i];
        this.f9165l = 0;
    }

    public G3(RE re) {
        this.f9164k = 9;
        this.f9166m = new SparseArray();
        this.f9167n = re;
        this.f9165l = -1;
    }

    private final /* synthetic */ void l() {
    }
}
