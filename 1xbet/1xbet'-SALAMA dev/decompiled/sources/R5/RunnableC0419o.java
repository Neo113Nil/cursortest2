package R5;

import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.BaseCaptureStrategy;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.protocol.SentryId;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import p155w1.F0;

/* JADX INFO: renamed from: R5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0419o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6200f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6201x;

    public /* synthetic */ RunnableC0419o(C0420p c0420p, String str, String str2, String str3, String str4, long j) {
        this.f6195a = 0;
        this.f6197c = c0420p;
        this.f6198d = str;
        this.f6199e = str2;
        this.f6200f = str3;
        this.f6201x = str4;
        this.f6196b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6195a) {
            case 0:
                C0410f c0410f = new C0410f(1);
                C0420p c0420p = (C0420p) this.f6197c;
                C0421q c0421q = c0420p.f6202a;
                String str = (String) this.f6198d;
                t6.h.e(str, "urlArg");
                String str2 = (String) this.f6199e;
                t6.h.e(str2, "userAgentArg");
                String str3 = (String) this.f6200f;
                t6.h.e(str3, "contentDispositionArg");
                String str4 = (String) this.f6201x;
                t6.h.e(str4, "mimetypeArg");
                I4.j jVar = c0421q.f6203a;
                jVar.getClass();
                A5.f fVar = (A5.f) jVar.f3678b;
                new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", jVar.a(), (Object) null, 1).L(p050g6.i.M0(c0420p, str, str2, str3, str4, Long.valueOf(this.f6196b)), new H5.k(c0410f, 27));
                break;
            case 1:
                ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) this.f6200f;
                BufferCaptureStrategy.createCurrentSegment$lambda$4((BufferCaptureStrategy) this.f6197c, this.f6196b, (Date) this.f6198d, (SentryId) this.f6199e, screenshotRecorderConfig, (Function1) this.f6201x);
                break;
            default:
                ScreenshotRecorderConfig screenshotRecorderConfig2 = (ScreenshotRecorderConfig) this.f6200f;
                SessionCaptureStrategy.createCurrentSegment$lambda$4((SessionCaptureStrategy) this.f6197c, this.f6196b, (Date) this.f6198d, (SentryId) this.f6199e, screenshotRecorderConfig2, (Function1) this.f6201x);
                break;
        }
    }

    public /* synthetic */ RunnableC0419o(BaseCaptureStrategy baseCaptureStrategy, long j, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1, int i7) {
        this.f6195a = i7;
        this.f6197c = baseCaptureStrategy;
        this.f6196b = j;
        this.f6198d = date;
        this.f6199e = sentryId;
        this.f6200f = screenshotRecorderConfig;
        this.f6201x = function1;
    }
}
