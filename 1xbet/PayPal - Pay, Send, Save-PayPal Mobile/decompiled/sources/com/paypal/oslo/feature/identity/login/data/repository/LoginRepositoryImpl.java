package com.paypal.oslo.feature.identity.login.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001MB\u0097\u0001\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012(\u0010\u0010\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0007`\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u000f0\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0006\u0010#\u001a\u00020\fH\u0096@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J@\u00103\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\n\u0010*\u001a\u00060-j\u0002`.2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\b\u00102\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0004\b3\u00104R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R6\u0010+\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0007`\u000e¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010>R\u0014\u0010B\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u00106\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010C\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010ER\u0014\u0010G\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010FR\u0014\u0010I\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010<\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010L"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/data/repository/LoginRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/repository/LoginRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "config", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "Lkotlin/jvm/JvmSuppressWildcards;", "inputBuilders", "Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;", "bindSchemeProvider", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getRememberedUserUseCase", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;", "checkoutDataInputStore", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "checkoutOutputDataStore", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;", "authCodeDataStore", "Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "elapsedRealtimeProvider", "Lcom/paypal/oslo/feature/identity/shared/data/mapper/GraphQLErrorMapper;", "errorMapper", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;", "checkoutWebSSOIntentStore", "<init>", "(Ldagger/Lazy;Ljavax/inject/Provider;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Ljava/util/Set;Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;Lcom/paypal/oslo/feature/identity/shared/data/mapper/GraphQLErrorMapper;Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;)V", "loginRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginError;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "login", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/login/domain/model/LoginError;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticateInput;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Data;", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lcom/paypal/oslo/core/network/graphql/error/CallError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldagger/Lazy;", "getOutputFormats", "Ljavax/inject/Provider;", "Camera2StreamConfigurationMap", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "Ljava/util/Set;", "Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;", "getHighSpeedVideoSizes", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getInputFormats", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "getInputSizeshNQ4ISI", "getOutputSizes", "Lcom/paypal/oslo/feature/identity/shared/data/mapper/GraphQLErrorMapper;", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoginRepositoryImpl implements com.paypal.oslo.feature.identity.login.domain.repository.LoginRepository {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider getHighSpeedVideoSizes;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore getOutputStallDurationlomOqCM;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore getOutputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getInputFormats;
    private final com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"BIOMETRIC_DEVICE_NOT_BOUND", "LLS_DEVICE_NOT_BOUND"});
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("[a-zA-Z0-9+._%\\-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    @javax.inject.Inject
    public LoginRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set, com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore, com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider elapsedRealtimeProvider, com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper graphQLErrorMapper, com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore checkoutWebSSOIntentStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindSchemeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutInputDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutOutputDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authCodeDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elapsedRealtimeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutWebSSOIntentStore, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = identityTokenStorage;
        this.getHighSpeedVideoFpsRanges = set;
        this.getHighSpeedVideoSizes = bindSchemeProvider;
        this.getInputFormats = getRememberedUserUseCase;
        this.getOutputFormats = checkoutInputDataStore;
        this.getOutputMinFrameDuration = checkoutOutputDataStore;
        this.getHighSpeedVideoSizesFor = authCodeDataStore;
        this.getInputSizeshNQ4ISI = elapsedRealtimeProvider;
        this.getOutputSizes = graphQLErrorMapper;
        this.getOutputStallDurationlomOqCM = checkoutWebSSOIntentStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02f4, code lost:
    
        if (r1 != r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x036d, code lost:
    
        if (r1 == r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0109, code lost:
    
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.paypal.oslo.feature.identity.login.domain.repository.LoginRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object login(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.login.domain.model.LoginError, ? extends com.paypal.oslo.feature.identity.login.domain.model.LoginResult>> continuation) {
        com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$login$1 loginRepositoryImpl$login$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest2;
        arrow.core.Either either;
        java.lang.String str;
        kotlin.Pair[] pairArr;
        java.lang.Object bindSchemeEnrolled;
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput;
        java.lang.String str2;
        kotlin.Pair[] pairArr2;
        com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest3;
        java.lang.String str3;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation;
        com.apollographql.apollo.ApolloCall addExecutionContext;
        boolean z;
        com.apollographql.apollo.ApolloCall apolloCall;
        com.paypal.oslo.core.network.graphql.CallConfig callConfig;
        java.lang.Object execute;
        java.util.Map map;
        com.apollographql.apollo.ApolloCall apolloCall2;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation2;
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput2;
        java.lang.String str4;
        com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest4;
        java.lang.String partialToken;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$login$1) {
            loginRepositoryImpl$login$1 = (com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$login$1) continuation;
            if ((loginRepositoryImpl$login$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                loginRepositoryImpl$login$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = loginRepositoryImpl$login$1.isOutputSupportedForhNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loginRepositoryImpl$login$1.getOutputSizes;
                int i2 = 1;
                int i3 = 2;
                java.util.Map map2 = null;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                java.lang.Object[] objArr3 = 0;
                java.lang.Object[] objArr4 = 0;
                java.lang.Object[] objArr5 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase = this.getInputFormats;
                    loginRequest2 = loginRequest;
                    loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = loginRequest2;
                    loginRepositoryImpl$login$1.getOutputSizes = 1;
                    obj = getRememberedUserUseCase.invoke(loginRepositoryImpl$login$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            i2 = loginRepositoryImpl$login$1.Camera2StreamConfigurationMap;
                            str3 = (java.lang.String) loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM;
                            pairArr = (kotlin.Pair[]) loginRepositoryImpl$login$1.getInputFormats;
                            pairArr2 = (kotlin.Pair[]) loginRepositoryImpl$login$1.getOutputFormats;
                            loginUserMutation = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation) loginRepositoryImpl$login$1.getInputSizeshNQ4ISI;
                            authenticateInput = (com.paypal.oslo.api.graphql.schema.type.AuthenticateInput) loginRepositoryImpl$login$1.getOutputMinFrameDuration;
                            str2 = (java.lang.String) loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor;
                            loginRequest3 = (com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            pairArr[i2] = kotlin.TuplesKt.to(str3, obj);
                            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(pairArr2);
                            addExecutionContext = this.getHighSpeedVideoFpsRangesFor.get().mutation(loginUserMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getLogin(), null, mapOf, 2, null));
                            z = loginRequest3 instanceof com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput;
                            if (z || (partialToken = ((com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput) loginRequest3).getPartialToken()) == null || (apolloCall = addExecutionContext.addHttpHeader("Authorization", "Bearer ".concat(java.lang.String.valueOf(partialToken)))) == null) {
                                apolloCall = addExecutionContext;
                            }
                            callConfig = !z ? new com.paypal.oslo.core.network.graphql.CallConfig(com.paypal.oslo.core.network.graphql.AuthType.None.INSTANCE, map2, i3, objArr5 == true ? 1 : 0) : loginRequest3.getIntent() == com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LINK_ACCOUNT ? new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("link_account", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), objArr4 == true ? 1 : 0, i3, objArr3 == true ? 1 : 0) : new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("login", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0);
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest3);
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            loginRepositoryImpl$login$1.getOutputMinFrameDuration = authenticateInput;
                            loginRepositoryImpl$login$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginUserMutation);
                            loginRepositoryImpl$login$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapOf);
                            loginRepositoryImpl$login$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                            loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                            loginRepositoryImpl$login$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                            loginRepositoryImpl$login$1.getOutputSizes = 3;
                            execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, loginRepositoryImpl$login$1);
                            if (execute != coroutine_suspended) {
                                map = mapOf;
                                obj = execute;
                                apolloCall2 = apolloCall;
                                loginUserMutation2 = loginUserMutation;
                                authenticateInput2 = authenticateInput;
                                str4 = str2;
                                loginRequest4 = loginRequest3;
                                ior = (arrow.core.Ior) obj;
                                if (!(ior instanceof arrow.core.Ior.Left)) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                int i4 = loginRepositoryImpl$login$1.getHighSpeedVideoSizes;
                                int i5 = loginRepositoryImpl$login$1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj);
                                return (arrow.core.Either) obj;
                            }
                            if (i != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = loginRepositoryImpl$login$1.getHighSpeedVideoSizes;
                            int i7 = loginRepositoryImpl$login$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return (arrow.core.Either) obj;
                        }
                        callConfig = (com.paypal.oslo.core.network.graphql.CallConfig) loginRepositoryImpl$login$1.getOutputStallDurationlomOqCM;
                        apolloCall2 = (com.apollographql.apollo.ApolloCall) loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM;
                        addExecutionContext = (com.apollographql.apollo.ApolloCall) loginRepositoryImpl$login$1.getInputFormats;
                        map = (java.util.Map) loginRepositoryImpl$login$1.getOutputFormats;
                        loginUserMutation2 = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation) loginRepositoryImpl$login$1.getInputSizeshNQ4ISI;
                        authenticateInput2 = (com.paypal.oslo.api.graphql.schema.type.AuthenticateInput) loginRepositoryImpl$login$1.getOutputMinFrameDuration;
                        str4 = (java.lang.String) loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor;
                        loginRequest4 = (com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        ior = (arrow.core.Ior) obj;
                        if (!(ior instanceof arrow.core.Ior.Left)) {
                            return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        }
                        if (ior instanceof arrow.core.Ior.Right) {
                            com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest4);
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            loginRepositoryImpl$login$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticateInput2);
                            loginRepositoryImpl$login$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginUserMutation2);
                            loginRepositoryImpl$login$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                            loginRepositoryImpl$login$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                            loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall2);
                            loginRepositoryImpl$login$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                            loginRepositoryImpl$login$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            loginRepositoryImpl$login$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData);
                            loginRepositoryImpl$login$1.Camera2StreamConfigurationMap = 0;
                            loginRepositoryImpl$login$1.getHighSpeedVideoSizes = 0;
                            loginRepositoryImpl$login$1.getOutputSizes = 4;
                            obj = getHighSpeedVideoFpsRangesFor(authenticateInput2, graphQLData, null, loginRepositoryImpl$login$1);
                        } else {
                            if (!(ior instanceof arrow.core.Ior.Both)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                            java.lang.Object leftValue = both.getLeftValue();
                            com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                            com.paypal.oslo.feature.identity.login.domain.model.LoginError highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(callError);
                            if (highSpeedVideoFpsRanges instanceof com.paypal.oslo.feature.identity.login.domain.model.DeviceNotBound) {
                                return arrow.core.EitherKt.left(highSpeedVideoFpsRanges);
                            }
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest4);
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            loginRepositoryImpl$login$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticateInput2);
                            loginRepositoryImpl$login$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginUserMutation2);
                            loginRepositoryImpl$login$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                            loginRepositoryImpl$login$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                            loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall2);
                            loginRepositoryImpl$login$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                            loginRepositoryImpl$login$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            loginRepositoryImpl$login$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callError);
                            loginRepositoryImpl$login$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData2);
                            loginRepositoryImpl$login$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRanges);
                            loginRepositoryImpl$login$1.Camera2StreamConfigurationMap = 0;
                            loginRepositoryImpl$login$1.getHighSpeedVideoSizes = 0;
                            loginRepositoryImpl$login$1.getOutputSizes = 5;
                            obj = getHighSpeedVideoFpsRangesFor(authenticateInput2, graphQLData2, callError, loginRepositoryImpl$login$1);
                        }
                        return coroutine_suspended;
                    }
                    loginRequest2 = (com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either.Right) either).getValue();
                    if (getHighResolutionOutputSizeshNQ4ISI.matches(rememberedUser.getPublicCredential())) {
                        str = rememberedUser.getPublicCredential();
                        com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig = this.Camera2StreamConfigurationMap.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authenticationConfig, "");
                        com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig2 = authenticationConfig;
                        java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData = this.getOutputFormats.getCheckoutInputData();
                        com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput graphQL = checkoutInputData != null ? com.paypal.oslo.feature.identity.login.data.mapper.CheckoutDataMapperKt.toGraphQL(checkoutInputData) : null;
                        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent checkoutWebSSOIntent = this.getOutputStallDurationlomOqCM.getCheckoutWebSSOIntent();
                        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildAuthInput = com.paypal.oslo.feature.identity.login.data.InputBuildersKt.buildAuthInput(loginRequest2, authenticationConfig2, set, str, graphQL, checkoutWebSSOIntent != null ? com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationIntent(checkoutWebSSOIntent) : null);
                        com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation3 = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(buildAuthInput);
                        pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("bindSchemeAvailable", this.getHighSpeedVideoSizes.getBindSchemeAvailable());
                        com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider = this.getHighSpeedVideoSizes;
                        loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = loginRequest2;
                        loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        loginRepositoryImpl$login$1.getOutputMinFrameDuration = buildAuthInput;
                        loginRepositoryImpl$login$1.getInputSizeshNQ4ISI = loginUserMutation3;
                        loginRepositoryImpl$login$1.getOutputFormats = pairArr;
                        loginRepositoryImpl$login$1.getInputFormats = pairArr;
                        loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM = "bindSchemeEnrolled";
                        loginRepositoryImpl$login$1.Camera2StreamConfigurationMap = 1;
                        loginRepositoryImpl$login$1.getOutputSizes = 2;
                        bindSchemeEnrolled = bindSchemeProvider.getBindSchemeEnrolled(loginRepositoryImpl$login$1);
                        if (bindSchemeEnrolled != coroutine_suspended) {
                            authenticateInput = buildAuthInput;
                            str2 = str;
                            obj = bindSchemeEnrolled;
                            pairArr2 = pairArr;
                            loginRequest3 = loginRequest2;
                            str3 = "bindSchemeEnrolled";
                            loginUserMutation = loginUserMutation3;
                            pairArr[i2] = kotlin.TuplesKt.to(str3, obj);
                            java.util.Map mapOf2 = kotlin.collections.MapsKt.mapOf(pairArr2);
                            addExecutionContext = this.getHighSpeedVideoFpsRangesFor.get().mutation(loginUserMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getLogin(), null, mapOf2, 2, null));
                            z = loginRequest3 instanceof com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput;
                            if (z) {
                            }
                            apolloCall = addExecutionContext;
                            if (!z) {
                            }
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest3);
                            loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            loginRepositoryImpl$login$1.getOutputMinFrameDuration = authenticateInput;
                            loginRepositoryImpl$login$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginUserMutation);
                            loginRepositoryImpl$login$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapOf2);
                            loginRepositoryImpl$login$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                            loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                            loginRepositoryImpl$login$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                            loginRepositoryImpl$login$1.getOutputSizes = 3;
                            execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, loginRepositoryImpl$login$1);
                            if (execute != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                str = null;
                com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig3 = this.Camera2StreamConfigurationMap.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authenticationConfig3, "");
                com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig22 = authenticationConfig3;
                java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set2 = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData2 = this.getOutputFormats.getCheckoutInputData();
                if (checkoutInputData2 != null) {
                }
                com.paypal.oslo.core.identity.domain.model.SessionTransferIntent checkoutWebSSOIntent2 = this.getOutputStallDurationlomOqCM.getCheckoutWebSSOIntent();
                com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildAuthInput2 = com.paypal.oslo.feature.identity.login.data.InputBuildersKt.buildAuthInput(loginRequest2, authenticationConfig22, set2, str, graphQL, checkoutWebSSOIntent2 != null ? com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationIntent(checkoutWebSSOIntent2) : null);
                com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation32 = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(buildAuthInput2);
                pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("bindSchemeAvailable", this.getHighSpeedVideoSizes.getBindSchemeAvailable());
                com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider2 = this.getHighSpeedVideoSizes;
                loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = loginRequest2;
                loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                loginRepositoryImpl$login$1.getOutputMinFrameDuration = buildAuthInput2;
                loginRepositoryImpl$login$1.getInputSizeshNQ4ISI = loginUserMutation32;
                loginRepositoryImpl$login$1.getOutputFormats = pairArr;
                loginRepositoryImpl$login$1.getInputFormats = pairArr;
                loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM = "bindSchemeEnrolled";
                loginRepositoryImpl$login$1.Camera2StreamConfigurationMap = 1;
                loginRepositoryImpl$login$1.getOutputSizes = 2;
                bindSchemeEnrolled = bindSchemeProvider2.getBindSchemeEnrolled(loginRepositoryImpl$login$1);
                if (bindSchemeEnrolled != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        loginRepositoryImpl$login$1 = new com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$login$1(this, continuation);
        java.lang.Object obj2 = loginRepositoryImpl$login$1.isOutputSupportedForhNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loginRepositoryImpl$login$1.getOutputSizes;
        int i22 = 1;
        int i32 = 2;
        java.util.Map map22 = null;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr32 = 0;
        java.lang.Object[] objArr42 = 0;
        java.lang.Object[] objArr52 = 0;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        str = null;
        com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig32 = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authenticationConfig32, "");
        com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig222 = authenticationConfig32;
        java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set22 = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData22 = this.getOutputFormats.getCheckoutInputData();
        if (checkoutInputData22 != null) {
        }
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent checkoutWebSSOIntent22 = this.getOutputStallDurationlomOqCM.getCheckoutWebSSOIntent();
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildAuthInput22 = com.paypal.oslo.feature.identity.login.data.InputBuildersKt.buildAuthInput(loginRequest2, authenticationConfig222, set22, str, graphQL, checkoutWebSSOIntent22 != null ? com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationIntent(checkoutWebSSOIntent22) : null);
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation322 = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(buildAuthInput22);
        pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("bindSchemeAvailable", this.getHighSpeedVideoSizes.getBindSchemeAvailable());
        com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider22 = this.getHighSpeedVideoSizes;
        loginRepositoryImpl$login$1.getHighSpeedVideoFpsRanges = loginRequest2;
        loginRepositoryImpl$login$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        loginRepositoryImpl$login$1.getOutputMinFrameDuration = buildAuthInput22;
        loginRepositoryImpl$login$1.getInputSizeshNQ4ISI = loginUserMutation322;
        loginRepositoryImpl$login$1.getOutputFormats = pairArr;
        loginRepositoryImpl$login$1.getInputFormats = pairArr;
        loginRepositoryImpl$login$1.getOutputMinFrameDurationlomOqCM = "bindSchemeEnrolled";
        loginRepositoryImpl$login$1.Camera2StreamConfigurationMap = 1;
        loginRepositoryImpl$login$1.getOutputSizes = 2;
        bindSchemeEnrolled = bindSchemeProvider22.getBindSchemeEnrolled(loginRepositoryImpl$login$1);
        if (bindSchemeEnrolled != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> graphQLData, com.paypal.oslo.core.network.graphql.error.CallError callError, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.login.domain.model.LoginError, ? extends com.paypal.oslo.feature.identity.login.domain.model.LoginResult>> continuation) {
        com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$mapResponseToLoginResult$1 loginRepositoryImpl$mapResponseToLoginResult$1;
        int i;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate;
        com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult;
        com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken;
        com.paypal.oslo.feature.identity.api.model.CheckoutData domain;
        java.lang.String authorizationCode;
        java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation> operations;
        java.util.ArrayList emptyList;
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation postAuthenticationOperation;
        java.lang.Object obj;
        com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$mapResponseToLoginResult$1) {
            loginRepositoryImpl$mapResponseToLoginResult$1 = (com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$mapResponseToLoginResult$1) continuation;
            if ((loginRepositoryImpl$mapResponseToLoginResult$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                loginRepositoryImpl$mapResponseToLoginResult$1.getInputFormats -= 2147483648;
                java.lang.Object obj2 = loginRepositoryImpl$mapResponseToLoginResult$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loginRepositoryImpl$mapResponseToLoginResult$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data data = graphQLData.getData();
                    if (data == null || (authenticate = data.getAuthenticate()) == null) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.login.domain.model.AuthError(this.getOutputSizes.mapCallErrorToString(callError)));
                    }
                    if (authenticate.getOnAuthenticationChallengeResult() != null) {
                        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired(com.paypal.oslo.feature.identity.login.data.mapper.AuthOutputMapperKt.toChallengeResult(authenticate.getOnAuthenticationChallengeResult(), com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthIntent(authenticateInput.getIntent()))));
                    }
                    if (authenticate.getOnAuthenticationTokenResult() != null) {
                        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult2 = authenticate.getOnAuthenticationTokenResult();
                        java.lang.String token = onAuthenticationTokenResult2.getToken();
                        java.lang.String obj3 = onAuthenticationTokenResult2.getExpiresAtTime().toString();
                        int expiresInSec = onAuthenticationTokenResult2.getExpiresInSec();
                        if (authenticateInput.getGrantType().getOrNull() == com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.USER_PREVIEW) {
                            authenticationTier = com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_LONG_LIVED_SESSION;
                        } else {
                            authenticationTier = com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_AUTHENTICATED_STATE;
                        }
                        com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken2 = new com.paypal.oslo.feature.identity.foundation.model.UserAccessToken(io.ktor.http.auth.AuthScheme.Bearer, token, obj3, expiresInSec, authenticationTier, null, onAuthenticationTokenResult2.getPayerId(), 32, null);
                        com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = com.paypal.oslo.feature.identity.storage.model.UserAccessTokenDataKt.toUserAccessTokenData(userAccessToken2, this.getInputSizeshNQ4ISI.elapsedRealtimeMillis());
                        com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.getHighResolutionOutputSizeshNQ4ISI;
                        loginRepositoryImpl$mapResponseToLoginResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticateInput);
                        loginRepositoryImpl$mapResponseToLoginResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData);
                        loginRepositoryImpl$mapResponseToLoginResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callError);
                        loginRepositoryImpl$mapResponseToLoginResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticate);
                        loginRepositoryImpl$mapResponseToLoginResult$1.getHighResolutionOutputSizeshNQ4ISI = onAuthenticationTokenResult2;
                        loginRepositoryImpl$mapResponseToLoginResult$1.getOutputMinFrameDuration = userAccessToken2;
                        loginRepositoryImpl$mapResponseToLoginResult$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenData);
                        loginRepositoryImpl$mapResponseToLoginResult$1.getInputFormats = 1;
                        if (identityTokenStorage.saveUserAccessToken(userAccessTokenData, loginRepositoryImpl$mapResponseToLoginResult$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        onAuthenticationTokenResult = onAuthenticationTokenResult2;
                        userAccessToken = userAccessToken2;
                    } else {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.login.domain.model.AuthError(this.getOutputSizes.mapCallErrorToString(callError)));
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    userAccessToken = (com.paypal.oslo.feature.identity.foundation.model.UserAccessToken) loginRepositoryImpl$mapResponseToLoginResult$1.getOutputMinFrameDuration;
                    onAuthenticationTokenResult = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult) loginRepositoryImpl$mapResponseToLoginResult$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "User access token saved with expiry", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expiresInSec", kotlin.coroutines.jvm.internal.Boxing.boxInt(onAuthenticationTokenResult.getExpiresInSec())), kotlin.TuplesKt.to("tier", userAccessToken.getAuthenticationTier().name())), null, 4, null);
                com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData = onAuthenticationTokenResult.getCheckoutData();
                domain = (checkoutData != null || (identityCheckoutDataFragment = checkoutData.getIdentityCheckoutDataFragment()) == null) ? null : com.paypal.oslo.feature.identity.login.data.mapper.CheckoutDataMapperKt.toDomain(identityCheckoutDataFragment);
                if (domain != null) {
                    this.getOutputMinFrameDuration.setCheckoutOutputData(domain);
                }
                authorizationCode = onAuthenticationTokenResult.getAuthorizationCode();
                if (authorizationCode != null) {
                    this.getHighSpeedVideoSizesFor.setAuthCode(authorizationCode);
                }
                operations = onAuthenticationTokenResult.getOperations();
                if (operations != null) {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation operation : operations) {
                        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType type = operation.getType();
                        if (type != null) {
                            java.util.Iterator<E> it = com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.getEntries().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType) obj).name(), type.getRawValue())) {
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType = (com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType) obj;
                            if (postAuthOperationType == null) {
                                postAuthOperationType = com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.UNKNOWN;
                            }
                            java.lang.Boolean mandatory = operation.getMandatory();
                            boolean booleanValue = mandatory != null ? mandatory.booleanValue() : false;
                            java.lang.Boolean background = operation.getBackground();
                            postAuthenticationOperation = new com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation(postAuthOperationType, booleanValue, background != null ? background.booleanValue() : false);
                        } else {
                            postAuthenticationOperation = null;
                        }
                        if (postAuthenticationOperation != null) {
                            arrayList.add(postAuthenticationOperation);
                        }
                    }
                    emptyList = arrayList;
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.login.domain.model.Success(userAccessToken, emptyList));
            }
        }
        loginRepositoryImpl$mapResponseToLoginResult$1 = new com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl$mapResponseToLoginResult$1(this, continuation);
        java.lang.Object obj22 = loginRepositoryImpl$mapResponseToLoginResult$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loginRepositoryImpl$mapResponseToLoginResult$1.getInputFormats;
        if (i != 0) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "User access token saved with expiry", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expiresInSec", kotlin.coroutines.jvm.internal.Boxing.boxInt(onAuthenticationTokenResult.getExpiresInSec())), kotlin.TuplesKt.to("tier", userAccessToken.getAuthenticationTier().name())), null, 4, null);
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData2 = onAuthenticationTokenResult.getCheckoutData();
        if (checkoutData2 != null) {
        }
        if (domain != null) {
        }
        authorizationCode = onAuthenticationTokenResult.getAuthorizationCode();
        if (authorizationCode != null) {
        }
        operations = onAuthenticationTokenResult.getOperations();
        if (operations != null) {
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.login.domain.model.Success(userAccessToken, emptyList));
    }

    private final com.paypal.oslo.feature.identity.login.domain.model.LoginError getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError;
        java.util.Map<java.lang.String, java.lang.Object> extensions;
        java.lang.String str = null;
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL ? (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0 : null;
        if (graphQL != null && (graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9578firstOrNullimpl(graphQL.m11659getErrors1X0FAY())) != null && (extensions = graphQLError.getExtensions()) != null) {
            java.lang.Object obj = extensions.get("details");
            java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
            java.lang.Object firstOrNull = list != null ? kotlin.collections.CollectionsKt.firstOrNull(list) : null;
            java.util.Map map = firstOrNull instanceof java.util.Map ? (java.util.Map) firstOrNull : null;
            java.lang.Object obj2 = map != null ? map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE) : null;
            java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str2 == null) {
                java.lang.Object obj3 = extensions.get("name");
                if (obj3 instanceof java.lang.String) {
                    str = (java.lang.String) obj3;
                }
            } else {
                str = str2;
            }
        }
        if (str != null && Camera2StreamConfigurationMap.contains(str)) {
            return new com.paypal.oslo.feature.identity.login.domain.model.DeviceNotBound(str);
        }
        return new com.paypal.oslo.feature.identity.login.domain.model.AuthError(this.getOutputSizes.mapCallErrorToString(p0));
    }
}
