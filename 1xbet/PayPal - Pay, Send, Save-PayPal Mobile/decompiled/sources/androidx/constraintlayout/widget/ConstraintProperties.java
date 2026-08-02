package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class ConstraintProperties {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;
    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams getHighSpeedVideoFpsRangesFor;
    android.view.View getHighSpeedVideoSizes;

    public void apply() {
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleY(float f) {
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties center(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i2 == 1 || i2 == 2) {
            connect(1, i, i2, i3);
            connect(2, i4, i5, i6);
            this.getHighSpeedVideoFpsRangesFor.horizontalBias = f;
            return this;
        }
        if (i2 == 6 || i2 == 7) {
            connect(6, i, i2, i3);
            connect(7, i4, i5, i6);
            this.getHighSpeedVideoFpsRangesFor.horizontalBias = f;
            return this;
        }
        connect(3, i, i2, i3);
        connect(4, i4, i5, i6);
        this.getHighSpeedVideoFpsRangesFor.verticalBias = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(1, i, i2, i3);
        connect(2, i4, i5, i6);
        this.getHighSpeedVideoFpsRangesFor.horizontalBias = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(6, i, i2, i3);
        connect(7, i4, i5, i6);
        this.getHighSpeedVideoFpsRangesFor.horizontalBias = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(3, i, i2, i3);
        connect(4, i4, i5, i6);
        this.getHighSpeedVideoFpsRangesFor.verticalBias = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int i) {
        if (i == 0) {
            center(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        center(i, 2, 0, i, 1, 0, 0.5f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int i) {
        if (i == 0) {
            center(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        center(i, 7, 0, i, 6, 0, 0.5f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int i) {
        if (i == 0) {
            center(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        center(i, 4, 0, i, 3, 0, 0.5f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeConstraints(int i) {
        switch (i) {
            case 1:
                this.getHighSpeedVideoFpsRangesFor.leftToRight = -1;
                this.getHighSpeedVideoFpsRangesFor.leftToLeft = -1;
                this.getHighSpeedVideoFpsRangesFor.leftMargin = -1;
                this.getHighSpeedVideoFpsRangesFor.goneLeftMargin = Integer.MIN_VALUE;
                return this;
            case 2:
                this.getHighSpeedVideoFpsRangesFor.rightToRight = -1;
                this.getHighSpeedVideoFpsRangesFor.rightToLeft = -1;
                this.getHighSpeedVideoFpsRangesFor.rightMargin = -1;
                this.getHighSpeedVideoFpsRangesFor.goneRightMargin = Integer.MIN_VALUE;
                return this;
            case 3:
                this.getHighSpeedVideoFpsRangesFor.topToBottom = -1;
                this.getHighSpeedVideoFpsRangesFor.topToTop = -1;
                this.getHighSpeedVideoFpsRangesFor.topMargin = -1;
                this.getHighSpeedVideoFpsRangesFor.goneTopMargin = Integer.MIN_VALUE;
                return this;
            case 4:
                this.getHighSpeedVideoFpsRangesFor.bottomToTop = -1;
                this.getHighSpeedVideoFpsRangesFor.bottomToBottom = -1;
                this.getHighSpeedVideoFpsRangesFor.bottomMargin = -1;
                this.getHighSpeedVideoFpsRangesFor.goneBottomMargin = Integer.MIN_VALUE;
                return this;
            case 5:
                this.getHighSpeedVideoFpsRangesFor.baselineToBaseline = -1;
                return this;
            case 6:
                this.getHighSpeedVideoFpsRangesFor.startToEnd = -1;
                this.getHighSpeedVideoFpsRangesFor.startToStart = -1;
                this.getHighSpeedVideoFpsRangesFor.setMarginStart(-1);
                this.getHighSpeedVideoFpsRangesFor.goneStartMargin = Integer.MIN_VALUE;
                return this;
            case 7:
                this.getHighSpeedVideoFpsRangesFor.endToStart = -1;
                this.getHighSpeedVideoFpsRangesFor.endToEnd = -1;
                this.getHighSpeedVideoFpsRangesFor.setMarginEnd(-1);
                this.getHighSpeedVideoFpsRangesFor.goneEndMargin = Integer.MIN_VALUE;
                return this;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public androidx.constraintlayout.widget.ConstraintProperties margin(int i, int i2) {
        switch (i) {
            case 1:
                this.getHighSpeedVideoFpsRangesFor.leftMargin = i2;
                return this;
            case 2:
                this.getHighSpeedVideoFpsRangesFor.rightMargin = i2;
                return this;
            case 3:
                this.getHighSpeedVideoFpsRangesFor.topMargin = i2;
                return this;
            case 4:
                this.getHighSpeedVideoFpsRangesFor.bottomMargin = i2;
                return this;
            case 5:
                throw new java.lang.IllegalArgumentException("baseline does not support margins");
            case 6:
                this.getHighSpeedVideoFpsRangesFor.setMarginStart(i2);
                return this;
            case 7:
                this.getHighSpeedVideoFpsRangesFor.setMarginEnd(i2);
                return this;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public androidx.constraintlayout.widget.ConstraintProperties goneMargin(int i, int i2) {
        switch (i) {
            case 1:
                this.getHighSpeedVideoFpsRangesFor.goneLeftMargin = i2;
                return this;
            case 2:
                this.getHighSpeedVideoFpsRangesFor.goneRightMargin = i2;
                return this;
            case 3:
                this.getHighSpeedVideoFpsRangesFor.goneTopMargin = i2;
                return this;
            case 4:
                this.getHighSpeedVideoFpsRangesFor.goneBottomMargin = i2;
                return this;
            case 5:
                throw new java.lang.IllegalArgumentException("baseline does not support margins");
            case 6:
                this.getHighSpeedVideoFpsRangesFor.goneStartMargin = i2;
                return this;
            case 7:
                this.getHighSpeedVideoFpsRangesFor.goneEndMargin = i2;
                return this;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalBias(float f) {
        this.getHighSpeedVideoFpsRangesFor.horizontalBias = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalBias(float f) {
        this.getHighSpeedVideoFpsRangesFor.verticalBias = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties dimensionRatio(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.dimensionRatio = str;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties visibility(int i) {
        this.getHighSpeedVideoSizes.setVisibility(i);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties alpha(float f) {
        this.getHighSpeedVideoSizes.setAlpha(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties elevation(float f) {
        this.getHighSpeedVideoSizes.setElevation(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotation(float f) {
        this.getHighSpeedVideoSizes.setRotation(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationX(float f) {
        this.getHighSpeedVideoSizes.setRotationX(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationY(float f) {
        this.getHighSpeedVideoSizes.setRotationY(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleX(float f) {
        this.getHighSpeedVideoSizes.setScaleY(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotX(float f) {
        this.getHighSpeedVideoSizes.setPivotX(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotY(float f) {
        this.getHighSpeedVideoSizes.setPivotY(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivot(float f, float f2) {
        this.getHighSpeedVideoSizes.setPivotX(f);
        this.getHighSpeedVideoSizes.setPivotY(f2);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationX(float f) {
        this.getHighSpeedVideoSizes.setTranslationX(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationY(float f) {
        this.getHighSpeedVideoSizes.setTranslationY(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translation(float f, float f2) {
        this.getHighSpeedVideoSizes.setTranslationX(f);
        this.getHighSpeedVideoSizes.setTranslationY(f2);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationZ(float f) {
        this.getHighSpeedVideoSizes.setTranslationZ(f);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainHeight(int i) {
        this.getHighSpeedVideoFpsRangesFor.height = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainWidth(int i) {
        this.getHighSpeedVideoFpsRangesFor.width = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxHeight(int i) {
        this.getHighSpeedVideoFpsRangesFor.matchConstraintMaxHeight = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxWidth(int i) {
        this.getHighSpeedVideoFpsRangesFor.matchConstraintMaxWidth = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinHeight(int i) {
        this.getHighSpeedVideoFpsRangesFor.matchConstraintMinHeight = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinWidth(int i) {
        this.getHighSpeedVideoFpsRangesFor.matchConstraintMinWidth = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultHeight(int i) {
        this.getHighSpeedVideoFpsRangesFor.matchConstraintDefaultHeight = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultWidth(int i) {
        this.getHighSpeedVideoFpsRangesFor.matchConstraintDefaultWidth = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalWeight(float f) {
        this.getHighSpeedVideoFpsRangesFor.horizontalWeight = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalWeight(float f) {
        this.getHighSpeedVideoFpsRangesFor.verticalWeight = f;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalChainStyle(int i) {
        this.getHighSpeedVideoFpsRangesFor.horizontalChainStyle = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalChainStyle(int i) {
        this.getHighSpeedVideoFpsRangesFor.verticalChainStyle = i;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChain(int i, int i2) {
        connect(1, i, i == 0 ? 1 : 2, 0);
        connect(2, i2, i2 == 0 ? 2 : 1, 0);
        if (i != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i)).connect(2, this.getHighSpeedVideoSizes.getId(), 1, 0);
        }
        if (i2 != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i2)).connect(1, this.getHighSpeedVideoSizes.getId(), 2, 0);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChainRTL(int i, int i2) {
        connect(6, i, i == 0 ? 6 : 7, 0);
        connect(7, i2, i2 == 0 ? 7 : 6, 0);
        if (i != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i)).connect(7, this.getHighSpeedVideoSizes.getId(), 6, 0);
        }
        if (i2 != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i2)).connect(6, this.getHighSpeedVideoSizes.getId(), 7, 0);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToVerticalChain(int i, int i2) {
        connect(3, i, i == 0 ? 3 : 4, 0);
        connect(4, i2, i2 == 0 ? 4 : 3, 0);
        if (i != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i)).connect(4, this.getHighSpeedVideoSizes.getId(), 3, 0);
        }
        if (i2 != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i2)).connect(3, this.getHighSpeedVideoSizes.getId(), 4, 0);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromVerticalChain() {
        int i = this.getHighSpeedVideoFpsRangesFor.topToBottom;
        int i2 = this.getHighSpeedVideoFpsRangesFor.bottomToTop;
        if (i != -1 || i2 != -1) {
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i));
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties2 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i2));
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = this.getHighSpeedVideoFpsRangesFor;
            if (i != -1 && i2 != -1) {
                constraintProperties.connect(4, i2, 3, 0);
                constraintProperties2.connect(3, i, 4, 0);
            } else if (i != -1 || i2 != -1) {
                int i3 = layoutParams.bottomToBottom;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = this.getHighSpeedVideoFpsRangesFor;
                if (i3 != -1) {
                    constraintProperties.connect(4, layoutParams2.bottomToBottom, 4, 0);
                } else {
                    int i4 = layoutParams2.topToTop;
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = this.getHighSpeedVideoFpsRangesFor;
                    if (i4 != -1) {
                        constraintProperties2.connect(3, layoutParams3.topToTop, 3, 0);
                    }
                }
            }
        }
        removeConstraints(3);
        removeConstraints(4);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromHorizontalChain() {
        int i = this.getHighSpeedVideoFpsRangesFor.leftToRight;
        int i2 = this.getHighSpeedVideoFpsRangesFor.rightToLeft;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = this.getHighSpeedVideoFpsRangesFor;
        if (i != -1 || i2 != -1) {
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i));
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties2 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i2));
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = this.getHighSpeedVideoFpsRangesFor;
            if (i != -1 && i2 != -1) {
                constraintProperties.connect(2, i2, 1, 0);
                constraintProperties2.connect(1, i, 2, 0);
            } else if (i != -1 || i2 != -1) {
                int i3 = layoutParams2.rightToRight;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = this.getHighSpeedVideoFpsRangesFor;
                if (i3 != -1) {
                    constraintProperties.connect(2, layoutParams3.rightToRight, 2, 0);
                } else {
                    int i4 = layoutParams3.leftToLeft;
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = this.getHighSpeedVideoFpsRangesFor;
                    if (i4 != -1) {
                        constraintProperties2.connect(1, layoutParams4.leftToLeft, 1, 0);
                    }
                }
            }
            removeConstraints(1);
            removeConstraints(2);
            return this;
        }
        int i5 = layoutParams.startToEnd;
        int i6 = this.getHighSpeedVideoFpsRangesFor.endToStart;
        if (i5 != -1 || i6 != -1) {
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties3 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i5));
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties4 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.getHighSpeedVideoSizes.getParent()).findViewById(i6));
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams5 = this.getHighSpeedVideoFpsRangesFor;
            if (i5 != -1 && i6 != -1) {
                constraintProperties3.connect(7, i6, 6, 0);
                constraintProperties4.connect(6, i, 7, 0);
            } else if (i != -1 || i6 != -1) {
                int i7 = layoutParams5.rightToRight;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams6 = this.getHighSpeedVideoFpsRangesFor;
                if (i7 != -1) {
                    constraintProperties3.connect(7, layoutParams6.rightToRight, 7, 0);
                } else {
                    int i8 = layoutParams6.leftToLeft;
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams7 = this.getHighSpeedVideoFpsRangesFor;
                    if (i8 != -1) {
                        constraintProperties4.connect(6, layoutParams7.leftToLeft, 6, 0);
                    }
                }
            }
        }
        removeConstraints(6);
        removeConstraints(7);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties connect(int i, int i2, int i3, int i4) {
        switch (i) {
            case 1:
                if (i3 == 1) {
                    this.getHighSpeedVideoFpsRangesFor.leftToLeft = i2;
                    this.getHighSpeedVideoFpsRangesFor.leftToRight = -1;
                } else if (i3 == 2) {
                    this.getHighSpeedVideoFpsRangesFor.leftToRight = i2;
                    this.getHighSpeedVideoFpsRangesFor.leftToLeft = -1;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Left to ");
                    sb.append(getHighSpeedVideoSizes(i3));
                    sb.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.leftMargin = i4;
                return this;
            case 2:
                if (i3 == 1) {
                    this.getHighSpeedVideoFpsRangesFor.rightToLeft = i2;
                    this.getHighSpeedVideoFpsRangesFor.rightToRight = -1;
                } else if (i3 == 2) {
                    this.getHighSpeedVideoFpsRangesFor.rightToRight = i2;
                    this.getHighSpeedVideoFpsRangesFor.rightToLeft = -1;
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("right to ");
                    sb2.append(getHighSpeedVideoSizes(i3));
                    sb2.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.rightMargin = i4;
                return this;
            case 3:
                if (i3 == 3) {
                    this.getHighSpeedVideoFpsRangesFor.topToTop = i2;
                    this.getHighSpeedVideoFpsRangesFor.topToBottom = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBaseline = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBottom = -1;
                } else if (i3 == 4) {
                    this.getHighSpeedVideoFpsRangesFor.topToBottom = i2;
                    this.getHighSpeedVideoFpsRangesFor.topToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBaseline = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBottom = -1;
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("right to ");
                    sb3.append(getHighSpeedVideoSizes(i3));
                    sb3.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.topMargin = i4;
                return this;
            case 4:
                if (i3 == 4) {
                    this.getHighSpeedVideoFpsRangesFor.bottomToBottom = i2;
                    this.getHighSpeedVideoFpsRangesFor.bottomToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBaseline = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBottom = -1;
                } else if (i3 == 3) {
                    this.getHighSpeedVideoFpsRangesFor.bottomToTop = i2;
                    this.getHighSpeedVideoFpsRangesFor.bottomToBottom = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBaseline = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.baselineToBottom = -1;
                } else {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("right to ");
                    sb4.append(getHighSpeedVideoSizes(i3));
                    sb4.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb4.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.bottomMargin = i4;
                return this;
            case 5:
                if (i3 == 5) {
                    this.getHighSpeedVideoFpsRangesFor.baselineToBaseline = i2;
                    this.getHighSpeedVideoFpsRangesFor.bottomToBottom = -1;
                    this.getHighSpeedVideoFpsRangesFor.bottomToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.topToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.topToBottom = -1;
                } else if (i3 == 3) {
                    this.getHighSpeedVideoFpsRangesFor.baselineToTop = i2;
                    this.getHighSpeedVideoFpsRangesFor.bottomToBottom = -1;
                    this.getHighSpeedVideoFpsRangesFor.bottomToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.topToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.topToBottom = -1;
                } else if (i3 == 4) {
                    this.getHighSpeedVideoFpsRangesFor.baselineToBottom = i2;
                    this.getHighSpeedVideoFpsRangesFor.bottomToBottom = -1;
                    this.getHighSpeedVideoFpsRangesFor.bottomToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.topToTop = -1;
                    this.getHighSpeedVideoFpsRangesFor.topToBottom = -1;
                } else {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("right to ");
                    sb5.append(getHighSpeedVideoSizes(i3));
                    sb5.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb5.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.baselineMargin = i4;
                return this;
            case 6:
                if (i3 == 6) {
                    this.getHighSpeedVideoFpsRangesFor.startToStart = i2;
                    this.getHighSpeedVideoFpsRangesFor.startToEnd = -1;
                } else if (i3 == 7) {
                    this.getHighSpeedVideoFpsRangesFor.startToEnd = i2;
                    this.getHighSpeedVideoFpsRangesFor.startToStart = -1;
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("right to ");
                    sb6.append(getHighSpeedVideoSizes(i3));
                    sb6.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb6.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.setMarginStart(i4);
                return this;
            case 7:
                if (i3 == 7) {
                    this.getHighSpeedVideoFpsRangesFor.endToEnd = i2;
                    this.getHighSpeedVideoFpsRangesFor.endToStart = -1;
                } else if (i3 == 6) {
                    this.getHighSpeedVideoFpsRangesFor.endToStart = i2;
                    this.getHighSpeedVideoFpsRangesFor.endToEnd = -1;
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("right to ");
                    sb7.append(getHighSpeedVideoSizes(i3));
                    sb7.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb7.toString());
                }
                this.getHighSpeedVideoFpsRangesFor.setMarginEnd(i4);
                return this;
            default:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(getHighSpeedVideoSizes(i));
                sb8.append(" to ");
                sb8.append(getHighSpeedVideoSizes(i3));
                sb8.append(" unknown");
                throw new java.lang.IllegalArgumentException(sb8.toString());
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(int i) {
        switch (i) {
            case 1:
                return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
            case 2:
                return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
            case 3:
                return com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP;
            case 4:
                return com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM;
            case 5:
                return "baseline";
            case 6:
                return com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public ConstraintProperties(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            this.getHighSpeedVideoFpsRangesFor = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            this.getHighSpeedVideoSizes = view;
            return;
        }
        throw new java.lang.RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }
}
