package io.sentry.flutter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryFlutterReplayRecorder f14471b;

    public /* synthetic */ a(SentryFlutterReplayRecorder sentryFlutterReplayRecorder, int i7) {
        this.f14470a = i7;
        this.f14471b = sentryFlutterReplayRecorder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14470a) {
            case 0:
                SentryFlutterReplayRecorder.start$lambda$0(this.f14471b);
                break;
            case 1:
                SentryFlutterReplayRecorder.pause$lambda$4(this.f14471b);
                break;
            case 2:
                SentryFlutterReplayRecorder.stop$lambda$5(this.f14471b);
                break;
            case 3:
                SentryFlutterReplayRecorder.resume$lambda$1(this.f14471b);
                break;
            default:
                SentryFlutterReplayRecorder.reset$lambda$3(this.f14471b);
                break;
        }
    }
}
