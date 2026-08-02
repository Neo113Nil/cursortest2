package com.paypal.oslo.feature.identity.devicebinding.data.repository;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010)\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010-\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00100"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/repository/DeviceBindingRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingRepository;", "Landroid/content/Context;", "context", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/identity/devicebinding/security/BiometricKeyWrapper;", "biometricKeyWrapper", "Lcom/paypal/oslo/feature/identity/devicebinding/security/NonBiometricKeyWrapper;", "nonBiometricKeyWrapper", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/BiometricBindEligibilityRepository;", "biometricBindEligibilityRepository", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/LLSBindEligibilityRepository;", "llsBindEligibilityRepository", "Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;", "bindSchemeProvider", "<init>", "(Landroid/content/Context;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/identity/devicebinding/security/BiometricKeyWrapper;Lcom/paypal/oslo/feature/identity/devicebinding/security/NonBiometricKeyWrapper;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/BiometricBindEligibilityRepository;Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/LLSBindEligibilityRepository;Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;)V", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingInput;", "deviceBindingInput", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingOutput;", "bind", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/BindSchemeInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/BindSchemeInput;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Lcom/paypal/oslo/api/graphql/schema/type/BindSchemeInput;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/identity/devicebinding/security/BiometricKeyWrapper;", "getOutputFormats", "Lcom/paypal/oslo/feature/identity/devicebinding/security/NonBiometricKeyWrapper;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/BiometricBindEligibilityRepository;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/LLSBindEligibilityRepository;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceBindingRepositoryImpl implements com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider getHighSpeedVideoSizesFor;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DeviceBindingRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper biometricKeyWrapper, com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper nonBiometricKeyWrapper, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository biometricBindEligibilityRepository, com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository lLSBindEligibilityRepository, com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricKeyWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonBiometricKeyWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricBindEligibilityRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lLSBindEligibilityRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindSchemeProvider, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = biometricKeyWrapper;
        this.getHighSpeedVideoSizes = nonBiometricKeyWrapper;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceBindingTokenStorage;
        this.getInputSizeshNQ4ISI = biometricBindEligibilityRepository;
        this.getOutputMinFrameDuration = lLSBindEligibilityRepository;
        this.getHighSpeedVideoSizesFor = bindSchemeProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0340 A[Catch: all -> 0x0422, RaiseCancellationException -> 0x0426, TryCatch #11 {RaiseCancellationException -> 0x0426, all -> 0x0422, blocks: (B:17:0x033a, B:19:0x0340, B:25:0x03d9, B:26:0x03f6, B:28:0x03fc, B:30:0x0412), top: B:16:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03d9 A[Catch: all -> 0x0422, RaiseCancellationException -> 0x0426, TryCatch #11 {RaiseCancellationException -> 0x0426, all -> 0x0422, blocks: (B:17:0x033a, B:19:0x0340, B:25:0x03d9, B:26:0x03f6, B:28:0x03fc, B:30:0x0412), top: B:16:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e8 A[Catch: all -> 0x00cf, RaiseCancellationException -> 0x00d3, TRY_ENTER, TryCatch #8 {RaiseCancellationException -> 0x00d3, all -> 0x00cf, blocks: (B:50:0x00c8, B:52:0x02e2, B:55:0x02e8, B:57:0x02ec, B:58:0x030d, B:60:0x0315, B:62:0x031b, B:64:0x0321, B:66:0x042a, B:67:0x043a, B:68:0x02f6, B:70:0x02fa, B:71:0x043b, B:72:0x0440, B:73:0x0441, B:75:0x044d, B:77:0x0457, B:79:0x045b, B:81:0x045f, B:82:0x0464, B:83:0x0465, B:84:0x0485, B:85:0x04aa, B:86:0x04b2, B:87:0x046f, B:88:0x0488, B:90:0x048c, B:91:0x04b3, B:92:0x04b8), top: B:49:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0441 A[Catch: all -> 0x00cf, RaiseCancellationException -> 0x00d3, TryCatch #8 {RaiseCancellationException -> 0x00d3, all -> 0x00cf, blocks: (B:50:0x00c8, B:52:0x02e2, B:55:0x02e8, B:57:0x02ec, B:58:0x030d, B:60:0x0315, B:62:0x031b, B:64:0x0321, B:66:0x042a, B:67:0x043a, B:68:0x02f6, B:70:0x02fa, B:71:0x043b, B:72:0x0440, B:73:0x0441, B:75:0x044d, B:77:0x0457, B:79:0x045b, B:81:0x045f, B:82:0x0464, B:83:0x0465, B:84:0x0485, B:85:0x04aa, B:86:0x04b2, B:87:0x046f, B:88:0x0488, B:90:0x048c, B:91:0x04b3, B:92:0x04b8), top: B:49:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v28, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x03ba -> B:15:0x03c9). Please report as a decompilation issue!!! */
    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object bind(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput>> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl$bind$1 deviceBindingRepositoryImpl$bind$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Throwable th;
        arrow.core.raise.RaiseCancellationException raiseCancellationException;
        kotlin.Pair[] pairArr;
        java.lang.String str;
        java.lang.Object obj;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.util.Collection collection;
        com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId;
        kotlin.Pair[] pairArr2;
        int i2;
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.util.List list;
        com.apollographql.apollo.ApolloCall apolloCall;
        int i3;
        com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput bindAuthenticationDeviceInput;
        int i4;
        int i5;
        int i6;
        boolean isRight;
        int i7;
        int i8;
        java.lang.Object execute;
        java.lang.Object obj2;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        int i9;
        int i10;
        com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput bindAuthenticationDeviceInput2;
        java.util.Collection collection2;
        arrow.core.Ior ior;
        java.lang.Object obj3;
        java.lang.Object api;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.identity.graphql.BindAuthenticationDeviceMutation.BindAuthenticationDevice bindAuthenticationDevice;
        java.lang.String token;
        java.util.List list2;
        java.lang.Object obj4;
        java.util.Iterator it;
        java.lang.String str2;
        arrow.core.Ior ior2;
        int i11;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2;
        int i12;
        int i13;
        java.util.List list3;
        int i14;
        int i15;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl$bind$1) {
                deviceBindingRepositoryImpl$bind$1 = (com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl$bind$1) continuation;
                if ((deviceBindingRepositoryImpl$bind$1.toString & Integer.MIN_VALUE) != 0) {
                    deviceBindingRepositoryImpl$bind$1.toString -= 2147483648;
                    java.lang.Object obj5 = deviceBindingRepositoryImpl$bind$1.coroutineBoundary;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = deviceBindingRepositoryImpl$bind$1.toString;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj5);
                        arrow.core.raise.DefaultRaise defaultRaise5 = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise6 = defaultRaise5;
                            if (deviceBindingInput.getMethods().isEmpty()) {
                                defaultRaise6.raise(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.EmptyMethods.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> methods = deviceBindingInput.getMethods();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj6 : methods) {
                                int i16 = com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) obj6).ordinal()];
                                if (i16 == 1) {
                                    isRight = this.getInputSizeshNQ4ISI.isEligible().isRight();
                                } else {
                                    if (i16 != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    isRight = this.getOutputMinFrameDuration.isEligible().isRight();
                                }
                                if (isRight) {
                                    arrayList.add(obj6);
                                }
                            }
                            java.util.ArrayList arrayList2 = arrayList;
                            if (arrayList2.isEmpty()) {
                                defaultRaise6.raise(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NoEligibleMethods.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.util.Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                com.paypal.oslo.api.graphql.schema.type.BindSchemeInput highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) it2.next());
                                if (highSpeedVideoFpsRangesFor != null) {
                                    arrayList3.add(highSpeedVideoFpsRangesFor);
                                }
                            }
                            java.util.ArrayList arrayList4 = arrayList3;
                            if (arrayList4.isEmpty()) {
                                defaultRaise6.raise(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.KeyGenerationFailed.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput bindAuthenticationDeviceInput3 = new com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput(com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMapperKt.toGraphQL(deviceBindingInput.getFlowContext().getSource()), arrayList4);
                            com.apollographql.apollo.ApolloCall mutation = this.Camera2StreamConfigurationMap.mutation(new com.paypal.oslo.feature.identity.graphql.BindAuthenticationDeviceMutation(bindAuthenticationDeviceInput3));
                            com.paypal.oslo.core.network.graphql.RiskSourceId deviceBinding = com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getDeviceBinding();
                            pairArr = new kotlin.Pair[2];
                            pairArr[0] = kotlin.TuplesKt.to("bindSchemeAvailable", this.getHighSpeedVideoSizesFor.getBindSchemeAvailable());
                            com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider = this.getHighSpeedVideoSizesFor;
                            deviceBindingRepositoryImpl$bind$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput);
                            deviceBindingRepositoryImpl$bind$1.getOutputFormats = defaultRaise5;
                            deviceBindingRepositoryImpl$bind$1.getOutputSizes = defaultRaise6;
                            deviceBindingRepositoryImpl$bind$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList4);
                            deviceBindingRepositoryImpl$bind$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bindAuthenticationDeviceInput3);
                            deviceBindingRepositoryImpl$bind$1.getOutputStallDuration = pairArr;
                            deviceBindingRepositoryImpl$bind$1.isOutputSupportedFor = arrayList2;
                            deviceBindingRepositoryImpl$bind$1.isOutputSupportedForhNQ4ISI = "bindSchemeEnrolled";
                            deviceBindingRepositoryImpl$bind$1.getValidOutputFormatsForInputhNQ4ISI = pairArr;
                            deviceBindingRepositoryImpl$bind$1.unwrapAs = deviceBinding;
                            deviceBindingRepositoryImpl$bind$1.getInputSizeshNQ4ISI = mutation;
                            deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRangesFor = 0;
                            deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRanges = 0;
                            deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizes = 0;
                            deviceBindingRepositoryImpl$bind$1.Camera2StreamConfigurationMap = 0;
                            deviceBindingRepositoryImpl$bind$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            deviceBindingRepositoryImpl$bind$1.toString = 1;
                            java.lang.Object bindSchemeEnrolled = bindSchemeProvider.getBindSchemeEnrolled(deviceBindingRepositoryImpl$bind$1);
                            if (bindSchemeEnrolled == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str = "bindSchemeEnrolled";
                            obj = coroutine_suspended;
                            defaultRaise2 = defaultRaise6;
                            collection = arrayList4;
                            riskSourceId = deviceBinding;
                            pairArr2 = pairArr;
                            i2 = 0;
                            deviceBindingInput2 = deviceBindingInput;
                            defaultRaise3 = defaultRaise5;
                            list = arrayList2;
                            obj5 = bindSchemeEnrolled;
                            apolloCall = mutation;
                            i3 = 0;
                            bindAuthenticationDeviceInput = bindAuthenticationDeviceInput3;
                            i4 = 1;
                            i5 = 0;
                            i6 = 0;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            defaultRaise = defaultRaise5;
                            raiseCancellationException = e;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
                        } catch (java.lang.Throwable th2) {
                            defaultRaise = defaultRaise5;
                            th = th2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else if (i == 1) {
                        int i17 = deviceBindingRepositoryImpl$bind$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i18 = deviceBindingRepositoryImpl$bind$1.Camera2StreamConfigurationMap;
                        int i19 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizes;
                        int i20 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRanges;
                        i3 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRangesFor;
                        com.apollographql.apollo.ApolloCall apolloCall2 = (com.apollographql.apollo.ApolloCall) deviceBindingRepositoryImpl$bind$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId2 = (com.paypal.oslo.core.network.graphql.RiskSourceId) deviceBindingRepositoryImpl$bind$1.unwrapAs;
                        kotlin.Pair[] pairArr3 = (kotlin.Pair[]) deviceBindingRepositoryImpl$bind$1.getValidOutputFormatsForInputhNQ4ISI;
                        str = (java.lang.String) deviceBindingRepositoryImpl$bind$1.isOutputSupportedForhNQ4ISI;
                        list = (java.util.List) deviceBindingRepositoryImpl$bind$1.isOutputSupportedFor;
                        kotlin.Pair[] pairArr4 = (kotlin.Pair[]) deviceBindingRepositoryImpl$bind$1.getOutputStallDuration;
                        com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput bindAuthenticationDeviceInput4 = (com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput) deviceBindingRepositoryImpl$bind$1.getOutputStallDurationlomOqCM;
                        collection = (java.util.List) deviceBindingRepositoryImpl$bind$1.getOutputSizeshNQ4ISI;
                        ?? r3 = (arrow.core.raise.Raise) deviceBindingRepositoryImpl$bind$1.getOutputSizes;
                        arrow.core.raise.DefaultRaise defaultRaise7 = (arrow.core.raise.DefaultRaise) deviceBindingRepositoryImpl$bind$1.getOutputFormats;
                        deviceBindingInput2 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput) deviceBindingRepositoryImpl$bind$1.getInputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj5);
                            obj = coroutine_suspended;
                            defaultRaise2 = r3;
                            defaultRaise3 = defaultRaise7;
                            riskSourceId = riskSourceId2;
                            apolloCall = apolloCall2;
                            bindAuthenticationDeviceInput = bindAuthenticationDeviceInput4;
                            i5 = i19;
                            i2 = i18;
                            pairArr2 = pairArr3;
                            pairArr = pairArr4;
                            i4 = i17;
                            i6 = i20;
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            raiseCancellationException = e2;
                            defaultRaise = defaultRaise7;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            defaultRaise = defaultRaise7;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else if (i == 2) {
                        i9 = deviceBindingRepositoryImpl$bind$1.Camera2StreamConfigurationMap;
                        i8 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizes;
                        i7 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRanges;
                        i10 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRangesFor;
                        java.util.List list4 = (java.util.List) deviceBindingRepositoryImpl$bind$1.getOutputStallDuration;
                        bindAuthenticationDeviceInput2 = (com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput) deviceBindingRepositoryImpl$bind$1.getOutputStallDurationlomOqCM;
                        collection2 = (java.util.List) deviceBindingRepositoryImpl$bind$1.getOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) deviceBindingRepositoryImpl$bind$1.getOutputSizes;
                        defaultRaise4 = (arrow.core.raise.DefaultRaise) deviceBindingRepositoryImpl$bind$1.getOutputFormats;
                        deviceBindingInput3 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput) deviceBindingRepositoryImpl$bind$1.getInputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj5);
                            list = list4;
                            obj2 = coroutine_suspended;
                            ior = (arrow.core.Ior) obj5;
                            if (!(ior instanceof arrow.core.Ior.Left)) {
                                com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                                if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                                    com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                                    if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                                        com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                                        api = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api(new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError(httpError.getCode(), httpError.getBody()));
                                    } else {
                                        if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) && !(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        api = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError.INSTANCE);
                                    }
                                    obj3 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError) api;
                                } else {
                                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    obj3 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError) new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getMessage(), null);
                                }
                                raise.raise(obj3);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            if (ior instanceof arrow.core.Ior.Right) {
                                graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                            } else {
                                if (!(ior instanceof arrow.core.Ior.Both)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                            }
                            com.paypal.oslo.feature.identity.graphql.BindAuthenticationDeviceMutation.Data data = (com.paypal.oslo.feature.identity.graphql.BindAuthenticationDeviceMutation.Data) graphQLData.getData();
                            if (data == null || (bindAuthenticationDevice = data.getBindAuthenticationDevice()) == null || (token = bindAuthenticationDevice.getToken()) == null) {
                                raise.raise(new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown("Missing data in device binding response", null));
                                throw new kotlin.KotlinNothingValueException();
                            }
                            list2 = list;
                            obj4 = obj2;
                            it = list2.iterator();
                            str2 = token;
                            ior2 = ior;
                            i11 = i7;
                            graphQLData2 = graphQLData;
                            i12 = 0;
                            int i21 = i8;
                            i13 = i9;
                            defaultRaise = defaultRaise4;
                            list3 = list;
                            i14 = i10;
                            i15 = i21;
                            if (it.hasNext()) {
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e3) {
                            raiseCancellationException = e3;
                            defaultRaise = defaultRaise4;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            defaultRaise = defaultRaise4;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i22 = deviceBindingRepositoryImpl$bind$1.getOutputMinFrameDuration;
                        int i23 = deviceBindingRepositoryImpl$bind$1.getHighResolutionOutputSizeshNQ4ISI;
                        i13 = deviceBindingRepositoryImpl$bind$1.Camera2StreamConfigurationMap;
                        int i24 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizes;
                        int i25 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRanges;
                        i14 = deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRangesFor;
                        java.util.List list5 = (java.util.List) deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizesFor;
                        java.lang.Object obj7 = deviceBindingRepositoryImpl$bind$1.getInputSizeshNQ4ISI;
                        java.util.Iterator it3 = (java.util.Iterator) deviceBindingRepositoryImpl$bind$1.unwrapAs;
                        ?? r14 = (java.lang.Iterable) deviceBindingRepositoryImpl$bind$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str3 = (java.lang.String) deviceBindingRepositoryImpl$bind$1.isOutputSupportedForhNQ4ISI;
                        graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) deviceBindingRepositoryImpl$bind$1.isOutputSupportedFor;
                        arrow.core.Ior ior3 = (arrow.core.Ior) deviceBindingRepositoryImpl$bind$1.getOutputStallDuration;
                        com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput bindAuthenticationDeviceInput5 = (com.paypal.oslo.api.graphql.schema.type.BindAuthenticationDeviceInput) deviceBindingRepositoryImpl$bind$1.getOutputStallDurationlomOqCM;
                        java.util.Collection collection3 = (java.util.List) deviceBindingRepositoryImpl$bind$1.getOutputSizeshNQ4ISI;
                        arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) deviceBindingRepositoryImpl$bind$1.getOutputSizes;
                        arrow.core.raise.DefaultRaise defaultRaise8 = (arrow.core.raise.DefaultRaise) deviceBindingRepositoryImpl$bind$1.getOutputFormats;
                        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput4 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput) deviceBindingRepositoryImpl$bind$1.getInputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj5);
                            i12 = i23;
                            com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput5 = deviceBindingInput4;
                            defaultRaise = defaultRaise8;
                            java.util.List list6 = r14;
                            list3 = list5;
                            collection2 = collection3;
                            int i26 = i25;
                            int i27 = i24;
                            java.lang.Object obj8 = coroutine_suspended;
                            ior2 = ior3;
                            bindAuthenticationDeviceInput2 = bindAuthenticationDeviceInput5;
                            obj4 = obj8;
                            i15 = i27;
                            it = it3;
                            str2 = str3;
                            deviceBindingInput3 = deviceBindingInput5;
                            i11 = i26;
                            raise = raise2;
                            list2 = list6;
                            try {
                                if (it.hasNext()) {
                                    java.lang.Object next = it.next();
                                    int i28 = i12;
                                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) next;
                                    int i29 = i13;
                                    int i30 = i15;
                                    com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.getHighResolutionOutputSizeshNQ4ISI;
                                    deviceBindingRepositoryImpl$bind$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput3);
                                    deviceBindingRepositoryImpl$bind$1.getOutputFormats = defaultRaise;
                                    deviceBindingRepositoryImpl$bind$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                                    deviceBindingRepositoryImpl$bind$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(collection2);
                                    deviceBindingRepositoryImpl$bind$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bindAuthenticationDeviceInput2);
                                    deviceBindingRepositoryImpl$bind$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior2);
                                    deviceBindingRepositoryImpl$bind$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData2);
                                    deviceBindingRepositoryImpl$bind$1.isOutputSupportedForhNQ4ISI = str2;
                                    deviceBindingRepositoryImpl$bind$1.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                                    java.util.Iterator it4 = it;
                                    deviceBindingRepositoryImpl$bind$1.unwrapAs = it4;
                                    arrow.core.Ior ior4 = ior2;
                                    deviceBindingRepositoryImpl$bind$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                    deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizesFor = list3;
                                    deviceBindingRepositoryImpl$bind$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceAuthMethod);
                                    deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRangesFor = i14;
                                    deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRanges = i11;
                                    deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizes = i30;
                                    i26 = i11;
                                    deviceBindingRepositoryImpl$bind$1.Camera2StreamConfigurationMap = i29;
                                    deviceBindingRepositoryImpl$bind$1.getHighResolutionOutputSizeshNQ4ISI = i28;
                                    deviceBindingRepositoryImpl$bind$1.getOutputMinFrameDuration = 0;
                                    deviceBindingRepositoryImpl$bind$1.toString = 3;
                                    java.lang.Object saveBindingToken = deviceBindingTokenStorage.saveBindingToken(deviceAuthMethod, str2, deviceBindingRepositoryImpl$bind$1);
                                    obj8 = obj4;
                                    if (saveBindingToken == obj8) {
                                        return obj8;
                                    }
                                    i12 = i28;
                                    raise2 = raise;
                                    it3 = it4;
                                    i13 = i29;
                                    list6 = list2;
                                    deviceBindingInput5 = deviceBindingInput3;
                                    str3 = str2;
                                    i27 = i30;
                                    ior2 = ior4;
                                    obj4 = obj8;
                                    i15 = i27;
                                    it = it3;
                                    str2 = str3;
                                    deviceBindingInput3 = deviceBindingInput5;
                                    i11 = i26;
                                    raise = raise2;
                                    list2 = list6;
                                    if (it.hasNext()) {
                                        java.util.List list7 = list3;
                                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list7, 10)), 16));
                                        for (java.lang.Object obj9 : list7) {
                                            arrow.core.Either right = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(right, "");
                                            linkedHashMap.put(obj9, right);
                                        }
                                        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput(str2, linkedHashMap);
                                        defaultRaise.complete();
                                        return new arrow.core.Either.Right(deviceBindingOutput);
                                    }
                                }
                            } catch (arrow.core.raise.RaiseCancellationException e4) {
                                raiseCancellationException = e4;
                                defaultRaise.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e5) {
                            raiseCancellationException = e5;
                            defaultRaise = defaultRaise8;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            defaultRaise = defaultRaise8;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    pairArr2[i4] = kotlin.TuplesKt.to(str, obj5);
                    com.apollographql.apollo.ApolloCall addExecutionContext = apolloCall.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(riskSourceId, null, kotlin.collections.MapsKt.mapOf(pairArr), 2, null));
                    int i31 = i2;
                    int i32 = i5;
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("bind", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                    deviceBindingRepositoryImpl$bind$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput2);
                    deviceBindingRepositoryImpl$bind$1.getOutputFormats = defaultRaise3;
                    deviceBindingRepositoryImpl$bind$1.getOutputSizes = defaultRaise2;
                    deviceBindingRepositoryImpl$bind$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(collection);
                    deviceBindingRepositoryImpl$bind$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bindAuthenticationDeviceInput);
                    deviceBindingRepositoryImpl$bind$1.getOutputStallDuration = list;
                    deviceBindingRepositoryImpl$bind$1.isOutputSupportedFor = null;
                    deviceBindingRepositoryImpl$bind$1.isOutputSupportedForhNQ4ISI = null;
                    deviceBindingRepositoryImpl$bind$1.getValidOutputFormatsForInputhNQ4ISI = null;
                    deviceBindingRepositoryImpl$bind$1.unwrapAs = null;
                    deviceBindingRepositoryImpl$bind$1.getInputSizeshNQ4ISI = null;
                    deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRangesFor = i3;
                    i7 = i6;
                    deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRanges = i7;
                    i8 = i32;
                    deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizes = i8;
                    deviceBindingRepositoryImpl$bind$1.Camera2StreamConfigurationMap = i31;
                    deviceBindingRepositoryImpl$bind$1.toString = 2;
                    execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, deviceBindingRepositoryImpl$bind$1);
                    obj2 = obj;
                    if (execute != obj2) {
                        return obj2;
                    }
                    raise = defaultRaise2;
                    deviceBindingInput3 = deviceBindingInput2;
                    defaultRaise4 = defaultRaise3;
                    i9 = i31;
                    obj5 = execute;
                    i10 = i3;
                    bindAuthenticationDeviceInput2 = bindAuthenticationDeviceInput;
                    collection2 = collection;
                    ior = (arrow.core.Ior) obj5;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                    }
                }
            }
            pairArr2[i4] = kotlin.TuplesKt.to(str, obj5);
            com.apollographql.apollo.ApolloCall addExecutionContext2 = apolloCall.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(riskSourceId, null, kotlin.collections.MapsKt.mapOf(pairArr), 2, null));
            int i312 = i2;
            int i322 = i5;
            com.paypal.oslo.core.network.graphql.CallConfig callConfig2 = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("bind", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
            deviceBindingRepositoryImpl$bind$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput2);
            deviceBindingRepositoryImpl$bind$1.getOutputFormats = defaultRaise3;
            deviceBindingRepositoryImpl$bind$1.getOutputSizes = defaultRaise2;
            deviceBindingRepositoryImpl$bind$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(collection);
            deviceBindingRepositoryImpl$bind$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bindAuthenticationDeviceInput);
            deviceBindingRepositoryImpl$bind$1.getOutputStallDuration = list;
            deviceBindingRepositoryImpl$bind$1.isOutputSupportedFor = null;
            deviceBindingRepositoryImpl$bind$1.isOutputSupportedForhNQ4ISI = null;
            deviceBindingRepositoryImpl$bind$1.getValidOutputFormatsForInputhNQ4ISI = null;
            deviceBindingRepositoryImpl$bind$1.unwrapAs = null;
            deviceBindingRepositoryImpl$bind$1.getInputSizeshNQ4ISI = null;
            deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRangesFor = i3;
            i7 = i6;
            deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoFpsRanges = i7;
            i8 = i322;
            deviceBindingRepositoryImpl$bind$1.getHighSpeedVideoSizes = i8;
            deviceBindingRepositoryImpl$bind$1.Camera2StreamConfigurationMap = i312;
            deviceBindingRepositoryImpl$bind$1.toString = 2;
            execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext2, callConfig2, deviceBindingRepositoryImpl$bind$1);
            obj2 = obj;
            if (execute != obj2) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e6) {
            raiseCancellationException = e6;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise));
        } catch (java.lang.Throwable th7) {
            th = th7;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        deviceBindingRepositoryImpl$bind$1 = new com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl$bind$1(this, continuation);
        java.lang.Object obj52 = deviceBindingRepositoryImpl$bind$1.coroutineBoundary;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceBindingRepositoryImpl$bind$1.toString;
        if (i != 0) {
        }
    }

    private final com.paypal.oslo.api.graphql.schema.type.BindSchemeInput getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod p0) {
        java.lang.String generateKey;
        try {
            int i = com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
            if (i == 1) {
                generateKey = this.getHighSpeedVideoFpsRangesFor.generateKey(this.getHighSpeedVideoFpsRanges);
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                generateKey = this.getHighSpeedVideoSizes.generateKey(this.getHighSpeedVideoFpsRanges);
            }
            return new com.paypal.oslo.api.graphql.schema.type.BindSchemeInput(new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.CryptographicKeyAlgorithm.EC), com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMapperKt.toGraphQL(p0), generateKey);
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Key generation failed for device binding method", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", p0.name())), null, arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th), 4, null);
            return null;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
