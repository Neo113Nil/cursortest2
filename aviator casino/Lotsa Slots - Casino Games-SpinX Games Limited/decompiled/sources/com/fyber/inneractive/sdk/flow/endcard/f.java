package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class f extends com.fyber.inneractive.sdk.flow.endcard.a {
    public final android.view.ViewGroup c;
    public final android.widget.Button d;
    public final android.widget.TextView e;

    public f(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        super(bVar);
        android.view.View inflate = android.view.LayoutInflater.from(com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a()).inflate(com.fyber.inneractive.sdk.R.layout.ia_layout_default_video_end_card, (android.view.ViewGroup) null);
        this.d = (android.widget.Button) inflate.findViewById(com.fyber.inneractive.sdk.R.id.ia_b_end_card_call_to_action);
        this.e = (android.widget.TextView) inflate.findViewById(com.fyber.inneractive.sdk.R.id.ia_endcard_tv_app_info_button);
        this.c = com.fyber.inneractive.sdk.flow.endcard.a.a(inflate);
    }

    public final void a(com.fyber.inneractive.sdk.player.ui.b bVar, com.fyber.inneractive.sdk.player.ui.n nVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        android.content.Context context = this.d.getContext();
        this.d.setAllCaps(bVar.b);
        this.d.setVisibility(0);
        if (com.fyber.inneractive.sdk.config.IAConfigManager.N.D.n() && (mVar = bVar.i) != null && mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
            this.d.setText(com.fyber.inneractive.sdk.R.string.ia_video_instant_install_text);
            if (bVar.g) {
                java.lang.String str = bVar.h;
                if (str != null && str.length() == 1) {
                    android.widget.TextView textView = this.e;
                    int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(com.fyber.inneractive.sdk.R.dimen.ia_image_control_size);
                    textView.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_bg_circle_overlay);
                    android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.width = dimensionPixelSize;
                    layoutParams.height = dimensionPixelSize;
                    textView.setLayoutParams(layoutParams);
                }
                this.e.setText(str);
                this.e.setVisibility(0);
            }
        } else {
            this.e.setVisibility(8);
            android.widget.Button button = this.d;
            android.content.Context context2 = this.c.getContext();
            java.lang.String str2 = bVar.c;
            button.setText(!android.text.TextUtils.isEmpty(str2) ? com.fyber.inneractive.sdk.util.i1.a(str2, 15) : context2.getString(com.fyber.inneractive.sdk.R.string.ia_video_install_now_text));
        }
        this.d.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_bg_green);
        this.d.setTextSize(0, context.getResources().getDimension(com.fyber.inneractive.sdk.R.dimen.ia_video_overlay_text_large_plus));
        android.widget.TextView textView2 = this.e;
        if (nVar != null) {
            textView2.setOnTouchListener(new com.fyber.inneractive.sdk.flow.endcard.e(10, nVar));
        } else {
            textView2.setOnTouchListener(null);
        }
        android.widget.Button button2 = this.d;
        if (nVar != null) {
            button2.setOnTouchListener(new com.fyber.inneractive.sdk.flow.endcard.e(8, nVar));
        } else {
            button2.setOnTouchListener(null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final android.view.View b() {
        return this.c;
    }
}
