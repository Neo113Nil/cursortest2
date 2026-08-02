package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
final class MessagingCacheUtilities {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "pathToFile";
    final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.HashMap();
    final com.adobe.marketing.mobile.services.caching.CacheService getHighSpeedVideoSizes = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService();
    final java.lang.String Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.InternalMessagingUtils.getHighSpeedVideoFpsRanges();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> getHighSpeedVideoFpsRangesFor() {
        java.io.InputStream inputStream;
        java.io.ObjectInputStream objectInputStream;
        com.adobe.marketing.mobile.services.caching.CacheResult cacheResult = this.getHighSpeedVideoSizes.get("messaging", "propositions");
        java.io.InputStream inputStream2 = null;
        if (cacheResult == null) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to find a cached proposition.", new java.lang.Object[0]);
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> metadata = cacheResult.getMetadata();
        if (metadata != null) {
            ?? isEmpty = metadata.isEmpty();
            inputStream = isEmpty;
            if (isEmpty == 0) {
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Loading cached proposition from (%s)", metadata.get("pathToFile"));
                inputStream = "Loading cached proposition from (%s)";
            }
        }
        java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> hashMap = new java.util.HashMap<>();
        try {
            try {
                objectInputStream = new java.io.ObjectInputStream(cacheResult.getData());
                try {
                    java.lang.Object readObject = objectInputStream.readObject();
                    if (readObject == null) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to read cached data into an object.", new java.lang.Object[0]);
                        try {
                            objectInputStream.close();
                            return null;
                        } catch (java.io.IOException e) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when closing the FileInputStream: %s", e.getMessage());
                            return null;
                        }
                    }
                    try {
                        java.lang.Object obj = ((java.util.List) ((java.util.Map.Entry) ((java.util.Map) readObject).entrySet().iterator().next()).getValue()).get(0);
                        if (obj instanceof com.adobe.marketing.mobile.messaging.Proposition) {
                            hashMap = (java.util.Map) readObject;
                        } else if (obj instanceof com.adobe.marketing.mobile.messaging.PropositionPayload) {
                            for (java.util.Map.Entry entry : ((java.util.Map) readObject).entrySet()) {
                                hashMap.put((com.adobe.marketing.mobile.messaging.Surface) entry.getKey(), getHighSpeedVideoFpsRanges((java.util.List) entry.getValue()));
                            }
                        }
                        try {
                            objectInputStream.close();
                            return hashMap;
                        } catch (java.io.IOException e2) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when closing the FileInputStream: %s", e2.getMessage());
                            return hashMap;
                        }
                    } catch (java.util.NoSuchElementException unused) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Unable to retrieve first element of cached data list.", new java.lang.Object[0]);
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException e3) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when closing the FileInputStream: %s", e3.getMessage());
                        }
                        return null;
                    }
                } catch (java.io.IOException e4) {
                    e = e4;
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when reading from the cached file: %s", e.getMessage());
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException e5) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when closing the FileInputStream: %s", e5.getMessage());
                        }
                    }
                    return null;
                } catch (java.lang.ClassNotFoundException e6) {
                    e = e6;
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Class not found: %s", e.getMessage());
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException e7) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when closing the FileInputStream: %s", e7.getMessage());
                        }
                    }
                    return null;
                } catch (java.lang.NullPointerException e8) {
                    e = e8;
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when retrieving the cached proposition file: %s", e.getMessage());
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException e9) {
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when closing the FileInputStream: %s", e9.getMessage());
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e10) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred when closing the FileInputStream: %s", e10.getMessage());
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e11) {
            e = e11;
            objectInputStream = null;
        } catch (java.lang.ClassNotFoundException e12) {
            e = e12;
            objectInputStream = null;
        } catch (java.lang.NullPointerException e13) {
            e = e13;
            objectInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    private static java.util.List<com.adobe.marketing.mobile.messaging.Proposition> getHighSpeedVideoFpsRanges(java.util.List<com.adobe.marketing.mobile.messaging.PropositionPayload> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        try {
            for (com.adobe.marketing.mobile.messaging.PropositionPayload propositionPayload : list) {
                for (com.adobe.marketing.mobile.messaging.PayloadItem payloadItem : propositionPayload.getHighResolutionOutputSizeshNQ4ISI) {
                    arrayList2.add(new com.adobe.marketing.mobile.messaging.PropositionItem(payloadItem.Camera2StreamConfigurationMap, com.adobe.marketing.mobile.messaging.SchemaType.getHighSpeedVideoFpsRangesFor(payloadItem.getHighSpeedVideoFpsRangesFor), payloadItem.getHighResolutionOutputSizeshNQ4ISI));
                }
                arrayList.add(new com.adobe.marketing.mobile.messaging.Proposition(propositionPayload.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges, propositionPayload.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes, propositionPayload.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap, arrayList2));
            }
            return arrayList;
        } catch (com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingCacheUtilities", "Exception occurred creating Proposition: %s", e.getLocalizedMessage());
            return arrayList;
        }
    }

    static boolean getHighSpeedVideoSizes(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(str)) {
            return str.startsWith("http") || str.startsWith("https");
        }
        return false;
    }
}
