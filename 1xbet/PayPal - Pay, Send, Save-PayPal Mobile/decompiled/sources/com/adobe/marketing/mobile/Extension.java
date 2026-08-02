package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public abstract class Extension {
    private final com.adobe.marketing.mobile.ExtensionApi getHighSpeedVideoFpsRanges;

    protected java.lang.String getFriendlyName() {
        return null;
    }

    protected java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return null;
    }

    protected abstract java.lang.String getName();

    protected java.lang.String getVersion() {
        return null;
    }

    public boolean readyForEvent(com.adobe.marketing.mobile.Event event) {
        return true;
    }

    public Extension(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        this.getHighSpeedVideoFpsRanges = extensionApi;
    }

    public void onRegistered() {
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI(), "Extension registered successfully.", new java.lang.Object[0]);
    }

    protected void onUnregistered() {
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI(), "Extension unregistered successfully.", new java.lang.Object[0]);
    }

    public final com.adobe.marketing.mobile.ExtensionApi getApi() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Extension[");
        sb.append(getName());
        sb.append("(");
        sb.append(getVersion());
        sb.append(")]");
        return sb.toString();
    }
}
