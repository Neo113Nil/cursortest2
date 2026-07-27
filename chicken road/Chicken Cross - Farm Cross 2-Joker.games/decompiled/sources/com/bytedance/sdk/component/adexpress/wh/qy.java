package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class qy extends LinearLayout {
    private TextView gm;
    private pcc oo;
    private TextView pcc;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.ork qf;
    private com.bytedance.sdk.component.utils.yt sf;
    private LinearLayout vj;
    private com.bytedance.adsdk.sf.wh wh;

    public interface pcc {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public qy(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.oo.ork orkVar) {
        super(context);
        this.qf = orkVar;
        pcc(context, view);
    }

    private void pcc(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.vj = (LinearLayout) findViewById(2097610722);
        this.pcc = (TextView) findViewById(2097610719);
        this.gm = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.sf.wh whVar = (com.bytedance.adsdk.sf.wh) findViewById(2097610706);
        this.wh = whVar;
        whVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.wh.setImageAssetsFolder("images/");
        this.wh.pcc(true);
    }

    public void setShakeText(String str) {
        this.gm.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.vj;
    }

    public View getWriggleProgressIv() {
        return this.wh;
    }

    public TextView getTopTextView() {
        return this.pcc;
    }

    public void setOnShakeViewListener(pcc pccVar) {
        this.oo = pccVar;
    }

    public void pcc() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.qy.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    qy.this.wh.pcc();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.sf == null) {
                this.sf = new com.bytedance.sdk.component.utils.yt(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.wh.qy.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.oo.ork orkVar = this.qf;
            if (orkVar != null) {
                orkVar.gm();
                this.qf.vj();
                this.qf.wh();
                this.qf.kj();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.sf.wh whVar = this.wh;
            if (whVar != null) {
                whVar.vj();
            }
        } catch (Exception unused) {
        }
    }
}
