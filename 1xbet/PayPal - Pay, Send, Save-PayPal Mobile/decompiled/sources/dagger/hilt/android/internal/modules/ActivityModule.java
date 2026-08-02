package dagger.hilt.android.internal.modules;

@dagger.Module
/* loaded from: classes17.dex */
abstract class ActivityModule {
    @dagger.Binds
    abstract android.content.Context getHighSpeedVideoFpsRangesFor(android.app.Activity activity);

    @dagger.Provides
    @dagger.Reusable
    static androidx.fragment.app.FragmentActivity getHighResolutionOutputSizeshNQ4ISI(android.app.Activity activity) {
        try {
            return (androidx.fragment.app.FragmentActivity) activity;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Expected activity to be a FragmentActivity: ".concat(java.lang.String.valueOf(activity)), e);
        }
    }

    private ActivityModule() {
    }
}
