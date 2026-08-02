package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class LottieAnimationView extends androidx.appcompat.widget.AppCompatImageView {
    private static final com.airbnb.lottie.LottieListener<java.lang.Throwable> Camera2StreamConfigurationMap = new com.airbnb.lottie.LottieListener() { // from class: com.airbnb.lottie.LottieAnimationView$$ExternalSyntheticLambda1
        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(java.lang.Object obj) {
            com.airbnb.lottie.LottieAnimationView.Camera2StreamConfigurationMap((java.lang.Throwable) obj);
        }
    };
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private final com.airbnb.lottie.LottieListener<com.airbnb.lottie.LottieComposition> getInputSizeshNQ4ISI;
    private com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> getOutputFormats;
    private com.airbnb.lottie.LottieListener<java.lang.Throwable> getOutputMinFrameDuration;
    private final com.airbnb.lottie.LottieDrawable getOutputMinFrameDurationlomOqCM;
    private final java.util.Set<com.airbnb.lottie.LottieAnimationView.UserActionTaken> getOutputSizes;
    private final java.util.Set<com.airbnb.lottie.LottieOnCompositionLoadedListener> getOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.LottieListener<java.lang.Throwable> getOutputStallDuration;

    enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(java.lang.Throwable th) {
        if (com.airbnb.lottie.utils.Utils.isNetworkException(th)) {
            com.airbnb.lottie.utils.Logger.warning("Unable to load composition.", th);
            return;
        }
        throw new java.lang.IllegalStateException("Unable to parse composition", th);
    }

    static class WeakSuccessListener implements com.airbnb.lottie.LottieListener<com.airbnb.lottie.LottieComposition> {
        private final java.lang.ref.WeakReference<com.airbnb.lottie.LottieAnimationView> getHighSpeedVideoFpsRangesFor;

        @Override // com.airbnb.lottie.LottieListener
        public /* synthetic */ void onResult(com.airbnb.lottie.LottieComposition lottieComposition) {
            com.airbnb.lottie.LottieComposition lottieComposition2 = lottieComposition;
            com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.getHighSpeedVideoFpsRangesFor.get();
            if (lottieAnimationView != null) {
                lottieAnimationView.setComposition(lottieComposition2);
            }
        }

        public WeakSuccessListener(com.airbnb.lottie.LottieAnimationView lottieAnimationView) {
            this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(lottieAnimationView);
        }
    }

    static class WeakFailureListener implements com.airbnb.lottie.LottieListener<java.lang.Throwable> {
        private final java.lang.ref.WeakReference<com.airbnb.lottie.LottieAnimationView> getHighSpeedVideoFpsRanges;

        @Override // com.airbnb.lottie.LottieListener
        public /* synthetic */ void onResult(java.lang.Throwable th) {
            java.lang.Throwable th2 = th;
            com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.getHighSpeedVideoFpsRanges.get();
            if (lottieAnimationView != null) {
                if (lottieAnimationView.getInputFormats != 0) {
                    lottieAnimationView.setImageResource(lottieAnimationView.getInputFormats);
                }
                (lottieAnimationView.getOutputMinFrameDuration == null ? com.airbnb.lottie.LottieAnimationView.Camera2StreamConfigurationMap : lottieAnimationView.getOutputMinFrameDuration).onResult(th2);
            }
        }

        public WeakFailureListener(com.airbnb.lottie.LottieAnimationView lottieAnimationView) {
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference<>(lottieAnimationView);
        }
    }

    public LottieAnimationView(android.content.Context context) {
        super(context);
        this.getInputSizeshNQ4ISI = new com.airbnb.lottie.LottieAnimationView.WeakSuccessListener(this);
        this.getOutputStallDuration = new com.airbnb.lottie.LottieAnimationView.WeakFailureListener(this);
        this.getInputFormats = 0;
        this.getOutputMinFrameDurationlomOqCM = new com.airbnb.lottie.LottieDrawable();
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getOutputSizes = new java.util.HashSet();
        this.getOutputSizeshNQ4ISI = new java.util.HashSet();
        getHighSpeedVideoFpsRanges(null, com.airbnb.lottie.R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getInputSizeshNQ4ISI = new com.airbnb.lottie.LottieAnimationView.WeakSuccessListener(this);
        this.getOutputStallDuration = new com.airbnb.lottie.LottieAnimationView.WeakFailureListener(this);
        this.getInputFormats = 0;
        this.getOutputMinFrameDurationlomOqCM = new com.airbnb.lottie.LottieDrawable();
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getOutputSizes = new java.util.HashSet();
        this.getOutputSizeshNQ4ISI = new java.util.HashSet();
        getHighSpeedVideoFpsRanges(attributeSet, com.airbnb.lottie.R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getInputSizeshNQ4ISI = new com.airbnb.lottie.LottieAnimationView.WeakSuccessListener(this);
        this.getOutputStallDuration = new com.airbnb.lottie.LottieAnimationView.WeakFailureListener(this);
        this.getInputFormats = 0;
        this.getOutputMinFrameDurationlomOqCM = new com.airbnb.lottie.LottieDrawable();
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getOutputSizes = new java.util.HashSet();
        this.getOutputSizeshNQ4ISI = new java.util.HashSet();
        getHighSpeedVideoFpsRanges(attributeSet, i);
    }

    private void getHighSpeedVideoFpsRanges(android.util.AttributeSet attributeSet, int i) {
        java.lang.String string;
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.airbnb.lottie.R.styleable.LottieAnimationView, i, 0);
        this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        boolean hasValue = obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_rawRes);
        boolean hasValue2 = obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_fileName);
        boolean hasValue3 = obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_url);
        if (hasValue && hasValue2) {
            throw new java.lang.IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            java.lang.String string2 = obtainStyledAttributes.getString(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.getHighSpeedVideoFpsRanges = true;
        }
        if (obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.getOutputMinFrameDurationlomOqCM.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        boolean hasValue4 = obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_progress);
        float f = obtainStyledAttributes.getFloat(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_progress, 0.0f);
        if (hasValue4) {
            this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_PROGRESS);
        }
        this.getOutputMinFrameDurationlomOqCM.setProgress(f);
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_applyShadowToLayers, true));
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_colorFilter)) {
            addValueCallback(new com.airbnb.lottie.model.KeyPath("**"), (com.airbnb.lottie.model.KeyPath) com.airbnb.lottie.LottieProperty.COLOR_FILTER, (com.airbnb.lottie.value.LottieValueCallback<com.airbnb.lottie.model.KeyPath>) new com.airbnb.lottie.value.LottieValueCallback(new com.airbnb.lottie.SimpleColorFilter(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_renderMode)) {
            int i2 = obtainStyledAttributes.getInt(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_renderMode, com.airbnb.lottie.RenderMode.AUTOMATIC.ordinal());
            if (i2 >= com.airbnb.lottie.RenderMode.values().length) {
                i2 = com.airbnb.lottie.RenderMode.AUTOMATIC.ordinal();
            }
            setRenderMode(com.airbnb.lottie.RenderMode.values()[i2]);
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_asyncUpdates)) {
            int i3 = obtainStyledAttributes.getInt(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_asyncUpdates, com.airbnb.lottie.AsyncUpdates.AUTOMATIC.ordinal());
            if (i3 >= com.airbnb.lottie.RenderMode.values().length) {
                i3 = com.airbnb.lottie.AsyncUpdates.AUTOMATIC.ordinal();
            }
            setAsyncUpdates(com.airbnb.lottie.AsyncUpdates.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(com.airbnb.lottie.R.styleable.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizes = null;
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> lottieTask = this.getOutputFormats;
        if (lottieTask != null) {
            lottieTask.removeListener(this.getInputSizeshNQ4ISI);
            this.getOutputFormats.removeFailureListener(this.getOutputStallDuration);
        }
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizes = null;
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> lottieTask = this.getOutputFormats;
        if (lottieTask != null) {
            lottieTask.removeListener(this.getInputSizeshNQ4ISI);
            this.getOutputFormats.removeFailureListener(this.getOutputStallDuration);
        }
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizes = null;
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> lottieTask = this.getOutputFormats;
        if (lottieTask != null) {
            lottieTask.removeListener(this.getInputSizeshNQ4ISI);
            this.getOutputFormats.removeFailureListener(this.getOutputStallDuration);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable) {
        com.airbnb.lottie.LottieDrawable lottieDrawable;
        if (!this.getHighSpeedVideoSizesFor && drawable == (lottieDrawable = this.getOutputMinFrameDurationlomOqCM) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.getHighSpeedVideoSizesFor && (drawable instanceof com.airbnb.lottie.LottieDrawable)) {
            com.airbnb.lottie.LottieDrawable lottieDrawable2 = (com.airbnb.lottie.LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        android.graphics.drawable.Drawable drawable = getDrawable();
        if ((drawable instanceof com.airbnb.lottie.LottieDrawable) && ((com.airbnb.lottie.LottieDrawable) drawable).getRenderMode() == com.airbnb.lottie.RenderMode.SOFTWARE) {
            this.getOutputMinFrameDurationlomOqCM.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = getDrawable();
        com.airbnb.lottie.LottieDrawable lottieDrawable = this.getOutputMinFrameDurationlomOqCM;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        boolean z;
        com.airbnb.lottie.LottieAnimationView.SavedState savedState = new com.airbnb.lottie.LottieAnimationView.SavedState(super.onSaveInstanceState());
        savedState.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes;
        savedState.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI;
        savedState.getHighResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM.getProgress();
        com.airbnb.lottie.LottieDrawable lottieDrawable = this.getOutputMinFrameDurationlomOqCM;
        if (lottieDrawable.isVisible()) {
            z = lottieDrawable.getHighSpeedVideoSizes.isRunning();
        } else {
            z = lottieDrawable.getHighSpeedVideoSizesFor == com.airbnb.lottie.LottieDrawable.OnVisibleAction.PLAY || lottieDrawable.getHighSpeedVideoSizesFor == com.airbnb.lottie.LottieDrawable.OnVisibleAction.RESUME;
        }
        savedState.getHighSpeedVideoSizes = z;
        savedState.Camera2StreamConfigurationMap = this.getOutputMinFrameDurationlomOqCM.getImageAssetsFolder();
        savedState.getOutputFormats = this.getOutputMinFrameDurationlomOqCM.getRepeatMode();
        savedState.getOutputMinFrameDuration = this.getOutputMinFrameDurationlomOqCM.getRepeatCount();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof com.airbnb.lottie.LottieAnimationView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.airbnb.lottie.LottieAnimationView.SavedState savedState = (com.airbnb.lottie.LottieAnimationView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.getHighSpeedVideoSizes = savedState.getHighSpeedVideoFpsRangesFor;
        if (!this.getOutputSizes.contains(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_ANIMATION) && !android.text.TextUtils.isEmpty(this.getHighSpeedVideoSizes)) {
            setAnimation(this.getHighSpeedVideoSizes);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = savedState.getHighSpeedVideoFpsRanges;
        if (!this.getOutputSizes.contains(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_ANIMATION) && (i = this.getHighResolutionOutputSizeshNQ4ISI) != 0) {
            setAnimation(i);
        }
        if (!this.getOutputSizes.contains(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_PROGRESS)) {
            this.getOutputMinFrameDurationlomOqCM.setProgress(savedState.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (!this.getOutputSizes.contains(com.airbnb.lottie.LottieAnimationView.UserActionTaken.PLAY_OPTION) && savedState.getHighSpeedVideoSizes) {
            playAnimation();
        }
        if (!this.getOutputSizes.contains(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.Camera2StreamConfigurationMap);
        }
        if (!this.getOutputSizes.contains(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.getOutputFormats);
        }
        if (this.getOutputSizes.contains(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.getOutputMinFrameDuration);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getOutputMinFrameDurationlomOqCM.playAnimation();
    }

    @java.lang.Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setIgnoreDisabledSystemAnimations(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setUseCompositionFrameRate(z);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.enableFeatureFlag(com.airbnb.lottie.LottieFeatureFlag.MergePathsApi19, z);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.getOutputMinFrameDurationlomOqCM.isFeatureFlagEnabled(com.airbnb.lottie.LottieFeatureFlag.MergePathsApi19);
    }

    public void enableFeatureFlag(com.airbnb.lottie.LottieFeatureFlag lottieFeatureFlag, boolean z) {
        this.getOutputMinFrameDurationlomOqCM.enableFeatureFlag(lottieFeatureFlag, z);
    }

    public boolean isFeatureFlagEnabled(com.airbnb.lottie.LottieFeatureFlag lottieFeatureFlag) {
        return this.getOutputMinFrameDurationlomOqCM.isFeatureFlagEnabled(lottieFeatureFlag);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setClipToCompositionBounds(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.getOutputMinFrameDurationlomOqCM.getClipToCompositionBounds();
    }

    public void setCacheComposition(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setOutlineMasksAndMattes(z);
    }

    public void setAnimation(final int i) {
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromRawRes;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = null;
        if (isInEditMode()) {
            fromRawRes = new com.airbnb.lottie.LottieTask<>(new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieAnimationView$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.airbnb.lottie.LottieAnimationView lottieAnimationView = com.airbnb.lottie.LottieAnimationView.this;
                    int i2 = i;
                    return lottieAnimationView.getHighSpeedVideoFpsRangesFor ? com.airbnb.lottie.LottieCompositionFactory.fromRawResSync(lottieAnimationView.getContext(), i2) : com.airbnb.lottie.LottieCompositionFactory.fromRawResSync(lottieAnimationView.getContext(), i2, null);
                }
            }, true);
        } else {
            fromRawRes = this.getHighSpeedVideoFpsRangesFor ? com.airbnb.lottie.LottieCompositionFactory.fromRawRes(getContext(), i) : com.airbnb.lottie.LottieCompositionFactory.fromRawRes(getContext(), i, null);
        }
        getHighResolutionOutputSizeshNQ4ISI(fromRawRes);
    }

    public void setAnimation(final java.lang.String str) {
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromAsset;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        if (isInEditMode()) {
            fromAsset = new com.airbnb.lottie.LottieTask<>(new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieAnimationView$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.airbnb.lottie.LottieAnimationView lottieAnimationView = com.airbnb.lottie.LottieAnimationView.this;
                    java.lang.String str2 = str;
                    return lottieAnimationView.getHighSpeedVideoFpsRangesFor ? com.airbnb.lottie.LottieCompositionFactory.fromAssetSync(lottieAnimationView.getContext(), str2) : com.airbnb.lottie.LottieCompositionFactory.fromAssetSync(lottieAnimationView.getContext(), str2, null);
                }
            }, true);
        } else {
            fromAsset = this.getHighSpeedVideoFpsRangesFor ? com.airbnb.lottie.LottieCompositionFactory.fromAsset(getContext(), str) : com.airbnb.lottie.LottieCompositionFactory.fromAsset(getContext(), str, null);
        }
        getHighResolutionOutputSizeshNQ4ISI(fromAsset);
    }

    @java.lang.Deprecated
    public void setAnimationFromJson(java.lang.String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(java.lang.String str, java.lang.String str2) {
        setAnimation(new java.io.ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(java.io.InputStream inputStream, java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public void setAnimation(java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.LottieCompositionFactory.fromZipStream(zipInputStream, str));
    }

    public void setAnimationFromUrl(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor ? com.airbnb.lottie.LottieCompositionFactory.fromUrl(getContext(), str) : com.airbnb.lottie.LottieCompositionFactory.fromUrl(getContext(), str, null));
    }

    public void setAnimationFromUrl(java.lang.String str, java.lang.String str2) {
        getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setFailureListener(com.airbnb.lottie.LottieListener<java.lang.Throwable> lottieListener) {
        this.getOutputMinFrameDuration = lottieListener;
    }

    public void setFallbackResource(int i) {
        this.getInputFormats = i;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> lottieTask) {
        com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> result = lottieTask.getResult();
        com.airbnb.lottie.LottieDrawable lottieDrawable = this.getOutputMinFrameDurationlomOqCM;
        if (result != null && lottieDrawable == getDrawable() && lottieDrawable.getComposition() == result.getValue()) {
            return;
        }
        this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_ANIMATION);
        this.getOutputMinFrameDurationlomOqCM.clearComposition();
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> lottieTask2 = this.getOutputFormats;
        if (lottieTask2 != null) {
            lottieTask2.removeListener(this.getInputSizeshNQ4ISI);
            this.getOutputFormats.removeFailureListener(this.getOutputStallDuration);
        }
        this.getOutputFormats = lottieTask.addListener(this.getInputSizeshNQ4ISI).addFailureListener(this.getOutputStallDuration);
    }

    public void setComposition(com.airbnb.lottie.LottieComposition lottieComposition) {
        boolean z = com.airbnb.lottie.L.DBG;
        this.getOutputMinFrameDurationlomOqCM.setCallback(this);
        this.getHighSpeedVideoSizesFor = true;
        boolean composition = this.getOutputMinFrameDurationlomOqCM.setComposition(lottieComposition);
        if (this.getHighSpeedVideoFpsRanges) {
            this.getOutputMinFrameDurationlomOqCM.playAnimation();
        }
        this.getHighSpeedVideoSizesFor = false;
        if (getDrawable() != this.getOutputMinFrameDurationlomOqCM || composition) {
            if (!composition) {
                boolean isAnimating = isAnimating();
                setImageDrawable(null);
                setImageDrawable(this.getOutputMinFrameDurationlomOqCM);
                if (isAnimating) {
                    this.getOutputMinFrameDurationlomOqCM.resumeAnimation();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            java.util.Iterator<com.airbnb.lottie.LottieOnCompositionLoadedListener> it = this.getOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                it.next().onCompositionLoaded(lottieComposition);
            }
        }
    }

    public com.airbnb.lottie.LottieComposition getComposition() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        com.airbnb.lottie.LottieDrawable lottieDrawable = this.getOutputMinFrameDurationlomOqCM;
        if (drawable == lottieDrawable) {
            return lottieDrawable.getComposition();
        }
        return null;
    }

    public boolean hasMasks() {
        return this.getOutputMinFrameDurationlomOqCM.hasMasks();
    }

    public boolean hasMatte() {
        return this.getOutputMinFrameDurationlomOqCM.hasMatte();
    }

    public void playAnimation() {
        this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.PLAY_OPTION);
        this.getOutputMinFrameDurationlomOqCM.playAnimation();
    }

    public void resumeAnimation() {
        this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.PLAY_OPTION);
        this.getOutputMinFrameDurationlomOqCM.resumeAnimation();
    }

    public void setMinFrame(int i) {
        this.getOutputMinFrameDurationlomOqCM.setMinFrame(i);
    }

    public float getMinFrame() {
        return this.getOutputMinFrameDurationlomOqCM.getMinFrame();
    }

    public void setMinProgress(float f) {
        this.getOutputMinFrameDurationlomOqCM.setMinProgress(f);
    }

    public void setMaxFrame(int i) {
        this.getOutputMinFrameDurationlomOqCM.setMaxFrame(i);
    }

    public float getMaxFrame() {
        return this.getOutputMinFrameDurationlomOqCM.getMaxFrame();
    }

    public void setMaxProgress(float f) {
        this.getOutputMinFrameDurationlomOqCM.setMaxProgress(f);
    }

    public void setMinFrame(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM.setMinFrame(str);
    }

    public void setMaxFrame(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxFrame(java.lang.String str, java.lang.String str2, boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setMinAndMaxFrame(str, str2, z);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.getOutputMinFrameDurationlomOqCM.setMinAndMaxFrame(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.getOutputMinFrameDurationlomOqCM.setMinAndMaxProgress(f, f2);
    }

    public void reverseAnimationSpeed() {
        this.getOutputMinFrameDurationlomOqCM.reverseAnimationSpeed();
    }

    public void setSpeed(float f) {
        this.getOutputMinFrameDurationlomOqCM.setSpeed(f);
    }

    public float getSpeed() {
        return this.getOutputMinFrameDurationlomOqCM.getSpeed();
    }

    public void addAnimatorUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.getOutputMinFrameDurationlomOqCM.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.getOutputMinFrameDurationlomOqCM.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.getOutputMinFrameDurationlomOqCM.removeAllUpdateListeners();
    }

    public void addAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.getOutputMinFrameDurationlomOqCM.addAnimatorListener(animatorListener);
    }

    public void removeAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.getOutputMinFrameDurationlomOqCM.removeAnimatorListener(animatorListener);
    }

    public void removeAllAnimatorListeners() {
        this.getOutputMinFrameDurationlomOqCM.removeAllAnimatorListeners();
    }

    public void addAnimatorPauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.getOutputMinFrameDurationlomOqCM.addAnimatorPauseListener(animatorPauseListener);
    }

    public void removeAnimatorPauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.getOutputMinFrameDurationlomOqCM.removeAnimatorPauseListener(animatorPauseListener);
    }

    @java.lang.Deprecated
    public void loop(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setRepeatCount(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_REPEAT_MODE);
        this.getOutputMinFrameDurationlomOqCM.setRepeatMode(i);
    }

    public int getRepeatMode() {
        return this.getOutputMinFrameDurationlomOqCM.getRepeatMode();
    }

    public void setRepeatCount(int i) {
        this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_REPEAT_COUNT);
        this.getOutputMinFrameDurationlomOqCM.setRepeatCount(i);
    }

    public int getRepeatCount() {
        return this.getOutputMinFrameDurationlomOqCM.getRepeatCount();
    }

    public boolean isAnimating() {
        return this.getOutputMinFrameDurationlomOqCM.isAnimating();
    }

    public void setImageAssetsFolder(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM.setImagesAssetsFolder(str);
    }

    public java.lang.String getImageAssetsFolder() {
        return this.getOutputMinFrameDurationlomOqCM.getImageAssetsFolder();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setMaintainOriginalImageBounds(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.getOutputMinFrameDurationlomOqCM.getMaintainOriginalImageBounds();
    }

    public android.graphics.Bitmap updateBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        return this.getOutputMinFrameDurationlomOqCM.updateBitmap(str, bitmap);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate) {
        this.getOutputMinFrameDurationlomOqCM.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setDefaultFontFileExtension(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM.setDefaultFontFileExtension(str);
    }

    public void setFontAssetDelegate(com.airbnb.lottie.FontAssetDelegate fontAssetDelegate) {
        this.getOutputMinFrameDurationlomOqCM.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> map) {
        this.getOutputMinFrameDurationlomOqCM.setFontMap(map);
    }

    public void setTextDelegate(com.airbnb.lottie.TextDelegate textDelegate) {
        this.getOutputMinFrameDurationlomOqCM.setTextDelegate(textDelegate);
    }

    public java.util.List<com.airbnb.lottie.model.KeyPath> resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath) {
        return this.getOutputMinFrameDurationlomOqCM.resolveKeyPath(keyPath);
    }

    public <T> void clearValueCallback(com.airbnb.lottie.model.KeyPath keyPath, T t) {
        this.getOutputMinFrameDurationlomOqCM.addValueCallback(keyPath, (com.airbnb.lottie.model.KeyPath) t, (com.airbnb.lottie.value.LottieValueCallback<com.airbnb.lottie.model.KeyPath>) null);
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.KeyPath keyPath, T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        this.getOutputMinFrameDurationlomOqCM.addValueCallback(keyPath, (com.airbnb.lottie.model.KeyPath) t, (com.airbnb.lottie.value.LottieValueCallback<com.airbnb.lottie.model.KeyPath>) lottieValueCallback);
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.KeyPath keyPath, T t, final com.airbnb.lottie.value.SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.getOutputMinFrameDurationlomOqCM.addValueCallback(keyPath, (com.airbnb.lottie.model.KeyPath) t, (com.airbnb.lottie.value.LottieValueCallback<com.airbnb.lottie.model.KeyPath>) new com.airbnb.lottie.value.LottieValueCallback<T>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public T getValue(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
                return (T) simpleLottieValueCallback.getValue(lottieFrameInfo);
            }
        });
    }

    public void cancelAnimation() {
        this.getHighSpeedVideoFpsRanges = false;
        this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.PLAY_OPTION);
        this.getOutputMinFrameDurationlomOqCM.cancelAnimation();
    }

    public void pauseAnimation() {
        this.getHighSpeedVideoFpsRanges = false;
        this.getOutputMinFrameDurationlomOqCM.pauseAnimation();
    }

    public void setFrame(int i) {
        this.getOutputMinFrameDurationlomOqCM.setFrame(i);
    }

    public int getFrame() {
        return this.getOutputMinFrameDurationlomOqCM.getFrame();
    }

    public float getProgress() {
        return this.getOutputMinFrameDurationlomOqCM.getProgress();
    }

    public long getDuration() {
        com.airbnb.lottie.LottieComposition composition = getComposition();
        if (composition != null) {
            return (long) composition.getDuration();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setPerformanceTrackingEnabled(z);
    }

    public com.airbnb.lottie.PerformanceTracker getPerformanceTracker() {
        return this.getOutputMinFrameDurationlomOqCM.getPerformanceTracker();
    }

    public void setSafeMode(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setSafeMode(z);
    }

    public void setRenderMode(com.airbnb.lottie.RenderMode renderMode) {
        this.getOutputMinFrameDurationlomOqCM.setRenderMode(renderMode);
    }

    public com.airbnb.lottie.RenderMode getRenderMode() {
        return this.getOutputMinFrameDurationlomOqCM.getRenderMode();
    }

    public com.airbnb.lottie.AsyncUpdates getAsyncUpdates() {
        return this.getOutputMinFrameDurationlomOqCM.getAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.getOutputMinFrameDurationlomOqCM.getAsyncUpdatesEnabled();
    }

    public void setAsyncUpdates(com.airbnb.lottie.AsyncUpdates asyncUpdates) {
        this.getOutputMinFrameDurationlomOqCM.setAsyncUpdates(asyncUpdates);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setApplyingOpacityToLayersEnabled(z);
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setApplyingShadowToLayersEnabled(z);
    }

    public boolean getClipTextToBoundingBox() {
        return this.getOutputMinFrameDurationlomOqCM.getClipTextToBoundingBox();
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setClipTextToBoundingBox(z);
    }

    @java.lang.Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.getOutputMinFrameDurationlomOqCM.disableExtraScaleModeInFitXY();
    }

    public boolean addLottieOnCompositionLoadedListener(com.airbnb.lottie.LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        com.airbnb.lottie.LottieComposition composition = getComposition();
        if (composition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(composition);
        }
        return this.getOutputSizeshNQ4ISI.add(lottieOnCompositionLoadedListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(com.airbnb.lottie.LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.getOutputSizeshNQ4ISI.remove(lottieOnCompositionLoadedListener);
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.getOutputSizeshNQ4ISI.clear();
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.airbnb.lottie.LottieAnimationView.SavedState> CREATOR = new android.os.Parcelable.Creator<com.airbnb.lottie.LottieAnimationView.SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.airbnb.lottie.LottieAnimationView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.airbnb.lottie.LottieAnimationView.SavedState(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.airbnb.lottie.LottieAnimationView.SavedState[] newArray(int i) {
                return new com.airbnb.lottie.LottieAnimationView.SavedState[i];
            }
        };
        java.lang.String Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        int getOutputFormats;
        int getOutputMinFrameDuration;

        /* synthetic */ SavedState(android.os.Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighSpeedVideoFpsRangesFor = parcel.readString();
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readFloat();
            this.getHighSpeedVideoSizes = parcel.readInt() == 1;
            this.Camera2StreamConfigurationMap = parcel.readString();
            this.getOutputFormats = parcel.readInt();
            this.getOutputMinFrameDuration = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.getHighSpeedVideoFpsRangesFor);
            parcel.writeFloat(this.getHighResolutionOutputSizeshNQ4ISI);
            parcel.writeInt(this.getHighSpeedVideoSizes ? 1 : 0);
            parcel.writeString(this.Camera2StreamConfigurationMap);
            parcel.writeInt(this.getOutputFormats);
            parcel.writeInt(this.getOutputMinFrameDuration);
        }
    }

    public void setProgress(float f) {
        this.getOutputSizes.add(com.airbnb.lottie.LottieAnimationView.UserActionTaken.SET_PROGRESS);
        this.getOutputMinFrameDurationlomOqCM.setProgress(f);
    }
}
