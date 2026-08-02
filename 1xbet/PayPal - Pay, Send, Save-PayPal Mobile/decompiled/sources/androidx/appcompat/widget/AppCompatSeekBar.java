package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatSeekBar extends android.widget.SeekBar {
    private final androidx.appcompat.widget.AppCompatSeekBarHelper getHighSpeedVideoSizes;

    public AppCompatSeekBar(android.content.Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatSeekBarHelper appCompatSeekBarHelper = new androidx.appcompat.widget.AppCompatSeekBarHelper(this);
        this.getHighSpeedVideoSizes = appCompatSeekBarHelper;
        appCompatSeekBarHelper.Camera2StreamConfigurationMap(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
    }
}
