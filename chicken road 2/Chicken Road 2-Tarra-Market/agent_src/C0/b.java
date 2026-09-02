package C0;

import Q.E;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocket;
import kotlin.KotlinVersion;
import m.InterfaceC0785a;
import p.DialogInterfaceOnCancelListenerC0814d;
import r0.ThreadFactoryC0826a;
import u0.C0840b;

/* loaded from: classes.dex */
public final class b implements D0.j {

    /* renamed from: e, reason: collision with root package name */
    public static b f52e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53a;

    /* renamed from: b, reason: collision with root package name */
    public Object f54b;

    /* renamed from: c, reason: collision with root package name */
    public Object f55c;

    /* renamed from: d, reason: collision with root package name */
    public Object f56d;

    public /* synthetic */ b(int i2, boolean z2) {
        this.f53a = i2;
    }

    public static b i() {
        if (f52e == null) {
            N.i iVar = new N.i(18);
            ThreadFactoryC0826a threadFactoryC0826a = new ThreadFactoryC0826a();
            threadFactoryC0826a.f6485a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC0826a);
            FlutterJNI flutterJNI = new FlutterJNI();
            x0.d dVar = new x0.d();
            dVar.f6787a = false;
            dVar.f6788b = false;
            dVar.f6792f = flutterJNI;
            dVar.f6793g = newCachedThreadPool;
            b bVar = new b(8, false);
            bVar.f54b = dVar;
            bVar.f55c = iVar;
            bVar.f56d = newCachedThreadPool;
            f52e = bVar;
        }
        return f52e;
    }

    public void a(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f55c;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f56d).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b(boolean z2) {
        for (DialogInterfaceOnCancelListenerC0814d dialogInterfaceOnCancelListenerC0814d : ((i1.l) this.f55c).b()) {
            if (dialogInterfaceOnCancelListenerC0814d != null && z2) {
                dialogInterfaceOnCancelListenerC0814d.f6398c.b(true);
            }
        }
    }

    public void c(boolean z2) {
        for (DialogInterfaceOnCancelListenerC0814d dialogInterfaceOnCancelListenerC0814d : ((i1.l) this.f55c).b()) {
            if (dialogInterfaceOnCancelListenerC0814d != null && z2) {
                dialogInterfaceOnCancelListenerC0814d.f6398c.c(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d5, code lost:
    
        if (a1.h.U(r1, "generic") == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018f A[LOOP:1: B:21:0x0189->B:23:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // D0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(Y.e call, p pVar) {
        boolean z2;
        Iterator it;
        int i2;
        kotlin.jvm.internal.j.e(call, "call");
        if (!((String) call.f523b).equals("getDeviceInfo")) {
            pVar.b();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        String BRAND = Build.BRAND;
        hashMap.put("brand", BRAND);
        String DEVICE = Build.DEVICE;
        hashMap.put("device", DEVICE);
        hashMap.put("display", Build.DISPLAY);
        String FINGERPRINT = Build.FINGERPRINT;
        hashMap.put("fingerprint", FINGERPRINT);
        String HARDWARE = Build.HARDWARE;
        hashMap.put("hardware", HARDWARE);
        hashMap.put("host", Build.HOST);
        hashMap.put("id", Build.ID);
        String MANUFACTURER = Build.MANUFACTURER;
        hashMap.put(CommonUrlParts.MANUFACTURER, MANUFACTURER);
        String MODEL = Build.MODEL;
        hashMap.put(CommonUrlParts.MODEL, MODEL);
        String PRODUCT = Build.PRODUCT;
        hashMap.put("product", PRODUCT);
        String string = Settings.Global.getString((ContentResolver) this.f56d, "device_name");
        if (string == null) {
            string = "";
        }
        hashMap.put("name", string);
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", L0.e.O(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", L0.e.O(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", L0.e.O(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        kotlin.jvm.internal.j.d(BRAND, "BRAND");
        boolean U = a1.h.U(BRAND, "generic");
        String str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        if (U) {
            kotlin.jvm.internal.j.d(DEVICE, "DEVICE");
        }
        kotlin.jvm.internal.j.d(FINGERPRINT, "FINGERPRINT");
        if (!a1.h.U(FINGERPRINT, "generic") && !a1.h.U(FINGERPRINT, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE)) {
            kotlin.jvm.internal.j.d(HARDWARE, "HARDWARE");
            if (!a1.h.O(HARDWARE, "goldfish") && !a1.h.O(HARDWARE, "ranchu")) {
                kotlin.jvm.internal.j.d(MODEL, "MODEL");
                if (!a1.h.O(MODEL, "google_sdk") && !a1.h.O(MODEL, "Emulator") && !a1.h.O(MODEL, "Android SDK built for x86")) {
                    kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
                    if (!a1.h.O(MANUFACTURER, "Genymotion")) {
                        kotlin.jvm.internal.j.d(PRODUCT, "PRODUCT");
                        if (!a1.h.O(PRODUCT, "sdk") && !a1.h.O(PRODUCT, "vbox86p") && !a1.h.O(PRODUCT, "emulator") && !a1.h.O(PRODUCT, "simulator")) {
                            z2 = false;
                            hashMap.put("isPhysicalDevice", Boolean.valueOf(!z2));
                            FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f54b).getSystemAvailableFeatures();
                            kotlin.jvm.internal.j.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                            ArrayList arrayList = new ArrayList();
                            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                                if (featureInfo.name != null) {
                                    arrayList.add(featureInfo);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(L0.f.Q(arrayList));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((FeatureInfo) it.next()).name);
                            }
                            hashMap.put("systemFeatures", arrayList2);
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            hashMap.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
                            hashMap.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
                            HashMap hashMap2 = new HashMap();
                            i2 = Build.VERSION.SDK_INT;
                            hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                            hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                            hashMap2.put("codename", Build.VERSION.CODENAME);
                            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
                            hashMap2.put("release", Build.VERSION.RELEASE);
                            hashMap2.put("sdkInt", Integer.valueOf(i2));
                            hashMap.put("version", hashMap2);
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            ((ActivityManager) this.f55c).getMemoryInfo(memoryInfo);
                            hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
                            hashMap.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
                            hashMap.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
                            if (i2 < 26) {
                                try {
                                    str = Build.getSerial();
                                } catch (SecurityException unused) {
                                }
                                hashMap.put("serialNumber", str);
                            } else {
                                hashMap.put("serialNumber", Build.SERIAL);
                            }
                            pVar.c(hashMap);
                        }
                    }
                }
            }
        }
        z2 = true;
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!z2));
        FeatureInfo[] systemAvailableFeatures2 = ((PackageManager) this.f54b).getSystemAvailableFeatures();
        kotlin.jvm.internal.j.d(systemAvailableFeatures2, "getSystemAvailableFeatures(...)");
        ArrayList arrayList3 = new ArrayList();
        while (r9 < r2) {
        }
        ArrayList arrayList22 = new ArrayList(L0.f.Q(arrayList3));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        hashMap.put("systemFeatures", arrayList22);
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("freeDiskSize", Long.valueOf(statFs2.getFreeBytes()));
        hashMap.put("totalDiskSize", Long.valueOf(statFs2.getTotalBytes()));
        HashMap hashMap22 = new HashMap();
        i2 = Build.VERSION.SDK_INT;
        hashMap22.put("baseOS", Build.VERSION.BASE_OS);
        hashMap22.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap22.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap22.put("codename", Build.VERSION.CODENAME);
        hashMap22.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap22.put("release", Build.VERSION.RELEASE);
        hashMap22.put("sdkInt", Integer.valueOf(i2));
        hashMap.put("version", hashMap22);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f55c).getMemoryInfo(memoryInfo2);
        hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo2.lowMemory));
        hashMap.put("physicalRamSize", Long.valueOf(memoryInfo2.totalMem / 1048576));
        hashMap.put("availableRamSize", Long.valueOf(memoryInfo2.availMem / 1048576));
        if (i2 < 26) {
        }
        pVar.c(hashMap);
    }

    public void e(int i2, io.flutter.view.f fVar) {
        ((FlutterJNI) this.f55c).dispatchSemanticsAction(i2, fVar);
    }

    public void f(int i2, io.flutter.view.f fVar, Serializable serializable) {
        ((FlutterJNI) this.f55c).dispatchSemanticsAction(i2, fVar, serializable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if ((r4.getModifiers() & 1) == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Method g(Class cls) {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod((String) this.f55c, (Class[]) this.f56d);
        } catch (NoSuchMethodException unused) {
        }
        method = null;
        if (method != null || (cls2 = (Class) this.f54b) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
        if (method != null) {
        }
        return method;
    }

    public boolean h(KeyEvent keyEvent) {
        if (((HashSet) this.f55c).remove(keyEvent)) {
            return false;
        }
        s0.u[] uVarArr = (s0.u[]) this.f54b;
        if (uVarArr.length <= 0) {
            l(keyEvent);
            return true;
        }
        P.i iVar = new P.i(this, keyEvent);
        for (s0.u uVar : uVarArr) {
            uVar.f(keyEvent, new E(iVar));
        }
        return true;
    }

    public Object j(SSLSocket sSLSocket, Object... objArr) {
        Method g2 = g(sSLSocket.getClass());
        if (g2 == null) {
            throw new AssertionError("Method " + ((String) this.f55c) + " not supported for object " + sSLSocket);
        }
        try {
            return g2.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e2) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + g2);
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    public void k(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method g2 = g(sSLSocket.getClass());
            if (g2 == null) {
                return;
            }
            try {
                g2.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public void l(KeyEvent keyEvent) {
        io.flutter.plugin.editing.d dVar;
        s0.o oVar = (s0.o) this.f56d;
        if (oVar != null) {
            io.flutter.plugin.editing.l lVar = oVar.f6562l;
            boolean z2 = false;
            if (lVar.f5837b.isAcceptingText() && (dVar = lVar.f5845j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z2 = dVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z2 = dVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z2 = dVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z2 = dVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        EditorInfo editorInfo = dVar.f5798e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            dVar.performEditorAction(editorInfo.imeOptions & KotlinVersion.MAX_COMPONENT_VALUE);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.g gVar = dVar.f5797d;
                    int selectionStart = Selection.getSelectionStart(gVar);
                    int selectionEnd = Selection.getSelectionEnd(gVar);
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                        int min = Math.min(selectionStart, selectionEnd);
                        int max = Math.max(selectionStart, selectionEnd);
                        dVar.beginBatchEdit();
                        if (min != max) {
                            gVar.delete(min, max);
                        }
                        gVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                        int i2 = min + 1;
                        dVar.setSelection(i2, i2);
                        dVar.endBatchEdit();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                return;
            }
            HashSet hashSet = (HashSet) this.f55c;
            hashSet.add(keyEvent);
            oVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void m(Activity activity, A.l newLayout) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(newLayout, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f55c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f56d;
        try {
            if (newLayout.equals((A.l) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((D.k) ((a) this.f54b).f51b).f159b.iterator();
            while (it.hasNext()) {
                D.j jVar = (D.j) it.next();
                if (jVar.f153a.equals(activity)) {
                    jVar.f155c = newLayout;
                    jVar.f154b.accept(newLayout);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        switch (this.f53a) {
            case 6:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i2) {
        this.f53a = i2;
        this.f54b = obj;
        this.f55c = obj2;
        this.f56d = obj3;
    }

    public b(C0840b c0840b, FlutterJNI flutterJNI) {
        this.f53a = 0;
        a aVar = new a(0, this);
        t tVar = new t(c0840b, "flutter/accessibility", D0.m.INSTANCE, null);
        this.f54b = tVar;
        tVar.i(aVar);
        this.f55c = flutterJNI;
    }

    public b(s0.o oVar) {
        this.f53a = 9;
        this.f55c = new HashSet();
        this.f56d = oVar;
        this.f54b = new s0.u[]{new s0.t(oVar.getBinaryMessenger()), new Y.e(new f(oVar.getBinaryMessenger()))};
        new a(oVar.getBinaryMessenger()).f51b = this;
    }

    public b(int i2) {
        this.f53a = i2;
        switch (i2) {
            case 6:
                this.f54b = new ArrayList();
                this.f55c = new i1.l(1);
                new ArrayList();
                new N.i(this, 12);
                this.f56d = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new ArrayList();
                new N.i(this, 11);
                new CopyOnWriteArrayList();
                final int i3 = 0;
                new InterfaceC0785a(this) { // from class: p.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0.b f6410b;

                    {
                        this.f6410b = this;
                    }

                    @Override // m.InterfaceC0785a
                    public final void accept(Object obj) {
                        switch (i3) {
                            case 0:
                                C0.b bVar = this.f6410b;
                                bVar.getClass();
                                bVar.b(false);
                                return;
                            case 1:
                                C0.b bVar2 = this.f6410b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.c(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                        }
                    }
                };
                final int i4 = 1;
                new InterfaceC0785a(this) { // from class: p.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0.b f6410b;

                    {
                        this.f6410b = this;
                    }

                    @Override // m.InterfaceC0785a
                    public final void accept(Object obj) {
                        switch (i4) {
                            case 0:
                                C0.b bVar = this.f6410b;
                                bVar.getClass();
                                bVar.b(false);
                                return;
                            case 1:
                                C0.b bVar2 = this.f6410b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.c(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                        }
                    }
                };
                final int i5 = 2;
                new InterfaceC0785a(this) { // from class: p.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0.b f6410b;

                    {
                        this.f6410b = this;
                    }

                    @Override // m.InterfaceC0785a
                    public final void accept(Object obj) {
                        switch (i5) {
                            case 0:
                                C0.b bVar = this.f6410b;
                                bVar.getClass();
                                bVar.b(false);
                                return;
                            case 1:
                                C0.b bVar2 = this.f6410b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.c(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                        }
                    }
                };
                final int i6 = 3;
                new InterfaceC0785a(this) { // from class: p.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0.b f6410b;

                    {
                        this.f6410b = this;
                    }

                    @Override // m.InterfaceC0785a
                    public final void accept(Object obj) {
                        switch (i6) {
                            case 0:
                                C0.b bVar = this.f6410b;
                                bVar.getClass();
                                bVar.b(false);
                                return;
                            case 1:
                                C0.b bVar2 = this.f6410b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.c(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f6410b.getClass();
                                throw null;
                        }
                    }
                };
                new ArrayDeque();
                new P.m(7, this);
                break;
            default:
                this.f54b = new ConcurrentLinkedQueue();
                break;
        }
    }

    public b(a aVar) {
        this.f53a = 2;
        this.f54b = aVar;
        this.f55c = new ReentrantLock();
        this.f56d = new WeakHashMap();
    }
}
