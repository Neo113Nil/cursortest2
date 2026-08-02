package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class FastScroller extends androidx.recyclerview.widget.RecyclerView.ItemDecoration implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
    private static final int[] isOutputSupportedForhNQ4ISI = {android.R.attr.state_pressed};
    private static final int[] unwrapAs = new int[0];
    private final int ArtificialStackFrames;
    int Camera2StreamConfigurationMap;
    private final java.lang.Runnable CoroutineDebuggingKt;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener _BOUNDARY;
    private final int _CREATION;
    private final android.graphics.drawable.Drawable accessartificialFrame;
    private final int b;
    private final int c;
    private final android.graphics.drawable.StateListDrawable coroutineCreation;
    private final int getARTIFICIAL_FRAME_PACKAGE_NAME;
    int getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;
    final int getInputFormats;
    androidx.recyclerview.widget.RecyclerView getOutputMinFrameDuration;
    final android.animation.ValueAnimator getOutputMinFrameDurationlomOqCM;
    final android.graphics.drawable.StateListDrawable getOutputSizes;
    int getOutputStallDuration;
    float getOutputStallDurationlomOqCM;
    int isOutputSupportedFor;
    final android.graphics.drawable.Drawable toString;
    int getOutputFormats = 0;
    int getHighSpeedVideoSizesFor = 0;
    boolean getInputSizeshNQ4ISI = false;
    boolean getHighSpeedVideoFpsRangesFor = false;
    int getOutputSizeshNQ4ISI = 0;
    private int getValidOutputFormatsForInputhNQ4ISI = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f2749a = new int[2];
    private final int[] coroutineBoundary = new int[2];

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    FastScroller(androidx.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i, int i2, int i3) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.getOutputMinFrameDurationlomOqCM = ofFloat;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.recyclerview.widget.FastScroller fastScroller = androidx.recyclerview.widget.FastScroller.this;
                int i4 = fastScroller.getHighResolutionOutputSizeshNQ4ISI;
                if (i4 == 1) {
                    fastScroller.getOutputMinFrameDurationlomOqCM.cancel();
                } else if (i4 != 2) {
                    return;
                }
                fastScroller.getHighResolutionOutputSizeshNQ4ISI = 3;
                android.animation.ValueAnimator valueAnimator = fastScroller.getOutputMinFrameDurationlomOqCM;
                valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                fastScroller.getOutputMinFrameDurationlomOqCM.setDuration(500L);
                fastScroller.getOutputMinFrameDurationlomOqCM.start();
            }
        };
        this.CoroutineDebuggingKt = runnable;
        androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener = new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView2, int i4, int i5) {
                androidx.recyclerview.widget.FastScroller fastScroller = androidx.recyclerview.widget.FastScroller.this;
                int computeHorizontalScrollOffset = recyclerView2.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                int computeVerticalScrollRange = fastScroller.getOutputMinFrameDuration.computeVerticalScrollRange();
                int i6 = fastScroller.getHighSpeedVideoSizesFor;
                fastScroller.getInputSizeshNQ4ISI = computeVerticalScrollRange - i6 > 0 && i6 >= fastScroller.getInputFormats;
                int computeHorizontalScrollRange = fastScroller.getOutputMinFrameDuration.computeHorizontalScrollRange();
                int i7 = fastScroller.getOutputFormats;
                boolean z = computeHorizontalScrollRange - i7 > 0 && i7 >= fastScroller.getInputFormats;
                fastScroller.getHighSpeedVideoFpsRangesFor = z;
                boolean z2 = fastScroller.getInputSizeshNQ4ISI;
                if (!z2 && !z) {
                    if (fastScroller.getOutputSizeshNQ4ISI != 0) {
                        fastScroller.getHighSpeedVideoSizes(0);
                        return;
                    }
                    return;
                }
                if (z2) {
                    float f = i6;
                    fastScroller.getOutputStallDuration = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
                    fastScroller.isOutputSupportedFor = java.lang.Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
                }
                if (fastScroller.getHighSpeedVideoFpsRangesFor) {
                    float f2 = computeHorizontalScrollOffset;
                    float f3 = i7;
                    fastScroller.Camera2StreamConfigurationMap = (int) ((f3 * (f2 + (f3 / 2.0f))) / computeHorizontalScrollRange);
                    fastScroller.getHighSpeedVideoSizes = java.lang.Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
                }
                int i8 = fastScroller.getOutputSizeshNQ4ISI;
                if (i8 == 0 || i8 == 1) {
                    fastScroller.getHighSpeedVideoSizes(1);
                }
            }
        };
        this._BOUNDARY = onScrollListener;
        this.getOutputSizes = stateListDrawable;
        this.toString = drawable;
        this.coroutineCreation = stateListDrawable2;
        this.accessartificialFrame = drawable2;
        this._CREATION = java.lang.Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.c = java.lang.Math.max(i, drawable.getIntrinsicWidth());
        this.ArtificialStackFrames = java.lang.Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.b = java.lang.Math.max(i, drawable2.getIntrinsicWidth());
        this.getInputFormats = i2;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new androidx.recyclerview.widget.FastScroller.AnimatorListener());
        ofFloat.addUpdateListener(new androidx.recyclerview.widget.FastScroller.AnimatorUpdater());
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.getOutputMinFrameDuration;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.getOutputMinFrameDuration.removeOnItemTouchListener(this);
                this.getOutputMinFrameDuration.removeOnScrollListener(onScrollListener);
                this.getOutputMinFrameDuration.removeCallbacks(runnable);
            }
            this.getOutputMinFrameDuration = recyclerView;
            recyclerView.addItemDecoration(this);
            this.getOutputMinFrameDuration.addOnItemTouchListener(this);
            this.getOutputMinFrameDuration.addOnScrollListener(onScrollListener);
        }
    }

    final void getHighSpeedVideoSizes(int i) {
        if (i == 2 && this.getOutputSizeshNQ4ISI != 2) {
            this.getOutputSizes.setState(isOutputSupportedForhNQ4ISI);
            this.getOutputMinFrameDuration.removeCallbacks(this.CoroutineDebuggingKt);
        }
        if (i != 0) {
            getHighSpeedVideoFpsRangesFor();
        } else {
            this.getOutputMinFrameDuration.invalidate();
        }
        if (this.getOutputSizeshNQ4ISI == 2 && i != 2) {
            this.getOutputSizes.setState(unwrapAs);
            this.getOutputMinFrameDuration.removeCallbacks(this.CoroutineDebuggingKt);
            this.getOutputMinFrameDuration.postDelayed(this.CoroutineDebuggingKt, com.paypal.pds.core.ConstantsKt.MotionDuration1200);
        } else if (i == 1) {
            this.getOutputMinFrameDuration.removeCallbacks(this.CoroutineDebuggingKt);
            this.getOutputMinFrameDuration.postDelayed(this.CoroutineDebuggingKt, 1500L);
        }
        this.getOutputSizeshNQ4ISI = i;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.getOutputMinFrameDurationlomOqCM.cancel();
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        android.animation.ValueAnimator valueAnimator = this.getOutputMinFrameDurationlomOqCM;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.getOutputMinFrameDurationlomOqCM.setDuration(500L);
        this.getOutputMinFrameDurationlomOqCM.setStartDelay(0L);
        this.getOutputMinFrameDurationlomOqCM.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        if (this.getOutputFormats != this.getOutputMinFrameDuration.getWidth() || this.getHighSpeedVideoSizesFor != this.getOutputMinFrameDuration.getHeight()) {
            this.getOutputFormats = this.getOutputMinFrameDuration.getWidth();
            this.getHighSpeedVideoSizesFor = this.getOutputMinFrameDuration.getHeight();
            getHighSpeedVideoSizes(0);
            return;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            if (this.getInputSizeshNQ4ISI) {
                int i = this.getOutputFormats;
                int i2 = this._CREATION;
                int i3 = i - i2;
                int i4 = this.getOutputStallDuration;
                int i5 = this.isOutputSupportedFor;
                int i6 = i4 - (i5 / 2);
                this.getOutputSizes.setBounds(0, 0, i2, i5);
                this.toString.setBounds(0, 0, this.c, this.getHighSpeedVideoSizesFor);
                if (androidx.core.view.ViewCompat.getLayoutDirection(this.getOutputMinFrameDuration) == 1) {
                    this.toString.draw(canvas);
                    canvas.translate(this._CREATION, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.getOutputSizes.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this._CREATION, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.toString.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.getOutputSizes.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                int i7 = this.getHighSpeedVideoSizesFor;
                int i8 = this.ArtificialStackFrames;
                int i9 = this.Camera2StreamConfigurationMap;
                int i10 = this.getHighSpeedVideoSizes;
                this.coroutineCreation.setBounds(0, 0, i10, i8);
                this.accessartificialFrame.setBounds(0, 0, this.getOutputFormats, this.b);
                canvas.translate(0.0f, i7 - i8);
                this.accessartificialFrame.draw(canvas);
                canvas.translate(i9 - (i10 / 2), 0.0f);
                this.coroutineCreation.draw(canvas);
                canvas.translate(-r2, -r7);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        int i = this.getOutputSizeshNQ4ISI;
        if (i != 1) {
            return i == 2;
        }
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(motionEvent.getX(), motionEvent.getY());
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!highSpeedVideoFpsRangesFor && !highSpeedVideoSizes)) {
            return false;
        }
        if (highSpeedVideoSizes) {
            this.getValidOutputFormatsForInputhNQ4ISI = 1;
            this.getHighSpeedVideoFpsRanges = (int) motionEvent.getX();
        } else if (highSpeedVideoFpsRangesFor) {
            this.getValidOutputFormatsForInputhNQ4ISI = 2;
            this.getOutputStallDurationlomOqCM = (int) motionEvent.getY();
        }
        getHighSpeedVideoSizes(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        if (this.getOutputSizeshNQ4ISI != 0) {
            if (motionEvent.getAction() == 0) {
                boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(motionEvent.getX(), motionEvent.getY());
                boolean highSpeedVideoSizes = getHighSpeedVideoSizes(motionEvent.getX(), motionEvent.getY());
                if (highSpeedVideoFpsRangesFor || highSpeedVideoSizes) {
                    if (highSpeedVideoSizes) {
                        this.getValidOutputFormatsForInputhNQ4ISI = 1;
                        this.getHighSpeedVideoFpsRanges = (int) motionEvent.getX();
                    } else if (highSpeedVideoFpsRangesFor) {
                        this.getValidOutputFormatsForInputhNQ4ISI = 2;
                        this.getOutputStallDurationlomOqCM = (int) motionEvent.getY();
                    }
                    getHighSpeedVideoSizes(2);
                    return;
                }
                return;
            }
            if (motionEvent.getAction() == 1 && this.getOutputSizeshNQ4ISI == 2) {
                this.getOutputStallDurationlomOqCM = 0.0f;
                this.getHighSpeedVideoFpsRanges = 0.0f;
                getHighSpeedVideoSizes(1);
                this.getValidOutputFormatsForInputhNQ4ISI = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.getOutputSizeshNQ4ISI == 2) {
                getHighSpeedVideoFpsRangesFor();
                if (this.getValidOutputFormatsForInputhNQ4ISI == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.coroutineBoundary;
                    int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                    iArr[0] = i;
                    int i2 = this.getOutputFormats - i;
                    iArr[1] = i2;
                    float max = java.lang.Math.max(i, java.lang.Math.min(i2, x));
                    if (java.lang.Math.abs(this.Camera2StreamConfigurationMap - max) >= 2.0f) {
                        int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, max, iArr, this.getOutputMinFrameDuration.computeHorizontalScrollRange(), this.getOutputMinFrameDuration.computeHorizontalScrollOffset(), this.getOutputFormats);
                        if (highSpeedVideoFpsRangesFor2 != 0) {
                            this.getOutputMinFrameDuration.scrollBy(highSpeedVideoFpsRangesFor2, 0);
                        }
                        this.getHighSpeedVideoFpsRanges = max;
                    }
                }
                if (this.getValidOutputFormatsForInputhNQ4ISI == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.f2749a;
                    int i3 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                    iArr2[0] = i3;
                    int i4 = this.getHighSpeedVideoSizesFor - i3;
                    iArr2[1] = i4;
                    float max2 = java.lang.Math.max(i3, java.lang.Math.min(i4, y));
                    if (java.lang.Math.abs(this.getOutputStallDuration - max2) >= 2.0f) {
                        int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(this.getOutputStallDurationlomOqCM, max2, iArr2, this.getOutputMinFrameDuration.computeVerticalScrollRange(), this.getOutputMinFrameDuration.computeVerticalScrollOffset(), this.getHighSpeedVideoSizesFor);
                        if (highSpeedVideoFpsRangesFor3 != 0) {
                            this.getOutputMinFrameDuration.scrollBy(0, highSpeedVideoFpsRangesFor3);
                        }
                        this.getOutputStallDurationlomOqCM = max2;
                    }
                }
            }
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private boolean getHighSpeedVideoSizes(float f, float f2) {
        if (f2 < this.getHighSpeedVideoSizesFor - this.ArtificialStackFrames) {
            return false;
        }
        int i = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoSizes / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    class AnimatorListener extends android.animation.AnimatorListenerAdapter {
        private boolean getHighSpeedVideoFpsRanges = false;

        AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = false;
            } else if (((java.lang.Float) androidx.recyclerview.widget.FastScroller.this.getOutputMinFrameDurationlomOqCM.getAnimatedValue()).floatValue() == 0.0f) {
                androidx.recyclerview.widget.FastScroller.this.getHighResolutionOutputSizeshNQ4ISI = 0;
                androidx.recyclerview.widget.FastScroller.this.getHighSpeedVideoSizes(0);
            } else {
                androidx.recyclerview.widget.FastScroller.this.getHighResolutionOutputSizeshNQ4ISI = 2;
                androidx.recyclerview.widget.FastScroller.this.getOutputMinFrameDuration.invalidate();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.getHighSpeedVideoFpsRanges = true;
        }
    }

    class AnimatorUpdater implements android.animation.ValueAnimator.AnimatorUpdateListener {
        AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            androidx.recyclerview.widget.FastScroller.this.getOutputSizes.setAlpha(floatValue);
            androidx.recyclerview.widget.FastScroller.this.toString.setAlpha(floatValue);
            androidx.recyclerview.widget.FastScroller.this.getOutputMinFrameDuration.invalidate();
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(float f, float f2) {
        if (androidx.core.view.ViewCompat.getLayoutDirection(this.getOutputMinFrameDuration) == 1) {
            if (f > this._CREATION) {
                return false;
            }
        } else if (f < this.getOutputFormats - this._CREATION) {
            return false;
        }
        int i = this.getOutputStallDuration;
        int i2 = this.isOutputSupportedFor / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }
}
