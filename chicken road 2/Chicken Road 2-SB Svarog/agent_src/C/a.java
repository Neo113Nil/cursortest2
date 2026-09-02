package C;

import F.AbstractC0010k;
import F.D;
import F.E;
import F.F;
import F.H;
import F.J;
import F.t;
import O.f;
import O.g;
import O.k;
import O.l;
import O.n;
import P.j;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.h;
import io.flutter.view.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import o.AbstractC0071c;
import org.json.JSONArray;
import org.json.JSONObject;
import w.C0093b;

/* loaded from: classes.dex */
public final class a implements H, j, P.c, P.d, h, k, w.h {

    /* renamed from: e, reason: collision with root package name */
    public static a f1e;

    /* renamed from: f, reason: collision with root package name */
    public static J f2f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5d;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f3b = i2;
        this.f4c = obj;
        this.f5d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int t(a aVar, JSONArray jSONArray) {
        String str;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : AbstractC0071c.b(4)) {
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
                    int a2 = AbstractC0071c.a(i5);
                    if (a2 == 0) {
                        i2 |= 1;
                    } else if (a2 == 1) {
                        i2 |= 4;
                    } else if (a2 == 2) {
                        i2 |= 2;
                    } else if (a2 == 3) {
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
                    return i3 != 8 ? 1 : 8;
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

    public static ArrayList u(a aVar, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (g gVar : g.values()) {
                if (gVar.f301b.equals(string)) {
                    int ordinal = gVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(g.f298c);
                    } else if (ordinal == 1) {
                        arrayList.add(g.f299d);
                    }
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + string);
        }
        return arrayList;
    }

    public static int v(a aVar, String str) {
        String str2;
        for (int i2 : AbstractC0071c.b(4)) {
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
                int a2 = AbstractC0071c.a(i2);
                if (a2 == 0) {
                    return 1;
                }
                if (a2 != 1) {
                    return a2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException("No such SystemUiMode: " + str);
    }

    public static f w(a aVar, JSONObject jSONObject) {
        return new f(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? AbstractC0010k.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : AbstractC0010k.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap x(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    @Override // O.k
    public void a(int i2) {
        ((io.flutter.plugin.platform.j) this.f5d).r(i2);
        ((io.flutter.plugin.platform.k) this.f4c).v.a(i2);
    }

    @Override // F.H
    public void b(KeyEvent keyEvent, F f2) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            f2.a(false);
            return;
        }
        Character a2 = ((E) this.f5d).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        O.c cVar = (O.c) this.f4c;
        D.b bVar = new D.b(f2);
        e eVar = cVar.f284a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z2 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a2.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        eVar.g(hashMap, new D.b(bVar));
    }

    @Override // io.flutter.plugin.platform.h
    public void c() {
        ((io.flutter.plugin.platform.k) this.f4c).c();
        ((io.flutter.plugin.platform.j) this.f5d).c();
    }

    @Override // O.k
    public void d(boolean z2) {
        ((io.flutter.plugin.platform.k) ((io.flutter.plugin.platform.k) this.f4c).v.f114c).f706r = z2;
    }

    @Override // io.flutter.plugin.platform.h
    public void e(i iVar) {
        ((io.flutter.plugin.platform.k) this.f4c).f697i.f662a = iVar;
        ((io.flutter.plugin.platform.j) this.f5d).f681g.f662a = iVar;
    }

    @Override // O.k
    public long f(O.h hVar) {
        ((io.flutter.plugin.platform.k) this.f4c).v.f(hVar);
        throw null;
    }

    @Override // O.k
    public void g(int i2, double d2, double d3) {
        ((io.flutter.plugin.platform.j) this.f5d).r(i2);
        ((io.flutter.plugin.platform.k) this.f4c).v.g(i2, d2, d3);
    }

    @Override // O.k
    public void h(int i2, int i3) {
        ((io.flutter.plugin.platform.j) this.f5d).r(i2);
        ((io.flutter.plugin.platform.k) this.f4c).v.h(i2, i3);
    }

    @Override // P.d
    public void i(ByteBuffer byteBuffer, H.g gVar) {
        switch (this.f3b) {
            case 11:
                e eVar = (e) this.f5d;
                try {
                    ((P.b) this.f4c).e(((P.i) eVar.f10c).a(byteBuffer), new a(this, gVar, 10, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f9b), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                E.b bVar = (E.b) this.f5d;
                P.k kVar = (P.k) bVar.f20c;
                try {
                    ((j) this.f4c).o(kVar.d(byteBuffer), new l(1, this, gVar));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + ((String) bVar.f19b), "Failed to handle method call", e3);
                    gVar.a(kVar.g(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // io.flutter.plugin.platform.h
    public boolean j(int i2) {
        ((io.flutter.plugin.platform.j) this.f5d).r(i2);
        return ((io.flutter.plugin.platform.k) this.f4c).j(i2);
    }

    @Override // O.k
    public void k(O.h hVar) {
        ((io.flutter.plugin.platform.k) this.f4c).v.k(hVar);
        throw null;
    }

    @Override // O.k
    public void l(int i2) {
        ((io.flutter.plugin.platform.j) this.f5d).r(i2);
        ((io.flutter.plugin.platform.k) this.f4c).v.l(i2);
    }

    @Override // P.c
    public void m(Object obj) {
        switch (this.f3b) {
            case 8:
                E.b bVar = (E.b) this.f5d;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f18a;
                n nVar = (n) this.f4c;
                concurrentLinkedQueue.remove(nVar);
                if (!((ConcurrentLinkedQueue) bVar.f18a).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + nVar.f334a);
                    break;
                }
                break;
            default:
                ((H.g) this.f4c).a(((P.i) ((e) ((a) this.f5d).f5d).f10c).b(obj));
                break;
        }
    }

    @Override // O.k
    public void n(O.h hVar) {
        G.k kVar = ((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.j) this.f5d).f689o.f675c).f676b;
        String str = hVar.f303b;
        if (kVar.f215a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    @Override // P.j
    public void o(a aVar, l lVar) {
        t tVar = (t) this.f5d;
        if (((E.b) tVar.f114c) == null) {
            lVar.d((Map) this.f4c);
            return;
        }
        String str = (String) aVar.f4c;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            lVar.b();
            return;
        }
        try {
            this.f4c = Collections.unmodifiableMap(((D) ((H[]) ((E.b) tVar.f114c).f18a)[0]).f35c);
        } catch (IllegalStateException e2) {
            lVar.a("error", e2.getMessage(), null);
        }
        lVar.d((Map) this.f4c);
    }

    @Override // O.k
    public void p(O.j jVar, G.l lVar) {
        ((io.flutter.plugin.platform.j) this.f5d).r(jVar.f321a);
        ((io.flutter.plugin.platform.k) this.f4c).v.p(jVar, lVar);
    }

    @Override // O.k
    public void q(O.i iVar) {
        ((io.flutter.plugin.platform.j) this.f5d).r(iVar.f305a);
        ((io.flutter.plugin.platform.k) this.f4c).v.q(iVar);
    }

    @Override // io.flutter.plugin.platform.h
    public void r(int i2) {
        ((io.flutter.plugin.platform.j) this.f5d).r(i2);
        ((io.flutter.plugin.platform.k) this.f4c).r(i2);
    }

    @Override // O.k
    public boolean s() {
        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) this.f5d).f679e;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    public /* synthetic */ a(int i2, boolean z2) {
        this.f3b = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, boolean z2) {
        this.f3b = i2;
        this.f5d = obj;
        this.f4c = obj2;
    }

    public a(R.a aVar, t tVar) {
        this.f3b = 14;
        this.f4c = aVar;
        this.f5d = tVar;
        tVar.f114c = new t(25, this);
    }

    public a(O.c cVar) {
        this.f3b = 1;
        this.f5d = new E();
        this.f4c = cVar;
    }

    public a(t tVar) {
        this.f3b = 4;
        this.f5d = tVar;
        this.f4c = new HashMap();
    }

    public a(View view, InputMethodManager inputMethodManager, t tVar) {
        this.f3b = 16;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f5d = view;
        this.f4c = inputMethodManager;
        tVar.f114c = this;
    }

    public a(C0093b c0093b) {
        this.f3b = 19;
        a aVar = new a(18);
        this.f4c = c0093b;
        this.f5d = aVar;
    }

    public a(int i2) {
        this.f3b = i2;
        switch (i2) {
            case 18:
                this.f4c = new ReentrantLock();
                this.f5d = new LinkedHashMap();
                break;
            default:
                this.f4c = new LongSparseArray();
                this.f5d = new PriorityQueue();
                break;
        }
    }

    public a(H.b bVar, int i2) {
        this.f3b = i2;
        switch (i2) {
            case 6:
                t tVar = new t(10, this);
                E.b bVar2 = new E.b(bVar, "flutter/platform", P.h.f365b);
                this.f4c = bVar2;
                bVar2.h(tVar);
                break;
            case 9:
                t tVar2 = new t(23, this);
                E.b bVar3 = new E.b(bVar, "flutter/textinput", P.h.f365b);
                this.f4c = bVar3;
                bVar3.h(tVar2);
                break;
            default:
                t tVar3 = new t(7, this);
                E.b bVar4 = new E.b(bVar, "flutter/localization", P.h.f365b);
                this.f4c = bVar4;
                bVar4.h(tVar3);
                break;
        }
    }

    public a(H.b bVar, PackageManager packageManager) {
        this.f3b = 7;
        t tVar = new t(15, this);
        this.f4c = packageManager;
        new E.b(bVar, "flutter/processtext", P.n.f369a).h(tVar);
    }
}
