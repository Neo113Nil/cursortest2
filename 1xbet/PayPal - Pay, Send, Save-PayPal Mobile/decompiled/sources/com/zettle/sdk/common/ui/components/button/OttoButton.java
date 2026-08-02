package com.zettle.sdk.common.ui.components.button;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/common/ui/components/button/OttoButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/zettle/sdk/common/ui/components/button/OttoButtonStyles;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "setStyle", "(Lcom/zettle/sdk/common/ui/components/button/OttoButtonStyles;)V", "Lcom/zettle/sdk/common/ui/components/button/OttoButtonTypes;", "type", "setType", "(Lcom/zettle/sdk/common/ui/components/button/OttoButtonTypes;)V", "Lcom/zettle/sdk/common/ui/components/button/OttoButtonAttr;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/common/ui/components/button/OttoButtonAttr;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OttoButton extends com.google.android.material.button.MaterialButton {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.zettle.sdk.common.ui.components.button.OttoButtonAttr Camera2StreamConfigurationMap;

    public /* synthetic */ OttoButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OttoButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.zettle.sdk.common.ui.R.styleable.OttoButton);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "");
        this.Camera2StreamConfigurationMap = new com.zettle.sdk.common.ui.components.button.OttoButtonAttr(obtainStyledAttributes);
        setAllCaps(false);
        setClickable(true);
        setTypeface(androidx.core.content.res.ResourcesCompat.getFont(getContext(), com.zettle.sdk.common.ui.R.font.zen_screen));
        setLetterSpacing(0.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.grid_2x);
        setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        setInsetTop(0);
        setInsetBottom(0);
        setIconPadding(getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.grid_1x));
        setIconGravity(2);
        setGravity(17);
        addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.zettle.sdk.common.ui.components.button.OttoButton$setDefaultCornerRadius$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                com.zettle.sdk.common.ui.components.button.OttoButton ottoButton = com.zettle.sdk.common.ui.components.button.OttoButton.this;
                ottoButton.setCornerRadius(ottoButton.getMeasuredHeight() / 2);
                com.zettle.sdk.common.ui.components.button.OttoButton.this.removeOnLayoutChangeListener(this);
            }
        });
        com.zettle.sdk.common.ui.components.button.OttoButtonAttr ottoButtonAttr = this.Camera2StreamConfigurationMap;
        if (ottoButtonAttr == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoButtonAttr = null;
        }
        setType(ottoButtonAttr.getType());
        setStyle(ottoButtonAttr.getStyle());
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setAccessibleTouchTarget(this);
    }

    public final void setType(com.zettle.sdk.common.ui.components.button.OttoButtonTypes type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        setMinHeight(getResources().getDimensionPixelSize(type.getMinHeight()));
        setTextSize(0, getResources().getDimension(type.getTextSize()));
        androidx.core.widget.TextViewCompat.setLineHeight(this, getResources().getDimensionPixelSize(type.getLineHeight()));
    }

    public final void setStyle(com.zettle.sdk.common.ui.components.button.OttoButtonStyles style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        setStrokeColor(androidx.core.content.res.ResourcesCompat.getColorStateList(getResources(), style.getStrokeColor(), getContext().getTheme()));
        setBackgroundTintList(androidx.core.content.res.ResourcesCompat.getColorStateList(getResources(), style.getBackgroundTint(), getContext().getTheme()));
        setRippleColor(androidx.core.content.res.ResourcesCompat.getColorStateList(getResources(), style.getRippleColor(), getContext().getTheme()));
        setStrokeWidth(getResources().getDimensionPixelSize(style.getStrokeWidth()));
        setIconTint(androidx.core.content.res.ResourcesCompat.getColorStateList(getResources(), style.getIconTint(), getContext().getTheme()));
        setTextColor(androidx.core.content.res.ResourcesCompat.getColorStateList(getResources(), style.getTextColor(), getContext().getTheme()));
        com.zettle.sdk.common.ui.extensions.ViewExtKt.removeUnderline(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
