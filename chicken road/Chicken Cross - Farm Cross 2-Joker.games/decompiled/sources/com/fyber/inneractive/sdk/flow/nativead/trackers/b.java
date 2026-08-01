package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes4.dex */
public final class b extends WebViewClient implements Handler.Callback {
    public static final String e = IAlog.a(b.class);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5380a;
    public c b;
    public m c;
    public Handler d = new Handler(Looper.getMainLooper(), this);

    public b(ArrayList arrayList, c cVar) {
        this.f5380a = new ConcurrentLinkedQueue(arrayList);
        this.b = cVar;
        m mVar = new m();
        mVar.setWebViewClient(this);
        mVar.setVisibility(8);
        mVar.getSettings().setJavaScriptEnabled(true);
        this.c = mVar;
    }

    public final void a() {
        String str;
        Handler handler = this.d;
        if (handler != null) {
            handler.removeMessages(13);
        }
        if (this.f5380a.isEmpty() || this.d == null || this.c == null || (str = (String) this.f5380a.poll()) == null) {
            Handler handler2 = this.d;
            if (handler2 != null) {
                handler2.sendEmptyMessage(12);
                return;
            }
            return;
        }
        if (this.d != null) {
            Message obtain = Message.obtain();
            obtain.what = 14;
            obtain.obj = str;
            this.d.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 12:
                c cVar = this.b;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 13:
                Object obj = message.obj;
                IAlog.b("%sTimeout reached for tracker: %s", e, obj != null ? obj.toString() : "unknown");
                a();
                break;
            case 14:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    String str = e;
                    IAlog.a("%sLoading tracker %s", str, obj2);
                    String obj3 = message.obj.toString();
                    Handler handler = this.d;
                    if (handler != null && this.c != null) {
                        if (handler != null) {
                            Message obtain = Message.obtain();
                            obtain.what = 13;
                            obtain.obj = obj3;
                            this.d.sendMessageDelayed(obtain, 5000L);
                        }
                        this.c.loadDataWithBaseURL(null, obj3, "text/html", "UTF-8", null);
                        break;
                    } else {
                        IAlog.b("%sWas destroyed. Unable to load JS tracker %s", str, obj3);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Encountered WebViewRendererProcessGone while executing native JS tracking", null, null);
        Handler handler = this.d;
        if (handler == null) {
            return true;
        }
        handler.sendEmptyMessage(12);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !str.contains("iaadfinishedloading")) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        IAlog.a("%sTracker finished", e);
        a();
        return true;
    }
}
