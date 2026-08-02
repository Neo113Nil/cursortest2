package m2;

import A0.F;
import A0.J0;
import A0.P0;
import A0.X;
import I1.k;
import P.W;
import P2.o;
import Q2.C0379q;
import Q2.C0387u0;
import Q2.InterfaceC0347a;
import Q2.r;
import T2.G;
import T2.L;
import T2.N;
import U2.i;
import U2.j;
import X3.y;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.core.graphics.drawable.IconCompat;
import b.C0497b;
import b.InterfaceC0499d;
import c0.h;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.A6;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0579Dg;
import com.google.android.gms.internal.ads.AbstractC0834c8;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.AbstractC1776x9;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import com.google.android.gms.internal.ads.Br;
import com.google.android.gms.internal.ads.C0549Aa;
import com.google.android.gms.internal.ads.C0554Af;
import com.google.android.gms.internal.ads.C0594Ff;
import com.google.android.gms.internal.ads.C0601Gf;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C0709Wb;
import com.google.android.gms.internal.ads.C0763ai;
import com.google.android.gms.internal.ads.C0906ds;
import com.google.android.gms.internal.ads.C1028gf;
import com.google.android.gms.internal.ads.C1041gs;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.C1074hg;
import com.google.android.gms.internal.ads.C1091hx;
import com.google.android.gms.internal.ads.C1121ij;
import com.google.android.gms.internal.ads.C1128iq;
import com.google.android.gms.internal.ads.C1253lh;
import com.google.android.gms.internal.ads.C1394on;
import com.google.android.gms.internal.ads.C1395oo;
import com.google.android.gms.internal.ads.C1415p7;
import com.google.android.gms.internal.ads.C1419pB;
import com.google.android.gms.internal.ads.C1456q3;
import com.google.android.gms.internal.ads.C1460q7;
import com.google.android.gms.internal.ads.C1471qa;
import com.google.android.gms.internal.ads.C1500r3;
import com.google.android.gms.internal.ads.C1594t7;
import com.google.android.gms.internal.ads.C1639u7;
import com.google.android.gms.internal.ads.C1810xz;
import com.google.android.gms.internal.ads.C1853yx;
import com.google.android.gms.internal.ads.C1855yz;
import com.google.android.gms.internal.ads.C1863z6;
import com.google.android.gms.internal.ads.C1900zz;
import com.google.android.gms.internal.ads.C9;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.D9;
import com.google.android.gms.internal.ads.Dp;
import com.google.android.gms.internal.ads.Dx;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.EnumC1818y6;
import com.google.android.gms.internal.ads.Ex;
import com.google.android.gms.internal.ads.F3;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0648Nd;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import com.google.android.gms.internal.ads.InterfaceC0735Zg;
import com.google.android.gms.internal.ads.InterfaceC0889da;
import com.google.android.gms.internal.ads.InterfaceC1165jj;
import com.google.android.gms.internal.ads.InterfaceC1427pb;
import com.google.android.gms.internal.ads.InterfaceC1560sa;
import com.google.android.gms.internal.ads.InterfaceC1573sn;
import com.google.android.gms.internal.ads.InterfaceC1728w6;
import com.google.android.gms.internal.ads.InterfaceC1740wa;
import com.google.android.gms.internal.ads.InterfaceC1897zw;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.Jw;
import com.google.android.gms.internal.ads.K3;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Lq;
import com.google.android.gms.internal.ads.Mq;
import com.google.android.gms.internal.ads.Mr;
import com.google.android.gms.internal.ads.Mx;
import com.google.android.gms.internal.ads.Nq;
import com.google.android.gms.internal.ads.Nr;
import com.google.android.gms.internal.ads.Oh;
import com.google.android.gms.internal.ads.P6;
import com.google.android.gms.internal.ads.Q7;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.RunnableFutureC0823bx;
import com.google.android.gms.internal.ads.Rw;
import com.google.android.gms.internal.ads.Sh;
import com.google.android.gms.internal.ads.Sq;
import com.google.android.gms.internal.ads.Tw;
import com.google.android.gms.internal.ads.U4;
import com.google.android.gms.internal.ads.Uh;
import com.google.android.gms.internal.ads.Vw;
import com.google.android.gms.internal.ads.Wy;
import com.google.android.gms.internal.ads.Xm;
import d1.C1912c;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import l4.C2061c;
import n.AbstractC2107A;
import n.C2138i;
import org.json.JSONObject;
import q.BinderC2290e;
import q.C2294i;
import r.C2328f;
import r2.InterfaceC2348a;
import s3.BinderC2361b;
import s4.M;
import u.AbstractC2470q;
import u.E0;
import u.InterfaceC2431B;
import v1.s;
import v1.v;
import w1.C2542a;

/* loaded from: classes.dex */
public class g implements c0.e, Jw, InterfaceC0648Nd, InterfaceC1728w6, InterfaceC1165jj, Br, E0 {

    /* renamed from: p, reason: collision with root package name */
    public static g f17992p;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17993k;

    /* renamed from: l, reason: collision with root package name */
    public Object f17994l;

    /* renamed from: m, reason: collision with root package name */
    public Object f17995m;

    /* renamed from: n, reason: collision with root package name */
    public Object f17996n;

    /* renamed from: o, reason: collision with root package name */
    public Object f17997o;

