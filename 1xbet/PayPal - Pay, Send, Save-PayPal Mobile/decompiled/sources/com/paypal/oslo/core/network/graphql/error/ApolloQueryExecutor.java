package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000b\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000b0\u0010\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000b\"\b\b\u0000\u0010\b*\u00020\u00072\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001c\"\b\b\u0000\u0010\b*\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00018\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\"H\u0002¢\u0006\u0004\b \u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/ApolloQueryExecutor;", "", "", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "errorMappers", "<init>", "(Ljava/util/Set;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "T", "Lcom/apollographql/apollo/ApolloCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "execute", "(Lcom/apollographql/apollo/ApolloCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "toFlow", "(Lcom/apollographql/apollo/ApolloCall;)Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/apollographql/apollo/api/ApolloResponse;", "p0", "Camera2StreamConfigurationMap", "(Larrow/core/Either;)Larrow/core/Ior;", "Larrow/core/NonEmptyList;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "p1", "Lkotlin/Pair;", "", "", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/apollographql/apollo/api/Operation$Data;Ljava/util/List;)Lkotlin/Pair;", "", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloQueryExecutor {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.core.network.http.error.NetworkErrorMapper> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ApolloQueryExecutor(java.util.Set<? extends com.paypal.oslo.core.network.http.error.NetworkErrorMapper> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRanges = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #2 {all -> 0x0046, blocks: (B:11:0x0042, B:12:0x0080, B:14:0x0097, B:15:0x00a5), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.apollographql.apollo.ApolloCall, com.apollographql.apollo.ApolloCall<T extends com.apollographql.apollo.api.Operation$Data>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v21, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v36, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends com.apollographql.apollo.api.Operation.Data> java.lang.Object execute(com.apollographql.apollo.ApolloCall<T> apolloCall, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<T>>> continuation) {
        com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$execute$1 apolloQueryExecutor$execute$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        ?? r7;
        arrow.core.Either.Left left;
        com.apollographql.apollo.exception.ApolloException apolloException;
        if (continuation instanceof com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$execute$1) {
            apolloQueryExecutor$execute$1 = (com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$execute$1) continuation;
            if ((apolloQueryExecutor$execute$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                apolloQueryExecutor$execute$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = apolloQueryExecutor$execute$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apolloQueryExecutor$execute$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        try {
                            apolloQueryExecutor$execute$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                            apolloQueryExecutor$execute$1.getHighSpeedVideoSizesFor = defaultRaise;
                            apolloQueryExecutor$execute$1.getInputFormats = defaultRaise2;
                            apolloQueryExecutor$execute$1.getOutputFormats = this;
                            apolloQueryExecutor$execute$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            apolloQueryExecutor$execute$1.getHighSpeedVideoFpsRanges = 0;
                            apolloQueryExecutor$execute$1.getHighSpeedVideoFpsRangesFor = 0;
                            apolloQueryExecutor$execute$1.getHighSpeedVideoSizes = 0;
                            apolloQueryExecutor$execute$1.Camera2StreamConfigurationMap = 0;
                            apolloQueryExecutor$execute$1.getInputSizeshNQ4ISI = 0;
                            apolloQueryExecutor$execute$1.getOutputSizeshNQ4ISI = 1;
                            java.lang.Object execute = apolloCall.execute(apolloQueryExecutor$execute$1);
                            if (execute == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise3 = defaultRaise;
                            obj = execute;
                            r7 = defaultRaise2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise2.raise(getHighSpeedVideoFpsRangesFor(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th)));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        return Camera2StreamConfigurationMap(left);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = apolloQueryExecutor$execute$1.getInputSizeshNQ4ISI;
                    int i3 = apolloQueryExecutor$execute$1.Camera2StreamConfigurationMap;
                    int i4 = apolloQueryExecutor$execute$1.getHighSpeedVideoSizes;
                    int i5 = apolloQueryExecutor$execute$1.getHighSpeedVideoFpsRangesFor;
                    int i6 = apolloQueryExecutor$execute$1.getHighSpeedVideoFpsRanges;
                    int i7 = apolloQueryExecutor$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                    r7 = (arrow.core.raise.Raise) apolloQueryExecutor$execute$1.getInputFormats;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) apolloQueryExecutor$execute$1.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r7 = r7;
                    } catch (java.lang.Throwable th3) {
                        defaultRaise2 = r7;
                        th = th3;
                        defaultRaise = defaultRaise3;
                        defaultRaise2.raise(getHighSpeedVideoFpsRangesFor(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th)));
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
                com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                apolloException = apolloResponse.exception;
                if (apolloException == null) {
                    r7.raise(getHighSpeedVideoFpsRangesFor(apolloException));
                    throw new kotlin.KotlinNothingValueException();
                }
                try {
                    defaultRaise3.complete();
                    left = new arrow.core.Either.Right(apolloResponse);
                } catch (arrow.core.raise.RaiseCancellationException e2) {
                    e = e2;
                    defaultRaise = defaultRaise3;
                    defaultRaise.complete();
                    left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    return Camera2StreamConfigurationMap(left);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    defaultRaise = defaultRaise3;
                    defaultRaise.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                return Camera2StreamConfigurationMap(left);
            }
        }
        apolloQueryExecutor$execute$1 = new com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$execute$1(this, continuation);
        java.lang.Object obj2 = apolloQueryExecutor$execute$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apolloQueryExecutor$execute$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.apollographql.apollo.api.ApolloResponse apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) obj2;
        apolloException = apolloResponse2.exception;
        if (apolloException == null) {
        }
    }

    public final <T extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<T>>> toFlow(com.apollographql.apollo.ApolloCall<T> call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        final kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<T>> flow = call.toFlow();
        return kotlinx.coroutines.flow.FlowKt.m24097catch(new kotlinx.coroutines.flow.Flow<arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.core.network.graphql.GraphQLData<T>>>() { // from class: com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    arrow.core.Either.Left left;
                    arrow.core.Ior Camera2StreamConfigurationMap;
                    arrow.core.raise.DefaultRaise defaultRaise;
                    com.apollographql.apollo.exception.ApolloException apolloException;
                    com.paypal.oslo.core.network.http.error.NetworkError highSpeedVideoFpsRangesFor;
                    if (continuation instanceof com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                                com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor apolloQueryExecutor = this.Camera2StreamConfigurationMap;
                                arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                                try {
                                    defaultRaise = defaultRaise2;
                                    apolloException = apolloResponse.exception;
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    defaultRaise2.complete();
                                    left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                                } catch (java.lang.Throwable th) {
                                    defaultRaise2.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                                if (apolloException != null) {
                                    highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(apolloException);
                                    defaultRaise.raise(highSpeedVideoFpsRangesFor);
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                defaultRaise2.complete();
                                left = new arrow.core.Either.Right(apolloResponse);
                                Camera2StreamConfigurationMap = com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor.Camera2StreamConfigurationMap(left);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(Camera2StreamConfigurationMap, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1$2", f = "ApolloQueryExecutor.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor apolloQueryExecutor) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.Camera2StreamConfigurationMap = apolloQueryExecutor;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$toFlow$2(this, null));
    }

    private static <T extends com.apollographql.apollo.api.Operation.Data> kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.String>> getHighSpeedVideoFpsRangesFor(T p0, java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> p1) {
        java.util.List<java.lang.String> criticalFields$graphql_release = p0 != null ? com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry.INSTANCE.getCriticalFields$graphql_release(p0) : null;
        if (criticalFields$graphql_release == null) {
            criticalFields$graphql_release = kotlin.collections.CollectionsKt.emptyList();
        }
        if (criticalFields$graphql_release.isEmpty()) {
            return kotlin.TuplesKt.to(java.lang.Boolean.FALSE, kotlin.collections.CollectionsKt.emptyList());
        }
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(p1);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        java.util.Iterator<E> it = m9567boximpl.iterator();
        while (it.hasNext()) {
            java.util.List<java.lang.Object> path = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getPath();
            java.lang.String joinToString$default = path != null ? kotlin.collections.CollectionsKt.joinToString$default(path, ".", null, null, 0, null, null, 62, null) : null;
            if (joinToString$default != null) {
                arrayList.add(joinToString$default);
            }
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(criticalFields$graphql_release);
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (java.lang.String str : arrayList) {
            java.util.Set<java.lang.String> set2 = set;
            if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                for (java.lang.String str2 : set2) {
                    if (kotlin.text.StringsKt.startsWith$default(str, str2, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str2, str, false, 2, (java.lang.Object) null)) {
                        createListBuilder.add(str);
                        break;
                    }
                }
            }
        }
        return kotlin.TuplesKt.to(java.lang.Boolean.valueOf(!r12.isEmpty()), kotlin.collections.CollectionsKt.build(createListBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.core.network.http.error.NetworkError getHighSpeedVideoFpsRangesFor(java.lang.Throwable p0) {
        com.paypal.oslo.core.network.http.error.NetworkError networkError;
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                networkError = null;
                break;
            }
            networkError = ((com.paypal.oslo.core.network.http.error.NetworkErrorMapper) it.next()).mapToNetworkError(p0);
            if (networkError != null) {
                break;
            }
        }
        return networkError == null ? new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(p0) : networkError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.apollographql.apollo.api.Operation.Data> arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<T>> Camera2StreamConfigurationMap(arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.apollographql.apollo.api.ApolloResponse<T>> p0) {
        java.util.List list;
        if (p0 instanceof arrow.core.Either.Right) {
            com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) ((arrow.core.Either.Right) p0).getValue();
            java.util.List<com.apollographql.apollo.api.Error> list2 = apolloResponse.errors;
            if (list2 != null) {
                java.util.List<com.apollographql.apollo.api.Error> list3 = list2;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (com.apollographql.apollo.api.Error error : list3) {
                    arrayList.add(new com.paypal.oslo.core.network.graphql.error.GraphQLError(error.getMessage(), error.getPath(), error.getExtensions()));
                }
                list = arrow.core.NonEmptyListKt.toNonEmptyListOrNull(arrayList);
            } else {
                list = null;
            }
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = new com.paypal.oslo.core.network.graphql.GraphQLData(apolloResponse.data, apolloResponse.extensions);
            boolean z = (apolloResponse.data == 0 && graphQLData.getExtensions().isEmpty()) ? false : true;
            if (list == null) {
                return new arrow.core.Ior.Right(graphQLData);
            }
            kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.String>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(apolloResponse.data, list);
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(list, highSpeedVideoFpsRangesFor.component1().booleanValue(), highSpeedVideoFpsRangesFor.component2(), null);
            if (z) {
                return new arrow.core.Ior.Both(graphQL, graphQLData);
            }
            return new arrow.core.Ior.Left(graphQL);
        }
        if (p0 instanceof arrow.core.Either.Left) {
            return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.Network((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) p0).getValue()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
