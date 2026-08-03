package com.fyber.inneractive.sdk.flow.nativead.trackers;

/* loaded from: classes3.dex */
public final class b extends android.webkit.WebViewClient implements android.os.Handler.Callback {
    public static final java.lang.String e = com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.flow.nativead.trackers.b.class);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f3727a;
    public com.fyber.inneractive.sdk.flow.nativead.trackers.c b;
    public com.fyber.inneractive.sdk.web.m c;
    public android.os.Handler d = new android.os.Handler(android.os.Looper.getMainLooper(), this);

    public b(java.util.ArrayList arrayList, com.fyber.inneractive.sdk.flow.nativead.trackers.c cVar) {
        this.f3727a = new java.util.concurrent.ConcurrentLinkedQueue(arrayList);
        this.b = cVar;
        com.fyber.inneractive.sdk.web.m mVar = new com.fyber.inneractive.sdk.web.m();
        mVar.setWebViewClient(this);
        mVar.setVisibility(8);
        mVar.getSettings().setJavaScriptEnabled(true);
        this.c = mVar;
    }

    public final void a() {
        java.lang.String str;
        android.os.Handler handler = this.d;
        if (handler != null) {
            handler.removeMessages(13);
        }
        if (this.f3727a.isEmpty() || this.d == null || this.c == null || (str = (java.lang.String) this.f3727a.poll()) == null) {
            android.os.Handler handler2 = this.d;
            if (handler2 != null) {
                handler2.sendEmptyMessage(12);
                return;
            }
            return;
        }
        if (this.d != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 14;
            obtain.obj = str;
            this.d.sendMessage(obtain);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        return true;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 12:
                com.fyber.inneractive.sdk.flow.nativead.trackers.c cVar = this.b;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 13:
                java.lang.Object obj = message.obj;
                com.fyber.inneractive.sdk.util.IAlog.b("%sTimeout reached for tracker: %s", e, obj != null ? obj.toString() : "unknown");
                a();
                break;
            case 14:
                java.lang.Object obj2 = message.obj;
                if (obj2 != null) {
                    java.lang.String str = e;
                    com.fyber.inneractive.sdk.util.IAlog.a("%sLoading tracker %s", str, obj2);
                    java.lang.String obj3 = message.obj.toString();
                    android.os.Handler handler = this.d;
                    if (handler != null && this.c != null) {
                        if (handler != null) {
                            android.os.Message obtain = android.os.Message.obtain();
                            obtain.what = 13;
                            obtain.obj = obj3;
                            this.d.sendMessageDelayed(obtain, 5000L);
                        }
                        this.c.loadDataWithBaseURL(null, obj3, "text/html", "UTF-8", null);
                        break;
                    } else {
                        com.fyber.inneractive.sdk.util.IAlog.b("%sWas destroyed. Unable to load JS tracker %s", str, obj3);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.fyber.inneractive.sdk.network.z.a("WebViewRendererProcessGone", "Encountered WebViewRendererProcessGone while executing native JS tracking", null, null);
        android.os.Handler handler = this.d;
        if (handler == null) {
            return true;
        }
        handler.sendEmptyMessage(12);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !str.contains("iaadfinishedloading")) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sTracker finished", e);
        a();
        return true;
    }
}
