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
import androidx.fragment.app.C0685e;
import androidx.fragment.app.C0686f;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.TaskCompletionSource;
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
import p018c2.O;
import p058i.B;
import p155w1.C1010l1;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4086c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f4084a = i7;
        this.f4086c = obj;
        this.f4085b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p014b4.a aVarB;
        int i7;
        N4.a aVar;
        p096n1.e eVar;
        boolean z4 = false;
        int i8 = 1;
        switch (this.f4084a) {
            case 0:
                HashMap map = b.f4087c;
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
                C0410f c0410f = new C0410f(i8);
                C0425v c0425v = (C0425v) this.f4086c;
                C0426w c0426w = c0425v.f6216b;
                String str = (String) this.f4085b;
                t6.h.e(str, "messageArg");
                I4.j jVar = c0426w.f6217a;
                jVar.getClass();
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", jVar.a(), (Object) null, 1).L(p050g6.i.M0(c0425v, str), new D(c0410f, 3));
                return;
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.f4086c;
                t6.h.e(viewGroup, "$container");
                C0685e c0685e = (C0685e) this.f4085b;
                t6.h.e(c0685e, "this$0");
                viewGroup.endViewTransition(null);
                C0686f c0686f = c0685e.f9455b;
                throw null;
            case 7:
                p014b4.d dVar = (p014b4.d) this.f4086c;
                dVar.getClass();
                String str2 = p014b4.e.f10142b.f1721a;
                p048g4.m mVar2 = dVar.f10135c.f10143a;
                String string = ((SharedPreferences) mVar2.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string2 = ((SharedPreferences) mVar2.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string == null || string2 == null) {
                    aVarB = null;
                } else {
                    try {
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
                        int iE = p136t.e.e(i7);
                        if (iE == 0) {
                            aVarB = p014b4.a.b(string2);
                        } else if (iE != 1) {
                            Log.e(str2, "Reached unreachable section in #retrieveAppCheckToken()", null);
                            aVarB = null;
                        } else {
                            aVarB = p014b4.a.a(string2);
                        }
                    } catch (IllegalArgumentException e8) {
                        StringBuilder sbK = p031e1.k.k("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                        sbK.append(e8.getMessage());
                        Log.e(str2, sbK.toString(), null);
                        ((SharedPreferences) mVar2.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                }
                if (aVarB != null) {
                    dVar.j = aVarB;
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
                    break;
                }
                return;
            case 11:
                p048g4.o oVar = (p048g4.o) this.f4086c;
                N4.b bVar2 = (N4.b) this.f4085b;
                if (oVar.f13226b != p048g4.o.f13224d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    aVar = oVar.f13225a;
                    oVar.f13225a = null;
                    oVar.f13226b = bVar2;
                    break;
                }
                aVar.b(bVar2);
                return;
            case 12:
                p048g4.n nVar = (p048g4.n) this.f4086c;
                N4.b bVar3 = (N4.b) this.f4085b;
                synchronized (nVar) {
                    try {
                        if (nVar.f13222b == null) {
                            nVar.f13221a.add(bVar3);
                        } else {
                            nVar.f13222b.add(bVar3.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 13:
                p056h4.a aVar2 = (p056h4.a) this.f4086c;
                Process.setThreadPriority(aVar2.f13538c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f13539d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f4085b).run();
                return;
            case 14:
                Callable callable = (Callable) this.f4086c;
                p056h4.h hVar = (p056h4.h) ((C1010l1) this.f4085b).f17777a;
                try {
                    hVar.p(callable.call());
                    return;
                } catch (Exception e9) {
                    hVar.t(e9);
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
                B b7 = (B) this.f4086c;
                b7.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    b7.a();
                }
            case 17:
                p061i2.b bVar4 = (p061i2.b) this.f4086c;
                bVar4.f13854z = false;
                bVar4.b((Uri) this.f4085b);
                return;
            case 18:
                p064i5.f fVar = (p064i5.f) this.f4086c;
                fVar.getClass();
                p064i5.e eVar2 = (p064i5.e) this.f4085b;
                eVar2.f14033b.run();
                fVar.f14039f = eVar2;
                fVar.f14038e.run();
                return;
            case 19:
                A a2 = (A) this.f4086c;
                p064i5.f fVar2 = (p064i5.f) this.f4085b;
                synchronized (a2) {
                    HashSet hashSet = new HashSet((HashSet) a2.f1215e);
                    ((HashSet) a2.f1216f).remove(fVar2);
                    ((HashSet) a2.f1215e).add(fVar2);
                    p064i5.e eVar3 = fVar2.f14039f;
                    if (eVar3 == null || (eVar = eVar3.f14032a) == null || !((p064i5.d) eVar.f15314b).j()) {
                        p064i5.e eVar4 = fVar2.f14039f;
                        if ((eVar4 != null ? eVar4.a() : null) != null) {
                            HashMap map2 = (HashMap) a2.f1217x;
                            p064i5.e eVar5 = fVar2.f14039f;
                            map2.remove(eVar5 != null ? eVar5.a() : null);
                        }
                    }
                    a2.o(fVar2);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        a2.o((p064i5.f) it.next());
                        break;
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
