package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0814j;
import com.google.android.gms.common.internal.C0820p;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0787h implements Handler.Callback {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Status f11173G = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Status f11174H = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Object f11175I = new Object();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static C0787h f11176J;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ConcurrentHashMap f11177A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public B f11178B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p122r.c f11179C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p122r.c f11180D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final zau f11181E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile boolean f11182F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TelemetryData f11185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p055h3.b f11186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.common.c f11188f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.gms.common.internal.w f11189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicInteger f11190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicInteger f11191z;

    public C0787h(Context context, Looper looper) {
        com.google.android.gms.common.c cVar = com.google.android.gms.common.c.f11215d;
        this.f11183a = 10000L;
        this.f11184b = false;
        this.f11190y = new AtomicInteger(1);
        this.f11191z = new AtomicInteger(0);
        this.f11177A = new ConcurrentHashMap(5, 0.75f, 1);
        this.f11178B = null;
        this.f11179C = new p122r.c(0);
        this.f11180D = new p122r.c(0);
        this.f11182F = true;
        this.f11187e = context;
        zau zauVar = new zau(looper, this);
        this.f11181E = zauVar;
        this.f11188f = cVar;
        this.f11189x = new com.google.android.gms.common.internal.w(0);
        PackageManager packageManager = context.getPackageManager();
        if (p090m3.c.f15261g == null) {
            p090m3.c.f15261g = Boolean.valueOf(p090m3.c.h() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (p090m3.c.f15261g.booleanValue()) {
            this.f11182F = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f11175I) {
            try {
                C0787h c0787h = f11176J;
                if (c0787h != null) {
                    c0787h.f11191z.incrementAndGet();
                    zau zauVar = c0787h.f11181E;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C0780a c0780a, ConnectionResult connectionResult) {
        return new Status(17, p150v0.a.f("API: ", c0780a.f11161b.f11089c, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.f11062c, connectionResult);
    }

    public static C0787h g(Context context) {
        C0787h c0787h;
        HandlerThread handlerThread;
        synchronized (f11175I) {
            if (f11176J == null) {
                synchronized (AbstractC0814j.f11312a) {
                    try {
                        handlerThread = AbstractC0814j.f11314c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            AbstractC0814j.f11314c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = AbstractC0814j.f11314c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = com.google.android.gms.common.c.f11214c;
                f11176J = new C0787h(applicationContext, looper);
            }
            c0787h = f11176J;
        }
        return c0787h;
    }

    public final void b(B b7) {
        synchronized (f11175I) {
            try {
                if (this.f11178B != b7) {
                    this.f11178B = b7;
                    this.f11179C.clear();
                }
                this.f11179C.addAll(b7.f11096e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f11184b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) C0820p.b().f11324a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f11295b) {
            return false;
        }
        int i7 = ((SparseIntArray) this.f11189x.f11335b).get(203400000, -1);
        return i7 == -1 || i7 == 0;
    }

    public final boolean d(ConnectionResult connectionResult, int i7) {
        com.google.android.gms.common.c cVar = this.f11188f;
        cVar.getClass();
        Context context = this.f11187e;
        if (p097n3.a.E(context)) {
            return false;
        }
        int i8 = connectionResult.f11061b;
        PendingIntent pendingIntentB = connectionResult.f11062c;
        if (!((i8 == 0 || pendingIntentB == null) ? false : true)) {
            pendingIntentB = cVar.b(context, i8, 0, null);
        }
        if (pendingIntentB == null) {
            return false;
        }
        int i9 = GoogleApiActivity.f11073b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntentB);
        intent.putExtra("failing_client_id", i7);
        intent.putExtra("notify_manager", true);
        cVar.i(context, i8, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
        return true;
    }

    public final D f(com.google.android.gms.common.api.l lVar) {
        C0780a apiKey = lVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f11177A;
        D d7 = (D) concurrentHashMap.get(apiKey);
        if (d7 == null) {
            d7 = new D(this, lVar);
            concurrentHashMap.put(apiKey, d7);
        }
        if (d7.f11105b.requiresSignIn()) {
            this.f11180D.add(apiKey);
        }
        d7.k();
        return d7;
    }

    public final void h(ConnectionResult connectionResult, int i7) {
        if (d(connectionResult, i7)) {
            return;
        }
        zau zauVar = this.f11181E;
        zauVar.sendMessage(zauVar.obtainMessage(5, i7, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0365  */
    /* JADX WARN: Code duplicated, block: B:140:0x036b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0393  */
    /* JADX WARN: Code duplicated, block: B:142:0x039e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v6 com.google.android.gms.common.api.internal.D, still in use, count: 2, list:
          (r4v6 com.google.android.gms.common.api.internal.D) from 0x035d: IGET (r4v6 com.google.android.gms.common.api.internal.D) A[WRAPPED] (LINE:862) com.google.android.gms.common.api.internal.D.x int
          (r4v6 com.google.android.gms.common.api.internal.D) from 0x0363: PHI (r4 I:??) = (r4v3 com.google.android.gms.common.api.internal.D), (r4v6 com.google.android.gms.common.api.internal.D) binds: [B:136:0x0362, B:185:0x0363] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r19) {
        /*
            Method dump skipped, instruction units count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0787h.handleMessage(android.os.Message):boolean");
    }
}
