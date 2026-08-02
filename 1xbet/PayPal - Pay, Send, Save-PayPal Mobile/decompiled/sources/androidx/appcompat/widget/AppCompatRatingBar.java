package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatRatingBar extends android.widget.RatingBar {
    private final androidx.appcompat.widget.AppCompatProgressBarHelper getHighSpeedVideoSizes;

    public AppCompatRatingBar(android.content.Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatProgressBarHelper appCompatProgressBarHelper = new androidx.appcompat.widget.AppCompatProgressBarHelper(this);
        this.getHighSpeedVideoSizes = appCompatProgressBarHelper;
        appCompatProgressBarHelper.Camera2StreamConfigurationMap(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i, i2);
            android.graphics.Bitmap highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges != null) {
                setMeasuredDimension(android.view.View.resolveSizeAndState(highSpeedVideoFpsRanges.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
            }
        }
    }
}
