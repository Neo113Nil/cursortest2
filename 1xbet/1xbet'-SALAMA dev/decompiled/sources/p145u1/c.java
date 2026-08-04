package p145u1;

import A1.C0011c;
import A5.p;
import B1.m;
import B3.e;
import B3.j;
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
import I4.a;
import I4.g;
import I4.o;
import P.InterfaceC0361q;
import P2.BinderC0386l;
import W3.h;
import Y4.C0567d;
import Y4.C0569e;
import Y4.H0;
import Y4.I0;
import Y4.K;
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
import androidx.appcompat.widget.C0623j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.fragment.app.I;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.common.internal.InterfaceC0809e;
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
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
import io.sentry.MeasurementUnit;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.io.EOFException;
import java.io.InterruptedIOException;
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
import p086m.i;
import p086m.k;
import p098n4.C;
import p098n4.C0929b;
import p098n4.C0934g;
import p098n4.D;
import p098n4.s;
import p113p3.f;
import p120q4.b;
import p155w1.AbstractC0997i0;
import p155w1.C1040u0;
import p155w1.C1046w0;
import p155w1.C1050x1;
import p155w1.C1052y0;
import p155w1.C1055z0;
import p155w1.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e, zzgai, h, i, InterfaceC0809e, Continuation, f1, b, InterfaceC0797s, j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f16595c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16597b;

    public /* synthetic */ c(int i7, boolean z4) {
        this.f16596a = i7;
    }

    public static synchronized c g() {
        try {
            if (f16595c == null) {
                if (!r.f17846z.get()) {
                    AbstractC0997i0.q("Flurry SDK must be initialized before starting config");
                }
                c cVar = new c(0, false);
                cVar.f16597b = C1046w0.h();
                f16595c = cVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16595c;
    }

    public static I0 o(Timestamp timestamp) {
        int i7 = (timestamp.f11829b / zzbbd.zzq.zzf) * zzbbd.zzq.zzf;
        H0 h0S = I0.S();
        y0 y0VarA = z0.A();
        y0VarA.f(timestamp.f11828a);
        y0VarA.d();
        z0.w((z0) y0VarA.f12096b, i7);
        h0S.l(y0VarA);
        return (I0) h0S.b();
    }

    @Override // W3.h
    public Object R(String str) throws GeneralSecurityException {
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
                return ((W3.j) this.f16597b).d(str, (Provider) it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // p120q4.b
    public Object a(C0934g c0934g, Object obj, Object obj2) {
        switch (this.f16596a) {
            case 22:
                return ((C0929b) obj2).l(((C0934g) this.f16597b).m(c0934g), (v4.r) obj);
            case 23:
                s sVar = (s) obj;
                boolean zIsEmpty = c0934g.isEmpty();
                D d7 = (D) this.f16597b;
                if (!zIsEmpty && sVar.g()) {
                    p134s4.h hVar = sVar.d().f16180a;
                    C c3 = d7.f15370f;
                    p134s4.h hVarK = D.k(hVar);
                    d7.m(hVar);
                    c3.d(hVarK);
                    return null;
                }
                Iterator it = sVar.e().iterator();
                while (it.hasNext()) {
                    p134s4.h hVar2 = ((p134s4.i) it.next()).f16180a;
                    C c4 = d7.f15370f;
                    p134s4.h hVarK2 = D.k(hVar2);
                    d7.m(hVar2);
                    c4.d(hVarK2);
                }
                return null;
            default:
                ((ArrayList) this.f16597b).add(obj);
                return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
    public void accept(Object obj, Object obj2) {
        ((zzs) ((zzp) obj).getService()).zzc(new p133s3.b((TaskCompletionSource) obj2), (PublicKeyCredentialCreationOptions) this.f16597b);
    }

    @Override // p086m.i
    public void b(k kVar) {
        Toolbar toolbar = (Toolbar) this.f16597b;
        C0623j c0623j = toolbar.f8532a.f8239K;
        if (c0623j == null || !c0623j.k()) {
            Iterator it = toolbar.f8533a0.f5095b.iterator();
            while (it.hasNext()) {
                ((I) ((InterfaceC0361q) it.next())).f9360a.t();
            }
        }
        C1052y0 c1052y0 = toolbar.f8545i0;
        if (c1052y0 != null) {
            c1052y0.b(kVar);
        }
    }

    public synchronized void c() {
        Timer timer = (Timer) this.f16597b;
        if (timer != null) {
            timer.cancel();
            this.f16597b = null;
        }
    }

    public l d(Object obj, C0011c c0011c) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        I0 i0K = k(L4.k.b(obj, L4.j.f4371d), c0011c);
        if (i0K.R() == 11) {
            return new l(i0K);
        }
        H5.k kVar = L4.r.f4389a;
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: ".concat(obj.getClass().getName()));
    }

    @Override // p086m.i
    public boolean e(k kVar, MenuItem menuItem) {
        C1052y0 c1052y0 = ((Toolbar) this.f16597b).f8545i0;
        return false;
    }

    public I0 f(Object obj, C0011c c0011c) {
        return k(L4.k.b(obj, L4.j.f4371d), c0011c);
    }

    public String h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16597b;
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
                        if (type == 7) {
                            return "bluetooth";
                        }
                        if (type != 9) {
                            return type != 17 ? MeasurementUnit.NONE : "vpn";
                        }
                        return "ethernet";
                    }
                }
            }
            return "wifi";
        }
        return "mobile";
    }

    public String i(String str, String str2) {
        C1040u0 c1040u0;
        C1046w0 c1046w0 = (C1046w0) this.f16597b;
        if (c1046w0.f17916z == null) {
            c1046w0.n();
            c1046w0.f17916z = new p028d6.k(19, c1046w0.f17906A, c1046w0.f17907B);
        }
        p028d6.k kVar = c1046w0.f17916z;
        C1055z0 c1055z0 = C1055z0.f17948d;
        io.flutter.view.r rVar = (io.flutter.view.r) kVar.f12448c;
        C1040u0 c1040u1 = null;
        if (c1055z0 != null) {
            Map map = (Map) ((HashMap) rVar.f14358c).get(c1055z0);
            if (map == null) {
                c1040u0 = null;
                break;
            }
            c1040u0 = (C1040u0) map.get(str);
        } else {
            Iterator it = ((HashMap) rVar.f14358c).values().iterator();
            do {
                if (!it.hasNext()) {
                    c1040u0 = null;
                    break;
                }
                c1040u0 = (C1040u0) ((Map) it.next()).get(str);
            } while (c1040u0 == null);
        }
        if (c1040u0 == null) {
            ((V) kVar.f12447b).getClass();
        } else {
            c1040u1 = c1040u0;
        }
        return c1040u1 != null ? c1040u1.a() : str2;
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
        boolean z4 = true;
        int i7 = 2;
        boolean z7 = obj instanceof Map;
        m mVar = (m) c0011c.f333c;
        H4.j jVar = (H4.j) c0011c.f334d;
        Comparable comparable = null;
        Object[] objArr = 0;
        if (z7) {
            Map map = (Map) obj;
            if (map.isEmpty()) {
                if (jVar != null && !jVar.isEmpty()) {
                    c0011c.a(jVar);
                }
                H0 h0S = I0.S();
                h0S.j(K.w());
                return (I0) h0S.b();
            }
            Y4.I iB = K.B();
            for (Map.Entry entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw c0011c.e(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                C0011c c0011c2 = new C0011c(mVar, jVar == null ? null : (H4.j) jVar.b(str), objArr == true ? 1 : 0, i7);
                c0011c2.m(str);
                I0 i0K = k(value, c0011c2);
                if (i0K != null) {
                    iB.f(i0K, str);
                }
            }
            H0 h0S2 = I0.S();
            h0S2.i(iB);
            return (I0) h0S2.b();
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
                    f.O("FieldValue.delete() at the top level should have already been handled.", jVar.f3312a.size() > 0, new Object[0]);
                    throw c0011c.e("FieldValue.delete() can only appear at the top level of your update data");
                }
                c0011c.a(jVar);
            } else if (abstractC0080y instanceof C0079x) {
                c0011c.b(jVar, o.f3691a);
            } else if (abstractC0080y instanceof C0076u) {
                c0011c.b(jVar, new I4.b(j(((C0076u) abstractC0080y).f1194c)));
            } else if (abstractC0080y instanceof C0075t) {
                c0011c.b(jVar, new a(j(((C0075t) abstractC0080y).f1193c)));
            } else {
                if (!(abstractC0080y instanceof C0078w)) {
                    H5.k kVar = L4.r.f4389a;
                    f.F("Unknown FieldValue type: %s", abstractC0080y == null ? "null" : abstractC0080y.getClass().getName());
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
            C0567d c0567dB = C0569e.B();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                I0 i0K2 = k(it.next(), new C0011c(mVar, comparable, z4, i7));
                if (i0K2 == null) {
                    H0 h0S3 = I0.S();
                    h0S3.d();
                    I0.C((I0) h0S3.f12096b);
                    i0K2 = (I0) h0S3.b();
                }
                c0567dB.d();
                C0569e.v((C0569e) c0567dB.f12096b, i0K2);
            }
            H0 h0S4 = I0.S();
            h0S4.f(c0567dB);
            return (I0) h0S4.b();
        }
        if (obj == null) {
            H0 h0S5 = I0.S();
            h0S5.d();
            I0.C((I0) h0S5.f12096b);
            return (I0) h0S5.b();
        }
        if (obj instanceof Integer) {
            H0 h0S6 = I0.S();
            h0S6.h(((Integer) obj).intValue());
            return (I0) h0S6.b();
        }
        if (obj instanceof Long) {
            H0 h0S7 = I0.S();
            h0S7.h(((Long) obj).longValue());
            return (I0) h0S7.b();
        }
        if (obj instanceof Float) {
            H0 h0S8 = I0.S();
            h0S8.g(((Float) obj).doubleValue());
            return (I0) h0S8.b();
        }
        if (obj instanceof Double) {
            H0 h0S9 = I0.S();
            h0S9.g(((Double) obj).doubleValue());
            return (I0) h0S9.b();
        }
        if (obj instanceof Boolean) {
            H0 h0S10 = I0.S();
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            h0S10.d();
            I0.D((I0) h0S10.f12096b, zBooleanValue);
            return (I0) h0S10.b();
        }
        if (obj instanceof String) {
            H0 h0S11 = I0.S();
            h0S11.k((String) obj);
            return (I0) h0S11.b();
        }
        if (obj instanceof Date) {
            return o(new Timestamp((Date) obj));
        }
        if (obj instanceof Timestamp) {
            return o((Timestamp) obj);
        }
        if (obj instanceof M) {
            M m7 = (M) obj;
            H0 h0S12 = I0.S();
            p015b5.a aVarA = p015b5.b.A();
            aVarA.d();
            p015b5.b.v((p015b5.b) aVarA.f12096b, m7.f1116a);
            aVarA.d();
            p015b5.b.w((p015b5.b) aVarA.f12096b, m7.f1117b);
            h0S12.d();
            I0.z((I0) h0S12.f12096b, (p015b5.b) aVarA.b());
            return (I0) h0S12.b();
        }
        if (obj instanceof C0063g) {
            H0 h0S13 = I0.S();
            AbstractC0867k abstractC0867k = ((C0063g) obj).f1159a;
            h0S13.d();
            I0.x((I0) h0S13.f12096b, abstractC0867k);
            return (I0) h0S13.b();
        }
        if (!(obj instanceof C0070n)) {
            if (!(obj instanceof j0)) {
                if (obj.getClass().isArray()) {
                    throw c0011c.e("Arrays are not supported; use a List instead");
                }
                H5.k kVar2 = L4.r.f4389a;
                throw c0011c.e("Unsupported type: ".concat(obj.getClass().getName()));
            }
            Y4.I iB2 = K.B();
            iB2.f(H4.o.f3339f, "__type__");
            double[] dArr = ((j0) obj).f1167a;
            ArrayList arrayList = new ArrayList(dArr.length);
            for (int i9 = 0; i9 < dArr.length; i9++) {
                arrayList.add(i9, Double.valueOf(dArr[i9]));
            }
            iB2.f(k(arrayList, c0011c), "value");
            H0 h0S14 = I0.S();
            h0S14.i(iB2);
            return (I0) h0S14.b();
        }
        C0070n c0070n = (C0070n) obj;
        H4.f fVar = (H4.f) this.f16597b;
        String str2 = fVar.f3314b;
        String str3 = fVar.f3313a;
        FirebaseFirestore firebaseFirestore = c0070n.f1180b;
        if (firebaseFirestore != null) {
            H4.f fVar2 = firebaseFirestore.f11964c;
            if (!fVar2.equals(fVar)) {
                throw c0011c.e("Document reference is for database " + fVar2.f3313a + "/" + fVar2.f3314b + " but should be for database " + str3 + "/" + str2);
            }
        }
        H0 h0S15 = I0.S();
        String strD = c0070n.d();
        StringBuilder sbL = p031e1.k.l("projects/", str3, "/databases/", str2, "/documents/");
        sbL.append(strD);
        String string = sbL.toString();
        h0S15.d();
        I0.y((I0) h0S15.f12096b, string);
        return (I0) h0S15.b();
    }

    public C1050x1 l(Object obj, I4.f fVar) {
        m mVar = new m(2, 4);
        l lVarD = d(obj, mVar.p());
        HashSet hashSet = (HashSet) mVar.f1015c;
        ArrayList<g> arrayList = (ArrayList) mVar.f1016d;
        if (fVar == null) {
            return new C1050x1(lVarD, new I4.f(hashSet), Collections.unmodifiableList(arrayList), 3);
        }
        HashSet<H4.j> hashSet2 = fVar.f3667a;
        for (H4.j jVar : hashSet2) {
            Iterator it = hashSet.iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            throw new IllegalArgumentException("Field '" + jVar.c() + "' is specified in your field mask but not in your input data.");
                        }
                    } while (!jVar.m(((g) it2.next()).f3668a));
                }
            } while (!jVar.m((H4.j) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (g gVar : arrayList) {
            H4.j jVar2 = gVar.f3668a;
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                if (((H4.j) it3.next()).m(jVar2)) {
                    arrayList2.add(gVar);
                    break;
                }
            }
        }
        return new C1050x1(lVarD, fVar, Collections.unmodifiableList(arrayList2), 3);
    }

    public I0 m(Object obj, boolean z4) {
        m mVar = new m(z4 ? 5 : 4, 4);
        I0 i0F = f(obj, mVar.p());
        f.O("Parsed data should not be null.", i0F != null, new Object[0]);
        f.O("Field transforms should have been disallowed.", ((ArrayList) mVar.f1016d).isEmpty(), new Object[0]);
        return i0F;
    }

    public C1050x1 n(Object obj) {
        m mVar = new m(1, 4);
        return new C1050x1(d(obj, mVar.p()), null, Collections.unmodifiableList((ArrayList) mVar.f1016d), 3);
    }

    @Override // B3.j
    public void onConsentFormLoadFailure(B3.i iVar) {
        String strValueOf = String.valueOf(iVar.f1067a);
        String str = iVar.f1068b;
        y1.a aVar = (y1.a) this.f16597b;
        aVar.getClass();
        try {
            aVar.f18135c.error(strValueOf, str, "");
        } catch (Exception unused) {
        }
    }

    @Override // B3.e
    public void onConsentInfoUpdateSuccess() {
        ((p) this.f16597b).success(null);
    }

    public t p(Map map) {
        p003a.a.f(map, "Provided update data must not be null.");
        m mVar = new m(3, 4);
        C0011c c0011cP = mVar.p();
        l lVar = new l();
        for (Map.Entry entry : map.entrySet()) {
            C0074s c0074sA = C0074s.a((String) entry.getKey());
            Object value = entry.getValue();
            boolean z4 = value instanceof C0077v;
            H4.j jVar = c0074sA.f1192a;
            if (z4) {
                c0011cP.a(jVar);
            } else {
                I0 i0F = f(value, c0011cP.c(jVar));
                if (i0F != null) {
                    c0011cP.a(jVar);
                    lVar.g(jVar, i0F);
                }
            }
        }
        return new t(lVar, new I4.f((HashSet) mVar.f1015c), Collections.unmodifiableList((ArrayList) mVar.f1016d), 4);
    }

    public Metadata q(F1.h hVar, X1.a aVar) throws EOFException, InterruptedIOException {
        C0095a c0095a = (C0095a) this.f16597b;
        Metadata metadataH0 = null;
        int i7 = 0;
        while (true) {
            try {
                hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
                c0095a.D(0);
                if (c0095a.v() != 4801587) {
                    break;
                }
                c0095a.E(3);
                int iS = c0095a.s();
                int i8 = iS + 10;
                if (metadataH0 == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy((byte[]) c0095a.f1465c, 0, bArr, 0, 10);
                    hVar.c(bArr, 10, iS, false);
                    metadataH0 = new X1.c(aVar).h0(i8, bArr);
                } else {
                    hVar.b(iS, false);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        hVar.f2536f = 0;
        hVar.b(i7, false);
        return metadataH0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ActionCodeSettings actionCodeSettings;
        p034e4.j jVar = (p034e4.j) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) ((FirebaseUser) this.f16597b)).f11910c));
        String str = jVar.f12687a;
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
        switch (this.f16596a) {
            case 0:
                return ((C1046w0) this.f16597b).toString();
            case 13:
                StringBuilder sb = new StringBuilder();
                String[] strArr = (String[]) this.f16597b;
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
        BinderC0386l binderC0386l = (BinderC0386l) this.f16597b;
        return binderC0386l.Z(binderC0386l.f5516b, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb();
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.f16596a = i7;
        this.f16597b = obj;
    }

    public /* synthetic */ c(p133s3.a aVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.f16596a = 25;
        this.f16597b = publicKeyCredentialCreationOptions;
    }

    public c(p063i4.b bVar) {
        this.f16596a = 5;
        this.f16597b = new HashMap();
        HashMap map = new HashMap();
        map.put("key", bVar.f13992b.q());
        v4.l lVar = bVar.f13991a;
        map.put("value", lVar.f17192a.getValue());
        v4.r rVar = lVar.f17192a;
        Object value = rVar.e().getValue();
        map.put(SentryThread.JsonKeys.PRIORITY, value instanceof Long ? Double.valueOf(((Long) value).longValue()) : value);
        int iK = rVar.k();
        if (iK == 0) {
            map.put("childKeys", new ArrayList());
        } else {
            String[] strArr = new String[iK];
            F f7 = new F(new p063i4.a(bVar, lVar.iterator()), 3);
            int i7 = 0;
            while (f7.hasNext()) {
                strArr[i7] = ((p063i4.b) f7.next()).f13992b.q();
                i7++;
            }
            map.put("childKeys", Arrays.asList(strArr));
        }
        ((HashMap) this.f16597b).put(SentryStackTrace.JsonKeys.SNAPSHOT, map);
    }

    public c(int i7) {
        this.f16596a = i7;
        switch (i7) {
            case 6:
                this.f16597b = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            case 12:
                this.f16597b = new AtomicLong();
                break;
            case 18:
                this.f16597b = new SparseArray();
                break;
            case 20:
                this.f16597b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f16597b = new C0095a(10);
                break;
        }
    }

    public c(C0.I i7) {
        this.f16596a = 13;
        ArrayList arrayList = i7.f1233a;
        this.f16597b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public c(C0101g c0101g) {
        this.f16596a = 2;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0101g.f1485a).setFlags(c0101g.f1486b).setUsage(c0101g.f1487c);
        int i7 = p151v2.t.f17159a;
        if (i7 >= 29) {
            AbstractC0098d.a(usage, c0101g.f1488d);
        }
        if (i7 >= 32) {
            AbstractC0100f.a(usage, c0101g.f1489e);
        }
        this.f16597b = usage.build();
    }

    public c(String str, long j, I4.j jVar) {
        this.f16596a = 26;
        this.f16597b = new Uri.Builder().scheme("https").authority("flurry.mydashboard.oath.com").appendQueryParameter("device_session_id", str).appendQueryParameter("expires_in", String.valueOf(j)).appendQueryParameter("device_verifier", (String) jVar.f3681e).appendQueryParameter("lang", (String) jVar.f3682f).build();
    }
}
