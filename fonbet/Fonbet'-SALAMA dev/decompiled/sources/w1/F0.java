package w1;

import B3.b;
import B3.c;
import B3.i;
import C0.C0090i;
import D6.C0136t;
import D6.InterfaceC0112b0;
import K4.C0316c;
import K4.C0318e;
import K4.C0319f;
import K4.ComponentCallbacks2C0317d;
import W5.AbstractC0486a1;
import a.AbstractC0603a;
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
import b0.C0756d;
import b0.C0762j;
import b0.C0765m;
import c2.AbstractC0804j;
import c2.C0809o;
import c2.C0814u;
import c2.C0819z;
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
import d5.EnumC0966a;
import d6.C0977k;
import f4.C1091c;
import f6.C1116i;
import g6.AbstractC1159h;
import h0.C1175a;
import h0.C1176b;
import i4.C1265b;
import i4.C1266c;
import i4.C1269f;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Message;
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
import k6.AbstractC1356c;
import l.AbstractC1364b;
import l.C1369g;
import l.InterfaceC1363a;
import m.MenuC1413A;
import n4.C1473g;
import n4.C1478l;
import n4.C1479m;
import q5.AbstractActivityC1559c;

/* loaded from: classes.dex */
public final class F0 implements J2.f, A5.q, c2.J, E1.e, Continuation, j5.c, InterfaceC1363a, l4.u {

    /* renamed from: f, reason: collision with root package name */
    public static F0 f17371f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17372a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17373b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17374c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17375d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17376e;

    public /* synthetic */ F0(int i7, boolean z4) {
        this.f17372a = i7;
    }

