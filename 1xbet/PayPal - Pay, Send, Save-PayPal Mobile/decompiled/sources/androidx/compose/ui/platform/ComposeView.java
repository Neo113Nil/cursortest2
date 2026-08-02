package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\n2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014R'\u0010\u0016\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0015@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "", "p0", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeView extends androidx.compose.ui.platform.AbstractComposeView {
    public static final int $stable = 8;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public ComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public /* synthetic */ ComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    protected final boolean getGetOutputStallDuration() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(420213850);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(420213850, i2, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:444)");
            }
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> value = this.getHighSpeedVideoFpsRangesFor.getValue();
            if (value == null) {
                startRestartGroup.startReplaceGroup(-1238823553);
            } else {
                startRestartGroup.startReplaceGroup(98585282);
                value.invoke(startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.ComposeView$Content$1
                private void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer2) {
                    androidx.compose.ui.platform.ComposeView.this.Content(composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    getHighSpeedVideoSizes(composer2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final void setContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.getHighSpeedVideoFpsRangesFor.setValue(content);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public ComposeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(android.content.Context context) {
        this(context, null, 0, 6, null);
    }
}
