package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/helper/ContactSelectionHelper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/PhoneNumber;", "extractPhoneNumbers", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/EmailAddress;", "extractEmailAddresses", "phoneNumbers", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "updatePhoneNumberSelection", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "emails", "updateEmailSelection", "updateChallengeWithSelectedContact", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "contacts", "Lkotlin/Pair;", "sortAndGetCurrentContact", "(Ljava/util/List;)Lkotlin/Pair;", "latestChallenges", "newChallenge", "updateLatestChallenges", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactSelectionHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper();

    private ContactSelectionHelper() {
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> extractPhoneNumbers(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        return challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers() : challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers() : challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers() : kotlin.collections.CollectionsKt.emptyList();
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> extractEmailAddresses(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        return challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails() : kotlin.collections.CollectionsKt.emptyList();
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> updatePhoneNumberSelection(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers, java.lang.String contactId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list = phoneNumbers;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) it.next()).getId(), contactId)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber : list) {
                    arrayList.add(com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber.copy$default(phoneNumber, null, null, false, false, kotlin.jvm.internal.Intrinsics.areEqual(phoneNumber.getId(), contactId), null, 47, null));
                }
                return arrayList;
            }
        }
        return null;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> updateEmailSelection(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> emails, java.lang.String contactId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> list = emails;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) it.next()).getId(), contactId)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress : list) {
                    arrayList.add(com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress.copy$default(emailAddress, null, null, false, false, kotlin.jvm.internal.Intrinsics.areEqual(emailAddress.getId(), contactId), 15, null));
                }
                return arrayList;
            }
        }
        return null;
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge updateChallengeWithSelectedContact(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String contactId) {
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers;
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> updatePhoneNumberSelection;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
        boolean z = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge;
        if (!z && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) && !(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
            if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge)) {
                return null;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge emailChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> updateEmailSelection = updateEmailSelection(emailChallenge.getEmails(), contactId);
            return updateEmailSelection != null ? com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge.copy$default(emailChallenge, null, null, false, updateEmailSelection, null, null, 55, null) : null;
        }
        if (z) {
            phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers();
        } else if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
            phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers();
        } else {
            phoneNumbers = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers() : null;
        }
        if (phoneNumbers != null && (updatePhoneNumberSelection = updatePhoneNumberSelection(phoneNumbers, contactId)) != null) {
            if (z) {
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge, null, null, false, updatePhoneNumberSelection, null, null, 55, null);
            }
            if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge, null, null, false, updatePhoneNumberSelection, null, null, 55, null);
            }
            if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
                return com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge.copy$default((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge, null, null, false, updatePhoneNumberSelection, null, null, 55, null);
            }
        }
        return null;
    }

    public final kotlin.Pair<java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel>, java.lang.String> sortAndGetCurrentContact(java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> contacts) {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String id;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(contacts, new java.util.Comparator() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.helper.ContactSelectionHelper$sortAndGetCurrentContact$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel) t2).isSelected()), java.lang.Boolean.valueOf(((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel) t).isSelected()));
            }
        });
        java.util.Iterator it = sortedWith.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel) obj).isSelected()) {
                break;
            }
        }
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel emailPhoneUiModel = (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel) obj;
        if (emailPhoneUiModel == null || (id = emailPhoneUiModel.getId()) == null) {
            com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel emailPhoneUiModel2 = (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel) kotlin.collections.CollectionsKt.firstOrNull(sortedWith);
            if (emailPhoneUiModel2 != null) {
                str = emailPhoneUiModel2.getId();
            }
        } else {
            str = id;
        }
        return new kotlin.Pair<>(sortedWith, str);
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> updateLatestChallenges(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge newChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newChallenge, "");
        if (!latestChallenges.isEmpty()) {
            java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = latestChallenges;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge : list) {
                if (challenge.getType() == newChallenge.getType()) {
                    challenge = newChallenge;
                }
                arrayList.add(challenge);
            }
            return arrayList;
        }
        return kotlin.collections.CollectionsKt.listOf(newChallenge);
    }
}
