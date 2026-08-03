package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class RL {
    public static java.lang.String[] A00 = {"X094Ff6hX91n4UOeNZ5q6xBODyRF", "3SZuvdCuB3BE6lfK5qku2XxobaMEdUie", "GC5CoEiK4nrbG2wHW0FtwppW4DiO", "wga3z1tjiA3hov6SpIvZwMukezgQNZlv", "3xUgR2JHsSdawQ9thG1dfHrpvR", "GYcoMrIBN4ZdBxcuGgG7c5lcAAiSjlKe", "4bECUaOSHZBdJ", ""};

    public static int A00(@javax.annotation.Nullable com.facebook.ads.redexgen.core.RH rh, @javax.annotation.Nullable com.facebook.ads.redexgen.core.AbstractC0980Qm abstractC0980Qm, android.view.View view, android.view.View view2, com.facebook.ads.redexgen.core.R2 r2, boolean z) {
        if (r2.A0Y() != 0) {
            int A03 = rh.A03();
            if (A00[0].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A00;
            strArr[1] = "A1oAKfZoAPhZUsftVBl6ZIJw4txQWtbe";
            strArr[5] = "SaLVqq6GZrXjANh28rEV2dsKSTV0teZe";
            if (A03 == 0 || view == null || view2 == null) {
                return 0;
            }
            if (!z) {
                return java.lang.Math.abs(r2.A0r(view) - r2.A0r(view2)) + 1;
            }
            int A0C = abstractC0980Qm.A0C(view2) - abstractC0980Qm.A0F(view);
            int extend = abstractC0980Qm.A0B();
            return java.lang.Math.min(extend, A0C);
        }
        return 0;
    }

    public static int A01(@javax.annotation.Nullable com.facebook.ads.redexgen.core.RH rh, @javax.annotation.Nullable com.facebook.ads.redexgen.core.AbstractC0980Qm abstractC0980Qm, android.view.View view, android.view.View view2, com.facebook.ads.redexgen.core.R2 r2, boolean z) {
        if (r2.A0Y() == 0 || rh.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return rh.A03();
        }
        int A0C = abstractC0980Qm.A0C(view2) - abstractC0980Qm.A0F(view);
        int A0r = r2.A0r(view);
        int laidOutArea = r2.A0r(view2);
        float abs = A0C / (java.lang.Math.abs(A0r - laidOutArea) + 1);
        int laidOutArea2 = rh.A03();
        return (int) (abs * laidOutArea2);
    }

    public static int A02(@javax.annotation.Nullable com.facebook.ads.redexgen.core.RH rh, @javax.annotation.Nullable com.facebook.ads.redexgen.core.AbstractC0980Qm abstractC0980Qm, android.view.View view, android.view.View view2, com.facebook.ads.redexgen.core.R2 r2, boolean z, boolean z2) {
        int laidOutArea;
        if (r2.A0Y() == 0 || rh.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        int maxPosition = java.lang.Math.min(r2.A0r(view), r2.A0r(view2));
        int A0r = r2.A0r(view);
        int minPosition = r2.A0r(view2);
        int max = java.lang.Math.max(A0r, minPosition);
        if (z2) {
            int minPosition2 = rh.A03();
            laidOutArea = java.lang.Math.max(0, (minPosition2 - max) - 1);
        } else {
            laidOutArea = java.lang.Math.max(0, maxPosition);
        }
        if (!z) {
            return laidOutArea;
        }
        int itemsBefore = abstractC0980Qm.A0C(view2);
        int minPosition3 = abstractC0980Qm.A0F(view);
        int maxPosition2 = java.lang.Math.abs(itemsBefore - minPosition3);
        int itemsBefore2 = r2.A0r(view);
        int minPosition4 = r2.A0r(view2);
        float abs = laidOutArea * (maxPosition2 / (java.lang.Math.abs(itemsBefore2 - minPosition4) + 1));
        int itemsBefore3 = abstractC0980Qm.A0A();
        int minPosition5 = abstractC0980Qm.A0F(view);
        return java.lang.Math.round(abs + (itemsBefore3 - minPosition5));
    }
}
