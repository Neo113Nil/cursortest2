package p121q5;

import android.view.KeyEvent;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15955e;

    public /* synthetic */ q(Object obj, Object obj2, long j, Object obj3, int i7) {
        this.f15951a = i7;
        this.f15952b = obj;
        this.f15953c = obj2;
        this.f15954d = j;
        this.f15955e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15951a) {
            case 0:
                r rVar = (r) this.f15952b;
                rVar.getClass();
                rVar.b(false, Long.valueOf(((v) this.f15953c).f15964b), Long.valueOf(this.f15954d), ((KeyEvent) this.f15955e).getEventTime());
                break;
            case 1:
                r rVar2 = (r) this.f15952b;
                rVar2.getClass();
                rVar2.b(false, Long.valueOf(((v) this.f15953c).f15964b), Long.valueOf(this.f15954d), ((KeyEvent) this.f15955e).getEventTime());
                break;
            default:
                SessionCaptureStrategy.onScreenshotRecorded$lambda$3((SessionCaptureStrategy) this.f15952b, (Function2) this.f15953c, this.f15954d, (ScreenshotRecorderConfig) this.f15955e);
                break;
        }
    }
}
