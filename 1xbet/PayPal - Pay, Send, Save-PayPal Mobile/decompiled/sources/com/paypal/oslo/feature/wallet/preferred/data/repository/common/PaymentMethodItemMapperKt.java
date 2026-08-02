package com.paypal.oslo.feature.wallet.preferred.data.repository.common;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u001a\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ae\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"", "id", "currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "createBalance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "lastNChars", "nickname", "typeRawValue", "issuerName", "", "Lkotlin/Pair;", "institutionImages", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Bank;", "createBankPaymentMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Bank;", "brandRawValue", "nickName", "productClassRawValue", "expirationDate", "issuerProductDescription", "cardArtBaseCdnLinkPath", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Card;", "createCardPaymentMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Card;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentMethodItemMapperKt {
    public static final com.paypal.oslo.feature.wallet.common.model.Balance createBalance(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return new com.paypal.oslo.feature.wallet.common.model.Balance(str, str2, str3);
    }

    public static final com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank createBankPaymentMethod(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        return new com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank(new com.paypal.oslo.feature.wallet.common.model.BankAccountInfo(str, str2, str3, str4, str5, com.paypal.oslo.feature.wallet.common.extensions.ImageUrlExtensionsKt.extractThumbnailUrl(list)));
    }

    public static final com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card createCardPaymentMethod(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return new com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card(new com.paypal.oslo.feature.wallet.common.model.CardInfo(str, str2, str3, str4, str5, str6, str7, str8, com.paypal.oslo.feature.wallet.common.extensions.ImageUrlExtensionsKt.buildCardArtUrl(str9, null)));
    }
}
