package com.paypal.oslo.feature.userprofile.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "toProfilePhone", "(Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment;)Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/InitiatePartyPhoneConfirmationResultFragment;", "Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;", "toPhoneConfirmationChallenge", "(Lcom/paypal/oslo/feature/userprofile/graphql/fragment/InitiatePartyPhoneConfirmationResultFragment;)Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneResponseMapperKt {
    public static final com.paypal.oslo.core.userstore.model.ProfilePhone toProfilePhone(com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment partyPhoneFragment) {
        java.lang.Object obj;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyPhoneFragment, "");
        com.paypal.oslo.feature.userprofile.graphql.fragment.PhoneNumberFragment phoneNumberFragment = partyPhoneFragment.getPhoneNumber().getPhoneNumberFragment();
        java.lang.String id = partyPhoneFragment.getId();
        com.paypal.oslo.api.graphql.schema.type.PhoneType type = partyPhoneFragment.getType();
        java.util.Iterator<E> it = com.paypal.oslo.core.userstore.model.PhoneType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.PhoneType) obj).name(), type.toString())) {
                break;
            }
        }
        com.paypal.oslo.core.userstore.model.PhoneType phoneType2 = (com.paypal.oslo.core.userstore.model.PhoneType) obj;
        if (phoneType2 == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Unrecognized PhoneType value from GraphQL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", type.toString())), null, 4, null);
            phoneType = com.paypal.oslo.core.userstore.model.PhoneType.NONE;
        } else {
            phoneType = phoneType2;
        }
        com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber phoneNumber = new com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber(phoneNumberFragment.getExtensionNumber(), phoneNumberFragment.getCountryCode(), phoneNumberFragment.getNationalNumber());
        java.lang.String maskedPhoneNumber = partyPhoneFragment.getMaskedPhoneNumber();
        boolean primary = partyPhoneFragment.getPrimary();
        boolean confirmed = partyPhoneFragment.getConfirmed();
        java.lang.Object createdTime = partyPhoneFragment.getCreatedTime();
        java.util.Date date = createdTime instanceof java.util.Date ? (java.util.Date) createdTime : null;
        return new com.paypal.oslo.core.userstore.model.ProfilePhone(id, phoneType, phoneNumber, maskedPhoneNumber, primary, confirmed, date == null ? new java.util.Date() : date);
    }

    public static final com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge toPhoneConfirmationChallenge(com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment initiatePartyPhoneConfirmationResultFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatePartyPhoneConfirmationResultFragment, "");
        return new com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge(initiatePartyPhoneConfirmationResultFragment.getAuthId(), initiatePartyPhoneConfirmationResultFragment.getChallengeId(), initiatePartyPhoneConfirmationResultFragment.getUniqueId().toString());
    }
}
