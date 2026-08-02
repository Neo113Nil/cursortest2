package u1;

import A1.C0011c;
import A5.p;
import B1.m;
import B4.AbstractC0080y;
import B4.C0063g;
import B4.C0070n;
import B4.C0074s;
import B4.C0075t;
import B4.C0076u;
import B4.C0077v;
import B4.C0078w;
import B4.C0079x;
import B4.M;
import B4.V;
import B4.j0;
import C1.AbstractC0098d;
import C1.AbstractC0100f;
import C1.C0095a;
import C1.C0101g;
import E3.F;
import H4.l;
import I2.C0306n;
import I4.o;
import P.InterfaceC0361q;
import P2.BinderC0386l;
import Y4.C0567d;
import Y4.C0569e;
import Y4.H0;
import Y4.I0;
import Y4.K;
import a.AbstractC0603a;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.t;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.widget.C0644j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.fragment.app.I;
import b5.C0788a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.common.api.internal.InterfaceC0841s;
import com.google.android.gms.common.internal.InterfaceC0853e;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzgai;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
import d6.C0977k;
import e4.C1036j;
import i4.C1264a;
import i4.C1265b;
import io.sentry.MeasurementUnit;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.io.EOFException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import n4.C;
import n4.C1473g;
import n4.D;
import n4.s;
import s3.C1592a;
import w1.AbstractC1706i0;
import w1.C1749u0;
import w1.C1755w0;
import w1.C1759x1;
import w1.C1761y0;
import w1.C1764z0;
import w1.r;

/* loaded from: classes.dex */
public final class c implements B3.e, zzgai, W3.h, m.i, InterfaceC0853e, Continuation, f1, q4.b, InterfaceC0841s, B3.j {

    /* renamed from: c, reason: collision with root package name */
    public static c f16589c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16590a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16591b;

    public /* synthetic */ c(int i7, boolean z4) {
        this.f16590a = i7;
    }

