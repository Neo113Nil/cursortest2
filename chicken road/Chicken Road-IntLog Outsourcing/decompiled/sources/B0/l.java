package B0;

import G0.N;
import G0.P;
import H4.C0070a;
import M.C0087p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.Z1;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.h2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import f4.v;
import h2.C0482c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import k4.InterfaceC1218d;
import kotlin.KotlinVersion;
import l4.EnumC1260a;
import m0.C1267b;
import m0.InterfaceC1273h;
import y2.C1557b;

/* loaded from: classes.dex */
public final class l implements N, G4.d, InterfaceC1273h {

    /* renamed from: d, reason: collision with root package name */
    public static J2.a f161d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    /* renamed from: b, reason: collision with root package name */
    public Object f163b;

    /* renamed from: c, reason: collision with root package name */
    public Object f164c;

    public l(Context context) {
        x1.e eVar;
        this.f162a = 13;
        this.f163b = new x1.f(context, l1.g.f11012b);
        synchronized (x1.e.class) {
            try {
                if (x1.e.f12264c == null) {
                    x1.e.f12264c = new x1.e(context.getApplicationContext(), 0);
                }
                eVar = x1.e.f12264c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f164c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l b(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e3) {
                e = e3;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new l(fileChannel, 8, fileLock);
        } catch (IOException e7) {
            e = e7;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e8) {
            e = e8;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e9) {
            e = e9;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static String d(int i2) {
        return String.format("%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 & KotlinVersion.MAX_COMPONENT_VALUE), Integer.valueOf((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE), Integer.valueOf((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE), Integer.valueOf((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)}, 4));
    }

    public static String e(InetAddress inetAddress) {
        InetAddress inetAddress2;
        try {
            for (InterfaceAddress interfaceAddress : NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses()) {
                if (!interfaceAddress.getAddress().isLoopbackAddress() && (interfaceAddress.getAddress() instanceof Inet4Address)) {
                    int i2 = Integer.MIN_VALUE;
                    for (int networkPrefixLength = interfaceAddress.getNetworkPrefixLength() - 1; networkPrefixLength > 0; networkPrefixLength--) {
                        i2 >>= 1;
                    }
                    try {
                        inetAddress2 = InetAddress.getByName(((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) + "." + ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) + "." + ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) + "." + (i2 & KotlinVersion.MAX_COMPONENT_VALUE));
                    } catch (Exception unused) {
                        inetAddress2 = null;
                    }
                    if (inetAddress2 != null) {
                        String hostAddress = inetAddress2.getHostAddress();
                        kotlin.jvm.internal.i.b(hostAddress);
                        return hostAddress;
                    }
                }
            }
            return "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.f163b).add(str + "=" + String.valueOf(obj));
    }

    public String f() {
        Object obj;
        InetAddress address;
        LinkProperties linkProperties;
        if (Build.VERSION.SDK_INT < 31) {
            WifiInfo connectionInfo = ((WifiManager) this.f163b).getConnectionInfo();
            kotlin.jvm.internal.i.d(connectionInfo, "getConnectionInfo(...)");
            int ipAddress = connectionInfo.getIpAddress();
            if (ipAddress != 0) {
                return d(ipAddress);
            }
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f164c;
        List<LinkAddress> linkAddresses = (connectivityManager == null || (linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork())) == null) ? null : linkProperties.getLinkAddresses();
        if (linkAddresses == null) {
            return null;
        }
        Iterator<T> it = linkAddresses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String hostAddress = ((LinkAddress) obj).getAddress().getHostAddress();
            if (hostAddress != null ? B4.k.S(hostAddress, '.') : false) {
                break;
            }
        }
        LinkAddress linkAddress = (LinkAddress) obj;
        if (linkAddress == null || (address = linkAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    public void g() {
        try {
            ((FileLock) this.f164c).release();
            ((FileChannel) this.f163b).close();
        } catch (IOException e3) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e3);
        }
    }

    public void h(Q1 q12) {
        if (q12 == null) {
            return;
        }
        try {
            h2 t5 = i2.t();
            t5.e((a2) this.f163b);
            t5.d();
            i2.n((i2) t5.f5183b, q12);
            ((P) this.f164c).n((i2) t5.b());
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    @Override // G4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        G4.m mVar;
        int i2;
        N2.m mVar2;
        switch (this.f162a) {
            case 4:
                if (interfaceC1218d instanceof G4.m) {
                    mVar = (G4.m) interfaceC1218d;
                    int i3 = mVar.f1086b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mVar.f1086b = i3 - Integer.MIN_VALUE;
                        Object obj = mVar.f1085a;
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        i2 = mVar.f1086b;
                        if (i2 != 0) {
                            e5.g.y(obj);
                            c cVar = (c) this.f163b;
                            N2.m mVar3 = new N2.m((C0087p) this.f164c, eVar);
                            try {
                                mVar.f1088d = mVar3;
                                mVar.f1086b = 1;
                                if (cVar.i(mVar3, mVar) == enumC1260a) {
                                    return enumC1260a;
                                }
                            } catch (C0070a e3) {
                                e = e3;
                                mVar2 = mVar3;
                                if (e.f1161a != mVar2) {
                                }
                                return v.f5689a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mVar2 = mVar.f1088d;
                            try {
                                e5.g.y(obj);
                            } catch (C0070a e6) {
                                e = e6;
                                if (e.f1161a != mVar2) {
                                    throw e;
                                }
                                return v.f5689a;
                            }
                        }
                        return v.f5689a;
                    }
                }
                mVar = new G4.m(this, interfaceC1218d);
                Object obj2 = mVar.f1085a;
                EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
                i2 = mVar.f1086b;
                if (i2 != 0) {
                }
                return v.f5689a;
            default:
                Object i6 = ((G4.d) this.f163b).i(new N2.m(eVar, (P.d) this.f164c, 2), interfaceC1218d);
                return i6 == EnumC1260a.f11058a ? i6 : v.f5689a;
        }
    }

    public void j(Q1 q12, int i2) {
        try {
            Z1 z12 = (Z1) ((a2) this.f163b).g();
            z12.d();
            a2.n((a2) z12.f5183b, i2);
            this.f163b = (a2) z12.b();
            h(q12);
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void k(S1 s12) {
        if (s12 == null) {
            return;
        }
        try {
            h2 t5 = i2.t();
            t5.e((a2) this.f163b);
            t5.d();
            i2.o((i2) t5.f5183b, s12);
            ((P) this.f164c).n((i2) t5.b());
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void l(W1 w12) {
        try {
            h2 t5 = i2.t();
            t5.e((a2) this.f163b);
            t5.d();
            i2.p((i2) t5.f5183b, w12);
            ((P) this.f164c).n((i2) t5.b());
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void m(l2 l2Var) {
        try {
            P p5 = (P) this.f164c;
            h2 t5 = i2.t();
            t5.e((a2) this.f163b);
            t5.d();
            i2.r((i2) t5.f5183b, l2Var);
            p5.n((i2) t5.b());
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void n(m2 m2Var) {
        if (m2Var == null) {
            return;
        }
        try {
            h2 t5 = i2.t();
            t5.e((a2) this.f163b);
            t5.d();
            i2.s((i2) t5.f5183b, m2Var);
            ((P) this.f164c).n((i2) t5.b());
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public String toString() {
        switch (this.f162a) {
            case 11:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f164c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f163b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(Object obj, int i2, Object obj2) {
        this.f162a = i2;
        this.f163b = obj;
        this.f164c = obj2;
    }

    public l(Context context, a2 a2Var) {
        this.f162a = 2;
        P p5 = new P();
        try {
            V0.o.b(context);
            p5.f797b = V0.o.a().c(T0.a.f2765e).a("PLAY_BILLING_LIBRARY", new S0.c("proto"), new l1.j(2));
        } catch (Throwable unused) {
            p5.f796a = true;
        }
        this.f164c = p5;
        this.f163b = a2Var;
    }

    public /* synthetic */ l(Object obj) {
        this.f162a = 11;
        this.f164c = obj;
        this.f163b = new ArrayList();
    }

    public l(w2.m mVar, B1.g gVar) {
        this.f162a = 5;
        this.f163b = mVar;
        this.f164c = gVar;
        gVar.f215b = new B1.g(21, this);
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f162a = 0;
        this.f163b = workDatabase_Impl;
        this.f164c = new b(workDatabase_Impl, 3);
    }

    public l() {
        this.f162a = 9;
        this.f163b = new ReentrantLock();
        this.f164c = new LinkedHashMap();
    }

    public l(C1267b c1267b) {
        this.f162a = 10;
        l lVar = new l();
        this.f163b = c1267b;
        this.f164c = lVar;
    }

    public l(C1557b c1557b, PackageManager packageManager) {
        this.f162a = 3;
        C0482c c0482c = new C0482c(14, this);
        this.f163b = packageManager;
        new H2.o(c1557b, "flutter/processtext", H2.s.f1151b).b(c0482c);
    }
}
