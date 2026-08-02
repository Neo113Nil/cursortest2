package com.paypal.oslo.feature.packagetracking.data.repository;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u000eJ$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\nH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010 0\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b!\u0010\"J,\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010#0\n2\u0006\u0010\u001f\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b$\u0010%J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\nH\u0096@¢\u0006\u0004\b\u001f\u0010\u001eJ*\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0#0\n2\u0006\u0010&\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b(\u0010%J4\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b*\u0010\u000eJ.\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\nH\u0096@¢\u0006\u0004\b-\u0010\u001eJ$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010.\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b/\u0010%R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/data/repository/PackageRepositoryImpl;", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "Lcom/paypal/oslo/feature/packagetracking/data/source/PackageRemoteDataSource;", "remoteDataSource", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/data/source/PackageRemoteDataSource;)V", "", "carrierId", "trackingNumber", "transactionNumber", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "getPackageDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "", "removePackage", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "getAuthorizationUrl", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provider", "authorizationCode", "state", "authorizePackageTracking", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserEmailProvider", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImportedData", "Lcom/paypal/oslo/feature/packagetracking/domain/model/DeAuthorizeData;", "deAuthorize", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deAuthorizeAll", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceRefresh", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "getEmailLinkStatus", "nickname", "updatePackageNickname", "markPackageAsDelivered", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAmazonTrackingPreference", "enabled", "saveAmazonTrackingPreference", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/packagetracking/data/source/PackageRemoteDataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PackageRepositoryImpl implements com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PackageRepositoryImpl(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageRemoteDataSource, "");
        this.getHighSpeedVideoFpsRanges = packageRemoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPackageDetail(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.PackageData>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getPackageDetail$1 packageRepositoryImpl$getPackageDetail$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getPackageDetail$1) {
            packageRepositoryImpl$getPackageDetail$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getPackageDetail$1) continuation;
            if ((packageRepositoryImpl$getPackageDetail$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$getPackageDetail$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$getPackageDetail$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$getPackageDetail$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$getPackageDetail$1.getHighSpeedVideoFpsRangesFor = str;
                    packageRepositoryImpl$getPackageDetail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRepositoryImpl$getPackageDetail$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    packageRepositoryImpl$getPackageDetail$1.Camera2StreamConfigurationMap = 1;
                    obj = packageRemoteDataSource.getPackageDetail(str, str2, str3, packageRepositoryImpl$getPackageDetail$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) packageRepositoryImpl$getPackageDetail$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(com.paypal.oslo.feature.packagetracking.data.mapper.PackageGraphQLMapperKt.toDomain((com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage) ((arrow.core.Ior.Right) ior).getValue(), str));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right(com.paypal.oslo.feature.packagetracking.data.mapper.PackageGraphQLMapperKt.toDomain((com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage) both.getRightValue(), str));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$getPackageDetail$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getPackageDetail$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$getPackageDetail$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$getPackageDetail$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.lang.String concat;
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                concat = com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_DESCRIPTION;
            } else {
                boolean z = error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError;
                java.lang.String str = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                if (z) {
                    com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                    int code = httpError.getCode();
                    java.lang.String message = httpError.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP error: ");
                    sb.append(code);
                    sb.append(" - ");
                    sb.append(str);
                    concat = sb.toString();
                } else {
                    if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.String message2 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
                    if (message2 != null) {
                        str = message2;
                    }
                    concat = "Network error: ".concat(java.lang.String.valueOf(str));
                }
            }
            return new com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError(concat, null, null, 6, null);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
        java.lang.String message3 = graphQLError.getMessage();
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("name") : null;
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null) {
            str2 = graphQLError.getErrorCode();
        }
        return new com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError(message3, str2, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removePackage(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$removePackage$1 packageRepositoryImpl$removePackage$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$removePackage$1) {
            packageRepositoryImpl$removePackage$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$removePackage$1) continuation;
            if ((packageRepositoryImpl$removePackage$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$removePackage$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$removePackage$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$removePackage$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$removePackage$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRepositoryImpl$removePackage$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRepositoryImpl$removePackage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    packageRepositoryImpl$removePackage$1.getHighSpeedVideoSizes = 1;
                    obj = packageRemoteDataSource.removePackage(str, str2, str3, packageRepositoryImpl$removePackage$1);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) both.getRightValue()).booleanValue()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$removePackage$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$removePackage$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$removePackage$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$removePackage$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAuthorizationUrl(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAuthorizationUrl$1 packageRepositoryImpl$getAuthorizationUrl$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAuthorizationUrl$1) {
            packageRepositoryImpl$getAuthorizationUrl$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAuthorizationUrl$1) continuation;
            if ((packageRepositoryImpl$getAuthorizationUrl$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$getAuthorizationUrl$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$getAuthorizationUrl$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$getAuthorizationUrl$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider graphQL = com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toGraphQL(emailProvider);
                    packageRepositoryImpl$getAuthorizationUrl$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailProvider);
                    packageRepositoryImpl$getAuthorizationUrl$1.Camera2StreamConfigurationMap = 1;
                    obj = packageRemoteDataSource.getAuthorizationUrl(graphQL, packageRepositoryImpl$getAuthorizationUrl$1);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right((java.lang.String) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right((java.lang.String) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$getAuthorizationUrl$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAuthorizationUrl$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$getAuthorizationUrl$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$getAuthorizationUrl$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object authorizePackageTracking(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$authorizePackageTracking$1 packageRepositoryImpl$authorizePackageTracking$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$authorizePackageTracking$1) {
            packageRepositoryImpl$authorizePackageTracking$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$authorizePackageTracking$1) continuation;
            if ((packageRepositoryImpl$authorizePackageTracking$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$authorizePackageTracking$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$authorizePackageTracking$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$authorizePackageTracking$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider graphQL = com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toGraphQL(emailProvider);
                    packageRepositoryImpl$authorizePackageTracking$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailProvider);
                    packageRepositoryImpl$authorizePackageTracking$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRepositoryImpl$authorizePackageTracking$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRepositoryImpl$authorizePackageTracking$1.getHighSpeedVideoFpsRanges = 1;
                    obj = packageRemoteDataSource.authorizePackageTracking(graphQL, str, str2, packageRepositoryImpl$authorizePackageTracking$1);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) both.getRightValue()).booleanValue()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$authorizePackageTracking$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$authorizePackageTracking$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$authorizePackageTracking$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$authorizePackageTracking$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getUserEmailProvider(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getUserEmailProvider$1 packageRepositoryImpl$getUserEmailProvider$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getUserEmailProvider$1) {
            packageRepositoryImpl$getUserEmailProvider$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getUserEmailProvider$1) continuation;
            if ((packageRepositoryImpl$getUserEmailProvider$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$getUserEmailProvider$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$getUserEmailProvider$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$getUserEmailProvider$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$getUserEmailProvider$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = packageRemoteDataSource.getUserDetails(packageRepositoryImpl$getUserEmailProvider$1);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = (com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider) ((arrow.core.Ior.Right) ior).getValue();
                    return arrow.core.EitherKt.right(packageTrackingIdentityProvider != null ? com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toDomain(packageTrackingIdentityProvider) : null);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider2 = (com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider) both.getRightValue();
                return arrow.core.EitherKt.right(packageTrackingIdentityProvider2 != null ? com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toDomain(packageTrackingIdentityProvider2) : null);
            }
        }
        packageRepositoryImpl$getUserEmailProvider$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getUserEmailProvider$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$getUserEmailProvider$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$getUserEmailProvider$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deAuthorize(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorize$1 packageRepositoryImpl$deAuthorize$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorize$1) {
            packageRepositoryImpl$deAuthorize$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorize$1) continuation;
            if ((packageRepositoryImpl$deAuthorize$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$deAuthorize$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$deAuthorize$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$deAuthorize$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider graphQL = com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toGraphQL(emailProvider);
                    packageRepositoryImpl$deAuthorize$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailProvider);
                    packageRepositoryImpl$deAuthorize$1.getHighSpeedVideoFpsRangesFor = z;
                    packageRepositoryImpl$deAuthorize$1.Camera2StreamConfigurationMap = 1;
                    obj = packageRemoteDataSource.deauthorizeEmailProvider(graphQL, z, packageRepositoryImpl$deAuthorize$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = packageRepositoryImpl$deAuthorize$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.DeauthorizePackageTracking deauthorizePackageTracking = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.DeauthorizePackageTracking) ((arrow.core.Ior.Right) ior).getValue();
                    return arrow.core.EitherKt.right(deauthorizePackageTracking != null ? com.paypal.oslo.feature.packagetracking.data.mapper.DeAuthorizeMapperKt.toDomain(deauthorizePackageTracking) : null);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.DeauthorizePackageTracking deauthorizePackageTracking2 = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.DeauthorizePackageTracking) both.getRightValue();
                return arrow.core.EitherKt.right(deauthorizePackageTracking2 != null ? com.paypal.oslo.feature.packagetracking.data.mapper.DeAuthorizeMapperKt.toDomain(deauthorizePackageTracking2) : null);
            }
        }
        packageRepositoryImpl$deAuthorize$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorize$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$deAuthorize$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$deAuthorize$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deAuthorizeAll(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData>>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorizeAll$1 packageRepositoryImpl$deAuthorizeAll$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorizeAll$1) {
            packageRepositoryImpl$deAuthorizeAll$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorizeAll$1) continuation;
            if ((packageRepositoryImpl$deAuthorizeAll$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$deAuthorizeAll$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$deAuthorizeAll$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$deAuthorizeAll$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$deAuthorizeAll$1.Camera2StreamConfigurationMap = z;
                    packageRepositoryImpl$deAuthorizeAll$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = packageRemoteDataSource.deauthorizeAllEmailProviders(z, packageRepositoryImpl$deAuthorizeAll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = packageRepositoryImpl$deAuthorizeAll$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    java.util.List list = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
                    return arrow.core.EitherKt.right(list != null ? com.paypal.oslo.feature.packagetracking.data.mapper.DeAuthorizeMapperKt.toDomain((java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization>) list) : null);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                java.util.List list2 = (java.util.List) both.getRightValue();
                return arrow.core.EitherKt.right(list2 != null ? com.paypal.oslo.feature.packagetracking.data.mapper.DeAuthorizeMapperKt.toDomain((java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization>) list2) : null);
            }
        }
        packageRepositoryImpl$deAuthorizeAll$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deAuthorizeAll$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$deAuthorizeAll$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$deAuthorizeAll$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteImportedData(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deleteImportedData$1 packageRepositoryImpl$deleteImportedData$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deleteImportedData$1) {
            packageRepositoryImpl$deleteImportedData$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deleteImportedData$1) continuation;
            if ((packageRepositoryImpl$deleteImportedData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$deleteImportedData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$deleteImportedData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$deleteImportedData$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$deleteImportedData$1.getHighSpeedVideoFpsRanges = 1;
                    obj = packageRemoteDataSource.deleteImportedData(packageRepositoryImpl$deleteImportedData$1);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) both.getRightValue()).booleanValue()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$deleteImportedData$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$deleteImportedData$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$deleteImportedData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$deleteImportedData$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getEmailLinkStatus(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink>>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getEmailLinkStatus$1 packageRepositoryImpl$getEmailLinkStatus$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getEmailLinkStatus$1) {
            packageRepositoryImpl$getEmailLinkStatus$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getEmailLinkStatus$1) continuation;
            if ((packageRepositoryImpl$getEmailLinkStatus$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$getEmailLinkStatus$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$getEmailLinkStatus$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$getEmailLinkStatus$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy = z ? com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly : null;
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$getEmailLinkStatus$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    packageRepositoryImpl$getEmailLinkStatus$1.getHighSpeedVideoSizes = z;
                    packageRepositoryImpl$getEmailLinkStatus$1.getHighSpeedVideoFpsRanges = 1;
                    obj = packageRemoteDataSource.getEmailLinkStatus(fetchPolicy, packageRepositoryImpl$getEmailLinkStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = packageRepositoryImpl$getEmailLinkStatus$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    java.util.List list = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.packagetracking.data.mapper.EmailLinkMapperKt.toDomain((com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item) it.next()));
                    }
                    return arrow.core.EitherKt.right(arrayList);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.util.List list2 = (java.util.List) both.getRightValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(com.paypal.oslo.feature.packagetracking.data.mapper.EmailLinkMapperKt.toDomain((com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item) it2.next()));
                    }
                    return arrow.core.EitherKt.right(arrayList2);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$getEmailLinkStatus$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getEmailLinkStatus$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$getEmailLinkStatus$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$getEmailLinkStatus$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePackageNickname(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$updatePackageNickname$1 packageRepositoryImpl$updatePackageNickname$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$updatePackageNickname$1) {
            packageRepositoryImpl$updatePackageNickname$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$updatePackageNickname$1) continuation;
            if ((packageRepositoryImpl$updatePackageNickname$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$updatePackageNickname$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$updatePackageNickname$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$updatePackageNickname$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$updatePackageNickname$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRepositoryImpl$updatePackageNickname$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRepositoryImpl$updatePackageNickname$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    packageRepositoryImpl$updatePackageNickname$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = packageRemoteDataSource.updatePackageNickname(str, str2, str3, packageRepositoryImpl$updatePackageNickname$1);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right((java.lang.String) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right((java.lang.String) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$updatePackageNickname$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$updatePackageNickname$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$updatePackageNickname$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$updatePackageNickname$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object markPackageAsDelivered(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.PackageData>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$markPackageAsDelivered$1 packageRepositoryImpl$markPackageAsDelivered$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$markPackageAsDelivered$1) {
            packageRepositoryImpl$markPackageAsDelivered$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$markPackageAsDelivered$1) continuation;
            if ((packageRepositoryImpl$markPackageAsDelivered$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$markPackageAsDelivered$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$markPackageAsDelivered$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$markPackageAsDelivered$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    packageRepositoryImpl$markPackageAsDelivered$1.Camera2StreamConfigurationMap = str;
                    packageRepositoryImpl$markPackageAsDelivered$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRepositoryImpl$markPackageAsDelivered$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = packageRemoteDataSource.markPackageAsDelivered(str, str2, packageRepositoryImpl$markPackageAsDelivered$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) packageRepositoryImpl$markPackageAsDelivered$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r6 = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package) ((arrow.core.Ior.Right) ior).getValue();
                    return arrow.core.EitherKt.right(r6 != null ? com.paypal.oslo.feature.packagetracking.data.mapper.PackageGraphQLMapperKt.toDomain(r6, str) : null);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r7 = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package) both.getRightValue();
                return arrow.core.EitherKt.right(r7 != null ? com.paypal.oslo.feature.packagetracking.data.mapper.PackageGraphQLMapperKt.toDomain(r7, str) : null);
            }
        }
        packageRepositoryImpl$markPackageAsDelivered$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$markPackageAsDelivered$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$markPackageAsDelivered$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$markPackageAsDelivered$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAmazonTrackingPreference(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAmazonTrackingPreference$1 packageRepositoryImpl$getAmazonTrackingPreference$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAmazonTrackingPreference$1) {
            packageRepositoryImpl$getAmazonTrackingPreference$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAmazonTrackingPreference$1) continuation;
            if ((packageRepositoryImpl$getAmazonTrackingPreference$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$getAmazonTrackingPreference$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$getAmazonTrackingPreference$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$getAmazonTrackingPreference$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType = com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType.AMAZON;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey = com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey.ALLOW_ORDER_TRACKING;
                    packageRepositoryImpl$getAmazonTrackingPreference$1.getHighSpeedVideoSizes = 1;
                    obj = packageRemoteDataSource.getUserPreferences(packageTrackingPreferenceType, packageTrackingPreferenceKey, packageRepositoryImpl$getAmazonTrackingPreference$1);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference preference = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((arrow.core.Ior.Right) ior).getValue());
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(preference != null ? preference.getPreferenceValue() : true));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference preference2 = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) both.getRightValue());
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(preference2 != null ? preference2.getPreferenceValue() : true));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$getAmazonTrackingPreference$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAmazonTrackingPreference$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$getAmazonTrackingPreference$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$getAmazonTrackingPreference$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveAmazonTrackingPreference(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$saveAmazonTrackingPreference$1 packageRepositoryImpl$saveAmazonTrackingPreference$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$saveAmazonTrackingPreference$1) {
            packageRepositoryImpl$saveAmazonTrackingPreference$1 = (com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$saveAmazonTrackingPreference$1) continuation;
            if ((packageRepositoryImpl$saveAmazonTrackingPreference$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                packageRepositoryImpl$saveAmazonTrackingPreference$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = packageRepositoryImpl$saveAmazonTrackingPreference$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRepositoryImpl$saveAmazonTrackingPreference$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType = com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType.AMAZON;
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey = com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey.ALLOW_ORDER_TRACKING;
                    packageRepositoryImpl$saveAmazonTrackingPreference$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    packageRepositoryImpl$saveAmazonTrackingPreference$1.Camera2StreamConfigurationMap = 1;
                    obj = packageRemoteDataSource.saveUserPreference(packageTrackingPreferenceType, packageTrackingPreferenceKey, z, packageRepositoryImpl$saveAmazonTrackingPreference$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = packageRepositoryImpl$saveAmazonTrackingPreference$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) both.getRightValue()).booleanValue()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRepositoryImpl$saveAmazonTrackingPreference$1 = new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$saveAmazonTrackingPreference$1(this, continuation);
        java.lang.Object obj2 = packageRepositoryImpl$saveAmazonTrackingPreference$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRepositoryImpl$saveAmazonTrackingPreference$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
