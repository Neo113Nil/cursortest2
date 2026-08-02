package io.sentry.cache;

import A1.C0042s;
import A1.J;
import A1.K;
import A1.N;
import B1.h;
import android.view.View;
import b4.C0782b;
import c2.D;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import i4.C1265b;
import io.sentry.Breadcrumb;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.flutter.SentryFlutterReplayRecorder;
import io.sentry.protocol.Request;
import java.util.Collection;
import n4.F;
import u2.C1641s;
import v2.n;
import v2.t;
import w2.o;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14457c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f14455a = i7;
        this.f14456b = obj;
        this.f14457c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14455a) {
            case 0:
                ((PersistingScopeObserver) this.f14456b).lambda$serializeToDisk$13((Runnable) this.f14457c);
                break;
            case 1:
                ((PersistingScopeObserver) this.f14456b).lambda$setRequest$6((Request) this.f14457c);
                break;
            case 2:
                ((PersistingScopeObserver) this.f14456b).lambda$setFingerprint$7((Collection) this.f14457c);
                break;
            case 3:
                ((PersistingScopeObserver) this.f14456b).lambda$addBreadcrumb$2((Breadcrumb) this.f14457c);
                break;
            case 4:
                SentryFlutterReplayRecorder.onConfigurationChanged$lambda$2((SentryFlutterReplayRecorder) this.f14456b, (ScreenshotRecorderConfig) this.f14457c);
                break;
            case 5:
                ((F) this.f14456b).q(((C0782b) this.f14457c).f10129a);
                break;
            case 6:
                ((F) this.f14456b).q(((O4.b) this.f14457c).f5008a);
                break;
            case 7:
                ((TaskCompletionSource) this.f14456b).trySetResult((C1265b) this.f14457c);
                break;
            case 8:
                ((C1641s) this.f14457c).a(((n) this.f14456b).f());
                break;
            case 9:
                w wVar = (w) this.f14456b;
                wVar.getClass();
                int i7 = t.f17153a;
                N n2 = ((K) wVar.f11336c).f109a;
                n2.getClass();
                n2.f164l.k(25, new J((o) this.f14457c));
                break;
            case 10:
                w wVar2 = (w) this.f14456b;
                D1.e eVar = (D1.e) this.f14457c;
                wVar2.getClass();
                synchronized (eVar) {
                }
                K k7 = (K) wVar2.f11336c;
                int i8 = t.f17153a;
                h hVar = k7.f109a.f169q;
                B1.a K7 = hVar.K((D) hVar.f989d.f5826e);
                hVar.N(K7, 1020, new C0042s(K7, eVar, 11));
                break;
            default:
                z.D d7 = (z.D) this.f14456b;
                int i9 = d7.f18253p;
                View[] viewArr = (View[]) this.f14457c;
                if (i9 != -1) {
                    for (View view : viewArr) {
                        view.setTag(d7.f18253p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (d7.f18254q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(d7.f18254q, null);
                    }
                    break;
                }
                break;
        }
    }
}
