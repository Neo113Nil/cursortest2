package sg.bigo.ads.D1;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.Wf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.P.x;
import sg.bigo.ads.R;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class k extends sg.bigo.ads.E1.f implements sg.bigo.ads.R.a {
    public final int h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final sg.bigo.ads.U.j m;
    public final AtomicBoolean n;
    public sg.bigo.ads.C1.c o;
    public j p;
    public final g q;
    public final x r;
    public final sg.bigo.ads.O0.b s;
    public final AtomicBoolean t;
    public boolean u;

    public k(Context context, String str, int i, int i2, int i3, String str2, int i4, x xVar) {
        super(context);
        this.m = new sg.bigo.ads.U.j();
        this.t = new AtomicBoolean(false);
        this.u = true;
        this.k = i;
        this.l = i2;
        this.h = i3;
        this.i = str2;
        this.j = i4;
        this.r = xVar;
        this.n = new AtomicBoolean(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        this.s = new sg.bigo.ads.O0.b(getContext());
        setOnTouchListener(new c(this));
        setWebViewClient(new e(this, str));
        setWebChromeClient(new f());
        AbstractC5446j.a(this.q);
        if (this.q == null) {
            this.q = new g(this);
        }
        AbstractC5446j.a(3, null, this.q, 15000L);
        loadDataWithBaseURL("http://127.0.0.1/", "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>VPAID AD</title>\n    <script>\n        window.onload = function() {\n            tryToPrepareAd();\n        }\n\n        document.onreadystatechange = function() {\n            tryToPrepareAd();\n        }\n\n        function tryToPrepareAd() {\n            if (document.readyState != \"complete\") {\n                return;\n            }\n\n            if (window.vpaidwrapper && window.vpaidwrapper.isVPAIDCreativeReady()) {\n                return;\n            }\n\n            window.vpaidframe = document.getElementById(\"vpaid-iframe\");\n            if (window.vpaidframe) {\n                var fn = window.vpaidframe.contentWindow['getVPAIDAd'];\n                var vpaidDiv = document.getElementById(\"vpaid-container\");\n                var vpaidframeDoc = window.vpaidframe.contentDocument || window.vpaidframe.contentWindow.document;\n                var slot = vpaidframeDoc.getElementById(\"slot\");\n                var videoSlot = document.getElementById(\"video-slot\");\n                var vpaidwrapper;\n                if (fn && typeof fn == 'function') {\n                    vpaidwrapper = new VPAIDWrapper(fn(), vpaidDiv, slot, videoSlot)\n                } else {\n                    vpaidwrapper = new VPAIDWrapper();\n                }\n                window.vpaidwrapper = vpaidwrapper;\n            }\n        }\n    </script>\n    <script src=\"vpaid.js\" type=\"text/javascript\"></script>\n</head>\n\n<body style=\"display: flex; justify-content: center; align-items: center;\">\n<div id=\"ad-container\">\n    <video height=\"100%\" id=\"video-slot\" muted playsinline width=\"100%\"></video>\n</div>\n<div id=\"vpaid-container\"\n     style=\"position: absolute; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none;\">\n    <iframe frameborder=\"0\" height=\"100%\" id=\"vpaid-iframe\" marginheight=\"0\" marginwidth=\"0\"\n            scrolling=\"no\"\n            src=\"vpaid_iframe.html\"\n            style=\"margin: 0px; padding: 0px; border: none;\"\n            width=\"100%\"></iframe>\n</div>\n</body>\n</html>", "text/html", "UTF-8", null);
        setLayoutParams((i4 == 1 || i4 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    public final String a(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String[] strArr = new String[1];
        evaluateJavascript(str, new h(countDownLatch, strArr));
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        return strArr[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(String str) {
        char c;
        sg.bigo.ads.O0.b bVar;
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return;
            }
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (host == null) {
                return;
            }
            if (!"vpaid".equals(scheme) && (bVar = this.s) != null && bVar.f12474a.f12473a) {
                if (this.o == null || !this.t.compareAndSet(false, true)) {
                    return;
                }
                x xVar = this.r;
                xVar.g = str;
                xVar.i = "";
                xVar.h = false;
                ((sg.bigo.ads.r1.h) this.o).a(str, false);
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str2 : parse.getQueryParameterNames()) {
                hashMap.put(str2, TextUtils.join(",", parse.getQueryParameters(str2)));
            }
            host.hashCode();
            switch (host.hashCode()) {
                case -1633535831:
                    if (host.equals("onAdVideoStart")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354015358:
                    if (host.equals("onAdLog")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1347047775:
                    if (host.equals("onAdVideoMidpoint")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1160015669:
                    if (host.equals("onAdExpandedChange")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -742226534:
                    if (host.equals("onAdVideoFirstQuartile")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -609164954:
                    if (host.equals("onAdDurationChange")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -560906938:
                    if (host.equals("onStartAd")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -307657838:
                    if (host.equals("onAdVideoComplete")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -164095715:
                    if (host.equals("onAdClickThru")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 98253676:
                    if (host.equals("onAdPlaying")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 116028939:
                    if (host.equals("onAdImpression")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 159970502:
                    if (host.equals("onAdError")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 590531255:
                    if (host.equals("onAdLinearChange")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 652779159:
                    if (host.equals("VPAIDCreativeError")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 861234439:
                    if (host.equals(Wf.j)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 963431984:
                    if (host.equals("onAdPaused")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1497850049:
                    if (host.equals("onSkipAd")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1506340484:
                    if (host.equals("onStopAd")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1648218545:
                    if (host.equals("onAdRemainingTimeChange")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1654690129:
                    if (host.equals("onAdVideoThirdQuartile")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 1697251091:
                    if (host.equals("onAdSizeChange")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 1701669456:
                    if (host.equals("onAdInteraction")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 2014353132:
                    if (host.equals("onAdVolumeChange")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 2114403499:
                    if (host.equals("onAdUserClose")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.r.a(3);
                    sg.bigo.ads.C1.c cVar = this.o;
                    if (cVar != null) {
                        ((sg.bigo.ads.r1.h) cVar).f13274a.a("AdVideoStart", null, null);
                        break;
                    }
                    break;
                case 1:
                    if (this.o != null) {
                        break;
                    }
                    break;
                case 2:
                    sg.bigo.ads.C1.c cVar2 = this.o;
                    if (cVar2 != null) {
                        ((sg.bigo.ads.r1.h) cVar2).f13274a.a("AdVideoMidpoint", null, null);
                        break;
                    }
                    break;
                case 3:
                    if (this.o != null) {
                        sg.bigo.ads.C1.b.a((String) hashMap.get("expanded"));
                        break;
                    }
                    break;
                case 4:
                    sg.bigo.ads.C1.c cVar3 = this.o;
                    if (cVar3 != null) {
                        ((sg.bigo.ads.r1.h) cVar3).f13274a.a("AdVideoFirstQuartile", null, null);
                        break;
                    }
                    break;
                case 5:
                    sg.bigo.ads.C1.c cVar4 = this.o;
                    if (cVar4 != null) {
                        sg.bigo.ads.C1.b.b((String) hashMap.get(IronSourceConstants.EVENTS_DURATION));
                        ((sg.bigo.ads.r1.h) cVar4).f13274a.getClass();
                        break;
                    }
                    break;
                case 6:
                    sg.bigo.ads.C1.c cVar5 = this.o;
                    if (cVar5 != null) {
                        sg.bigo.ads.r1.j jVar = ((sg.bigo.ads.r1.h) cVar5).f13274a;
                        jVar.l = 2;
                        jVar.p = false;
                        jVar.a("AdVideoPlaying", null);
                        break;
                    }
                    break;
                case 7:
                    sg.bigo.ads.C1.c cVar6 = this.o;
                    if (cVar6 != null) {
                        sg.bigo.ads.r1.h hVar = (sg.bigo.ads.r1.h) cVar6;
                        sg.bigo.ads.r1.j jVar2 = hVar.f13274a;
                        jVar2.l = 5;
                        jVar2.p = true;
                        jVar2.setPlayOrPauseViewHidden(jVar2.c.b);
                        sg.bigo.ads.r1.j jVar3 = hVar.f13274a;
                        ImageView imageView = jVar3.g;
                        if (imageView != null) {
                            imageView.setImageDrawable(AbstractC4944a.c(jVar3.b, R.drawable.bigo_ad_ic_media_play));
                        }
                        hVar.f13274a.a(false);
                        hVar.f13274a.a("AdVideoComplete", null);
                        break;
                    }
                    break;
                case '\b':
                    x xVar2 = this.r;
                    String str3 = (String) hashMap.get("url");
                    String str4 = (String) hashMap.get("id");
                    boolean a2 = sg.bigo.ads.C1.b.a((String) hashMap.get("playerHandles"));
                    xVar2.g = str3;
                    xVar2.i = str4;
                    xVar2.h = a2;
                    if (this.o != null && this.t.compareAndSet(false, true)) {
                        sg.bigo.ads.C1.c cVar7 = this.o;
                        String str5 = (String) hashMap.get("url");
                        ((sg.bigo.ads.r1.h) cVar7).a(str5, sg.bigo.ads.C1.b.a((String) hashMap.get("playerHandles")));
                        break;
                    }
                    break;
                case '\t':
                    sg.bigo.ads.C1.c cVar8 = this.o;
                    if (cVar8 != null) {
                        sg.bigo.ads.r1.j jVar4 = ((sg.bigo.ads.r1.h) cVar8).f13274a;
                        jVar4.l = 2;
                        jVar4.a("AdVideoPlaying", null);
                        break;
                    }
                    break;
                case '\n':
                    this.r.a(4);
                    sg.bigo.ads.C1.c cVar9 = this.o;
                    if (cVar9 != null) {
                        ((sg.bigo.ads.r1.h) cVar9).f13274a.a("AdVPAIDImpression", null, null);
                        break;
                    }
                    break;
                case 11:
                    AbstractC5446j.a(this.q);
                    sg.bigo.ads.C1.c cVar10 = this.o;
                    if (cVar10 != null) {
                        ((sg.bigo.ads.r1.h) cVar10).f13274a.a("AdError", (String) hashMap.get("message"), new int[]{-1, -1});
                        break;
                    }
                    break;
                case '\f':
                    if (this.o != null) {
                        sg.bigo.ads.C1.b.a((String) hashMap.get("adLinear"));
                        break;
                    }
                    break;
                case '\r':
                    AbstractC5496a.a("VPAIDWebView", "VPAID error, command=" + ((String) hashMap.get(f.b.g)) + ", message=" + ((String) hashMap.get("msg")) + ", try to rePrepareAd.");
                    b();
                    break;
                case 14:
                    AbstractC5446j.a(this.q);
                    this.r.a(2);
                    sg.bigo.ads.C1.c cVar11 = this.o;
                    if (cVar11 != null) {
                        sg.bigo.ads.r1.h hVar2 = (sg.bigo.ads.r1.h) cVar11;
                        sg.bigo.ads.r1.j jVar5 = hVar2.f13274a;
                        jVar5.l = 1;
                        jVar5.m = true;
                        jVar5.c.getClass();
                        hVar2.f13274a.setAdVolume(1.0f);
                        sg.bigo.ads.r1.j jVar6 = hVar2.f13274a;
                        if (jVar6.j) {
                            jVar6.a(18);
                            hVar2.f13274a.setStatPrepareEventOnce(false);
                        }
                        sg.bigo.ads.r1.j jVar7 = hVar2.f13274a;
                        if (jVar7.o) {
                            jVar7.o = false;
                            jVar7.c();
                        } else if (!jVar7.i && !jVar7.p) {
                            jVar7.a(true);
                        }
                        hVar2.f13274a.a("AdLoaded", null, null);
                        break;
                    }
                    break;
                case 15:
                    sg.bigo.ads.C1.c cVar12 = this.o;
                    if (cVar12 != null) {
                        sg.bigo.ads.r1.j jVar8 = ((sg.bigo.ads.r1.h) cVar12).f13274a;
                        jVar8.l = 3;
                        jVar8.a("AdVideoPaused", null);
                        break;
                    }
                    break;
                case 16:
                    sg.bigo.ads.C1.c cVar13 = this.o;
                    if (cVar13 != null) {
                        sg.bigo.ads.r1.h hVar3 = (sg.bigo.ads.r1.h) cVar13;
                        hVar3.f13274a.a(10);
                        hVar3.f13274a.a("AdSkipped", null);
                        break;
                    }
                    break;
                case 17:
                    sg.bigo.ads.C1.c cVar14 = this.o;
                    if (cVar14 != null) {
                        sg.bigo.ads.r1.j jVar9 = ((sg.bigo.ads.r1.h) cVar14).f13274a;
                        jVar9.l = 4;
                        jVar9.a("AdStopped", null);
                        break;
                    }
                    break;
                case 18:
                    if (this.o != null) {
                        sg.bigo.ads.C1.b.b((String) hashMap.get("remaining"));
                        break;
                    }
                    break;
                case 19:
                    sg.bigo.ads.C1.c cVar15 = this.o;
                    if (cVar15 != null) {
                        ((sg.bigo.ads.r1.h) cVar15).f13274a.a("AdVideoThirdQuartile", null, null);
                        break;
                    }
                    break;
                case 20:
                    sg.bigo.ads.C1.c cVar16 = this.o;
                    if (cVar16 != null) {
                        sg.bigo.ads.C1.b.c((String) hashMap.get("w"));
                        sg.bigo.ads.C1.b.c((String) hashMap.get("h"));
                        ((sg.bigo.ads.r1.h) cVar16).f13274a.a("AdSizeChange", null);
                        break;
                    }
                    break;
                case 21:
                    if (this.o != null) {
                        break;
                    }
                    break;
                case 22:
                    sg.bigo.ads.C1.c cVar17 = this.o;
                    if (cVar17 != null) {
                        float c2 = sg.bigo.ads.C1.b.c((String) hashMap.get("volume"));
                        sg.bigo.ads.r1.h hVar4 = (sg.bigo.ads.r1.h) cVar17;
                        sg.bigo.ads.r1.j jVar10 = hVar4.f13274a;
                        boolean z = c2 <= 0.0f;
                        jVar10.n = z;
                        ImageView imageView2 = jVar10.e;
                        if (imageView2 != null) {
                            imageView2.setImageDrawable(AbstractC4944a.c(jVar10.b, z ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
                        }
                        sg.bigo.ads.r1.j jVar11 = hVar4.f13274a;
                        jVar11.a("AdVolumeChange", new int[]{jVar11.n ? 0 : 100});
                        break;
                    }
                    break;
                case 23:
                    sg.bigo.ads.C1.c cVar18 = this.o;
                    if (cVar18 != null) {
                        ((sg.bigo.ads.r1.h) cVar18).f13274a.a("AdClosed", null);
                        break;
                    }
                    break;
            }
            c("window.vpaidwrapper.nativeCallComplete(" + JSONObject.quote(host) + ")");
        } catch (Exception unused) {
        }
    }

    public final void c(String str) {
        if (this.n.get()) {
            loadUrl("javascript:" + str);
        } else {
            AbstractC5496a.a("VPAIDWebView", "Injecting Javascript into VPAID WebView error, creative no ready:\n\t" + str);
        }
    }

    @Override // sg.bigo.ads.E1.k, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebChromeClient(null);
        setWebViewClient(null);
    }

    @Override // sg.bigo.ads.E1.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.m.b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.m.f12564a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return this.u && super.dispatchTouchEvent(motionEvent);
    }

    public String getAdCompanions() {
        return a("window.vpaidwrapper.getAdCompanions()");
    }

    public int getAdDuration() {
        return (int) sg.bigo.ads.C1.b.b(a("window.vpaidwrapper.getAdDuration()"));
    }

    public boolean getAdExpanded() {
        return sg.bigo.ads.C1.b.a(a("window.vpaidwrapper.getAdExpanded()"));
    }

    public int getAdHeight() {
        return sg.bigo.ads.C1.b.c(a("window.vpaidwrapper.getAdHeight()"));
    }

    public boolean getAdIcons() {
        return sg.bigo.ads.C1.b.a(a("window.vpaidwrapper.getAdIcons()"));
    }

    public boolean getAdLinear() {
        return sg.bigo.ads.C1.b.a(a("window.vpaidwrapper.getAdLinear()"));
    }

    public int getAdRemainingTime() {
        return (int) sg.bigo.ads.C1.b.b(a("window.vpaidwrapper.getAdRemainingTime()"));
    }

    public boolean getAdSkippableState() {
        return sg.bigo.ads.C1.b.a(a("window.vpaidwrapper.getAdSkippableState()"));
    }

    public float getAdVolume() {
        return sg.bigo.ads.C1.b.b(a("window.vpaidwrapper.getAdVolume()"));
    }

    public int getAdWidth() {
        return sg.bigo.ads.C1.b.c(a("window.vpaidwrapper.getAdWidth()"));
    }

    public sg.bigo.ads.U.j getClickPoints() {
        return this.m;
    }

    public sg.bigo.ads.C1.c getVPAIDEvenListener() {
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r0 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        if (r2 < r11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        r5 = r2 / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        r7 = r11 / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r2 < r11) goto L38;
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        double d;
        double d2;
        double d3;
        double d4;
        if (this.k <= 0 || this.l <= 0) {
            AbstractC5496a.a("VPAIDWebView", "video width or height is invalidate");
            return;
        }
        AbstractC5496a.a("VPAIDWebView", "onMeasure，mVideoWidth=" + this.k + ", mVideoHeight=" + this.l);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0 || mode == 1073741824) {
            int i3 = this.j;
            if (i3 == 1 || i3 == 2 || i3 == 4) {
                double measuredWidth = getMeasuredWidth();
                double measuredHeight = getMeasuredHeight();
                int i4 = getContext().getResources().getDisplayMetrics().heightPixels;
                if (measuredWidth <= 0.0d && measuredHeight <= 0.0d) {
                    measuredWidth = this.k;
                    measuredHeight = this.l;
                } else if (measuredWidth <= 0.0d) {
                    measuredWidth = (this.k * measuredHeight) / this.l;
                } else if (measuredHeight <= 0.0d) {
                    measuredHeight = (this.l * measuredWidth) / this.k;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            d = this.k;
                            d2 = d * measuredHeight;
                            d3 = this.l;
                            d4 = measuredWidth * d3;
                        }
                    }
                    d = this.k;
                    d2 = d * measuredHeight;
                    d3 = this.l;
                    d4 = measuredWidth * d3;
                }
                a((int) measuredWidth, (int) measuredHeight);
            } else {
                a(size, (int) (((this.l * 1.0f) * size) / this.k));
            }
            super.onMeasure(i, i2);
        }
    }

    public void setAdVolume(float f) {
        c("window.vpaidwrapper.setAdVolume(" + f + ")");
    }

    public void setOnRenderProcessGoneListener(j jVar) {
        this.p = jVar;
    }

    public void setVPAIDClickable(boolean z) {
        this.u = z;
    }

    public void setVPAIDEvenListener(sg.bigo.ads.C1.c cVar) {
        this.o = cVar;
    }

    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC5496a.a("VPAIDWebView", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
        j jVar = this.p;
        if (jVar != null) {
            a aVar = (a) jVar;
            sg.bigo.ads.r1.i iVar = aVar.f12254a.k;
            if (iVar != null) {
                AbstractC5496a.b("VPAIDPlayView", "onVPAIDPlayerDestroy");
                sg.bigo.ads.r1.j jVar2 = iVar.f13275a;
                jVar2.m = false;
                jVar2.a(false);
                sg.bigo.ads.r1.j jVar3 = iVar.f13275a;
                if (!jVar3.p) {
                    jVar3.i = false;
                }
            }
            b bVar = aVar.f12254a;
            bVar.getClass();
            k kVar = new k(bVar.b, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h, bVar.i, bVar.l);
            kVar.setOnRenderProcessGoneListener(bVar.f12255a);
            X.a(kVar, aVar.f12254a.c, null, -1);
            kVar.setVPAIDEvenListener(aVar.f12254a.j.getVPAIDEvenListener());
            kVar.setLayoutParams(aVar.f12254a.j.getLayoutParams());
            X.c(aVar.f12254a.j);
            aVar.f12254a.j = kVar;
        }
    }

    public final void a(d dVar) {
        this.r.b(1);
        evaluateJavascript("window.vpaidwrapper.handshakeVersion('2.0')", new i(dVar));
    }

    @Override // sg.bigo.ads.R.a
    public final void a() {
        c("window.vpaidwrapper.pauseAd()");
    }

    public final void a(int i, int i2) {
        setMeasuredDimension(i, i2);
        x xVar = this.r;
        if (xVar == null || !xVar.n) {
            return;
        }
        c("window.vpaidwrapper.resizeAd(" + AbstractC4963u.b(getContext(), i) + ", " + AbstractC4963u.b(getContext(), i2) + ", " + JSONObject.quote(sg.bigo.ads.C1.d.a(this.h)) + ")");
    }

    public final void b() {
        c("tryToPrepareAd()");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.i;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.r, str);
        } catch (JSONException unused) {
        }
        this.r.b(2);
        c("window.vpaidwrapper.initAd(" + AbstractC4963u.b(getContext(), measuredWidth) + ", " + AbstractC4963u.b(getContext(), measuredHeight) + ", " + JSONObject.quote(sg.bigo.ads.C1.d.a(this.h)) + ", -1, " + jSONObject + ")");
    }
}
