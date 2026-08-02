package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class AlertDialogKt$AlertDialogImpl$2 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.Modifier getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-488319269, i, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:181)");
        }
        androidx.compose.material.AlertDialogKt.m2463AlertDialogContentWMdw5o4(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogKt$AlertDialogImpl$2(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, androidx.compose.ui.graphics.Shape shape, long j, long j2) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighSpeedVideoFpsRanges = modifier;
        this.getOutputMinFrameDuration = function22;
        this.getOutputFormats = function23;
        this.getHighResolutionOutputSizeshNQ4ISI = shape;
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = j2;
    }
}
