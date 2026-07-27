package com.startapp.sdk.components;

import A0.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.sdk.internal.a4;
import com.startapp.sdk.internal.a5;
import com.startapp.sdk.internal.a6;
import com.startapp.sdk.internal.c5;
import com.startapp.sdk.internal.d4;
import com.startapp.sdk.internal.d5;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.dc;
import com.startapp.sdk.internal.e5;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.g4;
import com.startapp.sdk.internal.h5;
import com.startapp.sdk.internal.hb;
import com.startapp.sdk.internal.i3;
import com.startapp.sdk.internal.i5;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.j4;
import com.startapp.sdk.internal.k3;
import com.startapp.sdk.internal.k5;
import com.startapp.sdk.internal.l4;
import com.startapp.sdk.internal.m3;
import com.startapp.sdk.internal.n4;
import com.startapp.sdk.internal.n5;
import com.startapp.sdk.internal.o3;
import com.startapp.sdk.internal.o4;
import com.startapp.sdk.internal.o5;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p3;
import com.startapp.sdk.internal.q3;
import com.startapp.sdk.internal.q4;
import com.startapp.sdk.internal.q5;
import com.startapp.sdk.internal.r3;
import com.startapp.sdk.internal.rk;
import com.startapp.sdk.internal.s3;
import com.startapp.sdk.internal.s5;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.t4;
import com.startapp.sdk.internal.t5;
import com.startapp.sdk.internal.u3;
import com.startapp.sdk.internal.u4;
import com.startapp.sdk.internal.u5;
import com.startapp.sdk.internal.v3;
import com.startapp.sdk.internal.v4;
import com.startapp.sdk.internal.v5;
import com.startapp.sdk.internal.vk;
import com.startapp.sdk.internal.w0;
import com.startapp.sdk.internal.w4;
import com.startapp.sdk.internal.w5;
import com.startapp.sdk.internal.wk;
import com.startapp.sdk.internal.x4;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y4;
import com.startapp.sdk.internal.y5;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.yk;
import com.startapp.sdk.internal.z3;
import com.startapp.sdk.internal.z4;
import com.startapp.sdk.internal.z5;
import d2.C0279i;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: U, reason: collision with root package name */
    public static final v3 f3334U = new v3();

    /* renamed from: A, reason: collision with root package name */
    public final ib f3335A;

    /* renamed from: B, reason: collision with root package name */
    public final ib f3336B;

    /* renamed from: C, reason: collision with root package name */
    public final ib f3337C;

    /* renamed from: D, reason: collision with root package name */
    public final ib f3338D;

    /* renamed from: E, reason: collision with root package name */
    public final ib f3339E;

    /* renamed from: F, reason: collision with root package name */
    public final ib f3340F;

    /* renamed from: G, reason: collision with root package name */
    public final ib f3341G;

    /* renamed from: H, reason: collision with root package name */
    public final ib f3342H;

    /* renamed from: I, reason: collision with root package name */
    public final ib f3343I;

    /* renamed from: J, reason: collision with root package name */
    public final ib f3344J;

    /* renamed from: K, reason: collision with root package name */
    public final ib f3345K;
    public final ib L;

    /* renamed from: M, reason: collision with root package name */
    public final ib f3346M;

    /* renamed from: N, reason: collision with root package name */
    public final ib f3347N;

    /* renamed from: O, reason: collision with root package name */
    public final ib f3348O;

    /* renamed from: P, reason: collision with root package name */
    public final ib f3349P;

    /* renamed from: Q, reason: collision with root package name */
    public final ib f3350Q;

    /* renamed from: R, reason: collision with root package name */
    public final ib f3351R;

    /* renamed from: S, reason: collision with root package name */
    public final ib f3352S;

    /* renamed from: T, reason: collision with root package name */
    public final ib f3353T;

    /* renamed from: a, reason: collision with root package name */
    public final ib f3354a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3355b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f3356c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f3357d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f3358e;
    public final ib f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f3359g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f3360h;

    /* renamed from: i, reason: collision with root package name */
    public final ib f3361i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f3362j;

    /* renamed from: k, reason: collision with root package name */
    public final ib f3363k;

    /* renamed from: l, reason: collision with root package name */
    public final ib f3364l;

    /* renamed from: m, reason: collision with root package name */
    public final ib f3365m;

    /* renamed from: n, reason: collision with root package name */
    public final ib f3366n;

    /* renamed from: o, reason: collision with root package name */
    public final ib f3367o;

    /* renamed from: p, reason: collision with root package name */
    public final ib f3368p;

    /* renamed from: q, reason: collision with root package name */
    public final ib f3369q;

    /* renamed from: r, reason: collision with root package name */
    public final ib f3370r;

    /* renamed from: s, reason: collision with root package name */
    public final ib f3371s;

    /* renamed from: t, reason: collision with root package name */
    public final ib f3372t;

    /* renamed from: u, reason: collision with root package name */
    public final ib f3373u;

    /* renamed from: v, reason: collision with root package name */
    public final ib f3374v;

    /* renamed from: w, reason: collision with root package name */
    public final ib f3375w;

    /* renamed from: x, reason: collision with root package name */
    public final ib f3376x;
    public final ib y;

    /* renamed from: z, reason: collision with root package name */
    public final ib f3377z;

    public a(final Context context) {
        this.L = new ib(new u4(context));
        this.f3354a = new ib(new i5(this, context));
        final int i3 = 0;
        this.f3355b = new ib(new i7(this) { // from class: com.startapp.sdk.components.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f3379b;

            {
                this.f3379b = this;
            }

            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                switch (i3) {
                    case 0:
                        return this.f3379b.e(context);
                    default:
                        return this.f3379b.c(context);
                }
            }
        });
        this.f3356c = new ib(new v5(this, context));
        ib ibVar = new ib(new w5());
        ib ibVar2 = new ib(new x5());
        this.f3357d = new ib(new y5(context));
        this.f3358e = new ib(new z5(context));
        a6 a6Var = new a6();
        this.f = new ib(new i3(this, context, a6Var));
        this.f3359g = new ib(new k3(this, context, a6Var));
        this.f3360h = new ib(new m3(context));
        this.f3361i = new ib(new o3(context));
        this.f3362j = new ib(new p3(this, context));
        this.f3363k = new ib(new q3(context));
        this.f3364l = new ib(new r3());
        this.f3365m = new ib(new s3(context));
        this.f3366n = new ib(new u3(this));
        this.f3367o = new ib(new z3(context));
        this.f3368p = new ib(new a4(context));
        this.f3369q = new ib(new d4(this, context, ibVar));
        this.f3370r = new ib(new g4(this, context));
        this.f3371s = new ib(new j4(this, context));
        this.f3372t = new ib(new l4(context));
        this.f3373u = new ib(new n4(this, context));
        this.f3374v = new ib(new o4(context));
        this.f3375w = new ib(new q4(context));
        this.f3376x = new ib(new t4(this, context));
        this.y = new ib(new v4());
        this.f3377z = new ib(new e(0));
        this.f3335A = ibVar2;
        this.f3336B = ibVar2;
        this.f3337C = ibVar2;
        this.f3338D = new ib(new w4());
        this.f3339E = new ib(new x4());
        this.f3340F = new ib(new y4());
        this.f3341G = new ib(new z4(context));
        this.f3342H = new ib(new a5(context));
        this.f3343I = new ib(new c5(context));
        this.f3344J = new ib(new d5(context));
        final int i4 = 1;
        this.f3345K = new ib(new B1.a(1, this));
        this.f3346M = new ib(new i7(this) { // from class: com.startapp.sdk.components.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f3379b;

            {
                this.f3379b = this;
            }

            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                switch (i4) {
                    case 0:
                        return this.f3379b.e(context);
                    default:
                        return this.f3379b.c(context);
                }
            }
        });
        this.f3347N = new ib(new e5(this, context));
        this.f3348O = new ib(new h5());
        this.f3349P = new ib(new k5(this, context));
        this.f3350Q = new ib(new n5());
        this.f3351R = new ib(new o5(this));
        this.f3352S = new ib(new q5(this, context));
        this.f3353T = new ib(new s5(this, context));
    }

    public static /* synthetic */ WvfMetadata a(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static /* synthetic */ WvfMetadata b(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static ScheduledExecutorService c() {
        return Executors.newScheduledThreadPool(0, new u5("scheduled"));
    }

    public static /* synthetic */ sf d(Context context) {
        return new sf(context.getSharedPreferences("StartApp-fb8245cb9af2e955", 0));
    }

    public final rk e(Context context) {
        final WvfMetadata e02 = MetaData.E().e0();
        WeightedChoice c3 = e02 != null ? e02.c() : null;
        String a3 = c3 != null ? c3.a() : null;
        if ("simple".equals(a3)) {
            return new wk(context);
        }
        if ("dynamic".equals(a3)) {
            final int i3 = 0;
            return new vk(context, this.f3338D, this.f3340F, new ib(new e(1)), new i7() { // from class: com.startapp.sdk.components.f
                @Override // com.startapp.sdk.internal.i7
                public final Object a() {
                    switch (i3) {
                        case 0:
                            return a.a(e02);
                        default:
                            return a.b(e02);
                    }
                }
            });
        }
        final int i4 = 1;
        return new yk(context, new ib(new d(context, 1)), this.f3338D, this.f3340F, new ib(new e(2)), new i7() { // from class: com.startapp.sdk.components.f
            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                switch (i4) {
                    case 0:
                        return a.a(e02);
                    default:
                        return a.b(e02);
                }
            }
        }, new r(6));
    }

    public static a a(Context context) {
        a aVar;
        v3 v3Var = f3334U;
        a aVar2 = v3Var.f4509a;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (v3Var) {
            try {
                aVar = v3Var.f4509a;
                if (aVar == null) {
                    Context a3 = w0.a(context);
                    if (a3 != null) {
                        context = a3;
                    }
                    aVar = new a(context);
                    v3Var.f4509a = aVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static /* synthetic */ dc b() {
        return new dc(Looper.getMainLooper());
    }

    public static /* synthetic */ SharedPreferences b(Context context) {
        return new sf(context.getSharedPreferences("StartApp-3389de2c2d518660", 0));
    }

    public final p c(Context context) {
        return new p(context, new ib(new d(context, 0)), this.f3341G, this.f3337C, this.f3345K, this.f3362j, this.f3351R, this.f3347N, this.f3355b, this.f3365m, this.f3366n, this.f3335A, this.f3375w, this.f3356c);
    }

    public static /* synthetic */ dc a() {
        return new dc(Looper.getMainLooper());
    }

    public static C0279i a(String str, String str2) {
        d9 d9Var = new d9(e9.f3617d);
        d9Var.f3574d = "EVT";
        d9Var.f3578i = str;
        d9Var.f3575e = str2;
        d9Var.a();
        return C0279i.f4852a;
    }

    public final x6 e() {
        return new y6(new r(6), new hb(new e(3)), this.f3338D, new c(0));
    }

    public static ThreadPoolExecutor a(String str, int i3, long j3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i3, j3, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() { // from class: com.startapp.sdk.components.ComponentLocator$45
            @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
            public final boolean offer(Object obj) {
                return tryTransfer((Runnable) obj);
            }
        }, new u5(str), new t5());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
