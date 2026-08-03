package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public abstract class LocationServiceExtension {
    public abstract io.appmetrica.analytics.coreapi.internal.backport.Consumer<android.location.Location> getLocationConsumer();

    public abstract io.appmetrica.analytics.coreapi.internal.control.Toggle getLocationControllerAppStateToggle();

    public abstract io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController getLocationSourcesController();
}
