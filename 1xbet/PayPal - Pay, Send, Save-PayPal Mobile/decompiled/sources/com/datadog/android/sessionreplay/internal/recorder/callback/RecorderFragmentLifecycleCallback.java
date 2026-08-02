package com.datadog.android.sessionreplay.internal.recorder.callback;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/callback/RecorderFragmentLifecycleCallback;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;", "onWindowRefreshedCallback", "<init>", "(Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;)V", "Landroidx/fragment/app/Fragment;", "p0", "", "Landroid/view/Window;", "getHighSpeedVideoFpsRanges", "(Landroidx/fragment/app/Fragment;)Ljava/util/List;", "Landroidx/fragment/app/FragmentManager;", "fm", "f", "", "onFragmentPaused", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "onFragmentResumed", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecorderFragmentLifecycleCallback extends androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback getHighSpeedVideoFpsRanges;

    public RecorderFragmentLifecycleCallback(com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback onWindowRefreshedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onWindowRefreshedCallback, "");
        this.getHighSpeedVideoFpsRanges = onWindowRefreshedCallback;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(androidx.fragment.app.FragmentManager fm, androidx.fragment.app.Fragment f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        super.onFragmentResumed(fm, f);
        java.util.List<android.view.Window> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(f);
        if (highSpeedVideoFpsRanges != null) {
            this.getHighSpeedVideoFpsRanges.onWindowsAdded(highSpeedVideoFpsRanges);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(androidx.fragment.app.FragmentManager fm, androidx.fragment.app.Fragment f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        java.util.List<android.view.Window> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(f);
        if (highSpeedVideoFpsRanges != null) {
            this.getHighSpeedVideoFpsRanges.onWindowsRemoved(highSpeedVideoFpsRanges);
        }
        super.onFragmentPaused(fm, f);
    }

    private static java.util.List<android.view.Window> getHighSpeedVideoFpsRanges(androidx.fragment.app.Fragment p0) {
        if (p0 instanceof androidx.fragment.app.DialogFragment) {
            androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) p0;
            if (dialogFragment.getContext() != null) {
                android.app.Dialog dialog = dialogFragment.getDialog();
                android.view.Window window = dialog != null ? dialog.getWindow() : null;
                android.app.Dialog dialog2 = dialogFragment.getDialog();
                android.app.Activity ownerActivity = dialog2 != null ? dialog2.getOwnerActivity() : null;
                android.view.Window window2 = ownerActivity != null ? ownerActivity.getWindow() : null;
                if (window != null && ownerActivity != null && window2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(window, window2)) {
                    return kotlin.collections.CollectionsKt.listOf(window);
                }
            }
        }
        return null;
    }
}
