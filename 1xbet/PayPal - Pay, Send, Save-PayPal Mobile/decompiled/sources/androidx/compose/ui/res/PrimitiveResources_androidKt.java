package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "id", "integerResource", "(ILandroidx/compose/runtime/Composer;I)I", "", "integerArrayResource", "(ILandroidx/compose/runtime/Composer;I)[I", "", "booleanResource", "(ILandroidx/compose/runtime/Composer;I)Z", "Landroidx/compose/ui/unit/Dp;", "dimensionResource", "(ILandroidx/compose/runtime/Composer;I)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimitiveResources_androidKt {
    public static final int integerResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(916701108, i2, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getInteger(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return integer;
    }

    public static final int[] integerArrayResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-93991766, i2, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:48)");
        }
        int[] intArray = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getIntArray(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return intArray;
    }

    public static final boolean booleanResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-432394447, i2, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:60)");
        }
        boolean z = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getBoolean(i);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return z;
    }

    public static final float dimensionResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(804324951, i2, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:72)");
        }
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getDimension(i) / ((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).getDensity());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m8601constructorimpl;
    }
}
