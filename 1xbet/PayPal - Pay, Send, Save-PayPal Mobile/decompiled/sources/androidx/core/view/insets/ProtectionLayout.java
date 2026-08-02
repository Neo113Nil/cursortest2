package androidx.core.view.insets;

/* loaded from: classes7.dex */
public class ProtectionLayout extends android.widget.FrameLayout {
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private final java.util.List<androidx.core.view.insets.Protection> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.core.view.insets.ProtectionGroup getHighSpeedVideoSizes;

    public ProtectionLayout(android.content.Context context) {
        super(context);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    }

    public ProtectionLayout(android.content.Context context, java.util.List<androidx.core.view.insets.Protection> list) {
        super(context);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        setProtections(list);
    }

    public void setProtections(java.util.List<androidx.core.view.insets.Protection> list) {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.addAll(list);
        if (isAttachedToWindow()) {
            getHighSpeedVideoFpsRanges();
            requestApplyInsets();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getHighSpeedVideoFpsRanges();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHighResolutionOutputSizeshNQ4ISI();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        java.lang.Object tag = viewGroup.getTag(androidx.core.R.id.tag_system_bar_state_monitor);
        if (tag instanceof androidx.core.view.insets.SystemBarStateMonitor) {
            final androidx.core.view.insets.SystemBarStateMonitor systemBarStateMonitor = (androidx.core.view.insets.SystemBarStateMonitor) tag;
            if (!systemBarStateMonitor.getHighSpeedVideoSizes.isEmpty()) {
                return;
            }
            systemBarStateMonitor.getHighResolutionOutputSizeshNQ4ISI.post(new java.lang.Runnable() { // from class: androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.view.insets.SystemBarStateMonitor systemBarStateMonitor2 = androidx.core.view.insets.SystemBarStateMonitor.this;
                    android.view.ViewParent parent = systemBarStateMonitor2.getHighResolutionOutputSizeshNQ4ISI.getParent();
                    if (parent instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) parent).removeView(systemBarStateMonitor2.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
            });
            viewGroup.setTag(androidx.core.R.id.tag_system_bar_state_monitor, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db A[LOOP:0: B:10:0x0043->B:24:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges() {
        androidx.core.view.insets.SystemBarStateMonitor systemBarStateMonitor;
        int i;
        int i2;
        int i3;
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            getHighResolutionOutputSizeshNQ4ISI();
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        java.lang.Object tag = viewGroup.getTag(androidx.core.R.id.tag_system_bar_state_monitor);
        if (tag instanceof androidx.core.view.insets.SystemBarStateMonitor) {
            systemBarStateMonitor = (androidx.core.view.insets.SystemBarStateMonitor) tag;
        } else {
            systemBarStateMonitor = new androidx.core.view.insets.SystemBarStateMonitor(viewGroup);
            viewGroup.setTag(androidx.core.R.id.tag_system_bar_state_monitor, systemBarStateMonitor);
        }
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizes = new androidx.core.view.insets.ProtectionGroup(systemBarStateMonitor, this.getHighResolutionOutputSizeshNQ4ISI);
        int childCount = getChildCount();
        int size = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.core.view.insets.Protection protection = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.get(i4);
            android.content.Context context = getContext();
            int i5 = i4 + childCount;
            androidx.core.view.insets.Protection.Attributes attributes = protection.getHighSpeedVideoFpsRanges;
            int side = protection.getSide();
            int i6 = -1;
            if (side != 1) {
                if (side == 2) {
                    i3 = attributes.getHighSpeedVideoFpsRanges;
                    i2 = 48;
                } else if (side != 4) {
                    if (side != 8) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected side: ");
                        sb.append(protection.getSide());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    i3 = attributes.getHighSpeedVideoFpsRanges;
                    i2 = 80;
                } else {
                    i = attributes.getHighSpeedVideoSizesFor;
                    i2 = 5;
                }
                final android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i6, i3, i2);
                androidx.core.graphics.Insets insets = attributes.getHighSpeedVideoFpsRangesFor;
                layoutParams.leftMargin = insets.left;
                layoutParams.topMargin = insets.top;
                layoutParams.rightMargin = insets.right;
                layoutParams.bottomMargin = insets.bottom;
                final android.view.View view = new android.view.View(context);
                view.setTag(getHighSpeedVideoFpsRanges);
                view.setTranslationX(attributes.getInputSizeshNQ4ISI);
                view.setTranslationY(attributes.getInputFormats);
                view.setAlpha(attributes.getHighSpeedVideoSizes);
                view.setVisibility(attributes.getOutputMinFrameDuration ? 0 : 8);
                view.setBackground(attributes.getHighResolutionOutputSizeshNQ4ISI);
                androidx.core.view.insets.Protection.Attributes.Callback callback = new androidx.core.view.insets.Protection.Attributes.Callback() { // from class: androidx.core.view.insets.ProtectionLayout.1
                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void getHighSpeedVideoFpsRangesFor(int i7) {
                        layoutParams.width = i7;
                        view.setLayoutParams(layoutParams);
                    }

                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void Camera2StreamConfigurationMap(int i7) {
                        layoutParams.height = i7;
                        view.setLayoutParams(layoutParams);
                    }

                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void getHighSpeedVideoFpsRanges(androidx.core.graphics.Insets insets2) {
                        layoutParams.leftMargin = insets2.left;
                        layoutParams.topMargin = insets2.top;
                        layoutParams.rightMargin = insets2.right;
                        layoutParams.bottomMargin = insets2.bottom;
                        view.setLayoutParams(layoutParams);
                    }

                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void getHighSpeedVideoSizes(boolean z) {
                        view.setVisibility(z ? 0 : 8);
                    }

                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable) {
                        view.setBackground(drawable);
                    }

                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void Camera2StreamConfigurationMap(float f) {
                        view.setTranslationX(f);
                    }

                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void getHighSpeedVideoSizes(float f) {
                        view.setTranslationY(f);
                    }

                    @Override // androidx.core.view.insets.Protection.Attributes.Callback
                    public final void getHighSpeedVideoFpsRangesFor(float f) {
                        view.setAlpha(f);
                    }
                };
                if (attributes.Camera2StreamConfigurationMap == null) {
                    throw new java.lang.IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                }
                attributes.Camera2StreamConfigurationMap = callback;
                addView(view, i5, layoutParams);
            } else {
                i = attributes.getHighSpeedVideoSizesFor;
                i2 = 3;
            }
            i6 = i;
            i3 = -1;
            final android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i6, i3, i2);
            androidx.core.graphics.Insets insets2 = attributes.getHighSpeedVideoFpsRangesFor;
            layoutParams2.leftMargin = insets2.left;
            layoutParams2.topMargin = insets2.top;
            layoutParams2.rightMargin = insets2.right;
            layoutParams2.bottomMargin = insets2.bottom;
            final android.view.View view2 = new android.view.View(context);
            view2.setTag(getHighSpeedVideoFpsRanges);
            view2.setTranslationX(attributes.getInputSizeshNQ4ISI);
            view2.setTranslationY(attributes.getInputFormats);
            view2.setAlpha(attributes.getHighSpeedVideoSizes);
            view2.setVisibility(attributes.getOutputMinFrameDuration ? 0 : 8);
            view2.setBackground(attributes.getHighResolutionOutputSizeshNQ4ISI);
            androidx.core.view.insets.Protection.Attributes.Callback callback2 = new androidx.core.view.insets.Protection.Attributes.Callback() { // from class: androidx.core.view.insets.ProtectionLayout.1
                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void getHighSpeedVideoFpsRangesFor(int i7) {
                    layoutParams2.width = i7;
                    view2.setLayoutParams(layoutParams2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void Camera2StreamConfigurationMap(int i7) {
                    layoutParams2.height = i7;
                    view2.setLayoutParams(layoutParams2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void getHighSpeedVideoFpsRanges(androidx.core.graphics.Insets insets22) {
                    layoutParams2.leftMargin = insets22.left;
                    layoutParams2.topMargin = insets22.top;
                    layoutParams2.rightMargin = insets22.right;
                    layoutParams2.bottomMargin = insets22.bottom;
                    view2.setLayoutParams(layoutParams2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void getHighSpeedVideoSizes(boolean z) {
                    view2.setVisibility(z ? 0 : 8);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable) {
                    view2.setBackground(drawable);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void Camera2StreamConfigurationMap(float f) {
                    view2.setTranslationX(f);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void getHighSpeedVideoSizes(float f) {
                    view2.setTranslationY(f);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public final void getHighSpeedVideoFpsRangesFor(float f) {
                    view2.setAlpha(f);
                }
            };
            if (attributes.Camera2StreamConfigurationMap == null) {
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizes != null) {
            removeViews(getChildCount() - this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.size(), this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.size());
            int size = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.size();
            for (int i = 0; i < size; i++) {
                androidx.core.view.insets.Protection.Attributes attributes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.get(i).getHighSpeedVideoFpsRanges;
                androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
                attributes.Camera2StreamConfigurationMap = null;
            }
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
            this.getHighSpeedVideoSizes = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != getHighSpeedVideoFpsRanges) {
            androidx.core.view.insets.ProtectionGroup protectionGroup = this.getHighSpeedVideoSizes;
            int childCount = getChildCount() - (protectionGroup != null ? protectionGroup.getHighSpeedVideoSizes.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }
}
