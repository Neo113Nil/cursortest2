package com.paypal.oslo.core.webview.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$reAuthenticate$1", f = "SecureWebViewViewModel.kt", i = {0, 0, 1, 1, 1}, l = {436, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-SecureWebViewViewModel$reAuthenticate$1$redirectUrl$1"}, nl = {437, 269}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class SecureWebViewViewModel$reAuthenticate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel getOutputMinFrameDurationlomOqCM;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0109 A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x002a, blocks: (B:7:0x0023, B:9:0x0103, B:12:0x0109, B:20:0x0131, B:23:0x0170, B:24:0x0175), top: B:6:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel;
        java.lang.String str;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url;
        int i;
        int i2;
        int i3;
        int i4;
        com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase;
        java.lang.Object invoke;
        java.lang.String str2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.String str3;
        arrow.core.Either either;
        int i5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.getHighSpeedVideoSizesFor;
        try {
            if (i6 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.getOutputMinFrameDurationlomOqCM.getInputSizeshNQ4ISI;
                secureWebViewViewModel = this.getOutputMinFrameDurationlomOqCM;
                str = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url2 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = mutex;
                this.getInputSizeshNQ4ISI = secureWebViewViewModel;
                this.getOutputFormats = str;
                this.getInputFormats = url2;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoSizesFor = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    url = url2;
                    i = 0;
                }
                return coroutine_suspended;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) this.getOutputFormats;
                secureWebViewViewModel = (com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel) this.getInputSizeshNQ4ISI;
                mutex2 = (kotlinx.coroutines.sync.Mutex) this.getOutputMinFrameDuration;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    invoke = obj;
                    either = (arrow.core.Either) invoke;
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.core.webview.domain.models.WebAuthSession webAuthSession = (com.paypal.oslo.core.webview.domain.models.WebAuthSession) ((arrow.core.Either.Right) either).getValue();
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] re-authentication succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str2)), null, 4, null);
                        secureWebViewViewModel.getHighSpeedVideoSizesFor = 0;
                        str3 = webAuthSession.getRedirectUrl();
                        mutex = mutex2;
                        mutex.unlock(null);
                        this.Camera2StreamConfigurationMap.invoke(str3);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
                        i5 = secureWebViewViewModel.getHighSpeedVideoSizesFor;
                        com.paypal.android.logger.Logger.e$default(logger, "[Webview] re-authentication failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str2), kotlin.TuplesKt.to("attempt", java.lang.String.valueOf(i5))), null, null, 12, null);
                        mutex = mutex2;
                        str3 = null;
                        mutex.unlock(null);
                        this.Camera2StreamConfigurationMap.invoke(str3);
                        return kotlin.Unit.INSTANCE;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                } catch (java.lang.Throwable th) {
                    th = th;
                    mutex = mutex2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            int i7 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url3 = (com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) this.getInputFormats;
            java.lang.String str4 = (java.lang.String) this.getOutputFormats;
            com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel2 = (com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel) this.getInputSizeshNQ4ISI;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            i = i7;
            secureWebViewViewModel = secureWebViewViewModel2;
            url = url3;
            str = str4;
            i2 = secureWebViewViewModel.getHighSpeedVideoSizesFor;
            if (i2 < 3) {
                i3 = secureWebViewViewModel.getHighSpeedVideoSizesFor;
                secureWebViewViewModel.getHighSpeedVideoSizesFor = i3 + 1;
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.webview.LoggerKt.log;
                i4 = secureWebViewViewModel.getHighSpeedVideoSizesFor;
                com.paypal.android.logger.Logger.d$default(logger2, "[Webview] re-authentication attempt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("attempt", java.lang.String.valueOf(i4)), kotlin.TuplesKt.to("max_attempts", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D)), null, 4, null);
                webAuthSessionAuthorizationUseCase = secureWebViewViewModel.getHighSpeedVideoFpsRanges;
                java.lang.String url4 = url.getUrl();
                com.paypal.oslo.core.webview.domain.models.WebAuthContext webAuthContext = new com.paypal.oslo.core.webview.domain.models.WebAuthContext(null, 1, null);
                this.getOutputMinFrameDuration = mutex;
                this.getInputSizeshNQ4ISI = secureWebViewViewModel;
                this.getOutputFormats = str;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizes = i;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizesFor = 2;
                invoke = webAuthSessionAuthorizationUseCase.invoke(webAuthContext, url4, this);
                if (invoke != coroutine_suspended) {
                    str2 = str;
                    mutex2 = mutex;
                    either = (arrow.core.Either) invoke;
                    if (!(either instanceof arrow.core.Either.Right)) {
                    }
                }
                return coroutine_suspended;
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] re-authentication max attempts exceeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("max_attempts", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D)), null, null, 12, null);
            str3 = null;
            mutex.unlock(null);
            this.Camera2StreamConfigurationMap.invoke(str3);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$reAuthenticate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$reAuthenticate$1(this.getOutputMinFrameDurationlomOqCM, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SecureWebViewViewModel$reAuthenticate$1(com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, java.lang.String str, com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$reAuthenticate$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = secureWebViewViewModel;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = url;
    }
}
