package com.paypal.oslo.feature.publicprofile.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0010J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0010J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/data/repository/PublicProfileRepositoryImpl;", "Lcom/paypal/oslo/feature/publicprofile/domain/repository/PublicProfileRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "accountId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "getPublicProfile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "addFavorite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavorite", "deleteContact", "blockContact", "unblockContact", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileRepositoryImpl implements com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PublicProfileRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5 A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x0049, B:13:0x00bb, B:16:0x00c5, B:17:0x00ea, B:19:0x00f8, B:22:0x0109, B:23:0x0113, B:26:0x00dd, B:27:0x0114, B:28:0x0119), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8 A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TryCatch #4 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x0049, B:13:0x00bb, B:16:0x00c5, B:17:0x00ea, B:19:0x00f8, B:22:0x0109, B:23:0x0113, B:26:0x00dd, B:27:0x0114, B:28:0x0119), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0109 A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TryCatch #4 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x0049, B:13:0x00bb, B:16:0x00c5, B:17:0x00ea, B:19:0x00f8, B:22:0x0109, B:23:0x0113, B:26:0x00dd, B:27:0x0114, B:28:0x0119), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v19, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPublicProfile(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError, com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile>> continuation) {
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$getPublicProfile$1 publicProfileRepositoryImpl$getPublicProfile$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data data;
        java.lang.String str3 = str2;
        if (continuation instanceof com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$getPublicProfile$1) {
            publicProfileRepositoryImpl$getPublicProfile$1 = (com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$getPublicProfile$1) continuation;
            if ((publicProfileRepositoryImpl$getPublicProfile$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                publicProfileRepositoryImpl$getPublicProfile$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$getPublicProfile$1 publicProfileRepositoryImpl$getPublicProfile$12 = publicProfileRepositoryImpl$getPublicProfile$1;
                java.lang.Object obj = publicProfileRepositoryImpl$getPublicProfile$12.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = publicProfileRepositoryImpl$getPublicProfile$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery getPublicProfileQuery = new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery(new com.paypal.oslo.api.graphql.schema.type.PublicProfileInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str), null, null, 6, null), str3);
                        publicProfileRepositoryImpl$getPublicProfile$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        publicProfileRepositoryImpl$getPublicProfile$12.getInputSizeshNQ4ISI = str3;
                        publicProfileRepositoryImpl$getPublicProfile$12.getInputFormats = defaultRaise;
                        publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoSizesFor = defaultRaise2;
                        publicProfileRepositoryImpl$getPublicProfile$12.getOutputMinFrameDuration = defaultRaise2;
                        publicProfileRepositoryImpl$getPublicProfile$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoFpsRangesFor = 0;
                        publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoFpsRanges = 0;
                        publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoSizes = 0;
                        publicProfileRepositoryImpl$getPublicProfile$12.getOutputFormats = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getPublicProfileQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, publicProfileRepositoryImpl$getPublicProfile$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                        defaultRaise3 = defaultRaise;
                        obj = execute$default;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoSizes;
                    int i3 = publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoFpsRanges;
                    int i4 = publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = publicProfileRepositoryImpl$getPublicProfile$12.getHighResolutionOutputSizeshNQ4ISI;
                    ?? r0 = (arrow.core.raise.Raise) publicProfileRepositoryImpl$getPublicProfile$12.getOutputMinFrameDuration;
                    raise = (arrow.core.raise.Raise) publicProfileRepositoryImpl$getPublicProfile$12.getHighSpeedVideoSizesFor;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) publicProfileRepositoryImpl$getPublicProfile$12.getInputFormats;
                    java.lang.String str4 = (java.lang.String) publicProfileRepositoryImpl$getPublicProfile$12.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r0;
                        str3 = str4;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImplKt.access$toPublicProfileError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) defaultRaise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile = com.paypal.oslo.feature.publicprofile.data.mapper.PublicProfileMapper.INSTANCE.toPublicProfile(data, str3);
                defaultRaise3.complete();
                return new arrow.core.Either.Right(publicProfile);
            }
        }
        publicProfileRepositoryImpl$getPublicProfile$1 = new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$getPublicProfile$1(this, continuation);
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$getPublicProfile$1 publicProfileRepositoryImpl$getPublicProfile$122 = publicProfileRepositoryImpl$getPublicProfile$1;
        java.lang.Object obj2 = publicProfileRepositoryImpl$getPublicProfile$122.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = publicProfileRepositoryImpl$getPublicProfile$122.getOutputFormats;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) defaultRaise2.bind(right)).getData();
        if (data != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addFavorite(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$addFavorite$1 publicProfileRepositoryImpl$addFavorite$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.publicprofile.graphql.FavoritePublicProfileContactMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$addFavorite$1) {
            publicProfileRepositoryImpl$addFavorite$1 = (com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$addFavorite$1) continuation;
            if ((publicProfileRepositoryImpl$addFavorite$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                publicProfileRepositoryImpl$addFavorite$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$addFavorite$1 publicProfileRepositoryImpl$addFavorite$12 = publicProfileRepositoryImpl$addFavorite$1;
                java.lang.Object obj = publicProfileRepositoryImpl$addFavorite$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = publicProfileRepositoryImpl$addFavorite$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.publicprofile.graphql.FavoritePublicProfileContactMutation favoritePublicProfileContactMutation = new com.paypal.oslo.feature.publicprofile.graphql.FavoritePublicProfileContactMutation(new com.paypal.oslo.api.graphql.schema.type.FavoriteContactInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(str), 1, null));
                        publicProfileRepositoryImpl$addFavorite$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        publicProfileRepositoryImpl$addFavorite$12.getInputFormats = defaultRaise;
                        publicProfileRepositoryImpl$addFavorite$12.getOutputMinFrameDuration = defaultRaise3;
                        publicProfileRepositoryImpl$addFavorite$12.getOutputFormats = defaultRaise3;
                        publicProfileRepositoryImpl$addFavorite$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        publicProfileRepositoryImpl$addFavorite$12.getHighSpeedVideoFpsRanges = 0;
                        publicProfileRepositoryImpl$addFavorite$12.getHighSpeedVideoFpsRangesFor = 0;
                        publicProfileRepositoryImpl$addFavorite$12.Camera2StreamConfigurationMap = 0;
                        publicProfileRepositoryImpl$addFavorite$12.getInputSizeshNQ4ISI = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, favoritePublicProfileContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, publicProfileRepositoryImpl$addFavorite$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = execute$default;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = publicProfileRepositoryImpl$addFavorite$12.Camera2StreamConfigurationMap;
                    int i3 = publicProfileRepositoryImpl$addFavorite$12.getHighSpeedVideoFpsRangesFor;
                    int i4 = publicProfileRepositoryImpl$addFavorite$12.getHighSpeedVideoFpsRanges;
                    int i5 = publicProfileRepositoryImpl$addFavorite$12.getHighResolutionOutputSizeshNQ4ISI;
                    raise2 = (arrow.core.raise.Raise) publicProfileRepositoryImpl$addFavorite$12.getOutputFormats;
                    raise = (arrow.core.raise.Raise) publicProfileRepositoryImpl$addFavorite$12.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) publicProfileRepositoryImpl$addFavorite$12.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImplKt.access$toPublicProfileError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.publicprofile.graphql.FavoritePublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (!data.getFavoriteContact().isSuccessful()) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        publicProfileRepositoryImpl$addFavorite$1 = new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$addFavorite$1(this, continuation);
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$addFavorite$1 publicProfileRepositoryImpl$addFavorite$122 = publicProfileRepositoryImpl$addFavorite$1;
        java.lang.Object obj2 = publicProfileRepositoryImpl$addFavorite$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = publicProfileRepositoryImpl$addFavorite$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.publicprofile.graphql.FavoritePublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeFavorite(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$removeFavorite$1 publicProfileRepositoryImpl$removeFavorite$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.publicprofile.graphql.UnfavoritePublicProfileContactMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$removeFavorite$1) {
            publicProfileRepositoryImpl$removeFavorite$1 = (com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$removeFavorite$1) continuation;
            if ((publicProfileRepositoryImpl$removeFavorite$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                publicProfileRepositoryImpl$removeFavorite$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$removeFavorite$1 publicProfileRepositoryImpl$removeFavorite$12 = publicProfileRepositoryImpl$removeFavorite$1;
                java.lang.Object obj = publicProfileRepositoryImpl$removeFavorite$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.publicprofile.graphql.UnfavoritePublicProfileContactMutation unfavoritePublicProfileContactMutation = new com.paypal.oslo.feature.publicprofile.graphql.UnfavoritePublicProfileContactMutation(new com.paypal.oslo.api.graphql.schema.type.UnfavoriteContactInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(str), 1, null));
                        publicProfileRepositoryImpl$removeFavorite$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        publicProfileRepositoryImpl$removeFavorite$12.getOutputMinFrameDuration = defaultRaise;
                        publicProfileRepositoryImpl$removeFavorite$12.getOutputFormats = defaultRaise3;
                        publicProfileRepositoryImpl$removeFavorite$12.getInputSizeshNQ4ISI = defaultRaise3;
                        publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoSizes = 0;
                        publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoFpsRangesFor = 0;
                        publicProfileRepositoryImpl$removeFavorite$12.Camera2StreamConfigurationMap = 0;
                        publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoFpsRanges = 0;
                        publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, unfavoritePublicProfileContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, publicProfileRepositoryImpl$removeFavorite$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = execute$default;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoFpsRanges;
                    int i3 = publicProfileRepositoryImpl$removeFavorite$12.Camera2StreamConfigurationMap;
                    int i4 = publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = publicProfileRepositoryImpl$removeFavorite$12.getHighSpeedVideoSizes;
                    raise2 = (arrow.core.raise.Raise) publicProfileRepositoryImpl$removeFavorite$12.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) publicProfileRepositoryImpl$removeFavorite$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) publicProfileRepositoryImpl$removeFavorite$12.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImplKt.access$toPublicProfileError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.publicprofile.graphql.UnfavoritePublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (!data.getUnfavoriteContact().isSuccessful()) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        publicProfileRepositoryImpl$removeFavorite$1 = new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$removeFavorite$1(this, continuation);
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$removeFavorite$1 publicProfileRepositoryImpl$removeFavorite$122 = publicProfileRepositoryImpl$removeFavorite$1;
        java.lang.Object obj2 = publicProfileRepositoryImpl$removeFavorite$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = publicProfileRepositoryImpl$removeFavorite$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.publicprofile.graphql.UnfavoritePublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:21:0x00e7, B:22:0x00f1, B:25:0x00bf, B:26:0x00f2, B:27:0x00f7), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #4 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:21:0x00e7, B:22:0x00f1, B:25:0x00bf, B:26:0x00f2, B:27:0x00f7), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #4 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:21:0x00e7, B:22:0x00f1, B:25:0x00bf, B:26:0x00f2, B:27:0x00f7), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteContact(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$deleteContact$1 publicProfileRepositoryImpl$deleteContact$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$deleteContact$1) {
            publicProfileRepositoryImpl$deleteContact$1 = (com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$deleteContact$1) continuation;
            if ((publicProfileRepositoryImpl$deleteContact$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                publicProfileRepositoryImpl$deleteContact$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$deleteContact$1 publicProfileRepositoryImpl$deleteContact$12 = publicProfileRepositoryImpl$deleteContact$1;
                java.lang.Object obj = publicProfileRepositoryImpl$deleteContact$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = publicProfileRepositoryImpl$deleteContact$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.publicprofile.graphql.DeletePublicProfileContactMutation deletePublicProfileContactMutation = new com.paypal.oslo.feature.publicprofile.graphql.DeletePublicProfileContactMutation(new com.paypal.oslo.api.graphql.schema.type.DeleteContactInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(str), 1, null));
                        publicProfileRepositoryImpl$deleteContact$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        publicProfileRepositoryImpl$deleteContact$12.getOutputMinFrameDuration = defaultRaise;
                        publicProfileRepositoryImpl$deleteContact$12.getOutputFormats = defaultRaise3;
                        publicProfileRepositoryImpl$deleteContact$12.getInputSizeshNQ4ISI = defaultRaise3;
                        publicProfileRepositoryImpl$deleteContact$12.getHighSpeedVideoFpsRangesFor = 0;
                        publicProfileRepositoryImpl$deleteContact$12.getHighSpeedVideoSizes = 0;
                        publicProfileRepositoryImpl$deleteContact$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        publicProfileRepositoryImpl$deleteContact$12.Camera2StreamConfigurationMap = 0;
                        publicProfileRepositoryImpl$deleteContact$12.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, deletePublicProfileContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, publicProfileRepositoryImpl$deleteContact$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = execute$default;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = publicProfileRepositoryImpl$deleteContact$12.Camera2StreamConfigurationMap;
                    int i3 = publicProfileRepositoryImpl$deleteContact$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = publicProfileRepositoryImpl$deleteContact$12.getHighSpeedVideoSizes;
                    int i5 = publicProfileRepositoryImpl$deleteContact$12.getHighSpeedVideoFpsRangesFor;
                    raise2 = (arrow.core.raise.Raise) publicProfileRepositoryImpl$deleteContact$12.getInputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) publicProfileRepositoryImpl$deleteContact$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) publicProfileRepositoryImpl$deleteContact$12.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImplKt.access$toPublicProfileError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (((com.paypal.oslo.feature.publicprofile.graphql.DeletePublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData()) != null) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        publicProfileRepositoryImpl$deleteContact$1 = new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$deleteContact$1(this, continuation);
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$deleteContact$1 publicProfileRepositoryImpl$deleteContact$122 = publicProfileRepositoryImpl$deleteContact$1;
        java.lang.Object obj2 = publicProfileRepositoryImpl$deleteContact$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = publicProfileRepositoryImpl$deleteContact$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (((com.paypal.oslo.feature.publicprofile.graphql.DeletePublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData()) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object blockContact(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$blockContact$1 publicProfileRepositoryImpl$blockContact$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.publicprofile.graphql.BlockPublicProfileContactMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$blockContact$1) {
            publicProfileRepositoryImpl$blockContact$1 = (com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$blockContact$1) continuation;
            if ((publicProfileRepositoryImpl$blockContact$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                publicProfileRepositoryImpl$blockContact$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$blockContact$1 publicProfileRepositoryImpl$blockContact$12 = publicProfileRepositoryImpl$blockContact$1;
                java.lang.Object obj = publicProfileRepositoryImpl$blockContact$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = publicProfileRepositoryImpl$blockContact$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.publicprofile.graphql.BlockPublicProfileContactMutation blockPublicProfileContactMutation = new com.paypal.oslo.feature.publicprofile.graphql.BlockPublicProfileContactMutation(new com.paypal.oslo.api.graphql.schema.type.BlockContactInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(str), 1, null));
                        publicProfileRepositoryImpl$blockContact$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        publicProfileRepositoryImpl$blockContact$12.getInputSizeshNQ4ISI = defaultRaise;
                        publicProfileRepositoryImpl$blockContact$12.getInputFormats = defaultRaise3;
                        publicProfileRepositoryImpl$blockContact$12.getHighSpeedVideoSizesFor = defaultRaise3;
                        publicProfileRepositoryImpl$blockContact$12.getHighSpeedVideoFpsRanges = 0;
                        publicProfileRepositoryImpl$blockContact$12.Camera2StreamConfigurationMap = 0;
                        publicProfileRepositoryImpl$blockContact$12.getHighSpeedVideoSizes = 0;
                        publicProfileRepositoryImpl$blockContact$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        publicProfileRepositoryImpl$blockContact$12.getOutputFormats = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, blockPublicProfileContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, publicProfileRepositoryImpl$blockContact$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = execute$default;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = publicProfileRepositoryImpl$blockContact$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = publicProfileRepositoryImpl$blockContact$12.getHighSpeedVideoSizes;
                    int i4 = publicProfileRepositoryImpl$blockContact$12.Camera2StreamConfigurationMap;
                    int i5 = publicProfileRepositoryImpl$blockContact$12.getHighSpeedVideoFpsRanges;
                    raise2 = (arrow.core.raise.Raise) publicProfileRepositoryImpl$blockContact$12.getHighSpeedVideoSizesFor;
                    raise = (arrow.core.raise.Raise) publicProfileRepositoryImpl$blockContact$12.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) publicProfileRepositoryImpl$blockContact$12.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImplKt.access$toPublicProfileError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.publicprofile.graphql.BlockPublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (!data.getBlockContact().isSuccessful()) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        publicProfileRepositoryImpl$blockContact$1 = new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$blockContact$1(this, continuation);
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$blockContact$1 publicProfileRepositoryImpl$blockContact$122 = publicProfileRepositoryImpl$blockContact$1;
        java.lang.Object obj2 = publicProfileRepositoryImpl$blockContact$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = publicProfileRepositoryImpl$blockContact$122.getOutputFormats;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.publicprofile.graphql.BlockPublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[Catch: all -> 0x0043, RaiseCancellationException -> 0x0046, TryCatch #3 {RaiseCancellationException -> 0x0046, all -> 0x0043, blocks: (B:11:0x003f, B:12:0x009d, B:15:0x00a7, B:16:0x00cc, B:18:0x00da, B:20:0x00e4, B:23:0x00f1, B:24:0x00fb, B:25:0x00fc, B:26:0x0106, B:29:0x00bf, B:30:0x0107, B:31:0x010c), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object unblockContact(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$unblockContact$1 publicProfileRepositoryImpl$unblockContact$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.publicprofile.graphql.UnblockPublicProfileContactMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$unblockContact$1) {
            publicProfileRepositoryImpl$unblockContact$1 = (com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$unblockContact$1) continuation;
            if ((publicProfileRepositoryImpl$unblockContact$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                publicProfileRepositoryImpl$unblockContact$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$unblockContact$1 publicProfileRepositoryImpl$unblockContact$12 = publicProfileRepositoryImpl$unblockContact$1;
                java.lang.Object obj = publicProfileRepositoryImpl$unblockContact$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = publicProfileRepositoryImpl$unblockContact$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.publicprofile.graphql.UnblockPublicProfileContactMutation unblockPublicProfileContactMutation = new com.paypal.oslo.feature.publicprofile.graphql.UnblockPublicProfileContactMutation(new com.paypal.oslo.api.graphql.schema.type.UnblockContactInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(str), 1, null));
                        publicProfileRepositoryImpl$unblockContact$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        publicProfileRepositoryImpl$unblockContact$12.getInputSizeshNQ4ISI = defaultRaise;
                        publicProfileRepositoryImpl$unblockContact$12.getHighSpeedVideoSizesFor = defaultRaise3;
                        publicProfileRepositoryImpl$unblockContact$12.getInputFormats = defaultRaise3;
                        publicProfileRepositoryImpl$unblockContact$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        publicProfileRepositoryImpl$unblockContact$12.Camera2StreamConfigurationMap = 0;
                        publicProfileRepositoryImpl$unblockContact$12.getHighSpeedVideoFpsRangesFor = 0;
                        publicProfileRepositoryImpl$unblockContact$12.getHighSpeedVideoFpsRanges = 0;
                        publicProfileRepositoryImpl$unblockContact$12.getOutputMinFrameDuration = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, unblockPublicProfileContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, publicProfileRepositoryImpl$unblockContact$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = execute$default;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = publicProfileRepositoryImpl$unblockContact$12.getHighSpeedVideoFpsRanges;
                    int i3 = publicProfileRepositoryImpl$unblockContact$12.getHighSpeedVideoFpsRangesFor;
                    int i4 = publicProfileRepositoryImpl$unblockContact$12.Camera2StreamConfigurationMap;
                    int i5 = publicProfileRepositoryImpl$unblockContact$12.getHighResolutionOutputSizeshNQ4ISI;
                    raise2 = (arrow.core.raise.Raise) publicProfileRepositoryImpl$unblockContact$12.getInputFormats;
                    raise = (arrow.core.raise.Raise) publicProfileRepositoryImpl$unblockContact$12.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) publicProfileRepositoryImpl$unblockContact$12.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImplKt.access$toPublicProfileError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                data = (com.paypal.oslo.feature.publicprofile.graphql.UnblockPublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
                if (data != null) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (!data.getUnblockContact().isSuccessful()) {
                    raise.raise(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        publicProfileRepositoryImpl$unblockContact$1 = new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$unblockContact$1(this, continuation);
        com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$unblockContact$1 publicProfileRepositoryImpl$unblockContact$122 = publicProfileRepositoryImpl$unblockContact$1;
        java.lang.Object obj2 = publicProfileRepositoryImpl$unblockContact$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = publicProfileRepositoryImpl$unblockContact$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        data = (com.paypal.oslo.feature.publicprofile.graphql.UnblockPublicProfileContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(right)).getData();
        if (data != null) {
        }
    }
}
