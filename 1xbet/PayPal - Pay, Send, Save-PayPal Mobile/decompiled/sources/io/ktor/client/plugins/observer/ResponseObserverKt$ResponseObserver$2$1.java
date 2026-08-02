package io.ktor.client.plugins.observer;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;", "response", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", i = {0, 0, 1, 1, 3, 3, 3}, l = {69, 69, 72, 82, 87}, m = "invokeSuspend", n = {"$this$on", "response", "$this$on", "response", "$this$on", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class ResponseObserverKt$ResponseObserver$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.observer.AfterReceiveHook.Context, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.observer.ResponseObserverConfig> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<io.ktor.client.call.HttpClientCall, java.lang.Boolean> getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel Camera2StreamConfigurationMap(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        return byteReadChannel;
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoSizes(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        return byteReadChannel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object responseObserverContext;
        io.ktor.client.HttpClient httpClient;
        io.ktor.client.plugins.observer.AfterReceiveHook.Context context;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.client.statement.HttpResponse httpResponse2;
        java.lang.Object responseObserverContext2;
        io.ktor.client.plugins.observer.AfterReceiveHook.Context context2;
        io.ktor.client.statement.HttpResponse httpResponse3;
        io.ktor.client.plugins.observer.AfterReceiveHook.Context context3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.observer.AfterReceiveHook.Context context4 = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.getHighSpeedVideoSizesFor;
            io.ktor.client.statement.HttpResponse httpResponse4 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function1<io.ktor.client.call.HttpClientCall, java.lang.Boolean> function1 = this.getHighSpeedVideoFpsRanges;
            if (function1 != null && !function1.invoke(httpResponse4.getCall()).booleanValue()) {
                return kotlin.Unit.INSTANCE;
            }
            if (io.ktor.client.plugins.DoubleReceivePluginKt.isSaved(httpResponse4)) {
                this.getHighSpeedVideoSizesFor = context4;
                this.getHighSpeedVideoFpsRangesFor = httpResponse4;
                this.getOutputFormats = 1;
                responseObserverContext2 = io.ktor.client.plugins.observer.ResponseObserverContextJvmKt.getResponseObserverContext(this);
                if (responseObserverContext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                context2 = context4;
                httpResponse3 = httpResponse4;
                this.getHighSpeedVideoSizesFor = context2;
                this.getHighSpeedVideoFpsRangesFor = httpResponse3;
                this.getOutputFormats = 2;
                if (kotlinx.coroutines.BuildersKt.withContext((kotlin.coroutines.CoroutineContext) responseObserverContext2, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, httpResponse3, null), this) != coroutine_suspended) {
                }
            } else {
                kotlin.Pair<io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteReadChannel> split = io.ktor.util.ByteChannelsKt.split(httpResponse4.getRawContent(), httpResponse4);
                final io.ktor.utils.io.ByteReadChannel component1 = split.component1();
                final io.ktor.utils.io.ByteReadChannel component2 = split.component2();
                io.ktor.client.statement.HttpResponse response = io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse4.getCall(), null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.Camera2StreamConfigurationMap(io.ktor.utils.io.ByteReadChannel.this);
                    }
                }, 1, null).getResponse();
                io.ktor.client.statement.HttpResponse response2 = io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse4.getCall(), null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.getHighSpeedVideoSizes(io.ktor.utils.io.ByteReadChannel.this);
                    }
                }, 1, null).getResponse();
                io.ktor.client.HttpClient client = this.getHighResolutionOutputSizeshNQ4ISI.getClient();
                this.getHighSpeedVideoSizesFor = context4;
                this.getHighSpeedVideoFpsRangesFor = response;
                this.Camera2StreamConfigurationMap = response2;
                this.getInputSizeshNQ4ISI = client;
                this.getOutputFormats = 4;
                responseObserverContext = io.ktor.client.plugins.observer.ResponseObserverContextJvmKt.getResponseObserverContext(this);
                if (responseObserverContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpClient = client;
                context = context4;
                httpResponse = response;
                httpResponse2 = response2;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, (kotlin.coroutines.CoroutineContext) responseObserverContext, null, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2(this.getHighSpeedVideoSizes, httpResponse2, null), 2, null);
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = null;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = 5;
                if (context.proceedWith(httpResponse, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        } else if (i == 1) {
            httpResponse3 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRangesFor;
            io.ktor.client.plugins.observer.AfterReceiveHook.Context context5 = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            context2 = context5;
            responseObserverContext2 = obj;
            this.getHighSpeedVideoSizesFor = context2;
            this.getHighSpeedVideoFpsRangesFor = httpResponse3;
            this.getOutputFormats = 2;
            if (kotlinx.coroutines.BuildersKt.withContext((kotlin.coroutines.CoroutineContext) responseObserverContext2, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, httpResponse3, null), this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            context3 = context2;
            this.getHighSpeedVideoSizesFor = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getOutputFormats = 3;
            if (context3.proceedWith(httpResponse3, this) == coroutine_suspended) {
            }
        } else if (i == 2) {
            httpResponse3 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRangesFor;
            context3 = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getOutputFormats = 3;
            if (context3.proceedWith(httpResponse3, this) == coroutine_suspended) {
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
                ?? r2 = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                httpResponse2 = (io.ktor.client.statement.HttpResponse) this.Camera2StreamConfigurationMap;
                io.ktor.client.statement.HttpResponse httpResponse5 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRangesFor;
                context = (io.ktor.client.plugins.observer.AfterReceiveHook.Context) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                httpClient = r2;
                httpResponse = httpResponse5;
                responseObserverContext = obj;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, (kotlin.coroutines.CoroutineContext) responseObserverContext, null, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2(this.getHighSpeedVideoSizes, httpResponse2, null), 2, null);
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = null;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = 5;
                if (context.proceedWith(httpResponse, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
        final /* synthetic */ io.ktor.client.statement.HttpResponse getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object m23436constructorimpl;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
                    io.ktor.client.statement.HttpResponse httpResponse = this.getHighSpeedVideoSizes;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    this.Camera2StreamConfigurationMap = 1;
                    if (function2.invoke(httpResponse, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            return kotlin.Result.m23435boximpl(m23436constructorimpl);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>> continuation) {
            return ((io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1 anonymousClass1 = new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = function2;
            this.getHighSpeedVideoSizes = httpResponse;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2", f = "ResponseObserver.kt", i = {0}, l = {83, 84}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ io.ktor.client.statement.HttpResponse getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        
            if (r10 == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            try {
                try {
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
                io.ktor.client.statement.HttpResponse httpResponse = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                this.Camera2StreamConfigurationMap = coroutineScope;
                this.getHighSpeedVideoSizes = 1;
                if (function2.invoke(httpResponse, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxLong(((java.lang.Number) obj).longValue()));
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
            io.ktor.client.statement.HttpResponse httpResponse2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            io.ktor.utils.io.ByteReadChannel rawContent = httpResponse2.getRawContent();
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = 2;
            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.discard$default(rawContent, 0L, this, 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2 anonymousClass2 = new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass2.Camera2StreamConfigurationMap = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = function2;
            this.getHighResolutionOutputSizeshNQ4ISI = httpResponse;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.observer.AfterReceiveHook.Context context, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        responseObserverKt$ResponseObserver$2$1.getHighSpeedVideoSizesFor = context;
        responseObserverKt$ResponseObserver$2$1.getHighSpeedVideoFpsRangesFor = httpResponse;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ResponseObserverKt$ResponseObserver$2$1(kotlin.jvm.functions.Function1<? super io.ktor.client.call.HttpClientCall, java.lang.Boolean> function1, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.observer.ResponseObserverConfig> clientPluginBuilder, kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = clientPluginBuilder;
        this.getHighSpeedVideoSizes = function2;
    }
}
