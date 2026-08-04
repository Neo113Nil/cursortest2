package io.sentry.cache;

import A1.C0042s;
import A1.J;
import A1.K;
import A1.N;
import B1.h;
import android.view.View;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.sentry.Breadcrumb;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.flutter.SentryFlutterReplayRecorder;
import io.sentry.protocol.Request;
import java.util.Collection;
import p018c2.D;
import p098n4.F;
import p146u2.C0959s;
import p151v2.n;
import p151v2.t;
import p156w2.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14463c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f14461a = i7;
        this.f14462b = obj;
        this.f14463c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14461a) {
            case 0:
                ((PersistingScopeObserver) this.f14462b).lambda$serializeToDisk$13((Runnable) this.f14463c);
                break;
            case 1:
                ((PersistingScopeObserver) this.f14462b).lambda$setRequest$6((Request) this.f14463c);
                break;
            case 2:
                ((PersistingScopeObserver) this.f14462b).lambda$setFingerprint$7((Collection) this.f14463c);
                break;
            case 3:
                ((PersistingScopeObserver) this.f14462b).lambda$addBreadcrumb$2((Breadcrumb) this.f14463c);
                break;
            case 4:
                SentryFlutterReplayRecorder.onConfigurationChanged$lambda$2((SentryFlutterReplayRecorder) this.f14462b, (ScreenshotRecorderConfig) this.f14463c);
                break;
            case 5:
                ((F) this.f14462b).q(((p014b4.b) this.f14463c).f10129a);
                break;
            case 6:
                ((F) this.f14462b).q(((O4.b) this.f14463c).f5008a);
                break;
            case 7:
                ((TaskCompletionSource) this.f14462b).trySetResult((p063i4.b) this.f14463c);
                break;
            case 8:
                ((C0959s) this.f14463c).a(((n) this.f14462b).f());
                break;
            case 9:
                w wVar = (w) this.f14462b;
                wVar.getClass();
                int i7 = t.f17159a;
                N n2 = ((K) wVar.f11336c).f109a;
                n2.getClass();
                n2.f164l.k(25, new J((o) this.f14463c));
                break;
            case 10:
                w wVar2 = (w) this.f14462b;
                D1.e eVar = (D1.e) this.f14463c;
                wVar2.getClass();
                synchronized (eVar) {
                }
                K k7 = (K) wVar2.f11336c;
                int i8 = t.f17159a;
                h hVar = k7.f109a.f169q;
                B1.a aVarK = hVar.K((D) hVar.f989d.f5826e);
                hVar.N(aVarK, 1020, new C0042s(aVarK, eVar, 11));
                break;
            default:
                p169z.D d7 = (p169z.D) this.f14462b;
                int i9 = d7.f18259p;
                View[] viewArr = (View[]) this.f14463c;
                if (i9 != -1) {
                    for (View view : viewArr) {
                        view.setTag(d7.f18259p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (d7.f18260q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(d7.f18260q, null);
                    }
                }
                break;
        }
    }
}
