package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/StoreExpirationInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "p0", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "p1", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class StoreExpirationInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor {
    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(final com.apollographql.apollo.api.ApolloRequest<D> p0, com.apollographql.apollo.interceptor.ApolloInterceptorChain p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        final kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> proceed = p1.proceed(p0);
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>>() { // from class: com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1.AnonymousClass2(flowCollector, p0), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.apollographql.apollo.api.ApolloRequest getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    long currentTimeMillis;
                    java.lang.Integer num;
                    if (continuation instanceof com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                                com.apollographql.apollo.cache.normalized.StoreExpirationDateContext storeExpirationDateContext = (com.apollographql.apollo.cache.normalized.StoreExpirationDateContext) this.getHighResolutionOutputSizeshNQ4ISI.getExecutionContext().get(com.apollographql.apollo.cache.normalized.StoreExpirationDateContext.INSTANCE);
                                if (kotlin.jvm.internal.Intrinsics.areEqual(storeExpirationDateContext != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(storeExpirationDateContext.getValue()) : null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                                    com.apollographql.apollo.network.http.HttpInfo httpInfo = (com.apollographql.apollo.network.http.HttpInfo) apolloResponse.executionContext.get(com.apollographql.apollo.network.http.HttpInfo.INSTANCE);
                                    java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers = httpInfo != null ? httpInfo.getHeaders() : null;
                                    if (headers == null) {
                                        headers = kotlin.collections.CollectionsKt.emptyList();
                                    }
                                    java.lang.String str = com.apollographql.apollo.api.http.HttpKt.get(headers, "cache-control");
                                    if (str != null) {
                                        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                        if (lowerCase != null) {
                                            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) lowerCase, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                                            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
                                            java.util.Iterator<T> it = split$default.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(kotlin.text.StringsKt.trim((java.lang.String) it.next()).toString());
                                            }
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            for (java.lang.String str2 : arrayList) {
                                                if (kotlin.text.StringsKt.startsWith$default(str2, "max-age=", false, 2, (java.lang.Object) null)) {
                                                    java.lang.String substring = str2.substring(8);
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                                    num = kotlin.text.StringsKt.toIntOrNull(substring);
                                                } else {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    arrayList2.add(num);
                                                }
                                            }
                                            java.lang.Integer num2 = (java.lang.Integer) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
                                            if (num2 != null) {
                                                int intValue = num2.intValue();
                                                java.lang.String str3 = com.apollographql.apollo.api.http.HttpKt.get(headers, "age");
                                                if ((str3 != null ? kotlin.text.StringsKt.toIntOrNull(str3) : null) != null) {
                                                    currentTimeMillis = ((com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis() / 1000) + intValue) - r4.intValue();
                                                } else {
                                                    currentTimeMillis = (com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis() / 1000) + intValue;
                                                }
                                                apolloResponse = com.apollographql.apollo.cache.normalized.NormalizedCache.cacheHeaders(apolloResponse.newBuilder(), com.apollographql.apollo.cache.normalized.NormalizedCache.getCacheHeaders(apolloResponse).newBuilder().addHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DATE, java.lang.String.valueOf(currentTimeMillis)).build()).build();
                                            }
                                        }
                                    }
                                }
                                anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                if (flowCollector.emit(apolloResponse, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1$2", f = "ClientCacheExtensions.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighSpeedVideoFpsRanges;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizes = obj;
                        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor$intercept$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.apollographql.apollo.api.ApolloRequest apolloRequest) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = apolloRequest;
                }
            }
        };
    }
}
