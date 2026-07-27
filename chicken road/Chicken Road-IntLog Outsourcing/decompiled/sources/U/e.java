package U;

import E.C0028c;
import W.L;
import W.t;
import W.u;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.AbstractC0279e;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import k.s;
import l.C1237i;
import l.InterfaceC1240l;
import m2.EnumC1281d;
import n1.C1325l;
import n1.InterfaceC1306J;
import v.AbstractC1485a;
import w2.AbstractActivityC1515c;
import w2.w;
import w2.y;
import w2.z;
import y2.C1557b;
import y2.C1562g;

/* loaded from: classes.dex */
public final class e implements f, L, io.flutter.plugin.editing.b, k.n, InterfaceC1240l, InterfaceC1306J, H2.m, y, I1.a, H2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f3053a;

    public /* synthetic */ e(Object obj) {
        this.f3053a = obj;
    }

    public void A(ArrayList arrayList) {
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) this.f3053a;
        if (fVar.f10220f) {
            fVar.f10220f = false;
            e5.g.w(fVar.f10215a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((G2.e) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        fVar.f10219e = i2;
        fVar.b();
    }

    public void B(int i2) {
        int i3;
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) this.f3053a;
        fVar.getClass();
        AbstractActivityC1515c abstractActivityC1515c = fVar.f10215a;
        if (i2 != 4 && fVar.f10220f) {
            fVar.f10220f = false;
            e5.g.w(abstractActivityC1515c.getWindow(), true);
        }
        if (i2 == 1) {
            i3 = 1798;
        } else if (i2 == 2) {
            i3 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                fVar.f10220f = true;
                e5.g.w(abstractActivityC1515c.getWindow(), false);
                G2.d dVar = fVar.f10218d;
                if (dVar != null) {
                    fVar.a(dVar);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        fVar.f10219e = i3;
        fVar.b();
    }

    public void C(int i2) {
        View decorView = ((io.flutter.plugin.platform.f) this.f3053a).f10215a.getWindow().getDecorView();
        switch (O.j.b(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    public void D(j5.i value) {
        kotlin.jvm.internal.i.e(value, "value");
        ((j5.g) this.f3053a).u(value);
    }

    public void E(int i2, EnumC1281d fieldEncoding) {
        kotlin.jvm.internal.i.e(fieldEncoding, "fieldEncoding");
        F((i2 << 3) | fieldEncoding.f11156a);
    }

    public void F(int i2) {
        while (true) {
            int i3 = i2 & (-128);
            j5.g gVar = (j5.g) this.f3053a;
            if (i3 == 0) {
                gVar.n(i2);
                return;
            } else {
                gVar.n((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public void G(long j2) {
        while (true) {
            long j6 = (-128) & j2;
            j5.g gVar = (j5.g) this.f3053a;
            if (j6 == 0) {
                gVar.n((int) j2);
                return;
            } else {
                gVar.n((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    }

    @Override // k.n
    public void a(k.i iVar, boolean z) {
        if (iVar instanceof s) {
            ((s) iVar).f10665v.j().c(false);
        }
        k.n nVar = ((C1237i) this.f3053a).f10872e;
        if (nVar != null) {
            nVar.a(iVar, z);
        }
    }

    @Override // n1.InterfaceC1306J
    public void b(Bundle bundle) {
        C1325l c1325l = (C1325l) this.f3053a;
        ReentrantLock reentrantLock = c1325l.f11400n;
        ReentrantLock reentrantLock2 = c1325l.f11400n;
        reentrantLock.lock();
        try {
            Bundle bundle2 = c1325l.f11396j;
            if (bundle2 == null) {
                c1325l.f11396j = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            c1325l.f11397k = l1.b.f10998e;
            C1325l.i(c1325l);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // U.f
    public void c(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f3053a).setResultCode(i2);
    }

    public void d(int i2) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f3053a;
        if (mVar.c(i2)) {
            ((io.flutter.plugin.platform.s) mVar.f10243i.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (mVar.f10245k.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    @Override // W.L
    public int e() {
        t tVar = (t) this.f3053a;
        return tVar.f3373g - tVar.r();
    }

    @Override // w2.y
    public void f() {
        ((z) this.f3053a).f12223b = null;
    }

    @Override // k.n
    public boolean g(s sVar) {
        if (sVar == null) {
            return false;
        }
        sVar.f10666w.getClass();
        C1237i c1237i = (C1237i) this.f3053a;
        c1237i.getClass();
        k.n nVar = c1237i.f10872e;
        if (nVar != null) {
            return nVar.g(sVar);
        }
        return false;
    }

    @Override // W.L
    public int h(View view) {
        u uVar = (u) view.getLayoutParams();
        ((t) this.f3053a).getClass();
        return (view.getTop() - ((u) view.getLayoutParams()).f3374a.top) - ((ViewGroup.MarginLayoutParams) uVar).topMargin;
    }

    @Override // U.f
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // I1.a
    public Object j(Task task) {
        B0.l lVar = (B0.l) this.f3053a;
        if (task.e() || ((I1.o) task).f1266d) {
            return task;
        }
        Exception b6 = task.b();
        if (!(b6 instanceof m1.f)) {
            return task;
        }
        int i2 = ((m1.f) b6).f11126a.f4977a;
        if (i2 != 43001 && i2 != 43002 && i2 != 43003 && i2 != 17) {
            return i2 == 43000 ? B0.f.q(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i2 != 15 ? task : B0.f.q(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        x1.e eVar = (x1.e) lVar.f164c;
        eVar.getClass();
        I1.h hVar = new I1.h();
        ((ExecutorService) eVar.f12266b).execute(new s0.m(eVar, 5, hVar));
        return hVar.f1248a;
    }

    @Override // n1.InterfaceC1306J
    public void k(l1.b bVar) {
        C1325l c1325l = (C1325l) this.f3053a;
        ReentrantLock reentrantLock = c1325l.f11400n;
        ReentrantLock reentrantLock2 = c1325l.f11400n;
        reentrantLock.lock();
        try {
            c1325l.f11397k = bVar;
            C1325l.i(c1325l);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // H2.d
    public void l(ByteBuffer byteBuffer, C1562g c1562g) {
        H2.t.f1154b.getClass();
        H2.t.a(byteBuffer);
        ((C1557b) this.f3053a).getClass();
    }

    public void n(G2.f fVar) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f3053a;
        io.flutter.plugin.platform.m.a(mVar, fVar);
        if (mVar.f10238d.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        HashMap hashMap = mVar.f10235a.f12299a;
        String str = (String) fVar.f947c;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(B0.o.i("Trying to create a platform view of unregistered type: ", str));
    }

    public long o(G2.f fVar) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f3053a;
        io.flutter.plugin.platform.m.a(mVar, fVar);
        SparseArray sparseArray = mVar.f10248n;
        int i2 = fVar.f945a;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException(AbstractC0279e.d(i2, "Trying to create an already created platform view, view id: "));
        }
        if (mVar.f10239e == null) {
            throw new IllegalStateException(AbstractC0279e.d(i2, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (mVar.f10237c == null) {
            throw new IllegalStateException(AbstractC0279e.d(i2, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        HashMap hashMap = mVar.f10235a.f12299a;
        String str = (String) fVar.f947c;
        if (hashMap.get(str) == null) {
            throw new IllegalStateException(B0.o.i("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r6 = r6.getDhcpServerAddress();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // H2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(H2.l call, H2.n nVar) {
        String hostAddress;
        String str;
        Inet4Address dhcpServerAddress;
        kotlin.jvm.internal.i.e(call, "call");
        String str2 = call.f1146a;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            B0.l lVar = (B0.l) this.f3053a;
            String str3 = null;
            WifiManager wifiManager = (WifiManager) lVar.f163b;
            switch (hashCode) {
                case -1560837844:
                    if (str2.equals("wifiBroadcast")) {
                        try {
                            List<InterfaceAddress> interfaceAddresses = NetworkInterface.getByInetAddress(InetAddress.getByName(lVar.f())).getInterfaceAddresses();
                            kotlin.jvm.internal.i.d(interfaceAddresses, "getInterfaceAddresses(...)");
                            for (InterfaceAddress interfaceAddress : interfaceAddresses) {
                                if (!interfaceAddress.getAddress().isLoopbackAddress() && interfaceAddress.getBroadcast() != null) {
                                    str3 = interfaceAddress.getBroadcast().getHostAddress();
                                }
                            }
                        } catch (Exception unused) {
                        }
                        ((G2.i) nVar).success(str3);
                        return;
                    }
                    break;
                case -1340798144:
                    if (str2.equals("wifiName")) {
                        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                        kotlin.jvm.internal.i.d(connectionInfo, "getConnectionInfo(...)");
                        ((G2.i) nVar).success(connectionInfo.getSSID());
                        return;
                    }
                    break;
                case -989025832:
                    if (str2.equals("wifiIPv6Address")) {
                        try {
                            Iterator<InterfaceAddress> it = NetworkInterface.getByInetAddress(InetAddress.getByName(lVar.f())).getInterfaceAddresses().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    InetAddress address = it.next().getAddress();
                                    if (!address.isLoopbackAddress() && (address instanceof Inet6Address) && (hostAddress = ((Inet6Address) address).getHostAddress()) != null) {
                                        str3 = ((String[]) B4.k.h0(hostAddress, new String[]{"%"}, 0, 6).toArray(new String[0]))[0];
                                    }
                                }
                            }
                        } catch (SocketException unused2) {
                        }
                        ((G2.i) nVar).success(str3);
                        return;
                    }
                    break;
                case 183655511:
                    if (str2.equals("wifiSubmask")) {
                        try {
                            InetAddress byName = InetAddress.getByName(lVar.f());
                            kotlin.jvm.internal.i.b(byName);
                            str = B0.l.e(byName);
                        } catch (Exception unused3) {
                            str = "";
                        }
                        ((G2.i) nVar).success(str);
                        return;
                    }
                    break;
                case 1373405384:
                    if (str2.equals("wifiBSSID")) {
                        WifiInfo connectionInfo2 = wifiManager.getConnectionInfo();
                        kotlin.jvm.internal.i.d(connectionInfo2, "getConnectionInfo(...)");
                        ((G2.i) nVar).success(connectionInfo2.getBSSID());
                        return;
                    }
                    break;
                case 1674251141:
                    if (str2.equals("wifiGatewayAddress")) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) lVar.f164c;
                            LinkProperties linkProperties = connectivityManager != null ? connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()) : null;
                            if (linkProperties != null && dhcpServerAddress != null) {
                                str3 = dhcpServerAddress.getHostAddress();
                            }
                        } else {
                            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                            Integer valueOf = dhcpInfo != null ? Integer.valueOf(dhcpInfo.gateway) : null;
                            if (valueOf != null) {
                                str3 = B0.l.d(valueOf.intValue());
                            }
                        }
                        ((G2.i) nVar).success(str3);
                        return;
                    }
                    break;
                case 1756715352:
                    if (str2.equals("wifiIPAddress")) {
                        ((G2.i) nVar).success(lVar.f());
                        return;
                    }
                    break;
            }
        }
        ((G2.i) nVar).a();
    }

    @Override // W.L
    public View p(int i2) {
        return ((t) this.f3053a).o(i2);
    }

    @Override // W.L
    public int q() {
        return ((t) this.f3053a).u();
    }

    public void r(int i2) {
        AbstractC0279e.o(((io.flutter.plugin.platform.m) this.f3053a).f10245k.get(i2));
        Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
    }

    public CharSequence s(G2.c cVar) {
        AbstractActivityC1515c abstractActivityC1515c = ((io.flutter.plugin.platform.f) this.f3053a).f10215a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC1515c.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (cVar != null && cVar != G2.c.f931b) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC1515c.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC1515c);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e3) {
                                    charSequence = coerceToText;
                                    e = e3;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e6) {
                    e = e6;
                    charSequence = text;
                }
            } catch (IOException e7) {
                e = e7;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e8) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e8);
            return null;
        }
    }

    @Override // W.L
    public int t(View view) {
        u uVar = (u) view.getLayoutParams();
        ((t) this.f3053a).getClass();
        return view.getBottom() + ((u) view.getLayoutParams()).f3374a.bottom + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
    }

    public void u(int i2, double d6, double d7) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f3053a;
        if (mVar.c(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    @Override // w2.y
    public void v(io.flutter.embedding.engine.renderer.i iVar) {
        ((z) this.f3053a).f12223b = iVar;
    }

    public void w(G2.g gVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f3053a;
        float f3 = mVar.f10236b.getResources().getDisplayMetrics().density;
        int i2 = gVar.f948a;
        if (!mVar.c(i2)) {
            if (mVar.f10245k.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.s sVar = (io.flutter.plugin.platform.s) mVar.f10243i.get(Integer.valueOf(i2));
        w wVar = new w(gVar.f963p);
        while (true) {
            B0.e eVar = mVar.f10254t;
            priorityQueue = (PriorityQueue) eVar.f147c;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) eVar.f146b;
            j2 = wVar.f12219a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            } else {
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) gVar.f954g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d6 = f3;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d6);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d6);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d6);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d6);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d6);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d6);
            arrayList.add(pointerCoords);
        }
        int i3 = gVar.f952e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) gVar.f953f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(gVar.f949b.longValue(), gVar.f950c.longValue(), gVar.f951d, gVar.f952e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, gVar.f955h, gVar.f956i, gVar.f957j, gVar.f958k, gVar.f959l, gVar.f960m, gVar.f961n, gVar.f962o);
        sVar.getClass();
    }

    public void x(G2.h hVar, C0028c c0028c) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f3053a;
        int i2 = mVar.i(hVar.f965b);
        int i3 = mVar.i(hVar.f966c);
        int i6 = hVar.f964a;
        if (!mVar.c(i6)) {
            if (mVar.f10245k.get(i6) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i6);
            return;
        }
        float f3 = mVar.f10236b.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.s sVar = (io.flutter.plugin.platform.s) mVar.f10243i.get(Integer.valueOf(i6));
        io.flutter.plugin.editing.j jVar = mVar.f10240f;
        if (jVar != null) {
            if (jVar.f10197e.f631b == 3) {
                jVar.f10208p = true;
            }
            sVar.getClass();
        }
        sVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    @Override // n1.InterfaceC1306J
    public void y(int i2) {
        l1.b bVar;
        C1325l c1325l = (C1325l) this.f3053a;
        ReentrantLock reentrantLock = c1325l.f11400n;
        ReentrantLock reentrantLock2 = c1325l.f11400n;
        reentrantLock.lock();
        try {
            if (!c1325l.f11399m && (bVar = c1325l.f11398l) != null && bVar.b()) {
                c1325l.f11399m = true;
                c1325l.f11392f.onConnectionSuspended(i2);
                reentrantLock2.unlock();
            }
            c1325l.f11399m = false;
            C1325l.h(c1325l, i2);
            reentrantLock2.unlock();
        } catch (Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    public void z(int i2, int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f3053a;
        if (mVar.c(i2)) {
            ((io.flutter.plugin.platform.s) mVar.f10243i.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (mVar.f10245k.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public e(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3053a = sharedPreferences;
        File file = new File(AbstractC1485a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e3) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e3.getMessage());
            }
        }
    }

    public e(j5.g sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f3053a = sink;
    }

    @Override // w2.y
    public void m() {
    }
}
