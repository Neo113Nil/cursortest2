package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.e4;
import com.chartboost.sdk.impl.gl;
import com.chartboost.sdk.impl.rj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class gl extends j2 implements wc, vk {
    public static final a I = new a(null);
    public volatile FrameLayout A;
    public vc B;
    public boolean C;
    public Triple D;
    public final AtomicBoolean E;
    public final CoroutineScope F;
    public final AtomicBoolean G;
    public wk H;
    public final Context n;
    public final String o;
    public final URL p;
    public final rc q;
    public final v4 r;
    public final il s;
    public final rk t;
    public final v u;
    public final ae v;
    public final u2 w;
    public final List x;
    public Function0 y;
    public volatile WebView z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }

        public final int a(Integer num, Context context) {
            if (num == null) {
                return -1;
            }
            if (num.intValue() != -1 && num.intValue() != -2) {
                if (num.intValue() < 0) {
                    mb.e("Unknown dimension value: " + num + ". Defaulting to MATCH_PARENT", null, 2, null);
                    return -1;
                }
                return o6.a(num.intValue(), context);
            }
            return num.intValue();
        }

        public final String a(Integer num) {
            StringBuilder append;
            String str;
            if (num == null) {
                return "default (MATCH_PARENT)";
            }
            if (num.intValue() == -1) {
                return "MATCH_PARENT";
            }
            if (num.intValue() == -2) {
                return "WRAP_CONTENT";
            }
            if (num.intValue() >= 0) {
                append = new StringBuilder().append(num);
                str = "dp";
            } else {
                append = new StringBuilder().append(num);
                str = " (unknown, using MATCH_PARENT)";
            }
            return append.append(str).toString();
        }

        public final String a(List list) {
            return CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.gl$a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gl.a.a((String) obj);
                }
            }, 30, null);
        }

        public static final CharSequence a(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            return "<script>" + script + "</script>";
        }

        public final String a(String html, List list) {
            Intrinsics.checkNotNullParameter(html, "html");
            if (list == null || list.isEmpty()) {
                return html;
            }
            return a(list) + "\n" + html;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ FrameLayout c;
        public final /* synthetic */ View d;
        public final /* synthetic */ gl e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FrameLayout frameLayout, View view, gl glVar, Continuation continuation) {
            super(2, continuation);
            this.c = frameLayout;
            this.d = view;
            this.e = glVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            gl.b(this.e, this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a2 = gl.this.a((Context) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ Context f;

        public static final class a implements Function1 {
            public final /* synthetic */ gl b;
            public final /* synthetic */ WebView c;

            /* renamed from: com.chartboost.sdk.impl.gl$d$a$a, reason: collision with other inner class name */
            public static final class C0212a extends SuspendLambda implements Function2 {
                public int b;
                public final /* synthetic */ gl c;
                public final /* synthetic */ WebView d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0212a(gl glVar, WebView webView, Continuation continuation) {
                    super(2, continuation);
                    this.c = glVar;
                    this.d = webView;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0212a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0212a(this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.c.b(this.d);
                    return Unit.INSTANCE;
                }
            }

            public a(gl glVar, WebView webView) {
                this.b = glVar;
                this.c = webView;
            }

            public final void a(Throwable th) {
                mb.a("WebRenderable load cancelled: " + th, (Throwable) null, 2, (Object) null);
                if (this.b.r != null && ((Boolean) this.b.G().invoke()).booleanValue()) {
                    this.b.E();
                }
                BuildersKt__Builders_commonKt.launch$default(this.b.F, null, null, new C0212a(this.b, this.c, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends fd {
            public final /* synthetic */ CancellableContinuation c;
            public final /* synthetic */ gl d;
            public final /* synthetic */ WebView e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CancellableContinuation cancellableContinuation, gl glVar, WebView webView, String str) {
                super(str);
                this.c = cancellableContinuation;
                this.d = glVar;
                this.e = webView;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                List<String> d;
                if (this.c.isActive()) {
                    this.d.a((View) this.e);
                    if (this.d.C) {
                        Triple triple = this.d.D;
                        if (triple == null) {
                            triple = new Triple("Unknown URL", -1, "No description");
                        }
                        String str2 = "WebView failed to load main frame. URL: " + ((String) triple.component1()) + ", Error Code: " + ((Integer) triple.component2()) + ", Description: " + triple.component3();
                        this.d.E();
                        ChartboostError.Load.WebViewFailed webViewFailed = new ChartboostError.Load.WebViewFailed(str2, null);
                        CancellableContinuation cancellableContinuation = this.c;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m8079constructorimpl(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(webViewFailed)))));
                        return;
                    }
                    this.d.a(this.e);
                    if (webView != null) {
                        String format = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        webView.evaluateJavascript(format, null);
                    }
                    s8 l = this.d.A().l();
                    if (l != null && (d = l.d()) != null) {
                        for (String str3 : d) {
                            if (webView != null) {
                                webView.evaluateJavascript(str3, null);
                            }
                        }
                    }
                    CancellableContinuation cancellableContinuation2 = this.c;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m8079constructorimpl(Result.m8078boximpl(Result.m8079constructorimpl(Unit.INSTANCE))));
                    vc vcVar = this.d.B;
                    if (vcVar != null) {
                        vcVar.start();
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                Integer valueOf2 = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
                CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
                if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                    mb.e("WebRenderable sub-resource error: url=" + valueOf + ", auctionId=" + this.d.u().c() + ", errorCode=" + valueOf2 + ", description=" + ((Object) description), null, 2, null);
                    if (this.d.r != null && this.c.isActive() && ((Boolean) this.d.G().invoke()).booleanValue()) {
                        this.d.E();
                        return;
                    }
                    return;
                }
                mb.b("WebRenderable main frame error: url=" + valueOf + ", auctionId=" + this.d.u().c() + ", errorCode=" + valueOf2 + ", description=" + ((Object) description) + ", method=" + (webResourceRequest != null ? webResourceRequest.getMethod() : null), (Throwable) null, 2, (Object) null);
                this.d.C = true;
                if (this.d.D == null) {
                    this.d.D = new Triple(valueOf, valueOf2, description);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                String str = (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "KILLED_BY_SYSTEM" : "CRASHED";
                Integer valueOf = renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null;
                mb.b("WebRenderable render process gone: phase=" + (this.c.isActive() ? "LOAD" : "RENDER") + ", auctionId=" + this.d.u().c() + ", reason=" + str + ", rendererPriority=" + valueOf + ", htmlSource=" + (this.d.o != null ? "HTML" : "URL"), (Throwable) null, 2, (Object) null);
                this.d.a((View) this.e);
                if (this.c.isActive()) {
                    CancellableContinuation cancellableContinuation = this.c;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m8079constructorimpl(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(ChartboostError.Load.WebViewCrashed.INSTANCE)))));
                } else {
                    ChartboostError.Render.WebViewTerminated webViewTerminated = ChartboostError.Render.WebViewTerminated.INSTANCE;
                    this.d.a(webViewTerminated);
                    tf n = this.d.n();
                    if (n != null) {
                        n.onError(webViewTerminated);
                    }
                    vc vcVar = this.d.B;
                    if (vcVar != null) {
                        vcVar.a(gh.h);
                    }
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                if (!(view instanceof dd)) {
                    mb.b("Expected an MraidWebView", (Throwable) null, 2, (Object) null);
                    return false;
                }
                dd ddVar = (dd) view;
                boolean gestureDetected = ddVar.getGestureDetected();
                if (this.d.A().p()) {
                    ddVar.a();
                }
                vc vcVar = this.d.B;
                if (vcVar == null) {
                    return false;
                }
                s8 l = this.d.A().l();
                return vcVar.a(request, l != null ? l.f() : false, gestureDetected);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Continuation continuation) {
            super(2, continuation);
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return gl.this.new d(this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            URL b2;
            String c;
            Window window;
            URL url;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String str2 = gl.this.o != null ? "HTML" : "URL";
            String str3 = gl.this.o;
            mb.a("WebRenderable load initiated: auctionId=" + gl.this.u().c() + ", source=" + str2 + ", contentLength=" + ((str3 == null && ((url = gl.this.p) == null || (str3 = url.toString()) == null)) ? 0 : str3.length()) + ", placementType=" + gl.this.q, (Throwable) null, 2, (Object) null);
            Context context = this.f;
            gl glVar = gl.this;
            this.b = context;
            this.c = glVar;
            this.d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                activity = null;
            }
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            s8 l = glVar.A().l();
            boolean z = (l != null ? l.a() : true) && activity != null && viewGroup != null && viewGroup.isAttachedToWindow();
            a aVar = gl.I;
            v vVar = glVar.u;
            int a2 = aVar.a(vVar != null ? vVar.b() : null, context);
            v vVar2 = glVar.u;
            int a3 = aVar.a(vVar2 != null ? vVar2.a() : null, context);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setVisibility(4);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(a2, a3));
            if (!z || viewGroup == null) {
                v vVar3 = glVar.u;
                String a4 = aVar.a(vVar3 != null ? vVar3.b() : null);
                v vVar4 = glVar.u;
                mb.a("Created temp invisible container (not attached to Activity decorView) with dimensions: " + a4 + " x " + aVar.a(vVar4 != null ? vVar4.a() : null) + " = " + a2 + "px x " + a3 + "px", (Throwable) null, 2, (Object) null);
            } else {
                viewGroup.addView(frameLayout);
                frameLayout.setTranslationZ(-1000000.0f);
                v vVar5 = glVar.u;
                String a5 = aVar.a(vVar5 != null ? vVar5.b() : null);
                v vVar6 = glVar.u;
                mb.a("Created temp invisible container and attached to Activity decorView with dimensions: " + a5 + " x " + aVar.a(vVar6 != null ? vVar6.a() : null) + " = " + a2 + "px x " + a3 + "px", (Throwable) null, 2, (Object) null);
            }
            glVar.A = frameLayout;
            WebView a6 = glVar.s.a(context);
            a6.getSettings().setJavaScriptEnabled(true);
            a6.getSettings().setMediaPlaybackRequiresUserGesture(false);
            a6.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            Integer r = glVar.A().r();
            Integer k = glVar.A().k();
            int a7 = r != null ? o6.a(r.intValue(), context) : -1;
            int a8 = k != null ? o6.a(k.intValue(), context) : -1;
            a6.setLayoutParams(new FrameLayout.LayoutParams(a7, a8));
            mb.a("Set WebView dimensions: " + r + "dp x " + k + "dp = " + a7 + "px x " + a8 + "px", (Throwable) null, 2, (Object) null);
            ViewParent parent = a6.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(a6);
            }
            frameLayout.addView(a6);
            s8 l2 = glVar.A().l();
            String str4 = "2.0";
            if (l2 == null || (str = l2.c()) == null) {
                str = "2.0";
            }
            a6.setWebViewClient(new b(cancellableContinuationImpl, glVar, a6, str));
            glVar.z = a6;
            vc a9 = glVar.s.a(context, a6, glVar.q);
            a9.a(glVar);
            glVar.B = a9;
            cancellableContinuationImpl.invokeOnCancellation(new a(glVar, a6));
            String str5 = glVar.o;
            if (str5 != null) {
                String a10 = glVar.t.a().a(new Regex("\\sautoplay(=[\"']?autoplay[\"']?)?", RegexOption.IGNORE_CASE).replace(str5, ""));
                s8 l3 = glVar.A().l();
                String a11 = aVar.a(a10, l3 != null ? l3.e() : null);
                xc xcVar = xc.f5080a;
                s8 l4 = glVar.A().l();
                if (l4 != null && (c = l4.c()) != null) {
                    str4 = c;
                }
                String a12 = xcVar.a(str4);
                s8 l5 = glVar.A().l();
                a6.loadDataWithBaseURL((l5 == null || (b2 = l5.b()) == null) ? null : b2.toString(), "<html><script type=\"text/javascript\">" + a12 + "</script>\n" + a11 + "</html>", "text/html", "UTF-8", null);
            } else {
                URL url2 = glVar.p;
                if (url2 != null) {
                    a6.loadUrl(url2.toString());
                }
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ WebView c;
        public final /* synthetic */ gl d;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ WebView c;
            public final /* synthetic */ gl d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WebView webView, gl glVar, Continuation continuation) {
                super(2, continuation);
                this.c = webView;
                this.d = glVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.c.setVisibility(8);
                        gl glVar = this.d;
                        WebView webView = this.c;
                        this.b = 1;
                        if (glVar.a(webView, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Exception e) {
                    mb.b("WebRenderable WebView destruction failed: source=".concat(this.d.o != null ? "HTML" : "URL"), e);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebView webView, gl glVar, Continuation continuation) {
            super(2, continuation);
            this.c = webView;
            this.d = glVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NonCancellable nonCancellable = NonCancellable.INSTANCE;
                a aVar = new a(this.c, this.d, null);
                this.b = 1;
                if (BuildersKt.withContext(nonCancellable, aVar, this) == coroutine_suspended) {
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

    public static final class f extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return gl.this.a((WebView) null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ gl(Context context, String str, URL url, rc rcVar, v4 v4Var, il ilVar, qf qfVar, a0 a0Var, wh whVar, kh khVar, u uVar, rk rkVar, Mediation mediation, v vVar, ae aeVar, u2 u2Var, List list, CoroutineDispatcher coroutineDispatcher, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r5, r6, rcVar, r8, r9, qfVar, a0Var, whVar, khVar, uVar, rkVar, mediation, r17, aeVar, u2Var, r20, r1, (i & 262144) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.gl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gl.a(CoroutineDispatcher.this);
            }
        } : function0);
        String str2 = (i & 2) != 0 ? null : str;
        URL url2 = (i & 4) != 0 ? null : url;
        v4 v4Var2 = (i & 16) != 0 ? null : v4Var;
        il b6Var = (i & 32) != 0 ? new b6() : ilVar;
        v vVar2 = (i & 8192) != 0 ? null : vVar;
        List emptyList = (65536 & i) != 0 ? CollectionsKt.emptyList() : list;
        final CoroutineDispatcher io2 = (131072 & i) != 0 ? Dispatchers.getIO() : coroutineDispatcher;
    }

    public static final boolean F() {
        return true;
    }

    @Override // com.chartboost.sdk.impl.j2
    public void D() {
        List<ii> i;
        mb.a("WebRenderable starting: auctionId=" + u().c() + ", placementType=" + this.q, (Throwable) null, 2, (Object) null);
        wk b2 = b();
        if (b2 != null) {
            b2.c();
        }
        vc vcVar = this.B;
        if (vcVar != null) {
            vcVar.a();
        }
        WebView webView = this.z;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.z;
        if (webView2 != null) {
            webView2.evaluateJavascript("window?.chartboost?.onShow?.();", null);
        }
        WebView webView3 = this.z;
        if (webView3 != null) {
            webView3.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { if (media.paused) media.play(); });", null);
        }
        v4 v4Var = this.r;
        if (v4Var != null && (i = v4Var.i()) != null) {
            for (ii iiVar : i) {
                if (Intrinsics.areEqual(iiVar.b(), "creativeView")) {
                    dj.f4736a.a(rj.g.b, new sj(null, iiVar, this.n, this.v, this.w, null, null, null, null, null, null, null, null, null, 16353, null));
                }
            }
        }
        super.D();
    }

    public final void E() {
        if (this.E.compareAndSet(false, true)) {
            for (ii iiVar : this.x) {
                dj.f4736a.a(rj.h.b, new sj(null, ii.a(iiVar, null, null, 0, null, MapsKt.plus(iiVar.c(), TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION))), 0L, 47, null), this.n, this.v, this.w, null, null, null, null, null, null, null, null, null, 16353, null));
            }
        }
    }

    public final Function0 G() {
        return this.y;
    }

    @Override // com.chartboost.sdk.impl.pf
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public WebView o() {
        WebView webView = this.z;
        if (webView == null) {
            return null;
        }
        a((View) webView);
        return webView;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void q() {
        vc vcVar = this.B;
        if (vcVar != null) {
            vcVar.pause();
        }
        WebView webView = this.z;
        if (webView != null) {
            webView.onPause();
        }
        mb.a("WebRenderable paused.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.pf
    public void r() {
        WebView webView = this.z;
        if (webView != null) {
            webView.onResume();
        }
        vc vcVar = this.B;
        if (vcVar != null) {
            vcVar.a();
        }
        WebView webView2 = this.z;
        if (webView2 != null) {
            webView2.postDelayed(new Runnable() { // from class: com.chartboost.sdk.impl.gl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    gl.m(gl.this);
                }
            }, 100L);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void s() {
        wk b2 = b();
        if (b2 != null) {
            b2.a();
        }
    }

    public static final void m(gl glVar) {
        WebView webView = glVar.z;
        if (webView != null) {
            webView.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { media.muted = true;});", null);
        }
        mb.a("WebRenderable resumed.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.vk
    public wk b() {
        return this.H;
    }

    public final void c(WebView webView) {
        Job launch$default;
        if (this.G.compareAndSet(false, true)) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.F, null, null, new e(webView, this, null), 3, null);
            launch$default.invokeOnCompletion(new Function1() { // from class: com.chartboost.sdk.impl.gl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gl.a(gl.this, (Throwable) obj);
                }
            });
        } else {
            mb.a("WebView destroy already scheduled; skipping duplicate request.", (Throwable) null, 2, (Object) null);
        }
    }

    public final void b(WebView webView) {
        try {
            a((View) webView);
        } catch (Exception e2) {
            FrameLayout frameLayout = this.A;
            mb.b("WebRenderable temp container cleanup failed during cancellation: hasParent=" + ((frameLayout != null ? frameLayout.getParent() : null) != null), e2);
        }
        wk b2 = b();
        if (b2 != null) {
            b2.b();
        }
        vc vcVar = this.B;
        if (vcVar != null) {
            vcVar.a(gh.h);
        }
        vc vcVar2 = this.B;
        if (vcVar2 != null) {
            vcVar2.a((wc) null);
        }
        this.B = null;
        this.z = null;
        if (webView != null) {
            c(webView);
        }
    }

    public static final yi a(CoroutineDispatcher coroutineDispatcher) {
        return new yi(new xi(null, null, 3, null), null, null, null, coroutineDispatcher, 14, null);
    }

    public final void a(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.y = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.chartboost.sdk.impl.pf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    d dVar = new d(context, null);
                    cVar.d = 1;
                    obj = BuildersKt.withContext(main, dVar, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // com.chartboost.sdk.impl.j2
    public void a(gh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        mb.a("WebRenderable stopping: auctionId=" + u().c() + ", reason=" + reason + ", placementType=" + this.q, (Throwable) null, 2, (Object) null);
        wk b2 = b();
        if (b2 != null) {
            b2.b();
        }
        vc vcVar = this.B;
        if (vcVar != null) {
            vcVar.a(reason);
        }
        vc vcVar2 = this.B;
        if (vcVar2 != null) {
            vcVar2.a((wc) null);
        }
        this.B = null;
        a((View) this.z);
        WebView webView = this.z;
        if (webView != null) {
            this.z = null;
            c(webView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(Context context, String str, URL url, rc placementType, v4 v4Var, il webViewFactory, qf renderableConfig, a0 adMarkupConfig, wh trackerComponent, kh telemetryManager, u adFormat, rk viewabilityComponent, Mediation mediation, v vVar, ae openMeasurementManager, u2 cbIdentity, List vastErrorTrackingEvents, CoroutineDispatcher ioDispatcher, Function0 urlResolverFactory) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation, ioDispatcher, urlResolverFactory);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        Intrinsics.checkNotNullParameter(vastErrorTrackingEvents, "vastErrorTrackingEvents");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(urlResolverFactory, "urlResolverFactory");
        this.n = context;
        this.o = str;
        this.p = url;
        this.q = placementType;
        this.r = v4Var;
        this.s = webViewFactory;
        this.t = viewabilityComponent;
        this.u = vVar;
        this.v = openMeasurementManager;
        this.w = cbIdentity;
        this.x = vastErrorTrackingEvents;
        this.y = new Function0() { // from class: com.chartboost.sdk.impl.gl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(gl.F());
            }
        };
        this.E = new AtomicBoolean(false);
        this.F = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.G = new AtomicBoolean(false);
        if (str == null && url == null) {
            throw new ChartboostError.Load.InvalidAdm("WebRenderable requires either HTML or URL to be provided", new IllegalArgumentException("Missing content"));
        }
    }

    @Override // com.chartboost.sdk.impl.wc
    public void b(ke request) {
        Intrinsics.checkNotNullParameter(request, "request");
        tf n = n();
        if (n != null) {
            n.a(request);
        }
    }

    public static final void b(gl glVar, FrameLayout frameLayout, View view) {
        if (view != null) {
            try {
                try {
                    if (frameLayout.indexOfChild(view) != -1) {
                        frameLayout.removeView(view);
                    }
                } catch (Exception e2) {
                    boolean z = true;
                    boolean z2 = view != null;
                    if (frameLayout.getParent() == null) {
                        z = false;
                    }
                    mb.b("WebRenderable temp container cleanup error: hasAdView=" + z2 + ", containerHasParent=" + z, e2);
                    if (glVar.A == frameLayout) {
                        glVar.A = null;
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (glVar.A == frameLayout) {
                    glVar.A = null;
                }
                throw th;
            }
        }
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
        mb.a("WebRenderable cleaned up temp container successfully", (Throwable) null, 2, (Object) null);
        if (glVar.A == frameLayout) {
            glVar.A = null;
        }
    }

    public static final Unit a(gl glVar, Throwable th) {
        CoroutineScopeKt.cancel$default(glVar.F, "WebView destroy complete", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WebView webView, Continuation continuation) {
        f fVar;
        int i;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.e = i2 - Integer.MIN_VALUE;
                Object obj = fVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    fVar.b = webView;
                    fVar.e = 1;
                    if (DelayKt.delay(1100L, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webView = (WebView) fVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                webView.onPause();
                webView.stopLoading();
                webView.destroy();
                return Unit.INSTANCE;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fVar.e;
        if (i != 0) {
        }
        webView.onPause();
        webView.stopLoading();
        webView.destroy();
        return Unit.INSTANCE;
    }

    public final void a(View view) {
        FrameLayout frameLayout = this.A;
        if (frameLayout == null) {
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            BuildersKt__Builders_commonKt.launch$default(this.F, null, null, new b(frameLayout, view, this, null), 3, null);
        } else {
            b(this, frameLayout, view);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public float a(boolean z) {
        super.a(z);
        String format = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        WebView webView = this.z;
        if (webView == null) {
            return 0.0f;
        }
        webView.evaluateJavascript(format, null);
        return 0.0f;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(float f2, boolean z) {
        super.a(f2, z);
        String format = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.FALSE}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        WebView webView = this.z;
        if (webView != null) {
            webView.evaluateJavascript(format, null);
        }
    }

    @Override // com.chartboost.sdk.impl.wc
    public void a(String str, jl reason, boolean z) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        a(str, z);
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(boolean z, Integer num, Integer num2, e4 e4Var) {
        v4 v4Var = this.r;
        if (v4Var != null) {
            mb.a("Ignoring container-forwarded companion tap; onOpenUrl handles web companion clickthrough. [HB-11452]", (Throwable) null, 2, (Object) null);
        } else {
            a(v4Var != null ? v4Var.b() : null, z, e4Var);
        }
    }

    @Override // com.chartboost.sdk.impl.j2
    public void a(String str, boolean z) {
        a(str, z, (e4) null);
    }

    public final void a(String str, boolean z, e4 e4Var) {
        List emptyList;
        tf n;
        v4 v4Var = this.r;
        if (v4Var != null) {
            String b2 = v4Var.b();
            ob a2 = rb.a(this.n, this.v, this.w, new Function1() { // from class: com.chartboost.sdk.impl.gl$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gl.a(gl.this, (pb) obj);
                }
            });
            List c2 = this.r.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c2, 10));
            Iterator it = c2.iterator();
            while (it.hasNext()) {
                arrayList.add(rb.a((String) it.next(), a2));
            }
            if (e4Var == null || (emptyList = e4Var.b()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            e4.c cVar = new e4.c(CollectionsKt.plus((Collection) emptyList, (Iterable) arrayList), b2);
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            a(b2, z, cVar, uuid);
            if (!v().a(cVar, z, uuid) || (n = n()) == null) {
                return;
            }
            n.f();
            return;
        }
        super.a(str, z);
    }

    public static final Unit a(gl glVar, pb macroContext) {
        Intrinsics.checkNotNullParameter(macroContext, "$this$macroContext");
        macroContext.a(glVar.t());
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.wc
    public void a(ll reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        mb.a("WebView stopped for " + reason, (Throwable) null, 2, (Object) null);
        if (reason == ll.b) {
            ChartboostError.Render.WebViewMraidUnload webViewMraidUnload = ChartboostError.Render.WebViewMraidUnload.INSTANCE;
            mb.b("WebView stopped due to MRAID unload", webViewMraidUnload);
            a(webViewMraidUnload);
            b(gh.i);
            tf n = n();
            if (n != null) {
                n.onError(webViewMraidUnload);
            }
        }
    }

    public final void a(WebView webView) {
        sk a2 = this.t.a();
        if (a2.c()) {
            this.H = this.t.b().a(a2, webView);
        }
    }
}
