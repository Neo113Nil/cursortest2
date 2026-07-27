package b1;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.onesignal.common.threading.OneSignalDispatchers;
import io.appmetrica.analytics.impl.C0914q0;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0264a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4761a;

    public /* synthetic */ RunnableC0264a(int i2) {
        this.f4761a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4761a) {
            case 0:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f4949a;
                break;
            case 1:
                OneSignalDispatchers.prewarm$lambda$1();
                break;
            default:
                C0914q0.e();
                break;
        }
    }
}
