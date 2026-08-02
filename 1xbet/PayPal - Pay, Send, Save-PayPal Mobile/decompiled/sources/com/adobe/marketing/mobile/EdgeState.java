package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeState {
    private boolean Camera2StreamConfigurationMap;
    private final com.adobe.marketing.mobile.EdgeProperties getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges = "EdgeState";
    final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    com.adobe.marketing.mobile.ConsentStatus getHighSpeedVideoSizes;
    private final com.adobe.marketing.mobile.services.HitQueuing getHighSpeedVideoSizesFor;
    private final com.adobe.marketing.mobile.EdgeSharedStateCallback getOutputFormats;
    private java.util.Map<java.lang.String, java.lang.Object> getOutputMinFrameDuration;

    EdgeState(com.adobe.marketing.mobile.services.HitQueuing hitQueuing, com.adobe.marketing.mobile.EdgeProperties edgeProperties, com.adobe.marketing.mobile.EdgeSharedStateCallback edgeSharedStateCallback) {
        com.adobe.marketing.mobile.ConsentStatus consentStatus = com.adobe.marketing.mobile.EdgeConstants.Defaults.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = consentStatus;
        this.getHighResolutionOutputSizeshNQ4ISI = edgeProperties;
        this.getOutputFormats = edgeSharedStateCallback;
        this.getHighSpeedVideoSizesFor = hitQueuing;
        getHighResolutionOutputSizeshNQ4ISI(consentStatus);
    }

    final boolean getHighSpeedVideoFpsRangesFor() {
        java.util.Map optTypedMap;
        if (this.Camera2StreamConfigurationMap) {
            return true;
        }
        com.adobe.marketing.mobile.SharedStateResult highSpeedVideoFpsRanges = this.getOutputFormats.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.NAME);
        if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges.getStatus() != com.adobe.marketing.mobile.SharedStateStatus.SET) {
            return false;
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            com.adobe.marketing.mobile.EdgeProperties edgeProperties = this.getHighResolutionOutputSizeshNQ4ISI;
            com.adobe.marketing.mobile.services.NamedCollection namedCollection = edgeProperties.Camera2StreamConfigurationMap;
            java.util.Map map = null;
            if (namedCollection == null) {
                com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeProperties", "Local Storage Service is null. Unable to load properties from persistence.", new java.lang.Object[0]);
            } else {
                java.lang.String string = namedCollection.getString("locationHint", null);
                long j = edgeProperties.Camera2StreamConfigurationMap.getLong("locationHintExpiryTimestamp", 0L);
                java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("GMT"));
                calendar.setTimeInMillis(j);
                edgeProperties.getHighSpeedVideoSizes = string;
                edgeProperties.getHighResolutionOutputSizeshNQ4ISI = calendar;
            }
            this.getOutputMinFrameDuration = com.adobe.marketing.mobile.ImplementationDetails.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges.getValue());
            java.util.Map<java.lang.String, java.lang.Object> value = highSpeedVideoFpsRanges.getValue();
            if (value != null && (optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, value, com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, null)) != null) {
                map = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, optTypedMap, "com.adobe.edge.consent", null);
            }
            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map)) {
                com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeState", "Consent extension is not registered yet, using default collect status (yes)", new java.lang.Object[0]);
                com.adobe.marketing.mobile.ConsentStatus consentStatus = com.adobe.marketing.mobile.EdgeConstants.Defaults.getHighSpeedVideoFpsRangesFor;
                synchronized (this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighSpeedVideoSizes = consentStatus;
                    getHighResolutionOutputSizeshNQ4ISI(consentStatus);
                }
            }
            com.adobe.marketing.mobile.EdgeSharedStateCallback edgeSharedStateCallback = this.getOutputFormats;
            com.adobe.marketing.mobile.EdgeProperties edgeProperties2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String highSpeedVideoSizes = edgeProperties2.getHighSpeedVideoSizes();
            if (highSpeedVideoSizes != null) {
                hashMap.put("locationHint", highSpeedVideoSizes);
            }
            edgeSharedStateCallback.getHighResolutionOutputSizeshNQ4ISI(hashMap);
        }
        this.Camera2StreamConfigurationMap = true;
        com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeState", "Edge has successfully booted up", new java.lang.Object[0]);
        return this.Camera2StreamConfigurationMap;
    }

    final com.adobe.marketing.mobile.ConsentStatus getHighSpeedVideoFpsRanges() {
        com.adobe.marketing.mobile.ConsentStatus consentStatus;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            consentStatus = this.getHighSpeedVideoSizes;
        }
        return consentStatus;
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes() {
        java.util.Map<java.lang.String, java.lang.Object> map;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            map = this.getOutputMinFrameDuration;
        }
        return map;
    }

    final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String highSpeedVideoSizes;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
        }
        return highSpeedVideoSizes;
    }

    final void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(str, i).booleanValue()) {
                com.adobe.marketing.mobile.EdgeSharedStateCallback edgeSharedStateCallback = this.getOutputFormats;
                com.adobe.marketing.mobile.EdgeProperties edgeProperties = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String highSpeedVideoSizes = edgeProperties.getHighSpeedVideoSizes();
                if (highSpeedVideoSizes != null) {
                    hashMap.put("locationHint", highSpeedVideoSizes);
                }
                edgeSharedStateCallback.getHighResolutionOutputSizeshNQ4ISI(hashMap);
            }
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.ConsentStatus consentStatus) {
        if (this.getHighSpeedVideoSizesFor == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeState", "Unable to update hit queue with consent status. HitQueuing instance is null.", new java.lang.Object[0]);
            return;
        }
        int i = com.adobe.marketing.mobile.EdgeState.AnonymousClass1.getHighSpeedVideoFpsRangesFor[consentStatus.ordinal()];
        if (i == 1) {
            this.getHighSpeedVideoSizesFor.beginProcessing();
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeState", "Collect consent set to (y), resuming the Edge queue.", new java.lang.Object[0]);
        } else if (i == 2) {
            this.getHighSpeedVideoSizesFor.clear();
            this.getHighSpeedVideoSizesFor.beginProcessing();
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeState", "Collect consent set to (n), clearing the Edge queue.", new java.lang.Object[0]);
        } else {
            if (i != 3) {
                return;
            }
            this.getHighSpeedVideoSizesFor.suspend();
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeState", "Collect consent is pending, suspending the Edge queue until (y/n).", new java.lang.Object[0]);
        }
    }

    /* renamed from: com.adobe.marketing.mobile.EdgeState$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.ConsentStatus.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.adobe.marketing.mobile.ConsentStatus.YES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.ConsentStatus.NO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.ConsentStatus.PENDING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
