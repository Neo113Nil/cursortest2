package K5;

import C0.A;
import R5.C0410f;
import R5.C0425v;
import R5.C0426w;
import R5.D;
import U5.p0;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C0706e;
import androidx.fragment.app.C0707f;
import b4.C0781a;
import b4.C0784d;
import b4.C0785e;
import c2.O;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.TaskCompletionSource;
import g4.C1140m;
import g4.C1141n;
import g4.C1142o;
import g6.AbstractC1160i;
import h4.ScheduledFutureC1205h;
import h4.ThreadFactoryC1198a;
import i.ExecutorC1215B;
import i2.C1246b;
import i5.C1282d;
import i5.C1283e;
import io.sentry.Breadcrumb;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SpanContext;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.android.ndk.NdkScopeObserver;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import n1.C1450e;
import w1.C1719l1;
import w1.F0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4086c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f4084a = i7;
        this.f4086c = obj;
        this.f4085b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x02e2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0781a c0781a;
        int i7;
        N4.a aVar;
        C1450e c1450e;
        boolean z4 = false;
        switch (this.f4084a) {
            case 0:
                HashMap hashMap = b.f4087c;
                b bVar = (b) this.f4086c;
                bVar.getClass();
                c.a();
                ((TaskCompletionSource) this.f4085b).setResult(null);
                bVar.h();
                return;
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4085b;
                try {
                    taskCompletionSource.setResult(((Callable) this.f4086c).call());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    throw new RuntimeException(e7);
                }
            case 2:
                L4.g gVar = (L4.g) this.f4086c;
                gVar.getClass();
                ((Runnable) this.f4085b).run();
                gVar.f4362a.release();
                return;
            case 3:
                L4.m mVar = (L4.m) this.f4086c;
                mVar.getClass();
                mVar.f4385g = new Date().getTime();
                ((Runnable) this.f4085b).run();
                return;
            case 4:
                L4.q qVar = (L4.q) this.f4086c;
                qVar.getClass();
                ((Runnable) this.f4085b).run();
                qVar.f4388b.release();
                return;
            case 5:
                C0410f c0410f = new C0410f(r1);
                C0425v c0425v = (C0425v) this.f4086c;
                C0426w c0426w = c0425v.f6216b;
                String str = (String) this.f4085b;
                t6.h.e(str, "messageArg");
                I4.j jVar = c0426w.f6217a;
                jVar.getClass();
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", jVar.a(), (Object) null, 1).L(AbstractC1160i.M0(c0425v, str), new D(c0410f, 3));
                return;
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.f4086c;
                t6.h.e(viewGroup, "$container");
                C0706e c0706e = (C0706e) this.f4085b;
                t6.h.e(c0706e, "this$0");
                viewGroup.endViewTransition(null);
                C0707f c0707f = c0706e.f9455b;
                throw null;
            case 7:
                C0784d c0784d = (C0784d) this.f4086c;
                c0784d.getClass();
                String str2 = C0785e.f10142b.f1721a;
                C1140m c1140m = c0784d.f10135c.f10143a;
                String string = ((SharedPreferences) c1140m.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string2 = ((SharedPreferences) c1140m.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string != null && string2 != null) {
                    try {
                    } catch (IllegalArgumentException e8) {
                        StringBuilder k7 = e1.k.k("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                        k7.append(e8.getMessage());
                        Log.e(str2, k7.toString(), null);
                        ((SharedPreferences) c1140m.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                    if (string == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string.equals("DEFAULT_APP_CHECK_TOKEN")) {
                        i7 = 1;
                    } else {
                        if (!string.equals("UNKNOWN_APP_CHECK_TOKEN")) {
                            throw new IllegalArgumentException("No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType.".concat(string));
                        }
                        i7 = 2;
                    }
                    int e9 = t.e.e(i7);
                    if (e9 == 0) {
                        c0781a = C0781a.b(string2);
                    } else if (e9 != 1) {
                        Log.e(str2, "Reached unreachable section in #retrieveAppCheckToken()", null);
                    } else {
                        c0781a = C0781a.a(string2);
                    }
                    if (c0781a != null) {
                        c0784d.j = c0781a;
                    }
                    ((TaskCompletionSource) this.f4085b).setResult(null);
                    return;
                }
                c0781a = null;
                if (c0781a != null) {
                }
                ((TaskCompletionSource) this.f4085b).setResult(null);
                return;
            case 8:
                O o7 = (O) this.f4086c;
                IcyHeaders icyHeaders = o7.f10211H;
                F1.s sVar = (F1.s) this.f4085b;
                o7.f10218O = icyHeaders == null ? sVar : new F1.n(-9223372036854775807L);
                o7.f10219P = sVar.i();
                if (o7.f10225V == -1 && sVar.i() == -9223372036854775807L) {
                    z4 = true;
                }
                o7.f10220Q = z4;
                o7.f10221R = z4 ? 7 : 1;
                o7.f10238x.r(o7.f10219P, sVar.d(), o7.f10220Q);
                if (o7.f10215L) {
                    return;
                }
                o7.h();
                return;
            case 9:
                ((A5.p) ((A5.p) this.f4086c).f679b).success(this.f4085b);
                return;
            case 10:
                O1.k kVar = (O1.k) this.f4086c;
                Object obj = this.f4085b;
                kVar.getClass();
                com.google.android.gms.common.internal.D.i(obj);
                synchronized (((com.google.firebase.storage.s) kVar.f4973d).f12059a) {
                    ((HashMap) kVar.f4972c).remove(obj);
                    ((ConcurrentLinkedQueue) kVar.f4971b).remove(obj);
                    S4.c.f6322c.a(obj);
                }
                return;
            case 11:
                C1142o c1142o = (C1142o) this.f4086c;
                N4.b bVar2 = (N4.b) this.f4085b;
                if (c1142o.f13220b != C1142o.f13218d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (c1142o) {
                    aVar = c1142o.f13219a;
                    c1142o.f13219a = null;
                    c1142o.f13220b = bVar2;
                }
                aVar.b(bVar2);
                return;
            case 12:
                C1141n c1141n = (C1141n) this.f4086c;
                N4.b bVar3 = (N4.b) this.f4085b;
                synchronized (c1141n) {
                    try {
                        if (c1141n.f13216b == null) {
                            c1141n.f13215a.add(bVar3);
                        } else {
                            c1141n.f13216b.add(bVar3.get());
                        }
                    } finally {
                    }
                }
                return;
            case 13:
                ThreadFactoryC1198a threadFactoryC1198a = (ThreadFactoryC1198a) this.f4086c;
                Process.setThreadPriority(threadFactoryC1198a.f13532c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC1198a.f13533d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f4085b).run();
                return;
            case 14:
                Callable callable = (Callable) this.f4086c;
                ScheduledFutureC1205h scheduledFutureC1205h = (ScheduledFutureC1205h) ((C1719l1) this.f4085b).f17771a;
                try {
                    scheduledFutureC1205h.p(callable.call());
                    return;
                } catch (Exception e10) {
                    scheduledFutureC1205h.t(e10);
                    return;
                }
            case 15:
                Runnable runnable = (Runnable) this.f4085b;
                p0 p0Var = (p0) this.f4086c;
                Semaphore semaphore = (Semaphore) p0Var.f6569c;
                try {
                    runnable.run();
                    return;
                } finally {
                    semaphore.release();
                    p0Var.d();
                }
            case 16:
                Runnable runnable2 = (Runnable) this.f4085b;
                ExecutorC1215B executorC1215B = (ExecutorC1215B) this.f4086c;
                executorC1215B.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    executorC1215B.a();
                }
            case 17:
                C1246b c1246b = (C1246b) this.f4086c;
                c1246b.f13848z = false;
                c1246b.b((Uri) this.f4085b);
                return;
            case 18:
                i5.f fVar = (i5.f) this.f4086c;
                fVar.getClass();
                C1283e c1283e = (C1283e) this.f4085b;
                c1283e.f14027b.run();
                fVar.f14033f = c1283e;
                fVar.f14032e.run();
                return;
            case 19:
                A a2 = (A) this.f4086c;
                i5.f fVar2 = (i5.f) this.f4085b;
                synchronized (a2) {
                    HashSet hashSet = new HashSet((HashSet) a2.f1215e);
                    ((HashSet) a2.f1216f).remove(fVar2);
                    ((HashSet) a2.f1215e).add(fVar2);
                    C1283e c1283e2 = fVar2.f14033f;
                    if (c1283e2 == null || (c1450e = c1283e2.f14026a) == null || !((C1282d) c1450e.f15308b).j()) {
                        C1283e c1283e3 = fVar2.f14033f;
                        if ((c1283e3 != null ? c1283e3.a() : null) != null) {
                            HashMap hashMap2 = (HashMap) a2.f1217x;
                            C1283e c1283e4 = fVar2.f14033f;
                            hashMap2.remove(c1283e4 != null ? c1283e4.a() : null);
                        }
                    }
                    a2.o(fVar2);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        a2.o((i5.f) it.next());
                    }
                }
                return;
            case 20:
                ((SentryFrameMetricsCollector) this.f4086c).lambda$new$1((ILogger) this.f4085b);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                ((NdkScopeObserver) this.f4086c).lambda$setTrace$6((SpanContext) this.f4085b);
                return;
            case 22:
                ((NdkScopeObserver) this.f4086c).lambda$addBreadcrumb$1((Breadcrumb) this.f4085b);
                return;
            case 23:
                ((NdkScopeObserver) this.f4086c).lambda$setUser$0((User) this.f4085b);
                return;
            case 24:
                BufferCaptureStrategy.stop$lambda$0((File) this.f4086c, (BufferCaptureStrategy) this.f4085b);
                return;
            case 25:
                ((PersistingScopeObserver) this.f4086c).lambda$setReplayId$12((SentryId) this.f4085b);
                return;
            case 26:
                ((PersistingScopeObserver) this.f4086c).lambda$setContexts$11((Contexts) this.f4085b);
                return;
            case 27:
                ((PersistingScopeObserver) this.f4086c).lambda$setTransaction$9((String) this.f4085b);
                return;
            case 28:
                ((PersistingScopeObserver) this.f4086c).lambda$setUser$1((User) this.f4085b);
                return;
            default:
                ((PersistingScopeObserver) this.f4086c).lambda$setLevel$8((SentryLevel) this.f4085b);
                return;
        }
    }

    public /* synthetic */ a(TaskCompletionSource taskCompletionSource, Callable callable) {
        this.f4084a = 1;
        this.f4085b = taskCompletionSource;
        this.f4086c = callable;
    }
}
