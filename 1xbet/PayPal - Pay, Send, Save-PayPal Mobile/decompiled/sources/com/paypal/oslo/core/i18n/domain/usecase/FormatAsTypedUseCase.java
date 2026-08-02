package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0006*\u00020\u00110\u00118CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAsTypedUseCase;", "", "<init>", "()V", "", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;)Larrow/core/Either;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatAsTypedUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.i18n.phonenumbers.AsYouTypeFormatter> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil;
            phoneNumberUtil = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance();
            return phoneNumberUtil;
        }
    });

    @javax.inject.Inject
    public FormatAsTypedUseCase() {
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> invoke(java.lang.String phoneNumber, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest request) {
        com.google.i18n.phonenumbers.AsYouTypeFormatter putIfAbsent;
        java.lang.String str = phoneNumber;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Formatting phone number as typed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", request.m11458getRegionCodeALGuh4w())), null, 4, null);
        if (com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.hasAlphaCharacters(phoneNumber)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "FormatAsTyped - Phone number has alpha characters", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", request.m11458getRegionCodeALGuh4w())), null, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.ALPHA_CHARACTER_ERROR);
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.i18n.phonenumbers.AsYouTypeFormatter> concurrentHashMap = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String m11458getRegionCodeALGuh4w = request.m11458getRegionCodeALGuh4w();
        com.google.i18n.phonenumbers.AsYouTypeFormatter asYouTypeFormatter = concurrentHashMap.get(m11458getRegionCodeALGuh4w);
        if (asYouTypeFormatter == null && (putIfAbsent = concurrentHashMap.putIfAbsent(m11458getRegionCodeALGuh4w, (asYouTypeFormatter = ((com.google.i18n.phonenumbers.PhoneNumberUtil) this.Camera2StreamConfigurationMap.getValue()).getAsYouTypeFormatter(request.m11458getRegionCodeALGuh4w())))) != null) {
            asYouTypeFormatter = putIfAbsent;
        }
        com.google.i18n.phonenumbers.AsYouTypeFormatter asYouTypeFormatter2 = asYouTypeFormatter;
        asYouTypeFormatter2.clear();
        java.lang.String str2 = str;
        java.lang.String str3 = "";
        for (int i = 0; i < str2.length(); i++) {
            str3 = asYouTypeFormatter2.inputDigit(str2.charAt(i));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "FormatAsTyped - Formatted successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", request.m11458getRegionCodeALGuh4w())), null, 4, null);
        java.lang.String str4 = str3;
        if (!kotlin.text.StringsKt.isBlank(str4)) {
            str = str4;
        }
        return arrow.core.EitherKt.right(str);
    }
}
