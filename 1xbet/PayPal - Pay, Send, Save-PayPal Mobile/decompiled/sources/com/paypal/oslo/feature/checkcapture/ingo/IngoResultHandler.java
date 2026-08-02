package com.paypal.oslo.feature.checkcapture.ingo;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;", "", "<init>", "()V", "", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ingo/sdk/kotlin/common/model/result/IngoSdkResult;", "handleResult", "(ILandroid/content/Intent;)Lcom/ingo/sdk/kotlin/common/model/result/IngoSdkResult;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IngoResultHandler {
    public static final int $stable = 0;
    public static final java.lang.String KEY_INGO_RESULT = "KEY_INGO_RESULT";

    @javax.inject.Inject
    public IngoResultHandler() {
    }

    public final com.ingo.sdk.kotlin.common.model.result.IngoSdkResult handleResult(int resultCode, android.content.Intent data) {
        if (resultCode != -1) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.checkcapture.LoggerKt.log, "INGO SDK returned non-OK result code: ".concat(java.lang.String.valueOf(resultCode)), null, null, 6, null);
            return null;
        }
        java.lang.String stringExtra = data != null ? data.getStringExtra(KEY_INGO_RESULT) : null;
        if (stringExtra == null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.checkcapture.LoggerKt.log, "INGO SDK result data is null", null, null, 6, null);
            return null;
        }
        try {
            com.ingo.sdk.kotlin.common.model.result.IngoSdkResult deserialize = com.ingo.sdk.kotlin.common.IngoSdkResultDeserializer.INSTANCE.deserialize(stringExtra);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.checkcapture.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = kotlin.TuplesKt.to("exitCode", deserialize.getExitCode());
            pairArr[1] = kotlin.TuplesKt.to("customerId", deserialize.getCustomerIdentifier());
            java.lang.String transactionReferenceNumber = deserialize.getTransactionReferenceNumber();
            if (transactionReferenceNumber == null) {
                transactionReferenceNumber = "none";
            }
            pairArr[2] = kotlin.TuplesKt.to("transactionRef", transactionReferenceNumber);
            pairArr[3] = kotlin.TuplesKt.to("lastModule", deserialize.getLastModule());
            com.paypal.android.logger.Logger.d$default(logger, "INGO SDK result received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return deserialize;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.checkcapture.LoggerKt.log.e("Failed to deserialize INGO result", e);
            return null;
        }
    }
}
