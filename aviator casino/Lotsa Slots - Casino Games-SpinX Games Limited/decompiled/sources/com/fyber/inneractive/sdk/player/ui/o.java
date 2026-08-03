package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public class o extends com.fyber.inneractive.sdk.player.ui.l {
    public android.view.ViewGroup K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public android.widget.ImageView O;
    public com.fyber.inneractive.sdk.ui.IAsmoothProgressBar P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public android.widget.TextView T;
    public android.widget.TextView U;

    public o(android.content.Context context, com.fyber.inneractive.sdk.flow.g gVar, com.fyber.inneractive.sdk.player.ui.a aVar, com.fyber.inneractive.sdk.config.global.r rVar, boolean z, java.lang.String str) {
        super(context, gVar, aVar, rVar, str);
        this.Q = null;
        this.A.inflate(com.fyber.inneractive.sdk.R.layout.ia_layout_video_view, (android.view.ViewGroup) this, true);
        q();
        com.fyber.inneractive.sdk.flow.g gVar2 = this.B;
        if (gVar2 != null) {
            com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner corner = com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            com.fyber.inneractive.sdk.ui.IFyberAdIdentifier iFyberAdIdentifier = gVar2.d;
            iFyberAdIdentifier.k = corner;
            iFyberAdIdentifier.a(this);
        }
        h(z);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i, int i2) {
        com.fyber.inneractive.sdk.ui.IAsmoothProgressBar iAsmoothProgressBar = this.P;
        if (iAsmoothProgressBar == null) {
            return;
        }
        iAsmoothProgressBar.setMax(i);
        super.a(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z) {
        android.widget.TextView textView = this.T;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z) {
        android.view.ViewGroup viewGroup = this.K;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void d() {
        this.h = true;
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final void destroy() {
        super.destroy();
        com.fyber.inneractive.sdk.player.ui.k kVar = this.E;
        if (kVar != null) {
            removeCallbacks(kVar);
            this.E = null;
        }
        p();
        android.view.ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void e() {
        this.h = false;
        k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z) {
        com.fyber.inneractive.sdk.ui.IAsmoothProgressBar iAsmoothProgressBar = this.P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z) {
        android.widget.TextView textView = this.U;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public android.view.View[] getTrackingFriendlyView() {
        return new android.view.View[]{this.M, this.T, this.U, this.N, this.P, this.Q, this.v};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public android.view.View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new android.view.View[]{this.L, this.K};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        android.widget.TextView textView = this.U;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void i() {
        g(false);
        d(false);
        f(false);
        android.widget.TextView textView = this.M;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.widget.ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        c(false);
        a(false, (java.lang.String) null);
        b(false);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return this.T == null && this.P == null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        android.widget.ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.O.setSelected(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        android.widget.ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.O.setSelected(false);
        }
    }

    public void q() {
        this.m = (android.view.ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_texture_view_host);
        this.r = (android.view.ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_default_endcard_video_overlay);
        this.s = (android.view.ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_endcard_video_overlay);
        this.n = (android.widget.Button) findViewById(com.fyber.inneractive.sdk.R.id.ia_b_end_card_call_to_action);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.fyber.inneractive.sdk.R.id.ia_endcard_tv_app_info_button);
        this.v = textView;
        a(textView, 10);
        a(this.n, 8);
        a(this.m, 7);
        a(this.r, -1);
        this.O = (android.widget.ImageView) findViewById(com.fyber.inneractive.sdk.R.id.ia_iv_expand_collapse_button);
        this.S = findViewById(com.fyber.inneractive.sdk.R.id.ia_paused_video_overlay);
        this.L = (android.widget.TextView) findViewById(com.fyber.inneractive.sdk.R.id.ia_tv_app_info_button);
        this.M = (android.widget.TextView) findViewById(com.fyber.inneractive.sdk.R.id.ia_tv_call_to_action);
        this.P = (com.fyber.inneractive.sdk.ui.IAsmoothProgressBar) findViewById(com.fyber.inneractive.sdk.R.id.ia_video_progressbar);
        this.K = (android.view.ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
        this.Q = findViewById(com.fyber.inneractive.sdk.R.id.ia_click_overlay);
        this.P.setVisibility(0);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.fyber.inneractive.sdk.R.id.ia_iv_mute_button);
        this.N = imageView;
        imageView.setVisibility(0);
        this.R = findViewById(com.fyber.inneractive.sdk.R.id.ia_buffering_overlay);
        this.T = (android.widget.TextView) findViewById(com.fyber.inneractive.sdk.R.id.ia_tv_remaining_time);
        this.U = (android.widget.TextView) findViewById(com.fyber.inneractive.sdk.R.id.ia_tv_skip);
        a(this, 7);
        a(this.M, 3);
        a(this.N, 1);
        a(this.L, 10);
        a(this.O, 5);
        a(this.S, 9);
        a(this.U, 6);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(android.widget.TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_bg_circle_overlay);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) getContext().getResources().getDimension(com.fyber.inneractive.sdk.R.dimen.ia_image_control_size);
        layoutParams.height = (int) getContext().getResources().getDimension(com.fyber.inneractive.sdk.R.dimen.ia_image_control_size);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z) {
        android.widget.ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(java.lang.String str) {
        android.widget.TextView textView = this.T;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(java.lang.String str) {
        if (this.U != null) {
            try {
                java.lang.Integer.parseInt(str);
                int i = com.fyber.inneractive.sdk.R.string.ia_video_before_skip_format;
                str = java.lang.String.format(java.util.Locale.US, com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getString(i), java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
            } catch (java.lang.Exception unused) {
            }
            this.U.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z) {
        android.widget.ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z) {
        android.view.View view = this.S;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void a(int i) {
        com.fyber.inneractive.sdk.ui.IAsmoothProgressBar iAsmoothProgressBar = this.P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setProgress(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // com.fyber.inneractive.sdk.player.ui.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, com.fyber.inneractive.sdk.ignite.m mVar) {
        java.lang.String localizedCtaButtonText;
        java.lang.Boolean c;
        android.widget.TextView textView = this.M;
        if (textView != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.w;
            textView.setAllCaps((rVar == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class) == null || (c = ((com.fyber.inneractive.sdk.config.global.features.v) this.w.a(com.fyber.inneractive.sdk.config.global.features.v.class)).c("cta_text_all_caps")) == null) ? false : c.booleanValue());
            android.widget.TextView textView2 = this.M;
            if (com.fyber.inneractive.sdk.config.IAConfigManager.N.D.n()) {
                mVar.getClass();
                if (mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
                    localizedCtaButtonText = getContext().getString(com.fyber.inneractive.sdk.R.string.ia_video_instant_install_text);
                    if (!android.text.TextUtils.isEmpty(this.x)) {
                        localizedCtaButtonText = this.x;
                    }
                    textView2.setText(localizedCtaButtonText);
                    this.M.setVisibility(z ? 0 : 4);
                }
            }
            localizedCtaButtonText = getLocalizedCtaButtonText();
            if (android.text.TextUtils.isEmpty(localizedCtaButtonText)) {
                localizedCtaButtonText = getContext().getString(com.fyber.inneractive.sdk.R.string.ia_video_install_now_text);
            }
            if (!android.text.TextUtils.isEmpty(this.x)) {
            }
            textView2.setText(localizedCtaButtonText);
            this.M.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, java.lang.String str) {
        android.widget.TextView textView;
        android.widget.TextView textView2 = this.L;
        if (textView2 != null) {
            textView2.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.L);
            }
            if (z && (textView = this.M) != null) {
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -2;
                this.M.setLayoutParams(layoutParams);
                this.M.setTextSize(0, getResources().getDimension(com.fyber.inneractive.sdk.R.dimen.ia_video_overlay_text_large_for_cta));
            }
            this.L.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z) {
        android.view.View view = this.R;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean a() {
        android.widget.TextView textView = this.U;
        return textView != null && textView.getVisibility() == 0 && this.U.isEnabled();
    }
}
