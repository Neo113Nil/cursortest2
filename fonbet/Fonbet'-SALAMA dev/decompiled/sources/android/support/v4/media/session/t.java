package android.support.v4.media.session;

import A1.X;
import C0.C0083b;
import C0.J;
import C1.C0095a;
import D6.y0;
import E4.L;
import G4.F;
import G4.InterfaceC0268a;
import G4.S;
import P1.z;
import P5.C0394f;
import P5.C0396h;
import P5.InterfaceC0395g;
import P5.M;
import P5.N;
import P5.P;
import U5.AbstractC0457y;
import U5.C0435b;
import U5.C0443j;
import U5.b0;
import U5.c0;
import U5.k0;
import U5.l0;
import W5.AbstractC0486a1;
import W5.C0526o;
import W5.C0529p;
import W5.C0532q;
import W5.C0537s;
import W5.EnumC0543u;
import W5.InterfaceC0546v;
import Y4.L0;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.exoplayer2.Format$Builder;
import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.MediaButtonReceiver;
import e6.AbstractC1053b;
import e6.C1054c;
import g6.AbstractC1159h;
import h5.C1209a;
import i4.C1267d;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocket;
import m0.C1425a;
import m1.C1427b;
import m1.C1429d;
import m1.C1430e;
import n.ThreadFactoryC1443c;
import n1.C1450e;
import n1.ThreadFactoryC1460o;
import n4.C1468b;
import n4.C1473g;
import t4.InterfaceC1609a;
import u5.C1649c;
import v2.AbstractC1664a;
import w1.C1718l0;
import w1.C1719l1;
import w1.C1726n0;
import w1.C1759x1;
import w1.P2;
import w2.C1772g;
import z5.C1822d;

/* loaded from: classes.dex */
public class t implements A5.d, InterfaceC0268a, z, InterfaceC0395g, R1.k, InterfaceC0546v, A5.q, InterfaceC1609a {

    /* renamed from: e, reason: collision with root package name */
    public static int f8073e;

    /* renamed from: f, reason: collision with root package name */
    public static t f8074f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8075a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8076b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8077c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8078d;

    public /* synthetic */ t(int i7, boolean z4) {
        this.f8075a = i7;
    }

    public static Bundle B0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Z(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void Z(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(t.class.getClassLoader());
        }
    }

