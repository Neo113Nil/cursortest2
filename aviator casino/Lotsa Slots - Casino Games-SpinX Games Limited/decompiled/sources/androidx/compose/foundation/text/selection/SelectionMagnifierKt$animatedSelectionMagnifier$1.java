package androidx.compose.foundation.text.selection;

/* compiled from: SelectionMagnifier.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> {
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> $magnifierCenter;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>, androidx.compose.ui.Modifier> $platformMagnifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SelectionMagnifierKt$animatedSelectionMagnifier$1(kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> function0, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>, ? extends androidx.compose.ui.Modifier> function1) {
        super(3);
        this.$magnifierCenter = function0;
        this.$platformMagnifier = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        final androidx.compose.runtime.State rememberAnimatedMagnifierPosition;
        composer.startReplaceableGroup(759876635);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C65@2502L70:SelectionMagnifier.kt#eksfi3");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
        }
        rememberAnimatedMagnifierPosition = androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
        kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>, androidx.compose.ui.Modifier> function1 = this.$platformMagnifier;
        composer.startReplaceableGroup(1714568984);
        boolean changed = composer.changed(rememberAnimatedMagnifierPosition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke() {
                    return androidx.compose.ui.geometry.Offset.m1860boximpl(m1024invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m1024invokeF1C5BW0() {
                    long invoke$lambda$0;
                    invoke$lambda$0 = androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1.invoke$lambda$0(rememberAnimatedMagnifierPosition);
                    return invoke$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.ui.Modifier invoke = function1.invoke((kotlin.jvm.functions.Function0) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$0(androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> state) {
        return state.getValue().getPackedValue();
    }
}
