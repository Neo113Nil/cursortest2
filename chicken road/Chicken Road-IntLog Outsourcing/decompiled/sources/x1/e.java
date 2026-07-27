package x1;

import B0.n;
import G0.u;
import H2.l;
import H2.m;
import W2.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import c1.C0308a;
import c1.k;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.Task;
import com.onesignal.session.internal.session.impl.SessionListener;
import e4.InterfaceC0412a;
import f2.t;
import g4.AbstractC0465j;
import h2.C0482c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k1.C1206b;
import k1.C1208d;
import k1.ExecutorC1212h;
import kotlin.jvm.internal.i;
import l1.j;
import m1.InterfaceC1276c;
import m5.h;
import w2.r;
import w2.s;
import y2.C1562g;

/* loaded from: classes.dex */
public final class e implements m, H2.d, g, X0.b, I1.a, h {

    /* renamed from: c, reason: collision with root package name */
    public static e f12264c;

    /* renamed from: a, reason: collision with root package name */
    public Object f12265a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12266b;

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f12265a = obj;
        this.f12266b = obj2;
    }

    public static HashMap q(String str, int i2, int i3, int i6, int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i6));
        hashMap.put("composingExtent", Integer.valueOf(i7));
        return hashMap;
    }

    public static final SharedPreferences w(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void x(Context context) {
        if (w(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    @Override // m5.h
    public void a() {
        ((MediaPlayer) this.f12266b).pause();
    }

    @Override // m5.h
    public void b(boolean z) {
        ((MediaPlayer) this.f12266b).setLooping(z);
    }

    @Override // W2.g
    public W2.f build() {
        return (M3.m) ((n) this.f12265a).a(Q2.a.f2475d, (String) this.f12266b);
    }

    @Override // m5.h
    public void c(n5.c source) {
        i.e(source, "source");
        n();
        source.b((MediaPlayer) this.f12266b);
    }

    @Override // m5.h
    public void d() {
        ((MediaPlayer) this.f12266b).prepareAsync();
    }

    @Override // m5.h
    public Integer e() {
        Integer valueOf = Integer.valueOf(((MediaPlayer) this.f12266b).getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    @Override // m5.h
    public boolean f() {
        Integer e3 = e();
        return e3 == null || e3.intValue() == 0;
    }

    @Override // m5.h
    public void g(float f3) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f12266b;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f3));
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        return new c1.i(new W1.e(), new j(22), C0308a.f4893f, (k) ((V0.j) this.f12265a).get(), (InterfaceC0412a) this.f12266b);
    }

    @Override // m5.h
    public void h(int i2) {
        ((MediaPlayer) this.f12266b).seekTo(i2);
    }

    @Override // m5.h
    public void i(l5.a aVar) {
        MediaPlayer player = (MediaPlayer) this.f12266b;
        i.e(player, "player");
        player.setAudioAttributes(aVar.a());
        if (aVar.f11063b) {
            Context context = ((m5.n) this.f12265a).f11246a.f11071b;
            if (context == null) {
                i.l("context");
                throw null;
            }
            Context applicationContext = context.getApplicationContext();
            i.d(applicationContext, "getApplicationContext(...)");
            player.setWakeMode(applicationContext, 1);
        }
    }

    @Override // I1.a
    public Object j(Task task) {
        Bundle bundle;
        C1206b c1206b = (C1206b) this.f12265a;
        c1206b.getClass();
        return (task.e() && (bundle = (Bundle) task.c()) != null && bundle.containsKey("google.messenger")) ? c1206b.a((Bundle) this.f12266b).i(ExecutorC1212h.f10689c, C1208d.f10684d) : task;
    }

    @Override // m5.h
    public void k(float f3, float f6) {
        ((MediaPlayer) this.f12266b).setVolume(f3, f6);
    }

    @Override // H2.d
    public void l(ByteBuffer byteBuffer, C1562g c1562g) {
        t tVar = (t) this.f12266b;
        try {
            ((H2.b) this.f12265a).c(((H2.k) tVar.f5638c).decodeMessage(byteBuffer), new B0.t(this, 4, c1562g));
        } catch (RuntimeException e3) {
            Log.e("BasicMessageChannel#" + ((String) tVar.f5636a), "Failed to handle message", e3);
            c1562g.a(null);
        }
    }

    @Override // m5.h
    public Integer m() {
        return Integer.valueOf(((MediaPlayer) this.f12266b).getCurrentPosition());
    }

    @Override // m5.h
    public void n() {
        ((MediaPlayer) this.f12266b).reset();
    }

    public u o() {
        if ("first_party".equals((String) this.f12266b)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (((String) this.f12265a) == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (((String) this.f12266b) != null) {
            return new u(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    @Override // H2.m
    public void onMethodCall(l lVar, H2.n nVar) {
        C0482c c0482c = (C0482c) this.f12266b;
        if (((x0.c) c0482c.f5783b) == null) {
            ((G2.i) nVar).success((Map) this.f12265a);
            return;
        }
        String str = lVar.f1146a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((G2.i) nVar).a();
            return;
        }
        try {
            this.f12265a = Collections.unmodifiableMap(((r) ((s[]) ((x0.c) c0482c.f5783b).f12258a)[0]).f12209b);
        } catch (IllegalStateException e3) {
            ((G2.i) nVar).b("error", e3.getMessage(), null);
        }
        ((G2.i) nVar).success((Map) this.f12265a);
    }

    public boolean p(B0.j jVar) {
        boolean containsKey;
        synchronized (this.f12265a) {
            containsKey = ((LinkedHashMap) this.f12266b).containsKey(jVar);
        }
        return containsKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory r(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f12266b) == null) {
            Context context = (Context) this.f12265a;
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
                        map = Collections.emptyMap();
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
                    this.f12266b = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f12266b = map;
        }
        String str4 = (String) ((Map) this.f12266b).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e3) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e3);
            return null;
        } catch (IllegalAccessException e6) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e6);
            return null;
        } catch (InstantiationException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e9);
            return null;
        }
    }

    @Override // m5.h
    public void release() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f12266b;
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    public List s(String workSpecId) {
        List S02;
        i.e(workSpecId, "workSpecId");
        synchronized (this.f12265a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f12266b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (i.a(((B0.j) entry.getKey()).f157a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f12266b).remove((B0.j) it.next());
                }
                S02 = AbstractC0465j.S0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return S02;
    }

    @Override // m5.h
    public void start() {
        g(((m5.n) this.f12265a).f11254i);
    }

    @Override // m5.h
    public void stop() {
        ((MediaPlayer) this.f12266b).stop();
    }

    public t0.j t(B0.j jVar) {
        t0.j jVar2;
        synchronized (this.f12265a) {
            jVar2 = (t0.j) ((LinkedHashMap) this.f12266b).remove(jVar);
        }
        return jVar2;
    }

    public t0.j u(B0.j jVar) {
        t0.j jVar2;
        synchronized (this.f12265a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f12266b;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new t0.j(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                jVar2 = (t0.j) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar2;
    }

    public int v(Context context, InterfaceC1276c interfaceC1276c) {
        o1.u.g(context);
        o1.u.g(interfaceC1276c);
        int f3 = interfaceC1276c.f();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f12265a;
        int i2 = sparseIntArray.get(f3, -1);
        if (i2 == -1) {
            i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= sparseIntArray.size()) {
                    i2 = -1;
                    break;
                }
                int keyAt = sparseIntArray.keyAt(i3);
                if (keyAt > f3 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            if (i2 == -1) {
                i2 = ((l1.g) this.f12266b).b(context, f3);
            }
            sparseIntArray.put(f3, i2);
        }
        return i2;
    }

    public e(Context context, int i2) {
        switch (i2) {
            case 7:
                this.f12266b = null;
                this.f12265a = context;
                break;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f12266b = Executors.newSingleThreadExecutor();
                this.f12265a = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new B.a(23, this), 0L, SessionListener.SECONDS_IN_A_DAY, TimeUnit.SECONDS);
                break;
        }
    }

    public e(l1.g gVar) {
        this.f12265a = new SparseIntArray();
        o1.u.g(gVar);
        this.f12266b = gVar;
    }

    public e() {
        this.f12265a = new Object();
        this.f12266b = new LinkedHashMap();
    }

    public e(t tVar, H2.b bVar) {
        this.f12266b = tVar;
        this.f12265a = bVar;
    }
}
