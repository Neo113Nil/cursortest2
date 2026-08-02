package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
public final class ServiceComponentManager implements dagger.hilt.internal.GeneratedComponentManager<java.lang.Object> {
    private java.lang.Object Camera2StreamConfigurationMap;
    private final android.app.Service getHighSpeedVideoFpsRangesFor;

    /* loaded from: classes5.dex */
    public interface ServiceComponentBuilderEntryPoint {
        dagger.hilt.android.internal.builders.ServiceComponentBuilder serviceComponentBuilder();
    }

    public ServiceComponentManager(android.app.Service service) {
        this.getHighSpeedVideoFpsRangesFor = service;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        if (this.Camera2StreamConfigurationMap == null) {
            android.app.Application application = this.getHighSpeedVideoFpsRangesFor.getApplication();
            dagger.hilt.internal.Preconditions.checkState(application instanceof dagger.hilt.internal.GeneratedComponentManager, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.Camera2StreamConfigurationMap = ((dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint) dagger.hilt.EntryPoints.get(application, dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint.class)).serviceComponentBuilder().service(this.getHighSpeedVideoFpsRangesFor).build();
        }
        return this.Camera2StreamConfigurationMap;
    }
}
