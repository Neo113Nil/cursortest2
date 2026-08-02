package androidx.profileinstaller;

/* loaded from: classes7.dex */
public final /* synthetic */ class ProfileInstaller$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ ProfileInstaller$$ExternalSyntheticLambda1(androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, java.lang.Object obj) {
        this.f$0 = diagnosticsCallback;
        this.f$1 = i;
        this.f$2 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.onDiagnosticReceived(this.f$1, this.f$2);
    }
}
