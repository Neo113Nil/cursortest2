package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DateInputKt$DateInputContent$3 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1179434278, intValue, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:98)");
            }
            java.lang.String str = this.Camera2StreamConfigurationMap;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.TextKt.m3985TextNvy7gAk(str, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion, (kotlin.jvm.functions.Function1) rememberedValue), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262140);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    DateInputKt$DateInputContent$3(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }
}
