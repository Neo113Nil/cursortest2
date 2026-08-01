package com.unity3d.ads.adplayer;

import androidx.core.app.NotificationCompat;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: WebViewBridge.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH&J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH&J\u0016\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\u001aJ8\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001c\"\u00020\u0001H¦@¢\u0006\u0002\u0010 R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewBridge;", "", "onInvocation", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/adplayer/Invocation;", "getOnInvocation", "()Lkotlinx/coroutines/flow/SharedFlow;", "exposedFunctions", "", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "getExposedFunctions", "()Ljava/util/Map;", "setExposedFunctions", "(Ljava/util/Map;)V", "handleInvocation", "", "message", "handleCallback", "callbackId", "callbackStatus", "rawParameters", "sendEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "", "className", "method", "params", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WebViewBridge {
    Map<String, Function0<ExposedFunction>> getExposedFunctions();

    SharedFlow<Invocation> getOnInvocation();

    void handleCallback(String callbackId, String callbackStatus, String rawParameters);

    void handleInvocation(String message);

    Object request(String str, String str2, Object[] objArr, Continuation<? super Object[]> continuation);

    Object sendEvent(WebViewEvent webViewEvent, Continuation<? super Unit> continuation);

    void setExposedFunctions(Map<String, ? extends Function0<? extends ExposedFunction>> map);
}
