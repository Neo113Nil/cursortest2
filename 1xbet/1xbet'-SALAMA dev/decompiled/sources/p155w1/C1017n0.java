package p155w1;

import A1.K0;
import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.x;
import B.v;
import B4.C;
import C1.C0104j;
import C1.InterfaceC0106l;
import C1.K;
import C1.M;
import F1.h;
import F1.i;
import G4.C0272e;
import G4.Q;
import G4.X;
import G6.g;
import H.m;
import J1.d;
import K3.j;
import K4.C0321h;
import L4.n;
import P5.L;
import U5.C0435b;
import U5.C0443j;
import U5.N;
import X0.l;
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
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.C0644u;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzhew;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
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
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
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
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.xmlpull.v1.XmlPullParserException;
import p018c2.O;
import p098n4.C0934g;
import p098n4.C0940m;
import p113p3.f;
import p120q4.k;
import p146u2.InterfaceC0954m;
import p149v.e;
import p151v2.a;
import p154w.b;
import v4.c;

/* JADX INFO: renamed from: w1.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1017n0 implements X, zzbcy, g, q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1017n0 f17808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C1017n0 f17809f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17813d;

    public /* synthetic */ C1017n0(int i7) {
        this.f17810a = i7;
    }

    public static t E() {
        t tVar = new t(13, false);
        tVar.f8077c = C0435b.f6454b;
        tVar.f8078d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return tVar;
    }

    public static C1017n0 F(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new C1017n0(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static synchronized C1017n0 a() {
        try {
            if (f17808e == null) {
                C1017n0 c1017n0 = new C1017n0(0);
                c1017n0.f17813d = String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", 345, 14, 4, 0, "", "");
                f17808e = c1017n0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17808e;
    }

    public C0934g A() {
        c cVar = (c) this.f17811b;
        C1017n0 c1017n0 = (C1017n0) this.f17812c;
        if (c1017n0 == null) {
            return cVar != null ? new C0934g(cVar) : C0934g.f15421d;
        }
        k.c(cVar != null);
        return c1017n0.A().t(cVar);
    }

    public void B(InterfaceC0954m interfaceC0954m, Uri uri, Map map, long j, long j3, O o7) throws d {
        F1.k[] kVarArr;
        boolean z4;
        boolean z7 = true;
        h hVar = new h(interfaceC0954m, j, j3);
        this.f17813d = hVar;
        if (((F1.k) this.f17812c) != null) {
            return;
        }
        i iVar = (i) this.f17811b;
        synchronized (iVar) {
            try {
                int[] iArr = i.f2538d;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                int iR = a.r((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iR != -1) {
                    iVar.a(arrayList, iR);
                }
                int iS = a.s(uri);
                if (iS != -1 && iS != iR) {
                    iVar.a(arrayList, iS);
                }
                for (int i7 = 0; i7 < 16; i7++) {
                    int i8 = iArr[i7];
                    if (i8 != iR && i8 != iS) {
                        iVar.a(arrayList, i8);
                    }
                }
                kVarArr = (F1.k[]) arrayList.toArray(new F1.k[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVarArr.length == 1) {
            this.f17812c = kVarArr[0];
        } else {
            for (F1.k kVar : kVarArr) {
                try {
                    if (kVar.a(hVar)) {
                        this.f17812c = kVar;
                        hVar.f2536f = 0;
                        break;
                    }
                    z4 = ((F1.k) this.f17812c) != null || hVar.f2534d == j;
                } catch (EOFException unused) {
                    z4 = ((F1.k) this.f17812c) != null || hVar.f2534d == j;
                } catch (Throwable th2) {
                    if (((F1.k) this.f17812c) == null && hVar.f2534d != j) {
                        z7 = false;
                    }
                    a.h(z7);
                    hVar.f2536f = 0;
                    throw th2;
                }
                a.h(z4);
                hVar.f2536f = 0;
            }
            if (((F1.k) this.f17812c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i9 = p151v2.t.f17159a;
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < kVarArr.length; i10++) {
                    sb2.append(kVarArr[i10].getClass().getSimpleName());
                    if (i10 < kVarArr.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                throw new d(sb.toString(), null, false, 1);
            }
        }
        ((F1.k) this.f17812c).e(o7);
    }

    public void C() {
        f.O("Caller should have verified scheduledFuture is non-null.", ((ScheduledFuture) this.f17812c) != null, new Object[0]);
        this.f17812c = null;
        f.O("Delayed task not found.", ((L4.f) this.f17813d).f4360b.remove(this), new Object[0]);
    }

    public boolean D(int i7, B.d dVar, e eVar) {
        p149v.d[] dVarArr = eVar.f16943U;
        p149v.d dVar2 = dVarArr[0];
        b bVar = (b) this.f17812c;
        bVar.f17220a = dVar2;
        bVar.f17221b = dVarArr[1];
        bVar.f17222c = eVar.r();
        bVar.f17223d = eVar.l();
        bVar.f17228i = false;
        bVar.j = i7;
        p149v.d dVar3 = bVar.f17220a;
        p149v.d dVar4 = p149v.d.f16920c;
        boolean z4 = dVar3 == dVar4;
        boolean z7 = bVar.f17221b == dVar4;
        boolean z8 = z4 && eVar.f16947Y > 0.0f;
        boolean z9 = z7 && eVar.f16947Y > 0.0f;
        p149v.d dVar5 = p149v.d.f16918a;
        int[] iArr = eVar.f16985t;
        if (z8 && iArr[0] == 4) {
            bVar.f17220a = dVar5;
        }
        if (z9 && iArr[1] == 4) {
            bVar.f17221b = dVar5;
        }
        dVar.b(eVar, bVar);
        eVar.P(bVar.f17224e);
        eVar.M(bVar.f17225f);
        eVar.f16927E = bVar.f17227h;
        eVar.J(bVar.f17226g);
        bVar.j = 0;
        return bVar.f17228i;
    }

    public void G(Activity activity, l lVar) {
        t6.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f17812c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f17813d;
        try {
            if (lVar.equals((l) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (p005a1.k kVar : ((p005a1.l) ((C1052y0) this.f17811b).f17938b).f7971b) {
                if (kVar.f7965a.equals(activity)) {
                    kVar.f7967c = lVar;
                    kVar.f7966b.accept(lVar);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void H() {
        ((TypedArray) this.f17812c).recycle();
    }

    public void I(p149v.f fVar, int i7, int i8, int i9) {
        int i10 = fVar.f16955d0;
        int i11 = fVar.f16957e0;
        fVar.f16955d0 = 0;
        fVar.f16957e0 = 0;
        fVar.P(i8);
        fVar.M(i9);
        if (i10 < 0) {
            fVar.f16955d0 = 0;
        } else {
            fVar.f16955d0 = i10;
        }
        if (i11 < 0) {
            fVar.f16957e0 = 0;
        } else {
            fVar.f16957e0 = i11;
        }
        p149v.f fVar2 = (p149v.f) this.f17813d;
        fVar2.f17012x0 = i7;
        fVar2.V();
    }

    public Cursor J() {
        Q q7 = (Q) this.f17813d;
        String str = (String) this.f17811b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f17812c;
        return q7 != null ? sQLiteDatabase.rawQueryWithFactory(q7, str, null, null) : sQLiteDatabase.rawQuery(str, null);
    }

    public C1017n0 K(C0934g c0934g) {
        c cVarB = c0934g.B();
        C1017n0 c1017n0 = this;
        while (cVarB != null) {
            p120q4.i iVar = (p120q4.i) c1017n0.f17813d;
            C1017n0 c1017n1 = new C1017n0(cVarB, c1017n0, iVar.f15868a.containsKey(cVarB) ? (p120q4.i) iVar.f15868a.get(cVarB) : new p120q4.i(), 22);
            c0934g = c0934g.E();
            cVarB = c0934g.B();
            c1017n0 = c1017n1;
        }
        return c1017n0;
    }

    public void L(p149v.f fVar) {
        ArrayList arrayList = (ArrayList) this.f17811b;
        arrayList.clear();
        int size = fVar.f17009u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) fVar.f17009u0.get(i7);
            p149v.d[] dVarArr = eVar.f16943U;
            p149v.d dVar = dVarArr[0];
            p149v.d dVar2 = p149v.d.f16920c;
            if (dVar == dVar2 || dVarArr[1] == dVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.f17011w0.f1617a = true;
    }

    public void M() {
        C1017n0 c1017n0 = (C1017n0) this.f17812c;
        if (c1017n0 != null) {
            p120q4.i iVar = (p120q4.i) this.f17813d;
            boolean z4 = iVar.f15869b == null && iVar.f15868a.isEmpty();
            p120q4.i iVar2 = (p120q4.i) c1017n0.f17813d;
            HashMap map = iVar2.f15868a;
            c cVar = (c) this.f17811b;
            boolean zContainsKey = map.containsKey(cVar);
            HashMap map2 = iVar2.f15868a;
            if (z4 && zContainsKey) {
                map2.remove(cVar);
                c1017n0.M();
            } else {
                if (z4 || zContainsKey) {
                    return;
                }
                map2.put(cVar, iVar);
                c1017n0.M();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    public synchronized String b() {
        String strValueOf;
        try {
            if (!TextUtils.isEmpty((String) this.f17811b)) {
                return (String) this.f17811b;
            }
            if (!TextUtils.isEmpty((String) this.f17812c)) {
                return (String) this.f17812c;
            }
            PackageInfo packageInfoJ = AbstractC0998i1.j(AbstractC0998i1.f17749c);
            if (packageInfoJ == null) {
                strValueOf = "Unknown";
            } else {
                strValueOf = packageInfoJ.versionName;
                if (strValueOf == null) {
                    long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoJ.getLongVersionCode() : packageInfoJ.versionCode;
                    if (longVersionCode != 0) {
                        strValueOf = String.valueOf(longVersionCode);
                    } else {
                        strValueOf = "Unknown";
                    }
                }
            }
            this.f17812c = strValueOf;
            return strValueOf;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(Object... objArr) {
        this.f17813d = new Q(objArr, 0);
    }

    public K3.i d() throws GeneralSecurityException {
        C1010l1 c1010l1;
        K3.k kVar = (K3.k) this.f17811b;
        if (kVar == null || (c1010l1 = (C1010l1) this.f17812c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f3927b != ((X3.a) c1010l1.f17777a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        j jVar = j.f3913e;
        j jVar2 = kVar.f3930e;
        if (jVar2 != jVar && ((Integer) this.f17813d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f17813d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            X3.a.a(new byte[0]);
        } else if (jVar2 == j.f3912d) {
            X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f17813d).intValue()).array());
        } else {
            if (jVar2 != j.f3911c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((K3.k) this.f17811b).f3930e);
            }
            X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f17813d).intValue()).array());
        }
        return new K3.i();
    }

    public R3.a e() throws GeneralSecurityException {
        C1010l1 c1010l1;
        X3.a aVarA;
        R3.e eVar = (R3.e) this.f17811b;
        if (eVar == null || (c1010l1 = (C1010l1) this.f17812c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eVar.f6034b != ((X3.a) c1010l1.f17777a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        R3.d dVar = R3.d.f6023f;
        R3.d dVar2 = eVar.f6036d;
        if (dVar2 != dVar && ((Integer) this.f17813d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar2 == dVar && ((Integer) this.f17813d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar2 == dVar) {
            aVarA = X3.a.a(new byte[0]);
        } else if (dVar2 == R3.d.f6022e || dVar2 == R3.d.f6021d) {
            aVarA = X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f17813d).intValue()).array());
        } else {
            if (dVar2 != R3.d.f6020c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((R3.e) this.f17811b).f6036d);
            }
            aVarA = X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f17813d).intValue()).array());
        }
        return new R3.a((R3.e) this.f17811b, aVarA);
    }

    public void f() {
        ((L4.f) this.f17813d).d();
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f17812c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            C();
        }
    }

    public void g(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f17812c;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f17813d).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void h(int i7, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f17812c).dispatchSemanticsAction(i7, dVar);
    }

    public void i(int i7, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f17812c).dispatchSemanticsAction(i7, dVar, serializable);
    }

    public byte[] j(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        int iX = x();
        byte[] bArr2 = new byte[iX];
        ((SecureRandom) this.f17812c).nextBytes(bArr2);
        AlgorithmParameterSpec algorithmParameterSpecZ = z(bArr2);
        Key key = (Key) this.f17813d;
        Cipher cipher = (Cipher) this.f17811b;
        cipher.init(1, key, algorithmParameterSpecZ);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        byte[] bArr3 = new byte[bArrDoFinal.length + iX];
        System.arraycopy(bArr2, 0, bArr3, 0, iX);
        System.arraycopy(bArrDoFinal, 0, bArr3, iX, bArrDoFinal.length);
        return bArr3;
    }

    public synchronized void k() {
        if (!(((E4.t) this.f17812c) != null)) {
            this.f17812c = (E4.t) ((C) this.f17811b).apply((L4.f) this.f17813d);
        }
    }

    public Object l(n nVar) {
        Cursor cursorJ = J();
        try {
            if (!cursorJ.moveToFirst()) {
                cursorJ.close();
                return null;
            }
            Object objApply = nVar.apply(cursorJ);
            cursorJ.close();
            return objApply;
        } catch (Throwable th) {
            if (cursorJ != null) {
                try {
                    cursorJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public int m(L4.h hVar) {
        Cursor cursorJ = J();
        int i7 = 0;
        while (cursorJ.moveToNext()) {
            try {
                i7++;
                hVar.accept(cursorJ);
            } catch (Throwable th) {
                if (cursorJ != null) {
                    try {
                        cursorJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorJ.close();
        return i7;
    }

    public void n(v vVar, boolean z4) {
        if (z4) {
            ((C0940m) vVar.f966c).b(vVar.f965b, this);
        }
        for (Object obj : ((p120q4.i) this.f17813d).f15868a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            new C1017n0((c) entry.getKey(), this, (p120q4.i) entry.getValue(), 22).n(vVar, true);
        }
    }

    public String o() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x0153  */
    @Override // A5.q
    public void onMethodCall(o oVar, r rVar) {
        boolean z4;
        t6.h.e(oVar, "call");
        if (!oVar.f676a.equals("getDeviceInfo")) {
            ((p) rVar).notImplemented();
            return;
        }
        HashMap map = new HashMap();
        map.put("board", Build.BOARD);
        map.put("bootloader", Build.BOOTLOADER);
        String str = Build.BRAND;
        map.put(Device.JsonKeys.BRAND, str);
        String str2 = Build.DEVICE;
        map.put(Device.TYPE, str2);
        map.put("display", Build.DISPLAY);
        String str3 = Build.FINGERPRINT;
        map.put(SentryEvent.JsonKeys.FINGERPRINT, str3);
        String str4 = Build.HARDWARE;
        map.put("hardware", str4);
        map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Build.HOST);
        map.put("id", Build.ID);
        String str5 = Build.MANUFACTURER;
        map.put(Device.JsonKeys.MANUFACTURER, str5);
        String str6 = Build.MODEL;
        map.put(Device.JsonKeys.MODEL, str6);
        String str7 = Build.PRODUCT;
        map.put("product", str7);
        if (Build.VERSION.SDK_INT >= 25) {
            String string = Settings.Global.getString((ContentResolver) this.f17813d, "device_name");
            if (string == null) {
                string = "";
            }
            map.put("name", string);
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        map.put("supported32BitAbis", p050g6.i.M0(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        map.put("supported64BitAbis", p050g6.i.M0(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        map.put("supportedAbis", p050g6.i.M0(Arrays.copyOf(strArr3, strArr3.length)));
        map.put("tags", Build.TAGS);
        map.put("type", Build.TYPE);
        t6.h.d(str, "BRAND");
        String serial = "unknown";
        if (C6.o.B0(str, "generic")) {
            t6.h.d(str2, "DEVICE");
            if (C6.o.B0(str2, "generic")) {
                z4 = true;
            } else {
                t6.h.d(str3, "FINGERPRINT");
                if (!C6.o.B0(str3, "generic") || C6.o.B0(str3, "unknown")) {
                    z4 = true;
                } else {
                    t6.h.d(str4, "HARDWARE");
                    if (C6.o.p0(str4, "goldfish", false) || C6.o.p0(str4, "ranchu", false)) {
                        z4 = true;
                    } else {
                        t6.h.d(str6, "MODEL");
                        if (C6.o.p0(str6, "google_sdk", false) || C6.o.p0(str6, "Emulator", false) || C6.o.p0(str6, "Android SDK built for x86", false)) {
                            z4 = true;
                        } else {
                            t6.h.d(str5, "MANUFACTURER");
                            if (C6.o.p0(str5, "Genymotion", false)) {
                                z4 = true;
                            } else {
                                t6.h.d(str7, "PRODUCT");
                                if (C6.o.p0(str7, "sdk", false) || C6.o.p0(str7, "vbox86p", false) || C6.o.p0(str7, "emulator", false) || C6.o.p0(str7, Device.JsonKeys.SIMULATOR, false)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            t6.h.d(str3, "FINGERPRINT");
            if (C6.o.B0(str3, "generic")) {
                z4 = true;
            } else {
                z4 = true;
            }
        }
        map.put("isPhysicalDevice", Boolean.valueOf(!z4));
        FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f17811b).getSystemAvailableFeatures();
        t6.h.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (featureInfo.name != null) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(p050g6.j.N0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        map.put("systemFeatures", arrayList2);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        map.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
        map.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
        HashMap map2 = new HashMap();
        int i7 = Build.VERSION.SDK_INT;
        map2.put("baseOS", Build.VERSION.BASE_OS);
        map2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        map2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        map2.put("codename", Build.VERSION.CODENAME);
        map2.put("incremental", Build.VERSION.INCREMENTAL);
        map2.put("release", Build.VERSION.RELEASE);
        map2.put("sdkInt", Integer.valueOf(i7));
        map.put("version", map2);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f17812c).getMemoryInfo(memoryInfo);
        map.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
        map.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
        map.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
        if (i7 >= 26) {
            try {
                serial = Build.getSerial();
            } catch (SecurityException unused) {
            }
            map.put("serialNumber", serial);
        } else {
            map.put("serialNumber", Build.SERIAL);
        }
        ((p) rVar).success(map);
    }

    public Cipher p() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public ColorStateList q(int i7) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f17812c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateList = G.h.getColorStateList((Context) this.f17811b, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateList;
    }

    @Override // G6.g
    public Object r(G6.h hVar, p065i6.d dVar) {
        Object objR = ((g) this.f17811b).r(new G6.e(hVar, (p030e0.e) this.f17812c, (L) this.f17813d), dVar);
        return objR == j6.a.f14648a ? objR : p044f6.i.f13014a;
    }

    public long s() {
        h hVar = (h) this.f17813d;
        if (hVar != null) {
            return hVar.f2534d;
        }
        return -1L;
    }

    @Override // G4.X
    public void start() {
        long j = C0272e.f2968f;
        this.f17811b = ((L4.f) this.f17812c).b(L4.e.f4348A, j, new K0(this, 4));
    }

    @Override // G4.X
    public void stop() {
        C1017n0 c1017n0 = (C1017n0) this.f17811b;
        if (c1017n0 != null) {
            c1017n0.f();
        }
    }

    public String toString() {
        switch (this.f17810a) {
            case 13:
                D3.j jVarU0 = p003a.a.u0(this);
                jVarU0.a((List) this.f17811b, "addrs");
                jVarU0.a((C0435b) this.f17812c, Session.JsonKeys.ATTRS);
                jVarU0.a(Arrays.deepToString((Object[][]) this.f17813d), "customOptions");
                return jVarU0.toString();
            case 22:
                c cVar = (c) this.f17811b;
                StringBuilder sbK = p031e1.k.k("", cVar == null ? "<anon>" : cVar.f17179a, "\n");
                sbK.append(((p120q4.i) this.f17813d).a("\t"));
                return sbK.toString();
            default:
                return super.toString();
        }
    }

    public Drawable u(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f17812c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : p097n3.a.w((Context) this.f17811b, resourceId);
    }

    public Drawable v(int i7) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f17812c).hasValue(i7) || (resourceId = ((TypedArray) this.f17812c).getResourceId(i7, 0)) == 0) {
            return null;
        }
        C0644u c0644uA = C0644u.a();
        Context context = (Context) this.f17811b;
        synchronized (c0644uA) {
            drawableD = c0644uA.f8748a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface w(int i7, int i8, C0321h c0321h) {
        int i9 = 17;
        int resourceId = ((TypedArray) this.f17812c).getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f17813d) == null) {
            this.f17813d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f17813d;
        ThreadLocal threadLocal = m.f3174a;
        Context context = (Context) this.f17811b;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            c0321h.a();
            return null;
        }
        int i10 = typedValue.assetCookie;
        p122r.g gVar = I.f.f3468b;
        Typeface typeface = (Typeface) gVar.get(I.f.b(resources, resourceId, string, i10, i8));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new A0.f(i9, c0321h, typeface));
            return typeface;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                H.e eVarE = H.b.e(resources.getXml(resourceId), resources);
                if (eVarE != null) {
                    return I.f.a(context, eVarE, resources, resourceId, string, typedValue.assetCookie, i8, c0321h);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0321h.a();
                return null;
            }
            int i11 = typedValue.assetCookie;
            Typeface typefaceY = I.f.f3467a.y(context, resources, resourceId, string, i8);
            if (typefaceY != null) {
                gVar.put(I.f.b(resources, resourceId, string, i11, i8), typefaceY);
            }
            if (typefaceY != null) {
                new Handler(Looper.getMainLooper()).post(new A0.f(i9, c0321h, typefaceY));
            } else {
                c0321h.a();
            }
            return typefaceY;
        } catch (IOException e7) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e7);
            c0321h.a();
            return null;
        } catch (XmlPullParserException e8) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e8);
            c0321h.a();
            return null;
        }
    }

    public int x() {
        return 16;
    }

    public Object y() {
        C0443j c0443j = N.f6434c;
        int i7 = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.f17813d;
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
        zzbcz zzbczVar = (zzbcz) this.f17811b;
        p109p.l lVarA = new p109p.k(zzbczVar.zza()).a();
        Context context = (Context) this.f17812c;
        lVarA.f15656a.setPackage(zzhew.zza(context));
        lVarA.a(context, (Uri) this.f17813d);
        zzbczVar.zzf((Activity) context);
    }

    public /* synthetic */ C1017n0(Object obj, Object obj2, Object obj3, int i7) {
        this.f17810a = i7;
        this.f17811b = obj;
        this.f17812c = obj2;
        this.f17813d = obj3;
    }

    public C1017n0(Context context, P2 p5) throws Exception {
        this.f17810a = 18;
        this.f17812c = new SecureRandom();
        String strO = o();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = sharedPreferences.getString(strO, null);
        this.f17811b = p();
        if (string != null) {
            try {
                this.f17813d = p5.T(Base64.decode(string, 0));
                return;
            } catch (Exception e7) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e7);
            }
        }
        byte[] bArr = new byte[16];
        ((SecureRandom) this.f17812c).nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f17813d = secretKeySpec;
        p5.getClass();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) p5.f17514b;
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate != null) {
            PublicKey publicKey = certificate.getPublicKey();
            if (publicKey != null) {
                Cipher cipherB = p5.B();
                cipherB.init(3, publicKey, p5.A());
                editorEdit.putString(strO, Base64.encodeToString(cipherB.wrap(secretKeySpec), 0));
                editorEdit.apply();
                return;
            }
            throw new Exception(L.i("No key found under alias: ", str));
        }
        throw new Exception(L.i("No certificate found under alias: ", str));
    }

    public C1017n0(Uri uri, v vVar) {
        Uri uri2;
        this.f17810a = 12;
        this.f17813d = uri;
        if (vVar == null) {
            uri2 = T4.c.f6351k;
        } else {
            uri2 = Uri.parse("http://" + ((String) vVar.f966c) + ":" + vVar.f965b + "/v0");
        }
        this.f17811b = uri2;
        Uri.Builder builderAppendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String strB = P6.b.B(uri.getPath());
        if (strB.length() > 0 && !"/".equals(strB)) {
            builderAppendEncodedPath = builderAppendEncodedPath.appendPath("o").appendPath(strB);
        }
        this.f17812c = builderAppendEncodedPath.build();
    }

    public C1017n0(i iVar) {
        this.f17810a = 17;
        this.f17811b = iVar;
    }

    public C1017n0(Y3.i iVar) {
        this.f17810a = 20;
        this.f17812c = new HashSet();
        this.f17813d = iVar;
        if (iVar != null) {
            iVar.b();
            this.f17811b = iVar.f7663a;
        } else {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
    }

    public C1017n0(C c3) {
        this.f17810a = 1;
        this.f17811b = c3;
        this.f17813d = new L4.f();
    }

    public C1017n0(Context context, TypedArray typedArray) {
        this.f17810a = 16;
        this.f17811b = context;
        this.f17812c = typedArray;
    }

    public C1017n0(Context context, LocationManager locationManager) {
        this.f17810a = 19;
        this.f17813d = new D3.p(2);
        this.f17811b = context;
        this.f17812c = locationManager;
    }

    public C1017n0(p149v.f fVar) {
        this.f17810a = 24;
        this.f17811b = new ArrayList();
        this.f17812c = new b();
        this.f17813d = fVar;
    }

    public C1017n0(C0272e c0272e, L4.f fVar) {
        this.f17810a = 4;
        this.f17813d = c0272e;
        this.f17812c = fVar;
    }

    public C1017n0(int i7, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f17810a = 9;
        this.f17811b = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f17812c = listUnmodifiableList;
        this.f17813d = bArr;
    }

    public C1017n0(Context context, L4.f fVar, D3.j jVar, C4.e eVar, C4.d dVar, C4.b bVar, K4.k kVar) {
        this.f17810a = 3;
        this.f17811b = context;
        this.f17812c = fVar;
        this.f17813d = jVar;
    }

    public C1017n0(p078l.k kVar, FlutterJNI flutterJNI) {
        this.f17810a = 25;
        C1052y0 c1052y0 = new C1052y0(this, 25);
        F0 f7 = new F0(kVar, "flutter/accessibility", x.f685a, (Object) null, 1);
        this.f17811b = f7;
        f7.M(c1052y0);
        this.f17812c = flutterJNI;
    }

    public C1017n0(L4.f fVar, Runnable runnable) {
        this.f17810a = 8;
        this.f17813d = fVar;
        this.f17811b = runnable;
    }

    public C1017n0(InterfaceC0106l[] interfaceC0106lArr) {
        this.f17810a = 2;
        K k7 = new K();
        M m7 = new M();
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
        this.f17811b = interfaceC0106lArr2;
        System.arraycopy(interfaceC0106lArr, 0, interfaceC0106lArr2, 0, interfaceC0106lArr.length);
        this.f17812c = k7;
        this.f17813d = m7;
        interfaceC0106lArr2[interfaceC0106lArr.length] = k7;
        interfaceC0106lArr2[interfaceC0106lArr.length + 1] = m7;
    }

    public C1017n0(C1052y0 c1052y0) {
        this.f17810a = 15;
        this.f17811b = c1052y0;
        this.f17812c = new ReentrantLock();
        this.f17813d = new WeakHashMap();
    }

    public C1017n0(SQLiteDatabase sQLiteDatabase, String str) {
        this.f17810a = 5;
        this.f17812c = sQLiteDatabase;
        this.f17811b = str;
    }

    public C1017n0(List list, C0435b c0435b, Object[][] objArr) {
        this.f17810a = 13;
        f.k(list, "addresses are not set");
        this.f17811b = list;
        f.k(c0435b, Session.JsonKeys.ATTRS);
        this.f17812c = c0435b;
        f.k(objArr, "customOptions");
        this.f17813d = objArr;
    }
}
