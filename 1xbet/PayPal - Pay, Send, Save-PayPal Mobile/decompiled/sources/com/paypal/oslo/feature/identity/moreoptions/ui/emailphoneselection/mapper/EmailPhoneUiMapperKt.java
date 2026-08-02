package com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.mapper;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0010\u001a'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\b\u001a'\u0010\n\u001a\u00020\t*\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0004\b\n\u0010\u0016\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\b\u0012\u0004\u0012\u00020\u00120\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0004\b\f\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/PhoneNumber;", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/PhoneNumber;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "", "toUiModels", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;", "toSelectionOption", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/PhoneNumber;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;", "toSelectionOptions", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "toEmailUiModels", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;", "toEmailSelectionOptions", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "Lkotlin/Function1;", "", "cardDisplayFormatter", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailPhoneUiMapperKt {
    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel toUiModel(com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        return new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel(phoneNumber.getId(), phoneNumber.getMaskedNumber(), phoneNumber.isSelected(), !phoneNumber.isVerified() ? stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_number_selection_error_security) : null);
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> toUiModels(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) it.next(), stringProvider));
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption toSelectionOption(com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        return new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption(phoneNumber.getId(), phoneNumber.getMaskedNumber(), phoneNumber.isSelected(), !phoneNumber.isVerified() ? stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_number_selection_error_security) : null);
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> toSelectionOptions(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toSelectionOption((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) it.next(), stringProvider));
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel toUiModel(com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        return new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel(emailAddress.getId(), emailAddress.getMaskedEmail(), emailAddress.isSelected(), !emailAddress.isVerified() ? stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_email_selection_error_security) : null);
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> toEmailUiModels(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> list, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) it.next(), stringProvider));
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption toSelectionOption(com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        return new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption(emailAddress.getId(), emailAddress.getMaskedEmail(), emailAddress.isSelected(), !emailAddress.isVerified() ? stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_email_selection_error_security) : null);
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> toEmailSelectionOptions(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> list, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toSelectionOption((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) it.next(), stringProvider));
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption toSelectionOption(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard, java.lang.String> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption(creditCard.getId(), function1.invoke(creditCard), creditCard.isSelected(), null);
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> toSelectionOptions(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard> list, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard, java.lang.String> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toSelectionOption((com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard) it.next(), function1));
        }
        return arrayList;
    }
}
