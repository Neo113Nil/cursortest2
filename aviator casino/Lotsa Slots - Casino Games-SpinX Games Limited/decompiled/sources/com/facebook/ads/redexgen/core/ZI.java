package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZI extends android.widget.ImageView {
    public static java.lang.String[] A01 = {"zJ2", "QjUwZCbDUlfOcmdTeXyvd13", "pmgXUgQY3G9embGve5GBnFw0VEVT9oeH", "awdDomzwyqRyeOiEyYHeXSv00pR55TnX", "BJj1MoNnpM6JKdO5Mh8uM61yAFI5TCy", "1E", "dRD1sNctYpeCeu2V1pPS6WM", "8C9irfg3VZNd6lZFm"};
    public android.widget.ImageView.ScaleType A00;

    public ZI(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i);
        int heightSpecSize = android.view.View.MeasureSpec.getMode(i);
        if (heightSpecSize == 1073741824) {
            int heightSpecSize2 = android.view.View.MeasureSpec.getMode(i2);
            if (heightSpecSize2 == 1073741824) {
                int heightSpecSize3 = java.lang.Math.min(size2, size);
                setMeasuredDimension(heightSpecSize3, heightSpecSize3);
                if (this.A00 == null) {
                    super.setScaleType(this.A00);
                    return;
                }
                return;
            }
        }
        int heightSpecSize4 = android.view.View.MeasureSpec.getMode(i);
        if (heightSpecSize4 == 1073741824) {
            if (size > 0) {
                size2 = java.lang.Math.min(size2, size);
            }
            setMeasuredDimension(size2, size2);
        } else {
            int mode = android.view.View.MeasureSpec.getMode(i2);
            int widthSpecSize = A01[6].length();
            if (widthSpecSize == 25) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "z6sTWRHNr9jgarJvj";
            if (mode == 1073741824) {
                if (size2 > 0) {
                    size = java.lang.Math.min(size2, size);
                }
                setMeasuredDimension(size, size);
            } else {
                super.onMeasure(i, i2);
            }
        }
        if (this.A00 == null) {
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
