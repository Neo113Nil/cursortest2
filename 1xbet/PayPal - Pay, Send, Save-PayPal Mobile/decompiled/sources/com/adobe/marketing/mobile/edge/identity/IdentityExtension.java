package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
class IdentityExtension extends com.adobe.marketing.mobile.Extension {
    final com.adobe.marketing.mobile.edge.identity.IdentityState getHighSpeedVideoFpsRangesFor;
    final com.adobe.marketing.mobile.edge.identity.SharedStateCallback getHighSpeedVideoSizes;

    protected IdentityExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        this(extensionApi, new com.adobe.marketing.mobile.edge.identity.IdentityState());
    }

    IdentityExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.edge.identity.IdentityState identityState) {
        super(extensionApi);
        this.getHighSpeedVideoSizes = new com.adobe.marketing.mobile.edge.identity.SharedStateCallback() { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension.1
            @Override // com.adobe.marketing.mobile.edge.identity.SharedStateCallback
            public final com.adobe.marketing.mobile.SharedStateResult getHighSpeedVideoFpsRanges(java.lang.String str, com.adobe.marketing.mobile.Event event) {
                return com.adobe.marketing.mobile.edge.identity.IdentityExtension.this.getApi().getSharedState(str, event, false, com.adobe.marketing.mobile.SharedStateResolution.LAST_SET);
            }

            @Override // com.adobe.marketing.mobile.edge.identity.SharedStateCallback
            public final void Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.Object> map, com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.identity.IdentityExtension.this.getApi().createXDMSharedState(map, event);
            }
        };
        this.getHighSpeedVideoFpsRangesFor = identityState;
    }

    @Override // com.adobe.marketing.mobile.Extension
    public java.lang.String getName() {
        return "com.adobe.edge.identity";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public java.lang.String getFriendlyName() {
        return "Edge Identity";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public java.lang.String getVersion() {
        return "3.0.1";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public void onRegistered() {
        super.onRegistered();
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.identity.IdentityExtension identityExtension = com.adobe.marketing.mobile.edge.identity.IdentityExtension.this;
                if (com.adobe.marketing.mobile.edge.identity.EventUtils.getHighResolutionOutputSizeshNQ4ISI(event)) {
                    com.adobe.marketing.mobile.edge.identity.IdentityState identityState = identityExtension.getHighSpeedVideoFpsRangesFor;
                    com.adobe.marketing.mobile.edge.identity.SharedStateCallback sharedStateCallback = identityExtension.getHighSpeedVideoSizes;
                    java.lang.String highSpeedVideoSizes = com.adobe.marketing.mobile.edge.identity.EventUtils.getHighSpeedVideoSizes(event);
                    if (identityState.getHighResolutionOutputSizeshNQ4ISI == null) {
                        identityState.getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.edge.identity.IdentityProperties();
                    }
                    java.lang.String Camera2StreamConfigurationMap = identityState.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                    if (Camera2StreamConfigurationMap == null) {
                        Camera2StreamConfigurationMap = "";
                    }
                    if (Camera2StreamConfigurationMap.equals(highSpeedVideoSizes)) {
                        return;
                    }
                    com.adobe.marketing.mobile.edge.identity.IdentityProperties identityProperties = identityState.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String Camera2StreamConfigurationMap2 = identityProperties.Camera2StreamConfigurationMap();
                    if (Camera2StreamConfigurationMap2 != null && !Camera2StreamConfigurationMap2.equalsIgnoreCase(highSpeedVideoSizes)) {
                        identityProperties.Camera2StreamConfigurationMap.removeItem(new com.adobe.marketing.mobile.edge.identity.IdentityItem(Camera2StreamConfigurationMap2), "GAID");
                    }
                    if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoSizes)) {
                        identityProperties.Camera2StreamConfigurationMap.addItem(new com.adobe.marketing.mobile.edge.identity.IdentityItem(highSpeedVideoSizes, com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AMBIGUOUS, false), "GAID");
                    }
                    if (highSpeedVideoSizes.isEmpty() || Camera2StreamConfigurationMap.isEmpty()) {
                        com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Consent Update Request for Ad ID", com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.UPDATE_CONSENT).setEventData(com.adobe.marketing.mobile.edge.identity.IdentityState.getHighSpeedVideoFpsRanges(highSpeedVideoSizes.isEmpty() ? "n" : "y")).build());
                    }
                    identityState.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI);
                    sharedStateCallback.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false), event);
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_RESET, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension$$ExternalSyntheticLambda1
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.identity.IdentityExtension identityExtension = com.adobe.marketing.mobile.edge.identity.IdentityExtension.this;
                com.adobe.marketing.mobile.SharedStateResolver createPendingXDMSharedState = identityExtension.getApi().createPendingXDMSharedState(event);
                com.adobe.marketing.mobile.edge.identity.IdentityState identityState = identityExtension.getHighSpeedVideoFpsRangesFor;
                com.adobe.marketing.mobile.edge.identity.IdentityProperties identityProperties = new com.adobe.marketing.mobile.edge.identity.IdentityProperties();
                identityState.getHighResolutionOutputSizeshNQ4ISI = identityProperties;
                identityProperties.getHighSpeedVideoSizes(new com.adobe.marketing.mobile.edge.identity.ECID());
                identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null);
                identityState.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI);
                createPendingXDMSharedState.resolve(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false));
                identityExtension.getApi().dispatch(new com.adobe.marketing.mobile.Event.Builder("Edge Identity Reset Identities Complete", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.RESET_COMPLETE).inResponseToEvent(event).build());
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_IDENTITY, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension$$ExternalSyntheticLambda2
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.identity.IdentityExtension identityExtension = com.adobe.marketing.mobile.edge.identity.IdentityExtension.this;
                if (!com.adobe.marketing.mobile.edge.identity.EventUtils.getHighSpeedVideoFpsRanges(event)) {
                    identityExtension.getApi().dispatch(new com.adobe.marketing.mobile.Event.Builder("Edge Identity Response Content One Time", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.RESPONSE_IDENTITY).setEventData(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(true)).inResponseToEvent(event).build());
                    return;
                }
                com.adobe.marketing.mobile.SharedStateResult highSpeedVideoFpsRanges = identityExtension.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event);
                java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.edge.identity.EventUtils.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.getValue() : null);
                if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI)) {
                    identityExtension.getHighSpeedVideoFpsRanges(event, null, "Cannot process getUrlVariables request Identity event, Experience Cloud Org ID not found in configuration.");
                    return;
                }
                com.adobe.marketing.mobile.edge.identity.ECID highSpeedVideoFpsRanges2 = identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                java.lang.String obj = highSpeedVideoFpsRanges2 != null ? highSpeedVideoFpsRanges2.toString() : null;
                if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(obj)) {
                    identityExtension.getHighSpeedVideoFpsRanges(event, null, "Cannot process getUrlVariables request Identity event, ECID not found.");
                } else {
                    identityExtension.getHighSpeedVideoFpsRanges(event, com.adobe.marketing.mobile.edge.identity.URLUtils.getHighSpeedVideoFpsRangesFor(java.lang.String.valueOf(com.adobe.marketing.mobile.util.TimeUtils.getUnixTimeInSeconds()), obj, highResolutionOutputSizeshNQ4ISI), null);
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.UPDATE_IDENTITY, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension$$ExternalSyntheticLambda3
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.identity.IdentityExtension identityExtension = com.adobe.marketing.mobile.edge.identity.IdentityExtension.this;
                com.adobe.marketing.mobile.SharedStateResolver createPendingXDMSharedState = identityExtension.getApi().createPendingXDMSharedState(event);
                java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                if (eventData == null) {
                    com.adobe.marketing.mobile.services.Log.trace("EdgeIdentity", "IdentityExtension", "Cannot update identifiers, event data is null.", new java.lang.Object[0]);
                    createPendingXDMSharedState.resolve(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false));
                    return;
                }
                com.adobe.marketing.mobile.edge.identity.IdentityMap highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.edge.identity.IdentityMap.getHighSpeedVideoFpsRangesFor(eventData);
                if (highSpeedVideoFpsRangesFor == null) {
                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityExtension", "Failed to update identifiers as no identifiers were found in the event data.", new java.lang.Object[0]);
                    createPendingXDMSharedState.resolve(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false));
                    return;
                }
                com.adobe.marketing.mobile.edge.identity.IdentityState identityState = identityExtension.getHighSpeedVideoFpsRangesFor;
                com.adobe.marketing.mobile.edge.identity.IdentityProperties identityProperties = identityState.getHighResolutionOutputSizeshNQ4ISI;
                com.adobe.marketing.mobile.edge.identity.IdentityProperties.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor);
                com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap = identityProperties.Camera2StreamConfigurationMap;
                if (highSpeedVideoFpsRangesFor != null) {
                    for (java.lang.String str : highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.keySet()) {
                        java.util.Iterator<com.adobe.marketing.mobile.edge.identity.IdentityItem> it = highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.get(str).iterator();
                        while (it.hasNext()) {
                            identityMap.addItem(it.next(), str);
                        }
                    }
                }
                identityState.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI);
                createPendingXDMSharedState.resolve(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false));
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.REMOVE_IDENTITY, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension$$ExternalSyntheticLambda4
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.identity.IdentityExtension identityExtension = com.adobe.marketing.mobile.edge.identity.IdentityExtension.this;
                com.adobe.marketing.mobile.SharedStateResolver createPendingXDMSharedState = identityExtension.getApi().createPendingXDMSharedState(event);
                java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                if (eventData == null) {
                    com.adobe.marketing.mobile.services.Log.trace("EdgeIdentity", "IdentityExtension", "Cannot remove identifiers, event data is null.", new java.lang.Object[0]);
                    createPendingXDMSharedState.resolve(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false));
                    return;
                }
                com.adobe.marketing.mobile.edge.identity.IdentityMap highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.edge.identity.IdentityMap.getHighSpeedVideoFpsRangesFor(eventData);
                if (highSpeedVideoFpsRangesFor == null) {
                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityExtension", "Failed to remove identifiers as no identifiers were found in the event data.", new java.lang.Object[0]);
                    createPendingXDMSharedState.resolve(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false));
                    return;
                }
                com.adobe.marketing.mobile.edge.identity.IdentityState identityState = identityExtension.getHighSpeedVideoFpsRangesFor;
                com.adobe.marketing.mobile.edge.identity.IdentityProperties identityProperties = identityState.getHighResolutionOutputSizeshNQ4ISI;
                com.adobe.marketing.mobile.edge.identity.IdentityProperties.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor);
                com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap = identityProperties.Camera2StreamConfigurationMap;
                if (highSpeedVideoFpsRangesFor != null) {
                    for (java.lang.String str : highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.keySet()) {
                        java.util.Iterator<com.adobe.marketing.mobile.edge.identity.IdentityItem> it = highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.get(str).iterator();
                        while (it.hasNext()) {
                            identityMap.removeItem(it.next(), str);
                        }
                    }
                }
                identityState.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI);
                createPendingXDMSharedState.resolve(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false));
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.HUB, com.adobe.marketing.mobile.EventSource.SHARED_STATE, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension$$ExternalSyntheticLambda5
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.edge.identity.IdentityExtension identityExtension = com.adobe.marketing.mobile.edge.identity.IdentityExtension.this;
                if (com.adobe.marketing.mobile.edge.identity.EventUtils.getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.EXTENSION_NAME, event)) {
                    com.adobe.marketing.mobile.SharedStateResult highSpeedVideoFpsRanges = identityExtension.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.EXTENSION_NAME, event);
                    java.util.Map<java.lang.String, java.lang.Object> value = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.getValue() : null;
                    if (value != null) {
                        com.adobe.marketing.mobile.edge.identity.ECID Camera2StreamConfigurationMap = com.adobe.marketing.mobile.edge.identity.EventUtils.Camera2StreamConfigurationMap(value);
                        com.adobe.marketing.mobile.edge.identity.IdentityState identityState = identityExtension.getHighSpeedVideoFpsRangesFor;
                        com.adobe.marketing.mobile.edge.identity.ECID highSpeedVideoFpsRanges2 = identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                        com.adobe.marketing.mobile.edge.identity.ECID highResolutionOutputSizeshNQ4ISI = identityState.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
                        if (Camera2StreamConfigurationMap == null || !(Camera2StreamConfigurationMap.equals(highSpeedVideoFpsRanges2) || Camera2StreamConfigurationMap.equals(highResolutionOutputSizeshNQ4ISI))) {
                            if (Camera2StreamConfigurationMap == null && highResolutionOutputSizeshNQ4ISI == null) {
                                return;
                            }
                            identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
                            identityState.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Identity direct ECID updated to '");
                            sb.append(Camera2StreamConfigurationMap);
                            sb.append("', updating the IdentityMap");
                            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityState", sb.toString(), new java.lang.Object[0]);
                            identityExtension.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(identityExtension.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false), event);
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0127, code lost:
    
        if (r0.getHighSpeedVideoSizes == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    @Override // com.adobe.marketing.mobile.Extension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean readyForEvent(com.adobe.marketing.mobile.Event event) {
        com.adobe.marketing.mobile.edge.identity.ECID ecid;
        com.adobe.marketing.mobile.edge.identity.IdentityState identityState = this.getHighSpeedVideoFpsRangesFor;
        com.adobe.marketing.mobile.edge.identity.SharedStateCallback sharedStateCallback = this.getHighSpeedVideoSizes;
        if (!identityState.getHighSpeedVideoSizes) {
            if (identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges() == null) {
                com.adobe.marketing.mobile.SharedStateResult highSpeedVideoFpsRanges = sharedStateCallback.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.NAME, null);
                if (highSpeedVideoFpsRanges != null && highSpeedVideoFpsRanges.getStatus() == com.adobe.marketing.mobile.SharedStateStatus.SET) {
                    com.adobe.marketing.mobile.services.NamedCollection namedCollection = identityState.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                    if (namedCollection == null) {
                        com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityStorageManager", "Identity direct named collection is null. Unable to load ECID from Identity Direct persistence.", new java.lang.Object[0]);
                    } else {
                        java.lang.String string = namedCollection.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.MID, null);
                        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(string)) {
                            ecid = new com.adobe.marketing.mobile.edge.identity.ECID(string);
                            if (ecid == null) {
                                identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(ecid);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("On bootup Loading ECID from direct Identity extension '");
                                sb.append(ecid);
                                sb.append("'");
                                com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityState", sb.toString(), new java.lang.Object[0]);
                            } else if (com.adobe.marketing.mobile.edge.identity.IdentityState.getHighSpeedVideoSizes(highSpeedVideoFpsRanges.getValue())) {
                                com.adobe.marketing.mobile.SharedStateResult highSpeedVideoFpsRanges2 = sharedStateCallback.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.EXTENSION_NAME, null);
                                if (highSpeedVideoFpsRanges2 == null || highSpeedVideoFpsRanges2.getStatus() != com.adobe.marketing.mobile.SharedStateStatus.SET) {
                                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityState", "On bootup direct Identity extension is registered, waiting for its state change.", new java.lang.Object[0]);
                                } else {
                                    com.adobe.marketing.mobile.edge.identity.ECID Camera2StreamConfigurationMap = com.adobe.marketing.mobile.edge.identity.EventUtils.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges2.getValue());
                                    if (Camera2StreamConfigurationMap != null) {
                                        identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(Camera2StreamConfigurationMap);
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Identity direct ECID '");
                                        sb2.append(Camera2StreamConfigurationMap);
                                        sb2.append("' was migrated to Edge Identity, updating the IdentityMap");
                                        com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityState", sb2.toString(), new java.lang.Object[0]);
                                    } else {
                                        identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(new com.adobe.marketing.mobile.edge.identity.ECID());
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Identity direct ECID is null, generating new ECID '");
                                        sb3.append(identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges());
                                        sb3.append("', updating the IdentityMap");
                                        com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityState", sb3.toString(), new java.lang.Object[0]);
                                    }
                                }
                            } else {
                                identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(new com.adobe.marketing.mobile.edge.identity.ECID());
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Generating new ECID on bootup '");
                                sb4.append(identityState.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges().toString());
                                sb4.append("'");
                                com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityState", sb4.toString(), new java.lang.Object[0]);
                            }
                            identityState.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI);
                        }
                    }
                    ecid = null;
                    if (ecid == null) {
                    }
                    identityState.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI);
                }
                return false;
            }
            identityState.getHighSpeedVideoSizes = true;
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityState", "Edge Identity has successfully booted up", new java.lang.Object[0]);
            sharedStateCallback.Camera2StreamConfigurationMap(identityState.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false), null);
        }
        if (!com.adobe.marketing.mobile.edge.identity.EventUtils.getHighSpeedVideoFpsRanges(event)) {
            return true;
        }
        com.adobe.marketing.mobile.SharedStateResult highSpeedVideoFpsRanges3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event);
        return highSpeedVideoFpsRanges3 != null && highSpeedVideoFpsRanges3.getStatus() == com.adobe.marketing.mobile.SharedStateStatus.SET;
    }

    final void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.Event event, java.lang.String str, java.lang.String str2) {
        com.adobe.marketing.mobile.Event build = new com.adobe.marketing.mobile.Event.Builder("Edge Identity Response URL Variables", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.RESPONSE_IDENTITY).setEventData(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.adobe.marketing.mobile.edge.identity.IdentityExtension.2
            final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = str;
                put("urlvariables", str);
            }
        }).inResponseToEvent(event).build();
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            com.adobe.marketing.mobile.services.Log.warning("EdgeIdentity", "IdentityExtension", str2, new java.lang.Object[0]);
        }
        getApi().dispatch(build);
    }
}
