package com.paypal.oslo.feature.notificationcenter.data.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/data/impl/DeeplinkValidatorImpl;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator;", "<init>", "()V", "", "deeplinkUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationError;", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator$ValidationResult;", "validate", "(Ljava/lang/String;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeeplinkValidatorImpl implements com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.notificationcenter.data.impl.DeeplinkValidatorImpl.Companion Companion = new com.paypal.oslo.feature.notificationcenter.data.impl.DeeplinkValidatorImpl.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String SCHEME_HTTP = "http";

    @java.lang.Deprecated
    public static final java.lang.String SCHEME_HTTPS = "https";

    @java.lang.Deprecated
    public static final java.lang.String SCHEME_PAYPAL = "paypal";

    @java.lang.Deprecated
    public static final java.lang.String SCHEME_PAYPAL_INTERNAL = "paypal-internal";

    @javax.inject.Inject
    public DeeplinkValidatorImpl() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/data/impl/DeeplinkValidatorImpl$Companion;", "", "<init>", "()V", "", "SCHEME_HTTP", "Ljava/lang/String;", "SCHEME_HTTPS", "SCHEME_PAYPAL", "SCHEME_PAYPAL_INTERNAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator
    public final arrow.core.Either<com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError, com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult> validate(java.lang.String deeplinkUrl) {
        java.lang.String host;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkUrl, "");
        boolean z = false;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            try {
                android.net.Uri parse = android.net.Uri.parse(deeplinkUrl);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "http") && !kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "https")) {
                    z = true;
                }
                if (z && !kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "paypal") && !kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), SCHEME_PAYPAL_INTERNAL)) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme(deeplinkUrl, parse.getScheme()));
                    throw new kotlin.KotlinNothingValueException();
                }
                android.net.Uri.Builder builder = new android.net.Uri.Builder();
                if (z && (host = parse.getHost()) != null && host.length() != 0) {
                    java.lang.String host2 = parse.getHost();
                    java.lang.String encodedPath = parse.getEncodedPath();
                    if (encodedPath == null) {
                        encodedPath = "";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    sb.append(host2);
                    sb.append(encodedPath);
                    builder.encodedPath(sb.toString());
                    builder.encodedQuery(parse.getEncodedQuery());
                    builder.encodedFragment(parse.getEncodedFragment());
                    java.lang.String obj = builder.build().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                    com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult validationResult = new com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult(parse, obj, z);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(validationResult);
                }
                builder.encodedPath(parse.getEncodedPath());
                builder.encodedQuery(parse.getEncodedQuery());
                builder.encodedFragment(parse.getEncodedFragment());
                java.lang.String obj2 = builder.build().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult validationResult2 = new com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult(parse, obj2, z);
                defaultRaise.complete();
                return new arrow.core.Either.Right(validationResult2);
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.String message = e.getMessage();
                defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl(deeplinkUrl, message != null ? message : ""));
                throw new kotlin.KotlinNothingValueException();
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
