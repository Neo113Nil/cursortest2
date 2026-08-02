package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class FitWindowsLinearLayout extends android.widget.LinearLayout implements androidx.appcompat.widget.FitWindowsViewGroup {
    private androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener Camera2StreamConfigurationMap;

    public FitWindowsLinearLayout(android.content.Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.FitWindowsViewGroup
    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.Camera2StreamConfigurationMap = onFitSystemWindowsListener;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect rect) {
        androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener = this.Camera2StreamConfigurationMap;
        if (onFitSystemWindowsListener != null) {
            onFitSystemWindowsListener.onFitSystemWindows(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
