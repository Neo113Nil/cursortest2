package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class vh extends FrameLayout {
    private final tmg gm;
    private final RotateAnimation oo;
    private final TextView pcc;
    private final ImageView sf;

    public vh(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.gm.pcc.oo(context));
        this.pcc = (TextView) findViewById(2097610742);
        this.sf = (ImageView) findViewById(2097610745);
        this.gm = (tmg) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.oo = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.pcc;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void pcc() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void sf() {
        this.oo.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.vh.1
            @Override // java.lang.Runnable
            public void run() {
                vh.this.sf.startAnimation(vh.this.oo);
                vh.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.vh.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        vh.this.gm.pcc(4);
                    }
                }, 100L);
                vh.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.vh.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        vh.this.gm.pcc(4);
                    }
                }, 300L);
                vh vhVar = vh.this;
                vhVar.postDelayed(vhVar.getHaloAnimation(), 1200L);
            }
        };
    }
}
