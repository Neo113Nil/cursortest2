package io.ktor.client.plugins.cookies;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies$initializer$1", f = "HttpCookies.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpCookies$initializer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.cookies.HttpCookies getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        io.ktor.client.plugins.cookies.HttpCookies httpCookies;
        java.util.Iterator it;
        io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            list = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            httpCookies = this.getHighSpeedVideoSizes;
            it = list.iterator();
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
            httpCookies = (io.ktor.client.plugins.cookies.HttpCookies) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) it.next();
            cookiesStorage = httpCookies.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = httpCookies;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getHighSpeedVideoFpsRanges = 1;
            if (function2.invoke(cookiesStorage, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.cookies.HttpCookies$initializer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.cookies.HttpCookies$initializer$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCookies$initializer$1(io.ktor.client.plugins.cookies.HttpCookies httpCookies, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.HttpCookies$initializer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = httpCookies;
    }
}
