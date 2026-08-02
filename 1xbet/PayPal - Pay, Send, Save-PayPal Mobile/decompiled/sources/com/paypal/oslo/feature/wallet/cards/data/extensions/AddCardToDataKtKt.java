package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "toGraphQL", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;)Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardError;", "Lcom/paypal/oslo/api/graphql/schema/type/AddCardInput;", "toAddCardInput", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Larrow/core/Either;", "", "convertToFullYear", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/Month;", "convertToMonth", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/Month;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardToDataKtKt {
    private static final java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand, com.paypal.oslo.api.graphql.schema.type.CardBrand> getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.AMEX, com.paypal.oslo.api.graphql.schema.type.CardBrand.AMEX), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.CB_NATIONALE, com.paypal.oslo.api.graphql.schema.type.CardBrand.CB_NATIONALE), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.CETELEM, com.paypal.oslo.api.graphql.schema.type.CardBrand.CETELEM), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.CHINA_UNION_PAY, com.paypal.oslo.api.graphql.schema.type.CardBrand.CHINA_UNION_PAY), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.COFIDIS, com.paypal.oslo.api.graphql.schema.type.CardBrand.COFIDIS), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.COFINOGA, com.paypal.oslo.api.graphql.schema.type.CardBrand.COFINOGA), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.DELTA, com.paypal.oslo.api.graphql.schema.type.CardBrand.DELTA), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.DINERS, com.paypal.oslo.api.graphql.schema.type.CardBrand.DINERS), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.DISCOVER, com.paypal.oslo.api.graphql.schema.type.CardBrand.DISCOVER), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.ELECTRON, com.paypal.oslo.api.graphql.schema.type.CardBrand.ELECTRON), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.ELO, com.paypal.oslo.api.graphql.schema.type.CardBrand.ELO), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.HIPER, com.paypal.oslo.api.graphql.schema.type.CardBrand.HIPER), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.HIPERCARD, com.paypal.oslo.api.graphql.schema.type.CardBrand.HIPERCARD), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.JCB, com.paypal.oslo.api.graphql.schema.type.CardBrand.JCB), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.MAESTRO, com.paypal.oslo.api.graphql.schema.type.CardBrand.MAESTRO), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.MASTERCARD, com.paypal.oslo.api.graphql.schema.type.CardBrand.MASTER_CARD), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.RUPAY, com.paypal.oslo.api.graphql.schema.type.CardBrand.RUPAY), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.SOLO, com.paypal.oslo.api.graphql.schema.type.CardBrand.SOLO), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.STAR, com.paypal.oslo.api.graphql.schema.type.CardBrand.STAR), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.SWITCH, com.paypal.oslo.api.graphql.schema.type.CardBrand.SWITCH), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.VISA, com.paypal.oslo.api.graphql.schema.type.CardBrand.VISA), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.UNKNOWN, com.paypal.oslo.api.graphql.schema.type.CardBrand.UNKNOWN));

    public static /* synthetic */ boolean $r8$lambda$0Zgw1uk1wz2qj08HhjLo9ZOnl9g(boolean z) {
        return z;
    }

    public static /* synthetic */ boolean $r8$lambda$ajd7dxKLg7CJVsad46XySyObQ2g(boolean z) {
        return z;
    }

    public static /* synthetic */ boolean $r8$lambda$vettbCsN_Pen9zy1qA05UjIsmmI(boolean z) {
        return z;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.CardBrand toGraphQL(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
        com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand2 = getHighSpeedVideoFpsRangesFor.get(cardBrand);
        return cardBrand2 == null ? com.paypal.oslo.api.graphql.schema.type.CardBrand.UNKNOWN : cardBrand2;
    }

    public static final java.lang.String convertToFullYear(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return java.time.Year.parse(str, java.time.format.DateTimeFormatter.ofPattern("yy")).toString();
        } catch (java.time.format.DateTimeParseException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Year parsing failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("input", str)), null, e, 4, null);
            return null;
        }
    }

    public static final com.paypal.oslo.api.graphql.schema.type.Month convertToMonth(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str);
        if (intOrNull == null) {
            return com.paypal.oslo.api.graphql.schema.type.Month.UNKNOWN__;
        }
        int intValue = intOrNull.intValue() - 1;
        kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.Month> entries = com.paypal.oslo.api.graphql.schema.type.Month.getEntries();
        return (com.paypal.oslo.api.graphql.schema.type.Month) ((intValue < 0 || intValue >= entries.size()) ? com.paypal.oslo.api.graphql.schema.type.Month.UNKNOWN__ : entries.get(intValue));
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError, com.paypal.oslo.api.graphql.schema.type.AddCardInput> toAddCardInput(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String convertToFullYear = convertToFullYear(creditCard.getExpiryYear());
            if (convertToFullYear == null) {
                defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.YearFormatInvalid.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            java.lang.String number = creditCard.getNumber();
            com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CardExpirationDateInput(convertToMonth(creditCard.getExpiryMonth()), convertToFullYear));
            java.lang.String cvv = creditCard.getCvv();
            com.apollographql.apollo.api.Optional mapOptional = com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.mapOptional(creditCard.getBillingAddress(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.m20972$r8$lambda$uUeNZsQUH6Z9TfPXLMssG50nxI((com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress) obj);
                }
            });
            com.apollographql.apollo.api.Optional.Present present2 = present;
            com.paypal.oslo.api.graphql.schema.type.AddCardInput addCardInput = new com.paypal.oslo.api.graphql.schema.type.AddCardInput(number, null, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.mapOptional(creditCard.getBrand(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.$r8$lambda$kqC76yXRjCp5RPowDQEEyCT5lFU((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand) obj);
                }
            }), present2, cvv, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(creditCard.getAddressId()), mapOptional, null, null, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.mapOptional(creditCard.getCardholderName(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.$r8$lambda$L7lxxBtSF2HB8bZ47WM8JkZQ9GQ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardholderName) obj);
                }
            }), null, null, null, null, null, null, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.mapOptional(creditCard.getInTransaction(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.$r8$lambda$ajd7dxKLg7CJVsad46XySyObQ2g(((java.lang.Boolean) obj).booleanValue()));
                }
            }), com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.mapOptional(creditCard.getDeferredAuthorization(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.$r8$lambda$vettbCsN_Pen9zy1qA05UjIsmmI(((java.lang.Boolean) obj).booleanValue()));
                }
            }), com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.mapOptional(creditCard.getConsentForSharedCard(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.$r8$lambda$0Zgw1uk1wz2qj08HhjLo9ZOnl9g(((java.lang.Boolean) obj).booleanValue()));
                }
            }), 64898, null);
            defaultRaise.complete();
            return new arrow.core.Either.Right(addCardInput);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PersonNameInput $r8$lambda$L7lxxBtSF2HB8bZ47WM8JkZQ9GQ(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardholderName cardholderName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardholderName, "");
        return new com.paypal.oslo.api.graphql.schema.type.PersonNameInput(null, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(cardholderName.getFirstName()), com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(cardholderName.getLastName()), null, null, null, null, 121, null);
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CardBrand $r8$lambda$kqC76yXRjCp5RPowDQEEyCT5lFU(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
        return toGraphQL(cardBrand);
    }

    /* renamed from: $r8$lambda$u-UeNZsQUH6Z9TfPXLMssG50nxI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddressInput m20972$r8$lambda$uUeNZsQUH6Z9TfPXLMssG50nxI(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        return com.paypal.oslo.feature.wallet.cards.data.extensions.UpdateCardToDataKtKt.toAddressInput(billingAddress);
    }
}
