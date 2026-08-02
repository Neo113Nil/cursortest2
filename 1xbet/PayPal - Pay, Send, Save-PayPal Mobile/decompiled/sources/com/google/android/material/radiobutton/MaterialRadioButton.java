package com.google.android.material.radiobutton;

/* loaded from: classes8.dex */
public class MaterialRadioButton extends androidx.appcompat.widget.AppCompatRadioButton {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private android.content.res.ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    public MaterialRadioButton(android.content.Context context) {
        this(context, null);
    }

    public MaterialRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialRadioButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        android.content.Context context2 = getContext();
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialRadioButton, i, i2, new int[0]);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialRadioButton_buttonTint)) {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, com.google.android.material.resources.MaterialResources.getColorStateList(context2, obtainStyledAttributes, com.google.android.material.R.styleable.MaterialRadioButton_buttonTint));
        }
        this.useMaterialThemeColors = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && androidx.core.widget.CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int color = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorControlActivated);
            int color2 = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorOnSurface);
            int color3 = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorSurface);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = com.google.android.material.color.MaterialColors.layer(color3, color, 1.0f);
            iArr2[1] = com.google.android.material.color.MaterialColors.layer(color3, color2, 0.54f);
            iArr2[2] = com.google.android.material.color.MaterialColors.layer(color3, color2, 0.38f);
            iArr2[3] = com.google.android.material.color.MaterialColors.layer(color3, color2, 0.38f);
            this.materialThemeColorsTintList = new android.content.res.ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }
}
