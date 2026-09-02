package Y;

import C0.k;
import C0.p;
import C0.r;
import D0.j;
import D0.n;
import P.m;
import Q.E;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import e0.InterfaceC0059a;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.impl.C0370l9;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.flutter.plugin.platform.h;
import io.flutter.plugin.platform.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p.AbstractC0819i;
import q.AbstractC0822b;
import s0.o;
import s0.t;
import s0.u;
import u0.C0840b;
import u0.C0845g;

/* loaded from: classes.dex */
public final class e implements j, D0.c, D0.d, InterfaceC0059a, h, u {

    /* renamed from: d, reason: collision with root package name */
    public static e f519d;

    /* renamed from: e, reason: collision with root package name */
    public static F0.a f520e;

    /* renamed from: f, reason: collision with root package name */
    public static e f521f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f522a;

    /* renamed from: b, reason: collision with root package name */
    public Object f523b;

    /* renamed from: c, reason: collision with root package name */
    public Object f524c;

    public /* synthetic */ e(int i2, Object obj, Object obj2) {
        this.f522a = i2;
        this.f524c = obj;
        this.f523b = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0090, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(e eVar, JSONArray jSONArray) {
        String str;
        eVar.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : AbstractC0819i.d(4)) {
                if (i5 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i5 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i5 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i5 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int c2 = AbstractC0819i.c(i5);
                    if (c2 == 0) {
                        i2 |= 1;
                    } else if (c2 == 1) {
                        i2 |= 4;
                    } else if (c2 == 2) {
                        i2 |= 2;
                    } else if (c2 == 3) {
                        i2 |= 8;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + string);
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i3 == 2) {
                    return 0;
                }
                if (i3 != 4) {
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList j(e eVar, JSONArray jSONArray) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (k kVar : k.values()) {
                if (kVar.f78a.equals(string)) {
                    int ordinal = kVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(k.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(k.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + string);
        }
        return arrayList;
    }

    public static int k(e eVar, String str) {
        String str2;
        eVar.getClass();
        for (int i2 : AbstractC0819i.d(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int c2 = AbstractC0819i.c(i2);
                if (c2 == 0) {
                    return 1;
                }
                if (c2 != 1) {
                    return c2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException("No such SystemUiMode: " + str);
    }

    public static C0.j l(e eVar, JSONObject jSONObject) {
        eVar.getClass();
        return new C0.j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? C0.g.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? C0.g.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap o(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    public static final SharedPreferences r(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void s(Context context) {
        if (r(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    @Override // io.flutter.plugin.platform.h
    public void a() {
        ((io.flutter.plugin.platform.j) this.f523b).a();
        ((i) this.f524c).a();
    }

    @Override // io.flutter.plugin.platform.h
    public void b(io.flutter.view.i iVar) {
        ((io.flutter.plugin.platform.j) this.f523b).f5885h.f5852a = iVar;
        ((i) this.f524c).f5869f.f5852a = iVar;
    }

    @Override // io.flutter.plugin.platform.h
    public boolean c(int i2) {
        ((i) this.f524c).g(i2);
        return ((io.flutter.plugin.platform.j) this.f523b).c(i2);
    }

    @Override // D0.j
    public void d(e eVar, p pVar) {
        C0.a aVar = (C0.a) this.f524c;
        if (((C0.b) aVar.f51b) == null) {
            pVar.c((Map) this.f523b);
            return;
        }
        String str = (String) eVar.f523b;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            pVar.b();
            return;
        }
        try {
            this.f523b = Collections.unmodifiableMap(((t) ((u[]) ((C0.b) aVar.f51b).f54b)[0]).f6591b);
        } catch (IllegalStateException e2) {
            pVar.a("error", e2.getMessage(), null);
        }
        pVar.c((Map) this.f523b);
    }

    @Override // D0.c
    public void e(Object obj) {
        switch (this.f522a) {
            case 5:
                C0.b bVar = (C0.b) this.f524c;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f54b;
                r rVar = (r) this.f523b;
                concurrentLinkedQueue.remove(rVar);
                if (!((ConcurrentLinkedQueue) bVar.f54b).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + rVar.f112a);
                    break;
                }
                break;
            default:
                ((C0845g) this.f523b).a(((D0.i) ((C0.t) ((e) this.f524c).f524c).f118c).encodeMessage(obj));
                break;
        }
    }

    @Override // s0.u
    public void f(KeyEvent keyEvent, E e2) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            e2.a(false);
            return;
        }
        Character a2 = ((h1.i) this.f524c).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        C0.e eVar = new C0.e(9, e2);
        C0.f fVar = (C0.f) this.f523b;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z2 ? "keyup" : "keydown");
        hashMap.put("keymap", ConstantDeviceInfo.APP_PLATFORM);
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a2.toString());
        hashMap.put(AdRevenueConstants.SOURCE_KEY, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        fVar.f60a.h(hashMap, new C0.e(0, eVar));
    }

    @Override // io.flutter.plugin.platform.h
    public void g(int i2) {
        ((i) this.f524c).g(i2);
        ((io.flutter.plugin.platform.j) this.f523b).g(i2);
    }

    @Override // D0.d
    public void h(ByteBuffer byteBuffer, C0845g c0845g) {
        switch (this.f522a) {
            case 8:
                C0.t tVar = (C0.t) this.f524c;
                try {
                    ((D0.b) this.f523b).a(((D0.i) tVar.f118c).decodeMessage(byteBuffer), new e(7, this, c0845g));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) tVar.f116a), "Failed to handle message", e2);
                    c0845g.a(null);
                    return;
                }
            default:
                C0.t tVar2 = (C0.t) this.f524c;
                try {
                    ((j) this.f523b).d(((D0.k) tVar2.f118c).c(byteBuffer), new p(1, this, c0845g));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + ((String) tVar2.f116a), "Failed to handle method call", e3);
                    c0845g.a(((D0.k) tVar2.f118c).e(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    public void m(Object obj, String str) {
        ((ArrayList) this.f523b).add(str + "=" + String.valueOf(obj));
    }

    public Object n(String str) {
        Object obj = this.f524c;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    @Override // e0.InterfaceC0059a
    public void onComplete(Task task) {
        ((Map) ((e) this.f524c).f524c).remove((e0.d) this.f523b);
    }

    public y p(String key, Class cls) {
        kotlin.jvm.internal.j.e(key, "key");
        throw null;
    }

    public void q(boolean z2, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f523b)) {
            hashMap = new HashMap((Map) this.f523b);
        }
        synchronized (((Map) this.f524c)) {
            hashMap2 = new HashMap((Map) this.f524c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((e0.d) entry2.getKey()).a(new O.d(status));
            }
        }
    }

    public String toString() {
        switch (this.f522a) {
            case 17:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f524c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f523b;
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

    public /* synthetic */ e(int i2, boolean z2) {
        this.f522a = i2;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i2, boolean z2) {
        this.f522a = i2;
        this.f523b = obj;
        this.f524c = obj2;
    }

    public e(int i2) {
        this.f522a = i2;
        switch (i2) {
            case 18:
                N.e eVar = N.e.f241d;
                this.f523b = new SparseIntArray();
                this.f524c = eVar;
                break;
            case 28:
                this.f523b = new LongSparseArray();
                this.f524c = new PriorityQueue();
                break;
            default:
                this.f523b = Collections.synchronizedMap(new WeakHashMap());
                this.f524c = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public e(Context context, int i2) {
        e eVar;
        this.f522a = i2;
        switch (i2) {
            case C0370l9.f4317C /* 19 */:
                this.f523b = new g(context, N.f.f243b);
                synchronized (e.class) {
                    try {
                        if (f519d == null) {
                            f519d = new e(context.getApplicationContext(), 0);
                        }
                        eVar = f519d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f524c = eVar;
                return;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f524c = Executors.newSingleThreadExecutor();
                this.f523b = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new m(4, this), 0L, 86400L, TimeUnit.SECONDS);
                return;
        }
    }

    public /* synthetic */ e(Object obj) {
        this.f522a = 17;
        this.f524c = obj;
        this.f523b = new ArrayList();
    }

    public e(String str, V.a aVar, N.i iVar) {
        this.f522a = 13;
        this.f524c = str;
        this.f523b = aVar;
    }

    public e(o oVar, C0.a aVar) {
        this.f522a = 11;
        this.f523b = oVar;
        this.f524c = aVar;
        aVar.f51b = new C0.a(22, this);
    }

    public e(C0.f fVar) {
        this.f522a = 27;
        this.f524c = new h1.i();
        this.f523b = fVar;
    }

    public e(C0.a aVar) {
        this.f522a = 1;
        this.f524c = aVar;
        this.f523b = new HashMap();
    }

    public e(o oVar, InputMethodManager inputMethodManager, C0.a aVar) {
        this.f522a = 23;
        if (Build.VERSION.SDK_INT >= 33) {
            oVar.setAutoHandwritingEnabled(false);
        }
        this.f524c = oVar;
        this.f523b = inputMethodManager;
        aVar.f51b = this;
    }

    public e(V.a store, z zVar, AbstractC0822b defaultCreationExtras) {
        this.f522a = 20;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.f523b = zVar;
        this.f524c = defaultCreationExtras;
    }

    public e(C0840b c0840b, int i2) {
        this.f522a = i2;
        switch (i2) {
            case 3:
                C0.a aVar = new C0.a(6, this);
                C0.t tVar = new C0.t(c0840b, "flutter/platform", D0.h.f166b, null);
                this.f523b = tVar;
                tVar.j(aVar);
                break;
            case 6:
                C0.a aVar2 = new C0.a(19, this);
                C0.t tVar2 = new C0.t(c0840b, "flutter/textinput", D0.h.f166b, null);
                this.f523b = tVar2;
                tVar2.j(aVar2);
                break;
            default:
                C0.a aVar3 = new C0.a(3, this);
                C0.t tVar3 = new C0.t(c0840b, "flutter/localization", D0.h.f166b, null);
                this.f523b = tVar3;
                tVar3.j(aVar3);
                break;
        }
    }

    public e(C0840b c0840b, PackageManager packageManager) {
        this.f522a = 4;
        C0.a aVar = new C0.a(11, this);
        this.f523b = packageManager;
        new C0.t(c0840b, "flutter/processtext", n.f167b, null).j(aVar);
    }
}
