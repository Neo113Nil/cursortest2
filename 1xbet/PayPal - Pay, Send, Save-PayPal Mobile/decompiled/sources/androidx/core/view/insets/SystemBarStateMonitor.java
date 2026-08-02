package androidx.core.view.insets;

/* loaded from: classes7.dex */
class SystemBarStateMonitor {
    final android.view.View getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor.Callback> getHighSpeedVideoSizes = new java.util.ArrayList<>();
    androidx.core.graphics.Insets getHighSpeedVideoFpsRanges = androidx.core.graphics.Insets.NONE;
    androidx.core.graphics.Insets Camera2StreamConfigurationMap = androidx.core.graphics.Insets.NONE;

    interface Callback {
        void Camera2StreamConfigurationMap(int i);

        void getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRangesFor();

        void getHighSpeedVideoSizes(int i, androidx.core.graphics.Insets insets, android.graphics.RectF rectF);

        void getHighSpeedVideoSizes(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2);
    }

    SystemBarStateMonitor(final android.view.ViewGroup viewGroup) {
        android.view.View view;
        android.graphics.drawable.Drawable background = viewGroup.getBackground();
        int i = 0;
        this.getHighSpeedVideoFpsRangesFor = background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0;
        android.view.View view2 = new android.view.View(viewGroup.getContext()) { // from class: androidx.core.view.insets.SystemBarStateMonitor.1
            @Override // android.view.View
            protected void onConfigurationChanged(android.content.res.Configuration configuration) {
                android.graphics.drawable.Drawable background2 = viewGroup.getBackground();
                int color = background2 instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background2).getColor() : 0;
                if (androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoFpsRangesFor != color) {
                    androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoFpsRangesFor = color;
                    for (int size = androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
                        ((androidx.core.view.insets.SystemBarStateMonitor.Callback) androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.get(size)).Camera2StreamConfigurationMap(color);
                    }
                }
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = view2;
        view2.setVisibility(8);
        view2.setWillNotDraw(true);
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view2, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view3, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                androidx.core.view.insets.SystemBarStateMonitor systemBarStateMonitor = androidx.core.view.insets.SystemBarStateMonitor.this;
                androidx.core.graphics.Insets highSpeedVideoFpsRangesFor = androidx.core.view.insets.SystemBarStateMonitor.getHighSpeedVideoFpsRangesFor(windowInsetsCompat);
                androidx.core.graphics.Insets min = androidx.core.graphics.Insets.min(windowInsetsCompat.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.tappableElement()));
                if (!highSpeedVideoFpsRangesFor.equals(systemBarStateMonitor.getHighSpeedVideoFpsRanges) || !min.equals(systemBarStateMonitor.Camera2StreamConfigurationMap)) {
                    systemBarStateMonitor.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
                    systemBarStateMonitor.Camera2StreamConfigurationMap = min;
                    for (int size = systemBarStateMonitor.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
                        systemBarStateMonitor.getHighSpeedVideoSizes.get(size).getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor, min);
                    }
                }
                return windowInsetsCompat;
            }
        });
        androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(view2, new androidx.core.view.WindowInsetsAnimationCompat.Callback() { // from class: androidx.core.view.insets.SystemBarStateMonitor.2
            private final java.util.HashMap<androidx.core.view.WindowInsetsAnimationCompat, java.lang.Integer> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat windowInsetsCompat, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> list) {
                android.graphics.RectF rectF = new android.graphics.RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i2 = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat = list.get(size);
                    java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor.get(windowInsetsAnimationCompat);
                    if (num != null) {
                        int intValue = num.intValue();
                        float alpha = windowInsetsAnimationCompat.getAlpha();
                        if ((intValue & 1) != 0) {
                            rectF.left = alpha;
                        }
                        if ((intValue & 2) != 0) {
                            rectF.top = alpha;
                        }
                        if ((intValue & 4) != 0) {
                            rectF.right = alpha;
                        }
                        if ((intValue & 8) != 0) {
                            rectF.bottom = alpha;
                        }
                        i2 |= intValue;
                    }
                }
                androidx.core.graphics.Insets highSpeedVideoSizes = androidx.core.view.insets.SystemBarStateMonitor.getHighSpeedVideoSizes(windowInsetsCompat);
                for (int size2 = androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.size() - 1; size2 >= 0; size2--) {
                    ((androidx.core.view.insets.SystemBarStateMonitor.Callback) androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.get(size2)).getHighSpeedVideoSizes(i2, highSpeedVideoSizes, rectF);
                }
                return windowInsetsCompat;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public void onEnd(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                if ((windowInsetsAnimationCompat.getTypeMask() & androidx.core.view.WindowInsetsCompat.Type.systemBars()) != 0) {
                    this.getHighSpeedVideoFpsRangesFor.remove(windowInsetsAnimationCompat);
                    for (int size = androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
                        ((androidx.core.view.insets.SystemBarStateMonitor.Callback) androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.get(size)).getHighSpeedVideoFpsRanges();
                    }
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public void onPrepare(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                if ((windowInsetsAnimationCompat.getTypeMask() & androidx.core.view.WindowInsetsCompat.Type.systemBars()) != 0) {
                    for (int size = androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
                        ((androidx.core.view.insets.SystemBarStateMonitor.Callback) androidx.core.view.insets.SystemBarStateMonitor.this.getHighSpeedVideoSizes.get(size)).getHighSpeedVideoFpsRangesFor();
                    }
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                if ((windowInsetsAnimationCompat.getTypeMask() & androidx.core.view.WindowInsetsCompat.Type.systemBars()) != 0) {
                    androidx.core.graphics.Insets upperBound = boundsCompat.getUpperBound();
                    androidx.core.graphics.Insets lowerBound = boundsCompat.getLowerBound();
                    int i2 = upperBound.left != lowerBound.left ? 1 : 0;
                    if (upperBound.top != lowerBound.top) {
                        i2 |= 2;
                    }
                    if (upperBound.right != lowerBound.right) {
                        i2 |= 4;
                    }
                    if (upperBound.bottom != lowerBound.bottom) {
                        i2 |= 8;
                    }
                    this.getHighSpeedVideoFpsRangesFor.put(windowInsetsAnimationCompat, java.lang.Integer.valueOf(i2));
                }
                return boundsCompat;
            }
        });
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(view2, 0);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener(viewGroup, view2, i) { // from class: androidx.core.view.insets.SystemBarStateMonitor.3
                final /* synthetic */ int Camera2StreamConfigurationMap = 0;
                final /* synthetic */ android.view.ViewGroup getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ android.view.View getHighSpeedVideoFpsRanges;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view3) {
                    this.getHighResolutionOutputSizeshNQ4ISI.addView(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
                    view3.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view3) {
                    this.getHighResolutionOutputSizeshNQ4ISI.addView(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
                    view3.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    static androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        return androidx.core.graphics.Insets.min(windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.tappableElement()));
    }

    static /* synthetic */ androidx.core.graphics.Insets getHighSpeedVideoSizes(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        return androidx.core.graphics.Insets.min(windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.tappableElement()));
    }
}
