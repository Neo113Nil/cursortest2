package androidx.compose.ui.text.font;

/* compiled from: PlatformTypefaces.android.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\fJ<\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "()V", "createAndroidTypefaceUsingTypefaceStyle", "Landroid/graphics/Typeface;", "genericFontFamily", "", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "name", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "familyName", com.helpshift.proactive.InAppViewConstants.WEIGHT, "style", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "optionalOnDeviceFontFamilyByName", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PlatformTypefacesApi implements androidx.compose.ui.text.font.PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo4103createDefaultFO1MlWM(androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        return m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo4104createNamedRetOiIg(androidx.compose.ui.text.font.GenericFontFamily name, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        android.graphics.Typeface m4108loadNamedFromTypefaceCacheOrNullRetOiIg = m4108loadNamedFromTypefaceCacheOrNullRetOiIg(androidx.compose.ui.text.font.PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, fontStyle);
        return m4108loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg(name.getName(), fontWeight, fontStyle) : m4108loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo4105optionalOnDeviceFontFamilyByName78DK7lM(java.lang.String familyName, androidx.compose.ui.text.font.FontWeight weight, int style, androidx.compose.ui.text.font.FontVariation.Settings variationSettings, android.content.Context context) {
        android.graphics.Typeface mo4104createNamedRetOiIg;
        if (kotlin.jvm.internal.Intrinsics.areEqual(familyName, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif().getName())) {
            mo4104createNamedRetOiIg = mo4104createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif(), weight, style);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(familyName, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif().getName())) {
            mo4104createNamedRetOiIg = mo4104createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif(), weight, style);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(familyName, androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace().getName())) {
            mo4104createNamedRetOiIg = mo4104createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace(), weight, style);
        } else {
            mo4104createNamedRetOiIg = kotlin.jvm.internal.Intrinsics.areEqual(familyName, androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive().getName()) ? mo4104createNamedRetOiIg(androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive(), weight, style) : m4108loadNamedFromTypefaceCacheOrNullRetOiIg(familyName, weight, style);
        }
        return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(mo4104createNamedRetOiIg, variationSettings, context);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4108loadNamedFromTypefaceCacheOrNullRetOiIg(java.lang.String familyName, androidx.compose.ui.text.font.FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        android.graphics.Typeface m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg = m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg(familyName, weight, style);
        if (kotlin.jvm.internal.Intrinsics.areEqual(m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m4029getAndroidTypefaceStyleFO1MlWM(weight, style))) || kotlin.jvm.internal.Intrinsics.areEqual(m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg, m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, weight, style))) {
            return null;
        }
        return m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m4107createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(androidx.compose.ui.text.font.PlatformTypefacesApi platformTypefacesApi, java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        return platformTypefacesApi.m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4106createAndroidTypefaceUsingTypefaceStyleRetOiIg(java.lang.String genericFontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        java.lang.String str;
        if (androidx.compose.ui.text.font.FontStyle.m4076equalsimpl0(fontStyle, androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA()) && kotlin.jvm.internal.Intrinsics.areEqual(fontWeight, androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal()) && ((str = genericFontFamily) == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int m4029getAndroidTypefaceStyleFO1MlWM = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m4029getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle);
        java.lang.String str2 = genericFontFamily;
        if (str2 == null || str2.length() == 0) {
            return android.graphics.Typeface.defaultFromStyle(m4029getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.create(genericFontFamily, m4029getAndroidTypefaceStyleFO1MlWM);
    }
}
