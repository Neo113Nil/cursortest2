package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\fJ/\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "()V", "createAndroidTypefaceUsingTypefaceStyle", "Landroid/graphics/Typeface;", "genericFontFamily", "", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "name", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "familyName", "weight", "style", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "optionalOnDeviceFontFamilyByName", "optionalOnDeviceFontFamilyByName-RetOiIg", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo3587createDefaultFO1MlWM(FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo3588createNamedRetOiIg(GenericFontFamily name, FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        android.graphics.Typeface m3592loadNamedFromTypefaceCacheOrNullRetOiIg = m3592loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefacesKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, fontStyle);
        return m3592loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg(name.getName(), fontWeight, fontStyle) : m3592loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-RetOiIg */
    public android.graphics.Typeface mo3589optionalOnDeviceFontFamilyByNameRetOiIg(String familyName, FontWeight weight, int style) {
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return Intrinsics.areEqual(familyName, FontFamily.INSTANCE.getSansSerif().getName()) ? mo3588createNamedRetOiIg(FontFamily.INSTANCE.getSansSerif(), weight, style) : Intrinsics.areEqual(familyName, FontFamily.INSTANCE.getSerif().getName()) ? mo3588createNamedRetOiIg(FontFamily.INSTANCE.getSerif(), weight, style) : Intrinsics.areEqual(familyName, FontFamily.INSTANCE.getMonospace().getName()) ? mo3588createNamedRetOiIg(FontFamily.INSTANCE.getMonospace(), weight, style) : Intrinsics.areEqual(familyName, FontFamily.INSTANCE.getCursive().getName()) ? mo3588createNamedRetOiIg(FontFamily.INSTANCE.getCursive(), weight, style) : m3592loadNamedFromTypefaceCacheOrNullRetOiIg(familyName, weight, style);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m3592loadNamedFromTypefaceCacheOrNullRetOiIg(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        android.graphics.Typeface m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg = m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg(familyName, weight, style);
        if (Intrinsics.areEqual(m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m3523getAndroidTypefaceStyleFO1MlWM(weight, style))) || Intrinsics.areEqual(m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg, m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, weight, style))) {
            return null;
        }
        return m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m3591createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.INSTANCE.m3570getNormal_LCdwA();
        }
        return platformTypefacesApi.m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m3590createAndroidTypefaceUsingTypefaceStyleRetOiIg(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        String str;
        if (FontStyle.m3565equalsimpl0(fontStyle, FontStyle.INSTANCE.m3570getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.INSTANCE.getNormal()) && ((str = genericFontFamily) == null || str.length() == 0)) {
            android.graphics.Typeface DEFAULT = android.graphics.Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        int m3523getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m3523getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle);
        String str2 = genericFontFamily;
        if (str2 == null || str2.length() == 0) {
            android.graphics.Typeface defaultFromStyle = android.graphics.Typeface.defaultFromStyle(m3523getAndroidTypefaceStyleFO1MlWM);
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        android.graphics.Typeface create = android.graphics.Typeface.create(genericFontFamily, m3523getAndroidTypefaceStyleFO1MlWM);
        Intrinsics.checkNotNullExpressionValue(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }
}
