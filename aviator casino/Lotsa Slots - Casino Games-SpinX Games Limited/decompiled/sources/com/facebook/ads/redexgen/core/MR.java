package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class MR extends com.facebook.ads.redexgen.core.C1330bk {
    public static java.lang.String[] A01 = {"Er9uQMazYAvywc84qssi8CcPD5K", "bpAOsy1ZAool4ZO", "456cLSbicHverE2", "OQn0GSeoKkB55mmrW6XfcsGu8yTW4vwY", "5C5KK7QE3ZVmFSCl85soxjy8aya", "FZZqXqYfqR5sLOGe", "aaYiwVUQ6XuTYr3PnCNNWh", "fICxnQOCOsz8JBbFc5EZnQUEppLIkjem"};
    public android.widget.ImageView.ScaleType A00;

    public MR(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
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
                    android.widget.ImageView.ScaleType scaleType = this.A00;
                    int widthSpecSize = A01[2].length();
                    if (widthSpecSize != 15) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[0] = "1TQeY3NJoCywMKTf";
                    super.setScaleType(scaleType);
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
            int heightSpecSize5 = android.view.View.MeasureSpec.getMode(i2);
            if (heightSpecSize5 == 1073741824) {
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
