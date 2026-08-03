package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public class CloseButtonFlowManager implements com.fyber.inneractive.sdk.flow.storepromo.observer.a, com.fyber.inneractive.sdk.ui.CloseButtonConfigurationChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f4269a;
    public final android.widget.TextView b;
    public final android.view.View c;
    public final android.widget.ImageView d;
    public final android.widget.FrameLayout e;
    public boolean f = false;
    public final com.fyber.inneractive.sdk.ui.CloseButtonConfiguration g = new com.fyber.inneractive.sdk.ui.CloseButtonConfiguration(this);

    public CloseButtonFlowManager(com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity, com.fyber.inneractive.sdk.activities.d dVar) {
        android.view.View findViewById = inneractiveFullscreenAdActivity.findViewById(com.fyber.inneractive.sdk.R.id.ia_fl_close_button);
        this.f4269a = findViewById;
        this.b = (android.widget.TextView) inneractiveFullscreenAdActivity.findViewById(com.fyber.inneractive.sdk.R.id.ia_tv_close_button);
        android.view.View findViewById2 = inneractiveFullscreenAdActivity.findViewById(com.fyber.inneractive.sdk.R.id.ia_clickable_close_button);
        this.c = findViewById2;
        this.d = (android.widget.ImageView) inneractiveFullscreenAdActivity.findViewById(com.fyber.inneractive.sdk.R.id.ia_iv_close_button);
        this.e = (android.widget.FrameLayout) inneractiveFullscreenAdActivity.findViewById(com.fyber.inneractive.sdk.R.id.close_button_container);
        findViewById.setVisibility(8);
        findViewById2.setOnClickListener(dVar);
    }

    @Override // com.fyber.inneractive.sdk.ui.CloseButtonConfigurationChangeListener
    public final void a(com.fyber.inneractive.sdk.ui.CloseButtonConfiguration closeButtonConfiguration) {
        int i;
        int i2;
        if (closeButtonConfiguration.f) {
            this.f4269a.setVisibility(8);
            this.b.setVisibility(8);
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        com.fyber.inneractive.sdk.ui.CloseButtonConfiguration closeButtonConfiguration2 = this.g;
        if (closeButtonConfiguration2.b) {
            if (!closeButtonConfiguration2.c || this.f) {
                this.f4269a.setAlpha(1.0f);
                this.d.setAlpha(1.0f);
            } else {
                this.f4269a.setAlpha(0.0f);
                this.d.setAlpha(0.0f);
            }
            this.b.setText("");
            this.b.setVisibility(8);
            int i3 = closeButtonConfiguration2.d;
            if (i3 >= 5) {
                int a2 = com.fyber.inneractive.sdk.util.o.a(i3);
                this.d.getLayoutParams().width = a2;
                this.d.getLayoutParams().height = a2;
            }
            int i4 = closeButtonConfiguration2.e;
            if (i4 >= 5) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.d.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f4269a.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) this.c.getLayoutParams();
                int a3 = com.fyber.inneractive.sdk.util.o.a(i4);
                int i5 = layoutParams.width;
                int i6 = a3 - i5;
                if (a3 <= i5 || i6 <= (i2 = layoutParams2.rightMargin)) {
                    layoutParams3.width = a3;
                    layoutParams3.height = a3;
                    i = layoutParams2.rightMargin;
                    if (i6 < i) {
                        i -= i6 / 2;
                    }
                } else {
                    int i7 = (i5 / 2) + (a3 / 2) + i2;
                    layoutParams3.width = i7;
                    layoutParams3.height = i7;
                    layoutParams2.gravity = 53;
                    i = 0;
                }
                layoutParams3.setMargins(i, i, i, i);
                layoutParams3.gravity = 17;
            }
        }
        this.f4269a.setVisibility((closeButtonConfiguration.f4268a || closeButtonConfiguration.b) ? 0 : 8);
        this.b.setVisibility(closeButtonConfiguration.f4268a ? 0 : 8);
        int i8 = closeButtonConfiguration.b ? 0 : 8;
        this.d.setVisibility(i8);
        this.c.setVisibility(i8);
        this.c.setEnabled(closeButtonConfiguration.b);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        com.fyber.inneractive.sdk.ui.CloseButtonConfiguration closeButtonConfiguration = this.g;
        closeButtonConfiguration.f = bVar.f3752a;
        closeButtonConfiguration.g.a(closeButtonConfiguration);
    }
}
