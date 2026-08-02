package com.adobe.marketing.mobile.edge.consent;

/* loaded from: classes3.dex */
public class Consent {
    public static final java.lang.Class<? extends com.adobe.marketing.mobile.Extension> EXTENSION = com.adobe.marketing.mobile.edge.consent.ConsentExtension.class;

    private Consent() {
    }

    public static java.lang.String extensionVersion() {
        return "3.0.2";
    }

    public static void update(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null || map.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.debug("Consent", "Consent", "Null/Empty consents passed to update API. Ignoring the API call.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Consent Update Request", com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.UPDATE_CONSENT).setEventData(map).build());
        }
    }

    public static void getConsents(final com.adobe.marketing.mobile.AdobeCallback<java.util.Map<java.lang.String, java.lang.Object>> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("Consent", "Consent", "Unexpected null callback, provide a callback to retrieve current consents.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder("Get Consents Request", com.adobe.marketing.mobile.EventType.CONSENT, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).build(), 5000L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.edge.consent.Consent.1
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public /* synthetic */ void call(java.lang.Object obj) {
                    com.adobe.marketing.mobile.Event event = (com.adobe.marketing.mobile.Event) obj;
                    if (event == null || event.getEventData() == null) {
                        com.adobe.marketing.mobile.edge.consent.Consent.getHighSpeedVideoSizes(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                    } else {
                        com.adobe.marketing.mobile.AdobeCallback.this.call(com.adobe.marketing.mobile.edge.consent.Utils.getHighResolutionOutputSizeshNQ4ISI(event.getEventData(), new java.util.HashMap()));
                    }
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    com.adobe.marketing.mobile.edge.consent.Consent.getHighSpeedVideoSizes(com.adobe.marketing.mobile.AdobeCallback.this, adobeError);
                    com.adobe.marketing.mobile.services.Log.error("Consent", "Consent", "Failed to dispatch %s event: Error : %s.", adobeError.getErrorName());
                }
            });
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(com.adobe.marketing.mobile.AdobeCallback adobeCallback, com.adobe.marketing.mobile.AdobeError adobeError) {
        if (adobeCallback != null) {
            com.adobe.marketing.mobile.AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof com.adobe.marketing.mobile.AdobeCallbackWithError ? (com.adobe.marketing.mobile.AdobeCallbackWithError) adobeCallback : null;
            if (adobeCallbackWithError != null) {
                adobeCallbackWithError.fail(adobeError);
            }
        }
    }
}
