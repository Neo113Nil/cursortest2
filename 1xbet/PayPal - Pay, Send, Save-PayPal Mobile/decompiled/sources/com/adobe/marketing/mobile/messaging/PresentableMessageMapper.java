package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class PresentableMessageMapper {
    static final java.util.Map<java.lang.String, com.adobe.marketing.mobile.Message> getHighSpeedVideoFpsRanges = new java.util.HashMap();

    /* synthetic */ PresentableMessageMapper(byte b) {
        this();
    }

    static class PresentableMessageMapperSingleton {
        private static final com.adobe.marketing.mobile.messaging.PresentableMessageMapper getHighSpeedVideoSizes = new com.adobe.marketing.mobile.messaging.PresentableMessageMapper(0);

        private PresentableMessageMapperSingleton() {
        }
    }

    static com.adobe.marketing.mobile.messaging.PresentableMessageMapper getHighResolutionOutputSizeshNQ4ISI() {
        return com.adobe.marketing.mobile.messaging.PresentableMessageMapper.PresentableMessageMapperSingleton.getHighSpeedVideoSizes;
    }

    private PresentableMessageMapper() {
    }

    static com.adobe.marketing.mobile.Message Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PropositionItem propositionItem) {
        if (propositionItem == null) {
            return null;
        }
        for (com.adobe.marketing.mobile.Message message : getHighSpeedVideoFpsRanges.values()) {
            if (message.getId().equals(propositionItem.getItemId())) {
                return message;
            }
        }
        return null;
    }

    static com.adobe.marketing.mobile.Message getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        return getHighSpeedVideoFpsRanges.get(str);
    }

    static class InternalMessage implements com.adobe.marketing.mobile.Message {
        com.adobe.marketing.mobile.messaging.PropositionInfo Camera2StreamConfigurationMap;
        final com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        private final com.adobe.marketing.mobile.messaging.MessagingExtension getHighSpeedVideoFpsRangesFor;
        private final java.lang.String getHighSpeedVideoSizes;
        private final java.util.Map<java.lang.String, java.lang.Object> getOutputFormats;

        /* synthetic */ InternalMessage(com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension, com.adobe.marketing.mobile.messaging.PropositionItem propositionItem, java.util.Map map, com.adobe.marketing.mobile.messaging.PropositionInfo propositionInfo, byte b) throws com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException, java.lang.IllegalStateException {
            this(messagingExtension, propositionItem, map, propositionInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r23v0, types: [com.adobe.marketing.mobile.messaging.PropositionInfo] */
        /* JADX WARN: Type inference failed for: r23v1 */
        /* JADX WARN: Type inference failed for: r23v3 */
        private InternalMessage(com.adobe.marketing.mobile.messaging.MessagingExtension messagingExtension, com.adobe.marketing.mobile.messaging.PropositionItem propositionItem, java.util.Map<java.lang.String, java.lang.String> map, com.adobe.marketing.mobile.messaging.PropositionInfo propositionInfo) throws com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException, java.lang.IllegalStateException {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            java.lang.String optString;
            float optFloat;
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor = messagingExtension;
            this.Camera2StreamConfigurationMap = propositionInfo;
            com.adobe.marketing.mobile.services.ui.UIService uIService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getUIService();
            if (uIService == null) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "The UIService is unavailable. Aborting in-app message creation.", new java.lang.Object[0]);
                throw new java.lang.IllegalStateException("The UIService is unavailable");
            }
            if (propositionItem == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "Unable to create an in-app message, PropositionItem is null.", new java.lang.Object[0]);
                throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Required field: \"PropositionItem\" is null.");
            }
            this.getHighSpeedVideoSizes = propositionItem.getItemId();
            com.adobe.marketing.mobile.messaging.SchemaType schema = propositionItem.getSchema();
            if (com.adobe.marketing.mobile.messaging.SchemaType.INAPP != schema) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "Required field \"schema\" is (%s) should be of type (%s).", schema, "https://ns.adobe.com/personalization/message/in-app");
                throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Required field: \"schema\" is not equal to \"https://ns.adobe.com/personalization/message/in-app\".");
            }
            com.adobe.marketing.mobile.messaging.InAppSchemaData inAppSchemaData = propositionItem.getInAppSchemaData();
            if (inAppSchemaData == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "In-app message proposition item data is null or empty.", new java.lang.Object[0]);
                throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Required field: in-app message proposition item \"data\" is null or empty.");
            }
            java.util.Map<java.lang.String, java.lang.Object> meta = inAppSchemaData.getMeta();
            this.getOutputFormats = meta;
            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(meta)) {
                str = "No in-app message custom metadata found in the proposition payload.";
            } else {
                str = "Found in-app message custom metadata in the proposition payload.";
            }
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", str, new java.lang.Object[0]);
            try {
                java.lang.String str4 = (java.lang.String) inAppSchemaData.getContent();
                try {
                    if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str4)) {
                        java.lang.Object[] objArr = new java.lang.Object[0];
                        str2 = "Message";
                        str3 = com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG;
                        try {
                            com.adobe.marketing.mobile.services.Log.warning(str3, str2, "Unable to create an in-app message, the html payload is null or empty.", objArr);
                            throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Required field: in-app message \"content\" is null or empty.");
                        } catch (java.lang.ClassCastException unused) {
                            com.adobe.marketing.mobile.services.Log.warning(str3, str2, "Unable to create an in-app message, in-app message content is not of type String.", new java.lang.Object[0]);
                            throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Required field: in-app message content is not of type String.");
                        }
                    }
                    java.util.Map<java.lang.String, java.lang.Object> mobileParameters = inAppSchemaData.getMobileParameters();
                    int optInt = com.adobe.marketing.mobile.util.DataReader.optInt(mobileParameters, "width", 100);
                    int optInt2 = com.adobe.marketing.mobile.util.DataReader.optInt(mobileParameters, "maxWidth", Integer.MAX_VALUE);
                    int optInt3 = com.adobe.marketing.mobile.util.DataReader.optInt(mobileParameters, "height", 100);
                    com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment valueOf = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.valueOf(com.adobe.marketing.mobile.util.DataReader.optString(mobileParameters, "verticalAlign", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER).toUpperCase());
                    int optInt4 = com.adobe.marketing.mobile.util.DataReader.optInt(mobileParameters, "verticalInset", 0);
                    com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment valueOf2 = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.valueOf(com.adobe.marketing.mobile.util.DataReader.optString(mobileParameters, "horizontalAlign", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER).toUpperCase());
                    int optInt5 = com.adobe.marketing.mobile.util.DataReader.optInt(mobileParameters, "horizontalInset", 0);
                    com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation valueOf3 = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.valueOf(com.adobe.marketing.mobile.util.DataReader.optString(mobileParameters, "displayAnimation", "none").toUpperCase());
                    com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation valueOf4 = com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAnimation.valueOf(com.adobe.marketing.mobile.util.DataReader.optString(mobileParameters, "dismissAnimation", "none").toUpperCase());
                    propositionInfo = "Message";
                    try {
                        optString = com.adobe.marketing.mobile.util.DataReader.optString(mobileParameters, "backdropColor", "#FFFFFF");
                        try {
                            optFloat = com.adobe.marketing.mobile.util.DataReader.optFloat(mobileParameters, "backdropOpacity", 0.0f);
                        } catch (java.lang.ClassCastException unused2) {
                        }
                    } catch (java.lang.ClassCastException unused3) {
                        str2 = propositionInfo;
                        str3 = com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG;
                        com.adobe.marketing.mobile.services.Log.warning(str3, str2, "Unable to create an in-app message, in-app message content is not of type String.", new java.lang.Object[0]);
                        throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Required field: in-app message content is not of type String.");
                    }
                    try {
                        float optFloat2 = com.adobe.marketing.mobile.util.DataReader.optFloat(mobileParameters, "cornerRadius", 0.0f);
                        boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(mobileParameters, "uiTakeover", true);
                        boolean optBoolean2 = com.adobe.marketing.mobile.util.DataReader.optBoolean(mobileParameters, "fitToContent", false);
                        this.getHighResolutionOutputSizeshNQ4ISI = uIService.create(new com.adobe.marketing.mobile.services.ui.InAppMessage(new com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.Builder().content(str4).width(optInt).height(optInt3).maxWidth(optInt2).verticalInset(optInt4).horizontalInset(optInt5).verticalAlignment(valueOf).horizontalAlignment(valueOf2).displayAnimation(valueOf3).dismissAnimation(valueOf4).backgroundColor(optString).backdropOpacity(optFloat).cornerRadius(optFloat2).shouldTakeOverUi(optBoolean).shouldFitToContent(optBoolean2).gestureMap(com.adobe.marketing.mobile.util.DataReader.optStringMap(mobileParameters, "gestures", new java.util.HashMap())).assetMap(map).build(), new com.adobe.marketing.mobile.messaging.MessagingFullscreenEventListener()), new com.adobe.marketing.mobile.util.DefaultPresentationUtilityProvider());
                    } catch (java.lang.ClassCastException unused4) {
                        str2 = propositionInfo;
                        str3 = com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG;
                        com.adobe.marketing.mobile.services.Log.warning(str3, str2, "Unable to create an in-app message, in-app message content is not of type String.", new java.lang.Object[0]);
                        throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Required field: in-app message content is not of type String.");
                    }
                } catch (java.lang.ClassCastException unused5) {
                }
            } catch (java.lang.ClassCastException unused6) {
                str2 = "Message";
            }
        }

        @Override // com.adobe.marketing.mobile.Message
        public java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
            java.util.Map<java.lang.String, java.lang.Object> map = this.getOutputFormats;
            return map != null ? map : java.util.Collections.emptyMap();
        }

        @Override // com.adobe.marketing.mobile.Message
        public void track(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
            if (messagingEdgeEventType == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "Unable to send a proposition interaction, MessagingEdgeEventType was null.", new java.lang.Object[0]);
                return;
            }
            com.adobe.marketing.mobile.messaging.PropositionInfo propositionInfo = this.Camera2StreamConfigurationMap;
            if (propositionInfo == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "Unable to send a proposition interaction (%s), PropositionInfo is not found for message (%s)", messagingEdgeEventType.getPropositionEventType(), this.getHighSpeedVideoSizes);
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "Unable to send a proposition interaction (%s), MessagingExtension is not found for message (%s)", messagingEdgeEventType.getPropositionEventType(), this.getHighSpeedVideoSizes);
                return;
            }
            if (str == null) {
                str = "";
            }
            this.getHighSpeedVideoFpsRangesFor.sendPropositionInteraction(new com.adobe.marketing.mobile.messaging.PropositionInteraction(messagingEdgeEventType, str, propositionInfo, null, null).getHighSpeedVideoSizes());
        }

        @Override // com.adobe.marketing.mobile.Message
        public void recordDisplay() {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "recording message display in history", new java.lang.Object[0]);
            Camera2StreamConfigurationMap(null, com.adobe.marketing.mobile.MessagingEdgeEventType.DISPLAY);
        }

        @Override // com.adobe.marketing.mobile.Message
        public void show() {
            com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable = this.getHighResolutionOutputSizeshNQ4ISI;
            if (presentable != null) {
                presentable.show();
            }
        }

        @Override // com.adobe.marketing.mobile.Message
        public void dismiss() {
            com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable = this.getHighResolutionOutputSizeshNQ4ISI;
            if (presentable != null) {
                presentable.dismiss();
            }
        }

        @Override // com.adobe.marketing.mobile.Message
        public java.lang.String getId() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.adobe.marketing.mobile.Message
        public boolean getAutoTrack() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // com.adobe.marketing.mobile.Message
        public void setAutoTrack(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
        }

        final void Camera2StreamConfigurationMap(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
            com.adobe.marketing.mobile.messaging.PropositionInfo propositionInfo = this.Camera2StreamConfigurationMap;
            if (propositionInfo == null || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(propositionInfo.getHighResolutionOutputSizeshNQ4ISI)) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "Unable to write event history event %s, proposition info is not available for message %s", messagingEdgeEventType != null ? messagingEdgeEventType.toString() : "'unknown'", this.getHighSpeedVideoSizes);
            } else {
                com.adobe.marketing.mobile.messaging.PropositionHistory.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI, messagingEdgeEventType, str);
            }
        }
    }
}
