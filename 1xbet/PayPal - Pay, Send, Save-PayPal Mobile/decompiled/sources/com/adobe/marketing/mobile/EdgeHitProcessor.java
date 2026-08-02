package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeHitProcessor implements com.adobe.marketing.mobile.services.HitProcessing {
    static com.adobe.marketing.mobile.EdgeNetworkService getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRangesFor = java.util.regex.Pattern.compile("^\\/[/.a-zA-Z0-9-~_]+$");
    private final com.adobe.marketing.mobile.NetworkResponseHandler Camera2StreamConfigurationMap;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap<>();
    private final com.adobe.marketing.mobile.services.NamedCollection getHighSpeedVideoSizes;
    private final com.adobe.marketing.mobile.EdgeSharedStateCallback getInputFormats;
    private final com.adobe.marketing.mobile.EdgeStateCallback getOutputMinFrameDuration;

    EdgeHitProcessor(com.adobe.marketing.mobile.NetworkResponseHandler networkResponseHandler, com.adobe.marketing.mobile.EdgeNetworkService edgeNetworkService, com.adobe.marketing.mobile.services.NamedCollection namedCollection, com.adobe.marketing.mobile.EdgeSharedStateCallback edgeSharedStateCallback, com.adobe.marketing.mobile.EdgeStateCallback edgeStateCallback) {
        this.Camera2StreamConfigurationMap = networkResponseHandler;
        getHighResolutionOutputSizeshNQ4ISI = edgeNetworkService;
        this.getHighSpeedVideoSizes = namedCollection;
        this.getInputFormats = edgeSharedStateCallback;
        this.getOutputMinFrameDuration = edgeStateCallback;
    }

    @Override // com.adobe.marketing.mobile.services.HitProcessing
    public int retryInterval(com.adobe.marketing.mobile.services.DataEntity dataEntity) {
        java.lang.Integer num = this.getHighSpeedVideoFpsRanges.get(dataEntity.getUniqueIdentifier());
        if (num != null) {
            return num.intValue();
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0316  */
    @Override // com.adobe.marketing.mobile.services.HitProcessing
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processHit(com.adobe.marketing.mobile.services.DataEntity dataEntity, com.adobe.marketing.mobile.services.HitProcessingResult hitProcessingResult) {
        boolean z;
        org.json.JSONObject jSONObject;
        boolean Camera2StreamConfigurationMap;
        org.json.JSONObject jSONObject2;
        com.adobe.marketing.mobile.EdgeDataEntity Camera2StreamConfigurationMap2 = com.adobe.marketing.mobile.EdgeDataEntity.Camera2StreamConfigurationMap(dataEntity);
        boolean z2 = true;
        if (Camera2StreamConfigurationMap2 == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Unable to deserialize DataEntity to EdgeDataEntity. Dropping the hit.", new java.lang.Object[0]);
            hitProcessingResult.complete(true);
            return;
        }
        com.adobe.marketing.mobile.RequestBuilder requestBuilder = new com.adobe.marketing.mobile.RequestBuilder(this.getHighSpeedVideoSizes);
        java.util.Map<? extends java.lang.String, ? extends java.lang.Object> unmodifiableMap = java.util.Collections.unmodifiableMap(Camera2StreamConfigurationMap2.Camera2StreamConfigurationMap);
        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(unmodifiableMap)) {
            requestBuilder.getInputSizeshNQ4ISI.putAll(unmodifiableMap);
        }
        requestBuilder.getOutputFormats = "\u0000";
        requestBuilder.getHighSpeedVideoFpsRanges = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE;
        if (com.adobe.marketing.mobile.EventUtils.getHighSpeedVideoSizes(Camera2StreamConfigurationMap2.getHighSpeedVideoSizes)) {
            java.lang.String uniqueIdentifier = dataEntity.getUniqueIdentifier();
            com.adobe.marketing.mobile.EdgeStateCallback edgeStateCallback = this.getOutputMinFrameDuration;
            if (edgeStateCallback != null) {
                java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoSizes = edgeStateCallback.getHighSpeedVideoSizes();
                if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(highSpeedVideoSizes)) {
                    requestBuilder.getInputSizeshNQ4ISI.putAll(highSpeedVideoSizes);
                }
            }
            java.util.Map<java.lang.String, java.lang.Object> unmodifiableMap2 = java.util.Collections.unmodifiableMap(Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRangesFor);
            java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(unmodifiableMap2, "edge.configId", null);
            java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap3 = com.adobe.marketing.mobile.EventUtils.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2.getHighSpeedVideoSizes);
            java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(Camera2StreamConfigurationMap3, "datastreamIdOverride", null);
            if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                requestBuilder.getHighSpeedVideoSizes = new com.adobe.marketing.mobile.edge.SDKConfig(new com.adobe.marketing.mobile.edge.Datastream(optString));
            }
            java.util.Map<java.lang.String, java.lang.Object> optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, Camera2StreamConfigurationMap3, "datastreamConfigOverride", null);
            if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap) && !com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
                requestBuilder.getHighSpeedVideoFpsRangesFor = optTypedMap;
            }
            if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString2)) {
                optString = optString2;
            }
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Cannot process Experience Event hit as the Edge Network configuration ID is null or empty, dropping current event (%s).", Camera2StreamConfigurationMap2.getHighSpeedVideoSizes.getUniqueIdentifier());
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(Camera2StreamConfigurationMap2.getHighSpeedVideoSizes);
                if (arrayList.isEmpty()) {
                    jSONObject2 = null;
                } else {
                    com.adobe.marketing.mobile.EdgeRequest edgeRequest = new com.adobe.marketing.mobile.EdgeRequest();
                    com.adobe.marketing.mobile.RequestMetadata.Builder highSpeedVideoFpsRangesFor = new com.adobe.marketing.mobile.RequestMetadata.Builder().getHighSpeedVideoFpsRangesFor(requestBuilder.getHighSpeedVideoFpsRangesFor().Camera2StreamConfigurationMap());
                    com.adobe.marketing.mobile.edge.SDKConfig sDKConfig = requestBuilder.getHighSpeedVideoSizes;
                    java.util.Map<java.lang.String, java.lang.Object> map = sDKConfig != null ? sDKConfig.toMap() : null;
                    if (!highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI) {
                        highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = map != null ? new java.util.HashMap(map) : new java.util.HashMap();
                        java.util.Map<java.lang.String, java.lang.Object> map2 = requestBuilder.getHighSpeedVideoFpsRangesFor;
                        if (!highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI) {
                            highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes = map2 != null ? new java.util.HashMap(map2) : new java.util.HashMap();
                            java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoSizes2 = new com.adobe.marketing.mobile.StateMetadata(requestBuilder.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges()).getHighSpeedVideoSizes();
                            if (!highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI) {
                                highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = highSpeedVideoSizes2 != null ? new java.util.HashMap(highSpeedVideoSizes2) : new java.util.HashMap();
                                if (!highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI) {
                                    highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = true;
                                    edgeRequest.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                                    edgeRequest.Camera2StreamConfigurationMap = requestBuilder.getInputSizeshNQ4ISI;
                                    jSONObject2 = edgeRequest.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.RequestBuilder.getHighSpeedVideoFpsRanges(arrayList));
                                } else {
                                    throw new java.lang.UnsupportedOperationException("RequestMetadata.Builder - attempt to call setters after build() was called.");
                                }
                            } else {
                                throw new java.lang.UnsupportedOperationException("RequestMetadata.Builder - attempt to call setters after build() was called.");
                            }
                        } else {
                            throw new java.lang.UnsupportedOperationException("RequestMetadata.Builder - attempt to call setters after build() was called.");
                        }
                    } else {
                        throw new java.lang.UnsupportedOperationException("RequestMetadata.Builder - attempt to call setters after build() was called.");
                    }
                }
                if (jSONObject2 == null) {
                    com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeHitProcessor", "Failed to build the request payload, dropping current event (%s).", Camera2StreamConfigurationMap2.getHighSpeedVideoSizes.getUniqueIdentifier());
                    z2 = true;
                } else {
                    com.adobe.marketing.mobile.Event event = Camera2StreamConfigurationMap2.getHighSpeedVideoSizes;
                    java.util.Map<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
                    java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "request", null), "path", null);
                    if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                        if (optString3.contains("//") || !getHighSpeedVideoFpsRangesFor.matcher(optString3).find()) {
                            com.adobe.marketing.mobile.services.Log.error("Edge", "EdgeHitProcessor", "Dropping the overwrite path value: (%s), since it contains invalid characters or is empty or null.", optString3);
                        }
                        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                            com.adobe.marketing.mobile.services.Log.trace("Edge", "EdgeHitProcessor", "Got custom path:(%s) for event:(%s), which will overwrite the default interaction request path.", optString3, event.getUniqueIdentifier());
                            hashMap.put("path", optString3);
                        }
                        com.adobe.marketing.mobile.EdgeHit edgeHit = new com.adobe.marketing.mobile.EdgeHit(optString, jSONObject2, getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.EdgeNetworkService.RequestType.INTERACT, unmodifiableMap2, hashMap));
                        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(edgeHit.getHighResolutionOutputSizeshNQ4ISI, arrayList);
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(uniqueIdentifier, edgeHit, getHighSpeedVideoFpsRanges());
                        z2 = Camera2StreamConfigurationMap;
                    }
                    optString3 = null;
                    if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString3)) {
                    }
                    com.adobe.marketing.mobile.EdgeHit edgeHit2 = new com.adobe.marketing.mobile.EdgeHit(optString, jSONObject2, getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.EdgeNetworkService.RequestType.INTERACT, unmodifiableMap2, hashMap));
                    this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(edgeHit2.getHighResolutionOutputSizeshNQ4ISI, arrayList);
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(uniqueIdentifier, edgeHit2, getHighSpeedVideoFpsRanges());
                    z2 = Camera2StreamConfigurationMap;
                }
            }
        } else {
            if (com.adobe.marketing.mobile.EventUtils.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2.getHighSpeedVideoSizes)) {
                java.lang.String uniqueIdentifier2 = dataEntity.getUniqueIdentifier();
                com.adobe.marketing.mobile.Event event2 = Camera2StreamConfigurationMap2.getHighSpeedVideoSizes;
                if (event2 == null || com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(event2.getEventData())) {
                    z = true;
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "RequestBuilder", "RequestBuilder - Unable to process the consent update request, event/event data is null", new java.lang.Object[0]);
                } else {
                    if (!event2.getEventData().containsKey("consents")) {
                        com.adobe.marketing.mobile.services.Log.debug("Edge", "RequestBuilder", "Unable to process the consent update request, no consents data", new java.lang.Object[0]);
                    } else {
                        java.util.Map optTypedMap2 = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event2.getEventData(), "consents", null);
                        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap2)) {
                            com.adobe.marketing.mobile.services.Log.debug("Edge", "RequestBuilder", "Failed to read consents from event data, not a valid map", new java.lang.Object[0]);
                        } else {
                            com.adobe.marketing.mobile.EdgeConsentUpdate edgeConsentUpdate = new com.adobe.marketing.mobile.EdgeConsentUpdate(optTypedMap2);
                            com.adobe.marketing.mobile.QueryOptions queryOptions = new com.adobe.marketing.mobile.QueryOptions();
                            java.util.Map<java.lang.String, java.lang.Object> map3 = com.adobe.marketing.mobile.RequestBuilder.Camera2StreamConfigurationMap;
                            queryOptions.getHighSpeedVideoFpsRangesFor = map3 != null ? new java.util.HashMap(map3) : new java.util.HashMap();
                            edgeConsentUpdate.Camera2StreamConfigurationMap = queryOptions;
                            java.util.Map<java.lang.String, java.lang.Object> optTypedMap3 = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, requestBuilder.getInputSizeshNQ4ISI, "identityMap", null);
                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap3)) {
                                com.adobe.marketing.mobile.services.Log.debug("Edge", "RequestBuilder", "Failed to read identityMap from request payload, not a map", new java.lang.Object[0]);
                            } else {
                                edgeConsentUpdate.getHighSpeedVideoFpsRangesFor = optTypedMap3;
                            }
                            com.adobe.marketing.mobile.RequestMetadata.Builder highSpeedVideoFpsRangesFor2 = new com.adobe.marketing.mobile.RequestMetadata.Builder().getHighSpeedVideoFpsRangesFor(requestBuilder.getHighSpeedVideoFpsRangesFor().Camera2StreamConfigurationMap());
                            if (!highSpeedVideoFpsRangesFor2.getHighResolutionOutputSizeshNQ4ISI) {
                                z = true;
                                highSpeedVideoFpsRangesFor2.getHighResolutionOutputSizeshNQ4ISI = true;
                                edgeConsentUpdate.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor2.getHighSpeedVideoFpsRanges;
                                if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(edgeConsentUpdate.getHighSpeedVideoSizes)) {
                                    com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeConsentUpdate", "Invalid consent update request, consents payload was null/empty.", new java.lang.Object[0]);
                                } else {
                                    java.util.HashMap hashMap2 = new java.util.HashMap();
                                    com.adobe.marketing.mobile.RequestMetadata requestMetadata = edgeConsentUpdate.getHighResolutionOutputSizeshNQ4ISI;
                                    if (requestMetadata != null) {
                                        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap2, com.adjust.sdk.Constants.REFERRER_API_META, requestMetadata.getHighSpeedVideoFpsRangesFor());
                                    }
                                    com.adobe.marketing.mobile.QueryOptions queryOptions2 = edgeConsentUpdate.Camera2StreamConfigurationMap;
                                    if (queryOptions2 != null) {
                                        java.util.HashMap hashMap3 = new java.util.HashMap();
                                        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap3, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, queryOptions2.getHighSpeedVideoFpsRangesFor);
                                        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap2, "query", hashMap3);
                                    }
                                    com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap2, "identityMap", edgeConsentUpdate.getHighSpeedVideoFpsRangesFor);
                                    java.util.HashMap hashMap4 = new java.util.HashMap();
                                    hashMap4.put("standard", "Adobe");
                                    hashMap4.put("version", "2.0");
                                    hashMap4.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, edgeConsentUpdate.getHighSpeedVideoSizes);
                                    hashMap2.put(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>(hashMap4) { // from class: com.adobe.marketing.mobile.EdgeConsentUpdate.1
                                        final /* synthetic */ java.util.Map getHighSpeedVideoFpsRangesFor;

                                        AnonymousClass1(java.util.Map hashMap42) {
                                            this.getHighSpeedVideoFpsRangesFor = hashMap42;
                                            add(hashMap42);
                                        }
                                    });
                                    jSONObject = new org.json.JSONObject(hashMap2);
                                    if (jSONObject != null) {
                                        com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Failed to build the consent payload, dropping current event (%s).", Camera2StreamConfigurationMap2.getHighSpeedVideoSizes.getUniqueIdentifier());
                                    } else {
                                        java.util.Map<java.lang.String, java.lang.Object> unmodifiableMap3 = java.util.Collections.unmodifiableMap(Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRangesFor);
                                        java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(unmodifiableMap3, "edge.configId", null);
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString4)) {
                                            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Cannot process Update Consent hit as the Edge Network configuration ID is null or empty, dropping current event (%s).", Camera2StreamConfigurationMap2.getHighSpeedVideoSizes.getUniqueIdentifier());
                                        } else {
                                            com.adobe.marketing.mobile.EdgeHit edgeHit3 = new com.adobe.marketing.mobile.EdgeHit(optString4, jSONObject, getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.EdgeNetworkService.RequestType.CONSENT, unmodifiableMap3, null));
                                            com.adobe.marketing.mobile.NetworkResponseHandler networkResponseHandler = this.Camera2StreamConfigurationMap;
                                            java.lang.String str = edgeHit3.getHighResolutionOutputSizeshNQ4ISI;
                                            com.adobe.marketing.mobile.Event event3 = Camera2StreamConfigurationMap2.getHighSpeedVideoSizes;
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            arrayList2.add(event3);
                                            networkResponseHandler.getHighSpeedVideoFpsRanges(str, arrayList2);
                                            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(uniqueIdentifier2, edgeHit3, getHighSpeedVideoFpsRanges());
                                            z2 = Camera2StreamConfigurationMap;
                                        }
                                    }
                                }
                            } else {
                                throw new java.lang.UnsupportedOperationException("RequestMetadata.Builder - attempt to call setters after build() was called.");
                            }
                        }
                    }
                    z = true;
                }
                jSONObject = null;
                if (jSONObject != null) {
                }
            } else {
                z = true;
                if (com.adobe.marketing.mobile.EventUtils.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2.getHighSpeedVideoSizes)) {
                    com.adobe.marketing.mobile.services.NamedCollection namedCollection = new com.adobe.marketing.mobile.StoreResponsePayloadManager(this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap;
                    if (namedCollection == null) {
                        com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Cannot delete the store payloads, dataStore is null.", new java.lang.Object[0]);
                    } else {
                        namedCollection.remove("storePayloads");
                    }
                }
            }
            z2 = z;
        }
        hitProcessingResult.complete(z2);
    }

    private com.adobe.marketing.mobile.EdgeEndpoint getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.EdgeNetworkService.RequestType requestType, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(map, "edge.environment", null);
        java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(map, "edge.domain", null);
        com.adobe.marketing.mobile.EdgeStateCallback edgeStateCallback = this.getOutputMinFrameDuration;
        return new com.adobe.marketing.mobile.EdgeEndpoint(requestType, optString, optString2, com.adobe.marketing.mobile.util.DataReader.optString(map2, "path", null), edgeStateCallback != null ? edgeStateCallback.getHighSpeedVideoFpsRangesFor() : null);
    }

    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.adobe.marketing.mobile.EdgeSharedStateCallback edgeSharedStateCallback = this.getInputFormats;
        if (edgeSharedStateCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Unexpected null sharedStateCallback, unable to fetch Assurance shared state.", new java.lang.Object[0]);
            return hashMap;
        }
        com.adobe.marketing.mobile.SharedStateResult highSpeedVideoFpsRanges = edgeSharedStateCallback.getHighSpeedVideoFpsRanges("com.adobe.assurance");
        if (highSpeedVideoFpsRanges != null && highSpeedVideoFpsRanges.getStatus() == com.adobe.marketing.mobile.SharedStateStatus.SET) {
            java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(highSpeedVideoFpsRanges.getValue(), "integrationid", null);
            if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                hashMap.put("X-Adobe-AEP-Validation-Token", optString);
            }
        }
        return hashMap;
    }

    private boolean Camera2StreamConfigurationMap(java.lang.String str, final com.adobe.marketing.mobile.EdgeHit edgeHit, java.util.Map<java.lang.String, java.lang.String> map) {
        com.adobe.marketing.mobile.RetryResult retryResult;
        if (edgeHit.Camera2StreamConfigurationMap == null || edgeHit.Camera2StreamConfigurationMap.length() == 0) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeHitProcessor", "Request body was null/empty, dropping this request", new java.lang.Object[0]);
            return true;
        }
        com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback responseCallback = new com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback() { // from class: com.adobe.marketing.mobile.EdgeHitProcessor.1
            /* JADX WARN: Code restructure failed: missing block: B:78:0x018e, code lost:
            
                r0 = com.adobe.marketing.mobile.util.DataReader.getString(r1, "hint");
                r1 = com.adobe.marketing.mobile.util.DataReader.getInt(r1, "ttlSeconds");
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x019e, code lost:
            
                if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(r0) != false) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x01a0, code lost:
            
                r5 = r6.getHighSpeedVideoSizes;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x01a2, code lost:
            
                if (r5 == null) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x01a4, code lost:
            
                r5.getHighSpeedVideoSizes(r0, r1);
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x01cf A[Catch: JSONException -> 0x0208, TryCatch #3 {JSONException -> 0x0208, blocks: (B:10:0x0039, B:12:0x003f, B:14:0x004f, B:15:0x0058, B:21:0x0090, B:23:0x0097, B:26:0x01b6, B:28:0x01cf, B:29:0x01d4, B:31:0x01e2, B:35:0x00ad, B:37:0x00b7, B:39:0x00c1, B:41:0x00cb, B:44:0x00de, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:51:0x0100, B:52:0x0109, B:54:0x010f, B:56:0x0122, B:58:0x012a, B:61:0x0130, B:65:0x0140, B:66:0x0149, B:68:0x0157, B:70:0x0161, B:72:0x016b, B:73:0x0173, B:75:0x0179, B:78:0x018e, B:80:0x01a0, B:82:0x01a4, B:85:0x01a9, B:93:0x0076, B:19:0x006e), top: B:9:0x0039, inners: #0, #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x01e2 A[Catch: JSONException -> 0x0208, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0208, blocks: (B:10:0x0039, B:12:0x003f, B:14:0x004f, B:15:0x0058, B:21:0x0090, B:23:0x0097, B:26:0x01b6, B:28:0x01cf, B:29:0x01d4, B:31:0x01e2, B:35:0x00ad, B:37:0x00b7, B:39:0x00c1, B:41:0x00cb, B:44:0x00de, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:51:0x0100, B:52:0x0109, B:54:0x010f, B:56:0x0122, B:58:0x012a, B:61:0x0130, B:65:0x0140, B:66:0x0149, B:68:0x0157, B:70:0x0161, B:72:0x016b, B:73:0x0173, B:75:0x0179, B:78:0x018e, B:80:0x01a0, B:82:0x01a4, B:85:0x01a9, B:93:0x0076, B:19:0x006e), top: B:9:0x0039, inners: #0, #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x01fc A[SYNTHETIC] */
            @Override // com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void getHighSpeedVideoFpsRangesFor(java.lang.String str2) {
                org.json.JSONObject jSONObject;
                java.lang.String str3;
                boolean z;
                java.lang.String Camera2StreamConfigurationMap;
                java.lang.String str4 = "state:store";
                com.adobe.marketing.mobile.NetworkResponseHandler networkResponseHandler = com.adobe.marketing.mobile.EdgeHitProcessor.this.Camera2StreamConfigurationMap;
                java.lang.String str5 = edgeHit.getHighResolutionOutputSizeshNQ4ISI;
                if (str2 == null) {
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "Received null response content for request id (%s)", str5);
                    return;
                }
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                    int i = 2;
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "Received server response:\n%s", jSONObject2.toString(2));
                    try {
                        if (!com.adobe.marketing.mobile.util.JSONUtils.isNullOrEmpty(jSONObject2)) {
                            boolean highSpeedVideoFpsRanges = networkResponseHandler.getHighSpeedVideoFpsRanges(str5);
                            org.json.JSONArray jSONArray = jSONObject2.getJSONArray("handle");
                            if (com.adobe.marketing.mobile.util.JSONUtils.isNullOrEmpty(jSONArray)) {
                                com.adobe.marketing.mobile.services.Log.trace("Edge", "NetworkResponseHandler", "Received null/empty event handle array, nothing to handle", new java.lang.Object[0]);
                            } else {
                                int length = jSONArray.length();
                                com.adobe.marketing.mobile.services.Log.trace("Edge", "NetworkResponseHandler", "Processing %d event handle(s) for request id: %s", java.lang.Integer.valueOf(length), str5);
                                int i2 = 0;
                                while (i2 < length) {
                                    try {
                                        jSONObject = jSONArray.getJSONObject(i2);
                                    } catch (org.json.JSONException e) {
                                        java.lang.String localizedMessage = e.getLocalizedMessage();
                                        java.lang.Object[] objArr = new java.lang.Object[i];
                                        objArr[0] = java.lang.Integer.valueOf(i2);
                                        objArr[1] = localizedMessage;
                                        com.adobe.marketing.mobile.services.Log.trace("Edge", "NetworkResponseHandler", "Event handle with index %d was not processed due to JSONException: %s", objArr);
                                        jSONObject = null;
                                    }
                                    if (jSONObject != null) {
                                        com.adobe.marketing.mobile.EdgeEventHandle edgeEventHandle = new com.adobe.marketing.mobile.EdgeEventHandle(jSONObject);
                                        if (highSpeedVideoFpsRanges) {
                                            com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "Identities were reset recently, ignoring state:store payload for request with id: ".concat(java.lang.String.valueOf(str5)), new java.lang.Object[0]);
                                        } else {
                                            if (!str4.equals(edgeEventHandle.getType())) {
                                                str3 = str4;
                                                z = highSpeedVideoFpsRanges;
                                                if ("locationHint:result".equals(edgeEventHandle.getType()) && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(edgeEventHandle.getType()) && "locationHint:result".equals(edgeEventHandle.getType())) {
                                                    java.util.Iterator<java.util.Map<java.lang.String, java.lang.Object>> it = edgeEventHandle.getPayload().iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            break;
                                                        }
                                                        java.util.Map<java.lang.String, java.lang.Object> next = it.next();
                                                        if ("EdgeNetwork".equals(com.adobe.marketing.mobile.util.DataReader.optString(next, com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, null))) {
                                                            try {
                                                                break;
                                                            } catch (com.adobe.marketing.mobile.util.DataReaderException e2) {
                                                                com.adobe.marketing.mobile.services.Log.warning("Edge", "NetworkResponseHandler", "Failed to parse 'locationHint:result' for scope 'EdgeNetwork': %s", e2.getLocalizedMessage());
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(edgeEventHandle.getType()) && str4.equals(edgeEventHandle.getType())) {
                                                com.adobe.marketing.mobile.StoreResponsePayloadManager storeResponsePayloadManager = new com.adobe.marketing.mobile.StoreResponsePayloadManager(networkResponseHandler.Camera2StreamConfigurationMap);
                                                java.util.List<java.util.Map<java.lang.String, java.lang.Object>> payload = edgeEventHandle.getPayload();
                                                com.adobe.marketing.mobile.services.NamedCollection namedCollection = storeResponsePayloadManager.Camera2StreamConfigurationMap;
                                                str3 = str4;
                                                if (namedCollection == null) {
                                                    com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Cannot save stores, dataStore is null.", new java.lang.Object[0]);
                                                    z = highSpeedVideoFpsRanges;
                                                } else {
                                                    z = highSpeedVideoFpsRanges;
                                                    if (payload == null) {
                                                        com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Cannot save stores, responsePayloads is null.", new java.lang.Object[0]);
                                                    } else {
                                                        java.util.Map<java.lang.String, java.lang.String> map2 = namedCollection.getMap("storePayloads");
                                                        if (map2 == null) {
                                                            map2 = new java.util.HashMap<>();
                                                        }
                                                        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                                                        java.util.Iterator<java.util.Map<java.lang.String, java.lang.Object>> it2 = payload.iterator();
                                                        while (it2.hasNext()) {
                                                            java.util.Iterator<java.util.Map<java.lang.String, java.lang.Object>> it3 = it2;
                                                            com.adobe.marketing.mobile.StoreResponsePayload highSpeedVideoFpsRanges2 = com.adobe.marketing.mobile.StoreResponsePayload.getHighSpeedVideoFpsRanges(new org.json.JSONObject(it2.next()));
                                                            if (highSpeedVideoFpsRanges2 != null) {
                                                                if (highSpeedVideoFpsRanges2.getHighSpeedVideoSizes.intValue() <= 0) {
                                                                    arrayList.add(highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges);
                                                                } else {
                                                                    map2.put(highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges().toString());
                                                                }
                                                            }
                                                            it2 = it3;
                                                        }
                                                        storeResponsePayloadManager.Camera2StreamConfigurationMap.setMap("storePayloads", map2);
                                                        storeResponsePayloadManager.getHighSpeedVideoFpsRanges(arrayList);
                                                    }
                                                }
                                            }
                                            Camera2StreamConfigurationMap = networkResponseHandler.Camera2StreamConfigurationMap(edgeEventHandle.getHighResolutionOutputSizeshNQ4ISI, str5);
                                            java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap2 = edgeEventHandle.Camera2StreamConfigurationMap();
                                            java.lang.String type = edgeEventHandle.getType();
                                            Camera2StreamConfigurationMap2.put("requestId", str5);
                                            if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(Camera2StreamConfigurationMap)) {
                                                Camera2StreamConfigurationMap2.put("requestEventId", Camera2StreamConfigurationMap);
                                            }
                                            com.adobe.marketing.mobile.NetworkResponseHandler.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap, false, type);
                                            com.adobe.marketing.mobile.CompletionCallbacksManager Camera2StreamConfigurationMap3 = com.adobe.marketing.mobile.CompletionCallbacksManager.Camera2StreamConfigurationMap();
                                            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(Camera2StreamConfigurationMap)) {
                                                Camera2StreamConfigurationMap3.Camera2StreamConfigurationMap.putIfAbsent(Camera2StreamConfigurationMap, new java.util.ArrayList());
                                                Camera2StreamConfigurationMap3.Camera2StreamConfigurationMap.get(Camera2StreamConfigurationMap).add(edgeEventHandle);
                                            }
                                        }
                                        str3 = str4;
                                        z = highSpeedVideoFpsRanges;
                                        Camera2StreamConfigurationMap = networkResponseHandler.Camera2StreamConfigurationMap(edgeEventHandle.getHighResolutionOutputSizeshNQ4ISI, str5);
                                        java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap22 = edgeEventHandle.Camera2StreamConfigurationMap();
                                        java.lang.String type2 = edgeEventHandle.getType();
                                        Camera2StreamConfigurationMap22.put("requestId", str5);
                                        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(Camera2StreamConfigurationMap)) {
                                        }
                                        com.adobe.marketing.mobile.NetworkResponseHandler.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap22, Camera2StreamConfigurationMap, false, type2);
                                        com.adobe.marketing.mobile.CompletionCallbacksManager Camera2StreamConfigurationMap32 = com.adobe.marketing.mobile.CompletionCallbacksManager.Camera2StreamConfigurationMap();
                                        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(Camera2StreamConfigurationMap)) {
                                        }
                                    } else {
                                        str3 = str4;
                                        z = highSpeedVideoFpsRanges;
                                    }
                                    i2++;
                                    str4 = str3;
                                    highSpeedVideoFpsRanges = z;
                                    i = 2;
                                }
                            }
                        }
                    } catch (org.json.JSONException unused) {
                    }
                    try {
                        if (!com.adobe.marketing.mobile.util.JSONUtils.isNullOrEmpty(jSONObject2)) {
                            networkResponseHandler.getHighSpeedVideoFpsRangesFor(jSONObject2.getJSONArray(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY), true, str5);
                        }
                    } catch (org.json.JSONException unused2) {
                    }
                    try {
                        if (com.adobe.marketing.mobile.util.JSONUtils.isNullOrEmpty(jSONObject2)) {
                            return;
                        }
                        networkResponseHandler.getHighSpeedVideoFpsRangesFor(jSONObject2.getJSONArray("warnings"), false, str5);
                    } catch (org.json.JSONException unused3) {
                    }
                } catch (org.json.JSONException e3) {
                    com.adobe.marketing.mobile.services.Log.warning("Edge", "NetworkResponseHandler", "The conversion to JSONObject failed for server response: (%s), request id (%s) with error: %s", str2, str5, e3.getLocalizedMessage());
                }
            }

            @Override // com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback
            public final void getHighSpeedVideoSizes(java.lang.String str2) {
                com.adobe.marketing.mobile.NetworkResponseHandler networkResponseHandler = com.adobe.marketing.mobile.EdgeHitProcessor.this.Camera2StreamConfigurationMap;
                java.lang.String str3 = edgeHit.getHighResolutionOutputSizeshNQ4ISI;
                if (str2 == null) {
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "Received null error response content, request id (%s)", str3);
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "Processing server error response: %s", jSONObject.toString(2));
                    if (jSONObject.has(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY)) {
                        try {
                            networkResponseHandler.getHighSpeedVideoFpsRangesFor(jSONObject.getJSONArray(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY), true, str3);
                        } catch (org.json.JSONException unused) {
                        }
                    } else {
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        jSONArray.put(jSONObject);
                        networkResponseHandler.getHighSpeedVideoFpsRangesFor(jSONArray, true, str3);
                    }
                } catch (org.json.JSONException e) {
                    com.adobe.marketing.mobile.services.Log.warning("Edge", "NetworkResponseHandler", "The conversion to JSONObject failed for server response: (%s), request id (%s) with error: %s", str2, str3, e.getLocalizedMessage());
                }
            }

            @Override // com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback
            public final void getHighSpeedVideoSizes() {
                com.adobe.marketing.mobile.NetworkResponseHandler networkResponseHandler = com.adobe.marketing.mobile.EdgeHitProcessor.this.Camera2StreamConfigurationMap;
                java.lang.String str2 = edgeHit.getHighResolutionOutputSizeshNQ4ISI;
                java.util.List<com.adobe.marketing.mobile.Event> Camera2StreamConfigurationMap = networkResponseHandler.Camera2StreamConfigurationMap(str2);
                if (Camera2StreamConfigurationMap != null) {
                    for (com.adobe.marketing.mobile.Event event : Camera2StreamConfigurationMap) {
                        com.adobe.marketing.mobile.CompletionCallbacksManager Camera2StreamConfigurationMap2 = com.adobe.marketing.mobile.CompletionCallbacksManager.Camera2StreamConfigurationMap();
                        java.lang.String uniqueIdentifier = event.getUniqueIdentifier();
                        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(uniqueIdentifier)) {
                            com.adobe.marketing.mobile.EdgeCallback remove = Camera2StreamConfigurationMap2.getHighResolutionOutputSizeshNQ4ISI.remove(uniqueIdentifier);
                            if (remove != null) {
                                java.util.List<com.adobe.marketing.mobile.EdgeEventHandle> list = Camera2StreamConfigurationMap2.Camera2StreamConfigurationMap.get(uniqueIdentifier);
                                if (list == null) {
                                    try {
                                        list = new java.util.ArrayList<>();
                                    } catch (java.lang.Exception e) {
                                        com.adobe.marketing.mobile.services.Log.warning("Edge", "CompletionCallbacksManager", "Exception thrown when invoking completion callback for request event id %s: %s", uniqueIdentifier, android.util.Log.getStackTraceString(e));
                                    }
                                }
                                remove.onComplete(list);
                                com.adobe.marketing.mobile.services.Log.trace("Edge", "CompletionCallbacksManager", "Removing callback for Edge response with request event id ".concat(java.lang.String.valueOf(uniqueIdentifier)), new java.lang.Object[0]);
                            }
                            Camera2StreamConfigurationMap2.Camera2StreamConfigurationMap.remove(uniqueIdentifier);
                        }
                        if (com.adobe.marketing.mobile.NetworkResponseHandler.getHighResolutionOutputSizeshNQ4ISI(event)) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            com.adobe.marketing.mobile.NetworkResponseHandler.getHighResolutionOutputSizeshNQ4ISI(hashMap, str2, null);
                            com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("AEP Response Complete", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.CONTENT_COMPLETE).setEventData(hashMap).inResponseToEvent(event).build());
                        }
                    }
                }
            }
        };
        java.lang.String highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.EdgeNetworkService.getHighResolutionOutputSizeshNQ4ISI(edgeHit.getHighSpeedVideoSizes, edgeHit.getHighSpeedVideoFpsRanges, edgeHit.getHighResolutionOutputSizeshNQ4ISI);
        if (!com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(highResolutionOutputSizeshNQ4ISI)) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Request invalid, URL is malformed, '%s'.", highResolutionOutputSizeshNQ4ISI);
        } else if (!highResolutionOutputSizeshNQ4ISI.startsWith("https")) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Request invalid, URL scheme must be 'https', '%s'.", highResolutionOutputSizeshNQ4ISI);
        } else {
            try {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Sending network request with id (%s) to URL '%s' with body:\n%s", edgeHit.getHighResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI, edgeHit.Camera2StreamConfigurationMap.toString(2));
            } catch (org.json.JSONException e) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeHitProcessor", "Sending network request with id (%s) to URL '%s'\nError parsing JSON request: %s", edgeHit.getHighResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI, e.getLocalizedMessage());
            }
            com.adobe.marketing.mobile.EdgeNetworkService edgeNetworkService = getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String jSONObject = edgeHit.Camera2StreamConfigurationMap.toString();
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highResolutionOutputSizeshNQ4ISI)) {
                com.adobe.marketing.mobile.services.Log.error("Edge", "EdgeNetworkService", "Could not send request to a null url", new java.lang.Object[0]);
                responseCallback.getHighSpeedVideoSizes();
                retryResult = new com.adobe.marketing.mobile.RetryResult(com.adobe.marketing.mobile.EdgeNetworkService.Retry.NO);
            } else {
                com.adobe.marketing.mobile.services.HttpConnecting highResolutionOutputSizeshNQ4ISI2 = edgeNetworkService.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, jSONObject, map);
                if (highResolutionOutputSizeshNQ4ISI2 == null) {
                    retryResult = new com.adobe.marketing.mobile.RetryResult(com.adobe.marketing.mobile.EdgeNetworkService.Retry.YES);
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Network request returned null connection. Will retry request in %d seconds.", java.lang.Integer.valueOf(retryResult.Camera2StreamConfigurationMap));
                } else {
                    com.adobe.marketing.mobile.RetryResult retryResult2 = new com.adobe.marketing.mobile.RetryResult(com.adobe.marketing.mobile.EdgeNetworkService.Retry.NO);
                    if (highResolutionOutputSizeshNQ4ISI2.getResponseCode() == 200) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Interact connection to Experience Edge successful. Response message: ");
                        sb.append(highResolutionOutputSizeshNQ4ISI2.getResponseMessage());
                        com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", sb.toString(), new java.lang.Object[0]);
                        com.adobe.marketing.mobile.KonductorConfig highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.KonductorConfig.getHighSpeedVideoFpsRangesFor(jSONObject);
                        boolean z = highSpeedVideoFpsRangesFor != null && highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                        edgeNetworkService.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI2.getInputStream(), z ? highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI : null, z ? highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges : null, responseCallback);
                    } else if (highResolutionOutputSizeshNQ4ISI2.getResponseCode() == 204) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Interact connection to Experience Edge successful. Response message: ");
                        sb2.append(highResolutionOutputSizeshNQ4ISI2.getResponseMessage());
                        com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", sb2.toString(), new java.lang.Object[0]);
                    } else if (com.adobe.marketing.mobile.EdgeNetworkService.Camera2StreamConfigurationMap.contains(java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI2.getResponseCode()))) {
                        retryResult2 = new com.adobe.marketing.mobile.RetryResult(com.adobe.marketing.mobile.EdgeNetworkService.Retry.YES, com.adobe.marketing.mobile.EdgeNetworkService.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI2));
                        if (highResolutionOutputSizeshNQ4ISI2.getResponseCode() == -1) {
                            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Connection to Experience Edge failed. Failed to read message/error code from NetworkService. Will retry request in %d seconds.", java.lang.Integer.valueOf(retryResult2.Camera2StreamConfigurationMap));
                        } else {
                            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Connection to Experience Edge returned recoverable error code (%d). Response message: %s. Will retry request in %d seconds.", java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI2.getResponseCode()), highResolutionOutputSizeshNQ4ISI2.getResponseMessage(), java.lang.Integer.valueOf(retryResult2.Camera2StreamConfigurationMap));
                        }
                    } else if (highResolutionOutputSizeshNQ4ISI2.getResponseCode() == 207) {
                        com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Interact connection to Experience Edge successful but encountered non-fatal errors/warnings. Response message: %s", highResolutionOutputSizeshNQ4ISI2.getResponseMessage());
                        com.adobe.marketing.mobile.KonductorConfig highSpeedVideoFpsRangesFor2 = com.adobe.marketing.mobile.KonductorConfig.getHighSpeedVideoFpsRangesFor(jSONObject);
                        boolean z2 = highSpeedVideoFpsRangesFor2 != null && highSpeedVideoFpsRangesFor2.Camera2StreamConfigurationMap;
                        edgeNetworkService.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI2.getInputStream(), z2 ? highSpeedVideoFpsRangesFor2.getHighResolutionOutputSizeshNQ4ISI : null, z2 ? highSpeedVideoFpsRangesFor2.getHighSpeedVideoFpsRanges : null, responseCallback);
                    } else {
                        com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeNetworkService", "Connection to Experience Edge returned unrecoverable error code (%d). Response message: %s", java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI2.getResponseCode()), highResolutionOutputSizeshNQ4ISI2.getResponseMessage());
                        java.io.InputStream errorStream = highResolutionOutputSizeshNQ4ISI2.getErrorStream();
                        if (errorStream == null) {
                            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Network response contains no data, error InputStream is null.", new java.lang.Object[0]);
                            responseCallback.getHighSpeedVideoSizes(com.adobe.marketing.mobile.EdgeNetworkService.getHighSpeedVideoFpsRangesFor(null));
                        } else {
                            java.lang.String highSpeedVideoSizes = com.adobe.marketing.mobile.EdgeNetworkService.getHighSpeedVideoSizes(errorStream);
                            try {
                                if (highSpeedVideoSizes != null) {
                                    new org.json.JSONObject(highSpeedVideoSizes);
                                } else {
                                    highSpeedVideoSizes = com.adobe.marketing.mobile.EdgeNetworkService.getHighSpeedVideoFpsRangesFor(null);
                                }
                            } catch (org.json.JSONException unused) {
                                highSpeedVideoSizes = com.adobe.marketing.mobile.EdgeNetworkService.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                                com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeNetworkService", "Network response has Content-Type application/json, but cannot be parsed as JSON, returning generic error", new java.lang.Object[0]);
                            }
                            responseCallback.getHighSpeedVideoSizes(highSpeedVideoSizes);
                        }
                    }
                    highResolutionOutputSizeshNQ4ISI2.close();
                    if (retryResult2.getHighResolutionOutputSizeshNQ4ISI == com.adobe.marketing.mobile.EdgeNetworkService.Retry.NO) {
                        responseCallback.getHighSpeedVideoSizes();
                    }
                    retryResult = retryResult2;
                }
            }
            if (retryResult.getHighResolutionOutputSizeshNQ4ISI == com.adobe.marketing.mobile.EdgeNetworkService.Retry.NO) {
                if (str != null) {
                    this.getHighSpeedVideoFpsRanges.remove(str);
                }
                return true;
            }
            if (str != null && retryResult.Camera2StreamConfigurationMap != 5) {
                this.getHighSpeedVideoFpsRanges.put(str, java.lang.Integer.valueOf(retryResult.Camera2StreamConfigurationMap));
            }
            return false;
        }
        com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeHitProcessor", "Unable to send network request for entity (%s) as URL is malformed or scheme is not 'https', '%s'.", str, highResolutionOutputSizeshNQ4ISI);
        return true;
    }
}
