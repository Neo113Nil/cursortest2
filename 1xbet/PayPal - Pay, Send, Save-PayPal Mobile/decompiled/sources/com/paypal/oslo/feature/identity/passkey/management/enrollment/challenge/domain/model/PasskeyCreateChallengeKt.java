package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;", "", "userEmail", "userDisplayName", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;", "toPasskeyBindChallenge", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallenge;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateChallengeKt {
    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge toPasskeyBindChallenge$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return toPasskeyBindChallenge(passkeyCreateChallenge, str, str2);
    }

    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge toPasskeyBindChallenge(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge passkeyCreateChallenge, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateChallenge, "");
        java.lang.String str5 = null;
        if (str == null) {
            java.lang.String displayName = passkeyCreateChallenge.getPasskeyUser().getDisplayName();
            if (kotlin.text.StringsKt.isBlank(displayName)) {
                displayName = null;
            }
            str3 = displayName;
        } else {
            str3 = str;
        }
        if (str2 == null) {
            java.lang.String displayName2 = passkeyCreateChallenge.getPasskeyUser().getDisplayName();
            if (kotlin.text.StringsKt.isBlank(displayName2)) {
                displayName2 = null;
            }
            str4 = displayName2;
        } else {
            str4 = str2;
        }
        java.lang.String challenge = passkeyCreateChallenge.getChallenge();
        java.lang.String id = passkeyCreateChallenge.getPasskeyRelyingParty().getId();
        java.lang.String name3 = passkeyCreateChallenge.getPasskeyRelyingParty().getName();
        java.lang.String id2 = passkeyCreateChallenge.getPasskeyUser().getId();
        java.lang.String str6 = str3 == null ? "" : str3;
        java.lang.String str7 = str4 == null ? "" : str4;
        java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter> publicKeyCredentialParameterList = passkeyCreateChallenge.getPublicKeyCredentialParameterList();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(publicKeyCredentialParameterList, 10));
        for (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter publicKeyCredentialParameter : publicKeyCredentialParameterList) {
            arrayList.add(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter(publicKeyCredentialParameter.getType(), publicKeyCredentialParameter.getAlgorithm()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.ExcludedCredential> excludedCredentialList = passkeyCreateChallenge.getExcludedCredentialList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(excludedCredentialList, 10));
        for (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.ExcludedCredential excludedCredential : excludedCredentialList) {
            arrayList3.add(new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor(excludedCredential.getId(), excludedCredential.getType(), null, 4, null));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification passkeyUserVerification = passkeyCreateChallenge.getPasskeyUserVerification();
        if (passkeyUserVerification != null && (name2 = passkeyUserVerification.name()) != null) {
            str5 = name2.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
        }
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge(challenge, id, name3, id2, str6, str7, arrayList2, null, arrayList4, null, null, null, null, str5, 7808, null);
    }
}
