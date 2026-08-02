package com.paypal.oslo.feature.oneonboarding.data.repository;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/repository/CosFlowStepRepository;", "Lcom/paypal/oslo/feature/oneonboarding/domain/repository/FlowStepRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/oneonboarding/data/builder/OneOnboardingQueryBuilder;", "queryBuilder", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/OneOnboardingComponentParser;", "componentParser", "Lcom/paypal/oslo/feature/oneonboarding/data/repository/PostAccountCreationHandler;", "postAccountCreationHandler", "Lcom/paypal/oslo/feature/oneonboarding/data/mapper/CallErrorMapper;", "callErrorMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/oneonboarding/data/builder/OneOnboardingQueryBuilder;Lcom/paypal/oslo/feature/oneonboarding/data/parser/OneOnboardingComponentParser;Lcom/paypal/oslo/feature/oneonboarding/data/repository/PostAccountCreationHandler;Lcom/paypal/oslo/feature/oneonboarding/data/mapper/CallErrorMapper;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "collectedItems", "", "isFlowStart", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "getFlow", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "p0", "", "p1", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/AuthType;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/oneonboarding/data/builder/OneOnboardingQueryBuilder;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/OneOnboardingComponentParser;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/oneonboarding/data/repository/PostAccountCreationHandler;", "Lcom/paypal/oslo/feature/oneonboarding/data/mapper/CallErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CosFlowStepRepository implements com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CosFlowStepRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder oneOnboardingQueryBuilder, com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser oneOnboardingComponentParser, com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler postAccountCreationHandler, com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper callErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingQueryBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingComponentParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAccountCreationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.getHighSpeedVideoSizes = oneOnboardingQueryBuilder;
        this.getHighSpeedVideoFpsRangesFor = oneOnboardingComponentParser;
        this.Camera2StreamConfigurationMap = postAccountCreationHandler;
        this.getHighResolutionOutputSizeshNQ4ISI = callErrorMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036b A[Catch: all -> 0x0382, RaiseCancellationException -> 0x0385, TryCatch #6 {RaiseCancellationException -> 0x0385, all -> 0x0382, blocks: (B:35:0x019a, B:40:0x01a4, B:41:0x01d0, B:43:0x01d8, B:45:0x01de, B:47:0x01e8, B:48:0x01ec, B:56:0x0222, B:57:0x0230, B:59:0x0236, B:60:0x0247, B:62:0x024d, B:64:0x025b, B:66:0x0268, B:72:0x0270, B:74:0x027d, B:75:0x0283, B:77:0x0289, B:79:0x028f, B:87:0x0225, B:88:0x0228, B:89:0x022b, B:90:0x022e, B:91:0x034c, B:92:0x035b, B:95:0x01b1, B:99:0x035c, B:100:0x0364, B:101:0x0365, B:102:0x036a, B:103:0x036b, B:104:0x0381), top: B:34:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0316 A[Catch: all -> 0x007a, RaiseCancellationException -> 0x007d, TryCatch #4 {RaiseCancellationException -> 0x007d, all -> 0x007a, blocks: (B:12:0x0075, B:14:0x0302, B:15:0x0310, B:17:0x0316, B:19:0x032b, B:21:0x0335, B:24:0x033b, B:119:0x00d3, B:121:0x00fb, B:123:0x012e, B:128:0x0108, B:130:0x010c, B:131:0x0118), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.paypal.oslo.core.network.graphql.AuthType] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.paypal.oslo.core.network.graphql.AuthType] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r7v33, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r7v36, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getFlow(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError, com.paypal.oslo.feature.oneonboarding.domain.Flow>> continuation) {
        com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository$getFlow$1 cosFlowStepRepository$getFlow$1;
        int i;
        ?? r7;
        java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list2;
        com.paypal.oslo.core.network.graphql.AuthType.User user;
        java.lang.Object execute;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.api.graphql.schema.type.OnboardInput onboardInput;
        int i2;
        int i3;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i4;
        com.apollographql.apollo.ApolloCall apolloCall;
        int i5;
        com.paypal.oslo.core.network.graphql.AuthType.User user2;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard;
        java.util.List list3;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status;
        boolean z2;
        int i6;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId2;
        java.util.List list4;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status2;
        java.util.List list5;
        com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment;
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId3;
        java.util.List list6;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status3;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.util.List list7;
        java.util.List list8;
        boolean z3;
        com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails statusDetails;
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId4 = intentId;
        boolean z4 = z;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository$getFlow$1) {
                    cosFlowStepRepository$getFlow$1 = (com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository$getFlow$1) continuation;
                    if ((cosFlowStepRepository$getFlow$1.CoroutineDebuggingKt & Integer.MIN_VALUE) != 0) {
                        cosFlowStepRepository$getFlow$1.CoroutineDebuggingKt -= 2147483648;
                        java.lang.Object obj3 = cosFlowStepRepository$getFlow$1.coroutineBoundary;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = cosFlowStepRepository$getFlow$1.CoroutineDebuggingKt;
                        r7 = 1;
                        r7 = 1;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                            arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                            list2 = list;
                            com.paypal.oslo.api.graphql.schema.type.OnboardInput buildOnboardInput = this.getHighSpeedVideoSizes.buildOnboardInput(intentId4, list2, z4);
                            java.lang.String lowerCase = intentId.getValue().toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            java.lang.String concat = "one_onboarding_".concat(java.lang.String.valueOf(lowerCase));
                            if (intentId4 instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) {
                                user2 = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) intentId4).getEntryPoint(), concat);
                            } else if (intentId4 instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle) {
                                user2 = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle) intentId4).getEntryPoint(), concat);
                            } else {
                                user = new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(concat, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                                com.apollographql.apollo.ApolloCall addExecutionContext = this.getHighSpeedVideoFpsRanges.mutation(new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation(buildOnboardInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.OneOnboarding.INSTANCE.getGetFlow(), null, null, 6, null));
                                com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(user, null, 2, false ? 1 : 0);
                                cosFlowStepRepository$getFlow$1.getHighSpeedVideoSizesFor = intentId4;
                                cosFlowStepRepository$getFlow$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                                cosFlowStepRepository$getFlow$1.getOutputStallDuration = defaultRaise4;
                                cosFlowStepRepository$getFlow$1.getOutputSizeshNQ4ISI = defaultRaise5;
                                cosFlowStepRepository$getFlow$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildOnboardInput);
                                cosFlowStepRepository$getFlow$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                                cosFlowStepRepository$getFlow$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                                cosFlowStepRepository$getFlow$1.isOutputSupportedFor = z4;
                                cosFlowStepRepository$getFlow$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRanges = 0;
                                cosFlowStepRepository$getFlow$1.Camera2StreamConfigurationMap = 0;
                                cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRangesFor = 0;
                                cosFlowStepRepository$getFlow$1.CoroutineDebuggingKt = 1;
                                execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, cosFlowStepRepository$getFlow$1);
                                if (execute != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                defaultRaise = defaultRaise5;
                                defaultRaise2 = defaultRaise4;
                                onboardInput = buildOnboardInput;
                                i2 = 0;
                                i3 = 0;
                                obj = execute;
                                obj2 = user;
                                i4 = 0;
                                apolloCall = addExecutionContext;
                                i5 = 0;
                            }
                            user = user2;
                            com.apollographql.apollo.ApolloCall addExecutionContext2 = this.getHighSpeedVideoFpsRanges.mutation(new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation(buildOnboardInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.OneOnboarding.INSTANCE.getGetFlow(), null, null, 6, null));
                            com.paypal.oslo.core.network.graphql.CallConfig callConfig2 = new com.paypal.oslo.core.network.graphql.CallConfig(user, null, 2, false ? 1 : 0);
                            cosFlowStepRepository$getFlow$1.getHighSpeedVideoSizesFor = intentId4;
                            cosFlowStepRepository$getFlow$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            cosFlowStepRepository$getFlow$1.getOutputStallDuration = defaultRaise4;
                            cosFlowStepRepository$getFlow$1.getOutputSizeshNQ4ISI = defaultRaise5;
                            cosFlowStepRepository$getFlow$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildOnboardInput);
                            cosFlowStepRepository$getFlow$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                            cosFlowStepRepository$getFlow$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext2);
                            cosFlowStepRepository$getFlow$1.isOutputSupportedFor = z4;
                            cosFlowStepRepository$getFlow$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRanges = 0;
                            cosFlowStepRepository$getFlow$1.Camera2StreamConfigurationMap = 0;
                            cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRangesFor = 0;
                            cosFlowStepRepository$getFlow$1.CoroutineDebuggingKt = 1;
                            execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext2, callConfig2, cosFlowStepRepository$getFlow$1);
                            if (execute != coroutine_suspended) {
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i7 = cosFlowStepRepository$getFlow$1.getHighSpeedVideoSizes;
                                int i8 = cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRangesFor;
                                int i9 = cosFlowStepRepository$getFlow$1.Camera2StreamConfigurationMap;
                                int i10 = cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRanges;
                                int i11 = cosFlowStepRepository$getFlow$1.getHighResolutionOutputSizeshNQ4ISI;
                                boolean z5 = cosFlowStepRepository$getFlow$1.isOutputSupportedFor;
                                list6 = (java.util.List) cosFlowStepRepository$getFlow$1.getOutputFormats;
                                status3 = (com.paypal.oslo.feature.oneonboarding.api.domain.Status) cosFlowStepRepository$getFlow$1.getInputSizeshNQ4ISI;
                                list8 = (java.util.List) cosFlowStepRepository$getFlow$1.toString;
                                list7 = (java.util.List) cosFlowStepRepository$getFlow$1.unwrapAs;
                                arrow.core.raise.DefaultRaise defaultRaise6 = (arrow.core.raise.DefaultRaise) cosFlowStepRepository$getFlow$1.getOutputStallDuration;
                                intentId3 = (com.paypal.oslo.feature.oneonboarding.api.domain.IntentId) cosFlowStepRepository$getFlow$1.getHighSpeedVideoSizesFor;
                                kotlin.ResultKt.throwOnFailure(obj3);
                                defaultRaise3 = defaultRaise6;
                                list4 = list6;
                                status2 = status3;
                                intentId2 = intentId3;
                                list3 = list8;
                                list5 = list7;
                                r7 = defaultRaise3;
                                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                for (java.lang.Object obj4 : list3) {
                                    com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId m16607boximpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(((com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) obj4).m16706getComponentIdfHLlpbY());
                                    java.lang.Object obj5 = linkedHashMap.get(m16607boximpl);
                                    if (obj5 == null) {
                                        obj5 = (java.util.List) new java.util.ArrayList();
                                        linkedHashMap.put(m16607boximpl, obj5);
                                    }
                                    ((java.util.List) obj5).add(obj4);
                                }
                                com.paypal.oslo.feature.oneonboarding.domain.Flow flow = new com.paypal.oslo.feature.oneonboarding.domain.Flow(intentId2, list5, status2, list4, linkedHashMap);
                                r7.complete();
                                return new arrow.core.Either.Right(flow);
                            }
                            int i12 = cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRangesFor;
                            int i13 = cosFlowStepRepository$getFlow$1.Camera2StreamConfigurationMap;
                            int i14 = cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRanges;
                            int i15 = cosFlowStepRepository$getFlow$1.getHighResolutionOutputSizeshNQ4ISI;
                            boolean z6 = cosFlowStepRepository$getFlow$1.isOutputSupportedFor;
                            com.apollographql.apollo.ApolloCall apolloCall2 = (com.apollographql.apollo.ApolloCall) cosFlowStepRepository$getFlow$1.isOutputSupportedForhNQ4ISI;
                            java.lang.Object obj6 = (com.paypal.oslo.core.network.graphql.AuthType) cosFlowStepRepository$getFlow$1.getOutputSizes;
                            com.paypal.oslo.api.graphql.schema.type.OnboardInput onboardInput2 = (com.paypal.oslo.api.graphql.schema.type.OnboardInput) cosFlowStepRepository$getFlow$1.getOutputMinFrameDurationlomOqCM;
                            ?? r72 = (arrow.core.raise.Raise) cosFlowStepRepository$getFlow$1.getOutputSizeshNQ4ISI;
                            arrow.core.raise.DefaultRaise defaultRaise7 = (arrow.core.raise.DefaultRaise) cosFlowStepRepository$getFlow$1.getOutputStallDuration;
                            java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list9 = (java.util.List) cosFlowStepRepository$getFlow$1.getInputFormats;
                            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId5 = (com.paypal.oslo.feature.oneonboarding.api.domain.IntentId) cosFlowStepRepository$getFlow$1.getHighSpeedVideoSizesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                onboardInput = onboardInput2;
                                obj2 = obj6;
                                apolloCall = apolloCall2;
                                i5 = i15;
                                defaultRaise = r72;
                                obj = obj3;
                                i2 = i12;
                                intentId4 = intentId5;
                                defaultRaise2 = defaultRaise7;
                                list2 = list9;
                                i3 = i14;
                                i4 = i13;
                                z4 = z6;
                            } catch (arrow.core.raise.RaiseCancellationException e) {
                                e = e;
                                r7 = defaultRaise7;
                                r7.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r7));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                r7 = defaultRaise7;
                                r7.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        ior = (arrow.core.Ior) obj;
                        if (!(ior instanceof arrow.core.Ior.Left)) {
                            defaultRaise.raise(this.getHighResolutionOutputSizeshNQ4ISI.toFlowStepError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        if (ior instanceof arrow.core.Ior.Right) {
                            graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                        } else if (ior instanceof arrow.core.Ior.Both) {
                            java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                            com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError = this.getHighResolutionOutputSizeshNQ4ISI.toFlowStepError((com.paypal.oslo.core.network.graphql.error.CallError) leftValue);
                            if (flowStepError instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError) {
                                defaultRaise.raise(flowStepError);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            graphQLData = graphQLData2;
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data data = (com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data) graphQLData.getData();
                        if (data == null || (onboard = data.getOnboard()) == null) {
                            defaultRaise.raise(new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError("No data returned from onboard mutation"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser oneOnboardingComponentParser = this.getHighSpeedVideoFpsRangesFor;
                        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> steps = onboard.getSteps();
                        if (steps == null) {
                            steps = kotlin.collections.CollectionsKt.emptyList();
                        }
                        int i16 = i2;
                        kotlin.Pair pair = (kotlin.Pair) defaultRaise.bind(oneOnboardingComponentParser.parseSteps(steps));
                        java.util.List list10 = (java.util.List) pair.component1();
                        list3 = (java.util.List) pair.component2();
                        int i17 = i4;
                        int i18 = com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository.WhenMappings.$EnumSwitchMapping$0[onboard.getStatus().ordinal()];
                        int i19 = i3;
                        if (i18 == 1) {
                            status = com.paypal.oslo.feature.oneonboarding.api.domain.Status.COMPLETED;
                        } else if (i18 == 2) {
                            status = com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_PROGRESS;
                        } else if (i18 == 3) {
                            status = com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_REVIEW;
                        } else if (i18 == 4) {
                            status = com.paypal.oslo.feature.oneonboarding.api.domain.Status.FAILED;
                        } else {
                            status = com.paypal.oslo.feature.oneonboarding.api.domain.Status.FAILED;
                        }
                        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> statusDetails2 = onboard.getStatusDetails();
                        if (statusDetails2 != null) {
                            i6 = i5;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.Iterator it = statusDetails2.iterator();
                            while (it.hasNext()) {
                                java.util.Iterator it2 = it;
                                java.lang.String issue = ((com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail) it.next()).getIssue();
                                if (issue != null) {
                                    z3 = z4;
                                    statusDetails = new com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails(issue);
                                } else {
                                    z3 = z4;
                                    statusDetails = null;
                                }
                                if (statusDetails != null) {
                                    arrayList2.add(statusDetails);
                                }
                                it = it2;
                                z4 = z3;
                            }
                            z2 = z4;
                            arrayList = arrayList2;
                        } else {
                            z2 = z4;
                            i6 = i5;
                            arrayList = null;
                        }
                        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
                        com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication = onboard.getAuthentication();
                        if (authentication != null && (authenticationTokenFragment = authentication.getAuthenticationTokenFragment()) != null) {
                            com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler postAccountCreationHandler = this.Camera2StreamConfigurationMap;
                            cosFlowStepRepository$getFlow$1.getHighSpeedVideoSizesFor = intentId4;
                            cosFlowStepRepository$getFlow$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            cosFlowStepRepository$getFlow$1.getOutputStallDuration = defaultRaise2;
                            cosFlowStepRepository$getFlow$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise);
                            cosFlowStepRepository$getFlow$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(onboardInput);
                            cosFlowStepRepository$getFlow$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                            cosFlowStepRepository$getFlow$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                            cosFlowStepRepository$getFlow$1.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(onboard);
                            cosFlowStepRepository$getFlow$1.unwrapAs = list10;
                            cosFlowStepRepository$getFlow$1.toString = list3;
                            cosFlowStepRepository$getFlow$1.getInputSizeshNQ4ISI = status;
                            cosFlowStepRepository$getFlow$1.getOutputFormats = emptyList;
                            cosFlowStepRepository$getFlow$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData);
                            cosFlowStepRepository$getFlow$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationTokenFragment);
                            cosFlowStepRepository$getFlow$1.isOutputSupportedFor = z2;
                            cosFlowStepRepository$getFlow$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                            cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRanges = i19;
                            cosFlowStepRepository$getFlow$1.Camera2StreamConfigurationMap = i17;
                            cosFlowStepRepository$getFlow$1.getHighSpeedVideoFpsRangesFor = i16;
                            cosFlowStepRepository$getFlow$1.getHighSpeedVideoSizes = 0;
                            cosFlowStepRepository$getFlow$1.CoroutineDebuggingKt = 2;
                            if (postAccountCreationHandler.handle(authenticationTokenFragment, cosFlowStepRepository$getFlow$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            intentId3 = intentId4;
                            list6 = emptyList;
                            status3 = status;
                            defaultRaise3 = defaultRaise2;
                            list7 = list10;
                            list8 = list3;
                            list4 = list6;
                            status2 = status3;
                            intentId2 = intentId3;
                            list3 = list8;
                            list5 = list7;
                            r7 = defaultRaise3;
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            while (r0.hasNext()) {
                            }
                            com.paypal.oslo.feature.oneonboarding.domain.Flow flow2 = new com.paypal.oslo.feature.oneonboarding.domain.Flow(intentId2, list5, status2, list4, linkedHashMap2);
                            r7.complete();
                            return new arrow.core.Either.Right(flow2);
                        }
                        intentId2 = intentId4;
                        list4 = emptyList;
                        status2 = status;
                        r7 = defaultRaise2;
                        list5 = list10;
                        java.util.LinkedHashMap linkedHashMap22 = new java.util.LinkedHashMap();
                        while (r0.hasNext()) {
                        }
                        com.paypal.oslo.feature.oneonboarding.domain.Flow flow22 = new com.paypal.oslo.feature.oneonboarding.domain.Flow(intentId2, list5, status2, list4, linkedHashMap22);
                        r7.complete();
                        return new arrow.core.Either.Right(flow22);
                    }
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
                r7 = defaultRaise2;
                r7.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r7));
            } catch (java.lang.Throwable th2) {
                th = th2;
                r7 = defaultRaise2;
                r7.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
            if (i != 0) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        cosFlowStepRepository$getFlow$1 = new com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository$getFlow$1(this, continuation);
        java.lang.Object obj32 = cosFlowStepRepository$getFlow$1.coroutineBoundary;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cosFlowStepRepository$getFlow$1.CoroutineDebuggingKt;
        r7 = 1;
        r7 = 1;
    }

    private static com.paypal.oslo.core.network.graphql.AuthType getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint p0, java.lang.String p1) {
        if (p0.getLinkWithCurrentUser()) {
            return new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(p1, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        }
        return new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(p1, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardStatus.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardStatus.IN_REVIEW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardStatus.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
