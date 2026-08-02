package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.InterfaceC2092b;

/* renamed from: com.google.android.gms.internal.ads.dr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905dr implements H, M1, Y2, InterfaceC2092b, W2.h, W2.j, W2.l, Ei, Z2.c, Ar, InterfaceC1621tq, Jw {

    /* renamed from: o, reason: collision with root package name */
    public static C0905dr f13182o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1141j3 f13183p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1141j3 f13184q;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13185k;

    /* renamed from: l, reason: collision with root package name */
    public Object f13186l;

    /* renamed from: m, reason: collision with root package name */
    public Object f13187m;

    /* renamed from: n, reason: collision with root package name */
    public Object f13188n;

    static {
        long j5 = -9223372036854775807L;
        f13183p = new C1141j3(2, j5);
        f13184q = new C1141j3(3, j5);
    }

    public /* synthetic */ C0905dr(int i, Object obj, Object obj2) {
        this.f13185k = i;
        this.f13186l = obj;
        this.f13187m = obj2;
    }

    public static String B(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, read);
                }
                Qv d5 = Qv.f11286d.d();
                byte[] digest = messageDigest.digest();
                String g5 = d5.g(digest.length, digest);
                fileInputStream.close();
                return g5;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static C0905dr C(Context context) {
        synchronized (C0905dr.class) {
            try {
                C0905dr c0905dr = f13182o;
                if (c0905dr != null) {
                    return c0905dr;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) AbstractC1103i8.f13874b.s()).longValue();
                Q2.Z z3 = null;
                if (longValue > 0 && longValue <= 244410203) {
                    try {
                        z3 = Q2.Y.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                        U2.j.g("Failed to retrieve lite SDK info.", e3);
                    }
                }
                C0905dr c0905dr2 = new C0905dr(applicationContext, z3);
                f13182o = c0905dr2;
                return c0905dr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final C0905dr s(AbstractC1314mx abstractC1314mx) {
        int i;
        int i5;
        int i6;
        D3.l lVar = new D3.l(8);
        C1134ix c1134ix = new C1134ix(abstractC1314mx);
        C1543s1 c1543s1 = C1543s1.f15413t;
        c1134ix.f14021c = c1543s1;
        char c5 = 1;
        c1134ix.f14019a = true;
        ArrayList arrayList = (ArrayList) lVar.f962m;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            ((C1134ix) obj).f14019a = false;
        }
        arrayList.add(c1134ix);
        if (lVar.f961l) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        lVar.f961l = true;
        DA y5 = GA.y();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i9 = 0;
        while (i9 < arrayList.size() - 1) {
            int i10 = i9 + 1;
            if (((C1134ix) arrayList.get(i9)).f14021c == c1543s1 && ((C1134ix) arrayList.get(i10)).f14021c != c1543s1) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i9 = i10;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i11 = 0;
        Integer num = null;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            C1134ix c1134ix2 = (C1134ix) obj2;
            c1134ix2.getClass();
            C1543s1 c1543s12 = c1134ix2.f14021c;
            if (c1543s12 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i12 = 4;
            if (c1543s12 == c1543s1) {
                i5 = i7;
                while (true) {
                    i = i7;
                    if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i12];
                    int i13 = i;
                    while (i13 == 0) {
                        secureRandom.nextBytes(bArr);
                        i13 = ((bArr[i] & 255) << 24) | ((bArr[c5] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        c5 = 1;
                        i12 = 4;
                    }
                    i7 = i;
                    i5 = i13;
                }
            } else {
                i = i7;
                i5 = i;
            }
            Integer valueOf = Integer.valueOf(i5);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException(L1.a.l(i5, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(valueOf);
            AbstractC1314mx abstractC1314mx2 = c1134ix2.f14020b;
            AbstractC1400ot a5 = Py.f11138b.a(abstractC1314mx2, true != abstractC1314mx2.a() ? null : valueOf);
            Object obj3 = C1091hx.f13821m;
            C1179jx c1179jx = new C1179jx(a5);
            C1136iz c1136iz = (C1136iz) Vy.f11970b.c(a5);
            Integer num2 = c1136iz.f;
            if (num2 != null && num2.intValue() != i5) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (obj3.equals(obj3)) {
                i6 = 3;
            } else if (C1091hx.f13822n.equals(obj3)) {
                i6 = 4;
            } else {
                if (!C1091hx.f13823o.equals(obj3)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i6 = 5;
            }
            EA y6 = FA.y();
            C1543s1 c1543s13 = c1543s1;
            C1822yA w5 = C1867zA.w();
            w5.e();
            ArrayList arrayList3 = arrayList;
            C1867zA.C((C1867zA) w5.f10141l, c1136iz.f14023a);
            w5.e();
            C1867zA.D((C1867zA) w5.f10141l, c1136iz.f14025c);
            w5.e();
            C1867zA.B((C1867zA) w5.f10141l, c1136iz.f14026d);
            y6.e();
            FA.A((FA) y6.f10141l, (C1867zA) w5.b());
            y6.e();
            FA.F((FA) y6.f10141l, i6);
            y6.e();
            ((FA) y6.f10141l).zzf = i5;
            y6.e();
            ((FA) y6.f10141l).zzg = c1136iz.f14027e.a();
            FA fa = (FA) y6.b();
            y5.e();
            GA.C((GA) y5.f10141l, fa);
            if (c1134ix2.f14019a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = valueOf;
            }
            arrayList2.add(c1179jx);
            i7 = i;
            c1543s1 = c1543s13;
            arrayList = arrayList3;
            c5 = 1;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int intValue = num.intValue();
        y5.e();
        ((GA) y5.f10141l).zzc = intValue;
        GA ga = (GA) y5.b();
        if (ga.w() > 0) {
            return new C0905dr(ga, arrayList2, (My) lVar.f963n, 29, false);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public void A(H h3, C0829c3 c0829c3) {
        int i = 0;
        while (true) {
            InterfaceC0737a0[] interfaceC0737a0Arr = (InterfaceC0737a0[]) this.f13187m;
            if (i >= interfaceC0737a0Arr.length) {
                return;
            }
            c0829c3.a();
            c0829c3.b();
            InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 3);
            C1407p c1407p = (C1407p) ((List) this.f13186l).get(i);
            String str = c1407p.f14904m;
            boolean z3 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z3 = false;
            }
            AbstractC1668us.W("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), z3);
            String str2 = c1407p.f14894a;
            if (str2 == null) {
                c0829c3.b();
                str2 = c0829c3.f12966e;
            }
            C1649uH c1649uH = new C1649uH();
            c1649uH.f15839a = str2;
            c1649uH.c(str);
            c1649uH.f15843e = c1407p.f14898e;
            c1649uH.f15842d = c1407p.f14897d;
            c1649uH.f15836F = c1407p.f14891G;
            c1649uH.f15851o = c1407p.f14907p;
            w5.e(new C1407p(c1649uH));
            interfaceC0737a0Arr[i] = w5;
            i++;
        }
    }

    public synchronized void D(Q2.X0 x02, int i) {
        this.f13188n = null;
        Ko ko = new Ko(i);
        C1529ro c1529ro = new C1529ro(28, this);
        ((C1324n6) this.f13186l).g(x02, (String) this.f13187m, ko, c1529ro);
    }

    public synchronized void E(InterfaceC1443pr interfaceC1443pr, C1398or c1398or) {
        try {
            C1129ir c1129ir = (C1129ir) ((ConcurrentHashMap) this.f13186l).get(interfaceC1443pr);
            P2.o.f4767B.f4776j.getClass();
            c1398or.f14867d = System.currentTimeMillis();
            if (c1129ir == null) {
                C1353nr c1353nr = (C1353nr) this.f13187m;
                C1129ir c1129ir2 = new C1129ir(c1353nr.f14720o, c1353nr.f14721p * 1000);
                if (((ConcurrentHashMap) this.f13186l).size() == ((C1353nr) this.f13187m).f14719n) {
                    int i = ((C1353nr) this.f13187m).f14725t;
                    int i5 = i - 1;
                    InterfaceC1443pr interfaceC1443pr2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j5 = Long.MAX_VALUE;
                    if (i5 == 0) {
                        for (Map.Entry entry : ((ConcurrentHashMap) this.f13186l).entrySet()) {
                            if (((C1129ir) entry.getValue()).f14012d.f16338a < j5) {
                                j5 = ((C1129ir) entry.getValue()).f14012d.f16338a;
                                interfaceC1443pr2 = (InterfaceC1443pr) entry.getKey();
                            }
                        }
                        if (interfaceC1443pr2 != null) {
                            ((ConcurrentHashMap) this.f13186l).remove(interfaceC1443pr2);
                        }
                    } else if (i5 == 1) {
                        for (Map.Entry entry2 : ((ConcurrentHashMap) this.f13186l).entrySet()) {
                            if (((C1129ir) entry2.getValue()).f14012d.f16340c < j5) {
                                j5 = ((C1129ir) entry2.getValue()).f14012d.f16340c;
                                interfaceC1443pr2 = (InterfaceC1443pr) entry2.getKey();
                            }
                        }
                        if (interfaceC1443pr2 != null) {
                            ((ConcurrentHashMap) this.f13186l).remove(interfaceC1443pr2);
                        }
                    } else if (i5 == 2) {
                        int i6 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : ((ConcurrentHashMap) this.f13186l).entrySet()) {
                            if (((C1129ir) entry3.getValue()).f14012d.f16341d < i6) {
                                i6 = ((C1129ir) entry3.getValue()).f14012d.f16341d;
                                interfaceC1443pr2 = (InterfaceC1443pr) entry3.getKey();
                            }
                        }
                        if (interfaceC1443pr2 != null) {
                            ((ConcurrentHashMap) this.f13186l).remove(interfaceC1443pr2);
                        }
                    }
                    C1218kr c1218kr = (C1218kr) this.f13188n;
                    c1218kr.f14294c++;
                    c1218kr.f14292a.f14172l = true;
                }
                ((ConcurrentHashMap) this.f13186l).put(interfaceC1443pr, c1129ir2);
                C1218kr c1218kr2 = (C1218kr) this.f13188n;
                c1218kr2.f14293b++;
                c1218kr2.f14292a.f14171k = true;
                c1129ir = c1129ir2;
            }
            C1802xr c1802xr = c1129ir.f14012d;
            c1802xr.getClass();
            P2.o.f4767B.f4776j.getClass();
            c1802xr.f16340c = System.currentTimeMillis();
            c1802xr.f16341d++;
            c1129ir.a();
            LinkedList linkedList = c1129ir.f14009a;
            if (linkedList.size() != c1129ir.f14010b) {
                linkedList.add(c1398or);
            }
            C1218kr c1218kr3 = (C1218kr) this.f13188n;
            c1218kr3.f++;
            C1173jr c1173jr = c1218kr3.f14292a;
            C1173jr clone = c1173jr.clone();
            c1173jr.f14171k = false;
            c1173jr.f14172l = false;
            C1757wr c1757wr = c1129ir.f14012d.f16339b;
            C1757wr clone2 = c1757wr.clone();
            c1757wr.f16174k = false;
            c1757wr.f16175l = 0;
            W6 w5 = C0789b7.w();
            U6 z3 = V6.z();
            z3.e();
            V6.w((V6) z3.f10141l);
            Z6 z5 = C0744a7.z();
            boolean z6 = clone.f14171k;
            z5.e();
            C0744a7.w((C0744a7) z5.f10141l, z6);
            boolean z7 = clone.f14172l;
            z5.e();
            C0744a7.x((C0744a7) z5.f10141l, z7);
            int i7 = clone2.f16175l;
            z5.e();
            C0744a7.y((C0744a7) z5.f10141l, i7);
            z3.e();
            V6.y((V6) z3.f10141l, (C0744a7) z5.b());
            w5.e();
            C0789b7.x((C0789b7) w5.f10141l, (V6) z3.b());
            c1398or.f14864a.d().f.L0((C0789b7) w5.b());
            I();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1488qr F() {
        Wq f = ((InterfaceC0588Eh) this.f13187m).f();
        C1353nr c1353nr = (C1353nr) ((C0905dr) this.f13186l).f13187m;
        C1562sc a5 = new C1517rc(c1353nr.f14716k).a();
        return new C1488qr(f.f12098d, f.f, a5.f15548j, c1353nr.f14722q, f.f12102j);
    }

    public synchronized boolean G() {
        boolean z3;
        C1075hh c1075hh = (C1075hh) ((C1324n6) this.f13186l).f14583p;
        if (c1075hh != null) {
            z3 = c1075hh.f13779c;
        }
        return z3;
    }

    public synchronized boolean H(InterfaceC1443pr interfaceC1443pr) {
        C1129ir c1129ir = (C1129ir) ((ConcurrentHashMap) this.f13186l).get(interfaceC1443pr);
        if (c1129ir == null) {
            return true;
        }
        C1353nr c1353nr = (C1353nr) this.f13187m;
        c1129ir.a();
        return c1129ir.f14009a.size() < c1353nr.f14720o;
    }

    public void I() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.V5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            C1353nr c1353nr = (C1353nr) this.f13187m;
            sb.append(c1353nr.f14718m);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            C1218kr c1218kr = (C1218kr) this.f13188n;
            sb2.append(c1218kr.f14295d);
            sb2.append("\n\tNew pools created: ");
            sb2.append(c1218kr.f14293b);
            sb2.append("\n\tPools removed: ");
            sb2.append(c1218kr.f14294c);
            sb2.append("\n\tEntries added: ");
            sb2.append(c1218kr.f);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(c1218kr.f14296e);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f13186l).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((InterfaceC1443pr) entry.getKey()).hashCode());
                sb.append("    ");
                int i5 = 0;
                while (true) {
                    C1129ir c1129ir = (C1129ir) entry.getValue();
                    c1129ir.a();
                    if (i5 >= c1129ir.f14009a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i5++;
                }
                C1129ir c1129ir2 = (C1129ir) entry.getValue();
                c1129ir2.a();
                for (int size = c1129ir2.f14009a.size(); size < c1353nr.f14720o; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                C1129ir c1129ir3 = (C1129ir) entry.getValue();
                StringBuilder sb3 = new StringBuilder("Created: ");
                C1802xr c1802xr = c1129ir3.f14012d;
                sb3.append(c1802xr.f16338a);
                sb3.append(" Last accessed: ");
                sb3.append(c1802xr.f16340c);
                sb3.append(" Accesses: ");
                sb3.append(c1802xr.f16341d);
                sb3.append("\nEntries retrieved: Valid: ");
                sb3.append(c1802xr.f16342e);
                sb3.append(" Stale: ");
                sb3.append(c1802xr.f);
                sb.append(sb3.toString());
                sb.append("\n");
            }
            while (i < c1353nr.f14719n) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            U2.j.d(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J(InterfaceC0624Ka interfaceC0624Ka) {
        InterfaceC0624Ka adapterCreator;
        boolean booleanValue = ((Boolean) AbstractC1103i8.f13873a.s()).booleanValue();
        AtomicReference atomicReference = (AtomicReference) this.f13188n;
        if (!booleanValue) {
            while (!atomicReference.compareAndSet(null, interfaceC0624Ka)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return;
                }
            }
            return;
        }
        Q2.Z z3 = (Q2.Z) this.f13187m;
        if (z3 != null) {
            try {
                adapterCreator = z3.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            if (adapterCreator == null) {
                adapterCreator = interfaceC0624Ka;
            }
            while (!atomicReference.compareAndSet(null, adapterCreator)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return;
                }
            }
        }
        adapterCreator = null;
        if (adapterCreator == null) {
        }
        while (!atomicReference.compareAndSet(null, adapterCreator)) {
        }
    }

    public Hw K(C1428pc c1428pc, InterfaceC1887zm interfaceC1887zm, InterfaceC1887zm interfaceC1887zm2, InterfaceC1897zw interfaceC1897zw) {
        String str = c1428pc.f14998n;
        T2.L l5 = P2.o.f4767B.f4771c;
        boolean d5 = T2.L.d(str);
        C0606Hd c0606Hd = (C0606Hd) this.f13186l;
        return AbstractC1400ot.X(AbstractC1400ot.j0(AbstractC1400ot.j0(Hw.r(d5 ? AbstractC1400ot.Z(new C1797xm(1)) : AbstractC1400ot.X(interfaceC1887zm.p(c1428pc), ExecutionException.class, new C0727Yf(7), c0606Hd)), new C0727Yf(6), c0606Hd), interfaceC1897zw, c0606Hd), C1797xm.class, new P2.c(this, interfaceC1887zm2, c1428pc, interfaceC1897zw, 3), c0606Hd);
    }

    @Override // m3.InterfaceC2092b
    public void N() {
        synchronized (((D3.l) this.f13188n).f962m) {
            try {
                try {
                    D3.l lVar = (D3.l) this.f13188n;
                    if (lVar.f961l) {
                        return;
                    }
                    lVar.f961l = true;
                    C1414p6 c1414p6 = (C1414p6) lVar.f963n;
                    if (c1414p6 == null) {
                        return;
                    }
                    E3.a b3 = AbstractC0613Id.f9539a.b(new K2.e(this, c1414p6, (C1459q6) this.f13186l, (C1548s6) this.f13187m, 6));
                    C1548s6 c1548s6 = (C1548s6) this.f13187m;
                    c1548s6.f10334k.a(new Kw(5, c1548s6, b3, false), AbstractC0613Id.f9544g);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.M1
    public int a() {
        return ((long[]) this.f13188n).length;
    }

    @Override // com.google.android.gms.internal.ads.Y2
    public void b(Kn kn, H h3, C0829c3 c0829c3) {
        this.f13187m = kn;
        c0829c3.a();
        c0829c3.b();
        InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 5);
        this.f13188n = w5;
        w5.e((C1407p) this.f13186l);
    }

    @Override // com.google.android.gms.internal.ads.Y2
    public void c(C1617tm c1617tm) {
        long d5;
        AbstractC1668us.F((Kn) this.f13187m);
        int i = AbstractC1260lo.f14419a;
        Kn kn = (Kn) this.f13187m;
        synchronized (kn) {
            try {
                long j5 = kn.f10249c;
                d5 = j5 != -9223372036854775807L ? j5 + kn.f10248b : kn.d();
            } finally {
            }
        }
        long e3 = ((Kn) this.f13187m).e();
        if (d5 == -9223372036854775807L || e3 == -9223372036854775807L) {
            return;
        }
        C1407p c1407p = (C1407p) this.f13186l;
        if (e3 != c1407p.f14909r) {
            C1649uH c1649uH = new C1649uH(c1407p);
            c1649uH.f15853q = e3;
            C1407p c1407p2 = new C1407p(c1649uH);
            this.f13186l = c1407p2;
            ((InterfaceC0737a0) this.f13188n).e(c1407p2);
        }
        int o5 = c1617tm.o();
        ((InterfaceC0737a0) this.f13188n).c(o5, c1617tm);
        ((InterfaceC0737a0) this.f13188n).d(d5, 1, o5, 0, null);
    }

    @Override // Z2.c
    public void d(C0574Db c0574Db) {
        ((BinderC0767am) this.f13186l).u3((String) this.f13187m, c0574Db, (String) this.f13188n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public /* bridge */ /* synthetic */ E3.a e(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq) {
        return q(c1390oj, interfaceC1576sq, null);
    }

    @Override // com.google.android.gms.internal.ads.M1
    public ArrayList f(long j5) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f13186l;
            if (i >= list.size()) {
                break;
            }
            int i5 = i + i;
            long[] jArr = (long[]) this.f13187m;
            if (jArr[i5] <= j5 && j5 < jArr[i5 + 1]) {
                C1544s2 c1544s2 = (C1544s2) list.get(i);
                C1881zg c1881zg = c1544s2.f15419a;
                if (c1881zg.f16747e == -3.4028235E38f) {
                    arrayList2.add(c1544s2);
                } else {
                    arrayList.add(c1881zg);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C1589t2(1));
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            C1881zg c1881zg2 = ((C1544s2) arrayList2.get(i6)).f15419a;
            arrayList.add(new C1881zg(c1881zg2.f16743a, c1881zg2.f16744b, c1881zg2.f16745c, c1881zg2.f16746d, (-1) - i6, 1, c1881zg2.f16748g, c1881zg2.f16749h, c1881zg2.i, c1881zg2.f16752l, c1881zg2.f16753m, c1881zg2.f16750j, c1881zg2.f16751k, c1881zg2.f16754n, c1881zg2.f16755o));
        }
        return arrayList;
    }

    public void g() {
        m3.v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdFailedToLoad with error 0.");
        try {
            ((InterfaceC0659Pa) this.f13186l).B(0);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    public void h(J2.b bVar) {
        m3.v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdFailedToLoad with error. ErrorCode: " + bVar.f2695b + ". ErrorMessage: " + ((String) bVar.f2696c) + ". ErrorDomain: " + ((String) bVar.f2697d));
        try {
            ((InterfaceC0659Pa) this.f13186l).a3(bVar.m());
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    public void i(J2.b bVar) {
        m3.v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdFailedToLoad with error. ErrorCode: " + bVar.f2695b + ". ErrorMessage: " + ((String) bVar.f2696c) + ". ErrorDomain: " + ((String) bVar.f2697d));
        try {
            ((InterfaceC0659Pa) this.f13186l).a3(bVar.m());
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public Object j() {
        Class cls;
        switch (this.f13185k) {
            case 23:
                return null;
            default:
                int i = AbstractC1449px.f15063a;
                try {
                    cls = Uy.f11845b.a();
                } catch (GeneralSecurityException unused) {
                    cls = null;
                }
                if (cls == null) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(InterfaceC0911dx.class.getName()));
                }
                int i5 = AbstractC1538rx.f15394a;
                GA ga = (GA) this.f13186l;
                int x5 = ga.x();
                int i6 = 0;
                boolean z3 = false;
                boolean z5 = true;
                for (FA fa : ga.B()) {
                    if (fa.E() == 3) {
                        if (!fa.D()) {
                            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(fa.w())));
                        }
                        if (fa.z() == UA.f11742l) {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(fa.w())));
                        }
                        if (fa.E() == 2) {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(fa.w())));
                        }
                        if (fa.w() == x5) {
                            if (z3) {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                            z3 = true;
                        }
                        z5 &= fa.x().x() == 4;
                        i6++;
                    }
                }
                if (i6 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z3 && !z5) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                C0375o c0375o = new C0375o(cls);
                if (((HashMap) c0375o.f5043m) == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                c0375o.f5046p = (My) this.f13188n;
                int i7 = 0;
                while (true) {
                    List list = (List) this.f13187m;
                    if (i7 >= list.size()) {
                        HashMap hashMap = (HashMap) c0375o.f5043m;
                        if (hashMap == null) {
                            throw new IllegalStateException("build cannot be called twice");
                        }
                        C1048gz c1048gz = (C1048gz) c0375o.f5045o;
                        My my = (My) c0375o.f5046p;
                        Class cls2 = (Class) c0375o.f5042l;
                        Fx fx = new Fx();
                        fx.f9145m = hashMap;
                        fx.f9143k = c1048gz;
                        fx.f9144l = my;
                        c0375o.f5043m = null;
                        int i8 = AbstractC1449px.f15063a;
                        HashMap hashMap2 = ((C1003fz) Uy.f11845b.f11846a.get()).f13535b;
                        if (!hashMap2.containsKey(InterfaceC0911dx.class)) {
                            throw new GeneralSecurityException("No wrapper found for ".concat(InterfaceC0911dx.class.toString()));
                        }
                        InterfaceC1093hz interfaceC1093hz = (InterfaceC1093hz) hashMap2.get(InterfaceC0911dx.class);
                        if (cls2.equals(interfaceC1093hz.a()) && interfaceC1093hz.a().equals(cls2)) {
                            return interfaceC1093hz.b(fx);
                        }
                        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                    }
                    FA z6 = ga.z(i7);
                    if (z6.E() == 3) {
                        C1179jx c1179jx = (C1179jx) list.get(i7);
                        if (c1179jx == null) {
                            throw new GeneralSecurityException("Key parsing of key with index " + i7 + " and type_url " + z6.x().A() + " failed, unable to get primitive");
                        }
                        try {
                            Object b3 = Uy.f11845b.b(c1179jx.f14191a, cls);
                            if (z6.w() == ga.x()) {
                                c0375o.R(b3, z6, true);
                            } else {
                                c0375o.R(b3, z6, false);
                            }
                        } catch (GeneralSecurityException e3) {
                            throw new GeneralSecurityException("Unable to get primitive " + cls.toString() + " for key of type " + z6.x().A() + ", see https://developers.google.com/tink/faq/registration_errors", e3);
                        }
                    }
                    i7++;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        Xm xm = (Xm) this.f13186l;
        xm.getClass();
        xm.f12236l.execute(new RunnableC1362o((SQLiteDatabase) obj, (String) this.f13188n, (U2.m) this.f13187m, 5));
        return null;
    }

    public void l(J2.b bVar) {
        m3.v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdFailedToLoad with error. ErrorCode: " + bVar.f2695b + ". ErrorMessage: " + ((String) bVar.f2696c) + ". ErrorDomain: " + ((String) bVar.f2697d));
        try {
            ((InterfaceC0659Pa) this.f13186l).a3(bVar.m());
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    public synchronized String m() {
        Ih ih;
        try {
            ih = (Ih) this.f13188n;
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
            return null;
        }
        return ih != null ? ih.f9590k : null;
    }

    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f13187m;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) Q2.r.f5053d.f5056c.a((A7) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        AbstractC1803xs.E(arrayList3, new G3(4, "", "gad:dynamite_module:experiment_id"));
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15527m);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15528n);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15529o);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15530p);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15531q);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15493G);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15532r);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15539y);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15540z);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15487A);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15488B);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15489C);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15490D);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15491E);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15492F);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15533s);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15534t);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15535u);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15536v);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15537w);
        AbstractC1803xs.E(arrayList3, AbstractC1561sb.f15538x);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo14o(Object obj) {
        boolean z3 = ((U2.l) obj) == U2.l.f5881k;
        Jr jr = (Jr) this.f13186l;
        jr.g(z3);
        Mr mr = (Mr) this.f13187m;
        if (mr == null) {
            ((C1041gs) this.f13188n).f.b(jr.l());
        } else {
            mr.a(jr);
            mr.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(Nq nq, Lq lq, int i, C1484qn c1484qn, long j5) {
        String str;
        C1390oj a5 = ((C1482ql) this.f13188n).a();
        a5.k("gqi", nq.f10823b);
        a5.l(lq);
        a5.k("action", "adapter_status");
        a5.k("adapter_l", String.valueOf(j5));
        a5.k("sc", Integer.toString(i));
        C0811bl c0811bl = null;
        if (c1484qn != null) {
            a5.k("arec", Integer.toString(c1484qn.f15174l.f5058k));
            String message = c1484qn.getMessage();
            Pattern pattern = ((C0817br) this.f13186l).f12915a;
            if (pattern != null && message != null) {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        a5.k("areec", str);
                    }
                }
            }
            str = null;
            if (str != null) {
            }
        }
        Iterator it = lq.f10525t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0811bl a6 = ((C0855cl) this.f13187m).a((String) it.next());
            if (a6 != null) {
                c0811bl = a6;
                break;
            }
        }
        if (c0811bl != null) {
            a5.k("ancn", c0811bl.f12897a);
            C1651ub c1651ub = c0811bl.f12898b;
            if (c1651ub != null) {
                a5.k("adapter_v", c1651ub.toString());
            }
            C1651ub c1651ub2 = c0811bl.f12899c;
            if (c1651ub2 != null) {
                a5.k("adapter_sv", c1651ub2.toString());
            }
        }
        a5.q();
    }

    public E3.a q(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq, InterfaceC0588Eh interfaceC0588Eh) {
        E3.a c02;
        E3.a U4;
        C0905dr c0905dr = (C0905dr) this.f13186l;
        Qw qw = (Qw) this.f13187m;
        C0905dr c0905dr2 = new C0905dr(c0905dr, interfaceC0588Eh, qw);
        C1397oq c1397oq = (C1397oq) c0905dr2.f13188n;
        if (c1397oq == null) {
            if (((Boolean) AbstractC1371o8.f14773a.s()).booleanValue()) {
                C1253lh d5 = interfaceC0588Eh.d();
                Dr dr = Dr.f8383E;
                Cr a5 = d5.f14394c.a(d5.i.f(), dr).p(new C0565Ca(3, d5, (C1353nr) c0905dr.f13187m)).a();
                a5.a(new Kw(0, a5, new U4(13, d5)), d5.f14399j);
                U4 = AbstractC1400ot.U(AbstractC1400ot.h0(Hw.r(a5), new C1352nq(c0905dr2, 1), qw), C1797xm.class, new C1352nq(c0905dr2, 0), qw);
            } else {
                C1397oq c1397oq2 = new C1397oq(null, c0905dr2.F());
                c0905dr2.f13188n = c1397oq2;
                U4 = AbstractC1400ot.c0(c1397oq2);
            }
            c02 = AbstractC1400ot.h0(U4, new C1364o1(16), qw);
        } else {
            c02 = AbstractC1400ot.c0(c1397oq);
        }
        return AbstractC1400ot.U(AbstractC1400ot.j0(Hw.r(c02), new C0565Ca(12, this, interfaceC0588Eh), qw), Exception.class, new C1364o1(15), qw);
    }

    public Nq r() {
        return (Nq) ((Sq) this.f13186l).f11596b.f13762m;
    }

    public synchronized String t() {
        Ih ih;
        try {
            ih = (Ih) this.f13188n;
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
            return null;
        }
        return ih != null ? ih.f9590k : null;
    }

    public String toString() {
        switch (this.f13185k) {
            case 28:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f13186l);
                sb.append('{');
                Er er = (Er) ((Er) this.f13187m).f8618m;
                String str = "";
                while (er != null) {
                    Object obj = er.f8617l;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    er = (Er) er.f8618m;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 29:
                int i = AbstractC1538rx.f15394a;
                HA w5 = LA.w();
                GA ga = (GA) this.f13186l;
                int x5 = ga.x();
                w5.e();
                ((LA) w5.f10141l).zzc = x5;
                for (FA fa : ga.B()) {
                    IA w6 = KA.w();
                    String A3 = fa.x().A();
                    w6.e();
                    KA.z((KA) w6.f10141l, A3);
                    int E5 = fa.E();
                    w6.e();
                    KA.A((KA) w6.f10141l, E5);
                    UA z3 = fa.z();
                    w6.e();
                    ((KA) w6.f10141l).zzf = z3.a();
                    int w7 = fa.w();
                    w6.e();
                    ((KA) w6.f10141l).zze = w7;
                    KA ka = (KA) w6.b();
                    w5.e();
                    LA.x((LA) w5.f10141l, ka);
                }
                return ((LA) w5.b()).toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        Jr jr = (Jr) this.f13186l;
        jr.g(false);
        Mr mr = (Mr) this.f13187m;
        if (mr == null) {
            ((C1041gs) this.f13188n).f.b(jr.l());
        } else {
            mr.a(jr);
            mr.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.H
    public void v() {
        ((H) this.f13186l).v();
    }

    @Override // com.google.android.gms.internal.ads.H
    public InterfaceC0737a0 w(int i, int i5) {
        H h3 = (H) this.f13186l;
        if (i5 != 3) {
            return h3.w(i, i5);
        }
        SparseArray sparseArray = (SparseArray) this.f13188n;
        R1 r1 = (R1) sparseArray.get(i);
        if (r1 != null) {
            return r1;
        }
        R1 r12 = new R1(h3.w(i, 3), (O1) this.f13187m);
        sparseArray.put(i, r12);
        return r12;
    }

    @Override // com.google.android.gms.internal.ads.H
    public void x(U u5) {
        ((H) this.f13186l).x(u5);
    }

    public ArrayList y() {
        ArrayList n5 = n();
        ArrayList arrayList = (ArrayList) this.f13188n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) Q2.r.f5053d.f5056c.a((A7) obj);
            if (!TextUtils.isEmpty(str)) {
                n5.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC1803xs.E(arrayList2, AbstractC1561sb.f15494H);
        n5.addAll(arrayList2);
        return n5;
    }

    @Override // com.google.android.gms.internal.ads.M1
    public long z(int i) {
        AbstractC1668us.S(i >= 0);
        long[] jArr = (long[]) this.f13188n;
        AbstractC1668us.S(i < jArr.length);
        return jArr[i];
    }

    public C0905dr(Context context, U2.a aVar, C1773x6 c1773x6, C1390oj c1390oj) {
        this.f13185k = 18;
        this.f13186l = context;
        this.f13188n = aVar;
        this.f13187m = c1773x6;
    }

    public C0905dr(InterfaceC0659Pa interfaceC0659Pa) {
        this.f13185k = 10;
        this.f13186l = interfaceC0659Pa;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        ((Mh) obj).C((BinderC1652uc) this.f13186l, (String) this.f13187m, (String) this.f13188n);
    }

    public C0905dr(C0680Sa c0680Sa, C0673Ra c0673Ra, InterfaceC0694Ua interfaceC0694Ua) {
        this.f13185k = 14;
        this.f13187m = c0680Sa;
        this.f13188n = c0673Ra;
        this.f13186l = interfaceC0694Ua;
    }

    public C0905dr(Sq sq, Lq lq, String str) {
        this.f13185k = 11;
        this.f13186l = sq;
        this.f13187m = lq;
        this.f13188n = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public C0905dr(C0905dr c0905dr, InterfaceC0588Eh interfaceC0588Eh, Qw qw) {
        this.f13185k = 24;
        this.f13186l = c0905dr;
        this.f13187m = interfaceC0588Eh;
    }

    public C0905dr(C0905dr c0905dr, Qw qw) {
        this.f13185k = 23;
        this.f13188n = new Oi(28);
        this.f13186l = c0905dr;
        this.f13187m = qw;
    }

    public /* synthetic */ C0905dr(Object obj, Object obj2, Object obj3, int i) {
        this.f13185k = i;
        this.f13186l = obj2;
        this.f13187m = obj3;
        this.f13188n = obj;
    }

    public /* synthetic */ C0905dr(Object obj, Object obj2, Object obj3, int i, boolean z3) {
        this.f13185k = i;
        this.f13186l = obj;
        this.f13187m = obj2;
        this.f13188n = obj3;
    }

    public C0905dr(int i) {
        this.f13185k = i;
        switch (i) {
            case 8:
                this.f13186l = new ArrayList();
                this.f13187m = new ArrayList();
                this.f13188n = new ArrayList();
                break;
            case 27:
                this.f13187m = new ArrayDeque();
                this.f13188n = null;
                this.f13186l = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                this.f13186l = new ExecutorC0599Gd(Executors.newSingleThreadExecutor(new Sn(0)), new RE(15));
                break;
        }
    }

    public C0905dr(Context context, Q2.Z z3) {
        this.f13185k = 0;
        this.f13188n = new AtomicReference();
        this.f13186l = context;
        this.f13187m = z3;
    }

    public C0905dr(Context context, Executor executor, C0786b4 c0786b4, U4 u42) {
        this.f13185k = 6;
        this.f13187m = u42;
        this.f13188n = c0786b4;
        RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx(new A4(0, this, context));
        executor.execute(runnableFutureC0823bx);
        this.f13186l = runnableFutureC0823bx;
    }

    public C0905dr(H h3, O1 o12) {
        this.f13185k = 2;
        this.f13186l = h3;
        this.f13187m = o12;
        this.f13188n = new SparseArray();
    }

    public C0905dr(Kj kj, C1482ql c1482ql) {
        this.f13185k = 22;
        this.f13186l = kj;
        Eo eo = new Eo(c1482ql);
        this.f13187m = eo;
        this.f13188n = new Io(eo, kj.f10215e);
    }

    public C0905dr(C1353nr c1353nr) {
        this.f13185k = 25;
        this.f13186l = new ConcurrentHashMap(c1353nr.f14720o);
        this.f13187m = c1353nr;
        this.f13188n = new C1218kr();
    }

    public C0905dr(GA ga, List list) {
        this.f13185k = 29;
        this.f13186l = ga;
        this.f13187m = list;
        this.f13188n = My.f10755b;
    }

    public C0905dr(String str, int i) {
        this.f13185k = i;
        switch (i) {
            case 28:
                Er er = new Er(2);
                this.f13187m = er;
                this.f13188n = er;
                this.f13186l = str;
                break;
            default:
                C1649uH c1649uH = new C1649uH();
                c1649uH.c(str);
                this.f13186l = new C1407p(c1649uH);
                break;
        }
    }

    public C0905dr(ArrayList arrayList) {
        this.f13185k = 3;
        this.f13186l = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f13187m = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            C1544s2 c1544s2 = (C1544s2) arrayList.get(i);
            long[] jArr = (long[]) this.f13187m;
            int i5 = i + i;
            jArr[i5] = c1544s2.f15420b;
            jArr[i5 + 1] = c1544s2.f15421c;
        }
        long[] jArr2 = (long[]) this.f13187m;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13188n = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // m3.InterfaceC2092b
    public void L(int i) {
    }

    public C0905dr(List list) {
        this.f13185k = 5;
        this.f13186l = list;
        this.f13187m = new InterfaceC0737a0[list.size()];
        this.f13188n = new C1245lH(new Mt(4, this));
    }
}
