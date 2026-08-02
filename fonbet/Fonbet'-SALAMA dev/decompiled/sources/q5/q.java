package q5;

import android.view.KeyEvent;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15949e;

    public /* synthetic */ q(Object obj, Object obj2, long j, Object obj3, int i7) {
        this.f15945a = i7;
        this.f15946b = obj;
        this.f15947c = obj2;
        this.f15948d = j;
        this.f15949e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15945a) {
            case 0:
                r rVar = (r) this.f15946b;
                rVar.getClass();
                rVar.b(false, Long.valueOf(((v) this.f15947c).f15958b), Long.valueOf(this.f15948d), ((KeyEvent) this.f15949e).getEventTime());
                break;
            case 1:
                r rVar2 = (r) this.f15946b;
                rVar2.getClass();
                rVar2.b(false, Long.valueOf(((v) this.f15947c).f15958b), Long.valueOf(this.f15948d), ((KeyEvent) this.f15949e).getEventTime());
                break;
            default:
                SessionCaptureStrategy.onScreenshotRecorded$lambda$3((SessionCaptureStrategy) this.f15946b, (Function2) this.f15947c, this.f15948d, (ScreenshotRecorderConfig) this.f15949e);
                break;
        }
    }
}
