package com.unity3d.ads.core.domain;

import android.content.Context;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidGetWebViewContainerUseCase.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0097B¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewContainerUseCase;", "context", "Landroid/content/Context;", "androidWebViewClient", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "sendWebViewClientErrorDiagnostics", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final CoroutineDispatcher defaultDispatcher;
    private final CoroutineDispatcher mainDispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, CoroutineDispatcher mainDispatcher, CoroutineDispatcher defaultDispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(androidWebViewClient, "androidWebViewClient");
        Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = mainDispatcher;
        this.defaultDispatcher = defaultDispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(CoroutineScope coroutineScope, AdObject adObject, Continuation<? super AndroidWebViewContainer> continuation) {
        AndroidGetWebViewContainerUseCase$invoke$1 androidGetWebViewContainerUseCase$invoke$1;
        int i;
        if (continuation instanceof AndroidGetWebViewContainerUseCase$invoke$1) {
            androidGetWebViewContainerUseCase$invoke$1 = (AndroidGetWebViewContainerUseCase$invoke$1) continuation;
            if ((androidGetWebViewContainerUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetWebViewContainerUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidGetWebViewContainerUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetWebViewContainerUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.mainDispatcher;
                    AndroidGetWebViewContainerUseCase$invoke$webview$1 androidGetWebViewContainerUseCase$invoke$webview$1 = new AndroidGetWebViewContainerUseCase$invoke$webview$1(this, null);
                    androidGetWebViewContainerUseCase$invoke$1.L$0 = coroutineScope;
                    androidGetWebViewContainerUseCase$invoke$1.L$1 = adObject;
                    androidGetWebViewContainerUseCase$invoke$1.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcher, androidGetWebViewContainerUseCase$invoke$webview$1, androidGetWebViewContainerUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adObject = (AdObject) androidGetWebViewContainerUseCase$invoke$1.L$1;
                    coroutineScope = (CoroutineScope) androidGetWebViewContainerUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new AndroidWebViewContainer((WebView) obj, this.androidWebViewClient, this.sendWebViewClientErrorDiagnostics, this.mainDispatcher, this.defaultDispatcher, coroutineScope, this.context, adObject, this.sendDiagnosticEvent);
            }
        }
        androidGetWebViewContainerUseCase$invoke$1 = new AndroidGetWebViewContainerUseCase$invoke$1(this, continuation);
        Object obj2 = androidGetWebViewContainerUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetWebViewContainerUseCase$invoke$1.label;
        if (i != 0) {
        }
        return new AndroidWebViewContainer((WebView) obj2, this.androidWebViewClient, this.sendWebViewClientErrorDiagnostics, this.mainDispatcher, this.defaultDispatcher, coroutineScope, this.context, adObject, this.sendDiagnosticEvent);
    }
}
