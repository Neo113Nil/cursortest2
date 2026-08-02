package dagger.hilt.android.migration;

/* loaded from: classes17.dex */
public final class CustomInjection {
    /* JADX WARN: Multi-variable type inference failed */
    public static void inject(android.app.Application application) {
        dagger.hilt.internal.Preconditions.checkNotNull(application);
        dagger.hilt.internal.Preconditions.checkArgument(application instanceof dagger.hilt.android.internal.migration.HasCustomInject, "'%s' is not a custom inject application. Check that you have annotated the application with both @HiltAndroidApp and @CustomInject.", application.getClass());
        ((dagger.hilt.android.internal.migration.HasCustomInject) application).customInject();
    }

    private CustomInjection() {
    }
}
