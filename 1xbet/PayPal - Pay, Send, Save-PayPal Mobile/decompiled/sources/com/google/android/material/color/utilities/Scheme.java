package com.google.android.material.color.utilities;

@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: classes8.dex */
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
    }

    public Scheme(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        this.primary = i;
        this.onPrimary = i2;
        this.primaryContainer = i3;
        this.onPrimaryContainer = i4;
        this.secondary = i5;
        this.onSecondary = i6;
        this.secondaryContainer = i7;
        this.onSecondaryContainer = i8;
        this.tertiary = i9;
        this.onTertiary = i10;
        this.tertiaryContainer = i11;
        this.onTertiaryContainer = i12;
        this.error = i13;
        this.onError = i14;
        this.errorContainer = i15;
        this.onErrorContainer = i16;
        this.background = i17;
        this.onBackground = i18;
        this.surface = i19;
        this.onSurface = i20;
        this.surfaceVariant = i21;
        this.onSurfaceVariant = i22;
        this.outline = i23;
        this.outlineVariant = i24;
        this.shadow = i25;
        this.scrim = i26;
        this.inverseSurface = i27;
        this.inverseOnSurface = i28;
        this.inversePrimary = i29;
    }

    public static com.google.android.material.color.utilities.Scheme light(int i) {
        return lightFromCorePalette(com.google.android.material.color.utilities.CorePalette.of(i));
    }

    public static com.google.android.material.color.utilities.Scheme dark(int i) {
        return darkFromCorePalette(com.google.android.material.color.utilities.CorePalette.of(i));
    }

    public static com.google.android.material.color.utilities.Scheme lightContent(int i) {
        return lightFromCorePalette(com.google.android.material.color.utilities.CorePalette.contentOf(i));
    }

    public static com.google.android.material.color.utilities.Scheme darkContent(int i) {
        return darkFromCorePalette(com.google.android.material.color.utilities.CorePalette.contentOf(i));
    }

    private static com.google.android.material.color.utilities.Scheme lightFromCorePalette(com.google.android.material.color.utilities.CorePalette corePalette) {
        return new com.google.android.material.color.utilities.Scheme().withPrimary(corePalette.a1.tone(40)).withOnPrimary(corePalette.a1.tone(100)).withPrimaryContainer(corePalette.a1.tone(90)).withOnPrimaryContainer(corePalette.a1.tone(10)).withSecondary(corePalette.a2.tone(40)).withOnSecondary(corePalette.a2.tone(100)).withSecondaryContainer(corePalette.a2.tone(90)).withOnSecondaryContainer(corePalette.a2.tone(10)).withTertiary(corePalette.a3.tone(40)).withOnTertiary(corePalette.a3.tone(100)).withTertiaryContainer(corePalette.a3.tone(90)).withOnTertiaryContainer(corePalette.a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.n1.tone(99)).withOnBackground(corePalette.n1.tone(10)).withSurface(corePalette.n1.tone(99)).withOnSurface(corePalette.n1.tone(10)).withSurfaceVariant(corePalette.n2.tone(90)).withOnSurfaceVariant(corePalette.n2.tone(30)).withOutline(corePalette.n2.tone(50)).withOutlineVariant(corePalette.n2.tone(80)).withShadow(corePalette.n1.tone(0)).withScrim(corePalette.n1.tone(0)).withInverseSurface(corePalette.n1.tone(20)).withInverseOnSurface(corePalette.n1.tone(95)).withInversePrimary(corePalette.a1.tone(80));
    }

    private static com.google.android.material.color.utilities.Scheme darkFromCorePalette(com.google.android.material.color.utilities.CorePalette corePalette) {
        return new com.google.android.material.color.utilities.Scheme().withPrimary(corePalette.a1.tone(80)).withOnPrimary(corePalette.a1.tone(20)).withPrimaryContainer(corePalette.a1.tone(30)).withOnPrimaryContainer(corePalette.a1.tone(90)).withSecondary(corePalette.a2.tone(80)).withOnSecondary(corePalette.a2.tone(20)).withSecondaryContainer(corePalette.a2.tone(30)).withOnSecondaryContainer(corePalette.a2.tone(90)).withTertiary(corePalette.a3.tone(80)).withOnTertiary(corePalette.a3.tone(20)).withTertiaryContainer(corePalette.a3.tone(30)).withOnTertiaryContainer(corePalette.a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.n1.tone(10)).withOnBackground(corePalette.n1.tone(90)).withSurface(corePalette.n1.tone(10)).withOnSurface(corePalette.n1.tone(90)).withSurfaceVariant(corePalette.n2.tone(30)).withOnSurfaceVariant(corePalette.n2.tone(80)).withOutline(corePalette.n2.tone(60)).withOutlineVariant(corePalette.n2.tone(30)).withShadow(corePalette.n1.tone(0)).withScrim(corePalette.n1.tone(0)).withInverseSurface(corePalette.n1.tone(90)).withInverseOnSurface(corePalette.n1.tone(20)).withInversePrimary(corePalette.a1.tone(40));
    }

    public int getPrimary() {
        return this.primary;
    }

    public void setPrimary(int i) {
        this.primary = i;
    }

    public com.google.android.material.color.utilities.Scheme withPrimary(int i) {
        this.primary = i;
        return this;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public void setOnPrimary(int i) {
        this.onPrimary = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnPrimary(int i) {
        this.onPrimary = i;
        return this;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public void setPrimaryContainer(int i) {
        this.primaryContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withPrimaryContainer(int i) {
        this.primaryContainer = i;
        return this;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public void setOnPrimaryContainer(int i) {
        this.onPrimaryContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnPrimaryContainer(int i) {
        this.onPrimaryContainer = i;
        return this;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public void setSecondary(int i) {
        this.secondary = i;
    }

    public com.google.android.material.color.utilities.Scheme withSecondary(int i) {
        this.secondary = i;
        return this;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public void setOnSecondary(int i) {
        this.onSecondary = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnSecondary(int i) {
        this.onSecondary = i;
        return this;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public void setSecondaryContainer(int i) {
        this.secondaryContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withSecondaryContainer(int i) {
        this.secondaryContainer = i;
        return this;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public void setOnSecondaryContainer(int i) {
        this.onSecondaryContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnSecondaryContainer(int i) {
        this.onSecondaryContainer = i;
        return this;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public void setTertiary(int i) {
        this.tertiary = i;
    }

    public com.google.android.material.color.utilities.Scheme withTertiary(int i) {
        this.tertiary = i;
        return this;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public void setOnTertiary(int i) {
        this.onTertiary = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnTertiary(int i) {
        this.onTertiary = i;
        return this;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public void setTertiaryContainer(int i) {
        this.tertiaryContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withTertiaryContainer(int i) {
        this.tertiaryContainer = i;
        return this;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public void setOnTertiaryContainer(int i) {
        this.onTertiaryContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnTertiaryContainer(int i) {
        this.onTertiaryContainer = i;
        return this;
    }

    public int getError() {
        return this.error;
    }

    public void setError(int i) {
        this.error = i;
    }

    public com.google.android.material.color.utilities.Scheme withError(int i) {
        this.error = i;
        return this;
    }

    public int getOnError() {
        return this.onError;
    }

    public void setOnError(int i) {
        this.onError = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnError(int i) {
        this.onError = i;
        return this;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public void setErrorContainer(int i) {
        this.errorContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withErrorContainer(int i) {
        this.errorContainer = i;
        return this;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public void setOnErrorContainer(int i) {
        this.onErrorContainer = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnErrorContainer(int i) {
        this.onErrorContainer = i;
        return this;
    }

    public int getBackground() {
        return this.background;
    }

    public void setBackground(int i) {
        this.background = i;
    }

    public com.google.android.material.color.utilities.Scheme withBackground(int i) {
        this.background = i;
        return this;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public void setOnBackground(int i) {
        this.onBackground = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnBackground(int i) {
        this.onBackground = i;
        return this;
    }

    public int getSurface() {
        return this.surface;
    }

    public void setSurface(int i) {
        this.surface = i;
    }

    public com.google.android.material.color.utilities.Scheme withSurface(int i) {
        this.surface = i;
        return this;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public void setOnSurface(int i) {
        this.onSurface = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnSurface(int i) {
        this.onSurface = i;
        return this;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public void setSurfaceVariant(int i) {
        this.surfaceVariant = i;
    }

    public com.google.android.material.color.utilities.Scheme withSurfaceVariant(int i) {
        this.surfaceVariant = i;
        return this;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public void setOnSurfaceVariant(int i) {
        this.onSurfaceVariant = i;
    }

    public com.google.android.material.color.utilities.Scheme withOnSurfaceVariant(int i) {
        this.onSurfaceVariant = i;
        return this;
    }

    public int getOutline() {
        return this.outline;
    }

    public void setOutline(int i) {
        this.outline = i;
    }

    public com.google.android.material.color.utilities.Scheme withOutline(int i) {
        this.outline = i;
        return this;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public void setOutlineVariant(int i) {
        this.outlineVariant = i;
    }

    public com.google.android.material.color.utilities.Scheme withOutlineVariant(int i) {
        this.outlineVariant = i;
        return this;
    }

    public int getShadow() {
        return this.shadow;
    }

    public void setShadow(int i) {
        this.shadow = i;
    }

    public com.google.android.material.color.utilities.Scheme withShadow(int i) {
        this.shadow = i;
        return this;
    }

    public int getScrim() {
        return this.scrim;
    }

    public void setScrim(int i) {
        this.scrim = i;
    }

    public com.google.android.material.color.utilities.Scheme withScrim(int i) {
        this.scrim = i;
        return this;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public void setInverseSurface(int i) {
        this.inverseSurface = i;
    }

    public com.google.android.material.color.utilities.Scheme withInverseSurface(int i) {
        this.inverseSurface = i;
        return this;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public void setInverseOnSurface(int i) {
        this.inverseOnSurface = i;
    }

    public com.google.android.material.color.utilities.Scheme withInverseOnSurface(int i) {
        this.inverseOnSurface = i;
        return this;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public void setInversePrimary(int i) {
        this.inversePrimary = i;
    }

    public com.google.android.material.color.utilities.Scheme withInversePrimary(int i) {
        this.inversePrimary = i;
        return this;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheme{primary=");
        sb.append(this.primary);
        sb.append(", onPrimary=");
        sb.append(this.onPrimary);
        sb.append(", primaryContainer=");
        sb.append(this.primaryContainer);
        sb.append(", onPrimaryContainer=");
        sb.append(this.onPrimaryContainer);
        sb.append(", secondary=");
        sb.append(this.secondary);
        sb.append(", onSecondary=");
        sb.append(this.onSecondary);
        sb.append(", secondaryContainer=");
        sb.append(this.secondaryContainer);
        sb.append(", onSecondaryContainer=");
        sb.append(this.onSecondaryContainer);
        sb.append(", tertiary=");
        sb.append(this.tertiary);
        sb.append(", onTertiary=");
        sb.append(this.onTertiary);
        sb.append(", tertiaryContainer=");
        sb.append(this.tertiaryContainer);
        sb.append(", onTertiaryContainer=");
        sb.append(this.onTertiaryContainer);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", onError=");
        sb.append(this.onError);
        sb.append(", errorContainer=");
        sb.append(this.errorContainer);
        sb.append(", onErrorContainer=");
        sb.append(this.onErrorContainer);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", onBackground=");
        sb.append(this.onBackground);
        sb.append(", surface=");
        sb.append(this.surface);
        sb.append(", onSurface=");
        sb.append(this.onSurface);
        sb.append(", surfaceVariant=");
        sb.append(this.surfaceVariant);
        sb.append(", onSurfaceVariant=");
        sb.append(this.onSurfaceVariant);
        sb.append(", outline=");
        sb.append(this.outline);
        sb.append(", outlineVariant=");
        sb.append(this.outlineVariant);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", scrim=");
        sb.append(this.scrim);
        sb.append(", inverseSurface=");
        sb.append(this.inverseSurface);
        sb.append(", inverseOnSurface=");
        sb.append(this.inverseOnSurface);
        sb.append(", inversePrimary=");
        sb.append(this.inversePrimary);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.color.utilities.Scheme) || !super.equals(obj)) {
            return false;
        }
        com.google.android.material.color.utilities.Scheme scheme = (com.google.android.material.color.utilities.Scheme) obj;
        return this.primary == scheme.primary && this.onPrimary == scheme.onPrimary && this.primaryContainer == scheme.primaryContainer && this.onPrimaryContainer == scheme.onPrimaryContainer && this.secondary == scheme.secondary && this.onSecondary == scheme.onSecondary && this.secondaryContainer == scheme.secondaryContainer && this.onSecondaryContainer == scheme.onSecondaryContainer && this.tertiary == scheme.tertiary && this.onTertiary == scheme.onTertiary && this.tertiaryContainer == scheme.tertiaryContainer && this.onTertiaryContainer == scheme.onTertiaryContainer && this.error == scheme.error && this.onError == scheme.onError && this.errorContainer == scheme.errorContainer && this.onErrorContainer == scheme.onErrorContainer && this.background == scheme.background && this.onBackground == scheme.onBackground && this.surface == scheme.surface && this.onSurface == scheme.onSurface && this.surfaceVariant == scheme.surfaceVariant && this.onSurfaceVariant == scheme.onSurfaceVariant && this.outline == scheme.outline && this.outlineVariant == scheme.outlineVariant && this.shadow == scheme.shadow && this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.primary;
        int i2 = this.onPrimary;
        int i3 = this.primaryContainer;
        int i4 = this.onPrimaryContainer;
        int i5 = this.secondary;
        int i6 = this.onSecondary;
        int i7 = this.secondaryContainer;
        int i8 = this.onSecondaryContainer;
        int i9 = this.tertiary;
        int i10 = this.onTertiary;
        int i11 = this.tertiaryContainer;
        int i12 = this.onTertiaryContainer;
        int i13 = this.error;
        int i14 = this.onError;
        int i15 = this.errorContainer;
        int i16 = this.onErrorContainer;
        int i17 = this.background;
        int i18 = this.onBackground;
        int i19 = this.surface;
        int i20 = this.onSurface;
        int i21 = this.surfaceVariant;
        int i22 = this.onSurfaceVariant;
        int i23 = this.outline;
        int i24 = this.outlineVariant;
        int i25 = this.shadow;
        int i26 = this.scrim;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i26) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
    }
}
