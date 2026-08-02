package L3;

import C.f0;
import L3.L;
import android.media.metrics.NetworkEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.appsflyer.internal.AFi1iSDK;
import io.sentry.android.core.F;
import j3.Q;
import java.util.concurrent.ConcurrentHashMap;
import u3.N;

/* loaded from: classes8.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16425c;

    public /* synthetic */ q(int i11, Object obj, Object obj2) {
        this.f16423a = i11;
        this.f16424b = obj;
        this.f16425c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProcessLifecycleOwner processLifecycleOwner;
        switch (this.f16423a) {
            case 0:
                ((L.a) this.f16424b).onVideoSizeChanged((Q) this.f16425c);
                break;
            case 1:
                N.l.i((N.l) this.f16424b, (f0) this.f16425c);
                break;
            case 2:
                ((AFi1iSDK) this.f16424b).AFInAppEventType((Runnable) this.f16425c);
                break;
            case 3:
                ((io.sentry.android.core.F) this.f16424b).getClass();
                F.b bVar = (F.b) this.f16425c;
                if (bVar != null) {
                    processLifecycleOwner = ProcessLifecycleOwner.f43230i;
                    processLifecycleOwner.getLifecycle().e(bVar);
                    break;
                }
                break;
            case 4:
                ((io.sentry.cache.l) this.f16424b).K((ConcurrentHashMap) this.f16425c, "extras.json");
                break;
            default:
                ((N) this.f16424b).f99771d.reportNetworkEvent((NetworkEvent) this.f16425c);
                break;
        }
    }
}
