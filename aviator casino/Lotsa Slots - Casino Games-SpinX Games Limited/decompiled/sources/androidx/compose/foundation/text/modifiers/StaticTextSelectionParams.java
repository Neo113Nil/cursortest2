package androidx.compose.foundation.text.modifiers;

/* compiled from: SelectionController.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;)V", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "shouldClip", "", "getShouldClip", "()Z", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "copy", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "", "end", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class StaticTextSelectionParams {
    private final androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
    private final androidx.compose.ui.text.TextLayoutResult textLayoutResult;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.Companion INSTANCE = new androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.foundation.text.modifiers.StaticTextSelectionParams Empty = new androidx.compose.foundation.text.modifiers.StaticTextSelectionParams(null, null);

    public StaticTextSelectionParams(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final androidx.compose.ui.text.TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    /* compiled from: SelectionController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;", "", "()V", "Empty", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "getEmpty", "()Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.foundation.text.modifiers.StaticTextSelectionParams getEmpty() {
            return androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.Empty;
        }
    }

    public androidx.compose.ui.graphics.Path getPathForRange(int start, int end) {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(start, end);
        }
        return null;
    }

    public boolean getShouldClip() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4411getVisiblegIe3tQ8()) || !textLayoutResult.getHasVisualOverflow()) ? false : true;
    }

    public static /* synthetic */ androidx.compose.foundation.text.modifiers.StaticTextSelectionParams copy$default(androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            layoutCoordinates = staticTextSelectionParams.layoutCoordinates;
        }
        if ((i & 2) != 0) {
            textLayoutResult = staticTextSelectionParams.textLayoutResult;
        }
        return staticTextSelectionParams.copy(layoutCoordinates, textLayoutResult);
    }

    public final androidx.compose.foundation.text.modifiers.StaticTextSelectionParams copy(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        return new androidx.compose.foundation.text.modifiers.StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }
}
