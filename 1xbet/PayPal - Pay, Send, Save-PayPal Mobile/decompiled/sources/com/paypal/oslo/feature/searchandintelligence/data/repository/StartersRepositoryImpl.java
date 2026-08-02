package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006*\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\rJ\u0013\u0010\u0014\u001a\u00020\u000b*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0019\u001a\u00020\u0007*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/StartersRepositoryImpl;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "surfaces", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "getPrompts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$AgenticStarter;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "getStarters", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/AgenticStarterFragment;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/AgenticStarterFragment;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "getHighSpeedVideoSizes", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;", "(Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StartersRepositoryImpl implements com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public StartersRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPrompts(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>>> continuation) {
        com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getPrompts$1 startersRepositoryImpl$getPrompts$1;
        int i;
        arrow.core.Ior ior;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> agenticStarters;
        arrow.core.Either right;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> agenticStarters2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getPrompts$1) {
            startersRepositoryImpl$getPrompts$1 = (com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getPrompts$1) continuation;
            if ((startersRepositoryImpl$getPrompts$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                startersRepositoryImpl$getPrompts$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getPrompts$1 startersRepositoryImpl$getPrompts$12 = startersRepositoryImpl$getPrompts$1;
                java.lang.Object obj = startersRepositoryImpl$getPrompts$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = startersRepositoryImpl$getPrompts$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                    java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list2 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) it.next()));
                    }
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery getAgenticStartersQuery = new com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery(new com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput(arrayList, null, 2, null));
                    startersRepositoryImpl$getPrompts$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    startersRepositoryImpl$getPrompts$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getAgenticStartersQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, startersRepositoryImpl$getPrompts$12, 2, (java.lang.Object) null);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.toNetworkError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data data = (com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return (data == null || (agenticStarters2 = data.getAgenticStarters()) == null || (right2 = arrow.core.EitherKt.right(getHighResolutionOutputSizeshNQ4ISI(agenticStarters2))) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.noDataError$default(null, 1, null)) : right2;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data data2 = (com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return (data2 == null || (agenticStarters = data2.getAgenticStarters()) == null || (right = arrow.core.EitherKt.right(getHighResolutionOutputSizeshNQ4ISI(agenticStarters))) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.toNetworkError(callError)) : right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        startersRepositoryImpl$getPrompts$1 = new com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getPrompts$1(this, continuation);
        com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getPrompts$1 startersRepositoryImpl$getPrompts$122 = startersRepositoryImpl$getPrompts$1;
        java.lang.Object obj2 = startersRepositoryImpl$getPrompts$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = startersRepositoryImpl$getPrompts$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> list) {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter) it.next()).getAgenticStarterFragment()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getStarters(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.searchandintelligence.domain.model.Starters>> continuation) {
        com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getStarters$1 startersRepositoryImpl$getStarters$1;
        int i;
        arrow.core.Ior ior;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> agenticStarters;
        com.paypal.oslo.feature.searchandintelligence.domain.model.Starters highSpeedVideoSizes;
        arrow.core.Either right;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> agenticStarters2;
        com.paypal.oslo.feature.searchandintelligence.domain.model.Starters highSpeedVideoSizes2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getStarters$1) {
            startersRepositoryImpl$getStarters$1 = (com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getStarters$1) continuation;
            if ((startersRepositoryImpl$getStarters$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                startersRepositoryImpl$getStarters$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getStarters$1 startersRepositoryImpl$getStarters$12 = startersRepositoryImpl$getStarters$1;
                java.lang.Object obj = startersRepositoryImpl$getStarters$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = startersRepositoryImpl$getStarters$12.getHighSpeedVideoFpsRangesFor;
                java.util.List list2 = null;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                java.lang.Object[] objArr3 = 0;
                java.lang.Object[] objArr4 = 0;
                java.lang.Object[] objArr5 = 0;
                java.lang.Object[] objArr6 = 0;
                java.lang.Object[] objArr7 = 0;
                java.lang.Object[] objArr8 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                    java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list3 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    java.util.Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) it.next()));
                    }
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery getAgenticStartersQuery = new com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery(new com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput(arrayList, null, 2, null));
                    startersRepositoryImpl$getStarters$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    startersRepositoryImpl$getStarters$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getAgenticStartersQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, startersRepositoryImpl$getStarters$12, 2, (java.lang.Object) null);
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
                int i2 = 3;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "sni.qsp.request.failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorCode(callError)), kotlin.TuplesKt.to("error_message", com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorMessage(callError))), null, 4, null);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(list2, objArr8 == true ? 1 : 0, i2, objArr7 == true ? 1 : 0));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data data = (com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null || (agenticStarters2 = data.getAgenticStarters()) == null || (highSpeedVideoSizes2 = getHighSpeedVideoSizes(agenticStarters2)) == null || (right2 = arrow.core.EitherKt.right(highSpeedVideoSizes2)) == null) {
                        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i2, objArr4 == true ? 1 : 0));
                    }
                    return right2;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data data2 = (com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (agenticStarters = data2.getAgenticStarters()) != null && (highSpeedVideoSizes = getHighSpeedVideoSizes(agenticStarters)) != null && (right = arrow.core.EitherKt.right(highSpeedVideoSizes)) != null) {
                        return right;
                    }
                    arrow.core.Either right3 = arrow.core.EitherKt.right(new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "sni.qsp.request.failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorCode(callError2)), kotlin.TuplesKt.to("error_message", com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorMessage(callError2))), null, 4, null);
                    return right3;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        startersRepositoryImpl$getStarters$1 = new com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getStarters$1(this, continuation);
        com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getStarters$1 startersRepositoryImpl$getStarters$122 = startersRepositoryImpl$getStarters$1;
        java.lang.Object obj2 = startersRepositoryImpl$getStarters$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = startersRepositoryImpl$getStarters$122.getHighSpeedVideoFpsRangesFor;
        java.util.List list22 = null;
        java.lang.Object[] objArr9 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr32 = 0;
        java.lang.Object[] objArr42 = 0;
        java.lang.Object[] objArr52 = 0;
        java.lang.Object[] objArr62 = 0;
        java.lang.Object[] objArr72 = 0;
        java.lang.Object[] objArr82 = 0;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        int i22 = 3;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt Camera2StreamConfigurationMap(com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment agenticStarterFragment) {
        java.lang.Object url;
        java.lang.String displayText = agenticStarterFragment.getDisplayText();
        com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(agenticStarterFragment.getSurface());
        com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment.OnURLIcon onURLIcon = agenticStarterFragment.getIcon().getOnURLIcon();
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt(displayText, highSpeedVideoFpsRanges, (onURLIcon == null || (url = onURLIcon.getUrl()) == null) ? null : url.toString(), (java.lang.String) null, agenticStarterFragment.getDisplayText(), (java.lang.String) null, 40, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.paypal.oslo.feature.searchandintelligence.domain.model.Starters getHighSpeedVideoSizes(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> list) {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter) it.next()).getAgenticStarterFragment()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List list3 = null;
        java.lang.Object[] objArr = 0;
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : arrayList2) {
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface = ((com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt) obj).getSurface();
            java.lang.Object obj2 = linkedHashMap.get(surface);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(surface, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(list3, linkedHashMap, 1, objArr == true ? 1 : 0);
    }

    private static com.paypal.oslo.api.graphql.schema.type.AgenticSurface getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface) {
        int i = com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[surface.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.AgenticSurface.ANY;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.AgenticSurface.HOME;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.AgenticSurface.SEND;
        }
        if (i == 4) {
            return com.paypal.oslo.api.graphql.schema.type.AgenticSurface.SPEND;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.AgenticSurface.ME;
    }

    private static com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.AgenticSurface agenticSurface) {
        switch (com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[agenticSurface.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ANY;
            case 2:
                return com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.HOME;
            case 3:
                return com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.SEND;
            case 4:
                return com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.SPEND;
            case 5:
                return com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ME;
            case 6:
                return com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ANY;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.values().length];
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ANY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.HOME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.SEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.SPEND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.AgenticSurface.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AgenticSurface.ANY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AgenticSurface.HOME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AgenticSurface.SEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AgenticSurface.SPEND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AgenticSurface.ME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AgenticSurface.UNKNOWN__.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
