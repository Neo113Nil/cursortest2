package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "suggestSelectionForLongPressOrDoubleClick-pYaCw-w", "(Ljava/lang/CharSequence;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestSelectionForLongPressOrDoubleClick", "Landroidx/compose/ui/geometry/Offset;", "secondaryClickLocation", "", "onShowContextMenu-_2OEclM", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/geometry/Offset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onShowContextMenu", "onShowSelectionToolbar-Sb-Bc2M", "onShowSelectionToolbar"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PlatformSelectionBehaviors {
    /* renamed from: onShowContextMenu-_2OEclM, reason: not valid java name */
    java.lang.Object mo2377onShowContextMenu_2OEclM(java.lang.CharSequence charSequence, long j, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* renamed from: onShowSelectionToolbar-Sb-Bc2M, reason: not valid java name */
    java.lang.Object mo2378onShowSelectionToolbarSbBc2M(java.lang.CharSequence charSequence, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* renamed from: suggestSelectionForLongPressOrDoubleClick-pYaCw-w, reason: not valid java name */
    java.lang.Object mo2379suggestSelectionForLongPressOrDoubleClickpYaCww(java.lang.CharSequence charSequence, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.TextRange> continuation);
}
