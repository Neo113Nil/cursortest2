package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public class FyberAdIdentifierLocal extends com.fyber.inneractive.sdk.ui.IFyberAdIdentifier implements android.view.View.OnClickListener {
    public android.widget.ImageView m;
    public android.widget.TextView n;
    public boolean o;
    public android.animation.Animator p;
    public float q;
    public android.graphics.Bitmap r;

    public FyberAdIdentifierLocal(com.fyber.inneractive.sdk.config.global.r rVar) {
        super(rVar);
        this.o = false;
        this.q = 0.0f;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier
    public final void a(android.view.ViewGroup viewGroup) {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
        int i = 0;
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) from.inflate(com.fyber.inneractive.sdk.R.layout.ia_layout_fyber_ad_identifier, viewGroup2, false);
        this.m = (android.widget.ImageView) viewGroup3.findViewById(com.fyber.inneractive.sdk.R.id.ia_fyber_identifier_image);
        android.widget.TextView textView = (android.widget.TextView) viewGroup3.findViewById(com.fyber.inneractive.sdk.R.id.ia_fyber_identifier_text);
        this.n = textView;
        if (this.j) {
            int i2 = this.b;
            int i3 = this.c;
            if (textView != null && textView.getLayoutParams() != null) {
                textView.getLayoutParams().width = com.fyber.inneractive.sdk.util.o.b(i2);
                textView.getLayoutParams().height = com.fyber.inneractive.sdk.util.o.b(i3);
            }
            android.widget.ImageView imageView = this.m;
            int i4 = this.d;
            int i5 = this.e;
            if (imageView != null && imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = com.fyber.inneractive.sdk.util.o.b(i4);
                imageView.getLayoutParams().height = com.fyber.inneractive.sdk.util.o.b(i5);
            }
            android.widget.TextView textView2 = this.n;
            int i6 = this.f;
            if (textView2 instanceof android.widget.TextView) {
                textView2.setTextSize(i6);
            }
            a(this.m, this.g);
            this.n.setOnClickListener(this);
            this.n.setText(this.h);
            java.lang.String str = this.i;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.w0(new com.fyber.inneractive.sdk.ui.a(this), viewGroup2.getContext(), new com.fyber.inneractive.sdk.cache.b(str)));
            }
        }
        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner corner = this.k;
        if (corner == com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.TOP_LEFT || corner == com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            viewGroup3.removeView(this.n);
            viewGroup3.addView(this.n);
            viewGroup3.setLayoutDirection(0);
        }
        viewGroup3.addOnLayoutChangeListener(new com.fyber.inneractive.sdk.ui.b(this));
        this.m.setOnClickListener(this);
        a();
        viewGroup2.addView(viewGroup3);
        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner corner2 = this.k;
        corner2.getClass();
        int i7 = com.fyber.inneractive.sdk.ui.i.f4282a[corner2.ordinal()];
        if (i7 == 1) {
            i = 51;
        } else if (i7 == 2) {
            i = 53;
        } else if (i7 == 3) {
            i = 83;
        } else if (i7 == 4) {
            i = 85;
        }
        com.fyber.inneractive.sdk.util.o.a(viewGroup3, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (view != this.m) {
            if (view == this.n && this.l == com.fyber.inneractive.sdk.config.global.features.a.OPEN) {
                a();
                com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener clickListener = this.f4272a;
                if (clickListener != null) {
                    clickListener.a();
                    return;
                }
                return;
            }
            return;
        }
        if (this.p != null) {
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.widget.ImageView imageView = this.m;
        android.util.Property property = android.view.View.ROTATION_X;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) property, 90.0f);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(this.m, "imageAlpha", 255, 25);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofInt);
        animatorSet2.addListener(new com.fyber.inneractive.sdk.ui.c(this, animatorSet));
        animatorSet2.setDuration(225L);
        this.p = animatorSet2;
        animatorSet2.start();
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.m, (android.util.Property<android.widget.ImageView, java.lang.Float>) property, 0.0f);
        android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt(this.m, "imageAlpha", 25, 255);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playTogether(ofFloat2, ofInt2);
        animatorSet3.setDuration(225L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.n, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_X, this.o ? this.q : 0.0f);
        ofFloat3.setDuration(450L);
        animatorSet.setDuration(450L);
        animatorSet.playTogether(ofFloat3, animatorSet3);
        animatorSet.addListener(new com.fyber.inneractive.sdk.ui.d(this));
    }

    public final void a() {
        this.o = false;
        this.m.setImageResource(com.fyber.inneractive.sdk.R.drawable.ia_fyber_info_button);
        a(this.m, this.g);
        android.animation.Animator animator = this.p;
        if (animator != null) {
            animator.removeAllListeners();
            this.p = null;
        }
    }

    public static void a(android.widget.ImageView imageView, java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                com.fyber.inneractive.sdk.widget.a.a(imageView, android.content.res.ColorStateList.valueOf(android.graphics.Color.parseColor(str)));
                return;
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("could not parse color %s", str);
                return;
            }
        }
        com.fyber.inneractive.sdk.widget.a.a(imageView, null);
    }
}
