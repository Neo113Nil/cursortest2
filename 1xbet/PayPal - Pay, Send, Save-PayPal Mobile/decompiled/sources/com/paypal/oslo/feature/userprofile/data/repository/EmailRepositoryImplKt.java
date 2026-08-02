package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001ah\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00010\u0011\"\b\b\u0000\u0010\u0006*\u00020\u0005\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0001\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p0", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "Lcom/apollographql/apollo/api/Mutation$Data;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/Mutation;", "p1", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "p2", "", "p3", "Lkotlin/Function1;", "p4", "Larrow/core/Either;", "getHighSpeedVideoSizes", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Mutation;Lcom/paypal/oslo/core/network/graphql/RiskSourceId;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmailRepositoryImplKt {
    private static final com.paypal.oslo.feature.userprofile.domain.model.email.EmailError Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError().toString());
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, TryCatch #3 {RaiseCancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x004f, B:13:0x00b5, B:18:0x00c3, B:20:0x00d3, B:23:0x0144, B:26:0x00da, B:27:0x00f8, B:30:0x00fd, B:32:0x013e, B:34:0x014f, B:35:0x015b, B:36:0x015c, B:37:0x0161, B:38:0x0162, B:39:0x019e), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v35, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends com.apollographql.apollo.api.Mutation.Data, R> java.lang.Object getHighSpeedVideoSizes(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation<T> mutation, com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, java.lang.String str, kotlin.jvm.functions.Function1<? super T, ? extends R> function1, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, ? extends R>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt$executeMutation$1 emailRepositoryImplKt$executeMutation$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        kotlin.jvm.functions.Function1<? super T, ? extends R> function12;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.Ior ior;
        R invoke;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt$executeMutation$1) {
            emailRepositoryImplKt$executeMutation$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt$executeMutation$1) continuation;
            if ((emailRepositoryImplKt$executeMutation$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                emailRepositoryImplKt$executeMutation$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                java.lang.Object obj = emailRepositoryImplKt$executeMutation$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailRepositoryImplKt$executeMutation$1.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.apollographql.apollo.ApolloCall addExecutionContext = apolloClient.mutation(mutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(riskSourceId, null, 2, null));
                        com.paypal.oslo.core.network.graphql.CallConfig createCallConfig = com.paypal.oslo.feature.userprofile.data.utils.CommonUtilsKt.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, str);
                        emailRepositoryImplKt$executeMutation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloClient);
                        emailRepositoryImplKt$executeMutation$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutation);
                        emailRepositoryImplKt$executeMutation$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(riskSourceId);
                        emailRepositoryImplKt$executeMutation$1.getHighSpeedVideoSizesFor = str2;
                        function12 = function1;
                        emailRepositoryImplKt$executeMutation$1.getInputSizeshNQ4ISI = function12;
                        emailRepositoryImplKt$executeMutation$1.getOutputFormats = defaultRaise;
                        emailRepositoryImplKt$executeMutation$1.getOutputStallDuration = defaultRaise2;
                        emailRepositoryImplKt$executeMutation$1.getHighSpeedVideoSizes = 0;
                        emailRepositoryImplKt$executeMutation$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImplKt$executeMutation$1.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImplKt$executeMutation$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImplKt$executeMutation$1.getOutputMinFrameDurationlomOqCM = 1;
                        java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, createCallConfig, emailRepositoryImplKt$executeMutation$1);
                        if (execute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        obj = execute;
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
                    int i2 = emailRepositoryImplKt$executeMutation$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = emailRepositoryImplKt$executeMutation$1.Camera2StreamConfigurationMap;
                    int i4 = emailRepositoryImplKt$executeMutation$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = emailRepositoryImplKt$executeMutation$1.getHighSpeedVideoSizes;
                    ?? r0 = (arrow.core.raise.Raise) emailRepositoryImplKt$executeMutation$1.getOutputStallDuration;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) emailRepositoryImplKt$executeMutation$1.getOutputFormats;
                    kotlin.jvm.functions.Function1<? super T, ? extends R> function13 = (kotlin.jvm.functions.Function1) emailRepositoryImplKt$executeMutation$1.getInputSizeshNQ4ISI;
                    java.lang.String str3 = (java.lang.String) emailRepositoryImplKt$executeMutation$1.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12 = function13;
                        defaultRaise2 = r0;
                        str2 = str3;
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
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Email mutation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, str2), kotlin.TuplesKt.to("error", callError.toString())), null, 4, null);
                    defaultRaise2.raise(Camera2StreamConfigurationMap(callError));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.apollographql.apollo.api.Mutation.Data data = (com.apollographql.apollo.api.Mutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null || (invoke = function12.invoke(data)) == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str2);
                        sb.append(" succeeded but response contained no data");
                        defaultRaise2.raise(new com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError(sb.toString()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                } else if (ior instanceof arrow.core.Ior.Both) {
                    java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Email mutation partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, str2), kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                    com.apollographql.apollo.api.Mutation.Data data2 = (com.apollographql.apollo.api.Mutation.Data) graphQLData.getData();
                    if (data2 == null || (invoke = function12.invoke(data2)) == null) {
                        defaultRaise2.raise(Camera2StreamConfigurationMap(callError2));
                        throw new kotlin.KotlinNothingValueException();
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                defaultRaise3.complete();
                return new arrow.core.Either.Right(invoke);
            }
        }
        emailRepositoryImplKt$executeMutation$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt$executeMutation$1(continuation);
        java.lang.Object obj2 = emailRepositoryImplKt$executeMutation$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImplKt$executeMutation$1.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
