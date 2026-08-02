package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardRequest;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateCardInput;", "toGraphQL", "(Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardRequest;)Larrow/core/Either;", "Lcom/paypal/oslo/api/graphql/schema/type/CardExpirationDateInput;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "toAddressInput", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;)Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateCardToDataKtKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AddressInput toAddressInput(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        return new com.paypal.oslo.api.graphql.schema.type.AddressInput(com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(billingAddress.getAddressLine1()), com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(billingAddress.getAddressLine2()), null, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(billingAddress.getState()), com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(billingAddress.getCity()), null, null, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(billingAddress.getPostalCode()), billingAddress.getCountryCode(), 100, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, com.paypal.oslo.api.graphql.schema.type.UpdateCardInput> toGraphQL(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardRequest, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            com.paypal.oslo.api.graphql.schema.type.UpdateCardInput updateCardInput = new com.paypal.oslo.api.graphql.schema.type.UpdateCardInput(updateCardRequest.getCardId(), com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.toOptional(defaultRaise.bind(getHighSpeedVideoFpsRangesFor(updateCardRequest))), com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.toOptional(updateCardRequest.getCardVerificationValue()), null, com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.mapOptional(updateCardRequest.getBillingAddress(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.data.extensions.UpdateCardToDataKtKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.data.extensions.UpdateCardToDataKtKt.$r8$lambda$36BIXs7zDk17ZPFzWoaae238ZaU((com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress) obj);
                }
            }), updateCardRequest.getClearNickName() ? com.apollographql.apollo.api.Optional.INSTANCE.present(null) : com.paypal.oslo.feature.wallet.common.extensions.OptionalKtKt.optionalIfNotNullOrBlank(updateCardRequest.getNickName()), 8, null);
            defaultRaise.complete();
            return new arrow.core.Either.Right(updateCardInput);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, com.paypal.oslo.api.graphql.schema.type.CardExpirationDateInput> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest) {
        java.lang.String expirationMonth;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String expirationYear = updateCardRequest.getExpirationYear();
            if (expirationYear != null && (expirationMonth = updateCardRequest.getExpirationMonth()) != null) {
                java.lang.String convertToFullYear = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.convertToFullYear(expirationYear);
                if (convertToFullYear != null) {
                    com.paypal.oslo.api.graphql.schema.type.Month convertToMonth = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDataKtKt.convertToMonth(expirationMonth);
                    if ((convertToMonth != com.paypal.oslo.api.graphql.schema.type.Month.UNKNOWN__ ? convertToMonth : null) != null) {
                        r3 = new com.paypal.oslo.api.graphql.schema.type.CardExpirationDateInput(convertToMonth, convertToFullYear);
                    } else {
                        defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError.MonthFormatInvalid.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                } else {
                    defaultRaise2.raise(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError.YearFormatInvalid.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(r3);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddressInput $r8$lambda$36BIXs7zDk17ZPFzWoaae238ZaU(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        return toAddressInput(billingAddress);
    }
}
