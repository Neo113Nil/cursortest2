package com.github.mikephil.charting.listener;

/* loaded from: classes8.dex */
public class PieRadarChartTouchListener extends com.github.mikephil.charting.listener.ChartTouchListener<com.github.mikephil.charting.charts.PieRadarChartBase<?>> {
    private com.github.mikephil.charting.utils.MPPointF Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample> getHighSpeedVideoSizes;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        return true;
    }

    public PieRadarChartTouchListener(com.github.mikephil.charting.charts.PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.Camera2StreamConfigurationMap = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighSpeedVideoSizes = new java.util.ArrayList<>();
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getHighSpeedVideoFpsRanges = 0.0f;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        float abs;
        if (!this.mGestureDetector.onTouchEvent(motionEvent) && ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                startAction(motionEvent);
                stopDeceleration();
                this.getHighSpeedVideoSizes.clear();
                if (((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    Camera2StreamConfigurationMap(x, y);
                }
                setGestureStartAngle(x, y);
                this.Camera2StreamConfigurationMap.x = x;
                this.Camera2StreamConfigurationMap.y = y;
            } else if (action == 1) {
                if (((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    Camera2StreamConfigurationMap(x, y);
                    if (this.getHighSpeedVideoSizes.isEmpty()) {
                        abs = 0.0f;
                    } else {
                        com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample angularVelocitySample = this.getHighSpeedVideoSizes.get(0);
                        java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample> arrayList = this.getHighSpeedVideoSizes;
                        com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample angularVelocitySample2 = arrayList.get(arrayList.size() - 1);
                        com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample angularVelocitySample3 = angularVelocitySample;
                        for (int size = this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
                            angularVelocitySample3 = this.getHighSpeedVideoSizes.get(size);
                            if (angularVelocitySample3.getHighSpeedVideoFpsRanges != angularVelocitySample2.getHighSpeedVideoFpsRanges) {
                                break;
                            }
                        }
                        float f = (angularVelocitySample2.getHighSpeedVideoSizes - angularVelocitySample.getHighSpeedVideoSizes) / 1000.0f;
                        if (f == 0.0f) {
                            f = 0.1f;
                        }
                        boolean z = angularVelocitySample2.getHighSpeedVideoFpsRanges >= angularVelocitySample3.getHighSpeedVideoFpsRanges;
                        if (java.lang.Math.abs(angularVelocitySample2.getHighSpeedVideoFpsRanges - angularVelocitySample3.getHighSpeedVideoFpsRanges) > 270.0d) {
                            z = !z;
                        }
                        if (angularVelocitySample2.getHighSpeedVideoFpsRanges - angularVelocitySample.getHighSpeedVideoFpsRanges > 180.0d) {
                            angularVelocitySample.getHighSpeedVideoFpsRanges = (float) (angularVelocitySample.getHighSpeedVideoFpsRanges + 360.0d);
                        } else if (angularVelocitySample.getHighSpeedVideoFpsRanges - angularVelocitySample2.getHighSpeedVideoFpsRanges > 180.0d) {
                            angularVelocitySample2.getHighSpeedVideoFpsRanges = (float) (angularVelocitySample2.getHighSpeedVideoFpsRanges + 360.0d);
                        }
                        abs = java.lang.Math.abs((angularVelocitySample2.getHighSpeedVideoFpsRanges - angularVelocitySample.getHighSpeedVideoFpsRanges) / f);
                        if (!z) {
                            abs = -abs;
                        }
                    }
                    this.getHighSpeedVideoFpsRanges = abs;
                    if (abs != 0.0f) {
                        this.getHighResolutionOutputSizeshNQ4ISI = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                        com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
                    }
                }
                ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).enableScroll();
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action == 2) {
                if (((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    Camera2StreamConfigurationMap(x, y);
                }
                if (this.mTouchMode == 0 && distance(x, this.Camera2StreamConfigurationMap.x, y, this.Camera2StreamConfigurationMap.y) > com.github.mikephil.charting.utils.Utils.convertDpToPixel(8.0f)) {
                    this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.ROTATE;
                    this.mTouchMode = 6;
                    ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).disableScroll();
                } else if (this.mTouchMode == 6) {
                    updateGestureRotation(x, y);
                    ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).invalidate();
                }
                endAction(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.LONG_PRESS;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.SINGLE_TAP;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    private void Camera2StreamConfigurationMap(float f, float f2) {
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        this.getHighSpeedVideoSizes.add(new com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample(currentAnimationTimeMillis, ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getAngleForPoint(f, f2)));
        for (int size = this.getHighSpeedVideoSizes.size(); size - 2 > 0 && currentAnimationTimeMillis - this.getHighSpeedVideoSizes.get(0).getHighSpeedVideoSizes > 1000; size--) {
            this.getHighSpeedVideoSizes.remove(0);
        }
    }

    public void setGestureStartAngle(float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor = ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getAngleForPoint(f, f2) - ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    public void updateGestureRotation(float f, float f2) {
        ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).setRotationAngle(((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getAngleForPoint(f, f2) - this.getHighSpeedVideoFpsRangesFor);
    }

    public void stopDeceleration() {
        this.getHighSpeedVideoFpsRanges = 0.0f;
    }

    public void computeScroll() {
        if (this.getHighSpeedVideoFpsRanges == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        this.getHighSpeedVideoFpsRanges *= ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef();
        ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).setRotationAngle(((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getRotationAngle() + (this.getHighSpeedVideoFpsRanges * ((currentAnimationTimeMillis - this.getHighResolutionOutputSizeshNQ4ISI) / 1000.0f)));
        this.getHighResolutionOutputSizeshNQ4ISI = currentAnimationTimeMillis;
        if (java.lang.Math.abs(this.getHighSpeedVideoFpsRanges) >= 0.001d) {
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
        } else {
            stopDeceleration();
        }
    }

    class AngularVelocitySample {
        public float getHighSpeedVideoFpsRanges;
        public long getHighSpeedVideoSizes;

        public AngularVelocitySample(long j, float f) {
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRanges = f;
        }
    }
}
