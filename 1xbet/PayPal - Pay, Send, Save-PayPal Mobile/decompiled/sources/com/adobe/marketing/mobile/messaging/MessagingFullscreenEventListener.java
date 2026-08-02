package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class MessagingFullscreenEventListener implements com.adobe.marketing.mobile.services.ui.message.InAppMessageEventListener {
    MessagingFullscreenEventListener() {
    }

    @Override // com.adobe.marketing.mobile.services.ui.PresentationEventListener
    public void onShow(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable) {
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI();
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage internalMessage = (com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage) com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI(presentable.getPresentation().getId());
        if (internalMessage != null) {
            if (internalMessage.getAutoTrack()) {
                internalMessage.track(null, com.adobe.marketing.mobile.MessagingEdgeEventType.DISPLAY);
            }
            internalMessage.Camera2StreamConfigurationMap(null, com.adobe.marketing.mobile.MessagingEdgeEventType.DISPLAY);
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Fullscreen message shown.", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.ui.PresentationEventListener
    public void onDismiss(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable) {
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI();
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage internalMessage = (com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage) com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI(presentable.getPresentation().getId());
        if (internalMessage != null) {
            if (internalMessage.getAutoTrack()) {
                internalMessage.track(null, com.adobe.marketing.mobile.MessagingEdgeEventType.DISMISS);
            }
            internalMessage.Camera2StreamConfigurationMap(null, com.adobe.marketing.mobile.MessagingEdgeEventType.DISMISS);
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Fullscreen message dismissed.", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.ui.PresentationEventListener
    public void onError(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable, com.adobe.marketing.mobile.services.ui.PresentationError presentationError) {
        java.lang.String reason;
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI();
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage internalMessage = (com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage) com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI(presentable.getPresentation().getId());
        if (internalMessage != null) {
            if (presentationError instanceof com.adobe.marketing.mobile.services.ui.SuppressedByAppDeveloper) {
                reason = ((com.adobe.marketing.mobile.services.ui.SuppressedByAppDeveloper) presentationError).getReason();
            } else {
                reason = presentationError instanceof com.adobe.marketing.mobile.services.ui.ConflictingPresentation ? ((com.adobe.marketing.mobile.services.ui.ConflictingPresentation) presentationError).getReason() : null;
            }
            if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(reason) && internalMessage.getAutoTrack()) {
                internalMessage.track(reason, com.adobe.marketing.mobile.MessagingEdgeEventType.SUPPRESS_DISPLAY);
            }
            internalMessage.Camera2StreamConfigurationMap(reason, com.adobe.marketing.mobile.MessagingEdgeEventType.SUPPRESS_DISPLAY);
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Fullscreen message failed to show.", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.ui.message.InAppMessageEventListener
    public boolean onUrlLoading(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable, java.lang.String str) {
        java.util.HashMap hashMap;
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Fullscreen overrideUrlLoad callback received with url (%s)", str);
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Cannot process provided URL string, it is null or empty.", new java.lang.Object[0]);
            return true;
        }
        try {
            java.net.URI uri = new java.net.URI(str);
            if (!"adbinapp".equals(uri.getScheme())) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Invalid message scheme found in URI. (%s)", str);
                return false;
            }
            try {
                java.lang.String decode = java.net.URLDecoder.decode(uri.getQuery(), java.nio.charset.StandardCharsets.UTF_8.toString());
                if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(decode)) {
                    hashMap = null;
                } else {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    for (java.lang.String str2 : decode.split("&")) {
                        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
                            java.lang.String[] split = str2.split("=", 2);
                            if (split.length == 2 && !split[0].isEmpty() && !split[1].isEmpty()) {
                                hashMap2.put(split[0], split[1]);
                            }
                        }
                    }
                    hashMap = hashMap2;
                }
                com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI();
                com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage internalMessage = (com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage) com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI(presentable.getPresentation().getId());
                if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(hashMap)) {
                    java.lang.String str3 = (java.lang.String) hashMap.remove("interaction");
                    if (internalMessage != null && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str3)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Tracking message interaction (%s)", str3);
                        internalMessage.track(str3, com.adobe.marketing.mobile.MessagingEdgeEventType.INTERACT);
                        internalMessage.Camera2StreamConfigurationMap(str3, com.adobe.marketing.mobile.MessagingEdgeEventType.INTERACT);
                    }
                    java.lang.String str4 = (java.lang.String) hashMap.remove("link");
                    if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str4)) {
                        if (str4.startsWith("js")) {
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Evaluating javascript (%s)", str4);
                            presentable.getPresentation().getEventHandler().evaluateJavascript(str4, new com.adobe.marketing.mobile.AdobeCallback() { // from class: com.adobe.marketing.mobile.messaging.MessagingFullscreenEventListener$$ExternalSyntheticLambda0
                                @Override // com.adobe.marketing.mobile.AdobeCallback
                                public final void call(java.lang.Object obj) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Javascript evaluation completed with result: %s", (java.lang.String) obj);
                                }
                            });
                        } else {
                            if (!hashMap.isEmpty()) {
                                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                                    str4 = str4.concat("&").concat((java.lang.String) entry.getKey()).concat("=").concat((java.lang.String) entry.getValue());
                                }
                            }
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Loading deeplink (%s)", str4);
                            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str4)) {
                                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Will not openURL, url is null or empty.", new java.lang.Object[0]);
                            } else {
                                com.adobe.marketing.mobile.services.uri.UriOpening uriService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getUriService();
                                if (uriService == null || !uriService.openUri(str4)) {
                                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Could not open URL (%s)", str4);
                                }
                            }
                        }
                    }
                }
                java.lang.String host = uri.getHost();
                if ((host.equals("dismiss") || host.equals(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL)) && internalMessage != null) {
                    internalMessage.dismiss();
                }
                return true;
            } catch (java.io.UnsupportedEncodingException | java.lang.NullPointerException unused) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "UnsupportedEncodingException occurred when decoding query parameters %s.", uri.getQuery());
                return false;
            }
        } catch (java.net.URISyntaxException e) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Invalid message URI found (%s), exception is: %s.", str, e.getMessage());
            return true;
        }
    }

    @Override // com.adobe.marketing.mobile.services.ui.PresentationEventListener
    public void onHide(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable) {
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingFullscreenMessageDelegate", "Fullscreen message hidden.", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.ui.message.InAppMessageEventListener
    public void onBackPressed(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable) {
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage internalMessage = (com.adobe.marketing.mobile.messaging.PresentableMessageMapper.InternalMessage) com.adobe.marketing.mobile.messaging.MessagingUtils.getMessageForPresentable(presentable);
        if (internalMessage != null) {
            if (internalMessage.getAutoTrack()) {
                internalMessage.track("backPress", com.adobe.marketing.mobile.MessagingEdgeEventType.INTERACT);
            }
            internalMessage.Camera2StreamConfigurationMap("backPress", com.adobe.marketing.mobile.MessagingEdgeEventType.INTERACT);
        }
    }
}
