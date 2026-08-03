package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1406cy {
    public static com.facebook.ads.redexgen.core.AnonymousClass67 A00(final com.facebook.ads.redexgen.core.C1353c7 c1353c7, int i, final java.lang.String str, final com.facebook.ads.redexgen.core.C0712Fy c0712Fy) {
        if (i == 1) {
            return new com.facebook.ads.redexgen.core.AnonymousClass67(c1353c7, str, c0712Fy) { // from class: com.facebook.ads.redexgen.X.1G
                public static final int A00 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 20.0f);
                public static final int A01 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
                public final boolean A03() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.core.AnonymousClass67
                public final void A1X(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
                    com.facebook.ads.redexgen.core.C1336bq titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
                    android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1636gi);
                    com.facebook.ads.redexgen.core.YB.A0V(linearLayout, new android.graphics.drawable.ColorDrawable(-1));
                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(A01, A01, A01, A01);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new com.facebook.ads.redexgen.core.AnonymousClass67(c1353c7, str, c0712Fy) { // from class: com.facebook.ads.redexgen.X.1H
            public static final int A00 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
            public final boolean A02() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.AnonymousClass67, com.facebook.ads.redexgen.core.AbstractC1349c3
            public final boolean A0A() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.AnonymousClass67
            public final void A1X(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
                com.facebook.ads.redexgen.core.C1336bq titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                android.widget.RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                titleDescContainer.setPadding(A00, A00, A00, A00);
                com.facebook.ads.redexgen.core.YB.A0U(titleDescContainer, getAdContextWrapper());
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
