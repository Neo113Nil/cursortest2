package com.microblink.blinkid.ocr;

/* loaded from: classes10.dex */
class SlidingTabStrip extends android.widget.LinearLayout {
    private int Camera2StreamConfigurationMap;

    SlidingTabStrip(android.content.Context context) {
        super(context, null);
    }

    final void getHighSpeedVideoFpsRangesFor(int i) {
        int i2;
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                i2 = textView.getCurrentTextColor();
                textView.setTextColor(-1);
            } else {
                i2 = 0;
            }
            android.view.View childAt2 = getChildAt(this.Camera2StreamConfigurationMap);
            if (childAt2 instanceof android.widget.TextView) {
                android.widget.TextView textView2 = (android.widget.TextView) childAt2;
                if (i2 != 0) {
                    textView2.setTextColor(i2);
                }
            }
        }
        this.Camera2StreamConfigurationMap = i;
        invalidate();
    }
}
