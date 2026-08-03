package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1499eU {
    public static int A00(android.util.DisplayMetrics displayMetrics) {
        int i = displayMetrics.widthPixels;
        if (i > 1700) {
            i = 1700;
        }
        int width = i / 448;
        return width;
    }

    public static void A01(@javax.annotation.Nullable android.content.Context context, final android.view.View view, long j, final android.view.View view2) {
        if (view2 != null) {
            view2.setVisibility(0);
        }
        view.setVisibility(8);
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.eT
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.AbstractC1499eU.A02(view2, view);
            }
        }, j);
    }

    public static /* synthetic */ void A02(android.view.View view, android.view.View view2) {
        if (view != null) {
            view.setVisibility(8);
        }
        view2.setVisibility(0);
    }
}
