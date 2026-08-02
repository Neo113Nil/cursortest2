package com.paypal.oslo.feature.consumerprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedShoppingMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShopping;", "mapQueryToDomain", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$Data;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShopping;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$Data;", "", "enabled", "mapMutationToDomain", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$Data;Z)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShopping;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;", "mapError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;", "createUpdateFailedError", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalizedShoppingMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PersonalizedShoppingMapper() {
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping mapQueryToDomain(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data data) {
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping = (data == null || (privacySetting = data.getPrivacySetting()) == null) ? null : privacySetting.getPersonalizedShopping();
        boolean consent = personalizedShopping != null ? personalizedShopping.getConsent() : false;
        java.lang.String subjectState = personalizedShopping != null ? personalizedShopping.getSubjectState() : null;
        com.paypal.oslo.api.graphql.schema.type.ConsentType consentType2 = personalizedShopping != null ? personalizedShopping.getConsentType() : null;
        int i = consentType2 == null ? -1 : com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedShoppingMapper.WhenMappings.$EnumSwitchMapping$0[consentType2.ordinal()];
        if (i == 1) {
            consentType = com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.FULL;
        } else if (i == 2) {
            consentType = com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.PARTIAL;
        } else {
            consentType = com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.DENY;
        }
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping(consent, subjectState, consentType, personalizedShopping != null ? personalizedShopping.getDataUsageDate() : null);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping mapMutationToDomain(com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data data, boolean enabled) {
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.UpdatePersonalizedShoppingConsent updatePersonalizedShoppingConsent;
        if (data == null || (updatePersonalizedShoppingConsent = data.getUpdatePersonalizedShoppingConsent()) == null || !updatePersonalizedShoppingConsent.getSuccess()) {
            return null;
        }
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping(enabled, (java.lang.String) null, (com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType) null, (java.lang.String) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError mapError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError("NETWORK_ERROR", "Network error occurred: ".concat(java.lang.String.valueOf(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError())), true, null, 8, null);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError("GRAPHQL_ERROR", "GraphQL error: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), null, null, null, 0, null, null, 63, null))), false, null, 8, null);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError createUpdateFailedError() {
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError("UPDATE_FAILED", "Failed to update personalized shopping preference", true, null, 8, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ConsentType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsentType.FULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsentType.PARTIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
