package com.google.android.material.search;

/* loaded from: classes8.dex */
class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250;
    private static final long HIDE_DURATION_MS = 250;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300;
    private static final long SHOW_DURATION_MS = 300;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150;
    private final com.google.android.material.motion.MaterialMainContainerBackHelper backHelper;
    private android.animation.AnimatorSet backProgressAnimatorSet;
    private final android.widget.ImageButton clearButton;
    private final com.google.android.material.internal.TouchObserverFrameLayout contentContainer;
    private final android.view.View divider;
    private final androidx.appcompat.widget.Toolbar dummyToolbar;
    private final android.widget.EditText editText;
    private final android.widget.FrameLayout headerContainer;
    private final com.google.android.material.internal.ClippableRoundedCornerLayout rootView;
    private final android.view.View scrim;
    private com.google.android.material.search.SearchBar searchBar;
    private final android.widget.TextView searchPrefix;
    private final com.google.android.material.search.SearchView searchView;
    private final androidx.appcompat.widget.Toolbar toolbar;
    private final android.widget.FrameLayout toolbarContainer;

    SearchViewAnimationHelper(com.google.android.material.search.SearchView searchView) {
        this.searchView = searchView;
        this.scrim = searchView.scrim;
        com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.rootView = clippableRoundedCornerLayout;
        this.headerContainer = searchView.headerContainer;
        this.toolbarContainer = searchView.toolbarContainer;
        this.toolbar = searchView.toolbar;
        this.dummyToolbar = searchView.dummyToolbar;
        this.searchPrefix = searchView.searchPrefix;
        this.editText = searchView.editText;
        this.clearButton = searchView.clearButton;
        this.divider = searchView.divider;
        this.contentContainer = searchView.contentContainer;
        this.backHelper = new com.google.android.material.motion.MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    void setSearchBar(com.google.android.material.search.SearchBar searchBar) {
        this.searchBar = searchBar;
    }

    void show() {
        if (this.searchBar != null) {
            startShowAnimationExpand();
        } else {
            startShowAnimationTranslate();
        }
    }

    android.animation.AnimatorSet hide() {
        if (this.searchBar != null) {
            return startHideAnimationCollapse();
        }
        return startHideAnimationTranslate();
    }

    private void startShowAnimationExpand() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.SHOWING);
        setUpDummyToolbarIfNeeded();
        this.editText.setText(this.searchBar.getText());
        android.widget.EditText editText = this.editText;
        editText.setSelection(editText.getText().length());
        this.rootView.setVisibility(4);
        this.rootView.post(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.SearchViewAnimationHelper.this.m10281x94743afc();
            }
        });
    }

    /* renamed from: lambda$startShowAnimationExpand$0$com-google-android-material-search-SearchViewAnimationHelper, reason: not valid java name */
    /* synthetic */ void m10281x94743afc() {
        android.animation.AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(true);
        expandCollapseAnimatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.rootView.setVisibility(0);
                com.google.android.material.search.SearchViewAnimationHelper.this.searchBar.stopOnLoadAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (!com.google.android.material.search.SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    com.google.android.material.search.SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                com.google.android.material.search.SearchViewAnimationHelper.this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.SHOWN);
            }
        });
        expandCollapseAnimatorSet.start();
    }

    private android.animation.AnimatorSet startHideAnimationCollapse() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        android.animation.AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(false);
        expandCollapseAnimatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.HIDING);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!com.google.android.material.search.SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    com.google.android.material.search.SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                com.google.android.material.search.SearchViewAnimationHelper.this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.HIDDEN);
            }
        });
        expandCollapseAnimatorSet.start();
        return expandCollapseAnimatorSet;
    }

    private void startShowAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            final com.google.android.material.search.SearchView searchView = this.searchView;
            java.util.Objects.requireNonNull(searchView);
            searchView.postDelayed(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.material.search.SearchView.this.requestFocusAndShowKeyboardIfNeeded();
                }
            }, 150L);
        }
        this.rootView.setVisibility(4);
        this.rootView.post(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.SearchViewAnimationHelper.this.m10282x4df249eb();
            }
        });
    }

    /* renamed from: lambda$startShowAnimationTranslate$1$com-google-android-material-search-SearchViewAnimationHelper, reason: not valid java name */
    /* synthetic */ void m10282x4df249eb() {
        this.rootView.setTranslationY(r0.getHeight());
        android.animation.AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(true);
        translateAnimatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.rootView.setVisibility(0);
                com.google.android.material.search.SearchViewAnimationHelper.this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.SHOWING);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (!com.google.android.material.search.SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    com.google.android.material.search.SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                com.google.android.material.search.SearchViewAnimationHelper.this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.SHOWN);
            }
        });
        translateAnimatorSet.start();
    }

    private android.animation.AnimatorSet startHideAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        android.animation.AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(false);
        translateAnimatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.HIDING);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!com.google.android.material.search.SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    com.google.android.material.search.SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                com.google.android.material.search.SearchViewAnimationHelper.this.searchView.setTransitionState(com.google.android.material.search.SearchView.TransitionState.HIDDEN);
            }
        });
        translateAnimatorSet.start();
        return translateAnimatorSet;
    }

    private android.animation.AnimatorSet getTranslateAnimatorSet(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(getTranslationYAnimator());
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet.setDuration(z ? SHOW_TRANSLATE_DURATION_MS : 300L);
        return animatorSet;
    }

    private android.animation.Animator getTranslationYAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.rootView.getHeight(), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationYListener(this.rootView));
        return ofFloat;
    }

    private android.animation.AnimatorSet getExpandCollapseAnimatorSet(final boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        if (this.backProgressAnimatorSet == null) {
            animatorSet.playTogether(getButtonsProgressAnimator(z), getButtonsTranslationAnimator(z));
        }
        animatorSet.playTogether(getScrimAlphaAnimator(z), getRootViewAnimator(z), getClearButtonAnimator(z), getContentAnimator(z), getHeaderContainerAnimator(z), getDummyToolbarAnimator(z), getActionMenuViewsAlphaAnimator(z), getEditTextAnimator(z), getSearchPrefixAnimator(z));
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.setContentViewsAlpha(z ? 0.0f : 1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.setContentViewsAlpha(z ? 1.0f : 0.0f);
                com.google.android.material.search.SearchViewAnimationHelper.this.rootView.resetClipBoundsAndCornerRadius();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentViewsAlpha(float f) {
        this.clearButton.setAlpha(f);
        this.divider.setAlpha(f);
        this.contentContainer.setAlpha(f);
        setActionMenuViewAlphaIfNeeded(f);
    }

    private void setActionMenuViewAlphaIfNeeded(float f) {
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        if (!this.searchView.isMenuItemsAnimated() || (actionMenuView = com.google.android.material.internal.ToolbarUtils.getActionMenuView(this.toolbar)) == null) {
            return;
        }
        actionMenuView.setAlpha(f);
    }

    private android.animation.Animator getScrimAlphaAnimator(boolean z) {
        android.animation.TimeInterpolator timeInterpolator = z ? com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR : com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, timeInterpolator));
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(this.scrim));
        return ofFloat;
    }

    private android.animation.Animator getRootViewAnimator(boolean z) {
        android.graphics.Rect initialHideToClipBounds = this.backHelper.getInitialHideToClipBounds();
        android.graphics.Rect initialHideFromClipBounds = this.backHelper.getInitialHideFromClipBounds();
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(this.searchView);
        }
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = com.google.android.material.internal.ViewUtils.calculateOffsetRectFromBounds(this.rootView, this.searchBar);
        }
        final android.graphics.Rect rect = new android.graphics.Rect(initialHideFromClipBounds);
        final float cornerSize = this.searchBar.getCornerSize();
        final float max = java.lang.Math.max(this.rootView.getCornerRadius(), this.backHelper.getExpandedCornerSize());
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new com.google.android.material.internal.RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.search.SearchViewAnimationHelper.this.m10280xa183b80f(cornerSize, max, rect, valueAnimator);
            }
        });
        ofObject.setDuration(z ? 300L : 250L);
        ofObject.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    /* renamed from: lambda$getRootViewAnimator$2$com-google-android-material-search-SearchViewAnimationHelper, reason: not valid java name */
    /* synthetic */ void m10280xa183b80f(float f, float f2, android.graphics.Rect rect, android.animation.ValueAnimator valueAnimator) {
        this.rootView.updateClipBoundsAndCornerRadius(rect, com.google.android.material.animation.AnimationUtils.lerp(f, f2, valueAnimator.getAnimatedFraction()));
    }

    private android.animation.Animator getClearButtonAnimator(boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z ? 50L : HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS);
        ofFloat.setStartDelay(z ? 250L : 0L);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(this.clearButton));
        return ofFloat;
    }

    private android.animation.AnimatorSet getButtonsProgressAnimator(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private android.animation.AnimatorSet getButtonsTranslationAnimator(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        addBackButtonTranslationAnimatorIfNeeded(animatorSet);
        addActionMenuViewAnimatorIfNeeded(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private void addBackButtonTranslationAnimatorIfNeeded(android.animation.AnimatorSet animatorSet) {
        android.widget.ImageButton navigationIconButton = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(getFromTranslationXStart(navigationIconButton), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationXListener(navigationIconButton));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    private void addBackButtonProgressAnimatorIfNeeded(android.animation.AnimatorSet animatorSet) {
        android.widget.ImageButton navigationIconButton = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        android.graphics.drawable.Drawable unwrap = androidx.core.graphics.drawable.DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (this.searchView.isAnimatedNavigationIcon()) {
            addDrawerArrowDrawableAnimatorIfNeeded(animatorSet, unwrap);
            addFadeThroughDrawableAnimatorIfNeeded(animatorSet, unwrap);
        } else {
            setFullDrawableProgressIfNeeded(unwrap);
        }
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(android.animation.AnimatorSet animatorSet, android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable) {
            final androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable = (androidx.appcompat.graphics.drawable.DrawerArrowDrawable) drawable;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    androidx.appcompat.graphics.drawable.DrawerArrowDrawable.this.setProgress(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(android.animation.AnimatorSet animatorSet, android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.FadeThroughDrawable) {
            final com.google.android.material.internal.FadeThroughDrawable fadeThroughDrawable = (com.google.android.material.internal.FadeThroughDrawable) drawable;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    com.google.android.material.internal.FadeThroughDrawable.this.setProgress(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    private void setFullDrawableProgressIfNeeded(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable) {
            ((androidx.appcompat.graphics.drawable.DrawerArrowDrawable) drawable).setProgress(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.FadeThroughDrawable) {
            ((com.google.android.material.internal.FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    private void addActionMenuViewAnimatorIfNeeded(android.animation.AnimatorSet animatorSet) {
        androidx.appcompat.widget.ActionMenuView actionMenuView = com.google.android.material.internal.ToolbarUtils.getActionMenuView(this.toolbar);
        if (actionMenuView == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(getFromTranslationXEnd(actionMenuView), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationXListener(actionMenuView));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    private android.animation.Animator getDummyToolbarAnimator(boolean z) {
        return getTranslationAnimator(z, false, this.dummyToolbar);
    }

    private android.animation.Animator getHeaderContainerAnimator(boolean z) {
        return getTranslationAnimator(z, false, this.headerContainer);
    }

    private android.animation.Animator getActionMenuViewsAlphaAnimator(boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.searchView.isMenuItemsAnimated()) {
            ofFloat.addUpdateListener(new com.google.android.material.internal.FadeThroughUpdateListener(com.google.android.material.internal.ToolbarUtils.getActionMenuView(this.dummyToolbar), com.google.android.material.internal.ToolbarUtils.getActionMenuView(this.toolbar)));
        }
        return ofFloat;
    }

    private android.animation.Animator getSearchPrefixAnimator(boolean z) {
        return getTranslationAnimator(z, true, this.searchPrefix);
    }

    private android.animation.Animator getEditTextAnimator(boolean z) {
        return getTranslationAnimator(z, true, this.editText);
    }

    private android.animation.Animator getContentAnimator(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(getContentAlphaAnimator(z), getDividerAnimator(z), getContentScaleAnimator(z));
        return animatorSet;
    }

    private android.animation.Animator getContentAlphaAnimator(boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z ? 150L : HIDE_CONTENT_ALPHA_DURATION_MS);
        ofFloat.setStartDelay(z ? 75L : 0L);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(this.divider, this.contentContainer));
        return ofFloat;
    }

    private android.animation.Animator getDividerAnimator(boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat((this.contentContainer.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat.setDuration(z ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationYListener(this.divider));
        return ofFloat;
    }

    private android.animation.Animator getContentScaleAnimator(boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat.setDuration(z ? 300L : 250L);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.scaleListener(this.contentContainer));
        return ofFloat;
    }

    private android.animation.Animator getTranslationAnimator(boolean z, boolean z2, android.view.View view) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(z2 ? getFromTranslationXStart(view) : getFromTranslationXEnd(view), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationXListener(view));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationYListener(view));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private int getFromTranslationXStart(android.view.View view) {
        int marginStart = androidx.core.view.MarginLayoutParamsCompat.getMarginStart((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int paddingStart = androidx.core.view.ViewCompat.getPaddingStart(this.searchBar);
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(this.searchBar)) {
            return ((this.searchBar.getWidth() - this.searchBar.getRight()) + marginStart) - paddingStart;
        }
        return (this.searchBar.getLeft() - marginStart) + paddingStart;
    }

    private int getFromTranslationXEnd(android.view.View view) {
        int marginEnd = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(this.searchBar)) {
            return this.searchBar.getLeft() - marginEnd;
        }
        return (this.searchBar.getRight() - this.searchView.getWidth()) + marginEnd;
    }

    private int getFromTranslationY() {
        return ((this.searchBar.getTop() + this.searchBar.getBottom()) / 2) - ((this.toolbarContainer.getTop() + this.toolbarContainer.getBottom()) / 2);
    }

    private void setUpDummyToolbarIfNeeded() {
        android.view.Menu menu = this.dummyToolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.searchBar.getMenuResId() != -1 && this.searchView.isMenuItemsAnimated()) {
            this.dummyToolbar.inflateMenu(this.searchBar.getMenuResId());
            setMenuItemsNotClickable(this.dummyToolbar);
            this.dummyToolbar.setVisibility(0);
            return;
        }
        this.dummyToolbar.setVisibility(8);
    }

    private void setMenuItemsNotClickable(androidx.appcompat.widget.Toolbar toolbar) {
        androidx.appcompat.widget.ActionMenuView actionMenuView = com.google.android.material.internal.ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i = 0; i < actionMenuView.getChildCount(); i++) {
                android.view.View childAt = actionMenuView.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    void startBackProgress(androidx.view.BackEventCompat backEventCompat) {
        this.backHelper.startBackProgress(backEventCompat, this.searchBar);
    }

    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat) {
        if (backEventCompat.getProgress() > 0.0f) {
            com.google.android.material.motion.MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
            com.google.android.material.search.SearchBar searchBar = this.searchBar;
            materialMainContainerBackHelper.updateBackProgress(backEventCompat, searchBar, searchBar.getCornerSize());
            android.animation.AnimatorSet animatorSet = this.backProgressAnimatorSet;
            if (animatorSet == null) {
                if (this.searchView.isAdjustNothingSoftInputMode()) {
                    this.searchView.clearFocusAndHideKeyboard();
                }
                if (this.searchView.isAnimatedNavigationIcon()) {
                    android.animation.AnimatorSet buttonsProgressAnimator = getButtonsProgressAnimator(false);
                    this.backProgressAnimatorSet = buttonsProgressAnimator;
                    buttonsProgressAnimator.start();
                    this.backProgressAnimatorSet.pause();
                    return;
                }
                return;
            }
            animatorSet.setCurrentPlayTime((long) (backEventCompat.getProgress() * this.backProgressAnimatorSet.getDuration()));
        }
    }

    public androidx.view.BackEventCompat onHandleBackInvoked() {
        return this.backHelper.onHandleBackInvoked();
    }

    public void finishBackProgress() {
        this.backHelper.finishBackProgress(hide().getTotalDuration(), this.searchBar);
        if (this.backProgressAnimatorSet != null) {
            getButtonsTranslationAnimator(false).start();
            this.backProgressAnimatorSet.resume();
        }
        this.backProgressAnimatorSet = null;
    }

    public void cancelBackProgress() {
        this.backHelper.cancelBackProgress(this.searchBar);
        android.animation.AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.backProgressAnimatorSet = null;
    }

    com.google.android.material.motion.MaterialMainContainerBackHelper getBackHelper() {
        return this.backHelper;
    }
}
