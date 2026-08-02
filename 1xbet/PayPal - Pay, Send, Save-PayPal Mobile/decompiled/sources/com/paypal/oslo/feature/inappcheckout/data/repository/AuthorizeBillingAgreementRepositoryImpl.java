package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/AuthorizeBillingAgreementRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthorizeBillingAgreementRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "contingencyMapper", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "", "fundingInstrumentID", "", "useBalance", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE, "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthorizeBillingAgreementRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AuthorizeBillingAgreementRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.Camera2StreamConfigurationMap = contingencyMapper;
        this.getHighSpeedVideoSizes = checkoutLogger;
        this.getHighSpeedVideoFpsRanges = appSwitchSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05f9 A[Catch: all -> 0x062c, RaiseCancellationException -> 0x0636, TryCatch #6 {RaiseCancellationException -> 0x0636, all -> 0x062c, blocks: (B:164:0x0084, B:168:0x00a5, B:170:0x00af, B:174:0x00c1, B:177:0x00ea, B:179:0x00f3, B:194:0x05b6, B:197:0x05c4, B:198:0x05f8, B:200:0x05f9, B:201:0x062b), top: B:163:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x040d A[Catch: all -> 0x006c, RaiseCancellationException -> 0x0070, TryCatch #8 {RaiseCancellationException -> 0x0070, all -> 0x006c, blocks: (B:11:0x0060, B:21:0x01d4, B:23:0x01dc, B:25:0x01e2, B:27:0x01e8, B:30:0x01f6, B:32:0x0200, B:33:0x03db, B:36:0x0236, B:38:0x0243, B:42:0x024f, B:44:0x028d, B:45:0x0298, B:47:0x02bc, B:49:0x02c4, B:51:0x02ce, B:52:0x0303, B:54:0x030f, B:56:0x0315, B:58:0x031d, B:62:0x038d, B:63:0x0382, B:65:0x03a1, B:66:0x03ec, B:67:0x0404, B:72:0x01c2, B:73:0x0405, B:74:0x040c, B:75:0x040d, B:77:0x0440, B:79:0x0444, B:82:0x0458, B:83:0x045e, B:85:0x0462, B:86:0x0469, B:88:0x046f, B:89:0x0477, B:91:0x047b, B:93:0x0481, B:94:0x0487, B:96:0x048b, B:99:0x0493, B:100:0x0499, B:102:0x049d, B:103:0x04a2, B:106:0x04b4, B:109:0x04e0, B:112:0x04ec, B:116:0x0523, B:119:0x052b, B:121:0x0533, B:125:0x053f, B:126:0x0593, B:127:0x059b, B:129:0x0513, B:132:0x051e, B:143:0x054d, B:144:0x0552, B:145:0x0553), top: B:10:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object authorize(java.lang.String str, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl$authorize$1 authorizeBillingAgreementRepositoryImpl$authorize$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Throwable th;
        arrow.core.raise.RaiseCancellationException raiseCancellationException;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String str2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        java.lang.Throwable th2;
        arrow.core.raise.RaiseCancellationException e;
        boolean z;
        com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity;
        java.lang.String message;
        boolean z2;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl authorizeBillingAgreementRepositoryImpl;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.External external;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.AuthorizeBillingAgreementCreation authorizeBillingAgreementCreation;
        arrow.core.Either left;
        java.lang.String str3;
        java.lang.String concat;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason name2;
        java.lang.String valueOf;
        try {
            if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl$authorize$1) {
                authorizeBillingAgreementRepositoryImpl$authorize$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl$authorize$1) continuation;
                if ((authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj5 = authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj5);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                            java.lang.String checkoutTokenValueOrEmpty = this.getHighSpeedVideoFpsRanges.getCheckoutTokenValueOrEmpty();
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getHighSpeedVideoSizes;
                            com.paypal.android.logger.categories.Network.Call call = com.paypal.android.logger.categories.Network.Call.INSTANCE;
                            kotlin.Pair[] pairArr = new kotlin.Pair[3];
                            pairArr[0] = kotlin.TuplesKt.to("baToken", checkoutTokenValueOrEmpty);
                            pairArr[1] = kotlin.TuplesKt.to("fundingInstrumentID", str != null ? str : "null");
                            if (bool != null && (r12 = java.lang.String.valueOf(bool.booleanValue())) != null) {
                                obj = "fundingInstrumentID";
                                pairArr[2] = kotlin.TuplesKt.to("useBalance", r12);
                                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger, "Initiating billing agreement authorization", call, kotlin.collections.MapsKt.mapOf(pairArr), null, 8, null);
                                if (!kotlin.text.StringsKt.isBlank(checkoutTokenValueOrEmpty)) {
                                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Billing agreement token is blank", null, null, null, 28, null);
                                    defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_TOKEN", "Billing agreement token cannot be blank", false, null, null, 16, null));
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Funding instrument not selected or blank", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, str == null ? "null" : str)), null, null, 24, null);
                                    defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("FI_NOT_SELECTED", "Funding instrument not selected or is blank", false, null, null, 16, null));
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementInput externalAuthorizeBillingAgreementInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput(str, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(bool))), null, null, null, null, 30, null);
                                com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation authorizeBillingAgreementCreationMutation = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation(checkoutTokenValueOrEmpty, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(externalAuthorizeBillingAgreementInput));
                                com.apollographql.apollo.ApolloCall addNativeCheckoutHeaders = com.paypal.oslo.feature.inappcheckout.data.utils.ApolloClientExtensionsKt.addNativeCheckoutHeaders(this.getHighSpeedVideoFpsRangesFor.mutation(authorizeBillingAgreementCreationMutation));
                                obj2 = "CHECKOUT_CONTEXT_KEY_NOT_FOUND";
                                obj3 = "error";
                                obj4 = "UNKNOWN";
                                str2 = null;
                                try {
                                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("authorize_billing_agreement", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputMinFrameDuration = defaultRaise;
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getInputFormats = defaultRaise3;
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutTokenValueOrEmpty);
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalAuthorizeBillingAgreementInput);
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authorizeBillingAgreementCreationMutation);
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.Camera2StreamConfigurationMap = 0;
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getHighSpeedVideoFpsRanges = 0;
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getHighSpeedVideoFpsRangesFor = 0;
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                    authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputSizes = 1;
                                    java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addNativeCheckoutHeaders, callConfig, authorizeBillingAgreementRepositoryImpl$authorize$1);
                                    if (execute == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    defaultRaise2 = defaultRaise;
                                    raise = defaultRaise3;
                                    obj5 = execute;
                                } catch (arrow.core.raise.RaiseCancellationException e2) {
                                    e = e2;
                                    raiseCancellationException = e;
                                    defaultRaise.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    th = th;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            obj = "fundingInstrumentID";
                            java.lang.String str4 = "null";
                            pairArr[2] = kotlin.TuplesKt.to("useBalance", str4);
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger, "Initiating billing agreement authorization", call, kotlin.collections.MapsKt.mapOf(pairArr), null, 8, null);
                            if (!kotlin.text.StringsKt.isBlank(checkoutTokenValueOrEmpty)) {
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e3) {
                            e = e3;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = authorizeBillingAgreementRepositoryImpl$authorize$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = authorizeBillingAgreementRepositoryImpl$authorize$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = authorizeBillingAgreementRepositoryImpl$authorize$1.getHighSpeedVideoFpsRanges;
                        int i5 = authorizeBillingAgreementRepositoryImpl$authorize$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) authorizeBillingAgreementRepositoryImpl$authorize$1.getInputFormats;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputMinFrameDuration;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj5);
                            obj2 = "CHECKOUT_CONTEXT_KEY_NOT_FOUND";
                            obj4 = "UNKNOWN";
                            obj3 = "error";
                            str2 = null;
                        } catch (arrow.core.raise.RaiseCancellationException e4) {
                            e = e4;
                            raiseCancellationException = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
                        } catch (java.lang.Throwable th5) {
                            th2 = th5;
                            th = th2;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    arrow.core.Ior ior = (arrow.core.Ior) obj5;
                    z = ior instanceof arrow.core.Ior.Left;
                    java.lang.String str5 = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
                    if (!z) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                        java.lang.Object obj6 = obj3;
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Failed to authorize billing agreement", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj6, callError.toString())), null, null, 24, null);
                        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                            com.paypal.oslo.core.network.graphql.error.CallError.Network network = (com.paypal.oslo.core.network.graphql.error.CallError.Network) callError;
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Network error during billing agreement authorization", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj6, network.getError().toString())), null, null, 24, null);
                            nativeXOErrorEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("NETWORK_ERROR", network.getError().toString(), true, null, null, 16, null);
                        } else {
                            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
                            com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY());
                            java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
                            java.lang.Object obj7 = extensions != null ? extensions.get("correlationId") : str2;
                            java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : str2;
                            java.util.Map<java.lang.String, java.lang.Object> extensions2 = graphQLError.getExtensions();
                            java.lang.Object obj8 = extensions2 != null ? extensions2.get("details") : str2;
                            ?? r7 = obj8 instanceof java.util.List ? (java.util.List) obj8 : str2;
                            java.lang.Object firstOrNull = r7 != 0 ? kotlin.collections.CollectionsKt.firstOrNull((java.util.List) r7) : str2;
                            ?? r72 = firstOrNull instanceof java.util.Map ? (java.util.Map) firstOrNull : str2;
                            java.lang.String str7 = r72 != 0 ? r72.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE) : str2;
                            java.lang.String str8 = str7 instanceof java.lang.String ? str7 : str2;
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger2 = this.getHighSpeedVideoSizes;
                            com.paypal.android.logger.categories.Network.Error error = com.paypal.android.logger.categories.Network.Error.INSTANCE;
                            kotlin.Pair[] pairArr2 = new kotlin.Pair[5];
                            java.lang.String errorCode = graphQLError.getErrorCode();
                            if (errorCode == null) {
                                errorCode = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
                            }
                            pairArr2[0] = kotlin.TuplesKt.to("errorCode", errorCode);
                            pairArr2[1] = kotlin.TuplesKt.to("message", graphQLError.getMessage());
                            pairArr2[2] = kotlin.TuplesKt.to("isCritical", java.lang.String.valueOf(graphQL.isCritical()));
                            pairArr2[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, str8 == null ? com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA : str8);
                            if (str6 != null) {
                                str5 = str6;
                            }
                            pairArr2[4] = kotlin.TuplesKt.to("correlationId", str5);
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutLogger2, error, "GraphQL error during billing agreement authorization", kotlin.collections.MapsKt.mapOf(pairArr2), null, null, 24, null);
                            java.lang.Object obj9 = obj2;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(str8, obj9)) {
                                message = "Billing agreement token is invalid or expired. Please restart the checkout flow.";
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str8, "PERMISSION_DENIED")) {
                                message = "Insufficient permissions to authorize billing agreement. Please log in again.";
                            } else {
                                message = graphQLError.getMessage();
                            }
                            java.lang.String str9 = message;
                            java.lang.String errorCode2 = graphQLError.getErrorCode();
                            if (errorCode2 == null) {
                                errorCode2 = "GRAPHQL_ERROR";
                            }
                            java.lang.String str10 = errorCode2;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(str8, obj9) && graphQL.isCritical()) {
                                z2 = false;
                                nativeXOErrorEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str10, str9, z2, str6, null, 16, null);
                            }
                            z2 = true;
                            nativeXOErrorEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str10, str9, z2, str6, null, 16, null);
                        }
                        raise.raise(nativeXOErrorEntity);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                        authorizeBillingAgreementRepositoryImpl = this;
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                        authorizeBillingAgreementRepositoryImpl = this;
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.w$default(authorizeBillingAgreementRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Partial success authorizing billing agreement", null, null, 12, null);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Data data = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Data) graphQLData.getData();
                    if (data == null || (external = data.getExternal()) == null || (authorizeBillingAgreementCreation = external.getAuthorizeBillingAgreementCreation()) == null) {
                        raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_DATA", "No data in authorize billing agreement response", false, null, null, 16, null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    java.lang.String str11 = authorizeBillingAgreementCreation.get__typename();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str11, "externalAuthorizeBillingAgreementCreationSuccessResponse")) {
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationSuccessResponse onExternalAuthorizeBillingAgreementCreationSuccessResponse = authorizeBillingAgreementCreation.getOnExternalAuthorizeBillingAgreementCreationSuccessResponse();
                        java.lang.String str12 = authorizeBillingAgreementCreation.get__typename();
                        if (onExternalAuthorizeBillingAgreementCreationSuccessResponse == null) {
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(authorizeBillingAgreementRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Success response is null despite typename", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, str12)), null, null, 24, null);
                            left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_SUCCESS_RESPONSE", "Success response is null", false, null, null, 16, null));
                        } else {
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger3 = authorizeBillingAgreementRepositoryImpl.getHighSpeedVideoSizes;
                            com.paypal.android.logger.categories.Network.Success success = com.paypal.android.logger.categories.Network.Success.INSTANCE;
                            kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                            java.lang.Boolean status = onExternalAuthorizeBillingAgreementCreationSuccessResponse.getStatus();
                            if (status != null && (valueOf = java.lang.String.valueOf(status.booleanValue())) != null) {
                                str5 = valueOf;
                            }
                            pairArr3[0] = kotlin.TuplesKt.to("status", str5);
                            pairArr3[1] = kotlin.TuplesKt.to("hasContingencies", java.lang.String.valueOf(!onExternalAuthorizeBillingAgreementCreationSuccessResponse.getContingencies().isEmpty()));
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger3, "Successfully authorized billing agreement", success, kotlin.collections.MapsKt.mapOf(pairArr3), null, 8, null);
                            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Contingency contingency = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Contingency) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalAuthorizeBillingAgreementCreationSuccessResponse.getContingencies());
                            left = arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity(onExternalAuthorizeBillingAgreementCreationSuccessResponse.getReturnURL(), onExternalAuthorizeBillingAgreementCreationSuccessResponse.getMerchantName(), onExternalAuthorizeBillingAgreementCreationSuccessResponse.getStatus(), onExternalAuthorizeBillingAgreementCreationSuccessResponse.getIntent(), onExternalAuthorizeBillingAgreementCreationSuccessResponse.getPayerID(), contingency != null ? authorizeBillingAgreementRepositoryImpl.Camera2StreamConfigurationMap.getContingency(contingency) : str2, null, false));
                        }
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(str11, "externalAuthorizeBillingAgreementCreationErrorResponse")) {
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationErrorResponse onExternalAuthorizeBillingAgreementCreationErrorResponse = authorizeBillingAgreementCreation.getOnExternalAuthorizeBillingAgreementCreationErrorResponse();
                        java.lang.String str13 = authorizeBillingAgreementCreation.get__typename();
                        if (onExternalAuthorizeBillingAgreementCreationErrorResponse == null) {
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(authorizeBillingAgreementRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Error response is null despite typename", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, str13)), null, null, 24, null);
                            left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_ERROR_RESPONSE", "Error response is null", false, null, null, 16, null));
                        } else {
                            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error error2 = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalAuthorizeBillingAgreementCreationErrorResponse.getErrors());
                            if (error2 == null || (name2 = error2.getName()) == null || (str3 = name2.name()) == null) {
                                str3 = "UNKNOWN_ERROR";
                            }
                            java.lang.String str14 = str3;
                            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(authorizeBillingAgreementRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Billing agreement authorization returned error response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorName", str14), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.String.valueOf(onExternalAuthorizeBillingAgreementCreationErrorResponse.getErrors().size())), kotlin.TuplesKt.to("allErrors", kotlin.collections.CollectionsKt.joinToString$default(onExternalAuthorizeBillingAgreementCreationErrorResponse.getErrors(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj10) {
                                    return com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl.m15414$r8$lambda$HalqWO4amwsgIDSDlm3eERn48((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error) obj10);
                                }
                            }, 31, null))), null, null, 24, null);
                            java.lang.Object obj10 = obj4;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(str14, obj10)) {
                                concat = "Unable to authorize billing agreement. The token may be invalid or expired. Please restart the checkout flow.";
                            } else {
                                concat = "Failed to authorize billing agreement: ".concat(java.lang.String.valueOf(str14));
                            }
                            left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str14, concat, kotlin.jvm.internal.Intrinsics.areEqual(str14, obj10), null, null, 16, null));
                        }
                    } else {
                        java.lang.String str15 = authorizeBillingAgreementCreation.get__typename();
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(authorizeBillingAgreementRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Unknown response type received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, str15)), null, null, 24, null);
                        left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_RESPONSE_TYPE", "Unknown response type: ".concat(java.lang.String.valueOf(str15)), false, null, null, 16, null));
                    }
                    com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity) raise.bind(left);
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(authorizeBACreationEntity);
                }
            }
            arrow.core.Ior ior2 = (arrow.core.Ior) obj5;
            z = ior2 instanceof arrow.core.Ior.Left;
            java.lang.String str52 = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
            if (!z) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e5) {
            e = e5;
            raiseCancellationException = e;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
        } catch (java.lang.Throwable th6) {
            th2 = th6;
            th = th2;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        authorizeBillingAgreementRepositoryImpl$authorize$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl$authorize$1(this, continuation);
        java.lang.Object obj52 = authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authorizeBillingAgreementRepositoryImpl$authorize$1.getOutputSizes;
        if (i != 0) {
        }
    }

    /* renamed from: $r8$lambda$HalqWO4-amwsgIDSDlm-3eERn48, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m15414$r8$lambda$HalqWO4amwsgIDSDlm3eERn48(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName().name();
    }
}
