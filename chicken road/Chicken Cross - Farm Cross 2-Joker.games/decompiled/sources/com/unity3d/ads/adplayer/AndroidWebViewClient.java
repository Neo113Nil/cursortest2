package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.media3.common.MimeTypes;
import androidx.webkit.WebViewClientCompat;
import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AndroidWebViewClient.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "loadErrors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "_onLoadFinished", "Lkotlinx/coroutines/CompletableDeferred;", "onLoadFinished", "Lkotlinx/coroutines/Deferred;", "getOnLoadFinished", "()Lkotlinx/coroutines/Deferred;", "_isRenderProcessGone", "", "isRenderProcessGone", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "webviewType", "", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    private final MutableStateFlow<Boolean> _isRenderProcessGone;
    private final CompletableDeferred<List<WebViewClientError>> _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final StateFlow<Boolean> isRenderProcessGone;
    private final MutableStateFlow<List<WebViewClientError>> loadErrors;
    private final Deferred<List<WebViewClientError>> onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final MutableStateFlow<String> webviewType;

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        CompletableDeferred<List<WebViewClientError>> CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this._onLoadFinished = CompletableDeferred$default;
        this.onLoadFinished = CompletableDeferred$default;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isRenderProcessGone = MutableStateFlow;
        this.isRenderProcessGone = FlowKt.asStateFlow(MutableStateFlow);
        this.webviewType = StateFlowKt.MutableStateFlow("");
    }

    public final Deferred<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final StateFlow<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        List<WebViewClientError> value;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.areEqual(url, BLANK_PAGE)) {
            MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(url, ErrorReason.REASON_WEB_BLANK, null, 4, null))));
        }
        super.onPageFinished(view, url);
        this._onLoadFinished.complete(this.loadErrors.getValue());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Map emptyMap;
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                AndroidWebViewClient androidWebViewClient = this;
                m8079constructorimpl = Result.m8079constructorimpl(url.getQueryParameter("webviewType"));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                m8079constructorimpl = null;
            }
            String str = (String) m8079constructorimpl;
            String str2 = str;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                this.webviewType.setValue(str);
            }
            if (Intrinsics.areEqual(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse(MimeTypes.IMAGE_PNG, null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
            return getCachedAsset.invoke(url2, this.webviewType.getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null || (emptyMap = MapsKt.mapOf(TuplesKt.to("reason", message))) == null) {
                emptyMap = MapsKt.emptyMap();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", (Double) null, emptyMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            return super.shouldInterceptRequest(view, request);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        List<WebViewClientError> value;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (!this._onLoadFinished.isCompleted()) {
            MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            this._onLoadFinished.complete(this.loadErrors.getValue());
        } else {
            this._isRenderProcessGone.setValue(true);
        }
        return true;
    }
}
