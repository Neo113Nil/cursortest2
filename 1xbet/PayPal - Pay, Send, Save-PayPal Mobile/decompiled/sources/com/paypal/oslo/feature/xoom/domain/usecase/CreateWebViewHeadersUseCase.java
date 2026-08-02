package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;", "", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/feature/xoom/domain/usecase/TransferToWebUseCase;", "transferToWebUseCase", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/feature/xoom/domain/usecase/TransferToWebUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/xoom/domain/usecase/TransferToWebUseCase;", "getHighSpeedVideoFpsRanges", "Companion", "Headers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CreateWebViewHeadersUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase.Companion Companion = new com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase.Companion(null);
    public static final int $stable = 8;
    private static final java.util.TimeZone getHighSpeedVideoFpsRanges = java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC);

    @javax.inject.Inject
    public CreateWebViewHeadersUseCase(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase transferToWebUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferToWebUseCase, "");
        this.Camera2StreamConfigurationMap = localeInformation;
        this.getHighSpeedVideoFpsRanges = transferToWebUseCase;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase$Headers;", "", "<init>", "()V", "", "ACCEPT_LANGUAGE", "Ljava/lang/String;", "AUTHORIZATION", "COBRAND", "REQUEST_TIMESTAMP", "TIMEZONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Headers {
        public static final int $stable = 0;
        public static final java.lang.String ACCEPT_LANGUAGE = "Accept-Language";
        public static final java.lang.String AUTHORIZATION = "Authorization";
        public static final java.lang.String COBRAND = "x-xoom-cobrand";
        public static final com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase.Headers INSTANCE = new com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase.Headers();
        public static final java.lang.String REQUEST_TIMESTAMP = "x-xoom-request-timestamp";
        public static final java.lang.String TIMEZONE = "x-xoom-timezone";

        private Headers() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0006*\u00020\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase$Companion;", "", "<init>", "()V", "Ljava/util/TimeZone;", "getHighSpeedVideoFpsRanges", "Ljava/util/TimeZone;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, ? extends java.util.Map<java.lang.String, java.lang.String>>> continuation) {
        com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase$invoke$1 createWebViewHeadersUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase$invoke$1) {
            createWebViewHeadersUseCase$invoke$1 = (com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase$invoke$1) continuation;
            if ((createWebViewHeadersUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                createWebViewHeadersUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = createWebViewHeadersUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createWebViewHeadersUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase transferToWebUseCase = this.getHighSpeedVideoFpsRanges;
                    createWebViewHeadersUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = transferToWebUseCase.invoke(createWebViewHeadersUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.String authorizationCode = ((com.paypal.oslo.core.identity.domain.model.WebSessionTransferData) ((arrow.core.Either.Right) either).getValue()).getAuthorizationCode();
                    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_UTC_FORMAT_UTC_Z, java.util.Locale.US);
                    simpleDateFormat.setTimeZone(getHighSpeedVideoFpsRanges);
                    return new arrow.core.Either.Right(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Accept-Language", this.Camera2StreamConfigurationMap.getUserLocale().toLanguageTag()), kotlin.TuplesKt.to("Authorization", "Code ".concat(java.lang.String.valueOf(authorizationCode))), kotlin.TuplesKt.to(com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase.Headers.COBRAND, "paypal"), kotlin.TuplesKt.to(com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase.Headers.REQUEST_TIMESTAMP, simpleDateFormat.format(new java.util.Date())), kotlin.TuplesKt.to(com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase.Headers.TIMEZONE, this.Camera2StreamConfigurationMap.getTimezone().getID())));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        createWebViewHeadersUseCase$invoke$1 = new com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = createWebViewHeadersUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createWebViewHeadersUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
