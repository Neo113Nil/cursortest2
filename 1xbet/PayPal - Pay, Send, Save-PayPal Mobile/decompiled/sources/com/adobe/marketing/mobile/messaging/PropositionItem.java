package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class PropositionItem implements java.io.Serializable {
    com.adobe.marketing.mobile.messaging.SchemaType Camera2StreamConfigurationMap;
    java.lang.ref.SoftReference<com.adobe.marketing.mobile.messaging.Proposition> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes;

    public PropositionItem(java.lang.String str, com.adobe.marketing.mobile.messaging.SchemaType schemaType, java.util.Map<java.lang.String, java.lang.Object> map) throws com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || schemaType == null || map == null) {
            throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Id, schema or itemData is missing");
        }
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = schemaType;
        this.getHighSpeedVideoSizes = map;
    }

    public java.lang.String getItemId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.adobe.marketing.mobile.messaging.SchemaType getSchema() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getItemData() {
        return this.getHighSpeedVideoSizes;
    }

    public void track(com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
        track(null, messagingEdgeEventType, null);
    }

    public void track(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType, java.util.List<java.lang.String> list) {
        java.lang.ref.SoftReference<com.adobe.marketing.mobile.messaging.Proposition> softReference = this.getHighResolutionOutputSizeshNQ4ISI;
        if (softReference != null) {
            com.adobe.marketing.mobile.messaging.Proposition proposition = softReference.get();
            java.util.Map optTypedMap = com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(proposition.getHighSpeedVideoFpsRanges) ? null : com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, proposition.getHighSpeedVideoFpsRanges, "activity", null);
            com.adobe.marketing.mobile.messaging.PropositionHistory.getHighSpeedVideoSizes(com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap) ? "" : com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "id", ""), messagingEdgeEventType, str);
        }
        java.util.Map<java.lang.String, java.lang.Object> generateInteractionXdm = generateInteractionXdm(str, messagingEdgeEventType, list);
        if (generateInteractionXdm == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "Cannot track proposition interaction for item (%s), could not generate interactions XDM.", this.getHighSpeedVideoFpsRanges);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trackpropositions", java.lang.Boolean.TRUE);
        hashMap.put("propositioninteraction", generateInteractionXdm);
        com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Track propositions", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build());
    }

    public java.util.Map<java.lang.String, java.lang.Object> generateInteractionXdm(com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
        return generateInteractionXdm(null, messagingEdgeEventType, null);
    }

    public java.util.Map<java.lang.String, java.lang.Object> generateInteractionXdm(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType, java.util.List<java.lang.String> list) {
        java.lang.ref.SoftReference<com.adobe.marketing.mobile.messaging.Proposition> softReference = this.getHighResolutionOutputSizeshNQ4ISI;
        if (softReference == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "Cannot generate interaction XDM for item (%s), proposition reference is not available.", this.getHighSpeedVideoFpsRanges);
            return null;
        }
        return new com.adobe.marketing.mobile.messaging.PropositionInteraction(messagingEdgeEventType, str, com.adobe.marketing.mobile.messaging.PropositionInfo.getHighSpeedVideoSizes(softReference.get()), this.getHighSpeedVideoFpsRanges, list).getHighSpeedVideoSizes();
    }

    public java.util.Map<java.lang.String, java.lang.Object> getJsonContentMap() {
        com.adobe.marketing.mobile.messaging.JsonContentSchemaData jsonContentSchemaData;
        if (this.Camera2StreamConfigurationMap.equals(com.adobe.marketing.mobile.messaging.SchemaType.JSON_CONTENT) && (jsonContentSchemaData = (com.adobe.marketing.mobile.messaging.JsonContentSchemaData) getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType.JSON_CONTENT)) != null) {
            java.lang.Object obj = jsonContentSchemaData.getHighSpeedVideoFpsRangesFor;
            if (obj instanceof java.util.Map) {
                return (java.util.Map) obj;
            }
        }
        return null;
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getJsonContentArrayList() {
        com.adobe.marketing.mobile.messaging.JsonContentSchemaData jsonContentSchemaData;
        if (this.Camera2StreamConfigurationMap.equals(com.adobe.marketing.mobile.messaging.SchemaType.JSON_CONTENT) && (jsonContentSchemaData = (com.adobe.marketing.mobile.messaging.JsonContentSchemaData) getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType.JSON_CONTENT)) != null) {
            java.lang.Object obj = jsonContentSchemaData.getHighSpeedVideoFpsRangesFor;
            if (obj instanceof java.util.List) {
                return (java.util.List) obj;
            }
        }
        return null;
    }

    public java.lang.String getHtmlContent() {
        com.adobe.marketing.mobile.messaging.HtmlContentSchemaData htmlContentSchemaData;
        if (this.Camera2StreamConfigurationMap.equals(com.adobe.marketing.mobile.messaging.SchemaType.HTML_CONTENT) && (htmlContentSchemaData = (com.adobe.marketing.mobile.messaging.HtmlContentSchemaData) getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType.HTML_CONTENT)) != null) {
            return htmlContentSchemaData.getContent();
        }
        return null;
    }

    public com.adobe.marketing.mobile.messaging.InAppSchemaData getInAppSchemaData() {
        if (this.Camera2StreamConfigurationMap.equals(com.adobe.marketing.mobile.messaging.SchemaType.INAPP)) {
            return (com.adobe.marketing.mobile.messaging.InAppSchemaData) getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType.INAPP);
        }
        return null;
    }

    public com.adobe.marketing.mobile.messaging.ContentCardSchemaData getContentCardSchemaData() {
        if (!this.Camera2StreamConfigurationMap.equals(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD)) {
            return null;
        }
        com.adobe.marketing.mobile.messaging.ContentCardSchemaData contentCardSchemaData = (com.adobe.marketing.mobile.messaging.ContentCardSchemaData) getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD);
        if (contentCardSchemaData != null) {
            contentCardSchemaData.getHighSpeedVideoSizes = this;
        }
        return contentCardSchemaData;
    }

    @java.lang.Deprecated
    public com.adobe.marketing.mobile.messaging.FeedItemSchemaData getFeedItemSchemaData() {
        if (!this.Camera2StreamConfigurationMap.equals(com.adobe.marketing.mobile.messaging.SchemaType.FEED)) {
            return null;
        }
        com.adobe.marketing.mobile.messaging.FeedItemSchemaData feedItemSchemaData = (com.adobe.marketing.mobile.messaging.FeedItemSchemaData) getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType.FEED);
        if (feedItemSchemaData != null) {
            feedItemSchemaData.Camera2StreamConfigurationMap = this;
        }
        return feedItemSchemaData;
    }

    final com.adobe.marketing.mobile.messaging.SchemaData getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.messaging.SchemaType schemaType) {
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(this.getHighSpeedVideoSizes)) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "Cannot decode content, PropositionItem data is null or empty.", new java.lang.Object[0]);
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(this.getHighSpeedVideoSizes);
        switch (com.adobe.marketing.mobile.messaging.PropositionItem.AnonymousClass1.Camera2StreamConfigurationMap[schemaType.ordinal()]) {
        }
        return null;
    }

    /* renamed from: com.adobe.marketing.mobile.messaging.PropositionItem$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.messaging.SchemaType.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.adobe.marketing.mobile.messaging.SchemaType.HTML_CONTENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.messaging.SchemaType.JSON_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.messaging.SchemaType.INAPP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.messaging.SchemaType.FEED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    static com.adobe.marketing.mobile.messaging.PropositionItem getHighSpeedVideoSizes(com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence ruleConsequence) {
        if (ruleConsequence == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.Object> detail = ruleConsequence.getDetail();
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(detail)) {
            return null;
        }
        return Camera2StreamConfigurationMap(detail);
    }

    static com.adobe.marketing.mobile.messaging.PropositionItem Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            java.lang.String string = com.adobe.marketing.mobile.util.DataReader.getString(map, "id");
            com.adobe.marketing.mobile.messaging.SchemaType highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.messaging.SchemaType.getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.util.DataReader.getString(map, "schema"));
            java.util.Map typedMap = com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, map, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(typedMap)) {
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "Cannot create PropositionItem, event data is null or empty.", new java.lang.Object[0]);
                return null;
            }
            return new com.adobe.marketing.mobile.messaging.PropositionItem(string, highSpeedVideoFpsRangesFor, typedMap);
        } catch (com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException | com.adobe.marketing.mobile.util.DataReaderException e) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "Exception caught while attempting to create a PropositionItem from an event data map: %s", e.getLocalizedMessage());
            return null;
        }
    }

    static com.adobe.marketing.mobile.messaging.PropositionItem getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.Event event) {
        if (event == null || com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(event.getEventData())) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "fromRuleConsequenceEvent - Cannot create PropositionItem, event data is null or empty.", new java.lang.Object[0]);
            return null;
        }
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "triggeredconsequence", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "fromRuleConsequenceEvent - Cannot create PropositionItem, consequence is null or empty.", new java.lang.Object[0]);
            return null;
        }
        if (!com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "type", "").equals("schema")) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "fromRuleConsequenceEvent - Cannot create PropositionItem, consequence is not of type 'schema'", new java.lang.Object[0]);
            return null;
        }
        java.util.Map optTypedMap2 = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, optTypedMap, "detail", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap2)) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "fromRuleConsequenceEvent - Cannot create PropositionItem, consequence detail is null or empty.", new java.lang.Object[0]);
            return null;
        }
        return Camera2StreamConfigurationMap(optTypedMap2);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        this.getHighSpeedVideoFpsRanges = objectInputStream.readUTF();
        this.Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.SchemaType.getHighSpeedVideoFpsRangesFor(objectInputStream.readUTF());
        this.getHighSpeedVideoSizes = (java.util.Map) objectInputStream.readObject();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.SoftReference<>((com.adobe.marketing.mobile.messaging.Proposition) objectInputStream.readObject());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeUTF(this.getHighSpeedVideoFpsRanges);
        objectOutputStream.writeUTF(this.Camera2StreamConfigurationMap.toString());
        objectOutputStream.writeObject(this.getHighSpeedVideoSizes);
        objectOutputStream.writeObject(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }
}
