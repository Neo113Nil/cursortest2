package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
class IdentityProperties {
    private static final java.util.List<java.lang.String> getHighSpeedVideoSizes = java.util.Arrays.asList("ECID", "GAID", "IDFA");
    final com.adobe.marketing.mobile.edge.identity.IdentityMap Camera2StreamConfigurationMap;

    IdentityProperties() {
        this.Camera2StreamConfigurationMap = new com.adobe.marketing.mobile.edge.identity.IdentityMap();
    }

    IdentityProperties(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.adobe.marketing.mobile.edge.identity.IdentityMap highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.edge.identity.IdentityMap.getHighSpeedVideoFpsRangesFor(map);
        this.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor == null ? new com.adobe.marketing.mobile.edge.identity.IdentityMap() : highSpeedVideoFpsRangesFor;
    }

    final java.lang.String Camera2StreamConfigurationMap() {
        java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> identityItemsForNamespace = this.Camera2StreamConfigurationMap.getIdentityItemsForNamespace("GAID");
        if (com.adobe.marketing.mobile.edge.identity.Utils.Camera2StreamConfigurationMap(identityItemsForNamespace) || identityItemsForNamespace.get(0) == null) {
            return null;
        }
        return identityItemsForNamespace.get(0).getId();
    }

    final void getHighSpeedVideoSizes(com.adobe.marketing.mobile.edge.identity.ECID ecid) {
        com.adobe.marketing.mobile.edge.identity.ECID highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            this.Camera2StreamConfigurationMap.removeItem(new com.adobe.marketing.mobile.edge.identity.IdentityItem(highSpeedVideoFpsRanges.toString()), "ECID");
        }
        if (ecid == null) {
            getHighSpeedVideoFpsRanges(null);
            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap("ECID");
        } else {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(new com.adobe.marketing.mobile.edge.identity.IdentityItem(ecid.toString(), com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AMBIGUOUS, false), "ECID", true);
        }
    }

    final com.adobe.marketing.mobile.edge.identity.ECID getHighSpeedVideoFpsRanges() {
        java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> identityItemsForNamespace = this.Camera2StreamConfigurationMap.getIdentityItemsForNamespace("ECID");
        if (identityItemsForNamespace == null || identityItemsForNamespace.isEmpty() || identityItemsForNamespace.get(0) == null || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(identityItemsForNamespace.get(0).getId())) {
            return null;
        }
        return new com.adobe.marketing.mobile.edge.identity.ECID(identityItemsForNamespace.get(0).getId());
    }

    final void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.edge.identity.ECID ecid) {
        com.adobe.marketing.mobile.edge.identity.ECID highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI != null) {
            this.Camera2StreamConfigurationMap.removeItem(new com.adobe.marketing.mobile.edge.identity.IdentityItem(highResolutionOutputSizeshNQ4ISI.toString()), "ECID");
        }
        if (getHighSpeedVideoFpsRanges() == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityProperties", "Cannot set secondary ECID value as no primary ECID exists.", new java.lang.Object[0]);
        } else if (ecid != null) {
            this.Camera2StreamConfigurationMap.addItem(new com.adobe.marketing.mobile.edge.identity.IdentityItem(ecid.toString(), com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AMBIGUOUS, false), "ECID");
        }
    }

    final com.adobe.marketing.mobile.edge.identity.ECID getHighResolutionOutputSizeshNQ4ISI() {
        java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> identityItemsForNamespace = this.Camera2StreamConfigurationMap.getIdentityItemsForNamespace("ECID");
        if (identityItemsForNamespace == null || identityItemsForNamespace.size() <= 1 || identityItemsForNamespace.get(1) == null || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(identityItemsForNamespace.get(1).getId())) {
            return null;
        }
        return new com.adobe.marketing.mobile.edge.identity.ECID(identityItemsForNamespace.get(1).getId());
    }

    static void getHighSpeedVideoSizes(com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap) {
        for (java.lang.String str : getHighSpeedVideoSizes) {
            if (identityMap.Camera2StreamConfigurationMap(str)) {
                if (str.equalsIgnoreCase("GAID") || str.equalsIgnoreCase("IDFA")) {
                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityProperties", java.lang.String.format("Operation not allowed for namespace %s; use MobileCore.setAdvertisingIdentifier instead.", str), new java.lang.Object[0]);
                } else {
                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityProperties", java.lang.String.format("Updating/Removing identifiers in namespace %s is not allowed.", str), new java.lang.Object[0]);
                }
            }
        }
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(false);
    }
}