    public /* synthetic */ g(int i) {
        this.f17993k = i;
        switch (i) {
            case 15:
                this.f17994l = null;
                this.f17995m = null;
                this.f17996n = null;
                this.f17997o = null;
                break;
            case 16:
                this.f17994l = null;
                this.f17995m = null;
                this.f17996n = null;
                this.f17997o = C1091hx.f13826r;
                break;
            case 17:
                this.f17994l = null;
                this.f17995m = null;
                this.f17996n = null;
                this.f17997o = C1855yz.f16517e;
                break;
        }
    }

    public static void d(g gVar, I1.d dVar) {
        gVar.getClass();
        l.f("handler", dVar);
        if (((LinkedHashSet) gVar.f17996n).add(dVar)) {
            I1.g gVar2 = (I1.g) gVar.f17995m;
            gVar2.getClass();
            if (dVar.f2572c == null) {
                gVar2.f2581e.addFirst(dVar);
                dVar.f2572c = gVar;
                gVar2.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + dVar + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public static synchronized g i(Context context, InterfaceC2348a interfaceC2348a) {
        g gVar;
        synchronized (g.class) {
            try {
                if (f17992p == null) {
                    g gVar2 = new g(0);
                    Context applicationContext = context.getApplicationContext();
                    gVar2.f17994l = new C2084a(applicationContext, interfaceC2348a);
                    gVar2.f17995m = new C2085b(applicationContext, interfaceC2348a);
                    gVar2.f17996n = new C2088e(applicationContext, interfaceC2348a);
                    gVar2.f17997o = new C2089f(applicationContext, interfaceC2348a);
                    f17992p = gVar2;
                }
                gVar = f17992p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public C0763ai A(Set set) {
        return new C0763ai(set);
    }

    public E3.a B(final int i, final long j5, final String str) {
        final String str2;
        i iVar = (i) this.f17994l;
        if (i > iVar.f5876a) {
            C0906ds c0906ds = (C0906ds) this.f17997o;
            if (c0906ds == null || !iVar.f5879d) {
                return AbstractC1400ot.c0(U2.l.f5883m);
            }
            o.f4767B.f4776j.getClass();
            K3 k32 = new K3(System.currentTimeMillis(), "", str, 2);
            Xm xm = c0906ds.f13189a;
            xm.getClass();
            xm.d(new C0709Wb(25, xm, k32));
            return AbstractC1400ot.c0(U2.l.f5884n);
        }
        if (((Boolean) r.f5053d.f5056c.a(F7.h8)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            str2 = AbstractC0467k.v(String.valueOf(clearQuery.build()), "&", encodedQuery);
        } else {
            str2 = str;
        }
        InterfaceC1897zw interfaceC1897zw = new InterfaceC1897zw() { // from class: com.google.android.gms.internal.ads.cs
            @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
            public final E3.a k(Object obj) {
                U2.l lVar = (U2.l) obj;
                U2.l lVar2 = U2.l.f5883m;
                m2.g gVar = m2.g.this;
                if (lVar != lVar2) {
                    gVar.getClass();
                    return AbstractC1400ot.c0(lVar);
                }
                U2.i iVar2 = (U2.i) gVar.f17994l;
                long j6 = iVar2.f5877b;
                int i5 = i;
                if (i5 != 1) {
                    j6 = (long) (iVar2.f5878c * j5);
                }
                return gVar.B(i5 + 1, j6, str);
            }
        };
        Qw qw = (Rw) this.f17996n;
        if (j5 == 0) {
            final int i5 = 1;
            return AbstractC1400ot.j0(((C0606Hd) qw).d(new Callable(this) { // from class: com.google.android.gms.internal.ads.bs

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m2.g f12917b;

                {
                    this.f12917b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i5) {
                    }
                    return ((U2.m) this.f12917b.f17995m).d(str2);
                }
            }), interfaceC1897zw, qw);
        }
        final int i6 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.bs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m2.g f12917b;

            {
                this.f12917b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i6) {
                }
                return ((U2.m) this.f12917b.f17995m).d(str2);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Vw vw = (Vw) qw;
        vw.getClass();
        RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx(callable);
        return AbstractC1400ot.j0(new Tw(runnableFutureC0823bx, vw.f11966m.schedule(runnableFutureC0823bx, j5, timeUnit)), interfaceC1897zw, qw);
    }

    public C1853yx C() {
        Dp dp;
        C1419pB b3;
        Ex ex = (Ex) this.f17994l;
        if (ex == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Dp dp2 = (Dp) this.f17995m;
        if (dp2 == null || (dp = (Dp) this.f17996n) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (ex.f8629a != ((C1419pB) dp2.f8377l).f14973a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (ex.f8630b != ((C1419pB) dp.f8377l).f14973a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (ex.a() && ((Integer) this.f17997o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((Ex) this.f17994l).a() && ((Integer) this.f17997o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        Dx dx = ((Ex) this.f17994l).f8633e;
        if (dx == Dx.f8423o) {
            b3 = Wy.f12132a;
        } else if (dx == Dx.f8422n) {
            b3 = Wy.a(((Integer) this.f17997o).intValue());
        } else {
            if (dx != Dx.f8421m) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((Ex) this.f17994l).f8633e)));
            }
            b3 = Wy.b(((Integer) this.f17997o).intValue());
        }
        return new C1853yx((Ex) this.f17994l, (Dp) this.f17995m, (Dp) this.f17996n, b3, (Integer) this.f17997o);
    }

    public Mx D() {
        Integer num = (Integer) this.f17994l;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f17995m) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f17996n) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        ((Integer) this.f17995m).getClass();
        ((Integer) this.f17996n).getClass();
        return new Mx(intValue, (C1091hx) this.f17997o);
    }

    public C1900zz E() {
        Integer num = (Integer) this.f17994l;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f17995m) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((C1810xz) this.f17996n) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f17994l));
        }
        Integer num2 = (Integer) this.f17995m;
        int intValue = num2.intValue();
        C1810xz c1810xz = (C1810xz) this.f17996n;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c1810xz == C1810xz.f16367b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c1810xz == C1810xz.f16368c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c1810xz == C1810xz.f16369d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c1810xz == C1810xz.f16370e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c1810xz != C1810xz.f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C1900zz(((Integer) this.f17994l).intValue(), ((Integer) this.f17995m).intValue(), (C1855yz) this.f17997o, (C1810xz) this.f17996n);
    }

    @Override // com.google.android.gms.internal.ads.Br
    /* renamed from: a */
    public void mo20a() {
        switch (this.f17993k) {
            case 11:
                ((InterfaceC1573sn) ((C1395oo) this.f17994l).f14855e).b((Sq) this.f17995m, (Lq) this.f17996n, (C1394on) this.f17997o);
                break;
            default:
                this.f17995m = 12;
                break;
        }
    }

    @Override // u.C0
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1728w6
    public void c(C1594t7 c1594t7) {
        C1863z6 c1863z6 = (C1863z6) ((C1639u7) c1594t7.f10141l).F().l();
        c1863z6.e();
        A6.w((A6) c1863z6.f10141l, (EnumC1818y6) this.f17994l);
        c1594t7.e();
        C1639u7.y((C1639u7) c1594t7.f10141l, (A6) c1863z6.b());
        C1415p7 c1415p7 = (C1415p7) ((C1639u7) c1594t7.f10141l).G().l();
        c1415p7.e();
        C1460q7.w((C1460q7) c1415p7.f10141l, (String) this.f17995m);
        P6 p6 = (P6) this.f17996n;
        c1415p7.e();
        C1460q7.x((C1460q7) c1415p7.f10141l, p6);
        c1594t7.e();
        C1639u7.A((C1639u7) c1594t7.f10141l, (C1460q7) c1415p7.b());
        c1594t7.e();
        C1639u7.D((C1639u7) c1594t7.f10141l, (String) this.f17997o);
    }

    public void e(I1.f fVar) {
        if (((LinkedHashSet) this.f17997o).add(fVar)) {
            ((I1.g) this.f17995m).a(this, fVar, -1);
        }
    }

    public void f(k kVar, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("Unsupported priority value: ", i).toString());
        }
        if (((LinkedHashSet) this.f17997o).add(kVar)) {
            ((I1.g) this.f17995m).a(this, kVar, i);
        }
    }

    @Override // u.C0
    public AbstractC2470q g(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        if (((AbstractC2470q) this.f17995m) == null) {
            this.f17995m = abstractC2470q.c();
        }
        AbstractC2470q abstractC2470q4 = (AbstractC2470q) this.f17995m;
        if (abstractC2470q4 == null) {
            l.k("valueVector");
            throw null;
        }
        int b3 = abstractC2470q4.b();
        for (int i = 0; i < b3; i++) {
            AbstractC2470q abstractC2470q5 = (AbstractC2470q) this.f17995m;
            if (abstractC2470q5 == null) {
                l.k("valueVector");
                throw null;
            }
            abstractC2470q5.e(i, ((u.r) this.f17994l).get(i).b(j5, abstractC2470q.a(i), abstractC2470q2.a(i), abstractC2470q3.a(i)));
        }
        AbstractC2470q abstractC2470q6 = (AbstractC2470q) this.f17995m;
        if (abstractC2470q6 != null) {
            return abstractC2470q6;
        }
        l.k("valueVector");
        throw null;
    }

    public void h(I1.f fVar, I1.b bVar) {
        l.f("input", fVar);
        I1.g gVar = (I1.g) this.f17995m;
        gVar.getClass();
        if (gVar.f2582g != 0) {
            return;
        }
        I1.d c5 = gVar.c(-1);
        gVar.f = c5;
        gVar.f2582g = -1;
        gVar.f2583h = fVar;
        if (bVar != null) {
            if (c5 != null) {
                c5.d(bVar);
            }
            I1.i iVar = new I1.i(bVar);
            M m5 = gVar.f2577a;
            m5.getClass();
            m5.j(null, iVar);
        }
    }

    public void j(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f17994l) {
            try {
                try {
                    ((C0497b) ((InterfaceC0499d) this.f17995m)).N((BinderC2290e) this.f17996n, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0648Nd, com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        InterfaceC1560sa interfaceC1560sa = (InterfaceC1560sa) obj;
        G.m("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f17995m;
        C0634Ld c0634Ld = (C0634Ld) this.f17996n;
        P2.c cVar = (P2.c) this.f17997o;
        C1471qa c1471qa = (C1471qa) this.f17994l;
        try {
            L l5 = o.f4767B.f4771c;
            String uuid = UUID.randomUUID().toString();
            AbstractC1776x9.f16254o.c(uuid, new C0549Aa(cVar, c1471qa, c0634Ld));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", ((InterfaceC1740wa) cVar.f4718c).o(obj2));
            interfaceC1560sa.o((String) cVar.f4720e, jSONObject);
        } catch (Exception e3) {
            try {
                c0634Ld.c(e3);
                j.g("Unable to invokeJavascript", e3);
            } finally {
                c1471qa.q();
            }
        }
    }

    @Override // u.C0
    public long m(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        Iterator it = AbstractC0444a.f0(0, abstractC2470q.b()).iterator();
        long j5 = 0;
        while (((C2061c) it).f17856m) {
            int a5 = ((y) it).a();
            j5 = Math.max(j5, ((u.r) this.f17994l).get(a5).d(abstractC2470q.a(a5), abstractC2470q2.a(a5), abstractC2470q3.a(a5)));
        }
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        String str;
        boolean z3;
        Mr mr;
        switch (this.f17993k) {
            case 4:
                String str2 = (String) obj;
                A7 a7 = F7.F9;
                r rVar = r.f5053d;
                boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
                Map map = (Map) this.f17994l;
                if (booleanValue) {
                    map.put("u", str2);
                }
                E9 e9 = (E9) this.f17997o;
                e9.getClass();
                InterfaceC0347a interfaceC0347a = (InterfaceC0347a) this.f17995m;
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) interfaceC0347a;
                Lq v4 = interfaceC0677Re.v();
                Nq d02 = interfaceC0677Re.d0();
                if (v4 == null || d02 == null) {
                    str = "";
                    z3 = false;
                } else {
                    z3 = v4.b();
                    str = d02.f10823b;
                }
                A7 a72 = F7.na;
                D7 d7 = rVar.f5056c;
                boolean z5 = (((Boolean) d7.a(a72)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
                boolean z6 = ((Boolean) d7.a(F7.nc)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
                String str3 = (String) this.f17996n;
                if ("expand".equalsIgnoreCase(str3)) {
                    if (interfaceC0677Re.r0()) {
                        j.i("Cannot expand WebView that is already expanded.");
                        return;
                    } else {
                        e9.g(false);
                        interfaceC0677Re.L(E9.a(map), "1".equals(map.get("custom_close")), z5);
                        return;
                    }
                }
                if ("webapp".equalsIgnoreCase(str3)) {
                    e9.g(false);
                    boolean z7 = ((Boolean) d7.a(F7.xb)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
                    if (str2 != null) {
                        interfaceC0677Re.T("1".equals(map.get("custom_close")), E9.a(map), str2, z5, z7);
                        return;
                    } else {
                        interfaceC0677Re.w0("1".equals(map.get("custom_close")), E9.a(map), (String) map.get("html"), (String) map.get("baseurl"), z5);
                        return;
                    }
                }
                boolean equalsIgnoreCase = "chrome_custom_tab".equalsIgnoreCase(str3);
                Xm xm = e9.f8465o;
                if (equalsIgnoreCase) {
                    Context context = interfaceC0677Re.getContext();
                    if (((Boolean) d7.a(F7.f8921w4)).booleanValue()) {
                        G.m("User opt out chrome custom tab.");
                        e9.i(10);
                    } else {
                        if (((Boolean) d7.a(F7.f8910u4)).booleanValue() ? C2294i.a(context) != null : Q7.a(context)) {
                            e9.g(true);
                            if (TextUtils.isEmpty(str2)) {
                                j.i("Cannot open browser with null or empty url");
                                e9.i(7);
                                return;
                            }
                            Uri d5 = E9.d(E9.c(interfaceC0677Re.getContext(), interfaceC0677Re.b0(), Uri.parse(str2), interfaceC0677Re.K(), interfaceC0677Re.e(), interfaceC0677Re.Y()));
                            if (z3 && xm != null && e9.h(interfaceC0347a, interfaceC0677Re.getContext(), d5.toString(), str)) {
                                return;
                            }
                            e9.f8467q = new C9(e9);
                            interfaceC0677Re.E0(new S2.e(null, d5.toString(), null, null, null, null, null, null, new BinderC2361b(e9.f8467q), true), z5, z6, str);
                            return;
                        }
                        e9.i(4);
                    }
                    map.put("use_first_package", "true");
                    map.put("use_running_process", "true");
                    e9.f(interfaceC0347a, map, z3, str, z5, z6);
                    return;
                }
                if ("app".equalsIgnoreCase(str3) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    e9.f(interfaceC0347a, map, z3, str, z5, z6);
                    return;
                }
                if ("open_app".equalsIgnoreCase(str3)) {
                    if (((Boolean) d7.a(F7.P7)).booleanValue()) {
                        e9.g(true);
                        String str4 = (String) map.get("p");
                        if (str4 == null) {
                            j.i("Package name missing from open app action.");
                            return;
                        }
                        if (z3 && xm != null && e9.h(interfaceC0347a, interfaceC0677Re.getContext(), str4, str)) {
                            return;
                        }
                        PackageManager packageManager = interfaceC0677Re.getContext().getPackageManager();
                        if (packageManager == null) {
                            j.i("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                        if (launchIntentForPackage != null) {
                            interfaceC0677Re.E0(new S2.e(launchIntentForPackage, e9.f8467q), z5, z6, str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                e9.g(true);
                String str5 = (String) map.get("intent_url");
                Intent intent = null;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        intent = Intent.parseUri(str5, 0);
                    } catch (URISyntaxException e3) {
                        j.g("Error parsing the url: ".concat(String.valueOf(str5)), e3);
                    }
                }
                if (intent != null && intent.getData() != null) {
                    Uri data = intent.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri d6 = E9.d(E9.c(interfaceC0677Re.getContext(), interfaceC0677Re.b0(), data, interfaceC0677Re.K(), interfaceC0677Re.e(), interfaceC0677Re.Y()));
                        if (!TextUtils.isEmpty(intent.getType())) {
                            if (((Boolean) r.f5053d.f5056c.a(F7.Q7)).booleanValue()) {
                                intent.setDataAndType(d6, intent.getType());
                            }
                        }
                        intent.setData(d6);
                    }
                }
                boolean z8 = ((Boolean) r.f5053d.f5056c.a(F7.l8)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id");
                HashMap hashMap = new HashMap();
                if (z8) {
                    e9.f8467q = new D9(z5, interfaceC0347a, hashMap, map);
                    z5 = false;
                }
                if (intent != null) {
                    if (!z3 || xm == null || !e9.h(interfaceC0347a, interfaceC0677Re.getContext(), intent.getData().toString(), str)) {
                        interfaceC0677Re.E0(new S2.e(intent, e9.f8467q), z5, z6, str);
                        return;
                    } else {
                        if (z8) {
                            hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                            ((InterfaceC0889da) interfaceC0347a).a("openIntentAsync", hashMap);
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    str2 = E9.d(E9.c(interfaceC0677Re.getContext(), interfaceC0677Re.b0(), Uri.parse(str2), interfaceC0677Re.K(), interfaceC0677Re.e(), interfaceC0677Re.Y())).toString();
                }
                if (!z3 || xm == null || !e9.h(interfaceC0347a, interfaceC0677Re.getContext(), str2, str)) {
                    interfaceC0677Re.E0(new S2.e((String) map.get("i"), str2, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), e9.f8467q), z5, z6, str);
                    return;
                } else {
                    if (z8) {
                        hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                        ((InterfaceC0889da) interfaceC0347a).a("openIntentAsync", hashMap);
                        return;
                    }
                    return;
                }
            case 6:
                ((C1028gf) this.f17997o).D((Map) obj, (List) this.f17994l, (String) this.f17995m);
                return;
            case 12:
                AbstractC0579Dg abstractC0579Dg = (AbstractC0579Dg) obj;
                synchronized (((C1128iq) this.f17997o)) {
                    try {
                        C1128iq c1128iq = (C1128iq) this.f17997o;
                        if (c1128iq.f14006m) {
                            c1128iq.d();
                        }
                        if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f17994l) == null) {
                            Nr nr = ((C1128iq) this.f17997o).i;
                            Jr jr = (Jr) this.f17995m;
                            jr.d(abstractC0579Dg.f12692a.f11596b);
                            jr.H(abstractC0579Dg.f.f9590k);
                            jr.g(true);
                            nr.b(jr.l());
                        } else {
                            mr.g(abstractC0579Dg.f12692a.f11596b);
                            mr.e(abstractC0579Dg.f.f9590k);
                            Jr jr2 = (Jr) this.f17995m;
                            jr2.g(true);
                            mr.a(jr2);
                            mr.h();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                String str6 = (String) obj;
                Lq v5 = ((InterfaceC0677Re) this.f17994l).v();
                if (v5 != null && !v5.f10504i0) {
                    J0 j02 = v5.f10534x0;
                    if (!((Boolean) r.f5053d.f5056c.a(F7.E9)).booleanValue() || ((C1074hg) this.f17995m) == null || !C1074hg.b(str6)) {
                        ((C1041gs) this.f17996n).b(str6, j02, null);
                        return;
                    }
                    C1074hg c1074hg = (C1074hg) this.f17995m;
                    C1041gs c1041gs = (C1041gs) this.f17996n;
                    Random random = C0379q.f.f5052e;
                    c1074hg.getClass();
                    if (TextUtils.isEmpty(str6)) {
                        return;
                    }
                    E3.a l02 = AbstractC1400ot.l0(c1074hg.c(str6, c1074hg.f13773d.f12702a, random), ((Integer) r2.f5056c.a(F7.R9)).intValue(), TimeUnit.MILLISECONDS, c1074hg.f13775g);
                    l02.a(new Kw(0, l02, new C1071hd(c1074hg, c1041gs, str6, j02, 8, false)), c1074hg.f13774e);
                    return;
                }
                Nq d03 = ((InterfaceC0677Re) this.f17994l).d0();
                if (d03 == null) {
                    o.f4767B.f4774g.i("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                o oVar = o.f4767B;
                oVar.f4776j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                boolean a5 = oVar.f4774g.a(((InterfaceC0677Re) this.f17994l).getContext());
                boolean z9 = false;
                boolean z10 = ((Boolean) r.f5053d.f5056c.a(F7.R5)).booleanValue() && v5 != null && v5.f10481S;
                if (v5 != null && v5.f10496d0 != null) {
                    z9 = true;
                }
                K3 k32 = new K3(currentTimeMillis, d03.f10823b, str6, (a5 || z10 || z9) ? 2 : 1);
                Xm xm2 = (Xm) this.f17997o;
                xm2.getClass();
                xm2.d(new C0709Wb(25, xm2, k32));
                return;
        }
    }

    @Override // u.C0
    public AbstractC2470q p(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        if (((AbstractC2470q) this.f17996n) == null) {
            this.f17996n = abstractC2470q3.c();
        }
        AbstractC2470q abstractC2470q4 = (AbstractC2470q) this.f17996n;
        if (abstractC2470q4 == null) {
            l.k("velocityVector");
            throw null;
        }
        int b3 = abstractC2470q4.b();
        for (int i = 0; i < b3; i++) {
            AbstractC2470q abstractC2470q5 = (AbstractC2470q) this.f17996n;
            if (abstractC2470q5 == null) {
                l.k("velocityVector");
                throw null;
            }
            abstractC2470q5.e(i, ((u.r) this.f17994l).get(i).c(j5, abstractC2470q.a(i), abstractC2470q2.a(i), abstractC2470q3.a(i)));
        }
        AbstractC2470q abstractC2470q6 = (AbstractC2470q) this.f17996n;
        if (abstractC2470q6 != null) {
            return abstractC2470q6;
        }
        l.k("velocityVector");
        throw null;
    }

    public synchronized void q(A3 a32) {
        try {
            HashMap hashMap = (HashMap) this.f17994l;
            String b3 = a32.b();
            List list = (List) hashMap.remove(b3);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (F3.f8650a) {
                F3.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), b3);
            }
            A3 a33 = (A3) list.remove(0);
            ((HashMap) this.f17994l).put(b3, list);
            a33.j(this);
            try {
                ((PriorityBlockingQueue) this.f17996n).put(a33);
            } catch (InterruptedException e3) {
                F3.b("Couldn't add request to queue. %s", e3.toString());
                Thread.currentThread().interrupt();
                C1500r3 c1500r3 = (C1500r3) this.f17995m;
                c1500r3.f15262n = true;
                c1500r3.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // u.C0
    public AbstractC2470q r(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        if (((AbstractC2470q) this.f17997o) == null) {
            this.f17997o = abstractC2470q3.c();
        }
        AbstractC2470q abstractC2470q4 = (AbstractC2470q) this.f17997o;
        if (abstractC2470q4 == null) {
            l.k("endVelocityVector");
            throw null;
        }
        int b3 = abstractC2470q4.b();
        for (int i = 0; i < b3; i++) {
            AbstractC2470q abstractC2470q5 = (AbstractC2470q) this.f17997o;
            if (abstractC2470q5 == null) {
                l.k("endVelocityVector");
                throw null;
            }
            abstractC2470q5.e(i, ((u.r) this.f17994l).get(i).e(abstractC2470q.a(i), abstractC2470q2.a(i), abstractC2470q3.a(i)));
        }
        AbstractC2470q abstractC2470q6 = (AbstractC2470q) this.f17997o;
        if (abstractC2470q6 != null) {
            return abstractC2470q6;
        }
        l.k("endVelocityVector");
        throw null;
    }

    public void t(int i) {
        switch (this.f17993k) {
            case 16:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f17994l = Integer.valueOf(i);
                return;
            default:
                this.f17994l = Integer.valueOf(i);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        Mr mr;
        switch (this.f17993k) {
            case 4:
                o.f4767B.f4774g.i("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 6:
                j.i("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.f17996n)));
                return;
            case 12:
                if (((Boolean) r.f5053d.f5056c.a(F7.u5)).booleanValue()) {
                    G.n("Banner ad failed to load", th);
                }
                synchronized (((C1128iq) this.f17997o)) {
                    try {
                        C0387u0 s2 = AbstractC1803xs.s(th, ((C1253lh) ((C0594Ff) this.f17996n).f8972H0.d()).f14401l);
                        ((C1128iq) this.f17997o).f14007n = s2;
                        ((Oh) ((C0594Ff) this.f17996n).f9062u0.d()).l0(s2);
                        AbstractC1668us.D(s2.f5058k, "BannerAdLoader.onFailure", th);
                        C1128iq c1128iq = (C1128iq) this.f17997o;
                        if (c1128iq.f14006m) {
                            c1128iq.f();
                            C1128iq c1128iq2 = (C1128iq) this.f17997o;
                            c1128iq2.f14002h.p1(c1128iq2.f14003j.a());
                        }
                        if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f17994l) == null) {
                            Nr nr = ((C1128iq) this.f17997o).i;
                            Jr jr = (Jr) this.f17995m;
                            jr.q(s2);
                            jr.f(th);
                            jr.g(false);
                            nr.b(jr.l());
                        } else {
                            mr.c(s2);
                            Jr jr2 = (Jr) this.f17995m;
                            jr2.f(th);
                            jr2.g(false);
                            mr.a(jr2);
                            mr.h();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                return;
        }
    }

    public void v(A3 a32, W w5) {
        List list;
        C1456q3 c1456q3 = (C1456q3) w5.f4413m;
        if (c1456q3 == null || c1456q3.f15091e < System.currentTimeMillis()) {
            q(a32);
            return;
        }
        String b3 = a32.b();
        synchronized (this) {
            list = (List) ((HashMap) this.f17994l).remove(b3);
        }
        if (list != null) {
            if (F3.f8650a) {
                F3.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), b3);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((U4) this.f17997o).j((A3) it.next(), w5, null);
            }
        }
    }

    public void w() {
        this.f17996n = 16;
    }

    public void x(int i) {
        this.f17995m = Integer.valueOf(i);
    }

    public synchronized boolean y(A3 a32) {
        try {
            HashMap hashMap = (HashMap) this.f17994l;
            String b3 = a32.b();
            if (!hashMap.containsKey(b3)) {
                ((HashMap) this.f17994l).put(b3, null);
                a32.j(this);
                if (F3.f8650a) {
                    F3.a("new request, sending to network %s", b3);
                }
                return false;
            }
            List list = (List) ((HashMap) this.f17994l).get(b3);
            if (list == null) {
                list = new ArrayList();
            }
            a32.d("waiting-for-response");
            list.add(a32);
            ((HashMap) this.f17994l).put(b3, list);
            if (F3.f8650a) {
                F3.a("Request for cacheKey=%s is in flight, putting on hold.", b3);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        boolean T4;
        try {
            int ordinal = ((J2.c) this.f17996n).ordinal();
            InterfaceC1427pb interfaceC1427pb = (InterfaceC1427pb) this.f17995m;
            if (ordinal == 1) {
                T4 = interfaceC1427pb.T(new BinderC2361b(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        T4 = interfaceC1427pb.O(new BinderC2361b(context));
                    }
                    throw new C1121ij("Adapter failed to show.");
                }
                T4 = interfaceC1427pb.Q2(new BinderC2361b(context));
            }
            if (T4) {
                Uh uh = (Uh) this.f17997o;
                if (uh == null) {
                    return;
                }
                if (((Boolean) r.f5053d.f5056c.a(F7.f8913v1)).booleanValue() || ((Lq) this.f17994l).f10487Y != 2) {
                    return;
                }
                uh.i();
                return;
            }
            throw new C1121ij("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C1121ij(th);
        }
    }

    public g(View view, InterfaceC0677Re interfaceC0677Re, InterfaceC0735Zg interfaceC0735Zg, Mq mq) {
        this.f17993k = 8;
        this.f17995m = view;
        this.f17997o = interfaceC0677Re;
        this.f17994l = interfaceC0735Zg;
        this.f17996n = mq;
    }

    public /* synthetic */ g(C0554Af c0554Af, C0601Gf c0601Gf, Long l5, String str) {
        this.f17993k = 7;
        this.f17996n = c0554Af;
        this.f17997o = c0601Gf;
        this.f17994l = l5;
        this.f17995m = str;
    }

    public g(Lq lq, InterfaceC1427pb interfaceC1427pb, J2.c cVar) {
        this.f17993k = 10;
        this.f17997o = null;
        this.f17994l = lq;
        this.f17995m = interfaceC1427pb;
        this.f17996n = cVar;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f17993k = i;
        this.f17994l = obj2;
        this.f17995m = obj3;
        this.f17996n = obj4;
        this.f17997o = obj;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z3) {
        this.f17993k = i;
        this.f17994l = obj;
        this.f17995m = obj2;
        this.f17996n = obj3;
        this.f17997o = obj4;
    }

    public g(C1500r3 c1500r3, PriorityBlockingQueue priorityBlockingQueue, U4 u42) {
        this.f17993k = 3;
        this.f17994l = new HashMap();
        this.f17997o = u42;
        this.f17995m = c1500r3;
        this.f17996n = priorityBlockingQueue;
    }

    public g(F f, h hVar) {
        this.f17993k = 2;
        this.f17994l = f;
        this.f17995m = hVar;
        AutofillManager e3 = N.e(f.getContext().getSystemService(N.i()));
        if (e3 != null) {
            this.f17996n = e3;
            f.setImportantForAutofill(1);
            J0 x5 = AbstractC2036a.x(f);
            AutofillId e5 = x5 != null ? X.e(x5.f304k) : null;
            if (e5 != null) {
                this.f17997o = e5;
                return;
            }
            throw AbstractC0467k.u("Required value was null.");
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public g(P0 p02) {
        this.f17993k = 1;
        this.f17994l = p02;
        this.f17995m = new I1.g();
        new LinkedHashSet();
        this.f17996n = new LinkedHashSet();
        this.f17997o = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(d1.g gVar) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i5;
        this.f17993k = 18;
        this.f17997o = new Bundle();
        this.f17996n = gVar;
        Context context = gVar.f16866a;
        this.f17994l = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17995m = D0.c.a(context, gVar.f16877n);
        } else {
            this.f17995m = new Notification.Builder(gVar.f16866a);
        }
        Notification notification = gVar.f16879p;
        Context context2 = null;
        ((Notification.Builder) this.f17995m).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gVar.f16870e).setContentText(gVar.f).setContentInfo(null).setContentIntent(gVar.f16871g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f17995m;
        IconCompat iconCompat = gVar.f16872h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.f17995m).setSubText(null).setUsesChronometer(false).setPriority(gVar.i);
        ArrayList arrayList2 = gVar.f16867b;
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            C1912c c1912c = (C1912c) obj;
            if (c1912c.f16857b == null && (i5 = c1912c.f16860e) != 0) {
                c1912c.f16857b = IconCompat.b(i5);
            }
            IconCompat iconCompat2 = c1912c.f16857b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, c1912c.f, c1912c.f16861g);
            Bundle bundle3 = c1912c.f16856a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z3 = c1912c.f16858c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z3);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24) {
                d1.h.e(builder2, z3);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                d1.i.p(builder2);
            }
            if (i7 >= 29) {
                D0.a.k(builder2);
            }
            if (i7 >= 31) {
                d1.j.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c1912c.f16859d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f17995m).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle4 = gVar.f16876m;
        if (bundle4 != null) {
            ((Bundle) this.f17997o).putAll(bundle4);
        }
        ((Notification.Builder) this.f17995m).setShowWhen(gVar.f16873j);
        ((Notification.Builder) this.f17995m).setLocalOnly(gVar.f16875l);
        ((Notification.Builder) this.f17995m).setGroup(null);
        ((Notification.Builder) this.f17995m).setSortKey(null);
        ((Notification.Builder) this.f17995m).setGroupSummary(false);
        ((Notification.Builder) this.f17995m).setCategory(null);
        ((Notification.Builder) this.f17995m).setColor(0);
        ((Notification.Builder) this.f17995m).setVisibility(0);
        ((Notification.Builder) this.f17995m).setPublicVersion(null);
        ((Notification.Builder) this.f17995m).setSound(notification.sound, notification.audioAttributes);
        int i8 = Build.VERSION.SDK_INT;
        ArrayList arrayList3 = gVar.f16880q;
        ArrayList arrayList4 = gVar.f16868c;
        if (i8 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    C2328f c2328f = new C2328f(arrayList3.size() + arrayList.size());
                    c2328f.addAll(arrayList);
                    c2328f.addAll(arrayList3);
                    arrayList3 = new ArrayList(c2328f);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                ((Notification.Builder) this.f17995m).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = gVar.f16869d;
        if (arrayList5.size() > 0) {
            if (gVar.f16876m == null) {
                gVar.f16876m = new Bundle();
            }
            Bundle bundle5 = gVar.f16876m.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                String num = Integer.toString(i10);
                C1912c c1912c2 = (C1912c) arrayList5.get(i10);
                Bundle bundle8 = new Bundle();
                if (c1912c2.f16857b == null && (i = c1912c2.f16860e) != 0) {
                    c1912c2.f16857b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = c1912c2.f16857b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", c1912c2.f);
                bundle8.putParcelable("actionIntent", c1912c2.f16861g);
                Bundle bundle9 = c1912c2.f16856a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c1912c2.f16858c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c1912c2.f16859d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (gVar.f16876m == null) {
                gVar.f16876m = new Bundle();
            }
            gVar.f16876m.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f17997o).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            ((Notification.Builder) this.f17995m).setExtras(gVar.f16876m);
            d1.h.f((Notification.Builder) this.f17995m);
        }
        if (i11 >= 26) {
            D0.c.g((Notification.Builder) this.f17995m);
            D0.c.m((Notification.Builder) this.f17995m);
            D0.c.n((Notification.Builder) this.f17995m);
            D0.c.o((Notification.Builder) this.f17995m);
            D0.c.i((Notification.Builder) this.f17995m);
            if (!TextUtils.isEmpty(gVar.f16877n)) {
                ((Notification.Builder) this.f17995m).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i11 >= 29) {
            D0.a.i((Notification.Builder) this.f17995m, gVar.f16878o);
            D0.a.j((Notification.Builder) this.f17995m);
        }
        if (i11 >= 36) {
            d1.k.e((Notification.Builder) this.f17995m);
        }
    }

    private final void s(Throwable th) {
    }

    public g(Typeface typeface, w1.b bVar) {
        int i;
        int i5;
        int i6;
        int i7;
        this.f17993k = 21;
        this.f17997o = typeface;
        this.f17994l = bVar;
        this.f17996n = new s(1024);
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i8 = a5 + bVar.f6155k;
            i = ((ByteBuffer) bVar.f6158n).getInt(((ByteBuffer) bVar.f6158n).getInt(i8) + i8);
        } else {
            i = 0;
        }
        this.f17995m = new char[i * 2];
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i9 = a6 + bVar.f6155k;
            i5 = ((ByteBuffer) bVar.f6158n).getInt(((ByteBuffer) bVar.f6158n).getInt(i9) + i9);
        } else {
            i5 = 0;
        }
        for (int i10 = 0; i10 < i5; i10++) {
            v vVar = new v(this, i10);
            C2542a b3 = vVar.b();
            int a7 = b3.a(4);
            Character.toChars(a7 != 0 ? ((ByteBuffer) b3.f6158n).getInt(a7 + b3.f6155k) : 0, (char[]) this.f17995m, i10 * 2);
            C2542a b5 = vVar.b();
            int a8 = b5.a(16);
            if (a8 != 0) {
                int i11 = a8 + b5.f6155k;
                i6 = ((ByteBuffer) b5.f6158n).getInt(((ByteBuffer) b5.f6158n).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                C2542a b6 = vVar.b();
                int a9 = b6.a(16);
                if (a9 != 0) {
                    int i12 = a9 + b6.f6155k;
                    i7 = ((ByteBuffer) b6.f6158n).getInt(((ByteBuffer) b6.f6158n).getInt(i12) + i12);
                } else {
                    i7 = 0;
                }
                ((s) this.f17996n).a(vVar, 0, i7 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public g(InterfaceC0499d interfaceC0499d, BinderC2290e binderC2290e, ComponentName componentName) {
        this.f17993k = 19;
        this.f17994l = new Object();
        this.f17995m = interfaceC0499d;
        this.f17996n = binderC2290e;
        this.f17997o = componentName;
    }

    public g(u.r rVar) {
        this.f17993k = 20;
        this.f17994l = rVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC2431B interfaceC2431B) {
        this(new C2138i(10, interfaceC2431B));
        this.f17993k = 20;
    }
}
