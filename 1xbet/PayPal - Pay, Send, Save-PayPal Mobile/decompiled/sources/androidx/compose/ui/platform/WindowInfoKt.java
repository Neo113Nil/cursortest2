package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "onWindowFocusChanged", "WindowFocusObserver", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowInfoKt {
    public static final void WindowFocusObserver(final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(127829799);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(127829799, i2, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:67)");
            }
            androidx.compose.ui.platform.WindowInfo windowInfo = (androidx.compose.ui.platform.WindowInfo) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo());
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, i2 & 14);
            boolean changed = startRestartGroup.changed(windowInfo);
            boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
            androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1(windowInfo, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(windowInfo, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver(function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }
}
