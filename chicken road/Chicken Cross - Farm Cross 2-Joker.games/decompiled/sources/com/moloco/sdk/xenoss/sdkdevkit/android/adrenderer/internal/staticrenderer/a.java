package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4817d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4818e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class a extends C4817d implements g {
    public static final int k = 8;
    public final CoroutineScope c;
    public final s d;
    public final h e;
    public final boolean f;
    public final c g;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> h;
    public final SharedFlow<Unit> i;
    public final StateFlow<Boolean> j;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2", f = "StaticWebView.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a, reason: collision with other inner class name */
    public static final class C1541a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super x<Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11067a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "StaticWebView.kt", i = {}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a, reason: collision with other inner class name */
        public static final class C1542a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11068a;
            public final /* synthetic */ a b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "StaticWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$a, reason: collision with other inner class name */
            public static final class C1543a extends SuspendLambda implements Function3<Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, Continuation<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11069a;
                public /* synthetic */ boolean b;
                public /* synthetic */ Object c;

                public C1543a(Continuation<? super C1543a> continuation) {
                    super(3, continuation);
                }

                public final Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation<? super Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
                    C1543a c1543a = new C1543a(continuation);
                    c1543a.b = z;
                    c1543a.c = gVar;
                    return c1543a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation<? super Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
                    return a(bool.booleanValue(), gVar, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11069a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return TuplesKt.to(Boxing.boxBoolean(z), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.c);
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "StaticWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$b */
            public static final class b extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>, Continuation<? super Boolean>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11070a;
                public /* synthetic */ Object b;

                public b(Continuation<? super b> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> pair, Continuation<? super Boolean> continuation) {
                    return ((b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    b bVar = new b(continuation);
                    bVar.b = obj;
                    return bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11070a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.b;
                    return Boxing.boxBoolean(((Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1542a(a aVar, Continuation<? super C1542a> continuation) {
                super(2, continuation);
                this.b = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
                return ((C1542a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1542a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f11068a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.flowCombine(this.b.g.m(), this.b.g.l(), new C1543a(null));
                    b bVar = new b(null);
                    this.f11068a = 1;
                    obj = FlowKt.first(flowCombine, bVar, this);
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
        public C1541a(String str, long j, Continuation<? super C1541a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super x<Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
            return ((C1541a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new C1541a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11067a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    a aVar = a.this;
                    C4818e.a(aVar, aVar.getHtmlCssFixer().a(this.c));
                    long j = this.d;
                    C1542a c1542a = new C1542a(a.this, null);
                    this.f11067a = 1;
                    obj = TimeoutKt.m9582withTimeoutOrNullKLykuaI(j, c1542a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, b.f11071a, "loadHtml", e, false, 8, null);
                    return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.b);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                a.this.g.c();
            }
            boolean booleanValue = a.this.g.m().getValue().booleanValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g value = a.this.g.l().getValue();
            return value != null ? new x.a(value) : booleanValue ? new x.b(Unit.INSTANCE) : new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f10972a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(Context context, CoroutineScope coroutineScope, s sVar, h hVar, boolean z, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r2, sVar, hVar, (i & 16) != 0 ? false : z, (i & 32) != 0 ? new c(r2, sVar, hVar) : cVar);
        CoroutineScope CoroutineScope = (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()) : coroutineScope;
    }

    public final StateFlow<Boolean> c() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4817d, android.webkit.WebView
    public void destroy() {
        super.destroy();
        CoroutineScopeKt.cancel$default(this.c, null, 1, null);
    }

    public final SharedFlow<Unit> getClickthroughEvent() {
        return this.i;
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> getUnrecoverableError() {
        return this.h;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f) {
            return false;
        }
        if (event.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.g.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(ArraysKt.first(iArr), ArraysKt.last(iArr), getHeight(), getWidth(), (int) (event.getX() + ArraysKt.first(iArr)), (int) (event.getY() + ArraysKt.last(iArr))));
        }
        return super.onTouchEvent(event);
    }

    public final Object a(String str, long j, Continuation<? super x<Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new C1541a(str, j, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.g.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c.EnumC1624a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.g.a(buttonType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, CoroutineScope scope, s clickthroughService, h buttonTracker, boolean z, c webViewClientImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.c = scope;
        this.d = clickthroughService;
        this.e = buttonTracker;
        this.f = z;
        this.g = webViewClientImpl;
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.h = webViewClientImpl.l();
        this.i = webViewClientImpl.f();
        this.j = webViewClientImpl.p();
    }
}
