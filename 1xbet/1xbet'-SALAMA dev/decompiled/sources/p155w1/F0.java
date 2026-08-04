package p155w1;

import A5.n;
import A5.q;
import A5.s;
import A5.y;
import B1.m;
import B4.V;
import C0.C0090i;
import D6.C0136t;
import D6.InterfaceC0112b0;
import E1.e;
import F.B;
import F.C;
import F.E;
import F.F;
import F.w;
import F.z;
import J2.f;
import K4.C0316c;
import K4.C0318e;
import K4.C0319f;
import K4.ComponentCallbacks2C0317d;
import K4.i;
import L4.h;
import M6.d;
import Q3.b;
import Q3.j;
import Q3.o;
import Q3.p;
import Q3.r;
import U5.P;
import U5.l0;
import W5.AbstractC0486a1;
import W5.I0;
import W5.Q0;
import W5.h2;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbo;
import com.google.android.gms.internal.consent_sdk.zzcs;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Message;
import j5.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import p010b0.C0733d;
import p010b0.C0739j;
import p010b0.C0742m;
import p010b0.O;
import p010b0.c0;
import p010b0.h0;
import p018c2.AbstractC0764j;
import p018c2.C0769o;
import p018c2.C0774u;
import p018c2.C0779z;
import p018c2.D;
import p018c2.I;
import p018c2.J;
import p031e1.k;
import p042f4.C0894c;
import p078l.a;
import p078l.g;
import p083l4.u;
import p083l4.x;
import p086m.A;
import p098n4.C0934g;
import p098n4.C0939l;
import p098n4.C0940m;
import p122r.l;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements f, q, J, e, Continuation, c, a, u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static F0 f17377f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17382e;

    public /* synthetic */ F0(int i7, boolean z4) {
        this.f17378a = i7;
    }

    public static synchronized F0 d() {
        try {
            if (f17377f == null) {
                f17377f = new F0(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new C0090i(7)));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17377f;
    }

    public static N0 h(Runnable runnable) {
        if (runnable instanceof G0) {
            return (N0) ((Runnable) ((G0) runnable).f17389a.get());
        }
        if (runnable instanceof N0) {
            return (N0) runnable;
        }
        runnable.getClass();
        return null;
    }

    public static File t() {
        File file;
        StringBuilder sb = new StringBuilder();
        Context context = AbstractC0998i1.f17749c;
        if (AbstractC0997i0.k(21)) {
            file = context.getNoBackupFilesDir();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getFilesDir().getPath());
            file = new File(k.i(sb2, File.separator, "no_backup"));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file.getPath());
        String str = File.separator;
        sb.append(new File(k.i(sb3, str, ".flurryNoBackup")).getPath());
        sb.append(str);
        sb.append("installationNum");
        return new File(sb.toString());
    }

    @Override // p018c2.J
    public void A(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        if (z(i7, d7)) {
            ((I) this.f17380c).g(c0774u, B(c0779z));
        }
    }

    public C0779z B(C0779z c0779z) {
        long j = c0779z.f10431f;
        long j3 = c0779z.f10432g;
        if (j == j && j3 == j3) {
            return c0779z;
        }
        return new C0779z(c0779z.f10426a, c0779z.f10427b, c0779z.f10428c, c0779z.f10429d, c0779z.f10430e, j, j3);
    }

    public void C(l0 l0Var) {
        synchronized (this.f17379b) {
            try {
                if (((l0) this.f17381d) != null) {
                    return;
                }
                this.f17381d = l0Var;
                boolean zIsEmpty = ((HashSet) this.f17380c).isEmpty();
                if (zIsEmpty) {
                    ((Q0) this.f17382e).f6937H.e(l0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void D(boolean z4) {
        synchronized (((ArrayList) this.f17382e)) {
            try {
                Iterator it = ((ArrayList) this.f17382e).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).accept(z4 ? i.f4021b : i.f4020a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void E() {
        Q0.a.v(1, "AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (x()) {
            D(true);
        }
    }

    public void F(Q3.a aVar) throws GeneralSecurityException {
        aVar.getClass();
        Q3.q qVar = new Q3.q(o.class, aVar.f5799a);
        HashMap map = (HashMap) this.f17381d;
        if (!map.containsKey(qVar)) {
            map.put(qVar, aVar);
            return;
        }
        Q3.a aVar2 = (Q3.a) map.get(qVar);
        if (aVar2.equals(aVar) && aVar.equals(aVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
    }

    public void G(b bVar) throws GeneralSecurityException {
        r rVar = new r(bVar.f5801a, o.class);
        HashMap map = (HashMap) this.f17380c;
        if (!map.containsKey(rVar)) {
            map.put(rVar, bVar);
            return;
        }
        b bVar2 = (b) map.get(rVar);
        if (bVar2.equals(bVar) && bVar.equals(bVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
    }

    @Override // p018c2.J
    public void H(int i7, D d7, C0779z c0779z) {
        if (z(i7, d7)) {
            ((I) this.f17380c).c(B(c0779z));
        }
    }

    public void I(j jVar) throws GeneralSecurityException {
        jVar.getClass();
        Q3.q qVar = new Q3.q(p.class, jVar.f5814a);
        HashMap map = (HashMap) this.f17382e;
        if (!map.containsKey(qVar)) {
            map.put(qVar, jVar);
            return;
        }
        j jVar2 = (j) map.get(qVar);
        if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
    }

    public void J(Q3.k kVar) throws GeneralSecurityException {
        r rVar = new r(kVar.f5815a, p.class);
        HashMap map = (HashMap) this.f17379b;
        if (!map.containsKey(rVar)) {
            map.put(rVar, kVar);
            return;
        }
        Q3.k kVar2 = (Q3.k) map.get(rVar);
        if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object K(p077k6.c cVar) throws Throwable {
        c0 c0Var;
        M6.a aVar;
        F0 f7;
        M6.a aVar2;
        Throwable th;
        F0 f8;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i7 = c0Var.f10020e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0Var.f10020e = i7 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object obj = c0Var.f10018c;
        j6.a aVar3 = j6.a.f14648a;
        int i8 = c0Var.f10020e;
        p044f6.i iVar = p044f6.i.f13014a;
        try {
            if (i8 == 0) {
                p003a.a.p0(obj);
                if (!(((C0136t) this.f17380c).x() instanceof InterfaceC0112b0)) {
                    return iVar;
                }
                c0Var.f10016a = this;
                aVar = (d) this.f17379b;
                c0Var.f10017b = aVar;
                c0Var.f10020e = 1;
                if (aVar.a(c0Var) == aVar3) {
                    return aVar3;
                }
                f7 = this;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = c0Var.f10017b;
                    f8 = c0Var.f10016a;
                    try {
                        p003a.a.p0(obj);
                        ((C0136t) f8.f17380c).C(iVar);
                        aVar2.b(null);
                        return iVar;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.b(null);
                        throw th;
                    }
                }
                M6.a aVar4 = c0Var.f10017b;
                f7 = c0Var.f10016a;
                p003a.a.p0(obj);
                aVar = aVar4;
            }
            if (!(((C0136t) f7.f17380c).x() instanceof InterfaceC0112b0)) {
                aVar.b(null);
                return iVar;
            }
            c0Var.f10016a = f7;
            c0Var.f10017b = aVar;
            c0Var.f10020e = 2;
            if (f7.u(c0Var) == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            f8 = f7;
            ((C0136t) f8.f17380c).C(iVar);
            aVar2.b(null);
            return iVar;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.b(null);
            throw th;
        }
    }

    public void L(Object obj, A5.c cVar) {
        ((A5.f) this.f17379b).k((String) this.f17380c, ((n) this.f17381d).a(obj), cVar == null ? null : new A5.a(0, this, cVar));
    }

    public void M(A5.b bVar) {
        String str = (String) this.f17380c;
        A5.f fVar = (A5.f) this.f17379b;
        V v6 = (V) this.f17382e;
        if (v6 != null) {
            fVar.n(str, bVar != null ? new P2(2, this, bVar) : null, v6);
        } else {
            fVar.c(str, bVar != null ? new P2(2, this, bVar) : null);
        }
    }

    @Override // p078l.a
    public boolean a(p078l.b bVar, p086m.k kVar) {
        g gVarV = v(bVar);
        l lVar = (l) this.f17382e;
        Menu a2 = (Menu) lVar.getOrDefault(kVar, null);
        if (a2 == null) {
            a2 = new A((Context) this.f17380c, kVar);
            lVar.put(kVar, a2);
        }
        return ((ActionMode.Callback) this.f17379b).onPrepareActionMode(gVarV, a2);
    }

    @Override // p083l4.u
    public void b(String str, String str2) {
        switch (this.f17378a) {
            case 17:
                p063i4.c cVarC = C0940m.c(str, str2);
                C0940m c0940m = (C0940m) this.f17382e;
                C0934g c0934g = (C0934g) this.f17379b;
                C0940m.d(c0940m, "onDisconnect().setValue", c0934g, cVarC);
                if (cVarC == null) {
                    c0940m.f15457e.c(c0934g, (v4.r) this.f17380c);
                }
                c0940m.i((p120q4.j) this.f17381d, cVarC, c0934g);
                break;
            default:
                p063i4.c cVarC2 = C0940m.c(str, str2);
                C0934g c0934g2 = (C0934g) this.f17379b;
                C0940m c0940m2 = (C0940m) this.f17382e;
                C0940m.d(c0940m2, "Transaction", c0934g2, cVarC2);
                ArrayList arrayList = new ArrayList();
                List<C0939l> list = (List) this.f17380c;
                if (cVarC2 != null) {
                    if (cVarC2.f13995a == -1) {
                        for (C0939l c0939l : list) {
                            if (c0939l.f15447d == 5) {
                                c0939l.f15447d = 6;
                            } else {
                                c0939l.f15447d = 2;
                            }
                        }
                    } else {
                        for (C0939l c0939l2 : list) {
                            c0939l2.f15447d = 6;
                            c0939l2.f15451y = cVarC2;
                        }
                    }
                    c0940m2.p(c0934g2);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C0940m c0940m3 = (C0940m) this.f17381d;
                        if (!zHasNext) {
                            c0940m2.n(c0940m2.f15458f.K(c0934g2));
                            C1017n0 c1017n0 = c0940m2.f15458f;
                            c0940m2.n(c1017n0);
                            c0940m2.r(c1017n0);
                            c0940m3.m(arrayList);
                            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                c0940m2.l((Runnable) arrayList2.get(i7));
                            }
                        } else {
                            C0939l c0939l3 = (C0939l) it.next();
                            c0939l3.f15447d = 4;
                            arrayList.addAll(c0940m2.f15465n.c(c0939l3.f15452z, false, false, c0940m2.f15454b));
                            v4.r rVar = c0939l3.f15443C;
                            C0934g c0934g3 = c0939l3.f15444a;
                            arrayList2.add(new x(4, c0939l3, new p063i4.b(new p063i4.f(c0940m3, c0934g3), v4.l.m(rVar)), false));
                            c0940m2.o(new p098n4.J(c0940m2, c0939l3.f15446c, p134s4.h.a(c0934g3)));
                        }
                    }
                }
                break;
        }
    }

    @Override // J2.f
    public void c(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f17379b);
        jsonWriter.name("verb").value((String) this.f17380c);
        jsonWriter.endObject();
        J2.g.e(jsonWriter, (Map) this.f17381d);
        byte[] bArr = (byte[]) this.f17382e;
        if (bArr != null) {
            jsonWriter.name(SentryLogEvent.JsonKeys.BODY).value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    @Override // p078l.a
    public boolean e(p078l.b bVar, p086m.k kVar) {
        g gVarV = v(bVar);
        l lVar = (l) this.f17382e;
        Menu a2 = (Menu) lVar.getOrDefault(kVar, null);
        if (a2 == null) {
            a2 = new A((Context) this.f17380c, kVar);
            lVar.put(kVar, a2);
        }
        return ((ActionMode.Callback) this.f17379b).onCreateActionMode(gVarV, a2);
    }

    @Override // j5.c
    public void f(Serializable serializable) {
        this.f17379b = serializable;
    }

    @Override // p078l.a
    public void g(p078l.b bVar) {
        ((ActionMode.Callback) this.f17379b).onDestroyActionMode(v(bVar));
    }

    public void i() {
        if (((p028d6.k) this.f17382e) == null) {
            this.f17382e = new p028d6.k(t(), "installationNum", 1, new C1013m0(26));
            byte[] bArrQ = q(s());
            if (bArrQ != null) {
                AbstractC1006k1.i(t());
                o(bArrQ);
            }
        }
    }

    @Override // p018c2.J
    public void j(int i7, D d7, C0774u c0774u, C0779z c0779z, IOException iOException, boolean z4) {
        if (z(i7, d7)) {
            ((I) this.f17380c).j(c0774u, B(c0779z), iOException, z4);
        }
    }

    @Override // p078l.a
    public boolean k(p078l.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f17379b).onActionItemClicked(v(bVar), new p086m.r((Context) this.f17380c, (K.a) menuItem));
    }

    public synchronized void l(Object obj, N0 n2) {
        if (obj == null) {
            return;
        }
        synchronized (this) {
            HashMap map = ((D0.i) this.f17379b).f1652a;
            List arrayList = (List) map.get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(obj, arrayList);
            }
            arrayList.add(n2);
            ((HashMap) this.f17380c).put(n2, obj);
            ((H0) this.f17382e).submit(n2);
        }
    }

    @Override // p018c2.J
    public void m(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        if (z(i7, d7)) {
            ((I) this.f17380c).l(c0774u, B(c0779z));
        }
    }

    public synchronized void n(N0 n2) {
        List list;
        Object obj = ((HashMap) this.f17380c).get(n2);
        synchronized (this) {
            try {
                D0.i iVar = (D0.i) this.f17379b;
                if (obj != null && (list = (List) iVar.f1652a.get(obj)) != null) {
                    list.remove(n2);
                    if (list.size() == 0) {
                        iVar.f1652a.remove(obj);
                    }
                }
                ((HashMap) this.f17380c).remove(n2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(byte[] bArr) {
        F f7;
        try {
            AbstractC1006k1.i(t());
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            C1010l1 c1010l1 = (C1010l1) this.f17381d;
            Key keyS = s();
            byte[] bArrDoFinal = null;
            if (bArr != null && keyS != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((M4.e) c1010l1.f17777a).s(bArr, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    Cipher cipher = Cipher.getInstance(L.g(2));
                    cipher.init(1, keyS, ivParameterSpec);
                    bArrDoFinal = cipher.doFinal(byteArray);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e7) {
                    e7.getMessage();
                }
            }
            if (bArrDoFinal != null) {
                f7 = new F(p136t.e.e(2), true, bArrDoFinal, bArr2);
            } else {
                f7 = new F(p136t.e.e(2), false, bArr, new byte[0]);
            }
            ((p028d6.k) this.f17382e).g(f7);
        } catch (Throwable th) {
            th.getMessage();
            Log.getStackTraceString(th);
        }
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        B3.h hVar;
        int i7 = 8;
        int i8 = 7;
        final int i9 = 1;
        final int i10 = 0;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "ConsentInformation#reset":
                w().reset();
                ((A5.p) rVar).success(null);
                break;
            case "UserMessagingPlatform#loadAndShowConsentFormIfRequired":
                final p121q5.c cVar = (p121q5.c) this.f17382e;
                if (cVar == null) {
                    ((A5.p) rVar).error("0", "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    final A5.p pVar = (A5.p) rVar;
                    final B3.b bVar = new B3.b() { // from class: N5.d
                        @Override // B3.b
                        public final void a(B3.i iVar) {
                            switch (i10) {
                                case 0:
                                    pVar.success(iVar);
                                    break;
                                default:
                                    pVar.success(iVar);
                                    break;
                            }
                        }
                    };
                    if (!zza.zza(cVar).zzb().canRequestAds()) {
                        zzbo zzboVarZzc = zza.zza(cVar).zzc();
                        zzcs.zza();
                        zzboVarZzc.zzb(new B3.k() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                            @Override // B3.k
                            public final void onConsentFormLoadSuccess(B3.c cVar2) {
                                cVar2.show(cVar, bVar);
                            }
                        }, new B3.j() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                            @Override // B3.j
                            public final void onConsentFormLoadFailure(B3.i iVar) {
                                bVar.a(iVar);
                            }
                        });
                    } else {
                        bVar.a(null);
                    }
                    break;
                }
                break;
            case "ConsentInformation#requestConsentInfoUpdate":
                if (((p121q5.c) this.f17382e) == null) {
                    ((A5.p) rVar).error("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    N5.b bVar2 = (N5.b) oVar.a(Message.JsonKeys.PARAMS);
                    if (bVar2 == null) {
                        hVar = new B3.h(new B3.g(i10));
                    } else {
                        p121q5.c cVar2 = (p121q5.c) this.f17382e;
                        B3.g gVar = new B3.g(i10);
                        Boolean bool = bVar2.f4782a;
                        if (bool != null) {
                            gVar.f1063b = bool.booleanValue();
                        }
                        N5.a aVar = bVar2.f4783b;
                        if (aVar != null) {
                            m mVar = new m(cVar2);
                            Integer num = aVar.f4780a;
                            if (num != null) {
                                mVar.f1014b = num.intValue();
                            }
                            ArrayList arrayList = aVar.f4781b;
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((ArrayList) mVar.f1015c).add((String) it.next());
                                }
                            }
                            gVar.f1064c = mVar.f();
                        }
                        hVar = new B3.h(gVar);
                    }
                    A5.p pVar2 = (A5.p) rVar;
                    w().requestConsentInfoUpdate((p121q5.c) this.f17382e, hVar, new p145u1.c(pVar2, i7), new C1052y0(pVar2, i8));
                    break;
                }
                break;
            case "ConsentForm#show":
                B3.c cVar3 = (B3.c) oVar.a("consentForm");
                if (cVar3 == null) {
                    ((A5.p) rVar).error("0", "ConsentForm#show", null);
                    break;
                } else {
                    cVar3.show((p121q5.c) this.f17382e, new N5.e((A5.p) rVar, i10));
                    break;
                }
                break;
            case "ConsentForm#dispose":
                B3.c cVar4 = (B3.c) oVar.a("consentForm");
                if (cVar4 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    ((N5.c) this.f17379b).f4784d.remove(Integer.valueOf(cVar4.hashCode()));
                }
                ((A5.p) rVar).success(null);
                break;
            case "UserMessagingPlatform#showPrivacyOptionsForm":
                p121q5.c cVar5 = (p121q5.c) this.f17382e;
                if (cVar5 == null) {
                    ((A5.p) rVar).error("0", "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    final A5.p pVar3 = (A5.p) rVar;
                    zza.zza(cVar5).zzc().zze(cVar5, new B3.b() { // from class: N5.d
                        @Override // B3.b
                        public final void a(B3.i iVar) {
                            switch (i9) {
                                case 0:
                                    pVar3.success(iVar);
                                    break;
                                default:
                                    pVar3.success(iVar);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case "ConsentInformation#isConsentFormAvailable":
                ((A5.p) rVar).success(Boolean.valueOf(w().isConsentFormAvailable()));
                break;
            case "UserMessagingPlatform#loadConsentForm":
                A5.p pVar4 = (A5.p) rVar;
                zza.zza((Context) this.f17380c).zzc().zzb(new V0(17, this, pVar4), new C1010l1(pVar4));
                break;
            case "ConsentInformation#getPrivacyOptionsRequirementStatus":
                int iOrdinal = w().getPrivacyOptionsRequirementStatus().ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        ((A5.p) rVar).success(1);
                    } else {
                        ((A5.p) rVar).success(2);
                    }
                    break;
                } else {
                    ((A5.p) rVar).success(0);
                    break;
                }
                break;
            case "ConsentInformation#canRequestAds":
                ((A5.p) rVar).success(Boolean.valueOf(w().canRequestAds()));
                break;
            case "ConsentInformation#getConsentStatus":
                ((A5.p) rVar).success(Integer.valueOf(w().getConsentStatus()));
                break;
            default:
                ((A5.p) rVar).notImplemented();
                break;
        }
    }

    @Override // j5.c
    public void p(String str, HashMap map) {
        this.f17381d = "sqlite_error";
        this.f17382e = str;
        this.f17380c = map;
    }

    public byte[] q(Key key) {
        int i7;
        Object objH;
        try {
            F f7 = (F) ((p028d6.k) this.f17382e).e();
            if (f7 == null) {
                return null;
            }
            byte[] bArr = f7.f17375c;
            if (!f7.f17373a) {
                return bArr;
            }
            byte[] bArr2 = f7.f17374b;
            int i8 = f7.f17376d;
            int[] iArrF = p136t.e.f(3);
            int length = iArrF.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i7 = 1;
                    break;
                }
                i7 = iArrF[i9];
                if (p136t.e.e(i7) == i8) {
                    break;
                }
                i9++;
            }
            if (bArr2 == null || bArr == null) {
                return null;
            }
            C1010l1 c1010l1 = (C1010l1) this.f17381d;
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            if (key != null) {
                try {
                    Cipher cipher = Cipher.getInstance(L.g(i7));
                    cipher.init(2, key, ivParameterSpec);
                    objH = ((M4.e) c1010l1.f17777a).h(new ByteArrayInputStream(cipher.doFinal(bArr)));
                } catch (InvalidAlgorithmParameterException e7) {
                    e = e7;
                    e.getMessage();
                    objH = null;
                } catch (InvalidKeyException e8) {
                    e = e8;
                    e.getMessage();
                    objH = null;
                } catch (NoSuchAlgorithmException e9) {
                    e = e9;
                    e.getMessage();
                    objH = null;
                } catch (BadPaddingException e10) {
                    e = e10;
                    e.getMessage();
                    objH = null;
                } catch (IllegalBlockSizeException e11) {
                    e = e11;
                    e.getMessage();
                    objH = null;
                } catch (NoSuchPaddingException e12) {
                    e = e12;
                    e.getMessage();
                    objH = null;
                }
            } else {
                objH = null;
            }
            return (byte[]) objH;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p018c2.J
    public void r(int i7, D d7, C0779z c0779z) {
        if (z(i7, d7)) {
            ((I) this.f17380c).m(B(c0779z));
        }
    }

    public Key s() {
        if (((R4.c) this.f17379b) == null) {
            R4.c cVar = new R4.c(25, false);
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                cVar.f6064b = keyStore;
                keyStore.load(null);
                if (!keyStore.containsAlias("fl.install.id.sec.key")) {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(new KeyGenParameterSpec.Builder("fl.install.id.sec.key", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setRandomizedEncryptionRequired(false).setDigests("SHA-256", "SHA-512").build());
                    keyGenerator.generateKey();
                }
            } catch (IOException e7) {
                e = e7;
                e.getMessage();
                Log.getStackTraceString(e);
            } catch (NullPointerException e8) {
                e = e8;
                e.getMessage();
                Log.getStackTraceString(e);
            } catch (InvalidAlgorithmParameterException e9) {
                e = e9;
                e.getMessage();
                Log.getStackTraceString(e);
            } catch (KeyStoreException e10) {
                e = e10;
                e.getMessage();
                Log.getStackTraceString(e);
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                e.getMessage();
                Log.getStackTraceString(e);
            } catch (NoSuchProviderException e12) {
                e = e12;
                e.getMessage();
                Log.getStackTraceString(e);
            } catch (CertificateException e13) {
                e = e13;
                e.getMessage();
                Log.getStackTraceString(e);
            } catch (Exception e14) {
                e14.getMessage();
                Log.getStackTraceString(e14);
            }
            this.f17379b = cVar;
        }
        KeyStore keyStore2 = (KeyStore) ((R4.c) this.f17379b).f6064b;
        if (keyStore2 == null) {
            return null;
        }
        try {
            return keyStore2.getKey("fl.install.id.sec.key", null);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f17379b;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f17380c;
        String str = (String) this.f17381d;
        C0894c c0894c = (C0894c) this.f17382e;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.D.i(exception);
        if (!zzadg.zzd(exception)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        if (firebaseAuth.m() == null) {
            o oVar = new o(firebaseAuth.f11849a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f11859l = oVar;
            }
        }
        o oVarM = firebaseAuth.m();
        return oVarM.r(str, Boolean.FALSE, recaptchaAction).continueWithTask(c0894c).continueWithTask(new p072k1.g(str, oVarM, recaptchaAction, c0894c));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(p077k6.c cVar) {
        C0739j c0739j;
        F0 f7;
        C0733d c0733d;
        if (cVar instanceof C0739j) {
            c0739j = (C0739j) cVar;
            int i7 = c0739j.f10057d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0739j.f10057d = i7 - Integer.MIN_VALUE;
            } else {
                c0739j = new C0739j(this, cVar);
            }
        } else {
            c0739j = new C0739j(this, cVar);
        }
        Object objF = c0739j.f10055b;
        j6.a aVar = j6.a.f14648a;
        int i8 = c0739j.f10057d;
        if (i8 == 0) {
            p003a.a.p0(objF);
            List list = (List) this.f17381d;
            O o7 = (O) this.f17382e;
            if (list == null || list.isEmpty()) {
                c0739j.f10054a = this;
                c0739j.f10057d = 1;
                objF = O.f(o7, false, c0739j);
                if (objF == aVar) {
                    return aVar;
                }
                f7 = this;
                c0733d = (C0733d) objF;
            } else {
                h0 h0VarG = o7.g();
                C0742m c0742m = new C0742m(o7, this, null);
                c0739j.f10054a = this;
                c0739j.f10057d = 2;
                objF = h0VarG.b(c0742m, c0739j);
                if (objF == aVar) {
                    return aVar;
                }
                f7 = this;
                c0733d = (C0733d) objF;
            }
        } else if (i8 == 1) {
            f7 = c0739j.f10054a;
            p003a.a.p0(objF);
            c0733d = (C0733d) objF;
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f7 = c0739j.f10054a;
            p003a.a.p0(objF);
            c0733d = (C0733d) objF;
        }
        ((O) f7.f17382e).f9971h.s(c0733d);
        return p044f6.i.f13014a;
    }

    public g v(p078l.b bVar) {
        ArrayList arrayList = (ArrayList) this.f17381d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            g gVar = (g) arrayList.get(i7);
            if (gVar != null && gVar.f14817b == bVar) {
                return gVar;
            }
        }
        g gVar2 = new g((Context) this.f17380c, bVar);
        arrayList.add(gVar2);
        return gVar2;
    }

    public zzj w() {
        zzj zzjVar = (zzj) this.f17381d;
        if (zzjVar != null) {
            return zzjVar;
        }
        zzj zzjVarZzb = zza.zza((Context) this.f17380c).zzb();
        this.f17381d = zzjVarZzb;
        return zzjVarZzb;
    }

    public boolean x() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.f17379b).getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // p018c2.J
    public void y(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        if (z(i7, d7)) {
            ((I) this.f17380c).e(c0774u, B(c0779z));
        }
    }

    public boolean z(int i7, D d7) {
        D dQ;
        AbstractC0764j abstractC0764j = (AbstractC0764j) this.f17382e;
        C0769o c0769o = (C0769o) this.f17379b;
        if (d7 != null) {
            dQ = abstractC0764j.q(c0769o, d7);
            if (dQ == null) {
                return false;
            }
        } else {
            dQ = null;
        }
        int iR = abstractC0764j.r(c0769o, i7);
        I i8 = (I) this.f17380c;
        if (i8.f10179a != iR || !t.a(i8.f10180b, dQ)) {
            this.f17380c = new I(abstractC0764j.f10298c.f10181c, iR, dQ, 0L);
        }
        m mVar = (m) this.f17381d;
        if (mVar.f1014b == iR && t.a((D) mVar.f1015c, dQ)) {
            return true;
        }
        this.f17381d = new m((CopyOnWriteArrayList) abstractC0764j.f10299d.f1016d, iR, dQ, 2);
        return true;
    }

    public /* synthetic */ F0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17378a = i7;
        this.f17379b = obj;
        this.f17380c = obj2;
        this.f17381d = obj3;
        this.f17382e = obj4;
    }

    public /* synthetic */ F0(C0940m c0940m, C0934g c0934g, Iterable iterable, Object obj, int i7) {
        this.f17378a = i7;
        this.f17382e = c0940m;
        this.f17379b = c0934g;
        this.f17380c = iterable;
        this.f17381d = obj;
    }

    public F0(TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue) {
        this.f17378a = 0;
        this.f17379b = new D0.i();
        this.f17380c = new HashMap();
        this.f17381d = new HashMap();
        H0 h6 = new H0(this, timeUnit, priorityBlockingQueue);
        this.f17382e = h6;
        h6.setRejectedExecutionHandler(new I0(this));
        h6.setThreadFactory(new ThreadFactoryC0966a1());
    }

    public F0(int i7) {
        this.f17378a = i7;
        switch (i7) {
            case 19:
                this.f17379b = null;
                this.f17380c = null;
                this.f17382e = null;
                M4.e eVar = new M4.e();
                C1010l1 c1010l1 = new C1010l1();
                c1010l1.f17777a = eVar;
                this.f17381d = c1010l1;
                break;
            default:
                this.f17380c = new HashMap();
                this.f17381d = new HashMap();
                this.f17379b = new HashMap();
                this.f17382e = new HashMap();
                break;
        }
    }

    public F0(A5.f fVar, Context context) {
        this.f17378a = 5;
        N5.c cVar = new N5.c();
        this.f17379b = cVar;
        new s(fVar, "plugins.flutter.io/google_mobile_ads/ump", new y(cVar), null).b(this);
        this.f17380c = context;
    }

    public F0(Q3.s sVar) {
        this.f17378a = 6;
        this.f17380c = new HashMap(sVar.f5833a);
        this.f17381d = new HashMap(sVar.f5834b);
        this.f17379b = new HashMap(sVar.f5835c);
        this.f17382e = new HashMap(sVar.f5836d);
    }

    public F0(Context context) {
        this.f17378a = 4;
        this.f17382e = new ArrayList();
        p113p3.f.O("Context must be non-null", context != null, new Object[0]);
        this.f17379b = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f17380c = connectivityManager;
        Application application = (Application) context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new C0316c(this, atomicBoolean));
        application.registerComponentCallbacks(new ComponentCallbacks2C0317d(atomicBoolean));
        if (connectivityManager != null) {
            C0318e c0318e = new C0318e(this, 0);
            connectivityManager.registerDefaultNetworkCallback(c0318e);
            this.f17381d = new A0.f(27, this, c0318e);
        } else {
            C0319f c0319f = new C0319f(this, 0);
            context.registerReceiver(c0319f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f17381d = new A0.f(28, this, c0319f);
        }
    }

    public F0(SharedPreferences sharedPreferences, Map map) {
        this.f17378a = 11;
        this.f17379b = p027d5.a.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", "RSA_ECB_PKCS1Padding"));
        this.f17380c = p027d5.c.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", "AES_CBC_PKCS7Padding"));
        Object obj = map.get("keyCipherAlgorithm");
        p027d5.a aVarValueOf = p027d5.a.valueOf(obj != null ? obj.toString() : "RSA_ECB_PKCS1Padding");
        int i7 = aVarValueOf.f12411b;
        int i8 = Build.VERSION.SDK_INT;
        this.f17381d = i7 > i8 ? p027d5.a.RSA_ECB_PKCS1Padding : aVarValueOf;
        Object obj2 = map.get("storageCipherAlgorithm");
        p027d5.c cVarValueOf = p027d5.c.valueOf(obj2 != null ? obj2.toString() : "AES_CBC_PKCS7Padding");
        this.f17382e = cVarValueOf.f12415b > i8 ? p027d5.c.AES_CBC_PKCS7Padding : cVarValueOf;
    }

    public F0(w wVar) {
        Bundle bundle;
        int i7;
        ArrayList arrayList;
        Bundle bundle2;
        int i8;
        this.f17378a = 2;
        new ArrayList();
        this.f17382e = new Bundle();
        this.f17381d = wVar;
        Context context = wVar.f2456a;
        this.f17379b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17380c = C.a(context, wVar.f2471q);
        } else {
            this.f17380c = new Notification.Builder(wVar.f2456a);
        }
        Notification notification = wVar.f2473s;
        Resources resources = null;
        ((Notification.Builder) this.f17380c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(wVar.f2460e).setContentText(wVar.f2461f).setContentInfo(null).setContentIntent(wVar.f2462g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f17380c;
        IconCompat iconCompat = wVar.f2463h;
        F.A.b(builder, iconCompat == null ? null : J.c.c(iconCompat, context));
        ((Notification.Builder) this.f17380c).setSubText(wVar.f2466l).setUsesChronometer(false).setPriority(wVar.f2464i);
        for (F.q qVar : wVar.f2457b) {
            if (qVar.f2446b == null && (i8 = qVar.f2449e) != 0) {
                qVar.f2446b = IconCompat.d(null, "", i8);
            }
            IconCompat iconCompat2 = qVar.f2446b;
            Notification.Action.Builder builderA = F.A.a(iconCompat2 != null ? J.c.c(iconCompat2, null) : null, qVar.f2450f, qVar.f2451g);
            Bundle bundle3 = qVar.f2445a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z4 = qVar.f2447c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            int i9 = Build.VERSION.SDK_INT;
            B.a(builderA, z4);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i9 >= 28) {
                F.D.b(builderA, 0);
            }
            if (i9 >= 29) {
                E.c(builderA, false);
            }
            if (i9 >= 31) {
                F.a(builderA, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", qVar.f2448d);
            F.y.b(builderA, bundle2);
            F.y.a((Notification.Builder) this.f17380c, F.y.d(builderA));
        }
        Bundle bundle4 = wVar.f2468n;
        if (bundle4 != null) {
            ((Bundle) this.f17382e).putAll(bundle4);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f17380c).setShowWhen(wVar.j);
        F.y.i((Notification.Builder) this.f17380c, wVar.f2467m);
        F.y.g((Notification.Builder) this.f17380c, null);
        F.y.j((Notification.Builder) this.f17380c, null);
        F.y.h((Notification.Builder) this.f17380c, false);
        z.b((Notification.Builder) this.f17380c, null);
        z.c((Notification.Builder) this.f17380c, wVar.f2469o);
        z.f((Notification.Builder) this.f17380c, wVar.f2470p);
        z.d((Notification.Builder) this.f17380c, null);
        z.e((Notification.Builder) this.f17380c, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = wVar.f2474t;
        ArrayList arrayList3 = wVar.f2458c;
        if (i10 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    p122r.c cVar = new p122r.c(arrayList2.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                z.a((Notification.Builder) this.f17380c, (String) it2.next());
            }
        }
        ArrayList arrayList4 = wVar.f2459d;
        if (arrayList4.size() > 0) {
            if (wVar.f2468n == null) {
                wVar.f2468n = new Bundle();
            }
            Bundle bundle5 = wVar.f2468n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i11 = 0;
            while (i11 < arrayList4.size()) {
                String string = Integer.toString(i11);
                F.q qVar2 = (F.q) arrayList4.get(i11);
                Bundle bundle8 = new Bundle();
                if (qVar2.f2446b == null && (i7 = qVar2.f2449e) != 0) {
                    qVar2.f2446b = IconCompat.d(resources, "", i7);
                }
                IconCompat iconCompat3 = qVar2.f2446b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.e() : 0);
                bundle8.putCharSequence("title", qVar2.f2450f);
                bundle8.putParcelable("actionIntent", qVar2.f2451g);
                Bundle bundle9 = qVar2.f2445a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", qVar2.f2447c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", qVar2.f2448d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i11++;
                resources = null;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (wVar.f2468n == null) {
                wVar.f2468n = new Bundle();
            }
            wVar.f2468n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f17382e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i12 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f17380c).setExtras(wVar.f2468n);
        B.e((Notification.Builder) this.f17380c, null);
        if (i12 >= 26) {
            C.b((Notification.Builder) this.f17380c, 0);
            C.e((Notification.Builder) this.f17380c, null);
            C.f((Notification.Builder) this.f17380c, null);
            C.g((Notification.Builder) this.f17380c, 0L);
            C.d((Notification.Builder) this.f17380c, 0);
            if (!TextUtils.isEmpty(wVar.f2471q)) {
                ((Notification.Builder) this.f17380c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i12 >= 29) {
            E.a((Notification.Builder) this.f17380c, wVar.f2472r);
            E.b((Notification.Builder) this.f17380c, null);
        }
    }

    public F0(Typeface typeface, p052h0.b bVar) {
        int i7;
        int i8;
        this.f17378a = 14;
        this.f17382e = typeface;
        this.f17379b = bVar;
        this.f17381d = new p046g0.r(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i9 = iA + bVar.f5025a;
            i7 = ((ByteBuffer) bVar.f5028d).getInt(((ByteBuffer) bVar.f5028d).getInt(i9) + i9);
        } else {
            i7 = 0;
        }
        this.f17380c = new char[i7 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i10 = iA2 + bVar.f5025a;
            i8 = ((ByteBuffer) bVar.f5028d).getInt(((ByteBuffer) bVar.f5028d).getInt(i10) + i10);
        } else {
            i8 = 0;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            p046g0.n nVar = new p046g0.n(this, i11);
            p052h0.a aVarC = nVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.f5028d).getInt(iA3 + aVarC.f5025a) : 0, (char[]) this.f17380c, i11 * 2);
            if (nVar.b() > 0) {
                ((p046g0.r) this.f17381d).a(nVar, 0, nVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public F0(h2 h2Var, I0 i7) {
        this.f17378a = 7;
        this.f17382e = h2Var;
        this.f17379b = i7;
        P p5 = (P) h2Var.f7232b;
        String str = (String) h2Var.f7233c;
        U5.O oB = p5.b(str);
        this.f17381d = oB;
        if (oB != null) {
            this.f17380c = oB.d(i7);
            return;
        }
        throw new IllegalStateException(AbstractC0486a1.h("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
    }

    public F0(Context context, ActionMode.Callback callback) {
        this.f17378a = 16;
        this.f17380c = context;
        this.f17379b = callback;
        this.f17381d = new ArrayList();
        this.f17382e = new l();
    }

    public F0(AbstractC0764j abstractC0764j, C0769o c0769o) {
        this.f17378a = 10;
        this.f17382e = abstractC0764j;
        this.f17380c = new I(abstractC0764j.f10298c.f10181c, 0, null, 0L);
        this.f17381d = new m((CopyOnWriteArrayList) abstractC0764j.f10299d.f1016d, 0, (Object) null, 2);
        this.f17379b = c0769o;
    }

    public F0(O o7, List list) {
        this.f17378a = 9;
        this.f17382e = o7;
        this.f17379b = M6.e.a();
        this.f17380c = D6.E.a();
        this.f17381d = p050g6.h.a1(list);
    }

    public F0(String str, String[] strArr, String str2, p174z5.q qVar) {
        this.f17378a = 20;
        this.f17379b = str;
        this.f17380c = strArr;
        this.f17382e = str2;
        this.f17381d = qVar;
    }

    public F0(Q0 q1) {
        this.f17378a = 8;
        this.f17382e = q1;
        this.f17379b = new Object();
        this.f17380c = new HashSet();
    }
}
