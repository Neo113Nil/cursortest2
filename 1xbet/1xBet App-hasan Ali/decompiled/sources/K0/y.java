package K0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2880a;

    public y() {
        this.f2880a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f2880a == ((y) obj).f2880a;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2880a ? 1231 : 1237) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f2880a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public y(boolean z3) {
        this.f2880a = z3;
    }
}
