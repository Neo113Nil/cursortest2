package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetWebViewContainerUseCase.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0097Bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewContainerUseCase;", "context", "Landroid/content/Context;", "androidWebViewClient", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "sendWebViewClientErrorDiagnostics", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "(Landroid/content/Context;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "invoke", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetWebViewContainerUseCase implements com.unity3d.ads.core.domain.GetWebViewContainerUseCase {
    private final com.unity3d.ads.adplayer.AndroidWebViewClient androidWebViewClient;
    private final android.content.Context context;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher;
    private final com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(android.content.Context context, com.unity3d.ads.adplayer.AndroidWebViewClient androidWebViewClient, com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, kotlinx.coroutines.CoroutineDispatcher mainDispatcher, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidWebViewClient, "androidWebViewClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = mainDispatcher;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer> continuation) {
        com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 androidGetWebViewContainerUseCase$invoke$1;
        int i;
        com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1) {
            androidGetWebViewContainerUseCase$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1) continuation;
            if ((androidGetWebViewContainerUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetWebViewContainerUseCase$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidGetWebViewContainerUseCase$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetWebViewContainerUseCase$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.mainDispatcher;
                    com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1 androidGetWebViewContainerUseCase$invoke$webview$1 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1(this, null);
                    androidGetWebViewContainerUseCase$invoke$1.L$0 = this;
                    androidGetWebViewContainerUseCase$invoke$1.L$1 = coroutineScope;
                    androidGetWebViewContainerUseCase$invoke$1.label = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, androidGetWebViewContainerUseCase$invoke$webview$1, androidGetWebViewContainerUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetWebViewContainerUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) androidGetWebViewContainerUseCase$invoke$1.L$1;
                    androidGetWebViewContainerUseCase = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) androidGetWebViewContainerUseCase$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.unity3d.ads.adplayer.AndroidWebViewContainer((android.webkit.WebView) obj, androidGetWebViewContainerUseCase.androidWebViewClient, androidGetWebViewContainerUseCase.sendWebViewClientErrorDiagnostics, androidGetWebViewContainerUseCase.mainDispatcher, androidGetWebViewContainerUseCase.defaultDispatcher, coroutineScope, androidGetWebViewContainerUseCase.context);
            }
        }
        androidGetWebViewContainerUseCase$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = androidGetWebViewContainerUseCase$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetWebViewContainerUseCase$invoke$1.label;
        if (i != 0) {
        }
        return new com.unity3d.ads.adplayer.AndroidWebViewContainer((android.webkit.WebView) obj2, androidGetWebViewContainerUseCase.androidWebViewClient, androidGetWebViewContainerUseCase.sendWebViewClientErrorDiagnostics, androidGetWebViewContainerUseCase.mainDispatcher, androidGetWebViewContainerUseCase.defaultDispatcher, coroutineScope, androidGetWebViewContainerUseCase.context);
    }
}
