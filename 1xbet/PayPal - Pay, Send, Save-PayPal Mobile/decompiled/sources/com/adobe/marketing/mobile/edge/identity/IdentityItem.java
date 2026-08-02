package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
public final class IdentityItem {
    private final boolean Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.adobe.marketing.mobile.edge.identity.AuthenticatedState getHighSpeedVideoSizes;

    public IdentityItem(java.lang.String str, com.adobe.marketing.mobile.edge.identity.AuthenticatedState authenticatedState, boolean z) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("id must be non-null");
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = authenticatedState == null ? com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AMBIGUOUS : authenticatedState;
        this.Camera2StreamConfigurationMap = z;
    }

    public IdentityItem(java.lang.String str) {
        this(str, com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AMBIGUOUS, false);
    }

    public IdentityItem(com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem) {
        this(identityItem.getHighSpeedVideoFpsRangesFor, identityItem.getHighSpeedVideoSizes, identityItem.Camera2StreamConfigurationMap);
    }

    public final java.lang.String getId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.adobe.marketing.mobile.edge.identity.AuthenticatedState getAuthenticatedState() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isPrimary() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"id\": \"");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("\", \"authenticatedState\": \"");
        com.adobe.marketing.mobile.edge.identity.AuthenticatedState authenticatedState = this.getHighSpeedVideoSizes;
        sb.append(authenticatedState == null ? "null" : authenticatedState.getName());
        sb.append("\", \"primary\": ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.getHighSpeedVideoFpsRangesFor.equalsIgnoreCase(((com.adobe.marketing.mobile.edge.identity.IdentityItem) obj).getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.getHighSpeedVideoFpsRangesFor);
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str != null) {
            hashMap.put("id", str);
        }
        com.adobe.marketing.mobile.edge.identity.AuthenticatedState authenticatedState = this.getHighSpeedVideoSizes;
        if (authenticatedState != null) {
            hashMap.put("authenticatedState", authenticatedState.getName());
        } else {
            hashMap.put("authenticatedState", com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AMBIGUOUS.getName());
        }
        hashMap.put("primary", java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap));
        return hashMap;
    }

    static com.adobe.marketing.mobile.edge.identity.IdentityItem getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return null;
        }
        try {
            return new com.adobe.marketing.mobile.edge.identity.IdentityItem(com.adobe.marketing.mobile.util.DataReader.getString(map, "id"), com.adobe.marketing.mobile.edge.identity.AuthenticatedState.fromString(com.adobe.marketing.mobile.util.DataReader.optString(map, "authenticatedState", com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AMBIGUOUS.getName())), com.adobe.marketing.mobile.util.DataReader.optBoolean(map, "primary", false));
        } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityItem", "Failed to create IdentityItem from data.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalArgumentException e) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityItem", "Failed to create IdentityItem from data as 'id' is null. %s", e.getLocalizedMessage());
            return null;
        }
    }
}
