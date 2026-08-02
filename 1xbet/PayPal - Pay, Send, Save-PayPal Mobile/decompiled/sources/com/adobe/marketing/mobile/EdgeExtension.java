package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeExtension extends com.adobe.marketing.mobile.Extension {
    final com.adobe.marketing.mobile.services.HitQueuing Camera2StreamConfigurationMap;
    private com.adobe.marketing.mobile.NetworkResponseHandler getHighResolutionOutputSizeshNQ4ISI;
    private com.adobe.marketing.mobile.services.NamedCollection getHighSpeedVideoFpsRanges;
    final com.adobe.marketing.mobile.EdgeState getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final com.adobe.marketing.mobile.EdgeSharedStateCallback getHighSpeedVideoSizesFor;
    private final java.lang.Object getInputFormats;

    protected EdgeExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        this(extensionApi, null);
    }

    protected EdgeExtension(com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.services.HitQueuing hitQueuing) {
        super(extensionApi);
        this.getHighSpeedVideoSizes = "EdgeExtension";
        this.getInputFormats = new java.lang.Object();
        com.adobe.marketing.mobile.EdgeSharedStateCallback edgeSharedStateCallback = new com.adobe.marketing.mobile.EdgeSharedStateCallback() { // from class: com.adobe.marketing.mobile.EdgeExtension.1
            @Override // com.adobe.marketing.mobile.EdgeSharedStateCallback
            public final com.adobe.marketing.mobile.SharedStateResult getHighSpeedVideoFpsRanges(java.lang.String str) {
                return com.adobe.marketing.mobile.EdgeExtension.this.getApi().getSharedState(str, null, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
            }

            @Override // com.adobe.marketing.mobile.EdgeSharedStateCallback
            public final void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map) {
                com.adobe.marketing.mobile.EdgeExtension.this.getApi().createSharedState(map, null);
            }
        };
        this.getHighSpeedVideoSizesFor = edgeSharedStateCallback;
        if (hitQueuing == null) {
            com.adobe.marketing.mobile.NetworkResponseHandler highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            com.adobe.marketing.mobile.EdgeNetworkService edgeNetworkService = new com.adobe.marketing.mobile.EdgeNetworkService(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getNetworkService());
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("EdgeDataStorage");
            }
            this.Camera2StreamConfigurationMap = new com.adobe.marketing.mobile.services.PersistentHitQueue(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataQueueService().getDataQueue(getName()), new com.adobe.marketing.mobile.EdgeHitProcessor(highResolutionOutputSizeshNQ4ISI, edgeNetworkService, this.getHighSpeedVideoFpsRanges, edgeSharedStateCallback, new com.adobe.marketing.mobile.EdgeExtension.EdgeExtensionStateCallback(this, (byte) 0)));
        } else {
            this.Camera2StreamConfigurationMap = hitQueuing;
        }
        com.adobe.marketing.mobile.services.HitQueuing hitQueuing2 = this.Camera2StreamConfigurationMap;
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("EdgeDataStorage");
        }
        this.getHighSpeedVideoFpsRangesFor = new com.adobe.marketing.mobile.EdgeState(hitQueuing2, new com.adobe.marketing.mobile.EdgeProperties(this.getHighSpeedVideoFpsRanges), edgeSharedStateCallback);
    }

    @Override // com.adobe.marketing.mobile.Extension
    protected java.lang.String getName() {
        return "com.adobe.edge";
    }

    @Override // com.adobe.marketing.mobile.Extension
    protected java.lang.String getFriendlyName() {
        return "Edge";
    }

    @Override // com.adobe.marketing.mobile.Extension
    protected java.lang.String getVersion() {
        return "3.0.2";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adobe.marketing.mobile.Extension
    public void onRegistered() {
        super.onRegistered();
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.EdgeExtension$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.ConsentStatus highSpeedVideoFpsRanges;
                com.adobe.marketing.mobile.EdgeExtension edgeExtension = com.adobe.marketing.mobile.EdgeExtension.this;
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(event.getEventData())) {
                    com.adobe.marketing.mobile.services.Log.trace("Edge", "EdgeExtension", "Event with id %s contained no data, ignoring.", event.getUniqueIdentifier());
                    return;
                }
                com.adobe.marketing.mobile.SharedStateResult xDMSharedState = edgeExtension.getApi().getXDMSharedState("com.adobe.edge.consent", event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
                if (xDMSharedState == null || xDMSharedState.getStatus() != com.adobe.marketing.mobile.SharedStateStatus.SET) {
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeExtension", "Consent XDM Shared state is unavailable for event %s, using current consent.", event.getUniqueIdentifier());
                    highSpeedVideoFpsRanges = edgeExtension.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
                } else {
                    highSpeedVideoFpsRanges = com.adobe.marketing.mobile.ConsentStatus.getHighResolutionOutputSizeshNQ4ISI(xDMSharedState.getValue());
                }
                if (highSpeedVideoFpsRanges == com.adobe.marketing.mobile.ConsentStatus.NO) {
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeExtension", "Ignoring event with id %s due to collect consent setting (n).", event.getUniqueIdentifier());
                } else {
                    edgeExtension.getHighSpeedVideoSizes(event);
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.EdgeExtension$$ExternalSyntheticLambda1
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.EdgeExtension edgeExtension = com.adobe.marketing.mobile.EdgeExtension.this;
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(event.getEventData())) {
                    com.adobe.marketing.mobile.services.Log.trace("Edge", "EdgeExtension", "Consent preferences with id %s contained no data, ignoring.", event.getUniqueIdentifier());
                    return;
                }
                com.adobe.marketing.mobile.EdgeState edgeState = edgeExtension.getHighSpeedVideoFpsRangesFor;
                com.adobe.marketing.mobile.ConsentStatus highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.ConsentStatus.getHighResolutionOutputSizeshNQ4ISI(event.getEventData());
                synchronized (edgeState.getHighSpeedVideoFpsRangesFor) {
                    edgeState.getHighSpeedVideoSizes = highResolutionOutputSizeshNQ4ISI;
                    edgeState.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI);
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.UPDATE_CONSENT, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.EdgeExtension$$ExternalSyntheticLambda2
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.EdgeExtension edgeExtension = com.adobe.marketing.mobile.EdgeExtension.this;
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(event.getEventData())) {
                    com.adobe.marketing.mobile.services.Log.trace("Edge", "EdgeExtension", "Consent update request with id %s contained no data, ignoring.", event.getUniqueIdentifier());
                } else {
                    edgeExtension.getHighSpeedVideoSizes(event);
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.RESET_COMPLETE, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.EdgeExtension$$ExternalSyntheticLambda3
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.EdgeExtension edgeExtension = com.adobe.marketing.mobile.EdgeExtension.this;
                com.adobe.marketing.mobile.NetworkResponseHandler highResolutionOutputSizeshNQ4ISI = edgeExtension.getHighResolutionOutputSizeshNQ4ISI();
                long timestamp = event.getTimestamp();
                synchronized (highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges) {
                    highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor = timestamp;
                    com.adobe.marketing.mobile.services.NamedCollection namedCollection = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                    if (namedCollection != null) {
                        namedCollection.setLong("resetIdentitiesDate", timestamp);
                    } else {
                        com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "Failed to set last reset date, data store is null.", new java.lang.Object[0]);
                    }
                }
                if (edgeExtension.Camera2StreamConfigurationMap == null) {
                    com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeExtension", "Hit queue is null, unable to queue reset complete event with id (%s).", event.getUniqueIdentifier());
                } else {
                    edgeExtension.Camera2StreamConfigurationMap.queue(new com.adobe.marketing.mobile.EdgeDataEntity(event).getHighResolutionOutputSizeshNQ4ISI());
                }
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_IDENTITY, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.EdgeExtension$$ExternalSyntheticLambda4
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.EdgeExtension edgeExtension = com.adobe.marketing.mobile.EdgeExtension.this;
                edgeExtension.getApi().dispatch(new com.adobe.marketing.mobile.Event.Builder("Edge Location Hint Response", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.RESPONSE_IDENTITY).setEventData(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.adobe.marketing.mobile.EdgeExtension.2
                    {
                        put("locationHint", com.adobe.marketing.mobile.EdgeExtension.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI());
                    }
                }).inResponseToEvent(event).build());
            }
        });
        getApi().registerEventListener(com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.UPDATE_IDENTITY, new com.adobe.marketing.mobile.ExtensionEventListener() { // from class: com.adobe.marketing.mobile.EdgeExtension$$ExternalSyntheticLambda5
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void hear(com.adobe.marketing.mobile.Event event) {
                com.adobe.marketing.mobile.EdgeExtension edgeExtension = com.adobe.marketing.mobile.EdgeExtension.this;
                java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(eventData)) {
                    com.adobe.marketing.mobile.services.Log.trace("Edge", "EdgeExtension", "Location Hint update request event with id %s contained no data, ignoring.", event.getUniqueIdentifier());
                    return;
                }
                try {
                    edgeExtension.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.util.DataReader.getString(eventData, "locationHint"), 1800);
                } catch (com.adobe.marketing.mobile.util.DataReaderException e) {
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeExtension", "Failed to update location hint for request event '%s' with error '%s'.", event.getUniqueIdentifier(), e.getLocalizedMessage());
                }
            }
        });
    }

    @Override // com.adobe.marketing.mobile.Extension
    protected void onUnregistered() {
        super.onUnregistered();
        this.Camera2StreamConfigurationMap.close();
    }

    @Override // com.adobe.marketing.mobile.Extension
    public boolean readyForEvent(com.adobe.marketing.mobile.Event event) {
        if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor()) {
            return false;
        }
        if (com.adobe.marketing.mobile.EventUtils.getHighSpeedVideoSizes(event) || com.adobe.marketing.mobile.EventUtils.getHighResolutionOutputSizeshNQ4ISI(event)) {
            return (getHighSpeedVideoFpsRangesFor(event) == null || Camera2StreamConfigurationMap(event, false) == null) ? false : true;
        }
        if (com.adobe.marketing.mobile.EventUtils.getHighSpeedVideoFpsRangesFor(event)) {
            return (getHighSpeedVideoFpsRangesFor(event) == null || Camera2StreamConfigurationMap(event, true) == null) ? false : true;
        }
        return true;
    }

    final void getHighSpeedVideoSizes(com.adobe.marketing.mobile.Event event) {
        java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(event);
        if (highSpeedVideoFpsRangesFor == null) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeExtension", "Unable to process the event '%s', Configuration shared state is null.", event.getUniqueIdentifier());
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.EventUtils.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor);
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(com.adobe.marketing.mobile.util.DataReader.optString(highSpeedVideoFpsRangesFor2, "edge.configId", null))) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeExtension", "Missing edge.configId in Configuration, dropping event with unique id (%s)", event.getUniqueIdentifier());
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(event, false);
        if (Camera2StreamConfigurationMap == null) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeExtension", "Unable to process the event '%s', Identity shared state is null.", event.getUniqueIdentifier());
        } else if (this.Camera2StreamConfigurationMap == null) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeExtension", "Hit queue is null, unable to queue Edge event with id (%s).", event.getUniqueIdentifier());
        } else {
            this.Camera2StreamConfigurationMap.queue(new com.adobe.marketing.mobile.EdgeDataEntity(event, highSpeedVideoFpsRangesFor2, Camera2StreamConfigurationMap).getHighResolutionOutputSizeshNQ4ISI());
        }
    }

    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.Event event) {
        com.adobe.marketing.mobile.SharedStateResult sharedState = getApi().getSharedState(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.EXTENSION_NAME, event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
        if (sharedState == null || sharedState.getStatus() != com.adobe.marketing.mobile.SharedStateStatus.SET) {
            return null;
        }
        return sharedState.getValue();
    }

    private java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap(com.adobe.marketing.mobile.Event event, boolean z) {
        com.adobe.marketing.mobile.SharedStateResult xDMSharedState = getApi().getXDMSharedState("com.adobe.edge.identity", event, z, com.adobe.marketing.mobile.SharedStateResolution.ANY);
        if (xDMSharedState == null || xDMSharedState.getStatus() != com.adobe.marketing.mobile.SharedStateStatus.SET) {
            return null;
        }
        return xDMSharedState.getValue();
    }

    final com.adobe.marketing.mobile.NetworkResponseHandler getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.getInputFormats) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("EdgeDataStorage");
                }
                this.getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.NetworkResponseHandler(this.getHighSpeedVideoFpsRanges, new com.adobe.marketing.mobile.EdgeExtension.EdgeExtensionStateCallback(this, (byte) 0));
            }
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    class EdgeExtensionStateCallback implements com.adobe.marketing.mobile.EdgeStateCallback {
        private EdgeExtensionStateCallback() {
        }

        /* synthetic */ EdgeExtensionStateCallback(com.adobe.marketing.mobile.EdgeExtension edgeExtension, byte b) {
            this();
        }

        @Override // com.adobe.marketing.mobile.EdgeStateCallback
        public final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes() {
            if (com.adobe.marketing.mobile.EdgeExtension.this.getHighSpeedVideoFpsRangesFor != null) {
                return com.adobe.marketing.mobile.EdgeExtension.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
            }
            return null;
        }

        @Override // com.adobe.marketing.mobile.EdgeStateCallback
        public final java.lang.String getHighSpeedVideoFpsRangesFor() {
            if (com.adobe.marketing.mobile.EdgeExtension.this.getHighSpeedVideoFpsRangesFor != null) {
                return com.adobe.marketing.mobile.EdgeExtension.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
            }
            return null;
        }

        @Override // com.adobe.marketing.mobile.EdgeStateCallback
        public final void getHighSpeedVideoSizes(java.lang.String str, int i) {
            if (com.adobe.marketing.mobile.EdgeExtension.this.getHighSpeedVideoFpsRangesFor != null) {
                com.adobe.marketing.mobile.EdgeExtension.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(str, i);
            }
        }
    }
}
