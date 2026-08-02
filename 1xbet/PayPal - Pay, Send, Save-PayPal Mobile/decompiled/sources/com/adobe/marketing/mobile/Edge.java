package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public class Edge {
    public static final java.lang.Class<? extends com.adobe.marketing.mobile.Extension> EXTENSION = com.adobe.marketing.mobile.EdgeExtension.class;

    private Edge() {
    }

    public static java.lang.String extensionVersion() {
        return "3.0.2";
    }

    public static void sendEvent(com.adobe.marketing.mobile.ExperienceEvent experienceEvent, com.adobe.marketing.mobile.EdgeCallback edgeCallback) {
        if (experienceEvent == null) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "Edge", "sendEvent API cannot make the request, the ExperienceEvent should not be null.", new java.lang.Object[0]);
            return;
        }
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(experienceEvent.getXdmSchema())) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "Edge", "sendEvent API cannot make the request with null/empty XDM data.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, experienceEvent.Camera2StreamConfigurationMap);
        java.util.Map<java.lang.String, java.lang.Object> map = experienceEvent.getHighSpeedVideoFpsRangesFor;
        if (map != null) {
            com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, "xdm", map);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(experienceEvent.getHighSpeedVideoSizes)) {
            hashMap2.put("datastreamIdOverride", experienceEvent.getHighSpeedVideoSizes);
        }
        java.util.Map<java.lang.String, java.lang.Object> map2 = experienceEvent.getHighSpeedVideoFpsRanges;
        if (map2 != null) {
            hashMap2.put("datastreamConfigOverride", map2);
        }
        if (!hashMap2.isEmpty()) {
            hashMap.put("config", hashMap2);
        }
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(experienceEvent.getHighResolutionOutputSizeshNQ4ISI)) {
            hashMap.put("datasetId", experienceEvent.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap)) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "Edge", "sendEvent API cannot make the request with null/empty event data.", new java.lang.Object[0]);
            return;
        }
        com.adobe.marketing.mobile.Event build = new com.adobe.marketing.mobile.Event.Builder("AEP Request Event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build();
        com.adobe.marketing.mobile.CompletionCallbacksManager Camera2StreamConfigurationMap = com.adobe.marketing.mobile.CompletionCallbacksManager.Camera2StreamConfigurationMap();
        java.lang.String uniqueIdentifier = build.getUniqueIdentifier();
        if (edgeCallback != null) {
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(uniqueIdentifier)) {
                com.adobe.marketing.mobile.services.Log.warning("Edge", "CompletionCallbacksManager", "Failed to register response callback because of null/empty event id.", new java.lang.Object[0]);
            } else {
                com.adobe.marketing.mobile.services.Log.trace("Edge", "CompletionCallbacksManager", "Registering callback for Edge response with unique id ".concat(java.lang.String.valueOf(uniqueIdentifier)), new java.lang.Object[0]);
                Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.put(uniqueIdentifier, edgeCallback);
            }
        }
        com.adobe.marketing.mobile.MobileCore.dispatchEvent(build);
    }

    public static void getLocationHint(final com.adobe.marketing.mobile.AdobeCallback<java.lang.String> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "Edge", "Unexpected null callback, provide a callback to receive current location hint.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder("Edge Request Location Hint", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_IDENTITY).setEventData(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.adobe.marketing.mobile.Edge.1
                {
                    put("locationHint", java.lang.Boolean.TRUE);
                }
            }).build(), 5000L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.Edge.2
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public /* synthetic */ void call(java.lang.Object obj) {
                    com.adobe.marketing.mobile.Event event = (com.adobe.marketing.mobile.Event) obj;
                    if (event == null) {
                        com.adobe.marketing.mobile.Edge.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.CALLBACK_TIMEOUT);
                        return;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                    if (eventData == null || !eventData.containsKey("locationHint")) {
                        com.adobe.marketing.mobile.Edge.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                        return;
                    }
                    try {
                        com.adobe.marketing.mobile.AdobeCallback.this.call(com.adobe.marketing.mobile.util.DataReader.getString(eventData, "locationHint"));
                    } catch (com.adobe.marketing.mobile.util.DataReaderException e) {
                        com.adobe.marketing.mobile.Edge.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                        com.adobe.marketing.mobile.services.Log.warning("Edge", "Edge", "Failed to parse getLocationHint value to String. %s", e.getLocalizedMessage());
                    }
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    if (adobeError == null) {
                        adobeError = com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR;
                    }
                    com.adobe.marketing.mobile.Edge.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, adobeError);
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "Edge", "Failed to dispatch %s event: %s.", "Edge Request Location Hint", adobeError.getErrorName());
                }
            });
        }
    }

    public static void setLocationHint(java.lang.String str) {
        com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Edge Update Location Hint", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.UPDATE_IDENTITY).setEventData(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.adobe.marketing.mobile.Edge.3
            final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = str;
                put("locationHint", str);
            }
        }).build());
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback adobeCallback, com.adobe.marketing.mobile.AdobeError adobeError) {
        com.adobe.marketing.mobile.AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof com.adobe.marketing.mobile.AdobeCallbackWithError ? (com.adobe.marketing.mobile.AdobeCallbackWithError) adobeCallback : null;
        if (adobeCallbackWithError != null) {
            adobeCallbackWithError.fail(adobeError);
        }
    }
}
