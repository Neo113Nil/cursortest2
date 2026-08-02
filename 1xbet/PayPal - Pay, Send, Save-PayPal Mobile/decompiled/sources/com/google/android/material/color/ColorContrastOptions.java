package com.google.android.material.color;

/* loaded from: classes8.dex */
public class ColorContrastOptions {
    private final int highContrastThemeOverlayResourceId;
    private final int mediumContrastThemeOverlayResourceId;

    private ColorContrastOptions(com.google.android.material.color.ColorContrastOptions.Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public static class Builder {
        private int highContrastThemeOverlayResourceId;
        private int mediumContrastThemeOverlayResourceId;

        public com.google.android.material.color.ColorContrastOptions.Builder setMediumContrastThemeOverlay(int i) {
            this.mediumContrastThemeOverlayResourceId = i;
            return this;
        }

        public com.google.android.material.color.ColorContrastOptions.Builder setHighContrastThemeOverlay(int i) {
            this.highContrastThemeOverlayResourceId = i;
            return this;
        }

        public com.google.android.material.color.ColorContrastOptions build() {
            return new com.google.android.material.color.ColorContrastOptions(this);
        }
    }
}
