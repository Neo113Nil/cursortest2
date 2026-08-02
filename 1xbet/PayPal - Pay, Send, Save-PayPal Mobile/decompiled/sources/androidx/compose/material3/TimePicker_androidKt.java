package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerLayoutType;", "defaultTimePickerLayoutType", "(Landroidx/compose/runtime/Composer;I)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimePicker_androidKt {
    public static final int defaultTimePickerLayoutType(androidx.compose.runtime.Composer composer, int i) {
        int m4051getVerticalQJTpgSE;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-721362352, i, -1, "androidx.compose.material3.defaultTimePickerLayoutType (TimePicker.android.kt:26)");
        }
        android.content.res.Configuration configuration = (android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
        if (configuration.screenHeightDp < configuration.screenWidthDp) {
            m4051getVerticalQJTpgSE = androidx.compose.material3.TimePickerLayoutType.INSTANCE.m4050getHorizontalQJTpgSE();
        } else {
            m4051getVerticalQJTpgSE = androidx.compose.material3.TimePickerLayoutType.INSTANCE.m4051getVerticalQJTpgSE();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m4051getVerticalQJTpgSE;
    }
}
