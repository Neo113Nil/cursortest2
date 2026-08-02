package com.paypal.oslo.feature.oneonboarding.data.builder;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B.\b\u0007\u0012#\u0010\u0007\u001a\u001f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R1\u0010\u0016\u001a\u001f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/builder/OneOnboardingQueryBuilder;", "", "", "Ljava/lang/Class;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/data/mapper/FieldSubmissionMapper;", "Lkotlin/jvm/JvmSuppressWildcards;", "collectedItemMappers", "<init>", "(Ljava/util/Map;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "items", "", "isFlowStart", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardInput;", "buildOnboardInput", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;Z)Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneOnboardingQueryBuilder {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem>, com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?>> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public OneOnboardingQueryBuilder(java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem>, com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardInput buildOnboardInput(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> items, boolean isFlowStart) {
        com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput makeFieldSubmission;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput onboardComponentsInput = new com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput(null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
        java.util.Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem = (com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) it.next();
            com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?> fieldSubmissionMapper = this.getHighSpeedVideoFpsRangesFor.get(collectedItem.getClass());
            com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<?> fieldSubmissionMapper2 = fieldSubmissionMapper instanceof com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper ? fieldSubmissionMapper : null;
            if (fieldSubmissionMapper2 == null || (makeFieldSubmission = fieldSubmissionMapper2.makeFieldSubmission(onboardComponentsInput, collectedItem)) == null) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(collectedItem.getClass()).getSimpleName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No FieldSubmissionMapper registered for ");
                sb.append(simpleName);
                sb.append(". Item will be ignored.");
                com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
            } else {
                onboardComponentsInput = makeFieldSubmission;
            }
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent safeValueOf = com.paypal.oslo.api.graphql.schema.type.OnboardIntent.INSTANCE.safeValueOf(intentId.getValue());
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.oneonboarding.data.mapper.OnboardAccountCreationInitialInputExtensionsKt.toAccountCreationInitialInput(intentId));
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.oneonboarding.data.mapper.OnboardAccountCreationInitialInputExtensionsKt.toAccountCreationSignUpWithGoogleInput(intentId));
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        if (items.isEmpty()) {
            onboardComponentsInput = null;
        }
        return new com.paypal.oslo.api.graphql.schema.type.OnboardInput(safeValueOf, com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(isFlowStart)), presentIfNotNull, presentIfNotNull2, null, null, companion.presentIfNotNull(onboardComponentsInput), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.oneonboarding.data.mapper.OnboardJourneyContextInputExtensionsKt.toJourneyContextInput(intentId)), 48, null);
    }
}