    public static synchronized c g() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f16589c == null) {
                    if (!r.f17840z.get()) {
                        AbstractC1706i0.q("Flurry SDK must be initialized before starting config");
                    }
                    c cVar2 = new c(0, false);
                    cVar2.f16591b = C1755w0.h();
                    f16589c = cVar2;
                }
                cVar = f16589c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static I0 o(Timestamp timestamp) {
        int i7 = (timestamp.f11829b / zzbbd.zzq.zzf) * zzbbd.zzq.zzf;
        H0 S6 = I0.S();
        y0 A7 = z0.A();
        A7.f(timestamp.f11828a);
        A7.d();
        z0.w((z0) A7.f12096b, i7);
        S6.l(A7);
        return (I0) S6.b();
    }

    @Override // W3.h
    public Object R(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 3; i7++) {
            Provider provider = Security.getProvider(strArr[i7]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((W3.j) this.f16591b).d(str, (Provider) it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // q4.b
    public Object a(C1473g c1473g, Object obj, Object obj2) {
        switch (this.f16590a) {
            case 22:
                break;
            case 23:
                s sVar = (s) obj;
                boolean isEmpty = c1473g.isEmpty();
                D d7 = (D) this.f16591b;
                if (!isEmpty && sVar.g()) {
                    s4.h hVar = sVar.d().f16174a;
                    C c3 = d7.f15364f;
                    s4.h k7 = D.k(hVar);
                    d7.m(hVar);
                    c3.d(k7);
                    break;
                } else {
                    Iterator it = sVar.e().iterator();
                    while (it.hasNext()) {
                        s4.h hVar2 = ((s4.i) it.next()).f16174a;
                        C c4 = d7.f15364f;
                        s4.h k8 = D.k(hVar2);
                        d7.m(hVar2);
                        c4.d(k8);
                    }
                    break;
                }
            default:
                ((ArrayList) this.f16591b).add(obj);
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
    public void accept(Object obj, Object obj2) {
        ((zzs) ((zzp) obj).getService()).zzc(new s3.b((TaskCompletionSource) obj2), (PublicKeyCredentialCreationOptions) this.f16591b);
    }

    @Override // m.i
    public void b(m.k kVar) {
        Toolbar toolbar = (Toolbar) this.f16591b;
        C0644j c0644j = toolbar.f8532a.f8239K;
        if (c0644j == null || !c0644j.k()) {
            Iterator it = toolbar.f8533a0.f5095b.iterator();
            while (it.hasNext()) {
                ((I) ((InterfaceC0361q) it.next())).f9360a.t();
            }
        }
        C1761y0 c1761y0 = toolbar.f8545i0;
        if (c1761y0 != null) {
            c1761y0.b(kVar);
        }
    }

    public synchronized void c() {
        Timer timer = (Timer) this.f16591b;
        if (timer != null) {
            timer.cancel();
            this.f16591b = null;
        }
    }

    public l d(Object obj, C0011c c0011c) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        I0 k7 = k(L4.k.b(obj, L4.j.f4371d), c0011c);
        if (k7.R() == 11) {
            return new l(k7);
        }
        H5.k kVar = L4.r.f4389a;
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: ".concat(obj.getClass().getName()));
    }

    @Override // m.i
    public boolean e(m.k kVar, MenuItem menuItem) {
        C1761y0 c1761y0 = ((Toolbar) this.f16591b).f8545i0;
        return false;
    }

    public I0 f(Object obj, C0011c c0011c) {
        return k(L4.k.b(obj, L4.j.f4371d), c0011c);
    }

    public String h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16591b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return MeasurementUnit.NONE;
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(4)) {
            return "vpn";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "mobile";
        }
        if (networkCapabilities.hasTransport(2)) {
            return "bluetooth";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return MeasurementUnit.NONE;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 7 ? type != 9 ? type != 17 ? MeasurementUnit.NONE : "vpn" : "ethernet" : "bluetooth";
                    }
                }
            }
            return "wifi";
        }
        return "mobile";
    }

    public String i(String str, String str2) {
        C1749u0 c1749u0;
        C1755w0 c1755w0 = (C1755w0) this.f16591b;
        if (c1755w0.f17910z == null) {
            c1755w0.n();
            c1755w0.f17910z = new C0977k(19, c1755w0.f17900A, c1755w0.f17901B);
        }
        C0977k c0977k = c1755w0.f17910z;
        C1764z0 c1764z0 = C1764z0.f17942d;
        io.flutter.view.r rVar = (io.flutter.view.r) c0977k.f12442c;
        C1749u0 c1749u02 = null;
        if (c1764z0 == null) {
            Iterator it = ((HashMap) rVar.f14352c).values().iterator();
            while (it.hasNext()) {
                c1749u0 = (C1749u0) ((Map) it.next()).get(str);
                if (c1749u0 != null) {
                    break;
                }
            }
            c1749u0 = null;
        } else {
            Map map = (Map) ((HashMap) rVar.f14352c).get(c1764z0);
            if (map != null) {
                c1749u0 = (C1749u0) map.get(str);
            }
            c1749u0 = null;
        }
        if (c1749u0 == null) {
            ((V) c0977k.f12441b).getClass();
        } else {
            c1749u02 = c1749u0;
        }
        return c1749u02 != null ? c1749u02.a() : str2;
    }

    public ArrayList j(List list) {
        m mVar = new m(4, 4);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(f(list.get(i7), new C0011c((m) mVar.p().f333c, null, true, 2)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I0 k(Object obj, C0011c c0011c) {
        int i7 = 2;
        boolean z4 = obj instanceof Map;
        m mVar = (m) c0011c.f333c;
        H4.j jVar = (H4.j) c0011c.f334d;
        Comparable comparable = null;
        Object[] objArr = 0;
        if (z4) {
            Map map = (Map) obj;
            if (map.isEmpty()) {
                if (jVar != null && !jVar.isEmpty()) {
                    c0011c.a(jVar);
                }
                H0 S6 = I0.S();
                S6.j(K.w());
                return (I0) S6.b();
            }
            Y4.I B7 = K.B();
            for (Map.Entry entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw c0011c.e(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                C0011c c0011c2 = new C0011c(mVar, jVar == null ? null : (H4.j) jVar.b(str), objArr == true ? 1 : 0, i7);
                c0011c2.m(str);
                I0 k7 = k(value, c0011c2);
                if (k7 != null) {
                    B7.f(k7, str);
                }
            }
            H0 S7 = I0.S();
            S7.i(B7);
            return (I0) S7.b();
        }
        if (obj instanceof AbstractC0080y) {
            AbstractC0080y abstractC0080y = (AbstractC0080y) obj;
            if (!c0011c.f()) {
                throw c0011c.e(abstractC0080y.a().concat("() can only be used with set() and update()"));
            }
            if (jVar == null) {
                throw c0011c.e(abstractC0080y.a().concat("() is not currently supported inside arrays"));
            }
            if (abstractC0080y instanceof C0077v) {
                int i8 = mVar.f1014b;
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw c0011c.e("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                    }
                    p3.f.O("FieldValue.delete() at the top level should have already been handled.", jVar.f3312a.size() > 0, new Object[0]);
                    throw c0011c.e("FieldValue.delete() can only appear at the top level of your update data");
                }
                c0011c.a(jVar);
            } else if (abstractC0080y instanceof C0079x) {
                c0011c.b(jVar, o.f3691a);
            } else if (abstractC0080y instanceof C0076u) {
                c0011c.b(jVar, new I4.b(j(((C0076u) abstractC0080y).f1194c)));
            } else if (abstractC0080y instanceof C0075t) {
                c0011c.b(jVar, new I4.a(j(((C0075t) abstractC0080y).f1193c)));
            } else {
                if (!(abstractC0080y instanceof C0078w)) {
                    H5.k kVar = L4.r.f4389a;
                    p3.f.F("Unknown FieldValue type: %s", abstractC0080y == null ? "null" : abstractC0080y.getClass().getName());
                    throw null;
                }
                c0011c.b(jVar, new I4.l(m(((C0078w) abstractC0080y).f1195c, false)));
            }
            return null;
        }
        if (jVar != null) {
            c0011c.a(jVar);
        }
        if (obj instanceof List) {
            if (c0011c.f332b && mVar.f1014b != 5) {
                throw c0011c.e("Nested arrays are not supported");
            }
            C0567d B8 = C0569e.B();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                I0 k8 = k(it.next(), new C0011c(mVar, comparable, r0, i7));
                if (k8 == null) {
                    H0 S8 = I0.S();
                    S8.d();
                    I0.C((I0) S8.f12096b);
                    k8 = (I0) S8.b();
                }
                B8.d();
                C0569e.v((C0569e) B8.f12096b, k8);
            }
            H0 S9 = I0.S();
            S9.f(B8);
            return (I0) S9.b();
        }
        if (obj == null) {
            H0 S10 = I0.S();
            S10.d();
            I0.C((I0) S10.f12096b);
            return (I0) S10.b();
        }
        if (obj instanceof Integer) {
            H0 S11 = I0.S();
            S11.h(((Integer) obj).intValue());
            return (I0) S11.b();
        }
        if (obj instanceof Long) {
            H0 S12 = I0.S();
            S12.h(((Long) obj).longValue());
            return (I0) S12.b();
        }
        if (obj instanceof Float) {
            H0 S13 = I0.S();
            S13.g(((Float) obj).doubleValue());
            return (I0) S13.b();
        }
        if (obj instanceof Double) {
            H0 S14 = I0.S();
            S14.g(((Double) obj).doubleValue());
            return (I0) S14.b();
        }
        if (obj instanceof Boolean) {
            H0 S15 = I0.S();
            boolean booleanValue = ((Boolean) obj).booleanValue();
            S15.d();
            I0.D((I0) S15.f12096b, booleanValue);
            return (I0) S15.b();
        }
        if (obj instanceof String) {
            H0 S16 = I0.S();
            S16.k((String) obj);
            return (I0) S16.b();
        }
        if (obj instanceof Date) {
            return o(new Timestamp((Date) obj));
        }
        if (obj instanceof Timestamp) {
            return o((Timestamp) obj);
        }
        if (obj instanceof M) {
            M m7 = (M) obj;
            H0 S17 = I0.S();
            C0788a A7 = b5.b.A();
            A7.d();
            b5.b.v((b5.b) A7.f12096b, m7.f1116a);
            A7.d();
            b5.b.w((b5.b) A7.f12096b, m7.f1117b);
            S17.d();
            I0.z((I0) S17.f12096b, (b5.b) A7.b());
            return (I0) S17.b();
        }
        if (obj instanceof C0063g) {
            H0 S18 = I0.S();
            AbstractC0911k abstractC0911k = ((C0063g) obj).f1159a;
            S18.d();
            I0.x((I0) S18.f12096b, abstractC0911k);
            return (I0) S18.b();
        }
        if (!(obj instanceof C0070n)) {
            if (!(obj instanceof j0)) {
                if (obj.getClass().isArray()) {
                    throw c0011c.e("Arrays are not supported; use a List instead");
                }
                H5.k kVar2 = L4.r.f4389a;
                throw c0011c.e("Unsupported type: ".concat(obj.getClass().getName()));
            }
            Y4.I B9 = K.B();
            B9.f(H4.o.f3339f, "__type__");
            double[] dArr = ((j0) obj).f1167a;
            ArrayList arrayList = new ArrayList(dArr.length);
            for (int i9 = 0; i9 < dArr.length; i9++) {
                arrayList.add(i9, Double.valueOf(dArr[i9]));
            }
            B9.f(k(arrayList, c0011c), "value");
            H0 S19 = I0.S();
            S19.i(B9);
            return (I0) S19.b();
        }
        C0070n c0070n = (C0070n) obj;
        H4.f fVar = (H4.f) this.f16591b;
        String str2 = fVar.f3314b;
        String str3 = fVar.f3313a;
        FirebaseFirestore firebaseFirestore = c0070n.f1180b;
        if (firebaseFirestore != null) {
            H4.f fVar2 = firebaseFirestore.f11964c;
            if (!fVar2.equals(fVar)) {
                throw c0011c.e("Document reference is for database " + fVar2.f3313a + "/" + fVar2.f3314b + " but should be for database " + str3 + "/" + str2);
            }
        }
        H0 S20 = I0.S();
        String d7 = c0070n.d();
        StringBuilder l7 = e1.k.l("projects/", str3, "/databases/", str2, "/documents/");
        l7.append(d7);
        String sb = l7.toString();
        S20.d();
        I0.y((I0) S20.f12096b, sb);
        return (I0) S20.b();
    }

    public C1759x1 l(Object obj, I4.f fVar) {
        m mVar = new m(2, 4);
        l d7 = d(obj, mVar.p());
        HashSet hashSet = (HashSet) mVar.f1015c;
        ArrayList arrayList = (ArrayList) mVar.f1016d;
        if (fVar == null) {
            return new C1759x1(d7, new I4.f(hashSet), Collections.unmodifiableList(arrayList), 3);
        }
        HashSet hashSet2 = fVar.f3667a;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            H4.j jVar = (H4.j) it.next();
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (jVar.m(((I4.g) it3.next()).f3668a)) {
                            break;
                        }
                    }
                    throw new IllegalArgumentException("Field '" + jVar.c() + "' is specified in your field mask but not in your input data.");
                }
                if (jVar.m((H4.j) it2.next())) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            I4.g gVar = (I4.g) it4.next();
            H4.j jVar2 = gVar.f3668a;
            Iterator it5 = hashSet2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                if (((H4.j) it5.next()).m(jVar2)) {
                    arrayList2.add(gVar);
                    break;
                }
            }
        }
        return new C1759x1(d7, fVar, Collections.unmodifiableList(arrayList2), 3);
    }

    public I0 m(Object obj, boolean z4) {
        m mVar = new m(z4 ? 5 : 4, 4);
        I0 f7 = f(obj, mVar.p());
        p3.f.O("Parsed data should not be null.", f7 != null, new Object[0]);
        p3.f.O("Field transforms should have been disallowed.", ((ArrayList) mVar.f1016d).isEmpty(), new Object[0]);
        return f7;
    }

    public C1759x1 n(Object obj) {
        m mVar = new m(1, 4);
        return new C1759x1(d(obj, mVar.p()), null, Collections.unmodifiableList((ArrayList) mVar.f1016d), 3);
    }

    @Override // B3.j
    public void onConsentFormLoadFailure(B3.i iVar) {
        String valueOf = String.valueOf(iVar.f1067a);
        String str = iVar.f1068b;
        y1.a aVar = (y1.a) this.f16591b;
        aVar.getClass();
        try {
            aVar.f18129c.error(valueOf, str, "");
        } catch (Exception unused) {
        }
    }

    @Override // B3.e
    public void onConsentInfoUpdateSuccess() {
        ((p) this.f16591b).success(null);
    }

    public t p(Map map) {
        AbstractC0603a.f(map, "Provided update data must not be null.");
        m mVar = new m(3, 4);
        C0011c p5 = mVar.p();
        l lVar = new l();
        for (Map.Entry entry : map.entrySet()) {
            C0074s a2 = C0074s.a((String) entry.getKey());
            Object value = entry.getValue();
            boolean z4 = value instanceof C0077v;
            H4.j jVar = a2.f1192a;
            if (z4) {
                p5.a(jVar);
            } else {
                I0 f7 = f(value, p5.c(jVar));
                if (f7 != null) {
                    p5.a(jVar);
                    lVar.g(jVar, f7);
                }
            }
        }
        return new t(lVar, new I4.f((HashSet) mVar.f1015c), Collections.unmodifiableList((ArrayList) mVar.f1016d), 4);
    }

    public Metadata q(F1.h hVar, X1.a aVar) {
        C0095a c0095a = (C0095a) this.f16591b;
        Metadata metadata = null;
        int i7 = 0;
        while (true) {
            try {
                hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
                c0095a.D(0);
                if (c0095a.v() != 4801587) {
                    break;
                }
                c0095a.E(3);
                int s7 = c0095a.s();
                int i8 = s7 + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy((byte[]) c0095a.f1465c, 0, bArr, 0, 10);
                    hVar.c(bArr, 10, s7, false);
                    metadata = new X1.c(aVar).h0(i8, bArr);
                } else {
                    hVar.b(s7, false);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        hVar.f2536f = 0;
        hVar.b(i7, false);
        return metadata;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ActionCodeSettings actionCodeSettings;
        C1036j c1036j = (C1036j) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) ((FirebaseUser) this.f16591b)).f11910c));
        String str = c1036j.f12681a;
        com.google.android.gms.common.internal.D.i(str);
        firebaseAuth.getClass();
        com.google.android.gms.common.internal.D.e(str);
        String str2 = firebaseAuth.f11857i;
        if (str2 != null) {
            actionCodeSettings = new ActionCodeSettings(new C0306n(1));
            actionCodeSettings.f11839y = str2;
        } else {
            actionCodeSettings = null;
        }
        return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, actionCodeSettings, str);
    }

    public String toString() {
        switch (this.f16590a) {
            case 0:
                return ((C1755w0) this.f16591b).toString();
            case 13:
                StringBuilder sb = new StringBuilder();
                String[] strArr = (String[]) this.f16591b;
                int length = strArr.length / 2;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = i7 * 2;
                    String str = null;
                    sb.append((i8 < 0 || i8 >= strArr.length) ? null : strArr[i8]);
                    sb.append(": ");
                    int i9 = i8 + 1;
                    if (i9 >= 0 && i9 < strArr.length) {
                        str = strArr[i9];
                    }
                    sb.append(str);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgai
    public I3.b zza() {
        BinderC0386l binderC0386l = (BinderC0386l) this.f16591b;
        return binderC0386l.Z(binderC0386l.f5516b, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb();
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.f16590a = i7;
        this.f16591b = obj;
    }

    public /* synthetic */ c(C1592a c1592a, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.f16590a = 25;
        this.f16591b = publicKeyCredentialCreationOptions;
    }

    public c(C1265b c1265b) {
        this.f16590a = 5;
        this.f16591b = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put("key", c1265b.f13986b.q());
        v4.l lVar = c1265b.f13985a;
        hashMap.put("value", lVar.f17186a.getValue());
        Object value = lVar.f17186a.e().getValue();
        hashMap.put(SentryThread.JsonKeys.PRIORITY, value instanceof Long ? Double.valueOf(((Long) value).longValue()) : value);
        if (r2 == 0) {
            hashMap.put("childKeys", new ArrayList());
        } else {
            String[] strArr = new String[r2];
            F f7 = new F(new C1264a(c1265b, lVar.iterator()), 3);
            int i7 = 0;
            while (f7.hasNext()) {
                strArr[i7] = ((C1265b) f7.next()).f13986b.q();
                i7++;
            }
            hashMap.put("childKeys", Arrays.asList(strArr));
        }
        ((HashMap) this.f16591b).put(SentryStackTrace.JsonKeys.SNAPSHOT, hashMap);
    }

    public c(int i7) {
        this.f16590a = i7;
        switch (i7) {
            case 6:
                this.f16591b = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            case 12:
                this.f16591b = new AtomicLong();
                break;
            case 18:
                this.f16591b = new SparseArray();
                break;
            case 20:
                this.f16591b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f16591b = new C0095a(10);
                break;
        }
    }

    public c(C0.I i7) {
        this.f16590a = 13;
        ArrayList arrayList = i7.f1233a;
        this.f16591b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public c(C0101g c0101g) {
        this.f16590a = 2;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0101g.f1485a).setFlags(c0101g.f1486b).setUsage(c0101g.f1487c);
        int i7 = v2.t.f17153a;
        if (i7 >= 29) {
            AbstractC0098d.a(usage, c0101g.f1488d);
        }
        if (i7 >= 32) {
            AbstractC0100f.a(usage, c0101g.f1489e);
        }
        this.f16591b = usage.build();
    }

    public c(String str, long j, I4.j jVar) {
        this.f16590a = 26;
        this.f16591b = new Uri.Builder().scheme("https").authority("flurry.mydashboard.oath.com").appendQueryParameter("device_session_id", str).appendQueryParameter("expires_in", String.valueOf(j)).appendQueryParameter("device_verifier", (String) jVar.f3681e).appendQueryParameter("lang", (String) jVar.f3682f).build();
    }
}
