package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Matrix matrix) {
        androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.access$startInput$localToScreen(this.getHighSpeedVideoFpsRanges, matrix.m6246unboximpl());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        super(1, kotlin.jvm.internal.Intrinsics.Kotlin.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.getHighSpeedVideoFpsRanges = legacyPlatformTextInputNode;
    }
}
