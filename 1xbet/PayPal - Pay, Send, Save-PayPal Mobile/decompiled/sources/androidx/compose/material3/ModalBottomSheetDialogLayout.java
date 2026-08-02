package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R<\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001b\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001d8\u0015@RX\u0095\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroid/content/Context;", "p0", "Landroid/view/Window;", "p1", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Camera2StreamConfigurationMap", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;", "()Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function2;)V", "", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheetDialogLayout extends androidx.compose.ui.platform.AbstractComposeView implements androidx.compose.ui.window.DialogWindowProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.view.Window getHighSpeedVideoFpsRanges;
    private final androidx.compose.runtime.MutableState getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.window.DialogWindowProvider
    /* renamed from: getWindow, reason: from getter */
    public final android.view.Window getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public ModalBottomSheetDialogLayout(android.content.Context context, android.view.Window window) {
        super(context, null, 0, 6, null);
        this.getHighSpeedVideoFpsRanges = window;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m3128getLambda$91331245$material3(), null, 2, null);
    }

    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap() {
        return (kotlin.jvm.functions.Function2) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getGetOutputFormats() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setContent(androidx.compose.runtime.CompositionContext parent, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        setParentCompositionContext(parent);
        getHighSpeedVideoFpsRangesFor(content);
        this.getHighSpeedVideoFpsRangesFor = true;
        createComposition();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(576708319);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(576708319, i2, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:437)");
            }
            Camera2StreamConfigurationMap().invoke(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ModalBottomSheetDialogLayout.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.ModalBottomSheetDialogLayout.this, i, (androidx.compose.runtime.Composer) obj);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i, androidx.compose.runtime.Composer composer) {
        modalBottomSheetDialogLayout.Content(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
