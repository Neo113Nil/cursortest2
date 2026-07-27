package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import com.facebook.login.LoginLogger;
import com.ironsource.U3;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import io.ktor.http.HttpStatusCode;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class d extends WebViewClientCompat {
    public static final a s = new a(null);
    public static final int t = 8;
    public static final String u = "TemplateWebViewClientImpl";
    public static final int v = 5;
    public static final long w = 1000;
    public static final long x = 1000;

    /* renamed from: a, reason: collision with root package name */
    public final i f11106a;
    public final MetricsRecorder b;
    public final boolean c;
    public final CoroutineScope d;
    public final MutableStateFlow<Boolean> e;
    public final StateFlow<Boolean> f;
    public final MutableStateFlow<Boolean> g;
    public final StateFlow<Boolean> h;
    public final MutableStateFlow<l> i;
    public final StateFlow<l> j;
    public int k;
    public Job l;
    public Job m;
    public final MutableStateFlow<Boolean> n;
    public Job o;
    public TimerEvent p;
    public TimerEvent q;
    public String r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$handleRetry$1", f = "TemplateWebviewClientImpl.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11107a;
        public final /* synthetic */ WebView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebView webView, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = webView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11107a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = (d.this.k * 1000) + 1000;
                this.f11107a = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) d.this.e.getValue()).booleanValue()) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, d.u, "Skip reload; content already loaded after backoff", null, false, 12, null);
                return Unit.INSTANCE;
            }
            Job job = d.this.o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            Job job2 = d.this.m;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.c.reload();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, d.u, "Reload attempt: " + d.this.k, null, false, 12, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$onPageFinished$1", f = "TemplateWebviewClientImpl.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11108a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f11109a;

            public a(d dVar) {
                this.f11109a = dVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, d.u, "Webview page pending error resolution: " + z, null, false, 12, null);
                if (!z) {
                    this.f11109a.d();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11108a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = d.this.n;
                a aVar = new a(d.this);
                this.f11108a = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$pageFinished$3", f = "TemplateWebviewClientImpl.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d$d, reason: collision with other inner class name */
    public static final class C1556d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11110a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d$d$a */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f11111a;

            public a(d dVar) {
                this.f11111a = dVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, d.u, "Content loaded event received, isSuccess: " + z, null, false, 12, null);
                this.f11111a.e.setValue(Boxing.boxBoolean(z));
                Job job = this.f11111a.o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                MetricsRecorder metricsRecorder = this.f11111a.b;
                CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.P.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder.recordCountEvent(countEvent.withTag(dVar.c(), z ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
                TimerEvent timerEvent = this.f11111a.q;
                if (timerEvent != null) {
                    this.f11111a.b.recordTimerEvent(timerEvent.withTag(dVar.c(), z ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
                }
                if (z) {
                    Job job2 = this.f11111a.l;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    this.f11111a.l = null;
                    this.f11111a.k = 0;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public C1556d(Continuation<? super C1556d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1556d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new C1556d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11110a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Boolean> c = d.this.f11106a.c();
                a aVar = new a(d.this);
                this.f11110a = 1;
                if (c.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public /* synthetic */ d(i iVar, MetricsRecorder metricsRecorder, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, metricsRecorder, (i & 4) != 0 ? true : z);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Job launch$default;
        super.onPageFinished(webView, str);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Webview page finished loading has pending error: " + this.n.getValue().booleanValue(), null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.O.c()).withTag("pending_error", String.valueOf(this.n.getValue().booleanValue())));
        if (!this.n.getValue().booleanValue()) {
            d();
        } else {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new c(null), 3, null);
            this.m = launch$default;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "HTML Page started loading", null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.M.c()));
        this.p = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.u.c());
        this.q = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.v.c());
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(final WebView view, WebResourceRequest request, final WebResourceErrorCompat error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        this.n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Received error: " + error.getErrorCode() + ", with description: " + ((Object) error.getDescription()) + " for url: " + request.getUrl() + " ad isLoaded: " + this.f.getValue().booleanValue() + ", isPageFinished: " + this.h.getValue().booleanValue(), null, false, 12, null);
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        view.evaluateJavascript("ContentChecker.isRequiredContent('" + uri + "');", new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                d.a(d.this, error, view, (String) obj);
            }
        });
        super.onReceivedError(view, request, error);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(final WebView view, WebResourceRequest request, final WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, U3.j.d + Thread.currentThread().getName() + "] Received HTTP error: " + Integer.valueOf(errorResponse.getStatusCode()) + ", with description: " + errorResponse.getReasonPhrase() + " for url: " + request.getUrl(), null, false, 12, null);
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        view.evaluateJavascript("ContentChecker.isRequiredContent('" + uri + "');", new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                d.a(d.this, errorResponse, view, (String) obj);
            }
        });
        super.onReceivedHttpError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail renderProcessGoneDetail) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "render_process_gone_error").withTag("is_loaded", String.valueOf(this.f.getValue().booleanValue())));
        this.i.setValue(l.e);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, u, "onRenderProcessGone", null, false, 12, null);
        this.n.setValue(Boolean.FALSE);
        return true;
    }

    public d(i contentLoadedEventHandler, MetricsRecorder metricsRecorder, boolean z) {
        Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f11106a = contentLoadedEventHandler;
        this.b = metricsRecorder;
        this.c = z;
        this.d = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<l> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.i = MutableStateFlow3;
        this.j = FlowKt.asStateFlow(MutableStateFlow3);
        this.n = StateFlowKt.MutableStateFlow(bool);
    }

    public final StateFlow<Boolean> b() {
        return this.f;
    }

    public final StateFlow<Boolean> c() {
        return this.h;
    }

    public final void d() {
        Job launch$default;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, u, "HTML Page finished loading is success: " + (this.j.getValue() == null), null, false, 12, null);
        this.g.setValue(Boolean.TRUE);
        if (this.j.getValue() == null) {
            MolocoLogger.info$default(molocoLogger, u, "Waiting for content HTML assets to load or error out", null, false, 12, null);
            MetricsRecorder metricsRecorder = this.b;
            CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.N.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
            metricsRecorder.recordCountEvent(countEvent.withTag(dVar.c(), "success"));
            TimerEvent timerEvent = this.p;
            if (timerEvent != null) {
                this.b.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new C1556d(null), 3, null);
            this.o = launch$default;
            return;
        }
        MolocoLogger.info$default(molocoLogger, u, "Unrecoverable error occurred, not setting isLoaded to true", null, false, 12, null);
        this.e.setValue(Boolean.FALSE);
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.l;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.l = null;
        MetricsRecorder metricsRecorder2 = this.b;
        CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.N.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
        CountEvent withTag = countEvent2.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
        String c2 = dVar3.c();
        String str = this.r;
        if (str == null) {
            str = "unknown";
        }
        metricsRecorder2.recordCountEvent(withTag.withTag(c2, str));
        TimerEvent timerEvent2 = this.p;
        if (timerEvent2 != null) {
            MetricsRecorder metricsRecorder3 = this.b;
            TimerEvent withTag2 = timerEvent2.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            String c3 = dVar3.c();
            String str2 = this.r;
            metricsRecorder3.recordTimerEvent(withTag2.withTag(c3, str2 != null ? str2 : "unknown"));
        }
    }

    public final boolean e() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, u, "retryCount: " + this.k + ", MAX_RETRY_LIMIT: 5, retryCount < MAX_RETRY_LIMIT: " + (this.k < 5), false, 4, null);
        return this.k < 5;
    }

    public final StateFlow<l> a() {
        return this.j;
    }

    public static final void a(d dVar, WebResourceErrorCompat webResourceErrorCompat, WebView webView, String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, u, U3.j.d + Thread.currentThread().getName() + "] Content type with webview error is required: " + parseBoolean, null, false, 12, null);
        if (parseBoolean) {
            if (!dVar.f.getValue().booleanValue()) {
                g a2 = h.a(webResourceErrorCompat.getDescription().toString());
                if (Intrinsics.areEqual(a2.c(), k.c.j.c()) && dVar.c) {
                    dVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", String.valueOf(dVar.f.getValue().booleanValue())));
                    MolocoLogger.info$default(molocoLogger, u, "Ignoring error: " + ((Object) webResourceErrorCompat.getDescription()) + " with code: " + webResourceErrorCompat.getErrorCode() + " since it's marked to be ignored pre load", null, false, 12, null);
                } else if (a2.e() && dVar.e()) {
                    dVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), webView);
                } else {
                    dVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), l.c);
                }
            } else {
                MolocoLogger.info$default(molocoLogger, u, "Webview is already showing and received error: " + ((Object) webResourceErrorCompat.getDescription()), null, false, 12, null);
                if (h.a(webResourceErrorCompat.getDescription().toString()).f()) {
                    dVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), l.c);
                } else {
                    dVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", String.valueOf(dVar.f.getValue().booleanValue())));
                    MolocoLogger.info$default(molocoLogger, u, "Webview is already showing but received " + ((Object) webResourceErrorCompat.getDescription()) + ", not setting unrecoverable error", null, false, 12, null);
                }
            }
        } else {
            MolocoLogger.info$default(molocoLogger, u, "Content is not required, not setting unrecoverable error", null, false, 12, null);
            dVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", String.valueOf(dVar.f.getValue().booleanValue())));
        }
        dVar.n.setValue(Boolean.FALSE);
    }

    public final void a(String str, int i, WebView webView) {
        Job launch$default;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Retrying error... Attempt: " + (this.k + 1), null, false, 12, null);
        this.k++;
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.I.c()).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), String.valueOf(this.k)).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(str)).withTag("status_code", String.valueOf(i)));
        Job job = this.l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new b(webView, null), 3, null);
        this.l = launch$default;
    }

    public final void a(String str, int i, l lVar) {
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, u, "Setting unrecoverable error with description: " + str + ", code: " + i + ", errorType: " + lVar, null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(str)).withTag("status_code", String.valueOf(i)).withTag("is_loaded", String.valueOf(this.f.getValue().booleanValue())));
        this.r = str;
        this.i.setValue(lVar);
    }

    public static final void a(d dVar, WebResourceResponse webResourceResponse, WebView webView, String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, u, U3.j.d + Thread.currentThread().getName() + "] Content isRequired with http error: " + parseBoolean, null, false, 12, null);
        if (parseBoolean) {
            if (dVar.f.getValue().booleanValue()) {
                dVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", String.valueOf(dVar.f.getValue().booleanValue())));
                MolocoLogger.info$default(molocoLogger, u, "Webview is already showing but received HTTP " + webResourceResponse.getStatusCode() + ", not setting unrecoverable error", null, false, 12, null);
            } else if (dVar.a(webResourceResponse.getStatusCode()) && dVar.e()) {
                dVar.a(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), webView);
            } else {
                dVar.a(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), l.d);
                MolocoLogger.warn$default(molocoLogger, u, "Setting unrecoverable error: " + dVar.j.getValue(), null, false, 12, null);
            }
        } else {
            MolocoLogger.info$default(molocoLogger, u, "Content is not required, not setting unrecoverable error", null, false, 12, null);
            dVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", String.valueOf(dVar.f.getValue().booleanValue())));
        }
        dVar.n.setValue(Boolean.FALSE);
    }

    public final boolean a(int i) {
        HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
        return i == companion.getTooManyRequests().getValue() || i == companion.getRequestTimeout().getValue() || i < 400 || i >= 500;
    }
}
