package androidx.core.graphics;

/* loaded from: classes3.dex */
public class TypefaceCompatApi29Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static int bS_(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private android.graphics.fonts.Font bP_(android.graphics.fonts.FontFamily fontFamily, int i) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int bS_ = bS_(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i2);
            int bS_2 = bS_(fontStyle, font2.getStyle());
            if (bS_2 < bS_) {
                font = font2;
                bS_ = bS_2;
            }
        }
        return font;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected android.graphics.Typeface createFromInputStream(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        try {
            android.graphics.fonts.FontFamily fontFamily = getFontFamily(cancellationSignal, fontInfoArr, context.getContentResolver());
            if (fontFamily == null) {
                return null;
            }
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamily).setStyle(bP_(fontFamily, i).getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    protected android.graphics.fonts.Font getFontFromSystemFont(androidx.core.provider.FontsContractCompat.FontInfo fontInfo) {
        throw new java.lang.UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    private android.graphics.fonts.Font bR_(android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo fontInfo, android.content.ContentResolver contentResolver) {
        try {
            android.os.ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                android.graphics.fonts.Font.Builder ttcIndex = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(fontInfo.getWeight()).setSlant(fontInfo.isItalic() ? 1 : 0).setTtcIndex(fontInfo.getTtcIndex());
                if (!android.text.TextUtils.isEmpty(fontInfo.getVariationSettings())) {
                    ttcIndex.setFontVariationSettings(fontInfo.getVariationSettings());
                }
                android.graphics.fonts.Font build = ttcIndex.build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private android.graphics.fonts.Font bQ_(android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo fontInfo, android.content.ContentResolver contentResolver) {
        if (fontInfo.isSystemFont()) {
            return getFontFromSystemFont(fontInfo);
        }
        return bR_(cancellationSignal, fontInfo, contentResolver);
    }

    protected android.graphics.fonts.FontFamily getFontFamily(android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, android.content.ContentResolver contentResolver) {
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            android.graphics.fonts.Font bQ_ = bQ_(cancellationSignal, fontInfo, contentResolver);
            if (bQ_ != null) {
                if (builder == null) {
                    builder = new android.graphics.fonts.FontFamily.Builder(bQ_);
                } else {
                    builder.addFont(bQ_);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context context, android.os.CancellationSignal cancellationSignal, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> list, int i) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily fontFamily = getFontFamily(cancellationSignal, list.get(0), contentResolver);
            if (fontFamily == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamily);
            for (int i2 = 1; i2 < list.size(); i2++) {
                android.graphics.fonts.FontFamily fontFamily2 = getFontFamily(cancellationSignal, list.get(i2), contentResolver);
                if (fontFamily2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamily2);
                }
            }
            return customFallbackBuilder.setStyle(bP_(fontFamily, i).getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
                try {
                    android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, fontFileResourceEntry.getResourceId()).setWeight(fontFileResourceEntry.getWeight()).setSlant(fontFileResourceEntry.isItalic() ? 1 : 0).setTtcIndex(fontFileResourceEntry.getTtcIndex()).setFontVariationSettings(fontFileResourceEntry.getVariationSettings()).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(bP_(build2, i).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        try {
            android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, i).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface Camera2StreamConfigurationMap(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        return android.graphics.Typeface.create(typeface, i, z);
    }
}
