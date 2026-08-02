package w1;

import C1.C0104j;
import C1.InterfaceC0106l;
import G4.C0272e;
import K4.C0321h;
import U5.C0435b;
import U5.C0443j;
import a.AbstractC0603a;
import a1.C0615k;
import a1.C0616l;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.C0665u;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzhew;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import f6.C1116i;
import g6.AbstractC1160i;
import g6.AbstractC1161j;
import i6.InterfaceC1287d;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.SentryEvent;
import io.sentry.Session;
import io.sentry.protocol.Device;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l.C1373k;
import n3.AbstractC1464a;
import n4.C1473g;
import n4.C1479m;
import org.xmlpull.v1.XmlPullParserException;
import p.C1524k;
import p.C1525l;
import u2.InterfaceC1636m;
import v.C1654e;
import v.C1655f;
import v.EnumC1653d;
import v2.AbstractC1664a;
import w.C1669b;

/* renamed from: w1.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1726n0 implements G4.X, zzbcy, G6.g, A5.q {

    /* renamed from: e, reason: collision with root package name */
    public static C1726n0 f17802e;

    /* renamed from: f, reason: collision with root package name */
    public static C1726n0 f17803f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17804a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17805b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17806c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17807d;

    public /* synthetic */ C1726n0(int i7) {
        this.f17804a = i7;
    }

    public static android.support.v4.media.session.t E() {
        android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(13, false);
        tVar.f8077c = C0435b.f6454b;
        tVar.f8078d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return tVar;
    }

    public static C1726n0 F(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new C1726n0(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static synchronized C1726n0 a() {
        C1726n0 c1726n0;
        synchronized (C1726n0.class) {
            try {
                if (f17802e == null) {
                    C1726n0 c1726n02 = new C1726n0(0);
                    c1726n02.f17807d = String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", 345, 14, 4, 0, "", "");
                    f17802e = c1726n02;
                }
                c1726n0 = f17802e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1726n0;
    }

    public C1473g A() {
        v4.c cVar = (v4.c) this.f17805b;
        C1726n0 c1726n0 = (C1726n0) this.f17806c;
        if (c1726n0 == null) {
            return cVar != null ? new C1473g(cVar) : C1473g.f15415d;
        }
        q4.k.c(cVar != null);
        return c1726n0.A().t(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:8:0x001d, B:10:0x0032, B:13:0x0039, B:14:0x0041, B:16:0x0048, B:17:0x004b, B:20:0x0053, B:23:0x0059, B:26:0x005f, B:28:0x0062, B:32:0x0067), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:8:0x001d, B:10:0x0032, B:13:0x0039, B:14:0x0041, B:16:0x0048, B:17:0x004b, B:20:0x0053, B:23:0x0059, B:26:0x005f, B:28:0x0062, B:32:0x0067), top: B:7:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(InterfaceC1636m interfaceC1636m, Uri uri, Map map, long j, long j3, c2.O o7) {
        String str;
        int r7;
        int s7;
        int i7;
        F1.k[] kVarArr;
        boolean z4;
        boolean z7 = true;
        F1.h hVar = new F1.h(interfaceC1636m, j, j3);
        this.f17807d = hVar;
        if (((F1.k) this.f17806c) != null) {
            return;
        }
        F1.i iVar = (F1.i) this.f17805b;
        synchronized (iVar) {
            try {
                int[] iArr = F1.i.f2538d;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                    r7 = AbstractC1664a.r(str);
                    if (r7 != -1) {
                        iVar.a(arrayList, r7);
                    }
                    s7 = AbstractC1664a.s(uri);
                    if (s7 != -1 && s7 != r7) {
                        iVar.a(arrayList, s7);
                    }
                    for (i7 = 0; i7 < 16; i7++) {
                        int i8 = iArr[i7];
                        if (i8 != r7 && i8 != s7) {
                            iVar.a(arrayList, i8);
                        }
                    }
                    kVarArr = (F1.k[]) arrayList.toArray(new F1.k[arrayList.size()]);
                }
                str = null;
                r7 = AbstractC1664a.r(str);
                if (r7 != -1) {
                }
                s7 = AbstractC1664a.s(uri);
                if (s7 != -1) {
                    iVar.a(arrayList, s7);
                }
                while (i7 < 16) {
                }
                kVarArr = (F1.k[]) arrayList.toArray(new F1.k[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVarArr.length == 1) {
            this.f17806c = kVarArr[0];
        } else {
            int length = kVarArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                F1.k kVar = kVarArr[i9];
                try {
                } catch (EOFException unused) {
                    z4 = ((F1.k) this.f17806c) != null || hVar.f2534d == j;
                } catch (Throwable th2) {
                    if (((F1.k) this.f17806c) == null && hVar.f2534d != j) {
                        z7 = false;
                    }
                    AbstractC1664a.h(z7);
                    hVar.f2536f = 0;
                    throw th2;
                }
                if (kVar.a(hVar)) {
                    this.f17806c = kVar;
                    hVar.f2536f = 0;
                    break;
                } else {
                    z4 = ((F1.k) this.f17806c) != null || hVar.f2534d == j;
                    AbstractC1664a.h(z4);
                    hVar.f2536f = 0;
                    i9++;
                }
            }
            if (((F1.k) this.f17806c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i10 = v2.t.f17153a;
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < kVarArr.length; i11++) {
                    sb2.append(kVarArr[i11].getClass().getSimpleName());
                    if (i11 < kVarArr.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                throw new J1.d(sb.toString(), null, false, 1);
            }
        }
        ((F1.k) this.f17806c).e(o7);
    }

    public void C() {
        p3.f.O("Caller should have verified scheduledFuture is non-null.", ((ScheduledFuture) this.f17806c) != null, new Object[0]);
        this.f17806c = null;
        p3.f.O("Delayed task not found.", ((L4.f) this.f17807d).f4360b.remove(this), new Object[0]);
    }

    public boolean D(int i7, B.d dVar, C1654e c1654e) {
        EnumC1653d[] enumC1653dArr = c1654e.f16937U;
        EnumC1653d enumC1653d = enumC1653dArr[0];
        C1669b c1669b = (C1669b) this.f17806c;
        c1669b.f17214a = enumC1653d;
        c1669b.f17215b = enumC1653dArr[1];
        c1669b.f17216c = c1654e.r();
        c1669b.f17217d = c1654e.l();
        c1669b.f17222i = false;
        c1669b.j = i7;
        EnumC1653d enumC1653d2 = c1669b.f17214a;
        EnumC1653d enumC1653d3 = EnumC1653d.f16914c;
        boolean z4 = enumC1653d2 == enumC1653d3;
        boolean z7 = c1669b.f17215b == enumC1653d3;
        boolean z8 = z4 && c1654e.f16941Y > 0.0f;
        boolean z9 = z7 && c1654e.f16941Y > 0.0f;
        EnumC1653d enumC1653d4 = EnumC1653d.f16912a;
        int[] iArr = c1654e.f16979t;
        if (z8 && iArr[0] == 4) {
            c1669b.f17214a = enumC1653d4;
        }
        if (z9 && iArr[1] == 4) {
            c1669b.f17215b = enumC1653d4;
        }
        dVar.b(c1654e, c1669b);
        c1654e.P(c1669b.f17218e);
        c1654e.M(c1669b.f17219f);
        c1654e.f16921E = c1669b.f17221h;
        c1654e.J(c1669b.f17220g);
        c1669b.j = 0;
        return c1669b.f17222i;
    }

    public void G(Activity activity, X0.l lVar) {
        t6.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f17806c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f17807d;
        try {
            if (lVar.equals((X0.l) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((C0616l) ((C1761y0) this.f17805b).f17932b).f7971b.iterator();
            while (it.hasNext()) {
                C0615k c0615k = (C0615k) it.next();
                if (c0615k.f7965a.equals(activity)) {
                    c0615k.f7967c = lVar;
                    c0615k.f7966b.accept(lVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void H() {
        ((TypedArray) this.f17806c).recycle();
    }

    public void I(C1655f c1655f, int i7, int i8, int i9) {
        int i10 = c1655f.f16949d0;
        int i11 = c1655f.f16951e0;
        c1655f.f16949d0 = 0;
        c1655f.f16951e0 = 0;
        c1655f.P(i8);
        c1655f.M(i9);
        if (i10 < 0) {
            c1655f.f16949d0 = 0;
        } else {
            c1655f.f16949d0 = i10;
        }
        if (i11 < 0) {
            c1655f.f16951e0 = 0;
        } else {
            c1655f.f16951e0 = i11;
        }
        C1655f c1655f2 = (C1655f) this.f17807d;
        c1655f2.f17006x0 = i7;
        c1655f2.V();
    }

    public Cursor J() {
        G4.Q q7 = (G4.Q) this.f17807d;
        String str = (String) this.f17805b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f17806c;
        return q7 != null ? sQLiteDatabase.rawQueryWithFactory(q7, str, null, null) : sQLiteDatabase.rawQuery(str, null);
    }

    public C1726n0 K(C1473g c1473g) {
        v4.c B7 = c1473g.B();
        C1726n0 c1726n0 = this;
        while (B7 != null) {
            q4.i iVar = (q4.i) c1726n0.f17807d;
            C1726n0 c1726n02 = new C1726n0(B7, c1726n0, iVar.f15862a.containsKey(B7) ? (q4.i) iVar.f15862a.get(B7) : new q4.i(), 22);
            c1473g = c1473g.E();
            B7 = c1473g.B();
            c1726n0 = c1726n02;
        }
        return c1726n0;
    }

    public void L(C1655f c1655f) {
        ArrayList arrayList = (ArrayList) this.f17805b;
        arrayList.clear();
        int size = c1655f.f17003u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1654e c1654e = (C1654e) c1655f.f17003u0.get(i7);
            EnumC1653d[] enumC1653dArr = c1654e.f16937U;
            EnumC1653d enumC1653d = enumC1653dArr[0];
            EnumC1653d enumC1653d2 = EnumC1653d.f16914c;
            if (enumC1653d == enumC1653d2 || enumC1653dArr[1] == enumC1653d2) {
                arrayList.add(c1654e);
            }
        }
        c1655f.f17005w0.f1617a = true;
    }

    public void M() {
        C1726n0 c1726n0 = (C1726n0) this.f17806c;
        if (c1726n0 != null) {
            q4.i iVar = (q4.i) this.f17807d;
            boolean z4 = iVar.f15863b == null && iVar.f15862a.isEmpty();
            q4.i iVar2 = (q4.i) c1726n0.f17807d;
            HashMap hashMap = iVar2.f15862a;
            v4.c cVar = (v4.c) this.f17805b;
            boolean containsKey = hashMap.containsKey(cVar);
            HashMap hashMap2 = iVar2.f15862a;
            if (z4 && containsKey) {
                hashMap2.remove(cVar);
                c1726n0.M();
            } else {
                if (z4 || containsKey) {
                    return;
                }
                hashMap2.put(cVar, iVar);
                c1726n0.M();
            }
        }
    }

    public synchronized String b() {
        String str;
        try {
            if (!TextUtils.isEmpty((String) this.f17805b)) {
                return (String) this.f17805b;
            }
            if (!TextUtils.isEmpty((String) this.f17806c)) {
                return (String) this.f17806c;
            }
            PackageInfo j = AbstractC1707i1.j(AbstractC1707i1.f17743c);
            if (j != null) {
                str = j.versionName;
                if (str == null) {
                    long longVersionCode = Build.VERSION.SDK_INT >= 28 ? j.getLongVersionCode() : j.versionCode;
                    if (longVersionCode != 0) {
                        str = String.valueOf(longVersionCode);
                    }
                }
                this.f17806c = str;
                return str;
            }
            str = "Unknown";
            this.f17806c = str;
            return str;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(Object... objArr) {
        this.f17807d = new G4.Q(objArr, 0);
    }

    public K3.i d() {
        C1719l1 c1719l1;
        K3.k kVar = (K3.k) this.f17805b;
        if (kVar == null || (c1719l1 = (C1719l1) this.f17806c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f3927b != ((X3.a) c1719l1.f17771a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        K3.j jVar = K3.j.f3913e;
        K3.j jVar2 = kVar.f3930e;
        if (jVar2 != jVar && ((Integer) this.f17807d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f17807d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            X3.a.a(new byte[0]);
        } else if (jVar2 == K3.j.f3912d) {
            X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f17807d).intValue()).array());
        } else {
            if (jVar2 != K3.j.f3911c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((K3.k) this.f17805b).f3930e);
            }
            X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f17807d).intValue()).array());
        }
        return new K3.i();
    }

    public R3.a e() {
        C1719l1 c1719l1;
        X3.a a2;
        R3.e eVar = (R3.e) this.f17805b;
        if (eVar == null || (c1719l1 = (C1719l1) this.f17806c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eVar.f6034b != ((X3.a) c1719l1.f17771a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        R3.d dVar = R3.d.f6023f;
        R3.d dVar2 = eVar.f6036d;
        if (dVar2 != dVar && ((Integer) this.f17807d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar2 == dVar && ((Integer) this.f17807d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar2 == dVar) {
            a2 = X3.a.a(new byte[0]);
        } else if (dVar2 == R3.d.f6022e || dVar2 == R3.d.f6021d) {
            a2 = X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f17807d).intValue()).array());
        } else {
            if (dVar2 != R3.d.f6020c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((R3.e) this.f17805b).f6036d);
            }
            a2 = X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f17807d).intValue()).array());
        }
        return new R3.a((R3.e) this.f17805b, a2);
    }

    public void f() {
        ((L4.f) this.f17807d).d();
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f17806c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            C();
        }
    }

    public void g(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f17806c;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f17807d).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void h(int i7, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f17806c).dispatchSemanticsAction(i7, dVar);
    }

    public void i(int i7, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f17806c).dispatchSemanticsAction(i7, dVar, serializable);
    }

    public byte[] j(byte[] bArr) {
        int x4 = x();
        byte[] bArr2 = new byte[x4];
        ((SecureRandom) this.f17806c).nextBytes(bArr2);
        AlgorithmParameterSpec z4 = z(bArr2);
        Key key = (Key) this.f17807d;
        Cipher cipher = (Cipher) this.f17805b;
        cipher.init(1, key, z4);
        byte[] doFinal = cipher.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + x4];
        System.arraycopy(bArr2, 0, bArr3, 0, x4);
        System.arraycopy(doFinal, 0, bArr3, x4, doFinal.length);
        return bArr3;
    }

    public synchronized void k() {
        if (!(((E4.t) this.f17806c) != null)) {
            this.f17806c = (E4.t) ((B4.C) this.f17805b).apply((L4.f) this.f17807d);
        }
    }

    public Object l(L4.n nVar) {
        Cursor J5 = J();
        try {
            if (!J5.moveToFirst()) {
                J5.close();
                return null;
            }
            Object apply = nVar.apply(J5);
            J5.close();
            return apply;
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

    public int m(L4.h hVar) {
        Cursor J5 = J();
        int i7 = 0;
        while (J5.moveToNext()) {
            try {
                i7++;
                hVar.accept(J5);
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
        return i7;
    }

    public void n(B.v vVar, boolean z4) {
        if (z4) {
            ((C1479m) vVar.f966c).b(vVar.f965b, this);
        }
        for (Object obj : ((q4.i) this.f17807d).f15862a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            new C1726n0((v4.c) entry.getKey(), this, (q4.i) entry.getValue(), 22).n(vVar, true);
        }
    }

    public String o() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (C6.o.B0(r1, "generic") == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0193 A[LOOP:1: B:24:0x018d->B:26:0x0193, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // A5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        boolean z4;
        Iterator it;
        int i7;
        t6.h.e(oVar, "call");
        if (!oVar.f676a.equals("getDeviceInfo")) {
            ((A5.p) rVar).notImplemented();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        String str = Build.BRAND;
        hashMap.put(Device.JsonKeys.BRAND, str);
        String str2 = Build.DEVICE;
        hashMap.put(Device.TYPE, str2);
        hashMap.put("display", Build.DISPLAY);
        String str3 = Build.FINGERPRINT;
        hashMap.put(SentryEvent.JsonKeys.FINGERPRINT, str3);
        String str4 = Build.HARDWARE;
        hashMap.put("hardware", str4);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Build.HOST);
        hashMap.put("id", Build.ID);
        String str5 = Build.MANUFACTURER;
        hashMap.put(Device.JsonKeys.MANUFACTURER, str5);
        String str6 = Build.MODEL;
        hashMap.put(Device.JsonKeys.MODEL, str6);
        String str7 = Build.PRODUCT;
        hashMap.put("product", str7);
        if (Build.VERSION.SDK_INT >= 25) {
            String string = Settings.Global.getString((ContentResolver) this.f17807d, "device_name");
            if (string == null) {
                string = "";
            }
            hashMap.put("name", string);
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", AbstractC1160i.M0(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", AbstractC1160i.M0(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", AbstractC1160i.M0(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        t6.h.d(str, "BRAND");
        String str8 = "unknown";
        if (C6.o.B0(str, "generic")) {
            t6.h.d(str2, "DEVICE");
        }
        t6.h.d(str3, "FINGERPRINT");
        if (!C6.o.B0(str3, "generic") && !C6.o.B0(str3, "unknown")) {
            t6.h.d(str4, "HARDWARE");
            if (!C6.o.p0(str4, "goldfish", false) && !C6.o.p0(str4, "ranchu", false)) {
                t6.h.d(str6, "MODEL");
                if (!C6.o.p0(str6, "google_sdk", false) && !C6.o.p0(str6, "Emulator", false) && !C6.o.p0(str6, "Android SDK built for x86", false)) {
                    t6.h.d(str5, "MANUFACTURER");
                    if (!C6.o.p0(str5, "Genymotion", false)) {
                        t6.h.d(str7, "PRODUCT");
                        if (!C6.o.p0(str7, "sdk", false) && !C6.o.p0(str7, "vbox86p", false) && !C6.o.p0(str7, "emulator", false) && !C6.o.p0(str7, Device.JsonKeys.SIMULATOR, false)) {
                            z4 = false;
                            hashMap.put("isPhysicalDevice", Boolean.valueOf(!z4));
                            FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f17805b).getSystemAvailableFeatures();
                            t6.h.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                            ArrayList arrayList = new ArrayList();
                            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                                if (featureInfo.name != null) {
                                    arrayList.add(featureInfo);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(AbstractC1161j.N0(arrayList));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((FeatureInfo) it.next()).name);
                            }
                            hashMap.put("systemFeatures", arrayList2);
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            hashMap.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
                            hashMap.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
                            HashMap hashMap2 = new HashMap();
                            i7 = Build.VERSION.SDK_INT;
                            hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                            hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                            hashMap2.put("codename", Build.VERSION.CODENAME);
                            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
                            hashMap2.put("release", Build.VERSION.RELEASE);
                            hashMap2.put("sdkInt", Integer.valueOf(i7));
                            hashMap.put("version", hashMap2);
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            ((ActivityManager) this.f17806c).getMemoryInfo(memoryInfo);
                            hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
                            hashMap.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
                            hashMap.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
                            if (i7 < 26) {
                                try {
                                    str8 = Build.getSerial();
                                } catch (SecurityException unused) {
                                }
                                hashMap.put("serialNumber", str8);
                            } else {
                                hashMap.put("serialNumber", Build.SERIAL);
                            }
                            ((A5.p) rVar).success(hashMap);
                        }
                    }
                }
            }
        }
        z4 = true;
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!z4));
        FeatureInfo[] systemAvailableFeatures2 = ((PackageManager) this.f17805b).getSystemAvailableFeatures();
        t6.h.d(systemAvailableFeatures2, "getSystemAvailableFeatures(...)");
        ArrayList arrayList3 = new ArrayList();
        while (r9 < r2) {
        }
        ArrayList arrayList22 = new ArrayList(AbstractC1161j.N0(arrayList3));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        hashMap.put("systemFeatures", arrayList22);
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("freeDiskSize", Long.valueOf(statFs2.getFreeBytes()));
        hashMap.put("totalDiskSize", Long.valueOf(statFs2.getTotalBytes()));
        HashMap hashMap22 = new HashMap();
        i7 = Build.VERSION.SDK_INT;
        hashMap22.put("baseOS", Build.VERSION.BASE_OS);
        hashMap22.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap22.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap22.put("codename", Build.VERSION.CODENAME);
        hashMap22.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap22.put("release", Build.VERSION.RELEASE);
        hashMap22.put("sdkInt", Integer.valueOf(i7));
        hashMap.put("version", hashMap22);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f17806c).getMemoryInfo(memoryInfo2);
        hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo2.lowMemory));
        hashMap.put("physicalRamSize", Long.valueOf(memoryInfo2.totalMem / 1048576));
        hashMap.put("availableRamSize", Long.valueOf(memoryInfo2.availMem / 1048576));
        if (i7 < 26) {
        }
        ((A5.p) rVar).success(hashMap);
    }

    public Cipher p() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public ColorStateList q(int i7) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f17806c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateList = G.h.getColorStateList((Context) this.f17805b, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateList;
    }

    @Override // G6.g
    public Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        Object r7 = ((G6.g) this.f17805b).r(new G6.e(hVar, (e0.e) this.f17806c, (P5.L) this.f17807d), interfaceC1287d);
        return r7 == j6.a.f14642a ? r7 : C1116i.f13008a;
    }

    public long s() {
        F1.h hVar = (F1.h) this.f17807d;
        if (hVar != null) {
            return hVar.f2534d;
        }
        return -1L;
    }

    @Override // G4.X
    public void start() {
        long j = C0272e.f2968f;
        this.f17805b = ((L4.f) this.f17806c).b(L4.e.f4348A, j, new A1.K0(this, 4));
    }

    @Override // G4.X
    public void stop() {
        C1726n0 c1726n0 = (C1726n0) this.f17805b;
        if (c1726n0 != null) {
            c1726n0.f();
        }
    }

    public String toString() {
        switch (this.f17804a) {
            case 13:
                D3.j u02 = AbstractC0603a.u0(this);
                u02.a((List) this.f17805b, "addrs");
                u02.a((C0435b) this.f17806c, Session.JsonKeys.ATTRS);
                u02.a(Arrays.deepToString((Object[][]) this.f17807d), "customOptions");
                return u02.toString();
            case 22:
                v4.c cVar = (v4.c) this.f17805b;
                StringBuilder k7 = e1.k.k("", cVar == null ? "<anon>" : cVar.f17173a, "\n");
                k7.append(((q4.i) this.f17807d).a("\t"));
                return k7.toString();
            default:
                return super.toString();
        }
    }

    public Drawable u(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f17806c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : AbstractC1464a.w((Context) this.f17805b, resourceId);
    }

    public Drawable v(int i7) {
        int resourceId;
        Drawable d7;
        if (!((TypedArray) this.f17806c).hasValue(i7) || (resourceId = ((TypedArray) this.f17806c).getResourceId(i7, 0)) == 0) {
            return null;
        }
        C0665u a2 = C0665u.a();
        Context context = (Context) this.f17805b;
        synchronized (a2) {
            d7 = a2.f8748a.d(context, resourceId, true);
        }
        return d7;
    }

    public Typeface w(int i7, int i8, C0321h c0321h) {
        int i9 = 17;
        int resourceId = ((TypedArray) this.f17806c).getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f17807d) == null) {
            this.f17807d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f17807d;
        ThreadLocal threadLocal = H.m.f3174a;
        Context context = (Context) this.f17805b;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            c0321h.a();
            return null;
        }
        int i10 = typedValue.assetCookie;
        r.g gVar = I.f.f3468b;
        Typeface typeface = (Typeface) gVar.get(I.f.b(resources, resourceId, charSequence2, i10, i8));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new A0.f(i9, c0321h, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                H.e e7 = H.b.e(resources.getXml(resourceId), resources);
                if (e7 != null) {
                    return I.f.a(context, e7, resources, resourceId, charSequence2, typedValue.assetCookie, i8, c0321h);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0321h.a();
                return null;
            }
            int i11 = typedValue.assetCookie;
            Typeface y4 = I.f.f3467a.y(context, resources, resourceId, charSequence2, i8);
            if (y4 != null) {
                gVar.put(I.f.b(resources, resourceId, charSequence2, i11, i8), y4);
            }
            if (y4 != null) {
                new Handler(Looper.getMainLooper()).post(new A0.f(i9, c0321h, y4));
            } else {
                c0321h.a();
            }
            return y4;
        } catch (IOException e8) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e8);
            c0321h.a();
            return null;
        } catch (XmlPullParserException e9) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e9);
            c0321h.a();
            return null;
        }
    }

    public int x() {
        return 16;
    }

    public Object y() {
        C0443j c0443j = U5.N.f6434c;
        int i7 = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.f17807d;
            if (i7 >= objArr.length) {
                return null;
            }
            if (c0443j.equals(objArr[i7][0])) {
                return objArr[i7][1];
            }
            i7++;
        }
    }

    public AlgorithmParameterSpec z(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    public void zza() {
        zzbcz zzbczVar = (zzbcz) this.f17805b;
        C1525l a2 = new C1524k(zzbczVar.zza()).a();
        Context context = (Context) this.f17806c;
        a2.f15650a.setPackage(zzhew.zza(context));
        a2.a(context, (Uri) this.f17807d);
        zzbczVar.zzf((Activity) context);
    }

    public /* synthetic */ C1726n0(Object obj, Object obj2, Object obj3, int i7) {
        this.f17804a = i7;
        this.f17805b = obj;
        this.f17806c = obj2;
        this.f17807d = obj3;
    }

    public C1726n0(Context context, P2 p22) {
        this.f17804a = 18;
        this.f17806c = new SecureRandom();
        String o7 = o();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString(o7, null);
        this.f17805b = p();
        if (string != null) {
            try {
                this.f17807d = p22.T(Base64.decode(string, 0));
                return;
            } catch (Exception e7) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e7);
            }
        }
        byte[] bArr = new byte[16];
        ((SecureRandom) this.f17806c).nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f17807d = secretKeySpec;
        p22.getClass();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) p22.f17508b;
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate != null) {
            PublicKey publicKey = certificate.getPublicKey();
            if (publicKey != null) {
                Cipher B7 = p22.B();
                B7.init(3, publicKey, p22.A());
                edit.putString(o7, Base64.encodeToString(B7.wrap(secretKeySpec), 0));
                edit.apply();
                return;
            }
            throw new Exception(L.i("No key found under alias: ", str));
        }
        throw new Exception(L.i("No certificate found under alias: ", str));
    }

    public C1726n0(Uri uri, B.v vVar) {
        Uri parse;
        this.f17804a = 12;
        this.f17807d = uri;
        if (vVar == null) {
            parse = T4.c.f6351k;
        } else {
            parse = Uri.parse("http://" + ((String) vVar.f966c) + ":" + vVar.f965b + "/v0");
        }
        this.f17805b = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String B7 = P6.b.B(uri.getPath());
        if (B7.length() > 0 && !"/".equals(B7)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(B7);
        }
        this.f17806c = appendEncodedPath.build();
    }

    public C1726n0(F1.i iVar) {
        this.f17804a = 17;
        this.f17805b = iVar;
    }

    public C1726n0(Y3.i iVar) {
        this.f17804a = 20;
        this.f17806c = new HashSet();
        this.f17807d = iVar;
        if (iVar != null) {
            iVar.b();
            this.f17805b = iVar.f7663a;
        } else {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
    }

    public C1726n0(B4.C c3) {
        this.f17804a = 1;
        this.f17805b = c3;
        this.f17807d = new L4.f();
    }

    public C1726n0(Context context, TypedArray typedArray) {
        this.f17804a = 16;
        this.f17805b = context;
        this.f17806c = typedArray;
    }

    public C1726n0(Context context, LocationManager locationManager) {
        this.f17804a = 19;
        this.f17807d = new D3.p(2);
        this.f17805b = context;
        this.f17806c = locationManager;
    }

    public C1726n0(C1655f c1655f) {
        this.f17804a = 24;
        this.f17805b = new ArrayList();
        this.f17806c = new C1669b();
        this.f17807d = c1655f;
    }

    public C1726n0(C0272e c0272e, L4.f fVar) {
        this.f17804a = 4;
        this.f17807d = c0272e;
        this.f17806c = fVar;
    }

    public C1726n0(int i7, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f17804a = 9;
        this.f17805b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f17806c = unmodifiableList;
        this.f17807d = bArr;
    }

    public C1726n0(Context context, L4.f fVar, D3.j jVar, C4.e eVar, C4.d dVar, C4.b bVar, K4.k kVar) {
        this.f17804a = 3;
        this.f17805b = context;
        this.f17806c = fVar;
        this.f17807d = jVar;
    }

    public C1726n0(C1373k c1373k, FlutterJNI flutterJNI) {
        this.f17804a = 25;
        C1761y0 c1761y0 = new C1761y0(this, 25);
        F0 f02 = new F0(c1373k, "flutter/accessibility", A5.x.f685a, (Object) null, 1);
        this.f17805b = f02;
        f02.M(c1761y0);
        this.f17806c = flutterJNI;
    }

    public C1726n0(L4.f fVar, Runnable runnable) {
        this.f17804a = 8;
        this.f17807d = fVar;
        this.f17805b = runnable;
    }

    public C1726n0(InterfaceC0106l[] interfaceC0106lArr) {
        this.f17804a = 2;
        C1.K k7 = new C1.K();
        C1.M m7 = new C1.M();
        m7.f1444c = 1.0f;
        m7.f1445d = 1.0f;
        C0104j c0104j = C0104j.f1497e;
        m7.f1446e = c0104j;
        m7.f1447f = c0104j;
        m7.f1448g = c0104j;
        m7.f1449h = c0104j;
        ByteBuffer byteBuffer = InterfaceC0106l.f1502a;
        m7.f1451k = byteBuffer;
        m7.f1452l = byteBuffer.asShortBuffer();
        m7.f1453m = byteBuffer;
        m7.f1443b = -1;
        InterfaceC0106l[] interfaceC0106lArr2 = new InterfaceC0106l[interfaceC0106lArr.length + 2];
        this.f17805b = interfaceC0106lArr2;
        System.arraycopy(interfaceC0106lArr, 0, interfaceC0106lArr2, 0, interfaceC0106lArr.length);
        this.f17806c = k7;
        this.f17807d = m7;
        interfaceC0106lArr2[interfaceC0106lArr.length] = k7;
        interfaceC0106lArr2[interfaceC0106lArr.length + 1] = m7;
    }

    public C1726n0(C1761y0 c1761y0) {
        this.f17804a = 15;
        this.f17805b = c1761y0;
        this.f17806c = new ReentrantLock();
        this.f17807d = new WeakHashMap();
    }

    public C1726n0(SQLiteDatabase sQLiteDatabase, String str) {
        this.f17804a = 5;
        this.f17806c = sQLiteDatabase;
        this.f17805b = str;
    }

    public C1726n0(List list, C0435b c0435b, Object[][] objArr) {
        this.f17804a = 13;
        p3.f.k(list, "addresses are not set");
        this.f17805b = list;
        p3.f.k(c0435b, Session.JsonKeys.ATTRS);
        this.f17806c = c0435b;
        p3.f.k(objArr, "customOptions");
        this.f17807d = objArr;
    }
}
