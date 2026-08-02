package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DatadogModifierKt$datadogSemantics$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> {
    final /* synthetic */ java.lang.String $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean $getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        getHighSpeedVideoFpsRangesFor(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        com.datadog.android.compose.DatadogModifierKt.DatadogSemanticsPropertyKey.setValue(semanticsPropertyReceiver, com.datadog.android.compose.DatadogModifierKt.getHighSpeedVideoSizes[0], this.$getHighResolutionOutputSizeshNQ4ISI);
        if (this.$getHighSpeedVideoFpsRanges) {
            semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole(), androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7802getImageo7Vup1c()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatadogModifierKt$datadogSemantics$1(java.lang.String str, boolean z) {
        super(1);
        this.$getHighResolutionOutputSizeshNQ4ISI = str;
        this.$getHighSpeedVideoFpsRanges = z;
    }
}
