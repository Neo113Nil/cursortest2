package com.google.android.material.badge;

/* loaded from: classes8.dex */
public final class BadgeState {
    private static final java.lang.String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final com.google.android.material.badge.BadgeState.State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final com.google.android.material.badge.BadgeState.State overridingState;

    BadgeState(android.content.Context context, int i, int i2, int i3, com.google.android.material.badge.BadgeState.State state) {
        java.lang.CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int i7;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        boolean booleanValue;
        com.google.android.material.badge.BadgeState.State state2 = new com.google.android.material.badge.BadgeState.State();
        this.currentState = state2;
        state = state == null ? new com.google.android.material.badge.BadgeState.State() : state;
        if (i != 0) {
            state.badgeResId = i;
        }
        android.content.res.TypedArray generateTypedArray = generateTypedArray(context, state.badgeResId, i2, i3);
        android.content.res.Resources resources = context.getResources();
        this.badgeRadius = generateTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.Badge_badgeRadius, -1);
        this.horizontalInset = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_badge_horizontal_edge_offset);
        this.horizontalInsetWithText = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.badgeWithTextRadius = generateTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.Badge_badgeWithTextRadius, -1);
        this.badgeWidth = generateTypedArray.getDimension(com.google.android.material.R.styleable.Badge_badgeWidth, resources.getDimension(com.google.android.material.R.dimen.m3_badge_size));
        this.badgeWithTextWidth = generateTypedArray.getDimension(com.google.android.material.R.styleable.Badge_badgeWithTextWidth, resources.getDimension(com.google.android.material.R.dimen.m3_badge_with_text_size));
        this.badgeHeight = generateTypedArray.getDimension(com.google.android.material.R.styleable.Badge_badgeHeight, resources.getDimension(com.google.android.material.R.dimen.m3_badge_size));
        this.badgeWithTextHeight = generateTypedArray.getDimension(com.google.android.material.R.styleable.Badge_badgeWithTextHeight, resources.getDimension(com.google.android.material.R.dimen.m3_badge_with_text_size));
        boolean z = true;
        this.offsetAlignmentMode = generateTypedArray.getInt(com.google.android.material.R.styleable.Badge_offsetAlignmentMode, 1);
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        if (state.number == -2) {
            if (generateTypedArray.hasValue(com.google.android.material.R.styleable.Badge_number)) {
                state2.number = generateTypedArray.getInt(com.google.android.material.R.styleable.Badge_number, 0);
            } else {
                state2.number = -1;
            }
        } else {
            state2.number = state.number;
        }
        if (state.text == null) {
            if (generateTypedArray.hasValue(com.google.android.material.R.styleable.Badge_badgeText)) {
                state2.text = generateTypedArray.getString(com.google.android.material.R.styleable.Badge_badgeText);
            }
        } else {
            state2.text = state.text;
        }
        state2.contentDescriptionForText = state.contentDescriptionForText;
        if (state.contentDescriptionNumberless == null) {
            charSequence = context.getString(com.google.android.material.R.string.mtrl_badge_numberless_content_description);
        } else {
            charSequence = state.contentDescriptionNumberless;
        }
        state2.contentDescriptionNumberless = charSequence;
        if (state.contentDescriptionQuantityStrings == 0) {
            i4 = com.google.android.material.R.plurals.mtrl_badge_content_description;
        } else {
            i4 = state.contentDescriptionQuantityStrings;
        }
        state2.contentDescriptionQuantityStrings = i4;
        if (state.contentDescriptionExceedsMaxBadgeNumberRes == 0) {
            i5 = com.google.android.material.R.string.mtrl_exceed_max_badge_number_content_description;
        } else {
            i5 = state.contentDescriptionExceedsMaxBadgeNumberRes;
        }
        state2.contentDescriptionExceedsMaxBadgeNumberRes = i5;
        if (state.isVisible != null && !state.isVisible.booleanValue()) {
            z = false;
        }
        state2.isVisible = java.lang.Boolean.valueOf(z);
        if (state.maxCharacterCount == -2) {
            i6 = generateTypedArray.getInt(com.google.android.material.R.styleable.Badge_maxCharacterCount, -2);
        } else {
            i6 = state.maxCharacterCount;
        }
        state2.maxCharacterCount = i6;
        if (state.maxNumber == -2) {
            i7 = generateTypedArray.getInt(com.google.android.material.R.styleable.Badge_maxNumber, -2);
        } else {
            i7 = state.maxNumber;
        }
        state2.maxNumber = i7;
        if (state.badgeShapeAppearanceResId == null) {
            intValue = generateTypedArray.getResourceId(com.google.android.material.R.styleable.Badge_badgeShapeAppearance, com.google.android.material.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = state.badgeShapeAppearanceResId.intValue();
        }
        state2.badgeShapeAppearanceResId = java.lang.Integer.valueOf(intValue);
        if (state.badgeShapeAppearanceOverlayResId == null) {
            intValue2 = generateTypedArray.getResourceId(com.google.android.material.R.styleable.Badge_badgeShapeAppearanceOverlay, 0);
        } else {
            intValue2 = state.badgeShapeAppearanceOverlayResId.intValue();
        }
        state2.badgeShapeAppearanceOverlayResId = java.lang.Integer.valueOf(intValue2);
        if (state.badgeWithTextShapeAppearanceResId == null) {
            intValue3 = generateTypedArray.getResourceId(com.google.android.material.R.styleable.Badge_badgeWithTextShapeAppearance, com.google.android.material.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = state.badgeWithTextShapeAppearanceResId.intValue();
        }
        state2.badgeWithTextShapeAppearanceResId = java.lang.Integer.valueOf(intValue3);
        if (state.badgeWithTextShapeAppearanceOverlayResId == null) {
            intValue4 = generateTypedArray.getResourceId(com.google.android.material.R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        } else {
            intValue4 = state.badgeWithTextShapeAppearanceOverlayResId.intValue();
        }
        state2.badgeWithTextShapeAppearanceOverlayResId = java.lang.Integer.valueOf(intValue4);
        if (state.backgroundColor == null) {
            intValue5 = readColorFromAttributes(context, generateTypedArray, com.google.android.material.R.styleable.Badge_backgroundColor);
        } else {
            intValue5 = state.backgroundColor.intValue();
        }
        state2.backgroundColor = java.lang.Integer.valueOf(intValue5);
        if (state.badgeTextAppearanceResId == null) {
            intValue6 = generateTypedArray.getResourceId(com.google.android.material.R.styleable.Badge_badgeTextAppearance, com.google.android.material.R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = state.badgeTextAppearanceResId.intValue();
        }
        state2.badgeTextAppearanceResId = java.lang.Integer.valueOf(intValue6);
        if (state.badgeTextColor == null) {
            if (generateTypedArray.hasValue(com.google.android.material.R.styleable.Badge_badgeTextColor)) {
                state2.badgeTextColor = java.lang.Integer.valueOf(readColorFromAttributes(context, generateTypedArray, com.google.android.material.R.styleable.Badge_badgeTextColor));
            } else {
                state2.badgeTextColor = java.lang.Integer.valueOf(new com.google.android.material.resources.TextAppearance(context, state2.badgeTextAppearanceResId.intValue()).getTextColor().getDefaultColor());
            }
        } else {
            state2.badgeTextColor = state.badgeTextColor;
        }
        if (state.badgeGravity == null) {
            intValue7 = generateTypedArray.getInt(com.google.android.material.R.styleable.Badge_badgeGravity, 8388661);
        } else {
            intValue7 = state.badgeGravity.intValue();
        }
        state2.badgeGravity = java.lang.Integer.valueOf(intValue7);
        if (state.badgeHorizontalPadding == null) {
            intValue8 = generateTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = state.badgeHorizontalPadding.intValue();
        }
        state2.badgeHorizontalPadding = java.lang.Integer.valueOf(intValue8);
        if (state.badgeVerticalPadding == null) {
            intValue9 = generateTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(com.google.android.material.R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = state.badgeVerticalPadding.intValue();
        }
        state2.badgeVerticalPadding = java.lang.Integer.valueOf(intValue9);
        if (state.horizontalOffsetWithoutText == null) {
            intValue10 = generateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_horizontalOffset, 0);
        } else {
            intValue10 = state.horizontalOffsetWithoutText.intValue();
        }
        state2.horizontalOffsetWithoutText = java.lang.Integer.valueOf(intValue10);
        if (state.verticalOffsetWithoutText == null) {
            intValue11 = generateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_verticalOffset, 0);
        } else {
            intValue11 = state.verticalOffsetWithoutText.intValue();
        }
        state2.verticalOffsetWithoutText = java.lang.Integer.valueOf(intValue11);
        if (state.horizontalOffsetWithText == null) {
            intValue12 = generateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue());
        } else {
            intValue12 = state.horizontalOffsetWithText.intValue();
        }
        state2.horizontalOffsetWithText = java.lang.Integer.valueOf(intValue12);
        if (state.verticalOffsetWithText == null) {
            intValue13 = generateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue());
        } else {
            intValue13 = state.verticalOffsetWithText.intValue();
        }
        state2.verticalOffsetWithText = java.lang.Integer.valueOf(intValue13);
        if (state.largeFontVerticalOffsetAdjustment == null) {
            intValue14 = generateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0);
        } else {
            intValue14 = state.largeFontVerticalOffsetAdjustment.intValue();
        }
        state2.largeFontVerticalOffsetAdjustment = java.lang.Integer.valueOf(intValue14);
        state2.additionalHorizontalOffset = java.lang.Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = java.lang.Integer.valueOf(state.additionalVerticalOffset == null ? 0 : state.additionalVerticalOffset.intValue());
        if (state.autoAdjustToWithinGrandparentBounds == null) {
            booleanValue = generateTypedArray.getBoolean(com.google.android.material.R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false);
        } else {
            booleanValue = state.autoAdjustToWithinGrandparentBounds.booleanValue();
        }
        state2.autoAdjustToWithinGrandparentBounds = java.lang.Boolean.valueOf(booleanValue);
        generateTypedArray.recycle();
        if (state.numberLocale == null) {
            state2.numberLocale = java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        } else {
            state2.numberLocale = state.numberLocale;
        }
        this.overridingState = state;
    }

    private android.content.res.TypedArray generateTypedArray(android.content.Context context, int i, int i2, int i3) {
        android.util.AttributeSet attributeSet;
        int i4;
        if (i != 0) {
            android.util.AttributeSet parseDrawableXml = com.google.android.material.drawable.DrawableUtils.parseDrawableXml(context, i, BADGE_RESOURCE_TAG);
            i4 = parseDrawableXml.getStyleAttribute();
            attributeSet = parseDrawableXml;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        return com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.Badge, i2, i4 != 0 ? i4 : i3, new int[0]);
    }

    final com.google.android.material.badge.BadgeState.State getOverridingState() {
        return this.overridingState;
    }

    final boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    final void setVisible(boolean z) {
        this.overridingState.isVisible = java.lang.Boolean.valueOf(z);
        this.currentState.isVisible = java.lang.Boolean.valueOf(z);
    }

    final boolean hasNumber() {
        return this.currentState.number != -1;
    }

    final int getNumber() {
        return this.currentState.number;
    }

    final void setNumber(int i) {
        this.overridingState.number = i;
        this.currentState.number = i;
    }

    final void clearNumber() {
        setNumber(-1);
    }

    final boolean hasText() {
        return this.currentState.text != null;
    }

    final java.lang.String getText() {
        return this.currentState.text;
    }

    final void setText(java.lang.String str) {
        this.overridingState.text = str;
        this.currentState.text = str;
    }

    final void clearText() {
        setText(null);
    }

    final int getAlpha() {
        return this.currentState.alpha;
    }

    final void setAlpha(int i) {
        this.overridingState.alpha = i;
        this.currentState.alpha = i;
    }

    final int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    final void setMaxCharacterCount(int i) {
        this.overridingState.maxCharacterCount = i;
        this.currentState.maxCharacterCount = i;
    }

    final int getMaxNumber() {
        return this.currentState.maxNumber;
    }

    final void setMaxNumber(int i) {
        this.overridingState.maxNumber = i;
        this.currentState.maxNumber = i;
    }

    final int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    final void setBackgroundColor(int i) {
        this.overridingState.backgroundColor = java.lang.Integer.valueOf(i);
        this.currentState.backgroundColor = java.lang.Integer.valueOf(i);
    }

    final int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    final void setBadgeTextColor(int i) {
        this.overridingState.badgeTextColor = java.lang.Integer.valueOf(i);
        this.currentState.badgeTextColor = java.lang.Integer.valueOf(i);
    }

    final int getTextAppearanceResId() {
        return this.currentState.badgeTextAppearanceResId.intValue();
    }

    final void setTextAppearanceResId(int i) {
        this.overridingState.badgeTextAppearanceResId = java.lang.Integer.valueOf(i);
        this.currentState.badgeTextAppearanceResId = java.lang.Integer.valueOf(i);
    }

    final int getBadgeShapeAppearanceResId() {
        return this.currentState.badgeShapeAppearanceResId.intValue();
    }

    final void setBadgeShapeAppearanceResId(int i) {
        this.overridingState.badgeShapeAppearanceResId = java.lang.Integer.valueOf(i);
        this.currentState.badgeShapeAppearanceResId = java.lang.Integer.valueOf(i);
    }

    final int getBadgeShapeAppearanceOverlayResId() {
        return this.currentState.badgeShapeAppearanceOverlayResId.intValue();
    }

    final void setBadgeShapeAppearanceOverlayResId(int i) {
        this.overridingState.badgeShapeAppearanceOverlayResId = java.lang.Integer.valueOf(i);
        this.currentState.badgeShapeAppearanceOverlayResId = java.lang.Integer.valueOf(i);
    }

    final int getBadgeWithTextShapeAppearanceResId() {
        return this.currentState.badgeWithTextShapeAppearanceResId.intValue();
    }

    final void setBadgeWithTextShapeAppearanceResId(int i) {
        this.overridingState.badgeWithTextShapeAppearanceResId = java.lang.Integer.valueOf(i);
        this.currentState.badgeWithTextShapeAppearanceResId = java.lang.Integer.valueOf(i);
    }

    final int getBadgeWithTextShapeAppearanceOverlayResId() {
        return this.currentState.badgeWithTextShapeAppearanceOverlayResId.intValue();
    }

    final void setBadgeWithTextShapeAppearanceOverlayResId(int i) {
        this.overridingState.badgeWithTextShapeAppearanceOverlayResId = java.lang.Integer.valueOf(i);
        this.currentState.badgeWithTextShapeAppearanceOverlayResId = java.lang.Integer.valueOf(i);
    }

    final int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    final void setBadgeGravity(int i) {
        this.overridingState.badgeGravity = java.lang.Integer.valueOf(i);
        this.currentState.badgeGravity = java.lang.Integer.valueOf(i);
    }

    final int getBadgeHorizontalPadding() {
        return this.currentState.badgeHorizontalPadding.intValue();
    }

    final void setBadgeHorizontalPadding(int i) {
        this.overridingState.badgeHorizontalPadding = java.lang.Integer.valueOf(i);
        this.currentState.badgeHorizontalPadding = java.lang.Integer.valueOf(i);
    }

    final int getBadgeVerticalPadding() {
        return this.currentState.badgeVerticalPadding.intValue();
    }

    final void setBadgeVerticalPadding(int i) {
        this.overridingState.badgeVerticalPadding = java.lang.Integer.valueOf(i);
        this.currentState.badgeVerticalPadding = java.lang.Integer.valueOf(i);
    }

    final int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    final void setHorizontalOffsetWithoutText(int i) {
        this.overridingState.horizontalOffsetWithoutText = java.lang.Integer.valueOf(i);
        this.currentState.horizontalOffsetWithoutText = java.lang.Integer.valueOf(i);
    }

    final int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    final void setVerticalOffsetWithoutText(int i) {
        this.overridingState.verticalOffsetWithoutText = java.lang.Integer.valueOf(i);
        this.currentState.verticalOffsetWithoutText = java.lang.Integer.valueOf(i);
    }

    final int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    final void setHorizontalOffsetWithText(int i) {
        this.overridingState.horizontalOffsetWithText = java.lang.Integer.valueOf(i);
        this.currentState.horizontalOffsetWithText = java.lang.Integer.valueOf(i);
    }

    final int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    final void setVerticalOffsetWithText(int i) {
        this.overridingState.verticalOffsetWithText = java.lang.Integer.valueOf(i);
        this.currentState.verticalOffsetWithText = java.lang.Integer.valueOf(i);
    }

    final int getLargeFontVerticalOffsetAdjustment() {
        return this.currentState.largeFontVerticalOffsetAdjustment.intValue();
    }

    final void setLargeFontVerticalOffsetAdjustment(int i) {
        this.overridingState.largeFontVerticalOffsetAdjustment = java.lang.Integer.valueOf(i);
        this.currentState.largeFontVerticalOffsetAdjustment = java.lang.Integer.valueOf(i);
    }

    final int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    final void setAdditionalHorizontalOffset(int i) {
        this.overridingState.additionalHorizontalOffset = java.lang.Integer.valueOf(i);
        this.currentState.additionalHorizontalOffset = java.lang.Integer.valueOf(i);
    }

    final int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    final void setAdditionalVerticalOffset(int i) {
        this.overridingState.additionalVerticalOffset = java.lang.Integer.valueOf(i);
        this.currentState.additionalVerticalOffset = java.lang.Integer.valueOf(i);
    }

    final java.lang.CharSequence getContentDescriptionForText() {
        return this.currentState.contentDescriptionForText;
    }

    final void setContentDescriptionForText(java.lang.CharSequence charSequence) {
        this.overridingState.contentDescriptionForText = charSequence;
        this.currentState.contentDescriptionForText = charSequence;
    }

    final java.lang.CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    final void setContentDescriptionNumberless(java.lang.CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    final int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    final void setContentDescriptionQuantityStringsResource(int i) {
        this.overridingState.contentDescriptionQuantityStrings = i;
        this.currentState.contentDescriptionQuantityStrings = i;
    }

    final int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    final void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i;
    }

    final java.util.Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    final void setNumberLocale(java.util.Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    final boolean isAutoAdjustedToGrandparentBounds() {
        return this.currentState.autoAdjustToWithinGrandparentBounds.booleanValue();
    }

    final void setAutoAdjustToGrandparentBounds(boolean z) {
        this.overridingState.autoAdjustToWithinGrandparentBounds = java.lang.Boolean.valueOf(z);
        this.currentState.autoAdjustToWithinGrandparentBounds = java.lang.Boolean.valueOf(z);
    }

    private static int readColorFromAttributes(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        return com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
    }

    public static final class State implements android.os.Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final android.os.Parcelable.Creator<com.google.android.material.badge.BadgeState.State> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.badge.BadgeState.State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.badge.BadgeState.State createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.badge.BadgeState.State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.badge.BadgeState.State[] newArray(int i) {
                return new com.google.android.material.badge.BadgeState.State[i];
            }
        };
        private static final int NOT_SET = -2;
        private java.lang.Integer additionalHorizontalOffset;
        private java.lang.Integer additionalVerticalOffset;
        private int alpha;
        private java.lang.Boolean autoAdjustToWithinGrandparentBounds;
        private java.lang.Integer backgroundColor;
        private java.lang.Integer badgeGravity;
        private java.lang.Integer badgeHorizontalPadding;
        private int badgeResId;
        private java.lang.Integer badgeShapeAppearanceOverlayResId;
        private java.lang.Integer badgeShapeAppearanceResId;
        private java.lang.Integer badgeTextAppearanceResId;
        private java.lang.Integer badgeTextColor;
        private java.lang.Integer badgeVerticalPadding;
        private java.lang.Integer badgeWithTextShapeAppearanceOverlayResId;
        private java.lang.Integer badgeWithTextShapeAppearanceResId;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private java.lang.CharSequence contentDescriptionForText;
        private java.lang.CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private java.lang.Integer horizontalOffsetWithText;
        private java.lang.Integer horizontalOffsetWithoutText;
        private java.lang.Boolean isVisible;
        private java.lang.Integer largeFontVerticalOffsetAdjustment;
        private int maxCharacterCount;
        private int maxNumber;
        private int number;
        private java.util.Locale numberLocale;
        private java.lang.String text;
        private java.lang.Integer verticalOffsetWithText;
        private java.lang.Integer verticalOffsetWithoutText;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = java.lang.Boolean.TRUE;
        }

        State(android.os.Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = java.lang.Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (java.lang.Integer) parcel.readSerializable();
            this.badgeTextColor = (java.lang.Integer) parcel.readSerializable();
            this.badgeTextAppearanceResId = (java.lang.Integer) parcel.readSerializable();
            this.badgeShapeAppearanceResId = (java.lang.Integer) parcel.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (java.lang.Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (java.lang.Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (java.lang.Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.text = parcel.readString();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.maxNumber = parcel.readInt();
            this.contentDescriptionForText = parcel.readString();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (java.lang.Integer) parcel.readSerializable();
            this.badgeHorizontalPadding = (java.lang.Integer) parcel.readSerializable();
            this.badgeVerticalPadding = (java.lang.Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (java.lang.Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (java.lang.Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (java.lang.Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (java.lang.Integer) parcel.readSerializable();
            this.largeFontVerticalOffsetAdjustment = (java.lang.Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (java.lang.Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (java.lang.Integer) parcel.readSerializable();
            this.isVisible = (java.lang.Boolean) parcel.readSerializable();
            this.numberLocale = (java.util.Locale) parcel.readSerializable();
            this.autoAdjustToWithinGrandparentBounds = (java.lang.Boolean) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeSerializable(this.badgeTextAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            parcel.writeInt(this.alpha);
            parcel.writeString(this.text);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeInt(this.maxNumber);
            java.lang.CharSequence charSequence = this.contentDescriptionForText;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            java.lang.CharSequence charSequence2 = this.contentDescriptionNumberless;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.badgeHorizontalPadding);
            parcel.writeSerializable(this.badgeVerticalPadding);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.largeFontVerticalOffsetAdjustment);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
            parcel.writeSerializable(this.autoAdjustToWithinGrandparentBounds);
        }
    }
}
