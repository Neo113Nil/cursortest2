package io.sentry.flutter;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryFlutterReplayRecorder f14465b;

    public /* synthetic */ a(SentryFlutterReplayRecorder sentryFlutterReplayRecorder, int i7) {
        this.f14464a = i7;
        this.f14465b = sentryFlutterReplayRecorder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14464a) {
            case 0:
                SentryFlutterReplayRecorder.start$lambda$0(this.f14465b);
                break;
            case 1:
                SentryFlutterReplayRecorder.pause$lambda$4(this.f14465b);
                break;
            case 2:
                SentryFlutterReplayRecorder.stop$lambda$5(this.f14465b);
                break;
            case 3:
                SentryFlutterReplayRecorder.resume$lambda$1(this.f14465b);
                break;
            default:
                SentryFlutterReplayRecorder.reset$lambda$3(this.f14465b);
                break;
        }
    }
}
