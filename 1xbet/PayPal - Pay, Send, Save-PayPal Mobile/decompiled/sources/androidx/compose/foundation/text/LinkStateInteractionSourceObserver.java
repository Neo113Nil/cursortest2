package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\t\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "", "collectInteractionsForLinks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/interaction/InteractionSource;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/MutableIntState;", "", "isFocused", "()Z", "isHovered", "isPressed"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkStateInteractionSourceObserver {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap = 1;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes = 2;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI = 4;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);

    public LinkStateInteractionSourceObserver(androidx.compose.foundation.interaction.InteractionSource interactionSource) {
        this.getHighSpeedVideoFpsRanges = interactionSource;
    }

    public final boolean isFocused() {
        return (this.getHighSpeedVideoFpsRangesFor.getIntValue() & this.Camera2StreamConfigurationMap) != 0;
    }

    public final boolean isHovered() {
        return (this.getHighSpeedVideoFpsRangesFor.getIntValue() & this.getHighSpeedVideoSizes) != 0;
    }

    public final boolean isPressed() {
        return (this.getHighSpeedVideoFpsRangesFor.getIntValue() & this.getHighResolutionOutputSizeshNQ4ISI) != 0;
    }

    public final java.lang.Object collectInteractionsForLinks(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.collection.MutableObjectList mutableObjectList = new androidx.collection.MutableObjectList(0, 1, null);
        java.lang.Object collect = this.getHighSpeedVideoFpsRanges.getInteractions().collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver$collectInteractionsForLinks$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return getHighSpeedVideoFpsRanges((androidx.compose.foundation.interaction.Interaction) obj);
            }

            private java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.foundation.interaction.Interaction interaction) {
                androidx.compose.runtime.MutableIntState mutableIntState;
                int i;
                if ((interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) || (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) || (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press)) {
                    mutableObjectList.add(interaction);
                } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
                    mutableObjectList.remove(((androidx.compose.foundation.interaction.HoverInteraction.Exit) interaction).getEnter());
                } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
                    mutableObjectList.remove(((androidx.compose.foundation.interaction.FocusInteraction.Unfocus) interaction).getFocus());
                } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                    mutableObjectList.remove(((androidx.compose.foundation.interaction.PressInteraction.Release) interaction).getPress());
                } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                    mutableObjectList.remove(((androidx.compose.foundation.interaction.PressInteraction.Cancel) interaction).getPress());
                }
                androidx.collection.MutableObjectList<androidx.compose.foundation.interaction.Interaction> mutableObjectList2 = mutableObjectList;
                androidx.compose.foundation.text.LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this;
                java.lang.Object[] objArr = mutableObjectList2.content;
                int i2 = mutableObjectList2._size;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    androidx.compose.foundation.interaction.Interaction interaction2 = (androidx.compose.foundation.interaction.Interaction) objArr[i4];
                    if (interaction2 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
                        i = linkStateInteractionSourceObserver.getHighSpeedVideoSizes;
                    } else if (interaction2 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
                        i = linkStateInteractionSourceObserver.Camera2StreamConfigurationMap;
                    } else if (interaction2 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        i = linkStateInteractionSourceObserver.getHighResolutionOutputSizeshNQ4ISI;
                    }
                    i3 |= i;
                }
                mutableIntState = this.getHighSpeedVideoFpsRangesFor;
                mutableIntState.setIntValue(i3);
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
