package dagger.hilt.android.internal.modules;

/* loaded from: classes17.dex */
public final class ActivityModule_ProvideFragmentActivityFactory implements dagger.internal.Factory<androidx.fragment.app.FragmentActivity> {
    private final dagger.internal.Provider<android.app.Activity> getHighSpeedVideoFpsRangesFor;

    private ActivityModule_ProvideFragmentActivityFactory(dagger.internal.Provider<android.app.Activity> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.fragment.app.FragmentActivity get() {
        return provideFragmentActivity(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static dagger.hilt.android.internal.modules.ActivityModule_ProvideFragmentActivityFactory create(dagger.internal.Provider<android.app.Activity> provider) {
        return new dagger.hilt.android.internal.modules.ActivityModule_ProvideFragmentActivityFactory(provider);
    }

    public static androidx.fragment.app.FragmentActivity provideFragmentActivity(android.app.Activity activity) {
        return (androidx.fragment.app.FragmentActivity) dagger.internal.Preconditions.checkNotNullFromProvides(dagger.hilt.android.internal.modules.ActivityModule.getHighResolutionOutputSizeshNQ4ISI(activity));
    }
}
