package androidx.appcompat.widget;

/* loaded from: classes5.dex */
class TooltipCompatHandler implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {
    private static androidx.appcompat.widget.TooltipCompatHandler getHighResolutionOutputSizeshNQ4ISI;
    private static androidx.appcompat.widget.TooltipCompatHandler getHighSpeedVideoSizes;
    private int Camera2StreamConfigurationMap;
    private final android.view.View getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private androidx.appcompat.widget.TooltipPopup getOutputFormats;
    private final java.lang.Runnable getOutputMinFrameDuration;
    private final java.lang.Runnable getOutputSizes;
    private final java.lang.CharSequence getOutputStallDuration;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    /* synthetic */ void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI(false);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor = view.getWidth() / 2;
        this.Camera2StreamConfigurationMap = view.getHeight() / 2;
        getHighResolutionOutputSizeshNQ4ISI(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.getOutputFormats != null && this.getInputSizeshNQ4ISI) {
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.getHighSpeedVideoFpsRanges.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                getHighSpeedVideoFpsRanges();
                getHighSpeedVideoFpsRangesFor();
            }
        } else if (this.getHighSpeedVideoFpsRanges.isEnabled() && this.getOutputFormats == null && getHighResolutionOutputSizeshNQ4ISI(motionEvent)) {
            getHighSpeedVideoFpsRanges(this);
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        getHighSpeedVideoFpsRangesFor();
    }

    void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        int height;
        int i;
        long longPressTimeout;
        long j;
        long j2;
        if (this.getHighSpeedVideoFpsRanges.isAttachedToWindow()) {
            getHighSpeedVideoFpsRanges(null);
            androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler = getHighSpeedVideoSizes;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.getHighSpeedVideoFpsRangesFor();
            }
            getHighSpeedVideoSizes = this;
            this.getInputSizeshNQ4ISI = z;
            androidx.appcompat.widget.TooltipPopup tooltipPopup = new androidx.appcompat.widget.TooltipPopup(this.getHighSpeedVideoFpsRanges.getContext());
            this.getOutputFormats = tooltipPopup;
            android.view.View view = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = this.Camera2StreamConfigurationMap;
            boolean z2 = this.getInputSizeshNQ4ISI;
            java.lang.CharSequence charSequence = this.getOutputStallDuration;
            if (tooltipPopup.getHighSpeedVideoSizes.getParent() != null) {
                tooltipPopup.getHighSpeedVideoFpsRanges();
            }
            tooltipPopup.getHighSpeedVideoFpsRanges.setText(charSequence);
            android.view.WindowManager.LayoutParams layoutParams = tooltipPopup.getHighResolutionOutputSizeshNQ4ISI;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = tooltipPopup.Camera2StreamConfigurationMap.getResources().getDimensionPixelOffset(androidx.appcompat.R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = tooltipPopup.Camera2StreamConfigurationMap.getResources().getDimensionPixelOffset(androidx.appcompat.R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = tooltipPopup.Camera2StreamConfigurationMap.getResources().getDimensionPixelOffset(z2 ? androidx.appcompat.R.dimen.tooltip_y_offset_touch : androidx.appcompat.R.dimen.tooltip_y_offset_non_touch);
            android.view.View highSpeedVideoFpsRangesFor = androidx.appcompat.widget.TooltipPopup.getHighSpeedVideoFpsRangesFor(view);
            if (highSpeedVideoFpsRangesFor != null) {
                highSpeedVideoFpsRangesFor.getWindowVisibleDisplayFrame(tooltipPopup.getInputSizeshNQ4ISI);
                if (tooltipPopup.getInputSizeshNQ4ISI.left < 0 && tooltipPopup.getInputSizeshNQ4ISI.top < 0) {
                    android.content.res.Resources resources = tooltipPopup.Camera2StreamConfigurationMap.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    tooltipPopup.getInputSizeshNQ4ISI.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                highSpeedVideoFpsRangesFor.getLocationOnScreen(tooltipPopup.getInputFormats);
                view.getLocationOnScreen(tooltipPopup.getHighSpeedVideoFpsRangesFor);
                int[] iArr = tooltipPopup.getHighSpeedVideoFpsRangesFor;
                int i4 = iArr[0];
                int[] iArr2 = tooltipPopup.getInputFormats;
                int i5 = i4 - iArr2[0];
                iArr[0] = i5;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i5 + i2) - (highSpeedVideoFpsRangesFor.getWidth() / 2);
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                tooltipPopup.getHighSpeedVideoSizes.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = tooltipPopup.getHighSpeedVideoSizes.getMeasuredHeight();
                int i6 = tooltipPopup.getHighSpeedVideoFpsRangesFor[1];
                int i7 = ((i + i6) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (!z2) {
                    if (measuredHeight + i8 <= tooltipPopup.getInputSizeshNQ4ISI.height()) {
                        layoutParams.y = i8;
                    }
                    layoutParams.y = i7;
                } else {
                    if (i7 < 0) {
                        layoutParams.y = i8;
                    }
                    layoutParams.y = i7;
                }
            }
            ((android.view.WindowManager) tooltipPopup.Camera2StreamConfigurationMap.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).addView(tooltipPopup.getHighSpeedVideoSizes, tooltipPopup.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges.addOnAttachStateChangeListener(this);
            if (this.getInputSizeshNQ4ISI) {
                j2 = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.DELAY;
            } else {
                if ((androidx.core.view.ViewCompat.getWindowSystemUiVisibility(this.getHighSpeedVideoFpsRanges) & 1) == 1) {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.getHighSpeedVideoFpsRanges.removeCallbacks(this.getOutputMinFrameDuration);
            this.getHighSpeedVideoFpsRanges.postDelayed(this.getOutputMinFrameDuration, j2);
        }
    }

    void getHighSpeedVideoFpsRangesFor() {
        if (getHighSpeedVideoSizes == this) {
            getHighSpeedVideoSizes = null;
            androidx.appcompat.widget.TooltipPopup tooltipPopup = this.getOutputFormats;
            if (tooltipPopup != null) {
                tooltipPopup.getHighSpeedVideoFpsRanges();
                this.getOutputFormats = null;
                getHighSpeedVideoFpsRanges();
                this.getHighSpeedVideoFpsRanges.removeOnAttachStateChangeListener(this);
            }
        }
        if (getHighResolutionOutputSizeshNQ4ISI == this) {
            getHighSpeedVideoFpsRanges(null);
        }
        this.getHighSpeedVideoFpsRanges.removeCallbacks(this.getOutputMinFrameDuration);
    }

    private static void getHighSpeedVideoFpsRanges(androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler) {
        androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler2 = getHighResolutionOutputSizeshNQ4ISI;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.Camera2StreamConfigurationMap();
        }
        getHighResolutionOutputSizeshNQ4ISI = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighSpeedVideoFpsRanges.postDelayed(this.getOutputSizes, android.view.ViewConfiguration.getLongPressTimeout());
    }

    private void Camera2StreamConfigurationMap() {
        this.getHighSpeedVideoFpsRanges.removeCallbacks(this.getOutputSizes);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.view.MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.getHighSpeedVideoSizesFor && java.lang.Math.abs(x - this.getHighSpeedVideoFpsRangesFor) <= this.getInputFormats && java.lang.Math.abs(y - this.Camera2StreamConfigurationMap) <= this.getInputFormats) {
            return false;
        }
        this.getHighSpeedVideoFpsRangesFor = x;
        this.Camera2StreamConfigurationMap = y;
        this.getHighSpeedVideoSizesFor = false;
        return true;
    }

    private void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoSizesFor = true;
    }
}
