package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "copy", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "", "getShouldClip", "()Z", "shouldClip", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "Empty", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "getEmpty", "()Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.text.modifiers.StaticTextSelectionParams getEmpty() {
            return androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.Empty;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
        return (textLayoutResult == null || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()) || !textLayoutResult.getHasVisualOverflow()) ? false : true;
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
