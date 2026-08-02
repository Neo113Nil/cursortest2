package com.google.android.material.search;

/* loaded from: classes8.dex */
class SearchBarAnimationHelper {
    private static final long COLLAPSE_DURATION_MS = 250;
    private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100;
    private static final long EXPAND_DURATION_MS = 300;
    private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750;
    private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250;
    private boolean collapsing;
    private android.animation.Animator defaultCenterViewAnimator;
    private boolean expanding;
    private android.animation.Animator secondaryViewAnimator;
    private final java.util.Set<com.google.android.material.search.SearchBar.OnLoadAnimationCallback> onLoadAnimationCallbacks = new java.util.LinkedHashSet();
    private final java.util.Set<android.animation.AnimatorListenerAdapter> expandAnimationListeners = new java.util.LinkedHashSet();
    private final java.util.Set<android.animation.AnimatorListenerAdapter> collapseAnimationListeners = new java.util.LinkedHashSet();
    private boolean onLoadAnimationFadeInEnabled = true;
    private android.animation.Animator runningExpandOrCollapseAnimator = null;

    interface OnLoadAnimationInvocation {
        void invoke(com.google.android.material.search.SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    SearchBarAnimationHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    void startOnLoadAnimation(com.google.android.material.search.SearchBar searchBar) {
        dispatchOnLoadAnimation(new com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda1
            @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
            public final void invoke(com.google.android.material.search.SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                onLoadAnimationCallback.onAnimationStart();
            }
        });
        android.widget.TextView textView = searchBar.getTextView();
        final android.view.View centerView = searchBar.getCenterView();
        android.view.View secondaryActionMenuItemView = com.google.android.material.internal.ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        final android.animation.Animator secondaryViewAnimator = getSecondaryViewAnimator(textView, secondaryActionMenuItemView);
        secondaryViewAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.search.SearchBarAnimationHelper.this.dispatchOnLoadAnimation(new com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation() { // from class: com.google.android.material.search.SearchBarAnimationHelper$1$$ExternalSyntheticLambda0
                    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
                    public final void invoke(com.google.android.material.search.SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                        onLoadAnimationCallback.onAnimationEnd();
                    }
                });
            }
        });
        this.secondaryViewAnimator = secondaryViewAnimator;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof com.google.android.material.animation.AnimatableView) {
            java.util.Objects.requireNonNull(secondaryViewAnimator);
            ((com.google.android.material.animation.AnimatableView) centerView).startAnimation(new com.google.android.material.animation.AnimatableView.Listener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2
                @Override // com.google.android.material.animation.AnimatableView.Listener
                public final void onAnimationEnd() {
                    secondaryViewAnimator.start();
                }
            });
        } else {
            if (centerView != 0) {
                centerView.setAlpha(0.0f);
                centerView.setVisibility(0);
                android.animation.Animator defaultCenterViewAnimator = getDefaultCenterViewAnimator(centerView);
                this.defaultCenterViewAnimator = defaultCenterViewAnimator;
                defaultCenterViewAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        centerView.setVisibility(8);
                        secondaryViewAnimator.start();
                    }
                });
                defaultCenterViewAnimator.start();
                return;
            }
            secondaryViewAnimator.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void stopOnLoadAnimation(com.google.android.material.search.SearchBar searchBar) {
        android.animation.Animator animator = this.secondaryViewAnimator;
        if (animator != null) {
            animator.end();
        }
        android.animation.Animator animator2 = this.defaultCenterViewAnimator;
        if (animator2 != null) {
            animator2.end();
        }
        android.view.View centerView = searchBar.getCenterView();
        if (centerView instanceof com.google.android.material.animation.AnimatableView) {
            ((com.google.android.material.animation.AnimatableView) centerView).stopAnimation();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    boolean isOnLoadAnimationFadeInEnabled() {
        return this.onLoadAnimationFadeInEnabled;
    }

    void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.onLoadAnimationFadeInEnabled = z;
    }

    void addOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.onLoadAnimationCallbacks.add(onLoadAnimationCallback);
    }

    boolean removeOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.onLoadAnimationCallbacks.remove(onLoadAnimationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnLoadAnimation(com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation onLoadAnimationInvocation) {
        java.util.Iterator<com.google.android.material.search.SearchBar.OnLoadAnimationCallback> it = this.onLoadAnimationCallbacks.iterator();
        while (it.hasNext()) {
            onLoadAnimationInvocation.invoke(it.next());
        }
    }

    private android.animation.Animator getDefaultCenterViewAnimator(android.view.View view) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(view));
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(this.onLoadAnimationFadeInEnabled ? 250L : 0L);
        ofFloat.setStartDelay(this.onLoadAnimationFadeInEnabled ? 500L : 0L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(view));
        ofFloat2.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    private android.animation.Animator getSecondaryViewAnimator(android.widget.TextView textView, android.view.View view) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(getTextViewAnimator(textView));
        if (view != null) {
            animatorSet.play(getSecondaryActionMenuItemAnimator(view));
        }
        return animatorSet;
    }

    private android.animation.Animator getTextViewAnimator(android.widget.TextView textView) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(textView));
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    private android.animation.Animator getSecondaryActionMenuItemAnimator(android.view.View view) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(view));
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    void startExpandAnimation(final com.google.android.material.search.SearchBar searchBar, final android.view.View view, final com.google.android.material.appbar.AppBarLayout appBarLayout, final boolean z) {
        android.animation.Animator animator;
        if (isCollapsing() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.expanding = true;
        view.setVisibility(4);
        view.post(new java.lang.Runnable() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.search.SearchBarAnimationHelper.this.m10271x1b96b119(searchBar, view, appBarLayout, z);
            }
        });
    }

    /* renamed from: lambda$startExpandAnimation$0$com-google-android-material-search-SearchBarAnimationHelper, reason: not valid java name */
    /* synthetic */ void m10271x1b96b119(com.google.android.material.search.SearchBar searchBar, android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout, boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(getFadeOutChildrenAnimator(searchBar, view), getExpandAnimator(searchBar, view, appBarLayout));
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.search.SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
            }
        });
        java.util.Iterator<android.animation.AnimatorListenerAdapter> it = this.expandAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    private android.animation.Animator getExpandAnimator(final com.google.android.material.search.SearchBar searchBar, android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(300L).addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                searchBar.setVisibility(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.search.SearchBarAnimationHelper.this.expanding = false;
            }
        }).getExpandAnimator();
    }

    boolean isExpanding() {
        return this.expanding;
    }

    void addExpandAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.expandAnimationListeners.add(animatorListenerAdapter);
    }

    boolean removeExpandAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        return this.expandAnimationListeners.remove(animatorListenerAdapter);
    }

    void startCollapseAnimation(com.google.android.material.search.SearchBar searchBar, android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout, boolean z) {
        android.animation.Animator animator;
        if (isExpanding() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.collapsing = true;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(getCollapseAnimator(searchBar, view, appBarLayout), getFadeInChildrenAnimator(searchBar));
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                com.google.android.material.search.SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
            }
        });
        java.util.Iterator<android.animation.AnimatorListenerAdapter> it = this.collapseAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    private android.animation.Animator getCollapseAnimator(final com.google.android.material.search.SearchBar searchBar, android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(250L).addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                searchBar.stopOnLoadAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                searchBar.setVisibility(0);
                com.google.android.material.search.SearchBarAnimationHelper.this.collapsing = false;
            }
        }).getCollapseAnimator();
    }

    boolean isCollapsing() {
        return this.collapsing;
    }

    void addCollapseAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.collapseAnimationListeners.add(animatorListenerAdapter);
    }

    boolean removeCollapseAnimationListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        return this.collapseAnimationListeners.remove(animatorListenerAdapter);
    }

    private com.google.android.material.internal.ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(com.google.android.material.search.SearchBar searchBar, android.view.View view, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        return new com.google.android.material.internal.ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(getExpandedViewBackgroundUpdateListener(searchBar, view)).setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0).addEndAnchoredViews(getEndAnchoredViews(view));
    }

    private android.animation.ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(com.google.android.material.search.SearchBar searchBar, final android.view.View view) {
        final com.google.android.material.shape.MaterialShapeDrawable createWithElevationOverlay = com.google.android.material.shape.MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        createWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        createWithElevationOverlay.setElevation(androidx.core.view.ViewCompat.getElevation(searchBar));
        return new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.search.SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1(com.google.android.material.shape.MaterialShapeDrawable.this, view, valueAnimator);
            }
        };
    }

    static /* synthetic */ void lambda$getExpandedViewBackgroundUpdateListener$1(com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
        androidx.core.view.ViewCompat.setBackground(view, materialShapeDrawable);
        view.setAlpha(1.0f);
    }

    private android.animation.Animator getFadeOutChildrenAnimator(com.google.android.material.search.SearchBar searchBar, final android.view.View view) {
        java.util.List<android.view.View> fadeChildren = getFadeChildren(searchBar);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(fadeChildren));
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        ofFloat.setDuration(75L);
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    private android.animation.Animator getFadeInChildrenAnimator(com.google.android.material.search.SearchBar searchBar) {
        java.util.List<android.view.View> fadeChildren = getFadeChildren(searchBar);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(fadeChildren));
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    private java.util.List<android.view.View> getFadeChildren(com.google.android.material.search.SearchBar searchBar) {
        java.util.List<android.view.View> children = com.google.android.material.internal.ViewUtils.getChildren(searchBar);
        if (searchBar.getCenterView() != null) {
            children.remove(searchBar.getCenterView());
        }
        return children;
    }

    private java.util.List<android.view.View> getEndAnchoredViews(android.view.View view) {
        boolean isLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if ((!isLayoutRtl && (childAt instanceof androidx.appcompat.widget.ActionMenuView)) || (isLayoutRtl && !(childAt instanceof androidx.appcompat.widget.ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }
}