    public static Method e0(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return e0(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public static t l0() {
        if (f8074f == null) {
            C1718l0 c1718l0 = new C1718l0(23);
            ThreadFactoryC1460o threadFactoryC1460o = new ThreadFactoryC1460o(1);
            threadFactoryC1460o.f15338b = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC1460o);
            FlutterJNI flutterJNI = new FlutterJNI();
            C1649c c1649c = new C1649c();
            c1649c.f16877b = false;
            c1649c.f16880e = flutterJNI;
            c1649c.f16881f = newCachedThreadPool;
            t tVar = new t(22, false);
            tVar.f8076b = c1649c;
            tVar.f8077c = c1718l0;
            tVar.f8078d = newCachedThreadPool;
            f8074f = tVar;
        }
        return f8074f;
    }

    public static void q0(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static void s0() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    @Override // P5.InterfaceC0395g
    public void A(String str, double d7, C0396h c0396h) {
        V(c0396h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d7).apply();
    }

    public String A0(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String str2 = (String) this.f8078d;
        return str2 == null ? str : e1.k.f(str2, " - ", str);
    }

    @Override // P5.InterfaceC0395g
    public void B(String str, String str2, C0396h c0396h) {
        V(c0396h).edit().putString(str, str2).apply();
    }

    @Override // R1.k
    public ByteBuffer C(int i7) {
        return v2.t.f17153a >= 21 ? ((MediaCodec) this.f8076b).getInputBuffer(i7) : ((ByteBuffer[]) this.f8077c)[i7];
    }

    public void C0(String str) {
        String A02 = A0(str, new Object[0]);
        System.currentTimeMillis();
        ((B.v) this.f8076b).l(3, (String) this.f8077c, A02);
    }

    @Override // P5.InterfaceC0395g
    public Long D(String str, C0396h c0396h) {
        long j;
        SharedPreferences V4 = V(c0396h);
        if (!V4.contains(str)) {
            return null;
        }
        try {
            j = V4.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j = V4.getInt(str, 0);
        }
        return Long.valueOf(j);
    }

    public void D0(String str, double d7, double d8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i7 = 0;
        while (true) {
            arrayList = (ArrayList) this.f8078d;
            int size = arrayList.size();
            arrayList2 = (ArrayList) this.f8076b;
            arrayList3 = (ArrayList) this.f8077c;
            if (i7 >= size) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i7)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i7)).doubleValue();
            if (d7 < doubleValue || (doubleValue == d7 && d8 < doubleValue2)) {
                break;
            } else {
                i7++;
            }
        }
        arrayList.add(i7, str);
        arrayList3.add(i7, Double.valueOf(d7));
        arrayList2.add(i7, Double.valueOf(d8));
    }

    @Override // R1.k
    public void E(Surface surface) {
        ((MediaCodec) this.f8076b).setOutputSurface(surface);
    }

    @Override // W5.InterfaceC0546v
    public void F(l0 l0Var, EnumC0543u enumC0543u, b0 b0Var) {
        AbstractC1053b.c();
        try {
            C1054c c1054c = ((C0537s) this.f8078d).f7326b;
            AbstractC1053b.a();
            U(l0Var, b0Var);
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // G4.InterfaceC0268a
    public void G(int i7) {
        ((S) this.f8076b).b0("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", (String) this.f8078d, Integer.valueOf(i7));
    }

    @Override // P5.InterfaceC0395g
    public ArrayList H(String str, C0396h c0396h) {
        List list;
        SharedPreferences V4 = V(c0396h);
        ArrayList arrayList = null;
        if (V4.contains(str)) {
            String string = V4.getString(str, "");
            t6.h.b(string);
            if (C6.o.B0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !C6.o.B0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) M.c(V4.getString(str, ""), (M4.e) this.f8078d)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // R1.k
    public ByteBuffer I(int i7) {
        return v2.t.f17153a >= 21 ? ((MediaCodec) this.f8076b).getOutputBuffer(i7) : ((ByteBuffer[]) this.f8078d)[i7];
    }

    @Override // W5.InterfaceC0546v
    public void J(C1450e c1450e) {
        C0537s c0537s = (C0537s) this.f8078d;
        AbstractC1053b.c();
        try {
            C1054c c1054c = c0537s.f7326b;
            AbstractC1053b.a();
            AbstractC1053b.b();
            c0537s.f7327c.execute(new C0526o(this, c1450e));
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // P5.InterfaceC0395g
    public String K(String str, C0396h c0396h) {
        SharedPreferences V4 = V(c0396h);
        if (V4.contains(str)) {
            return V4.getString(str, "");
        }
        return null;
    }

    @Override // P5.InterfaceC0395g
    public P L(String str, C0396h c0396h) {
        SharedPreferences V4 = V(c0396h);
        if (!V4.contains(str)) {
            return null;
        }
        String string = V4.getString(str, "");
        t6.h.b(string);
        return C6.o.B0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new P(string, N.f5634d) : C6.o.B0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new P(null, N.f5633c) : new P(null, N.f5635e);
    }

    @Override // P5.InterfaceC0395g
    public Map M(List list, C0396h c0396h) {
        Object value;
        Map<String, ?> all = V(c0396h).getAll();
        t6.h.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (M.b(entry.getKey(), entry.getValue(), list != null ? AbstractC1159h.e1(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c3 = M.c(value, (M4.e) this.f8078d);
                t6.h.c(c3, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c3);
            }
        }
        return hashMap;
    }

    @Override // R1.k
    public void N(int i7, D1.c cVar, long j) {
        ((MediaCodec) this.f8076b).queueSecureInputBuffer(i7, 0, cVar.f1684i, j, 0);
    }

    @Override // P5.InterfaceC0395g
    public void O(String str, List list, C0396h c0396h) {
        V(c0396h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((M4.e) this.f8078d).q(list))).apply();
    }

    @Override // R1.k
    public void P(int i7, int i8, long j, int i9) {
        ((MediaCodec) this.f8076b).queueInputBuffer(i7, 0, i8, j, i9);
    }

    public void Q(U5.M m7) {
        C0443j c0443j = U5.N.f6434c;
        int i7 = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.f8078d;
            if (i7 >= objArr.length) {
                i7 = -1;
                break;
            } else if (c0443j.equals(objArr[i7][0])) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, ((Object[][]) this.f8078d).length + 1, 2);
            Object[][] objArr3 = (Object[][]) this.f8078d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8078d = objArr2;
            i7 = objArr2.length - 1;
        }
        ((Object[][]) this.f8078d)[i7] = new Object[]{c0443j, m7};
    }

    public K3.p R() {
        C1719l1 c1719l1;
        K3.q qVar = (K3.q) this.f8076b;
        if (qVar == null || (c1719l1 = (C1719l1) this.f8077c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qVar.f3943b != ((X3.a) c1719l1.f17771a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        K3.j jVar = K3.j.f3918k;
        K3.j jVar2 = qVar.f3944c;
        if (jVar2 != jVar && ((Integer) this.f8078d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f8078d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            X3.a.a(new byte[0]);
        } else if (jVar2 == K3.j.j) {
            X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f8078d).intValue()).array());
        } else {
            if (jVar2 != K3.j.f3917i) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((K3.q) this.f8076b).f3944c);
            }
            X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f8078d).intValue()).array());
        }
        return new K3.p();
    }

    public R3.j S() {
        C1719l1 c1719l1;
        X3.a a2;
        R3.k kVar = (R3.k) this.f8076b;
        if (kVar == null || (c1719l1 = (C1719l1) this.f8077c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f6044b != ((X3.a) c1719l1.f17771a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        R3.d dVar = R3.d.f6031o;
        R3.d dVar2 = kVar.f6046d;
        if (dVar2 != dVar && ((Integer) this.f8078d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar2 == dVar && ((Integer) this.f8078d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar2 == dVar) {
            a2 = X3.a.a(new byte[0]);
        } else if (dVar2 == R3.d.f6030n || dVar2 == R3.d.f6029m) {
            a2 = X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f8078d).intValue()).array());
        } else {
            if (dVar2 != R3.d.f6028l) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((R3.k) this.f8076b).f6046d);
            }
            a2 = X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f8078d).intValue()).array());
        }
        return new R3.j((R3.k) this.f8076b, a2);
    }

    public C1726n0 T() {
        return new C1726n0((List) this.f8076b, (C0435b) this.f8077c, (Object[][]) this.f8078d);
    }

    public void U(l0 l0Var, b0 b0Var) {
        C0537s c0537s = (C0537s) this.f8078d;
        U5.r rVar = c0537s.f7333i.f6474a;
        c0537s.f7330f.getClass();
        if (rVar == null) {
            rVar = null;
        }
        if (l0Var.f6547a == k0.CANCELLED && rVar != null && rVar.a()) {
            R4.c cVar = new R4.c(10);
            c0537s.j.d(cVar);
            l0Var = l0.f6539h.a("ClientCall was cancelled at or after deadline. " + cVar);
            b0Var = new b0();
        }
        AbstractC1053b.b();
        c0537s.f7327c.execute(new C0529p(this, l0Var, b0Var));
    }

    public SharedPreferences V(C0396h c0396h) {
        String str = c0396h.f5652a;
        Context context = (Context) this.f8077c;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            t6.h.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        t6.h.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void W(Throwable th, String str, Object... objArr) {
        if (r0()) {
            String A02 = A0(str, objArr);
            if (th != null) {
                StringBuilder d7 = t.e.d(A02, "\n");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                d7.append(stringWriter.toString());
                A02 = d7.toString();
            }
            System.currentTimeMillis();
            ((B.v) this.f8076b).l(1, (String) this.f8077c, A02);
        }
    }

    public I4.d X(int i7, byte[] bArr) {
        try {
            return new I4.d(i7, ((P2) ((R4.c) this.f8077c).f6064b).k(L0.P(bArr)));
        } catch (com.google.protobuf.M e7) {
            p3.f.F("Overlay failed to parse: %s", e7);
            throw null;
        }
    }

    public void Y() {
        HashMap hashMap = (HashMap) this.f8078d;
        Iterator it = new ArrayList(hashMap.values()).iterator();
        while (it.hasNext()) {
            ((C1209a) it.next()).J();
        }
        hashMap.clear();
    }

    @Override // P1.z
    public void a(C0095a c0095a) {
        long c3;
        long j;
        AbstractC1664a.i((v2.s) this.f8077c);
        int i7 = v2.t.f17153a;
        v2.s sVar = (v2.s) this.f8077c;
        synchronized (sVar) {
            try {
                long j3 = sVar.f17151c;
                c3 = j3 != -9223372036854775807L ? j3 + sVar.f17150b : sVar.c();
            } finally {
            }
        }
        v2.s sVar2 = (v2.s) this.f8077c;
        synchronized (sVar2) {
            j = sVar2.f17150b;
        }
        if (c3 == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        X x4 = (X) this.f8076b;
        if (j != x4.f287G) {
            Format$Builder a2 = x4.a();
            a2.f10541o = j;
            X x7 = new X(a2);
            this.f8076b = x7;
            ((F1.v) this.f8078d).a(x7);
        }
        int d7 = c0095a.d();
        ((F1.v) this.f8078d).c(d7, c0095a);
        ((F1.v) this.f8078d).e(c3, 1, d7, 0, null);
    }

    public void a0(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(A0(str, new Object[0]));
        sb.append("\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        String sb2 = sb.toString();
        System.currentTimeMillis();
        ((B.v) this.f8076b).l(4, (String) this.f8077c, sb2);
    }

    @Override // G4.InterfaceC0268a
    public void b(int i7, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            H4.h hVar = (H4.h) entry.getKey();
            I4.h hVar2 = (I4.h) entry.getValue();
            if (hVar2 == null) {
                Locale locale = Locale.US;
                throw new NullPointerException("null value for key: " + hVar);
            }
            String l7 = hVar.f3318a.l(r2.f3312a.size() - 2);
            H4.m mVar = hVar.f3318a;
            ((S) this.f8076b).b0("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", (String) this.f8078d, l7, p3.f.C((H4.m) mVar.t()), mVar.h(), Integer.valueOf(i7), ((P2) ((R4.c) this.f8077c).f6064b).v(hVar2).d());
        }
    }

    public androidx.lifecycle.S b0(Class cls, String str) {
        androidx.lifecycle.S b7;
        t6.h.e(str, "key");
        androidx.lifecycle.X x4 = (androidx.lifecycle.X) this.f8076b;
        x4.getClass();
        LinkedHashMap linkedHashMap = x4.f9613a;
        androidx.lifecycle.S s7 = (androidx.lifecycle.S) linkedHashMap.get(str);
        boolean isInstance = cls.isInstance(s7);
        V v6 = (V) this.f8077c;
        if (!isInstance) {
            m0.c cVar = new m0.c((m0.b) this.f8078d);
            cVar.f15202a.put(T.f9609b, str);
            try {
                b7 = v6.i(cls, cVar);
            } catch (AbstractMethodError unused) {
                b7 = v6.b(cls);
            }
            t6.h.e(b7, "viewModel");
            androidx.lifecycle.S s8 = (androidx.lifecycle.S) linkedHashMap.put(str, b7);
            if (s8 != null) {
                s8.b();
            }
            return b7;
        }
        androidx.lifecycle.P p5 = v6 instanceof androidx.lifecycle.P ? (androidx.lifecycle.P) v6 : null;
        if (p5 != null) {
            t6.h.b(s7);
            AbstractC0741o abstractC0741o = p5.f9592d;
            if (abstractC0741o != null) {
                G0.f fVar = p5.f9593e;
                t6.h.b(fVar);
                androidx.lifecycle.M.a(s7, fVar, abstractC0741o);
            }
        }
        t6.h.c(s7, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return s7;
    }

    @Override // P1.z
    public void c(v2.s sVar, F1.m mVar, J j) {
        this.f8077c = sVar;
        j.a();
        j.d();
        F1.v r7 = mVar.r(j.f1236c, 5);
        this.f8078d = r7;
        r7.a((X) this.f8076b);
    }

    public Method c0(Class cls) {
        Class cls2;
        Method e02 = e0(cls, (String) this.f8077c, (Class[]) this.f8078d);
        if (e02 == null || (cls2 = (Class) this.f8076b) == null || cls2.isAssignableFrom(e02.getReturnType())) {
            return e02;
        }
        return null;
    }

    @Override // W5.InterfaceC0546v
    public void d(b0 b0Var) {
        C0537s c0537s = (C0537s) this.f8078d;
        AbstractC1053b.c();
        try {
            C1054c c1054c = c0537s.f7326b;
            AbstractC1053b.a();
            AbstractC1053b.b();
            c0537s.f7327c.execute(new C0526o(this, b0Var));
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public List d0(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f8076b).get(new J3.l(bArr));
        return list != null ? list : Collections.emptyList();
    }

    @Override // G4.InterfaceC0268a
    public I4.d e(H4.h hVar) {
        String C3 = p3.f.C((H4.m) hVar.f3318a.t());
        String h6 = hVar.f3318a.h();
        C1726n0 c0 = ((S) this.f8076b).c0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        c0.c((String) this.f8078d, C3, h6);
        Cursor J5 = c0.J();
        try {
            if (!J5.moveToFirst()) {
                J5.close();
                return null;
            }
            I4.d X6 = X(J5.getInt(1), J5.getBlob(0));
            J5.close();
            return X6;
        } catch (Throwable th) {
            if (J5 != null) {
                try {
                    J5.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // P5.InterfaceC0395g
    public void f(String str, long j, C0396h c0396h) {
        V(c0396h).edit().putLong(str, j).apply();
    }

    public C1429d f0(String str) {
        D0.k c3 = D0.k.c(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            c3.e(1);
        } else {
            c3.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8076b;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            return g3.moveToFirst() ? new C1429d(g3.getString(p3.f.J(g3, "work_spec_id")), g3.getInt(p3.f.J(g3, "system_id"))) : null;
        } finally {
            g3.close();
            c3.g();
        }
    }

    @Override // R1.k
    public void flush() {
        ((MediaCodec) this.f8076b).flush();
    }

    @Override // G4.InterfaceC0268a
    public HashMap g(H4.m mVar, int i7) {
        HashMap hashMap = new HashMap();
        L4.g gVar = new L4.g();
        C1726n0 c0 = ((S) this.f8076b).c0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        c0.c((String) this.f8078d, p3.f.C(mVar), Integer.valueOf(i7));
        Cursor J5 = c0.J();
        while (J5.moveToNext()) {
            try {
                t0(gVar, hashMap, J5);
            } catch (Throwable th) {
                if (J5 != null) {
                    try {
                        J5.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        J5.close();
        gVar.a();
        return hashMap;
    }

    public View g0(int i7) {
        return ((RecyclerView) ((R4.c) this.f8076b).f6064b).getChildAt(i7);
    }

    @Override // P5.InterfaceC0395g
    public void h(List list, C0396h c0396h) {
        SharedPreferences V4 = V(c0396h);
        SharedPreferences.Editor edit = V4.edit();
        t6.h.d(edit, "edit(...)");
        Map<String, ?> all = V4.getAll();
        t6.h.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (M.b(str, all.get(str), list != null ? AbstractC1159h.e1(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        t6.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            t6.h.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    public int h0() {
        return ((RecyclerView) ((R4.c) this.f8076b).f6064b).getChildCount();
    }

    @Override // G4.InterfaceC0268a
    public HashMap i(int i7, int i8, String str) {
        final HashMap hashMap = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final L4.g gVar = new L4.g();
        S s7 = (S) this.f8076b;
        C1726n0 c0 = s7.c0("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
        c0.c((String) this.f8078d, str, Integer.valueOf(i7), Integer.valueOf(i8));
        c0.m(new L4.h() { // from class: G4.G
            @Override // L4.h
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                android.support.v4.media.session.t tVar = android.support.v4.media.session.t.this;
                tVar.getClass();
                iArr[0] = cursor.getInt(1);
                strArr[0] = cursor.getString(2);
                strArr2[0] = cursor.getString(3);
                tVar.t0(gVar, hashMap, cursor);
            }
        });
        if (strArr[0] == null) {
            return hashMap;
        }
        C1726n0 c02 = s7.c0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = strArr[0];
        c02.c((String) this.f8078d, str, str2, str2, strArr2[0], Integer.valueOf(iArr[0]));
        Cursor J5 = c02.J();
        while (J5.moveToNext()) {
            try {
                t0(gVar, hashMap, J5);
            } finally {
            }
        }
        J5.close();
        gVar.a();
        return hashMap;
    }

    public File i0(Context context) {
        ((C1054c) this.f8077c).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    @Override // P5.InterfaceC0395g
    public void j(String str, String str2, C0396h c0396h) {
        V(c0396h).edit().putString(str, str2).apply();
    }

    public void j0(Throwable th) {
        String str = th instanceof OutOfMemoryError ? "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data" : th instanceof NoClassDefFoundError ? "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk" : th instanceof C1267d ? "" : "Uncaught exception in Firebase Database runloop (21.0.0). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
        ((t) this.f8077c).a0(str, th);
        new Handler(((Context) ((C1726n0) this.f8078d).f17805b).getMainLooper()).post(new y0(28, str, th));
        ((L4.b) this.f8076b).shutdownNow();
    }

    @Override // R1.k
    public MediaFormat k() {
        return ((MediaCodec) this.f8076b).getOutputFormat();
    }

    public void k0(C1429d c1429d) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8076b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1427b) this.f8077c).e(c1429d);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // R1.k
    public void l(Bundle bundle) {
        ((MediaCodec) this.f8076b).setParameters(bundle);
    }

    @Override // P5.InterfaceC0395g
    public Boolean m(String str, C0396h c0396h) {
        SharedPreferences V4 = V(c0396h);
        if (V4.contains(str)) {
            return Boolean.valueOf(V4.getBoolean(str, true));
        }
        return null;
    }

    public Object m0(SSLSocket sSLSocket, Object... objArr) {
        Method c0 = c0(sSLSocket.getClass());
        if (c0 == null) {
            throw new AssertionError("Method " + ((String) this.f8077c) + " not supported for object " + sSLSocket);
        }
        try {
            return c0.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e7) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + c0);
            assertionError.initCause(e7);
            throw assertionError;
        }
    }

    @Override // R1.k
    public void n(int i7, long j) {
        ((MediaCodec) this.f8076b).releaseOutputBuffer(i7, j);
    }

    public void n0(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method c0 = c0(sSLSocket.getClass());
            if (c0 == null) {
                return;
            }
            try {
                c0.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // R1.k
    public int o() {
        return ((MediaCodec) this.f8076b).dequeueInputBuffer(0L);
    }

    public Object o0(SSLSocket sSLSocket, Object... objArr) {
        try {
            return m0(sSLSocket, objArr);
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        HashMap hashMap;
        String str = oVar.f676a;
        str.getClass();
        hashMap = (HashMap) this.f8078d;
        switch (str) {
            case "init":
                String str2 = (String) oVar.a("id");
                if (!hashMap.containsKey(str2)) {
                    List list = (List) oVar.a("androidAudioEffects");
                    hashMap.put(str2, new C1209a((Context) this.f8076b, (A5.f) this.f8077c, str2, (Map) oVar.a("audioLoadConfiguration"), list, (Boolean) oVar.a("androidOffloadSchedulingEnabled")));
                    ((A5.p) rVar).success(null);
                    break;
                } else {
                    ((A5.p) rVar).error(AbstractC0486a1.h("Platform player ", str2, " already exists"), null, null);
                    break;
                }
            case "disposePlayer":
                String str3 = (String) oVar.a("id");
                C1209a c1209a = (C1209a) hashMap.get(str3);
                if (c1209a != null) {
                    c1209a.J();
                    hashMap.remove(str3);
                }
                ((A5.p) rVar).success(new HashMap());
                break;
            case "disposeAllPlayers":
                Y();
                ((A5.p) rVar).success(new HashMap());
                break;
            default:
                ((A5.p) rVar).notImplemented();
                break;
        }
    }

    @Override // A5.d
    public void p(ByteBuffer byteBuffer, s5.f fVar) {
        A5.j jVar = (A5.j) this.f8078d;
        A5.o b7 = jVar.f671c.b(byteBuffer);
        String str = b7.f676a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f8077c;
        Object obj = b7.f677b;
        String str2 = jVar.f670b;
        A5.t tVar = jVar.f671c;
        A5.i iVar = (A5.i) this.f8076b;
        if (!equals) {
            if (!str.equals("cancel")) {
                fVar.a(null);
                return;
            }
            if (((A5.g) atomicReference.getAndSet(null)) == null) {
                fVar.a(tVar.e("error", "No active stream to cancel", null));
                return;
            }
            try {
                iVar.b();
                fVar.a(tVar.c(null));
                return;
            } catch (RuntimeException e7) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e7);
                fVar.a(tVar.e("error", e7.getMessage(), null));
                return;
            }
        }
        A5.h hVar = new A5.h(this);
        if (((A5.g) atomicReference.getAndSet(hVar)) != null) {
            try {
                iVar.b();
            } catch (RuntimeException e8) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e8);
            }
        }
        try {
            iVar.c(obj, hVar);
            fVar.a(tVar.c(null));
        } catch (RuntimeException e9) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e9);
            fVar.a(tVar.e("error", e9.getMessage(), null));
        }
    }

    public boolean p0() {
        return ((o) this.f8076b).f8060a.isActive();
    }

    @Override // t4.InterfaceC1609a
    public v4.p q(v4.k kVar, v4.p pVar, boolean z4) {
        v4.r rVar = (v4.r) this.f8078d;
        if (rVar == null) {
            rVar = ((com.google.android.gms.common.internal.w) this.f8077c).D();
        }
        com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f8076b;
        C1468b z7 = ((C1468b) ((n4.M) wVar.f11336c).f15383a).z((C1473g) wVar.f11335b);
        v4.r<v4.p> C3 = z7.C(C1473g.f15415d);
        v4.p pVar2 = null;
        if (C3 == null) {
            if (rVar != null) {
                C3 = z7.t(rVar);
            }
            return pVar2;
        }
        for (v4.p pVar3 : C3) {
            if ((z4 ? kVar.compare(pVar, pVar3) : kVar.compare(pVar3, pVar)) > 0) {
                if (pVar2 != null) {
                    if ((z4 ? kVar.compare(pVar2, pVar3) : kVar.compare(pVar3, pVar2)) < 0) {
                    }
                }
                pVar2 = pVar3;
            }
        }
        return pVar2;
    }

    @Override // R1.k
    public void r(C1772g c1772g, Handler handler) {
        ((MediaCodec) this.f8076b).setOnFrameRenderedListener(new R1.a(this, c1772g, 1), handler);
    }

    public boolean r0() {
        return t.e.e(((B.v) this.f8076b).f965b) <= 0;
    }

    @Override // R1.k
    public void release() {
        this.f8077c = null;
        this.f8078d = null;
        ((MediaCodec) this.f8076b).release();
    }

    @Override // R1.k
    public int s(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f8076b;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && v2.t.f17153a < 21) {
                this.f8078d = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // P5.InterfaceC0395g
    public void t(String str, boolean z4, C0396h c0396h) {
        V(c0396h).edit().putBoolean(str, z4).apply();
    }

    public void t0(L4.g gVar, Map map, Cursor cursor) {
        byte[] blob = cursor.getBlob(0);
        int i7 = cursor.getInt(1);
        Executor executor = gVar;
        if (cursor.isLast()) {
            executor = L4.l.f4377b;
        }
        executor.execute(new F(this, blob, i7, map));
    }

    public String toString() {
        switch (this.f8075a) {
            case 2:
                return ((C0083b) this.f8077c).toString() + ", hidden list:" + ((ArrayList) this.f8078d).size();
            default:
                return super.toString();
        }
    }

    @Override // W5.InterfaceC0546v
    public void u() {
        C0537s c0537s = (C0537s) this.f8078d;
        c0 c0Var = (c0) c0537s.f7325a.f3294e;
        c0Var.getClass();
        if (c0Var == c0.f6469a || c0Var == c0.f6470b) {
            return;
        }
        AbstractC1053b.c();
        try {
            AbstractC1053b.a();
            AbstractC1053b.b();
            c0537s.f7327c.execute(new C0532q(this));
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void u0(HashMap hashMap, L4.g gVar, H4.m mVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        L l7 = new L((S) this.f8076b, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList((String) this.f8078d, p3.f.C(mVar)), arrayList, ")");
        while (((Iterator) l7.f2146f).hasNext()) {
            Cursor J5 = l7.t().J();
            while (J5.moveToNext()) {
                try {
                    t0(gVar, hashMap, J5);
                } catch (Throwable th) {
                    if (J5 != null) {
                        try {
                            J5.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            J5.close();
        }
    }

    @Override // P5.InterfaceC0395g
    public Double v(String str, C0396h c0396h) {
        SharedPreferences V4 = V(c0396h);
        if (!V4.contains(str)) {
            return null;
        }
        Object c3 = M.c(V4.getString(str, ""), (M4.e) this.f8078d);
        t6.h.c(c3, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c3;
    }

    public void v0(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8076b;
        workDatabase_Impl.b();
        C1430e c1430e = (C1430e) this.f8078d;
        K0.f a2 = c1430e.a();
        if (str == null) {
            a2.d(1);
        } else {
            a2.e(1, str);
        }
        workDatabase_Impl.c();
        try {
            a2.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            c1430e.c(a2);
        }
    }

    @Override // R1.k
    public void w(int i7, boolean z4) {
        ((MediaCodec) this.f8076b).releaseOutputBuffer(i7, z4);
    }

    public void w0(boolean z4) {
        ((o) this.f8076b).f8060a.setActive(z4);
        Iterator it = ((ArrayList) this.f8078d).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // G4.InterfaceC0268a
    public HashMap x(TreeSet treeSet) {
        p3.f.O("getOverlays() requires natural order", treeSet.comparator() == null, new Object[0]);
        HashMap hashMap = new HashMap();
        L4.g gVar = new L4.g();
        H4.m mVar = H4.m.f3331b;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            if (!mVar.equals(hVar.d())) {
                u0(hashMap, gVar, mVar, arrayList);
                mVar = hVar.d();
                arrayList.clear();
            }
            arrayList.add(hVar.f3318a.h());
        }
        u0(hashMap, gVar, mVar, arrayList);
        gVar.a();
        return hashMap;
    }

    public void x0(List list) {
        p3.f.d("addrs is empty", !list.isEmpty());
        this.f8076b = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // P5.InterfaceC0395g
    public List y(List list, C0396h c0396h) {
        Map<String, ?> all = V(c0396h).getAll();
        t6.h.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            t6.h.d(key, "<get-key>(...)");
            if (M.b(key, entry.getValue(), list != null ? AbstractC1159h.e1(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC1159h.a1(linkedHashMap.keySet());
    }

    public void y0(PlaybackStateCompat playbackStateCompat) {
        o oVar = (o) this.f8076b;
        oVar.f8065f = playbackStateCompat;
        synchronized (oVar.f8063d) {
            for (int beginBroadcast = oVar.f8064e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) oVar.f8064e.getBroadcastItem(beginBroadcast)).q0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            oVar.f8064e.finishBroadcast();
        }
        MediaSession mediaSession = oVar.f8060a;
        if (playbackStateCompat.f8026C == null) {
            PlaybackState.Builder d7 = u.d();
            u.x(d7, playbackStateCompat.f8027a, playbackStateCompat.f8028b, playbackStateCompat.f8030d, playbackStateCompat.f8034y);
            u.u(d7, playbackStateCompat.f8029c);
            u.s(d7, playbackStateCompat.f8031e);
            u.v(d7, playbackStateCompat.f8033x);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f8035z) {
                PlaybackState.CustomAction customAction2 = customAction.f8040e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e7 = u.e(customAction.f8036a, customAction.f8037b, customAction.f8038c);
                    u.w(e7, customAction.f8039d);
                    customAction2 = u.b(e7);
                }
                u.a(d7, customAction2);
            }
            u.t(d7, playbackStateCompat.f8024A);
            v.b(d7, playbackStateCompat.f8025B);
            playbackStateCompat.f8026C = u.c(d7);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f8026C);
    }

    @Override // R1.k
    public void z(int i7) {
        ((MediaCodec) this.f8076b).setVideoScalingMode(i7);
    }

    public void z0(ArrayList arrayList) {
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) it.next();
                if (mediaSessionCompat$QueueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j = mediaSessionCompat$QueueItem.f8012b;
                if (hashSet.contains(Long.valueOf(j))) {
                    Log.e("MediaSessionCompat", AbstractC0486a1.g("Found duplicate queue id: ", j), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        o oVar = (o) this.f8076b;
        oVar.f8066g = arrayList;
        MediaSession mediaSession = oVar.f8060a;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) it2.next();
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.f8013c;
            if (queueItem == null) {
                queueItem = r.a(mediaSessionCompat$QueueItem2.f8011a.b(), mediaSessionCompat$QueueItem2.f8012b);
                mediaSessionCompat$QueueItem2.f8013c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i7) {
        this.f8075a = i7;
        this.f8076b = obj;
        this.f8077c = obj2;
        this.f8078d = obj3;
    }

    public t(int i7) {
        this.f8075a = i7;
        switch (i7) {
            case 18:
                this.f8076b = Collections.emptyList();
                this.f8077c = Collections.emptyList();
                break;
            case 25:
                C1054c c1054c = new C1054c(29);
                C1822d c1822d = new C1822d();
                this.f8076b = new HashSet();
                this.f8077c = c1054c;
                this.f8078d = c1822d;
                break;
            default:
                this.f8078d = new ArrayList();
                this.f8076b = new ArrayList();
                this.f8077c = new ArrayList();
                break;
        }
    }

    public t(A5.f fVar, Context context) {
        this.f8075a = 19;
        this.f8078d = new HashMap();
        this.f8076b = context;
        this.f8077c = fVar;
    }

    public t(WorkDatabase_Impl workDatabase_Impl) {
        this.f8075a = 21;
        this.f8076b = workDatabase_Impl;
        this.f8077c = new C1427b(workDatabase_Impl, 2);
        this.f8078d = new C1430e(workDatabase_Impl, 0);
    }

    public t(androidx.lifecycle.X x4, V v6, m0.b bVar) {
        this.f8075a = 17;
        t6.h.e(x4, "store");
        t6.h.e(bVar, "defaultCreationExtras");
        this.f8076b = x4;
        this.f8077c = v6;
        this.f8078d = bVar;
    }

    public t(S s7, R4.c cVar, C4.e eVar) {
        this.f8075a = 5;
        this.f8076b = s7;
        this.f8077c = cVar;
        String str = eVar.f1580a;
        this.f8078d = str == null ? "" : str;
    }

    public t(String str) {
        this.f8075a = 9;
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = str;
        this.f8076b = new X(format$Builder);
    }

    public t(R4.c cVar) {
        this.f8075a = 2;
        this.f8076b = cVar;
        this.f8077c = new C0083b();
        this.f8078d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(androidx.lifecycle.X x4, V v6) {
        this(x4, v6, C1425a.f15201b);
        this.f8075a = 17;
        t6.h.e(x4, "store");
    }

    public t(C1726n0 c1726n0, t tVar) {
        this.f8075a = 20;
        this.f8078d = c1726n0;
        this.f8077c = tVar;
        L4.b bVar = new L4.b(this, new ThreadFactoryC1443c(this), 1);
        this.f8076b = bVar;
        bVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public t(MediaCodec mediaCodec) {
        this.f8075a = 11;
        this.f8076b = mediaCodec;
        if (v2.t.f17153a < 21) {
            this.f8077c = mediaCodec.getInputBuffers();
            this.f8078d = mediaCodec.getOutputBuffers();
        }
    }

    public t(A5.j jVar, A5.i iVar) {
        this.f8075a = 1;
        this.f8078d = jVar;
        this.f8077c = new AtomicReference(null);
        this.f8076b = iVar;
    }

    public t(ConcurrentHashMap concurrentHashMap, J3.k kVar, T3.a aVar, Class cls) {
        this.f8075a = 7;
        this.f8076b = concurrentHashMap;
        this.f8077c = kVar;
        this.f8078d = aVar;
    }

    public t(A5.f fVar, Context context, M4.e eVar) {
        this.f8075a = 10;
        t6.h.e(fVar, "messenger");
        t6.h.e(context, "context");
        this.f8076b = fVar;
        this.f8077c = context;
        this.f8078d = eVar;
        try {
            InterfaceC0395g.f5651i.getClass();
            C0394f.b(fVar, this, "shared_preferences");
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e7);
        }
    }

    public t(AudioService audioService) {
        ComponentName componentName;
        this.f8075a = 0;
        this.f8078d = new ArrayList();
        if (!TextUtils.isEmpty("media-session")) {
            int i7 = MediaButtonReceiver.f12321a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(audioService.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = audioService.getPackageManager().queryBroadcastReceivers(intent, 0);
            PendingIntent pendingIntent = null;
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (queryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(audioService, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 29) {
                this.f8076b = new q(audioService);
            } else if (i8 >= 28) {
                this.f8076b = new p(audioService);
            } else {
                this.f8076b = new o(audioService);
            }
            ((o) this.f8076b).e(new k(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            ((o) this.f8076b).f8060a.setMediaButtonReceiver(pendingIntent);
            this.f8077c = new C1759x1(audioService, ((o) this.f8076b).f8062c);
            if (f8073e == 0) {
                f8073e = (int) (TypedValue.applyDimension(1, 320.0f, audioService.getResources().getDisplayMetrics()) + 0.5f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public t(C0537s c0537s, AbstractC0457y abstractC0457y) {
        this.f8075a = 14;
        this.f8078d = c0537s;
        this.f8076b = abstractC0457y;
    }
}
