package com.bytedance.sdk.openadsdk.core.widget;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.utils.qy;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class sf extends Dialog {
    private boolean dax;
    private OnBackInvokedCallback gbb;
    private com.bytedance.sdk.openadsdk.core.wh.kj gm;
    private int gpj;
    private int hc;
    private boolean jr;
    private final Context kj;
    private float lu;
    private int nac;
    private com.bytedance.sdk.openadsdk.core.wh.kj oo;
    private String ork;
    public InterfaceC0181sf pcc;
    private View qf;
    private com.bytedance.sdk.openadsdk.core.wh.oo sf;
    private String tmg;
    private String vh;
    private com.bytedance.sdk.openadsdk.core.wh.pcc vj;
    private String vy;
    private com.bytedance.sdk.openadsdk.core.wh.pcc wh;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.sf$sf, reason: collision with other inner class name */
    public interface InterfaceC0181sf {
        void pcc();

        void sf();
    }

    private static class pcc implements OnBackInvokedCallback {
        private final WeakReference<sf> pcc;

        pcc(sf sfVar) {
            this.pcc = new WeakReference<>(sfVar);
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            sf sfVar = this.pcc.get();
            if (sfVar != null) {
                com.bytedance.sdk.component.utils.lo.pcc("CustomCommonDialog", "onBackInvoked");
                sfVar.onBackPressed();
            }
        }
    }

    public sf(Context context) {
        super(context, tz.wh(context, "tt_custom_dialog"));
        this.hc = -1;
        this.jr = false;
        this.dax = false;
        this.kj = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean atb = com.bytedance.sdk.openadsdk.core.lu.oo().atb();
        this.dax = atb;
        if (atb) {
            this.nac = Color.argb(166, 0, 0, 0);
            this.lu = 16.0f;
            this.gpj = Color.parseColor("#000000");
            setContentView(sf(this.kj));
        } else {
            setContentView(pcc(this.kj));
        }
        if (qy.pcc()) {
            com.bytedance.sdk.component.utils.lo.pcc("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.gbb = new pcc(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.gbb);
        }
        setCanceledOnTouchOutside(false);
        sf();
        pcc();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.lo.pcc("CustomCommonDialog", "onBackPressed");
    }

    private void pcc() {
        this.wh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.sf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (sf.this.pcc != null) {
                    sf.this.pcc.pcc();
                }
            }
        });
        this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.sf.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (sf.this.pcc != null) {
                    sf.this.pcc.sf();
                }
            }
        });
    }

    private void sf() {
        if (!TextUtils.isEmpty(this.ork)) {
            this.gm.setText(this.ork);
            this.gm.setVisibility(0);
        } else {
            this.gm.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.vy)) {
            this.oo.setText(this.vy);
        }
        if (!TextUtils.isEmpty(this.vh)) {
            this.wh.setText(this.vh);
        } else {
            this.wh.setText(tz.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.tmg)) {
            this.vj.setText(this.tmg);
        } else {
            this.vj.setText(tz.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), "tt_negtive_txt"));
        }
        int i = this.hc;
        if (i != -1) {
            this.sf.setImageResource(i);
            this.sf.setVisibility(0);
        } else {
            this.sf.setVisibility(8);
        }
        if (this.jr) {
            this.qf.setVisibility(8);
            this.vj.setVisibility(8);
        } else {
            this.vj.setVisibility(0);
            this.qf.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        sf();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        gm();
    }

    private void gm() {
        if (this.gbb == null || !qy.pcc()) {
            return;
        }
        com.bytedance.sdk.component.utils.lo.pcc("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.gbb);
    }

    private View pcc(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(context);
        qfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        vjVar.setMinimumWidth(pcc(260.0f));
        vjVar.setPadding(0, pcc(32.0f), 0, 0);
        vjVar.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_custom_dialog_bg"));
        vjVar.setOrientation(1);
        vjVar.setLayoutParams(layoutParams);
        this.gm = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = pcc(16.0f);
        layoutParams2.rightMargin = pcc(16.0f);
        layoutParams2.bottomMargin = pcc(16.0f);
        this.gm.setGravity(17);
        this.gm.setVisibility(0);
        this.gm.setTextColor(Color.parseColor("#333333"));
        this.gm.setTextSize(18.0f);
        this.gm.setLayoutParams(layoutParams2);
        this.sf = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = pcc(16.0f);
        layoutParams3.rightMargin = pcc(16.0f);
        layoutParams3.bottomMargin = pcc(10.0f);
        this.sf.setMaxHeight(pcc(150.0f));
        this.sf.setMaxWidth(pcc(150.0f));
        this.sf.setVisibility(0);
        this.sf.setLayoutParams(layoutParams3);
        this.oo = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = pcc(20.0f);
        layoutParams4.rightMargin = pcc(20.0f);
        this.oo.setGravity(17);
        this.oo.setLineSpacing(pcc(3.0f), 1.2f);
        this.oo.setTextSize(18.0f);
        this.oo.setTextColor(Color.parseColor("#000000"));
        this.oo.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = pcc(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        vjVar2.setOrientation(0);
        vjVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.wh.pcc pccVar = new com.bytedance.sdk.openadsdk.core.wh.pcc(context);
        this.vj = pccVar;
        pccVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = pcc(10.0f);
        layoutParams7.weight = 1.0f;
        this.vj.setPadding(0, pcc(16.0f), 0, pcc(16.0f));
        this.vj.setBackground(null);
        this.vj.setGravity(17);
        this.vj.setSingleLine(true);
        this.vj.setTextColor(Color.parseColor("#999999"));
        this.vj.setTextSize(16.0f);
        this.vj.setLayoutParams(layoutParams7);
        this.qf = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.qf.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.qf.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.wh.pcc pccVar2 = new com.bytedance.sdk.openadsdk.core.wh.pcc(context);
        this.wh = pccVar2;
        pccVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = pcc(10.0f);
        layoutParams9.weight = 1.0f;
        this.wh.setPadding(0, pcc(16.0f), 0, pcc(16.0f));
        this.wh.setBackground(null);
        this.wh.setGravity(17);
        this.wh.setSingleLine(true);
        this.wh.setTextColor(Color.parseColor("#38ADFF"));
        this.wh.setTextSize(16.0f);
        this.wh.setLayoutParams(layoutParams9);
        qfVar.addView(vjVar);
        vjVar.addView(this.gm);
        vjVar.addView(this.sf);
        vjVar.addView(this.oo);
        vjVar.addView(view);
        vjVar.addView(vjVar2);
        vjVar2.addView(this.vj);
        vjVar2.addView(this.qf);
        vjVar2.addView(this.wh);
        return qfVar;
    }

    private View sf(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(context);
        qfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        vjVar.setMinimumWidth(pcc(280.0f));
        vjVar.setPadding(0, pcc(32.0f), 0, 0);
        vjVar.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_custom_dialog_bg_new"));
        vjVar.setOrientation(1);
        vjVar.setLayoutParams(layoutParams);
        this.gm = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = pcc(16.0f);
        layoutParams2.rightMargin = pcc(16.0f);
        layoutParams2.bottomMargin = pcc(16.0f);
        this.gm.setGravity(17);
        this.gm.setVisibility(0);
        this.gm.setTextColor(Color.parseColor("#333333"));
        this.gm.setTextSize(20.0f);
        this.gm.setTypeface(Typeface.defaultFromStyle(1));
        this.gm.setLineSpacing(0.0f, 1.3f);
        this.gm.setLetterSpacing(0.015f);
        this.gm.setLayoutParams(layoutParams2);
        this.sf = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = pcc(16.0f);
        layoutParams3.rightMargin = pcc(16.0f);
        layoutParams3.bottomMargin = pcc(10.0f);
        this.sf.setMaxHeight(pcc(150.0f));
        this.sf.setMaxWidth(pcc(150.0f));
        this.sf.setVisibility(0);
        this.sf.setLayoutParams(layoutParams3);
        this.oo = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = pcc(20.0f);
        layoutParams4.rightMargin = pcc(20.0f);
        this.oo.setGravity(17);
        this.oo.setLineSpacing(0.0f, 1.3f);
        this.oo.setLetterSpacing(0.004f);
        this.oo.setTextSize(15.0f);
        this.oo.setTextColor(this.nac);
        this.oo.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = pcc(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        vjVar2.setOrientation(0);
        vjVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.wh.pcc pccVar = new com.bytedance.sdk.openadsdk.core.wh.pcc(context);
        this.vj = pccVar;
        pccVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = pcc(10.0f);
        layoutParams7.weight = 1.0f;
        this.vj.setPadding(0, pcc(16.0f), 0, pcc(16.0f));
        this.vj.setBackground(null);
        this.vj.setGravity(17);
        this.vj.setSingleLine(true);
        this.vj.setTextSize(2, this.lu);
        this.vj.setLineSpacing(0.0f, 1.3f);
        this.vj.setLetterSpacing(0.0019f);
        this.vj.setTypeface(Typeface.defaultFromStyle(0));
        this.vj.setTextColor(ColorStateList.valueOf(this.nac));
        this.vj.setLayoutParams(layoutParams7);
        this.qf = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.qf.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.qf.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.wh.pcc pccVar2 = new com.bytedance.sdk.openadsdk.core.wh.pcc(context);
        this.wh = pccVar2;
        pccVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = pcc(10.0f);
        layoutParams9.weight = 1.0f;
        this.wh.setPadding(0, pcc(16.0f), 0, pcc(16.0f));
        this.wh.setBackground(null);
        this.wh.setGravity(17);
        this.wh.setSingleLine(true);
        this.wh.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface create = Build.VERSION.SDK_INT >= 28 ? Typeface.create(this.wh.getTypeface(), 500, false) : null;
        if (create != null) {
            this.wh.setTypeface(create);
        }
        this.wh.setLineSpacing(0.0f, 1.3f);
        this.wh.setLetterSpacing(0.0019f);
        this.wh.setTextColor(ColorStateList.valueOf(this.gpj));
        this.wh.setTextSize(this.lu);
        this.wh.setLayoutParams(layoutParams9);
        qfVar.addView(vjVar);
        vjVar.addView(this.gm);
        vjVar.addView(this.sf);
        vjVar.addView(this.oo);
        vjVar.addView(view);
        vjVar.addView(vjVar2);
        vjVar2.addView(this.vj);
        vjVar2.addView(this.qf);
        vjVar2.addView(this.wh);
        return qfVar;
    }

    private int pcc(float f) {
        return rj.sf(getContext(), f);
    }

    public sf pcc(InterfaceC0181sf interfaceC0181sf) {
        this.pcc = interfaceC0181sf;
        return this;
    }

    public sf pcc(String str) {
        this.vy = str;
        return this;
    }

    public sf sf(String str) {
        this.ork = str;
        return this;
    }

    public sf gm(String str) {
        this.vh = str;
        return this;
    }

    public sf oo(String str) {
        this.tmg = str;
        return this;
    }
}
