package sg.bigo.ads.E1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.Y0.r;
import sg.bigo.ads.Y0.x;

/* loaded from: classes3.dex */
public class k extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12281a;
    public i b;
    public j c;

    public k(Context context) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMixedContentMode(0);
    }

    public static k a(Context context) {
        try {
            return new k(context);
        } catch (Exception e) {
            sg.bigo.ads.s1.b.a(3000, 10100, Log.getStackTraceString(e), (sg.bigo.ads.P.c) null);
            return null;
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f12281a) {
            return;
        }
        this.f12281a = true;
        stopLoading();
        X.c(this);
        removeAllViews();
        setWebChromeClient(null);
        setWebViewClient(null);
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.b;
        if (iVar != null) {
            sg.bigo.ads.j1.g gVar = (sg.bigo.ads.j1.g) iVar;
            gVar.onTouch(gVar.f13011a.h, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        j jVar = this.c;
        if (jVar != null) {
            r rVar = (r) jVar;
            long currentTimeMillis = System.currentTimeMillis();
            x xVar = rVar.f12644a;
            if (!xVar.d0) {
                xVar.d0 = true;
                try {
                    xVar.h0 = new JSONObject();
                    rVar.f12644a.h0.put("s_x", i);
                    rVar.f12644a.h0.put("s_y", i2);
                    rVar.f12644a.h0.put("s_ts", currentTimeMillis);
                    x xVar2 = rVar.f12644a;
                    if (xVar2.Y == null) {
                        xVar2.Y = new ArrayList();
                    }
                    xVar2.Y.add(rVar.f12644a.h0);
                } catch (Exception unused) {
                }
            }
            x xVar3 = rVar.f12644a;
            xVar3.e0 = i;
            xVar3.f0 = i2;
            xVar3.M().removeCallbacks(rVar.f12644a.k0);
            rVar.f12644a.M().postDelayed(rVar.f12644a.k0, 100L);
        }
    }

    public void setOnWebViewScrollListener(j jVar) {
        this.c = jVar;
    }

    public void setOnWebViewTouchListener(i iVar) {
        this.b = iVar;
    }
}
