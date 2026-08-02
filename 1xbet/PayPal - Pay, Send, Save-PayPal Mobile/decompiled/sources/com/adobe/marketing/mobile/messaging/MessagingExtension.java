package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public final class MessagingExtension extends com.adobe.marketing.mobile.Extension {
    static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    static java.util.List<com.adobe.marketing.mobile.messaging.CompletionHandler> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    final com.adobe.marketing.mobile.messaging.ContentCardRulesEngine Camera2StreamConfigurationMap;
    final com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler getHighSpeedVideoFpsRanges;
    final com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    com.adobe.marketing.mobile.util.SerialWorkDispatcher<com.adobe.marketing.mobile.Event> getInputSizeshNQ4ISI;

    @Override // com.adobe.marketing.mobile.Extension
    public final void onUnregistered() {
    }

    MessagingExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        this(extensionApi, null, null, null);
    }

    MessagingExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine launchRulesEngine, com.adobe.marketing.mobile.messaging.ContentCardRulesEngine contentCardRulesEngine, com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler) {
        super(extensionApi);
        this.getHighSpeedVideoSizesFor = false;
        launchRulesEngine = launchRulesEngine == null ? new com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine("com.adobe.messaging.rulesengine", extensionApi) : launchRulesEngine;
        this.getHighSpeedVideoSizes = launchRulesEngine;
        launchRulesEngine.setRuleReevaluationInterceptor(new com.adobe.marketing.mobile.messaging.MessagingRuleEngineInterceptor());
        contentCardRulesEngine = contentCardRulesEngine == null ? new com.adobe.marketing.mobile.messaging.ContentCardRulesEngine("com.adobe.messagingContentCard.rulesengine", extensionApi) : contentCardRulesEngine;
        this.Camera2StreamConfigurationMap = contentCardRulesEngine;
        this.getHighSpeedVideoFpsRanges = edgePersonalizationResponseHandler == null ? new com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler(this, extensionApi, launchRulesEngine, contentCardRulesEngine) : edgePersonalizationResponseHandler;
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final java.lang.String getName() {
        return "com.adobe.messaging";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final java.lang.String getFriendlyName() {
        return com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG;
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final java.lang.String getVersion() {
        return com.adobe.marketing.mobile.Messaging.extensionVersion();
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final void onRegistered() {
        super.onRegistered();
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:217:0x066c  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x068f  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x0832  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x0845  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x084e  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x06aa  */
            /* JADX WARN: Removed duplicated region for block: B:353:0x063d A[Catch: IOException -> 0x0639, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:355:0x0642 A[Catch: IOException -> 0x0639, TRY_LEAVE, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:360:0x0635 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:377:0x0808 A[Catch: IOException -> 0x0804, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:379:0x080d A[Catch: IOException -> 0x0804, TRY_LEAVE, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:386:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:387:0x0800 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v11 */
            /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.HashMap, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v19, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v63 */
            /* JADX WARN: Type inference failed for: r4v64 */
            /* JADX WARN: Type inference failed for: r4v66 */
            /* JADX WARN: Type inference failed for: r4v67 */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.io.ObjectOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v41 */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void hear(com.adobe.marketing.mobile.Event event) {
                java.lang.String str;
                java.lang.String str2;
                java.util.List<com.adobe.marketing.mobile.messaging.Surface> list;
                com.adobe.marketing.mobile.messaging.CompletionHandler highSpeedVideoSizes;
                java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor;
                java.lang.Object obj;
                java.lang.String str3;
                java.lang.String str4;
                boolean z;
                java.io.OutputStream outputStream;
                java.io.InputStream inputStream;
                java.lang.Throwable th;
                java.lang.Object obj2;
                ?? r4;
                com.adobe.marketing.mobile.services.caching.CacheExpiry never;
                java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> map;
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if ((event == null || event.getEventData() == null) && (event == null || !event.getSource().equals(com.adobe.marketing.mobile.EventSource.REQUEST_RESET))) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Invalid event, ignoring.", new java.lang.Object[0]);
                    return;
                }
                java.util.HashMap hashMap = null;
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputFormats(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing manual request to refresh In-App Message definitions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputSizes(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to retrieve propositions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(event));
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputMinFrameDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to get cached proposition content.", new java.lang.Object[0]);
                    messagingExtension.getInputSizeshNQ4ISI.offer(event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to track propositions.", new java.lang.Object[0]);
                    java.util.Map<java.lang.String, java.lang.Object> optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "propositioninteraction", new java.util.HashMap());
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Cannot track proposition item, proposition interaction XDM is not available.", new java.lang.Object[0]);
                        return;
                    } else {
                        messagingExtension.sendPropositionInteraction(optTypedMap);
                        return;
                    }
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(event)) {
                    java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "pushidentifier", null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, token is null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult sharedState = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(sharedState == null ? null : sharedState.getValue(), optString, event.getTimestamp())) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Skipping the push token sync and shared state update.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult xDMSharedState = messagingExtension.getApi().getXDMSharedState("com.adobe.edge.identity", event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(xDMSharedState == null ? null : xDMSharedState.getValue());
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor2)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to sync the push token. ECID is unavailable for the user.", new java.lang.Object[0]);
                        return;
                    }
                    if (highSpeedVideoFpsRangesFor2 == null) {
                        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, ECID is null.", new java.lang.Object[0]);
                    } else {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("code", "ECID");
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("namespace", hashMap2);
                        hashMap3.put("id", highSpeedVideoFpsRangesFor2);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        hashMap4.put("identity", hashMap3);
                        hashMap4.put("appID", com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName());
                        hashMap4.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, optString);
                        hashMap4.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                        hashMap4.put("denylisted", java.lang.Boolean.FALSE);
                        arrayList.add(hashMap4);
                        java.util.HashMap hashMap5 = new java.util.HashMap();
                        hashMap5.put("pushNotificationDetails", arrayList);
                        java.util.HashMap hashMap6 = new java.util.HashMap();
                        hashMap6.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap5);
                        hashMap = hashMap6;
                    }
                    if (hashMap != null) {
                        java.util.HashMap hashMap7 = new java.util.HashMap();
                        hashMap7.put("pushidentifier", optString);
                        messagingExtension.getApi().createSharedState(hashMap7, event);
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push notification profile edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap, messagingExtension.getApi(), event);
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputSizeshNQ4ISI(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Clearing the push token from persistence and the Messaging shared state.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRangesFor(null, event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor((java.lang.String) null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizesFor(event)) {
                    com.adobe.marketing.mobile.SharedStateResult sharedState2 = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 == null ? null : sharedState2.getValue(), "messaging.eventDataset", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.NO_DATASET_CONFIGURED, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, experience event dataset id is empty. Check the messaging launch extension to add the experience event dataset.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                    if (eventData == null) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventData is null.", new java.lang.Object[0]);
                        return;
                    }
                    java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "eventType", "");
                    java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "messageId", "");
                    boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(eventData, "applicationOpened", false);
                    java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventType is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString4)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_MESSAGE_ID, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, messageId is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.HashMap hashMap8 = new java.util.HashMap();
                    java.util.HashMap hashMap9 = new java.util.HashMap();
                    hashMap9.put("datasetId", optString2);
                    hashMap8.put("collect", hashMap9);
                    java.util.HashMap hashMap10 = new java.util.HashMap();
                    java.util.HashMap hashMap11 = new java.util.HashMap();
                    java.util.HashMap hashMap12 = new java.util.HashMap();
                    if (optString5 != null) {
                        hashMap12.put("actionID", optString5);
                        hashMap11.put("customAction", hashMap12);
                    }
                    hashMap11.put("pushProvider", com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                    hashMap11.put("pushProviderMessageID", optString4);
                    hashMap10.put("eventType", optString3);
                    hashMap10.put("pushNotificationTracking", hashMap11);
                    java.util.HashMap hashMap13 = new java.util.HashMap();
                    java.util.HashMap hashMap14 = new java.util.HashMap();
                    hashMap14.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Integer.valueOf(optBoolean ? 1 : 0));
                    hashMap13.put("launches", hashMap14);
                    hashMap10.put("application", hashMap13);
                    java.lang.String optString6 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "adobe_xdm", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString6)) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data is null.", new java.lang.Object[0]);
                    } else {
                        try {
                            java.util.Map<java.lang.String, java.lang.Object> map2 = com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(optString6));
                            if (map2 == null) {
                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data conversion to map failed.", new java.lang.Object[0]);
                            } else {
                                java.util.Map map3 = (map2.containsKey("cjm") && (map2.get("cjm") instanceof java.util.Map)) ? (java.util.Map) map2.get("cjm") : null;
                                if (map2.containsKey("mixins") && (map2.get("mixins") instanceof java.util.Map)) {
                                    map3 = (java.util.Map) map2.get("mixins");
                                }
                                if (map3 == null) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send cjm xdm data with the tracking, Missing XDM data.", new java.lang.Object[0]);
                                } else {
                                    hashMap10.putAll(map3);
                                    if (map3.containsKey("_experience") && (map3.get("_experience") instanceof java.util.Map)) {
                                        java.util.Map map4 = (java.util.Map) map3.get("_experience");
                                        if (map4.containsKey("customerJourneyManagement") && (map4.get("customerJourneyManagement") instanceof java.util.Map)) {
                                            java.util.Map map5 = (java.util.Map) map4.get("customerJourneyManagement");
                                            map5.putAll(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject("{\n   \"messageProfile\":{\n      \"channel\":{\n         \"_id\":\"https://ns.adobe.com/xdm/channels/push\"\n      }\n   },\n   \"pushChannelContext\":{\n      \"platform\":\"fcm\"\n   }\n}")));
                                            map4.put("customerJourneyManagement", map5);
                                            hashMap10.put("_experience", map4);
                                        }
                                    } else {
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send CJM XDM data with the tracking, required keys are missing.", new java.lang.Object[0]);
                                    }
                                }
                            }
                        } catch (java.lang.ClassCastException | org.json.JSONException e) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe data is malformed : %s", e.getMessage());
                        }
                    }
                    try {
                        if (hashMap10.containsKey("_experience")) {
                            java.lang.Object obj3 = hashMap10.get("_experience");
                            if (obj3 instanceof java.util.Map) {
                                java.util.Map map6 = (java.util.Map) obj3;
                                if (map6.containsKey("decisioning")) {
                                    java.lang.Object obj4 = map6.get("decisioning");
                                    if (obj4 instanceof java.util.Map) {
                                        java.util.Map map7 = (java.util.Map) obj4;
                                        if (map7.containsKey("exdRequestID")) {
                                            java.util.HashMap hashMap15 = new java.util.HashMap();
                                            if (!optBoolean) {
                                                hashMap15.put("dismiss", 1);
                                            } else if (optString5 != null) {
                                                hashMap15.put("interact", 1);
                                            } else {
                                                hashMap15.put("interact", 1);
                                            }
                                            map7.put("propositionEventType", hashMap15);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (java.lang.ClassCastException e2) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to add propositionEventType, error: %s", e2.getMessage());
                    }
                    java.util.HashMap hashMap16 = new java.util.HashMap();
                    hashMap16.put("xdm", hashMap10);
                    hashMap16.put(com.adjust.sdk.Constants.REFERRER_API_META, hashMap8);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.TRACKING_INITIATED, messagingExtension.getApi(), event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push tracking edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap16, messagingExtension.getApi(), event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges(event);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRanges)) {
                        return;
                    }
                    if (edgePersonalizationResponseHandler.getOutputSizeshNQ4ISI.containsKey(highSpeedVideoFpsRanges) || "TESTING_ID".equals(highSpeedVideoFpsRanges)) {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Processing propositions from personalization:decisions network response for event %s.", highSpeedVideoFpsRanges);
                        java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "payload", null);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        java.util.List<com.adobe.marketing.mobile.messaging.Proposition> highSpeedVideoSizes2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) optTypedListOfMap);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        for (com.adobe.marketing.mobile.messaging.Proposition proposition : highSpeedVideoSizes2) {
                            edgePersonalizationResponseHandler.getOutputFormats = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(proposition.getScope()), proposition, edgePersonalizationResponseHandler.getOutputFormats);
                        }
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputFormats(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler2 = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list2 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI) || com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list2)) {
                        return;
                    }
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "End of streaming response events for requesting event %s", highResolutionOutputSizeshNQ4ISI);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list3 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list3)) {
                        str = "EdgePersonalizationResponseHandler";
                        str2 = highResolutionOutputSizeshNQ4ISI;
                        list = list2;
                    } else {
                        com.adobe.marketing.mobile.messaging.ParsedPropositions parsedPropositions = new com.adobe.marketing.mobile.messaging.ParsedPropositions(edgePersonalizationResponseHandler2.getOutputFormats, list3, edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI);
                        java.util.Set<com.adobe.marketing.mobile.messaging.Surface> keySet = edgePersonalizationResponseHandler2.getOutputFormats.keySet();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list3);
                        arrayList2.removeAll(keySet);
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map8 = parsedPropositions.getHighSpeedVideoFpsRanges;
                        java.util.HashMap hashMap17 = new java.util.HashMap(edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor);
                        hashMap17.putAll(map8);
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            hashMap17.remove((com.adobe.marketing.mobile.messaging.Surface) it.next());
                        }
                        edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor = hashMap17;
                        edgePersonalizationResponseHandler2.getOutputStallDuration.putAll(parsedPropositions.Camera2StreamConfigurationMap);
                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList2)) {
                            for (java.util.Map.Entry entry : new java.util.HashMap(edgePersonalizationResponseHandler2.getOutputStallDuration).entrySet()) {
                                if (arrayList2.contains(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(((com.adobe.marketing.mobile.messaging.PropositionInfo) entry.getValue()).getHighSpeedVideoSizes))) {
                                    edgePersonalizationResponseHandler2.getOutputStallDuration.remove(entry.getKey());
                                }
                            }
                        }
                        com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map9 = parsedPropositions.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor3 = messagingCacheUtilities.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor3 == null) {
                            highSpeedVideoFpsRangesFor3 = new java.util.HashMap<>();
                        }
                        highSpeedVideoFpsRangesFor3.putAll(map9);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it2 = highSpeedVideoFpsRangesFor3.entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> next = it2.next();
                            java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it3 = it2;
                            if (arrayList2.contains(next.getKey())) {
                                arrayList3.add(next.getKey());
                            }
                            it2 = it3;
                        }
                        java.util.Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            highSpeedVideoFpsRangesFor3.remove((com.adobe.marketing.mobile.messaging.Surface) it4.next());
                        }
                        ?? hashMap18 = new java.util.HashMap(highSpeedVideoFpsRangesFor3);
                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap18)) {
                            messagingCacheUtilities.getHighSpeedVideoSizes.remove("messaging", "propositions");
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "In-app messaging cache has been deleted.", new java.lang.Object[0]);
                            str3 = "EdgePersonalizationResponseHandler";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            list = list2;
                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        } else {
                            list = list2;
                            ?? r5 = "Creating new cached propositions";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            ?? r42 = new java.lang.Object[0];
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Creating new cached propositions", r42);
                            try {
                                try {
                                    r42 = new java.io.ByteArrayOutputStream();
                                } catch (java.lang.Throwable th2) {
                                    java.io.InputStream inputStream2 = hashMap18;
                                    outputStream = r5;
                                    inputStream = inputStream2;
                                    th = th2;
                                    r4 = r42;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException e3) {
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e3);
                                            throw th;
                                        }
                                    }
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    if (inputStream == null) {
                                        throw th;
                                    }
                                    inputStream.close();
                                    throw th;
                                }
                                try {
                                    r5 = new java.io.ObjectOutputStream(r42);
                                    try {
                                        r5.writeObject(hashMap18);
                                        r5.flush();
                                        hashMap18 = new java.io.ByteArrayInputStream(r42.toByteArray());
                                        try {
                                            str3 = "EdgePersonalizationResponseHandler";
                                        } catch (java.io.IOException e4) {
                                            e = e4;
                                            str3 = "EdgePersonalizationResponseHandler";
                                        }
                                        try {
                                            never = com.adobe.marketing.mobile.services.caching.CacheExpiry.never();
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        } catch (java.io.IOException e5) {
                                            e = e5;
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (java.io.IOException e6) {
                                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e6);
                                                }
                                            }
                                            if (r42 != 0) {
                                                r42.close();
                                            }
                                            if (hashMap18 != 0) {
                                                hashMap18.close();
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList4 = new java.util.ArrayList(Camera2StreamConfigurationMap);
                                            arrayList4.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4);
                                            java.lang.String str5 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                        try {
                                            messagingCacheUtilities.getHighSpeedVideoSizes.set("messaging", "propositions", new com.adobe.marketing.mobile.services.caching.CacheEntry(hashMap18, never, null));
                                            try {
                                                r5.close();
                                                r42.close();
                                                hashMap18.close();
                                            } catch (java.io.IOException e7) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e7);
                                            }
                                        } catch (java.io.IOException e8) {
                                            e = e8;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                            }
                                            if (r42 != 0) {
                                            }
                                            if (hashMap18 != 0) {
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList42 = new java.util.ArrayList(Camera2StreamConfigurationMap2);
                                            arrayList42.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42);
                                            java.lang.String str52 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                    } catch (java.io.IOException e9) {
                                        e = e9;
                                        str3 = "EdgePersonalizationResponseHandler";
                                        str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        r42 = r42;
                                        r5 = r5;
                                        hashMap18 = 0;
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                        if (r5 != 0) {
                                        }
                                        if (r42 != 0) {
                                        }
                                        if (hashMap18 != 0) {
                                        }
                                        map = parsedPropositions.getHighSpeedVideoSizes;
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                        }
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                        }
                                        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                        }
                                        str = str3;
                                        java.util.ArrayList arrayList422 = new java.util.ArrayList(Camera2StreamConfigurationMap22);
                                        arrayList422.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                        edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422);
                                        java.lang.String str522 = str2;
                                        edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522);
                                        edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                        com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                        highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522);
                                        if (highSpeedVideoSizes != null) {
                                        }
                                        highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                        }
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                        edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        outputStream = r5;
                                        obj2 = r42;
                                        inputStream = null;
                                        r4 = obj2;
                                        if (outputStream != null) {
                                        }
                                        if (r4 != 0) {
                                        }
                                        if (inputStream == null) {
                                        }
                                    }
                                } catch (java.io.IOException e10) {
                                    e = e10;
                                    str3 = "EdgePersonalizationResponseHandler";
                                    str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    z = r42;
                                    r5 = 0;
                                    r42 = z;
                                    hashMap18 = 0;
                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                    if (r5 != 0) {
                                    }
                                    if (r42 != 0) {
                                    }
                                    if (hashMap18 != 0) {
                                    }
                                    map = parsedPropositions.getHighSpeedVideoSizes;
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                    }
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                    }
                                    java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                    }
                                    str = str3;
                                    java.util.ArrayList arrayList4222 = new java.util.ArrayList(Camera2StreamConfigurationMap222);
                                    arrayList4222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                    edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222);
                                    java.lang.String str5222 = str2;
                                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222);
                                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222);
                                    if (highSpeedVideoSizes != null) {
                                    }
                                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                    }
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj = r42;
                                    th = th;
                                    obj2 = obj;
                                    outputStream = null;
                                    inputStream = null;
                                    r4 = obj2;
                                    if (outputStream != null) {
                                    }
                                    if (r4 != 0) {
                                    }
                                    if (inputStream == null) {
                                    }
                                }
                            } catch (java.io.IOException e11) {
                                e = e11;
                                str3 = "EdgePersonalizationResponseHandler";
                                str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                z = false;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj = null;
                            }
                        }
                        map = parsedPropositions.getHighSpeedVideoSizes;
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                            edgePersonalizationResponseHandler2.getHighSpeedVideoSizes.replaceRules(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap));
                            edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(new com.adobe.marketing.mobile.Event.Builder("Seed content cards", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).build());
                        }
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null || map.get(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION) != null) {
                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.util.Iterator<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> it5 = Camera2StreamConfigurationMap2222.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.addAll(it5.next().getConsequenceList());
                                }
                                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList();
                                try {
                                    java.util.Iterator it6 = arrayList5.iterator();
                                    while (it6.hasNext()) {
                                        java.util.Map<java.lang.String, java.lang.Object> detail = ((com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence) it6.next()).getDetail();
                                        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(detail)) {
                                            java.lang.String str6 = str4;
                                            java.util.List<java.lang.String> stringList = com.adobe.marketing.mobile.util.DataReader.getStringList(com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, detail, str6), "remoteAssets");
                                            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(stringList)) {
                                                for (java.lang.String str7 : stringList) {
                                                    if (com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str7) && !arrayList6.contains(str7)) {
                                                        str = str3;
                                                        try {
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Image asset to be cached (%s) ", str7);
                                                            arrayList6.add(str7);
                                                            str3 = str;
                                                        } catch (com.adobe.marketing.mobile.util.DataReaderException e12) {
                                                            e = e12;
                                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Failed to cache image asset, exception occurred %s", e.getLocalizedMessage());
                                                            java.util.ArrayList arrayList42222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222);
                                                            arrayList42222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222);
                                                            java.lang.String str52222 = str2;
                                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222);
                                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222);
                                                            if (highSpeedVideoSizes != null) {
                                                            }
                                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                                            }
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = str6;
                                        }
                                    }
                                    str = str3;
                                    com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities2 = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingCacheUtilities2.Camera2StreamConfigurationMap)) {
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the asset cache location is not available.", new java.lang.Object[0]);
                                    } else if (messagingCacheUtilities2.getHighSpeedVideoSizes == null) {
                                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the cache manager is not available.", new java.lang.Object[0]);
                                    } else {
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList6)) {
                                            for (java.lang.String str8 : arrayList6) {
                                                if (com.adobe.marketing.mobile.messaging.MessagingCacheUtilities.getHighSpeedVideoSizes(str8) && !arrayList7.contains(str8)) {
                                                    arrayList7.add(str8);
                                                    messagingCacheUtilities2.getHighSpeedVideoFpsRanges.put(str8, messagingCacheUtilities2.Camera2StreamConfigurationMap);
                                                }
                                            }
                                        }
                                        com.adobe.marketing.mobile.messaging.MessageAssetDownloader messageAssetDownloader = new com.adobe.marketing.mobile.messaging.MessageAssetDownloader(arrayList7);
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageAssetDownloader.getHighSpeedVideoSizes)) {
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Failed to download assets, the asset cache location is not available.", new java.lang.Object[0]);
                                        } else {
                                            java.util.List<java.lang.String> list4 = messageAssetDownloader.Camera2StreamConfigurationMap;
                                            if (list4 == null || list4.isEmpty()) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Empty list of assets provided, will not download any assets.", new java.lang.Object[0]);
                                            } else {
                                                java.io.File file = messageAssetDownloader.getHighSpeedVideoFpsRanges;
                                                if (file != null) {
                                                    messageAssetDownloader.Camera2StreamConfigurationMap(file, messageAssetDownloader.Camera2StreamConfigurationMap);
                                                }
                                                java.util.Iterator<java.lang.String> it7 = messageAssetDownloader.Camera2StreamConfigurationMap.iterator();
                                                while (it7.hasNext()) {
                                                    messageAssetDownloader.getHighResolutionOutputSizeshNQ4ISI(it7.next(), null);
                                                }
                                            }
                                        }
                                    }
                                } catch (com.adobe.marketing.mobile.util.DataReaderException e13) {
                                    e = e13;
                                    str = str3;
                                }
                                java.util.ArrayList arrayList422222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222);
                                arrayList422222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222);
                            }
                            str = str3;
                            java.util.ArrayList arrayList4222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222);
                            arrayList4222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222);
                        } else {
                            str = str3;
                        }
                    }
                    java.lang.String str522222 = str2;
                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222);
                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222);
                    if (highSpeedVideoSizes != null) {
                        highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.call(java.lang.Boolean.TRUE);
                    }
                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                        java.util.HashMap hashMap19 = new java.util.HashMap();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it8 = highSpeedVideoFpsRangesFor.entrySet().iterator();
                        while (it8.hasNext()) {
                            java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it9 = it8.next().getValue().iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(it9.next().toEventData());
                            }
                        }
                        hashMap19.put("propositions", arrayList8);
                        edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Message propositions notification", com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.notification").setEventData(hashMap19).build());
                    } else {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Not dispatching a notification event, personalization:decisions response does not contain propositions.", new java.lang.Object[0]);
                    }
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_RESET, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:217:0x066c  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x068f  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x0832  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x0845  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x084e  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x06aa  */
            /* JADX WARN: Removed duplicated region for block: B:353:0x063d A[Catch: IOException -> 0x0639, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:355:0x0642 A[Catch: IOException -> 0x0639, TRY_LEAVE, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:360:0x0635 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:377:0x0808 A[Catch: IOException -> 0x0804, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:379:0x080d A[Catch: IOException -> 0x0804, TRY_LEAVE, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:386:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:387:0x0800 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v11 */
            /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.HashMap, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v19, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v63 */
            /* JADX WARN: Type inference failed for: r4v64 */
            /* JADX WARN: Type inference failed for: r4v66 */
            /* JADX WARN: Type inference failed for: r4v67 */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.io.ObjectOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v41 */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void hear(com.adobe.marketing.mobile.Event event) {
                java.lang.String str;
                java.lang.String str2;
                java.util.List<com.adobe.marketing.mobile.messaging.Surface> list;
                com.adobe.marketing.mobile.messaging.CompletionHandler highSpeedVideoSizes;
                java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor;
                java.lang.Object obj;
                java.lang.String str3;
                java.lang.String str4;
                boolean z;
                java.io.OutputStream outputStream;
                java.io.InputStream inputStream;
                java.lang.Throwable th;
                java.lang.Object obj2;
                ?? r4;
                com.adobe.marketing.mobile.services.caching.CacheExpiry never;
                java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> map;
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if ((event == null || event.getEventData() == null) && (event == null || !event.getSource().equals(com.adobe.marketing.mobile.EventSource.REQUEST_RESET))) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Invalid event, ignoring.", new java.lang.Object[0]);
                    return;
                }
                java.util.HashMap hashMap = null;
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputFormats(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing manual request to refresh In-App Message definitions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputSizes(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to retrieve propositions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(event));
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputMinFrameDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to get cached proposition content.", new java.lang.Object[0]);
                    messagingExtension.getInputSizeshNQ4ISI.offer(event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to track propositions.", new java.lang.Object[0]);
                    java.util.Map<java.lang.String, java.lang.Object> optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "propositioninteraction", new java.util.HashMap());
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Cannot track proposition item, proposition interaction XDM is not available.", new java.lang.Object[0]);
                        return;
                    } else {
                        messagingExtension.sendPropositionInteraction(optTypedMap);
                        return;
                    }
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(event)) {
                    java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "pushidentifier", null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, token is null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult sharedState = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(sharedState == null ? null : sharedState.getValue(), optString, event.getTimestamp())) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Skipping the push token sync and shared state update.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult xDMSharedState = messagingExtension.getApi().getXDMSharedState("com.adobe.edge.identity", event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(xDMSharedState == null ? null : xDMSharedState.getValue());
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor2)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to sync the push token. ECID is unavailable for the user.", new java.lang.Object[0]);
                        return;
                    }
                    if (highSpeedVideoFpsRangesFor2 == null) {
                        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, ECID is null.", new java.lang.Object[0]);
                    } else {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("code", "ECID");
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("namespace", hashMap2);
                        hashMap3.put("id", highSpeedVideoFpsRangesFor2);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        hashMap4.put("identity", hashMap3);
                        hashMap4.put("appID", com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName());
                        hashMap4.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, optString);
                        hashMap4.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                        hashMap4.put("denylisted", java.lang.Boolean.FALSE);
                        arrayList.add(hashMap4);
                        java.util.HashMap hashMap5 = new java.util.HashMap();
                        hashMap5.put("pushNotificationDetails", arrayList);
                        java.util.HashMap hashMap6 = new java.util.HashMap();
                        hashMap6.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap5);
                        hashMap = hashMap6;
                    }
                    if (hashMap != null) {
                        java.util.HashMap hashMap7 = new java.util.HashMap();
                        hashMap7.put("pushidentifier", optString);
                        messagingExtension.getApi().createSharedState(hashMap7, event);
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push notification profile edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap, messagingExtension.getApi(), event);
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputSizeshNQ4ISI(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Clearing the push token from persistence and the Messaging shared state.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRangesFor(null, event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor((java.lang.String) null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizesFor(event)) {
                    com.adobe.marketing.mobile.SharedStateResult sharedState2 = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 == null ? null : sharedState2.getValue(), "messaging.eventDataset", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.NO_DATASET_CONFIGURED, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, experience event dataset id is empty. Check the messaging launch extension to add the experience event dataset.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                    if (eventData == null) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventData is null.", new java.lang.Object[0]);
                        return;
                    }
                    java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "eventType", "");
                    java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "messageId", "");
                    boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(eventData, "applicationOpened", false);
                    java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventType is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString4)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_MESSAGE_ID, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, messageId is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.HashMap hashMap8 = new java.util.HashMap();
                    java.util.HashMap hashMap9 = new java.util.HashMap();
                    hashMap9.put("datasetId", optString2);
                    hashMap8.put("collect", hashMap9);
                    java.util.HashMap hashMap10 = new java.util.HashMap();
                    java.util.HashMap hashMap11 = new java.util.HashMap();
                    java.util.HashMap hashMap12 = new java.util.HashMap();
                    if (optString5 != null) {
                        hashMap12.put("actionID", optString5);
                        hashMap11.put("customAction", hashMap12);
                    }
                    hashMap11.put("pushProvider", com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                    hashMap11.put("pushProviderMessageID", optString4);
                    hashMap10.put("eventType", optString3);
                    hashMap10.put("pushNotificationTracking", hashMap11);
                    java.util.HashMap hashMap13 = new java.util.HashMap();
                    java.util.HashMap hashMap14 = new java.util.HashMap();
                    hashMap14.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Integer.valueOf(optBoolean ? 1 : 0));
                    hashMap13.put("launches", hashMap14);
                    hashMap10.put("application", hashMap13);
                    java.lang.String optString6 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "adobe_xdm", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString6)) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data is null.", new java.lang.Object[0]);
                    } else {
                        try {
                            java.util.Map<java.lang.String, java.lang.Object> map2 = com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(optString6));
                            if (map2 == null) {
                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data conversion to map failed.", new java.lang.Object[0]);
                            } else {
                                java.util.Map map3 = (map2.containsKey("cjm") && (map2.get("cjm") instanceof java.util.Map)) ? (java.util.Map) map2.get("cjm") : null;
                                if (map2.containsKey("mixins") && (map2.get("mixins") instanceof java.util.Map)) {
                                    map3 = (java.util.Map) map2.get("mixins");
                                }
                                if (map3 == null) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send cjm xdm data with the tracking, Missing XDM data.", new java.lang.Object[0]);
                                } else {
                                    hashMap10.putAll(map3);
                                    if (map3.containsKey("_experience") && (map3.get("_experience") instanceof java.util.Map)) {
                                        java.util.Map map4 = (java.util.Map) map3.get("_experience");
                                        if (map4.containsKey("customerJourneyManagement") && (map4.get("customerJourneyManagement") instanceof java.util.Map)) {
                                            java.util.Map map5 = (java.util.Map) map4.get("customerJourneyManagement");
                                            map5.putAll(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject("{\n   \"messageProfile\":{\n      \"channel\":{\n         \"_id\":\"https://ns.adobe.com/xdm/channels/push\"\n      }\n   },\n   \"pushChannelContext\":{\n      \"platform\":\"fcm\"\n   }\n}")));
                                            map4.put("customerJourneyManagement", map5);
                                            hashMap10.put("_experience", map4);
                                        }
                                    } else {
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send CJM XDM data with the tracking, required keys are missing.", new java.lang.Object[0]);
                                    }
                                }
                            }
                        } catch (java.lang.ClassCastException | org.json.JSONException e) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe data is malformed : %s", e.getMessage());
                        }
                    }
                    try {
                        if (hashMap10.containsKey("_experience")) {
                            java.lang.Object obj3 = hashMap10.get("_experience");
                            if (obj3 instanceof java.util.Map) {
                                java.util.Map map6 = (java.util.Map) obj3;
                                if (map6.containsKey("decisioning")) {
                                    java.lang.Object obj4 = map6.get("decisioning");
                                    if (obj4 instanceof java.util.Map) {
                                        java.util.Map map7 = (java.util.Map) obj4;
                                        if (map7.containsKey("exdRequestID")) {
                                            java.util.HashMap hashMap15 = new java.util.HashMap();
                                            if (!optBoolean) {
                                                hashMap15.put("dismiss", 1);
                                            } else if (optString5 != null) {
                                                hashMap15.put("interact", 1);
                                            } else {
                                                hashMap15.put("interact", 1);
                                            }
                                            map7.put("propositionEventType", hashMap15);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (java.lang.ClassCastException e2) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to add propositionEventType, error: %s", e2.getMessage());
                    }
                    java.util.HashMap hashMap16 = new java.util.HashMap();
                    hashMap16.put("xdm", hashMap10);
                    hashMap16.put(com.adjust.sdk.Constants.REFERRER_API_META, hashMap8);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.TRACKING_INITIATED, messagingExtension.getApi(), event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push tracking edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap16, messagingExtension.getApi(), event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges(event);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRanges)) {
                        return;
                    }
                    if (edgePersonalizationResponseHandler.getOutputSizeshNQ4ISI.containsKey(highSpeedVideoFpsRanges) || "TESTING_ID".equals(highSpeedVideoFpsRanges)) {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Processing propositions from personalization:decisions network response for event %s.", highSpeedVideoFpsRanges);
                        java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "payload", null);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        java.util.List<com.adobe.marketing.mobile.messaging.Proposition> highSpeedVideoSizes2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) optTypedListOfMap);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        for (com.adobe.marketing.mobile.messaging.Proposition proposition : highSpeedVideoSizes2) {
                            edgePersonalizationResponseHandler.getOutputFormats = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(proposition.getScope()), proposition, edgePersonalizationResponseHandler.getOutputFormats);
                        }
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputFormats(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler2 = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list2 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI) || com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list2)) {
                        return;
                    }
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "End of streaming response events for requesting event %s", highResolutionOutputSizeshNQ4ISI);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list3 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list3)) {
                        str = "EdgePersonalizationResponseHandler";
                        str2 = highResolutionOutputSizeshNQ4ISI;
                        list = list2;
                    } else {
                        com.adobe.marketing.mobile.messaging.ParsedPropositions parsedPropositions = new com.adobe.marketing.mobile.messaging.ParsedPropositions(edgePersonalizationResponseHandler2.getOutputFormats, list3, edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI);
                        java.util.Set<com.adobe.marketing.mobile.messaging.Surface> keySet = edgePersonalizationResponseHandler2.getOutputFormats.keySet();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list3);
                        arrayList2.removeAll(keySet);
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map8 = parsedPropositions.getHighSpeedVideoFpsRanges;
                        java.util.HashMap hashMap17 = new java.util.HashMap(edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor);
                        hashMap17.putAll(map8);
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            hashMap17.remove((com.adobe.marketing.mobile.messaging.Surface) it.next());
                        }
                        edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor = hashMap17;
                        edgePersonalizationResponseHandler2.getOutputStallDuration.putAll(parsedPropositions.Camera2StreamConfigurationMap);
                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList2)) {
                            for (java.util.Map.Entry entry : new java.util.HashMap(edgePersonalizationResponseHandler2.getOutputStallDuration).entrySet()) {
                                if (arrayList2.contains(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(((com.adobe.marketing.mobile.messaging.PropositionInfo) entry.getValue()).getHighSpeedVideoSizes))) {
                                    edgePersonalizationResponseHandler2.getOutputStallDuration.remove(entry.getKey());
                                }
                            }
                        }
                        com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map9 = parsedPropositions.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor3 = messagingCacheUtilities.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor3 == null) {
                            highSpeedVideoFpsRangesFor3 = new java.util.HashMap<>();
                        }
                        highSpeedVideoFpsRangesFor3.putAll(map9);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it2 = highSpeedVideoFpsRangesFor3.entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> next = it2.next();
                            java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it3 = it2;
                            if (arrayList2.contains(next.getKey())) {
                                arrayList3.add(next.getKey());
                            }
                            it2 = it3;
                        }
                        java.util.Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            highSpeedVideoFpsRangesFor3.remove((com.adobe.marketing.mobile.messaging.Surface) it4.next());
                        }
                        ?? hashMap18 = new java.util.HashMap(highSpeedVideoFpsRangesFor3);
                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap18)) {
                            messagingCacheUtilities.getHighSpeedVideoSizes.remove("messaging", "propositions");
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "In-app messaging cache has been deleted.", new java.lang.Object[0]);
                            str3 = "EdgePersonalizationResponseHandler";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            list = list2;
                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        } else {
                            list = list2;
                            ?? r5 = "Creating new cached propositions";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            ?? r42 = new java.lang.Object[0];
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Creating new cached propositions", r42);
                            try {
                                try {
                                    r42 = new java.io.ByteArrayOutputStream();
                                } catch (java.lang.Throwable th2) {
                                    java.io.InputStream inputStream2 = hashMap18;
                                    outputStream = r5;
                                    inputStream = inputStream2;
                                    th = th2;
                                    r4 = r42;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException e3) {
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e3);
                                            throw th;
                                        }
                                    }
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    if (inputStream == null) {
                                        throw th;
                                    }
                                    inputStream.close();
                                    throw th;
                                }
                                try {
                                    r5 = new java.io.ObjectOutputStream(r42);
                                    try {
                                        r5.writeObject(hashMap18);
                                        r5.flush();
                                        hashMap18 = new java.io.ByteArrayInputStream(r42.toByteArray());
                                        try {
                                            str3 = "EdgePersonalizationResponseHandler";
                                        } catch (java.io.IOException e4) {
                                            e = e4;
                                            str3 = "EdgePersonalizationResponseHandler";
                                        }
                                        try {
                                            never = com.adobe.marketing.mobile.services.caching.CacheExpiry.never();
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        } catch (java.io.IOException e5) {
                                            e = e5;
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (java.io.IOException e6) {
                                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e6);
                                                }
                                            }
                                            if (r42 != 0) {
                                                r42.close();
                                            }
                                            if (hashMap18 != 0) {
                                                hashMap18.close();
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList4222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222);
                                            arrayList4222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222);
                                            java.lang.String str522222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                        try {
                                            messagingCacheUtilities.getHighSpeedVideoSizes.set("messaging", "propositions", new com.adobe.marketing.mobile.services.caching.CacheEntry(hashMap18, never, null));
                                            try {
                                                r5.close();
                                                r42.close();
                                                hashMap18.close();
                                            } catch (java.io.IOException e7) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e7);
                                            }
                                        } catch (java.io.IOException e8) {
                                            e = e8;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                            }
                                            if (r42 != 0) {
                                            }
                                            if (hashMap18 != 0) {
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList42222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222);
                                            arrayList42222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222);
                                            java.lang.String str5222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                    } catch (java.io.IOException e9) {
                                        e = e9;
                                        str3 = "EdgePersonalizationResponseHandler";
                                        str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        r42 = r42;
                                        r5 = r5;
                                        hashMap18 = 0;
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                        if (r5 != 0) {
                                        }
                                        if (r42 != 0) {
                                        }
                                        if (hashMap18 != 0) {
                                        }
                                        map = parsedPropositions.getHighSpeedVideoSizes;
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                        }
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                        }
                                        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                        }
                                        str = str3;
                                        java.util.ArrayList arrayList422222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222);
                                        arrayList422222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                        edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222);
                                        java.lang.String str52222222 = str2;
                                        edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222);
                                        edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                        com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                        highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222);
                                        if (highSpeedVideoSizes != null) {
                                        }
                                        highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                        }
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                        edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        outputStream = r5;
                                        obj2 = r42;
                                        inputStream = null;
                                        r4 = obj2;
                                        if (outputStream != null) {
                                        }
                                        if (r4 != 0) {
                                        }
                                        if (inputStream == null) {
                                        }
                                    }
                                } catch (java.io.IOException e10) {
                                    e = e10;
                                    str3 = "EdgePersonalizationResponseHandler";
                                    str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    z = r42;
                                    r5 = 0;
                                    r42 = z;
                                    hashMap18 = 0;
                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                    if (r5 != 0) {
                                    }
                                    if (r42 != 0) {
                                    }
                                    if (hashMap18 != 0) {
                                    }
                                    map = parsedPropositions.getHighSpeedVideoSizes;
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                    }
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                    }
                                    java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                    }
                                    str = str3;
                                    java.util.ArrayList arrayList4222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222);
                                    arrayList4222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                    edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222);
                                    java.lang.String str522222222 = str2;
                                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222);
                                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222);
                                    if (highSpeedVideoSizes != null) {
                                    }
                                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                    }
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj = r42;
                                    th = th;
                                    obj2 = obj;
                                    outputStream = null;
                                    inputStream = null;
                                    r4 = obj2;
                                    if (outputStream != null) {
                                    }
                                    if (r4 != 0) {
                                    }
                                    if (inputStream == null) {
                                    }
                                }
                            } catch (java.io.IOException e11) {
                                e = e11;
                                str3 = "EdgePersonalizationResponseHandler";
                                str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                z = false;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj = null;
                            }
                        }
                        map = parsedPropositions.getHighSpeedVideoSizes;
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                            edgePersonalizationResponseHandler2.getHighSpeedVideoSizes.replaceRules(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap));
                            edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(new com.adobe.marketing.mobile.Event.Builder("Seed content cards", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).build());
                        }
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null || map.get(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION) != null) {
                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.util.Iterator<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> it5 = Camera2StreamConfigurationMap22222222.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.addAll(it5.next().getConsequenceList());
                                }
                                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList();
                                try {
                                    java.util.Iterator it6 = arrayList5.iterator();
                                    while (it6.hasNext()) {
                                        java.util.Map<java.lang.String, java.lang.Object> detail = ((com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence) it6.next()).getDetail();
                                        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(detail)) {
                                            java.lang.String str6 = str4;
                                            java.util.List<java.lang.String> stringList = com.adobe.marketing.mobile.util.DataReader.getStringList(com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, detail, str6), "remoteAssets");
                                            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(stringList)) {
                                                for (java.lang.String str7 : stringList) {
                                                    if (com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str7) && !arrayList6.contains(str7)) {
                                                        str = str3;
                                                        try {
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Image asset to be cached (%s) ", str7);
                                                            arrayList6.add(str7);
                                                            str3 = str;
                                                        } catch (com.adobe.marketing.mobile.util.DataReaderException e12) {
                                                            e = e12;
                                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Failed to cache image asset, exception occurred %s", e.getLocalizedMessage());
                                                            java.util.ArrayList arrayList42222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222);
                                                            arrayList42222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222);
                                                            java.lang.String str5222222222 = str2;
                                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222);
                                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222);
                                                            if (highSpeedVideoSizes != null) {
                                                            }
                                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                                            }
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = str6;
                                        }
                                    }
                                    str = str3;
                                    com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities2 = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingCacheUtilities2.Camera2StreamConfigurationMap)) {
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the asset cache location is not available.", new java.lang.Object[0]);
                                    } else if (messagingCacheUtilities2.getHighSpeedVideoSizes == null) {
                                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the cache manager is not available.", new java.lang.Object[0]);
                                    } else {
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList6)) {
                                            for (java.lang.String str8 : arrayList6) {
                                                if (com.adobe.marketing.mobile.messaging.MessagingCacheUtilities.getHighSpeedVideoSizes(str8) && !arrayList7.contains(str8)) {
                                                    arrayList7.add(str8);
                                                    messagingCacheUtilities2.getHighSpeedVideoFpsRanges.put(str8, messagingCacheUtilities2.Camera2StreamConfigurationMap);
                                                }
                                            }
                                        }
                                        com.adobe.marketing.mobile.messaging.MessageAssetDownloader messageAssetDownloader = new com.adobe.marketing.mobile.messaging.MessageAssetDownloader(arrayList7);
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageAssetDownloader.getHighSpeedVideoSizes)) {
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Failed to download assets, the asset cache location is not available.", new java.lang.Object[0]);
                                        } else {
                                            java.util.List<java.lang.String> list4 = messageAssetDownloader.Camera2StreamConfigurationMap;
                                            if (list4 == null || list4.isEmpty()) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Empty list of assets provided, will not download any assets.", new java.lang.Object[0]);
                                            } else {
                                                java.io.File file = messageAssetDownloader.getHighSpeedVideoFpsRanges;
                                                if (file != null) {
                                                    messageAssetDownloader.Camera2StreamConfigurationMap(file, messageAssetDownloader.Camera2StreamConfigurationMap);
                                                }
                                                java.util.Iterator<java.lang.String> it7 = messageAssetDownloader.Camera2StreamConfigurationMap.iterator();
                                                while (it7.hasNext()) {
                                                    messageAssetDownloader.getHighResolutionOutputSizeshNQ4ISI(it7.next(), null);
                                                }
                                            }
                                        }
                                    }
                                } catch (com.adobe.marketing.mobile.util.DataReaderException e13) {
                                    e = e13;
                                    str = str3;
                                }
                                java.util.ArrayList arrayList422222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222);
                                arrayList422222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222);
                            }
                            str = str3;
                            java.util.ArrayList arrayList4222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222);
                            arrayList4222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222);
                        } else {
                            str = str3;
                        }
                    }
                    java.lang.String str52222222222 = str2;
                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222);
                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222);
                    if (highSpeedVideoSizes != null) {
                        highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.call(java.lang.Boolean.TRUE);
                    }
                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                        java.util.HashMap hashMap19 = new java.util.HashMap();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it8 = highSpeedVideoFpsRangesFor.entrySet().iterator();
                        while (it8.hasNext()) {
                            java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it9 = it8.next().getValue().iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(it9.next().toEventData());
                            }
                        }
                        hashMap19.put("propositions", arrayList8);
                        edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Message propositions notification", com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.notification").setEventData(hashMap19).build());
                    } else {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Not dispatching a notification event, personalization:decisions response does not contain propositions.", new java.lang.Object[0]);
                    }
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:217:0x066c  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x068f  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x0832  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x0845  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x084e  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x06aa  */
            /* JADX WARN: Removed duplicated region for block: B:353:0x063d A[Catch: IOException -> 0x0639, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:355:0x0642 A[Catch: IOException -> 0x0639, TRY_LEAVE, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:360:0x0635 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:377:0x0808 A[Catch: IOException -> 0x0804, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:379:0x080d A[Catch: IOException -> 0x0804, TRY_LEAVE, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:386:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:387:0x0800 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v11 */
            /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.HashMap, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v19, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v63 */
            /* JADX WARN: Type inference failed for: r4v64 */
            /* JADX WARN: Type inference failed for: r4v66 */
            /* JADX WARN: Type inference failed for: r4v67 */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.io.ObjectOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v41 */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void hear(com.adobe.marketing.mobile.Event event) {
                java.lang.String str;
                java.lang.String str2;
                java.util.List<com.adobe.marketing.mobile.messaging.Surface> list;
                com.adobe.marketing.mobile.messaging.CompletionHandler highSpeedVideoSizes;
                java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor;
                java.lang.Object obj;
                java.lang.String str3;
                java.lang.String str4;
                boolean z;
                java.io.OutputStream outputStream;
                java.io.InputStream inputStream;
                java.lang.Throwable th;
                java.lang.Object obj2;
                ?? r4;
                com.adobe.marketing.mobile.services.caching.CacheExpiry never;
                java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> map;
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if ((event == null || event.getEventData() == null) && (event == null || !event.getSource().equals(com.adobe.marketing.mobile.EventSource.REQUEST_RESET))) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Invalid event, ignoring.", new java.lang.Object[0]);
                    return;
                }
                java.util.HashMap hashMap = null;
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputFormats(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing manual request to refresh In-App Message definitions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputSizes(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to retrieve propositions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(event));
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputMinFrameDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to get cached proposition content.", new java.lang.Object[0]);
                    messagingExtension.getInputSizeshNQ4ISI.offer(event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to track propositions.", new java.lang.Object[0]);
                    java.util.Map<java.lang.String, java.lang.Object> optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "propositioninteraction", new java.util.HashMap());
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Cannot track proposition item, proposition interaction XDM is not available.", new java.lang.Object[0]);
                        return;
                    } else {
                        messagingExtension.sendPropositionInteraction(optTypedMap);
                        return;
                    }
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(event)) {
                    java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "pushidentifier", null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, token is null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult sharedState = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(sharedState == null ? null : sharedState.getValue(), optString, event.getTimestamp())) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Skipping the push token sync and shared state update.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult xDMSharedState = messagingExtension.getApi().getXDMSharedState("com.adobe.edge.identity", event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(xDMSharedState == null ? null : xDMSharedState.getValue());
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor2)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to sync the push token. ECID is unavailable for the user.", new java.lang.Object[0]);
                        return;
                    }
                    if (highSpeedVideoFpsRangesFor2 == null) {
                        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, ECID is null.", new java.lang.Object[0]);
                    } else {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("code", "ECID");
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("namespace", hashMap2);
                        hashMap3.put("id", highSpeedVideoFpsRangesFor2);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        hashMap4.put("identity", hashMap3);
                        hashMap4.put("appID", com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName());
                        hashMap4.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, optString);
                        hashMap4.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                        hashMap4.put("denylisted", java.lang.Boolean.FALSE);
                        arrayList.add(hashMap4);
                        java.util.HashMap hashMap5 = new java.util.HashMap();
                        hashMap5.put("pushNotificationDetails", arrayList);
                        java.util.HashMap hashMap6 = new java.util.HashMap();
                        hashMap6.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap5);
                        hashMap = hashMap6;
                    }
                    if (hashMap != null) {
                        java.util.HashMap hashMap7 = new java.util.HashMap();
                        hashMap7.put("pushidentifier", optString);
                        messagingExtension.getApi().createSharedState(hashMap7, event);
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push notification profile edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap, messagingExtension.getApi(), event);
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputSizeshNQ4ISI(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Clearing the push token from persistence and the Messaging shared state.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRangesFor(null, event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor((java.lang.String) null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizesFor(event)) {
                    com.adobe.marketing.mobile.SharedStateResult sharedState2 = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 == null ? null : sharedState2.getValue(), "messaging.eventDataset", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.NO_DATASET_CONFIGURED, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, experience event dataset id is empty. Check the messaging launch extension to add the experience event dataset.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                    if (eventData == null) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventData is null.", new java.lang.Object[0]);
                        return;
                    }
                    java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "eventType", "");
                    java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "messageId", "");
                    boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(eventData, "applicationOpened", false);
                    java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventType is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString4)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_MESSAGE_ID, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, messageId is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.HashMap hashMap8 = new java.util.HashMap();
                    java.util.HashMap hashMap9 = new java.util.HashMap();
                    hashMap9.put("datasetId", optString2);
                    hashMap8.put("collect", hashMap9);
                    java.util.HashMap hashMap10 = new java.util.HashMap();
                    java.util.HashMap hashMap11 = new java.util.HashMap();
                    java.util.HashMap hashMap12 = new java.util.HashMap();
                    if (optString5 != null) {
                        hashMap12.put("actionID", optString5);
                        hashMap11.put("customAction", hashMap12);
                    }
                    hashMap11.put("pushProvider", com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                    hashMap11.put("pushProviderMessageID", optString4);
                    hashMap10.put("eventType", optString3);
                    hashMap10.put("pushNotificationTracking", hashMap11);
                    java.util.HashMap hashMap13 = new java.util.HashMap();
                    java.util.HashMap hashMap14 = new java.util.HashMap();
                    hashMap14.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Integer.valueOf(optBoolean ? 1 : 0));
                    hashMap13.put("launches", hashMap14);
                    hashMap10.put("application", hashMap13);
                    java.lang.String optString6 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "adobe_xdm", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString6)) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data is null.", new java.lang.Object[0]);
                    } else {
                        try {
                            java.util.Map<java.lang.String, java.lang.Object> map2 = com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(optString6));
                            if (map2 == null) {
                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data conversion to map failed.", new java.lang.Object[0]);
                            } else {
                                java.util.Map map3 = (map2.containsKey("cjm") && (map2.get("cjm") instanceof java.util.Map)) ? (java.util.Map) map2.get("cjm") : null;
                                if (map2.containsKey("mixins") && (map2.get("mixins") instanceof java.util.Map)) {
                                    map3 = (java.util.Map) map2.get("mixins");
                                }
                                if (map3 == null) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send cjm xdm data with the tracking, Missing XDM data.", new java.lang.Object[0]);
                                } else {
                                    hashMap10.putAll(map3);
                                    if (map3.containsKey("_experience") && (map3.get("_experience") instanceof java.util.Map)) {
                                        java.util.Map map4 = (java.util.Map) map3.get("_experience");
                                        if (map4.containsKey("customerJourneyManagement") && (map4.get("customerJourneyManagement") instanceof java.util.Map)) {
                                            java.util.Map map5 = (java.util.Map) map4.get("customerJourneyManagement");
                                            map5.putAll(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject("{\n   \"messageProfile\":{\n      \"channel\":{\n         \"_id\":\"https://ns.adobe.com/xdm/channels/push\"\n      }\n   },\n   \"pushChannelContext\":{\n      \"platform\":\"fcm\"\n   }\n}")));
                                            map4.put("customerJourneyManagement", map5);
                                            hashMap10.put("_experience", map4);
                                        }
                                    } else {
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send CJM XDM data with the tracking, required keys are missing.", new java.lang.Object[0]);
                                    }
                                }
                            }
                        } catch (java.lang.ClassCastException | org.json.JSONException e) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe data is malformed : %s", e.getMessage());
                        }
                    }
                    try {
                        if (hashMap10.containsKey("_experience")) {
                            java.lang.Object obj3 = hashMap10.get("_experience");
                            if (obj3 instanceof java.util.Map) {
                                java.util.Map map6 = (java.util.Map) obj3;
                                if (map6.containsKey("decisioning")) {
                                    java.lang.Object obj4 = map6.get("decisioning");
                                    if (obj4 instanceof java.util.Map) {
                                        java.util.Map map7 = (java.util.Map) obj4;
                                        if (map7.containsKey("exdRequestID")) {
                                            java.util.HashMap hashMap15 = new java.util.HashMap();
                                            if (!optBoolean) {
                                                hashMap15.put("dismiss", 1);
                                            } else if (optString5 != null) {
                                                hashMap15.put("interact", 1);
                                            } else {
                                                hashMap15.put("interact", 1);
                                            }
                                            map7.put("propositionEventType", hashMap15);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (java.lang.ClassCastException e2) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to add propositionEventType, error: %s", e2.getMessage());
                    }
                    java.util.HashMap hashMap16 = new java.util.HashMap();
                    hashMap16.put("xdm", hashMap10);
                    hashMap16.put(com.adjust.sdk.Constants.REFERRER_API_META, hashMap8);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.TRACKING_INITIATED, messagingExtension.getApi(), event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push tracking edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap16, messagingExtension.getApi(), event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges(event);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRanges)) {
                        return;
                    }
                    if (edgePersonalizationResponseHandler.getOutputSizeshNQ4ISI.containsKey(highSpeedVideoFpsRanges) || "TESTING_ID".equals(highSpeedVideoFpsRanges)) {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Processing propositions from personalization:decisions network response for event %s.", highSpeedVideoFpsRanges);
                        java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "payload", null);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        java.util.List<com.adobe.marketing.mobile.messaging.Proposition> highSpeedVideoSizes2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) optTypedListOfMap);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        for (com.adobe.marketing.mobile.messaging.Proposition proposition : highSpeedVideoSizes2) {
                            edgePersonalizationResponseHandler.getOutputFormats = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(proposition.getScope()), proposition, edgePersonalizationResponseHandler.getOutputFormats);
                        }
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputFormats(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler2 = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list2 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI) || com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list2)) {
                        return;
                    }
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "End of streaming response events for requesting event %s", highResolutionOutputSizeshNQ4ISI);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list3 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list3)) {
                        str = "EdgePersonalizationResponseHandler";
                        str2 = highResolutionOutputSizeshNQ4ISI;
                        list = list2;
                    } else {
                        com.adobe.marketing.mobile.messaging.ParsedPropositions parsedPropositions = new com.adobe.marketing.mobile.messaging.ParsedPropositions(edgePersonalizationResponseHandler2.getOutputFormats, list3, edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI);
                        java.util.Set<com.adobe.marketing.mobile.messaging.Surface> keySet = edgePersonalizationResponseHandler2.getOutputFormats.keySet();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list3);
                        arrayList2.removeAll(keySet);
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map8 = parsedPropositions.getHighSpeedVideoFpsRanges;
                        java.util.HashMap hashMap17 = new java.util.HashMap(edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor);
                        hashMap17.putAll(map8);
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            hashMap17.remove((com.adobe.marketing.mobile.messaging.Surface) it.next());
                        }
                        edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor = hashMap17;
                        edgePersonalizationResponseHandler2.getOutputStallDuration.putAll(parsedPropositions.Camera2StreamConfigurationMap);
                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList2)) {
                            for (java.util.Map.Entry entry : new java.util.HashMap(edgePersonalizationResponseHandler2.getOutputStallDuration).entrySet()) {
                                if (arrayList2.contains(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(((com.adobe.marketing.mobile.messaging.PropositionInfo) entry.getValue()).getHighSpeedVideoSizes))) {
                                    edgePersonalizationResponseHandler2.getOutputStallDuration.remove(entry.getKey());
                                }
                            }
                        }
                        com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map9 = parsedPropositions.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor3 = messagingCacheUtilities.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor3 == null) {
                            highSpeedVideoFpsRangesFor3 = new java.util.HashMap<>();
                        }
                        highSpeedVideoFpsRangesFor3.putAll(map9);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it2 = highSpeedVideoFpsRangesFor3.entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> next = it2.next();
                            java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it3 = it2;
                            if (arrayList2.contains(next.getKey())) {
                                arrayList3.add(next.getKey());
                            }
                            it2 = it3;
                        }
                        java.util.Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            highSpeedVideoFpsRangesFor3.remove((com.adobe.marketing.mobile.messaging.Surface) it4.next());
                        }
                        ?? hashMap18 = new java.util.HashMap(highSpeedVideoFpsRangesFor3);
                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap18)) {
                            messagingCacheUtilities.getHighSpeedVideoSizes.remove("messaging", "propositions");
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "In-app messaging cache has been deleted.", new java.lang.Object[0]);
                            str3 = "EdgePersonalizationResponseHandler";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            list = list2;
                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        } else {
                            list = list2;
                            ?? r5 = "Creating new cached propositions";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            ?? r42 = new java.lang.Object[0];
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Creating new cached propositions", r42);
                            try {
                                try {
                                    r42 = new java.io.ByteArrayOutputStream();
                                } catch (java.lang.Throwable th2) {
                                    java.io.InputStream inputStream2 = hashMap18;
                                    outputStream = r5;
                                    inputStream = inputStream2;
                                    th = th2;
                                    r4 = r42;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException e3) {
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e3);
                                            throw th;
                                        }
                                    }
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    if (inputStream == null) {
                                        throw th;
                                    }
                                    inputStream.close();
                                    throw th;
                                }
                                try {
                                    r5 = new java.io.ObjectOutputStream(r42);
                                    try {
                                        r5.writeObject(hashMap18);
                                        r5.flush();
                                        hashMap18 = new java.io.ByteArrayInputStream(r42.toByteArray());
                                        try {
                                            str3 = "EdgePersonalizationResponseHandler";
                                        } catch (java.io.IOException e4) {
                                            e = e4;
                                            str3 = "EdgePersonalizationResponseHandler";
                                        }
                                        try {
                                            never = com.adobe.marketing.mobile.services.caching.CacheExpiry.never();
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        } catch (java.io.IOException e5) {
                                            e = e5;
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (java.io.IOException e6) {
                                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e6);
                                                }
                                            }
                                            if (r42 != 0) {
                                                r42.close();
                                            }
                                            if (hashMap18 != 0) {
                                                hashMap18.close();
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList4222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222);
                                            arrayList4222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222);
                                            java.lang.String str52222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                        try {
                                            messagingCacheUtilities.getHighSpeedVideoSizes.set("messaging", "propositions", new com.adobe.marketing.mobile.services.caching.CacheEntry(hashMap18, never, null));
                                            try {
                                                r5.close();
                                                r42.close();
                                                hashMap18.close();
                                            } catch (java.io.IOException e7) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e7);
                                            }
                                        } catch (java.io.IOException e8) {
                                            e = e8;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                            }
                                            if (r42 != 0) {
                                            }
                                            if (hashMap18 != 0) {
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList42222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222);
                                            arrayList42222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222);
                                            java.lang.String str522222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                    } catch (java.io.IOException e9) {
                                        e = e9;
                                        str3 = "EdgePersonalizationResponseHandler";
                                        str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        r42 = r42;
                                        r5 = r5;
                                        hashMap18 = 0;
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                        if (r5 != 0) {
                                        }
                                        if (r42 != 0) {
                                        }
                                        if (hashMap18 != 0) {
                                        }
                                        map = parsedPropositions.getHighSpeedVideoSizes;
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                        }
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                        }
                                        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                        }
                                        str = str3;
                                        java.util.ArrayList arrayList422222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222);
                                        arrayList422222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                        edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222);
                                        java.lang.String str5222222222222 = str2;
                                        edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222);
                                        edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                        com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                        highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222);
                                        if (highSpeedVideoSizes != null) {
                                        }
                                        highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                        }
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                        edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        outputStream = r5;
                                        obj2 = r42;
                                        inputStream = null;
                                        r4 = obj2;
                                        if (outputStream != null) {
                                        }
                                        if (r4 != 0) {
                                        }
                                        if (inputStream == null) {
                                        }
                                    }
                                } catch (java.io.IOException e10) {
                                    e = e10;
                                    str3 = "EdgePersonalizationResponseHandler";
                                    str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    z = r42;
                                    r5 = 0;
                                    r42 = z;
                                    hashMap18 = 0;
                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                    if (r5 != 0) {
                                    }
                                    if (r42 != 0) {
                                    }
                                    if (hashMap18 != 0) {
                                    }
                                    map = parsedPropositions.getHighSpeedVideoSizes;
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                    }
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                    }
                                    java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                    }
                                    str = str3;
                                    java.util.ArrayList arrayList4222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222);
                                    arrayList4222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                    edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222);
                                    java.lang.String str52222222222222 = str2;
                                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222222);
                                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222222);
                                    if (highSpeedVideoSizes != null) {
                                    }
                                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                    }
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj = r42;
                                    th = th;
                                    obj2 = obj;
                                    outputStream = null;
                                    inputStream = null;
                                    r4 = obj2;
                                    if (outputStream != null) {
                                    }
                                    if (r4 != 0) {
                                    }
                                    if (inputStream == null) {
                                    }
                                }
                            } catch (java.io.IOException e11) {
                                e = e11;
                                str3 = "EdgePersonalizationResponseHandler";
                                str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                z = false;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj = null;
                            }
                        }
                        map = parsedPropositions.getHighSpeedVideoSizes;
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                            edgePersonalizationResponseHandler2.getHighSpeedVideoSizes.replaceRules(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap));
                            edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(new com.adobe.marketing.mobile.Event.Builder("Seed content cards", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).build());
                        }
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null || map.get(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION) != null) {
                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.util.Iterator<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> it5 = Camera2StreamConfigurationMap222222222222.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.addAll(it5.next().getConsequenceList());
                                }
                                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList();
                                try {
                                    java.util.Iterator it6 = arrayList5.iterator();
                                    while (it6.hasNext()) {
                                        java.util.Map<java.lang.String, java.lang.Object> detail = ((com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence) it6.next()).getDetail();
                                        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(detail)) {
                                            java.lang.String str6 = str4;
                                            java.util.List<java.lang.String> stringList = com.adobe.marketing.mobile.util.DataReader.getStringList(com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, detail, str6), "remoteAssets");
                                            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(stringList)) {
                                                for (java.lang.String str7 : stringList) {
                                                    if (com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str7) && !arrayList6.contains(str7)) {
                                                        str = str3;
                                                        try {
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Image asset to be cached (%s) ", str7);
                                                            arrayList6.add(str7);
                                                            str3 = str;
                                                        } catch (com.adobe.marketing.mobile.util.DataReaderException e12) {
                                                            e = e12;
                                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Failed to cache image asset, exception occurred %s", e.getLocalizedMessage());
                                                            java.util.ArrayList arrayList42222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222);
                                                            arrayList42222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222222);
                                                            java.lang.String str522222222222222 = str2;
                                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222222);
                                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222222);
                                                            if (highSpeedVideoSizes != null) {
                                                            }
                                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                                            }
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = str6;
                                        }
                                    }
                                    str = str3;
                                    com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities2 = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingCacheUtilities2.Camera2StreamConfigurationMap)) {
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the asset cache location is not available.", new java.lang.Object[0]);
                                    } else if (messagingCacheUtilities2.getHighSpeedVideoSizes == null) {
                                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the cache manager is not available.", new java.lang.Object[0]);
                                    } else {
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList6)) {
                                            for (java.lang.String str8 : arrayList6) {
                                                if (com.adobe.marketing.mobile.messaging.MessagingCacheUtilities.getHighSpeedVideoSizes(str8) && !arrayList7.contains(str8)) {
                                                    arrayList7.add(str8);
                                                    messagingCacheUtilities2.getHighSpeedVideoFpsRanges.put(str8, messagingCacheUtilities2.Camera2StreamConfigurationMap);
                                                }
                                            }
                                        }
                                        com.adobe.marketing.mobile.messaging.MessageAssetDownloader messageAssetDownloader = new com.adobe.marketing.mobile.messaging.MessageAssetDownloader(arrayList7);
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageAssetDownloader.getHighSpeedVideoSizes)) {
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Failed to download assets, the asset cache location is not available.", new java.lang.Object[0]);
                                        } else {
                                            java.util.List<java.lang.String> list4 = messageAssetDownloader.Camera2StreamConfigurationMap;
                                            if (list4 == null || list4.isEmpty()) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Empty list of assets provided, will not download any assets.", new java.lang.Object[0]);
                                            } else {
                                                java.io.File file = messageAssetDownloader.getHighSpeedVideoFpsRanges;
                                                if (file != null) {
                                                    messageAssetDownloader.Camera2StreamConfigurationMap(file, messageAssetDownloader.Camera2StreamConfigurationMap);
                                                }
                                                java.util.Iterator<java.lang.String> it7 = messageAssetDownloader.Camera2StreamConfigurationMap.iterator();
                                                while (it7.hasNext()) {
                                                    messageAssetDownloader.getHighResolutionOutputSizeshNQ4ISI(it7.next(), null);
                                                }
                                            }
                                        }
                                    }
                                } catch (com.adobe.marketing.mobile.util.DataReaderException e13) {
                                    e = e13;
                                    str = str3;
                                }
                                java.util.ArrayList arrayList422222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222);
                                arrayList422222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222222);
                            }
                            str = str3;
                            java.util.ArrayList arrayList4222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222);
                            arrayList4222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222);
                        } else {
                            str = str3;
                        }
                    }
                    java.lang.String str5222222222222222 = str2;
                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222222);
                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222222);
                    if (highSpeedVideoSizes != null) {
                        highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.call(java.lang.Boolean.TRUE);
                    }
                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                        java.util.HashMap hashMap19 = new java.util.HashMap();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it8 = highSpeedVideoFpsRangesFor.entrySet().iterator();
                        while (it8.hasNext()) {
                            java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it9 = it8.next().getValue().iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(it9.next().toEventData());
                            }
                        }
                        hashMap19.put("propositions", arrayList8);
                        edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Message propositions notification", com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.notification").setEventData(hashMap19).build());
                    } else {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Not dispatching a notification event, personalization:decisions response does not contain propositions.", new java.lang.Object[0]);
                    }
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE, "personalization:decisions", new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:217:0x066c  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x068f  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x0832  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x0845  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x084e  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x06aa  */
            /* JADX WARN: Removed duplicated region for block: B:353:0x063d A[Catch: IOException -> 0x0639, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:355:0x0642 A[Catch: IOException -> 0x0639, TRY_LEAVE, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:360:0x0635 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:377:0x0808 A[Catch: IOException -> 0x0804, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:379:0x080d A[Catch: IOException -> 0x0804, TRY_LEAVE, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:386:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:387:0x0800 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v11 */
            /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.HashMap, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v19, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v63 */
            /* JADX WARN: Type inference failed for: r4v64 */
            /* JADX WARN: Type inference failed for: r4v66 */
            /* JADX WARN: Type inference failed for: r4v67 */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.io.ObjectOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v41 */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void hear(com.adobe.marketing.mobile.Event event) {
                java.lang.String str;
                java.lang.String str2;
                java.util.List<com.adobe.marketing.mobile.messaging.Surface> list;
                com.adobe.marketing.mobile.messaging.CompletionHandler highSpeedVideoSizes;
                java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor;
                java.lang.Object obj;
                java.lang.String str3;
                java.lang.String str4;
                boolean z;
                java.io.OutputStream outputStream;
                java.io.InputStream inputStream;
                java.lang.Throwable th;
                java.lang.Object obj2;
                ?? r4;
                com.adobe.marketing.mobile.services.caching.CacheExpiry never;
                java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> map;
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if ((event == null || event.getEventData() == null) && (event == null || !event.getSource().equals(com.adobe.marketing.mobile.EventSource.REQUEST_RESET))) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Invalid event, ignoring.", new java.lang.Object[0]);
                    return;
                }
                java.util.HashMap hashMap = null;
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputFormats(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing manual request to refresh In-App Message definitions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputSizes(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to retrieve propositions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(event));
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputMinFrameDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to get cached proposition content.", new java.lang.Object[0]);
                    messagingExtension.getInputSizeshNQ4ISI.offer(event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to track propositions.", new java.lang.Object[0]);
                    java.util.Map<java.lang.String, java.lang.Object> optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "propositioninteraction", new java.util.HashMap());
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Cannot track proposition item, proposition interaction XDM is not available.", new java.lang.Object[0]);
                        return;
                    } else {
                        messagingExtension.sendPropositionInteraction(optTypedMap);
                        return;
                    }
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(event)) {
                    java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "pushidentifier", null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, token is null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult sharedState = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(sharedState == null ? null : sharedState.getValue(), optString, event.getTimestamp())) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Skipping the push token sync and shared state update.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult xDMSharedState = messagingExtension.getApi().getXDMSharedState("com.adobe.edge.identity", event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(xDMSharedState == null ? null : xDMSharedState.getValue());
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor2)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to sync the push token. ECID is unavailable for the user.", new java.lang.Object[0]);
                        return;
                    }
                    if (highSpeedVideoFpsRangesFor2 == null) {
                        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, ECID is null.", new java.lang.Object[0]);
                    } else {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("code", "ECID");
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("namespace", hashMap2);
                        hashMap3.put("id", highSpeedVideoFpsRangesFor2);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        hashMap4.put("identity", hashMap3);
                        hashMap4.put("appID", com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName());
                        hashMap4.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, optString);
                        hashMap4.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                        hashMap4.put("denylisted", java.lang.Boolean.FALSE);
                        arrayList.add(hashMap4);
                        java.util.HashMap hashMap5 = new java.util.HashMap();
                        hashMap5.put("pushNotificationDetails", arrayList);
                        java.util.HashMap hashMap6 = new java.util.HashMap();
                        hashMap6.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap5);
                        hashMap = hashMap6;
                    }
                    if (hashMap != null) {
                        java.util.HashMap hashMap7 = new java.util.HashMap();
                        hashMap7.put("pushidentifier", optString);
                        messagingExtension.getApi().createSharedState(hashMap7, event);
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push notification profile edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap, messagingExtension.getApi(), event);
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputSizeshNQ4ISI(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Clearing the push token from persistence and the Messaging shared state.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRangesFor(null, event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor((java.lang.String) null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizesFor(event)) {
                    com.adobe.marketing.mobile.SharedStateResult sharedState2 = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 == null ? null : sharedState2.getValue(), "messaging.eventDataset", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.NO_DATASET_CONFIGURED, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, experience event dataset id is empty. Check the messaging launch extension to add the experience event dataset.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                    if (eventData == null) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventData is null.", new java.lang.Object[0]);
                        return;
                    }
                    java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "eventType", "");
                    java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "messageId", "");
                    boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(eventData, "applicationOpened", false);
                    java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventType is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString4)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_MESSAGE_ID, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, messageId is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.HashMap hashMap8 = new java.util.HashMap();
                    java.util.HashMap hashMap9 = new java.util.HashMap();
                    hashMap9.put("datasetId", optString2);
                    hashMap8.put("collect", hashMap9);
                    java.util.HashMap hashMap10 = new java.util.HashMap();
                    java.util.HashMap hashMap11 = new java.util.HashMap();
                    java.util.HashMap hashMap12 = new java.util.HashMap();
                    if (optString5 != null) {
                        hashMap12.put("actionID", optString5);
                        hashMap11.put("customAction", hashMap12);
                    }
                    hashMap11.put("pushProvider", com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                    hashMap11.put("pushProviderMessageID", optString4);
                    hashMap10.put("eventType", optString3);
                    hashMap10.put("pushNotificationTracking", hashMap11);
                    java.util.HashMap hashMap13 = new java.util.HashMap();
                    java.util.HashMap hashMap14 = new java.util.HashMap();
                    hashMap14.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Integer.valueOf(optBoolean ? 1 : 0));
                    hashMap13.put("launches", hashMap14);
                    hashMap10.put("application", hashMap13);
                    java.lang.String optString6 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "adobe_xdm", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString6)) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data is null.", new java.lang.Object[0]);
                    } else {
                        try {
                            java.util.Map<java.lang.String, java.lang.Object> map2 = com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(optString6));
                            if (map2 == null) {
                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data conversion to map failed.", new java.lang.Object[0]);
                            } else {
                                java.util.Map map3 = (map2.containsKey("cjm") && (map2.get("cjm") instanceof java.util.Map)) ? (java.util.Map) map2.get("cjm") : null;
                                if (map2.containsKey("mixins") && (map2.get("mixins") instanceof java.util.Map)) {
                                    map3 = (java.util.Map) map2.get("mixins");
                                }
                                if (map3 == null) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send cjm xdm data with the tracking, Missing XDM data.", new java.lang.Object[0]);
                                } else {
                                    hashMap10.putAll(map3);
                                    if (map3.containsKey("_experience") && (map3.get("_experience") instanceof java.util.Map)) {
                                        java.util.Map map4 = (java.util.Map) map3.get("_experience");
                                        if (map4.containsKey("customerJourneyManagement") && (map4.get("customerJourneyManagement") instanceof java.util.Map)) {
                                            java.util.Map map5 = (java.util.Map) map4.get("customerJourneyManagement");
                                            map5.putAll(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject("{\n   \"messageProfile\":{\n      \"channel\":{\n         \"_id\":\"https://ns.adobe.com/xdm/channels/push\"\n      }\n   },\n   \"pushChannelContext\":{\n      \"platform\":\"fcm\"\n   }\n}")));
                                            map4.put("customerJourneyManagement", map5);
                                            hashMap10.put("_experience", map4);
                                        }
                                    } else {
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send CJM XDM data with the tracking, required keys are missing.", new java.lang.Object[0]);
                                    }
                                }
                            }
                        } catch (java.lang.ClassCastException | org.json.JSONException e) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe data is malformed : %s", e.getMessage());
                        }
                    }
                    try {
                        if (hashMap10.containsKey("_experience")) {
                            java.lang.Object obj3 = hashMap10.get("_experience");
                            if (obj3 instanceof java.util.Map) {
                                java.util.Map map6 = (java.util.Map) obj3;
                                if (map6.containsKey("decisioning")) {
                                    java.lang.Object obj4 = map6.get("decisioning");
                                    if (obj4 instanceof java.util.Map) {
                                        java.util.Map map7 = (java.util.Map) obj4;
                                        if (map7.containsKey("exdRequestID")) {
                                            java.util.HashMap hashMap15 = new java.util.HashMap();
                                            if (!optBoolean) {
                                                hashMap15.put("dismiss", 1);
                                            } else if (optString5 != null) {
                                                hashMap15.put("interact", 1);
                                            } else {
                                                hashMap15.put("interact", 1);
                                            }
                                            map7.put("propositionEventType", hashMap15);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (java.lang.ClassCastException e2) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to add propositionEventType, error: %s", e2.getMessage());
                    }
                    java.util.HashMap hashMap16 = new java.util.HashMap();
                    hashMap16.put("xdm", hashMap10);
                    hashMap16.put(com.adjust.sdk.Constants.REFERRER_API_META, hashMap8);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.TRACKING_INITIATED, messagingExtension.getApi(), event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push tracking edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap16, messagingExtension.getApi(), event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges(event);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRanges)) {
                        return;
                    }
                    if (edgePersonalizationResponseHandler.getOutputSizeshNQ4ISI.containsKey(highSpeedVideoFpsRanges) || "TESTING_ID".equals(highSpeedVideoFpsRanges)) {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Processing propositions from personalization:decisions network response for event %s.", highSpeedVideoFpsRanges);
                        java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "payload", null);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        java.util.List<com.adobe.marketing.mobile.messaging.Proposition> highSpeedVideoSizes2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) optTypedListOfMap);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        for (com.adobe.marketing.mobile.messaging.Proposition proposition : highSpeedVideoSizes2) {
                            edgePersonalizationResponseHandler.getOutputFormats = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(proposition.getScope()), proposition, edgePersonalizationResponseHandler.getOutputFormats);
                        }
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputFormats(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler2 = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list2 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI) || com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list2)) {
                        return;
                    }
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "End of streaming response events for requesting event %s", highResolutionOutputSizeshNQ4ISI);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list3 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list3)) {
                        str = "EdgePersonalizationResponseHandler";
                        str2 = highResolutionOutputSizeshNQ4ISI;
                        list = list2;
                    } else {
                        com.adobe.marketing.mobile.messaging.ParsedPropositions parsedPropositions = new com.adobe.marketing.mobile.messaging.ParsedPropositions(edgePersonalizationResponseHandler2.getOutputFormats, list3, edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI);
                        java.util.Set<com.adobe.marketing.mobile.messaging.Surface> keySet = edgePersonalizationResponseHandler2.getOutputFormats.keySet();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list3);
                        arrayList2.removeAll(keySet);
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map8 = parsedPropositions.getHighSpeedVideoFpsRanges;
                        java.util.HashMap hashMap17 = new java.util.HashMap(edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor);
                        hashMap17.putAll(map8);
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            hashMap17.remove((com.adobe.marketing.mobile.messaging.Surface) it.next());
                        }
                        edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor = hashMap17;
                        edgePersonalizationResponseHandler2.getOutputStallDuration.putAll(parsedPropositions.Camera2StreamConfigurationMap);
                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList2)) {
                            for (java.util.Map.Entry entry : new java.util.HashMap(edgePersonalizationResponseHandler2.getOutputStallDuration).entrySet()) {
                                if (arrayList2.contains(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(((com.adobe.marketing.mobile.messaging.PropositionInfo) entry.getValue()).getHighSpeedVideoSizes))) {
                                    edgePersonalizationResponseHandler2.getOutputStallDuration.remove(entry.getKey());
                                }
                            }
                        }
                        com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map9 = parsedPropositions.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor3 = messagingCacheUtilities.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor3 == null) {
                            highSpeedVideoFpsRangesFor3 = new java.util.HashMap<>();
                        }
                        highSpeedVideoFpsRangesFor3.putAll(map9);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it2 = highSpeedVideoFpsRangesFor3.entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> next = it2.next();
                            java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it3 = it2;
                            if (arrayList2.contains(next.getKey())) {
                                arrayList3.add(next.getKey());
                            }
                            it2 = it3;
                        }
                        java.util.Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            highSpeedVideoFpsRangesFor3.remove((com.adobe.marketing.mobile.messaging.Surface) it4.next());
                        }
                        ?? hashMap18 = new java.util.HashMap(highSpeedVideoFpsRangesFor3);
                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap18)) {
                            messagingCacheUtilities.getHighSpeedVideoSizes.remove("messaging", "propositions");
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "In-app messaging cache has been deleted.", new java.lang.Object[0]);
                            str3 = "EdgePersonalizationResponseHandler";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            list = list2;
                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        } else {
                            list = list2;
                            ?? r5 = "Creating new cached propositions";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            ?? r42 = new java.lang.Object[0];
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Creating new cached propositions", r42);
                            try {
                                try {
                                    r42 = new java.io.ByteArrayOutputStream();
                                } catch (java.lang.Throwable th2) {
                                    java.io.InputStream inputStream2 = hashMap18;
                                    outputStream = r5;
                                    inputStream = inputStream2;
                                    th = th2;
                                    r4 = r42;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException e3) {
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e3);
                                            throw th;
                                        }
                                    }
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    if (inputStream == null) {
                                        throw th;
                                    }
                                    inputStream.close();
                                    throw th;
                                }
                                try {
                                    r5 = new java.io.ObjectOutputStream(r42);
                                    try {
                                        r5.writeObject(hashMap18);
                                        r5.flush();
                                        hashMap18 = new java.io.ByteArrayInputStream(r42.toByteArray());
                                        try {
                                            str3 = "EdgePersonalizationResponseHandler";
                                        } catch (java.io.IOException e4) {
                                            e = e4;
                                            str3 = "EdgePersonalizationResponseHandler";
                                        }
                                        try {
                                            never = com.adobe.marketing.mobile.services.caching.CacheExpiry.never();
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        } catch (java.io.IOException e5) {
                                            e = e5;
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (java.io.IOException e6) {
                                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e6);
                                                }
                                            }
                                            if (r42 != 0) {
                                                r42.close();
                                            }
                                            if (hashMap18 != 0) {
                                                hashMap18.close();
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList4222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222);
                                            arrayList4222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222);
                                            java.lang.String str5222222222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                        try {
                                            messagingCacheUtilities.getHighSpeedVideoSizes.set("messaging", "propositions", new com.adobe.marketing.mobile.services.caching.CacheEntry(hashMap18, never, null));
                                            try {
                                                r5.close();
                                                r42.close();
                                                hashMap18.close();
                                            } catch (java.io.IOException e7) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e7);
                                            }
                                        } catch (java.io.IOException e8) {
                                            e = e8;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                            }
                                            if (r42 != 0) {
                                            }
                                            if (hashMap18 != 0) {
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList42222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222222);
                                            arrayList42222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222222222);
                                            java.lang.String str52222222222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                    } catch (java.io.IOException e9) {
                                        e = e9;
                                        str3 = "EdgePersonalizationResponseHandler";
                                        str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        r42 = r42;
                                        r5 = r5;
                                        hashMap18 = 0;
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                        if (r5 != 0) {
                                        }
                                        if (r42 != 0) {
                                        }
                                        if (hashMap18 != 0) {
                                        }
                                        map = parsedPropositions.getHighSpeedVideoSizes;
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                        }
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                        }
                                        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                        }
                                        str = str3;
                                        java.util.ArrayList arrayList422222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222222);
                                        arrayList422222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                        edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222222222);
                                        java.lang.String str522222222222222222 = str2;
                                        edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222222222);
                                        edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                        com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                        highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222222222);
                                        if (highSpeedVideoSizes != null) {
                                        }
                                        highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                        }
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                        edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        outputStream = r5;
                                        obj2 = r42;
                                        inputStream = null;
                                        r4 = obj2;
                                        if (outputStream != null) {
                                        }
                                        if (r4 != 0) {
                                        }
                                        if (inputStream == null) {
                                        }
                                    }
                                } catch (java.io.IOException e10) {
                                    e = e10;
                                    str3 = "EdgePersonalizationResponseHandler";
                                    str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    z = r42;
                                    r5 = 0;
                                    r42 = z;
                                    hashMap18 = 0;
                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                    if (r5 != 0) {
                                    }
                                    if (r42 != 0) {
                                    }
                                    if (hashMap18 != 0) {
                                    }
                                    map = parsedPropositions.getHighSpeedVideoSizes;
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                    }
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                    }
                                    java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                    }
                                    str = str3;
                                    java.util.ArrayList arrayList4222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222222);
                                    arrayList4222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                    edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222);
                                    java.lang.String str5222222222222222222 = str2;
                                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222222222);
                                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222222222);
                                    if (highSpeedVideoSizes != null) {
                                    }
                                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                    }
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj = r42;
                                    th = th;
                                    obj2 = obj;
                                    outputStream = null;
                                    inputStream = null;
                                    r4 = obj2;
                                    if (outputStream != null) {
                                    }
                                    if (r4 != 0) {
                                    }
                                    if (inputStream == null) {
                                    }
                                }
                            } catch (java.io.IOException e11) {
                                e = e11;
                                str3 = "EdgePersonalizationResponseHandler";
                                str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                z = false;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj = null;
                            }
                        }
                        map = parsedPropositions.getHighSpeedVideoSizes;
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                            edgePersonalizationResponseHandler2.getHighSpeedVideoSizes.replaceRules(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap));
                            edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(new com.adobe.marketing.mobile.Event.Builder("Seed content cards", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).build());
                        }
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null || map.get(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION) != null) {
                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.util.Iterator<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> it5 = Camera2StreamConfigurationMap2222222222222222.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.addAll(it5.next().getConsequenceList());
                                }
                                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList();
                                try {
                                    java.util.Iterator it6 = arrayList5.iterator();
                                    while (it6.hasNext()) {
                                        java.util.Map<java.lang.String, java.lang.Object> detail = ((com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence) it6.next()).getDetail();
                                        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(detail)) {
                                            java.lang.String str6 = str4;
                                            java.util.List<java.lang.String> stringList = com.adobe.marketing.mobile.util.DataReader.getStringList(com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, detail, str6), "remoteAssets");
                                            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(stringList)) {
                                                for (java.lang.String str7 : stringList) {
                                                    if (com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str7) && !arrayList6.contains(str7)) {
                                                        str = str3;
                                                        try {
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Image asset to be cached (%s) ", str7);
                                                            arrayList6.add(str7);
                                                            str3 = str;
                                                        } catch (com.adobe.marketing.mobile.util.DataReaderException e12) {
                                                            e = e12;
                                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Failed to cache image asset, exception occurred %s", e.getLocalizedMessage());
                                                            java.util.ArrayList arrayList42222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222222222);
                                                            arrayList42222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222222222222);
                                                            java.lang.String str52222222222222222222 = str2;
                                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222222222222);
                                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222222222222);
                                                            if (highSpeedVideoSizes != null) {
                                                            }
                                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                                            }
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = str6;
                                        }
                                    }
                                    str = str3;
                                    com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities2 = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingCacheUtilities2.Camera2StreamConfigurationMap)) {
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the asset cache location is not available.", new java.lang.Object[0]);
                                    } else if (messagingCacheUtilities2.getHighSpeedVideoSizes == null) {
                                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the cache manager is not available.", new java.lang.Object[0]);
                                    } else {
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList6)) {
                                            for (java.lang.String str8 : arrayList6) {
                                                if (com.adobe.marketing.mobile.messaging.MessagingCacheUtilities.getHighSpeedVideoSizes(str8) && !arrayList7.contains(str8)) {
                                                    arrayList7.add(str8);
                                                    messagingCacheUtilities2.getHighSpeedVideoFpsRanges.put(str8, messagingCacheUtilities2.Camera2StreamConfigurationMap);
                                                }
                                            }
                                        }
                                        com.adobe.marketing.mobile.messaging.MessageAssetDownloader messageAssetDownloader = new com.adobe.marketing.mobile.messaging.MessageAssetDownloader(arrayList7);
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageAssetDownloader.getHighSpeedVideoSizes)) {
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Failed to download assets, the asset cache location is not available.", new java.lang.Object[0]);
                                        } else {
                                            java.util.List<java.lang.String> list4 = messageAssetDownloader.Camera2StreamConfigurationMap;
                                            if (list4 == null || list4.isEmpty()) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Empty list of assets provided, will not download any assets.", new java.lang.Object[0]);
                                            } else {
                                                java.io.File file = messageAssetDownloader.getHighSpeedVideoFpsRanges;
                                                if (file != null) {
                                                    messageAssetDownloader.Camera2StreamConfigurationMap(file, messageAssetDownloader.Camera2StreamConfigurationMap);
                                                }
                                                java.util.Iterator<java.lang.String> it7 = messageAssetDownloader.Camera2StreamConfigurationMap.iterator();
                                                while (it7.hasNext()) {
                                                    messageAssetDownloader.getHighResolutionOutputSizeshNQ4ISI(it7.next(), null);
                                                }
                                            }
                                        }
                                    }
                                } catch (com.adobe.marketing.mobile.util.DataReaderException e13) {
                                    e = e13;
                                    str = str3;
                                }
                                java.util.ArrayList arrayList422222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222222222);
                                arrayList422222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222222222222);
                            }
                            str = str3;
                            java.util.ArrayList arrayList4222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222222222);
                            arrayList4222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222222);
                        } else {
                            str = str3;
                        }
                    }
                    java.lang.String str522222222222222222222 = str2;
                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222222222222);
                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222222222222);
                    if (highSpeedVideoSizes != null) {
                        highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.call(java.lang.Boolean.TRUE);
                    }
                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                        java.util.HashMap hashMap19 = new java.util.HashMap();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it8 = highSpeedVideoFpsRangesFor.entrySet().iterator();
                        while (it8.hasNext()) {
                            java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it9 = it8.next().getValue().iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(it9.next().toEventData());
                            }
                        }
                        hashMap19.put("propositions", arrayList8);
                        edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Message propositions notification", com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.notification").setEventData(hashMap19).build());
                    } else {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Not dispatching a notification event, personalization:decisions response does not contain propositions.", new java.lang.Object[0]);
                    }
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.WILDCARD, com.adobe.marketing.mobile.EventSource.WILDCARD, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda1
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                java.lang.String name2 = event.getName();
                if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(name2) || !name2.equals("Rule Consequence Event (Spoof)")) {
                    messagingExtension.getHighSpeedVideoSizes.processEvent(event);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(event);
                } else if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDurationlomOqCM(event)) {
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.PropositionItem.getHighSpeedVideoFpsRanges(event));
                } else {
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "handleWildcardEvents - Ignoring rule consequence event(spoof), consequence is not of type 'schema'", new java.lang.Object[0]);
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.RULES_ENGINE, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda2
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDurationlomOqCM(event)) {
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "handleRuleEngineResponseEvents - Ignoring rule response event, consequence is not of type 'schema'", new java.lang.Object[0]);
                    return;
                }
                com.adobe.marketing.mobile.messaging.PropositionItem highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.PropositionItem.getHighSpeedVideoFpsRanges(event);
                if (highSpeedVideoFpsRanges == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "handleSchemaConsequence -  Ignoring rule consequence event, propositionItem is null", new java.lang.Object[0]);
                    return;
                }
                int i = com.adobe.marketing.mobile.messaging.MessagingExtension.AnonymousClass1.getHighSpeedVideoFpsRanges[highSpeedVideoFpsRanges.getSchema().ordinal()];
                if (i == 1) {
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges);
                    return;
                }
                if (i == 2) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                    if (highSpeedVideoFpsRanges != null) {
                        com.adobe.marketing.mobile.messaging.EventHistoryOperationSchemaData eventHistoryOperationSchemaData = !highSpeedVideoFpsRanges.Camera2StreamConfigurationMap.equals(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION) ? null : (com.adobe.marketing.mobile.messaging.EventHistoryOperationSchemaData) highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION);
                        if (eventHistoryOperationSchemaData == null) {
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring event history rule consequence with id %s, not in expected format.", highSpeedVideoFpsRanges.getItemId());
                            return;
                        }
                        java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(eventHistoryOperationSchemaData.getHighResolutionOutputSizeshNQ4ISI, "iam.id", null);
                        java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(eventHistoryOperationSchemaData.getHighResolutionOutputSizeshNQ4ISI, "iam.eventType", null);
                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring event history rule consequence with id %s, activity id or event type is empty.", highSpeedVideoFpsRanges.getItemId());
                            return;
                        }
                        if (optString2.equals("unqualify") || optString2.equals("disqualify")) {
                            for (java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> entry : edgePersonalizationResponseHandler.getHighSpeedVideoFpsRanges.entrySet()) {
                                com.adobe.marketing.mobile.messaging.Surface key = entry.getKey();
                                java.util.List<com.adobe.marketing.mobile.messaging.Proposition> value = entry.getValue();
                                java.util.List<com.adobe.marketing.mobile.messaging.Proposition> arrayList = new java.util.ArrayList<>(value);
                                for (com.adobe.marketing.mobile.messaging.Proposition proposition : value) {
                                    java.util.Map optTypedMap = com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(proposition.getHighSpeedVideoFpsRanges) ? null : com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, proposition.getHighSpeedVideoFpsRanges, "activity", null);
                                    if (optString.equals(com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap) ? "" : com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "id", ""))) {
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Removing content card proposition with activity id %s for surface %s from in-memory cache.", optString, key.getUri());
                                        arrayList.remove(proposition);
                                        com.adobe.marketing.mobile.messaging.ContentCardMapper.getInstance().removeContentCardSchemaData(proposition.getUniqueId());
                                    }
                                }
                                edgePersonalizationResponseHandler.getHighSpeedVideoFpsRanges.put(key, arrayList);
                            }
                        }
                    }
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.CONTENT_COMPLETE, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:217:0x066c  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x068f  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x0832  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x0845  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x084e  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x06aa  */
            /* JADX WARN: Removed duplicated region for block: B:353:0x063d A[Catch: IOException -> 0x0639, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:355:0x0642 A[Catch: IOException -> 0x0639, TRY_LEAVE, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:360:0x0635 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:377:0x0808 A[Catch: IOException -> 0x0804, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:379:0x080d A[Catch: IOException -> 0x0804, TRY_LEAVE, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:386:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:387:0x0800 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v11 */
            /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.HashMap, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v19, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v63 */
            /* JADX WARN: Type inference failed for: r4v64 */
            /* JADX WARN: Type inference failed for: r4v66 */
            /* JADX WARN: Type inference failed for: r4v67 */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.io.ObjectOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v41 */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void hear(com.adobe.marketing.mobile.Event event) {
                java.lang.String str;
                java.lang.String str2;
                java.util.List<com.adobe.marketing.mobile.messaging.Surface> list;
                com.adobe.marketing.mobile.messaging.CompletionHandler highSpeedVideoSizes;
                java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor;
                java.lang.Object obj;
                java.lang.String str3;
                java.lang.String str4;
                boolean z;
                java.io.OutputStream outputStream;
                java.io.InputStream inputStream;
                java.lang.Throwable th;
                java.lang.Object obj2;
                ?? r4;
                com.adobe.marketing.mobile.services.caching.CacheExpiry never;
                java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> map;
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if ((event == null || event.getEventData() == null) && (event == null || !event.getSource().equals(com.adobe.marketing.mobile.EventSource.REQUEST_RESET))) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Invalid event, ignoring.", new java.lang.Object[0]);
                    return;
                }
                java.util.HashMap hashMap = null;
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputFormats(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing manual request to refresh In-App Message definitions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputSizes(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to retrieve propositions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(event));
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputMinFrameDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to get cached proposition content.", new java.lang.Object[0]);
                    messagingExtension.getInputSizeshNQ4ISI.offer(event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to track propositions.", new java.lang.Object[0]);
                    java.util.Map<java.lang.String, java.lang.Object> optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "propositioninteraction", new java.util.HashMap());
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Cannot track proposition item, proposition interaction XDM is not available.", new java.lang.Object[0]);
                        return;
                    } else {
                        messagingExtension.sendPropositionInteraction(optTypedMap);
                        return;
                    }
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(event)) {
                    java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "pushidentifier", null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, token is null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult sharedState = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(sharedState == null ? null : sharedState.getValue(), optString, event.getTimestamp())) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Skipping the push token sync and shared state update.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult xDMSharedState = messagingExtension.getApi().getXDMSharedState("com.adobe.edge.identity", event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(xDMSharedState == null ? null : xDMSharedState.getValue());
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor2)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to sync the push token. ECID is unavailable for the user.", new java.lang.Object[0]);
                        return;
                    }
                    if (highSpeedVideoFpsRangesFor2 == null) {
                        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, ECID is null.", new java.lang.Object[0]);
                    } else {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("code", "ECID");
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("namespace", hashMap2);
                        hashMap3.put("id", highSpeedVideoFpsRangesFor2);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        hashMap4.put("identity", hashMap3);
                        hashMap4.put("appID", com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName());
                        hashMap4.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, optString);
                        hashMap4.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                        hashMap4.put("denylisted", java.lang.Boolean.FALSE);
                        arrayList.add(hashMap4);
                        java.util.HashMap hashMap5 = new java.util.HashMap();
                        hashMap5.put("pushNotificationDetails", arrayList);
                        java.util.HashMap hashMap6 = new java.util.HashMap();
                        hashMap6.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap5);
                        hashMap = hashMap6;
                    }
                    if (hashMap != null) {
                        java.util.HashMap hashMap7 = new java.util.HashMap();
                        hashMap7.put("pushidentifier", optString);
                        messagingExtension.getApi().createSharedState(hashMap7, event);
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push notification profile edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap, messagingExtension.getApi(), event);
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputSizeshNQ4ISI(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Clearing the push token from persistence and the Messaging shared state.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRangesFor(null, event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor((java.lang.String) null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizesFor(event)) {
                    com.adobe.marketing.mobile.SharedStateResult sharedState2 = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 == null ? null : sharedState2.getValue(), "messaging.eventDataset", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.NO_DATASET_CONFIGURED, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, experience event dataset id is empty. Check the messaging launch extension to add the experience event dataset.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                    if (eventData == null) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventData is null.", new java.lang.Object[0]);
                        return;
                    }
                    java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "eventType", "");
                    java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "messageId", "");
                    boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(eventData, "applicationOpened", false);
                    java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventType is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString4)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_MESSAGE_ID, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, messageId is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.HashMap hashMap8 = new java.util.HashMap();
                    java.util.HashMap hashMap9 = new java.util.HashMap();
                    hashMap9.put("datasetId", optString2);
                    hashMap8.put("collect", hashMap9);
                    java.util.HashMap hashMap10 = new java.util.HashMap();
                    java.util.HashMap hashMap11 = new java.util.HashMap();
                    java.util.HashMap hashMap12 = new java.util.HashMap();
                    if (optString5 != null) {
                        hashMap12.put("actionID", optString5);
                        hashMap11.put("customAction", hashMap12);
                    }
                    hashMap11.put("pushProvider", com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                    hashMap11.put("pushProviderMessageID", optString4);
                    hashMap10.put("eventType", optString3);
                    hashMap10.put("pushNotificationTracking", hashMap11);
                    java.util.HashMap hashMap13 = new java.util.HashMap();
                    java.util.HashMap hashMap14 = new java.util.HashMap();
                    hashMap14.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Integer.valueOf(optBoolean ? 1 : 0));
                    hashMap13.put("launches", hashMap14);
                    hashMap10.put("application", hashMap13);
                    java.lang.String optString6 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "adobe_xdm", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString6)) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data is null.", new java.lang.Object[0]);
                    } else {
                        try {
                            java.util.Map<java.lang.String, java.lang.Object> map2 = com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(optString6));
                            if (map2 == null) {
                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data conversion to map failed.", new java.lang.Object[0]);
                            } else {
                                java.util.Map map3 = (map2.containsKey("cjm") && (map2.get("cjm") instanceof java.util.Map)) ? (java.util.Map) map2.get("cjm") : null;
                                if (map2.containsKey("mixins") && (map2.get("mixins") instanceof java.util.Map)) {
                                    map3 = (java.util.Map) map2.get("mixins");
                                }
                                if (map3 == null) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send cjm xdm data with the tracking, Missing XDM data.", new java.lang.Object[0]);
                                } else {
                                    hashMap10.putAll(map3);
                                    if (map3.containsKey("_experience") && (map3.get("_experience") instanceof java.util.Map)) {
                                        java.util.Map map4 = (java.util.Map) map3.get("_experience");
                                        if (map4.containsKey("customerJourneyManagement") && (map4.get("customerJourneyManagement") instanceof java.util.Map)) {
                                            java.util.Map map5 = (java.util.Map) map4.get("customerJourneyManagement");
                                            map5.putAll(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject("{\n   \"messageProfile\":{\n      \"channel\":{\n         \"_id\":\"https://ns.adobe.com/xdm/channels/push\"\n      }\n   },\n   \"pushChannelContext\":{\n      \"platform\":\"fcm\"\n   }\n}")));
                                            map4.put("customerJourneyManagement", map5);
                                            hashMap10.put("_experience", map4);
                                        }
                                    } else {
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send CJM XDM data with the tracking, required keys are missing.", new java.lang.Object[0]);
                                    }
                                }
                            }
                        } catch (java.lang.ClassCastException | org.json.JSONException e) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe data is malformed : %s", e.getMessage());
                        }
                    }
                    try {
                        if (hashMap10.containsKey("_experience")) {
                            java.lang.Object obj3 = hashMap10.get("_experience");
                            if (obj3 instanceof java.util.Map) {
                                java.util.Map map6 = (java.util.Map) obj3;
                                if (map6.containsKey("decisioning")) {
                                    java.lang.Object obj4 = map6.get("decisioning");
                                    if (obj4 instanceof java.util.Map) {
                                        java.util.Map map7 = (java.util.Map) obj4;
                                        if (map7.containsKey("exdRequestID")) {
                                            java.util.HashMap hashMap15 = new java.util.HashMap();
                                            if (!optBoolean) {
                                                hashMap15.put("dismiss", 1);
                                            } else if (optString5 != null) {
                                                hashMap15.put("interact", 1);
                                            } else {
                                                hashMap15.put("interact", 1);
                                            }
                                            map7.put("propositionEventType", hashMap15);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (java.lang.ClassCastException e2) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to add propositionEventType, error: %s", e2.getMessage());
                    }
                    java.util.HashMap hashMap16 = new java.util.HashMap();
                    hashMap16.put("xdm", hashMap10);
                    hashMap16.put(com.adjust.sdk.Constants.REFERRER_API_META, hashMap8);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.TRACKING_INITIATED, messagingExtension.getApi(), event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push tracking edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap16, messagingExtension.getApi(), event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges(event);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRanges)) {
                        return;
                    }
                    if (edgePersonalizationResponseHandler.getOutputSizeshNQ4ISI.containsKey(highSpeedVideoFpsRanges) || "TESTING_ID".equals(highSpeedVideoFpsRanges)) {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Processing propositions from personalization:decisions network response for event %s.", highSpeedVideoFpsRanges);
                        java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "payload", null);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        java.util.List<com.adobe.marketing.mobile.messaging.Proposition> highSpeedVideoSizes2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) optTypedListOfMap);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        for (com.adobe.marketing.mobile.messaging.Proposition proposition : highSpeedVideoSizes2) {
                            edgePersonalizationResponseHandler.getOutputFormats = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(proposition.getScope()), proposition, edgePersonalizationResponseHandler.getOutputFormats);
                        }
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputFormats(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler2 = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list2 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI) || com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list2)) {
                        return;
                    }
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "End of streaming response events for requesting event %s", highResolutionOutputSizeshNQ4ISI);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list3 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list3)) {
                        str = "EdgePersonalizationResponseHandler";
                        str2 = highResolutionOutputSizeshNQ4ISI;
                        list = list2;
                    } else {
                        com.adobe.marketing.mobile.messaging.ParsedPropositions parsedPropositions = new com.adobe.marketing.mobile.messaging.ParsedPropositions(edgePersonalizationResponseHandler2.getOutputFormats, list3, edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI);
                        java.util.Set<com.adobe.marketing.mobile.messaging.Surface> keySet = edgePersonalizationResponseHandler2.getOutputFormats.keySet();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list3);
                        arrayList2.removeAll(keySet);
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map8 = parsedPropositions.getHighSpeedVideoFpsRanges;
                        java.util.HashMap hashMap17 = new java.util.HashMap(edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor);
                        hashMap17.putAll(map8);
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            hashMap17.remove((com.adobe.marketing.mobile.messaging.Surface) it.next());
                        }
                        edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor = hashMap17;
                        edgePersonalizationResponseHandler2.getOutputStallDuration.putAll(parsedPropositions.Camera2StreamConfigurationMap);
                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList2)) {
                            for (java.util.Map.Entry entry : new java.util.HashMap(edgePersonalizationResponseHandler2.getOutputStallDuration).entrySet()) {
                                if (arrayList2.contains(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(((com.adobe.marketing.mobile.messaging.PropositionInfo) entry.getValue()).getHighSpeedVideoSizes))) {
                                    edgePersonalizationResponseHandler2.getOutputStallDuration.remove(entry.getKey());
                                }
                            }
                        }
                        com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map9 = parsedPropositions.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor3 = messagingCacheUtilities.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor3 == null) {
                            highSpeedVideoFpsRangesFor3 = new java.util.HashMap<>();
                        }
                        highSpeedVideoFpsRangesFor3.putAll(map9);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it2 = highSpeedVideoFpsRangesFor3.entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> next = it2.next();
                            java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it3 = it2;
                            if (arrayList2.contains(next.getKey())) {
                                arrayList3.add(next.getKey());
                            }
                            it2 = it3;
                        }
                        java.util.Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            highSpeedVideoFpsRangesFor3.remove((com.adobe.marketing.mobile.messaging.Surface) it4.next());
                        }
                        ?? hashMap18 = new java.util.HashMap(highSpeedVideoFpsRangesFor3);
                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap18)) {
                            messagingCacheUtilities.getHighSpeedVideoSizes.remove("messaging", "propositions");
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "In-app messaging cache has been deleted.", new java.lang.Object[0]);
                            str3 = "EdgePersonalizationResponseHandler";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            list = list2;
                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        } else {
                            list = list2;
                            ?? r5 = "Creating new cached propositions";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            ?? r42 = new java.lang.Object[0];
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Creating new cached propositions", r42);
                            try {
                                try {
                                    r42 = new java.io.ByteArrayOutputStream();
                                } catch (java.lang.Throwable th2) {
                                    java.io.InputStream inputStream2 = hashMap18;
                                    outputStream = r5;
                                    inputStream = inputStream2;
                                    th = th2;
                                    r4 = r42;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException e3) {
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e3);
                                            throw th;
                                        }
                                    }
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    if (inputStream == null) {
                                        throw th;
                                    }
                                    inputStream.close();
                                    throw th;
                                }
                                try {
                                    r5 = new java.io.ObjectOutputStream(r42);
                                    try {
                                        r5.writeObject(hashMap18);
                                        r5.flush();
                                        hashMap18 = new java.io.ByteArrayInputStream(r42.toByteArray());
                                        try {
                                            str3 = "EdgePersonalizationResponseHandler";
                                        } catch (java.io.IOException e4) {
                                            e = e4;
                                            str3 = "EdgePersonalizationResponseHandler";
                                        }
                                        try {
                                            never = com.adobe.marketing.mobile.services.caching.CacheExpiry.never();
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        } catch (java.io.IOException e5) {
                                            e = e5;
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (java.io.IOException e6) {
                                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e6);
                                                }
                                            }
                                            if (r42 != 0) {
                                                r42.close();
                                            }
                                            if (hashMap18 != 0) {
                                                hashMap18.close();
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList4222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222222222);
                                            arrayList4222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222222);
                                            java.lang.String str522222222222222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                        try {
                                            messagingCacheUtilities.getHighSpeedVideoSizes.set("messaging", "propositions", new com.adobe.marketing.mobile.services.caching.CacheEntry(hashMap18, never, null));
                                            try {
                                                r5.close();
                                                r42.close();
                                                hashMap18.close();
                                            } catch (java.io.IOException e7) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e7);
                                            }
                                        } catch (java.io.IOException e8) {
                                            e = e8;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                            }
                                            if (r42 != 0) {
                                            }
                                            if (hashMap18 != 0) {
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList42222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222222222);
                                            arrayList42222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222222222222222);
                                            java.lang.String str5222222222222222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                    } catch (java.io.IOException e9) {
                                        e = e9;
                                        str3 = "EdgePersonalizationResponseHandler";
                                        str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        r42 = r42;
                                        r5 = r5;
                                        hashMap18 = 0;
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                        if (r5 != 0) {
                                        }
                                        if (r42 != 0) {
                                        }
                                        if (hashMap18 != 0) {
                                        }
                                        map = parsedPropositions.getHighSpeedVideoSizes;
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                        }
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                        }
                                        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                        }
                                        str = str3;
                                        java.util.ArrayList arrayList422222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222222222);
                                        arrayList422222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                        edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222222222222222);
                                        java.lang.String str52222222222222222222222 = str2;
                                        edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222222222222222);
                                        edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                        com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                        highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222222222222222);
                                        if (highSpeedVideoSizes != null) {
                                        }
                                        highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                        }
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                        edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        outputStream = r5;
                                        obj2 = r42;
                                        inputStream = null;
                                        r4 = obj2;
                                        if (outputStream != null) {
                                        }
                                        if (r4 != 0) {
                                        }
                                        if (inputStream == null) {
                                        }
                                    }
                                } catch (java.io.IOException e10) {
                                    e = e10;
                                    str3 = "EdgePersonalizationResponseHandler";
                                    str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    z = r42;
                                    r5 = 0;
                                    r42 = z;
                                    hashMap18 = 0;
                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                    if (r5 != 0) {
                                    }
                                    if (r42 != 0) {
                                    }
                                    if (hashMap18 != 0) {
                                    }
                                    map = parsedPropositions.getHighSpeedVideoSizes;
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                    }
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                    }
                                    java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                    }
                                    str = str3;
                                    java.util.ArrayList arrayList4222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222222222222);
                                    arrayList4222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                    edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222222222);
                                    java.lang.String str522222222222222222222222 = str2;
                                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222222222222222);
                                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222222222222222);
                                    if (highSpeedVideoSizes != null) {
                                    }
                                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                    }
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj = r42;
                                    th = th;
                                    obj2 = obj;
                                    outputStream = null;
                                    inputStream = null;
                                    r4 = obj2;
                                    if (outputStream != null) {
                                    }
                                    if (r4 != 0) {
                                    }
                                    if (inputStream == null) {
                                    }
                                }
                            } catch (java.io.IOException e11) {
                                e = e11;
                                str3 = "EdgePersonalizationResponseHandler";
                                str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                z = false;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj = null;
                            }
                        }
                        map = parsedPropositions.getHighSpeedVideoSizes;
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                            edgePersonalizationResponseHandler2.getHighSpeedVideoSizes.replaceRules(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap));
                            edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(new com.adobe.marketing.mobile.Event.Builder("Seed content cards", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).build());
                        }
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null || map.get(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION) != null) {
                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.util.Iterator<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> it5 = Camera2StreamConfigurationMap22222222222222222222.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.addAll(it5.next().getConsequenceList());
                                }
                                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList();
                                try {
                                    java.util.Iterator it6 = arrayList5.iterator();
                                    while (it6.hasNext()) {
                                        java.util.Map<java.lang.String, java.lang.Object> detail = ((com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence) it6.next()).getDetail();
                                        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(detail)) {
                                            java.lang.String str6 = str4;
                                            java.util.List<java.lang.String> stringList = com.adobe.marketing.mobile.util.DataReader.getStringList(com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, detail, str6), "remoteAssets");
                                            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(stringList)) {
                                                for (java.lang.String str7 : stringList) {
                                                    if (com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str7) && !arrayList6.contains(str7)) {
                                                        str = str3;
                                                        try {
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Image asset to be cached (%s) ", str7);
                                                            arrayList6.add(str7);
                                                            str3 = str;
                                                        } catch (com.adobe.marketing.mobile.util.DataReaderException e12) {
                                                            e = e12;
                                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Failed to cache image asset, exception occurred %s", e.getLocalizedMessage());
                                                            java.util.ArrayList arrayList42222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222222222222);
                                                            arrayList42222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222222222222222222);
                                                            java.lang.String str5222222222222222222222222 = str2;
                                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222222222222222);
                                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222222222222222);
                                                            if (highSpeedVideoSizes != null) {
                                                            }
                                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                                            }
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = str6;
                                        }
                                    }
                                    str = str3;
                                    com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities2 = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingCacheUtilities2.Camera2StreamConfigurationMap)) {
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the asset cache location is not available.", new java.lang.Object[0]);
                                    } else if (messagingCacheUtilities2.getHighSpeedVideoSizes == null) {
                                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the cache manager is not available.", new java.lang.Object[0]);
                                    } else {
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList6)) {
                                            for (java.lang.String str8 : arrayList6) {
                                                if (com.adobe.marketing.mobile.messaging.MessagingCacheUtilities.getHighSpeedVideoSizes(str8) && !arrayList7.contains(str8)) {
                                                    arrayList7.add(str8);
                                                    messagingCacheUtilities2.getHighSpeedVideoFpsRanges.put(str8, messagingCacheUtilities2.Camera2StreamConfigurationMap);
                                                }
                                            }
                                        }
                                        com.adobe.marketing.mobile.messaging.MessageAssetDownloader messageAssetDownloader = new com.adobe.marketing.mobile.messaging.MessageAssetDownloader(arrayList7);
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageAssetDownloader.getHighSpeedVideoSizes)) {
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Failed to download assets, the asset cache location is not available.", new java.lang.Object[0]);
                                        } else {
                                            java.util.List<java.lang.String> list4 = messageAssetDownloader.Camera2StreamConfigurationMap;
                                            if (list4 == null || list4.isEmpty()) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Empty list of assets provided, will not download any assets.", new java.lang.Object[0]);
                                            } else {
                                                java.io.File file = messageAssetDownloader.getHighSpeedVideoFpsRanges;
                                                if (file != null) {
                                                    messageAssetDownloader.Camera2StreamConfigurationMap(file, messageAssetDownloader.Camera2StreamConfigurationMap);
                                                }
                                                java.util.Iterator<java.lang.String> it7 = messageAssetDownloader.Camera2StreamConfigurationMap.iterator();
                                                while (it7.hasNext()) {
                                                    messageAssetDownloader.getHighResolutionOutputSizeshNQ4ISI(it7.next(), null);
                                                }
                                            }
                                        }
                                    }
                                } catch (com.adobe.marketing.mobile.util.DataReaderException e13) {
                                    e = e13;
                                    str = str3;
                                }
                                java.util.ArrayList arrayList422222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222222222222);
                                arrayList422222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222222222222222222);
                            }
                            str = str3;
                            java.util.ArrayList arrayList4222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222222222222);
                            arrayList4222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222222222222);
                        } else {
                            str = str3;
                        }
                    }
                    java.lang.String str52222222222222222222222222 = str2;
                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222222222222222222);
                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222222222222222222);
                    if (highSpeedVideoSizes != null) {
                        highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.call(java.lang.Boolean.TRUE);
                    }
                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                        java.util.HashMap hashMap19 = new java.util.HashMap();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it8 = highSpeedVideoFpsRangesFor.entrySet().iterator();
                        while (it8.hasNext()) {
                            java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it9 = it8.next().getValue().iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(it9.next().toEventData());
                            }
                        }
                        hashMap19.put("propositions", arrayList8);
                        edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Message propositions notification", com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.notification").setEventData(hashMap19).build());
                    } else {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Not dispatching a notification event, personalization:decisions response does not contain propositions.", new java.lang.Object[0]);
                    }
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.eventHistoryWrite", new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:217:0x066c  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x068f  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x0832  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x0845  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x084e  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x06aa  */
            /* JADX WARN: Removed duplicated region for block: B:353:0x063d A[Catch: IOException -> 0x0639, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:355:0x0642 A[Catch: IOException -> 0x0639, TRY_LEAVE, TryCatch #0 {IOException -> 0x0639, blocks: (B:361:0x0635, B:353:0x063d, B:355:0x0642), top: B:360:0x0635 }] */
            /* JADX WARN: Removed duplicated region for block: B:360:0x0635 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:377:0x0808 A[Catch: IOException -> 0x0804, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:379:0x080d A[Catch: IOException -> 0x0804, TRY_LEAVE, TryCatch #8 {IOException -> 0x0804, blocks: (B:388:0x0800, B:377:0x0808, B:379:0x080d), top: B:387:0x0800 }] */
            /* JADX WARN: Removed duplicated region for block: B:386:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:387:0x0800 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v11 */
            /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v13 */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.HashMap, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v19, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r4v63 */
            /* JADX WARN: Type inference failed for: r4v64 */
            /* JADX WARN: Type inference failed for: r4v66 */
            /* JADX WARN: Type inference failed for: r4v67 */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.io.ObjectOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r5v41 */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void hear(com.adobe.marketing.mobile.Event event) {
                java.lang.String str;
                java.lang.String str2;
                java.util.List<com.adobe.marketing.mobile.messaging.Surface> list;
                com.adobe.marketing.mobile.messaging.CompletionHandler highSpeedVideoSizes;
                java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor;
                java.lang.Object obj;
                java.lang.String str3;
                java.lang.String str4;
                boolean z;
                java.io.OutputStream outputStream;
                java.io.InputStream inputStream;
                java.lang.Throwable th;
                java.lang.Object obj2;
                ?? r4;
                com.adobe.marketing.mobile.services.caching.CacheExpiry never;
                java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> map;
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if ((event == null || event.getEventData() == null) && (event == null || !event.getSource().equals(com.adobe.marketing.mobile.EventSource.REQUEST_RESET))) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Invalid event, ignoring.", new java.lang.Object[0]);
                    return;
                }
                java.util.HashMap hashMap = null;
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputFormats(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing manual request to refresh In-App Message definitions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputSizes(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to retrieve propositions from the remote.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(event));
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputMinFrameDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to get cached proposition content.", new java.lang.Object[0]);
                    messagingExtension.getInputSizeshNQ4ISI.offer(event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDuration(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Processing request to track propositions.", new java.lang.Object[0]);
                    java.util.Map<java.lang.String, java.lang.Object> optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "propositioninteraction", new java.util.HashMap());
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Cannot track proposition item, proposition interaction XDM is not available.", new java.lang.Object[0]);
                        return;
                    } else {
                        messagingExtension.sendPropositionInteraction(optTypedMap);
                        return;
                    }
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(event)) {
                    java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "pushidentifier", null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, token is null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult sharedState = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(sharedState == null ? null : sharedState.getValue(), optString, event.getTimestamp())) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Skipping the push token sync and shared state update.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.SharedStateResult xDMSharedState = messagingExtension.getApi().getXDMSharedState("com.adobe.edge.identity", event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(xDMSharedState == null ? null : xDMSharedState.getValue());
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor2)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to sync the push token. ECID is unavailable for the user.", new java.lang.Object[0]);
                        return;
                    }
                    if (highSpeedVideoFpsRangesFor2 == null) {
                        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to sync push token, ECID is null.", new java.lang.Object[0]);
                    } else {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("code", "ECID");
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("namespace", hashMap2);
                        hashMap3.put("id", highSpeedVideoFpsRangesFor2);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        hashMap4.put("identity", hashMap3);
                        hashMap4.put("appID", com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName());
                        hashMap4.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, optString);
                        hashMap4.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                        hashMap4.put("denylisted", java.lang.Boolean.FALSE);
                        arrayList.add(hashMap4);
                        java.util.HashMap hashMap5 = new java.util.HashMap();
                        hashMap5.put("pushNotificationDetails", arrayList);
                        java.util.HashMap hashMap6 = new java.util.HashMap();
                        hashMap6.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap5);
                        hashMap = hashMap6;
                    }
                    if (hashMap != null) {
                        java.util.HashMap hashMap7 = new java.util.HashMap();
                        hashMap7.put("pushidentifier", optString);
                        messagingExtension.getApi().createSharedState(hashMap7, event);
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push notification profile edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap, messagingExtension.getApi(), event);
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getInputSizeshNQ4ISI(event)) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Clearing the push token from persistence and the Messaging shared state.", new java.lang.Object[0]);
                    messagingExtension.getHighSpeedVideoFpsRangesFor(null, event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor((java.lang.String) null);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizesFor(event)) {
                    com.adobe.marketing.mobile.SharedStateResult sharedState2 = messagingExtension.getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
                    java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(sharedState2 == null ? null : sharedState2.getValue(), "messaging.eventDataset", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.NO_DATASET_CONFIGURED, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, experience event dataset id is empty. Check the messaging launch extension to add the experience event dataset.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                    if (eventData == null) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventData is null.", new java.lang.Object[0]);
                        return;
                    }
                    java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "eventType", "");
                    java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "messageId", "");
                    boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(eventData, "applicationOpened", false);
                    java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, null);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.UNKNOWN_ERROR, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, eventType is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString4)) {
                        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.INVALID_MESSAGE_ID, messagingExtension.getApi(), event);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Unable to track push notification interaction, messageId is either null or empty.", new java.lang.Object[0]);
                        return;
                    }
                    java.util.HashMap hashMap8 = new java.util.HashMap();
                    java.util.HashMap hashMap9 = new java.util.HashMap();
                    hashMap9.put("datasetId", optString2);
                    hashMap8.put("collect", hashMap9);
                    java.util.HashMap hashMap10 = new java.util.HashMap();
                    java.util.HashMap hashMap11 = new java.util.HashMap();
                    java.util.HashMap hashMap12 = new java.util.HashMap();
                    if (optString5 != null) {
                        hashMap12.put("actionID", optString5);
                        hashMap11.put("customAction", hashMap12);
                    }
                    hashMap11.put("pushProvider", com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM);
                    hashMap11.put("pushProviderMessageID", optString4);
                    hashMap10.put("eventType", optString3);
                    hashMap10.put("pushNotificationTracking", hashMap11);
                    java.util.HashMap hashMap13 = new java.util.HashMap();
                    java.util.HashMap hashMap14 = new java.util.HashMap();
                    hashMap14.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Integer.valueOf(optBoolean ? 1 : 0));
                    hashMap13.put("launches", hashMap14);
                    hashMap10.put("application", hashMap13);
                    java.lang.String optString6 = com.adobe.marketing.mobile.util.DataReader.optString(eventData, "adobe_xdm", "");
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString6)) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data is null.", new java.lang.Object[0]);
                    } else {
                        try {
                            java.util.Map<java.lang.String, java.lang.Object> map2 = com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(optString6));
                            if (map2 == null) {
                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe XDM data conversion to map failed.", new java.lang.Object[0]);
                            } else {
                                java.util.Map map3 = (map2.containsKey("cjm") && (map2.get("cjm") instanceof java.util.Map)) ? (java.util.Map) map2.get("cjm") : null;
                                if (map2.containsKey("mixins") && (map2.get("mixins") instanceof java.util.Map)) {
                                    map3 = (java.util.Map) map2.get("mixins");
                                }
                                if (map3 == null) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send cjm xdm data with the tracking, Missing XDM data.", new java.lang.Object[0]);
                                } else {
                                    hashMap10.putAll(map3);
                                    if (map3.containsKey("_experience") && (map3.get("_experience") instanceof java.util.Map)) {
                                        java.util.Map map4 = (java.util.Map) map3.get("_experience");
                                        if (map4.containsKey("customerJourneyManagement") && (map4.get("customerJourneyManagement") instanceof java.util.Map)) {
                                            java.util.Map map5 = (java.util.Map) map4.get("customerJourneyManagement");
                                            map5.putAll(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject("{\n   \"messageProfile\":{\n      \"channel\":{\n         \"_id\":\"https://ns.adobe.com/xdm/channels/push\"\n      }\n   },\n   \"pushChannelContext\":{\n      \"platform\":\"fcm\"\n   }\n}")));
                                            map4.put("customerJourneyManagement", map5);
                                            hashMap10.put("_experience", map4);
                                        }
                                    } else {
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send CJM XDM data with the tracking, required keys are missing.", new java.lang.Object[0]);
                                    }
                                }
                            }
                        } catch (java.lang.ClassCastException | org.json.JSONException e) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to send Adobe data with the tracking data, Adobe data is malformed : %s", e.getMessage());
                        }
                    }
                    try {
                        if (hashMap10.containsKey("_experience")) {
                            java.lang.Object obj3 = hashMap10.get("_experience");
                            if (obj3 instanceof java.util.Map) {
                                java.util.Map map6 = (java.util.Map) obj3;
                                if (map6.containsKey("decisioning")) {
                                    java.lang.Object obj4 = map6.get("decisioning");
                                    if (obj4 instanceof java.util.Map) {
                                        java.util.Map map7 = (java.util.Map) obj4;
                                        if (map7.containsKey("exdRequestID")) {
                                            java.util.HashMap hashMap15 = new java.util.HashMap();
                                            if (!optBoolean) {
                                                hashMap15.put("dismiss", 1);
                                            } else if (optString5 != null) {
                                                hashMap15.put("interact", 1);
                                            } else {
                                                hashMap15.put("interact", 1);
                                            }
                                            map7.put("propositionEventType", hashMap15);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (java.lang.ClassCastException e2) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Failed to add propositionEventType, error: %s", e2.getMessage());
                    }
                    java.util.HashMap hashMap16 = new java.util.HashMap();
                    hashMap16.put("xdm", hashMap10);
                    hashMap16.put(com.adjust.sdk.Constants.REFERRER_API_META, hashMap8);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus.TRACKING_INITIATED, messagingExtension.getApi(), event);
                    com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Push tracking edge event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap16, messagingExtension.getApi(), event);
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges(event);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoFpsRanges)) {
                        return;
                    }
                    if (edgePersonalizationResponseHandler.getOutputSizeshNQ4ISI.containsKey(highSpeedVideoFpsRanges) || "TESTING_ID".equals(highSpeedVideoFpsRanges)) {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Processing propositions from personalization:decisions network response for event %s.", highSpeedVideoFpsRanges);
                        java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "payload", null);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        java.util.List<com.adobe.marketing.mobile.messaging.Proposition> highSpeedVideoSizes2 = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes((java.util.List<java.util.Map<java.lang.String, java.lang.Object>>) optTypedListOfMap);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Ignoring personalization:decisions response with no propositions.", new java.lang.Object[0]);
                            return;
                        }
                        for (com.adobe.marketing.mobile.messaging.Proposition proposition : highSpeedVideoSizes2) {
                            edgePersonalizationResponseHandler.getOutputFormats = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(proposition.getScope()), proposition, edgePersonalizationResponseHandler.getOutputFormats);
                        }
                        return;
                    }
                    return;
                }
                if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputFormats(event)) {
                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler2 = messagingExtension.getHighSpeedVideoFpsRanges;
                    java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list2 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI) || com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list2)) {
                        return;
                    }
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "End of streaming response events for requesting event %s", highResolutionOutputSizeshNQ4ISI);
                    java.util.List<com.adobe.marketing.mobile.messaging.Surface> list3 = edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.get(highResolutionOutputSizeshNQ4ISI);
                    if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list3)) {
                        str = "EdgePersonalizationResponseHandler";
                        str2 = highResolutionOutputSizeshNQ4ISI;
                        list = list2;
                    } else {
                        com.adobe.marketing.mobile.messaging.ParsedPropositions parsedPropositions = new com.adobe.marketing.mobile.messaging.ParsedPropositions(edgePersonalizationResponseHandler2.getOutputFormats, list3, edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI);
                        java.util.Set<com.adobe.marketing.mobile.messaging.Surface> keySet = edgePersonalizationResponseHandler2.getOutputFormats.keySet();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list3);
                        arrayList2.removeAll(keySet);
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map8 = parsedPropositions.getHighSpeedVideoFpsRanges;
                        java.util.HashMap hashMap17 = new java.util.HashMap(edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor);
                        hashMap17.putAll(map8);
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            hashMap17.remove((com.adobe.marketing.mobile.messaging.Surface) it.next());
                        }
                        edgePersonalizationResponseHandler2.getHighSpeedVideoSizesFor = hashMap17;
                        edgePersonalizationResponseHandler2.getOutputStallDuration.putAll(parsedPropositions.Camera2StreamConfigurationMap);
                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList2)) {
                            for (java.util.Map.Entry entry : new java.util.HashMap(edgePersonalizationResponseHandler2.getOutputStallDuration).entrySet()) {
                                if (arrayList2.contains(com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(((com.adobe.marketing.mobile.messaging.PropositionInfo) entry.getValue()).getHighSpeedVideoSizes))) {
                                    edgePersonalizationResponseHandler2.getOutputStallDuration.remove(entry.getKey());
                                }
                            }
                        }
                        com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map9 = parsedPropositions.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor3 = messagingCacheUtilities.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor3 == null) {
                            highSpeedVideoFpsRangesFor3 = new java.util.HashMap<>();
                        }
                        highSpeedVideoFpsRangesFor3.putAll(map9);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it2 = highSpeedVideoFpsRangesFor3.entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> next = it2.next();
                            java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it3 = it2;
                            if (arrayList2.contains(next.getKey())) {
                                arrayList3.add(next.getKey());
                            }
                            it2 = it3;
                        }
                        java.util.Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            highSpeedVideoFpsRangesFor3.remove((com.adobe.marketing.mobile.messaging.Surface) it4.next());
                        }
                        ?? hashMap18 = new java.util.HashMap(highSpeedVideoFpsRangesFor3);
                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap18)) {
                            messagingCacheUtilities.getHighSpeedVideoSizes.remove("messaging", "propositions");
                            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "In-app messaging cache has been deleted.", new java.lang.Object[0]);
                            str3 = "EdgePersonalizationResponseHandler";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            list = list2;
                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        } else {
                            list = list2;
                            ?? r5 = "Creating new cached propositions";
                            str2 = highResolutionOutputSizeshNQ4ISI;
                            ?? r42 = new java.lang.Object[0];
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Creating new cached propositions", r42);
                            try {
                                try {
                                    r42 = new java.io.ByteArrayOutputStream();
                                } catch (java.lang.Throwable th2) {
                                    java.io.InputStream inputStream2 = hashMap18;
                                    outputStream = r5;
                                    inputStream = inputStream2;
                                    th = th2;
                                    r4 = r42;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (java.io.IOException e3) {
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e3);
                                            throw th;
                                        }
                                    }
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    if (inputStream == null) {
                                        throw th;
                                    }
                                    inputStream.close();
                                    throw th;
                                }
                                try {
                                    r5 = new java.io.ObjectOutputStream(r42);
                                    try {
                                        r5.writeObject(hashMap18);
                                        r5.flush();
                                        hashMap18 = new java.io.ByteArrayInputStream(r42.toByteArray());
                                        try {
                                            str3 = "EdgePersonalizationResponseHandler";
                                        } catch (java.io.IOException e4) {
                                            e = e4;
                                            str3 = "EdgePersonalizationResponseHandler";
                                        }
                                        try {
                                            never = com.adobe.marketing.mobile.services.caching.CacheExpiry.never();
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        } catch (java.io.IOException e5) {
                                            e = e5;
                                            str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (java.io.IOException e6) {
                                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e6);
                                                }
                                            }
                                            if (r42 != 0) {
                                                r42.close();
                                            }
                                            if (hashMap18 != 0) {
                                                hashMap18.close();
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList4222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222222222222);
                                            arrayList4222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222222222222);
                                            java.lang.String str52222222222222222222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222222222222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222222222222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                        try {
                                            messagingCacheUtilities.getHighSpeedVideoSizes.set("messaging", "propositions", new com.adobe.marketing.mobile.services.caching.CacheEntry(hashMap18, never, null));
                                            try {
                                                r5.close();
                                                r42.close();
                                                hashMap18.close();
                                            } catch (java.io.IOException e7) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to close the ObjectOutputStream (%s) ", e7);
                                            }
                                        } catch (java.io.IOException e8) {
                                            e = e8;
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                            if (r5 != 0) {
                                            }
                                            if (r42 != 0) {
                                            }
                                            if (hashMap18 != 0) {
                                            }
                                            map = parsedPropositions.getHighSpeedVideoSizes;
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                            com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                            }
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                            }
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                            }
                                            str = str3;
                                            java.util.ArrayList arrayList42222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222222222222);
                                            arrayList42222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222222222222222222222);
                                            java.lang.String str522222222222222222222222222 = str2;
                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222222222222222222);
                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222222222222222222);
                                            if (highSpeedVideoSizes != null) {
                                            }
                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                            }
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                        }
                                    } catch (java.io.IOException e9) {
                                        e = e9;
                                        str3 = "EdgePersonalizationResponseHandler";
                                        str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                        r42 = r42;
                                        r5 = r5;
                                        hashMap18 = 0;
                                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                        if (r5 != 0) {
                                        }
                                        if (r42 != 0) {
                                        }
                                        if (hashMap18 != 0) {
                                        }
                                        map = parsedPropositions.getHighSpeedVideoSizes;
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                        }
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                        }
                                        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap2222222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                        }
                                        str = str3;
                                        java.util.ArrayList arrayList422222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap2222222222222222222222);
                                        arrayList422222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                        edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222222222222222222222);
                                        java.lang.String str5222222222222222222222222222 = str2;
                                        edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222222222222222222);
                                        edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                        com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                        highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222222222222222222);
                                        if (highSpeedVideoSizes != null) {
                                        }
                                        highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                        }
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                        edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        outputStream = r5;
                                        obj2 = r42;
                                        inputStream = null;
                                        r4 = obj2;
                                        if (outputStream != null) {
                                        }
                                        if (r4 != 0) {
                                        }
                                        if (inputStream == null) {
                                        }
                                    }
                                } catch (java.io.IOException e10) {
                                    e = e10;
                                    str3 = "EdgePersonalizationResponseHandler";
                                    str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    z = r42;
                                    r5 = 0;
                                    r42 = z;
                                    hashMap18 = 0;
                                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "IOException while attempting to write remote file (%s)", e);
                                    if (r5 != 0) {
                                    }
                                    if (r42 != 0) {
                                    }
                                    if (hashMap18 != 0) {
                                    }
                                    map = parsedPropositions.getHighSpeedVideoSizes;
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                                    com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                                    }
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null) {
                                    }
                                    java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap22222222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                                    if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                    }
                                    str = str3;
                                    java.util.ArrayList arrayList4222222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap22222222222222222222222);
                                    arrayList4222222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                    edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222222222222222);
                                    java.lang.String str52222222222222222222222222222 = str2;
                                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str52222222222222222222222222222);
                                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension22222222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str52222222222222222222222222222);
                                    if (highSpeedVideoSizes != null) {
                                    }
                                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                    }
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj = r42;
                                    th = th;
                                    obj2 = obj;
                                    outputStream = null;
                                    inputStream = null;
                                    r4 = obj2;
                                    if (outputStream != null) {
                                    }
                                    if (r4 != 0) {
                                    }
                                    if (inputStream == null) {
                                    }
                                }
                            } catch (java.io.IOException e11) {
                                e = e11;
                                str3 = "EdgePersonalizationResponseHandler";
                                str4 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                z = false;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj = null;
                            }
                        }
                        map = parsedPropositions.getHighSpeedVideoSizes;
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.INAPP, map, list3, edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD, map, list3, edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap);
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION, map, list3, edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor);
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD) != null) {
                            edgePersonalizationResponseHandler2.getHighSpeedVideoSizes.replaceRules(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.Camera2StreamConfigurationMap));
                            edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(new com.adobe.marketing.mobile.Event.Builder("Seed content cards", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).build());
                        }
                        if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) == null || map.get(com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION) != null) {
                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap222222222222222222222222 = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getInputSizeshNQ4ISI);
                            if (map.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP) != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.util.Iterator<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> it5 = Camera2StreamConfigurationMap222222222222222222222222.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.addAll(it5.next().getConsequenceList());
                                }
                                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList();
                                try {
                                    java.util.Iterator it6 = arrayList5.iterator();
                                    while (it6.hasNext()) {
                                        java.util.Map<java.lang.String, java.lang.Object> detail = ((com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence) it6.next()).getDetail();
                                        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(detail)) {
                                            java.lang.String str6 = str4;
                                            java.util.List<java.lang.String> stringList = com.adobe.marketing.mobile.util.DataReader.getStringList(com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, detail, str6), "remoteAssets");
                                            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(stringList)) {
                                                for (java.lang.String str7 : stringList) {
                                                    if (com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str7) && !arrayList6.contains(str7)) {
                                                        str = str3;
                                                        try {
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Image asset to be cached (%s) ", str7);
                                                            arrayList6.add(str7);
                                                            str3 = str;
                                                        } catch (com.adobe.marketing.mobile.util.DataReaderException e12) {
                                                            e = e12;
                                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Failed to cache image asset, exception occurred %s", e.getLocalizedMessage());
                                                            java.util.ArrayList arrayList42222222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222222222222222);
                                                            arrayList42222222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList42222222222222222222222222222222222);
                                                            java.lang.String str522222222222222222222222222222 = str2;
                                                            edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str522222222222222222222222222222);
                                                            edgePersonalizationResponseHandler2.getOutputFormats.clear();
                                                            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension222222222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                                                            highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str522222222222222222222222222222);
                                                            if (highSpeedVideoSizes != null) {
                                                            }
                                                            highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                                                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                                                            }
                                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                                                            edgePersonalizationResponseHandler2.getOutputSizes.resume();
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = str6;
                                        }
                                    }
                                    str = str3;
                                    com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities2 = edgePersonalizationResponseHandler2.getOutputMinFrameDuration;
                                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingCacheUtilities2.Camera2StreamConfigurationMap)) {
                                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the asset cache location is not available.", new java.lang.Object[0]);
                                    } else if (messagingCacheUtilities2.getHighSpeedVideoSizes == null) {
                                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Failed to cache asset, the cache manager is not available.", new java.lang.Object[0]);
                                    } else {
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList6)) {
                                            for (java.lang.String str8 : arrayList6) {
                                                if (com.adobe.marketing.mobile.messaging.MessagingCacheUtilities.getHighSpeedVideoSizes(str8) && !arrayList7.contains(str8)) {
                                                    arrayList7.add(str8);
                                                    messagingCacheUtilities2.getHighSpeedVideoFpsRanges.put(str8, messagingCacheUtilities2.Camera2StreamConfigurationMap);
                                                }
                                            }
                                        }
                                        com.adobe.marketing.mobile.messaging.MessageAssetDownloader messageAssetDownloader = new com.adobe.marketing.mobile.messaging.MessageAssetDownloader(arrayList7);
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageAssetDownloader.getHighSpeedVideoSizes)) {
                                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Failed to download assets, the asset cache location is not available.", new java.lang.Object[0]);
                                        } else {
                                            java.util.List<java.lang.String> list4 = messageAssetDownloader.Camera2StreamConfigurationMap;
                                            if (list4 == null || list4.isEmpty()) {
                                                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessageAssetDownloader", "downloadAssetCollection - Empty list of assets provided, will not download any assets.", new java.lang.Object[0]);
                                            } else {
                                                java.io.File file = messageAssetDownloader.getHighSpeedVideoFpsRanges;
                                                if (file != null) {
                                                    messageAssetDownloader.Camera2StreamConfigurationMap(file, messageAssetDownloader.Camera2StreamConfigurationMap);
                                                }
                                                java.util.Iterator<java.lang.String> it7 = messageAssetDownloader.Camera2StreamConfigurationMap.iterator();
                                                while (it7.hasNext()) {
                                                    messageAssetDownloader.getHighResolutionOutputSizeshNQ4ISI(it7.next(), null);
                                                }
                                            }
                                        }
                                    }
                                } catch (com.adobe.marketing.mobile.util.DataReaderException e13) {
                                    e = e13;
                                    str = str3;
                                }
                                java.util.ArrayList arrayList422222222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222222222222222);
                                arrayList422222222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                                edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList422222222222222222222222222222222222);
                            }
                            str = str3;
                            java.util.ArrayList arrayList4222222222222222222222222222222222222 = new java.util.ArrayList(Camera2StreamConfigurationMap222222222222222222222222);
                            arrayList4222222222222222222222222222222222222.addAll(com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.Camera2StreamConfigurationMap(edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor));
                            edgePersonalizationResponseHandler2.getInputFormats.replaceRules(arrayList4222222222222222222222222222222222222);
                        } else {
                            str = str3;
                        }
                    }
                    java.lang.String str5222222222222222222222222222222 = str2;
                    edgePersonalizationResponseHandler2.getOutputSizeshNQ4ISI.remove(str5222222222222222222222222222222);
                    edgePersonalizationResponseHandler2.getOutputFormats.clear();
                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension2222222222222222222222222222222 = edgePersonalizationResponseHandler2.getOutputStallDurationlomOqCM;
                    highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(str5222222222222222222222222222222);
                    if (highSpeedVideoSizes != null) {
                        highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.call(java.lang.Boolean.TRUE);
                    }
                    highSpeedVideoFpsRangesFor = edgePersonalizationResponseHandler2.getHighSpeedVideoFpsRangesFor(list);
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoFpsRangesFor)) {
                        java.util.HashMap hashMap19 = new java.util.HashMap();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it8 = highSpeedVideoFpsRangesFor.entrySet().iterator();
                        while (it8.hasNext()) {
                            java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it9 = it8.next().getValue().iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(it9.next().toEventData());
                            }
                        }
                        hashMap19.put("propositions", arrayList8);
                        edgePersonalizationResponseHandler2.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Message propositions notification", com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.notification").setEventData(hashMap19).build());
                    } else {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "Not dispatching a notification event, personalization:decisions response does not contain propositions.", new java.lang.Object[0]);
                    }
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, "handleProcessCompletedEvent - Starting serial work dispatcher.", new java.lang.Object[0]);
                    edgePersonalizationResponseHandler2.getOutputSizes.resume();
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.SYSTEM, com.adobe.marketing.mobile.EventSource.DEBUG, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda3
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                if (com.adobe.marketing.mobile.EventType.RULES_ENGINE.equals(com.adobe.marketing.mobile.util.EventUtils.getDebugEventType(event)) && com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT.equals(com.adobe.marketing.mobile.util.EventUtils.getDebugEventSource(event))) {
                    if (!com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputStallDurationlomOqCM(event) || com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(event.getEventData())) {
                        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "handleDebugEvent - Ignoring rule consequence event. Either consequence is not of type 'schema' or 'eventData' is nil.", new java.lang.Object[0]);
                        return;
                    }
                    com.adobe.marketing.mobile.messaging.PropositionItem highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.PropositionItem.getHighSpeedVideoFpsRanges(event);
                    if (highSpeedVideoFpsRanges == null) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "handleDebugEvent -  Ignoring rule consequence event, could not create propositionItem", new java.lang.Object[0]);
                    } else if (com.adobe.marketing.mobile.messaging.MessagingExtension.AnonymousClass1.getHighSpeedVideoFpsRanges[highSpeedVideoFpsRanges.getSchema().ordinal()] == 1) {
                        messagingExtension.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges);
                    }
                }
            }
        });
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new com.adobe.marketing.mobile.util.SerialWorkDispatcher<>("MessagingEvents", new com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler() { // from class: com.adobe.marketing.mobile.messaging.MessagingExtension$$ExternalSyntheticLambda4
                @Override // com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler
                public final boolean doWork(java.lang.Object obj) {
                    com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.MessagingExtension.this;
                    com.adobe.marketing.mobile.Event event = (com.adobe.marketing.mobile.Event) obj;
                    if (com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getOutputMinFrameDuration(event)) {
                        com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler edgePersonalizationResponseHandler = messagingExtension.getHighSpeedVideoFpsRanges;
                        java.util.List<com.adobe.marketing.mobile.messaging.Surface> highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(event);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor)) {
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Unable to retrieve messages, no surfaces were requested.", new java.lang.Object[0]);
                            edgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI.dispatch(com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.AdobeErrorExt.INVALID_REQUEST));
                        } else {
                            for (com.adobe.marketing.mobile.messaging.Surface surface : highSpeedVideoFpsRangesFor) {
                                if (surface.isValid()) {
                                    arrayList.add(surface);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Unable to retrieve messages, no valid surfaces found.", new java.lang.Object[0]);
                                edgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI.dispatch(com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighResolutionOutputSizeshNQ4ISI(event, com.adobe.marketing.mobile.messaging.AdobeErrorExt.INVALID_REQUEST));
                            } else {
                                java.util.HashMap hashMap = new java.util.HashMap(edgePersonalizationResponseHandler.getHighSpeedVideoFpsRanges);
                                hashMap.keySet().retainAll(arrayList);
                                java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor2 = edgePersonalizationResponseHandler.getHighSpeedVideoFpsRangesFor(arrayList);
                                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                                    highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface((com.adobe.marketing.mobile.messaging.Surface) entry.getKey(), (java.util.List<com.adobe.marketing.mobile.messaging.Proposition>) entry.getValue(), highSpeedVideoFpsRangesFor2);
                                }
                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it = highSpeedVideoFpsRangesFor2.entrySet().iterator();
                                while (it.hasNext()) {
                                    java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it2 = it.next().getValue().iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(it2.next().toEventData());
                                    }
                                }
                                hashMap2.put("propositions", arrayList2);
                                edgePersonalizationResponseHandler.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Message propositions response", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT).setEventData(hashMap2).inResponseToEvent(event).build());
                            }
                        }
                    } else if (event.getType().equals(com.adobe.marketing.mobile.EventType.EDGE)) {
                        return !messagingExtension.getHighSpeedVideoFpsRanges.getOutputSizeshNQ4ISI.containsKey(event.getUniqueIdentifier());
                    }
                    return true;
                }
            });
        }
        this.getHighSpeedVideoFpsRanges.getOutputSizes = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI.start();
        getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.messaging.InternalMessagingUtils.Camera2StreamConfigurationMap(), null);
    }

    /* renamed from: com.adobe.marketing.mobile.messaging.MessagingExtension$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.messaging.SchemaType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.adobe.marketing.mobile.messaging.SchemaType.INAPP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public final void sendPropositionInteraction(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("xdm", map);
        com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoSizes("Messaging interaction event", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, hashMap, getApi(), null);
    }

    public static void addCompletionHandler(com.adobe.marketing.mobile.messaging.CompletionHandler completionHandler) {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            getHighSpeedVideoFpsRangesFor.add(completionHandler);
        }
    }

    static com.adobe.marketing.mobile.messaging.CompletionHandler Camera2StreamConfigurationMap(java.lang.String str) {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            java.util.Iterator it = new java.util.ArrayList(getHighSpeedVideoFpsRangesFor).iterator();
            while (it.hasNext()) {
                com.adobe.marketing.mobile.messaging.CompletionHandler completionHandler = (com.adobe.marketing.mobile.messaging.CompletionHandler) it.next();
                if (completionHandler.getHighSpeedVideoFpsRanges.equals(str)) {
                    getHighSpeedVideoFpsRangesFor.remove(completionHandler);
                    return completionHandler;
                }
            }
            return null;
        }
    }

    static com.adobe.marketing.mobile.messaging.CompletionHandler getHighSpeedVideoSizes(java.lang.String str) {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            java.util.Iterator it = new java.util.ArrayList(getHighSpeedVideoFpsRangesFor).iterator();
            while (it.hasNext()) {
                com.adobe.marketing.mobile.messaging.CompletionHandler completionHandler = (com.adobe.marketing.mobile.messaging.CompletionHandler) it.next();
                if (completionHandler.getHighSpeedVideoSizes.equals(str)) {
                    getHighSpeedVideoFpsRangesFor.remove(completionHandler);
                    return completionHandler;
                }
            }
            return null;
        }
    }

    void getHighSpeedVideoFpsRangesFor(java.lang.String str, com.adobe.marketing.mobile.Event event) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            hashMap.put("pushidentifier", str);
        }
        getApi().createSharedState(hashMap, event);
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final boolean readyForEvent(com.adobe.marketing.mobile.Event event) {
        java.util.Map<java.lang.String, java.lang.Object> value;
        java.util.Map<java.lang.String, java.lang.Object> value2;
        com.adobe.marketing.mobile.SharedStateResult sharedState = getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
        if (sharedState == null || (value = sharedState.getValue()) == null || value.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Event processing is paused - waiting for valid Configuration", new java.lang.Object[0]);
            return false;
        }
        com.adobe.marketing.mobile.SharedStateResult xDMSharedState = getApi().getXDMSharedState("com.adobe.edge.identity", event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
        if (xDMSharedState == null || (value2 = xDMSharedState.getValue()) == null || value2.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingExtension", "Event processing is paused - waiting for valid XDM shared state from Edge Identity extension.", new java.lang.Object[0]);
            return false;
        }
        if (!this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(event, null);
            this.getHighSpeedVideoSizesFor = true;
        }
        return true;
    }
}
