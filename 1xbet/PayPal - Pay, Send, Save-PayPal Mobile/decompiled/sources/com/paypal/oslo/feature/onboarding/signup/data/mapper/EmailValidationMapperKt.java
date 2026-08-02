package com.paypal.oslo.feature.onboarding.signup.data.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0000¢\u0006\u0004\b\u000b\u0010\f*\n\u0010\r\"\u00020\u00002\u00020\u0000"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;", "Lcom/paypal/oslo/feature/onboarding/signup/data/mapper/GetEmailValidationResponse;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;", "mapToEmailCheckResult", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;)Larrow/core/Either;", "Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;", "Lcom/paypal/oslo/feature/onboarding/graphql/type/EmailValidityStatus;", "status", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailValidity;", "mapValidityToDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;)Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailValidity;", "GetEmailValidationResponse"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmailValidationMapperKt {
    public static final com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity mapValidityToDomain(com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus emailValidityStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailValidityStatus, "");
        int i = com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapperKt.WhenMappings.$EnumSwitchMapping$0[emailValidityStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.VALID;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.INVALID;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.BLOCKED;
        }
        return com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.INVALID;
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult> mapToEmailCheckResult(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredentialMetadata, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            boolean z = publicCredentialMetadata.getActor() != null;
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus = publicCredentialMetadata.getOnboardingEmailStatus();
            com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus2 = null;
            java.util.ArrayList arrayList = null;
            if (onboardingEmailStatus != null) {
                com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity mapValidityToDomain = mapValidityToDomain(onboardingEmailStatus.getValidity());
                java.util.List<java.lang.Object> suggestions = onboardingEmailStatus.getSuggestions();
                if (suggestions != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : suggestions) {
                        if (obj instanceof java.lang.String) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList3 = arrayList2;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    java.util.Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl((java.lang.String) it.next())));
                    }
                    arrayList = arrayList4;
                }
                if (arrayList == null) {
                    arrayList = kotlin.collections.CollectionsKt.emptyList();
                }
                onboardingEmailStatus2 = new com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus(mapValidityToDomain, arrayList);
            }
            com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult emailCheckResult = new com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult(onboardingEmailStatus2, z);
            defaultRaise.complete();
            return new arrow.core.Either.Right(emailCheckResult);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus.VALID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus.INVALID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus.BLOCKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
