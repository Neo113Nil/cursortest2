package com.google.android.material.color;

/* loaded from: classes8.dex */
public class DynamicColorsOptions {
    private static final com.google.android.material.color.DynamicColors.Precondition ALWAYS_ALLOW = new com.google.android.material.color.DynamicColors.Precondition() { // from class: com.google.android.material.color.DynamicColorsOptions.1
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(android.app.Activity activity, int i) {
            return true;
        }
    };
    private static final com.google.android.material.color.DynamicColors.OnAppliedCallback NO_OP_CALLBACK = new com.google.android.material.color.DynamicColors.OnAppliedCallback() { // from class: com.google.android.material.color.DynamicColorsOptions.2
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(android.app.Activity activity) {
        }
    };
    private java.lang.Integer contentBasedSeedColor;
    private final com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback;
    private final com.google.android.material.color.DynamicColors.Precondition precondition;
    private final int themeOverlay;

    private DynamicColorsOptions(com.google.android.material.color.DynamicColorsOptions.Builder builder) {
        this.themeOverlay = builder.themeOverlay;
        this.precondition = builder.precondition;
        this.onAppliedCallback = builder.onAppliedCallback;
        if (builder.contentBasedSourceColor != null) {
            this.contentBasedSeedColor = builder.contentBasedSourceColor;
        } else if (builder.contentBasedSourceBitmap != null) {
            this.contentBasedSeedColor = java.lang.Integer.valueOf(extractSeedColorFromImage(builder.contentBasedSourceBitmap));
        }
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    public com.google.android.material.color.DynamicColors.Precondition getPrecondition() {
        return this.precondition;
    }

    public com.google.android.material.color.DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.onAppliedCallback;
    }

    public java.lang.Integer getContentBasedSeedColor() {
        return this.contentBasedSeedColor;
    }

    public static class Builder {
        private android.graphics.Bitmap contentBasedSourceBitmap;
        private java.lang.Integer contentBasedSourceColor;
        private int themeOverlay;
        private com.google.android.material.color.DynamicColors.Precondition precondition = com.google.android.material.color.DynamicColorsOptions.ALWAYS_ALLOW;
        private com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback = com.google.android.material.color.DynamicColorsOptions.NO_OP_CALLBACK;

        public com.google.android.material.color.DynamicColorsOptions.Builder setThemeOverlay(int i) {
            this.themeOverlay = i;
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setPrecondition(com.google.android.material.color.DynamicColors.Precondition precondition) {
            this.precondition = precondition;
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setOnAppliedCallback(com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.onAppliedCallback = onAppliedCallback;
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setContentBasedSource(android.graphics.Bitmap bitmap) {
            this.contentBasedSourceBitmap = bitmap;
            this.contentBasedSourceColor = null;
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setContentBasedSource(int i) {
            this.contentBasedSourceBitmap = null;
            this.contentBasedSourceColor = java.lang.Integer.valueOf(i);
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions build() {
            return new com.google.android.material.color.DynamicColorsOptions(this);
        }
    }

    private static int extractSeedColorFromImage(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return com.google.android.material.color.utilities.Score.score(com.google.android.material.color.utilities.QuantizerCelebi.quantize(iArr, 128)).get(0).intValue();
    }
}
