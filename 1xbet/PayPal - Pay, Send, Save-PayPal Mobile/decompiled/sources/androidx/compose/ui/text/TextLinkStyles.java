package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/TextLinkStyles;", "", "Landroidx/compose/ui/text/SpanStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/text/SpanStyle;", "getStyle", "()Landroidx/compose/ui/text/SpanStyle;", "getFocusedStyle", "getHoveredStyle", "getPressedStyle"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLinkStyles {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.SpanStyle focusedStyle;
    private final androidx.compose.ui.text.SpanStyle hoveredStyle;
    private final androidx.compose.ui.text.SpanStyle pressedStyle;
    private final androidx.compose.ui.text.SpanStyle style;

    public TextLinkStyles(androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.SpanStyle spanStyle2, androidx.compose.ui.text.SpanStyle spanStyle3, androidx.compose.ui.text.SpanStyle spanStyle4) {
        this.style = spanStyle;
        this.focusedStyle = spanStyle2;
        this.hoveredStyle = spanStyle3;
        this.pressedStyle = spanStyle4;
    }

    public /* synthetic */ TextLinkStyles(androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.SpanStyle spanStyle2, androidx.compose.ui.text.SpanStyle spanStyle3, androidx.compose.ui.text.SpanStyle spanStyle4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : spanStyle, (i & 2) != 0 ? null : spanStyle2, (i & 4) != 0 ? null : spanStyle3, (i & 8) != 0 ? null : spanStyle4);
    }

    public final androidx.compose.ui.text.SpanStyle getStyle() {
        return this.style;
    }

    public final androidx.compose.ui.text.SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    public final androidx.compose.ui.text.SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    public final androidx.compose.ui.text.SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.ui.text.TextLinkStyles)) {
            return false;
        }
        androidx.compose.ui.text.TextLinkStyles textLinkStyles = (androidx.compose.ui.text.TextLinkStyles) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.style, textLinkStyles.style) && kotlin.jvm.internal.Intrinsics.areEqual(this.focusedStyle, textLinkStyles.focusedStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.hoveredStyle, textLinkStyles.hoveredStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.pressedStyle, textLinkStyles.pressedStyle);
    }

    public final int hashCode() {
        androidx.compose.ui.text.SpanStyle spanStyle = this.style;
        int hashCode = spanStyle != null ? spanStyle.hashCode() : 0;
        androidx.compose.ui.text.SpanStyle spanStyle2 = this.focusedStyle;
        int hashCode2 = spanStyle2 != null ? spanStyle2.hashCode() : 0;
        androidx.compose.ui.text.SpanStyle spanStyle3 = this.hoveredStyle;
        int hashCode3 = spanStyle3 != null ? spanStyle3.hashCode() : 0;
        androidx.compose.ui.text.SpanStyle spanStyle4 = this.pressedStyle;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (spanStyle4 != null ? spanStyle4.hashCode() : 0);
    }

    public TextLinkStyles() {
        this(null, null, null, null, 15, null);
    }
}
