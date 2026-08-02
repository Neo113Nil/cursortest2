package androidx.core.widget;

/* loaded from: classes7.dex */
public class ContentLoadingProgressBar extends android.widget.ProgressBar {
    boolean Camera2StreamConfigurationMap;
    private final java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    private final java.lang.Runnable getHighSpeedVideoSizesFor;

    public ContentLoadingProgressBar(android.content.Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.getHighSpeedVideoFpsRangesFor = -1L;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = false;
        this.Camera2StreamConfigurationMap = false;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.core.widget.ContentLoadingProgressBar contentLoadingProgressBar = androidx.core.widget.ContentLoadingProgressBar.this;
                contentLoadingProgressBar.getHighSpeedVideoFpsRanges = false;
                contentLoadingProgressBar.getHighSpeedVideoFpsRangesFor = -1L;
                contentLoadingProgressBar.setVisibility(8);
            }
        };
        this.getHighSpeedVideoSizesFor = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.core.widget.ContentLoadingProgressBar contentLoadingProgressBar = androidx.core.widget.ContentLoadingProgressBar.this;
                contentLoadingProgressBar.getHighSpeedVideoSizes = false;
                if (contentLoadingProgressBar.Camera2StreamConfigurationMap) {
                    return;
                }
                contentLoadingProgressBar.getHighSpeedVideoFpsRangesFor = java.lang.System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.getHighResolutionOutputSizeshNQ4ISI);
        removeCallbacks(this.getHighSpeedVideoSizesFor);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.getHighResolutionOutputSizeshNQ4ISI);
        removeCallbacks(this.getHighSpeedVideoSizesFor);
    }

    public void hide() {
        post(new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.core.widget.ContentLoadingProgressBar.m9062$r8$lambda$LzWHroRwziRn4m5pHwlpZWokBw(androidx.core.widget.ContentLoadingProgressBar.this);
            }
        });
    }

    public void show() {
        post(new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.core.widget.ContentLoadingProgressBar.m9061$r8$lambda$QLbnDmeB_t0R62xLMJCkjyagZI(androidx.core.widget.ContentLoadingProgressBar.this);
            }
        });
    }

    /* renamed from: $r8$lambda$-QLbnDmeB_t0R62xLMJCkjyagZI, reason: not valid java name */
    public static /* synthetic */ void m9061$r8$lambda$QLbnDmeB_t0R62xLMJCkjyagZI(androidx.core.widget.ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.getHighSpeedVideoFpsRangesFor = -1L;
        contentLoadingProgressBar.Camera2StreamConfigurationMap = false;
        contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.getHighResolutionOutputSizeshNQ4ISI);
        contentLoadingProgressBar.getHighSpeedVideoFpsRanges = false;
        if (contentLoadingProgressBar.getHighSpeedVideoSizes) {
            return;
        }
        contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.getHighSpeedVideoSizesFor, 500L);
        contentLoadingProgressBar.getHighSpeedVideoSizes = true;
    }

    /* renamed from: $r8$lambda$LzWHroRwziRn4m5pH-wlpZWokBw, reason: not valid java name */
    public static /* synthetic */ void m9062$r8$lambda$LzWHroRwziRn4m5pHwlpZWokBw(androidx.core.widget.ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.Camera2StreamConfigurationMap = true;
        contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.getHighSpeedVideoSizesFor);
        contentLoadingProgressBar.getHighSpeedVideoSizes = false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = contentLoadingProgressBar.getHighSpeedVideoFpsRangesFor;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            contentLoadingProgressBar.setVisibility(8);
        } else {
            if (contentLoadingProgressBar.getHighSpeedVideoFpsRanges) {
                return;
            }
            contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.getHighResolutionOutputSizeshNQ4ISI, 500 - j2);
            contentLoadingProgressBar.getHighSpeedVideoFpsRanges = true;
        }
    }
}
