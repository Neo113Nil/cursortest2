package com.google.android.gms.common.api.internal;

import W5.AbstractC0486a1;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import b4.C0786f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0858j;
import com.google.android.gms.common.internal.C0864p;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n3.AbstractC1464a;
import v0.AbstractC1663a;
import w1.C1761y0;

/* renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831h implements Handler.Callback {

    /* renamed from: G, reason: collision with root package name */
    public static final Status f11173G = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: H, reason: collision with root package name */
    public static final Status f11174H = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: I, reason: collision with root package name */
    public static final Object f11175I = new Object();

    /* renamed from: J, reason: collision with root package name */
    public static C0831h f11176J;

    /* renamed from: A, reason: collision with root package name */
    public final ConcurrentHashMap f11177A;

    /* renamed from: B, reason: collision with root package name */
    public B f11178B;

    /* renamed from: C, reason: collision with root package name */
    public final r.c f11179C;

    /* renamed from: D, reason: collision with root package name */
    public final r.c f11180D;

    /* renamed from: E, reason: collision with root package name */
    public final zau f11181E;

    /* renamed from: F, reason: collision with root package name */
    public volatile boolean f11182F;

    /* renamed from: a, reason: collision with root package name */
    public long f11183a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11184b;

    /* renamed from: c, reason: collision with root package name */
    public TelemetryData f11185c;

    /* renamed from: d, reason: collision with root package name */
    public h3.b f11186d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f11187e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.common.c f11188f;

    /* renamed from: x, reason: collision with root package name */
    public final com.google.android.gms.common.internal.w f11189x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f11190y;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicInteger f11191z;

    public C0831h(Context context, Looper looper) {
        com.google.android.gms.common.c cVar = com.google.android.gms.common.c.f11215d;
        this.f11183a = 10000L;
        this.f11184b = false;
        this.f11190y = new AtomicInteger(1);
        this.f11191z = new AtomicInteger(0);
        this.f11177A = new ConcurrentHashMap(5, 0.75f, 1);
        this.f11178B = null;
        this.f11179C = new r.c(0);
        this.f11180D = new r.c(0);
        this.f11182F = true;
        this.f11187e = context;
        zau zauVar = new zau(looper, this);
        this.f11181E = zauVar;
        this.f11188f = cVar;
        this.f11189x = new com.google.android.gms.common.internal.w(0);
        PackageManager packageManager = context.getPackageManager();
        if (m3.c.f15255g == null) {
            m3.c.f15255g = Boolean.valueOf(m3.c.h() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (m3.c.f15255g.booleanValue()) {
            this.f11182F = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f11175I) {
            try {
                C0831h c0831h = f11176J;
                if (c0831h != null) {
                    c0831h.f11191z.incrementAndGet();
                    zau zauVar = c0831h.f11181E;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C0824a c0824a, ConnectionResult connectionResult) {
        return new Status(17, AbstractC1663a.f("API: ", c0824a.f11161b.f11089c, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.f11062c, connectionResult);
    }

    public static C0831h g(Context context) {
        C0831h c0831h;
        HandlerThread handlerThread;
        synchronized (f11175I) {
            if (f11176J == null) {
                synchronized (AbstractC0858j.f11312a) {
                    try {
                        handlerThread = AbstractC0858j.f11314c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            AbstractC0858j.f11314c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = AbstractC0858j.f11314c;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = com.google.android.gms.common.c.f11214c;
                f11176J = new C0831h(applicationContext, looper);
            }
            c0831h = f11176J;
        }
        return c0831h;
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
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) C0864p.b().f11324a;
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
        if (AbstractC1464a.E(context)) {
            return false;
        }
        int i8 = connectionResult.f11061b;
        PendingIntent pendingIntent = connectionResult.f11062c;
        if (!((i8 == 0 || pendingIntent == null) ? false : true)) {
            pendingIntent = cVar.b(context, i8, 0, null);
        }
        if (pendingIntent == null) {
            return false;
        }
        int i9 = GoogleApiActivity.f11073b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i7);
        intent.putExtra("notify_manager", true);
        cVar.i(context, i8, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
        return true;
    }

    public final D f(com.google.android.gms.common.api.l lVar) {
        C0824a apiKey = lVar.getApiKey();
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        D d7;
        Feature[] g3;
        int i7;
        int i8 = 15;
        int i9 = message.what;
        zau zauVar = this.f11181E;
        ConcurrentHashMap concurrentHashMap = this.f11177A;
        com.google.android.gms.common.internal.q qVar = com.google.android.gms.common.internal.q.f11325a;
        switch (i9) {
            case 1:
                this.f11183a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zauVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, (C0824a) it.next()), this.f11183a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (D d8 : concurrentHashMap.values()) {
                    com.google.android.gms.common.internal.D.c(d8.f11103D.f11181E);
                    d8.f11101B = null;
                    d8.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                L l7 = (L) message.obj;
                D d9 = (D) concurrentHashMap.get(l7.f11130c.getApiKey());
                if (d9 == null) {
                    d9 = f(l7.f11130c);
                }
                boolean requiresSignIn = d9.f11105b.requiresSignIn();
                V v6 = l7.f11128a;
                if (!requiresSignIn || this.f11191z.get() == l7.f11129b) {
                    d9.l(v6);
                    return true;
                }
                v6.a(f11173G);
                d9.n();
                return true;
            case 5:
                int i10 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        d7 = (D) it2.next();
                        if (d7.f11110x == i10) {
                        }
                    } else {
                        d7 = null;
                    }
                }
                if (d7 == null) {
                    Log.wtf("GoogleApiManager", AbstractC0486a1.j(i10, "Could not find API instance ", " while trying to fail enqueued calls.").toString(), new Exception());
                    return true;
                }
                int i11 = connectionResult.f11061b;
                if (i11 != 13) {
                    d7.b(e(d7.f11106c, connectionResult));
                    return true;
                }
                this.f11188f.getClass();
                int i12 = com.google.android.gms.common.g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                StringBuilder k7 = e1.k.k("Error resolution was canceled by the user, original error message: ", ConnectionResult.j(i11), ": ");
                k7.append(connectionResult.f11063d);
                d7.b(new Status(17, k7.toString(), null, null));
                return true;
            case 6:
                Context context = this.f11187e;
                if (!(context.getApplicationContext() instanceof Application)) {
                    return true;
                }
                ComponentCallbacks2C0826c.b((Application) context.getApplicationContext());
                ComponentCallbacks2C0826c componentCallbacks2C0826c = ComponentCallbacks2C0826c.f11168e;
                componentCallbacks2C0826c.a(new C0786f(this));
                AtomicBoolean atomicBoolean = componentCallbacks2C0826c.f11170b;
                boolean z4 = atomicBoolean.get();
                AtomicBoolean atomicBoolean2 = componentCallbacks2C0826c.f11169a;
                if (!z4) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                        atomicBoolean2.set(true);
                    }
                }
                if (atomicBoolean2.get()) {
                    return true;
                }
                this.f11183a = 300000L;
                return true;
            case 7:
                f((com.google.android.gms.common.api.l) message.obj);
                return true;
            case 9:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                D d10 = (D) concurrentHashMap.get(message.obj);
                com.google.android.gms.common.internal.D.c(d10.f11103D.f11181E);
                if (!d10.f11112z) {
                    return true;
                }
                d10.k();
                return true;
            case 10:
                r.c cVar = this.f11180D;
                Iterator it3 = cVar.iterator();
                while (true) {
                    r.h hVar = (r.h) it3;
                    if (!hVar.hasNext()) {
                        cVar.clear();
                        return true;
                    }
                    D d11 = (D) concurrentHashMap.remove((C0824a) hVar.next());
                    if (d11 != null) {
                        d11.n();
                    }
                }
            case 11:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                D d12 = (D) concurrentHashMap.get(message.obj);
                C0831h c0831h = d12.f11103D;
                com.google.android.gms.common.internal.D.c(c0831h.f11181E);
                boolean z7 = d12.f11112z;
                if (!z7) {
                    return true;
                }
                if (z7) {
                    C0831h c0831h2 = d12.f11103D;
                    zau zauVar2 = c0831h2.f11181E;
                    C0824a c0824a = d12.f11106c;
                    zauVar2.removeMessages(11, c0824a);
                    c0831h2.f11181E.removeMessages(9, c0824a);
                    d12.f11112z = false;
                }
                d12.b(c0831h.f11188f.d(c0831h.f11187e, com.google.android.gms.common.d.f11216a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                d12.f11105b.disconnect("Timing out connection while resuming.");
                return true;
            case 12:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                ((D) concurrentHashMap.get(message.obj)).j(true);
                return true;
            case 14:
                C c3 = (C) message.obj;
                C0824a c0824a2 = c3.f11098a;
                boolean containsKey = concurrentHashMap.containsKey(c0824a2);
                TaskCompletionSource taskCompletionSource = c3.f11099b;
                if (containsKey) {
                    taskCompletionSource.setResult(Boolean.valueOf(((D) concurrentHashMap.get(c0824a2)).j(false)));
                    return true;
                }
                taskCompletionSource.setResult(Boolean.FALSE);
                return true;
            case 15:
                E e7 = (E) message.obj;
                if (!concurrentHashMap.containsKey(e7.f11113a)) {
                    return true;
                }
                D d13 = (D) concurrentHashMap.get(e7.f11113a);
                if (!d13.f11100A.contains(e7) || d13.f11112z) {
                    return true;
                }
                if (d13.f11105b.isConnected()) {
                    d13.d();
                    return true;
                }
                d13.k();
                return true;
            case 16:
                E e8 = (E) message.obj;
                if (!concurrentHashMap.containsKey(e8.f11113a)) {
                    return true;
                }
                D d14 = (D) concurrentHashMap.get(e8.f11113a);
                if (!d14.f11100A.remove(e8)) {
                    return true;
                }
                C0831h c0831h3 = d14.f11103D;
                c0831h3.f11181E.removeMessages(15, e8);
                c0831h3.f11181E.removeMessages(16, e8);
                LinkedList linkedList = d14.f11104a;
                ArrayList arrayList = new ArrayList(linkedList.size());
                Iterator it4 = linkedList.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    Feature feature = e8.f11114b;
                    if (!hasNext) {
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            V v7 = (V) arrayList.get(i13);
                            linkedList.remove(v7);
                            v7.b(new com.google.android.gms.common.api.w(feature));
                        }
                        return true;
                    }
                    V v8 = (V) it4.next();
                    if ((v8 instanceof I) && (g3 = ((I) v8).g(d14)) != null) {
                        int length = g3.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                break;
                            }
                            if (!com.google.android.gms.common.internal.D.m(g3[i14], feature)) {
                                i14++;
                            } else if (i14 >= 0) {
                                arrayList.add(v8);
                            }
                        }
                    }
                }
                break;
            case 17:
                TelemetryData telemetryData = this.f11185c;
                if (telemetryData == null) {
                    return true;
                }
                if (telemetryData.f11299a > 0 || c()) {
                    if (this.f11186d == null) {
                        this.f11186d = new h3.b(this.f11187e, null, h3.b.f13527a, qVar, com.google.android.gms.common.api.k.f11205c);
                    }
                    h3.b bVar = this.f11186d;
                    bVar.getClass();
                    C0844v a2 = AbstractC0845w.a();
                    a2.f11197d = new Feature[]{zaf.zaa};
                    a2.f11195b = false;
                    a2.f11196c = new C1761y0(telemetryData, i8);
                    bVar.doBestEffortWrite(a2.e());
                }
                this.f11185c = null;
                return true;
            case 18:
                K k8 = (K) message.obj;
                long j = k8.f11126c;
                MethodInvocation methodInvocation = k8.f11124a;
                int i15 = k8.f11125b;
                if (j == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i15, Arrays.asList(methodInvocation));
                    if (this.f11186d == null) {
                        this.f11186d = new h3.b(this.f11187e, null, h3.b.f13527a, qVar, com.google.android.gms.common.api.k.f11205c);
                    }
                    h3.b bVar2 = this.f11186d;
                    bVar2.getClass();
                    C0844v a4 = AbstractC0845w.a();
                    a4.f11197d = new Feature[]{zaf.zaa};
                    a4.f11195b = false;
                    a4.f11196c = new C1761y0(telemetryData2, i8);
                    bVar2.doBestEffortWrite(a4.e());
                    return true;
                }
                TelemetryData telemetryData3 = this.f11185c;
                if (telemetryData3 != null) {
                    List list = telemetryData3.f11300b;
                    if (telemetryData3.f11299a != i15 || (list != null && list.size() >= k8.f11127d)) {
                        zauVar.removeMessages(17);
                        TelemetryData telemetryData4 = this.f11185c;
                        if (telemetryData4 != null) {
                            if (telemetryData4.f11299a > 0 || c()) {
                                if (this.f11186d == null) {
                                    i7 = i15;
                                    this.f11186d = new h3.b(this.f11187e, null, h3.b.f13527a, qVar, com.google.android.gms.common.api.k.f11205c);
                                } else {
                                    i7 = i15;
                                }
                                h3.b bVar3 = this.f11186d;
                                bVar3.getClass();
                                C0844v a7 = AbstractC0845w.a();
                                a7.f11197d = new Feature[]{zaf.zaa};
                                a7.f11195b = false;
                                a7.f11196c = new C1761y0(telemetryData4, i8);
                                bVar3.doBestEffortWrite(a7.e());
                            } else {
                                i7 = i15;
                            }
                            this.f11185c = null;
                            if (this.f11185c == null) {
                                return true;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(methodInvocation);
                            this.f11185c = new TelemetryData(i7, arrayList2);
                            zauVar.sendMessageDelayed(zauVar.obtainMessage(17), k8.f11126c);
                            return true;
                        }
                    } else {
                        TelemetryData telemetryData5 = this.f11185c;
                        if (telemetryData5.f11300b == null) {
                            telemetryData5.f11300b = new ArrayList();
                        }
                        telemetryData5.f11300b.add(methodInvocation);
                    }
                }
                i7 = i15;
                if (this.f11185c == null) {
                }
                break;
            case 19:
                this.f11184b = false;
                return true;
            default:
                AbstractC1663a.j(i9, "Unknown message id: ", "GoogleApiManager");
                return false;
        }
    }
}
