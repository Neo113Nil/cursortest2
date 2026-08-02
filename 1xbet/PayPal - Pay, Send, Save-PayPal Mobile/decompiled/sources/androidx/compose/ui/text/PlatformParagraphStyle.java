package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\tB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "", "includeFontPadding", "<init>", "(Z)V", "Landroidx/compose/ui/text/EmojiSupportMatch;", "emojiSupportMatch", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "()V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "merge", "(Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformParagraphStyle;", "Z", "getIncludeFontPadding", "()Z", "getIncludeFontPadding$annotations", com.visa.cbp.getEncExpo.warmup, "getEmojiSupportMatch-_3YsG6Y", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.PlatformParagraphStyle.Companion INSTANCE = new androidx.compose.ui.text.PlatformParagraphStyle.Companion(null);
    private static final androidx.compose.ui.text.PlatformParagraphStyle Default = new androidx.compose.ui.text.PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public final androidx.compose.ui.text.PlatformParagraphStyle merge(androidx.compose.ui.text.PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "Default", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.PlatformParagraphStyle getDefault() {
            return androidx.compose.ui.text.PlatformParagraphStyle.Default;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name and from getter */
    public final int getEmojiSupportMatch() {
        return this.emojiSupportMatch;
    }

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = androidx.compose.ui.text.EmojiSupportMatch.INSTANCE.m7872getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? androidx.compose.ui.text.EmojiSupportMatch.INSTANCE.m7872getDefault_3YsG6Y() : i, (i2 & 2) != 0 ? false : z, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private PlatformParagraphStyle(int i, boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = i;
    }

    private PlatformParagraphStyle(int i) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i;
    }

    public /* synthetic */ PlatformParagraphStyle(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? androidx.compose.ui.text.EmojiSupportMatch.INSTANCE.m7872getDefault_3YsG6Y() : i, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public PlatformParagraphStyle() {
        this(androidx.compose.ui.text.EmojiSupportMatch.INSTANCE.m7872getDefault_3YsG6Y(), false, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.PlatformParagraphStyle)) {
            return false;
        }
        androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle = (androidx.compose.ui.text.PlatformParagraphStyle) other;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && androidx.compose.ui.text.EmojiSupportMatch.m7867equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.includeFontPadding) * 31) + androidx.compose.ui.text.EmojiSupportMatch.m7868hashCodeimpl(this.emojiSupportMatch);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlatformParagraphStyle(includeFontPadding=");
        sb.append(this.includeFontPadding);
        sb.append(", emojiSupportMatch=");
        sb.append((java.lang.Object) androidx.compose.ui.text.EmojiSupportMatch.m7869toStringimpl(this.emojiSupportMatch));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public /* synthetic */ PlatformParagraphStyle(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
