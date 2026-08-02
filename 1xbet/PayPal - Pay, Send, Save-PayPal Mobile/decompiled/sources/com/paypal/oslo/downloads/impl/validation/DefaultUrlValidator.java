package com.paypal.oslo.downloads.impl.validation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/DefaultUrlValidator;", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "<init>", "()V", "", "url", "Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "validate", "(Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "p0", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultUrlValidator implements com.paypal.oslo.downloads.api.validation.UrlValidator {

    @java.lang.Deprecated
    public static final int IPV4_OCTET_COUNT = 4;
    private static final com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator.Companion Companion = new com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator.Companion(null);
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"https", "http"});
    private static final kotlin.ranges.IntRange Camera2StreamConfigurationMap = new kotlin.ranges.IntRange(16, 31);

    @javax.inject.Inject
    public DefaultUrlValidator() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        if (r3.contains(r6.intValue()) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015c, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r0, "fe80:", false, 2, (java.lang.Object) null) == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.paypal.oslo.downloads.api.validation.ValidationResult getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel;
        com.paypal.oslo.downloads.api.validation.ValidationResult validationResult;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator defaultUrlValidator = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new java.net.URI(p0).toURL());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.paypal.oslo.downloads.api.validation.ValidationResult validationResult2 = null;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        java.net.URL url = (java.net.URL) m23436constructorimpl;
        if (url != null) {
            java.lang.String protocol = url.getProtocol();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(protocol, "");
            java.lang.String lowerCase = protocol.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "https")) {
                securityLevel = com.paypal.oslo.downloads.api.validation.SecurityLevel.SECURE;
            } else {
                securityLevel = kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "http") ? com.paypal.oslo.downloads.api.validation.SecurityLevel.INSECURE : com.paypal.oslo.downloads.api.validation.SecurityLevel.UNKNOWN;
            }
            com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel2 = securityLevel;
            java.util.Set<java.lang.String> set = getHighSpeedVideoSizes;
            if (set.contains(lowerCase)) {
                validationResult = null;
            } else {
                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(set, null, null, null, 0, null, null, 63, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported protocol: ");
                sb.append(lowerCase);
                sb.append(". Only ");
                sb.append(joinToString$default);
                sb.append(" are allowed.");
                validationResult = new com.paypal.oslo.downloads.api.validation.ValidationResult(false, sb.toString(), com.paypal.oslo.downloads.api.validation.SecurityLevel.UNKNOWN);
            }
            if (validationResult == null) {
                java.lang.String host = url.getHost();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "");
                java.lang.String lowerCase2 = host.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, com.datadog.trace.api.ConfigDefaults.DEFAULT_AGENT_HOST) && !kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, "127.0.0.1") && !kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, "::1") && !kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, "[::1]") && !kotlin.text.StringsKt.startsWith$default(lowerCase2, "192.168.", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(lowerCase2, "10.", false, 2, (java.lang.Object) null)) {
                    java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) lowerCase2, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
                    java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1);
                    java.lang.Integer intOrNull = str != null ? kotlin.text.StringsKt.toIntOrNull(str) : null;
                    if (split$default.size() == 4 && kotlin.jvm.internal.Intrinsics.areEqual(split$default.get(0), "172")) {
                        kotlin.ranges.IntRange intRange = Camera2StreamConfigurationMap;
                        if (intOrNull != null) {
                        }
                    }
                    if (!kotlin.text.StringsKt.startsWith$default(lowerCase2, "169.254.", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.endsWith$default(lowerCase2, ".local", false, 2, (java.lang.Object) null)) {
                        java.lang.String lowerCase3 = kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.removePrefix(lowerCase2, (java.lang.CharSequence) "["), (java.lang.CharSequence) "]").toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                        if (!kotlin.text.StringsKt.startsWith$default(lowerCase3, "fc", false, 2, (java.lang.Object) null)) {
                            if (!kotlin.text.StringsKt.startsWith$default(lowerCase3, "fd", false, 2, (java.lang.Object) null)) {
                            }
                        }
                    }
                }
                validationResult2 = new com.paypal.oslo.downloads.api.validation.ValidationResult(false, "Downloads from internal hosts are not allowed", securityLevel2);
                validationResult = validationResult2 == null ? new com.paypal.oslo.downloads.api.validation.ValidationResult(true, null, securityLevel2, 2, null) : validationResult2;
            }
            if (validationResult != null) {
                return validationResult;
            }
        }
        return new com.paypal.oslo.downloads.api.validation.ValidationResult(false, "Invalid URL format", com.paypal.oslo.downloads.api.validation.SecurityLevel.UNKNOWN);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0006\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/DefaultUrlValidator$Companion;", "", "<init>", "()V", "", "", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "Lkotlin/ranges/IntRange;", "", "IPV4_OCTET_COUNT", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.downloads.api.validation.UrlValidator
    public final com.paypal.oslo.downloads.api.validation.ValidationResult validate(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.paypal.oslo.downloads.api.validation.ValidationResult validationResult = kotlin.text.StringsKt.isBlank(url) ? new com.paypal.oslo.downloads.api.validation.ValidationResult(false, "URL cannot be blank", com.paypal.oslo.downloads.api.validation.SecurityLevel.UNKNOWN) : null;
        return validationResult == null ? getHighSpeedVideoFpsRangesFor(url) : validationResult;
    }
}
