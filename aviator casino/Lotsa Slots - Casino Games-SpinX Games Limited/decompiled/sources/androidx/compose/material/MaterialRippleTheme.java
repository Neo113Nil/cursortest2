package androidx.compose.material;

/* compiled from: MaterialTheme.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/MaterialRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "()V", "defaultColor", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class MaterialRippleTheme implements androidx.compose.material.ripple.RippleTheme {
    public static final androidx.compose.material.MaterialRippleTheme INSTANCE = new androidx.compose.material.MaterialRippleTheme();

    private MaterialRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    /* renamed from: defaultColor-WaAFU9c, reason: not valid java name */
    public long mo1417defaultColorWaAFU9c(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(550536719);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(defaultColor)127@5167L7,128@5211L6:MaterialTheme.kt#jmzs0o");
        androidx.compose.material.ripple.RippleTheme.Companion companion = androidx.compose.material.ripple.RippleTheme.INSTANCE;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContentColor);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        long m1603defaultRippleColor5vOe2sY = companion.m1603defaultRippleColor5vOe2sY(((androidx.compose.ui.graphics.Color) consume).m2123unboximpl(), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        composer.endReplaceableGroup();
        return m1603defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public androidx.compose.material.ripple.RippleAlpha rippleAlpha(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1419762518);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rippleAlpha)133@5355L7,134@5399L6:MaterialTheme.kt#jmzs0o");
        androidx.compose.material.ripple.RippleTheme.Companion companion = androidx.compose.material.ripple.RippleTheme.INSTANCE;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContentColor);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.material.ripple.RippleAlpha m1602defaultRippleAlphaDxMtmZc = companion.m1602defaultRippleAlphaDxMtmZc(((androidx.compose.ui.graphics.Color) consume).m2123unboximpl(), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        composer.endReplaceableGroup();
        return m1602defaultRippleAlphaDxMtmZc;
    }
}
