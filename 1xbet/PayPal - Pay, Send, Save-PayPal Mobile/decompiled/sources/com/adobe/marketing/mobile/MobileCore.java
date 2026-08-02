package com.adobe.marketing.mobile;

/* loaded from: classes3.dex */
public final class MobileCore {
    private MobileCore() {
    }

    public static void initialize(android.app.Application application, com.adobe.marketing.mobile.InitOptions initOptions, com.adobe.marketing.mobile.AdobeCallback<?> adobeCallback) {
        if (application == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "initialize failed - application is null.", new java.lang.Object[0]);
        } else if (initOptions == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "initialize failed - initOptions is null.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCoreInitializer.INSTANCE.initialize(application, initOptions, adobeCallback);
        }
    }

    public static void initialize(android.app.Application application, java.lang.String str, com.adobe.marketing.mobile.AdobeCallback<?> adobeCallback) {
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "initialize failed - appId is null.", new java.lang.Object[0]);
        } else {
            initialize(application, com.adobe.marketing.mobile.InitOptions.configureWithAppID(str), adobeCallback);
        }
    }

    public static void initialize(android.app.Application application, java.lang.String str) {
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "initialize failed - appId is null.", new java.lang.Object[0]);
        } else {
            initialize(application, com.adobe.marketing.mobile.InitOptions.configureWithAppID(str), (com.adobe.marketing.mobile.AdobeCallback<?>) null);
        }
    }

    public static java.lang.String extensionVersion() {
        com.adobe.marketing.mobile.WrapperType wrapperType = com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().getWrapperType();
        if (wrapperType == com.adobe.marketing.mobile.WrapperType.NONE) {
            return "3.6.0";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("3.6.0-");
        sb.append(wrapperType.getWrapperTag());
        return sb.toString();
    }

    public static void setWrapperType(com.adobe.marketing.mobile.WrapperType wrapperType) {
        if (wrapperType == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "setWrapperType failed - wrapperType is null.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().setWrapperType(wrapperType);
        }
    }

    public static void setApplication(android.app.Application application) {
        if (application == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "setApplication failed - application is null", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCoreInitializer.INSTANCE.setApplication(application);
        }
    }

    public static android.app.Application getApplication() {
        return com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplication();
    }

    public static void setLogLevel(com.adobe.marketing.mobile.LoggingMode loggingMode) {
        if (loggingMode == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "setLogLevel failed - mode is null", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.services.Log.setLogLevel(loggingMode);
        }
    }

    public static com.adobe.marketing.mobile.LoggingMode getLogLevel() {
        return com.adobe.marketing.mobile.services.Log.getLogLevel();
    }

    public static void registerExtensions(java.util.List<java.lang.Class<? extends com.adobe.marketing.mobile.Extension>> list, com.adobe.marketing.mobile.AdobeCallback<?> adobeCallback) {
        com.adobe.marketing.mobile.MobileCoreInitializer.INSTANCE.registerExtensions(list, adobeCallback);
    }

    public static void registerEventListener(java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.AdobeCallback<com.adobe.marketing.mobile.Event> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Failed to registerEventListener - callback is null", com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE);
        } else if (str == null || str2 == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Failed to registerEventListener - event type/source is null", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().registerListener(str, str2, adobeCallback);
        }
    }

    public static void dispatchEvent(com.adobe.marketing.mobile.Event event) {
        if (event == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Failed to dispatchEvent - event is null", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().dispatch(event);
        }
    }

    public static void dispatchEventWithResponseCallback(com.adobe.marketing.mobile.Event event, long j, com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event> adobeCallbackWithError) {
        if (adobeCallbackWithError == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Failed to dispatchEventWithResponseCallback - callback is null", new java.lang.Object[0]);
        } else if (event == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Failed to dispatchEventWithResponseCallback - event is null", new java.lang.Object[0]);
            adobeCallbackWithError.fail(com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
        } else {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().registerResponseListener(event, j, adobeCallbackWithError);
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().dispatch(event);
        }
    }

    public static void setSmallIconResourceID(int i) {
        com.adobe.marketing.mobile.internal.AppResourceStore.INSTANCE.setSmallIconResourceID(i);
    }

    public static int getSmallIconResourceID() {
        return com.adobe.marketing.mobile.internal.AppResourceStore.INSTANCE.getSmallIconResourceID();
    }

    public static void setLargeIconResourceID(int i) {
        com.adobe.marketing.mobile.internal.AppResourceStore.INSTANCE.setLargeIconResourceID(i);
    }

    public static int getLargeIconResourceID() {
        return com.adobe.marketing.mobile.internal.AppResourceStore.INSTANCE.getLargeIconResourceID();
    }

    public static void setAdvertisingIdentifier(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("advertisingidentifier", str);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.SET_ADVERTISING_IDENTIFIER, com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void setPushIdentifier(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pushidentifier", str);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.SET_PUSH_IDENTIFIER, com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void collectPii(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null || map.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Could not trigger PII, the data is null or empty.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("contextdata", map);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.COLLECT_PII, com.adobe.marketing.mobile.EventType.GENERIC_PII, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void collectMessageInfo(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null || map.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "collectData: Could not dispatch generic data event, data is null or empty.", new java.lang.Object[0]);
        } else {
            dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.COLLECT_DATA, com.adobe.marketing.mobile.EventType.GENERIC_DATA, com.adobe.marketing.mobile.EventSource.OS).setEventData(map).build());
        }
    }

    static void getHighSpeedVideoFpsRangesFor(android.app.Activity activity) {
        java.util.Map<java.lang.String, java.lang.Object> marshal = com.adobe.marketing.mobile.internal.DataMarshaller.marshal(activity);
        if (marshal == null || marshal.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "collectData: Could not dispatch generic data event, data is null or empty.", new java.lang.Object[0]);
        } else {
            dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.COLLECT_DATA, com.adobe.marketing.mobile.EventType.GENERIC_DATA, com.adobe.marketing.mobile.EventSource.OS).setEventData(marshal).build());
        }
    }

    public static void configureWithAppID(java.lang.String str) {
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "configureWithAppID failed - appId is null.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("config.appId", str);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.CONFIGURE_WITH_APP_ID, com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void configureWithFileInAssets(java.lang.String str) {
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "configureWithFileInAssets failed - fileName is null.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("config.assetFile", str);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.CONFIGURE_WITH_FILE_PATH, com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void configureWithFileInPath(java.lang.String str) {
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "configureWithFileInPath failed - filePath is null.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("config.filePath", str);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.CONFIGURE_WITH_FILE_PATH, com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void updateConfiguration(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "updateConfiguration failed - configMap is null.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("config.update", map);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.CONFIGURATION_UPDATE, com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void clearUpdatedConfiguration() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("config.clearUpdates", java.lang.Boolean.TRUE);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.CLEAR_UPDATED_CONFIGURATION, com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void setPrivacyStatus(com.adobe.marketing.mobile.MobilePrivacyStatus mobilePrivacyStatus) {
        if (mobilePrivacyStatus == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "setPrivacyStatus failed - privacyStatus is null.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("global.privacy", mobilePrivacyStatus.getValue());
        updateConfiguration(hashMap);
    }

    public static void getPrivacyStatus(final com.adobe.marketing.mobile.AdobeCallback<com.adobe.marketing.mobile.MobilePrivacyStatus> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Failed to retrieve the privacy status - callback is null", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("config.getData", java.lang.Boolean.TRUE);
        dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.PRIVACY_STATUS_REQUEST, com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build(), 5000L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.MobileCore.1
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public /* synthetic */ void call(java.lang.Object obj) {
                com.adobe.marketing.mobile.AdobeCallback.this.call(com.adobe.marketing.mobile.MobilePrivacyStatus.fromString(com.adobe.marketing.mobile.util.DataReader.optString(((com.adobe.marketing.mobile.Event) obj).getEventData(), "global.privacy", null)));
            }

            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                com.adobe.marketing.mobile.AdobeCallback adobeCallback2 = com.adobe.marketing.mobile.AdobeCallback.this;
                if (adobeCallback2 instanceof com.adobe.marketing.mobile.AdobeCallbackWithError) {
                    ((com.adobe.marketing.mobile.AdobeCallbackWithError) adobeCallback2).fail(com.adobe.marketing.mobile.AdobeError.CALLBACK_TIMEOUT);
                } else {
                    adobeCallback2.call(null);
                }
            }
        });
    }

    public static void getSdkIdentities(final com.adobe.marketing.mobile.AdobeCallback<java.lang.String> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "Failed to get SDK identities - callback is null", new java.lang.Object[0]);
        } else {
            dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.GET_SDK_IDENTITIES, com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.REQUEST_IDENTITY).build(), 5000L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.MobileCore.2
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public /* synthetic */ void call(java.lang.Object obj) {
                    com.adobe.marketing.mobile.AdobeCallback.this.call(com.adobe.marketing.mobile.util.DataReader.optString(((com.adobe.marketing.mobile.Event) obj).getEventData(), "config.allIdentifiers", "{}"));
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    com.adobe.marketing.mobile.AdobeCallback adobeCallback2 = com.adobe.marketing.mobile.AdobeCallback.this;
                    if (adobeCallback2 instanceof com.adobe.marketing.mobile.AdobeCallbackWithError) {
                        ((com.adobe.marketing.mobile.AdobeCallbackWithError) adobeCallback2).fail(com.adobe.marketing.mobile.AdobeError.CALLBACK_TIMEOUT);
                    } else {
                        adobeCallback2.call("{}");
                    }
                }
            });
        }
    }

    public static void resetIdentities() {
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.RESET_IDENTITIES_REQUEST, com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_RESET).build());
    }

    public static void lifecycleStart(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
        hashMap.put(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.ADDITIONAL_CONTEXT_DATA, map);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.LIFECYCLE_RESUME, com.adobe.marketing.mobile.EventType.GENERIC_LIFECYCLE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void lifecyclePause() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_PAUSE);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.LIFECYCLE_PAUSE, com.adobe.marketing.mobile.EventType.GENERIC_LIFECYCLE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void trackAction(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("action", str);
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        hashMap.put("contextdata", map);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.ANALYTICS_TRACK, com.adobe.marketing.mobile.EventType.GENERIC_TRACK, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public static void trackState(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("state", str);
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        hashMap.put("contextdata", map);
        dispatchEvent(new com.adobe.marketing.mobile.Event.Builder(com.adobe.marketing.mobile.internal.CoreConstants.EventNames.ANALYTICS_TRACK, com.adobe.marketing.mobile.EventType.GENERIC_TRACK, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }
}
