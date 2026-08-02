package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p90 implements InterfaceC0752u3, y80 {

    /* JADX INFO: renamed from: l */
    public static p90 f6025l;

    /* JADX INFO: renamed from: m */
    public static final Object f6026m = new Object();

    /* JADX INFO: renamed from: j */
    public Object f6027j;

    /* JADX INFO: renamed from: k */
    public volatile Object f6028k;

    public /* synthetic */ p90(Object obj) {
        this.f6027j = obj;
    }

    /* JADX INFO: renamed from: b */
    public static p90 m3876b(Context context) {
        p80.m3863h(context);
        synchronized (p90.class) {
            if (f6025l == null) {
                mv1 mv1Var = p52.f5993a;
                synchronized (p52.class) {
                    if (p52.f5997e == null) {
                        p52.f5997e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                p90 p90Var = new p90();
                p90Var.f6027j = context.getApplicationContext();
                f6025l = p90Var;
            }
        }
        return f6025l;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m3877g(PackageInfo packageInfo, boolean z) {
        us1 us1Var;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                us1 us1Var2 = z ? j42.f3819c : j42.f3818b;
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    cp1 cp1Var = fr1.f2482k;
                    us1Var = us1.f7902n;
                } else {
                    cp1 cp1Var2 = fr1.f2482k;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        byte[] byteArray = signingCertificateHistory[i2].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i4 = i3 + 1;
                        if (i4 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i4 <= length2) {
                            i = length2;
                        } else {
                            i = (length2 >> 1) + length2 + 1;
                            if (i < i4) {
                                int iHighestOneBit = Integer.highestOneBit(i3);
                                i = iHighestOneBit + iHighestOneBit;
                            }
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                        if (i > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                        }
                        objArrCopyOf[i3] = byteArray;
                        i2++;
                        i3 = i4;
                    }
                    us1Var = i3 == 0 ? us1.f7902n : new us1(i3, objArrCopyOf);
                }
                if (us1Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                fr1 fr1VarMo1887f = us1Var.mo1887f();
                int size = fr1VarMo1887f.size();
                int i5 = 0;
                while (i5 < size) {
                    byte[] bArr = (byte[]) fr1VarMo1887f.get(i5);
                    cp1 cp1VarM1889h = us1Var2.listIterator(0);
                    do {
                        int i6 = i5 + 1;
                        if (!cp1VarM1889h.hasNext()) {
                            i5 = i6;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) cp1VarM1889h.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? m3878h(packageInfo, j42.f3817a) : m3878h(packageInfo, j42.f3817a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static x02 m3878h(PackageInfo packageInfo, x02... x02VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            x12 x12Var = new x12(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < x02VarArr.length; i++) {
                if (x02VarArr[i].equals(x12Var)) {
                    return x02VarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0298ht m3879a() {
        if (((InterfaceC0298ht) this.f6028k) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC0298ht) this.f6028k) == null) {
                        File cacheDir = ((C0181eo) ((nu1) this.f6027j).f5551k).f2151k.getCacheDir();
                        C0593pt c0593pt = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c0593pt = new C0593pt();
                            c0593pt.f6250m = new C0312i6(22);
                            c0593pt.f6249l = file;
                            c0593pt.f6247j = 262144000L;
                            c0593pt.f6248k = new f50(28);
                        }
                        this.f6028k = c0593pt;
                    }
                    if (((InterfaceC0298ht) this.f6028k) == null) {
                        this.f6028k = new o31(20);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (InterfaceC0298ht) this.f6028k;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0655rh m3880c(yv0 yv0Var) {
        kj0 kj0Var = ((jl0) this.f6027j).f4024y;
        if (((jl0) this.f6027j).f3978G.get()) {
            return ((jl0) this.f6027j).f3976E;
        }
        if (kj0Var == null) {
            ((jl0) this.f6027j).f4012m.execute(new RunnableC0897y0(12, this));
            return ((jl0) this.f6027j).f3976E;
        }
        InterfaceC0655rh interfaceC0655rhM911f = ca0.m911f(kj0Var.mo1140a(yv0Var), Boolean.TRUE.equals(yv0Var.f9511a.f1229e));
        return interfaceC0655rhM911f != null ? interfaceC0655rhM911f : ((jl0) this.f6027j).f3976E;
    }

    /* JADX INFO: renamed from: d */
    public void m3881d(EnumC0474ml enumC0474ml) {
        a90.m127k(enumC0474ml, "newState");
        if (((EnumC0474ml) this.f6028k) == enumC0474ml || ((EnumC0474ml) this.f6028k) == EnumC0474ml.f5075n) {
            return;
        }
        this.f6028k = enumC0474ml;
        if (((ArrayList) this.f6027j).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f6027j;
        this.f6027j = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC0024an.m280c(it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c4  */
    /* JADX INFO: renamed from: e */
    public boolean m3882e(int i) {
        m81 m81VarM3352p;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.f6027j).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            m81VarM3352p = m81.m3352p("no pkgs");
        } else {
            m81VarM3352p = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    p80.m3863h(m81VarM3352p);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    m81VarM3352p = m81.m3352p("null pkg");
                } else if (str.equals((String) this.f6028k)) {
                    m81VarM3352p = m81.f5007o;
                } else {
                    mv1 mv1Var = p52.f5993a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            p52.m3851a();
                            boolean zM2668H = ((in1) p52.f5995c).m2668H();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zM2668H) {
                                boolean zM3652a = o90.m3652a((Context) this.f6027j);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    p80.m3863h(p52.f5997e);
                                    try {
                                        p52.m3851a();
                                        p80.m3863h(p52.f5997e);
                                        Context context = (Context) vs0.m5188H(vs0.m5187G(new vs0(p52.f5997e)));
                                        try {
                                            in1 in1Var = (in1) p52.f5995c;
                                            Parcel parcelM5810d = in1Var.m5810d();
                                            int i3 = ru1.f6974a;
                                            parcelM5810d.writeInt(1);
                                            int iM4663q = t22.m4663q(parcelM5810d, 20293);
                                            t22.m4658l(parcelM5810d, 1, str);
                                            t22.m4662p(parcelM5810d, 2, 4);
                                            parcelM5810d.writeInt(zM3652a ? 1 : 0);
                                            t22.m4662p(parcelM5810d, 3, 4);
                                            parcelM5810d.writeInt(0);
                                            t22.m4655i(parcelM5810d, 4, new vs0(context));
                                            t22.m4662p(parcelM5810d, 5, 4);
                                            parcelM5810d.writeInt(0);
                                            t22.m4662p(parcelM5810d, 6, 4);
                                            parcelM5810d.writeInt(1);
                                            t22.m4662p(parcelM5810d, 8, 4);
                                            parcelM5810d.writeInt(0);
                                            t22.m4665s(parcelM5810d, iM4663q);
                                            Parcel parcelM5808a = in1Var.m5808a(parcelM5810d, 6);
                                            y72 y72Var = (y72) ru1.m4407a(parcelM5808a, y72.CREATOR);
                                            parcelM5808a.recycle();
                                            if (y72Var.f9205j) {
                                                xe1.m5645q(y72Var.f9208m);
                                                m81VarM3352p = new m81(true, (String) null, (Exception) null);
                                            } else {
                                                String str2 = y72Var.f9206k;
                                                PackageManager.NameNotFoundException nameNotFoundException = af0.m198m(y72Var.f9207l) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                xe1.m5645q(y72Var.f9208m);
                                                af0.m198m(y72Var.f9207l);
                                                m81VarM3352p = new m81(false, str2, (Exception) nameNotFoundException);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            m81VarM3352p = m81.m3353q("module call", e);
                                        }
                                    } catch (C0188ev e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        m81VarM3352p = m81.m3353q("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = ((Context) this.f6027j).getPackageManager().getPackageInfo(str, 134217792);
                                    boolean zM3652a2 = o90.m3652a((Context) this.f6027j);
                                    if (packageInfo == null) {
                                        m81VarM3352p = m81.m3352p("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            m81VarM3352p = m81.m3352p("single cert required");
                                        } else {
                                            x12 x12Var = new x12(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                m81 m81VarM3852b = p52.m3852b(str3, x12Var, zM3652a2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (m81VarM3852b.f5009k && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        m81 m81VarM3852b2 = p52.m3852b(str3, x12Var, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (m81VarM3852b2.f5009k) {
                                                            m81VarM3352p = m81.m3352p("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                                m81VarM3352p = m81VarM3852b;
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                    if (m81VarM3352p.f5009k) {
                                        this.f6028k = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    m81VarM3352p = m81.m3353q("no pkg ".concat(str), e3);
                                }
                            }
                        } catch (RemoteException | C0188ev e4) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (m81VarM3352p.f5009k) {
                            this.f6028k = str;
                        }
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th4;
                    }
                }
                if (m81VarM3352p.f5009k) {
                    break;
                }
                i2++;
            }
        }
        if (!m81VarM3352p.f5009k && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = (Throwable) m81VarM3352p.f5011m;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", m81VarM3352p.mo2582m(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", m81VarM3352p.mo2582m());
            }
        }
        return m81VarM3352p.f5009k;
    }

    /* JADX INFO: renamed from: f */
    public y62 m3883f(final x22 x22Var) {
        final f62 f62Var = (f62) this.f6028k;
        f62 f62Var2 = y62.f9190j;
        if (f62Var != f62Var2) {
            an0 an0Var = y62.f9189i;
            an0Var.getClass();
            final n42 n42Var = new n42();
            n42Var.f5297j = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) an0Var.f254k;
            Context context = x22Var.f8764b;
            String str = f62Var.f2329d;
            if (str == null) {
                str = (String) f62Var.f2326a.apply(context);
                f62Var.f2329d = str;
            }
            h62 h62Var = (h62) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: u62
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    h62 h62Var2 = new h62(new y62(x22Var, f62Var));
                    n42Var.f5297j = true;
                    return h62Var2;
                }
            });
            if (n42Var.f5297j) {
                Context context2 = x22Var.f8764b;
                an0 an0Var2 = new an0(23, an0Var);
                if (r72.f6727a == null) {
                    synchronized (r72.class) {
                        try {
                            if (r72.f6727a == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new r72(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new r72(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                r72.f6727a = an0Var2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.f6027j = h62Var.f3074a;
            this.f6028k = f62Var2;
        }
        return (y62) this.f6027j;
    }

    @Override // p000.y80
    public Object get() {
        if (this.f6028k == null) {
            synchronized (this) {
                try {
                    if (this.f6028k == null) {
                        Object obj = ((y80) this.f6027j).get();
                        o80.m3647h(obj, "Argument must not be null");
                        this.f6028k = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f6028k;
    }

    @Override // p000.InterfaceC0752u3
    /* JADX INFO: renamed from: p */
    public void mo620p(Set set) {
        InterfaceC0752u3 interfaceC0752u3 = (InterfaceC0752u3) this.f6028k;
        if (interfaceC0752u3 == f6026m) {
            return;
        }
        if (interfaceC0752u3 != null) {
            interfaceC0752u3.mo620p(set);
        } else {
            synchronized (this) {
                ((HashSet) this.f6027j).addAll(set);
            }
        }
    }
}