    public static synchronized F0 d() {
        F0 f02;
        synchronized (F0.class) {
            try {
                if (f17371f == null) {
                    f17371f = new F0(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new C0090i(7)));
                }
                f02 = f17371f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f02;
    }

    public static N0 h(Runnable runnable) {
        if (runnable instanceof G0) {
            return (N0) ((Runnable) ((G0) runnable).f17383a.get());
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
        Context context = AbstractC1707i1.f17743c;
        if (AbstractC1706i0.k(21)) {
            file = context.getNoBackupFilesDir();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getFilesDir().getPath());
            file = new File(e1.k.i(sb2, File.separator, "no_backup"));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file.getPath());
        String str = File.separator;
        sb.append(new File(e1.k.i(sb3, str, ".flurryNoBackup")).getPath());
        sb.append(str);
        sb.append("installationNum");
        return new File(sb.toString());
    }

    @Override // c2.J
    public void A(int i7, c2.D d7, C0814u c0814u, C0819z c0819z) {
        if (z(i7, d7)) {
            ((c2.I) this.f17374c).g(c0814u, B(c0819z));
        }
    }

    public C0819z B(C0819z c0819z) {
        long j = c0819z.f10431f;
        long j3 = c0819z.f10432g;
        if (j == j && j3 == j3) {
            return c0819z;
        }
        return new C0819z(c0819z.f10426a, c0819z.f10427b, c0819z.f10428c, c0819z.f10429d, c0819z.f10430e, j, j3);
    }

    public void C(U5.l0 l0Var) {
        synchronized (this.f17373b) {
            try {
                if (((U5.l0) this.f17375d) != null) {
                    return;
                }
                this.f17375d = l0Var;
                boolean isEmpty = ((HashSet) this.f17374c).isEmpty();
                if (isEmpty) {
                    ((W5.Q0) this.f17376e).f6937H.e(l0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void D(boolean z4) {
        synchronized (((ArrayList) this.f17376e)) {
            try {
                Iterator it = ((ArrayList) this.f17376e).iterator();
                while (it.hasNext()) {
                    ((L4.h) it.next()).accept(z4 ? K4.i.f4021b : K4.i.f4020a);
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

    public void F(Q3.a aVar) {
        aVar.getClass();
        Q3.q qVar = new Q3.q(Q3.o.class, aVar.f5799a);
        HashMap hashMap = (HashMap) this.f17375d;
        if (!hashMap.containsKey(qVar)) {
            hashMap.put(qVar, aVar);
            return;
        }
        Q3.a aVar2 = (Q3.a) hashMap.get(qVar);
        if (aVar2.equals(aVar) && aVar.equals(aVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
    }

    public void G(Q3.b bVar) {
        Q3.r rVar = new Q3.r(bVar.f5801a, Q3.o.class);
        HashMap hashMap = (HashMap) this.f17374c;
        if (!hashMap.containsKey(rVar)) {
            hashMap.put(rVar, bVar);
            return;
        }
        Q3.b bVar2 = (Q3.b) hashMap.get(rVar);
        if (bVar2.equals(bVar) && bVar.equals(bVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
    }

    @Override // c2.J
    public void H(int i7, c2.D d7, C0819z c0819z) {
        if (z(i7, d7)) {
            ((c2.I) this.f17374c).c(B(c0819z));
        }
    }

    public void I(Q3.j jVar) {
        jVar.getClass();
        Q3.q qVar = new Q3.q(Q3.p.class, jVar.f5814a);
        HashMap hashMap = (HashMap) this.f17376e;
        if (!hashMap.containsKey(qVar)) {
            hashMap.put(qVar, jVar);
            return;
        }
        Q3.j jVar2 = (Q3.j) hashMap.get(qVar);
        if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
    }

    public void J(Q3.k kVar) {
        Q3.r rVar = new Q3.r(kVar.f5815a, Q3.p.class);
        HashMap hashMap = (HashMap) this.f17373b;
        if (!hashMap.containsKey(rVar)) {
            hashMap.put(rVar, kVar);
            return;
        }
        Q3.k kVar2 = (Q3.k) hashMap.get(rVar);
        if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: all -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x009b, blocks: (B:25:0x006b, B:29:0x007b), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v9, types: [M6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(AbstractC1356c abstractC1356c) {
        b0.c0 c0Var;
        int i7;
        M6.d dVar;
        F0 f02;
        M6.a aVar;
        Throwable th;
        F0 f03;
        try {
            if (abstractC1356c instanceof b0.c0) {
                c0Var = (b0.c0) abstractC1356c;
                int i8 = c0Var.f10020e;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0Var.f10020e = i8 - Integer.MIN_VALUE;
                    Object obj = c0Var.f10018c;
                    j6.a aVar2 = j6.a.f14642a;
                    i7 = c0Var.f10020e;
                    C1116i c1116i = C1116i.f13008a;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        if (!(((C0136t) this.f17374c).x() instanceof InterfaceC0112b0)) {
                            return c1116i;
                        }
                        c0Var.f10016a = this;
                        dVar = (M6.d) this.f17373b;
                        c0Var.f10017b = dVar;
                        c0Var.f10020e = 1;
                        if (dVar.a(c0Var) == aVar2) {
                            return aVar2;
                        }
                        f02 = this;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = c0Var.f10017b;
                            f03 = c0Var.f10016a;
                            try {
                                AbstractC0603a.p0(obj);
                                ((C0136t) f03.f17374c).C(c1116i);
                                aVar.b(null);
                                return c1116i;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar.b(null);
                                throw th;
                            }
                        }
                        M6.a aVar3 = c0Var.f10017b;
                        f02 = c0Var.f10016a;
                        AbstractC0603a.p0(obj);
                        dVar = aVar3;
                    }
                    if (((C0136t) f02.f17374c).x() instanceof InterfaceC0112b0) {
                        dVar.b(null);
                        return c1116i;
                    }
                    c0Var.f10016a = f02;
                    c0Var.f10017b = dVar;
                    c0Var.f10020e = 2;
                    if (f02.u(c0Var) == aVar2) {
                        return aVar2;
                    }
                    aVar = dVar;
                    f03 = f02;
                    ((C0136t) f03.f17374c).C(c1116i);
                    aVar.b(null);
                    return c1116i;
                }
            }
            if (((C0136t) f02.f17374c).x() instanceof InterfaceC0112b0) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            aVar.b(null);
            throw th;
        }
        c0Var = new b0.c0(this, abstractC1356c);
        Object obj2 = c0Var.f10018c;
        j6.a aVar22 = j6.a.f14642a;
        i7 = c0Var.f10020e;
        C1116i c1116i2 = C1116i.f13008a;
        if (i7 != 0) {
        }
    }

    public void L(Object obj, A5.c cVar) {
        ((A5.f) this.f17373b).k((String) this.f17374c, ((A5.n) this.f17375d).a(obj), cVar == null ? null : new A5.a(0, this, cVar));
    }

    public void M(A5.b bVar) {
        String str = (String) this.f17374c;
        A5.f fVar = (A5.f) this.f17373b;
        B4.V v6 = (B4.V) this.f17376e;
        if (v6 != null) {
            fVar.n(str, bVar != null ? new P2(2, this, bVar) : null, v6);
        } else {
            fVar.c(str, bVar != null ? new P2(2, this, bVar) : null);
        }
    }

    @Override // l.InterfaceC1363a
    public boolean a(AbstractC1364b abstractC1364b, m.k kVar) {
        C1369g v6 = v(abstractC1364b);
        r.l lVar = (r.l) this.f17376e;
        Menu menu = (Menu) lVar.getOrDefault(kVar, null);
        if (menu == null) {
            menu = new MenuC1413A((Context) this.f17374c, kVar);
            lVar.put(kVar, menu);
        }
        return ((ActionMode.Callback) this.f17373b).onPrepareActionMode(v6, menu);
    }

    @Override // l4.u
    public void b(String str, String str2) {
        switch (this.f17372a) {
            case 17:
                C1266c c3 = C1479m.c(str, str2);
                C1479m c1479m = (C1479m) this.f17376e;
                C1473g c1473g = (C1473g) this.f17373b;
                C1479m.d(c1479m, "onDisconnect().setValue", c1473g, c3);
                if (c3 == null) {
                    c1479m.f15451e.c(c1473g, (v4.r) this.f17374c);
                }
                c1479m.i((q4.j) this.f17375d, c3, c1473g);
                break;
            default:
                C1266c c4 = C1479m.c(str, str2);
                C1473g c1473g2 = (C1473g) this.f17373b;
                C1479m c1479m2 = (C1479m) this.f17376e;
                C1479m.d(c1479m2, "Transaction", c1473g2, c4);
                ArrayList arrayList = new ArrayList();
                List<C1478l> list = (List) this.f17374c;
                if (c4 != null) {
                    if (c4.f13989a == -1) {
                        for (C1478l c1478l : list) {
                            if (c1478l.f15441d == 5) {
                                c1478l.f15441d = 6;
                            } else {
                                c1478l.f15441d = 2;
                            }
                        }
                    } else {
                        for (C1478l c1478l2 : list) {
                            c1478l2.f15441d = 6;
                            c1478l2.f15445y = c4;
                        }
                    }
                    c1479m2.p(c1473g2);
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C1479m c1479m3 = (C1479m) this.f17375d;
                        if (!hasNext) {
                            c1479m2.n(c1479m2.f15452f.K(c1473g2));
                            C1726n0 c1726n0 = c1479m2.f15452f;
                            c1479m2.n(c1726n0);
                            c1479m2.r(c1726n0);
                            c1479m3.m(arrayList);
                            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                c1479m2.l((Runnable) arrayList2.get(i7));
                            }
                            break;
                        } else {
                            C1478l c1478l3 = (C1478l) it.next();
                            c1478l3.f15441d = 4;
                            arrayList.addAll(c1479m2.f15459n.c(c1478l3.f15446z, false, false, c1479m2.f15448b));
                            v4.r rVar = c1478l3.f15437C;
                            C1473g c1473g3 = c1478l3.f15438a;
                            arrayList2.add(new l4.x(4, c1478l3, new C1265b(new C1269f(c1479m3, c1473g3), v4.l.m(rVar)), false));
                            c1479m2.o(new n4.J(c1479m2, c1478l3.f15440c, s4.h.a(c1473g3)));
                        }
                    }
                }
        }
    }

    @Override // J2.f
    public void c(JsonWriter jsonWriter) {
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f17373b);
        jsonWriter.name("verb").value((String) this.f17374c);
        jsonWriter.endObject();
        J2.g.e(jsonWriter, (Map) this.f17375d);
        byte[] bArr = (byte[]) this.f17376e;
        if (bArr != null) {
            jsonWriter.name(SentryLogEvent.JsonKeys.BODY).value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    @Override // l.InterfaceC1363a
    public boolean e(AbstractC1364b abstractC1364b, m.k kVar) {
        C1369g v6 = v(abstractC1364b);
        r.l lVar = (r.l) this.f17376e;
        Menu menu = (Menu) lVar.getOrDefault(kVar, null);
        if (menu == null) {
            menu = new MenuC1413A((Context) this.f17374c, kVar);
            lVar.put(kVar, menu);
        }
        return ((ActionMode.Callback) this.f17373b).onCreateActionMode(v6, menu);
    }

    @Override // j5.c
    public void f(Serializable serializable) {
        this.f17373b = serializable;
    }

    @Override // l.InterfaceC1363a
    public void g(AbstractC1364b abstractC1364b) {
        ((ActionMode.Callback) this.f17373b).onDestroyActionMode(v(abstractC1364b));
    }

    public void i() {
        if (((C0977k) this.f17376e) == null) {
            this.f17376e = new C0977k(t(), "installationNum", 1, new C1722m0(26));
            byte[] q7 = q(s());
            if (q7 != null) {
                AbstractC1715k1.i(t());
                o(q7);
            }
        }
    }

    @Override // c2.J
    public void j(int i7, c2.D d7, C0814u c0814u, C0819z c0819z, IOException iOException, boolean z4) {
        if (z(i7, d7)) {
            ((c2.I) this.f17374c).j(c0814u, B(c0819z), iOException, z4);
        }
    }

    @Override // l.InterfaceC1363a
    public boolean k(AbstractC1364b abstractC1364b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f17373b).onActionItemClicked(v(abstractC1364b), new m.r((Context) this.f17374c, (K.a) menuItem));
    }

    public synchronized void l(Object obj, N0 n02) {
        if (obj == null) {
            return;
        }
        synchronized (this) {
            HashMap hashMap = ((D0.i) this.f17373b).f1652a;
            List list = (List) hashMap.get(obj);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(obj, list);
            }
            list.add(n02);
            ((HashMap) this.f17374c).put(n02, obj);
            ((H0) this.f17376e).submit(n02);
        }
    }

    @Override // c2.J
    public void m(int i7, c2.D d7, C0814u c0814u, C0819z c0819z) {
        if (z(i7, d7)) {
            ((c2.I) this.f17374c).l(c0814u, B(c0819z));
        }
    }

    public synchronized void n(N0 n02) {
        List list;
        Object obj = ((HashMap) this.f17374c).get(n02);
        synchronized (this) {
            try {
                D0.i iVar = (D0.i) this.f17373b;
                if (obj != null && (list = (List) iVar.f1652a.get(obj)) != null) {
                    list.remove(n02);
                    if (list.size() == 0) {
                        iVar.f1652a.remove(obj);
                    }
                }
                ((HashMap) this.f17374c).remove(n02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(byte[] bArr) {
        F f7;
        try {
            AbstractC1715k1.i(t());
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            C1719l1 c1719l1 = (C1719l1) this.f17375d;
            Key s7 = s();
            byte[] bArr3 = null;
            if (bArr != null && s7 != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((M4.e) c1719l1.f17771a).s(bArr, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    Cipher cipher = Cipher.getInstance(L.g(2));
                    cipher.init(1, s7, ivParameterSpec);
                    bArr3 = cipher.doFinal(byteArray);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e7) {
                    e7.getMessage();
                }
            }
            if (bArr3 != null) {
                f7 = new F(t.e.e(2), true, bArr3, bArr2);
            } else {
                f7 = new F(t.e.e(2), false, bArr, new byte[0]);
            }
            ((C0977k) this.f17376e).g(f7);
        } catch (Throwable th) {
            th.getMessage();
            Log.getStackTraceString(th);
        }
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        int i7;
        int i8;
        final int i9;
        final int i10;
        B3.h hVar;
        i7 = 8;
        i8 = 7;
        i9 = 1;
        i10 = 0;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "ConsentInformation#reset":
                w().reset();
                ((A5.p) rVar).success(null);
                break;
            case "UserMessagingPlatform#loadAndShowConsentFormIfRequired":
                final AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) this.f17376e;
                if (abstractActivityC1559c != null) {
                    final A5.p pVar = (A5.p) rVar;
                    final B3.b bVar = new B3.b() { // from class: N5.d
                        @Override // B3.b
                        public final void a(i iVar) {
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
                    if (!zza.zza(abstractActivityC1559c).zzb().canRequestAds()) {
                        zzbo zzc = zza.zza(abstractActivityC1559c).zzc();
                        zzcs.zza();
                        zzc.zzb(new B3.k() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                            @Override // B3.k
                            public final void onConsentFormLoadSuccess(c cVar) {
                                cVar.show(abstractActivityC1559c, bVar);
                            }
                        }, new B3.j() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                            @Override // B3.j
                            public final void onConsentFormLoadFailure(i iVar) {
                                b.this.a(iVar);
                            }
                        });
                        break;
                    } else {
                        bVar.a(null);
                        break;
                    }
                } else {
                    ((A5.p) rVar).error("0", "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentInformation#requestConsentInfoUpdate":
                if (((AbstractActivityC1559c) this.f17376e) != null) {
                    N5.b bVar2 = (N5.b) oVar.a(Message.JsonKeys.PARAMS);
                    if (bVar2 == null) {
                        hVar = new B3.h(new B3.g(i10));
                    } else {
                        AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) this.f17376e;
                        B3.g gVar = new B3.g(i10);
                        Boolean bool = bVar2.f4782a;
                        if (bool != null) {
                            gVar.f1063b = bool.booleanValue();
                        }
                        N5.a aVar = bVar2.f4783b;
                        if (aVar != null) {
                            B1.m mVar = new B1.m(abstractActivityC1559c2);
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
                    w().requestConsentInfoUpdate((AbstractActivityC1559c) this.f17376e, hVar, new u1.c(pVar2, i7), new C1761y0(pVar2, i8));
                    break;
                } else {
                    ((A5.p) rVar).error("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentForm#show":
                B3.c cVar = (B3.c) oVar.a("consentForm");
                if (cVar != null) {
                    cVar.show((AbstractActivityC1559c) this.f17376e, new N5.e((A5.p) rVar, i10));
                    break;
                } else {
                    ((A5.p) rVar).error("0", "ConsentForm#show", null);
                    break;
                }
            case "ConsentForm#dispose":
                B3.c cVar2 = (B3.c) oVar.a("consentForm");
                if (cVar2 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    ((N5.c) this.f17373b).f4784d.remove(Integer.valueOf(cVar2.hashCode()));
                }
                ((A5.p) rVar).success(null);
                break;
            case "UserMessagingPlatform#showPrivacyOptionsForm":
                AbstractActivityC1559c abstractActivityC1559c3 = (AbstractActivityC1559c) this.f17376e;
                if (abstractActivityC1559c3 != null) {
                    final A5.p pVar3 = (A5.p) rVar;
                    zza.zza(abstractActivityC1559c3).zzc().zze(abstractActivityC1559c3, new B3.b() { // from class: N5.d
                        @Override // B3.b
                        public final void a(i iVar) {
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
                } else {
                    ((A5.p) rVar).error("0", "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentInformation#isConsentFormAvailable":
                ((A5.p) rVar).success(Boolean.valueOf(w().isConsentFormAvailable()));
                break;
            case "UserMessagingPlatform#loadConsentForm":
                A5.p pVar4 = (A5.p) rVar;
                zza.zza((Context) this.f17374c).zzc().zzb(new V0(17, this, pVar4), new C1719l1(pVar4));
                break;
            case "ConsentInformation#getPrivacyOptionsRequirementStatus":
                int ordinal = w().getPrivacyOptionsRequirementStatus().ordinal();
                if (ordinal == 1) {
                    ((A5.p) rVar).success(0);
                    break;
                } else if (ordinal == 2) {
                    ((A5.p) rVar).success(1);
                    break;
                } else {
                    ((A5.p) rVar).success(2);
                    break;
                }
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
    public void p(String str, HashMap hashMap) {
        this.f17375d = "sqlite_error";
        this.f17376e = str;
        this.f17374c = hashMap;
    }

    public byte[] q(Key key) {
        int i7;
        Object h6;
        try {
            F f7 = (F) ((C0977k) this.f17376e).e();
            if (f7 == null) {
                return null;
            }
            byte[] bArr = f7.f17369c;
            if (!f7.f17367a) {
                return bArr;
            }
            byte[] bArr2 = f7.f17368b;
            int i8 = f7.f17370d;
            int[] f8 = t.e.f(3);
            int length = f8.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i7 = 1;
                    break;
                }
                i7 = f8[i9];
                if (t.e.e(i7) == i8) {
                    break;
                }
                i9++;
            }
            if (bArr2 == null || bArr == null) {
                return null;
            }
            C1719l1 c1719l1 = (C1719l1) this.f17375d;
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            if (key != null) {
                try {
                    Cipher cipher = Cipher.getInstance(L.g(i7));
                    cipher.init(2, key, ivParameterSpec);
                    h6 = ((M4.e) c1719l1.f17771a).h(new ByteArrayInputStream(cipher.doFinal(bArr)));
                } catch (InvalidAlgorithmParameterException e7) {
                    e = e7;
                    e.getMessage();
                    h6 = null;
                    return (byte[]) h6;
                } catch (InvalidKeyException e8) {
                    e = e8;
                    e.getMessage();
                    h6 = null;
                    return (byte[]) h6;
                } catch (NoSuchAlgorithmException e9) {
                    e = e9;
                    e.getMessage();
                    h6 = null;
                    return (byte[]) h6;
                } catch (BadPaddingException e10) {
                    e = e10;
                    e.getMessage();
                    h6 = null;
                    return (byte[]) h6;
                } catch (IllegalBlockSizeException e11) {
                    e = e11;
                    e.getMessage();
                    h6 = null;
                    return (byte[]) h6;
                } catch (NoSuchPaddingException e12) {
                    e = e12;
                    e.getMessage();
                    h6 = null;
                    return (byte[]) h6;
                }
                return (byte[]) h6;
            }
            h6 = null;
            return (byte[]) h6;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c2.J
    public void r(int i7, c2.D d7, C0819z c0819z) {
        if (z(i7, d7)) {
            ((c2.I) this.f17374c).m(B(c0819z));
        }
    }

    public Key s() {
        if (((R4.c) this.f17373b) == null) {
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
            this.f17373b = cVar;
        }
        KeyStore keyStore2 = (KeyStore) ((R4.c) this.f17373b).f6064b;
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
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f17373b;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f17374c;
        String str = (String) this.f17375d;
        C1091c c1091c = (C1091c) this.f17376e;
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
            Q3.o oVar = new Q3.o(firebaseAuth.f11849a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f11859l = oVar;
            }
        }
        Q3.o m7 = firebaseAuth.m();
        return m7.r(str, Boolean.FALSE, recaptchaAction).continueWithTask(c1091c).continueWithTask(new k1.g(str, m7, recaptchaAction, c1091c));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(AbstractC1356c abstractC1356c) {
        C0762j c0762j;
        int i7;
        F0 f02;
        C0756d c0756d;
        if (abstractC1356c instanceof C0762j) {
            c0762j = (C0762j) abstractC1356c;
            int i8 = c0762j.f10057d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0762j.f10057d = i8 - Integer.MIN_VALUE;
                Object obj = c0762j.f10055b;
                j6.a aVar = j6.a.f14642a;
                i7 = c0762j.f10057d;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    List list = (List) this.f17375d;
                    b0.O o7 = (b0.O) this.f17376e;
                    if (list == null || list.isEmpty()) {
                        c0762j.f10054a = this;
                        c0762j.f10057d = 1;
                        obj = b0.O.f(o7, false, c0762j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        f02 = this;
                        c0756d = (C0756d) obj;
                    } else {
                        b0.h0 g3 = o7.g();
                        C0765m c0765m = new C0765m(o7, this, null);
                        c0762j.f10054a = this;
                        c0762j.f10057d = 2;
                        obj = g3.b(c0765m, c0762j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        f02 = this;
                        c0756d = (C0756d) obj;
                    }
                } else if (i7 == 1) {
                    f02 = c0762j.f10054a;
                    AbstractC0603a.p0(obj);
                    c0756d = (C0756d) obj;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f02 = c0762j.f10054a;
                    AbstractC0603a.p0(obj);
                    c0756d = (C0756d) obj;
                }
                ((b0.O) f02.f17376e).f9971h.s(c0756d);
                return C1116i.f13008a;
            }
        }
        c0762j = new C0762j(this, abstractC1356c);
        Object obj2 = c0762j.f10055b;
        j6.a aVar2 = j6.a.f14642a;
        i7 = c0762j.f10057d;
        if (i7 != 0) {
        }
        ((b0.O) f02.f17376e).f9971h.s(c0756d);
        return C1116i.f13008a;
    }

    public C1369g v(AbstractC1364b abstractC1364b) {
        ArrayList arrayList = (ArrayList) this.f17375d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1369g c1369g = (C1369g) arrayList.get(i7);
            if (c1369g != null && c1369g.f14811b == abstractC1364b) {
                return c1369g;
            }
        }
        C1369g c1369g2 = new C1369g((Context) this.f17374c, abstractC1364b);
        arrayList.add(c1369g2);
        return c1369g2;
    }

    public zzj w() {
        zzj zzjVar = (zzj) this.f17375d;
        if (zzjVar != null) {
            return zzjVar;
        }
        zzj zzb = zza.zza((Context) this.f17374c).zzb();
        this.f17375d = zzb;
        return zzb;
    }

    public boolean x() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.f17373b).getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // c2.J
    public void y(int i7, c2.D d7, C0814u c0814u, C0819z c0819z) {
        if (z(i7, d7)) {
            ((c2.I) this.f17374c).e(c0814u, B(c0819z));
        }
    }

    public boolean z(int i7, c2.D d7) {
        c2.D d8;
        AbstractC0804j abstractC0804j = (AbstractC0804j) this.f17376e;
        C0809o c0809o = (C0809o) this.f17373b;
        if (d7 != null) {
            d8 = abstractC0804j.q(c0809o, d7);
            if (d8 == null) {
                return false;
            }
        } else {
            d8 = null;
        }
        int r7 = abstractC0804j.r(c0809o, i7);
        c2.I i8 = (c2.I) this.f17374c;
        if (i8.f10179a != r7 || !v2.t.a(i8.f10180b, d8)) {
            this.f17374c = new c2.I(abstractC0804j.f10298c.f10181c, r7, d8, 0L);
        }
        B1.m mVar = (B1.m) this.f17375d;
        if (mVar.f1014b == r7 && v2.t.a((c2.D) mVar.f1015c, d8)) {
            return true;
        }
        this.f17375d = new B1.m((CopyOnWriteArrayList) abstractC0804j.f10299d.f1016d, r7, d8, 2);
        return true;
    }

    public /* synthetic */ F0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f17372a = i7;
        this.f17373b = obj;
        this.f17374c = obj2;
        this.f17375d = obj3;
        this.f17376e = obj4;
    }

    public /* synthetic */ F0(C1479m c1479m, C1473g c1473g, Iterable iterable, Object obj, int i7) {
        this.f17372a = i7;
        this.f17376e = c1479m;
        this.f17373b = c1473g;
        this.f17374c = iterable;
        this.f17375d = obj;
    }

    public F0(TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue) {
        this.f17372a = 0;
        this.f17373b = new D0.i();
        this.f17374c = new HashMap();
        this.f17375d = new HashMap();
        H0 h02 = new H0(this, timeUnit, priorityBlockingQueue);
        this.f17376e = h02;
        h02.setRejectedExecutionHandler(new I0(this));
        h02.setThreadFactory(new ThreadFactoryC1675a1());
    }

    public F0(int i7) {
        this.f17372a = i7;
        switch (i7) {
            case 19:
                this.f17373b = null;
                this.f17374c = null;
                this.f17376e = null;
                M4.e eVar = new M4.e();
                C1719l1 c1719l1 = new C1719l1();
                c1719l1.f17771a = eVar;
                this.f17375d = c1719l1;
                break;
            default:
                this.f17374c = new HashMap();
                this.f17375d = new HashMap();
                this.f17373b = new HashMap();
                this.f17376e = new HashMap();
                break;
        }
    }

    public F0(A5.f fVar, Context context) {
        this.f17372a = 5;
        N5.c cVar = new N5.c();
        this.f17373b = cVar;
        new A5.s(fVar, "plugins.flutter.io/google_mobile_ads/ump", new A5.y(cVar), null).b(this);
        this.f17374c = context;
    }

    public F0(Q3.s sVar) {
        this.f17372a = 6;
        this.f17374c = new HashMap(sVar.f5833a);
        this.f17375d = new HashMap(sVar.f5834b);
        this.f17373b = new HashMap(sVar.f5835c);
        this.f17376e = new HashMap(sVar.f5836d);
    }

    public F0(Context context) {
        this.f17372a = 4;
        this.f17376e = new ArrayList();
        p3.f.O("Context must be non-null", context != null, new Object[0]);
        this.f17373b = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f17374c = connectivityManager;
        Application application = (Application) context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new C0316c(this, atomicBoolean));
        application.registerComponentCallbacks(new ComponentCallbacks2C0317d(atomicBoolean));
        if (connectivityManager != null) {
            C0318e c0318e = new C0318e(this, 0);
            connectivityManager.registerDefaultNetworkCallback(c0318e);
            this.f17375d = new A0.f(27, this, c0318e);
        } else {
            C0319f c0319f = new C0319f(this, 0);
            context.registerReceiver(c0319f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f17375d = new A0.f(28, this, c0319f);
        }
    }

    public F0(SharedPreferences sharedPreferences, Map map) {
        this.f17372a = 11;
        this.f17373b = EnumC0966a.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", "RSA_ECB_PKCS1Padding"));
        this.f17374c = d5.c.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", "AES_CBC_PKCS7Padding"));
        Object obj = map.get("keyCipherAlgorithm");
        EnumC0966a valueOf = EnumC0966a.valueOf(obj != null ? obj.toString() : "RSA_ECB_PKCS1Padding");
        int i7 = valueOf.f12405b;
        int i8 = Build.VERSION.SDK_INT;
        this.f17375d = i7 > i8 ? EnumC0966a.RSA_ECB_PKCS1Padding : valueOf;
        Object obj2 = map.get("storageCipherAlgorithm");
        d5.c valueOf2 = d5.c.valueOf(obj2 != null ? obj2.toString() : "AES_CBC_PKCS7Padding");
        this.f17376e = valueOf2.f12409b > i8 ? d5.c.AES_CBC_PKCS7Padding : valueOf2;
    }

    public F0(F.w wVar) {
        Bundle bundle;
        int i7;
        ArrayList arrayList;
        Bundle bundle2;
        int i8;
        this.f17372a = 2;
        new ArrayList();
        this.f17376e = new Bundle();
        this.f17375d = wVar;
        Context context = wVar.f2456a;
        this.f17373b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17374c = F.C.a(context, wVar.f2471q);
        } else {
            this.f17374c = new Notification.Builder(wVar.f2456a);
        }
        Notification notification = wVar.f2473s;
        Resources resources = null;
        ((Notification.Builder) this.f17374c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(wVar.f2460e).setContentText(wVar.f2461f).setContentInfo(null).setContentIntent(wVar.f2462g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f17374c;
        IconCompat iconCompat = wVar.f2463h;
        F.A.b(builder, iconCompat == null ? null : J.c.c(iconCompat, context));
        ((Notification.Builder) this.f17374c).setSubText(wVar.f2466l).setUsesChronometer(false).setPriority(wVar.f2464i);
        Iterator it = wVar.f2457b.iterator();
        while (it.hasNext()) {
            F.q qVar = (F.q) it.next();
            if (qVar.f2446b == null && (i8 = qVar.f2449e) != 0) {
                qVar.f2446b = IconCompat.d(null, "", i8);
            }
            IconCompat iconCompat2 = qVar.f2446b;
            Notification.Action.Builder a2 = F.A.a(iconCompat2 != null ? J.c.c(iconCompat2, null) : null, qVar.f2450f, qVar.f2451g);
            Bundle bundle3 = qVar.f2445a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z4 = qVar.f2447c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            int i9 = Build.VERSION.SDK_INT;
            F.B.a(a2, z4);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i9 >= 28) {
                F.D.b(a2, 0);
            }
            if (i9 >= 29) {
                F.E.c(a2, false);
            }
            if (i9 >= 31) {
                F.F.a(a2, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", qVar.f2448d);
            F.y.b(a2, bundle2);
            F.y.a((Notification.Builder) this.f17374c, F.y.d(a2));
        }
        Bundle bundle4 = wVar.f2468n;
        if (bundle4 != null) {
            ((Bundle) this.f17376e).putAll(bundle4);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f17374c).setShowWhen(wVar.j);
        F.y.i((Notification.Builder) this.f17374c, wVar.f2467m);
        F.y.g((Notification.Builder) this.f17374c, null);
        F.y.j((Notification.Builder) this.f17374c, null);
        F.y.h((Notification.Builder) this.f17374c, false);
        F.z.b((Notification.Builder) this.f17374c, null);
        F.z.c((Notification.Builder) this.f17374c, wVar.f2469o);
        F.z.f((Notification.Builder) this.f17374c, wVar.f2470p);
        F.z.d((Notification.Builder) this.f17374c, null);
        F.z.e((Notification.Builder) this.f17374c, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = wVar.f2474t;
        ArrayList arrayList3 = wVar.f2458c;
        if (i10 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    r.c cVar = new r.c(arrayList2.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                F.z.a((Notification.Builder) this.f17374c, (String) it3.next());
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
                String num = Integer.toString(i11);
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
                bundle7.putBundle(num, bundle8);
                i11++;
                resources = null;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (wVar.f2468n == null) {
                wVar.f2468n = new Bundle();
            }
            wVar.f2468n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f17376e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i12 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f17374c).setExtras(wVar.f2468n);
        F.B.e((Notification.Builder) this.f17374c, null);
        if (i12 >= 26) {
            F.C.b((Notification.Builder) this.f17374c, 0);
            F.C.e((Notification.Builder) this.f17374c, null);
            F.C.f((Notification.Builder) this.f17374c, null);
            F.C.g((Notification.Builder) this.f17374c, 0L);
            F.C.d((Notification.Builder) this.f17374c, 0);
            if (!TextUtils.isEmpty(wVar.f2471q)) {
                ((Notification.Builder) this.f17374c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i12 >= 29) {
            F.E.a((Notification.Builder) this.f17374c, wVar.f2472r);
            F.E.b((Notification.Builder) this.f17374c, null);
        }
    }

    public F0(Typeface typeface, C1176b c1176b) {
        int i7;
        int i8;
        this.f17372a = 14;
        this.f17376e = typeface;
        this.f17373b = c1176b;
        this.f17375d = new g0.r(1024);
        int a2 = c1176b.a(6);
        if (a2 != 0) {
            int i9 = a2 + c1176b.f5025a;
            i7 = ((ByteBuffer) c1176b.f5028d).getInt(((ByteBuffer) c1176b.f5028d).getInt(i9) + i9);
        } else {
            i7 = 0;
        }
        this.f17374c = new char[i7 * 2];
        int a4 = c1176b.a(6);
        if (a4 != 0) {
            int i10 = a4 + c1176b.f5025a;
            i8 = ((ByteBuffer) c1176b.f5028d).getInt(((ByteBuffer) c1176b.f5028d).getInt(i10) + i10);
        } else {
            i8 = 0;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            g0.n nVar = new g0.n(this, i11);
            C1175a c3 = nVar.c();
            int a7 = c3.a(4);
            Character.toChars(a7 != 0 ? ((ByteBuffer) c3.f5028d).getInt(a7 + c3.f5025a) : 0, (char[]) this.f17374c, i11 * 2);
            if (nVar.b() > 0) {
                ((g0.r) this.f17375d).a(nVar, 0, nVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public F0(W5.h2 h2Var, W5.I0 i02) {
        this.f17372a = 7;
        this.f17376e = h2Var;
        this.f17373b = i02;
        U5.P p5 = (U5.P) h2Var.f7232b;
        String str = (String) h2Var.f7233c;
        U5.O b7 = p5.b(str);
        this.f17375d = b7;
        if (b7 != null) {
            this.f17374c = b7.d(i02);
            return;
        }
        throw new IllegalStateException(AbstractC0486a1.h("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
    }

    public F0(Context context, ActionMode.Callback callback) {
        this.f17372a = 16;
        this.f17374c = context;
        this.f17373b = callback;
        this.f17375d = new ArrayList();
        this.f17376e = new r.l();
    }

    public F0(AbstractC0804j abstractC0804j, C0809o c0809o) {
        this.f17372a = 10;
        this.f17376e = abstractC0804j;
        this.f17374c = new c2.I(abstractC0804j.f10298c.f10181c, 0, null, 0L);
        this.f17375d = new B1.m((CopyOnWriteArrayList) abstractC0804j.f10299d.f1016d, 0, (Object) null, 2);
        this.f17373b = c0809o;
    }

    public F0(b0.O o7, List list) {
        this.f17372a = 9;
        this.f17376e = o7;
        this.f17373b = M6.e.a();
        this.f17374c = D6.E.a();
        this.f17375d = AbstractC1159h.a1(list);
    }

    public F0(String str, String[] strArr, String str2, z5.q qVar) {
        this.f17372a = 20;
        this.f17373b = str;
        this.f17374c = strArr;
        this.f17376e = str2;
        this.f17375d = qVar;
    }

    public F0(W5.Q0 q02) {
        this.f17372a = 8;
        this.f17376e = q02;
        this.f17373b = new Object();
        this.f17374c = new HashSet();
    }
}
