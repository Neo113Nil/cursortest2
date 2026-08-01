package com.bytedance.sdk.component.vy;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.atb;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.vy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc extends gm implements tsz.pcc {
    private boolean dax;
    private final int gm;
    private String gpj;
    private int hc;
    private volatile float kj;
    private View.OnTouchListener lo;
    private float lu;
    private float nac;
    private final List<Integer> oo;
    private volatile float qf;
    private final int sf;
    private long tmg;
    private long vh;
    private final int vj;
    private final Context wh;
    private float vy = -1.0f;
    private float ork = -1.0f;
    private final Handler jr = new tsz(vy.pcc().getLooper(), this);
    InterfaceC0133pcc pcc = new InterfaceC0133pcc() { // from class: com.bytedance.sdk.component.vy.pcc.1
        @Override // com.bytedance.sdk.component.vy.pcc.InterfaceC0133pcc
        public void pcc() {
            if (pcc.this.vy == -1.0f && pcc.this.ork == -1.0f && pcc.this.tmg == -1) {
                new Object[]{"first trigger triggerJump()", ", mTriggerX: ", Float.valueOf(pcc.this.vy), ", mTriggerY: ", Float.valueOf(pcc.this.ork)};
                pcc pccVar = pcc.this;
                pccVar.vy = pccVar.qf;
                pcc pccVar2 = pcc.this;
                pccVar2.ork = pccVar2.kj;
                pcc pccVar3 = pcc.this;
                pccVar3.tmg = pccVar3.vh;
                pcc.this.dax = true;
            }
            new Object[]{"everytime trigger triggerJump()", ", mTriggerX: ", Float.valueOf(pcc.this.vy), ", mTriggerY: ", Float.valueOf(pcc.this.ork)};
        }

        @Override // com.bytedance.sdk.component.vy.pcc.InterfaceC0133pcc
        public void pcc(int i) {
            pcc.this.hc = i;
            pcc.this.sf();
        }
    };
    private int fum = -1;
    private final List<Integer> gbb = new ArrayList();

    /* renamed from: com.bytedance.sdk.component.vy.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0133pcc {
        void pcc();

        void pcc(int i);
    }

    public pcc(Context context, int i, int i2, List<Integer> list, int i3) {
        this.wh = context;
        if (i == -1) {
            this.sf = atb.pcc(context);
        } else {
            this.sf = atb.pcc(context, i);
        }
        this.gm = atb.pcc(context, i2);
        this.oo = list;
        this.vj = i3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        new Object[]{"action: ", Integer.valueOf(action), ", x: ", Float.valueOf(motionEvent.getX()), ",y: ", Float.valueOf(motionEvent.getY())};
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.vh = SystemClock.elapsedRealtime();
        this.qf = x;
        this.kj = y;
        if (action == 0) {
            this.nac = x;
            this.lu = y;
            new Object[]{"ACTION_DOWN: ", "downX: ", Float.valueOf(x), "downY: ", Float.valueOf(this.lu)};
        } else if (action == 1) {
            new Object[]{"ACTION_UP: ", "upX: ", Float.valueOf(x), "upY: ", Float.valueOf(y)};
            if (pcc(x, y, this.nac, this.lu, this.wh)) {
                int pcc = pcc(this.qf, this.kj, this.vh);
                boolean contains = this.gbb.contains(Integer.valueOf(this.hc));
                pcc(view, motionEvent, pcc, !contains);
                if (!contains) {
                    this.gbb.add(Integer.valueOf(this.hc));
                }
                if (pcc == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = this.lo;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.vy.gm
    public void pcc(View.OnTouchListener onTouchListener) {
        this.lo = onTouchListener;
    }

    public InterfaceC0133pcc pcc() {
        return this.pcc;
    }

    private void pcc(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i2 = 1;
        if (i != 0) {
            i2 = 0;
        }
        jSONObject.put("is_interceptor", i2);
        jSONObject.put("is_first_click", z ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.hc);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.jr.sendMessageDelayed(obtain, 200L);
    }

    public void pcc(String str) {
        this.gpj = str;
    }

    private int pcc(float f, float f2, long j) {
        if (this.vy == -1.0f && this.ork == -1.0f && this.tmg == -1) {
            return 1;
        }
        new Object[]{"mInterceptorPageList: ", this.oo, "mPageIndex:", Integer.valueOf(this.hc)};
        if (!this.oo.contains(Integer.valueOf(this.hc))) {
            return 2;
        }
        if (j - this.tmg > this.vj) {
            sf();
            return 3;
        }
        float abs = Math.abs(f - this.vy);
        float abs2 = Math.abs(f2 - this.ork);
        new Object[]{"mTouchX: ", Float.valueOf(f), ", mTriggerX : ", Float.valueOf(this.vy), " ,x distance：", Float.valueOf(abs)};
        new Object[]{"mTouchY: ", Float.valueOf(f2), ", mTriggerY: ", Float.valueOf(this.ork), " ,y distance：", Float.valueOf(abs2)};
        new Object[]{"mInterceptorXPx: ", Integer.valueOf(this.sf), ", mInterceptorYPx: ", Integer.valueOf(this.gm)};
        if (abs <= this.sf / 2.0f && abs2 <= this.gm / 2.0f) {
            return 0;
        }
        sf();
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        this.vy = -1.0f;
        this.ork = -1.0f;
        this.tmg = -1L;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.dax ? 1 : 0);
                    this.dax = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf() != null) {
                com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf().pcc(this.gpj, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
