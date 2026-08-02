package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
public class Identity {
    public static final java.lang.Class<? extends com.adobe.marketing.mobile.Extension> EXTENSION = com.adobe.marketing.mobile.edge.identity.IdentityExtension.class;

    private Identity() {
    }

    public static java.lang.String extensionVersion() {
        return "3.0.1";
    }

    public static void getExperienceCloudId(final com.adobe.marketing.mobile.AdobeCallback<java.lang.String> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Unexpected null callback, provide a callback to retrieve current ECID.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder("Edge Identity Request ECID", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_IDENTITY).build(), 500L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.edge.identity.Identity.1
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public /* synthetic */ void call(java.lang.Object obj) {
                    com.adobe.marketing.mobile.Event event = (com.adobe.marketing.mobile.Event) obj;
                    if (event != null && event.getEventData() != null) {
                        com.adobe.marketing.mobile.edge.identity.IdentityMap highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.edge.identity.IdentityMap.getHighSpeedVideoFpsRangesFor(event.getEventData());
                        if (highSpeedVideoFpsRangesFor == null) {
                            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Failed to read IdentityMap from response event, invoking error callback with AdobeError.UNEXPECTED_ERROR", new java.lang.Object[0]);
                        } else {
                            java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> identityItemsForNamespace = highSpeedVideoFpsRangesFor.getIdentityItemsForNamespace("ECID");
                            if (identityItemsForNamespace == null || identityItemsForNamespace.isEmpty() || identityItemsForNamespace.get(0).getId() == null) {
                                com.adobe.marketing.mobile.AdobeCallback.this.call("");
                                return;
                            } else {
                                com.adobe.marketing.mobile.AdobeCallback.this.call(identityItemsForNamespace.get(0).getId());
                                return;
                            }
                        }
                    }
                    com.adobe.marketing.mobile.edge.identity.Identity.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    com.adobe.marketing.mobile.edge.identity.Identity.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, adobeError);
                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", java.lang.String.format("Failed to dispatch %s event: Error : %s.", "Edge Identity Request ECID", adobeError.getErrorName()), new java.lang.Object[0]);
                }
            });
        }
    }

    public static void getUrlVariables(final com.adobe.marketing.mobile.AdobeCallback<java.lang.String> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Unexpected null callback, provide a callback to retrieve current visitor identifiers (URLVariables) query string.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder("Edge Identity Request URL Variables", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_IDENTITY).setEventData(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.adobe.marketing.mobile.edge.identity.Identity.2
                {
                    put("urlvariables", java.lang.Boolean.TRUE);
                }
            }).build(), 500L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.edge.identity.Identity.3
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public /* synthetic */ void call(java.lang.Object obj) {
                    java.lang.String optString;
                    com.adobe.marketing.mobile.Event event = (com.adobe.marketing.mobile.Event) obj;
                    if (event == null || event.getEventData() == null || (optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "urlvariables", null)) == null) {
                        com.adobe.marketing.mobile.edge.identity.Identity.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                    } else {
                        com.adobe.marketing.mobile.AdobeCallback.this.call(optString);
                    }
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    com.adobe.marketing.mobile.edge.identity.Identity.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, adobeError);
                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", java.lang.String.format("Failed to dispatch %s event: Error : %s.", "Edge Identity Request URL Variables", adobeError.getErrorName()), new java.lang.Object[0]);
                }
            });
        }
    }

    public static void updateIdentities(com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap) {
        if (identityMap == null || identityMap.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Unable to updateIdentities, IdentityMap is null or empty", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Edge Identity Update Identities", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.UPDATE_IDENTITY).setEventData(identityMap.getHighSpeedVideoFpsRangesFor(false)).build());
        }
    }

    public static void removeIdentity(com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem, java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Unable to removeIdentity, namespace is null or empty", new java.lang.Object[0]);
        } else {
            if (identityItem == null) {
                com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Unable to removeIdentity, IdentityItem is null", new java.lang.Object[0]);
                return;
            }
            com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap = new com.adobe.marketing.mobile.edge.identity.IdentityMap();
            identityMap.addItem(identityItem, str);
            com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Edge Identity Remove Identities", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.REMOVE_IDENTITY).setEventData(identityMap.getHighSpeedVideoFpsRangesFor(false)).build());
        }
    }

    public static void getIdentities(final com.adobe.marketing.mobile.AdobeCallback<com.adobe.marketing.mobile.edge.identity.IdentityMap> adobeCallback) {
        if (adobeCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Unexpected null callback, provide a callback to retrieve current IdentityMap.", new java.lang.Object[0]);
        } else {
            com.adobe.marketing.mobile.MobileCore.dispatchEventWithResponseCallback(new com.adobe.marketing.mobile.Event.Builder("Edge Identity Request Identities", com.adobe.marketing.mobile.EventType.EDGE_IDENTITY, com.adobe.marketing.mobile.EventSource.REQUEST_IDENTITY).build(), 500L, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event>() { // from class: com.adobe.marketing.mobile.edge.identity.Identity.4
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public /* synthetic */ void call(java.lang.Object obj) {
                    com.adobe.marketing.mobile.Event event = (com.adobe.marketing.mobile.Event) obj;
                    if (event != null && event.getEventData() != null) {
                        com.adobe.marketing.mobile.edge.identity.IdentityMap highSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.edge.identity.IdentityMap.getHighSpeedVideoFpsRangesFor(event.getEventData());
                        if (highSpeedVideoFpsRangesFor == null) {
                            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", "Failed to read IdentityMap from response event, invoking error callback with AdobeError.UNEXPECTED_ERROR", new java.lang.Object[0]);
                        } else {
                            com.adobe.marketing.mobile.AdobeCallback.this.call(highSpeedVideoFpsRangesFor);
                            return;
                        }
                    }
                    com.adobe.marketing.mobile.edge.identity.Identity.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, com.adobe.marketing.mobile.AdobeError.UNEXPECTED_ERROR);
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    com.adobe.marketing.mobile.edge.identity.Identity.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, adobeError);
                    com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "Identity", java.lang.String.format("Failed to dispatch %s event: Error : %s.", "Edge Identity Request Identities", adobeError.getErrorName()), new java.lang.Object[0]);
                }
            });
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback adobeCallback, com.adobe.marketing.mobile.AdobeError adobeError) {
        if (adobeCallback != null) {
            com.adobe.marketing.mobile.AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof com.adobe.marketing.mobile.AdobeCallbackWithError ? (com.adobe.marketing.mobile.AdobeCallbackWithError) adobeCallback : null;
            if (adobeCallbackWithError != null) {
                adobeCallbackWithError.fail(adobeError);
            }
        }
    }
}
