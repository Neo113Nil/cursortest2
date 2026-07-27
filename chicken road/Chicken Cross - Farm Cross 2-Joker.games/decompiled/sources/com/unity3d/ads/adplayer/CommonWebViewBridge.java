package com.unity3d.ads.adplayer;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0096@¢\u0006\u0002\u00102J8\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00152\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0096@¢\u0006\u0002\u00107J \u00108\u001a\u00020)2\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u0015H\u0016J\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020\u0015H\u0016J\u001e\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010@J6\u0010A\u001a\u00020)2\u0006\u00109\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00152\u0016\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0002\u00107R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R2\u0010\u0011\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006C"}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "callbacks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CompletableDeferred;", "", "", "_onInvocation", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/Invocation;", "onInvocation", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnInvocation", "()Lkotlinx/coroutines/flow/SharedFlow;", "exposedFunctions", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "getExposedFunctions", "()Ljava/util/Map;", "setExposedFunctions", "(Ljava/util/Map;)V", "execute", "", "handlerType", "Lcom/unity3d/ads/adplayer/HandlerType;", "arguments", "Lorg/json/JSONArray;", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "className", "method", "params", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleCallback", "callbackId", "callbackStatus", "rawParameters", "handleInvocation", "message", "handleInvocationResult", "invocation", "(Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "respond", "status", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final MutableSharedFlow<Invocation> _onInvocation;
    private final MutableStateFlow<Set<Pair<String, CompletableDeferred<Object[]>>>> callbacks;
    private Map<String, ? extends Function0<? extends ExposedFunction>> exposedFunctions;
    private final Logger logger;
    private final SharedFlow<Invocation> onInvocation;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    public CommonWebViewBridge(CoroutineDispatcher dispatcher, WebViewContainer webViewContainer, CoroutineScope adPlayerScope, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        CoroutineScope plus = CoroutineScopeKt.plus(CoroutineScopeKt.plus(adPlayerScope, dispatcher), new CoroutineName("CommonWebViewBridge"));
        this.scope = plus;
        this.callbacks = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        MutableSharedFlow<Invocation> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 64, null, 5, null);
        this._onInvocation = MutableSharedFlow$default;
        this.onInvocation = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.exposedFunctions = MapsKt.emptyMap();
        BuildersKt__Builders_commonKt.launch$default(plus, null, null, new AnonymousClass1(null), 3, null);
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public SharedFlow<Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Map<String, Function0<ExposedFunction>> getExposedFunctions() {
        return this.exposedFunctions;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void setExposedFunctions(Map<String, ? extends Function0<? extends ExposedFunction>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.exposedFunctions = map;
    }

    /* compiled from: CommonWebViewBridge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommonWebViewBridge.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (CommonWebViewBridge.this.webViewContainer.addJavascriptInterface(CommonWebViewBridge.this, "webviewbridge", this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, Continuation<? super Unit> continuation) {
        Object evaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, continuation);
        return evaluateJavascript == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? evaluateJavascript : Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, Continuation<? super Unit> continuation) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object execute = execute(HandlerType.EVENT, jSONArray, continuation);
        return execute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? execute : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0097 A[PHI: r14
      0x0097: PHI (r14v4 java.lang.Object) = (r14v3 java.lang.Object), (r14v1 java.lang.Object) binds: [B:17:0x0094, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object request(String str, String str2, Object[] objArr, Continuation<? super Object[]> continuation) {
        CommonWebViewBridge$request$1 commonWebViewBridge$request$1;
        int i;
        Set<Pair<String, CompletableDeferred<Object[]>>> value;
        CompletableDeferred completableDeferred;
        if (continuation instanceof CommonWebViewBridge$request$1) {
            commonWebViewBridge$request$1 = (CommonWebViewBridge$request$1) continuation;
            if ((commonWebViewBridge$request$1.label & Integer.MIN_VALUE) != 0) {
                commonWebViewBridge$request$1.label -= Integer.MIN_VALUE;
                Object obj = commonWebViewBridge$request$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonWebViewBridge$request$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    Object valueOf = String.valueOf(CompletableDeferred$default.hashCode());
                    MutableStateFlow<Set<Pair<String, CompletableDeferred<Object[]>>>> mutableStateFlow = this.callbacks;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, SetsKt.plus(value, TuplesKt.to(valueOf, CompletableDeferred$default))));
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str);
                    jSONArray.put(str2);
                    jSONArray.put(valueOf);
                    for (Object obj2 : objArr) {
                        jSONArray.put(obj2);
                    }
                    HandlerType handlerType = HandlerType.INVOCATION;
                    commonWebViewBridge$request$1.L$0 = CompletableDeferred$default;
                    commonWebViewBridge$request$1.label = 1;
                    if (execute(handlerType, jSONArray, commonWebViewBridge$request$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completableDeferred = CompletableDeferred$default;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) commonWebViewBridge$request$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                commonWebViewBridge$request$1.L$0 = null;
                commonWebViewBridge$request$1.label = 2;
                obj = completableDeferred.await(commonWebViewBridge$request$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        commonWebViewBridge$request$1 = new CommonWebViewBridge$request$1(this, continuation);
        Object obj3 = commonWebViewBridge$request$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonWebViewBridge$request$1.label;
        if (i != 0) {
        }
        commonWebViewBridge$request$1.L$0 = null;
        commonWebViewBridge$request$1.label = 2;
        obj3 = completableDeferred.await(commonWebViewBridge$request$1);
        if (obj3 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r5.equals("OK") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r4.complete(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r5.equals("success") == false) goto L35;
     */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
        Object obj;
        Set<Pair<String, CompletableDeferred<Object[]>>> value;
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
        Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
        Object[] typedArray = JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters));
        Iterator<T> it = this.callbacks.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual((String) ((Pair) obj).component1(), callbackId)) {
                    break;
                }
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        CompletableDeferred completableDeferred = (CompletableDeferred) pair.component2();
        int hashCode = callbackStatus.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 2524) {
                if (hashCode == 66247144 ? callbackStatus.equals("ERROR") : hashCode == 96784904 && callbackStatus.equals("error")) {
                    Object obj2 = typedArray[0];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    completableDeferred.completeExceptionally(new Exception((String) obj2));
                }
            }
        }
        MutableStateFlow<Set<Pair<String, CompletableDeferred<Object[]>>>> mutableStateFlow = this.callbacks;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SetsKt.minus(value, pair)));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    this.logger.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new CommonWebViewBridge$handleInvocation$7(str4, jSONArray3, this, str3, null), 3, null);
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + message, e);
            }
        } catch (Throwable th) {
            this.logger.error("Error handling invocation from webview (" + message + ')', th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            Pair[] pairArr = new Pair[2];
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.getClass().getSimpleName();
            }
            pairArr[0] = TuplesKt.to("reason_debug", message2);
            pairArr[1] = TuplesKt.to("webview_invocation", message);
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, MapsKt.mapOf(pairArr), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: " + message, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|91|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0045, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e2, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a0, code lost:
    
        r3 = r2;
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015b A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:30:0x0151, B:32:0x015b, B:46:0x011e, B:48:0x0122, B:51:0x0132, B:53:0x0136, B:56:0x0181, B:63:0x00c9, B:67:0x00aa, B:69:0x00ba, B:72:0x00cc, B:74:0x00dc, B:76:0x00e4, B:78:0x00f4, B:81:0x010c, B:84:0x0193, B:85:0x01b3), top: B:66:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:30:0x0151, B:32:0x015b, B:46:0x011e, B:48:0x0122, B:51:0x0132, B:53:0x0136, B:56:0x0181, B:63:0x00c9, B:67:0x00aa, B:69:0x00ba, B:72:0x00cc, B:74:0x00dc, B:76:0x00e4, B:78:0x00f4, B:81:0x010c, B:84:0x0193, B:85:0x01b3), top: B:66:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:30:0x0151, B:32:0x015b, B:46:0x011e, B:48:0x0122, B:51:0x0132, B:53:0x0136, B:56:0x0181, B:63:0x00c9, B:67:0x00aa, B:69:0x00ba, B:72:0x00cc, B:74:0x00dc, B:76:0x00e4, B:78:0x00f4, B:81:0x010c, B:84:0x0193, B:85:0x01b3), top: B:66:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleInvocationResult(Invocation invocation, String str, Continuation<? super Unit> continuation) {
        CommonWebViewBridge$handleInvocationResult$1 commonWebViewBridge$handleInvocationResult$1;
        String message;
        Throwable m8082exceptionOrNullimpl;
        ExposedFunction invoke;
        String str2;
        Invocation invocation2;
        String str3;
        Object second;
        Invocation invocation3 = invocation;
        String str4 = str;
        if (continuation instanceof CommonWebViewBridge$handleInvocationResult$1) {
            commonWebViewBridge$handleInvocationResult$1 = (CommonWebViewBridge$handleInvocationResult$1) continuation;
            if ((commonWebViewBridge$handleInvocationResult$1.label & Integer.MIN_VALUE) != 0) {
                commonWebViewBridge$handleInvocationResult$1.label -= Integer.MIN_VALUE;
                Object obj = commonWebViewBridge$handleInvocationResult$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (commonWebViewBridge$handleInvocationResult$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        try {
                        } catch (Throwable th) {
                            th = th;
                            message = th.getMessage();
                            if (message == null) {
                                message = th.getClass().getSimpleName();
                            }
                            Result.Companion companion = Result.INSTANCE;
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = null;
                            commonWebViewBridge$handleInvocationResult$1.L$2 = null;
                            commonWebViewBridge$handleInvocationResult$1.label = 7;
                            if (respond(str4, "ERROR", new Object[]{message}, commonWebViewBridge$handleInvocationResult$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Object m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
                            m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                            if (m8082exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (ExposedFunctionLocation.INSTANCE.getEVENT_LOCATIONS().contains(invocation.getLocation())) {
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str4;
                            commonWebViewBridge$handleInvocationResult$1.label = 1;
                            if (respond(str4, "OK", new Object[0], commonWebViewBridge$handleInvocationResult$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        Function0<ExposedFunction> function0 = getExposedFunctions().get(invocation.getLocation());
                        if (function0 == null || (invoke = function0.invoke()) == null) {
                            throw new IllegalStateException(("Invocation(" + invocation.getLocation() + ") is not handled").toString());
                        }
                        if (ExposedFunctionLocation.INSTANCE.getNON_CANCELLABLE_LOCATIONS().contains(invocation.getLocation())) {
                            NonCancellable nonCancellable = NonCancellable.INSTANCE;
                            CommonWebViewBridge$handleInvocationResult$result$1 commonWebViewBridge$handleInvocationResult$result$1 = new CommonWebViewBridge$handleInvocationResult$result$1(invoke, invocation3, null);
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str4;
                            commonWebViewBridge$handleInvocationResult$1.label = 2;
                            obj = BuildersKt.withContext(nonCancellable, commonWebViewBridge$handleInvocationResult$result$1, commonWebViewBridge$handleInvocationResult$1);
                            str3 = str4;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            Object[] parameters = invocation.getParameters();
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str4;
                            commonWebViewBridge$handleInvocationResult$1.label = 3;
                            obj = invoke.invoke(parameters, commonWebViewBridge$handleInvocationResult$1);
                            str3 = str4;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        if (obj instanceof WebViewEvent) {
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str3;
                            commonWebViewBridge$handleInvocationResult$1.label = 4;
                            if (sendEvent((WebViewEvent) obj, commonWebViewBridge$handleInvocationResult$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (obj instanceof Pair) {
                            Object[] objArr = {((Pair) obj).getFirst()};
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str3;
                            commonWebViewBridge$handleInvocationResult$1.L$2 = obj;
                            commonWebViewBridge$handleInvocationResult$1.label = 5;
                            if (respond(str3, "OK", objArr, commonWebViewBridge$handleInvocationResult$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            second = ((Pair) obj).getSecond();
                            if (second instanceof Flow) {
                                final Flow flow = (Flow) second;
                                FlowKt.launchIn(FlowKt.m9620catch(FlowKt.onEach(new Flow<Object>() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1
                                    @Override // kotlinx.coroutines.flow.Flow
                                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation2) {
                                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                                    }

                                    /* compiled from: Emitters.kt */
                                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                    public static final class AnonymousClass2<T> implements FlowCollector {
                                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                        @DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                                        /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                        public static final class AnonymousClass1 extends ContinuationImpl {
                                            Object L$0;
                                            Object L$1;
                                            int label;
                                            /* synthetic */ Object result;

                                            public AnonymousClass1(Continuation continuation) {
                                                super(continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                this.result = obj;
                                                this.label |= Integer.MIN_VALUE;
                                                return AnonymousClass2.this.emit(null, this);
                                            }
                                        }

                                        public AnonymousClass2(FlowCollector flowCollector) {
                                            this.$this_unsafeFlow = flowCollector;
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                                        @Override // kotlinx.coroutines.flow.FlowCollector
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object emit(Object obj, Continuation continuation) {
                                            AnonymousClass1 anonymousClass1;
                                            int i;
                                            if (continuation instanceof AnonymousClass1) {
                                                anonymousClass1 = (AnonymousClass1) continuation;
                                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                                    Object obj2 = anonymousClass1.result;
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    i = anonymousClass1.label;
                                                    if (i != 0) {
                                                        ResultKt.throwOnFailure(obj2);
                                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                                        if (obj instanceof WebViewEvent) {
                                                            anonymousClass1.label = 1;
                                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj2);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                            Object obj22 = anonymousClass1.result;
                                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = anonymousClass1.label;
                                            if (i != 0) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, new CommonWebViewBridge$handleInvocationResult$2(this)), new CommonWebViewBridge$handleInvocationResult$3(this, invocation3, null)), this.scope);
                            }
                        } else {
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str3;
                            commonWebViewBridge$handleInvocationResult$1.label = 6;
                            if (respond(str3, "OK", new Object[]{obj}, commonWebViewBridge$handleInvocationResult$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 2:
                        str2 = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        invocation2 = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Invocation invocation4 = invocation2;
                        str3 = str2;
                        invocation3 = invocation4;
                        if (obj instanceof WebViewEvent) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        str2 = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        invocation2 = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Invocation invocation42 = invocation2;
                        str3 = str2;
                        invocation3 = invocation42;
                        if (obj instanceof WebViewEvent) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        Object obj2 = commonWebViewBridge$handleInvocationResult$1.L$2;
                        str4 = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        Invocation invocation5 = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            obj = obj2;
                            invocation3 = invocation5;
                            second = ((Pair) obj).getSecond();
                            if (second instanceof Flow) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            invocation3 = invocation5;
                            message = th.getMessage();
                            if (message == null) {
                            }
                            Result.Companion companion2 = Result.INSTANCE;
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation3;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = null;
                            commonWebViewBridge$handleInvocationResult$1.L$2 = null;
                            commonWebViewBridge$handleInvocationResult$1.label = 7;
                            if (respond(str4, "ERROR", new Object[]{message}, commonWebViewBridge$handleInvocationResult$1) == coroutine_suspended) {
                            }
                            Object m8079constructorimpl2 = Result.m8079constructorimpl(Unit.INSTANCE);
                            m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl2);
                            if (m8082exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 7:
                        invocation3 = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Object m8079constructorimpl22 = Result.m8079constructorimpl(Unit.INSTANCE);
                        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl22);
                        if (m8082exceptionOrNullimpl != null) {
                            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                            Pair[] pairArr = new Pair[2];
                            String message2 = m8082exceptionOrNullimpl.getMessage();
                            if (message2 == null) {
                                message2 = m8082exceptionOrNullimpl.getClass().getSimpleName();
                            }
                            pairArr[0] = TuplesKt.to("reason_debug", message2);
                            pairArr[1] = TuplesKt.to("webview_invocation", invocation3.getLocation());
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, MapsKt.mapOf(pairArr), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        commonWebViewBridge$handleInvocationResult$1 = new CommonWebViewBridge$handleInvocationResult$1(this, continuation);
        Object obj3 = commonWebViewBridge$handleInvocationResult$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (commonWebViewBridge$handleInvocationResult$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, Continuation<? super Unit> continuation) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object execute = execute(HandlerType.CALLBACK, new JSONArray((Collection) CollectionsKt.listOf(jSONArray)), continuation);
        return execute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? execute : Unit.INSTANCE;
    }
}
