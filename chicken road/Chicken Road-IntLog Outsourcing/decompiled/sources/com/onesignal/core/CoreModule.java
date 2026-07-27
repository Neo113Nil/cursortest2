package com.onesignal.core;

import b2.AbstractC0279e;
import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.onesignal.core.internal.backend.IFeatureFlagsBackendService;
import com.onesignal.core.internal.backend.IParamsBackendService;
import com.onesignal.core.internal.backend.impl.FeatureFlagsBackendService;
import com.onesignal.core.internal.backend.impl.ParamsBackendService;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.core.internal.background.impl.BackgroundManager;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.ConfigModelStoreListener;
import com.onesignal.core.internal.config.impl.FeatureFlagsRefreshService;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.DatabaseProvider;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.device.impl.DeviceService;
import com.onesignal.core.internal.device.impl.InstallIdService;
import com.onesignal.core.internal.features.FeatureManager;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.HttpClient;
import com.onesignal.core.internal.http.impl.HttpConnectionFactory;
import com.onesignal.core.internal.http.impl.IHttpConnectionFactory;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.language.impl.LanguageContext;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.impl.OperationModelStore;
import com.onesignal.core.internal.operations.impl.OperationRepo;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.permissions.impl.RequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.impl.PreferencesService;
import com.onesignal.core.internal.purchases.impl.TrackGooglePurchase;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.core.internal.time.impl.Time;
import com.onesignal.debug.internal.crash.OneSignalCrashUploaderWrapper;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.inAppMessages.internal.MisconfiguredIAMManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.location.internal.MisconfiguredLocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.internal.MisconfiguredNotificationsManager;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class CoreModule implements IModule {
    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder builder) {
        i.e(builder, "builder");
        builder.register(PreferencesService.class).provides(IPreferencesService.class).provides(IStartableService.class);
        AbstractC0279e.n(builder, HttpConnectionFactory.class, IHttpConnectionFactory.class, HttpClient.class, IHttpClient.class);
        AbstractC0279e.n(builder, ApplicationService.class, IApplicationService.class, DeviceService.class, IDeviceService.class);
        AbstractC0279e.n(builder, Time.class, ITime.class, DatabaseProvider.class, IDatabaseProvider.class);
        AbstractC0279e.n(builder, InstallIdService.class, IInstallIdService.class, ConfigModelStore.class, ConfigModelStore.class);
        AbstractC0279e.n(builder, FeatureManager.class, IFeatureManager.class, ParamsBackendService.class, IParamsBackendService.class);
        AbstractC0279e.n(builder, FeatureFlagsBackendService.class, IFeatureFlagsBackendService.class, ConfigModelStoreListener.class, IStartableService.class);
        AbstractC0279e.n(builder, FeatureFlagsRefreshService.class, IStartableService.class, JwtTokenStore.class, JwtTokenStore.class);
        builder.register(IdentityVerificationService.class).provides(IdentityVerificationService.class).provides(IStartableService.class);
        builder.register(OperationModelStore.class).provides(OperationModelStore.class);
        builder.register(OperationRepo.class).provides(IOperationRepo.class).provides(IStartableService.class);
        builder.register(RequestPermissionService.class).provides(RequestPermissionService.class).provides(IRequestPermissionService.class);
        builder.register(LanguageContext.class).provides(ILanguageContext.class);
        builder.register(BackgroundManager.class).provides(IBackgroundManager.class).provides(IStartableService.class);
        builder.register(TrackGooglePurchase.class).provides(IStartableService.class);
        builder.register(OneSignalCrashUploaderWrapper.class).provides(IStartableService.class);
        AbstractC0279e.n(builder, MisconfiguredNotificationsManager.class, INotificationsManager.class, MisconfiguredIAMManager.class, IInAppMessagesManager.class);
        builder.register(MisconfiguredLocationManager.class).provides(ILocationManager.class);
    }
}
