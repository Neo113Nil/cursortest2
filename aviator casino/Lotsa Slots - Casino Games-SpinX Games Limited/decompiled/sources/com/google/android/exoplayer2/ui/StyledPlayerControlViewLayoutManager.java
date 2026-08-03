package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
final class StyledPlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private final android.view.ViewGroup basicControls;
    private final android.view.ViewGroup bottomBar;
    private final android.view.ViewGroup centerControls;
    private final android.view.View controlsBackground;
    private final android.view.ViewGroup extraControls;
    private final android.view.ViewGroup extraControlsScrollView;
    private final android.animation.AnimatorSet hideAllBarsAnimator;
    private final android.animation.AnimatorSet hideMainBarAnimator;
    private final android.animation.AnimatorSet hideProgressBarAnimator;
    private boolean isMinimalMode;
    private final android.view.ViewGroup minimalControls;
    private boolean needToShowBars;
    private final android.animation.ValueAnimator overflowHideAnimator;
    private final android.animation.ValueAnimator overflowShowAnimator;
    private final android.view.View overflowShowButton;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView playerControlView;
    private final android.animation.AnimatorSet showAllBarsAnimator;
    private final android.animation.AnimatorSet showMainBarAnimator;
    private final android.view.View timeBar;
    private final android.view.ViewGroup timeView;
    private final java.lang.Runnable showAllBarsRunnable = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.showAllBars();
        }
    };
    private final java.lang.Runnable hideAllBarsRunnable = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda6
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.hideAllBars();
        }
    };
    private final java.lang.Runnable hideProgressBarRunnable = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda7
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.hideProgressBar();
        }
    };
    private final java.lang.Runnable hideMainBarRunnable = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda8
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.hideMainBar();
        }
    };
    private final java.lang.Runnable hideControllerRunnable = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.hideController();
        }
    };
    private final android.view.View.OnLayoutChangeListener onLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda10
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    };
    private boolean animationEnabled = true;
    private int uxState = 0;
    private final java.util.List<android.view.View> shownButtons = new java.util.ArrayList();

    public StyledPlayerControlViewLayoutManager(final com.google.android.exoplayer2.ui.StyledPlayerControlView styledPlayerControlView) {
        this.playerControlView = styledPlayerControlView;
        this.controlsBackground = styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_controls_background);
        this.centerControls = (android.view.ViewGroup) styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_center_controls);
        this.minimalControls = (android.view.ViewGroup) styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_minimal_controls);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_bottom_bar);
        this.bottomBar = viewGroup;
        this.timeView = (android.view.ViewGroup) styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_time);
        android.view.View findViewById = styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_progress);
        this.timeBar = findViewById;
        this.basicControls = (android.view.ViewGroup) styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_basic_controls);
        this.extraControls = (android.view.ViewGroup) styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_extra_controls);
        this.extraControlsScrollView = (android.view.ViewGroup) styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_extra_controls_scroll_view);
        android.view.View findViewById2 = styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_overflow_show);
        this.overflowShowButton = findViewById2;
        android.view.View findViewById3 = styledPlayerControlView.findViewById(com.google.android.exoplayer2.ui.R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.onOverflowButtonClick(view);
                }
            });
            findViewById3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.onOverflowButtonClick(view);
                }
            });
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.m5460x2808b27(valueAnimator);
            }
        });
        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (!(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.timeBar instanceof com.google.android.exoplayer2.ui.DefaultTimeBar) || com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((com.google.android.exoplayer2.ui.DefaultTimeBar) com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.timeBar).hideScrubber(250L);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.controlsBackground != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.controlsBackground.setVisibility(4);
                }
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.centerControls != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.centerControls.setVisibility(4);
                }
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.minimalControls != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.minimalControls.setVisibility(4);
                }
            }
        });
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.m5461xe5ac3e68(valueAnimator);
            }
        });
        ofFloat2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.controlsBackground != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.controlsBackground.setVisibility(0);
                }
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.centerControls != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.centerControls.setVisibility(0);
                }
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.minimalControls != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.minimalControls.setVisibility(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.isMinimalMode ? 0 : 4);
                }
                if (!(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.timeBar instanceof com.google.android.exoplayer2.ui.DefaultTimeBar) || com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((com.google.android.exoplayer2.ui.DefaultTimeBar) com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.timeBar).showScrubber(250L);
            }
        });
        android.content.res.Resources resources = styledPlayerControlView.getResources();
        float dimension = resources.getDimension(com.google.android.exoplayer2.ui.R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(com.google.android.exoplayer2.ui.R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(com.google.android.exoplayer2.ui.R.dimen.exo_styled_bottom_bar_height);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.hideMainBarAnimator = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(1);
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.needToShowBars) {
                    styledPlayerControlView.post(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }
        });
        animatorSet.play(ofFloat).with(ofTranslationY(0.0f, dimension, findViewById)).with(ofTranslationY(0.0f, dimension, viewGroup));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        this.hideProgressBarAnimator = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(2);
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.needToShowBars) {
                    styledPlayerControlView.post(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }
        });
        animatorSet2.play(ofTranslationY(dimension, dimension2, findViewById)).with(ofTranslationY(dimension, dimension2, viewGroup));
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        this.hideAllBarsAnimator = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(2);
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.needToShowBars) {
                    styledPlayerControlView.post(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }
        });
        animatorSet3.play(ofFloat).with(ofTranslationY(0.0f, dimension2, findViewById)).with(ofTranslationY(0.0f, dimension2, viewGroup));
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        this.showMainBarAnimator = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(0);
            }
        });
        animatorSet4.play(ofFloat2).with(ofTranslationY(dimension, 0.0f, findViewById)).with(ofTranslationY(dimension, 0.0f, viewGroup));
        android.animation.AnimatorSet animatorSet5 = new android.animation.AnimatorSet();
        this.showAllBarsAnimator = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.setUxState(0);
            }
        });
        animatorSet5.play(ofFloat2).with(ofTranslationY(dimension2, 0.0f, findViewById)).with(ofTranslationY(dimension2, 0.0f, viewGroup));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.overflowShowAnimator = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.m5462xc8d7f1a9(valueAnimator);
            }
        });
        ofFloat3.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(0);
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.setTranslationX(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth());
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.scrollTo(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth(), 0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.basicControls != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.basicControls.setVisibility(4);
                }
            }
        });
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.overflowHideAnimator = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.m5463xac03a4ea(valueAnimator);
            }
        });
        ofFloat4.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.basicControls != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.basicControls.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(4);
                }
            }
        });
    }

    /* renamed from: lambda$new$0$com-google-android-exoplayer2-ui-StyledPlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m5460x2808b27(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        android.view.ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        android.view.ViewGroup viewGroup2 = this.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* renamed from: lambda$new$1$com-google-android-exoplayer2-ui-StyledPlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m5461xe5ac3e68(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        android.view.ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        android.view.ViewGroup viewGroup2 = this.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* renamed from: lambda$new$2$com-google-android-exoplayer2-ui-StyledPlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m5462xc8d7f1a9(android.animation.ValueAnimator valueAnimator) {
        animateOverflow(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: lambda$new$3$com-google-android-exoplayer2-ui-StyledPlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m5463xac03a4ea(android.animation.ValueAnimator valueAnimator) {
        animateOverflow(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void show() {
        if (!this.playerControlView.isVisible()) {
            this.playerControlView.setVisibility(0);
            this.playerControlView.updateAll();
            this.playerControlView.requestPlayPauseFocus();
        }
        showAllBars();
    }

    public void hide() {
        int i = this.uxState;
        if (i == 3 || i == 2) {
            return;
        }
        removeHideCallbacks();
        if (!this.animationEnabled) {
            hideController();
        } else if (this.uxState == 1) {
            hideProgressBar();
        } else {
            hideAllBars();
        }
    }

    public void hideImmediately() {
        int i = this.uxState;
        if (i == 3 || i == 2) {
            return;
        }
        removeHideCallbacks();
        hideController();
    }

    public void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    public boolean isAnimationEnabled() {
        return this.animationEnabled;
    }

    public void resetHideCallbacks() {
        if (this.uxState == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.playerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.animationEnabled) {
                postDelayedRunnable(this.hideControllerRunnable, showTimeoutMs);
            } else if (this.uxState == 1) {
                postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
            } else {
                postDelayedRunnable(this.hideMainBarRunnable, showTimeoutMs);
            }
        }
    }

    public void removeHideCallbacks() {
        this.playerControlView.removeCallbacks(this.hideControllerRunnable);
        this.playerControlView.removeCallbacks(this.hideAllBarsRunnable);
        this.playerControlView.removeCallbacks(this.hideMainBarRunnable);
        this.playerControlView.removeCallbacks(this.hideProgressBarRunnable);
    }

    public void onAttachedToWindow() {
        this.playerControlView.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onDetachedFromWindow() {
        this.playerControlView.removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public boolean isFullyVisible() {
        return this.uxState == 0 && this.playerControlView.isVisible();
    }

    public void setShowButton(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.shownButtons.remove(view);
            return;
        }
        if (this.isMinimalMode && shouldHideInMinimalMode(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.shownButtons.add(view);
    }

    public boolean getShowButton(android.view.View view) {
        return view != null && this.shownButtons.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUxState(int i) {
        int i2 = this.uxState;
        this.uxState = i;
        if (i == 2) {
            this.playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            this.playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            this.playerControlView.notifyOnVisibilityChange();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean useMinimalMode = useMinimalMode();
        if (this.isMinimalMode != useMinimalMode) {
            this.isMinimalMode = useMinimalMode;
            view.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.updateLayoutForSizeChange();
                }
            });
        }
        boolean z = i3 - i != i7 - i5;
        if (this.isMinimalMode || !z) {
            return;
        }
        view.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.this.onLayoutWidthChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOverflowButtonClick(android.view.View view) {
        resetHideCallbacks();
        if (view.getId() == com.google.android.exoplayer2.ui.R.id.exo_overflow_show) {
            this.overflowShowAnimator.start();
        } else if (view.getId() == com.google.android.exoplayer2.ui.R.id.exo_overflow_hide) {
            this.overflowHideAnimator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAllBars() {
        if (!this.animationEnabled) {
            setUxState(0);
            resetHideCallbacks();
            return;
        }
        int i = this.uxState;
        if (i == 1) {
            this.showMainBarAnimator.start();
        } else if (i == 2) {
            this.showAllBarsAnimator.start();
        } else if (i == 3) {
            this.needToShowBars = true;
        } else if (i == 4) {
            return;
        }
        resetHideCallbacks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAllBars() {
        this.hideAllBarsAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressBar() {
        this.hideProgressBarAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideMainBar() {
        this.hideMainBarAnimator.start();
        postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideController() {
        setUxState(2);
    }

    private static android.animation.ObjectAnimator ofTranslationY(float f, float f2, android.view.View view) {
        return android.animation.ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    private void postDelayedRunnable(java.lang.Runnable runnable, long j) {
        if (j >= 0) {
            this.playerControlView.postDelayed(runnable, j);
        }
    }

    private void animateOverflow(float f) {
        if (this.extraControlsScrollView != null) {
            this.extraControlsScrollView.setTranslationX((int) (r0.getWidth() * (1.0f - f)));
        }
        android.view.ViewGroup viewGroup = this.timeView;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f);
        }
        android.view.ViewGroup viewGroup2 = this.basicControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
    }

    private boolean useMinimalMode() {
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        int height = (this.playerControlView.getHeight() - this.playerControlView.getPaddingBottom()) - this.playerControlView.getPaddingTop();
        int widthWithMargins = getWidthWithMargins(this.centerControls);
        android.view.ViewGroup viewGroup = this.centerControls;
        int paddingLeft = widthWithMargins - (viewGroup != null ? viewGroup.getPaddingLeft() + this.centerControls.getPaddingRight() : 0);
        int heightWithMargins = getHeightWithMargins(this.centerControls);
        android.view.ViewGroup viewGroup2 = this.centerControls;
        return width <= java.lang.Math.max(paddingLeft, getWidthWithMargins(this.timeView) + getWidthWithMargins(this.overflowShowButton)) || height <= (heightWithMargins - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.centerControls.getPaddingBottom() : 0)) + (getHeightWithMargins(this.bottomBar) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayoutForSizeChange() {
        android.view.ViewGroup viewGroup = this.minimalControls;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.isMinimalMode ? 0 : 4);
        }
        if (this.timeBar != null) {
            int dimensionPixelSize = this.playerControlView.getResources().getDimensionPixelSize(com.google.android.exoplayer2.ui.R.dimen.exo_styled_progress_margin_bottom);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.timeBar.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.isMinimalMode) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.timeBar.setLayoutParams(marginLayoutParams);
            }
            android.view.View view = this.timeBar;
            if (view instanceof com.google.android.exoplayer2.ui.DefaultTimeBar) {
                com.google.android.exoplayer2.ui.DefaultTimeBar defaultTimeBar = (com.google.android.exoplayer2.ui.DefaultTimeBar) view;
                if (this.isMinimalMode) {
                    defaultTimeBar.hideScrubber(true);
                } else {
                    int i = this.uxState;
                    if (i == 1) {
                        defaultTimeBar.hideScrubber(false);
                    } else if (i != 3) {
                        defaultTimeBar.showScrubber();
                    }
                }
            }
        }
        for (android.view.View view2 : this.shownButtons) {
            view2.setVisibility((this.isMinimalMode && shouldHideInMinimalMode(view2)) ? 4 : 0);
        }
    }

    private boolean shouldHideInMinimalMode(android.view.View view) {
        int id = view.getId();
        return id == com.google.android.exoplayer2.ui.R.id.exo_bottom_bar || id == com.google.android.exoplayer2.ui.R.id.exo_prev || id == com.google.android.exoplayer2.ui.R.id.exo_next || id == com.google.android.exoplayer2.ui.R.id.exo_rew || id == com.google.android.exoplayer2.ui.R.id.exo_rew_with_amount || id == com.google.android.exoplayer2.ui.R.id.exo_ffwd || id == com.google.android.exoplayer2.ui.R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutWidthChanged() {
        int i;
        if (this.basicControls == null || this.extraControls == null) {
            return;
        }
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        while (true) {
            if (this.extraControls.getChildCount() <= 1) {
                break;
            }
            int childCount = this.extraControls.getChildCount() - 2;
            android.view.View childAt = this.extraControls.getChildAt(childCount);
            this.extraControls.removeViewAt(childCount);
            this.basicControls.addView(childAt, 0);
        }
        android.view.View view = this.overflowShowButton;
        if (view != null) {
            view.setVisibility(8);
        }
        int widthWithMargins = getWidthWithMargins(this.timeView);
        int childCount2 = this.basicControls.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            widthWithMargins += getWidthWithMargins(this.basicControls.getChildAt(i2));
        }
        if (widthWithMargins > width) {
            android.view.View view2 = this.overflowShowButton;
            if (view2 != null) {
                view2.setVisibility(0);
                widthWithMargins += getWidthWithMargins(this.overflowShowButton);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i3 = 0; i3 < childCount2; i3++) {
                android.view.View childAt2 = this.basicControls.getChildAt(i3);
                widthWithMargins -= getWidthWithMargins(childAt2);
                arrayList.add(childAt2);
                if (widthWithMargins <= width) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.basicControls.removeViews(0, arrayList.size());
            for (i = 0; i < arrayList.size(); i++) {
                this.extraControls.addView((android.view.View) arrayList.get(i), this.extraControls.getChildCount() - 1);
            }
            return;
        }
        android.view.ViewGroup viewGroup = this.extraControlsScrollView;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || this.overflowHideAnimator.isStarted()) {
            return;
        }
        this.overflowShowAnimator.cancel();
        this.overflowHideAnimator.start();
    }

    private static int getWidthWithMargins(android.view.View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return width;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    private static int getHeightWithMargins(android.view.View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return height;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }
}
