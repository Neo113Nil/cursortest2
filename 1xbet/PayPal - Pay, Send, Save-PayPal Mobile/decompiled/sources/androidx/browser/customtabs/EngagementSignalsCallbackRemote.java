package androidx.browser.customtabs;

/* loaded from: classes6.dex */
final class EngagementSignalsCallbackRemote implements androidx.browser.customtabs.EngagementSignalsCallback {
    private final android.support.customtabs.IEngagementSignalsCallback getHighSpeedVideoFpsRangesFor;

    private EngagementSignalsCallbackRemote(android.support.customtabs.IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.getHighSpeedVideoFpsRangesFor = iEngagementSignalsCallback;
    }

    static androidx.browser.customtabs.EngagementSignalsCallbackRemote Camera2StreamConfigurationMap(android.os.IBinder iBinder) {
        return new androidx.browser.customtabs.EngagementSignalsCallbackRemote(android.support.customtabs.IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) {
        try {
            this.getHighSpeedVideoFpsRangesFor.onVerticalScrollEvent(z, bundle);
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) {
        try {
            this.getHighSpeedVideoFpsRangesFor.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z, android.os.Bundle bundle) {
        try {
            this.getHighSpeedVideoFpsRangesFor.onSessionEnded(z, bundle);
        } catch (android.os.RemoteException unused) {
        }
    }
}
