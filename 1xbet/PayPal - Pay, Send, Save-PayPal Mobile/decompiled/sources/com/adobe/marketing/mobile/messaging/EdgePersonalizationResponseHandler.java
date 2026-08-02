package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class EdgePersonalizationResponseHandler {
    private static final java.util.List<java.lang.String> getOutputMinFrameDurationlomOqCM = new java.util.ArrayList<java.lang.String>() { // from class: com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.1
        {
            add("https://ns.adobe.com/personalization/html-content-item");
            add("https://ns.adobe.com/personalization/json-content-item");
            add("https://ns.adobe.com/personalization/ruleset-item");
        }
    };
    final java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> Camera2StreamConfigurationMap;
    final com.adobe.marketing.mobile.ExtensionApi getHighResolutionOutputSizeshNQ4ISI;
    java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getHighSpeedVideoFpsRanges;
    final java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> getHighSpeedVideoFpsRangesFor;
    final com.adobe.marketing.mobile.messaging.ContentCardRulesEngine getHighSpeedVideoSizes;
    java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getHighSpeedVideoSizesFor;
    final com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine getInputFormats;
    final java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> getInputSizeshNQ4ISI;
    java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getOutputFormats;
    final com.adobe.marketing.mobile.messaging.MessagingCacheUtilities getOutputMinFrameDuration;
    com.adobe.marketing.mobile.util.SerialWorkDispatcher<com.adobe.marketing.mobile.Event> getOutputSizes;
    final java.util.Map<java.lang.String, java.util.List<com.adobe.marketing.mobile.messaging.Surface>> getOutputSizeshNQ4ISI;
    java.util.Map<java.lang.String, com.adobe.marketing.mobile.messaging.PropositionInfo> getOutputStallDuration;
    final com.adobe.marketing.mobile.messaging.MessagingExtension getOutputStallDurationlomOqCM;

    EdgePersonalizationResponseHandler(com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension, com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine launchRulesEngine, com.adobe.marketing.mobile.messaging.ContentCardRulesEngine contentCardRulesEngine) {
        this(messagingExtension, extensionApi, launchRulesEngine, contentCardRulesEngine, (byte) 0);
    }

    private EdgePersonalizationResponseHandler(com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension, com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine launchRulesEngine, com.adobe.marketing.mobile.messaging.ContentCardRulesEngine contentCardRulesEngine, byte b) {
        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = new java.util.HashMap();
        this.getOutputStallDuration = new java.util.HashMap();
        this.getOutputSizeshNQ4ISI = new java.util.HashMap();
        this.getOutputFormats = new java.util.HashMap();
        this.getInputSizeshNQ4ISI = new java.util.HashMap();
        this.Camera2StreamConfigurationMap = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        this.getOutputStallDurationlomOqCM = messagingExtension;
        this.getHighResolutionOutputSizeshNQ4ISI = extensionApi;
        this.getInputFormats = launchRulesEngine;
        this.getHighSpeedVideoSizes = contentCardRulesEngine;
        com.adobe.marketing.mobile.messaging.MessagingCacheUtilities messagingCacheUtilities = new com.adobe.marketing.mobile.messaging.MessagingCacheUtilities();
        this.getOutputMinFrameDuration = messagingCacheUtilities;
        if (messagingCacheUtilities.getHighSpeedVideoSizes.get("messaging", "propositions") == null || (highSpeedVideoFpsRangesFor = messagingCacheUtilities.getHighSpeedVideoFpsRangesFor()) == null || highSpeedVideoFpsRangesFor.isEmpty()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Retrieved cached propositions, attempting to load the propositions into the rules engine.", new java.lang.Object[0]);
        this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it = highSpeedVideoFpsRangesFor.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> map = new com.adobe.marketing.mobile.messaging.ParsedPropositions(highSpeedVideoFpsRangesFor, arrayList, extensionApi).getHighSpeedVideoSizes.get(com.adobe.marketing.mobile.messaging.SchemaType.INAPP);
        if (map != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.addAll(it2.next().getValue());
            }
            if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(arrayList2)) {
                return;
            }
            this.getInputFormats.replaceRules(arrayList2);
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event, java.util.List<com.adobe.marketing.mobile.messaging.Surface> list) {
        com.adobe.marketing.mobile.messaging.CompletionHandler Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.MessagingExtension.Camera2StreamConfigurationMap(event.getUniqueIdentifier());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (list != null && !list.isEmpty()) {
            for (com.adobe.marketing.mobile.messaging.Surface surface : list) {
                if (surface.isValid()) {
                    arrayList.add(surface);
                }
            }
            if (arrayList.isEmpty()) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Unable to update messages, no valid surfaces found.", new java.lang.Object[0]);
                if (Camera2StreamConfigurationMap != null) {
                    Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.call(bool);
                    return;
                }
                return;
            }
        } else {
            com.adobe.marketing.mobile.messaging.Surface surface2 = new com.adobe.marketing.mobile.messaging.Surface();
            if (surface2.getUri().equals("unknown")) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Unable to update messages, couldn't create a valid app surface.", new java.lang.Object[0]);
                if (Camera2StreamConfigurationMap != null) {
                    Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.call(bool);
                    return;
                }
                return;
            }
            arrayList.add(surface2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.adobe.marketing.mobile.messaging.Surface) it.next()).getUri());
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put(com.paypal.oslo.core.persistence.db.config.DbConfig.SCHEMA_EXPORT_DIR, getOutputMinFrameDurationlomOqCM);
        hashMap3.put("surfaces", arrayList2);
        hashMap2.put("personalization", hashMap3);
        hashMap.put("query", hashMap2);
        hashMap.put("xdm", new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.2
            {
                put("eventType", "personalization.request");
            }
        });
        java.util.HashMap hashMap4 = new java.util.HashMap();
        java.util.HashMap hashMap5 = new java.util.HashMap();
        java.util.HashMap hashMap6 = new java.util.HashMap();
        hashMap6.put("in-app-response-format", 2);
        hashMap5.put("ajo", hashMap6);
        hashMap4.put("__adobe", hashMap5);
        hashMap.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap4);
        java.util.HashMap hashMap7 = new java.util.HashMap();
        hashMap7.put("sendCompletion", java.lang.Boolean.TRUE);
        hashMap.put("request", hashMap7);
        final com.adobe.marketing.mobile.Event build = new com.adobe.marketing.mobile.Event.Builder("Retrieve message definitions", com.adobe.marketing.mobile.EventType.EDGE, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).chainToParentEvent(event).build();
        this.getOutputSizeshNQ4ISI.put(build.getUniqueIdentifier(), arrayList);
        this.getOutputSizes.offer(build);
        if (Camera2StreamConfigurationMap != null) {
            Camera2StreamConfigurationMap.getHighSpeedVideoSizes = build.getUniqueIdentifier();
            com.adobe.marketing.mobile.messaging.MessagingExtension.addCompletionHandler(Camera2StreamConfigurationMap);
        }
        com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(build, 10000L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.3
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public /* synthetic */ void call(java.lang.Object obj) {
                com.adobe.marketing.mobile.Event event2 = (com.adobe.marketing.mobile.Event) obj;
                java.lang.String highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges(event2);
                java.util.HashMap hashMap8 = new java.util.HashMap();
                hashMap8.put("endingEventId", highSpeedVideoFpsRanges);
                com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.this.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.adobe.marketing.mobile.Event.Builder("Finalize propositions response", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.CONTENT_COMPLETE).setEventData(hashMap8).chainToParentEvent(event2).build());
            }

            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                java.lang.String uniqueIdentifier = build.getUniqueIdentifier();
                com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.this.getOutputSizeshNQ4ISI.remove(uniqueIdentifier);
                com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.this.getOutputStallDurationlomOqCM;
                com.adobe.marketing.mobile.messaging.CompletionHandler highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingExtension.getHighSpeedVideoSizes(uniqueIdentifier);
                if (highSpeedVideoSizes != null) {
                    highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.call(java.lang.Boolean.FALSE);
                }
                com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.this.getOutputSizes.resume();
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Unable to run completion logic for a personalization request event - error occurred: %s", adobeError.getErrorName());
            }
        });
    }

    static void getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.SchemaType schemaType, java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> map, java.util.List<com.adobe.marketing.mobile.messaging.Surface> list, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> map2) {
        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> map3 = map.get(schemaType);
        if (map3 != null) {
            java.util.Set<com.adobe.marketing.mobile.messaging.Surface> keySet = map3.keySet();
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Updating definitions for surfaces %s with schema type %s.", keySet.toString(), schemaType.toString());
            map2.putAll(map3);
            java.util.ArrayList<com.adobe.marketing.mobile.messaging.Surface> arrayList = new java.util.ArrayList(list);
            arrayList.removeAll(keySet);
            for (com.adobe.marketing.mobile.messaging.Surface surface : arrayList) {
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Removing definitions for surface %s with schema type %s.", surface.getUri(), schemaType.toString());
                map2.remove(surface);
            }
            return;
        }
        for (com.adobe.marketing.mobile.messaging.Surface surface2 : list) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Removing definitions for surface %s with schema type %s.", surface2.getUri(), schemaType.toString());
            map2.remove(surface2);
        }
    }

    static java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> Camera2StreamConfigurationMap(java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> map) {
        java.util.Collection<java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> values = map.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> it = values.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return arrayList;
    }

    final void getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.Event event) {
        int i;
        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it;
        java.lang.String format;
        java.util.Map<java.lang.String, java.lang.Object> map;
        java.lang.String str;
        java.util.Map optTypedMap;
        java.util.Iterator<java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>>> it2 = getHighResolutionOutputSizeshNQ4ISI(event).entrySet().iterator();
        while (it2.hasNext()) {
            java.util.Map.Entry<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> next = it2.next();
            java.util.List<com.adobe.marketing.mobile.messaging.Proposition> value = next.getValue();
            com.adobe.marketing.mobile.messaging.Surface key = next.getKey();
            java.util.List<com.adobe.marketing.mobile.messaging.Proposition> list = this.getHighSpeedVideoFpsRanges.get(key);
            if (list == null) {
                list = new java.util.ArrayList<>();
            }
            int size = list.size();
            java.util.ArrayList<com.adobe.marketing.mobile.messaging.PropositionItem> arrayList = new java.util.ArrayList();
            java.util.Iterator<com.adobe.marketing.mobile.messaging.Proposition> it3 = value.iterator();
            while (true) {
                i = 0;
                if (!it3.hasNext()) {
                    break;
                }
                com.adobe.marketing.mobile.messaging.Proposition next2 = it3.next();
                if (list.contains(next2)) {
                    list.remove(next2);
                } else {
                    java.util.List<com.adobe.marketing.mobile.messaging.PropositionItem> items = next2.getItems();
                    if (!items.isEmpty()) {
                        arrayList.add(items.get(0));
                    }
                }
                list.add(next2);
                com.adobe.marketing.mobile.messaging.ContentCardMapper.getInstance().storeContentCardSchemaData(next2.getItems().get(0).getContentCardSchemaData());
            }
            this.getHighSpeedVideoFpsRanges.put(key, list);
            if (arrayList.isEmpty()) {
                it = it2;
            } else {
                com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType = com.adobe.marketing.mobile.MessagingEdgeEventType.TRIGGER;
                com.adobe.marketing.mobile.messaging.PropositionInteractionBatcher propositionInteractionBatcher = new com.adobe.marketing.mobile.messaging.PropositionInteractionBatcher(messagingEdgeEventType, null, arrayList);
                java.util.List<com.adobe.marketing.mobile.messaging.PropositionItem> list2 = propositionInteractionBatcher.getHighSpeedVideoSizes;
                if (list2 == null || list2.isEmpty()) {
                    it = it2;
                    i = 0;
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "BatchedPropositionInteraction", "Cannot generate batched interaction XDM, proposition items collection is null or empty.", new java.lang.Object[0]);
                    map = null;
                } else if (propositionInteractionBatcher.getHighSpeedVideoFpsRangesFor == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "BatchedPropositionInteraction", "Cannot generate batched interaction XDM, MessagingEdgeEventType was not found for this message.", new java.lang.Object[0]);
                    it = it2;
                    map = null;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (com.adobe.marketing.mobile.messaging.PropositionItem propositionItem : propositionInteractionBatcher.getHighSpeedVideoSizes) {
                        if (propositionItem != null) {
                            if (propositionItem.getHighResolutionOutputSizeshNQ4ISI == null || propositionItem.getHighResolutionOutputSizeshNQ4ISI.get() == null) {
                                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "BatchedPropositionInteraction", "Cannot include proposition item (%s) in batched interaction, proposition reference is not available.", propositionItem.getItemId());
                            } else {
                                com.adobe.marketing.mobile.messaging.PropositionInfo highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.PropositionInfo.getHighSpeedVideoSizes(propositionItem.getHighResolutionOutputSizeshNQ4ISI.get());
                                if (highSpeedVideoSizes == null) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "BatchedPropositionInteraction", "Cannot include proposition item (%s) in batched interaction, could not create PropositionInfo.", propositionItem.getItemId());
                                } else {
                                    arrayList2.add(highSpeedVideoSizes);
                                    arrayList3.add(propositionItem.getItemId());
                                }
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "BatchedPropositionInteraction", "Cannot generate batched interaction XDM, no valid proposition items found.", new java.lang.Object[0]);
                        it = it2;
                        map = null;
                    } else {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        int i2 = 0;
                        while (i2 < arrayList2.size()) {
                            arrayList4.add(new com.adobe.marketing.mobile.messaging.PropositionInteraction(propositionInteractionBatcher.getHighSpeedVideoFpsRangesFor, propositionInteractionBatcher.getHighSpeedVideoFpsRanges, (com.adobe.marketing.mobile.messaging.PropositionInfo) arrayList2.get(i2), i2 < arrayList3.size() ? (java.lang.String) arrayList3.get(i2) : null, null));
                            i2++;
                            it2 = it2;
                            arrayList2 = arrayList2;
                        }
                        it = it2;
                        java.util.List<java.util.Map<java.lang.String, java.lang.Object>> highSpeedVideoSizes2 = com.adobe.marketing.mobile.messaging.PropositionInteractionBatcher.getHighSpeedVideoSizes(arrayList4);
                        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "BatchedPropositionInteraction", "Unable to create batched proposition interaction data, no valid proposition details found.", new java.lang.Object[0]);
                            map = java.util.Collections.emptyMap();
                        } else {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(propositionInteractionBatcher.getHighSpeedVideoFpsRangesFor.getPropositionEventType(), 1);
                            java.util.HashMap hashMap2 = new java.util.HashMap();
                            hashMap2.put("propositionEventType", hashMap);
                            hashMap2.put("propositions", highSpeedVideoSizes2);
                            map = com.adobe.marketing.mobile.messaging.PropositionInteractionXdmUtils.getHighResolutionOutputSizeshNQ4ISI(hashMap2, propositionInteractionBatcher.getHighSpeedVideoFpsRanges, propositionInteractionBatcher.getHighSpeedVideoFpsRangesFor);
                        }
                    }
                    i = 0;
                }
                if (map == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Cannot send batched proposition interaction, could not generate XDM data.", new java.lang.Object[i]);
                } else {
                    for (com.adobe.marketing.mobile.messaging.PropositionItem propositionItem2 : arrayList) {
                        if (propositionItem2.getHighResolutionOutputSizeshNQ4ISI != null && propositionItem2.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                            com.adobe.marketing.mobile.messaging.Proposition proposition = propositionItem2.getHighResolutionOutputSizeshNQ4ISI.get();
                            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(proposition.getHighSpeedVideoFpsRanges)) {
                                optTypedMap = null;
                                str = null;
                            } else {
                                str = null;
                                optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, proposition.getHighSpeedVideoFpsRanges, "activity", null);
                            }
                            com.adobe.marketing.mobile.messaging.PropositionHistory.getHighSpeedVideoSizes(com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap) ? "" : com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "id", ""), messagingEdgeEventType, str);
                        }
                    }
                    this.getOutputStallDurationlomOqCM.sendPropositionInteraction(map);
                }
            }
            int size2 = list.size();
            if (size != size2) {
                java.util.Locale activeLocale = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getActiveLocale();
                if (size2 > 0) {
                    format = java.lang.String.format(activeLocale, "User has qualified for %d content card(s) for surface %s", java.lang.Integer.valueOf(size2), key.getUri());
                } else {
                    format = java.lang.String.format(activeLocale, "User has not qualified for any content card(s) for surface %s", key.getUri());
                }
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", format, new java.lang.Object[0]);
            }
            it2 = it;
        }
    }

    private java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event) {
        java.util.HashMap hashMap;
        com.adobe.marketing.mobile.messaging.PropositionItem highSpeedVideoSizes;
        com.adobe.marketing.mobile.messaging.ContentCardSchemaData contentCardSchemaData;
        com.adobe.marketing.mobile.messaging.Surface Camera2StreamConfigurationMap;
        com.adobe.marketing.mobile.messaging.Proposition proposition;
        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> hashMap2 = new java.util.HashMap<>();
        com.adobe.marketing.mobile.messaging.ContentCardRulesEngine contentCardRulesEngine = this.getHighSpeedVideoSizes;
        if (event == null) {
            throw new java.lang.IllegalArgumentException("Cannot evaluate null event.");
        }
        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> evaluateEvent = contentCardRulesEngine.evaluateEvent(event);
        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(evaluateEvent)) {
            hashMap = null;
        } else {
            hashMap = new java.util.HashMap();
            for (com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence : evaluateEvent) {
                if (ruleConsequence != null && (highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.PropositionItem.getHighSpeedVideoSizes(ruleConsequence)) != null && (contentCardSchemaData = highSpeedVideoSizes.getContentCardSchemaData()) != null) {
                    java.util.Map<java.lang.String, java.lang.Object> meta = contentCardSchemaData.getMeta();
                    if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(meta) && (Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(com.adobe.marketing.mobile.util.DataReader.optString(meta, "surface", ""))) != null) {
                        if (hashMap.get(Camera2StreamConfigurationMap) != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) hashMap.get(Camera2StreamConfigurationMap));
                            arrayList.add(highSpeedVideoSizes);
                            hashMap.put(Camera2StreamConfigurationMap, arrayList);
                        } else {
                            hashMap.put(Camera2StreamConfigurationMap, java.util.Collections.singletonList(highSpeedVideoSizes));
                        }
                    }
                }
            }
        }
        if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap)) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.adobe.marketing.mobile.messaging.PropositionItem propositionItem : (java.util.List) entry.getValue()) {
                    com.adobe.marketing.mobile.messaging.PropositionInfo propositionInfo = this.getOutputStallDuration.get(propositionItem.getItemId());
                    if (propositionInfo != null) {
                        try {
                            com.adobe.marketing.mobile.messaging.Proposition proposition2 = new com.adobe.marketing.mobile.messaging.Proposition(propositionInfo.getHighSpeedVideoFpsRanges, propositionInfo.getHighSpeedVideoSizes, propositionInfo.Camera2StreamConfigurationMap, new java.util.ArrayList<com.adobe.marketing.mobile.messaging.PropositionItem>(propositionItem) { // from class: com.adobe.marketing.mobile.messaging.EdgePersonalizationResponseHandler.4
                                final /* synthetic */ com.adobe.marketing.mobile.messaging.PropositionItem getHighSpeedVideoFpsRanges;

                                {
                                    this.getHighSpeedVideoFpsRanges = propositionItem;
                                    add(propositionItem);
                                }
                            });
                            java.util.Iterator it = arrayList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    proposition = null;
                                    break;
                                }
                                proposition = (com.adobe.marketing.mobile.messaging.Proposition) it.next();
                                if (proposition.getUniqueId().equals(proposition2.getUniqueId())) {
                                    break;
                                }
                            }
                            if (proposition != null) {
                                propositionItem.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.SoftReference<>(proposition);
                                proposition.getItems().add(propositionItem);
                            } else {
                                propositionItem.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.SoftReference<>(proposition2);
                                arrayList2.add(proposition2);
                            }
                        } catch (com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException unused) {
                        }
                    }
                }
                hashMap2 = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface((com.adobe.marketing.mobile.messaging.Surface) entry.getKey(), arrayList2, hashMap2);
            }
        }
        return hashMap2;
    }

    final java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getHighSpeedVideoFpsRangesFor(java.util.List<com.adobe.marketing.mobile.messaging.Surface> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.adobe.marketing.mobile.messaging.Surface surface : list) {
            java.util.List<com.adobe.marketing.mobile.messaging.Proposition> list2 = this.getHighSpeedVideoSizesFor.get(surface);
            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list2)) {
                hashMap.put(surface, list2);
            }
        }
        return hashMap;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.messaging.PropositionItem propositionItem) {
        com.adobe.marketing.mobile.services.ui.Presentable presentable;
        if (propositionItem == null) {
            return;
        }
        try {
            com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI();
            com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension = this.getOutputStallDurationlomOqCM;
            java.util.Map<java.lang.String, java.lang.String> map = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
            com.adobe.marketing.mobile.messaging.PropositionInfo propositionInfo = this.getOutputStallDuration.get(propositionItem.getItemId());
            com.adobe.marketing.mobile.Message Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.PresentableMessageMapper.Camera2StreamConfigurationMap(propositionItem);
            if (Camera2StreamConfigurationMap == null) {
                com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage internalMessage = new com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage(messagingExtension, propositionItem, map, propositionInfo, (byte) 0);
                java.util.Map<java.lang.String, com.adobe.marketing.mobile.Message> map2 = com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighSpeedVideoFpsRanges;
                presentable = internalMessage.getHighResolutionOutputSizeshNQ4ISI;
                map2.put(((com.adobe.marketing.mobile.services.ui.InAppMessage) presentable.getGetHighSpeedVideoSizes()).getId(), internalMessage);
                Camera2StreamConfigurationMap = internalMessage;
            }
            com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage internalMessage2 = (com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage) Camera2StreamConfigurationMap;
            if (internalMessage2.getHighResolutionOutputSizeshNQ4ISI != null) {
                if (internalMessage2.getHighSpeedVideoFpsRanges) {
                    internalMessage2.track(null, com.adobe.marketing.mobile.MessagingEdgeEventType.TRIGGER);
                }
                internalMessage2.Camera2StreamConfigurationMap(null, com.adobe.marketing.mobile.MessagingEdgeEventType.TRIGGER);
            }
            internalMessage2.show();
        } catch (com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException | java.lang.IllegalStateException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EdgePersonalizationResponseHandler", "Unable to create an in-app message, an exception occurred during creation: %s", e.getLocalizedMessage());
        }
    }
}
