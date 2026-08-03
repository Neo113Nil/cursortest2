package com.unity3d.services.ads;

/* loaded from: classes5.dex */
public final class UnityAdsImplementation implements com.unity3d.services.ads.IUnityAds {
    private static com.unity3d.services.core.configuration.Configuration configuration;
    private static com.unity3d.services.ads.IUnityAds instance;
    private static final com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker webViewBridgeInvoker = new com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker();

    public static com.unity3d.services.ads.IUnityAds getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.ads.UnityAdsImplementation();
        }
        return instance;
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void initialize(android.content.Context context, java.lang.String str, boolean z, final com.unity3d.ads.IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        com.unity3d.services.core.log.DeviceLog.entered();
        if (hasInvalidContext(context)) {
            com.unity3d.services.core.log.DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
            if (iUnityAdsInitializationListener != null) {
                com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.UnityAdsImplementation$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.unity3d.ads.IUnityAdsInitializationListener.this.onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
                    }
                });
                return;
            }
            return;
        }
        com.unity3d.services.UnityServices.initialize(context, str, z, iUnityAdsInitializationListener);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean isInitialized() {
        return com.unity3d.services.UnityServices.isInitialized();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean isSupported() {
        return com.unity3d.services.UnityServices.isSupported();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public java.lang.String getVersion() {
        return com.unity3d.services.UnityServices.getVersion();
    }

    public void show(android.app.Activity activity, java.lang.String str) {
        show(activity, str, new com.unity3d.ads.UnityAdsShowOptions(), null);
    }

    public void show(android.app.Activity activity, java.lang.String str, com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener) {
        show(activity, str, new com.unity3d.ads.UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void show(android.app.Activity activity, java.lang.String str, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, final com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener) {
        if (activity == null || hasInvalidContext(activity)) {
            handleShowError(iUnityAdsShowListener, str, com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
            return;
        }
        com.unity3d.services.core.properties.ClientProperties.setActivity(activity);
        if (((com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.configuration.AlternativeFlowReader.class)).invoke()) {
            new com.unity3d.services.UnityAdsSDK().show(str, unityAdsShowOptions, new com.unity3d.ads.core.data.model.Listeners() { // from class: com.unity3d.services.ads.UnityAdsImplementation.1
                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(java.lang.String str2) {
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(java.lang.String str2, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str3) {
                    com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowFailure(str2, unityAdsShowError, str3);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(java.lang.String str2) {
                    com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowStart(str2);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(java.lang.String str2) {
                    com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowClick(str2);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(java.lang.String str2, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                    if (iUnityAdsShowListener2 != null) {
                        iUnityAdsShowListener2.onUnityAdsShowComplete(str2, unityAdsShowCompletionState);
                    }
                }
            });
            return;
        }
        if (!isSupported()) {
            handleShowError(iUnityAdsShowListener, str, com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
            return;
        }
        if (!isInitialized()) {
            handleShowError(iUnityAdsShowListener, str, com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED);
            return;
        }
        if (activity == null) {
            handleShowError(iUnityAdsShowListener, str, com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
            return;
        }
        if (str == null) {
            handleShowError(iUnityAdsShowListener, "", com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL);
            return;
        }
        com.unity3d.services.core.configuration.Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new com.unity3d.services.core.configuration.Configuration();
        }
        com.unity3d.services.ads.operation.show.ShowModule.getInstance().executeAdOperation(com.unity3d.services.core.webview.WebViewApp.getCurrentApp(), new com.unity3d.services.ads.operation.show.ShowOperationState(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration2));
    }

    private void handleShowError(com.unity3d.ads.IUnityAdsShowListener iUnityAdsShowListener, java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2) {
        ((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)).sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowFailure(unityAdsShowError, (java.lang.Long) 0L));
        if (iUnityAdsShowListener == null) {
            return;
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void setDebugMode(boolean z) {
        com.unity3d.services.UnityServices.setDebugMode(z);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean getDebugMode() {
        return com.unity3d.services.UnityServices.getDebugMode();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void load(final java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, final com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener) {
        if (hasInvalidContext()) {
            com.unity3d.services.core.log.DeviceLog.error("No valid Context for loading ads");
            if (iUnityAdsLoadListener != null) {
                com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.UnityAdsImplementation$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.unity3d.ads.IUnityAdsLoadListener.this.onUnityAdsFailedToLoad(str, com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "Unity Ads SDK failed to load due to invalid context");
                    }
                });
                return;
            }
            return;
        }
        if (((com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.configuration.AlternativeFlowReader.class)).invoke()) {
            new com.unity3d.services.UnityAdsSDK().load(str, unityAdsLoadOptions, iUnityAdsLoadListener, null);
            return;
        }
        com.unity3d.services.core.configuration.Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new com.unity3d.services.core.configuration.Configuration();
        }
        com.unity3d.services.ads.operation.load.LoadModule.getInstance().executeAdOperation(webViewBridgeInvoker, new com.unity3d.services.ads.operation.load.LoadOperationState(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration2));
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public java.lang.String getToken() {
        if (hasInvalidContext()) {
            com.unity3d.services.core.log.DeviceLog.error("No valid Context for getting token");
            return null;
        }
        if (((com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.configuration.AlternativeFlowReader.class)).invoke()) {
            return new com.unity3d.services.UnityAdsSDK().getToken();
        }
        java.lang.String token = ((com.unity3d.services.ads.token.TokenStorage) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.token.TokenStorage.class)).getToken();
        if (token == null || token.isEmpty()) {
            return null;
        }
        com.unity3d.services.core.configuration.Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new com.unity3d.services.core.configuration.ConfigurationReader().getCurrentConfiguration();
        }
        com.unity3d.services.ads.gmascar.managers.BiddingBaseManager createManager = com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory.getInstance().createManager(null, configuration2.getExperiments());
        createManager.start();
        return createManager.getFormattedToken(token);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(com.unity3d.ads.TokenConfiguration tokenConfiguration, final com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (hasInvalidContext()) {
            com.unity3d.services.core.log.DeviceLog.error("No valid Context for getting token");
            if (iUnityAdsTokenListener != null) {
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                return;
            }
            return;
        }
        if (((com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.configuration.AlternativeFlowReader.class)).invoke()) {
            new com.unity3d.services.UnityAdsSDK().getToken(tokenConfiguration, iUnityAdsTokenListener);
            return;
        }
        if (iUnityAdsTokenListener == null) {
            com.unity3d.services.core.log.DeviceLog.info("Please provide non-null listener to UnityAds.GetToken method");
            return;
        }
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.UnityAdsImplementation$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity3d.ads.IUnityAdsTokenListener.this.onUnityAdsTokenReady(null);
                }
            });
            return;
        }
        com.unity3d.services.ads.token.AsyncTokenStorage asyncTokenStorage = (com.unity3d.services.ads.token.AsyncTokenStorage) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.token.AsyncTokenStorage.class);
        com.unity3d.services.core.configuration.Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new com.unity3d.services.core.configuration.ConfigurationReader().getCurrentConfiguration();
        }
        com.unity3d.services.ads.gmascar.managers.BiddingBaseManager createManager = com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory.getInstance().createManager(iUnityAdsTokenListener, tokenConfiguration, configuration2.getExperiments());
        createManager.start();
        asyncTokenStorage.getToken(createManager);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        getToken(null, iUnityAdsTokenListener);
    }

    public static void setConfiguration(com.unity3d.services.core.configuration.Configuration configuration2) {
        configuration = configuration2;
    }

    private boolean hasInvalidContext(android.content.Context context) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            return false;
        }
        if (context == null) {
            return true;
        }
        if (context instanceof android.app.Application) {
            com.unity3d.services.core.properties.ClientProperties.setApplicationContext(context);
            com.unity3d.services.core.properties.ClientProperties.setApplication((android.app.Application) context);
            return false;
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.getApplication() != null && activity.getApplicationContext() != null) {
                com.unity3d.services.core.properties.ClientProperties.setApplicationContext(context.getApplicationContext());
                com.unity3d.services.core.properties.ClientProperties.setApplication(activity.getApplication());
                return false;
            }
        }
        return true;
    }

    private boolean hasInvalidContext() {
        return hasInvalidContext(null);
    }
}
