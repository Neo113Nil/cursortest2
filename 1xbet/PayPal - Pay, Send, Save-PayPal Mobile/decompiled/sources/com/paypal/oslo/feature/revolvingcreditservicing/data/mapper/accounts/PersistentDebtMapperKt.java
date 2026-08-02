package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment$PersistentDebt;", "", "persistentDebtUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "supportPhoneNumber", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PersistentDebt;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment$PersistentDebt;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PersistentDebt;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PersistentDebtMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.PersistentDebt persistentDebt, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentDebt, "");
        java.lang.Integer stage = persistentDebt.getStage();
        java.lang.Object stagePeriod = persistentDebt.getStagePeriod();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt(stage, stagePeriod != null ? stagePeriod.toString() : null, str, phoneNumber);
    }
}
