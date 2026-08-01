package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo extends com.bytedance.sdk.openadsdk.core.wh.vj {
    private TextView gm;
    private com.bytedance.sdk.openadsdk.component.reward.pcc.sf kj;
    private nac oo;
    private dax pcc;
    private boolean qf;
    private TextView sf;
    private TextView vj;
    private TextView wh;

    public oo(Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.qf) {
            return;
        }
        oo();
    }

    private void oo() {
        this.qf = true;
        of ofVar = this.kj.sf;
        int bg = ofVar.bg();
        if ((bg == 43 || bg == 44) && atb.sf(ofVar)) {
            gm();
        } else if (this.kj.zsj == 1) {
            wh();
        } else {
            vj();
        }
        if (this.sf == null) {
            this.sf = (TextView) this.kj.nn.findViewById(520093705);
        }
        TextView textView = this.sf;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oo.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((ViewGroup) oo.this.sf.getParent()).getWidth();
                    if (width > 0) {
                        oo.this.sf.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (ofVar.on()) {
                if (ofVar.ibs() != null && TextUtils.isEmpty(ofVar.ibs().wh())) {
                    rj.pcc((View) this.sf, 8);
                }
            } else {
                this.sf.setText(ofVar.pv() == 3 ? getButtonTextForNewStyleBar() : ofVar.bgf());
            }
        }
        if (this.oo != null && ofVar.zk() != null && !TextUtils.isEmpty(ofVar.zk().pcc())) {
            String pcc2 = ofVar.zk().pcc();
            if (ofVar.on()) {
                com.bytedance.sdk.openadsdk.ork.oo.pcc(ofVar.zk()).gm(1).pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, ofVar.zk().pcc(), new pcc(this.oo, ofVar, pcc2, this.kj.vj)));
                if (ofVar.ibs() != null && ofVar.ibs().sf() != null) {
                    ofVar.ibs().sf().sf(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(ofVar.zk(), this.oo, ofVar);
            }
        }
        TextView textView2 = this.vj;
        if (textView2 != null) {
            textView2.setText(ofVar.gmh());
        }
        TextView textView3 = this.wh;
        if (textView3 != null) {
            textView3.setText(pcc(ofVar));
        }
        if (this.gm != null) {
            String of = atb.of(this.kj.sf);
            if (TextUtils.isEmpty(of)) {
                of = "Play now";
            }
            this.gm.setText(of);
            this.gm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oo.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (oo.this.kj != null) {
                        com.bytedance.sdk.openadsdk.component.reward.sf.pcc(oo.this.kj);
                    }
                }
            });
        }
        dax daxVar = this.pcc;
        if (daxVar != null) {
            rj.pcc((TextView) null, daxVar, ofVar);
        }
        if (this.kj.zsj == 2 && ofVar.pv() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.sf.getLayoutParams();
            layoutParams.height = rj.sf(this.kj.kun, 55.0f);
            layoutParams.topMargin = rj.sf(this.kj.kun, 20.0f);
            this.sf.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = rj.sf(this.kj.kun, 12.0f);
            setLayoutParams(layoutParams2);
        }
        sf();
    }

    private String pcc(of ofVar) {
        if (!TextUtils.isEmpty(ofVar.gmh())) {
            return ofVar.gmh();
        }
        if (!TextUtils.isEmpty(ofVar.lc())) {
            return ofVar.lc();
        }
        return "";
    }

    private void vj() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(rj.sf(context, 16.0f), rj.sf(context, 12.0f), rj.sf(context, 16.0f), rj.sf(context, 12.0f));
        nac nacVar = new nac(context);
        this.oo = nacVar;
        nacVar.setBackgroundColor(0);
        this.oo.setId(com.bytedance.sdk.openadsdk.utils.nac.oo);
        addView(this.oo, new LinearLayout.LayoutParams(rj.sf(context, 48.0f), rj.sf(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = rj.sf(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(vjVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vj = kjVar;
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        this.vj.setGravity(16);
        this.vj.setSingleLine(true);
        this.vj.setTextSize(2, 17.0f);
        this.vj.setId(com.bytedance.sdk.openadsdk.utils.nac.vj);
        this.vj.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        vjVar.addView(this.vj, new LinearLayout.LayoutParams(-1, -2));
        dax daxVar = new dax(context);
        this.pcc = daxVar;
        daxVar.setId(com.bytedance.sdk.openadsdk.utils.nac.qf);
        vjVar.addView(this.pcc, new LinearLayout.LayoutParams(-2, rj.sf(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.sf = kjVar2;
        kjVar2.setGravity(17);
        this.sf.setEllipsize(TextUtils.TruncateAt.END);
        this.sf.setSingleLine(true);
        this.sf.setTextColor(-1);
        this.sf.setTextSize(2, 16.0f);
        this.sf.setId(520093705);
        this.sf.setBackground(pcc(context));
        this.sf.setText(this.kj.sf.bgf());
        addView(this.sf, new LinearLayout.LayoutParams(rj.sf(context, 164.0f), rj.sf(context, 36.0f)));
    }

    public void pcc() {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.kj = sfVar;
        if (sfVar.sf.pv() == 1) {
            oo();
        }
    }

    protected String getButtonTextForNewStyleBar() {
        boolean z;
        String bgf;
        String gm = kun.gm(this.kj.kun);
        if (gm == null) {
            gm = "";
        }
        try {
            z = gm.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            z = false;
        }
        if (TextUtils.isEmpty(this.kj.sf.bgf())) {
            bgf = this.kj.sf.az() != 4 ? "View" : "Install";
        } else {
            bgf = this.kj.sf.bgf();
            if (bgf == null || !kun.qf(bgf) || bgf.length() <= 2) {
                if (bgf != null && !kun.qf(bgf) && bgf.length() > 7 && z) {
                    bgf = getCnOrEnBtnText();
                }
            } else if (z) {
                bgf = getCnOrEnBtnText();
            }
        }
        if (z && !kun.qf(bgf)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.sf.getLayoutParams();
            layoutParams.bottomMargin = rj.sf(this.kj.kun, 4.0f);
            this.sf.setLayoutParams(layoutParams);
        }
        return bgf;
    }

    private String getCnOrEnBtnText() {
        if (this.kj.sf.az() != 4) {
            return "View";
        }
        return "Install";
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.core.gm.vj vj = this.kj.jsj.vj();
        final com.bytedance.sdk.openadsdk.core.gm.sf oo = this.kj.jsj.oo();
        final of ofVar = this.kj.sf;
        if (ofVar.jq() == null) {
            return;
        }
        if (ofVar.pv() != 5 && this.sf != null) {
            if (ofVar.jq().vj) {
                this.sf.setOnClickListener(vj);
                this.sf.setOnTouchListener(vj);
            } else {
                this.sf.setOnClickListener(oo);
            }
        }
        if (ofVar.pv() == 1) {
            if (ofVar.jq().pcc) {
                rj.pcc((View) this, (View.OnClickListener) vj, "TTBaseVideoActivity#mRlDownloadBar");
                rj.pcc((View) this, (View.OnTouchListener) vj, "TTBaseVideoActivity#mRlDownloadBar");
                this.vj.setOnClickListener(vj);
                this.vj.setOnTouchListener(vj);
                this.pcc.setOnClickListener(vj);
                this.pcc.setOnTouchListener(vj);
                this.oo.setOnClickListener(vj);
                this.oo.setOnTouchListener(vj);
                return;
            }
            rj.pcc((View) this, (View.OnClickListener) oo, "TTBaseVideoActivity#mRlDownloadBar");
            this.vj.setOnClickListener(oo);
            this.pcc.setOnClickListener(oo);
            this.oo.setOnClickListener(oo);
            return;
        }
        if (ofVar.pv() == 5) {
            String str = "VAST_ICON";
            if (ofVar.jq().vj) {
                com.bytedance.sdk.openadsdk.core.gm.qf qfVar = new com.bytedance.sdk.openadsdk.core.gm.qf("VAST_ACTION_BUTTON", ofVar.ibs(), vj) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oo.3
                };
                com.bytedance.sdk.openadsdk.core.gm.qf qfVar2 = new com.bytedance.sdk.openadsdk.core.gm.qf(str, ofVar.ibs(), vj) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oo.4
                };
                TextView textView = this.sf;
                if (textView != null) {
                    textView.setOnClickListener(qfVar);
                    this.sf.setOnTouchListener(qfVar);
                }
                nac nacVar = this.oo;
                if (nacVar != null) {
                    nacVar.setOnClickListener(qfVar2);
                    this.oo.setOnTouchListener(qfVar2);
                }
                TextView textView2 = this.vj;
                if (textView2 == null || TextUtils.isEmpty(textView2.getText())) {
                    return;
                }
                this.vj.setOnClickListener(qfVar);
                this.vj.setOnTouchListener(qfVar);
                return;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oo.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = oo;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view != null && "VAST_ICON".equals(view.getTag(570425345))) {
                        if (ofVar.ibs() == null || ofVar.ibs().sf() == null) {
                            return;
                        }
                        ofVar.ibs().sf().pcc(oo.this.kj.fum.hc());
                        return;
                    }
                    if (ofVar.ibs() != null) {
                        ofVar.ibs().pcc().qf(oo.this.kj.fum.hc());
                    }
                }
            };
            TextView textView3 = this.sf;
            if (textView3 != null) {
                textView3.setOnClickListener(onClickListener);
            }
            TextView textView4 = this.vj;
            if (textView4 != null && !TextUtils.isEmpty(textView4.getText())) {
                this.vj.setOnClickListener(onClickListener);
            }
            nac nacVar2 = this.oo;
            if (nacVar2 != null) {
                nacVar2.setTag(570425345, "VAST_ICON");
                this.oo.setOnClickListener(oo);
                return;
            }
            return;
        }
        if (ofVar.jq().gm) {
            rj.pcc((View) this, (View.OnClickListener) vj, "TTBaseVideoActivity#mRlDownloadBar");
            rj.pcc((View) this, (View.OnTouchListener) vj, "TTBaseVideoActivity#mRlDownloadBar");
        } else {
            rj.pcc((View) this, (View.OnClickListener) oo, "TTBaseVideoActivity#mRlDownloadBar");
        }
    }

    private void wh() {
        Context context = getContext();
        setPadding(rj.sf(context, 16.0f), rj.sf(context, 16.0f), rj.sf(context, 16.0f), rj.sf(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(0);
        vjVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = rj.sf(context, 12.0f);
        addView(vjVar, layoutParams);
        nac nacVar = new nac(context);
        this.oo = nacVar;
        nacVar.setBackgroundColor(0);
        this.oo.setId(com.bytedance.sdk.openadsdk.utils.nac.oo);
        vjVar.addView(this.oo, new LinearLayout.LayoutParams(rj.sf(context, 48.0f), rj.sf(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = rj.sf(context, 12.0f);
        vjVar.addView(vjVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vj = kjVar;
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        this.vj.setGravity(16);
        this.vj.setSingleLine(true);
        this.vj.setTextSize(2, 17.0f);
        this.vj.setId(com.bytedance.sdk.openadsdk.utils.nac.vj);
        this.vj.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        vjVar2.addView(this.vj, new LinearLayout.LayoutParams(-1, -2));
        dax daxVar = new dax(context);
        this.pcc = daxVar;
        daxVar.setId(com.bytedance.sdk.openadsdk.utils.nac.qf);
        vjVar2.addView(this.pcc, new LinearLayout.LayoutParams(-2, rj.sf(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.sf = kjVar2;
        kjVar2.setGravity(17);
        this.sf.setEllipsize(TextUtils.TruncateAt.END);
        this.sf.setSingleLine(true);
        this.sf.setTextColor(-1);
        this.sf.setTextSize(2, 16.0f);
        this.sf.setId(520093705);
        this.sf.setBackground(pcc(context));
        this.sf.setText(this.kj.sf.bgf());
        addView(this.sf, new LinearLayout.LayoutParams(-1, rj.sf(context, 36.0f)));
    }

    public void gm() {
        Context context = getContext();
        int sf = rj.sf(context, 12.0f);
        setPadding(sf, sf, sf, sf);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        vjVar.setOrientation(0);
        vjVar.setGravity(16);
        addView(vjVar, layoutParams);
        nac nacVar = new nac(context);
        this.oo = nacVar;
        nacVar.setBackgroundColor(0);
        this.oo.setId(com.bytedance.sdk.openadsdk.utils.nac.oo);
        vjVar.addView(this.oo, new LinearLayout.LayoutParams(rj.sf(context, 54.0f), rj.sf(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = rj.sf(context, 12.0f);
        vjVar.addView(vjVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vj = kjVar;
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        this.vj.setGravity(16);
        this.vj.setSingleLine(true);
        this.vj.setTextSize(2, 17.0f);
        this.vj.setId(com.bytedance.sdk.openadsdk.utils.nac.vj);
        this.vj.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        vjVar2.addView(this.vj, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.wh = kjVar2;
        kjVar2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.wh.setTextSize(2, 13.0f);
        this.wh.setMaxLines(2);
        this.wh.setAlpha(0.8f);
        this.wh.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = rj.sf(context, 4.0f);
        vjVar2.addView(this.wh, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = rj.sf(context, 12.0f);
        vjVar3.setOrientation(0);
        addView(vjVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.gm = kjVar3;
        kjVar3.setGravity(17);
        this.gm.setEllipsize(TextUtils.TruncateAt.END);
        this.gm.setSingleLine(true);
        this.gm.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.gm.setTextSize(2, 16.0f);
        this.gm.setBackground(sf(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, rj.sf(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = rj.sf(context, 3.0f);
        vjVar3.addView(this.gm, layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.sf = kjVar4;
        kjVar4.setGravity(17);
        this.sf.setEllipsize(TextUtils.TruncateAt.END);
        this.sf.setSingleLine(true);
        this.sf.setTextColor(-1);
        this.sf.setTextSize(2, 16.0f);
        this.sf.setId(520093705);
        this.sf.setBackground(gm(context));
        this.sf.setText(this.kj.sf.bgf());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, rj.sf(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = rj.sf(context, 3.0f);
        vjVar3.addView(this.sf, layoutParams6);
    }

    private static Drawable pcc(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(rj.sf(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable sf(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(rj.sf(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable gm(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(rj.sf(context, 8.0f));
        return gradientDrawable;
    }

    private static class pcc implements com.bytedance.sdk.component.vj.dax {
        private final String gm;
        private final WeakReference<ImageView> oo;
        private final of pcc;
        private final String sf;

        public pcc(ImageView imageView, of ofVar, String str, String str2) {
            this.oo = new WeakReference<>(imageView);
            this.pcc = ofVar;
            this.sf = str;
            this.gm = str2;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            Object sf = vhVar.sf();
            if (sf != null) {
                ImageView imageView = this.oo.get();
                if (sf instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) sf);
                    }
                } else if (sf instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && (sf instanceof AnimatedImageDrawable)) {
                        ((AnimatedImageDrawable) sf).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) sf);
                    }
                }
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.pcc, this.gm, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
            pcc(i, str, this.sf);
        }

        private void pcc(final int i, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oo.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i);
                        jSONObject.put("description", i + ServerSentEventKt.COLON + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.sf(pcc.this.pcc, pcc.this.gm, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }
}
