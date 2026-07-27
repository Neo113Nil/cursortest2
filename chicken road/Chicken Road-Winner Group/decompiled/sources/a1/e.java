package a1;

import D2.i;
import H0.k;
import H2.h;
import H2.p;
import I1.F;
import I1.w;
import I1.x;
import I1.z;
import M.j;
import T1.l;
import T1.m;
import T1.n;
import T1.o;
import U.N;
import U.O;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d2.C0274d;
import e2.AbstractC0293h;
import e2.AbstractC0294i;
import e2.r;
import e2.s;
import i1.C0335e;
import i1.InterfaceC0332b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.impl.C0644l9;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements C0.b, m, h, z, InterfaceC0332b, T1.c, T1.d {

    /* renamed from: d, reason: collision with root package name */
    public static e f1785d;

    /* renamed from: e, reason: collision with root package name */
    public static e f1786e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1787a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1788b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1789c;

    public /* synthetic */ e(Object obj, int i3, Object obj2) {
        this.f1787a = i3;
        this.f1788b = obj;
        this.f1789c = obj2;
    }

    public static final SharedPreferences G(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void H(Context context) {
        if (G(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q(e eVar, JSONArray jSONArray) {
        String str;
        eVar.getClass();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String string = jSONArray.getString(i5);
            for (int i6 : j.c(4)) {
                if (i6 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i6 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i6 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i6 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int b3 = j.b(i6);
                    if (b3 == 0) {
                        i3 |= 1;
                    } else if (b3 == 1) {
                        i3 |= 4;
                    } else if (b3 == 2) {
                        i3 |= 2;
                    } else if (b3 == 3) {
                        i3 |= 8;
                    }
                    if (i4 == 0) {
                        i4 = i3;
                    }
                }
            }
            throw new NoSuchFieldException(B0.c.j("No such DeviceOrientation: ", string));
        }
        if (i3 == 0) {
            return -1;
        }
        switch (i3) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i4 == 2) {
                    return 0;
                }
                if (i4 != 4) {
                    return i4 != 8 ? 1 : 8;
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList r(e eVar, JSONArray jSONArray) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            for (S1.d dVar : S1.d.values()) {
                if (dVar.f1398a.equals(string)) {
                    int ordinal = dVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(S1.d.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(S1.d.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(B0.c.j("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int s(e eVar, String str) {
        String str2;
        eVar.getClass();
        for (int i3 : j.c(4)) {
            if (i3 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i3 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i3 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i3 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int b3 = j.b(i3);
                if (b3 == 0) {
                    return 1;
                }
                if (b3 != 1) {
                    return b3 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(B0.c.j("No such SystemUiMode: ", str));
    }

    public static S1.c t(e eVar, JSONObject jSONObject) {
        eVar.getClass();
        return new S1.c(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? B0.c.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : B0.c.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap v(String str, int i3, int i4, int i5, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i3));
        hashMap.put("selectionExtent", Integer.valueOf(i4));
        hashMap.put("composingBase", Integer.valueOf(i5));
        hashMap.put("composingExtent", Integer.valueOf(i6));
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory A(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f1789c) == null) {
            Context context = (Context) this.f1788b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(StringUtils.COMMA, -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f1789c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f1789c = map;
        }
        String str4 = (String) ((Map) this.f1789c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e3) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e3);
            return null;
        } catch (IllegalAccessException e4) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e4);
            return null;
        } catch (InstantiationException e5) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e7);
            return null;
        }
    }

    public List B() {
        ArrayList arrayList;
        if (((ArrayList) this.f1788b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1788b)) {
            arrayList = new ArrayList((ArrayList) this.f1788b);
        }
        return arrayList;
    }

    public void C(A.h hVar) {
        int i3 = hVar.f19b;
        Handler handler = (Handler) this.f1789c;
        b0.j jVar = (b0.j) this.f1788b;
        if (i3 != 0) {
            handler.post(new A.b(jVar, i3));
        } else {
            handler.post(new A.a(jVar, 0, hVar.f18a));
        }
    }

    public MotionEvent D(F f) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j3;
        while (true) {
            priorityQueue = (PriorityQueue) this.f1789c;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f1788b;
            j3 = f.f580a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j3) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j3) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return motionEvent;
    }

    public void E(String str, HashMap hashMap) {
        Map map;
        T1.g gVar = (T1.g) this.f1789c;
        if (gVar != null) {
            C0274d c0274d = new C0274d("event", str);
            if (hashMap.isEmpty()) {
                map = s.k0(c0274d);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
                linkedHashMap.put("event", str);
                map = linkedHashMap;
            }
            if (gVar.f1462a.get()) {
                return;
            }
            A0.j jVar = gVar.f1463b;
            if (((AtomicReference) jVar.f67c).get() != gVar) {
                return;
            }
            A0.j jVar2 = (A0.j) jVar.f68d;
            ((T1.f) jVar2.f67c).k((String) jVar2.f66b, ((T1.s) jVar2.f68d).a(map));
        }
    }

    public void F(boolean z3, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f1788b)) {
            hashMap = new HashMap((Map) this.f1788b);
        }
        synchronized (((Map) this.f1789c)) {
            hashMap2 = new HashMap((Map) this.f1789c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0335e) entry2.getKey()).a(new Q0.d(status));
            }
        }
    }

    @Override // H2.h
    public void a() {
        ((MediaPlayer) this.f1789c).pause();
    }

    @Override // H2.h
    public void b(boolean z3) {
        ((MediaPlayer) this.f1789c).setLooping(z3);
    }

    @Override // H2.h
    public void c() {
        ((MediaPlayer) this.f1789c).stop();
    }

    @Override // H2.h
    public void d() {
        i(((p) this.f1788b).f553i);
    }

    @Override // I1.z
    public void e(KeyEvent keyEvent, x xVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            xVar.a(false);
            return;
        }
        Character a3 = ((i) this.f1789c).a(keyEvent.getUnicodeChar());
        boolean z3 = action != 0;
        F1.b bVar = new F1.b(5, xVar);
        b0.i iVar = (b0.i) this.f1788b;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z3 ? "keyup" : "keydown");
        hashMap.put("keymap", ConstantDeviceInfo.APP_PLATFORM);
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a3.toString());
        hashMap.put(AdRevenueConstants.SOURCE_KEY, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((D0.a) iVar.f2461b).f(hashMap, new F1.b(6, bVar));
    }

    @Override // H2.h
    public void f() {
        ((MediaPlayer) this.f1789c).prepareAsync();
    }

    @Override // H2.h
    public Integer g() {
        Integer valueOf = Integer.valueOf(((MediaPlayer) this.f1789c).getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    @Override // c2.a
    public Object get() {
        switch (this.f1787a) {
            case 3:
                return new B0.g((Context) ((b0.i) this.f1788b).f2461b, (B0.e) ((B0.f) this.f1789c).get());
            default:
                return new H0.i(new P0.j(4), new P0.j(3), H0.a.f, (k) ((J1.i) this.f1788b).get(), (c2.a) this.f1789c);
        }
    }

    @Override // H2.h
    public boolean h() {
        Integer g3 = g();
        return g3 == null || g3.intValue() == 0;
    }

    @Override // H2.h
    public void i(float f) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f1789c;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
    }

    @Override // H2.h
    public void j(int i3) {
        ((MediaPlayer) this.f1789c).seekTo(i3);
    }

    @Override // H2.h
    public void k(G2.a aVar) {
        MediaPlayer player = (MediaPlayer) this.f1789c;
        kotlin.jvm.internal.j.e(player, "player");
        player.setAudioAttributes(aVar.a());
        if (aVar.f435b) {
            Context context = ((p) this.f1788b).f546a.f443b;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.j.d(applicationContext, "getApplicationContext(...)");
            player.setWakeMode(applicationContext, 1);
        }
    }

    @Override // T1.c
    public void l(Object obj) {
        switch (this.f1787a) {
            case 24:
                A0.j jVar = (A0.j) this.f1789c;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) jVar.f66b;
                S1.k kVar = (S1.k) this.f1788b;
                concurrentLinkedQueue.remove(kVar);
                if (!((ConcurrentLinkedQueue) jVar.f66b).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + kVar.f1434a);
                    break;
                }
                break;
            default:
                ((K1.g) this.f1788b).a(((T1.k) ((D0.a) ((e) this.f1789c).f1789c).f262b).encodeMessage(obj));
                break;
        }
    }

    @Override // H2.h
    public void m(float f, float f3) {
        ((MediaPlayer) this.f1789c).setVolume(f, f3);
    }

    @Override // H2.h
    public Integer n() {
        return Integer.valueOf(((MediaPlayer) this.f1789c).getCurrentPosition());
    }

    @Override // T1.d
    public void o(ByteBuffer byteBuffer, K1.g gVar) {
        switch (this.f1787a) {
            case C0644l9.f7764H /* 27 */:
                D0.a aVar = (D0.a) this.f1789c;
                try {
                    ((T1.b) this.f1788b).e(((T1.k) aVar.f262b).decodeMessage(byteBuffer), new e(this, gVar, 26, false));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) aVar.f264d), "Failed to handle message", e3);
                    gVar.a(null);
                    return;
                }
            default:
                o oVar = (o) this.f1789c;
                try {
                    ((m) this.f1788b).onMethodCall(oVar.f1472c.e(byteBuffer), new S1.i(this, 1, gVar));
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + oVar.f1471b, "Failed to handle method call", e4);
                    gVar.a(oVar.f1472c.b(e4.getMessage(), Log.getStackTraceString(e4)));
                }
        }
    }

    @Override // i1.InterfaceC0332b
    public void onComplete(Task task) {
        ((Map) ((e) this.f1789c).f1789c).remove((C0335e) this.f1788b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0119, code lost:
    
        if (v2.m.q0(r3, "generic") == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d2 A[LOOP:1: B:36:0x01cc->B:38:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // T1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(l call, n nVar) {
        boolean z3;
        Iterator it;
        int i3;
        switch (this.f1787a) {
            case 4:
                kotlin.jvm.internal.j.e(call, "call");
                if (!call.f1468a.equals("getDeviceInfo")) {
                    ((S1.i) nVar).a();
                    break;
                } else {
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
                    String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                    hashMap.put("supported32BitAbis", AbstractC0293h.S(Arrays.copyOf(strArr, strArr.length)));
                    String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                    hashMap.put("supported64BitAbis", AbstractC0293h.S(Arrays.copyOf(strArr2, strArr2.length)));
                    String[] strArr3 = Build.SUPPORTED_ABIS;
                    hashMap.put("supportedAbis", AbstractC0293h.S(Arrays.copyOf(strArr3, strArr3.length)));
                    hashMap.put("tags", Build.TAGS);
                    hashMap.put("type", Build.TYPE);
                    kotlin.jvm.internal.j.d(BRAND, "BRAND");
                    boolean q02 = v2.m.q0(BRAND, "generic");
                    String str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
                    if (q02) {
                        kotlin.jvm.internal.j.d(DEVICE, "DEVICE");
                        break;
                    }
                    kotlin.jvm.internal.j.d(FINGERPRINT, "FINGERPRINT");
                    if (!v2.m.q0(FINGERPRINT, "generic") && !v2.m.q0(FINGERPRINT, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE)) {
                        kotlin.jvm.internal.j.d(HARDWARE, "HARDWARE");
                        if (!v2.m.k0(HARDWARE, "goldfish") && !v2.m.k0(HARDWARE, "ranchu")) {
                            kotlin.jvm.internal.j.d(MODEL, "MODEL");
                            if (!v2.m.k0(MODEL, "google_sdk") && !v2.m.k0(MODEL, "Emulator") && !v2.m.k0(MODEL, "Android SDK built for x86")) {
                                kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
                                if (!v2.m.k0(MANUFACTURER, "Genymotion")) {
                                    kotlin.jvm.internal.j.d(PRODUCT, "PRODUCT");
                                    if (!v2.m.k0(PRODUCT, "sdk") && !v2.m.k0(PRODUCT, "vbox86p") && !v2.m.k0(PRODUCT, "emulator") && !v2.m.k0(PRODUCT, "simulator")) {
                                        z3 = false;
                                        hashMap.put("isPhysicalDevice", Boolean.valueOf(!z3));
                                        FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f1788b).getSystemAvailableFeatures();
                                        kotlin.jvm.internal.j.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                                        ArrayList arrayList = new ArrayList();
                                        for (FeatureInfo featureInfo : systemAvailableFeatures) {
                                            if (featureInfo.name != null) {
                                                arrayList.add(featureInfo);
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList(AbstractC0294i.U(arrayList));
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((FeatureInfo) it.next()).name);
                                        }
                                        hashMap.put("systemFeatures", arrayList2);
                                        HashMap hashMap2 = new HashMap();
                                        i3 = Build.VERSION.SDK_INT;
                                        hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                                        hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                                        hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                                        hashMap2.put("codename", Build.VERSION.CODENAME);
                                        hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
                                        hashMap2.put("release", Build.VERSION.RELEASE);
                                        hashMap2.put("sdkInt", Integer.valueOf(i3));
                                        hashMap.put("version", hashMap2);
                                        hashMap.put("isLowRamDevice", Boolean.valueOf(((ActivityManager) this.f1789c).isLowRamDevice()));
                                        if (i3 < 26) {
                                            try {
                                                str = Build.getSerial();
                                            } catch (SecurityException unused) {
                                            }
                                            hashMap.put("serialNumber", str);
                                        } else {
                                            hashMap.put("serialNumber", Build.SERIAL);
                                        }
                                        ((S1.i) nVar).success(hashMap);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z3 = true;
                    hashMap.put("isPhysicalDevice", Boolean.valueOf(!z3));
                    FeatureInfo[] systemAvailableFeatures2 = ((PackageManager) this.f1788b).getSystemAvailableFeatures();
                    kotlin.jvm.internal.j.d(systemAvailableFeatures2, "getSystemAvailableFeatures(...)");
                    ArrayList arrayList3 = new ArrayList();
                    while (r1 < r4) {
                    }
                    ArrayList arrayList22 = new ArrayList(AbstractC0294i.U(arrayList3));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    hashMap.put("systemFeatures", arrayList22);
                    HashMap hashMap22 = new HashMap();
                    i3 = Build.VERSION.SDK_INT;
                    hashMap22.put("baseOS", Build.VERSION.BASE_OS);
                    hashMap22.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                    hashMap22.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                    hashMap22.put("codename", Build.VERSION.CODENAME);
                    hashMap22.put("incremental", Build.VERSION.INCREMENTAL);
                    hashMap22.put("release", Build.VERSION.RELEASE);
                    hashMap22.put("sdkInt", Integer.valueOf(i3));
                    hashMap.put("version", hashMap22);
                    hashMap.put("isLowRamDevice", Boolean.valueOf(((ActivityManager) this.f1789c).isLowRamDevice()));
                    if (i3 < 26) {
                    }
                    ((S1.i) nVar).success(hashMap);
                }
                break;
            default:
                J1.i iVar = (J1.i) this.f1789c;
                if (((A0.j) iVar.f729b) == null) {
                    ((S1.i) nVar).success((Map) this.f1788b);
                    break;
                } else {
                    String str2 = call.f1468a;
                    str2.getClass();
                    if (str2.equals("getKeyboardState")) {
                        try {
                            this.f1788b = Collections.unmodifiableMap(((w) ((z[]) ((A0.j) iVar.f729b).f66b)[0]).f679b);
                        } catch (IllegalStateException e3) {
                            ((S1.i) nVar).b("error", e3.getMessage(), null);
                        }
                        ((S1.i) nVar).success((Map) this.f1788b);
                        break;
                    } else {
                        ((S1.i) nVar).a();
                        break;
                    }
                }
        }
    }

    @Override // H2.h
    public void p(I2.c source) {
        kotlin.jvm.internal.j.e(source, "source");
        reset();
        source.b((MediaPlayer) this.f1789c);
    }

    @Override // H2.h
    public void release() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f1789c;
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    @Override // H2.h
    public void reset() {
        ((MediaPlayer) this.f1789c).reset();
    }

    public String toString() {
        switch (this.f1787a) {
            case 16:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f1789c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f1788b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, String str) {
        ((ArrayList) this.f1788b).add(str + "=" + String.valueOf(obj));
    }

    public void w(G2.a aVar) {
        AudioAttributes a3 = aVar.a();
        HashMap hashMap = (HashMap) this.f1789c;
        if (hashMap.containsKey(a3)) {
            return;
        }
        SoundPool build = new SoundPool.Builder().setAudioAttributes(a3).setMaxStreams(32).build();
        ((G2.d) this.f1788b).b("Create SoundPool with " + a3);
        kotlin.jvm.internal.j.b(build);
        final H2.m mVar = new H2.m(build);
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: H2.i
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i3, int i4) {
                a1.e eVar = a1.e.this;
                m mVar2 = mVar;
                ((G2.d) eVar.f1788b).b("Loaded " + i3);
                l lVar = (l) mVar2.f540b.get(Integer.valueOf(i3));
                I2.d dVar = lVar != null ? lVar.f538h : null;
                if (dVar != null) {
                    Map map = mVar2.f540b;
                    Integer num = lVar.f535d;
                    if ((map instanceof p2.a) && !(map instanceof p2.b)) {
                        t.c(map, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    try {
                        map.remove(num);
                        synchronized (mVar2.f541c) {
                            List<l> list = (List) mVar2.f541c.get(dVar);
                            if (list == null) {
                                list = e2.o.f4877a;
                            }
                            for (l lVar2 : list) {
                                lVar2.f532a.c("Marking " + lVar2 + " as loaded");
                                lVar2.f532a.h(true);
                                p pVar = lVar2.f532a;
                                if (pVar.f558n) {
                                    pVar.c("Delayed start of " + lVar2);
                                    lVar2.d();
                                }
                            }
                        }
                    } catch (ClassCastException e3) {
                        kotlin.jvm.internal.j.f(e3, t.class.getName());
                        throw e3;
                    }
                }
            }
        });
        hashMap.put(a3, mVar);
    }

    public void x() {
        T1.g gVar = (T1.g) this.f1789c;
        if (gVar != null) {
            if (!gVar.f1462a.getAndSet(true)) {
                A0.j jVar = gVar.f1463b;
                if (((AtomicReference) jVar.f67c).get() == gVar) {
                    A0.j jVar2 = (A0.j) jVar.f68d;
                    ((T1.f) jVar2.f67c).k((String) jVar2.f66b, null);
                }
            }
            this.f1789c = null;
        }
        ((A0.j) this.f1788b).P(null);
    }

    public void y(String str, String str2, String str3) {
        T1.g gVar = (T1.g) this.f1789c;
        if (gVar == null || gVar.f1462a.get()) {
            return;
        }
        A0.j jVar = gVar.f1463b;
        if (((AtomicReference) jVar.f67c).get() != gVar) {
            return;
        }
        A0.j jVar2 = (A0.j) jVar.f68d;
        ((T1.f) jVar2.f67c).k((String) jVar2.f66b, ((T1.s) jVar2.f68d).d(str, str2, str3));
    }

    public View z(int i3, int i4, int i5, int i6) {
        O o3 = (O) this.f1788b;
        int n3 = o3.n();
        int c3 = o3.c();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View m3 = o3.m(i3);
            int f = o3.f(m3);
            int q3 = o3.q(m3);
            N n4 = (N) this.f1789c;
            n4.f1516b = n3;
            n4.f1517c = c3;
            n4.f1518d = f;
            n4.f1519e = q3;
            if (i5 != 0) {
                n4.f1515a = i5;
                if (n4.a()) {
                    return m3;
                }
            }
            if (i6 != 0) {
                n4.f1515a = i6;
                if (n4.a()) {
                    view = m3;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i3, boolean z3) {
        this.f1787a = i3;
        this.f1789c = obj;
        this.f1788b = obj2;
    }

    public e(Context context, int i3) {
        this.f1787a = i3;
        switch (i3) {
            case 2:
                this.f1789c = null;
                this.f1788b = context;
                break;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f1789c = Executors.newSingleThreadExecutor();
                this.f1788b = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new A.b(11, this), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public /* synthetic */ e(Object obj) {
        this.f1787a = 16;
        this.f1789c = obj;
        this.f1788b = new ArrayList();
    }

    public e(String str, F2.b bVar, P0.j jVar) {
        this.f1787a = 12;
        this.f1789c = str;
        this.f1788b = bVar;
    }

    public e(final p wrappedPlayer) {
        this.f1787a = 7;
        kotlin.jvm.internal.j.e(wrappedPlayer, "wrappedPlayer");
        this.f1788b = wrappedPlayer;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: H2.c
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                h hVar;
                h hVar2;
                p pVar = p.this;
                pVar.h(true);
                pVar.f546a.getClass();
                Integer g3 = (!pVar.f557m || (hVar2 = pVar.f550e) == null) ? null : hVar2.g();
                pVar.f547b.E("audio.onDuration", r.l0(new C0274d("value", Integer.valueOf(g3 != null ? g3.intValue() : 0))));
                if (pVar.f558n) {
                    pVar.f();
                }
                if (pVar.f559o >= 0) {
                    h hVar3 = pVar.f550e;
                    if ((hVar3 == null || !hVar3.h()) && (hVar = pVar.f550e) != null) {
                        hVar.j(pVar.f559o);
                    }
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: H2.d
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                p pVar = p.this;
                if (pVar.f554j != G2.f.f450b) {
                    pVar.k();
                }
                pVar.f546a.getClass();
                pVar.f547b.E("audio.onComplete", new HashMap());
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: H2.e
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                p pVar = p.this;
                pVar.f546a.getClass();
                pVar.f547b.E("audio.onSeekComplete", new HashMap());
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: H2.f
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i3, int i4) {
                String str;
                String str2;
                p pVar = p.this;
                pVar.getClass();
                if (i3 == 100) {
                    str = "MEDIA_ERROR_SERVER_DIED";
                } else {
                    str = "MEDIA_ERROR_UNKNOWN {what:" + i3 + '}';
                }
                if (i4 == Integer.MIN_VALUE) {
                    str2 = "MEDIA_ERROR_SYSTEM";
                } else if (i4 == -1010) {
                    str2 = "MEDIA_ERROR_UNSUPPORTED";
                } else if (i4 == -1007) {
                    str2 = "MEDIA_ERROR_MALFORMED";
                } else if (i4 == -1004) {
                    str2 = "MEDIA_ERROR_IO";
                } else if (i4 != -110) {
                    str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i4 + '}';
                } else {
                    str2 = "MEDIA_ERROR_TIMED_OUT";
                }
                boolean z3 = pVar.f557m;
                a1.e eVar = pVar.f547b;
                G2.d dVar = pVar.f546a;
                if (z3 || !kotlin.jvm.internal.j.a(str2, "MEDIA_ERROR_SYSTEM")) {
                    pVar.h(false);
                    dVar.getClass();
                    eVar.y("AndroidAudioError", str, str2);
                    return false;
                }
                dVar.getClass();
                eVar.y("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
                return false;
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: H2.g
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i3) {
                p.this.getClass();
            }
        });
        mediaPlayer.setAudioAttributes(wrappedPlayer.f548c.a());
        this.f1789c = mediaPlayer;
    }

    public e(b0.i iVar) {
        this.f1787a = 9;
        this.f1789c = new i();
        this.f1788b = iVar;
    }

    public e(J1.i iVar) {
        this.f1787a = 18;
        this.f1789c = iVar;
        this.f1788b = new HashMap();
    }

    public e(int i3) {
        this.f1787a = i3;
        switch (i3) {
            case 11:
                this.f1788b = new ArrayList();
                this.f1789c = new HashMap();
                new HashMap();
                break;
            case 14:
                this.f1788b = Collections.synchronizedMap(new WeakHashMap());
                this.f1789c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 17:
                P0.e eVar = P0.e.f1132d;
                this.f1788b = new SparseIntArray();
                this.f1789c = eVar;
                break;
            default:
                this.f1788b = new LongSparseArray();
                this.f1789c = new PriorityQueue();
                break;
        }
    }

    public e(K1.b bVar, int i3) {
        this.f1787a = i3;
        switch (i3) {
            case C0644l9.f7760D /* 20 */:
                b0.i iVar = new b0.i(16, this);
                o oVar = new o(bVar, "flutter/platform", T1.j.f1467a);
                this.f1788b = oVar;
                oVar.b(iVar);
                break;
            case C0644l9.f7761E /* 21 */:
                b0.i iVar2 = new b0.i(17, this);
                o oVar2 = new o(bVar, "flutter/platform_views_2", T1.s.f1473b);
                this.f1788b = oVar2;
                oVar2.b(iVar2);
                break;
            case 22:
                J1.i iVar3 = new J1.i(17, this);
                o oVar3 = new o(bVar, "flutter/platform_views", T1.s.f1473b);
                this.f1788b = oVar3;
                oVar3.b(iVar3);
                break;
            case 23:
            case 24:
            default:
                b0.i iVar4 = new b0.i(14, this);
                o oVar4 = new o(bVar, "flutter/localization", T1.j.f1467a);
                this.f1788b = oVar4;
                oVar4.b(iVar4);
                break;
            case C0644l9.f7762F /* 25 */:
                b0.i iVar5 = new b0.i(22, this);
                o oVar5 = new o(bVar, "flutter/textinput", T1.j.f1467a);
                this.f1788b = oVar5;
                oVar5.b(iVar5);
                break;
        }
    }

    public e(K1.b bVar, PackageManager packageManager) {
        this.f1787a = 23;
        J1.i iVar = new J1.i(18, this);
        this.f1788b = packageManager;
        new o(bVar, "flutter/processtext", T1.s.f1473b).b(iVar);
    }

    public e(O o3) {
        this.f1787a = 29;
        this.f1788b = o3;
        N n3 = new N();
        n3.f1515a = 0;
        this.f1789c = n3;
    }

    public e(G2.d ref) {
        this.f1787a = 8;
        kotlin.jvm.internal.j.e(ref, "ref");
        this.f1788b = ref;
        this.f1789c = new HashMap();
    }

    public e(A0.j jVar) {
        this.f1787a = 5;
        this.f1788b = jVar;
        jVar.P(this);
    }
}
