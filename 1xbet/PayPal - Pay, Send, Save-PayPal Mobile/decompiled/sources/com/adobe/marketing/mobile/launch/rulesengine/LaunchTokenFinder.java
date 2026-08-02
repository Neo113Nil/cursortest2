package com.adobe.marketing.mobile.launch.rulesengine;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchTokenFinder;", "Lcom/adobe/marketing/mobile/rulesengine/TokenFinder;", "Lcom/adobe/marketing/mobile/Event;", "event", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/Event;Lcom/adobe/marketing/mobile/ExtensionApi;)V", "", "key", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/adobe/marketing/mobile/Event;", "getEvent", "()Lcom/adobe/marketing/mobile/Event;", "Lcom/adobe/marketing/mobile/ExtensionApi;", "getExtensionApi", "()Lcom/adobe/marketing/mobile/ExtensionApi;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LaunchTokenFinder implements com.adobe.marketing.mobile.rulesengine.TokenFinder {
    private final com.adobe.marketing.mobile.Event event;
    private final com.adobe.marketing.mobile.ExtensionApi extensionApi;

    public LaunchTokenFinder(com.adobe.marketing.mobile.Event event, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        this.event = event;
        this.extensionApi = extensionApi;
    }

    public final com.adobe.marketing.mobile.Event getEvent() {
        return this.event;
    }

    public final com.adobe.marketing.mobile.ExtensionApi getExtensionApi() {
        return this.extensionApi;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.TokenFinder
    public final java.lang.Object get(java.lang.String key) {
        java.util.Map<java.lang.String, java.lang.Object> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(key).toString();
        switch (obj.hashCode()) {
            case -1368656616:
                if (obj.equals("~timestampp")) {
                    return com.adobe.marketing.mobile.util.TimeUtils.getISO8601UTCDateWithMilliseconds$default(null, 1, null);
                }
                break;
            case -1368656611:
                if (obj.equals("~timestampu")) {
                    return java.lang.String.valueOf(com.adobe.marketing.mobile.util.TimeUtils.getUnixTimeInSeconds());
                }
                break;
            case -1368656606:
                if (obj.equals("~timestampz")) {
                    return com.adobe.marketing.mobile.util.TimeUtils.getISO8601DateNoColon$default(null, 1, null);
                }
                break;
            case -750644441:
                if (obj.equals("~sdkver")) {
                    return com.adobe.marketing.mobile.MobileCore.extensionVersion();
                }
                break;
            case -740191719:
                if (obj.equals("~source")) {
                    return this.event.getSource();
                }
                break;
            case -361051245:
                if (obj.equals("~all_url")) {
                    if (this.event.getEventData() != null) {
                        java.util.Map<java.lang.String, java.lang.Object> eventData = this.event.getEventData();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventData, "");
                        return com.adobe.marketing.mobile.internal.util.MapExtensionsKt.serializeToQueryString(com.adobe.marketing.mobile.internal.util.MapExtensionsKt.flattening$default(eventData, null, false, 1, null));
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Triggering event ");
                    sb.append(this.event.getUniqueIdentifier());
                    sb.append(" - Event data is null, can not use it to generate an url query string");
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "LaunchTokenFinder", sb.toString(), new java.lang.Object[0]);
                    return "";
                }
                break;
            case 0:
                if (obj.equals("")) {
                    return null;
                }
                break;
            case 119939256:
                if (obj.equals("~type")) {
                    return this.event.getType();
                }
                break;
            case 455941560:
                if (obj.equals("~cachebust")) {
                    return java.lang.String.valueOf(new java.security.SecureRandom().nextInt(100000000));
                }
                break;
            case 1691986756:
                if (obj.equals("~all_json")) {
                    if (this.event.getEventData() == null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Triggering event ");
                        sb2.append(this.event.getUniqueIdentifier());
                        sb2.append(" - Event data is null, can not use it to generate a json string");
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "LaunchTokenFinder", sb2.toString(), new java.lang.Object[0]);
                        return "";
                    }
                    try {
                        return new org.json.JSONObject(this.event.getEventData()).toString();
                    } catch (java.lang.Exception e) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Triggering event ");
                        sb3.append(this.event.getUniqueIdentifier());
                        sb3.append(" - Failed to generate a json string ");
                        sb3.append(e.getMessage());
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "LaunchTokenFinder", sb3.toString(), new java.lang.Object[0]);
                        return "";
                    }
                }
                break;
        }
        if (!kotlin.text.StringsKt.startsWith$default(key, "~state.", false, 2, (java.lang.Object) null)) {
            if (this.event.getEventData() == null) {
                return "";
            }
            java.util.Map<java.lang.String, java.lang.Object> eventData2 = this.event.getEventData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventData2, "");
            return com.adobe.marketing.mobile.internal.util.MapExtensionsKt.flattening$default(eventData2, null, false, 3, null).get(key);
        }
        java.lang.String substring = key.substring(7);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String str = substring;
        if (!kotlin.text.StringsKt.isBlank(str) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str2 = (java.lang.String) split$default.get(0);
            java.lang.String str3 = (java.lang.String) split$default.get(1);
            com.adobe.marketing.mobile.SharedStateResult sharedState = this.extensionApi.getSharedState(str2, this.event, false, com.adobe.marketing.mobile.SharedStateResolution.ANY);
            java.util.Map flattening$default = (sharedState == null || (value = sharedState.getValue()) == null) ? null : com.adobe.marketing.mobile.internal.util.MapExtensionsKt.flattening$default(value, null, false, 3, null);
            if (flattening$default != null && !flattening$default.isEmpty() && !kotlin.text.StringsKt.isBlank(str3) && flattening$default.containsKey(str3)) {
                return flattening$default.get(str3);
            }
        }
        return null;
    }
}
