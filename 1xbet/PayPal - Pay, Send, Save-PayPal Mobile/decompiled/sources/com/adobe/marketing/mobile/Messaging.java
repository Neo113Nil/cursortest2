package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public final class Messaging {
    public static final java.lang.Class<? extends com.adobe.marketing.mobile.Extension> EXTENSION = com.adobe.marketing.mobile.messaging.MessagingExtension.class;
    private static boolean getHighSpeedVideoFpsRangesFor = false;

    private Messaging() {
    }

    public static java.lang.String extensionVersion() {
        return "3.7.0";
    }

    public static boolean addPushTrackingDetails(android.content.Intent intent, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (intent == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Failed to add push tracking details as intent is null.", new java.lang.Object[0]);
            return false;
        }
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Failed to add push tracking details as MessageId is null.", new java.lang.Object[0]);
            return false;
        }
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map)) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Failed to add push tracking details as data is null or empty.", new java.lang.Object[0]);
            return false;
        }
        intent.putExtra("messageId", str);
        java.lang.String str2 = map.get("_xdm");
        if (str2 == null || str2.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "XDM data is not added as push tracking details to the intent, XDM data is null or empty", new java.lang.Object[0]);
            return true;
        }
        intent.putExtra("adobe_xdm", str2);
        return true;
    }

    public static void handleNotificationResponse(android.content.Intent intent, boolean z, java.lang.String str) {
        handleNotificationResponse(intent, z, str, null);
    }

    public static void handleNotificationResponse(android.content.Intent intent, boolean z, java.lang.String str, final com.adobe.marketing.mobile.AdobeCallback<com.adobe.marketing.mobile.messaging.PushTrackingStatus> adobeCallback) {
        if (intent == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Failed to track notification interactions, intent provided is null", new java.lang.Object[0]);
            com.adobe.marketing.mobile.messaging.PushTrackingStatus pushTrackingStatus = com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_INTENT;
            if (adobeCallback != null) {
                adobeCallback.call(pushTrackingStatus);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("messageId");
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(stringExtra)) {
            stringExtra = intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(stringExtra)) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Failed to track notification interactions, message id provided is null", new java.lang.Object[0]);
                com.adobe.marketing.mobile.messaging.PushTrackingStatus pushTrackingStatus2 = com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_MESSAGE_ID;
                if (adobeCallback != null) {
                    adobeCallback.call(pushTrackingStatus2);
                    return;
                }
                return;
            }
        }
        java.lang.String stringExtra2 = intent.getStringExtra("adobe_xdm");
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(stringExtra2)) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "No tracking data found in the intent, Ignoring to track AJO notification interactions.", new java.lang.Object[0]);
            com.adobe.marketing.mobile.messaging.PushTrackingStatus pushTrackingStatus3 = com.adobe.marketing.mobile.messaging.PushTrackingStatus.NO_TRACKING_DATA;
            if (adobeCallback != null) {
                adobeCallback.call(pushTrackingStatus3);
                return;
            }
            return;
        }
        java.lang.String stringExtra3 = intent.getStringExtra(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.INAPP_MESSAGE_ID);
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(stringExtra3)) {
            com.adobe.marketing.mobile.Messaging.ExecutorHolder.getHighResolutionOutputSizeshNQ4ISI.submit(new com.adobe.marketing.mobile.Messaging.AnonymousClass1(stringExtra3));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("messageId", stringExtra);
        hashMap.put("applicationOpened", java.lang.Boolean.valueOf(z));
        hashMap.put("adobe_xdm", stringExtra2);
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            hashMap.put("eventType", "pushTracking.applicationOpened");
        } else {
            hashMap.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, str);
            hashMap.put("eventType", "pushTracking.customAction");
        }
        com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder("Push notification interaction event", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build(), 5000L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.Messaging.2
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public /* synthetic */ void call(java.lang.Object obj) {
                java.util.Map<java.lang.String, java.lang.Object> eventData = ((com.adobe.marketing.mobile.Event) obj).getEventData();
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(eventData)) {
                    com.adobe.marketing.mobile.Messaging.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, com.adobe.marketing.mobile.AdobeCallback.this);
                    return;
                }
                try {
                    com.adobe.marketing.mobile.Messaging.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.PushTrackingStatus.fromInt(com.adobe.marketing.mobile.util.DataReader.getInt(eventData, "pushTrackingStatus")), com.adobe.marketing.mobile.AdobeCallback.this);
                } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
                    com.adobe.marketing.mobile.Messaging.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, com.adobe.marketing.mobile.AdobeCallback.this);
                }
            }

            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                com.adobe.marketing.mobile.Messaging.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, com.adobe.marketing.mobile.AdobeCallback.this);
            }
        });
    }

    /* renamed from: com.adobe.marketing.mobile.Messaging$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;

        AnonymousClass1(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Found an in-app message to show based on user interaction with a push notification. Downloading updated message definitions to ensure availability of the desired in-app message.", new java.lang.Object[0]);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new com.adobe.marketing.mobile.messaging.Surface());
            final java.lang.String str = this.getHighSpeedVideoFpsRanges;
            com.adobe.marketing.mobile.Messaging.updatePropositionsForSurfaces(arrayList, new com.adobe.marketing.mobile.AdobeCallback() { // from class: com.adobe.marketing.mobile.Messaging$1$$ExternalSyntheticLambda0
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(java.lang.Object obj) {
                    com.adobe.marketing.mobile.Messaging.AnonymousClass1.getHighSpeedVideoFpsRanges(str, (java.lang.Boolean) obj);
                }
            });
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.Boolean bool) {
            if (!bool.booleanValue()) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Failed to download updated in-app message definitions. Attempting to show the in-app message anyway.", new java.lang.Object[0]);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.INAPP_MESSAGE_ID, str);
            com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Push to in-app", com.adobe.marketing.mobile.EventType.RULES_ENGINE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
        }
    }

    public static void refreshInAppMessages() {
        com.adobe.marketing.mobile.messaging.IamRefreshHandler.INSTANCE.refreshInAppMessages(null);
    }

    public static void getPropositionsForSurfaces(java.util.List<com.adobe.marketing.mobile.messaging.Surface> list, final com.adobe.marketing.mobile.AdobeCallback<java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Cannot get propositions as the provided callback is null.", new java.lang.Object[0]);
            return;
        }
        if (list == null || list.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Cannot get propositions as the provided list of surfaces is null or empty.", new java.lang.Object[0]);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.adobe.marketing.mobile.messaging.Surface surface : list) {
            if (surface.isValid()) {
                arrayList.add(surface.toEventData());
            }
        }
        if (arrayList.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Cannot get propositions as the provided list of surfaces has no valid items.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("getpropositions", java.lang.Boolean.TRUE);
        hashMap.put("surfaces", arrayList);
        com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder("Get propositions", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build(), 10000L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.Messaging.3
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public /* synthetic */ void call(java.lang.Object obj) {
                try {
                    java.util.Map<java.lang.String, java.lang.Object> eventData = ((com.adobe.marketing.mobile.Event) obj).getEventData();
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(eventData)) {
                        com.adobe.marketing.mobile.Messaging.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                        return;
                    }
                    if (eventData.containsKey("responseerror")) {
                        com.adobe.marketing.mobile.Messaging.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.Messaging.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.util.DataReader.getInt(eventData, "responseerror")));
                        return;
                    }
                    java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> hashMap2 = new java.util.HashMap<>();
                    java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, eventData, "propositions", java.util.Collections.emptyList());
                    if (optTypedListOfMap != null && !optTypedListOfMap.isEmpty()) {
                        java.util.Iterator it = optTypedListOfMap.iterator();
                        while (it.hasNext()) {
                            com.adobe.marketing.mobile.messaging.Proposition fromEventData = com.adobe.marketing.mobile.messaging.Proposition.fromEventData((java.util.Map) it.next());
                            if (fromEventData != null) {
                                hashMap2 = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.MessagingUtils.scopeToSurface(fromEventData.getScope()), fromEventData, hashMap2);
                            }
                        }
                        com.adobe.marketing.mobile.AdobeCallback.this.call(hashMap2);
                        return;
                    }
                    com.adobe.marketing.mobile.Messaging.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
                    com.adobe.marketing.mobile.Messaging.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                }
            }

            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                com.adobe.marketing.mobile.Messaging.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.AdobeCallback.this, adobeError);
            }
        });
    }

    public static void updatePropositionsForSurfaces(java.util.List<com.adobe.marketing.mobile.messaging.Surface> list) {
        updatePropositionsForSurfaces(list, null);
    }

    public static void updatePropositionsForSurfaces(java.util.List<com.adobe.marketing.mobile.messaging.Surface> list, com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean> adobeCallback) {
        if (list == null || list.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Cannot update propositions as the provided list of surfaces is empty", new java.lang.Object[0]);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.adobe.marketing.mobile.messaging.Surface surface : list) {
            if (surface.isValid()) {
                arrayList.add(surface.toEventData());
            }
        }
        if (arrayList.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Cannot update propositions as the provided list of surfaces has no valid items.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("updatepropositions", java.lang.Boolean.TRUE);
        hashMap.put("surfaces", arrayList);
        com.adobe.marketing.mobile.Event build = new com.adobe.marketing.mobile.Event.Builder("Update propositions", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build();
        if (adobeCallback != null) {
            com.adobe.marketing.mobile.messaging.MessagingExtension.addCompletionHandler(new com.adobe.marketing.mobile.messaging.CompletionHandler(build.getUniqueIdentifier(), adobeCallback));
        }
        com.adobe.marketing.mobile.MobileCore.dispatchEvent(build);
    }

    static class ExecutorHolder {
        static final java.util.concurrent.ExecutorService getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.Executors.newSingleThreadExecutor();

        private ExecutorHolder() {
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.PushTrackingStatus pushTrackingStatus, com.adobe.marketing.mobile.AdobeCallback adobeCallback) {
        if (adobeCallback != null) {
            adobeCallback.call(pushTrackingStatus);
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(com.adobe.marketing.mobile.AdobeCallback adobeCallback, com.adobe.marketing.mobile.AdobeError adobeError) {
        com.adobe.marketing.mobile.AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof com.adobe.marketing.mobile.AdobeCallbackWithError ? (com.adobe.marketing.mobile.AdobeCallbackWithError) adobeCallback : null;
        if (adobeCallbackWithError != null) {
            adobeCallbackWithError.fail(adobeError);
        }
    }

    static /* synthetic */ com.adobe.marketing.mobile.AdobeError Camera2StreamConfigurationMap(int i) {
        if (i != 0) {
            if (i == 1) {
                return com.adobe.marketing.mobile.AdobeError.CALLBACK_TIMEOUT;
            }
            if (i == 2) {
                return com.adobe.marketing.mobile.AdobeError.CALLBACK_NULL;
            }
            if (i == 11) {
                return com.adobe.marketing.mobile.AdobeError.EXTENSION_NOT_INITIALIZED;
            }
        }
        return com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR;
    }
}
