package com.adobe.marketing.mobile.edge.consent;

/* loaded from: classes3.dex */
class ConsentExtension extends com.adobe.marketing.mobile.Extension {
    final com.adobe.marketing.mobile.edge.consent.ConsentManager getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    protected ConsentExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        this(extensionApi, com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("com.adobe.edge.consent"));
    }

    protected ConsentExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.services.NamedCollection namedCollection) {
        this(extensionApi, new com.adobe.marketing.mobile.edge.consent.ConsentManager(namedCollection));
    }

    protected ConsentExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.edge.consent.ConsentManager consentManager) {
        super(extensionApi);
        this.getHighSpeedVideoSizes = 0L;
        this.getHighSpeedVideoFpsRangesFor = consentManager;
    }

    @Override // com.adobe.marketing.mobile.Extension
    public java.lang.String getName() {
        return "com.adobe.edge.consent";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public java.lang.String getFriendlyName() {
        return "Consent";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public java.lang.String getVersion() {
        return "3.0.2";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public void onRegistered() {
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.CONSENT_PREFERENCE, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.consent.ConsentExtension$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.consent.ConsentExtension consentExtension = com.adobe.marketing.mobile.edge.consent.ConsentExtension.this;
                java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "payload", null);
                if (optTypedListOfMap == null || optTypedListOfMap.isEmpty()) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Ignoring the consent:preferences handle event from Edge Network, empty/missing payload.", new java.lang.Object[0]);
                    return;
                }
                java.util.Map map = (java.util.Map) optTypedListOfMap.get(0);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("consents", map);
                com.adobe.marketing.mobile.edge.consent.Consents consents = new com.adobe.marketing.mobile.edge.consent.Consents(hashMap);
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(consents.getHighSpeedVideoFpsRangesFor)) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Ignoring the consent:preferences handle event from Edge Network, no valid consent data found.", new java.lang.Object[0]);
                    return;
                }
                com.adobe.marketing.mobile.edge.consent.Consents highSpeedVideoSizes = consentExtension.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
                if ((consents.getHighSpeedVideoSizes() == null || consents.getHighSpeedVideoSizes().equals(highSpeedVideoSizes.getHighSpeedVideoSizes())) && consents.getHighSpeedVideoSizes(highSpeedVideoSizes)) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Ignoring the consent:preferences handle event from Edge Network. There is no modification from existing consent data", new java.lang.Object[0]);
                    return;
                }
                consents.Camera2StreamConfigurationMap(event.getTimestamp());
                com.adobe.marketing.mobile.edge.consent.ConsentManager consentManager = consentExtension.getHighSpeedVideoFpsRangesFor;
                com.adobe.marketing.mobile.edge.consent.Consents highSpeedVideoSizes2 = consentManager.getHighSpeedVideoSizes();
                consentManager.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(consents);
                consentManager.getHighSpeedVideoFpsRanges(consentManager.getHighSpeedVideoFpsRanges);
                highSpeedVideoSizes2.getHighSpeedVideoSizes(consentManager.getHighSpeedVideoSizes());
                consentExtension.getHighSpeedVideoSizes(event);
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.UPDATE_CONSENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.consent.ConsentExtension$$ExternalSyntheticLambda1
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.consent.ConsentExtension consentExtension = com.adobe.marketing.mobile.edge.consent.ConsentExtension.this;
                java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                if (eventData == null || eventData.isEmpty()) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Consent data not found in consent update event. Dropping event.", new java.lang.Object[0]);
                    return;
                }
                com.adobe.marketing.mobile.edge.consent.Consents consents = new com.adobe.marketing.mobile.edge.consent.Consents(eventData);
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(consents.getHighSpeedVideoFpsRangesFor)) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Unable to find valid data from consent update event. Dropping event.", new java.lang.Object[0]);
                    return;
                }
                boolean z = event.getTimestamp() > consentExtension.getHighSpeedVideoSizes + 1000;
                consents.Camera2StreamConfigurationMap(event.getTimestamp());
                com.adobe.marketing.mobile.edge.consent.ConsentManager consentManager = consentExtension.getHighSpeedVideoFpsRangesFor;
                com.adobe.marketing.mobile.edge.consent.Consents highSpeedVideoSizes = consentManager.getHighSpeedVideoSizes();
                consentManager.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(consents);
                consentManager.getHighSpeedVideoFpsRanges(consentManager.getHighSpeedVideoFpsRanges);
                if (!(true ^ highSpeedVideoSizes.getHighSpeedVideoSizes(consentManager.getHighSpeedVideoSizes())) && !z) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Consent update request did not change preferences and is within %d ms of the previous update request, dropping event.", 1000L);
                    return;
                }
                consentExtension.getHighSpeedVideoSizes(event);
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(consents.getHighSpeedVideoFpsRangesFor)) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Consent data is null/empty, not dispatching Edge Consent Update event.", new java.lang.Object[0]);
                } else {
                    consentExtension.getApi().dispatch(new com.adobe.marketing.mobile.Event.Builder("Edge Consent Update Request", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.UPDATE_CONSENT).setEventData(consents.Camera2StreamConfigurationMap()).build());
                }
                consentExtension.getHighSpeedVideoSizes = event.getTimestamp();
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.consent.ConsentExtension$$ExternalSyntheticLambda2
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.consent.ConsentExtension consentExtension = com.adobe.marketing.mobile.edge.consent.ConsentExtension.this;
                consentExtension.getApi().dispatch(new com.adobe.marketing.mobile.Event.Builder("Get Consents Response", com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT).setEventData(consentExtension.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes().Camera2StreamConfigurationMap()).inResponseToEvent(event).build());
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.CONFIGURATION, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.consent.ConsentExtension$$ExternalSyntheticLambda3
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.consent.ConsentExtension consentExtension = com.adobe.marketing.mobile.edge.consent.ConsentExtension.this;
                java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                if (eventData == null || eventData.isEmpty()) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "Event data configuration response event is empty, unable to read configuration consent.default. Dropping event.", new java.lang.Object[0]);
                    return;
                }
                java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, eventData, "consent.default", null);
                if (optTypedMap == null || optTypedMap.isEmpty()) {
                    com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentExtension", "consent.default not found in configuration. Make sure Consent extension is installed in your mobile property", new java.lang.Object[0]);
                }
                com.adobe.marketing.mobile.edge.consent.ConsentManager consentManager = consentExtension.getHighSpeedVideoFpsRangesFor;
                com.adobe.marketing.mobile.edge.consent.Consents consents = new com.adobe.marketing.mobile.edge.consent.Consents((java.util.Map<java.lang.String, java.lang.Object>) optTypedMap);
                com.adobe.marketing.mobile.edge.consent.Consents highSpeedVideoSizes = consentManager.getHighSpeedVideoSizes();
                consentManager.getHighResolutionOutputSizeshNQ4ISI = consents;
                if (!highSpeedVideoSizes.equals(consentManager.getHighSpeedVideoSizes())) {
                    consentExtension.getHighSpeedVideoSizes(event);
                }
            }
        });
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes().getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        getHighSpeedVideoSizes(null);
    }

    final void getHighSpeedVideoSizes(com.adobe.marketing.mobile.Event event) {
        java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes().Camera2StreamConfigurationMap();
        getApi().createXDMSharedState(Camera2StreamConfigurationMap, event);
        getApi().dispatch(new com.adobe.marketing.mobile.Event.Builder("Consent Preferences Updated", com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT).setEventData(Camera2StreamConfigurationMap).build());
    }
}
