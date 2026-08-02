package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Kr implements Jr {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10258a;

    /* renamed from: p, reason: collision with root package name */
    public final int f10271p;

    /* renamed from: b, reason: collision with root package name */
    public long f10259b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f10260c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10261d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f10272q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f10273r = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f10262e = 0;
    public String f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f10263g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f10264h = "";
    public String i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f10265j = 2;

    /* renamed from: k, reason: collision with root package name */
    public String f10266k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f10267l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f10268m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f10269n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10270o = false;

    public Kr(Context context, int i) {
        this.f10258a = context;
        this.f10271p = i;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr C(String str) {
        synchronized (this) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.u8)).booleanValue()) {
                this.f10268m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr H(String str) {
        synchronized (this) {
            this.f10264h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr W(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    public final synchronized void a() {
        P2.o.f4767B.f4776j.getClass();
        this.f10260c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr b(int i) {
        synchronized (this) {
            this.f10265j = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr c(int i) {
        synchronized (this) {
            this.f10272q = i;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r2.f10263g = r0.f10492b0;
     */
    @Override // com.google.android.gms.internal.ads.Jr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Jr d(C1071hd c1071hd) {
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(((Nq) c1071hd.f13762m).f10823b)) {
                    this.f = ((Nq) c1071hd.f13762m).f10823b;
                }
                Iterator it = ((List) c1071hd.f13761l).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Lq lq = (Lq) it.next();
                    if (!TextUtils.isEmpty(lq.f10492b0)) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final /* bridge */ /* synthetic */ Jr e() {
        i();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr f(Throwable th) {
        synchronized (this) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.u8)).booleanValue()) {
                String n5 = U2.e.n(C0802bc.f(th), "SHA-256");
                if (n5 == null) {
                    n5 = "";
                }
                this.f10267l = n5;
                String f = C0802bc.f(th);
                Hq e3 = Hq.e(new C1221ku('\n'));
                f.getClass();
                this.f10266k = (String) ((AbstractC1715vu) ((InterfaceC1760wu) e3.f9491l).c(e3, f)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr g(boolean z3) {
        synchronized (this) {
            this.f10261d = z3;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final /* bridge */ /* synthetic */ Jr h() {
        a();
        return this;
    }

    public final synchronized void i() {
        Configuration configuration;
        P2.o oVar = P2.o.f4767B;
        this.f10262e = oVar.f4773e.r(this.f10258a);
        Resources resources = this.f10258a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f10273r = i;
        oVar.f4776j.getClass();
        this.f10259b = SystemClock.elapsedRealtime();
        this.f10270o = true;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final synchronized boolean k() {
        return this.f10270o;
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final synchronized Lr l() {
        try {
            if (this.f10269n) {
                return null;
            }
            this.f10269n = true;
            if (!this.f10270o) {
                i();
            }
            if (this.f10260c < 0) {
                a();
            }
            return new Lr(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final boolean o() {
        return !TextUtils.isEmpty(this.f10264h);
    }

    @Override // com.google.android.gms.internal.ads.Jr
    public final Jr q(C0387u0 c0387u0) {
        synchronized (this) {
            try {
                IBinder iBinder = c0387u0.f5062o;
                if (iBinder != null) {
                    Ih ih = (Ih) iBinder;
                    String str = ih.f9593n;
                    if (!TextUtils.isEmpty(str)) {
                        this.f = str;
                    }
                    String str2 = ih.f9591l;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f10263g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }
}
