package p028d6;

import A1.M0;
import A1.x0;
import A5.c;
import A5.o;
import A5.p;
import A5.q;
import A5.s;
import B1.m;
import B3.e;
import C0.A;
import E4.y;
import F1.j;
import F1.v;
import R5.F;
import Y3.i;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.w;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p018c2.V;
import p033e3.h;
import p042f4.InterfaceC0893b;
import p068j2.f;
import p069j4.b;
import p083l4.u;
import p098n4.C0932e;
import p098n4.C0934g;
import p098n4.C0940m;
import p098n4.G;
import p098n4.H;
import p098n4.I;
import p098n4.RunnableC0931d;
import p120q4.l;
import p136t.d;
import p146u2.C0961u;
import p146u2.InterfaceC0953l;
import p146u2.InterfaceC0954m;
import p151v2.a;
import p151v2.t;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC1006k1;
import p155w1.C1050x1;
import p155w1.C1052y0;
import p155w1.L;
import p155w1.Z0;
import v4.g;
import v4.n;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Continuation, G, u, f, InterfaceC0953l, e, q, c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f12445d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12448c;

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.f12446a = i7;
        this.f12447b = obj;
        this.f12448c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(k kVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i7;
        String str;
        kVar.getClass();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            int[] iArrF = p136t.e.f(4);
            int length = iArrF.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    throw new NoSuchFieldException(L.i("No such DeviceOrientation: ", string));
                }
                i7 = iArrF[i11];
                if (i7 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i7 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i7 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i7 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    break;
                }
                i11++;
            }
            int iE = p136t.e.e(i7);
            if (iE == 0) {
                i8 |= 1;
            } else if (iE == 1) {
                i8 |= 4;
            } else if (iE == 2) {
                i8 |= 2;
            } else if (iE == 3) {
                i8 |= 8;
            }
            if (i9 == 0) {
                i9 = i8;
            }
        }
        if (i8 == 0) {
            return -1;
        }
        switch (i8) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i9 == 2) {
                    return 0;
                }
                if (i9 != 4) {
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

    public static ArrayList j(k kVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        p174z5.f fVar;
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            p174z5.f[] fVarArrValues = p174z5.f.values();
            int length = fVarArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    throw new NoSuchFieldException(L.i("No such SystemUiOverlay: ", string));
                }
                fVar = fVarArrValues[i8];
                if (fVar.f18472a.equals(string)) {
                    break;
                }
                i8++;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                arrayList.add(p174z5.f.TOP_OVERLAYS);
            } else if (iOrdinal == 1) {
                arrayList.add(p174z5.f.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static int k(k kVar, String str) {
        String str2;
        kVar.getClass();
        for (int i7 : p136t.e.f(4)) {
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
                int iE = p136t.e.e(i7);
                if (iE == 0) {
                    return 1;
                }
                if (iE != 1) {
                    return iE != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(L.i("No such SystemUiMode: ", str));
    }

    public static A l(k kVar, JSONObject jSONObject) {
        kVar.getClass();
        return new A(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? L.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? L.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static void s(r rVar, M0 m7) {
        if (!rVar.r()) {
            if (rVar.isEmpty()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (rVar instanceof v4.f) {
                ((v4.f) rVar).m(new g(m7), true);
                return;
            } else {
                throw new IllegalStateException("Expected children node, but got: " + rVar);
            }
        }
        m7.c();
        m7.f118a = m7.f119b;
        ((StringBuilder) m7.f121d).append(((n) rVar).j(2));
        m7.f120c = true;
        y yVar = (y) m7.f125h;
        yVar.getClass();
        if (((StringBuilder) m7.f121d).length() > yVar.f2247a) {
            if (m7.a(m7.f119b).isEmpty() || !m7.a(m7.f119b).A().equals(v4.c.f17177d)) {
                m7.b();
            }
        }
    }

    @Override // p146u2.InterfaceC0953l
    public InterfaceC0954m a() {
        return new C0961u((Context) this.f12447b, ((O1.f) this.f12448c).a());
    }

    @Override // p083l4.u
    public void b(String str, String str2) {
        p063i4.c cVarC = C0940m.c(str, str2);
        H h6 = (H) this.f12447b;
        C0934g c0934g = h6.f15376b;
        C0940m c0940m = (C0940m) this.f12448c;
        C0940m.d(c0940m, "Persisted write", c0934g, cVarC);
        C0940m.e(c0940m, h6.f15375a, h6.f15376b, cVarC);
    }

    @Override // p098n4.G
    public void c(boolean z4, k kVar) {
        InterfaceC0893b interfaceC0893b = (InterfaceC0893b) ((AtomicReference) this.f12448c).get();
        if (interfaceC0893b == null) {
            kVar.q(null);
        } else {
            FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0893b;
            firebaseAuth.h(firebaseAuth.f11854f, z4).addOnSuccessListener(new b(kVar, 1)).addOnFailureListener(new p069j4.c(kVar, 1));
        }
    }

    @Override // p068j2.f
    public int d(long j) {
        int i7;
        Long lValueOf = Long.valueOf(j);
        int i8 = t.f17159a;
        ArrayList arrayList = (ArrayList) this.f12448c;
        int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
        if (iBinarySearch < 0) {
            i7 = ~iBinarySearch;
        } else {
            int size = arrayList.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i7 = iBinarySearch;
        }
        if (i7 < arrayList.size()) {
            return i7;
        }
        return -1;
    }

    public Object e() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        boolean z4;
        Object objH = null;
        File file = (File) this.f12447b;
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
                    objH = ((C1052y0) this.f12448c).h(fileInputStream);
                    AbstractC0997i0.h(fileInputStream);
                    z4 = false;
                } catch (Exception e7) {
                    e = e7;
                    file.getName();
                    Log.getStackTraceString(e);
                    AbstractC0997i0.h(fileInputStream);
                    z4 = true;
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC0997i0.h(fileInputStream);
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            AbstractC0997i0.h(fileInputStream);
            throw th;
        }
        if (z4) {
            file.getName();
            file.delete();
        }
        return objH;
    }

    @Override // A5.c
    public void f(Object obj) {
        C1050x1 c1050x1 = (C1050x1) this.f12448c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c1050x1.f17931b;
        p174z5.k kVar = (p174z5.k) this.f12447b;
        concurrentLinkedQueue.remove(kVar);
        if (((ConcurrentLinkedQueue) c1050x1.f17931b).isEmpty()) {
            return;
        }
        Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(kVar.f18502a));
    }

    public void g(Object obj) {
        File file = (File) this.f12447b;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (!AbstractC1006k1.g(file)) {
                    throw new IOException("Cannot create parent directory!");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    ((C1052y0) this.f12448c).s(obj, fileOutputStream2);
                    AbstractC0997i0.h(fileOutputStream2);
                } catch (Exception e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    file.getName();
                    Log.getStackTraceString(e);
                    AbstractC0997i0.h(fileOutputStream);
                    file.getName();
                    file.delete();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    AbstractC0997i0.h(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    @Override // p068j2.f
    public long h(int i7) {
        a.f(i7 >= 0);
        ArrayList arrayList = (ArrayList) this.f12448c;
        a.f(i7 < arrayList.size());
        return ((Long) arrayList.get(i7)).longValue();
    }

    @Override // p068j2.f
    public List m(long j) {
        int iD = t.d((ArrayList) this.f12448c, Long.valueOf(j), false);
        return iD == -1 ? Collections.emptyList() : (List) ((ArrayList) this.f12447b).get(iD);
    }

    public ArrayList n(String str) {
        D0.k kVarC = D0.k.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            kVarC.e(1);
        } else {
            kVarC.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12447b;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            kVarC.g();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            kVarC.g();
            throw th;
        }
    }

    public Task o(Object obj, r rVar) {
        C0934g c0934g = (C0934g) this.f12448c;
        l.f(c0934g);
        new I(c0934g).g(obj);
        Object objA = p127r4.b.a(obj);
        l.e(objA);
        r rVarA = p115p6.a.a(objA, rVar);
        p120q4.e eVarH = p120q4.k.h();
        ((C0940m) this.f12447b).q(new H2.q(20, this, rVarA, eVarH, false));
        return (Task) eVarH.f15863a;
    }

    @Override // B3.e
    public void onConsentInfoUpdateSuccess() {
        zzj zzjVar = (zzj) this.f12447b;
        boolean zIsConsentFormAvailable = zzjVar.isConsentFormAvailable();
        y1.a aVar = (y1.a) this.f12448c;
        try {
            if (zIsConsentFormAvailable) {
                p121q5.c cVar = aVar.f18133a;
                zza.zza(cVar).zzc().zzb(new w(25, (Object) aVar, (Object) zzjVar, false), new p145u1.c(aVar, 29));
                aVar.f18135c.success(Boolean.TRUE);
            } else {
                Boolean bool = Boolean.FALSE;
                aVar.getClass();
                aVar.f18135c.success(bool);
            }
        } catch (Exception unused) {
        }
    }

    @Override // A5.q
    public void onMethodCall(o oVar, A5.r rVar) {
        h hVar = (h) this.f12448c;
        if (((p121q5.u) hVar.f12673a) == null) {
            ((p) rVar).success((Map) this.f12447b);
            return;
        }
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((p) rVar).notImplemented();
            return;
        }
        try {
            this.f12447b = Collections.unmodifiableMap(((p121q5.r) ((p121q5.u) hVar.f12673a).f15960a[0]).f15957b);
        } catch (IllegalStateException e7) {
            ((p) rVar).error("error", e7.getMessage(), null);
        }
        ((p) rVar).success((Map) this.f12447b);
    }

    @Override // p068j2.f
    public int p() {
        return ((ArrayList) this.f12448c).size();
    }

    public void q(String str) {
        ((L4.b) this.f12447b).execute(new RunnableC0931d((p083l4.a) this.f12448c, str, 0));
    }

    public MotionEvent r(p121q5.y yVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j;
        while (true) {
            priorityQueue = (PriorityQueue) this.f12448c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f12447b;
            j = yVar.f15970a;
            if (zIsEmpty || ((Long) priorityQueue.peek()).longValue() >= j) {
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

    public v t(int i7) {
        int i8 = 0;
        while (true) {
            int[] iArr = (int[]) this.f12447b;
            if (i8 >= iArr.length) {
                Log.e("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new j();
            }
            if (i7 == iArr[i8]) {
                return ((V[]) this.f12448c)[i8];
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        p034e4.j jVar = (p034e4.j) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(i.f(((zzad) ((FirebaseUser) this.f12448c)).f11910c));
        String str = jVar.f12687a;
        D.i(str);
        ActionCodeSettings actionCodeSettings = (ActionCodeSettings) this.f12447b;
        firebaseAuth.getClass();
        D.e(str);
        String str2 = firebaseAuth.f11857i;
        if (str2 != null) {
            actionCodeSettings.f11839y = str2;
        }
        return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, actionCodeSettings, str);
    }

    public String toString() {
        switch (this.f12446a) {
            case 16:
                String string = "[ ";
                if (((p136t.f) this.f12447b) != null) {
                    for (int i7 = 0; i7 < 9; i7++) {
                        StringBuilder sbC = p136t.e.c(string);
                        sbC.append(((p136t.f) this.f12447b).f16265y[i7]);
                        sbC.append(" ");
                        string = sbC.toString();
                    }
                }
                StringBuilder sbD = p136t.e.d(string, "] ");
                sbD.append((p136t.f) this.f12447b);
                return sbD.toString();
            default:
                return super.toString();
        }
    }

    public zzad u(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzaf zzafVarA;
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
            zzad zzadVar = new zzad(i.f(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzagl zzaglVarZzb = zzagl.zzb(string);
                D.i(zzaglVarZzb);
                zzadVar.f11908a = zzaglVarZzb;
            }
            if (!z4) {
                zzadVar.f11915y = Boolean.FALSE;
            }
            zzadVar.f11914x = str;
            if (jSONObject.has("userMetadata") && (zzafVarA = zzaf.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzadVar.f11916z = zzafVarA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i8));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? PhoneMultiFactorInfo.n(jSONObject2) : Objects.equals(strOptString, "totp") ? TotpMultiFactorInfo.n(jSONObject2) : null);
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
            Log.wtf(((p062i3.a) this.f12448c).f13986a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e8) {
            e = e8;
            Log.wtf(((p062i3.a) this.f12448c).f13986a, e);
            return null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            Log.wtf(((p062i3.a) this.f12448c).f13986a, e);
            return null;
        } catch (JSONException e10) {
            e = e10;
            Log.wtf(((p062i3.a) this.f12448c).f13986a, e);
            return null;
        }
    }

    public /* synthetic */ k(int i7, Object obj, Object obj2, boolean z4) {
        this.f12446a = i7;
        this.f12447b = obj2;
        this.f12448c = obj;
    }

    public /* synthetic */ k(int i7, boolean z4) {
        this.f12446a = i7;
    }

    public k(WorkDatabase_Impl workDatabase_Impl, int i7) {
        this.f12446a = i7;
        switch (i7) {
            case 8:
                this.f12447b = workDatabase_Impl;
                this.f12448c = new p088m1.b(workDatabase_Impl, 3);
                break;
            default:
                this.f12447b = workDatabase_Impl;
                this.f12448c = new p088m1.b(workDatabase_Impl, 0);
                break;
        }
    }

    public k(File file, String str, int i7, Z0 z4) {
        this.f12446a = 20;
        this.f12447b = file;
        this.f12448c = new C1052y0(new m(str, i7, z4, 13), 23);
    }

    public k(h hVar) {
        this.f12446a = 23;
        this.f12448c = hVar;
        this.f12447b = new HashMap();
    }

    public k(List list, List list2) {
        this.f12446a = 18;
        if (list.size() == list2.size() - 1) {
            this.f12447b = list;
            this.f12448c = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public k(p048g4.o oVar) {
        this.f12446a = 6;
        this.f12447b = oVar;
        this.f12448c = new AtomicReference();
        oVar.a(new F(this, 16));
    }

    public k(C0932e c0932e) {
        this.f12446a = 15;
        this.f12447b = c0932e.f15407b;
        this.f12448c = c0932e.c("EventRaiser");
    }

    public k(d dVar) {
        this.f12446a = 16;
        this.f12448c = dVar;
    }

    public k(Context context, O1.f fVar) {
        this.f12446a = 17;
        this.f12447b = context.getApplicationContext();
        this.f12448c = fVar;
    }

    public k(p078l.k kVar, int i7) {
        this.f12446a = i7;
        switch (i7) {
            case 25:
                x0 x0Var = new x0(this, 24);
                s sVar = new s(kVar, "flutter/platform_views", A5.y.f688b, null);
                this.f12447b = sVar;
                sVar.b(x0Var);
                break;
            default:
                R4.c cVar = new R4.c(this, 28);
                s sVar2 = new s(kVar, "flutter/platform", A5.m.f675a, null);
                this.f12447b = sVar2;
                sVar2.b(cVar);
                break;
        }
    }

    public k(EditText editText) {
        this.f12446a = 4;
        this.f12447b = editText;
        p059i0.h hVar = new p059i0.h(editText);
        this.f12448c = hVar;
        editText.addTextChangedListener(hVar);
        if (p059i0.a.f13817b == null) {
            synchronized (p059i0.a.f13816a) {
                try {
                    if (p059i0.a.f13817b == null) {
                        p059i0.a aVar = new p059i0.a();
                        try {
                            p059i0.a.f13818c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, p059i0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        p059i0.a.f13817b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(p059i0.a.f13817b);
    }

    public k(int i7) {
        this.f12446a = i7;
        switch (i7) {
            case 14:
                this.f12447b = new LongSparseArray();
                this.f12448c = new PriorityQueue();
                break;
            default:
                this.f12447b = new AtomicLong();
                this.f12448c = new AtomicLong();
                break;
        }
    }
}
