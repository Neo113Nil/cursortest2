package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DateInputKt$DateInputContent$2 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-752164549, intValue, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:93)");
            }
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer2.changed(this.getHighSpeedVideoFpsRanges);
            boolean changed2 = composer2.changed(this.getHighSpeedVideoSizes);
            final java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            final java.lang.String str3 = this.getHighSpeedVideoSizes;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DateInputKt$DateInputContent$2.getHighSpeedVideoFpsRangesFor(str2, str3, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.TextKt.m3985TextNvy7gAk(str, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262140);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, sb.toString());
        return kotlin.Unit.INSTANCE;
    }

    DateInputKt$DateInputContent$2(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = str2;
    }
}
