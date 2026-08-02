package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u0016\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001f\u0010\u001eJ:\u0010%\u001a$\u0012\u0004\u0012\u00020\u0011\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 j\u0002`$0\u00102\u0006\u0010\u0016\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b%\u0010\u001eJ4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0016\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b%\u0010(J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b)\u0010*J\u001a\u0010\u0018\u001a\u0004\u0018\u00010!2\u0006\u0010\u0016\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u0018\u0010+J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b\u0018\u0010\u0014J4\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020,0\u00102\u0006\u0010\u0016\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00103R\u0014\u00105\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00104"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/repository/PhotoRepositoryImpl;", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhotoRepository;", "Landroid/content/Context;", "context", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/userprofile/data/api/DmsApiService;", "dmsApiService", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "tokenProvider", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/userprofile/data/api/DmsApiService;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/core/identity/domain/TokenProvider;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "", "deleteProfilePhoto", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/lang/String;", "Landroid/net/Uri;", "photoUri", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadResult;", "uploadProfilePhoto", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/Triple;", "Ljava/io/File;", "Lcom/paypal/oslo/feature/userprofile/domain/model/ImageMetadata;", "Lcom/paypal/oslo/core/userstore/model/User;", "Lcom/paypal/oslo/feature/userprofile/data/repository/ValidatedPhotoData;", "getHighResolutionOutputSizeshNQ4ISI", "p1", "p2", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/net/Uri;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/userprofile/data/model/DmsResponse;", "Landroid/content/Context;", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/userprofile/data/api/DmsApiService;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhotoRepositoryImpl implements com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.data.api.DmsApiService getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.TokenProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PhotoRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.userprofile.data.api.DmsApiService dmsApiService, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dmsApiService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoSizes = dmsApiService;
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
        this.getHighSpeedVideoFpsRangesFor = tokenProvider;
        this.getHighSpeedVideoSizesFor = coroutineDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01bb, code lost:
    
        if (com.paypal.oslo.core.userstore.UserStore.refresh$default(r12, null, r2, 1, null) != r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0257, code lost:
    
        if (com.paypal.oslo.core.userstore.UserStore.refresh$default(r13, null, r2, 1, null) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c7, code lost:
    
        if (r1 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteProfilePhoto(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$deleteProfilePhoto$1 photoRepositoryImpl$deleteProfilePhoto$1;
        int i;
        com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation deletePartyProfilePictureMutation;
        com.apollographql.apollo.ApolloCall addExecutionContext;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.Data data;
        com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.DeletePartyProfilePicture deletePartyProfilePicture;
        com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.Data data2;
        com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.DeletePartyProfilePicture deletePartyProfilePicture2;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$deleteProfilePhoto$1) {
            photoRepositoryImpl$deleteProfilePhoto$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$deleteProfilePhoto$1) continuation;
            if ((photoRepositoryImpl$deleteProfilePhoto$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                photoRepositoryImpl$deleteProfilePhoto$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = photoRepositoryImpl$deleteProfilePhoto$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = photoRepositoryImpl$deleteProfilePhoto$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    deletePartyProfilePictureMutation = new com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation();
                    addExecutionContext = this.Camera2StreamConfigurationMap.mutation(deletePartyProfilePictureMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getDeleteProfilePicture(), null, 2, null));
                    com.paypal.oslo.core.network.graphql.CallConfig createCallConfig = com.paypal.oslo.feature.userprofile.data.utils.CommonUtilsKt.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, "deletePartyProfilePicture");
                    photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyProfilePictureMutation);
                    photoRepositoryImpl$deleteProfilePhoto$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    photoRepositoryImpl$deleteProfilePhoto$1.getOutputMinFrameDuration = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, createCallConfig, photoRepositoryImpl$deleteProfilePhoto$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            int i2 = photoRepositoryImpl$deleteProfilePhoto$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i3 = photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = photoRepositoryImpl$deleteProfilePhoto$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    addExecutionContext = (com.apollographql.apollo.ApolloCall) photoRepositoryImpl$deleteProfilePhoto$1.Camera2StreamConfigurationMap;
                    deletePartyProfilePictureMutation = (com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation) photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL delete profile photo failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "NetworkError.UnknownError")), null, ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause(), 4, null);
                        } else {
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
                            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(error.getClass()).getSimpleName();
                            if (simpleName == null) {
                                simpleName = "Unknown";
                            }
                            com.paypal.android.logger.Logger.e$default(logger, "GraphQL delete profile photo failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName)), null, null, 12, null);
                        }
                    } else {
                        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL delete profile photo failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "CallError.GraphQL")), null, null, 12, null);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed(getHighSpeedVideoFpsRanges(callError)));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.Party party = (graphQLData == null || (data2 = (com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.Data) graphQLData.getData()) == null || (deletePartyProfilePicture2 = data2.getDeletePartyProfilePicture()) == null) ? null : deletePartyProfilePicture2.getParty();
                    if (party != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Profile photo deleted successfully", null, null, 6, null);
                        com.paypal.oslo.core.userstore.UserStore userStore = this.getHighResolutionOutputSizeshNQ4ISI;
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyProfilePictureMutation);
                        photoRepositoryImpl$deleteProfilePhoto$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        photoRepositoryImpl$deleteProfilePhoto$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData);
                        photoRepositoryImpl$deleteProfilePhoto$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(party);
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoSizes = 0;
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        photoRepositoryImpl$deleteProfilePhoto$1.getOutputMinFrameDuration = 2;
                    } else {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL delete profile photo returned null data", null, null, null, 14, null);
                        java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed(string));
                    }
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.Party party2 = (graphQLData2 == null || (data = (com.paypal.oslo.feature.userprofile.graphql.DeletePartyProfilePictureMutation.Data) graphQLData2.getData()) == null || (deletePartyProfilePicture = data.getDeletePartyProfilePicture()) == null) ? null : deletePartyProfilePicture.getParty();
                    if (party2 != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Profile photo deleted successfully despite GraphQL errors", null, null, 6, null);
                        com.paypal.oslo.core.userstore.UserStore userStore2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyProfilePictureMutation);
                        photoRepositoryImpl$deleteProfilePhoto$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        photoRepositoryImpl$deleteProfilePhoto$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callError2);
                        photoRepositoryImpl$deleteProfilePhoto$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData2);
                        photoRepositoryImpl$deleteProfilePhoto$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(party2);
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighSpeedVideoSizes = 0;
                        photoRepositoryImpl$deleteProfilePhoto$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        photoRepositoryImpl$deleteProfilePhoto$1.getOutputMinFrameDuration = 3;
                    } else {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed(getHighSpeedVideoFpsRanges(callError2)));
                    }
                }
                return coroutine_suspended;
            }
        }
        photoRepositoryImpl$deleteProfilePhoto$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$deleteProfilePhoto$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$deleteProfilePhoto$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$deleteProfilePhoto$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final java.lang.String getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        if ((p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) && (((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError() instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet)) {
            java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_no_internet);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            return string;
        }
        java.lang.String string2 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object uploadProfilePhoto(android.net.Uri uri, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadResult>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadProfilePhoto$1 photoRepositoryImpl$uploadProfilePhoto$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadProfilePhoto$1) {
                photoRepositoryImpl$uploadProfilePhoto$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadProfilePhoto$1) continuation;
                if ((photoRepositoryImpl$uploadProfilePhoto$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    photoRepositoryImpl$uploadProfilePhoto$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = photoRepositoryImpl$uploadProfilePhoto$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = photoRepositoryImpl$uploadProfilePhoto$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        photoRepositoryImpl$uploadProfilePhoto$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri);
                        photoRepositoryImpl$uploadProfilePhoto$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = getHighSpeedVideoSizes(uri, photoRepositoryImpl$uploadProfilePhoto$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (arrow.core.Either) obj;
                }
            }
            if (i != 0) {
            }
            return (arrow.core.Either) obj;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.userprofile.LoggerKt.log.e("Photo upload failed", e);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UnknownError.INSTANCE);
        }
        photoRepositoryImpl$uploadProfilePhoto$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadProfilePhoto$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$uploadProfilePhoto$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$uploadProfilePhoto$1.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f9, code lost:
    
        if (r4 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(android.net.Uri uri, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadResult>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$performPhotoUpload$1 photoRepositoryImpl$performPhotoUpload$1;
        int i;
        android.net.Uri uri2;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        arrow.core.Either either;
        com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata imageMetadata;
        com.paypal.oslo.core.userstore.model.User user;
        java.io.File file;
        int i2;
        android.net.Uri uri3;
        arrow.core.Either either2;
        int i3;
        arrow.core.Either either3;
        java.lang.String str;
        com.paypal.oslo.core.userstore.model.User user2;
        arrow.core.Either either4;
        arrow.core.Either either5;
        int i4;
        int i5;
        arrow.core.Either either6;
        com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata imageMetadata2;
        android.net.Uri uri4;
        int i6;
        int i7;
        arrow.core.Either either7;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$performPhotoUpload$1) {
            photoRepositoryImpl$performPhotoUpload$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$performPhotoUpload$1) continuation;
            if ((photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI & Integer.MIN_VALUE) != 0) {
                photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI -= 2147483648;
                java.lang.Object obj = photoRepositoryImpl$performPhotoUpload$1.getValidOutputFormatsForInputhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    photoRepositoryImpl$performPhotoUpload$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri);
                    photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI = 1;
                    uri2 = uri;
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(uri2, photoRepositoryImpl$performPhotoUpload$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            int i8 = photoRepositoryImpl$performPhotoUpload$1.Camera2StreamConfigurationMap;
                            int i9 = photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.core.userstore.model.User user3 = (com.paypal.oslo.core.userstore.model.User) photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDurationlomOqCM;
                            com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata imageMetadata3 = (com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata) photoRepositoryImpl$performPhotoUpload$1.getOutputSizes;
                            java.io.File file2 = (java.io.File) photoRepositoryImpl$performPhotoUpload$1.getOutputFormats;
                            arrow.core.Either either8 = (arrow.core.Either) photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDuration;
                            arrow.core.Either either9 = (arrow.core.Either) photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizesFor;
                            android.net.Uri uri5 = (android.net.Uri) photoRepositoryImpl$performPhotoUpload$1.getInputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            user = user3;
                            file = file2;
                            i3 = i8;
                            imageMetadata = imageMetadata3;
                            either = either9;
                            uri3 = uri5;
                            i2 = i9;
                            either2 = either8;
                            either3 = (arrow.core.Either) obj;
                            if (either3 instanceof arrow.core.Either.Right) {
                                if (either3 instanceof arrow.core.Either.Left) {
                                    return arrow.core.EitherKt.left((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError) ((arrow.core.Either.Left) either3).getValue());
                                }
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            java.lang.String str3 = (java.lang.String) ((arrow.core.Either.Right) either3).getValue();
                            photoRepositoryImpl$performPhotoUpload$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri3);
                            photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                            photoRepositoryImpl$performPhotoUpload$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                            photoRepositoryImpl$performPhotoUpload$1.getOutputSizes = imageMetadata;
                            photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                            photoRepositoryImpl$performPhotoUpload$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                            photoRepositoryImpl$performPhotoUpload$1.getOutputSizeshNQ4ISI = str3;
                            photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRanges = i2;
                            photoRepositoryImpl$performPhotoUpload$1.Camera2StreamConfigurationMap = i3;
                            photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizes = 0;
                            photoRepositoryImpl$performPhotoUpload$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI = 3;
                            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str3, photoRepositoryImpl$performPhotoUpload$1);
                            if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                                str = str3;
                                obj = highSpeedVideoFpsRangesFor;
                                user2 = user;
                                either4 = either2;
                                either5 = either3;
                                i4 = 0;
                                i5 = i2;
                                either6 = either;
                                imageMetadata2 = imageMetadata;
                                uri4 = uri3;
                                i6 = i3;
                                i7 = 0;
                                either7 = (arrow.core.Either) obj;
                                if (either7 instanceof arrow.core.Either.Right) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i10 = photoRepositoryImpl$performPhotoUpload$1.getInputFormats;
                            int i11 = photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRangesFor;
                            int i12 = photoRepositoryImpl$performPhotoUpload$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i13 = photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizes;
                            int i14 = photoRepositoryImpl$performPhotoUpload$1.Camera2StreamConfigurationMap;
                            int i15 = photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRanges;
                            str2 = (java.lang.String) photoRepositoryImpl$performPhotoUpload$1.getOutputSizeshNQ4ISI;
                            imageMetadata2 = (com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata) photoRepositoryImpl$performPhotoUpload$1.getOutputSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadResult(str2, imageMetadata2));
                        }
                        int i16 = photoRepositoryImpl$performPhotoUpload$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i17 = photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizes;
                        int i18 = photoRepositoryImpl$performPhotoUpload$1.Camera2StreamConfigurationMap;
                        int i19 = photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRanges;
                        str = (java.lang.String) photoRepositoryImpl$performPhotoUpload$1.getOutputSizeshNQ4ISI;
                        arrow.core.Either either10 = (arrow.core.Either) photoRepositoryImpl$performPhotoUpload$1.getOutputStallDuration;
                        com.paypal.oslo.core.userstore.model.User user4 = (com.paypal.oslo.core.userstore.model.User) photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata imageMetadata4 = (com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata) photoRepositoryImpl$performPhotoUpload$1.getOutputSizes;
                        file = (java.io.File) photoRepositoryImpl$performPhotoUpload$1.getOutputFormats;
                        arrow.core.Either either11 = (arrow.core.Either) photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDuration;
                        arrow.core.Either either12 = (arrow.core.Either) photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizesFor;
                        android.net.Uri uri6 = (android.net.Uri) photoRepositoryImpl$performPhotoUpload$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i4 = i16;
                        imageMetadata2 = imageMetadata4;
                        user2 = user4;
                        either5 = either10;
                        i5 = i19;
                        either6 = either12;
                        uri4 = uri6;
                        i6 = i18;
                        i7 = i17;
                        either4 = either11;
                        either7 = (arrow.core.Either) obj;
                        if (either7 instanceof arrow.core.Either.Right) {
                            if (either7 instanceof arrow.core.Either.Left) {
                                return arrow.core.EitherKt.left((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError) ((arrow.core.Either.Left) either7).getValue());
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either7).getValue();
                        int i20 = i4;
                        com.paypal.oslo.core.userstore.UserStore userStore = this.getHighResolutionOutputSizeshNQ4ISI;
                        photoRepositoryImpl$performPhotoUpload$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri4);
                        photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                        photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either4);
                        photoRepositoryImpl$performPhotoUpload$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                        photoRepositoryImpl$performPhotoUpload$1.getOutputSizes = imageMetadata2;
                        photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user2);
                        photoRepositoryImpl$performPhotoUpload$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either5);
                        photoRepositoryImpl$performPhotoUpload$1.getOutputSizeshNQ4ISI = str;
                        photoRepositoryImpl$performPhotoUpload$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either7);
                        photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                        photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRanges = i5;
                        photoRepositoryImpl$performPhotoUpload$1.Camera2StreamConfigurationMap = i6;
                        photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizes = i7;
                        photoRepositoryImpl$performPhotoUpload$1.getHighResolutionOutputSizeshNQ4ISI = i20;
                        photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRangesFor = 0;
                        photoRepositoryImpl$performPhotoUpload$1.getInputFormats = 0;
                        photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI = 4;
                        if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, photoRepositoryImpl$performPhotoUpload$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadResult(str2, imageMetadata2));
                    }
                    android.net.Uri uri7 = (android.net.Uri) photoRepositoryImpl$performPhotoUpload$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    highResolutionOutputSizeshNQ4ISI = obj;
                    uri2 = uri7;
                }
                either = (arrow.core.Either) highResolutionOutputSizeshNQ4ISI;
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        return arrow.core.EitherKt.left((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError) ((arrow.core.Either.Left) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.Triple triple = (kotlin.Triple) ((arrow.core.Either.Right) either).getValue();
                java.io.File file3 = (java.io.File) triple.component1();
                imageMetadata = (com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata) triple.component2();
                com.paypal.oslo.core.userstore.model.User user5 = (com.paypal.oslo.core.userstore.model.User) triple.component3();
                java.lang.String accountCountryCode = user5.getAccountCountryCode();
                java.lang.String id = user5.getId();
                photoRepositoryImpl$performPhotoUpload$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri2);
                photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                photoRepositoryImpl$performPhotoUpload$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file3);
                photoRepositoryImpl$performPhotoUpload$1.getOutputSizes = imageMetadata;
                photoRepositoryImpl$performPhotoUpload$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user5);
                photoRepositoryImpl$performPhotoUpload$1.getHighSpeedVideoFpsRanges = 0;
                photoRepositoryImpl$performPhotoUpload$1.Camera2StreamConfigurationMap = 0;
                photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI = 2;
                java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(file3, accountCountryCode, id, photoRepositoryImpl$performPhotoUpload$1);
                if (highResolutionOutputSizeshNQ4ISI2 != coroutine_suspended) {
                    user = user5;
                    file = file3;
                    i2 = 0;
                    uri3 = uri2;
                    either2 = either;
                    obj = highResolutionOutputSizeshNQ4ISI2;
                    i3 = 0;
                    either3 = (arrow.core.Either) obj;
                    if (either3 instanceof arrow.core.Either.Right) {
                    }
                }
                return coroutine_suspended;
            }
        }
        photoRepositoryImpl$performPhotoUpload$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$performPhotoUpload$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$performPhotoUpload$1.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$performPhotoUpload$1.isOutputSupportedForhNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) highResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191 A[Catch: all -> 0x0089, RaiseCancellationException -> 0x008c, TRY_LEAVE, TryCatch #5 {RaiseCancellationException -> 0x008c, all -> 0x0089, blocks: (B:30:0x007f, B:32:0x018d, B:34:0x0191, B:38:0x01d6, B:39:0x01e0, B:44:0x00e8, B:47:0x00ee, B:49:0x0163, B:52:0x01e1, B:53:0x01eb, B:56:0x00fa, B:60:0x0110, B:63:0x0126, B:66:0x013c, B:69:0x0152, B:70:0x01ec, B:71:0x01f1, B:78:0x00bf), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d6 A[Catch: all -> 0x0089, RaiseCancellationException -> 0x008c, TRY_ENTER, TryCatch #5 {RaiseCancellationException -> 0x008c, all -> 0x0089, blocks: (B:30:0x007f, B:32:0x018d, B:34:0x0191, B:38:0x01d6, B:39:0x01e0, B:44:0x00e8, B:47:0x00ee, B:49:0x0163, B:52:0x01e1, B:53:0x01eb, B:56:0x00fa, B:60:0x0110, B:63:0x0126, B:66:0x013c, B:69:0x0152, B:70:0x01ec, B:71:0x01f1, B:78:0x00bf), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee A[Catch: all -> 0x0089, RaiseCancellationException -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {RaiseCancellationException -> 0x008c, all -> 0x0089, blocks: (B:30:0x007f, B:32:0x018d, B:34:0x0191, B:38:0x01d6, B:39:0x01e0, B:44:0x00e8, B:47:0x00ee, B:49:0x0163, B:52:0x01e1, B:53:0x01eb, B:56:0x00fa, B:60:0x0110, B:63:0x0126, B:66:0x013c, B:69:0x0152, B:70:0x01ec, B:71:0x01f1, B:78:0x00bf), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163 A[Catch: all -> 0x0089, RaiseCancellationException -> 0x008c, TryCatch #5 {RaiseCancellationException -> 0x008c, all -> 0x0089, blocks: (B:30:0x007f, B:32:0x018d, B:34:0x0191, B:38:0x01d6, B:39:0x01e0, B:44:0x00e8, B:47:0x00ee, B:49:0x0163, B:52:0x01e1, B:53:0x01eb, B:56:0x00fa, B:60:0x0110, B:63:0x0126, B:66:0x013c, B:69:0x0152, B:70:0x01ec, B:71:0x01f1, B:78:0x00bf), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1 A[Catch: all -> 0x0089, RaiseCancellationException -> 0x008c, TryCatch #5 {RaiseCancellationException -> 0x008c, all -> 0x0089, blocks: (B:30:0x007f, B:32:0x018d, B:34:0x0191, B:38:0x01d6, B:39:0x01e0, B:44:0x00e8, B:47:0x00ee, B:49:0x0163, B:52:0x01e1, B:53:0x01eb, B:56:0x00fa, B:60:0x0110, B:63:0x0126, B:66:0x013c, B:69:0x0152, B:70:0x01ec, B:71:0x01f1, B:78:0x00bf), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(android.net.Uri uri, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, ? extends kotlin.Triple<? extends java.io.File, com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata, com.paypal.oslo.core.userstore.model.User>>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$validatePhotoUploadPreconditions$1 photoRepositoryImpl$validatePhotoUploadPreconditions$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        android.net.Uri uri2;
        int i2;
        int i3;
        arrow.core.raise.Raise raise;
        int i4;
        int i5;
        com.paypal.oslo.core.userstore.model.UserState userState;
        com.paypal.oslo.core.userstore.model.User user;
        com.paypal.oslo.core.userstore.model.UserState userState2;
        int i6;
        int i7;
        int i8;
        java.io.File file;
        java.io.File file2;
        arrow.core.raise.DefaultRaise defaultRaise4;
        com.paypal.oslo.core.userstore.model.User user2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$validatePhotoUploadPreconditions$1) {
                photoRepositoryImpl$validatePhotoUploadPreconditions$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$validatePhotoUploadPreconditions$1) continuation;
                if ((photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise3;
                        kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState3 = this.getHighResolutionOutputSizeshNQ4ISI.getUserState();
                        uri2 = uri;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRanges = uri2;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputSizeshNQ4ISI = defaultRaise3;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputFormats = defaultRaise5;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.Camera2StreamConfigurationMap = 0;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizes = 0;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRangesFor = 0;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(userState3, photoRepositoryImpl$validatePhotoUploadPreconditions$1);
                        if (first != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            raise = defaultRaise5;
                            i4 = 0;
                            obj = first;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i9 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRangesFor;
                            int i10 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i11 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizes;
                            int i12 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.Camera2StreamConfigurationMap;
                            user2 = (com.paypal.oslo.core.userstore.model.User) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputFormats;
                            file2 = (java.io.File) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputMinFrameDuration;
                            defaultRaise4 = (arrow.core.raise.DefaultRaise) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlin.Triple triple = new kotlin.Triple(file2, (com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata) obj, user2);
                                defaultRaise4.complete();
                                return new arrow.core.Either.Right(triple);
                            } catch (arrow.core.raise.RaiseCancellationException e) {
                                e = e;
                                defaultRaise2 = defaultRaise4;
                                defaultRaise2.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                defaultRaise = defaultRaise4;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        i4 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRangesFor;
                        i6 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighResolutionOutputSizeshNQ4ISI;
                        i7 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizes;
                        i8 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.userstore.model.User user3 = (com.paypal.oslo.core.userstore.model.User) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputMinFrameDuration;
                        userState2 = (com.paypal.oslo.core.userstore.model.UserState) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizesFor;
                        raise = (arrow.core.raise.Raise) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputFormats;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputSizeshNQ4ISI;
                        android.net.Uri uri3 = (android.net.Uri) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        user = user3;
                        uri2 = uri3;
                        file = (java.io.File) obj;
                        if (file != null) {
                            raise.raise(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileReadError.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighSpeedVideoSizesFor;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri2);
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputSizeshNQ4ISI = defaultRaise3;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userState2);
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputMinFrameDuration = file;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputFormats = user;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.Camera2StreamConfigurationMap = i8;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizes = i7;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRangesFor = i4;
                        photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputSizeshNQ4ISI = 3;
                        java.lang.Object extractImageMetadata = com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt.extractImageMetadata(file, coroutineDispatcher, photoRepositoryImpl$validatePhotoUploadPreconditions$1);
                        if (extractImageMetadata != coroutine_suspended) {
                            file2 = file;
                            obj = extractImageMetadata;
                            defaultRaise4 = defaultRaise3;
                            user2 = user;
                            kotlin.Triple triple2 = new kotlin.Triple(file2, (com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata) obj, user2);
                            defaultRaise4.complete();
                            return new arrow.core.Either.Right(triple2);
                        }
                        return coroutine_suspended;
                    }
                    i4 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRangesFor;
                    i5 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizes;
                    int i13 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.Camera2StreamConfigurationMap;
                    arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputFormats;
                    arrow.core.raise.DefaultRaise defaultRaise6 = (arrow.core.raise.DefaultRaise) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputSizeshNQ4ISI;
                    android.net.Uri uri4 = (android.net.Uri) photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i3 = i13;
                        uri2 = uri4;
                        defaultRaise3 = defaultRaise6;
                        raise = raise2;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise2 = defaultRaise6;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise6;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                    if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User not logged in, cannot upload photo", null, null, null, 14, null);
                        } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggingIn) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User authentication in progress, cannot upload photo", null, null, null, 14, null);
                        } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedIn) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User logged in but profile not loaded, cannot upload photo", null, null, null, 14, null);
                        } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoading) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User profile loading in progress, cannot upload photo", null, null, null, 14, null);
                        } else {
                            if (!(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.userprofile.LoggerKt.log.e("User profile failed to load, cannot upload photo", ((com.paypal.oslo.core.userstore.model.UserState.ProfileError) userState).getCause());
                        }
                        user = null;
                    } else {
                        user = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser();
                    }
                    if (user != null) {
                        raise.raise(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UserNotAuthenticated.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri2);
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getInputSizeshNQ4ISI = defaultRaise3;
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputFormats = raise;
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userState);
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputMinFrameDuration = user;
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.Camera2StreamConfigurationMap = i3;
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoSizes = i2;
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getHighSpeedVideoFpsRangesFor = i4;
                    photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputSizeshNQ4ISI = 2;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(uri2);
                    if (highSpeedVideoFpsRanges != coroutine_suspended) {
                        int i14 = i3;
                        userState2 = userState;
                        obj = highSpeedVideoFpsRanges;
                        i6 = i5;
                        i7 = i2;
                        i8 = i14;
                        file = (java.io.File) obj;
                        if (file != null) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
            if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            }
            if (user != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        photoRepositoryImpl$validatePhotoUploadPreconditions$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$validatePhotoUploadPreconditions$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$validatePhotoUploadPreconditions$1.getOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.io.File file, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDmsAndGetLink$1 photoRepositoryImpl$uploadToDmsAndGetLink$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDmsAndGetLink$1) {
            photoRepositoryImpl$uploadToDmsAndGetLink$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDmsAndGetLink$1) continuation;
            if ((photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    photoRepositoryImpl$uploadToDmsAndGetLink$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                    photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighSpeedVideoSizes = 1;
                    obj = getHighSpeedVideoFpsRangesFor(file, str, str2, photoRepositoryImpl$uploadToDmsAndGetLink$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.String downloadLink = com.paypal.oslo.feature.userprofile.data.model.DmsResponseKt.getDownloadLink((com.paypal.oslo.feature.userprofile.data.model.DmsResponse) ((arrow.core.Either.Right) either).getValue());
                    if (downloadLink != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "DMS upload complete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadUrl", downloadLink)), null, 4, null);
                        return arrow.core.EitherKt.right(downloadLink);
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Download link not found in DMS response", null, null, null, 14, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DownloadLinkNotFound.INSTANCE);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError photoUploadError = (com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(photoUploadError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "Unknown";
                    }
                    com.paypal.android.logger.Logger.e$default(logger, "DMS upload failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName)), null, null, 12, null);
                    return arrow.core.EitherKt.left(photoUploadError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        photoRepositoryImpl$uploadToDmsAndGetLink$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDmsAndGetLink$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$uploadToDmsAndGetLink$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$updateProfilePicture$1 photoRepositoryImpl$updateProfilePicture$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data data;
        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture;
        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data data2;
        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture2;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$updateProfilePicture$1) {
            photoRepositoryImpl$updateProfilePicture$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$updateProfilePicture$1) continuation;
            if ((photoRepositoryImpl$updateProfilePicture$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                photoRepositoryImpl$updateProfilePicture$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = photoRepositoryImpl$updateProfilePicture$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = photoRepositoryImpl$updateProfilePicture$1.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput updatePartyProfilePictureInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput(str);
                    com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation updatePartyProfilePictureMutation = new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation(updatePartyProfilePictureInput);
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.mutation(updatePartyProfilePictureMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getUpdateProfilePicture(), null, 2, null));
                    com.paypal.oslo.core.network.graphql.CallConfig createCallConfig = com.paypal.oslo.feature.userprofile.data.utils.CommonUtilsKt.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, "updateProfilePicture");
                    photoRepositoryImpl$updateProfilePicture$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    photoRepositoryImpl$updateProfilePicture$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyProfilePictureInput);
                    photoRepositoryImpl$updateProfilePicture$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyProfilePictureMutation);
                    photoRepositoryImpl$updateProfilePicture$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    photoRepositoryImpl$updateProfilePicture$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, createCallConfig, photoRepositoryImpl$updateProfilePicture$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.userprofile.domain.model.FailureMessage extractUgcmErrorFromExtensions = com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt.extractUgcmErrorFromExtensions(callError, this.getHighSpeedVideoFpsRanges);
                    if (extractUgcmErrorFromExtensions != null) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed(extractUgcmErrorFromExtensions));
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL profile update failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError.toString())), null, null, 12, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed(getHighSpeedVideoFpsRanges(callError)));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    if (graphQLData != null && (data2 = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data) graphQLData.getData()) != null && (updatePartyProfilePicture2 = data2.getUpdatePartyProfilePicture()) != null) {
                        party = updatePartyProfilePicture2.getParty();
                    }
                    if (party != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Profile picture updated successfully", null, null, 6, null);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL profile update returned null data", null, null, null, 14, null);
                    java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed(string));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    if (graphQLData2 != null && (data = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data) graphQLData2.getData()) != null && (updatePartyProfilePicture = data.getUpdatePartyProfilePicture()) != null) {
                        party = updatePartyProfilePicture.getParty();
                    }
                    com.paypal.oslo.feature.userprofile.domain.model.FailureMessage extractUgcmErrorFromExtensions2 = com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt.extractUgcmErrorFromExtensions(callError2, this.getHighSpeedVideoFpsRanges);
                    if (extractUgcmErrorFromExtensions2 != null) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed(extractUgcmErrorFromExtensions2));
                    }
                    if (party != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Profile picture updated successfully despite errors", null, null, 6, null);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed(getHighSpeedVideoFpsRanges(callError2)));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        photoRepositoryImpl$updateProfilePicture$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$updateProfilePicture$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$updateProfilePicture$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$updateProfilePicture$1.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party2 = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(android.net.Uri p0) {
        try {
            java.io.File file = new java.io.File(this.getHighSpeedVideoFpsRanges.getCacheDir(), "camera_images");
            if (!file.exists()) {
                file.mkdirs();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("upload_");
            sb.append(currentTimeMillis);
            sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
            java.io.File file2 = new java.io.File(file, sb.toString());
            java.io.InputStream openInputStream = this.getHighSpeedVideoFpsRanges.getContentResolver().openInputStream(p0);
            if (openInputStream == null) {
                return null;
            }
            java.io.FileOutputStream fileOutputStream = openInputStream;
            try {
                java.io.InputStream inputStream = fileOutputStream;
                fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    kotlin.io.ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                    return file2;
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.userprofile.LoggerKt.log.e(com.paypal.oslo.feature.userprofile.data.utils.PhotoConstants.ERROR_FAILED_TO_COPY_URI, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$getAuthToken$1 photoRepositoryImpl$getAuthToken$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$getAuthToken$1) {
            photoRepositoryImpl$getAuthToken$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$getAuthToken$1) continuation;
            if ((photoRepositoryImpl$getAuthToken$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                photoRepositoryImpl$getAuthToken$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = photoRepositoryImpl$getAuthToken$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = photoRepositoryImpl$getAuthToken$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType = new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("photo_upload", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                    photoRepositoryImpl$getAuthToken$1.Camera2StreamConfigurationMap = 1;
                    obj = tokenProvider.getToken(userAccessTokenType, photoRepositoryImpl$getAuthToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return ((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) either).getValue()).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to retrieve auth token for photo upload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("token_error", ((com.paypal.oslo.core.identity.domain.model.TokenError) ((arrow.core.Either.Left) either).getValue()).toString())), null, null, 12, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        photoRepositoryImpl$getAuthToken$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$getAuthToken$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$getAuthToken$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$getAuthToken$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006a, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.io.File file, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, com.paypal.oslo.feature.userprofile.data.model.DmsResponse>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDms$1 photoRepositoryImpl$uploadToDms$1;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Throwable cause;
        java.lang.String message;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDms$1) {
            photoRepositoryImpl$uploadToDms$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDms$1) continuation;
            if ((photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = photoRepositoryImpl$uploadToDms$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizes = file;
                    photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoFpsRanges = str;
                    photoRepositoryImpl$uploadToDms$1.Camera2StreamConfigurationMap = str2;
                    photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizesFor = 1;
                    obj = getHighSpeedVideoFpsRanges(photoRepositoryImpl$uploadToDms$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either = (arrow.core.Either) obj;
                        if (either instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.core.network.http.error.NetworkError networkError = (com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue();
                            if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                                str4 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_no_internet);
                            } else {
                                boolean z = networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError;
                                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = z ? (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError : null;
                                if (httpError == null || (message = httpError.getMessage()) == null) {
                                    com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError2 = z ? (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError : null;
                                    java.lang.String body = httpError2 != null ? httpError2.getBody() : null;
                                    if (body == null) {
                                        com.paypal.oslo.core.network.http.error.NetworkError.UnknownError unknownError = networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError ? (com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError : null;
                                        str4 = (unknownError == null || (cause = unknownError.getCause()) == null) ? null : cause.getMessage();
                                        if (str4 == null) {
                                            str4 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
                                        }
                                    } else {
                                        str4 = body;
                                    }
                                } else {
                                    str4 = message;
                                }
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
                            return new arrow.core.Either.Left(new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed(str4));
                        }
                        if (either instanceof arrow.core.Either.Right) {
                            return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str2 = (java.lang.String) photoRepositoryImpl$uploadToDms$1.Camera2StreamConfigurationMap;
                    str = (java.lang.String) photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoFpsRanges;
                    file = (java.io.File) photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str5 = (java.lang.String) obj;
                str3 = str5;
                if (str3 != null || str3.length() == 0) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to get auth token for photo upload", null, null, null, 14, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UserNotAuthenticated.INSTANCE);
                }
                okhttp3.RequestBody buildMultipartRequestBody = com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt.buildMultipartRequestBody(com.paypal.oslo.feature.userprofile.data.utils.PhotoConstants.MULTIPART_BOUNDARY, file, str, str2);
                com.paypal.oslo.feature.userprofile.data.api.DmsApiService dmsApiService = this.getHighSpeedVideoSizes;
                java.lang.String concat = "Bearer ".concat(java.lang.String.valueOf(str5));
                photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                photoRepositoryImpl$uploadToDms$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                photoRepositoryImpl$uploadToDms$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildMultipartRequestBody);
                photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizesFor = 2;
                obj = dmsApiService.uploadPhoto(concat, buildMultipartRequestBody, photoRepositoryImpl$uploadToDms$1);
            }
        }
        photoRepositoryImpl$uploadToDms$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDms$1(this, continuation);
        java.lang.Object obj2 = photoRepositoryImpl$uploadToDms$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = photoRepositoryImpl$uploadToDms$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        java.lang.String str52 = (java.lang.String) obj2;
        str3 = str52;
        if (str3 != null) {
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to get auth token for photo upload", null, null, null, 14, null);
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UserNotAuthenticated.INSTANCE);
    }
}
