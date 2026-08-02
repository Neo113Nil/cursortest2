package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "<init>", "()V", "", "p0", "p1", "getHighSpeedVideoFpsRanges", "(FFLandroidx/compose/runtime/Composer;I)F", "getHigh", "(Landroidx/compose/runtime/Composer;I)F", com.adjust.sdk.Constants.HIGH, "getMedium", "medium", "getDisabled", "disabled"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static final int $stable = 0;
    public static final androidx.compose.material.ContentAlpha INSTANCE = new androidx.compose.material.ContentAlpha();

    private ContentAlpha() {
    }

    public final float getHigh(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(629162431, i, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(1.0f, 0.87f, composer, ((i << 6) & 896) | 54);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRanges;
    }

    public final float getMedium(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1999054879, i, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(0.74f, 0.6f, composer, ((i << 6) & 896) | 54);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRanges;
    }

    public final float getDisabled(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(621183615, i, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(0.38f, 0.38f, composer, ((i << 6) & 896) | 54);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRanges;
    }

    private static float getHighSpeedVideoFpsRanges(float f, float f2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1528360391, i, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long m6006unboximpl = ((androidx.compose.ui.graphics.Color) composer.consume(androidx.compose.material.ContentColorKt.getLocalContentColor())).m6006unboximpl();
        if (!androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(m6006unboximpl) >= 0.5d : androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(m6006unboximpl) <= 0.5d) {
            f = f2;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return f;
    }
}
