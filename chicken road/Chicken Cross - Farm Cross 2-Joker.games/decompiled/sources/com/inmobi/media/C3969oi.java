package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3969oi {
    public static void a(C3912mi publisherNativeViewData, final Function1 onClick) {
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        publisherNativeViewData.f7250a.getParentView().setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3969oi.a(Function1.this, view);
            }
        });
        View titleView = publisherNativeViewData.f7250a.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3969oi.b(Function1.this, view);
                }
            });
        }
        View descriptionView = publisherNativeViewData.f7250a.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3969oi.c(Function1.this, view);
                }
            });
        }
        ImageView iconView = publisherNativeViewData.f7250a.getIconView();
        if (iconView != null) {
            iconView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3969oi.d(Function1.this, view);
                }
            });
        }
        View ctaView = publisherNativeViewData.f7250a.getCtaView();
        if (ctaView != null) {
            ctaView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3969oi.e(Function1.this, view);
                }
            });
        }
        View advertiserView = publisherNativeViewData.f7250a.getAdvertiserView();
        if (advertiserView != null) {
            advertiserView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3969oi.f(Function1.this, view);
                }
            });
        }
        View ratingView = publisherNativeViewData.f7250a.getRatingView();
        if (ratingView != null) {
            ratingView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3969oi.g(Function1.this, view);
                }
            });
        }
        View view = publisherNativeViewData.c;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oi$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3969oi.h(Function1.this, view2);
                }
            });
        }
    }

    public static final void b(Function1 function1, View view) {
        function1.invoke((short) 3);
    }

    public static final void c(Function1 function1, View view) {
        function1.invoke((short) 4);
    }

    public static final void d(Function1 function1, View view) {
        function1.invoke((short) 5);
    }

    public static final void e(Function1 function1, View view) {
        function1.invoke((short) 6);
    }

    public static final void f(Function1 function1, View view) {
        function1.invoke((short) 9);
    }

    public static final void g(Function1 function1, View view) {
        function1.invoke((short) 8);
    }

    public static final void h(Function1 function1, View view) {
        function1.invoke((short) 7);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke((short) 2);
    }
}
