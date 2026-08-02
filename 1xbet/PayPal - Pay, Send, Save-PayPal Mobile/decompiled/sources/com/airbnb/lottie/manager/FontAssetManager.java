package com.airbnb.lottie.manager;

/* loaded from: classes7.dex */
public class FontAssetManager {
    private com.airbnb.lottie.FontAssetDelegate getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.res.AssetManager getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.MutablePair<java.lang.String> getInputSizeshNQ4ISI = new com.airbnb.lottie.model.MutablePair<>();
    private final java.util.Map<com.airbnb.lottie.model.MutablePair<java.lang.String>, android.graphics.Typeface> getHighSpeedVideoSizes = new java.util.HashMap();
    private final java.util.Map<java.lang.String, android.graphics.Typeface> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    private java.lang.String Camera2StreamConfigurationMap = ".ttf";

    public FontAssetManager(android.graphics.drawable.Drawable.Callback callback, com.airbnb.lottie.FontAssetDelegate fontAssetDelegate) {
        this.getHighResolutionOutputSizeshNQ4ISI = fontAssetDelegate;
        if (!(callback instanceof android.view.View)) {
            com.airbnb.lottie.utils.Logger.warning("LottieDrawable must be inside of a view for images to work.");
            this.getHighSpeedVideoFpsRanges = null;
        } else {
            this.getHighSpeedVideoFpsRanges = ((android.view.View) callback).getContext().getAssets();
        }
    }

    public void setDelegate(com.airbnb.lottie.FontAssetDelegate fontAssetDelegate) {
        this.getHighResolutionOutputSizeshNQ4ISI = fontAssetDelegate;
    }

    public void setDefaultFontFileExtension(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public android.graphics.Typeface getTypeface(com.airbnb.lottie.model.Font font) {
        android.graphics.Typeface typeface;
        this.getInputSizeshNQ4ISI.set(font.getFamily(), font.getStyle());
        android.graphics.Typeface typeface2 = this.getHighSpeedVideoSizes.get(this.getInputSizeshNQ4ISI);
        if (typeface2 != null) {
            return typeface2;
        }
        java.lang.String family = font.getFamily();
        android.graphics.Typeface typeface3 = this.getHighSpeedVideoFpsRangesFor.get(family);
        if (typeface3 == null) {
            java.lang.String style = font.getStyle();
            java.lang.String name2 = font.getName();
            com.airbnb.lottie.FontAssetDelegate fontAssetDelegate = this.getHighResolutionOutputSizeshNQ4ISI;
            if (fontAssetDelegate != null) {
                typeface = fontAssetDelegate.fetchFont(family, style, name2);
                if (typeface == null) {
                    typeface = this.getHighResolutionOutputSizeshNQ4ISI.fetchFont(family);
                }
            } else {
                typeface = null;
            }
            com.airbnb.lottie.FontAssetDelegate fontAssetDelegate2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (fontAssetDelegate2 != null && typeface == null) {
                java.lang.String fontPath = fontAssetDelegate2.getFontPath(family, style, name2);
                if (fontPath == null) {
                    fontPath = this.getHighResolutionOutputSizeshNQ4ISI.getFontPath(family);
                }
                if (fontPath != null) {
                    typeface = android.graphics.Typeface.createFromAsset(this.getHighSpeedVideoFpsRanges, fontPath);
                }
            }
            if (font.getTypeface() != null) {
                typeface3 = font.getTypeface();
            } else {
                if (typeface == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("fonts/");
                    sb.append(family);
                    sb.append(this.Camera2StreamConfigurationMap);
                    typeface3 = android.graphics.Typeface.createFromAsset(this.getHighSpeedVideoFpsRanges, sb.toString());
                } else {
                    typeface3 = typeface;
                }
                this.getHighSpeedVideoFpsRangesFor.put(family, typeface3);
            }
        }
        java.lang.String style2 = font.getStyle();
        boolean contains = style2.contains("Italic");
        boolean contains2 = style2.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        if (typeface3.getStyle() != i) {
            typeface3 = android.graphics.Typeface.create(typeface3, i);
        }
        this.getHighSpeedVideoSizes.put(this.getInputSizeshNQ4ISI, typeface3);
        return typeface3;
    }
}
