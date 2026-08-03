package com.moloco.sdk.internal.publisher.nativead.ui;

/* loaded from: classes5.dex */
public final class c extends android.widget.RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.publisher.nativead.ui.c.a f7159a = new com.moloco.sdk.internal.publisher.nativead.ui.c.a(null);
    public static final int b = 0;
    public static final int c = 16;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ c(android.content.Context context, android.net.Uri uri, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, kotlin.jvm.functions.Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, yVar, function0, (i & 16) != 0 ? com.moloco.sdk.service_locator.a.h.f7349a.f() : rVar, (i & 32) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar);
    }

    public static final void a(kotlin.jvm.functions.Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        hVar.a(button);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, android.net.Uri imageUri, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setImageURI(imageUri);
        imageView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.c$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.moloco.sdk.internal.publisher.nativead.ui.c.a(kotlin.jvm.functions.Function0.this, view);
            }
        });
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b(externalLinkHandler, context, null, 0, 12, null);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        bVar.setPadding(16, 0, 0, 16);
        bVar.setOnButtonRenderedListener(new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.c$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.publisher.nativead.ui.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h.this, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c) obj);
            }
        });
        bVar.setLayoutParams(layoutParams);
        watermark.a(imageView);
        addView(imageView);
        addView(bVar);
    }
}
