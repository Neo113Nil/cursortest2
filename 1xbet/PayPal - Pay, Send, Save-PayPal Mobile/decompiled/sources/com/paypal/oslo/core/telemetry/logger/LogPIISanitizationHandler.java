package com.paypal.oslo.core.telemetry.logger;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00188AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/telemetry/logger/LogPIISanitizationHandler;", "Lcom/paypal/android/logger/LogHandler;", "Lcom/paypal/android/logger/LogHandlerChain;", "delegate", "violationHandler", "<init>", "(Lcom/paypal/android/logger/LogHandlerChain;Lcom/paypal/android/logger/LogHandler;)V", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/lang/String;", "isOutputSupportedFor", "Lcom/paypal/android/logger/LogHandlerChain;", "getValidOutputFormatsForInputhNQ4ISI", "Lcom/paypal/android/logger/LogHandler;", "getHighSpeedVideoFpsRanges", "", "getInnerChain$telemetry_release", "()Ljava/util/List;", "innerChain", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LogPIISanitizationHandler implements com.paypal.android.logger.LogHandler {
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges;
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor;
    private static final kotlin.text.Regex getHighSpeedVideoSizes;
    private static final kotlin.text.Regex getHighSpeedVideoSizesFor;
    private static final kotlin.text.Regex getInputFormats;
    private static final kotlin.text.Regex getInputSizeshNQ4ISI;
    private static final java.util.List<kotlin.Pair<java.lang.String, kotlin.text.Regex>> getOutputFormats;
    private static final kotlin.text.Regex getOutputMinFrameDuration;
    private static final kotlin.text.Regex getOutputMinFrameDurationlomOqCM;
    private static final kotlin.text.Regex getOutputSizes;
    private static final kotlin.text.Regex getOutputSizeshNQ4ISI;
    private static final kotlin.text.Regex getOutputStallDuration;
    private static final kotlin.text.Regex getOutputStallDurationlomOqCM;
    private static final kotlin.text.Regex toString;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.logger.LogHandler getHighSpeedVideoFpsRanges;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final com.paypal.android.logger.LogHandlerChain getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler.Companion Companion = new com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.text.Regex isOutputSupportedForhNQ4ISI = new kotlin.text.Regex("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");

    public LogPIISanitizationHandler(com.paypal.android.logger.LogHandlerChain logHandlerChain, com.paypal.android.logger.LogHandler logHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logHandlerChain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logHandler, "");
        this.getHighSpeedVideoFpsRangesFor = logHandlerChain;
        this.getHighSpeedVideoFpsRanges = logHandler;
    }

    public final java.util.List<com.paypal.android.logger.LogHandler> getInnerChain$telemetry_release() {
        return this.getHighSpeedVideoFpsRangesFor.getChain();
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R&\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/core/telemetry/logger/LogPIISanitizationHandler$Companion;", "", "<init>", "()V", "Lkotlin/text/Regex;", "isOutputSupportedForhNQ4ISI", "Lkotlin/text/Regex;", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDurationlomOqCM", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getOutputStallDurationlomOqCM", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "toString", "getOutputFormats", "getOutputSizes", "getOutputStallDuration", "getOutputSizeshNQ4ISI", "", "Lkotlin/Pair;", "", "Ljava/util/List;", "", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean getHighSpeedVideoSizes(java.lang.String str) {
            java.lang.String str2 = str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                char charAt = str2.charAt(i);
                if (java.lang.Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            java.lang.String obj = sb.toString();
            int i2 = 0;
            boolean z = false;
            for (int length2 = obj.length() - 1; length2 >= 0; length2--) {
                int digitToInt = kotlin.text.CharsKt.digitToInt(obj.charAt(length2));
                if (z && (digitToInt = digitToInt * 2) > 9) {
                    digitToInt -= 9;
                }
                i2 += digitToInt;
                z = !z;
            }
            return i2 % 10 == 0;
        }

        public static final /* synthetic */ java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return new kotlin.text.Regex("[_.\\-]").replace(lowerCase, "");
        }

        public static final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            return com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler.isOutputSupportedForhNQ4ISI.replace(str, "<uuid>");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.text.Regex regex = new kotlin.text.Regex("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        getInputSizeshNQ4ISI = regex;
        kotlin.text.Regex regex2 = new kotlin.text.Regex("(\\+?1?\\s?)?(\\(?\\d{3}\\)?[\\s.\\-]?)(\\d{3}[\\s.\\-]?\\d{4})");
        getOutputMinFrameDurationlomOqCM = regex2;
        kotlin.text.Regex regex3 = new kotlin.text.Regex("(?<![A-Za-z0-9_-])[A-Za-z0-9_-]{10,}\\.[A-Za-z0-9_-]{10,}\\.[A-Za-z0-9_-]{10,}(?![A-Za-z0-9_-])");
        getInputFormats = regex3;
        kotlin.text.Regex regex4 = new kotlin.text.Regex("\\b\\d{13,19}\\b");
        getHighSpeedVideoSizes = regex4;
        kotlin.text.Regex regex5 = new kotlin.text.Regex("\\d{3}-\\d{2}-\\d{4}");
        getOutputStallDurationlomOqCM = regex5;
        kotlin.text.Regex regex6 = new kotlin.text.Regex("\\b\\d{3}[-\\s]\\d{3}[-\\s]\\d{3}\\b");
        getHighSpeedVideoFpsRanges = regex6;
        kotlin.text.Regex regex7 = new kotlin.text.Regex("[A-Z]{2}\\d{2}[A-Z0-9]{4}\\d{7,19}");
        getOutputMinFrameDuration = regex7;
        kotlin.text.Regex regex8 = new kotlin.text.Regex("\\b[A-Z]{1,2}\\d{6,9}\\b");
        getHighSpeedVideoSizesFor = regex8;
        kotlin.text.Regex regex9 = new kotlin.text.Regex("\\b\\d{2}-\\d{7}\\b");
        toString = regex9;
        kotlin.text.Regex regex10 = new kotlin.text.Regex("BA-[A-Z0-9]{10,}");
        getOutputSizes = regex10;
        kotlin.text.Regex regex11 = new kotlin.text.Regex("CC-[A-Z0-9]{10,}");
        getOutputStallDuration = regex11;
        kotlin.text.Regex regex12 = new kotlin.text.Regex("EB-[A-Z0-9]{10,}");
        getOutputSizeshNQ4ISI = regex12;
        kotlin.text.Regex regex13 = new kotlin.text.Regex("\\b(?=[A-Za-z0-9_-]*[_-])(?=[A-Za-z0-9_-]*\\d{4})[A-Za-z0-9_-]{24,}\\b|[A-Za-z0-9+/]{40,}={0,2}");
        getHighSpeedVideoFpsRangesFor = regex13;
        getOutputFormats = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to("email", regex), kotlin.TuplesKt.to("phone", regex2), kotlin.TuplesKt.to(com.paypal.android.threeds.utils.NetworkUtil.JWT, regex3), kotlin.TuplesKt.to("card", regex4), kotlin.TuplesKt.to("ssn", regex5), kotlin.TuplesKt.to("canada_sin", regex6), kotlin.TuplesKt.to(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban, regex7), kotlin.TuplesKt.to("passport", regex8), kotlin.TuplesKt.to("tax_id", regex9), kotlin.TuplesKt.to("paypal_bank_id", regex10), kotlin.TuplesKt.to("paypal_card_id", regex11), kotlin.TuplesKt.to("paypal_external_bank_id", regex12), kotlin.TuplesKt.to("base64_token", regex13)});
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "accesstoken", "refreshtoken", "sessiontoken", "idtoken", "authcode", "authorizationcode", "oauthcode", "password", "passwd", "pwd", "secret", "credential", "apikey", "apisecret", "apiprivatekey", "apisignature", "pin", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "cvv2", "cid", "pan", "cardnumber", "fullpan", "primaryaccountnumber", "bankaccountnumber", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban, "vban", "giftcardpin", "giftcardidentifier", "ssn", "socialsecuritynumber", "sin", "taxid", "tin", "ein", "passportnumber", "driverslicense", "driverslicensenumber", "nationalid", "nationalidentificationnumber", "militaryid", "governmentid", "privatekey", "cryptokey", "hmacpan", "tpan", "networktokenreference", "devicewalletservicecardid", "externalbankaccesstoken", "credentialtoken"});
        Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"email", "emailaddress", "phone", "phonenumber", "mobile", "mobilenumber", "address", "streetaddress", "homeaddress", "billingaddress", "shippingaddress", "postalcode", "zipcode", "fullname", "legalname", "firstname", "lastname", "surname", "dateofbirth", "dob", "birthdate", "birthday", "deviceid", "androidid", "imei", "macaddress", "idfa", "ipaddress", "geolocation", "latitude", "longitude", "udid", "accountbalance", "creditbalance", "creditrating", "creditscore", "banklast4", "panlast4", "encrcustid", "encryptedcustomerid", "downloadurl"});
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(log.getMessage(), "pii_violation_detected")) {
            this.getHighSpeedVideoFpsRanges.handle(log);
            return;
        }
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(log.getMessage());
        if (highSpeedVideoFpsRangesFor == null) {
            java.util.Iterator<T> it = log.getAttributes().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    highSpeedVideoFpsRangesFor = null;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.String Camera2StreamConfigurationMap2 = com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler.Companion.Camera2StreamConfigurationMap(str);
                if (getHighResolutionOutputSizeshNQ4ISI.contains(Camera2StreamConfigurationMap2)) {
                    highResolutionOutputSizeshNQ4ISI = "class_2_key";
                } else {
                    highResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap.contains(Camera2StreamConfigurationMap2) ? "class_3_key" : getHighResolutionOutputSizeshNQ4ISI(value);
                }
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    highSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
                    break;
                }
            }
        }
        if (highSpeedVideoFpsRangesFor != null) {
            java.lang.Object obj = log.getAttributes().get("logger");
            java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str2 == null) {
                str2 = "unknown";
            }
            this.getHighSpeedVideoFpsRanges.handle(new com.paypal.android.logger.Log("pii_violation_detected", com.paypal.android.logger.LogLevel.WARN, kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("pattern_category", highSpeedVideoFpsRangesFor), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, str2)), new java.util.LinkedHashMap(), null, 16, null));
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.handle(log);
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.Object p0) {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        if (p0 instanceof java.lang.String) {
            return getHighSpeedVideoFpsRangesFor((java.lang.String) p0);
        }
        if (p0 instanceof java.util.Map) {
            for (java.util.Map.Entry entry : ((java.util.Map) p0).entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.String str = key instanceof java.lang.String ? (java.lang.String) key : null;
                if (str == null) {
                    highResolutionOutputSizeshNQ4ISI = null;
                } else {
                    java.lang.String Camera2StreamConfigurationMap2 = com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler.Companion.Camera2StreamConfigurationMap(str);
                    if (getHighResolutionOutputSizeshNQ4ISI.contains(Camera2StreamConfigurationMap2)) {
                        highResolutionOutputSizeshNQ4ISI = "class_2_key";
                    } else {
                        highResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap.contains(Camera2StreamConfigurationMap2) ? "class_3_key" : getHighResolutionOutputSizeshNQ4ISI(value);
                    }
                }
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }
        }
        return null;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        if (p0.length() > 10000) {
            return null;
        }
        java.lang.String highSpeedVideoFpsRangesFor = com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler.Companion.getHighSpeedVideoFpsRangesFor(p0);
        java.util.Iterator<T> it = getOutputFormats.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            java.lang.String str = (java.lang.String) pair.component1();
            kotlin.text.Regex regex = (kotlin.text.Regex) pair.component2();
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "card")) {
                java.util.Iterator it2 = kotlin.text.Regex.findAll$default(getHighSpeedVideoSizes, highSpeedVideoFpsRangesFor, 0, 2, null).iterator();
                while (it2.hasNext()) {
                    if (com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler.Companion.getHighSpeedVideoSizes(((kotlin.text.MatchResult) it2.next()).getValue())) {
                        break;
                    }
                }
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "card") || !regex.containsMatchIn(highSpeedVideoFpsRangesFor)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return null;
    }
}
