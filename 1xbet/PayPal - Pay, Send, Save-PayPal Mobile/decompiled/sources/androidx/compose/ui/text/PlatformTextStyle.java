package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "Landroidx/compose/ui/text/PlatformSpanStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "paragraphStyle", "<init>", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)V", "", "includeFontPadding", "(Z)V", "Landroidx/compose/ui/text/EmojiSupportMatch;", "emojiSupportMatch", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getSpanStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getParagraphStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformTextStyle {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.PlatformParagraphStyle paragraphStyle;
    private final androidx.compose.ui.text.PlatformSpanStyle spanStyle;

    public final androidx.compose.ui.text.PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public final androidx.compose.ui.text.PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public PlatformTextStyle(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public /* synthetic */ PlatformTextStyle(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public PlatformTextStyle(boolean z) {
        this((androidx.compose.ui.text.PlatformSpanStyle) null, new androidx.compose.ui.text.PlatformParagraphStyle(z));
    }

    private PlatformTextStyle(int i) {
        this((androidx.compose.ui.text.PlatformSpanStyle) null, new androidx.compose.ui.text.PlatformParagraphStyle(i, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public final int hashCode() {
        androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int hashCode = platformSpanStyle != null ? platformSpanStyle.hashCode() : 0;
        androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        return (hashCode * 31) + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.PlatformTextStyle)) {
            return false;
        }
        androidx.compose.ui.text.PlatformTextStyle platformTextStyle = (androidx.compose.ui.text.PlatformTextStyle) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paragraphStyle, platformTextStyle.paragraphStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.spanStyle, platformTextStyle.spanStyle);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlatformTextStyle(spanStyle=");
        sb.append(this.spanStyle);
        sb.append(", paragraphSyle=");
        sb.append(this.paragraphStyle);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PlatformTextStyle(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
