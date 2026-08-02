package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001a"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi28;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "<init>", "()V", "", "p0", "Landroidx/compose/ui/text/font/FontWeight;", "p1", "Landroidx/compose/ui/text/font/FontStyle;", "p2", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p3", "Landroid/content/Context;", "p4", "Landroid/graphics/Typeface;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "optionalOnDeviceFontFamilyByName", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PlatformTypefacesApi28 implements androidx.compose.ui.text.font.PlatformTypefaces {
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
            mo8181createNamedRetOiIg = kotlin.jvm.internal.Intrinsics.areEqual(p0, androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive().getName()) ? mo8181createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive(), p1, p2) : getHighResolutionOutputSizeshNQ4ISI(p0, p1, p2);
        }
        return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(mo8181createNamedRetOiIg, p3, p4);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public final android.graphics.Typeface mo8180createDefaultFO1MlWM(androidx.compose.ui.text.font.FontWeight p0, int p1) {
        return Camera2StreamConfigurationMap(null, p0, p1);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public final android.graphics.Typeface mo8181createNamedRetOiIg(androidx.compose.ui.text.font.GenericFontFamily p0, androidx.compose.ui.text.font.FontWeight p1, int p2) {
        return Camera2StreamConfigurationMap(p0.getName(), p1, p2);
    }

    private final android.graphics.Typeface getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, androidx.compose.ui.text.font.FontWeight p1, int p2) {
        if (p0.length() == 0) {
            return null;
        }
        android.graphics.Typeface Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(p0, p1, p2);
        if (kotlin.jvm.internal.Intrinsics.areEqual(Camera2StreamConfigurationMap, androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, p1.getWeight(), androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(p2, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()))) || kotlin.jvm.internal.Intrinsics.areEqual(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(null, p1, p2))) {
            return null;
        }
        return Camera2StreamConfigurationMap;
    }

    private final android.graphics.Typeface Camera2StreamConfigurationMap(java.lang.String p0, androidx.compose.ui.text.font.FontWeight p1, int p2) {
        android.graphics.Typeface create;
        java.lang.String str;
        if (androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(p2, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA()) && kotlin.jvm.internal.Intrinsics.areEqual(p1, androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal()) && ((str = p0) == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        if (p0 == null) {
            create = android.graphics.Typeface.DEFAULT;
        } else {
            create = android.graphics.Typeface.create(p0, 0);
        }
        return android.graphics.Typeface.create(create, p1.getWeight(), androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(p2, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()));
    }
}
