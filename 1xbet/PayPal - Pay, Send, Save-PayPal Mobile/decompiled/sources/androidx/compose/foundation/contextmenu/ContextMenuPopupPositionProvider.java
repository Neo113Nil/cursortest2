package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012&\b\u0002\u0010\t\u001a \u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB9\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012&\b\u0002\u0010\t\u001a \u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\rJ/\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R2\u0010\u001b\u001a \u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "anchorPositionBlock", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/unit/IntRect;", "", "onPositionCalculated", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "anchorPosition", "(JLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextMenuPopupPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntOffset> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntOffset, androidx.compose.ui.unit.IntRect, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuPopupPositionProvider(kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntOffset> function0, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntOffset, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit> function2) {
        this.Camera2StreamConfigurationMap = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntOffset>) function0, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntOffset, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit>) ((i & 2) != 0 ? null : function2));
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(long j, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : function2, null);
    }

    private ContextMenuPopupPositionProvider(final long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntOffset, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit> function2) {
        this((kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntOffset>) new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.unit.IntOffset m8720boximpl;
                m8720boximpl = androidx.compose.ui.unit.IntOffset.m8720boximpl(j);
                return m8720boximpl;
            }
        }, function2);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        long m8738unboximpl = this.Camera2StreamConfigurationMap.invoke().m8738unboximpl();
        long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProviderKt.alignPopupAxis$default(anchorBounds.getTop() + androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8738unboximpl), (int) (popupContentSize & 4294967295L), (int) (windowSize & 4294967295L), false, 8, null) & 4294967295L) | (androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProviderKt.alignPopupAxis(anchorBounds.getLeft() + androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8738unboximpl), (int) (popupContentSize >> 32), (int) (windowSize >> 32), layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) << 32));
        kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntOffset, androidx.compose.ui.unit.IntRect, kotlin.Unit> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (function2 != null) {
            function2.invoke(androidx.compose.ui.unit.IntOffset.m8720boximpl(m8738unboximpl), androidx.compose.ui.unit.IntRectKt.m8762IntRectVbeCjmY(m8723constructorimpl, popupContentSize));
        }
        return m8723constructorimpl;
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(long j, kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntOffset, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit>) function2);
    }
}
