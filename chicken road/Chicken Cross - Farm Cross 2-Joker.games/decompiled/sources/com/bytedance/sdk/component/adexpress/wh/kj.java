package com.bytedance.sdk.component.adexpress.wh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class kj extends fum {
    private ImageView gm;
    private ImageView oo;
    private TextView pcc;
    private ImageView sf;
    private int vj;
    private AnimatorSet wh;

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    protected void pcc(Context context) {
    }

    public kj(Context context) {
        super(context);
        this.wh = new AnimatorSet();
        sf(context);
    }

    private void sf(Context context) {
        addView(com.bytedance.sdk.component.adexpress.gm.pcc.sf(context));
        this.sf = (ImageView) findViewById(2097610751);
        this.gm = (ImageView) findViewById(2097610750);
        this.oo = (ImageView) findViewById(2097610749);
        this.pcc = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.pcc == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.pcc.setText(str);
    }

    private void oo() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(2000L);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    public float getAlphaColor() {
        return this.vj;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + 195;
        this.oo.setColorFilter(Color.rgb(i2, i2, i2), PorterDuff.Mode.SRC_IN);
        int i3 = ((i + 20) % 60) + 195;
        this.gm.setColorFilter(Color.rgb(i3, i3, i3), PorterDuff.Mode.SRC_IN);
        int i4 = ((i + 40) % 60) + 195;
        this.sf.setColorFilter(Color.rgb(i4, i4, i4), PorterDuff.Mode.SRC_IN);
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    public void pcc() {
        oo();
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    public void sf() {
        this.wh.cancel();
    }
}
