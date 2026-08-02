package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class r0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public financial.atomic.muppet.inter.Page f6795a;
    public financial.atomic.muppet.Page b;
    public int c;
    public final /* synthetic */ financial.atomic.muppet.Page d;
    public final /* synthetic */ android.os.Message e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(financial.atomic.muppet.Page page, android.os.Message message, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = page;
        this.e = message;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.r0(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.r0(this.d, this.e, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.muppet.inter.Browser browser;
        financial.atomic.muppet.Page page;
        financial.atomic.muppet.inter.Page page2;
        financial.atomic.muppet.inter.Page page3;
        android.webkit.WebView.WebViewTransport webViewTransport;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            browser = this.d.getBrowser();
            this.c = 1;
            obj = browser.newPage(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    page3 = this.f6795a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    financial.atomic.muppet.Page page4 = (financial.atomic.muppet.Page) page3;
                    page4.once(financial.atomic.muppet.impl.Page.Event.hostblocked, new financial.atomic.muppet.j(page3, null));
                    page4.once(financial.atomic.muppet.impl.Page.Event.started, new financial.atomic.muppet.k(this.d, page3, null));
                    webViewTransport = (android.webkit.WebView.WebViewTransport) this.e.obj;
                    if (webViewTransport != null) {
                        webViewTransport.setWebView(page4.view());
                    }
                    this.e.sendToTarget();
                    return kotlin.Unit.INSTANCE;
                }
                page = this.b;
                page2 = this.f6795a;
                kotlin.ResultKt.throwOnFailure(obj);
                this.f6795a = page2;
                this.b = null;
                this.c = 3;
                if (page.setUserAgent((java.lang.String) obj, this) != coroutine_suspended) {
                    page3 = page2;
                    financial.atomic.muppet.Page page42 = (financial.atomic.muppet.Page) page3;
                    page42.once(financial.atomic.muppet.impl.Page.Event.hostblocked, new financial.atomic.muppet.j(page3, null));
                    page42.once(financial.atomic.muppet.impl.Page.Event.started, new financial.atomic.muppet.k(this.d, page3, null));
                    webViewTransport = (android.webkit.WebView.WebViewTransport) this.e.obj;
                    if (webViewTransport != null) {
                    }
                    this.e.sendToTarget();
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        financial.atomic.muppet.inter.Page page5 = (financial.atomic.muppet.inter.Page) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNull(page5, "");
        page = (financial.atomic.muppet.Page) page5;
        page.set_parent(this.d);
        financial.atomic.muppet.Page page6 = this.d;
        this.f6795a = page5;
        this.b = page;
        this.c = 2;
        java.lang.Object userAgent = page6.userAgent(this);
        if (userAgent != coroutine_suspended) {
            page2 = page5;
            obj = userAgent;
            this.f6795a = page2;
            this.b = null;
            this.c = 3;
            if (page.setUserAgent((java.lang.String) obj, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
