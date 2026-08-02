package androidx.work;

/* loaded from: classes7.dex */
public final class WorkManagerInitializer implements androidx.startup.Initializer<androidx.work.WorkManager> {
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("WrkMgrInitializer");

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public final androidx.work.WorkManager create(android.content.Context context) {
        androidx.work.Logger.get().debug(Camera2StreamConfigurationMap, "Initializing WorkManager with default configuration.");
        androidx.work.WorkManager.initialize(context, new androidx.work.Configuration.Builder().build());
        return androidx.work.WorkManager.getInstance(context);
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return java.util.Collections.emptyList();
    }
}
