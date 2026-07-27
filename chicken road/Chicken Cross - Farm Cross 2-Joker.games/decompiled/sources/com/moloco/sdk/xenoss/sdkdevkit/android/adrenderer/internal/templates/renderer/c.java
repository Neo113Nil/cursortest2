package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.common_adapter_internal.AdapterAccess;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class c extends WebView {
    public static final a i = new a(null);
    public static final int j = 8;
    public static final String k = "TemplateWebView";
    public static final String l = "webview_version";
    public static final long m = 1500;

    /* renamed from: a, reason: collision with root package name */
    public final i f11094a;
    public final h b;
    public final MetricsRecorder c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d d;
    public final CoroutineScope e;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> f;
    public final StateFlow<l> g;
    public final StateFlow<Boolean> h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2", f = "TemplateWebView.kt", i = {0, 0}, l = {196}, m = "invokeSuspend", n = {"timerEvent", "webViewVersion"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super x<Unit, l>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f11095a;
        public Object b;
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "TemplateWebView.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends l>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11096a;
            public final /* synthetic */ c b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$b$a$a, reason: collision with other inner class name */
            public static final class C1550a extends SuspendLambda implements Function3<Boolean, l, Continuation<? super Pair<? extends Boolean, ? extends l>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11097a;
                public /* synthetic */ boolean b;
                public /* synthetic */ Object c;

                public C1550a(Continuation<? super C1550a> continuation) {
                    super(3, continuation);
                }

                public final Object a(boolean z, l lVar, Continuation<? super Pair<Boolean, ? extends l>> continuation) {
                    C1550a c1550a = new C1550a(continuation);
                    c1550a.b = z;
                    c1550a.c = lVar;
                    return c1550a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, l lVar, Continuation<? super Pair<? extends Boolean, ? extends l>> continuation) {
                    return a(bool.booleanValue(), lVar, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11097a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return TuplesKt.to(Boxing.boxBoolean(z), (l) this.c);
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$b$a$b, reason: collision with other inner class name */
            public static final class C1551b extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends l>, Continuation<? super Boolean>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11098a;
                public /* synthetic */ Object b;

                public C1551b(Continuation<? super C1551b> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair<Boolean, ? extends l> pair, Continuation<? super Boolean> continuation) {
                    return ((C1551b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1551b c1551b = new C1551b(continuation);
                    c1551b.b = obj;
                    return c1551b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11098a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.b;
                    return Boxing.boxBoolean(((Boolean) pair.component1()).booleanValue() || ((l) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<Boolean, ? extends l>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f11096a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.flowCombine(this.b.d.b(), this.b.d.a(), new C1550a(null));
                    C1551b c1551b = new C1551b(null);
                    this.f11096a = 1;
                    obj = FlowKt.first(flowCombine, c1551b, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.e = str;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super x<Unit, l>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TimerEvent startTimerEvent;
            Object m9582withTimeoutOrNullKLykuaI;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                startTimerEvent = c.this.c.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.r.c());
                String b = c.this.b();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, c.k, "Loading ad in webView, with webview version: " + b, null, false, 12, null);
                try {
                    c.this.loadDataWithBaseURL(null, this.e, "text/html", "UTF-8", null);
                    long j = this.f;
                    a aVar = new a(c.this, null);
                    this.f11095a = startTimerEvent;
                    this.b = b;
                    this.c = 1;
                    m9582withTimeoutOrNullKLykuaI = TimeoutKt.m9582withTimeoutOrNullKLykuaI(j, aVar, this);
                    if (m9582withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = b;
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, c.k, "loadHtml failed to load the provided html", e, false, 8, null);
                    MetricsRecorder metricsRecorder = c.this.c;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "invalid_url").withTag(c.l, b));
                    c.this.c.recordTimerEvent(startTimerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "invalid_url").withTag(c.l, b));
                    return new x.a(l.b);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.b;
                startTimerEvent = (TimerEvent) this.f11095a;
                ResultKt.throwOnFailure(obj);
                m9582withTimeoutOrNullKLykuaI = obj;
            }
            if (m9582withTimeoutOrNullKLykuaI == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, c.k, "Ad failed to load due to timeout", null, false, 12, null);
                MetricsRecorder metricsRecorder2 = c.this.c;
                CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                CountEvent withTag2 = countEvent2.withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
                metricsRecorder2.recordCountEvent(withTag2.withTag(dVar4.c(), "timeout_error").withTag(c.l, str));
                c.this.c.recordTimerEvent(startTimerEvent.withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar4.c(), "timeout_error").withTag(c.l, str));
                return new x.a(l.f);
            }
            boolean booleanValue = c.this.d.b().getValue().booleanValue();
            l value = c.this.d.a().getValue();
            if (value != null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, c.k, "Ad failed to load due to unrecoverable error: " + value.name(), null, false, 12, null);
                MetricsRecorder metricsRecorder3 = c.this.c;
                CountEvent countEvent3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.d;
                CountEvent withTag3 = countEvent3.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar6 = com.moloco.sdk.internal.client_metrics_data.d.b;
                metricsRecorder3.recordCountEvent(withTag3.withTag(dVar6.c(), value.name()).withTag(c.l, str));
                c.this.c.recordTimerEvent(startTimerEvent.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar6.c(), value.name()).withTag(c.l, str));
                return new x.a(value);
            }
            if (booleanValue) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, c.k, "Ad loaded successfully in webView", null, false, 12, null);
                MetricsRecorder metricsRecorder4 = c.this.c;
                CountEvent countEvent4 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar7 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder4.recordCountEvent(countEvent4.withTag(dVar7.c(), "success").withTag(c.l, str));
                c.this.c.recordTimerEvent(startTimerEvent.withTag(dVar7.c(), "success").withTag(c.l, str));
                return new x.b(Unit.INSTANCE);
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, c.k, "Ad failed to load due to unknown error", null, false, 12, null);
            MetricsRecorder metricsRecorder5 = c.this.c;
            CountEvent countEvent5 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar8 = com.moloco.sdk.internal.client_metrics_data.d.d;
            CountEvent withTag4 = countEvent5.withTag(dVar8.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar9 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder5.recordCountEvent(withTag4.withTag(dVar9.c(), "unknown_error").withTag(c.l, str));
            c.this.c.recordTimerEvent(startTimerEvent.withTag(dVar8.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar9.c(), "unknown_error").withTag(c.l, str));
            return new x.a(l.f11116a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView", f = "TemplateWebView.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "performRenderingCheck", n = {"this", "params"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$c, reason: collision with other inner class name */
    public static final class C1552c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f11099a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public C1552c(Continuation<? super C1552c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return c.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1", f = "TemplateWebView.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11100a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a d;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f11101a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1$1", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$d$a$a, reason: collision with other inner class name */
            public static final class C1553a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11102a;
                public final /* synthetic */ c b;
                public final /* synthetic */ h.a c;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$d$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C1554a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f11103a;

                    static {
                        int[] iArr = new int[h.a.values().length];
                        try {
                            iArr[h.a.d.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[h.a.c.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f11103a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1553a(c cVar, h.a aVar, Continuation<? super C1553a> continuation) {
                    super(2, continuation);
                    this.b = cVar;
                    this.c = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C1553a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1553a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11102a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WebSettings settings = this.b.getSettings();
                    int i = C1554a.f11103a[this.c.ordinal()];
                    settings.setMediaPlaybackRequiresUserGesture(i != 1 ? i != 2 ? this.b.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1$2", f = "TemplateWebView.kt", i = {}, l = {112, 113}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11104a;
                public final /* synthetic */ c b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = cVar;
                    this.c = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f11104a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f11104a = 1;
                        if (DelayKt.delay(c.m, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    c cVar = this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar = this.c;
                    this.f11104a = 2;
                    if (cVar.a(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1", f = "TemplateWebView.kt", i = {0, 0}, l = {98}, m = "emit", n = {"this", "creativeType"}, s = {"L$0", "L$1"})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$d$a$c, reason: collision with other inner class name */
            public static final class C1555c extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public Object f11105a;
                public Object b;
                public /* synthetic */ Object c;
                public final /* synthetic */ a<T> d;
                public int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1555c(a<? super T> aVar, Continuation<? super C1555c> continuation) {
                    super(continuation);
                    this.d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.c = obj;
                    this.e |= Integer.MIN_VALUE;
                    return this.d.emit(null, this);
                }
            }

            public a(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar2) {
                this.f11101a = cVar;
                this.b = aVar;
                this.c = aVar2;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26)(1:27))|12|(2:14|(1:16))(1:20)|17|18))|30|6|7|(0)(0)|12|(0)(0)|17|18) */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0125, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0126, code lost:
            
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.k, "Failed to access WebView settings", r0, false, 8, null);
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00a5 A[Catch: Exception -> 0x0125, TryCatch #0 {Exception -> 0x0125, blocks: (B:11:0x003a, B:12:0x007c, B:14:0x00a5, B:16:0x00ec, B:20:0x0104, B:24:0x0049), top: B:7:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0104 A[Catch: Exception -> 0x0125, TRY_LEAVE, TryCatch #0 {Exception -> 0x0125, blocks: (B:11:0x003a, B:12:0x007c, B:14:0x00a5, B:16:0x00ec, B:20:0x0104, B:24:0x0049), top: B:7:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(h.a aVar, Continuation<? super Unit> continuation) {
                C1555c c1555c;
                int i;
                a<T> aVar2;
                h.a aVar3 = aVar;
                if (continuation instanceof C1555c) {
                    c1555c = (C1555c) continuation;
                    int i2 = c1555c.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1555c.e = i2 - Integer.MIN_VALUE;
                        Object obj = c1555c.c;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1555c.e;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, c.k, "Playlist item displaying event received: " + aVar3, null, false, 12, null);
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            C1553a c1553a = new C1553a(this.f11101a, aVar3, null);
                            c1555c.f11105a = this;
                            c1555c.b = aVar3;
                            c1555c.e = 1;
                            if (BuildersKt.withContext(main, c1553a, c1555c) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar2 = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (h.a) c1555c.b;
                            aVar2 = (a) c1555c.f11105a;
                            ResultKt.throwOnFailure(obj);
                        }
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.info$default(molocoLogger, c.k, "Set playback: " + aVar2.f11101a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                        if (aVar3 != h.a.d) {
                            MolocoLogger.info$default(molocoLogger, c.k, "Playlist item displaying event is MRAID, setting orientation to: " + aVar2.b.e().getValue(), null, false, 12, null);
                            aVar2.f11101a.f.setValue(n.a.i.a(aVar2.b.e().getValue()));
                            aVar2.b.d();
                            if (aVar2.c != null) {
                                BuildersKt__Builders_commonKt.launch$default(aVar2.f11101a.e, null, null, new b(aVar2.f11101a, aVar2.c, null), 3, null);
                            }
                        } else {
                            MolocoLogger.info$default(molocoLogger, c.k, "Playlist item displaying event is not MRAID, setting orientation to none", null, false, 12, null);
                            aVar2.f11101a.f.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1555c = new C1555c(this, continuation);
                Object obj2 = c1555c.c;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1555c.e;
                if (i != 0) {
                }
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, c.k, "Set playback: " + aVar2.f11101a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                if (aVar3 != h.a.d) {
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = aVar;
            this.d = aVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11100a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<h.a> c = c.this.b.c();
                    a aVar = new a(c.this, this.c, this.d);
                    this.f11100a = 1;
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
            } catch (Exception e) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, c.k, "Error collecting playlist item displaying events", e, false, 8, null);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(Context context, i iVar, h hVar, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d dVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iVar, hVar, metricsRecorder, r5, (i2 & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d(iVar, metricsRecorder, r5) : dVar);
        boolean z2 = (i2 & 16) != 0 ? true : z;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> getOrientation$moloco_sdk_release() {
        return this.f;
    }

    public final StateFlow<l> getUnrecoverableError() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        CoroutineScopeKt.cancel$default(this.e, null, 1, null);
    }

    public final String b() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage != null && (str = currentWebViewPackage.versionName) != null) {
                    return str;
                }
                return "unknown";
            }
            PackageManager packageManager = getContext().getPackageManager();
            for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"com.google.android.webview", "com.android.webview", "com.android.chrome"})) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "Pre-O, legacy webview version: " + str2 + " → " + packageInfo.versionName, null, false, 12, null);
                String versionName = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
                if (versionName.length() > 0) {
                    String versionName2 = packageInfo.versionName;
                    Intrinsics.checkNotNullExpressionValue(versionName2, "versionName");
                    return versionName2;
                }
            }
            return "unknown";
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, k, "WebView version retrieval exception", e, false, 8, null);
            return "unknown";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, i contentLoadedEventHandler, h playListItemDisplayingEventHandler, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d webViewClientImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.f11094a = contentLoadedEventHandler;
        this.b = playListItemDisplayingEventHandler;
        this.c = metricsRecorder;
        this.d = webViewClientImpl;
        this.e = CoroutineScopeKt.CoroutineScope(AdapterAccess.INSTANCE.DispatcherProvider().getMain());
        this.f = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.g = webViewClientImpl.a();
        this.h = webViewClientImpl.c();
    }

    public final StateFlow<Boolean> a() {
        return this.h;
    }

    public static /* synthetic */ void a(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        cVar.a(aVar, aVar2);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar) {
        Intrinsics.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new d(mraidCommunicationHub, aVar, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:3|(11:5|6|7|(1:(3:10|11|12)(2:30|31))(4:32|33|34|(1:36)(1:37))|13|(1:15)(1:25)|16|17|18|19|20))|7|(0)(0)|13|(0)(0)|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e8, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.k, "Creative rendering check URL fire failed", r10, false, 8, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar, Continuation<? super Unit> continuation) {
        C1552c c1552c;
        int i2;
        Exception exc;
        c cVar;
        c cVar2;
        String str;
        try {
            if (continuation instanceof C1552c) {
                c1552c = (C1552c) continuation;
                int i3 = c1552c.e;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c1552c.e = i3 - Integer.MIN_VALUE;
                    Object obj = c1552c.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = c1552c.e;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            e eVar = e.f11112a;
                            float f = aVar.f();
                            c1552c.f11099a = this;
                            c1552c.b = aVar;
                            c1552c.e = 1;
                            obj = eVar.a(this, f, c1552c);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            cVar2 = this;
                        } catch (Exception e) {
                            exc = e;
                            cVar = this;
                            MolocoLogger.warn$default(MolocoLogger.INSTANCE, k, "Creative rendering check failed to sample WebView", exc, false, 8, null);
                            cVar2 = cVar;
                            str = "capture_failed";
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "Black screen creative rendering check: result=".concat(str), null, false, 12, null);
                            String b2 = cVar2.b();
                            cVar2.c.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.g0.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), str).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), aVar.d()).withTag(l, b2));
                            Uri build = Uri.parse(aVar.e()).buildUpon().appendQueryParameter("result", str).appendQueryParameter(l, b2).build();
                            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c = a.i.f10874a.c();
                            String uri = build.toString();
                            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                            c.a(uri);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) c1552c.b;
                        cVar2 = (c) c1552c.f11099a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e2) {
                            exc = e2;
                            cVar = cVar2;
                            MolocoLogger.warn$default(MolocoLogger.INSTANCE, k, "Creative rendering check failed to sample WebView", exc, false, 8, null);
                            cVar2 = cVar;
                            str = "capture_failed";
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "Black screen creative rendering check: result=".concat(str), null, false, 12, null);
                            String b22 = cVar2.b();
                            cVar2.c.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.g0.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), str).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), aVar.d()).withTag(l, b22));
                            Uri build2 = Uri.parse(aVar.e()).buildUpon().appendQueryParameter("result", str).appendQueryParameter(l, b22).build();
                            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c2 = a.i.f10874a.c();
                            String uri2 = build2.toString();
                            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                            c2.a(uri2);
                            return Unit.INSTANCE;
                        }
                    }
                    str = !((Boolean) obj).booleanValue() ? "black" : "rendered";
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "Black screen creative rendering check: result=".concat(str), null, false, 12, null);
                    String b222 = cVar2.b();
                    cVar2.c.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.g0.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), str).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), aVar.d()).withTag(l, b222));
                    Uri build22 = Uri.parse(aVar.e()).buildUpon().appendQueryParameter("result", str).appendQueryParameter(l, b222).build();
                    com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c22 = a.i.f10874a.c();
                    String uri22 = build22.toString();
                    Intrinsics.checkNotNullExpressionValue(uri22, "toString(...)");
                    c22.a(uri22);
                    return Unit.INSTANCE;
                }
            }
            if (i2 != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "Black screen creative rendering check: result=".concat(str), null, false, 12, null);
            String b2222 = cVar2.b();
            cVar2.c.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.g0.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), str).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), aVar.d()).withTag(l, b2222));
            Uri build222 = Uri.parse(aVar.e()).buildUpon().appendQueryParameter("result", str).appendQueryParameter(l, b2222).build();
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c222 = a.i.f10874a.c();
            String uri222 = build222.toString();
            Intrinsics.checkNotNullExpressionValue(uri222, "toString(...)");
            c222.a(uri222);
            return Unit.INSTANCE;
        } catch (CancellationException unused) {
            return Unit.INSTANCE;
        }
        c1552c = new C1552c(continuation);
        Object obj2 = c1552c.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c1552c.e;
    }

    public final Object a(String str, long j2, Continuation<? super x<Unit, l>> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new b(str, j2, null), continuation);
    }
}
