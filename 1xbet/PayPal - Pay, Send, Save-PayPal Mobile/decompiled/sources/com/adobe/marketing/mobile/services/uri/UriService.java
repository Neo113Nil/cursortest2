package com.adobe.marketing.mobile.services.uri;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/adobe/marketing/mobile/services/uri/UriService;", "Lcom/adobe/marketing/mobile/services/uri/UriOpening;", "<init>", "()V", "", "uri", "", "openUri", "(Ljava/lang/String;)Z", "Lcom/adobe/marketing/mobile/services/uri/URIHandler;", "handler", "", "setUriHandler", "(Lcom/adobe/marketing/mobile/services/uri/URIHandler;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/adobe/marketing/mobile/services/uri/URIHandler;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class UriService implements com.adobe.marketing.mobile.services.uri.UriOpening {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.adobe.marketing.mobile.services.uri.URIHandler getHighSpeedVideoSizes;

    @Override // com.adobe.marketing.mobile.services.uri.UriOpening
    public final boolean openUri(java.lang.String uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        if (kotlin.text.StringsKt.isBlank(uri)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "UriService", "Cannot open URI. URI is empty.", new java.lang.Object[0]);
            return false;
        }
        android.app.Activity currentActivity = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getCurrentActivity();
        if (currentActivity == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot open URI: ");
            sb.append(uri);
            sb.append(". No current activity found.");
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "UriService", sb.toString(), new java.lang.Object[0]);
            return false;
        }
        com.adobe.marketing.mobile.services.uri.URIHandler uRIHandler = this.getHighSpeedVideoSizes;
        android.content.Intent uRIDestination = uRIHandler != null ? uRIHandler.getURIDestination(uri) : null;
        if (uRIDestination == null) {
            try {
                uRIDestination = new android.content.Intent("android.intent.action.VIEW");
                uRIDestination.setData(android.net.Uri.parse(uri));
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to open URI: ");
                sb2.append(uri);
                sb2.append(". ");
                sb2.append(e.getMessage());
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "UriService", sb2.toString(), new java.lang.Object[0]);
                return false;
            }
        }
        currentActivity.startActivity(uRIDestination);
        return true;
    }

    @Override // com.adobe.marketing.mobile.services.uri.UriOpening
    public final void setUriHandler(com.adobe.marketing.mobile.services.uri.URIHandler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighSpeedVideoSizes = handler;
    }
}
