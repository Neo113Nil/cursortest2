package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class ParsedPropositions {
    java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getHighResolutionOutputSizeshNQ4ISI;
    java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getHighSpeedVideoFpsRanges;
    final java.util.Map<java.lang.String, com.adobe.marketing.mobile.messaging.PropositionInfo> Camera2StreamConfigurationMap = new java.util.HashMap();
    final java.util.Map<com.adobe.marketing.mobile.messaging.SchemaType, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>>> getHighSpeedVideoSizes = new java.util.HashMap();

    ParsedPropositions(java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map, java.util.List<com.adobe.marketing.mobile.messaging.Surface> list, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence;
        com.adobe.marketing.mobile.messaging.PropositionItem highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
        for (java.util.List<com.adobe.marketing.mobile.messaging.Proposition> list2 : map.values()) {
            java.util.Collections.sort(list2, new java.util.Comparator() { // from class: com.adobe.marketing.mobile.messaging.ParsedPropositions$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int compare;
                    compare = java.lang.Integer.compare(com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(r3.getHighSpeedVideoFpsRanges) ? -1 : com.adobe.marketing.mobile.util.DataReader.optInt(((com.adobe.marketing.mobile.messaging.Proposition) obj).getHighSpeedVideoFpsRanges, "rank", -1), com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(r4.getHighSpeedVideoFpsRanges) ? -1 : com.adobe.marketing.mobile.util.DataReader.optInt(((com.adobe.marketing.mobile.messaging.Proposition) obj2).getHighSpeedVideoFpsRanges, "rank", -1));
                    return compare;
                }
            });
            for (com.adobe.marketing.mobile.messaging.Proposition proposition : list2) {
                if (proposition != null) {
                    java.lang.String scope = proposition.getScope();
                    java.util.Iterator<com.adobe.marketing.mobile.messaging.Surface> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getUri().equals(scope)) {
                                if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(proposition.getItems())) {
                                    com.adobe.marketing.mobile.messaging.Surface Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(scope);
                                    com.adobe.marketing.mobile.messaging.PropositionItem propositionItem = proposition.getItems().get(0);
                                    int i = com.adobe.marketing.mobile.messaging.ParsedPropositions.AnonymousClass1.getHighSpeedVideoFpsRangesFor[propositionItem.getSchema().ordinal()];
                                    if (i != 2) {
                                        if (i == 6) {
                                            java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> parse = com.adobe.marketing.mobile.launch.rulesengine.json.JSONRulesParser.parse(new org.json.JSONObject(propositionItem.getItemData()).toString(), extensionApi);
                                            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(parse)) {
                                                for (com.adobe.marketing.mobile.launch.rulesengine.LaunchRule launchRule : parse) {
                                                    java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> consequenceList = launchRule.getConsequenceList();
                                                    if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(consequenceList) && (highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.PropositionItem.getHighSpeedVideoSizes((ruleConsequence = consequenceList.get(0)))) != null) {
                                                        int i2 = com.adobe.marketing.mobile.messaging.ParsedPropositions.AnonymousClass1.getHighSpeedVideoFpsRangesFor[highSpeedVideoSizes.getSchema().ordinal()];
                                                        if (i2 == 1 || i2 == 2) {
                                                            this.Camera2StreamConfigurationMap.put(ruleConsequence.getId(), com.adobe.marketing.mobile.messaging.PropositionInfo.getHighSpeedVideoSizes(proposition));
                                                            this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(Camera2StreamConfigurationMap, proposition, this.getHighResolutionOutputSizeshNQ4ISI);
                                                            getHighResolutionOutputSizeshNQ4ISI(launchRule, Camera2StreamConfigurationMap, com.adobe.marketing.mobile.messaging.SchemaType.INAPP);
                                                        } else if (i2 == 3 || i2 == 4) {
                                                            this.Camera2StreamConfigurationMap.put(ruleConsequence.getId(), com.adobe.marketing.mobile.messaging.PropositionInfo.getHighSpeedVideoSizes(proposition));
                                                            getHighResolutionOutputSizeshNQ4ISI(launchRule, Camera2StreamConfigurationMap, com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD);
                                                        } else if (i2 == 5) {
                                                            getHighResolutionOutputSizeshNQ4ISI(launchRule, Camera2StreamConfigurationMap, com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION);
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (i != 7 && i != 8) {
                                        }
                                    }
                                    this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.MessagingUtils.updatePropositionMapForSurface(Camera2StreamConfigurationMap, proposition, this.getHighSpeedVideoFpsRanges);
                                }
                            }
                        } else {
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "ParsedPropositions", "Ignoring proposition where scope (%s) does not match one of the expected surfaces (%s).", scope, list.toString());
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.adobe.marketing.mobile.messaging.ParsedPropositions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.messaging.SchemaType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.adobe.marketing.mobile.messaging.SchemaType.INAPP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.messaging.SchemaType.DEFAULT_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.messaging.SchemaType.FEED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.messaging.SchemaType.RULESET.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.messaging.SchemaType.JSON_CONTENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adobe.marketing.mobile.messaging.SchemaType.HTML_CONTENT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.launch.rulesengine.LaunchRule launchRule, com.adobe.marketing.mobile.messaging.Surface surface, com.adobe.marketing.mobile.messaging.SchemaType schemaType) {
        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> hashMap;
        if (this.getHighSpeedVideoSizes.get(schemaType) != null) {
            hashMap = this.getHighSpeedVideoSizes.get(schemaType);
        } else {
            hashMap = new java.util.HashMap<>();
        }
        this.getHighSpeedVideoSizes.put(schemaType, com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRangesFor(surface, launchRule, hashMap));
    }
}
