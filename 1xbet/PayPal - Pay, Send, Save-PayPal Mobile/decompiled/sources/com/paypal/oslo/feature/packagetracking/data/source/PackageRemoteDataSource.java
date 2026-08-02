package com.paypal.oslo.feature.packagetracking.data.source;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b!\u0010\"J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\nH\u0086@¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001f0\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0086@¢\u0006\u0004\b&\u0010'J6\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b(\u0010\u000eJ4\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b*\u0010\u000eJ.\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010+0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b,\u0010-J:\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u001f0\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u000100H\u0086@¢\u0006\u0004\b3\u00104J4\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00105\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/data/source/PackageRemoteDataSource;", "", "Lcom/paypal/oslo/feature/packagetracking/data/source/PackageGraphQLExecutor;", "executor", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/data/source/PackageGraphQLExecutor;)V", "", "carrierId", "trackingNumber", "transactionNumber", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;", "getPackageDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "emailProvider", "getAuthorizationUrl", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provider", "authorizationCode", "state", "", "authorizePackageTracking", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImportedData", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingMutation$DeauthorizePackageTracking;", "deauthorizeEmailProvider", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;", "deauthorizeAllEmailProviders", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Item;", "getEmailLinkStatus", "(Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removePackage", "nickname", "updatePackageNickname", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "markPackageAsDelivered", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;", "preferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;", "preferenceKey", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Preference;", "getUserPreferences", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preferenceValue", "saveUserPreference", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingPreferenceKey;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/packagetracking/data/source/PackageGraphQLExecutor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PackageRemoteDataSource {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PackageRemoteDataSource(com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor packageGraphQLExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageGraphQLExecutor, "");
        this.getHighSpeedVideoFpsRangesFor = packageGraphQLExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPackageDetail(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getPackageDetail$1 packageRemoteDataSource$getPackageDetail$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getPackageDetail$1) {
            packageRemoteDataSource$getPackageDetail$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getPackageDetail$1) continuation;
            if ((packageRemoteDataSource$getPackageDetail$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$getPackageDetail$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getPackageDetail$1 packageRemoteDataSource$getPackageDetail$12 = packageRemoteDataSource$getPackageDetail$1;
                java.lang.Object obj = packageRemoteDataSource$getPackageDetail$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$getPackageDetail$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput shipmentPackageInput = new com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput(str, str2, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str3));
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery getPackageDetailQuery = new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery(shipmentPackageInput);
                    packageRemoteDataSource$getPackageDetail$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRemoteDataSource$getPackageDetail$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRemoteDataSource$getPackageDetail$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    packageRemoteDataSource$getPackageDetail$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(shipmentPackageInput);
                    packageRemoteDataSource$getPackageDetail$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPackageDetailQuery);
                    packageRemoteDataSource$getPackageDetail$12.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor.executeQuery$default(this.getHighSpeedVideoFpsRangesFor, getPackageDetailQuery, null, packageRemoteDataSource$getPackageDetail$12, 2, null);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data data = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    shipmentPackage = data != null ? data.getShipmentPackage() : null;
                    if (shipmentPackage != null) {
                        return new arrow.core.Ior.Right(shipmentPackage);
                    }
                    return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError("Package not found", kotlin.collections.CollectionsKt.listOf("shipmentPackage"), null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    shipmentPackage = data2 != null ? data2.getShipmentPackage() : null;
                    if (shipmentPackage != null) {
                        return new arrow.core.Ior.Both(callError, shipmentPackage);
                    }
                    return new arrow.core.Ior.Left(callError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$getPackageDetail$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getPackageDetail$1(this, continuation);
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getPackageDetail$1 packageRemoteDataSource$getPackageDetail$122 = packageRemoteDataSource$getPackageDetail$1;
        java.lang.Object obj2 = packageRemoteDataSource$getPackageDetail$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$getPackageDetail$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAuthorizationUrl(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getAuthorizationUrl$1 packageRemoteDataSource$getAuthorizationUrl$1;
        int i;
        arrow.core.Ior ior;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getAuthorizationUrl$1) {
            packageRemoteDataSource$getAuthorizationUrl$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getAuthorizationUrl$1) continuation;
            if ((packageRemoteDataSource$getAuthorizationUrl$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$getAuthorizationUrl$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$getAuthorizationUrl$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$getAuthorizationUrl$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.graphql.GetAuthorizationURLQuery getAuthorizationURLQuery = new com.paypal.oslo.feature.packagetracking.graphql.GetAuthorizationURLQuery(packageTrackingIdentityProvider);
                    com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
                    packageRemoteDataSource$getAuthorizationUrl$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingIdentityProvider);
                    packageRemoteDataSource$getAuthorizationUrl$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getAuthorizationURLQuery);
                    packageRemoteDataSource$getAuthorizationUrl$1.getHighSpeedVideoFpsRanges = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeQuery(getAuthorizationURLQuery, fetchPolicy, packageRemoteDataSource$getAuthorizationUrl$1);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.GetAuthorizationURLQuery.Data data = (com.paypal.oslo.feature.packagetracking.graphql.GetAuthorizationURLQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    java.lang.Object authorizePackageTrackingURL = data != null ? data.getAuthorizePackageTrackingURL() : null;
                    str = authorizePackageTrackingURL instanceof java.lang.String ? (java.lang.String) authorizePackageTrackingURL : null;
                    if (str != null) {
                        return new arrow.core.Ior.Right(str);
                    }
                    return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError("Authorization URL not found", kotlin.collections.CollectionsKt.listOf("authorizePackageTrackingURL"), null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.GetAuthorizationURLQuery.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.GetAuthorizationURLQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    java.lang.Object authorizePackageTrackingURL2 = data2 != null ? data2.getAuthorizePackageTrackingURL() : null;
                    str = authorizePackageTrackingURL2 instanceof java.lang.String ? (java.lang.String) authorizePackageTrackingURL2 : null;
                    if (str != null) {
                        return new arrow.core.Ior.Both(callError, str);
                    }
                    return new arrow.core.Ior.Left(callError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$getAuthorizationUrl$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getAuthorizationUrl$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$getAuthorizationUrl$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$getAuthorizationUrl$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object authorizePackageTracking(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$authorizePackageTracking$1 packageRemoteDataSource$authorizePackageTracking$1;
        int i;
        arrow.core.Ior ior;
        java.lang.Boolean authorizePackageTracking;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$authorizePackageTracking$1) {
            packageRemoteDataSource$authorizePackageTracking$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$authorizePackageTracking$1) continuation;
            if ((packageRemoteDataSource$authorizePackageTracking$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$authorizePackageTracking$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$authorizePackageTracking$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$authorizePackageTracking$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput authorizePackageTrackingInput = new com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput(packageTrackingIdentityProvider, str, str2, null, 8, null);
                    com.paypal.oslo.feature.packagetracking.graphql.AuthorizePackageTrackingMutation authorizePackageTrackingMutation = new com.paypal.oslo.feature.packagetracking.graphql.AuthorizePackageTrackingMutation(authorizePackageTrackingInput);
                    packageRemoteDataSource$authorizePackageTracking$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingIdentityProvider);
                    packageRemoteDataSource$authorizePackageTracking$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRemoteDataSource$authorizePackageTracking$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRemoteDataSource$authorizePackageTracking$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authorizePackageTrackingInput);
                    packageRemoteDataSource$authorizePackageTracking$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authorizePackageTrackingMutation);
                    packageRemoteDataSource$authorizePackageTracking$1.getOutputMinFrameDuration = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(authorizePackageTrackingMutation, packageRemoteDataSource$authorizePackageTracking$1);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.AuthorizePackageTrackingMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.AuthorizePackageTrackingMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    authorizePackageTracking = data != null ? data.getAuthorizePackageTracking() : null;
                    if (authorizePackageTracking != null) {
                        return new arrow.core.Ior.Right(authorizePackageTracking);
                    }
                    return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError("Authorization failed", kotlin.collections.CollectionsKt.listOf("authorizePackageTracking"), null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.AuthorizePackageTrackingMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.AuthorizePackageTrackingMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    authorizePackageTracking = data2 != null ? data2.getAuthorizePackageTracking() : null;
                    if (authorizePackageTracking != null) {
                        return new arrow.core.Ior.Both(callError, authorizePackageTracking);
                    }
                    return new arrow.core.Ior.Left(callError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$authorizePackageTracking$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$authorizePackageTracking$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$authorizePackageTracking$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$authorizePackageTracking$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getUserDetails(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserDetails$1 packageRemoteDataSource$getUserDetails$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery.UserTrackingDetails userTrackingDetails;
        com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery.UserTrackingDetails userTrackingDetails2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserDetails$1) {
            packageRemoteDataSource$getUserDetails$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserDetails$1) continuation;
            if ((packageRemoteDataSource$getUserDetails$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$getUserDetails$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserDetails$1 packageRemoteDataSource$getUserDetails$12 = packageRemoteDataSource$getUserDetails$1;
                java.lang.Object obj = packageRemoteDataSource$getUserDetails$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$getUserDetails$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery getUserDetailsQuery = new com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery();
                    packageRemoteDataSource$getUserDetails$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getUserDetailsQuery);
                    packageRemoteDataSource$getUserDetails$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor.executeQuery$default(this.getHighSpeedVideoFpsRangesFor, getUserDetailsQuery, null, packageRemoteDataSource$getUserDetails$12, 2, null);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery.Data data = (com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (userTrackingDetails2 = data.getUserTrackingDetails()) != null) {
                        packageTrackingIdentityProvider = userTrackingDetails2.getEmailProvider();
                    }
                    return new arrow.core.Ior.Right(packageTrackingIdentityProvider);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.GetUserDetailsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (userTrackingDetails = data2.getUserTrackingDetails()) != null) {
                        packageTrackingIdentityProvider = userTrackingDetails.getEmailProvider();
                    }
                    return new arrow.core.Ior.Both(callError, packageTrackingIdentityProvider);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$getUserDetails$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserDetails$1(this, continuation);
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserDetails$1 packageRemoteDataSource$getUserDetails$122 = packageRemoteDataSource$getUserDetails$1;
        java.lang.Object obj2 = packageRemoteDataSource$getUserDetails$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$getUserDetails$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deauthorizeEmailProvider(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.DeauthorizePackageTracking>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeEmailProvider$1 packageRemoteDataSource$deauthorizeEmailProvider$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeEmailProvider$1) {
            packageRemoteDataSource$deauthorizeEmailProvider$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeEmailProvider$1) continuation;
            if ((packageRemoteDataSource$deauthorizeEmailProvider$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$deauthorizeEmailProvider$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$deauthorizeEmailProvider$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$deauthorizeEmailProvider$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput deauthorizePackageTrackingInput = new com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingInput(packageTrackingIdentityProvider, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)));
                    com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation deauthorizePackageTrackingMutation = new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation(deauthorizePackageTrackingInput);
                    packageRemoteDataSource$deauthorizeEmailProvider$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingIdentityProvider);
                    packageRemoteDataSource$deauthorizeEmailProvider$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deauthorizePackageTrackingInput);
                    packageRemoteDataSource$deauthorizeEmailProvider$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deauthorizePackageTrackingMutation);
                    packageRemoteDataSource$deauthorizeEmailProvider$1.getHighSpeedVideoFpsRanges = z;
                    packageRemoteDataSource$deauthorizeEmailProvider$1.Camera2StreamConfigurationMap = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(deauthorizePackageTrackingMutation, packageRemoteDataSource$deauthorizeEmailProvider$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = packageRemoteDataSource$deauthorizeEmailProvider$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return new arrow.core.Ior.Right(data != null ? data.getDeauthorizePackageTracking() : null);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return new arrow.core.Ior.Both(callError, data2 != null ? data2.getDeauthorizePackageTracking() : null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$deauthorizeEmailProvider$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeEmailProvider$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$deauthorizeEmailProvider$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$deauthorizeEmailProvider$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object deauthorizeAllEmailProviders$default(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return packageRemoteDataSource.deauthorizeAllEmailProviders(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deauthorizeAllEmailProviders(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization>>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeAllEmailProviders$1 packageRemoteDataSource$deauthorizeAllEmailProviders$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders;
        com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeAllEmailProviders$1) {
            packageRemoteDataSource$deauthorizeAllEmailProviders$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeAllEmailProviders$1) continuation;
            if ((packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput deauthorizePackageTrackingForAllProvidersInput = new com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput(com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)));
                    com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation deauthorizePackageTrackingForAllProvidersMutation = new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation(deauthorizePackageTrackingForAllProvidersInput);
                    packageRemoteDataSource$deauthorizeAllEmailProviders$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deauthorizePackageTrackingForAllProvidersInput);
                    packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deauthorizePackageTrackingForAllProvidersMutation);
                    packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighSpeedVideoFpsRanges = z;
                    packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(deauthorizePackageTrackingForAllProvidersMutation, packageRemoteDataSource$deauthorizeAllEmailProviders$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> list = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (deauthorizePackageTrackingForAllProviders2 = data.getDeauthorizePackageTrackingForAllProviders()) != null) {
                        list = deauthorizePackageTrackingForAllProviders2.getDeauthorizations();
                    }
                    return new arrow.core.Ior.Right(list);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (deauthorizePackageTrackingForAllProviders = data2.getDeauthorizePackageTrackingForAllProviders()) != null) {
                        list = deauthorizePackageTrackingForAllProviders.getDeauthorizations();
                    }
                    return new arrow.core.Ior.Both(callError, list);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$deauthorizeAllEmailProviders$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deauthorizeAllEmailProviders$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$deauthorizeAllEmailProviders$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteImportedData(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deleteImportedData$1 packageRemoteDataSource$deleteImportedData$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation.DeleteImportedData deleteImportedData;
        java.lang.Boolean success;
        com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation.DeleteImportedData deleteImportedData2;
        java.lang.Boolean success2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deleteImportedData$1) {
            packageRemoteDataSource$deleteImportedData$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deleteImportedData$1) continuation;
            if ((packageRemoteDataSource$deleteImportedData$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$deleteImportedData$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$deleteImportedData$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$deleteImportedData$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation deleteImportedDataMutation = new com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation();
                    packageRemoteDataSource$deleteImportedData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deleteImportedDataMutation);
                    packageRemoteDataSource$deleteImportedData$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(deleteImportedDataMutation, packageRemoteDataSource$deleteImportedData$1);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                boolean z = false;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (deleteImportedData2 = data.getDeleteImportedData()) != null && (success2 = deleteImportedData2.getSuccess()) != null) {
                        z = success2.booleanValue();
                    }
                    return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (deleteImportedData = data2.getDeleteImportedData()) != null && (success = deleteImportedData.getSuccess()) != null) {
                        z = success.booleanValue();
                    }
                    return new arrow.core.Ior.Both(callError, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$deleteImportedData$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$deleteImportedData$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$deleteImportedData$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$deleteImportedData$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object getEmailLinkStatus$default(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fetchPolicy = null;
        }
        return packageRemoteDataSource.getEmailLinkStatus(fetchPolicy, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getEmailLinkStatus(com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item>>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getEmailLinkStatus$1 packageRemoteDataSource$getEmailLinkStatus$1;
        int i;
        arrow.core.Ior ior;
        java.util.List emptyList;
        com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> items;
        java.util.List emptyList2;
        com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks2;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> items2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getEmailLinkStatus$1) {
            packageRemoteDataSource$getEmailLinkStatus$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getEmailLinkStatus$1) continuation;
            if ((packageRemoteDataSource$getEmailLinkStatus$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$getEmailLinkStatus$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$getEmailLinkStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$getEmailLinkStatus$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery getEmailLinkStatusQuery = new com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery();
                    packageRemoteDataSource$getEmailLinkStatus$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    packageRemoteDataSource$getEmailLinkStatus$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getEmailLinkStatusQuery);
                    packageRemoteDataSource$getEmailLinkStatus$1.Camera2StreamConfigurationMap = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeQuery(getEmailLinkStatusQuery, fetchPolicy, packageRemoteDataSource$getEmailLinkStatus$1);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data data = (com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null || (packageEmailLinks2 = data.getPackageEmailLinks()) == null || (items2 = packageEmailLinks2.getItems()) == null || (emptyList2 = kotlin.collections.CollectionsKt.filterNotNull(items2)) == null) {
                        emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new arrow.core.Ior.Right(emptyList2);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 == null || (packageEmailLinks = data2.getPackageEmailLinks()) == null || (items = packageEmailLinks.getItems()) == null || (emptyList = kotlin.collections.CollectionsKt.filterNotNull(items)) == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new arrow.core.Ior.Both(callError, emptyList);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$getEmailLinkStatus$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getEmailLinkStatus$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$getEmailLinkStatus$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$getEmailLinkStatus$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removePackage(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$removePackage$1 packageRemoteDataSource$removePackage$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation.DeletePackage deletePackage;
        com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation.DeletePackage deletePackage2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$removePackage$1) {
            packageRemoteDataSource$removePackage$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$removePackage$1) continuation;
            if ((packageRemoteDataSource$removePackage$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$removePackage$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$removePackage$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$removePackage$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.DeletePackageInput deletePackageInput = new com.paypal.oslo.api.graphql.schema.type.DeletePackageInput(str, str2, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str3));
                    com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation deletePackageMutation = new com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation(deletePackageInput);
                    packageRemoteDataSource$removePackage$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRemoteDataSource$removePackage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRemoteDataSource$removePackage$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    packageRemoteDataSource$removePackage$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePackageInput);
                    packageRemoteDataSource$removePackage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePackageMutation);
                    packageRemoteDataSource$removePackage$1.getOutputFormats = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(deletePackageMutation, packageRemoteDataSource$removePackage$1);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                boolean z = false;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (deletePackage2 = data.getDeletePackage()) != null) {
                        z = deletePackage2.isDeleted();
                    }
                    return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.DeletePackageMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (deletePackage = data2.getDeletePackage()) != null) {
                        z = deletePackage.isDeleted();
                    }
                    return new arrow.core.Ior.Both(callError, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$removePackage$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$removePackage$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$removePackage$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$removePackage$1.getOutputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePackageNickname(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$updatePackageNickname$1 packageRemoteDataSource$updatePackageNickname$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation.UpdatePackageNickname updatePackageNickname;
        com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation.UpdatePackageNickname updatePackageNickname2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$updatePackageNickname$1) {
            packageRemoteDataSource$updatePackageNickname$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$updatePackageNickname$1) continuation;
            if ((packageRemoteDataSource$updatePackageNickname$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$updatePackageNickname$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$updatePackageNickname$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$updatePackageNickname$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.UpdatePackageNicknameInput updatePackageNicknameInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePackageNicknameInput(str, str2, str3);
                    com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation updatePackageNicknameMutation = new com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation(updatePackageNicknameInput);
                    packageRemoteDataSource$updatePackageNickname$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRemoteDataSource$updatePackageNickname$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRemoteDataSource$updatePackageNickname$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    packageRemoteDataSource$updatePackageNickname$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePackageNicknameInput);
                    packageRemoteDataSource$updatePackageNickname$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePackageNicknameMutation);
                    packageRemoteDataSource$updatePackageNickname$1.getInputSizeshNQ4ISI = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(updatePackageNicknameMutation, packageRemoteDataSource$updatePackageNickname$1);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                java.lang.String str4 = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (updatePackageNickname2 = data.getUpdatePackageNickname()) != null) {
                        str4 = updatePackageNickname2.getPackageNickname();
                    }
                    return new arrow.core.Ior.Right(str4 != null ? str4 : "");
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.UpdatePackageNicknameMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (updatePackageNickname = data2.getUpdatePackageNickname()) != null) {
                        str4 = updatePackageNickname.getPackageNickname();
                    }
                    return new arrow.core.Ior.Both(callError, str4 != null ? str4 : "");
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$updatePackageNickname$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$updatePackageNickname$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$updatePackageNickname$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$updatePackageNickname$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object markPackageAsDelivered(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$markPackageAsDelivered$1 packageRemoteDataSource$markPackageAsDelivered$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered;
        com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$markPackageAsDelivered$1) {
            packageRemoteDataSource$markPackageAsDelivered$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$markPackageAsDelivered$1) continuation;
            if ((packageRemoteDataSource$markPackageAsDelivered$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$markPackageAsDelivered$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$markPackageAsDelivered$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$markPackageAsDelivered$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput markPackageAsDeliveredInput = new com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput(str, str2, null, 4, null);
                    com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation markPackageAsDeliveredMutation = new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation(markPackageAsDeliveredInput);
                    packageRemoteDataSource$markPackageAsDelivered$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    packageRemoteDataSource$markPackageAsDelivered$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    packageRemoteDataSource$markPackageAsDelivered$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(markPackageAsDeliveredInput);
                    packageRemoteDataSource$markPackageAsDelivered$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(markPackageAsDeliveredMutation);
                    packageRemoteDataSource$markPackageAsDelivered$1.getHighSpeedVideoFpsRanges = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(markPackageAsDeliveredMutation, packageRemoteDataSource$markPackageAsDelivered$1);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r12 = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (markPackageAsDelivered2 = data.getMarkPackageAsDelivered()) != null) {
                        r12 = markPackageAsDelivered2.getPackage();
                    }
                    return new arrow.core.Ior.Right(r12);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (markPackageAsDelivered = data2.getMarkPackageAsDelivered()) != null) {
                        r12 = markPackageAsDelivered.getPackage();
                    }
                    return new arrow.core.Ior.Both(callError, r12);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$markPackageAsDelivered$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$markPackageAsDelivered$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$markPackageAsDelivered$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$markPackageAsDelivered$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object getUserPreferences$default(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            packageTrackingPreferenceType = null;
        }
        if ((i & 2) != 0) {
            packageTrackingPreferenceKey = null;
        }
        return packageRemoteDataSource.getUserPreferences(packageTrackingPreferenceType, packageTrackingPreferenceKey, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getUserPreferences(com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference>>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserPreferences$1 packageRemoteDataSource$getUserPreferences$1;
        int i;
        arrow.core.Ior ior;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> emptyList;
        com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences;
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> emptyList2;
        com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserPreferences$1) {
            packageRemoteDataSource$getUserPreferences$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserPreferences$1) continuation;
            if ((packageRemoteDataSource$getUserPreferences$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$getUserPreferences$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserPreferences$1 packageRemoteDataSource$getUserPreferences$12 = packageRemoteDataSource$getUserPreferences$1;
                java.lang.Object obj = packageRemoteDataSource$getUserPreferences$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$getUserPreferences$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput packageTrackingUserPreferencesInput = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingUserPreferencesInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(packageTrackingPreferenceType), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(packageTrackingPreferenceKey));
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery getPackageTrackingUserPreferencesQuery = new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery(com.apollographql.apollo.api.Optional.INSTANCE.present(packageTrackingUserPreferencesInput));
                    packageRemoteDataSource$getUserPreferences$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingPreferenceType);
                    packageRemoteDataSource$getUserPreferences$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingPreferenceKey);
                    packageRemoteDataSource$getUserPreferences$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingUserPreferencesInput);
                    packageRemoteDataSource$getUserPreferences$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPackageTrackingUserPreferencesQuery);
                    packageRemoteDataSource$getUserPreferences$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor.executeQuery$default(this.getHighSpeedVideoFpsRangesFor, getPackageTrackingUserPreferencesQuery, null, packageRemoteDataSource$getUserPreferences$12, 2, null);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data data = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null || (packageTrackingUserPreferences2 = data.getPackageTrackingUserPreferences()) == null || (emptyList2 = packageTrackingUserPreferences2.getPreferences()) == null) {
                        emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new arrow.core.Ior.Right(emptyList2);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 == null || (packageTrackingUserPreferences = data2.getPackageTrackingUserPreferences()) == null || (emptyList = packageTrackingUserPreferences.getPreferences()) == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new arrow.core.Ior.Both(callError, emptyList);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$getUserPreferences$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserPreferences$1(this, continuation);
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserPreferences$1 packageRemoteDataSource$getUserPreferences$122 = packageRemoteDataSource$getUserPreferences$1;
        java.lang.Object obj2 = packageRemoteDataSource$getUserPreferences$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$getUserPreferences$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveUserPreference(com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType, com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$saveUserPreference$1 packageRemoteDataSource$saveUserPreference$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference;
        com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference;
        com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.SavePackageTrackingUserPreference savePackageTrackingUserPreference2;
        com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Preference preference2;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$saveUserPreference$1) {
            packageRemoteDataSource$saveUserPreference$1 = (com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$saveUserPreference$1) continuation;
            if ((packageRemoteDataSource$saveUserPreference$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                packageRemoteDataSource$saveUserPreference$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = packageRemoteDataSource$saveUserPreference$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageRemoteDataSource$saveUserPreference$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput savePackageTrackingUserPreferenceInput = new com.paypal.oslo.api.graphql.schema.type.SavePackageTrackingUserPreferenceInput(packageTrackingPreferenceType, packageTrackingPreferenceKey, z);
                    com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation savePackageTrackingUserPreferenceMutation = new com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation(savePackageTrackingUserPreferenceInput);
                    packageRemoteDataSource$saveUserPreference$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingPreferenceType);
                    packageRemoteDataSource$saveUserPreference$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageTrackingPreferenceKey);
                    packageRemoteDataSource$saveUserPreference$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savePackageTrackingUserPreferenceInput);
                    packageRemoteDataSource$saveUserPreference$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savePackageTrackingUserPreferenceMutation);
                    packageRemoteDataSource$saveUserPreference$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    packageRemoteDataSource$saveUserPreference$1.getOutputMinFrameDuration = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.executeMutation(savePackageTrackingUserPreferenceMutation, packageRemoteDataSource$saveUserPreference$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = packageRemoteDataSource$saveUserPreference$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data data = (com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (savePackageTrackingUserPreference2 = data.getSavePackageTrackingUserPreference()) != null && (preference2 = savePackageTrackingUserPreference2.getPreference()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(preference2.getPreferenceValue());
                    }
                    if (bool != null) {
                        return new arrow.core.Ior.Right(bool);
                    }
                    return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError("Save preference returned null", kotlin.collections.CollectionsKt.listOf("savePackageTrackingUserPreference"), null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data data2 = (com.paypal.oslo.feature.packagetracking.graphql.SavePackageTrackingUserPreferenceMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (savePackageTrackingUserPreference = data2.getSavePackageTrackingUserPreference()) != null && (preference = savePackageTrackingUserPreference.getPreference()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(preference.getPreferenceValue());
                    }
                    if (bool != null) {
                        return new arrow.core.Ior.Both(callError, bool);
                    }
                    return new arrow.core.Ior.Left(callError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        packageRemoteDataSource$saveUserPreference$1 = new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$saveUserPreference$1(this, continuation);
        java.lang.Object obj2 = packageRemoteDataSource$saveUserPreference$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageRemoteDataSource$saveUserPreference$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
