package io.ktor.client.plugins.observer;

/* compiled from: ResponseObserver.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;", com.ironsource.Ve.n, "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", i = {0, 0, 1, 1, 3, 3, 3}, l = {69, 69, 72, 82, 87}, m = "invokeSuspend", n = {"$this$on", com.ironsource.Ve.n, "$this$on", com.ironsource.Ve.n, "$this$on", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class ResponseObserverKt$ResponseObserver$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.observer.AfterReceiveHook.Context, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<io.ktor.client.call.HttpClientCall, java.lang.Boolean> $filter;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $responseHandler;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.observer.ResponseObserverConfig> $this_createClientPlugin;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ResponseObserverKt$ResponseObserver$2$1(kotlin.jvm.functions.Function1<? super io.ktor.client.call.HttpClientCall, java.lang.Boolean> function1, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.observer.ResponseObserverConfig> clientPluginBuilder, kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1> continuation) {
        super(3, continuation);
        this.$filter = function1;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$responseHandler = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel invokeSuspend$lambda$0(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.statement.HttpResponse httpResponse) {
        return byteReadChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel invokeSuspend$lambda$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.statement.HttpResponse httpResponse) {
        return byteReadChannel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.plugins.observer.AfterReceiveHook.Context context, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1(this.$filter, this.$this_createClientPlugin, this.$responseHandler, continuation);
        responseObserverKt$ResponseObserver$2$1.L$0 = context;
        responseObserverKt$ResponseObserver$2$1.L$1 = httpResponse;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.plugins.observer.AfterReceiveHook.Context context;
        io.ktor.client.statement.HttpResponse response;
        io.ktor.client.statement.HttpResponse response2;
        java.lang.Object responseObserverContext;
        io.ktor.client.HttpClient httpClient;
        java.lang.Object responseObserverContext2;
        io.ktor.client.plugins.observer.AfterReceiveHook.Context context2;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.client.plugins.observer.AfterReceiveHook.Context context3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            context = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.L$0;
            io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) this.L$1;
            kotlin.jvm.functions.Function1<io.ktor.client.call.HttpClientCall, java.lang.Boolean> function1 = this.$filter;
            if (function1 != null && !function1.invoke(httpResponse2.getCall()).booleanValue()) {
                return kotlin.Unit.INSTANCE;
            }
            if (io.ktor.client.plugins.DoubleReceivePluginKt.isSaved(httpResponse2)) {
                this.L$0 = context;
                this.L$1 = httpResponse2;
                this.label = 1;
                responseObserverContext2 = io.ktor.client.plugins.observer.ResponseObserverContextJvmKt.getResponseObserverContext(this);
                if (responseObserverContext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                context2 = context;
                httpResponse = httpResponse2;
                this.L$0 = context2;
                this.L$1 = httpResponse;
                this.label = 2;
                if (kotlinx.coroutines.BuildersKt.withContext((kotlin.coroutines.CoroutineContext) responseObserverContext2, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1(this.$responseHandler, httpResponse, null), this) != coroutine_suspended) {
                }
            } else {
                kotlin.Pair<io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteReadChannel> split = io.ktor.util.ByteChannelsKt.split(httpResponse2.getRawContent(), httpResponse2);
                final io.ktor.utils.io.ByteReadChannel component1 = split.component1();
                final io.ktor.utils.io.ByteReadChannel component2 = split.component2();
                response = io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse2.getCall(), null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        io.ktor.utils.io.ByteReadChannel invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.invokeSuspend$lambda$0(io.ktor.utils.io.ByteReadChannel.this, (io.ktor.client.statement.HttpResponse) obj2);
                        return invokeSuspend$lambda$0;
                    }
                }, 1, null).getResponse();
                response2 = io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse2.getCall(), null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        io.ktor.utils.io.ByteReadChannel invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.invokeSuspend$lambda$1(io.ktor.utils.io.ByteReadChannel.this, (io.ktor.client.statement.HttpResponse) obj2);
                        return invokeSuspend$lambda$1;
                    }
                }, 1, null).getResponse();
                io.ktor.client.HttpClient client = this.$this_createClientPlugin.getClient();
                this.L$0 = context;
                this.L$1 = response;
                this.L$2 = response2;
                this.L$3 = client;
                this.label = 4;
                responseObserverContext = io.ktor.client.plugins.observer.ResponseObserverContextJvmKt.getResponseObserverContext(this);
                if (responseObserverContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpClient = client;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, (kotlin.coroutines.CoroutineContext) responseObserverContext, null, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2(this.$responseHandler, response2, null), 2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                if (context.proceedWith(response, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        } else if (i == 1) {
            httpResponse = (io.ktor.client.statement.HttpResponse) this.L$1;
            io.ktor.client.plugins.observer.AfterReceiveHook.Context context4 = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            context2 = context4;
            responseObserverContext2 = obj;
            this.L$0 = context2;
            this.L$1 = httpResponse;
            this.label = 2;
            if (kotlinx.coroutines.BuildersKt.withContext((kotlin.coroutines.CoroutineContext) responseObserverContext2, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1(this.$responseHandler, httpResponse, null), this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            context3 = context2;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (context3.proceedWith(httpResponse, this) == coroutine_suspended) {
            }
        } else if (i == 2) {
            httpResponse = (io.ktor.client.statement.HttpResponse) this.L$1;
            context3 = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (context3.proceedWith(httpResponse, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                ?? r2 = (kotlinx.coroutines.CoroutineScope) this.L$3;
                io.ktor.client.statement.HttpResponse httpResponse3 = (io.ktor.client.statement.HttpResponse) this.L$2;
                response = (io.ktor.client.statement.HttpResponse) this.L$1;
                io.ktor.client.plugins.observer.AfterReceiveHook.Context context5 = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                httpClient = r2;
                context = context5;
                response2 = httpResponse3;
                responseObserverContext = obj;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, (kotlin.coroutines.CoroutineContext) responseObserverContext, null, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2(this.$responseHandler, response2, null), 2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                if (context.proceedWith(response, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: ResponseObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>>, java.lang.Object> {
        final /* synthetic */ io.ktor.client.statement.HttpResponse $response;
        final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $responseHandler;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$responseHandler = function2;
            this.$response = httpResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1 anonymousClass1 = new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1(this.$responseHandler, this.$response, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>> continuation) {
            return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
            return ((io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object m10798constructorimpl;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$responseHandler;
                    io.ktor.client.statement.HttpResponse httpResponse = this.$response;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    this.label = 1;
                    if (function2.invoke(httpResponse, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            return kotlin.Result.m10797boximpl(m10798constructorimpl);
        }
    }

    /* compiled from: ResponseObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2", f = "ResponseObserver.kt", i = {0}, l = {83, 84}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $responseHandler;
        final /* synthetic */ io.ktor.client.statement.HttpResponse $sideResponse;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$responseHandler = function2;
            this.$sideResponse = httpResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2 anonymousClass2 = new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2(this.$responseHandler, this.$sideResponse, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                }
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$responseHandler;
                io.ktor.client.statement.HttpResponse httpResponse = this.$sideResponse;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (function2.invoke(httpResponse, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.m10798constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxLong(((java.lang.Number) obj).longValue()));
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            io.ktor.client.statement.HttpResponse httpResponse2 = this.$sideResponse;
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            io.ktor.utils.io.ByteReadChannel rawContent = httpResponse2.getRawContent();
            this.L$0 = null;
            this.label = 2;
            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.discard$default(rawContent, 0L, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlin.Result.m10798constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxLong(((java.lang.Number) obj).longValue()));
            return kotlin.Unit.INSTANCE;
        }
    }
}
