package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class fum extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private pcc gm;
    private boolean oo;
    private Context pcc;
    private LinearLayout sf;

    public interface pcc {
        void gm();

        void oo();

        void pcc();

        void sf();

        void vj();

        void wh();
    }

    public fum(Context context, boolean z) {
        super(context);
        this.pcc = context;
        this.oo = z;
        sf();
    }

    private void sf() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    Rect rect = new Rect();
                    fum.this.sf.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        fum.this.pcc();
                    }
                }
                return true;
            }
        });
        LinearLayout linearLayout = new LinearLayout(this.pcc);
        this.sf = linearLayout;
        linearLayout.setOrientation(1);
        this.sf.setGravity(80);
        this.sf.setPadding(pcc(16.0f), 0, pcc(16.0f), pcc(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(pcc(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.sf.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = pcc(16.0f);
        this.sf.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this.pcc);
        gmVar.setPadding(pcc(6.0f), 0, pcc(6.0f), 0);
        gmVar.setLayoutParams(new LinearLayout.LayoutParams(-1, pcc(44.0f)));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(this.pcc);
        Context context = this.pcc;
        kjVar.setText(context.getString(com.bytedance.sdk.component.utils.tz.sf(context, "tt_more_title")));
        kjVar.setTextColor(Color.parseColor("#000000"));
        kjVar.setTextSize(2, 17.0f);
        kjVar.setGravity(17);
        kjVar.setTypeface(Typeface.defaultFromStyle(1));
        gmVar.addView(kjVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.pcc);
        imageView.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, "tt_titlebar_close_drawable"));
        imageView.setPadding(pcc(10.0f), pcc(10.0f), pcc(10.0f), pcc(10.0f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fum.this.pcc();
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(pcc(44.0f), pcc(44.0f));
        layoutParams2.gravity = 8388629;
        gmVar.addView(imageView, layoutParams2);
        this.sf.addView(gmVar);
        boolean pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_iab_history", true);
        if (!this.oo && pcc2) {
            com.bytedance.sdk.openadsdk.core.wh.vj pcc3 = pcc(8);
            Context context2 = this.pcc;
            pcc(pcc3, context2.getString(com.bytedance.sdk.component.utils.tz.sf(context2, "tt_more_history")), "tt_more_history_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (fum.this.gm != null) {
                        fum.this.gm.pcc();
                    }
                }
            });
            this.sf.addView(pcc3);
        }
        com.bytedance.sdk.openadsdk.core.wh.vj pcc4 = pcc(8);
        Context context3 = this.pcc;
        pcc(pcc4, context3.getString(com.bytedance.sdk.component.utils.tz.sf(context3, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fum.this.gm != null) {
                    fum.this.gm.sf();
                }
            }
        });
        Context context4 = this.pcc;
        pcc(pcc4, context4.getString(com.bytedance.sdk.component.utils.tz.sf(context4, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fum.this.gm != null) {
                    fum.this.gm.gm();
                }
            }
        });
        Context context5 = this.pcc;
        pcc(pcc4, context5.getString(com.bytedance.sdk.component.utils.tz.sf(context5, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fum.this.gm != null) {
                    fum.this.gm.oo();
                }
            }
        });
        this.sf.addView(pcc4);
        com.bytedance.sdk.openadsdk.core.wh.vj pcc5 = pcc(8);
        if (!this.oo) {
            Context context6 = this.pcc;
            pcc(pcc5, context6.getString(com.bytedance.sdk.component.utils.tz.sf(context6, "tt_privacy")), "tt_more_privacy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (fum.this.gm != null) {
                        fum.this.gm.wh();
                    }
                }
            });
        }
        Context context7 = this.pcc;
        pcc(pcc5, context7.getString(com.bytedance.sdk.component.utils.tz.sf(context7, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.fum.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fum.this.gm != null) {
                    fum.this.gm.vj();
                }
            }
        });
        this.sf.addView(pcc5);
        addView(this.sf);
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.wh.vj vjVar, String str, String str2, View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(this.pcc);
        vjVar2.setOrientation(0);
        vjVar2.setGravity(16);
        vjVar2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.pcc);
        imageView.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pcc(20.0f), pcc(20.0f));
        layoutParams.setMargins(pcc(16.0f), pcc(0.0f), pcc(16.0f), pcc(0.0f));
        vjVar2.addView(imageView, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(this.pcc);
        kjVar.setText(str);
        kjVar.setTextColor(Color.parseColor("#000000"));
        kjVar.setTextSize(2, 16.0f);
        kjVar.setGravity(8388627);
        kjVar.setTypeface(Typeface.defaultFromStyle(0));
        vjVar2.addView(kjVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, pcc(52.0f));
        if (vjVar.getChildCount() > 0) {
            View view = new View(this.pcc);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            vjVar.addView(view, new LinearLayout.LayoutParams(-1, pcc(1.0f)));
        }
        vjVar.addView(vjVar2, layoutParams2);
    }

    private com.bytedance.sdk.openadsdk.core.wh.vj pcc(int i) {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this.pcc);
        vjVar.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(pcc(i));
        gradientDrawable.setColor(-1);
        vjVar.setBackgroundDrawable(gradientDrawable);
        vjVar.setPadding(pcc(8.0f), pcc(8.0f), pcc(8.0f), pcc(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = pcc(8.0f);
        vjVar.setLayoutParams(layoutParams);
        return vjVar;
    }

    public void pcc(View view) {
        View findViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (getParent() == null) {
            ((ViewGroup) findViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    public void pcc() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public void setOnMenuItemClickListener(pcc pccVar) {
        this.gm = pccVar;
    }

    private int pcc(float f) {
        return rj.sf(this.pcc, f);
    }
}
