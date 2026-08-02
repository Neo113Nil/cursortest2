package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "Landroidx/compose/ui/graphics/Color;", "handleColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getHandleColor-0d7_KjU", "()J", "getBackgroundColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    private TextSelectionColors(long j, long j2) {
        this.handleColor = j;
        this.backgroundColor = j2;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getHandleColor() {
        return this.handleColor;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.selection.TextSelectionColors)) {
            return false;
        }
        androidx.compose.foundation.text.selection.TextSelectionColors textSelectionColors = (androidx.compose.foundation.text.selection.TextSelectionColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.handleColor, textSelectionColors.handleColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    public final int hashCode() {
        return (androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.handleColor) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.backgroundColor);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionColors(selectionHandleColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.handleColor));
        sb.append(", selectionBackgroundColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.backgroundColor));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TextSelectionColors(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
