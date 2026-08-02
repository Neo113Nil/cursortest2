package dagger.hilt.android.internal.modules;

@dagger.Module
/* loaded from: classes.dex */
public final class ApplicationContextModule {
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    public ApplicationContextModule(android.content.Context context) {
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @dagger.Provides
    final android.content.Context getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @dagger.Provides
    final android.app.Application getHighSpeedVideoFpsRangesFor() {
        return dagger.hilt.android.internal.Contexts.getApplication(this.getHighSpeedVideoFpsRangesFor);
    }
}
