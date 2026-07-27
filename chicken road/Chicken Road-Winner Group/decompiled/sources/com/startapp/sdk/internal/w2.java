package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4554a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4555b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4556c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f4557d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f4558e;
    public final ib f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f4559g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f4560h;

    /* renamed from: i, reason: collision with root package name */
    public final ib f4561i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f4562j;

    /* renamed from: k, reason: collision with root package name */
    public final ib f4563k;

    /* renamed from: l, reason: collision with root package name */
    public final AdPreferences.Placement f4564l;

    /* renamed from: m, reason: collision with root package name */
    public final ActivityExtra f4565m;

    /* renamed from: n, reason: collision with root package name */
    public AdPreferences f4566n;

    /* renamed from: q, reason: collision with root package name */
    public long f4569q;

    /* renamed from: r, reason: collision with root package name */
    public String f4570r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4571s;

    /* renamed from: t, reason: collision with root package name */
    public final q2 f4572t;

    /* renamed from: u, reason: collision with root package name */
    public final n2 f4573u;

    /* renamed from: w, reason: collision with root package name */
    public int f4575w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4576x;
    public Long y;

    /* renamed from: z, reason: collision with root package name */
    public C0259m f4577z;

    /* renamed from: o, reason: collision with root package name */
    public Ad f4567o = null;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f4568p = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final ConcurrentHashMap f4574v = new ConcurrentHashMap();

    public w2(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10) {
        this.f4564l = placement;
        this.f4566n = adPreferences;
        if (context instanceof Activity) {
            Context a3 = w0.a(context);
            this.f4554a = a3 == null ? context : a3;
            this.f4565m = new ActivityExtra((Activity) context);
        } else {
            this.f4554a = context;
            this.f4565m = null;
        }
        this.f4576x = true;
        this.f4555b = ibVar;
        this.f4556c = ibVar2;
        this.f4557d = ibVar3;
        this.f4558e = ibVar4;
        this.f = ibVar5;
        this.f4559g = ibVar6;
        this.f4560h = ibVar7;
        this.f4561i = ibVar8;
        this.f4562j = ibVar9;
        this.f4563k = ibVar10;
        this.f4572t = new q2(this);
        this.f4573u = new n2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r6 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        r7 = (java.util.List) r4.f4574v.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0037, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0038, code lost:
    
        com.startapp.sdk.internal.d9.a(r7);
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:16:0x0022, B:17:0x0065, B:21:0x0015, B:24:0x002e, B:28:0x003e, B:33:0x004a, B:34:0x004d, B:37:0x0038, B:38:0x0050, B:40:0x0058, B:26:0x0030, B:30:0x0045), top: B:3:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(StartAppAd startAppAd, com.startapp.sdk.adsbase.k kVar, boolean z3, boolean z4, String str) {
        List list;
        synchronized (this.f4574v) {
            try {
                ?? r12 = this.f4567o;
                if (r12 != 0 && r12.isReady()) {
                    ?? r13 = this.f4567o;
                    if (!(r13 == 0 ? false : r13.hasAdCacheTtlPassed()) && !z3) {
                        if (startAppAd != null && kVar != null) {
                            a0.b(this.f4554a, kVar, startAppAd, true);
                        }
                    }
                }
                if (this.f4568p.compareAndSet(false, true)) {
                    this.f4572t.e();
                    this.f4573u.e();
                    b(str, z4);
                }
            } finally {
            }
        }
        if (list == null) {
            list = new ArrayList();
            try {
                this.f4574v.put(kVar, list);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        list.add(startAppAd);
        if (this.f4568p.compareAndSet(false, true)) {
        }
        list.add(startAppAd);
        if (this.f4568p.compareAndSet(false, true)) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void b(String str, boolean z3) {
        String str2;
        ?? r02 = this.f4567o;
        if (r02 != 0) {
            r02.setVideoCancelCallBack(false);
        }
        if (!this.f4571s || (str2 = this.f4570r) == null) {
            a(str, z3);
            return;
        }
        this.f4571s = false;
        r2 r2Var = new r2(this, new v2(this), z3);
        Context context = this.f4554a;
        ((Executor) com.startapp.sdk.components.a.a(context).f3337C.a()).execute(new q6(context, str2, r2Var, new s2(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z3;
        ?? r02 = this.f4567o;
        if (r02 != 0 && r02.isReady()) {
            Context context = this.f4554a;
            Ad ad = this.f4567o;
            if (ad != null) {
                HashSet hashSet = new HashSet();
                if (ad instanceof m8) {
                    z3 = t0.a(context, t0.a(((m8) ad).f4031b, 0), 0, hashSet, new ArrayList()).booleanValue();
                } else if ((ad instanceof db) && t0.a(context, ((db) ad).f3581a, 0, hashSet, false).size() == 0) {
                    z3 = true;
                }
                if (!z3) {
                    ?? r03 = this.f4567o;
                    if (!(r03 != 0 ? r03.hasAdCacheTtlPassed() : false)) {
                        if (this.f4568p.get()) {
                            return;
                        }
                        this.f4572t.d();
                        return;
                    }
                }
                a(null, null, true, false, null);
                return;
            }
            z3 = false;
            if (!z3) {
            }
            a(null, null, true, false, null);
            return;
        }
        if (this.f4568p.get()) {
            return;
        }
        this.f4573u.d();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a(String str, boolean z3) {
        Ad ijVar;
        Ad tdVar;
        Ad udVar;
        if (z3) {
            Long h3 = AdsCommonMetaData.k().h();
            if (h3 != null && this.y != null && SystemClock.elapsedRealtime() - this.y.longValue() < h3.longValue()) {
                a0.a(this.f4554a, new v2(this), new t2(this.f4554a, this.f4564l, this.f4555b, this.f4556c, this.f4558e, this.f, this.f4559g, this.f4560h, this.f4561i, this.f4562j, this.f4563k), true);
                si.a(6, this.f4554a, "Failed to load " + this.f4564l.name() + " ad: NO FILL");
                return;
            }
            this.y = Long.valueOf(SystemClock.elapsedRealtime());
        }
        int i3 = u2.f4408a[this.f4564l.ordinal()];
        if (i3 == 1) {
            ijVar = new ij(this.f4554a, AdPreferences.Placement.INAPP_OVERLAY, this.f4555b, this.f4556c, this.f4558e, this.f, this.f4559g, this.f4560h, this.f4561i, this.f4562j, this.f4563k);
        } else if (i3 == 2) {
            boolean z4 = ((Random) si.f4346d.a()).nextInt(100) < AdsCommonMetaData.k().w();
            boolean isForceOfferWall3D = this.f4566n.isForceOfferWall3D();
            boolean isForceOfferWall2D = this.f4566n.isForceOfferWall2D();
            if ((z4 || isForceOfferWall3D) && !isForceOfferWall2D) {
                tdVar = new td(this.f4554a, this.f4555b, this.f4556c, this.f4558e, this.f, this.f4559g, this.f4560h, this.f4561i, this.f4562j, this.f4563k, this.f4557d);
                ijVar = tdVar;
            } else {
                udVar = new ud(this.f4554a, this.f4555b, this.f4556c, this.f4558e, this.f, this.f4559g, this.f4560h, this.f4561i, this.f4562j, this.f4563k);
                ijVar = udVar;
            }
        } else if (i3 == 3) {
            udVar = new te(this.f4554a, this.f4555b, this.f4556c, this.f4558e, this.f, this.f4559g, this.f4560h, this.f4561i, this.f4562j, this.f4563k);
            ijVar = udVar;
        } else if (i3 != 4) {
            ijVar = new xd(this.f4554a, this.f4555b, this.f4556c, this.f4558e, this.f, this.f4559g, this.f4560h, this.f4561i, this.f4562j, this.f4563k);
        } else {
            tdVar = new wg(this.f4554a, this.f4555b, this.f4556c, this.f4558e, this.f, this.f4559g, this.f4560h, this.f4561i, this.f4562j, this.f4563k);
            ijVar = tdVar;
        }
        this.f4567o = ijVar;
        ((y6) ((x6) this.f4555b.a())).a(this, this.f4567o);
        this.f4567o.setActivityExtra(this.f4565m);
        this.f4566n.setAutoLoadAmount(this.f4575w);
        this.f4567o.load(this.f4566n, new v2(this), str);
        this.f4569q = System.currentTimeMillis();
    }
}
