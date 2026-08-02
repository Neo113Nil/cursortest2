package Q2;

import K0.AbstractC0205j;
import K0.C0201f;
import K0.C0202g;
import K0.C0203h;
import K0.C0204i;
import O4.AbstractC0260f;
import O4.AbstractC0266l;
import O4.ExecutorC0255a;
import O4.InterfaceC0261g;
import O4.InterfaceC0267m;
import Q2.C0375o;
import a3.BinderC0468l;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC0762ah;
import com.google.android.gms.internal.ads.AbstractC0834c8;
import com.google.android.gms.internal.ads.AbstractC1058h8;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import com.google.android.gms.internal.ads.AbstractC1823yB;
import com.google.android.gms.internal.ads.As;
import com.google.android.gms.internal.ads.B5;
import com.google.android.gms.internal.ads.Bq;
import com.google.android.gms.internal.ads.C0554Af;
import com.google.android.gms.internal.ads.C0578Df;
import com.google.android.gms.internal.ads.C0608Hf;
import com.google.android.gms.internal.ads.C0622Jf;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C0636Lf;
import com.google.android.gms.internal.ads.C0816bq;
import com.google.android.gms.internal.ads.C0863ct;
import com.google.android.gms.internal.ads.C0895dg;
import com.google.android.gms.internal.ads.C0898dj;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.C0919e4;
import com.google.android.gms.internal.ads.C0949eq;
import com.google.android.gms.internal.ads.C1048gz;
import com.google.android.gms.internal.ads.C1087ht;
import com.google.android.gms.internal.ads.C1097i2;
import com.google.android.gms.internal.ads.C1175jt;
import com.google.android.gms.internal.ads.C1185k2;
import com.google.android.gms.internal.ads.C1253lh;
import com.google.android.gms.internal.ads.C1285mC;
import com.google.android.gms.internal.ads.C1320n2;
import com.google.android.gms.internal.ads.C1324n6;
import com.google.android.gms.internal.ads.C1367o4;
import com.google.android.gms.internal.ads.C1383oc;
import com.google.android.gms.internal.ads.C1395oo;
import com.google.android.gms.internal.ads.C1419pB;
import com.google.android.gms.internal.ads.C1523ri;
import com.google.android.gms.internal.ads.C1529ro;
import com.google.android.gms.internal.ads.C1579st;
import com.google.android.gms.internal.ads.C1619to;
import com.google.android.gms.internal.ads.C1624tt;
import com.google.android.gms.internal.ads.C1669ut;
import com.google.android.gms.internal.ads.C1714vt;
import com.google.android.gms.internal.ads.C1733wB;
import com.google.android.gms.internal.ads.C1743wd;
import com.google.android.gms.internal.ads.C1748wi;
import com.google.android.gms.internal.ads.C1846yq;
import com.google.android.gms.internal.ads.C1880zf;
import com.google.android.gms.internal.ads.C1881zg;
import com.google.android.gms.internal.ads.C1893zs;
import com.google.android.gms.internal.ads.C1894zt;
import com.google.android.gms.internal.ads.Cs;
import com.google.android.gms.internal.ads.Dp;
import com.google.android.gms.internal.ads.Dq;
import com.google.android.gms.internal.ads.Ds;
import com.google.android.gms.internal.ads.EnumC1848ys;
import com.google.android.gms.internal.ads.Eo;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.FA;
import com.google.android.gms.internal.ads.Fq;
import com.google.android.gms.internal.ads.GB;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.Hq;
import com.google.android.gms.internal.ads.I8;
import com.google.android.gms.internal.ads.InterfaceC1192k9;
import com.google.android.gms.internal.ads.InterfaceC1429pd;
import com.google.android.gms.internal.ads.J8;
import com.google.android.gms.internal.ads.Jo;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.Jw;
import com.google.android.gms.internal.ads.Ks;
import com.google.android.gms.internal.ads.Lq;
import com.google.android.gms.internal.ads.Ls;
import com.google.android.gms.internal.ads.M1;
import com.google.android.gms.internal.ads.Mr;
import com.google.android.gms.internal.ads.Mt;
import com.google.android.gms.internal.ads.Mw;
import com.google.android.gms.internal.ads.My;
import com.google.android.gms.internal.ads.Nr;
import com.google.android.gms.internal.ads.Oh;
import com.google.android.gms.internal.ads.Oi;
import com.google.android.gms.internal.ads.Qk;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.Rk;
import com.google.android.gms.internal.ads.RunnableC0985fh;
import com.google.android.gms.internal.ads.RunnableC1081hn;
import com.google.android.gms.internal.ads.RunnableC1303mm;
import com.google.android.gms.internal.ads.Sq;
import com.google.android.gms.internal.ads.U4;
import com.google.android.gms.internal.ads.Wy;
import com.google.android.gms.internal.ads.XB;
import com.google.android.gms.internal.ads.Z1;
import d2.AbstractC1914b;
import e2.AbstractC1933n;
import e2.C1921b;
import e2.C1930k;
import i4.InterfaceC2015a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.InterfaceC2092b;
import m3.InterfaceC2093c;
import o0.C2202f;
import o4.AbstractC2227e;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import q3.AbstractC2309b;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import t2.C2414b;
import t3.C2424c;
import v.AbstractC2527w;
import y4.C2675c;
import y4.InterfaceC2676d;

