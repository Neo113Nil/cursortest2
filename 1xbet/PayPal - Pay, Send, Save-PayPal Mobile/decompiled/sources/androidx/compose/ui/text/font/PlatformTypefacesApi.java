package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001a"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "<init>", "()V", "Landroidx/compose/ui/text/font/FontWeight;", "p0", "Landroidx/compose/ui/text/font/FontStyle;", "p1", "Landroid/graphics/Typeface;", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "Landroidx/compose/ui/text/font/GenericFontFamily;", "p2", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p3", "Landroid/content/Context;", "p4", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "optionalOnDeviceFontFamilyByName", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PlatformTypefacesApi implements androidx.compose.ui.text.font.PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public final android.graphics.Typeface mo8180createDefaultFO1MlWM(androidx.compose.ui.text.font.FontWeight p0, int p1) {
        return getHighResolutionOutputSizeshNQ4ISI(null, p0, p1);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public final android.graphics.Typeface mo8181createNamedRetOiIg(androidx.compose.ui.text.font.GenericFontFamily p0, androidx.compose.ui.text.font.FontWeight p1, int p2) {
        android.graphics.Typeface highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.compose.ui.text.font.PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(p0.getName(), p1), p1, p2);
        return highSpeedVideoFpsRanges == null ? getHighResolutionOutputSizeshNQ4ISI(p0.getName(), p1, p2) : highSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public final android.graphics.Typeface mo8182optionalOnDeviceFontFamilyByName78DK7lM(java.lang.String p0, androidx.compose.ui.text.font.FontWeight p1, int p2, androidx.compose.ui.text.font.FontVariation.Settings p3, android.content.Context p4) {
        android.graphics.Typeface mo8181createNamedRetOiIg;
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif().getName())) {
            mo8181createNamedRetOiIg = mo8181createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif(), p1, p2);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(p0, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif().getName())) {
            mo8181createNamedRetOiIg = mo8181createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif(), p1, p2);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(p0, androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace().getName())) {
            mo8181createNamedRetOiIg = mo8181createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace(), p1, p2);
        } else {
            mo8181createNamedRetOiIg = kotlin.jvm.internal.Intrinsics.areEqual(p0, androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive().getName()) ? mo8181createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive(), p1, p2) : getHighSpeedVideoFpsRanges(p0, p1, p2);
        }
        return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(mo8181createNamedRetOiIg, p3, p4);
    }

    private final android.graphics.Typeface getHighSpeedVideoFpsRanges(java.lang.String p0, androidx.compose.ui.text.font.FontWeight p1, int p2) {
        if (p0.length() == 0) {
            return null;
        }
        android.graphics.Typeface highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0, p1, p2);
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m8104getAndroidTypefaceStyleFO1MlWM(p1, p2))) || kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, getHighResolutionOutputSizeshNQ4ISI(null, p1, p2))) {
            return null;
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    private final android.graphics.Typeface getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, androidx.compose.ui.text.font.FontWeight p1, int p2) {
        java.lang.String str;
        if (androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(p2, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA()) && kotlin.jvm.internal.Intrinsics.areEqual(p1, androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal()) && ((str = p0) == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int m8104getAndroidTypefaceStyleFO1MlWM = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m8104getAndroidTypefaceStyleFO1MlWM(p1, p2);
        java.lang.String str2 = p0;
        if (str2 == null || str2.length() == 0) {
            return android.graphics.Typeface.defaultFromStyle(m8104getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.create(p0, m8104getAndroidTypefaceStyleFO1MlWM);
    }
}
