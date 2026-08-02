package com.github.mikephil.charting.listener;

/* loaded from: classes8.dex */
public class BarLineChartTouchListener extends com.github.mikephil.charting.listener.ChartTouchListener<com.github.mikephil.charting.charts.BarLineChartBase<? extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>>> {
    private float Camera2StreamConfigurationMap;
    private com.github.mikephil.charting.utils.MPPointF getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRanges;
    private com.github.mikephil.charting.interfaces.datasets.IDataSet getHighSpeedVideoFpsRangesFor;
    private com.github.mikephil.charting.utils.MPPointF getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private float getInputFormats;
    private android.graphics.Matrix getInputSizeshNQ4ISI;
    private android.graphics.Matrix getOutputFormats;
    private float getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    private com.github.mikephil.charting.utils.MPPointF getOutputSizes;
    private com.github.mikephil.charting.utils.MPPointF getOutputSizeshNQ4ISI;
    private android.view.VelocityTracker getOutputStallDuration;

    public BarLineChartTouchListener(com.github.mikephil.charting.charts.BarLineChartBase<? extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>> barLineChartBase, android.graphics.Matrix matrix, float f) {
        super(barLineChartBase);
        this.getInputSizeshNQ4ISI = new android.graphics.Matrix();
        this.getOutputFormats = new android.graphics.Matrix();
        this.getOutputSizes = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getOutputSizeshNQ4ISI = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getHighSpeedVideoSizesFor = 1.0f;
        this.getOutputMinFrameDurationlomOqCM = 1.0f;
        this.getInputFormats = 1.0f;
        this.getHighSpeedVideoFpsRanges = 0L;
        this.getHighResolutionOutputSizeshNQ4ISI = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getHighSpeedVideoSizes = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getInputSizeshNQ4ISI = matrix;
        this.Camera2StreamConfigurationMap = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        this.getOutputMinFrameDuration = com.github.mikephil.charting.utils.Utils.convertDpToPixel(3.5f);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean canZoomInMoreY;
        boolean canZoomInMoreX;
        boolean canZoomInMoreX2;
        boolean canZoomInMoreY2;
        com.github.mikephil.charting.highlight.Highlight highlightByTouchPoint;
        android.view.VelocityTracker velocityTracker;
        if (this.getOutputStallDuration == null) {
            this.getOutputStallDuration = android.view.VelocityTracker.obtain();
        }
        this.getOutputStallDuration.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.getOutputStallDuration) != null) {
            velocityTracker.recycle();
            this.getOutputStallDuration = null;
        }
        if (this.mTouchMode == 0) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (!((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragEnabled() && !((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() && !((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                android.view.VelocityTracker velocityTracker2 = this.getOutputStallDuration;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, com.github.mikephil.charting.utils.Utils.getMaximumFlingVelocity());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((java.lang.Math.abs(xVelocity) > com.github.mikephil.charting.utils.Utils.getMinimumFlingVelocity() || java.lang.Math.abs(yVelocity) > com.github.mikephil.charting.utils.Utils.getMinimumFlingVelocity()) && this.mTouchMode == 1 && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    this.getHighSpeedVideoFpsRanges = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                    this.getHighResolutionOutputSizeshNQ4ISI.x = motionEvent.getX();
                    this.getHighResolutionOutputSizeshNQ4ISI.y = motionEvent.getY();
                    this.getHighSpeedVideoSizes.x = xVelocity;
                    this.getHighSpeedVideoSizes.y = yVelocity;
                    com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
                }
                if (this.mTouchMode == 2 || this.mTouchMode == 3 || this.mTouchMode == 4 || this.mTouchMode == 5) {
                    ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).calculateOffsets();
                    ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).postInvalidate();
                }
                this.mTouchMode = 0;
                ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).enableScroll();
                android.view.VelocityTracker velocityTracker3 = this.getOutputStallDuration;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.getOutputStallDuration = null;
                }
                endAction(motionEvent);
            } else if (action != 2) {
                if (action == 3) {
                    this.mTouchMode = 0;
                    endAction(motionEvent);
                } else if (action != 5) {
                    if (action == 6) {
                        com.github.mikephil.charting.utils.Utils.velocityTrackerPointerUpCleanUpIfNecessary(motionEvent, this.getOutputStallDuration);
                        this.mTouchMode = 5;
                    }
                } else if (motionEvent.getPointerCount() >= 2) {
                    ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).disableScroll();
                    getHighSpeedVideoFpsRangesFor(motionEvent);
                    this.getHighSpeedVideoSizesFor = java.lang.Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                    this.getOutputMinFrameDurationlomOqCM = java.lang.Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                    float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(motionEvent);
                    this.getInputFormats = highResolutionOutputSizeshNQ4ISI;
                    if (highResolutionOutputSizeshNQ4ISI > 10.0f) {
                        if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isPinchZoomEnabled()) {
                            this.mTouchMode = 4;
                        } else if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() != ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) {
                            this.mTouchMode = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() ? 2 : 3;
                        } else {
                            this.mTouchMode = this.getHighSpeedVideoSizesFor > this.getOutputMinFrameDurationlomOqCM ? 2 : 3;
                        }
                    }
                    com.github.mikephil.charting.utils.MPPointF mPPointF = this.getOutputSizeshNQ4ISI;
                    float x = motionEvent.getX(0);
                    float x2 = motionEvent.getX(1);
                    float y = motionEvent.getY(0);
                    float y2 = motionEvent.getY(1);
                    mPPointF.x = (x + x2) / 2.0f;
                    mPPointF.y = (y + y2) / 2.0f;
                }
            } else if (this.mTouchMode == 1) {
                ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).disableScroll();
                getHighSpeedVideoFpsRanges(motionEvent, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragXEnabled() ? motionEvent.getX() - this.getOutputSizes.x : 0.0f, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragYEnabled() ? motionEvent.getY() - this.getOutputSizes.y : 0.0f);
            } else if (this.mTouchMode == 2 || this.mTouchMode == 3 || this.mTouchMode == 4) {
                ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).disableScroll();
                if ((((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() || ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) && motionEvent.getPointerCount() >= 2) {
                    com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
                    float highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(motionEvent);
                    if (highResolutionOutputSizeshNQ4ISI2 > this.getOutputMinFrameDuration) {
                        com.github.mikephil.charting.utils.MPPointF trans = getTrans(this.getOutputSizeshNQ4ISI.x, this.getOutputSizeshNQ4ISI.y);
                        com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler();
                        if (this.mTouchMode == 4) {
                            this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.PINCH_ZOOM;
                            float f = highResolutionOutputSizeshNQ4ISI2 / this.getInputFormats;
                            boolean z = f < 1.0f;
                            if (z) {
                                canZoomInMoreX2 = viewPortHandler.canZoomOutMoreX();
                            } else {
                                canZoomInMoreX2 = viewPortHandler.canZoomInMoreX();
                            }
                            if (z) {
                                canZoomInMoreY2 = viewPortHandler.canZoomOutMoreY();
                            } else {
                                canZoomInMoreY2 = viewPortHandler.canZoomInMoreY();
                            }
                            float f2 = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() ? f : 1.0f;
                            float f3 = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled() ? f : 1.0f;
                            if (canZoomInMoreY2 || canZoomInMoreX2) {
                                this.getInputSizeshNQ4ISI.set(this.getOutputFormats);
                                this.getInputSizeshNQ4ISI.postScale(f2, f3, trans.x, trans.y);
                                if (onChartGestureListener != null) {
                                    onChartGestureListener.onChartScale(motionEvent, f2, f3);
                                }
                            }
                        } else if (this.mTouchMode == 2 && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled()) {
                            this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.X_ZOOM;
                            float abs = java.lang.Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.getHighSpeedVideoSizesFor;
                            if (abs < 1.0f) {
                                canZoomInMoreX = viewPortHandler.canZoomOutMoreX();
                            } else {
                                canZoomInMoreX = viewPortHandler.canZoomInMoreX();
                            }
                            if (canZoomInMoreX) {
                                this.getInputSizeshNQ4ISI.set(this.getOutputFormats);
                                this.getInputSizeshNQ4ISI.postScale(abs, 1.0f, trans.x, trans.y);
                                if (onChartGestureListener != null) {
                                    onChartGestureListener.onChartScale(motionEvent, abs, 1.0f);
                                }
                            }
                        } else if (this.mTouchMode == 3 && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) {
                            this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.Y_ZOOM;
                            float abs2 = java.lang.Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.getOutputMinFrameDurationlomOqCM;
                            if (abs2 < 1.0f) {
                                canZoomInMoreY = viewPortHandler.canZoomOutMoreY();
                            } else {
                                canZoomInMoreY = viewPortHandler.canZoomInMoreY();
                            }
                            if (canZoomInMoreY) {
                                this.getInputSizeshNQ4ISI.set(this.getOutputFormats);
                                this.getInputSizeshNQ4ISI.postScale(1.0f, abs2, trans.x, trans.y);
                                if (onChartGestureListener != null) {
                                    onChartGestureListener.onChartScale(motionEvent, 1.0f, abs2);
                                }
                            }
                        }
                        com.github.mikephil.charting.utils.MPPointF.recycleInstance(trans);
                    }
                }
            } else if (this.mTouchMode == 0 && java.lang.Math.abs(distance(motionEvent.getX(), this.getOutputSizes.x, motionEvent.getY(), this.getOutputSizes.y)) > this.Camera2StreamConfigurationMap && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragEnabled()) {
                if (!((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isFullyZoomedOut() || !((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).hasNoDragOffset()) {
                    float abs3 = java.lang.Math.abs(motionEvent.getX() - this.getOutputSizes.x);
                    float abs4 = java.lang.Math.abs(motionEvent.getY() - this.getOutputSizes.y);
                    if ((((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragXEnabled() || abs4 >= abs3) && (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragYEnabled() || abs4 <= abs3)) {
                        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG;
                        this.mTouchMode = 1;
                    }
                } else if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                    this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG;
                    if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isHighlightPerDragEnabled() && (highlightByTouchPoint = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY())) != null && !highlightByTouchPoint.equalTo(this.mLastHighlighted)) {
                        this.mLastHighlighted = highlightByTouchPoint;
                        ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).highlightValue(highlightByTouchPoint, true);
                    }
                }
            }
        } else {
            startAction(motionEvent);
            stopDeceleration();
            getHighSpeedVideoFpsRangesFor(motionEvent);
        }
        this.getInputSizeshNQ4ISI = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.getInputSizeshNQ4ISI, this.mChart, true);
        return true;
    }

    private void getHighSpeedVideoFpsRangesFor(android.view.MotionEvent motionEvent) {
        this.getOutputFormats.set(this.getInputSizeshNQ4ISI);
        this.getOutputSizes.x = motionEvent.getX();
        this.getOutputSizes.y = motionEvent.getY();
        this.getHighSpeedVideoFpsRangesFor = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    private void getHighSpeedVideoFpsRanges(android.view.MotionEvent motionEvent, float f, float f2) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG;
        this.getInputSizeshNQ4ISI.set(this.getOutputFormats);
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (getHighSpeedVideoFpsRangesFor()) {
            if (this.mChart instanceof com.github.mikephil.charting.charts.HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.getInputSizeshNQ4ISI.postTranslate(f, f2);
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartTranslate(motionEvent, f, f2);
        }
    }

    private static float getHighResolutionOutputSizeshNQ4ISI(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) java.lang.Math.sqrt((x * x) + (y * y));
    }

    public com.github.mikephil.charting.utils.MPPointF getTrans(float f, float f2) {
        float f3;
        com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler();
        float offsetLeft = viewPortHandler.offsetLeft();
        if (getHighSpeedVideoFpsRangesFor()) {
            f3 = -(f2 - viewPortHandler.offsetTop());
        } else {
            f3 = -((((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getMeasuredHeight() - f2) - viewPortHandler.offsetBottom());
        }
        return com.github.mikephil.charting.utils.MPPointF.getInstance(f - offsetLeft, f3);
    }

    private boolean getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoFpsRangesFor == null && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isAnyAxisInverted()) {
            return true;
        }
        return this.getHighSpeedVideoFpsRangesFor != null && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isInverted(this.getHighSpeedVideoFpsRangesFor.getAxisDependency());
    }

    public android.graphics.Matrix getMatrix() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setDragTriggerDist(float f) {
        this.Camera2StreamConfigurationMap = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DOUBLE_TAP;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartDoubleTapped(motionEvent);
        }
        if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDoubleTapToZoomEnabled() && ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getData()).getEntryCount() > 0) {
            com.github.mikephil.charting.utils.MPPointF trans = getTrans(motionEvent.getX(), motionEvent.getY());
            ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).zoom(((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() ? 1.4f : 1.0f, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled() ? 1.4f : 1.0f, trans.x, trans.y);
            if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isLogEnabled()) {
                float f = trans.x;
                float f2 = trans.y;
            }
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(trans);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.LONG_PRESS;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.SINGLE_TAP;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.FLING;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartFling(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void stopDeceleration() {
        this.getHighSpeedVideoSizes.x = 0.0f;
        this.getHighSpeedVideoSizes.y = 0.0f;
    }

    public void computeScroll() {
        if (this.getHighSpeedVideoSizes.x == 0.0f && this.getHighSpeedVideoSizes.y == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        this.getHighSpeedVideoSizes.x *= ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        this.getHighSpeedVideoSizes.y *= ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        float f = (currentAnimationTimeMillis - this.getHighSpeedVideoFpsRanges) / 1000.0f;
        float f2 = this.getHighSpeedVideoSizes.x;
        float f3 = this.getHighSpeedVideoSizes.y;
        this.getHighResolutionOutputSizeshNQ4ISI.x += f2 * f;
        this.getHighResolutionOutputSizeshNQ4ISI.y += f3 * f;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, this.getHighResolutionOutputSizeshNQ4ISI.x, this.getHighResolutionOutputSizeshNQ4ISI.y, 0);
        getHighSpeedVideoFpsRanges(obtain, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragXEnabled() ? this.getHighResolutionOutputSizeshNQ4ISI.x - this.getOutputSizes.x : 0.0f, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragYEnabled() ? this.getHighResolutionOutputSizeshNQ4ISI.y - this.getOutputSizes.y : 0.0f);
        obtain.recycle();
        this.getInputSizeshNQ4ISI = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.getInputSizeshNQ4ISI, this.mChart, false);
        this.getHighSpeedVideoFpsRanges = currentAnimationTimeMillis;
        if (java.lang.Math.abs(this.getHighSpeedVideoSizes.x) >= 0.01d || java.lang.Math.abs(this.getHighSpeedVideoSizes.y) >= 0.01d) {
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
            return;
        }
        ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).calculateOffsets();
        ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).postInvalidate();
        stopDeceleration();
    }
}
