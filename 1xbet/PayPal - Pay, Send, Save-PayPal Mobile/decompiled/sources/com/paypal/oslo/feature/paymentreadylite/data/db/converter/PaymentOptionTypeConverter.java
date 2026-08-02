package com.paypal.oslo.feature.paymentreadylite.data.db.converter;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/converter/PaymentOptionTypeConverter;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentOptionDto;", "paymentOptions", "", "fromPaymentOptionList", "(Ljava/util/List;)Ljava/lang/String;", "jsonString", "toPaymentOptionList", "(Ljava/lang/String;)Ljava/util/List;", "p0", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentOptionTypeConverter {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.paymentreadylite.data.db.converter.PaymentOptionTypeConverter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.paymentreadylite.data.db.converter.PaymentOptionTypeConverter.$r8$lambda$zK_YsClWrTOe6UTVC4t7poUrtTk((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    public final java.lang.String fromPaymentOptionList(java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> paymentOptions) {
        if (paymentOptions != null) {
            return this.getHighSpeedVideoFpsRanges.encodeToString(kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto.INSTANCE.serializer()), paymentOptions);
        }
        return null;
    }

    public final java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> toPaymentOptionList(java.lang.String jsonString) {
        java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> highSpeedVideoFpsRangesFor = jsonString != null ? getHighSpeedVideoFpsRangesFor(jsonString) : null;
        return highSpeedVideoFpsRangesFor == null ? kotlin.collections.CollectionsKt.emptyList() : highSpeedVideoFpsRangesFor;
    }

    private final java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.paymentreadylite.data.db.converter.PaymentOptionTypeConverter paymentOptionTypeConverter = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((java.util.List) this.getHighSpeedVideoFpsRanges.decodeFromString(kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto.INSTANCE.serializer()), p0));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.paymentreadylite.LoggerKt.log, "Failed to deserialize payment options from JSON", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("converterMethod", "toPaymentOptionList"), kotlin.TuplesKt.to("jsonLength", java.lang.Integer.valueOf(p0.length()))), null, m23439exceptionOrNullimpl, 4, null);
            m23436constructorimpl = kotlin.collections.CollectionsKt.emptyList();
        }
        return (java.util.List) m23436constructorimpl;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zK_YsClWrTOe6UTVC4t7poUrtTk(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setEncodeDefaults(true);
        return kotlin.Unit.INSTANCE;
    }
}
