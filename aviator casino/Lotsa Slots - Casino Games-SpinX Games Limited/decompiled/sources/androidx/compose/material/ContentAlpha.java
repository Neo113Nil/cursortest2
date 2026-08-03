package androidx.compose.material;

/* compiled from: ContentAlpha.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "()V", com.ironsource.C2945a2.e, "", "getDisabled", "(Landroidx/compose/runtime/Composer;I)F", com.adjust.sdk.Constants.HIGH, "getHigh", "medium", "getMedium", "contentAlpha", "highContrastAlpha", "lowContrastAlpha", "(FFLandroidx/compose/runtime/Composer;I)F", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static final int $stable = 0;
    public static final androidx.compose.material.ContentAlpha INSTANCE = new androidx.compose.material.ContentAlpha();

    private ContentAlpha() {
    }

    public final float getHigh(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(629162431);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C34@1107L146:ContentAlpha.kt#jmzs0o");
        float contentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    public final float getMedium(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1999054879);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C45@1458L150:ContentAlpha.kt#jmzs0o");
        float contentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    public final float getDisabled(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(621183615);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C56@1805L154:ContentAlpha.kt#jmzs0o");
        float contentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    private final float contentAlpha(float f, float f2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1528360391);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(contentAlpha)76@2623L7,77@2670L6:ContentAlpha.kt#jmzs0o");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContentColor);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        long m2123unboximpl = ((androidx.compose.ui.graphics.Color) consume).m2123unboximpl();
        if (!androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? androidx.compose.ui.graphics.ColorKt.m2165luminance8_81llA(m2123unboximpl) >= 0.5d : androidx.compose.ui.graphics.ColorKt.m2165luminance8_81llA(m2123unboximpl) <= 0.5d) {
            f = f2;
        }
        composer.endReplaceableGroup();
        return f;
    }
}
