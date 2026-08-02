package com.paypal.oslo.feature.userprofile.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailFragment;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "toProfileEmail", "(Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailFragment;)Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailConfirmationChallengeFragment;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailConfirmationChallenge;", "toEmailConfirmationChallenge", "(Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailConfirmationChallengeFragment;)Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailConfirmationChallenge;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmailResponseMapperKt {
    public static final com.paypal.oslo.core.userstore.model.ProfileEmail toProfileEmail(com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment emailFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailFragment, "");
        return new com.paypal.oslo.core.userstore.model.ProfileEmail(emailFragment.getId(), emailFragment.getEmailAddress().toString(), emailFragment.getPrimary(), emailFragment.getConfirmed(), com.paypal.oslo.feature.userprofile.data.utils.EmailUtilsKt.parseTimestamp(emailFragment.getCreatedTime()));
    }

    public static final com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge toEmailConfirmationChallenge(com.paypal.oslo.feature.userprofile.graphql.fragment.EmailConfirmationChallengeFragment emailConfirmationChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationChallengeFragment, "");
        return new com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge(emailConfirmationChallengeFragment.getAuthId(), emailConfirmationChallengeFragment.getChallengeId(), emailConfirmationChallengeFragment.getUniqueId().toString());
    }
}
