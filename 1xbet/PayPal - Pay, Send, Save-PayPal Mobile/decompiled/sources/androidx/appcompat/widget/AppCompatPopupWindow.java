package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatPopupWindow extends android.widget.PopupWindow {
    private static final boolean Camera2StreamConfigurationMap = false;
    private boolean getHighSpeedVideoFpsRangesFor;

    public AppCompatPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getHighSpeedVideoFpsRanges(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        getHighSpeedVideoFpsRanges(context, attributeSet, i, i2);
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.PopupWindow, i, i2);
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.PopupWindow_overlapAnchor)) {
            getHighSpeedVideoSizes(obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.PopupWindow_android_popupBackground));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2) {
        if (Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        if (Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View view, int i, int i2, int i3, int i4) {
        if (Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private void getHighSpeedVideoSizes(boolean z) {
        if (Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor = z;
        } else {
            androidx.core.widget.PopupWindowCompat.setOverlapAnchor(this, z);
        }
    }
}
