package androidx.compose.foundation.text.contextmenu.provider;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\"BA\u00128\u0010\n\u001a4\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014RF\u0010\u0017\u001a4\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR7\u0010\u0015\u001a\b\u0018\u00010\u001cR\u00020\u00002\f\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00008C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f\"\u0004\b \u0010!"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuProvider;", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "Lkotlin/ParameterName;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "Landroidx/compose/runtime/Composable;", "contextMenuBlock", "<init>", "(Lkotlin/jvm/functions/Function5;)V", "dataProvider", "showTextContextMenu", "(Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchorLayoutCoordinates", "ContextMenu", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function5;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/MutatorMutex;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/MutatorMutex;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;", "p0", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;)V", "SessionImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicTextContextMenuProvider implements androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function5<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.MutatorMutex();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextContextMenuProvider(kotlin.jvm.functions.Function5<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, ? super androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, ? super kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        this.getHighSpeedVideoFpsRanges = function5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl sessionImpl) {
        this.Camera2StreamConfigurationMap.setValue(sessionImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl getHighSpeedVideoSizes() {
        return (androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl) this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public final java.lang.Object showTextContextMenu(androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate$default = androidx.compose.foundation.MutatorMutex.mutate$default(this.getHighSpeedVideoFpsRangesFor, null, new androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2(this, new androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl(textContextMenuDataProvider), null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    public final void ContextMenu(final kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(723898654);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(723898654, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (highSpeedVideoSizes != null) {
                this.getHighSpeedVideoFpsRanges.invoke(highSpeedVideoSizes, highSpeedVideoSizes.getGetHighResolutionOutputSizeshNQ4ISI(), function0, startRestartGroup, java.lang.Integer.valueOf((i2 << 6) & 896));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.$r8$lambda$SLTLVqrefW9AJvZk4irjo7D8cKs(androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.m2163$r8$lambda$7JkAbamvxuju__nxGahLfqgJ80(androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public final void cancel() {
        androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            highSpeedVideoSizes.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider$SessionImpl;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "p0", "<init>", "(Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;)V", "", "close", "()V", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/channels/Channel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class SessionImpl implements androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighSpeedVideoSizes = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);

        public SessionImpl(androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider) {
            this.getHighResolutionOutputSizeshNQ4ISI = textContextMenuDataProvider;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public final void close() {
            this.getHighSpeedVideoSizes.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE);
        }
    }

    /* renamed from: $r8$lambda$-7JkAbamvxuju__nxGahLfqgJ80, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2163$r8$lambda$7JkAbamvxuju__nxGahLfqgJ80(androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        basicTextContextMenuProvider.ContextMenu(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SLTLVqrefW9AJvZk4irjo7D8cKs(androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        basicTextContextMenuProvider.ContextMenu(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
