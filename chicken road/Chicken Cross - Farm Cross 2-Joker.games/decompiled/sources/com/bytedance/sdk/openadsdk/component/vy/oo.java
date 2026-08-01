package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;

/* loaded from: classes4.dex */
public class oo extends gm {
    private final com.bytedance.sdk.openadsdk.core.wh.oo dax;
    private final dax gbb;
    private final com.bytedance.sdk.openadsdk.core.wh.gm hc;
    private final com.bytedance.sdk.openadsdk.core.wh.kj jr;
    private final com.bytedance.sdk.openadsdk.core.wh.vj nac;

    public oo(Context context, of ofVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int sf = rj.sf(context, 8.0f);
        int sf2 = rj.sf(context, 9.0f);
        int sf3 = rj.sf(context, 10.0f);
        int sf4 = rj.sf(context, 40.0f);
        this.tmg = new com.bytedance.sdk.openadsdk.core.widget.gm(context);
        this.tmg.setPadding(sf2, 0, sf2, 0);
        this.tmg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(rj.sf(context, 32.0f), rj.sf(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, sf3, sf3);
        this.tmg.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        this.hc = gmVar;
        gmVar.setBackgroundColor(-1);
        gmVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, rj.sf(context, 107.0f));
        layoutParams2.addRule(12);
        gmVar.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(0);
        vjVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        vjVar.setLayoutParams(layoutParams3);
        gmVar.addView(vjVar);
        this.wh = new nac(context);
        this.wh.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(sf4, sf4);
        layoutParams4.rightMargin = sf;
        layoutParams4.setMarginEnd(sf);
        this.wh.setLayoutParams(layoutParams4);
        this.qf = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.qf.setId(520093761);
        this.qf.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.qf.setEllipsize(TextUtils.TruncateAt.END);
        this.qf.setMaxLines(2);
        this.qf.setTextColor(Color.parseColor("#161823"));
        this.qf.setTextSize(30.0f);
        vjVar.addView(this.wh);
        vjVar.addView(this.qf);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, gmVar.getId());
        layoutParams5.addRule(10);
        gmVar2.setLayoutParams(layoutParams5);
        this.pcc = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        this.pcc.setId(520093754);
        this.pcc.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gmVar2.addView(this.pcc, new FrameLayout.LayoutParams(-1, -1));
        this.sf = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        this.sf.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        gmVar2.addView(this.sf, layoutParams6);
        this.gm = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        this.gm.setId(520093756);
        gmVar2.addView(this.gm, new FrameLayout.LayoutParams(-1, -1));
        this.vj = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vj.setId(520093717);
        this.vj.setBackground(vh.pcc(context, Color.parseColor("#b3000000"), 24));
        this.vj.setEllipsize(TextUtils.TruncateAt.END);
        this.vj.setGravity(17);
        this.vj.setSingleLine(true);
        this.vj.setText(tz.pcc(context, "tt_video_download_apk"));
        this.vj.setTextColor(-1);
        this.vj.setTextSize(1, 16.0f);
        this.vj.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(rj.sf(context, 236.0f), rj.sf(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = rj.sf(context, 32.0f);
        gmVar2.addView(this.vj, layoutParams7);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        this.nac = vjVar2;
        vjVar2.setOrientation(0);
        vjVar2.setGravity(16);
        vjVar2.setBackground(new pcc(context));
        vjVar2.setPadding(rj.sf(context, 16.0f), rj.sf(context, 8.0f), rj.sf(context, 16.0f), rj.sf(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = rj.sf(context, 90.0f);
        vjVar2.setLayoutParams(layoutParams8);
        nac nacVar = new nac(context);
        this.dax = nacVar;
        vjVar2.addView(nacVar, new LinearLayout.LayoutParams(rj.sf(context, 36.0f), rj.sf(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = rj.sf(context, 8.0f);
        vjVar2.addView(vjVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.jr = kjVar;
        kjVar.setTextColor(-1);
        vjVar3.addView(kjVar, new LinearLayout.LayoutParams(-2, -2));
        dax daxVar = new dax(context, true);
        this.gbb = daxVar;
        vjVar3.addView(daxVar, new LinearLayout.LayoutParams(-2, -2));
        this.oo = PAGLogoView.createPAGLogoViewByMaterial(context, ofVar);
        this.oo.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, rj.sf(context, 14.0f));
        layoutParams10.gravity = 83;
        gmVar2.addView(this.oo, layoutParams10);
        addView(gmVar2);
        addView(this.tmg);
        addView(gmVar);
        addView(this.kj);
        addView(vjVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public View getUserInfo() {
        return this.hc;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.kj getAdTitleTextView() {
        return this.jr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.oo getAdIconView() {
        return this.dax;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public dax getScoreBar() {
        return this.gbb;
    }

    private static final class pcc extends Drawable {
        private static final int vj = Color.parseColor("#b0000000");
        private static final int wh = Color.parseColor("#40000000");
        private final boolean oo;
        private final RectF pcc = new RectF();
        private final Paint sf = new Paint();
        private final Path gm = new Path();

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public pcc(Context context) {
            this.oo = com.bytedance.sdk.component.adexpress.oo.sf.pcc(context);
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.pcc.set(rect);
            this.gm.reset();
            int height = rect.height() / 2;
            Path path = this.gm;
            RectF rectF = this.pcc;
            if (this.oo) {
                float f = height;
                fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
            } else {
                float f2 = height;
                fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f3 = rect.right;
            boolean z = this.oo;
            this.sf.setShader(new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{z ? wh : vj, z ? vj : wh}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.gm, this.sf);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.vj getOverlayLayout() {
        return this.nac;
    }
}
