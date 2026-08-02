package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class InternalMessagingUtils {
    private static long Camera2StreamConfigurationMap;

    InternalMessagingUtils() {
    }

    static java.util.List<com.adobe.marketing.mobile.messaging.Proposition> getHighSpeedVideoSizes(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list) {
        com.adobe.marketing.mobile.messaging.Proposition fromEventData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list)) {
            for (java.util.Map<java.lang.String, java.lang.Object> map : list) {
                if (map != null && (fromEventData = com.adobe.marketing.mobile.messaging.Proposition.fromEventData(map)) != null) {
                    arrayList.add(fromEventData);
                }
            }
        }
        return arrayList;
    }

    static java.lang.String getHighSpeedVideoFpsRanges() {
        java.io.File applicationCacheDir;
        com.adobe.marketing.mobile.services.DeviceInforming deviceInfoService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService();
        if (deviceInfoService == null || (applicationCacheDir = deviceInfoService.getApplicationCacheDir()) == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(applicationCacheDir);
        sb.append(java.io.File.separator);
        sb.append("messaging");
        sb.append(java.io.File.separator);
        sb.append(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.IMAGES_KEY);
        return sb.toString();
    }

    static boolean Camera2StreamConfigurationMap(com.adobe.marketing.mobile.Event event) {
        return event != null && event.getEventData() != null && com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT.equalsIgnoreCase(event.getSource());
    }

    static boolean getInputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event) {
        return event != null && com.adobe.marketing.mobile.EventType.GENERIC_IDENTITY.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.REQUEST_RESET.equalsIgnoreCase(event.getSource());
    }

    static boolean getHighSpeedVideoSizesFor(com.adobe.marketing.mobile.Event event) {
        return event != null && event.getEventData() != null && com.adobe.marketing.mobile.EventType.MESSAGING.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT.equalsIgnoreCase(event.getSource());
    }

    static boolean getInputFormats(com.adobe.marketing.mobile.Event event) {
        return getHighSpeedVideoSizesFor(event) && event.getEventData().containsKey("refreshmessages");
    }

    static boolean getHighSpeedVideoSizes(com.adobe.marketing.mobile.Event event) {
        return event != null && event.getEventData() != null && com.adobe.marketing.mobile.EventType.EDGE.equalsIgnoreCase(event.getType()) && "personalization:decisions".equalsIgnoreCase(event.getSource());
    }

    static boolean getOutputFormats(com.adobe.marketing.mobile.Event event) {
        return event != null && event.getEventData() != null && com.adobe.marketing.mobile.EventType.MESSAGING.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.CONTENT_COMPLETE.equalsIgnoreCase(event.getSource());
    }

    static boolean getOutputSizes(com.adobe.marketing.mobile.Event event) {
        return event != null && event.getEventData() != null && com.adobe.marketing.mobile.EventType.MESSAGING.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT.equalsIgnoreCase(event.getSource()) && com.adobe.marketing.mobile.util.DataReader.optBoolean(event.getEventData(), "updatepropositions", false);
    }

    static boolean getOutputMinFrameDuration(com.adobe.marketing.mobile.Event event) {
        return event != null && event.getEventData() != null && com.adobe.marketing.mobile.EventType.MESSAGING.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT.equalsIgnoreCase(event.getSource()) && com.adobe.marketing.mobile.util.DataReader.optBoolean(event.getEventData(), "getpropositions", false);
    }

    static boolean getOutputStallDuration(com.adobe.marketing.mobile.Event event) {
        return event != null && event.getEventData() != null && com.adobe.marketing.mobile.EventType.MESSAGING.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT.equalsIgnoreCase(event.getSource()) && com.adobe.marketing.mobile.util.DataReader.optBoolean(event.getEventData(), "trackpropositions", false);
    }

    static boolean getOutputStallDurationlomOqCM(com.adobe.marketing.mobile.Event event) {
        if (event == null || event.getEventData() == null) {
            return false;
        }
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "triggeredconsequence", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            return false;
        }
        return com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "type", "").equals("schema");
    }

    static java.util.List<com.adobe.marketing.mobile.messaging.Surface> getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.Event event) {
        java.util.ArrayList arrayList = null;
        if (event != null && event.getEventData() != null) {
            java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, event.getEventData(), "surfaces", null);
            if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "InternalMessagingUtils", "Surface URI's were not found in the provided event.", new java.lang.Object[0]);
                return null;
            }
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = optTypedListOfMap.iterator();
            while (it.hasNext()) {
                arrayList.add(com.adobe.marketing.mobile.messaging.Surface.fromEventData((java.util.Map) it.next()));
            }
        }
        return arrayList;
    }

    static java.lang.String getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.Event event) {
        java.lang.String parentID = event.getParentID();
        return com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(parentID) ? com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "requestEventId", null) : parentID;
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event) {
        if (event == null || event.getEventData() == null) {
            return null;
        }
        return com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "endingEventId", null);
    }

    static com.adobe.marketing.mobile.Event getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event, com.adobe.marketing.mobile.AdobeError adobeError) {
        return new com.adobe.marketing.mobile.Event.Builder("Message propositions response", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT).inResponseToEvent(event).setEventData(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.adobe.marketing.mobile.messaging.InternalMessagingUtils.1
            {
                put("responseerror", com.adobe.marketing.mobile.AdobeError.this.getErrorName());
            }
        }).build();
    }

    static void Camera2StreamConfigurationMap(com.adobe.marketing.mobile.messaging.PushTrackingStatus pushTrackingStatus, com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.Event event) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pushTrackingStatus", java.lang.Integer.valueOf(pushTrackingStatus.getValue()));
        hashMap.put("pushTrackingStatusMessage", pushTrackingStatus.getDescription());
        extensionApi.dispatch(new com.adobe.marketing.mobile.Event.Builder("Push tracking status event", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT).setEventData(hashMap).inResponseToEvent(event).build());
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, map, "identityMap", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            return null;
        }
        java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, optTypedMap, "ECID", null);
        if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(optTypedListOfMap)) {
            return null;
        }
        java.util.Map map2 = (java.util.Map) optTypedListOfMap.get(0);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map2)) {
            return null;
        }
        return com.adobe.marketing.mobile.util.DataReader.optString(map2, "id", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, long j) {
        java.lang.String str2;
        boolean z = false;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "shouldSyncPushToken", "New push token is null or empty, push token will not be synced.", new java.lang.Object[0]);
            return false;
        }
        boolean optBoolean = com.adobe.marketing.mobile.util.DataReader.optBoolean(map, "messaging.optimizePushSync", true);
        java.lang.String string = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("com.adobe.messaging").getString("pushidentifier", null);
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(string) || !string.equals(str)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "shouldSyncPushToken", "Push token is new or changed. The push token will be synced.", new java.lang.Object[0]);
        } else if (!optBoolean && j - Camera2StreamConfigurationMap > 1000) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "shouldSyncPushToken", "Push registration sync optimization is disabled. The push token will be synced.", new java.lang.Object[0]);
        } else {
            if (optBoolean) {
                str2 = "Push token sync optimization is enabled";
            } else {
                str2 = "Push registration sync optimization is disabled but the sync is within the 1 second timeout";
            }
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "shouldSyncPushToken", "%s. The push token will not be synced.", str2);
            if (z) {
                getHighSpeedVideoFpsRangesFor(str);
                Camera2StreamConfigurationMap = j;
            }
            return z;
        }
        z = true;
        if (z) {
        }
        return z;
    }

    static java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.messaging.Surface surface, com.adobe.marketing.mobile.launch.rulesengine.LaunchRule launchRule, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule>> map) {
        if (launchRule == null) {
            return map;
        }
        java.util.HashMap hashMap = new java.util.HashMap(map);
        java.util.List list = (java.util.List) hashMap.get(surface);
        if (list != null) {
            list.add(launchRule);
        } else {
            list = com.adobe.marketing.mobile.messaging.MessagingUtils.getHighSpeedVideoFpsRangesFor(launchRule);
        }
        hashMap.put(surface, list);
        return hashMap;
    }

    static java.lang.String Camera2StreamConfigurationMap() {
        return com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("com.adobe.messaging").getString("pushidentifier", null);
    }

    static void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("com.adobe.messaging");
        if (str == null) {
            namedCollection.remove("pushidentifier");
        } else {
            namedCollection.setString("pushidentifier", str);
        }
    }

    static void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.Object> map, com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.Event event) {
        com.adobe.marketing.mobile.Event.Builder builder = new com.adobe.marketing.mobile.Event.Builder(str, str2, str3, null);
        builder.setEventData(map);
        if (event != null) {
            builder.chainToParentEvent(event);
        }
        extensionApi.dispatch(builder.build());
    }
}
