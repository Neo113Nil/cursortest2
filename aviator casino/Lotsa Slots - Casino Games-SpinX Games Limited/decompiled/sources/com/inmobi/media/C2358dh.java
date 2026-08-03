package com.inmobi.media;

/* renamed from: com.inmobi.media.dh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2358dh {
    public static void a(com.inmobi.media.C2304bh publisherNativeViewData, final kotlin.jvm.functions.Function1 onClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        publisherNativeViewData.f5125a.getParentView().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.inmobi.media.C2358dh.a(kotlin.jvm.functions.Function1.this, view);
            }
        });
        android.view.View titleView = publisherNativeViewData.f5125a.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.inmobi.media.C2358dh.b(kotlin.jvm.functions.Function1.this, view);
                }
            });
        }
        android.view.View descriptionView = publisherNativeViewData.f5125a.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.inmobi.media.C2358dh.c(kotlin.jvm.functions.Function1.this, view);
                }
            });
        }
        android.widget.ImageView iconView = publisherNativeViewData.f5125a.getIconView();
        if (iconView != null) {
            iconView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.inmobi.media.C2358dh.d(kotlin.jvm.functions.Function1.this, view);
                }
            });
        }
        android.view.View ctaView = publisherNativeViewData.f5125a.getCtaView();
        if (ctaView != null) {
            ctaView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.inmobi.media.C2358dh.e(kotlin.jvm.functions.Function1.this, view);
                }
            });
        }
        android.view.View advertiserView = publisherNativeViewData.f5125a.getAdvertiserView();
        if (advertiserView != null) {
            advertiserView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.inmobi.media.C2358dh.f(kotlin.jvm.functions.Function1.this, view);
                }
            });
        }
        android.view.View ratingView = publisherNativeViewData.f5125a.getRatingView();
        if (ratingView != null) {
            ratingView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.inmobi.media.C2358dh.g(kotlin.jvm.functions.Function1.this, view);
                }
            });
        }
        android.view.View view = publisherNativeViewData.c;
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.dh$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.inmobi.media.C2358dh.h(kotlin.jvm.functions.Function1.this, view2);
                }
            });
        }
    }

    public static final void b(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 3);
    }

    public static final void c(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 4);
    }

    public static final void d(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 5);
    }

    public static final void e(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 6);
    }

    public static final void f(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 9);
    }

    public static final void g(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 8);
    }

    public static final void h(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 7);
    }

    public static final void a(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        function1.invoke((short) 2);
    }
}
