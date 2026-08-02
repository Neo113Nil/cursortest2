package com.google.android.gms.common.moduleinstall;

/* loaded from: classes8.dex */
public interface ModuleInstallClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> areModulesAvailable(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> getInstallModulesIntent(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest moduleInstallRequest);

    com.google.android.gms.tasks.Task<java.lang.Void> releaseModules(com.google.android.gms.common.api.OptionalModuleApi... optionalModuleApiArr);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterListener(com.google.android.gms.common.moduleinstall.InstallStatusListener installStatusListener);
}
