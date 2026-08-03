package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class t extends com.fyber.inneractive.sdk.player.ui.o {
    public t(android.content.Context context, com.fyber.inneractive.sdk.player.ui.h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(context, null, hVar, rVar, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, com.fyber.inneractive.sdk.player.ui.b bVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void b(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public android.view.View getEndCardView() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.s
    public android.view.View[] getTrackingFriendlyView() {
        return new android.view.View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.s
    public android.view.View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new android.view.View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void h(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o
    public final void q() {
        setBackgroundColor(0);
        this.m = (android.view.ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_texture_view_host);
        removeView(findViewById(com.fyber.inneractive.sdk.R.id.ia_video_progressbar));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.fyber.inneractive.sdk.R.id.ia_iv_mute_button);
        this.N = imageView;
        removeView(imageView);
        this.N = null;
        this.R = findViewById(com.fyber.inneractive.sdk.R.id.ia_buffering_overlay);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.fyber.inneractive.sdk.R.id.ia_tv_call_to_action);
        this.M = textView;
        removeView(textView);
        this.M = null;
    }
}
