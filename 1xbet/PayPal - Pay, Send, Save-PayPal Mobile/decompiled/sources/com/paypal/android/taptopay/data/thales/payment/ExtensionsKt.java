package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\b\u0012\u0006*\u00020\t0\t0\b*\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Ljava/util/Date;", "parseTransactionDate", "(Ljava/lang/String;)Ljava/util/Date;", "", "toHexString", "([B)Ljava/lang/String;", "Lcom/gemalto/mfs/mwsdk/payment/engine/TransactionContext;", "", "", "toLogAttributes", "(Lcom/gemalto/mfs/mwsdk/payment/engine/TransactionContext;)Ljava/util/Map;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final java.lang.String toHexString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return kotlin.collections.ArraysKt.joinToString$default(bArr, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Byte, java.lang.CharSequence>() { // from class: com.paypal.android.taptopay.data.thales.payment.ExtensionsKt$toHexString$1
            public final java.lang.CharSequence getHighSpeedVideoSizes(byte b) {
                java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.CharSequence invoke(java.lang.Byte b) {
                return getHighSpeedVideoSizes(b.byteValue());
            }
        }, 30, (java.lang.Object) null);
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> toLogAttributes(com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionContext, "");
        kotlin.Pair pair = kotlin.TuplesKt.to(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, transactionContext.getAid());
        kotlin.Pair pair2 = kotlin.TuplesKt.to("amount", java.lang.Double.valueOf(transactionContext.getAmount()));
        byte[] rawAmount = transactionContext.getRawAmount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawAmount, "");
        kotlin.Pair pair3 = kotlin.TuplesKt.to("rawAmount", toHexString(rawAmount));
        byte[] currencyCode = transactionContext.getCurrencyCode();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currencyCode, "");
        kotlin.Pair pair4 = kotlin.TuplesKt.to("currencyCode", toHexString(currencyCode));
        byte[] trxDate = transactionContext.getTrxDate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trxDate, "");
        return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, kotlin.TuplesKt.to("trxDate", toHexString(trxDate)), kotlin.TuplesKt.to("scheme", transactionContext.getScheme()), kotlin.TuplesKt.to("digitalizedCardStatus", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", transactionContext.getDigitalizedCardStatus().getState()), kotlin.TuplesKt.to("numberOfPaymentsLeft", java.lang.Integer.valueOf(transactionContext.getDigitalizedCardStatus().getNumberOfPaymentsLeft())), kotlin.TuplesKt.to("needsReplenishment", java.lang.Boolean.valueOf(transactionContext.getDigitalizedCardStatus().needsReplenishment())), kotlin.TuplesKt.to(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, transactionContext.getDigitalizedCardStatus().getExpiryDate()))));
    }

    public static final java.util.Date parseTransactionDate(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", java.util.Locale.getDefault()).parse(str);
        } catch (java.text.ParseException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to parse date.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("string", str)), null, e, 4, null);
            return null;
        }
    }
}
