package com.google.android.material.floatingactionbutton;

/* loaded from: classes8.dex */
public class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    private static final int HIDE = 1;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    private int animState;
    private boolean animateShowBeforeLayout;
    private final androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> behavior;
    private final com.google.android.material.floatingactionbutton.AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;
    private final com.google.android.material.floatingactionbutton.MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final com.google.android.material.floatingactionbutton.MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;
    protected android.content.res.ColorStateList originalTextCsl;
    private int originalWidth;
    private final com.google.android.material.floatingactionbutton.MotionStrategy showStrategy;
    private final com.google.android.material.floatingactionbutton.MotionStrategy shrinkStrategy;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final android.util.Property<android.view.View, java.lang.Float> WIDTH = new android.util.Property<android.view.View, java.lang.Float>(java.lang.Float.class, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
        @Override // android.util.Property
        public void set(android.view.View view, java.lang.Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(view.getLayoutParams().width);
        }
    };
    static final android.util.Property<android.view.View, java.lang.Float> HEIGHT = new android.util.Property<android.view.View, java.lang.Float>(java.lang.Float.class, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
        @Override // android.util.Property
        public void set(android.view.View view, java.lang.Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(view.getLayoutParams().height);
        }
    };
    static final android.util.Property<android.view.View, java.lang.Float> PADDING_START = new android.util.Property<android.view.View, java.lang.Float>(java.lang.Float.class, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.8
        @Override // android.util.Property
        public void set(android.view.View view, java.lang.Float f) {
            androidx.core.view.ViewCompat.setPaddingRelative(view, f.intValue(), view.getPaddingTop(), androidx.core.view.ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(androidx.core.view.ViewCompat.getPaddingStart(view));
        }
    };
    static final android.util.Property<android.view.View, java.lang.Float> PADDING_END = new android.util.Property<android.view.View, java.lang.Float>(java.lang.Float.class, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
        @Override // android.util.Property
        public void set(android.view.View view, java.lang.Float f) {
            androidx.core.view.ViewCompat.setPaddingRelative(view, androidx.core.view.ViewCompat.getPaddingStart(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(androidx.core.view.ViewCompat.getPaddingEnd(view));
        }
    };

    public static abstract class OnChangedCallback {
        public void onExtended(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    interface Size {
        int getHeight();

        android.view.ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(android.content.Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, r9), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.animState = 0;
        com.google.android.material.floatingactionbutton.AnimatorTracker animatorTracker = new com.google.android.material.floatingactionbutton.AnimatorTracker();
        this.changeVisibilityTracker = animatorTracker;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ShowStrategy showStrategy = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ShowStrategy(animatorTracker);
        this.showStrategy = showStrategy;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.HideStrategy hideStrategy = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.HideStrategy(animatorTracker);
        this.hideStrategy = hideStrategy;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        android.content.Context context2 = getContext();
        this.behavior = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.ExtendedFloatingActionButton, i, i2, new int[0]);
        com.google.android.material.animation.MotionSpec createFromAttribute = com.google.android.material.animation.MotionSpec.createFromAttribute(context2, obtainStyledAttributes, com.google.android.material.R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        com.google.android.material.animation.MotionSpec createFromAttribute2 = com.google.android.material.animation.MotionSpec.createFromAttribute(context2, obtainStyledAttributes, com.google.android.material.R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        com.google.android.material.animation.MotionSpec createFromAttribute3 = com.google.android.material.animation.MotionSpec.createFromAttribute(context2, obtainStyledAttributes, com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        com.google.android.material.animation.MotionSpec createFromAttribute4 = com.google.android.material.animation.MotionSpec.createFromAttribute(context2, obtainStyledAttributes, com.google.android.material.R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.collapsedSize = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.extendStrategyType = i3;
        this.extendedPaddingStart = androidx.core.view.ViewCompat.getPaddingStart(this);
        this.extendedPaddingEnd = androidx.core.view.ViewCompat.getPaddingEnd(this);
        com.google.android.material.floatingactionbutton.AnimatorTracker animatorTracker2 = new com.google.android.material.floatingactionbutton.AnimatorTracker();
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ChangeSizeStrategy changeSizeStrategy = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ChangeSizeStrategy(animatorTracker2, getSizeFromExtendStrategyType(i3), true);
        this.extendStrategy = changeSizeStrategy;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ChangeSizeStrategy changeSizeStrategy2 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ChangeSizeStrategy(animatorTracker2, new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public android.view.ViewGroup.LayoutParams getLayoutParams() {
                return new android.view.ViewGroup.LayoutParams(getWidth(), getHeight());
            }
        }, false);
        this.shrinkStrategy = changeSizeStrategy2;
        showStrategy.setMotionSpec(createFromAttribute);
        hideStrategy.setMotionSpec(createFromAttribute2);
        changeSizeStrategy.setMotionSpec(createFromAttribute3);
        changeSizeStrategy2.setMotionSpec(createFromAttribute4);
        obtainStyledAttributes.recycle();
        setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel.builder(context2, attributeSet, i, i2, com.google.android.material.shape.ShapeAppearanceModel.PILL).build());
        saveOriginalTextCsl();
    }

    private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size getSizeFromExtendStrategyType(int i) {
        final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size size = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.2
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                int measuredWidth = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getMeasuredWidth();
                int collapsedPadding = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getCollapsedPadding();
                return (measuredWidth - (collapsedPadding * 2)) + com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingStart + com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getMeasuredHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public android.view.ViewGroup.LayoutParams getLayoutParams() {
                return new android.view.ViewGroup.LayoutParams(-2, -2);
            }
        };
        final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size size2 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
                if (!(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getParent() instanceof android.view.View)) {
                    return size.getWidth();
                }
                android.view.View view = (android.view.View) com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getParent();
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -2) {
                    return size.getWidth();
                }
                return (view.getWidth() - ((!(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) || (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
                if (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight != -1) {
                    if (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight != 0 && com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight != -2) {
                        return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight;
                    }
                    return size.getHeight();
                }
                if (!(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getParent() instanceof android.view.View)) {
                    return size.getHeight();
                }
                android.view.View view = (android.view.View) com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getParent();
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.height == -2) {
                    return size.getHeight();
                }
                return (view.getHeight() - ((!(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) || (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public android.view.ViewGroup.LayoutParams getLayoutParams() {
                return new android.view.ViewGroup.LayoutParams(-1, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight == 0 ? -2 : com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight);
            }
        };
        return i != 1 ? i != 2 ? new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                if (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalWidth != -1) {
                    if (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalWidth != 0 && com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalWidth != -2) {
                        return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalWidth;
                    }
                    return size.getWidth();
                }
                return size2.getWidth();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                if (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight != -1) {
                    if (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight != 0 && com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight != -2) {
                        return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight;
                    }
                    return size.getHeight();
                }
                return size2.getHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public android.view.ViewGroup.LayoutParams getLayoutParams() {
                return new android.view.ViewGroup.LayoutParams(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalWidth == 0 ? -2 : com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalWidth, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight != 0 ? com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight : -2);
            }
        } : size2 : size;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        saveOriginalTextCsl();
    }

    @Override // android.widget.TextView
    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
    }

    private void saveOriginalTextCsl() {
        this.originalTextCsl = getTextColors();
    }

    protected void silentlyUpdateTextColor(android.content.res.ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isExtended && android.text.TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.isExtended = false;
            this.shrinkStrategy.performNow();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> getBehavior() {
        return this.behavior;
    }

    public void setExtended(boolean z) {
        if (this.isExtended != z) {
            com.google.android.material.floatingactionbutton.MotionStrategy motionStrategy = z ? this.extendStrategy : this.shrinkStrategy;
            if (motionStrategy.shouldCancel()) {
                return;
            }
            motionStrategy.performNow();
        }
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.animateShowBeforeLayout = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i;
        this.extendedPaddingEnd = i3;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = androidx.core.view.ViewCompat.getPaddingStart(this);
        this.extendedPaddingEnd = androidx.core.view.ViewCompat.getPaddingEnd(this);
    }

    public void addOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.showStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.showStrategy.removeAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.hideStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.hideStrategy.removeAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.removeAnimationListener(animatorListener);
    }

    public void addOnExtendAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.extendStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnExtendAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.extendStrategy.removeAnimationListener(animatorListener);
    }

    public void hide() {
        performMotion(1, null);
    }

    public void hide(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
        performMotion(1, onChangedCallback);
    }

    public void show() {
        performMotion(0, null);
    }

    public void show(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
        performMotion(0, onChangedCallback);
    }

    public void extend() {
        performMotion(3, null);
    }

    public void extend(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
        performMotion(3, onChangedCallback);
    }

    public void shrink() {
        performMotion(2, null);
    }

    public void shrink(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
        performMotion(2, onChangedCallback);
    }

    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
        return this.showStrategy.getMotionSpec();
    }

    public void setShowMotionSpec(com.google.android.material.animation.MotionSpec motionSpec) {
        this.showStrategy.setMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(com.google.android.material.animation.MotionSpec.createFromResource(getContext(), i));
    }

    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
        return this.hideStrategy.getMotionSpec();
    }

    public void setHideMotionSpec(com.google.android.material.animation.MotionSpec motionSpec) {
        this.hideStrategy.setMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(com.google.android.material.animation.MotionSpec.createFromResource(getContext(), i));
    }

    public com.google.android.material.animation.MotionSpec getExtendMotionSpec() {
        return this.extendStrategy.getMotionSpec();
    }

    public void setExtendMotionSpec(com.google.android.material.animation.MotionSpec motionSpec) {
        this.extendStrategy.setMotionSpec(motionSpec);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(com.google.android.material.animation.MotionSpec.createFromResource(getContext(), i));
    }

    public com.google.android.material.animation.MotionSpec getShrinkMotionSpec() {
        return this.shrinkStrategy.getMotionSpec();
    }

    public void setShrinkMotionSpec(com.google.android.material.animation.MotionSpec motionSpec) {
        this.shrinkStrategy.setMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(com.google.android.material.animation.MotionSpec.createFromResource(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performMotion(int i, final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
        final com.google.android.material.floatingactionbutton.MotionStrategy motionStrategy;
        if (i == 0) {
            motionStrategy = this.showStrategy;
        } else if (i == 1) {
            motionStrategy = this.hideStrategy;
        } else if (i == 2) {
            motionStrategy = this.shrinkStrategy;
        } else if (i == 3) {
            motionStrategy = this.extendStrategy;
        } else {
            throw new java.lang.IllegalStateException("Unknown strategy type: ".concat(java.lang.String.valueOf(i)));
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        if (!shouldAnimateVisibilityChange()) {
            motionStrategy.performNow();
            motionStrategy.onChange(onChangedCallback);
            return;
        }
        if (i == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = layoutParams.width;
                this.originalHeight = layoutParams.height;
            } else {
                this.originalWidth = getWidth();
                this.originalHeight = getHeight();
            }
        }
        measure(0, 0);
        android.animation.AnimatorSet createAnimator = motionStrategy.createAnimator();
        createAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                motionStrategy.onAnimationStart(animator);
                this.cancelled = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                this.cancelled = true;
                motionStrategy.onAnimationCancel();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                motionStrategy.onAnimationEnd();
                if (this.cancelled) {
                    return;
                }
                motionStrategy.onChange(onChangedCallback);
            }
        });
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = motionStrategy.getListeners().iterator();
        while (it.hasNext()) {
            createAnimator.addListener(it.next());
        }
        createAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeShown() {
        return getVisibility() != 0 ? this.animState == 2 : this.animState != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeHidden() {
        return getVisibility() == 0 ? this.animState == 1 : this.animState != 2;
    }

    private boolean shouldAnimateVisibilityChange() {
        return (androidx.core.view.ViewCompat.isLaidOut(this) || (!isOrWillBeShown() && this.animateShowBeforeLayout)) && !isInEditMode();
    }

    int getCollapsedSize() {
        int i = this.collapsedSize;
        return i < 0 ? (java.lang.Math.min(androidx.core.view.ViewCompat.getPaddingStart(this), androidx.core.view.ViewCompat.getPaddingEnd(this)) * 2) + getIconSize() : i;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoHideCallback;
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoShrinkCallback;
        private android.graphics.Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = true;
        }

        public ExtendedFloatingActionButtonBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.autoShrinkEnabled = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        public void setAutoHideEnabled(boolean z) {
            this.autoHideEnabled = z;
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.autoShrinkEnabled = z;
        }

        public boolean isAutoShrinkEnabled() {
            return this.autoShrinkEnabled;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, android.graphics.Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, android.view.View view) {
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton);
            return false;
        }

        private static boolean isBottomSheet(android.view.View view) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) {
                return ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
            }
            return false;
        }

        void setInternalAutoHideCallback(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
            this.internalAutoHideCallback = onChangedCallback;
        }

        void setInternalAutoShrinkCallback(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
            this.internalAutoShrinkCallback = onChangedCallback;
        }

        private boolean shouldUpdateVisibility(android.view.View view, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.autoHideEnabled || this.autoShrinkEnabled) && ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).getAnchorId() == view.getId();
        }

        private boolean updateFabVisibilityForAppBarLayout(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new android.graphics.Rect();
            }
            android.graphics.Rect rect = this.tmpRect;
            com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(android.view.View view, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        protected void shrinkOrHide(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback;
            boolean z = this.autoShrinkEnabled;
            if (z) {
                onChangedCallback = this.internalAutoShrinkCallback;
            } else {
                onChangedCallback = this.internalAutoHideCallback;
            }
            extendedFloatingActionButton.performMotion(z ? 2 : 1, onChangedCallback);
        }

        protected void extendOrShow(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback;
            boolean z = this.autoShrinkEnabled;
            if (z) {
                onChangedCallback = this.internalAutoShrinkCallback;
            } else {
                onChangedCallback = this.internalAutoHideCallback;
            }
            extendedFloatingActionButton.performMotion(z ? 3 : 0, onChangedCallback);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            java.util.List<android.view.View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.view.View view = dependencies.get(i2);
                if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }
    }

    class ChangeSizeStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private final boolean extending;
        private final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size size;

        ChangeSizeStrategy(com.google.android.material.floatingactionbutton.AnimatorTracker animatorTracker, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size size, boolean z) {
            super(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this, animatorTracker);
            this.size = size;
            this.extending = z;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.isExtended = this.extending;
            android.view.ViewGroup.LayoutParams layoutParams = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.extending) {
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalWidth = layoutParams.width;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.originalHeight = layoutParams.height;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
            androidx.core.view.ViewCompat.setPaddingRelative(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this, this.size.getPaddingStart(), com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getPaddingTop(), this.size.getPaddingEnd(), com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getPaddingBottom());
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.extending) {
                onChangedCallback.onExtended(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            if (this.extending) {
                return com.google.android.material.R.animator.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return com.google.android.material.R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public android.animation.AnimatorSet createAnimator() {
            com.google.android.material.animation.MotionSpec currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                android.animation.PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getWidth(), this.size.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                android.animation.PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getHeight(), this.size.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                android.animation.PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(androidx.core.view.ViewCompat.getPaddingStart(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this), this.size.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                android.animation.PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(androidx.core.view.ViewCompat.getPaddingEnd(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this), this.size.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                android.animation.PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z = this.extending;
                propertyValues5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.createAnimator(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator animator) {
            super.onAnimationStart(animator);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.isExtended = this.extending;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.isTransforming = true;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.isTransforming = false;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            android.view.ViewGroup.LayoutParams layoutParams = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return this.extending == com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.isExtended || com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getIcon() == null || android.text.TextUtils.isEmpty(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.getText());
        }
    }

    class ShowStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        public ShowStrategy(com.google.android.material.floatingactionbutton.AnimatorTracker animatorTracker) {
            super(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setVisibility(0);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setAlpha(1.0f);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setScaleY(1.0f);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return com.google.android.material.R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator animator) {
            super.onAnimationStart(animator);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setVisibility(0);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.animState = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.animState = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.isOrWillBeShown();
        }
    }

    class HideStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private boolean isCancelled;

        public HideStrategy(com.google.android.material.floatingactionbutton.AnimatorTracker animatorTracker) {
            super(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.isOrWillBeHidden();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return com.google.android.material.R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator animator) {
            super.onAnimationStart(animator);
            this.isCancelled = false;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setVisibility(0);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.animState = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.isCancelled = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.animState = 0;
            if (this.isCancelled) {
                return;
            }
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.this.setVisibility(8);
        }
    }
}
