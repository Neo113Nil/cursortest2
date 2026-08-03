package com.inmobi.media;

/* loaded from: classes5.dex */
public final class T extends com.inmobi.media.Lo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.U f4965a;

    public T(com.inmobi.media.U u) {
        this.f4965a = u;
    }

    @Override // com.inmobi.media.Lo
    public final void a(android.view.WindowInsets insets) {
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        android.graphics.RectF rectF3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.u()) {
            android.view.RoundedCorner roundedCorner = insets.getRoundedCorner(0);
            int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
            android.view.RoundedCorner roundedCorner2 = insets.getRoundedCorner(1);
            int radius2 = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            android.view.RoundedCorner roundedCorner3 = insets.getRoundedCorner(2);
            int radius3 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            android.view.RoundedCorner roundedCorner4 = insets.getRoundedCorner(3);
            int radius4 = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
            android.view.RoundedCorner roundedCorner5 = insets.getRoundedCorner(0);
            android.graphics.RectF rectF4 = null;
            android.graphics.Point center = roundedCorner5 != null ? roundedCorner5.getCenter() : null;
            android.view.RoundedCorner roundedCorner6 = insets.getRoundedCorner(1);
            android.graphics.Point center2 = roundedCorner6 != null ? roundedCorner6.getCenter() : null;
            android.view.RoundedCorner roundedCorner7 = insets.getRoundedCorner(2);
            android.graphics.Point center3 = roundedCorner7 != null ? roundedCorner7.getCenter() : null;
            android.view.RoundedCorner roundedCorner8 = insets.getRoundedCorner(3);
            android.graphics.Point center4 = roundedCorner8 != null ? roundedCorner8.getCenter() : null;
            if (radius <= 0 || center == null) {
                rectF = null;
            } else {
                rectF = new android.graphics.RectF(r9 - radius, r0 - radius, center.x, center.y);
            }
            if (radius2 <= 0 || center2 == null) {
                rectF2 = null;
            } else {
                rectF2 = new android.graphics.RectF(center2.x, r2 - radius, r9 + radius2, center2.y);
            }
            if (radius4 <= 0 || center4 == null) {
                rectF3 = null;
            } else {
                int i = center4.x;
                rectF3 = new android.graphics.RectF(i - radius4, center4.y, i, r13 + radius4);
            }
            if (radius3 > 0 && center3 != null) {
                rectF4 = new android.graphics.RectF(center3.x, center3.y, r13 + radius3, r3 + radius3);
            }
            this.f4965a.g = new com.inmobi.media.L(rectF, rectF2, rectF3, rectF4);
        }
    }
}
