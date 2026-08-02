package com.datatheorem.android.trustkit.config;

/* loaded from: classes8.dex */
class TrustKitConfigurationParser {
    TrustKitConfigurationParser() {
    }

    public static com.datatheorem.android.trustkit.config.TrustKitConfiguration getHighSpeedVideoSizes(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.security.cert.CertificateException {
        java.lang.Boolean valueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int eventType = xmlPullParser.getEventType();
        com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.DebugOverridesTag debugOverridesTag = null;
        while (eventType != 1) {
            if (eventType == 2) {
                if ("domain-config".equals(xmlPullParser.getName())) {
                    arrayList.addAll(getHighSpeedVideoFpsRangesFor(xmlPullParser, null));
                } else if ("debug-overrides".equals(xmlPullParser.getName())) {
                    xmlPullParser.require(2, null, "debug-overrides");
                    com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.DebugOverridesTag debugOverridesTag2 = new com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.DebugOverridesTag((byte) 0);
                    java.util.HashSet hashSet = new java.util.HashSet();
                    int next = xmlPullParser.next();
                    java.lang.Boolean bool = null;
                    while (true) {
                        if (next == 3 && "trust-anchors".equals(xmlPullParser.getName())) {
                            break;
                        }
                        if (next == 2 && "certificates".equals(xmlPullParser.getName())) {
                            boolean parseBoolean = java.lang.Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "overridePins"));
                            if (bool != null && bool.booleanValue() != parseBoolean) {
                                valueOf = java.lang.Boolean.FALSE;
                                com.datatheorem.android.trustkit.utils.TrustKitLog.w("Warning: different values for overridePins are set in the policy but TrustKit only supports one value; using overridePins=false for all connections");
                            } else {
                                valueOf = java.lang.Boolean.valueOf(parseBoolean);
                            }
                            bool = valueOf;
                            java.lang.String trim = xmlPullParser.getAttributeValue(null, "src").trim();
                            if (android.text.TextUtils.isDigitsOnly(trim.replace("@", ""))) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("@");
                                java.lang.String resourceName = context.getResources().getResourceName(java.lang.Integer.parseInt(trim.replace("@", "")));
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(context.getPackageName());
                                sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
                                sb.append(resourceName.replace(sb2.toString(), ""));
                                trim = sb.toString();
                            }
                            if (!android.text.TextUtils.isEmpty(trim) && !trim.equals("user") && !trim.equals("system") && trim.startsWith("@raw")) {
                                hashSet.add(java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(context.getResources().getIdentifier(trim.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)[1], "raw", context.getPackageName()))));
                            } else {
                                com.datatheorem.android.trustkit.utils.TrustKitLog.i("No <debug-overrides> certificates found by TrustKit. Please check your @raw folder (TrustKit doesn't support system and user installed certificates).");
                            }
                        }
                        next = xmlPullParser.next();
                    }
                    if (bool != null) {
                        debugOverridesTag2.getHighSpeedVideoSizes = bool.booleanValue();
                    }
                    if (hashSet.size() > 0) {
                        debugOverridesTag2.Camera2StreamConfigurationMap = hashSet;
                    }
                    debugOverridesTag = debugOverridesTag2;
                }
            }
            eventType = xmlPullParser.next();
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.datatheorem.android.trustkit.config.DomainPinningPolicy build = ((com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder) it.next()).build();
            if (build != null) {
                hashSet2.add(build);
            }
        }
        if (debugOverridesTag != null) {
            return new com.datatheorem.android.trustkit.config.TrustKitConfiguration(hashSet2, debugOverridesTag.getHighSpeedVideoSizes, debugOverridesTag.Camera2StreamConfigurationMap);
        }
        return new com.datatheorem.android.trustkit.config.TrustKitConfiguration(hashSet2);
    }

    private static java.util.List<com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder> getHighSpeedVideoFpsRangesFor(org.xmlpull.v1.XmlPullParser xmlPullParser, com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder builder) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        xmlPullParser.require(2, null, "domain-config");
        com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder parent = new com.datatheorem.android.trustkit.config.DomainPinningPolicy.Builder().setParent(builder);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(parent);
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && "domain-config".equals(xmlPullParser.getName())) {
                return arrayList;
            }
            if (next == 2) {
                if ("domain-config".equals(xmlPullParser.getName())) {
                    arrayList.addAll(getHighSpeedVideoFpsRangesFor(xmlPullParser, parent));
                } else if ("domain".equals(xmlPullParser.getName())) {
                    com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.DomainTag highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(xmlPullParser);
                    parent.setHostname(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges).setShouldIncludeSubdomains(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor);
                } else if ("pin-set".equals(xmlPullParser.getName())) {
                    com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.PinSetTag highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(xmlPullParser);
                    parent.setPublicKeyHashes(highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap).setExpirationDate(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
                } else if ("trustkit-config".equals(xmlPullParser.getName())) {
                    com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.TrustkitConfigTag Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(xmlPullParser);
                    parent.setReportUris(Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges).setShouldEnforcePinning(Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI).setShouldDisableDefaultReportUri(Camera2StreamConfigurationMap.getHighSpeedVideoSizes);
                }
            }
            next = xmlPullParser.next();
        }
    }

    static class PinSetTag {
        java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
        java.util.Date getHighSpeedVideoFpsRangesFor;

        private PinSetTag() {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = null;
        }

        /* synthetic */ PinSetTag(byte b) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected digest value: ".concat(java.lang.String.valueOf(r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.PinSetTag getHighResolutionOutputSizeshNQ4ISI(org.xmlpull.v1.XmlPullParser xmlPullParser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        xmlPullParser.require(2, null, "pin-set");
        com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.PinSetTag pinSetTag = new com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.PinSetTag((byte) 0);
        pinSetTag.Camera2StreamConfigurationMap = new java.util.HashSet();
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "expiration");
        if (attributeValue != null) {
            try {
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);
                simpleDateFormat.setLenient(false);
                java.util.Date parse = simpleDateFormat.parse(attributeValue);
                if (parse == null) {
                    throw new com.datatheorem.android.trustkit.config.ConfigurationException("Invalid expiration date in pin-set");
                }
                pinSetTag.getHighSpeedVideoFpsRangesFor = parse;
            } catch (java.text.ParseException unused) {
                throw new com.datatheorem.android.trustkit.config.ConfigurationException("Invalid expiration date in pin-set");
            }
        }
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && "pin-set".equals(xmlPullParser.getName())) {
                return pinSetTag;
            }
            if (next == 2 && "pin".equals(xmlPullParser.getName())) {
                java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST);
                if (attributeValue2 == null || !attributeValue2.equals("SHA-256")) {
                    break;
                }
                pinSetTag.Camera2StreamConfigurationMap.add(xmlPullParser.nextText());
            }
            next = xmlPullParser.next();
        }
    }

    static class TrustkitConfigTag {
        java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
        java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
        java.lang.Boolean getHighSpeedVideoSizes;

        private TrustkitConfigTag() {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.FALSE;
        }

        /* synthetic */ TrustkitConfigTag(byte b) {
            this();
        }
    }

    private static com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.TrustkitConfigTag Camera2StreamConfigurationMap(org.xmlpull.v1.XmlPullParser xmlPullParser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        xmlPullParser.require(2, null, "trustkit-config");
        com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.TrustkitConfigTag trustkitConfigTag = new com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.TrustkitConfigTag((byte) 0);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "enforcePinning");
        if (attributeValue != null) {
            trustkitConfigTag.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(attributeValue));
        }
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "disableDefaultReportUri");
        if (attributeValue2 != null) {
            trustkitConfigTag.getHighSpeedVideoSizes = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(attributeValue2));
        }
        int next = xmlPullParser.next();
        while (true) {
            if (next != 3 || !"trustkit-config".equals(xmlPullParser.getName())) {
                if (next == 2 && "report-uri".equals(xmlPullParser.getName())) {
                    hashSet.add(xmlPullParser.nextText());
                }
                next = xmlPullParser.next();
            } else {
                trustkitConfigTag.getHighSpeedVideoFpsRanges = hashSet;
                return trustkitConfigTag;
            }
        }
    }

    static class DomainTag {
        java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.Boolean getHighSpeedVideoFpsRangesFor;

        private DomainTag() {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = null;
        }

        /* synthetic */ DomainTag(byte b) {
            this();
        }
    }

    private static com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.DomainTag getHighSpeedVideoFpsRanges(org.xmlpull.v1.XmlPullParser xmlPullParser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        xmlPullParser.require(2, null, "domain");
        com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.DomainTag domainTag = new com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.DomainTag((byte) 0);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "includeSubdomains");
        if (attributeValue != null) {
            domainTag.getHighSpeedVideoFpsRangesFor = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(attributeValue));
        }
        domainTag.getHighSpeedVideoFpsRanges = xmlPullParser.nextText();
        return domainTag;
    }

    static class DebugOverridesTag {
        java.util.Set<java.security.cert.Certificate> Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoSizes;

        private DebugOverridesTag() {
            this.getHighSpeedVideoSizes = false;
            this.Camera2StreamConfigurationMap = null;
        }

        /* synthetic */ DebugOverridesTag(byte b) {
            this();
        }
    }
}
