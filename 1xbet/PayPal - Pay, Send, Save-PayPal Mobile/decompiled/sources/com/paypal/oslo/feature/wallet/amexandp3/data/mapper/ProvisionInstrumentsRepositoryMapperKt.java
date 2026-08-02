package com.paypal.oslo.feature.wallet.amexandp3.data.mapper;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a[\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a?\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankAccountType;", "type", "issuerName", "url", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "width", "height", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "mapBanksToDomain", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "productClass", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;", "mapCardsToDomain", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;", "issuerDisplayName", "productDisplayName", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "mapPaymentTokenToDomain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProvisionInstrumentsRepositoryMapperKt {
    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo mapBanksToDomain(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType domain = com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfoKt.toDomain(bankAccountType);
        java.lang.String str6 = str3 == null ? "" : str3;
        if (str4 == null) {
            str4 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo(str, str2, domain, str6, new com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt(str4, num, num2, str5));
    }

    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo mapCardsToDomain(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo(str, str2, com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClassKt.toDomain(cardProductClass), str3 == null ? "" : str3, null, new com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt(str4 == null ? "" : str4, num, num2, str5 != null ? str5 : ""), 16, null);
    }

    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo mapPaymentTokenToDomain(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo(str, null, str2 == null ? "" : str2, str3 == null ? "" : str3, null, null, new com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt(str4 == null ? "" : str4, null, null, str5 == null ? "" : str5, 6, null), null, null, 434, null);
    }
}
