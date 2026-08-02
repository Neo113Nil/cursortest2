package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class FitWindowsFrameLayout extends android.widget.FrameLayout implements androidx.appcompat.widget.FitWindowsViewGroup {
    private androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener getHighSpeedVideoSizes;

    public FitWindowsFrameLayout(android.content.Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.FitWindowsViewGroup
    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.getHighSpeedVideoSizes = onFitSystemWindowsListener;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect rect) {
        androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener = this.getHighSpeedVideoSizes;
        if (onFitSystemWindowsListener != null) {
            onFitSystemWindowsListener.onFitSystemWindows(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
