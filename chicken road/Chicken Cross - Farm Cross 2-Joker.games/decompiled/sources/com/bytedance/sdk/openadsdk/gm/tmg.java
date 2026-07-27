package com.bytedance.sdk.openadsdk.gm;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.Locale;

/* loaded from: classes4.dex */
public class tmg extends Dialog {
    private com.bytedance.sdk.openadsdk.core.wh.sf gm;
    private com.bytedance.sdk.openadsdk.core.wh.kj oo;
    private com.bytedance.sdk.openadsdk.core.wh.vj pcc;
    private final ork qf;
    private pcc sf;
    private com.bytedance.sdk.openadsdk.core.wh.kj vj;
    private com.bytedance.sdk.openadsdk.core.wh.oo wh;

    public interface pcc {
        void gm();

        void pcc();

        void pcc(int i, FilterWord filterWord, String str);

        void sf();
    }

    public tmg(Context context, ork orkVar) {
        super(context, tz.wh(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.qf = orkVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.wh.vj pcc2 = pcc(lu.pcc());
        this.pcc = pcc2;
        setContentView(pcc2);
        pcc(this.pcc);
        gm();
        pcc();
        oo();
    }

    private void pcc(View view) {
        pcc((EditText) this.gm);
        ork orkVar = this.qf;
        if (orkVar != null) {
            String qf = orkVar.qf();
            if (!TextUtils.isEmpty(qf)) {
                this.gm.setText(qf);
                this.oo.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(qf.length()), "/200"));
            }
            this.vj.setEnabled(!TextUtils.isEmpty(qf));
        }
        this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gm.tmg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String obj = tmg.this.gm.getText().toString();
                if (tmg.this.sf != null) {
                    tmg.this.sf.pcc(4, ork.pcc, obj);
                }
                tmg.this.dismiss();
            }
        });
        this.wh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gm.tmg.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (tmg.this.sf != null) {
                    tmg.this.sf.sf();
                }
                tmg.this.dismiss();
            }
        });
        this.gm.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.gm.tmg.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                com.bytedance.sdk.openadsdk.core.wh.kj kjVar;
                int round = Math.round(charSequence.length());
                tmg.this.oo.setText(round + "/200");
                boolean z = true;
                if (round > 0) {
                    if (tmg.this.vj.isEnabled()) {
                        return;
                    } else {
                        kjVar = tmg.this.vj;
                    }
                } else {
                    kjVar = tmg.this.vj;
                    if (tmg.this.qf == null || TextUtils.isEmpty(tmg.this.qf.qf())) {
                        z = false;
                    }
                }
                kjVar.setEnabled(z);
            }
        });
    }

    public static void pcc(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.gm.tmg.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    int type = Character.getType(charSequence.charAt(i));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    private void gm() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.pcc();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        sf();
        super.dismiss();
    }

    public void pcc(pcc pccVar) {
        this.sf = pccVar;
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.core.wh.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void sf() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.wh.sf sfVar = this.gm;
        if (sfVar == null || (inputMethodManager = (InputMethodManager) sfVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.pcc.getWindowToken(), 0);
    }

    private void oo() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.gm.tmg.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (tmg.this.sf != null) {
                    tmg.this.sf.gm();
                }
            }
        });
    }

    public void pcc(of ofVar) {
        ork orkVar = this.qf;
        if (orkVar != null) {
            orkVar.pcc(ofVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.wh.vj pcc(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vjVar.setOrientation(1);
        vjVar.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(context);
        qfVar.setLayoutParams(new LinearLayout.LayoutParams(-1, rj.sf(context, 48.0f)));
        this.wh = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        int sf = rj.sf(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(sf, sf);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int sf2 = rj.sf(context, 10.0f);
        layoutParams.topMargin = sf2;
        layoutParams.rightMargin = sf2;
        this.wh.setLayoutParams(layoutParams);
        this.wh.setClickable(true);
        this.wh.setFocusable(true);
        this.wh.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = rj.sf(context, 12.0f);
        kjVar.setLayoutParams(layoutParams2);
        kjVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        kjVar.setGravity(17);
        kjVar.setSingleLine(true);
        kjVar.setText(tz.pcc(context, "tt_other_reason"));
        kjVar.setTextColor(Color.parseColor("#161823"));
        kjVar.setTextSize(15.0f);
        kjVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, rj.sf(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vjVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.wh.sf sfVar = new com.bytedance.sdk.openadsdk.core.wh.sf(context);
        this.gm = sfVar;
        sfVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = rj.sf(context, 16.0f);
        layoutParams3.rightMargin = rj.sf(context, 16.0f);
        layoutParams3.topMargin = rj.sf(context, 11.5f);
        this.gm.setLayoutParams(layoutParams3);
        this.gm.setLines(4);
        this.gm.setGravity(48);
        this.gm.setTextSize(15.0f);
        this.gm.setTextColor(Color.rgb(22, 24, 35));
        this.gm.setHintTextColor(Color.parseColor("#57161823"));
        this.gm.setBackground(null);
        this.gm.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int sf3 = rj.sf(context, 16.0f);
        int sf4 = rj.sf(context, 17.0f);
        vjVar3.setPadding(sf3, sf4, sf3, sf4);
        vjVar3.setLayoutParams(layoutParams4);
        vjVar3.setOrientation(0);
        this.oo = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = GravityCompat.START;
        this.oo.setLayoutParams(layoutParams5);
        this.oo.setText(String.format("0%s", "/200"));
        this.oo.setGravity(GravityCompat.START);
        this.oo.setTextColor(Color.parseColor("#57161823"));
        this.oo.setTextSize(15.0f);
        this.vj = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = GravityCompat.END;
        this.vj.setLayoutParams(layoutParams6);
        this.vj.setTextSize(14.0f);
        this.vj.setTextColor(-1);
        this.vj.setVisibility(0);
        this.vj.setSingleLine(true);
        int sf5 = rj.sf(context, 27.0f);
        int sf6 = rj.sf(context, 5.0f);
        this.vj.setPadding(sf5, sf6, sf5, sf6);
        int sf7 = rj.sf(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = sf7;
        gradientDrawable.setCornerRadius(f);
        int rgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(rgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(rgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.vj.setBackground(stateListDrawable);
        this.vj.setText(tz.pcc(context, "tt_done"));
        this.vj.setEnabled(false);
        vjVar.addView(qfVar);
        vjVar.addView(view);
        vjVar.addView(vjVar2);
        qfVar.addView(this.wh);
        qfVar.addView(kjVar);
        vjVar2.addView(this.gm);
        vjVar2.addView(vjVar3);
        vjVar3.addView(this.oo);
        vjVar3.addView(this.vj);
        return vjVar;
    }
}
