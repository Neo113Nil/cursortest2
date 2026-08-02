package com.datadog.trace.core.taginterceptor;

/* loaded from: classes3.dex */
public class TagInterceptor {
    private static final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create("404");
    private final boolean Camera2StreamConfigurationMap;
    private final com.datadog.trace.core.taginterceptor.RuleFlags getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.util.Set<java.lang.String> getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;

    public TagInterceptor(com.datadog.trace.core.taginterceptor.RuleFlags ruleFlags) {
        this(com.datadog.trace.api.Config.get().isServiceNameSetByUser(), com.datadog.trace.api.env.CapturedEnvironment.get().getProperties().get("service.name"), com.datadog.trace.api.Config.get().getSplitByTags(), ruleFlags);
    }

    public TagInterceptor(boolean z, java.lang.String str, java.util.Set<java.lang.String> set, com.datadog.trace.core.taginterceptor.RuleFlags ruleFlags) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = str;
        this.getInputFormats = set;
        this.getHighSpeedVideoFpsRanges = ruleFlags;
        this.getInputSizeshNQ4ISI = set.contains(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.SERVLET_CONTEXT);
        this.getHighSpeedVideoFpsRangesFor = ruleFlags.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.URL_AS_RESOURCE_NAME) && ruleFlags.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.STATUS_404) && ruleFlags.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.STATUS_404_DECORATOR);
        this.getOutputFormats = ruleFlags.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.URL_AS_RESOURCE_NAME);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean interceptTag(com.datadog.trace.core.DDSpanContext dDSpanContext, java.lang.String str, java.lang.Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1600255323:
                if (str.equals("_dd1.sr.eausr")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1541421527:
                if (str.equals(com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_SERVICE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -688795810:
                if (str.equals(com.datadog.trace.api.DDTags.SPAN_TYPE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -620406091:
                if (str.equals(com.datadog.trace.api.DDTags.MEASURED)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -356226025:
                if (str.equals(com.datadog.trace.api.DDTags.MANUAL_DROP)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -356030291:
                if (str.equals(com.datadog.trace.api.DDTags.MANUAL_KEEP)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -134204663:
                if (str.equals("http.url")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 282739975:
                if (str.equals("http.method")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 314627620:
                if (str.equals("service.name")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 934168683:
                if (str.equals("resource.name")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 960885172:
                if (str.equals("http.status_code")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1775928319:
                if (str.equals("db.statement")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1798451925:
                if (str.equals(com.datadog.trace.api.DDTags.ORIGIN_KEY)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1984153269:
                if (str.equals("service")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2146501382:
                if (str.equals(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.SERVLET_CONTEXT)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                java.lang.Number highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(obj);
                if (highSpeedVideoFpsRangesFor != null) {
                    dDSpanContext.setMetric("_dd1.sr.eausr", highSpeedVideoFpsRangesFor);
                }
                return true;
            case 1:
                dDSpanContext.setTag(com.datadog.trace.api.DDTags.PEER_SERVICE_SOURCE, com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_SERVICE);
                if (!this.getHighSpeedVideoFpsRanges.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.PEER_SERVICE)) {
                    return false;
                }
                dDSpanContext.setServiceName(java.lang.String.valueOf(obj));
                return true;
            case 2:
                if (obj instanceof java.lang.CharSequence) {
                    dDSpanContext.setSpanType((java.lang.CharSequence) obj);
                } else {
                    dDSpanContext.setSpanType(java.lang.String.valueOf(obj));
                }
                return true;
            case 3:
                if ((!(obj instanceof java.lang.Number) || ((java.lang.Number) obj).intValue() <= 0) && !getHighResolutionOutputSizeshNQ4ISI(obj)) {
                    return false;
                }
                dDSpanContext.setMeasured(true);
                return true;
            case 4:
                if (!this.getHighSpeedVideoFpsRanges.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.FORCE_MANUAL_DROP)) {
                    return false;
                }
                if (getHighResolutionOutputSizeshNQ4ISI(obj)) {
                    dDSpanContext.setSamplingPriority(-1, 4);
                }
                return true;
            case 5:
                if (!getHighResolutionOutputSizeshNQ4ISI(obj)) {
                    return false;
                }
                dDSpanContext.forceKeep();
                return true;
            case 6:
            case '\b':
                if (this.getOutputFormats) {
                    if ("http.method".equals(str)) {
                        java.lang.Object unsafeGetTag = dDSpanContext.unsafeGetTag("http.url");
                        if (unsafeGetTag != null) {
                            getHighSpeedVideoFpsRangesFor(dDSpanContext, obj.toString(), unsafeGetTag);
                        }
                    } else if ("http.url".equals(str)) {
                        java.lang.Object unsafeGetTag2 = dDSpanContext.unsafeGetTag("http.method");
                        getHighSpeedVideoFpsRangesFor(dDSpanContext, unsafeGetTag2 != null ? unsafeGetTag2.toString() : null, obj);
                    }
                }
                return false;
            case 7:
                dDSpanContext.setErrorFlag(getHighResolutionOutputSizeshNQ4ISI(obj), (byte) 0);
                return true;
            case '\t':
            case 14:
                if (!this.getHighSpeedVideoFpsRanges.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.SERVICE_NAME)) {
                    return false;
                }
                dDSpanContext.setServiceName(java.lang.String.valueOf(obj));
                return true;
            case '\n':
                if (!this.getHighSpeedVideoFpsRanges.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.RESOURCE_NAME) || obj == null) {
                    return false;
                }
                if (obj instanceof java.lang.CharSequence) {
                    dDSpanContext.setResourceName((java.lang.CharSequence) obj, (byte) 5);
                } else {
                    dDSpanContext.setResourceName(java.lang.String.valueOf(obj), (byte) 5);
                }
                return true;
            case 11:
                return getHighSpeedVideoSizes(dDSpanContext, obj);
            case '\f':
                if (obj instanceof java.lang.CharSequence) {
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                    if (charSequence.length() > 0) {
                        dDSpanContext.setResourceName(charSequence, (byte) 5);
                    }
                }
                return true;
            case '\r':
                if (obj instanceof java.lang.CharSequence) {
                    dDSpanContext.setOrigin((java.lang.CharSequence) obj);
                } else {
                    dDSpanContext.setOrigin(java.lang.String.valueOf(obj));
                }
                return true;
            case 15:
                if (!this.getInputSizeshNQ4ISI && (this.Camera2StreamConfigurationMap || !this.getHighSpeedVideoFpsRanges.isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature.SERVLET_CONTEXT) || (!dDSpanContext.getServiceName().isEmpty() && !dDSpanContext.getServiceName().equals(this.getHighSpeedVideoSizes) && !dDSpanContext.getServiceName().equals(com.datadog.trace.api.ConfigDefaults.DEFAULT_SERVICE_NAME)))) {
                    return false;
                }
                java.lang.String trim = java.lang.String.valueOf(obj).trim();
                if (!trim.isEmpty()) {
                    if (trim.equals(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                        dDSpanContext.setServiceName(com.datadog.trace.api.Config.get().getRootContextServiceName());
                    } else if (trim.charAt(0) == '/') {
                        if (trim.length() > 1) {
                            dDSpanContext.setServiceName(trim.substring(1));
                        }
                    } else {
                        dDSpanContext.setServiceName(trim);
                    }
                }
                return false;
            default:
                if (!this.getInputFormats.contains(str)) {
                    return false;
                }
                dDSpanContext.setServiceName(java.lang.String.valueOf(obj));
                return true;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(com.datadog.trace.core.DDSpanContext dDSpanContext, java.lang.String str, java.lang.Object obj) {
        java.lang.String path;
        com.datadog.trace.api.Pair<java.lang.CharSequence, java.lang.Byte> computeForServer;
        if (obj instanceof com.datadog.trace.bootstrap.instrumentation.api.URIUtils.LazyUrl) {
            path = ((com.datadog.trace.bootstrap.instrumentation.api.URIUtils.LazyUrl) obj).path();
        } else {
            java.net.URI safeParse = com.datadog.trace.bootstrap.instrumentation.api.URIUtils.safeParse(obj.toString());
            path = safeParse == null ? null : safeParse.getPath();
        }
        if (path != null) {
            if ("client".equals(dDSpanContext.unsafeGetTag("span.kind"))) {
                computeForServer = com.datadog.trace.api.normalize.HttpResourceNames.computeForClient(str, path, false);
            } else {
                computeForServer = com.datadog.trace.api.normalize.HttpResourceNames.computeForServer(str, path, false);
            }
            if (computeForServer.hasLeft()) {
                dDSpanContext.setResourceName(computeForServer.getLeft(), computeForServer.getRight().byteValue());
                return;
            }
            return;
        }
        dDSpanContext.setResourceName(com.datadog.trace.api.normalize.HttpResourceNames.DEFAULT_RESOURCE_NAME, (byte) 1);
    }

    private boolean getHighSpeedVideoSizes(com.datadog.trace.core.DDSpanContext dDSpanContext, java.lang.Object obj) {
        if (obj instanceof java.lang.Number) {
            dDSpanContext.setHttpStatusCode(((java.lang.Number) obj).shortValue());
            if (this.getHighSpeedVideoFpsRangesFor && dDSpanContext.getHttpStatusCode() == 404) {
                dDSpanContext.setResourceName(getHighResolutionOutputSizeshNQ4ISI, (byte) 2);
            }
            return true;
        }
        try {
            dDSpanContext.setHttpStatusCode(java.lang.Short.parseShort(java.lang.String.valueOf(obj)));
            if (this.getHighSpeedVideoFpsRangesFor && dDSpanContext.getHttpStatusCode() == 404) {
                dDSpanContext.setResourceName(getHighResolutionOutputSizeshNQ4ISI, (byte) 2);
            }
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        if (java.lang.Boolean.TRUE.equals(obj) || "1".equals(obj)) {
            return true;
        }
        return !java.lang.Boolean.FALSE.equals(obj) && java.lang.Boolean.parseBoolean(java.lang.String.valueOf(obj));
    }

    private static java.lang.Number getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        if (obj instanceof java.lang.Number) {
            return (java.lang.Number) obj;
        }
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
