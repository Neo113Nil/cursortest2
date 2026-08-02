package d6;

import A1.M0;
import A1.x0;
import C0.A;
import R5.F;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import c2.V;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zzan;
import e3.C1023h;
import e4.C1036j;
import f4.InterfaceC1090b;
import g4.C1142o;
import i0.C1234a;
import i0.C1241h;
import i3.C1263a;
import i4.C1266c;
import j2.InterfaceC1309f;
import j4.C1316b;
import j4.C1317c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.C1373k;
import l4.InterfaceC1390a;
import m1.C1427b;
import n4.C1471e;
import n4.C1473g;
import n4.C1479m;
import n4.G;
import n4.H;
import n4.I;
import n4.RunnableC1470d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.AbstractC1539a;
import q5.AbstractActivityC1559c;
import r4.AbstractC1575b;
import u2.C1643u;
import u2.InterfaceC1635l;
import u2.InterfaceC1636m;
import v2.AbstractC1664a;
import w1.AbstractC1706i0;
import w1.AbstractC1715k1;
import w1.C1759x1;
import w1.C1761y0;
import w1.L;
import w1.Z0;
import z5.EnumC1824f;

/* renamed from: d6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0977k implements Continuation, G, l4.u, InterfaceC1309f, InterfaceC1635l, B3.e, A5.q, A5.c {

    /* renamed from: d, reason: collision with root package name */
    public static C0977k f12439d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12440a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12441b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12442c;

    public /* synthetic */ C0977k(int i7, Object obj, Object obj2) {
        this.f12440a = i7;
        this.f12441b = obj;
        this.f12442c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(C0977k c0977k, JSONArray jSONArray) {
        String str;
        c0977k.getClass();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            String string = jSONArray.getString(i9);
            for (int i10 : t.e.f(4)) {
                if (i10 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i10 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i10 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i10 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int e7 = t.e.e(i10);
                    if (e7 == 0) {
                        i7 |= 1;
                    } else if (e7 == 1) {
                        i7 |= 4;
                    } else if (e7 == 2) {
                        i7 |= 2;
                    } else if (e7 == 3) {
                        i7 |= 8;
                    }
                    if (i8 == 0) {
                        i8 = i7;
                    }
                }
            }
            throw new NoSuchFieldException(L.i("No such DeviceOrientation: ", string));
        }
        if (i7 == 0) {
            return -1;
        }
        switch (i7) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i8 == 2) {
                    return 0;
                }
                if (i8 != 4) {
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

    public static ArrayList j(C0977k c0977k, JSONArray jSONArray) {
        c0977k.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            for (EnumC1824f enumC1824f : EnumC1824f.values()) {
                if (enumC1824f.f18466a.equals(string)) {
                    int ordinal = enumC1824f.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(EnumC1824f.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(EnumC1824f.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(L.i("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int k(C0977k c0977k, String str) {
        String str2;
        c0977k.getClass();
        for (int i7 : t.e.f(4)) {
            if (i7 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i7 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i7 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i7 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int e7 = t.e.e(i7);
                if (e7 == 0) {
                    return 1;
                }
                if (e7 != 1) {
                    return e7 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(L.i("No such SystemUiMode: ", str));
    }

    public static A l(C0977k c0977k, JSONObject jSONObject) {
        c0977k.getClass();
        return new A(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? L.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? L.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static void s(v4.r rVar, M0 m02) {
        if (!rVar.r()) {
            if (rVar.isEmpty()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (rVar instanceof v4.f) {
                ((v4.f) rVar).m(new v4.g(m02), true);
                return;
            } else {
                throw new IllegalStateException("Expected children node, but got: " + rVar);
            }
        }
        m02.c();
        m02.f118a = m02.f119b;
        ((StringBuilder) m02.f121d).append(((v4.n) rVar).j(2));
        m02.f120c = true;
        E4.y yVar = (E4.y) m02.f125h;
        yVar.getClass();
        if (((StringBuilder) m02.f121d).length() > yVar.f2247a) {
            if (m02.a(m02.f119b).isEmpty() || !m02.a(m02.f119b).A().equals(v4.c.f17171d)) {
                m02.b();
            }
        }
    }

    @Override // u2.InterfaceC1635l
    public InterfaceC1636m a() {
        return new C1643u((Context) this.f12441b, ((O1.f) this.f12442c).a());
    }

    @Override // l4.u
    public void b(String str, String str2) {
        C1266c c3 = C1479m.c(str, str2);
        H h6 = (H) this.f12441b;
        C1473g c1473g = h6.f15370b;
        C1479m c1479m = (C1479m) this.f12442c;
        C1479m.d(c1479m, "Persisted write", c1473g, c3);
        C1479m.e(c1479m, h6.f15369a, h6.f15370b, c3);
    }

    @Override // n4.G
    public void c(boolean z4, C0977k c0977k) {
        InterfaceC1090b interfaceC1090b = (InterfaceC1090b) ((AtomicReference) this.f12442c).get();
        if (interfaceC1090b == null) {
            c0977k.q(null);
        } else {
            FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1090b;
            firebaseAuth.h(firebaseAuth.f11854f, z4).addOnSuccessListener(new C1316b(c0977k, 1)).addOnFailureListener(new C1317c(c0977k, 1));
        }
    }

    @Override // j2.InterfaceC1309f
    public int d(long j) {
        int i7;
        Long valueOf = Long.valueOf(j);
        int i8 = v2.t.f17153a;
        ArrayList arrayList = (ArrayList) this.f12442c;
        int binarySearch = Collections.binarySearch(arrayList, valueOf);
        if (binarySearch < 0) {
            i7 = ~binarySearch;
        } else {
            int size = arrayList.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
            i7 = binarySearch;
        }
        if (i7 < arrayList.size()) {
            return i7;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e() {
        FileInputStream fileInputStream;
        Throwable th;
        boolean z4;
        Object obj = null;
        File file = (File) this.f12441b;
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            file.getName();
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    obj = ((C1761y0) this.f12442c).h(fileInputStream);
                    AbstractC1706i0.h(fileInputStream);
                    z4 = false;
                } catch (Exception e7) {
                    e = e7;
                    file.getName();
                    Log.getStackTraceString(e);
                    AbstractC1706i0.h(fileInputStream);
                    z4 = true;
                    if (z4) {
                    }
                    return obj;
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC1706i0.h(fileInputStream);
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            AbstractC1706i0.h(fileInputStream);
            throw th;
        }
        if (z4) {
            file.getName();
            file.delete();
        }
        return obj;
    }

    @Override // A5.c
    public void f(Object obj) {
        C1759x1 c1759x1 = (C1759x1) this.f12442c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c1759x1.f17925b;
        z5.k kVar = (z5.k) this.f12441b;
        concurrentLinkedQueue.remove(kVar);
        if (((ConcurrentLinkedQueue) c1759x1.f17925b).isEmpty()) {
            return;
        }
        Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(kVar.f18496a));
    }

    public void g(Object obj) {
        File file = (File) this.f12441b;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (!AbstractC1715k1.g(file)) {
                    throw new IOException("Cannot create parent directory!");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    ((C1761y0) this.f12442c).s(obj, fileOutputStream2);
                    AbstractC1706i0.h(fileOutputStream2);
                } catch (Exception e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    file.getName();
                    Log.getStackTraceString(e);
                    AbstractC1706i0.h(fileOutputStream);
                    file.getName();
                    file.delete();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    AbstractC1706i0.h(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    @Override // j2.InterfaceC1309f
    public long h(int i7) {
        AbstractC1664a.f(i7 >= 0);
        ArrayList arrayList = (ArrayList) this.f12442c;
        AbstractC1664a.f(i7 < arrayList.size());
        return ((Long) arrayList.get(i7)).longValue();
    }

    @Override // j2.InterfaceC1309f
    public List m(long j) {
        int d7 = v2.t.d((ArrayList) this.f12442c, Long.valueOf(j), false);
        return d7 == -1 ? Collections.emptyList() : (List) ((ArrayList) this.f12441b).get(d7);
    }

    public ArrayList n(String str) {
        D0.k c3 = D0.k.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c3.e(1);
        } else {
            c3.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12441b;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            ArrayList arrayList = new ArrayList(g3.getCount());
            while (g3.moveToNext()) {
                arrayList.add(g3.getString(0));
            }
            return arrayList;
        } finally {
            g3.close();
            c3.g();
        }
    }

    public Task o(Object obj, v4.r rVar) {
        C1473g c1473g = (C1473g) this.f12442c;
        q4.l.f(c1473g);
        new I(c1473g).g(obj);
        Object a2 = AbstractC1575b.a(obj);
        q4.l.e(a2);
        v4.r a4 = AbstractC1539a.a(a2, rVar);
        q4.e h6 = q4.k.h();
        ((C1479m) this.f12441b).q(new H2.q(20, this, a4, h6, false));
        return (Task) h6.f15857a;
    }

    @Override // B3.e
    public void onConsentInfoUpdateSuccess() {
        zzj zzjVar = (zzj) this.f12441b;
        boolean isConsentFormAvailable = zzjVar.isConsentFormAvailable();
        y1.a aVar = (y1.a) this.f12442c;
        try {
            if (isConsentFormAvailable) {
                AbstractActivityC1559c abstractActivityC1559c = aVar.f18127a;
                zza.zza(abstractActivityC1559c).zzc().zzb(new com.google.android.gms.common.internal.w(25, (Object) aVar, (Object) zzjVar, false), new u1.c(aVar, 29));
                aVar.f18129c.success(Boolean.TRUE);
            } else {
                Boolean bool = Boolean.FALSE;
                aVar.getClass();
                aVar.f18129c.success(bool);
            }
        } catch (Exception unused) {
        }
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        C1023h c1023h = (C1023h) this.f12442c;
        if (((q5.u) c1023h.f12667a) == null) {
            ((A5.p) rVar).success((Map) this.f12441b);
            return;
        }
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((A5.p) rVar).notImplemented();
            return;
        }
        try {
            this.f12441b = Collections.unmodifiableMap(((q5.r) ((q5.u) c1023h.f12667a).f15954a[0]).f15951b);
        } catch (IllegalStateException e7) {
            ((A5.p) rVar).error("error", e7.getMessage(), null);
        }
        ((A5.p) rVar).success((Map) this.f12441b);
    }

    @Override // j2.InterfaceC1309f
    public int p() {
        return ((ArrayList) this.f12442c).size();
    }

    public void q(String str) {
        ((L4.b) this.f12441b).execute(new RunnableC1470d((InterfaceC1390a) this.f12442c, str, 0));
    }

    public MotionEvent r(q5.y yVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j;
        while (true) {
            priorityQueue = (PriorityQueue) this.f12442c;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f12441b;
            j = yVar.f15964a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j);
        longSparseArray.remove(j);
        return motionEvent;
    }

    public F1.v t(int i7) {
        int i8 = 0;
        while (true) {
            int[] iArr = (int[]) this.f12441b;
            if (i8 >= iArr.length) {
                Log.e("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new F1.j();
            }
            if (i7 == iArr[i8]) {
                return ((V[]) this.f12442c)[i8];
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C1036j c1036j = (C1036j) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) ((FirebaseUser) this.f12442c)).f11910c));
        String str = c1036j.f12681a;
        D.i(str);
        ActionCodeSettings actionCodeSettings = (ActionCodeSettings) this.f12441b;
        firebaseAuth.getClass();
        D.e(str);
        String str2 = firebaseAuth.f11857i;
        if (str2 != null) {
            actionCodeSettings.f11839y = str2;
        }
        return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, actionCodeSettings, str);
    }

    public String toString() {
        switch (this.f12440a) {
            case 16:
                String str = "[ ";
                if (((t.f) this.f12441b) != null) {
                    for (int i7 = 0; i7 < 9; i7++) {
                        StringBuilder c3 = t.e.c(str);
                        c3.append(((t.f) this.f12441b).f16259y[i7]);
                        c3.append(" ");
                        str = c3.toString();
                    }
                }
                StringBuilder d7 = t.e.d(str, "] ");
                d7.append((t.f) this.f12441b);
                return d7.toString();
            default:
                return super.toString();
        }
    }

    public zzad u(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzaf a2;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z4 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add(zzz.j(jSONArray3.getString(i7)));
            }
            zzad zzadVar = new zzad(Y3.i.f(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzagl zzb = zzagl.zzb(string);
                D.i(zzb);
                zzadVar.f11908a = zzb;
            }
            if (!z4) {
                zzadVar.f11915y = Boolean.FALSE;
            }
            zzadVar.f11914x = str;
            if (jSONObject.has("userMetadata") && (a2 = zzaf.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzadVar.f11916z = a2;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i8));
                    String optString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(optString) ? PhoneMultiFactorInfo.n(jSONObject2) : Objects.equals(optString, "totp") ? TotpMultiFactorInfo.n(jSONObject2) : null);
                }
                zzadVar.o(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    arrayList3.add(zzan.k(new JSONObject(jSONArray.getString(i9))));
                }
                zzadVar.f11907D = arrayList3;
            }
            return zzadVar;
        } catch (zzzh e7) {
            e = e7;
            Log.wtf(((C1263a) this.f12442c).f13980a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e8) {
            e = e8;
            Log.wtf(((C1263a) this.f12442c).f13980a, e);
            return null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            Log.wtf(((C1263a) this.f12442c).f13980a, e);
            return null;
        } catch (JSONException e10) {
            e = e10;
            Log.wtf(((C1263a) this.f12442c).f13980a, e);
            return null;
        }
    }

    public /* synthetic */ C0977k(int i7, Object obj, Object obj2, boolean z4) {
        this.f12440a = i7;
        this.f12441b = obj2;
        this.f12442c = obj;
    }

    public /* synthetic */ C0977k(int i7, boolean z4) {
        this.f12440a = i7;
    }

    public C0977k(WorkDatabase_Impl workDatabase_Impl, int i7) {
        this.f12440a = i7;
        switch (i7) {
            case 8:
                this.f12441b = workDatabase_Impl;
                this.f12442c = new C1427b(workDatabase_Impl, 3);
                break;
            default:
                this.f12441b = workDatabase_Impl;
                this.f12442c = new C1427b(workDatabase_Impl, 0);
                break;
        }
    }

    public C0977k(File file, String str, int i7, Z0 z02) {
        this.f12440a = 20;
        this.f12441b = file;
        this.f12442c = new C1761y0(new B1.m(str, i7, z02, 13), 23);
    }

    public C0977k(C1023h c1023h) {
        this.f12440a = 23;
        this.f12442c = c1023h;
        this.f12441b = new HashMap();
    }

    public C0977k(List list, List list2) {
        this.f12440a = 18;
        if (list.size() == list2.size() - 1) {
            this.f12441b = list;
            this.f12442c = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public C0977k(C1142o c1142o) {
        this.f12440a = 6;
        this.f12441b = c1142o;
        this.f12442c = new AtomicReference();
        c1142o.a(new F(this, 16));
    }

    public C0977k(C1471e c1471e) {
        this.f12440a = 15;
        this.f12441b = c1471e.f15401b;
        this.f12442c = c1471e.c("EventRaiser");
    }

    public C0977k(t.d dVar) {
        this.f12440a = 16;
        this.f12442c = dVar;
    }

    public C0977k(Context context, O1.f fVar) {
        this.f12440a = 17;
        this.f12441b = context.getApplicationContext();
        this.f12442c = fVar;
    }

    public C0977k(C1373k c1373k, int i7) {
        this.f12440a = i7;
        switch (i7) {
            case 25:
                x0 x0Var = new x0(this, 24);
                A5.s sVar = new A5.s(c1373k, "flutter/platform_views", A5.y.f688b, null);
                this.f12441b = sVar;
                sVar.b(x0Var);
                break;
            default:
                R4.c cVar = new R4.c(this, 28);
                A5.s sVar2 = new A5.s(c1373k, "flutter/platform", A5.m.f675a, null);
                this.f12441b = sVar2;
                sVar2.b(cVar);
                break;
        }
    }

    public C0977k(EditText editText) {
        this.f12440a = 4;
        this.f12441b = editText;
        C1241h c1241h = new C1241h(editText);
        this.f12442c = c1241h;
        editText.addTextChangedListener(c1241h);
        if (C1234a.f13811b == null) {
            synchronized (C1234a.f13810a) {
                try {
                    if (C1234a.f13811b == null) {
                        C1234a c1234a = new C1234a();
                        try {
                            C1234a.f13812c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1234a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C1234a.f13811b = c1234a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C1234a.f13811b);
    }

    public C0977k(int i7) {
        this.f12440a = i7;
        switch (i7) {
            case 14:
                this.f12441b = new LongSparseArray();
                this.f12442c = new PriorityQueue();
                break;
            default:
                this.f12441b = new AtomicLong();
                this.f12442c = new AtomicLong();
                break;
        }
    }
}
