package io.ktor.client.plugins;

/* compiled from: HttpRequestLifecycle.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\n"}, d2 = {"<anonymous>", "", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "proceed", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", i = {0}, l = {29}, m = "invokeSuspend", n = {"executionContext"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<kotlin.Unit> $this_createClientPlugin;
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(io.ktor.client.plugins.api.ClientPluginBuilder<kotlin.Unit> clientPluginBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1> continuation) {
        super(3, continuation);
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 httpRequestLifecycleKt$HttpRequestLifecycle$1$1 = new io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(this.$this_createClientPlugin, continuation);
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$0 = httpRequestBuilder;
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$1 = function1;
        return httpRequestLifecycleKt$HttpRequestLifecycle$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableJob completableJob;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.L$0;
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.L$1;
            kotlinx.coroutines.CompletableJob SupervisorJob = kotlinx.coroutines.SupervisorKt.SupervisorJob(httpRequestBuilder.getExecutionContext());
            kotlin.coroutines.CoroutineContext.Element element = this.$this_createClientPlugin.getClient().getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(element);
            io.ktor.client.plugins.HttpRequestLifecycleKt.attachToClientEngineJob(SupervisorJob, (kotlinx.coroutines.Job) element);
            try {
                httpRequestBuilder.setExecutionContext$ktor_client_core(SupervisorJob);
                this.L$0 = SupervisorJob;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                completableJob = SupervisorJob;
            } catch (java.lang.Throwable th) {
                th = th;
                completableJob = SupervisorJob;
                completableJob.completeExceptionally(th);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob = (kotlinx.coroutines.CompletableJob) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    completableJob.completeExceptionally(th);
                    throw th;
                } catch (java.lang.Throwable th3) {
                    completableJob.complete();
                    throw th3;
                }
            }
        }
        completableJob.complete();
        return kotlin.Unit.INSTANCE;
    }
}