/* renamed from: Q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375o implements K0.v, Jw, M1, P2.d, InterfaceC2092b, InterfaceC2093c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5041k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5042l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5043m;

    /* renamed from: n, reason: collision with root package name */
    public Object f5044n;

    /* renamed from: o, reason: collision with root package name */
    public Object f5045o;

    /* renamed from: p, reason: collision with root package name */
    public Object f5046p;

    public C0375o(Context context, P2.c cVar, U2.a aVar) {
        this.f5041k = 8;
        this.f5042l = new Object();
        this.f5043m = context.getApplicationContext();
        this.f5046p = aVar;
        this.f5045o = cVar;
    }

    public static C1367o4 F() {
        C0919e4 W4 = C1367o4.W();
        W4.e();
        C1367o4.H((C1367o4) W4.f10141l, 32768L);
        return (C1367o4) W4.b();
    }

    private final void G(Throwable th) {
        Mr mr;
        A7 a7 = F7.u5;
        r rVar = r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            T2.G.n("App open ad failed to load", th);
        }
        C0578Df c0578Df = (C0578Df) ((C0949eq) this.f5046p).f13359e.j();
        C0387u0 s2 = c0578Df == null ? AbstractC1803xs.s(th, null) : AbstractC1803xs.s(th, c0578Df.d().f14401l);
        synchronized (((C0949eq) this.f5046p)) {
            try {
                C0949eq c0949eq = (C0949eq) this.f5046p;
                c0949eq.f13362j = null;
                if (c0578Df != null) {
                    ((Oh) c0578Df.B0.d()).l0(s2);
                    if (((Boolean) rVar.f5056c.a(F7.M7)).booleanValue()) {
                        ((C0949eq) this.f5046p).f13356b.execute(new RunnableC1081hn(4, this, s2));
                    }
                } else {
                    c0949eq.f13358d.l0(s2);
                    ((C0949eq) this.f5046p).b((C0816bq) this.f5045o).a().d().f.g();
                }
                AbstractC1668us.D(s2.f5058k, "AppOpenAdLoader.onFailure", th);
                ((Jo) this.f5042l).mo10a();
                if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f5043m) == null) {
                    Nr nr = ((C0949eq) this.f5046p).f13361h;
                    Jr jr = (Jr) this.f5044n;
                    jr.q(s2);
                    jr.f(th);
                    jr.g(false);
                    nr.b(jr.l());
                } else {
                    mr.c(s2);
                    Jr jr2 = (Jr) this.f5044n;
                    jr2.f(th);
                    jr2.g(false);
                    mr.a(jr2);
                    mr.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void H(Throwable th) {
        Mr mr;
        A7 a7 = F7.u5;
        r rVar = r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            T2.G.n("Interstitial ad failed to load", th);
        }
        final C0387u0 s2 = AbstractC1803xs.s(th, ((C1253lh) ((C0622Jf) this.f5045o).f9936C0.d()).f14401l);
        synchronized (((C1846yq) this.f5046p)) {
            try {
                ((C1846yq) this.f5046p).i = null;
                ((Oh) ((C0622Jf) this.f5045o).f10017p0.d()).l0(s2);
                if (((Boolean) rVar.f5056c.a(F7.N7)).booleanValue()) {
                    final int i = 0;
                    ((C1846yq) this.f5046p).f16484b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wq

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ C0375o f16172l;

                        {
                            this.f16172l = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    ((C1846yq) this.f16172l.f5046p).f16486d.l0(s2);
                                    break;
                                default:
                                    ((C1846yq) this.f16172l.f5046p).f16487e.l0(s2);
                                    break;
                            }
                        }
                    });
                    final int i5 = 1;
                    ((C1846yq) this.f5046p).f16484b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wq

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ C0375o f16172l;

                        {
                            this.f16172l = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    ((C1846yq) this.f16172l.f5046p).f16486d.l0(s2);
                                    break;
                                default:
                                    ((C1846yq) this.f16172l.f5046p).f16487e.l0(s2);
                                    break;
                            }
                        }
                    });
                }
                AbstractC1668us.D(s2.f5058k, "InterstitialAdLoader.onFailure", th);
                ((Jo) this.f5042l).mo10a();
                if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f5043m) == null) {
                    Nr nr = ((C1846yq) this.f5046p).f16488g;
                    Jr jr = (Jr) this.f5044n;
                    jr.q(s2);
                    jr.f(th);
                    jr.g(false);
                    nr.b(jr.l());
                } else {
                    mr.c(s2);
                    Jr jr2 = (Jr) this.f5044n;
                    jr2.f(th);
                    jr2.g(false);
                    mr.a(jr2);
                    mr.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void I(Object obj) {
        Mr mr;
        AbstractC0762ah abstractC0762ah = (AbstractC0762ah) obj;
        synchronized (((C1324n6) this.f5046p)) {
            try {
                ((C1523ri) abstractC0762ah.f12697g.f15334k.f11282l).f15335l = (Eo) ((C0905dr) ((C1324n6) this.f5046p).f14580m).f13187m;
                ((C1529ro) this.f5042l).h(abstractC0762ah);
                ((C0554Af) ((C1324n6) this.f5046p).f14579l).a().execute(new RunnableC0985fh(this, 1));
                if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f5043m) == null) {
                    Nr nr = (Nr) ((C1324n6) this.f5046p).f14581n;
                    Jr jr = (Jr) this.f5044n;
                    jr.d(abstractC0762ah.f12692a.f11596b);
                    jr.H(abstractC0762ah.f.f9590k);
                    jr.g(true);
                    nr.b(jr.l());
                } else {
                    mr.g(abstractC0762ah.f12692a.f11596b);
                    mr.e(abstractC0762ah.f.f9590k);
                    Jr jr2 = (Jr) this.f5044n;
                    jr2.g(true);
                    mr.a(jr2);
                    mr.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void J(Object obj) {
        Mr mr;
        AbstractC0762ah abstractC0762ah = (AbstractC0762ah) obj;
        synchronized (((C0949eq) this.f5046p)) {
            try {
                ((C0949eq) this.f5046p).f13362j = null;
                if (((Boolean) r.f5053d.f5056c.a(F7.M7)).booleanValue()) {
                    ((C1523ri) abstractC0762ah.f12697g.f15334k.f11282l).f15337n = ((C0949eq) this.f5046p).f13358d;
                }
                ((Jo) this.f5042l).h(abstractC0762ah);
                if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f5043m) == null) {
                    Nr nr = ((C0949eq) this.f5046p).f13361h;
                    Jr jr = (Jr) this.f5044n;
                    jr.d(abstractC0762ah.f12692a.f11596b);
                    jr.H(abstractC0762ah.f.f9590k);
                    jr.g(true);
                    nr.b(jr.l());
                } else {
                    mr.g(abstractC0762ah.f12692a.f11596b);
                    mr.e(abstractC0762ah.f.f9590k);
                    Jr jr2 = (Jr) this.f5044n;
                    jr2.g(true);
                    mr.a(jr2);
                    mr.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void K(Object obj) {
        Mr mr;
        C0898dj c0898dj = (C0898dj) obj;
        synchronized (((C1846yq) this.f5046p)) {
            try {
                ((C1846yq) this.f5046p).i = null;
                A7 a7 = F7.N7;
                r rVar = r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    Qt qt = c0898dj.f12697g.f15334k;
                    C1846yq c1846yq = (C1846yq) this.f5046p;
                    Eo eo = c1846yq.f16486d;
                    C1523ri c1523ri = (C1523ri) qt.f11282l;
                    c1523ri.f15335l = eo;
                    c1523ri.f15338o = c1846yq.f16487e;
                }
                ((Jo) this.f5042l).h(c0898dj);
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    final int i = 0;
                    ((C1846yq) this.f5046p).f16484b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xq

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ C0375o f16337l;

                        {
                            this.f16337l = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    ((C1846yq) this.f16337l.f5046p).f16486d.j0();
                                    break;
                                default:
                                    ((C1846yq) this.f16337l.f5046p).f16487e.j0();
                                    break;
                            }
                        }
                    });
                    final int i5 = 1;
                    ((C1846yq) this.f5046p).f16484b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xq

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ C0375o f16337l;

                        {
                            this.f16337l = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    ((C1846yq) this.f16337l.f5046p).f16486d.j0();
                                    break;
                                default:
                                    ((C1846yq) this.f16337l.f5046p).f16487e.j0();
                                    break;
                            }
                        }
                    });
                }
                if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f5043m) == null) {
                    Nr nr = ((C1846yq) this.f5046p).f16488g;
                    Jr jr = (Jr) this.f5044n;
                    jr.d(c0898dj.f12692a.f11596b);
                    jr.H(c0898dj.f.f9590k);
                    jr.g(true);
                    nr.b(jr.l());
                } else {
                    mr.g(c0898dj.f12692a.f11596b);
                    mr.e(c0898dj.f.f9590k);
                    Jr jr2 = (Jr) this.f5044n;
                    jr2.g(true);
                    mr.a(jr2);
                    mr.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static JSONObject M(Context context, U2.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC1058h8.f13712b.s()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f5852k);
            jSONObject.put("mf", AbstractC1058h8.f13713c.s());
            jSONObject.put("cl", "697668803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", C2424c.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static C0375o P(Context context, ExecutorService executorService, P.W w5, C0863ct c0863ct) {
        final C0375o c0375o = new C0375o(context, executorService, w5, c0863ct, new C1087ht(), new C1175jt());
        if (c0863ct.f13055b) {
            final int i = 0;
            c0375o.f5045o = c0375o.T(new Callable(c0375o) { // from class: com.google.android.gms.internal.ads.gt

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0375o f13672b;

                {
                    this.f13672b = c0375o;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i) {
                        case 0:
                            C0375o c0375o2 = this.f13672b;
                            C0919e4 W4 = C1367o4.W();
                            N2.a a5 = N2.b.a((Context) c0375o2.f5042l);
                            String str = a5.f3749a;
                            if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                                UUID fromString = UUID.fromString(str);
                                byte[] bArr = new byte[16];
                                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                wrap.putLong(fromString.getMostSignificantBits());
                                wrap.putLong(fromString.getLeastSignificantBits());
                                str = Base64.encodeToString(bArr, 11);
                            }
                            if (str != null) {
                                W4.e();
                                C1367o4.w((C1367o4) W4.f10141l, str);
                                W4.e();
                                C1367o4.M0((C1367o4) W4.f10141l, a5.f3750b);
                                W4.e();
                                C1367o4.k0((C1367o4) W4.f10141l);
                            }
                            return (C1367o4) W4.b();
                        default:
                            Context context2 = (Context) this.f13672b.f5042l;
                            return AbstractC1803xs.g(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                    }
                }
            });
        } else {
            C1367o4 c1367o4 = C1087ht.f13812a;
            D3.o oVar = new D3.o();
            oVar.f(c1367o4);
            c0375o.f5045o = oVar;
        }
        final int i5 = 1;
        c0375o.f5046p = c0375o.T(new Callable(c0375o) { // from class: com.google.android.gms.internal.ads.gt

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0375o f13672b;

            {
                this.f13672b = c0375o;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i5) {
                    case 0:
                        C0375o c0375o2 = this.f13672b;
                        C0919e4 W4 = C1367o4.W();
                        N2.a a5 = N2.b.a((Context) c0375o2.f5042l);
                        String str = a5.f3749a;
                        if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                            UUID fromString = UUID.fromString(str);
                            byte[] bArr = new byte[16];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.putLong(fromString.getMostSignificantBits());
                            wrap.putLong(fromString.getLeastSignificantBits());
                            str = Base64.encodeToString(bArr, 11);
                        }
                        if (str != null) {
                            W4.e();
                            C1367o4.w((C1367o4) W4.f10141l, str);
                            W4.e();
                            C1367o4.M0((C1367o4) W4.f10141l, a5.f3750b);
                            W4.e();
                            C1367o4.k0((C1367o4) W4.f10141l);
                        }
                        return (C1367o4) W4.b();
                    default:
                        Context context2 = (Context) this.f13672b.f5042l;
                        return AbstractC1803xs.g(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                }
            }
        });
        return c0375o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(C0375o c0375o, String str) {
        As as = As.f7731l;
        Cs cs = Cs.f8094l;
        Ds ds = Ds.f8405m;
        int i = 0;
        C1893zs c1893zs = new C1893zs(C1894zt.a(as, cs, ds, ds, false), new Z1((C1748wi) c0375o.f5042l, (WebView) c0375o.f5043m, null, null, EnumC1848ys.f16493l), str);
        ((HashMap) c0375o.f5045o).put(str, c1893zs);
        X.m mVar = (X.m) c0375o.f5044n;
        c1893zs.b(mVar == null ? null : (View) mVar.get());
        ArrayList arrayList = ((Ls) c0375o.f5046p).f10552a;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Ks ks = (Ks) obj;
            View view = (View) ks.f10274a.get();
            if (!c1893zs.f) {
                c1893zs.f16776b.a(view, ks.f10276c);
            }
        }
        c1893zs.c();
    }

    public static void U(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C0379q c0379q = C0379q.f;
        U2.e eVar = c0379q.f5048a;
        String str2 = c0379q.f5051d.f5852k;
        eVar.getClass();
        U2.e.k(context, str2, bundle, new Q1.j(eVar));
    }

    public InterfaceC0267m A(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f5045o;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC0267m b3 = ((AbstractC0266l) list.get(i)).b(type, annotationArr, this);
            if (b3 != null) {
                return b3;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0266l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public void B(String str, Object obj) {
        kotlin.jvm.internal.l.f("key", str);
        ((LinkedHashMap) this.f5042l).put(str, obj);
        s4.v vVar = (s4.v) ((LinkedHashMap) this.f5044n).get(str);
        if (vVar != null) {
            ((s4.M) vVar).i(obj);
        }
        s4.v vVar2 = (s4.v) ((LinkedHashMap) this.f5045o).get(str);
        if (vVar2 != null) {
            ((s4.M) vVar2).i(obj);
        }
    }

    public void C(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f5045o;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0266l) list.get(i)).getClass();
        }
    }

    public void D(Class cls, Object obj) {
        kotlin.jvm.internal.l.f("type", cls);
        if (obj == null) {
            ((LinkedHashMap) this.f5046p).remove(cls);
            return;
        }
        if (((LinkedHashMap) this.f5046p).isEmpty()) {
            this.f5046p = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5046p;
        Object cast = cls.cast(obj);
        kotlin.jvm.internal.l.c(cast);
        linkedHashMap.put(cls, cast);
    }

    public E3.a E() {
        synchronized (this.f5042l) {
            try {
                if (((SharedPreferences) this.f5044n) == null) {
                    this.f5044n = ((Context) this.f5043m).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f5044n;
        long j5 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        P2.o.f4767B.f4776j.getClass();
        if (System.currentTimeMillis() - j5 < ((Long) AbstractC1058h8.f13714d.s()).longValue()) {
            return Mw.f10750l;
        }
        return AbstractC1400ot.h0(((P2.c) this.f5045o).b(M((Context) this.f5043m, (U2.a) this.f5046p)), new C1383oc(0, this), AbstractC0613Id.f9544g);
    }

    @Override // m3.InterfaceC2092b
    public void L(int i) {
        try {
            ((LinkedBlockingQueue) this.f5045o).put(F());
        } catch (InterruptedException unused) {
        }
    }

    @Override // m3.InterfaceC2092b
    public void N() {
        C1714vt c1714vt;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f5045o;
        HandlerThread handlerThread = (HandlerThread) this.f5046p;
        try {
            c1714vt = (C1714vt) ((C1579st) this.f5042l).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            c1714vt = null;
        }
        if (c1714vt != null) {
            try {
                try {
                    C1624tt c1624tt = new C1624tt(1, (String) this.f5043m, (String) this.f5044n);
                    Parcel N5 = c1714vt.N();
                    F5.c(N5, c1624tt);
                    Parcel Y4 = c1714vt.Y(N5, 1);
                    C1669ut c1669ut = (C1669ut) F5.a(Y4, C1669ut.CREATOR);
                    Y4.recycle();
                    if (c1669ut.f15922l == null) {
                        try {
                            byte[] bArr = c1669ut.f15923m;
                            GB gb = GB.f9177a;
                            C1285mC c1285mC = C1285mC.f14484c;
                            c1669ut.f15922l = C1367o4.r0(bArr, GB.f9178b);
                            c1669ut.f15923m = null;
                        } catch (XB | NullPointerException e3) {
                            throw new IllegalStateException(e3);
                        }
                    }
                    c1669ut.a();
                    linkedBlockingQueue.put(c1669ut.f15922l);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(F());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                i();
                handlerThread.quit();
                throw th;
            }
            i();
            handlerThread.quit();
        }
    }

    public void R(Object obj, FA fa, boolean z3) {
        byte[] b3;
        if (((HashMap) this.f5043m) == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (fa.E() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int ordinal = fa.z().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    b3 = AbstractC1668us.f15920e;
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            b3 = Wy.a(fa.w()).b();
        } else {
            b3 = Wy.b(fa.w()).b();
        }
        C1419pB a5 = C1419pB.a(b3);
        C1048gz c1048gz = new C1048gz(obj, a5, fa.E(), fa.z(), fa.w(), fa.x().A());
        HashMap hashMap = (HashMap) this.f5043m;
        ArrayList arrayList = (ArrayList) this.f5044n;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c1048gz);
        List list = (List) hashMap.put(a5, Collections.unmodifiableList(arrayList2));
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            arrayList3.add(c1048gz);
            hashMap.put(a5, Collections.unmodifiableList(arrayList3));
        }
        arrayList.add(c1048gz);
        if (z3) {
            if (((C1048gz) this.f5045o) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f5045o = c1048gz;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] S() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (((byte[]) this.f5046p) == null) {
            try {
                fileInputStream = new FileInputStream((File) this.f5045o);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                ArrayList arrayList = new ArrayList();
                int i = 256;
                while (true) {
                    byte[] bArr3 = new byte[i];
                    int i5 = 0;
                    while (i5 < i) {
                        int read = fileInputStream.read(bArr3, i5, i - i5);
                        if (read == -1) {
                            break;
                        }
                        i5 += read;
                    }
                    C1733wB r5 = i5 == 0 ? null : AbstractC1823yB.r(bArr3, 0, i5);
                    if (r5 == null) {
                        break;
                    }
                    arrayList.add(r5);
                    i = Math.min(i + i, 8192);
                }
                bArr2 = AbstractC1823yB.q(arrayList).c();
                AbstractC2309b.c(fileInputStream);
            } catch (IOException unused2) {
                AbstractC2309b.c(fileInputStream);
                bArr2 = null;
                this.f5046p = bArr2;
                bArr = (byte[]) this.f5046p;
                if (bArr != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC2309b.c(fileInputStream2);
                throw th;
            }
            this.f5046p = bArr2;
        }
        bArr = (byte[]) this.f5046p;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public D3.o T(Callable callable) {
        ExecutorService executorService = (ExecutorService) this.f5043m;
        m3.v.f("Executor must not be null", executorService);
        D3.o oVar = new D3.o();
        executorService.execute(new D3.h(5, oVar, callable, false));
        oVar.f967b.e(new D3.i(executorService, new Hq(4, this)));
        oVar.i();
        return oVar;
    }

    @Override // m3.InterfaceC2093c
    public void Y(j3.b bVar) {
        try {
            ((LinkedBlockingQueue) this.f5045o).put(F());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.M1
    public int a() {
        return ((long[]) this.f5043m).length;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [W3.e, java.lang.Object] */
    @Override // K0.v
    public float b() {
        return ((Number) this.f5044n.getValue()).floatValue();
    }

    @Override // K0.v
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.f5046p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((K0.u) arrayList.get(i)).f2868a.c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [W3.e, java.lang.Object] */
    @Override // K0.v
    public float e() {
        return ((Number) this.f5045o.getValue()).floatValue();
    }

    @Override // com.google.android.gms.internal.ads.M1
    public ArrayList f(long j5) {
        C1185k2 c1185k2 = (C1185k2) this.f5042l;
        ArrayList arrayList = new ArrayList();
        c1185k2.h(j5, c1185k2.f14213h, arrayList);
        TreeMap treeMap = new TreeMap();
        c1185k2.j(j5, false, c1185k2.f14213h, treeMap);
        HashMap hashMap = (HashMap) this.f5045o;
        c1185k2.i(j5, (Map) this.f5044n, hashMap, c1185k2.f14213h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) ((HashMap) this.f5046p).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C1320n2 c1320n2 = (C1320n2) hashMap.get(pair.first);
                c1320n2.getClass();
                arrayList2.add(new C1881zg(null, null, null, decodeByteArray, c1320n2.f14571c, 0, c1320n2.f14573e, c1320n2.f14570b, 0, Integer.MIN_VALUE, -3.4028235E38f, c1320n2.f, c1320n2.f14574g, c1320n2.f14576j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1320n2 c1320n22 = (C1320n2) hashMap.get(entry.getKey());
            c1320n22.getClass();
            C0895dg c0895dg = (C0895dg) entry.getValue();
            CharSequence charSequence = c0895dg.f13128a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C1097i2 c1097i2 : (C1097i2[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1097i2.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1097i2), spannableStringBuilder.getSpanEnd(c1097i2), (CharSequence) "");
            }
            int i5 = 0;
            while (i5 < spannableStringBuilder.length()) {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i5) == ' ') {
                    int i7 = i6;
                    while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                        i7++;
                    }
                    int i8 = i7 - i6;
                    if (i8 > 0) {
                        spannableStringBuilder.delete(i5, i8 + i5);
                    }
                }
                i5 = i6;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length() - 1) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == '\n' && spannableStringBuilder.charAt(i10) == ' ') {
                    spannableStringBuilder.delete(i10, i9 + 2);
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length() - 1) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ' && spannableStringBuilder.charAt(i12) == '\n') {
                    spannableStringBuilder.delete(i11, i12);
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0895dg.f13132e = c1320n22.f14571c;
            c0895dg.f = c1320n22.f14572d;
            c0895dg.f13133g = c1320n22.f14573e;
            c0895dg.f13134h = c1320n22.f14570b;
            c0895dg.f13137l = c1320n22.f;
            c0895dg.f13136k = c1320n22.i;
            c0895dg.f13135j = c1320n22.f14575h;
            c0895dg.f13139n = c1320n22.f14576j;
            arrayList2.add(c0895dg.a());
        }
        return arrayList2;
    }

    public void g(B2.a aVar, Class cls) {
        ((ArrayList) this.f5043m).add(new W3.h(aVar, cls));
    }

    public void h(y2.f fVar, Class cls) {
        ((ArrayList) this.f5045o).add(new W3.h(fVar, cls));
    }

    @Override // P2.d
    public void i() {
        switch (this.f5041k) {
            case 10:
                break;
            default:
                C1579st c1579st = (C1579st) this.f5042l;
                if (c1579st != null) {
                    if (c1579st.a() || c1579st.h()) {
                        c1579st.l();
                        break;
                    }
                }
                break;
        }
    }

    public void j(String str, String str2) {
        kotlin.jvm.internal.l.f("value", str2);
        ((C2202f) this.f5044n).a(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r5.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi k(int i) {
        Bidi bidi;
        boolean[] zArr = (boolean[]) this.f5045o;
        boolean z3 = zArr[i];
        ArrayList arrayList = (ArrayList) this.f5044n;
        if (z3) {
            return (Bidi) arrayList.get(i);
        }
        ArrayList arrayList2 = (ArrayList) this.f5043m;
        int intValue = i == 0 ? 0 : ((Number) arrayList2.get(i - 1)).intValue();
        int intValue2 = ((Number) arrayList2.get(i)).intValue();
        int i5 = intValue2 - intValue;
        char[] cArr = (char[]) this.f5046p;
        if (cArr == null || cArr.length < i5) {
            cArr = new char[i5];
        }
        char[] cArr2 = cArr;
        Layout layout = (Layout) this.f5042l;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i5)) {
            bidi = new Bidi(cArr2, 0, null, 0, i5, layout.getParagraphDirection(layout.getLineForOffset(t(i))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f5046p;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f5046p = cArr2;
        return bidi;
    }

    @Override // P2.d
    public void l(View view) {
        Mt mt = (Mt) ((C1395oo) this.f5046p).f14855e;
        Rk rk = new Rk(new Oi(21), null, 1);
        C0608Hf a5 = ((C0622Jf) mt.f10741l).a(new C0905dr((Sq) this.f5043m, (Lq) this.f5044n, (String) null), rk);
        C1529ro c1529ro = new C1529ro(27, a5);
        C1619to c1619to = (C1619to) this.f5045o;
        synchronized (c1619to) {
            c1619to.f15729k = c1529ro;
        }
        ((C0634Ld) this.f5042l).b(a5.q0());
    }

    public C0.c m() {
        Map unmodifiableMap;
        y4.n nVar = (y4.n) this.f5042l;
        if (nVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f5043m;
        y4.m d5 = ((C2202f) this.f5044n).d();
        y4.x xVar = (y4.x) this.f5045o;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5046p;
        byte[] bArr = z4.b.f21979a;
        kotlin.jvm.internal.l.f("<this>", linkedHashMap);
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = X3.w.f6091k;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.l.e("{\n    Collections.unmodi…(LinkedHashMap(this))\n  }", unmodifiableMap);
        }
        return new C0.c(nVar, str, d5, xVar, unmodifiableMap);
    }

    public void n(C2675c c2675c) {
        kotlin.jvm.internal.l.f("cacheControl", c2675c);
        String c2675c2 = c2675c.toString();
        if (c2675c2.length() == 0) {
            ((C2202f) this.f5044n).p("Cache-Control");
        } else {
            v("Cache-Control", c2675c2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        Mr mr;
        switch (this.f5041k) {
            case 5:
                a3.u uVar = (a3.u) obj;
                Mr D32 = BinderC0468l.D3((E3.a) this.f5042l, (C1743wd) this.f5043m);
                BinderC0468l binderC0468l = (BinderC0468l) this.f5046p;
                AtomicBoolean atomicBoolean = binderC0468l.f6563M;
                String str = binderC0468l.f6554B;
                String str2 = binderC0468l.f6555C;
                atomicBoolean.set(true);
                boolean booleanValue = ((Boolean) r.f5053d.f5056c.a(F7.l7)).booleanValue();
                Jr jr = (Jr) this.f5045o;
                InterfaceC1429pd interfaceC1429pd = (InterfaceC1429pd) this.f5044n;
                if (!booleanValue) {
                    if (interfaceC1429pd != null) {
                        try {
                            interfaceC1429pd.E("QueryInfo generation has been disabled.");
                        } catch (RemoteException e3) {
                            U2.j.f("QueryInfo generation has been disabled.".concat(e3.toString()));
                        }
                    }
                    if (!((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() || D32 == null) {
                        return;
                    }
                    jr.C("QueryInfo generation has been disabled.");
                    jr.g(false);
                    D32.a(jr);
                    D32.h();
                    return;
                }
                try {
                    try {
                        if (uVar == null) {
                            if (interfaceC1429pd != null) {
                                interfaceC1429pd.s1(null, null, null);
                            }
                            jr.g(true);
                            if (!((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() || D32 == null) {
                                return;
                            }
                        } else {
                            try {
                                String str3 = uVar.f6620a;
                                if (TextUtils.isEmpty((!TextUtils.isEmpty(uVar.f6622c) ? new JSONObject(uVar.f6622c) : new JSONObject(uVar.f6621b)).optString("request_id", ""))) {
                                    U2.j.i("The request ID is empty in request JSON.");
                                    if (interfaceC1429pd != null) {
                                        interfaceC1429pd.E("Internal error: request ID is empty in request JSON.");
                                    }
                                    jr.C("Request ID empty");
                                    jr.g(false);
                                    if (!((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() || D32 == null) {
                                        return;
                                    }
                                } else {
                                    Bundle bundle = uVar.f;
                                    if (binderC0468l.f6553A && bundle != null && bundle.getInt(str2, -1) == -1) {
                                        bundle.putInt(str2, binderC0468l.f6556D.get());
                                    }
                                    if (binderC0468l.f6582z && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                                        if (TextUtils.isEmpty(binderC0468l.f6558F)) {
                                            binderC0468l.f6558F = P2.o.f4767B.f4771c.x(binderC0468l.f6569m, binderC0468l.f6557E.f5852k);
                                        }
                                        bundle.putString(str, binderC0468l.f6558F);
                                    }
                                    if (interfaceC1429pd != null) {
                                        if (TextUtils.isEmpty(uVar.f6622c)) {
                                            interfaceC1429pd.s1(str3, uVar.f6621b, bundle);
                                        } else {
                                            interfaceC1429pd.s1(str3, uVar.f6622c, bundle);
                                        }
                                    }
                                    jr.g(true);
                                    if (!((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() || D32 == null) {
                                        return;
                                    }
                                }
                            } catch (JSONException e5) {
                                U2.j.i("Failed to create JSON object from the request string.");
                                if (interfaceC1429pd != null) {
                                    interfaceC1429pd.E("Internal error for request JSON: " + e5.toString());
                                }
                                jr.f(e5);
                                jr.g(false);
                                P2.o.f4767B.f4774g.i("SignalGeneratorImpl.generateSignals.onSuccess", e5);
                                if (!((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() || D32 == null) {
                                    return;
                                }
                            }
                        }
                    } catch (RemoteException e6) {
                        jr.f(e6);
                        jr.g(false);
                        U2.j.g("", e6);
                        P2.o.f4767B.f4774g.i("SignalGeneratorImpl.generateSignals.onSuccess", e6);
                        if (!((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() || D32 == null) {
                            return;
                        }
                    }
                    D32.a(jr);
                    D32.h();
                    return;
                } catch (Throwable th) {
                    if (((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() && D32 != null) {
                        D32.a(jr);
                        D32.h();
                    }
                    throw th;
                }
            case 11:
                I(obj);
                return;
            case 12:
                J(obj);
                return;
            case 13:
                K(obj);
                return;
            default:
                Qk qk = (Qk) obj;
                synchronized (((Fq) this.f5046p)) {
                    try {
                        ((C1523ri) qk.f12697g.f15334k.f11282l).f15338o = ((Fq) this.f5046p).f9130d;
                        ((Jo) this.f5042l).h(qk);
                        Fq fq = (Fq) this.f5046p;
                        Executor executor = fq.f9128b;
                        Bq bq = fq.f9130d;
                        Objects.requireNonNull(bq);
                        executor.execute(new RunnableC1303mm(11, bq));
                        ((Fq) this.f5046p).f9130d.d();
                        if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr = (Mr) this.f5043m) == null) {
                            Nr nr = ((Fq) this.f5046p).f9132g;
                            Jr jr2 = (Jr) this.f5044n;
                            jr2.d(qk.f12692a.f11596b);
                            jr2.H(qk.f.f9590k);
                            jr2.g(true);
                            nr.b(jr2.l());
                        } else {
                            mr.g(qk.f12692a.f11596b);
                            mr.e(qk.f.f9590k);
                            Jr jr3 = (Jr) this.f5044n;
                            jr3.g(true);
                            mr.a(jr3);
                            mr.h();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public InterfaceC0261g p(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f5046p;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC0261g a5 = ((AbstractC0260f) list.get(i)).a(type, annotationArr);
            if (a5 != null) {
                return a5;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0260f) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public float q(int i, boolean z3) {
        Layout layout = (Layout) this.f5042l;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z3 ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float r(int i, boolean z3, boolean z5) {
        int i5;
        int i6;
        int i7 = i;
        if (!z5) {
            return q(i, z3);
        }
        Layout layout = (Layout) this.f5042l;
        int d5 = L0.h.d(layout, i7, z5);
        int lineStart = layout.getLineStart(d5);
        int lineEnd = layout.getLineEnd(d5);
        if (i7 != lineStart && i7 != lineEnd) {
            return q(i, z3);
        }
        if (i7 == 0 || i7 == layout.getText().length()) {
            return q(i, z3);
        }
        int s2 = s(i7, z5);
        boolean z6 = layout.getParagraphDirection(layout.getLineForOffset(t(s2))) == -1;
        int w5 = w(lineEnd, lineStart);
        int t5 = t(s2);
        int i8 = lineStart - t5;
        int i9 = w5 - t5;
        Bidi k5 = k(s2);
        Bidi createLineBidi = k5 != null ? k5.createLineBidi(i8, i9) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z3 || z6 == isRtlCharAt) {
                z6 = !z6;
            }
            return i7 == lineStart ? z6 : !z6 ? layout.getLineLeft(d5) : layout.getLineRight(d5);
        }
        int runCount = createLineBidi.getRunCount();
        L0.d[] dVarArr = new L0.d[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            dVarArr[i10] = new L0.d(createLineBidi.getRunStart(i10) + lineStart, createLineBidi.getRunLimit(i10) + lineStart, createLineBidi.getRunLevel(i10) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i11 = 0; i11 < runCount2; i11++) {
            bArr[i11] = (byte) createLineBidi.getRunLevel(i11);
        }
        Bidi.reorderVisually(bArr, 0, dVarArr, 0, runCount);
        if (i7 == lineStart) {
            int i12 = 0;
            while (true) {
                if (i12 >= runCount) {
                    i6 = -1;
                    break;
                }
                if (dVarArr[i12].f3001a == i7) {
                    i6 = i12;
                    break;
                }
                i12++;
            }
            boolean z7 = (z3 || z6 == dVarArr[i6].f3003c) ? !z6 : z6;
            return (i6 == 0 && z7) ? layout.getLineLeft(d5) : (i6 != runCount - 1 || z7) ? z7 ? layout.getPrimaryHorizontal(dVarArr[i6 - 1].f3001a) : layout.getPrimaryHorizontal(dVarArr[i6 + 1].f3001a) : layout.getLineRight(d5);
        }
        if (i7 > w5) {
            i7 = w(i7, lineStart);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= runCount) {
                i5 = -1;
                break;
            }
            if (dVarArr[i13].f3002b == i7) {
                i5 = i13;
                break;
            }
            i13++;
        }
        boolean z8 = (z3 || z6 == dVarArr[i5].f3003c) ? z6 : !z6;
        return (i5 == 0 && z8) ? layout.getLineLeft(d5) : (i5 != runCount - 1 || z8) ? z8 ? layout.getPrimaryHorizontal(dVarArr[i5 - 1].f3002b) : layout.getPrimaryHorizontal(dVarArr[i5 + 1].f3002b) : layout.getLineRight(d5);
    }

    public int s(int i, boolean z3) {
        ArrayList arrayList = (ArrayList) this.f5043m;
        int M5 = X3.n.M(arrayList, Integer.valueOf(i));
        int i5 = M5 < 0 ? -(M5 + 1) : M5 + 1;
        if (z3 && i5 > 0) {
            int i6 = i5 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                return i6;
            }
        }
        return i5;
    }

    public int t(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f5043m).get(i - 1)).intValue();
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        Mr mr;
        Mr mr2;
        switch (this.f5041k) {
            case 5:
                String message = th.getMessage();
                if (((Boolean) r.f5053d.f5056c.a(F7.q7)).booleanValue()) {
                    P2.o.f4767B.f4774g.h("SignalGeneratorImpl.generateSignals", th);
                } else {
                    P2.o.f4767B.f4774g.i("SignalGeneratorImpl.generateSignals", th);
                }
                Mr D32 = BinderC0468l.D3((E3.a) this.f5042l, (C1743wd) this.f5043m);
                if (((Boolean) AbstractC0834c8.f12979e.s()).booleanValue() && D32 != null) {
                    Jr jr = (Jr) this.f5045o;
                    jr.f(th);
                    jr.g(false);
                    D32.a(jr);
                    D32.h();
                }
                InterfaceC1429pd interfaceC1429pd = (InterfaceC1429pd) this.f5044n;
                if (interfaceC1429pd == null) {
                    return;
                }
                try {
                    if (!"Unknown format is no longer supported.".equals(message)) {
                        message = "Internal error. " + message;
                    }
                    interfaceC1429pd.E(message);
                    return;
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    return;
                }
            case 11:
                if (((Boolean) r.f5053d.f5056c.a(F7.u5)).booleanValue()) {
                    T2.G.n("Native ad failed to load", th);
                }
                C1880zf c1880zf = (C1880zf) this.f5045o;
                C0387u0 s2 = AbstractC1803xs.s(th, ((C1253lh) c1880zf.f16698m0.d()).f14401l);
                ((Oh) c1880zf.f16690i0.d()).l0(s2);
                C1324n6 c1324n6 = (C1324n6) this.f5046p;
                ((C0554Af) c1324n6.f14579l).a().execute(new RunnableC1081hn(3, this, s2));
                AbstractC1668us.D(s2.f5058k, "NativeAdLoader.onFailure", th);
                ((C1529ro) this.f5042l).mo10a();
                boolean booleanValue = ((Boolean) AbstractC0834c8.f12977c.s()).booleanValue();
                Jr jr2 = (Jr) this.f5044n;
                if (!booleanValue || (mr = (Mr) this.f5043m) == null) {
                    jr2.q(s2);
                    jr2.f(th);
                    jr2.g(false);
                    ((Nr) c1324n6.f14581n).b(jr2.l());
                    return;
                }
                mr.c(s2);
                jr2.f(th);
                jr2.g(false);
                mr.a(jr2);
                mr.h();
                return;
            case 12:
                G(th);
                return;
            case 13:
                H(th);
                return;
            default:
                if (((Boolean) r.f5053d.f5056c.a(F7.u5)).booleanValue()) {
                    T2.G.n("Rewarded ad failed to load", th);
                }
                C0636Lf c0636Lf = (C0636Lf) ((Fq) this.f5046p).f9131e.j();
                C0387u0 s5 = c0636Lf == null ? AbstractC1803xs.s(th, null) : AbstractC1803xs.s(th, c0636Lf.d().f14401l);
                synchronized (((Fq) this.f5046p)) {
                    try {
                        if (c0636Lf != null) {
                            ((Oh) c0636Lf.B0.d()).l0(s5);
                            ((Fq) this.f5046p).f9128b.execute(new RunnableC1081hn(6, this, s5));
                        } else {
                            ((Fq) this.f5046p).f9130d.l0(s5);
                            ((Fq) this.f5046p).b((Dq) this.f5045o).b().d().f.g();
                        }
                        AbstractC1668us.D(s5.f5058k, "RewardedAdLoader.onFailure", th);
                        ((Jo) this.f5042l).mo10a();
                        if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (mr2 = (Mr) this.f5043m) == null) {
                            Nr nr = ((Fq) this.f5046p).f9132g;
                            Jr jr3 = (Jr) this.f5044n;
                            jr3.q(s5);
                            jr3.f(th);
                            jr3.g(false);
                            nr.b(jr3.l());
                        } else {
                            mr2.c(s5);
                            Jr jr4 = (Jr) this.f5044n;
                            jr4.f(th);
                            jr4.g(false);
                            mr2.a(jr4);
                            mr2.h();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public void v(String str, String str2) {
        kotlin.jvm.internal.l.f("value", str2);
        C2202f c2202f = (C2202f) this.f5044n;
        c2202f.getClass();
        AbstractC2527w.b(str);
        AbstractC2527w.c(str2, str);
        c2202f.p(str);
        c2202f.b(str, str2);
    }

    public int w(int i, int i5) {
        while (i > i5) {
            char charAt = ((Layout) this.f5042l).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((kotlin.jvm.internal.l.g(charAt, 8192) < 0 || kotlin.jvm.internal.l.g(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void x(String str, y4.x xVar) {
        kotlin.jvm.internal.l.f("method", str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (xVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(L1.a.n("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC2349a.I(str)) {
            throw new IllegalArgumentException(L1.a.n("method ", str, " must not have a request body.").toString());
        }
        this.f5043m = str;
        this.f5045o = xVar;
    }

    public InterfaceC0267m y(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f5045o;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC0267m a5 = ((AbstractC0266l) list.get(i)).a(type);
            if (a5 != null) {
                return a5;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0266l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.M1
    public long z(int i) {
        return ((long[]) this.f5043m)[i];
    }

    public C0375o(Context context, ExecutorService executorService, P.W w5, C0863ct c0863ct, C1087ht c1087ht, C1175jt c1175jt) {
        this.f5041k = 17;
        this.f5042l = context;
        this.f5043m = executorService;
        this.f5044n = w5;
    }

    public C0375o(B5 b5, File file, File file2, File file3) {
        this.f5041k = 18;
        this.f5042l = b5;
        this.f5043m = file;
        this.f5044n = file3;
        this.f5045o = file2;
    }

    public /* synthetic */ C0375o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f5041k = i;
        this.f5042l = obj;
        this.f5043m = obj2;
        this.f5044n = obj3;
        this.f5045o = obj4;
        this.f5046p = obj5;
    }

    public /* synthetic */ C0375o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z3) {
        this.f5041k = i;
        this.f5042l = obj2;
        this.f5043m = obj3;
        this.f5044n = obj4;
        this.f5045o = obj5;
        this.f5046p = obj;
    }

    public /* synthetic */ C0375o(boolean z3) {
        this.f5041k = 23;
    }

    public C0375o(Context context, String str, String str2) {
        this.f5041k = 16;
        this.f5043m = str;
        this.f5044n = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f5046p = handlerThread;
        handlerThread.start();
        C1579st c1579st = new C1579st(9200000, context, handlerThread.getLooper(), this, this);
        this.f5042l = c1579st;
        this.f5045o = new LinkedBlockingQueue();
        c1579st.n();
    }

    public C0375o(C1185k2 c1185k2, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f5041k = 6;
        this.f5042l = c1185k2;
        this.f5045o = hashMap2;
        this.f5046p = hashMap3;
        this.f5044n = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c1185k2.g(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f5043m = jArr;
    }

    public C0375o(InterfaceC1192k9 interfaceC1192k9) {
        I8 i8;
        IBinder iBinder;
        this.f5041k = 7;
        this.f5043m = new ArrayList();
        this.f5045o = new v3.g(5);
        this.f5046p = new ArrayList();
        this.f5042l = interfaceC1192k9;
        J8 j8 = null;
        try {
            List u5 = interfaceC1192k9.u();
            if (u5 != null) {
                for (Object obj : u5) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        i8 = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        i8 = queryLocalInterface instanceof I8 ? (I8) queryLocalInterface : new H8(iBinder);
                    }
                    if (i8 != null) {
                        ((ArrayList) this.f5043m).add(new J8(i8));
                    }
                }
            }
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
        try {
            List y5 = ((InterfaceC1192k9) this.f5042l).y();
            if (y5 != null) {
                for (Object obj2 : y5) {
                    InterfaceC0362h0 u32 = obj2 instanceof IBinder ? H0.u3((IBinder) obj2) : null;
                    if (u32 != null) {
                        ((ArrayList) this.f5046p).add(new H3.g(u32));
                    }
                }
            }
        } catch (RemoteException e5) {
            U2.j.g("", e5);
        }
        try {
            I8 k5 = ((InterfaceC1192k9) this.f5042l).k();
            if (k5 != null) {
                j8 = new J8(k5);
            }
        } catch (RemoteException e6) {
            U2.j.g("", e6);
        }
        this.f5044n = j8;
        try {
            if (((InterfaceC1192k9) this.f5042l).e() != null) {
                new U4(((InterfaceC1192k9) this.f5042l).e());
            }
        } catch (RemoteException e7) {
            U2.j.g("", e7);
        }
    }

    private final void O() {
    }

    @Override // P2.d
    public void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0375o(C1748wi c1748wi, WebView webView) {
        this.f5041k = 15;
        int i = 0;
        Object[] objArr = 0;
        HashMap hashMap = new HashMap();
        this.f5045o = hashMap;
        this.f5046p = new Ls();
        if (AbstractC1803xs.f16343b.f2300l) {
            this.f5042l = c1748wi;
            this.f5043m = webView;
            X.m mVar = (X.m) this.f5044n;
            if ((mVar == null ? null : (View) mVar.get()) != webView) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((C1893zs) it.next()).b(webView);
                }
                this.f5044n = new X.m(webView);
            }
            if (AbstractC2346c.x("WEB_MESSAGE_LISTENER")) {
                int i5 = AbstractC1914b.f16884a;
                C1921b c1921b = AbstractC1933n.f16915d;
                if (c1921b.b()) {
                    ((WebViewProviderBoundaryInterface) AbstractC1914b.b((WebView) this.f5043m).f16910l).removeWebMessageListener("omidJsSessionService");
                    Dp dp = new Dp(5, this);
                    WebView webView2 = (WebView) this.f5043m;
                    HashSet hashSet = new HashSet(Arrays.asList("*"));
                    if (c1921b.b()) {
                        C1930k b3 = AbstractC1914b.b(webView2);
                        String[] strArr = (String[]) hashSet.toArray(new String[0]);
                        C1930k c1930k = new C1930k(i, (boolean) (objArr == true ? 1 : 0));
                        c1930k.f16910l = dp;
                        ((WebViewProviderBoundaryInterface) b3.f16910l).addWebMessageListener("omidJsSessionService", strArr, new N4.a(c1930k));
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public /* synthetic */ C0375o(Class cls) {
        this.f5041k = 19;
        this.f5043m = new HashMap();
        this.f5044n = new ArrayList();
        this.f5042l = cls;
        this.f5046p = My.f10755b;
    }

    public C0375o(Map map) {
        this.f5041k = 1;
        kotlin.jvm.internal.l.f("initialState", map);
        this.f5042l = X3.z.U(map);
        this.f5043m = new LinkedHashMap();
        this.f5044n = new LinkedHashMap();
        this.f5045o = new LinkedHashMap();
        this.f5046p = new A0.N0(1, this);
    }

    public C0375o(Layout layout) {
        this.f5041k = 3;
        this.f5042l = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int F02 = AbstractC2227e.F0(((Layout) this.f5042l).getText(), '\n', i, 4);
            i = F02 < 0 ? ((Layout) this.f5042l).getText().length() : F02 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.f5042l).getText().length());
        this.f5043m = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(null);
        }
        this.f5044n = arrayList2;
        this.f5045o = new boolean[((ArrayList) this.f5043m).size()];
        ((ArrayList) this.f5043m).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public C0375o(C0203h c0203h, K0.O o5, List list, W0.c cVar, O0.d dVar) {
        String str;
        String str2;
        int i;
        int i5;
        int i6;
        C0203h c0203h2 = c0203h;
        K0.O o6 = o5;
        final int i7 = 1;
        this.f5041k = 2;
        final int i8 = 0;
        this.f5042l = c0203h2;
        this.f5043m = list;
        W3.f fVar = W3.f.f6034k;
        this.f5044n = G4.d.D(fVar, new InterfaceC2015a(this) { // from class: K0.s

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C0375o f2861l;

            {
                this.f2861l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i8) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f2861l.f5046p;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float b3 = ((u) obj3).f2868a.b();
                            int N5 = X3.n.N(arrayList);
                            int i9 = 1;
                            if (1 <= N5) {
                                while (true) {
                                    Object obj4 = arrayList.get(i9);
                                    float b5 = ((u) obj4).f2868a.b();
                                    if (Float.compare(b3, b5) < 0) {
                                        obj3 = obj4;
                                        b3 = b5;
                                    }
                                    if (i9 != N5) {
                                        i9++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        u uVar = (u) obj;
                        return Float.valueOf(uVar != null ? uVar.f2868a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f2861l.f5046p;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float c5 = ((u) obj5).f2868a.f5262s.c();
                            int N6 = X3.n.N(arrayList2);
                            int i10 = 1;
                            if (1 <= N6) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i10);
                                    float c6 = ((u) obj6).f2868a.f5262s.c();
                                    if (Float.compare(c5, c6) < 0) {
                                        obj5 = obj6;
                                        c5 = c6;
                                    }
                                    if (i10 != N6) {
                                        i10++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        u uVar2 = (u) obj2;
                        return Float.valueOf(uVar2 != null ? uVar2.f2868a.f5262s.c() : 0.0f);
                }
            }
        });
        this.f5045o = G4.d.D(fVar, new InterfaceC2015a(this) { // from class: K0.s

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C0375o f2861l;

            {
                this.f2861l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f2861l.f5046p;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float b3 = ((u) obj3).f2868a.b();
                            int N5 = X3.n.N(arrayList);
                            int i9 = 1;
                            if (1 <= N5) {
                                while (true) {
                                    Object obj4 = arrayList.get(i9);
                                    float b5 = ((u) obj4).f2868a.b();
                                    if (Float.compare(b3, b5) < 0) {
                                        obj3 = obj4;
                                        b3 = b5;
                                    }
                                    if (i9 != N5) {
                                        i9++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        u uVar = (u) obj;
                        return Float.valueOf(uVar != null ? uVar.f2868a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f2861l.f5046p;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float c5 = ((u) obj5).f2868a.f5262s.c();
                            int N6 = X3.n.N(arrayList2);
                            int i10 = 1;
                            if (1 <= N6) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i10);
                                    float c6 = ((u) obj6).f2868a.f5262s.c();
                                    if (Float.compare(c5, c6) < 0) {
                                        obj5 = obj6;
                                        c5 = c6;
                                    }
                                    if (i10 != N6) {
                                        i10++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        u uVar2 = (u) obj2;
                        return Float.valueOf(uVar2 != null ? uVar2.f2868a.f5262s.c() : 0.0f);
                }
            }
        });
        C0203h c0203h3 = AbstractC0205j.f2833a;
        ArrayList arrayList = c0203h2.f2831n;
        X3.v vVar = X3.v.f6090k;
        List k02 = arrayList != null ? X3.m.k0(arrayList, new C0202g(i7)) : vVar;
        ArrayList arrayList2 = new ArrayList();
        X3.k kVar = new X3.k();
        int size = k02.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            K0.w wVar = o6.f2806b;
            if (i9 < size) {
                C0201f c0201f = (C0201f) k02.get(i9);
                K0.w a5 = wVar.a((K0.w) c0201f.f2823a);
                int i11 = c0201f.f2824b;
                int i12 = c0201f.f2825c;
                if (i11 > i12) {
                    Q0.a.a("Reversed range is not supported");
                }
                while (i10 < i11 && !kVar.isEmpty()) {
                    int i13 = i7;
                    C0201f c0201f2 = (C0201f) kVar.last();
                    int i14 = c0201f2.f2825c;
                    List list2 = k02;
                    Object obj = c0201f2.f2823a;
                    if (i11 < i14) {
                        arrayList2.add(new C0201f(i10, i11, obj));
                        k02 = list2;
                        i10 = i11;
                        i7 = i13;
                    } else {
                        X3.v vVar2 = vVar;
                        arrayList2.add(new C0201f(i10, i14, obj));
                        while (true) {
                            boolean isEmpty = kVar.isEmpty();
                            i10 = c0201f2.f2825c;
                            if (isEmpty || i10 != ((C0201f) kVar.last()).f2825c) {
                                break;
                            } else {
                                kVar.removeLast();
                            }
                        }
                        k02 = list2;
                        i7 = i13;
                        vVar = vVar2;
                    }
                }
                int i15 = i7;
                List list3 = k02;
                X3.v vVar3 = vVar;
                if (i10 < i11) {
                    arrayList2.add(new C0201f(i10, i11, wVar));
                    i10 = i11;
                }
                C0201f c0201f3 = (C0201f) kVar.h();
                if (c0201f3 != null) {
                    int i16 = c0201f3.f2825c;
                    Object obj2 = c0201f3.f2823a;
                    int i17 = c0201f3.f2824b;
                    if (i17 == i11 && i16 == i12) {
                        kVar.removeLast();
                        kVar.addLast(new C0201f(i11, i12, ((K0.w) obj2).a(a5)));
                    } else if (i17 == i16) {
                        arrayList2.add(new C0201f(i17, i16, obj2));
                        kVar.removeLast();
                        kVar.addLast(new C0201f(i11, i12, a5));
                    } else if (i16 >= i12) {
                        kVar.addLast(new C0201f(i11, i12, ((K0.w) obj2).a(a5)));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    kVar.addLast(new C0201f(i11, i12, a5));
                }
                i9++;
                k02 = list3;
                i7 = i15;
                vVar = vVar3;
            } else {
                X3.v vVar4 = vVar;
                while (true) {
                    str = c0203h2.f2829l;
                    if (i10 > str.length() || kVar.isEmpty()) {
                        break;
                    }
                    C0201f c0201f4 = (C0201f) kVar.last();
                    Object obj3 = c0201f4.f2823a;
                    int i18 = c0201f4.f2825c;
                    arrayList2.add(new C0201f(i10, i18, obj3));
                    while (!kVar.isEmpty() && i18 == ((C0201f) kVar.last()).f2825c) {
                        kVar.removeLast();
                    }
                    i10 = i18;
                }
                if (i10 < str.length()) {
                    arrayList2.add(new C0201f(i10, str.length(), wVar));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new C0201f(0, 0, wVar));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                int i19 = 0;
                while (i19 < size2) {
                    C0201f c0201f5 = (C0201f) arrayList2.get(i19);
                    int i20 = c0201f5.f2824b;
                    int i21 = c0201f5.f2825c;
                    if (i20 != i21) {
                        str2 = str.substring(i20, i21);
                        kotlin.jvm.internal.l.e("substring(...)", str2);
                    } else {
                        str2 = "";
                    }
                    List a6 = AbstractC0205j.a(c0203h2, i20, i21, new C0204i(0));
                    C0203h c0203h4 = new C0203h(str2, a6 == null ? vVar4 : a6);
                    K0.w wVar2 = (K0.w) c0201f5.f2823a;
                    if (wVar2.f2872b == Integer.MIN_VALUE) {
                        i = size2;
                        i5 = i19;
                        wVar2 = new K0.w(wVar2.f2871a, wVar.f2872b, wVar2.f2873c, wVar2.f2874d, wVar2.f2875e, wVar2.f, wVar2.f2876g, wVar2.f2877h, wVar2.i);
                    } else {
                        i = size2;
                        i5 = i19;
                    }
                    K0.O o7 = new K0.O(o6.f2805a, wVar.a(wVar2));
                    ?? r6 = c0203h4.f2828k;
                    X3.v vVar5 = r6 == 0 ? vVar4 : r6;
                    List list4 = (List) this.f5043m;
                    ArrayList arrayList4 = new ArrayList(list4.size());
                    int size3 = list4.size();
                    int i22 = 0;
                    while (true) {
                        i6 = c0201f5.f2824b;
                        if (i22 < size3) {
                            C0201f c0201f6 = (C0201f) list4.get(i22);
                            String str3 = str;
                            int i23 = c0201f6.f2824b;
                            K0.O o8 = o7;
                            int i24 = c0201f6.f2825c;
                            if (AbstractC0205j.b(i6, i21, i23, i24)) {
                                int i25 = c0201f6.f2824b;
                                if (i6 > i25 || i24 > i21) {
                                    Q0.a.a("placeholder can not overlap with paragraph.");
                                }
                                arrayList4.add(new C0201f(i25 - i6, i24 - i6, c0201f6.f2823a));
                            }
                            i22++;
                            o7 = o8;
                            str = str3;
                        }
                    }
                    arrayList3.add(new K0.u(new S0.d(str2, o7, vVar5, arrayList4, dVar, cVar), i6, i21));
                    i19 = i5 + 1;
                    c0203h2 = c0203h;
                    o6 = o5;
                    size2 = i;
                    str = str;
                }
                this.f5046p = arrayList3;
                return;
            }
        }
    }

    public C0375o(InterfaceC2676d interfaceC2676d, y4.n nVar, List list, List list2, ExecutorC0255a executorC0255a) {
        this.f5041k = 4;
        this.f5042l = new ConcurrentHashMap();
        this.f5043m = interfaceC2676d;
        this.f5044n = nVar;
        this.f5045o = list;
        this.f5046p = list2;
    }

    public C0375o(C2414b c2414b) {
        this.f5041k = 22;
        this.f5042l = X3.m.n0(c2414b.f19538a);
        this.f5043m = X3.m.n0(c2414b.f19539b);
        this.f5044n = X3.m.n0(c2414b.f19540c);
        this.f5045o = X3.m.n0(c2414b.f19541d);
        this.f5046p = X3.m.n0(c2414b.f19542e);
    }

    public C0375o() {
        this.f5041k = 23;
        this.f5046p = new LinkedHashMap();
        this.f5043m = "GET";
        this.f5044n = new C2202f(1);
    }
}
