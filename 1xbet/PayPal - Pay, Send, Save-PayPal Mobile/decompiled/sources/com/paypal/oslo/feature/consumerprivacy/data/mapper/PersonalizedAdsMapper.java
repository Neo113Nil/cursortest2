package com.paypal.oslo.feature.consumerprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedAdsMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedAdsConsentQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedAdsPreference;", "mapQueryToDomain", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedAdsConsentQuery$Data;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedAdsPreference;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "mapError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalizedAdsMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PersonalizedAdsMapper() {
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference mapQueryToDomain(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedAdsConsentQuery.Data data) {
        com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedAdsConsentQuery.PrivacySetting privacySetting;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedAdsConsentQuery.PersonalizationPreferences personalizationPreferences;
        java.lang.Boolean personalizedAds = (data == null || (privacySetting = data.getPrivacySetting()) == null || (personalizationPreferences = privacySetting.getPersonalizationPreferences()) == null) ? null : personalizationPreferences.getPersonalizedAds();
        if (personalizedAds != null) {
            return new com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference(personalizedAds.booleanValue());
        }
        return null;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError mapError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return new com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError(httpError.getCode(), httpError.getMessage(), httpError.getBody(), null, 8, null);
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                return com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE;
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.NoInternet.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
