package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class b extends android.widget.FrameLayout {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f7611a;
    public final int b;
    public final android.widget.ImageButton c;
    public kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, android.content.Context context) {
        this(externalLinkHandler, context, null, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b bVar, android.view.View view) {
        bVar.f7611a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.f7607a);
    }

    public final android.widget.ImageButton getAdButton() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float f = getResources().getDisplayMetrics().density;
            this.c.getLocationOnScreen(new int[2]);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.i, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f(r4[0] / f, r4[1] / f), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g(this.c.getWidth() / f, this.c.getHeight() / f));
            kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> function1 = this.d;
            if (function1 != null) {
                function1.invoke(cVar);
            }
        }
    }

    public final void setOnButtonRenderedListener(kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }

    public final void setPrivacyUrl(final java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.c.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b.this, url, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, android.content.Context context, android.util.AttributeSet attributeSet) {
        this(externalLinkHandler, context, attributeSet, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b bVar, java.lang.String str, android.view.View view) {
        bVar.f7611a.a(str);
    }

    public /* synthetic */ b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, context, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7611a = externalLinkHandler;
        this.b = 12;
        android.widget.ImageButton imageButton = new android.widget.ImageButton(context);
        imageButton.setLayoutParams(new android.widget.FrameLayout.LayoutParams(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c.a(12, context), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c.a(12, context)));
        imageButton.setImageResource(com.moloco.sdk.R.drawable.info_badge);
        imageButton.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b.this, view);
            }
        });
        this.c = imageButton;
        addView(imageButton);
        imageButton.setContentDescription("Ad Badge");
        imageButton.setTag("Ad Badge");
    }
}
