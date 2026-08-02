package com.paypal.oslo.core.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/usecase/ValidateURLUseCase;", "", "Lcom/paypal/oslo/core/webview/domain/provider/TrustedHostsProvider;", "trustedHostsProvider", "<init>", "(Lcom/paypal/oslo/core/webview/domain/provider/TrustedHostsProvider;)V", "", "url", "Larrow/core/Either;", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "", "invoke", "(Ljava/lang/String;)Larrow/core/Either;", "p0", "Ljava/net/URI;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/net/URI;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/webview/domain/provider/TrustedHostsProvider;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidateURLUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ValidateURLUseCase(com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider trustedHostsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustedHostsProvider, "");
        this.getHighSpeedVideoFpsRangesFor = trustedHostsProvider;
    }

    private static java.net.URI Camera2StreamConfigurationMap(java.lang.String p0) {
        try {
            return new java.net.URI(p0);
        } catch (java.net.URISyntaxException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2 A[Catch: all -> 0x0200, RaiseCancellationException -> 0x0202, TryCatch #4 {RaiseCancellationException -> 0x0202, all -> 0x0200, blocks: (B:42:0x011e, B:44:0x012e, B:46:0x0138, B:48:0x0181, B:51:0x018f, B:53:0x01a2, B:56:0x01af, B:57:0x01b7, B:59:0x0141, B:60:0x0145, B:62:0x014b, B:64:0x0158, B:67:0x0164, B:70:0x016c, B:84:0x01b8, B:85:0x01c2, B:91:0x01c3, B:92:0x01cd, B:94:0x01ce, B:95:0x01d8, B:97:0x01d9, B:98:0x01e3, B:104:0x01e4, B:105:0x01ff), top: B:5:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01af A[Catch: all -> 0x0200, RaiseCancellationException -> 0x0202, TryCatch #4 {RaiseCancellationException -> 0x0202, all -> 0x0200, blocks: (B:42:0x011e, B:44:0x012e, B:46:0x0138, B:48:0x0181, B:51:0x018f, B:53:0x01a2, B:56:0x01af, B:57:0x01b7, B:59:0x0141, B:60:0x0145, B:62:0x014b, B:64:0x0158, B:67:0x0164, B:70:0x016c, B:84:0x01b8, B:85:0x01c2, B:91:0x01c3, B:92:0x01cd, B:94:0x01ce, B:95:0x01d8, B:97:0x01d9, B:98:0x01e3, B:104:0x01e4, B:105:0x01ff), top: B:5:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.webview.domain.models.ValidateURLError, kotlin.Unit> invoke(java.lang.String url) {
        java.lang.String str;
        com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError;
        java.lang.String str2;
        com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError2;
        java.lang.String str3;
        com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError3;
        int length;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String obj = kotlin.text.StringsKt.trim(url).toString();
            java.net.URI Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(obj);
            try {
                if (Camera2StreamConfigurationMap == null) {
                    defaultRaise2.raise(new com.paypal.oslo.core.webview.domain.models.ValidateURLError(com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode.MALFORMED_URL, "Malformed URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url))));
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String scheme = Camera2StreamConfigurationMap.getScheme();
                if (scheme != null) {
                    java.util.Locale locale = java.util.Locale.ROOT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    str = scheme.toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                } else {
                    str = null;
                }
                java.lang.String str4 = "missing";
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, "https")) {
                    validateURLError = null;
                } else {
                    com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode = com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode.NON_HTTPS_SCHEME;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("url", obj);
                    if (str == null) {
                        str = "missing";
                    }
                    pairArr[1] = kotlin.TuplesKt.to("scheme", str);
                    validateURLError = new com.paypal.oslo.core.webview.domain.models.ValidateURLError(validateURLErrorCode, "Only HTTPS scheme is allowed", kotlin.collections.MapsKt.mapOf(pairArr));
                }
                if (validateURLError != null) {
                    defaultRaise2.raise(validateURLError);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String userInfo = Camera2StreamConfigurationMap.getUserInfo();
                com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError4 = (userInfo == null || userInfo.length() == 0) ? null : new com.paypal.oslo.core.webview.domain.models.ValidateURLError(com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode.EMBEDDED_CREDENTIALS, "Credentials not permitted in URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", obj)));
                if (validateURLError4 != null) {
                    defaultRaise2.raise(validateURLError4);
                    throw new kotlin.KotlinNothingValueException();
                }
                int port = Camera2StreamConfigurationMap.getPort();
                com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError5 = port == -1 ? null : new com.paypal.oslo.core.webview.domain.models.ValidateURLError(com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode.EXPLICIT_PORT, "Explicit port not permitted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", obj), kotlin.TuplesKt.to("port", java.lang.String.valueOf(port))));
                if (validateURLError5 != null) {
                    defaultRaise2.raise(validateURLError5);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String host = Camera2StreamConfigurationMap.getHost();
                if (host != null) {
                    java.util.Locale locale2 = java.util.Locale.ROOT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                    str2 = host.toLowerCase(locale2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                } else {
                    str2 = null;
                }
                java.lang.String str5 = str2;
                if (str5 == null || kotlin.text.StringsKt.isBlank(str5) || kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str5, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 2, (java.lang.Object) null)) {
                    com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode2 = com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode.MALFORMED_HOST;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    pairArr2[0] = kotlin.TuplesKt.to("url", obj);
                    if (str2 == null) {
                        str2 = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
                    }
                    pairArr2[1] = kotlin.TuplesKt.to(com.datadog.android.log.LogAttributes.HOST, str2);
                    validateURLError2 = new com.paypal.oslo.core.webview.domain.models.ValidateURLError(validateURLErrorCode2, "Invalid or missing host or host ends with a trailing dot", kotlin.collections.MapsKt.mapOf(pairArr2));
                } else {
                    validateURLError2 = null;
                }
                if (validateURLError2 != null) {
                    defaultRaise2.raise(validateURLError2);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String host2 = Camera2StreamConfigurationMap.getHost();
                if (host2 != null) {
                    java.util.Locale locale3 = java.util.Locale.ROOT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
                    str3 = host2.toLowerCase(locale3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    com.paypal.oslo.core.webview.domain.models.TrustedHosts trustedHosts = this.getHighSpeedVideoFpsRangesFor.getTrustedHosts();
                    if (!trustedHosts.getExactHosts().contains(str3)) {
                        java.util.List<java.lang.String> domains = trustedHosts.getDomains();
                        if (!(domains instanceof java.util.Collection) || !domains.isEmpty()) {
                            for (java.lang.String str6 : domains) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(str3, str6) && ((length = str3.length() - str6.length()) <= 0 || str3.charAt(length - 1) != '.' || !kotlin.text.StringsKt.regionMatches(str3, length, str6, 0, str6.length(), false))) {
                                }
                            }
                        }
                    }
                    validateURLError3 = null;
                    if (validateURLError3 == null) {
                        defaultRaise2.raise(validateURLError3);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(unit);
                }
                com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode3 = com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode.HOST_NOT_ALLOWED;
                kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                pairArr3[0] = kotlin.TuplesKt.to("url", obj);
                if (str3 != null) {
                    str4 = str3;
                }
                pairArr3[1] = kotlin.TuplesKt.to(com.datadog.android.log.LogAttributes.HOST, str4);
                validateURLError3 = new com.paypal.oslo.core.webview.domain.models.ValidateURLError(validateURLErrorCode3, "Host not allowed by policy", kotlin.collections.MapsKt.mapOf(pairArr3));
                if (validateURLError3 == null) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
