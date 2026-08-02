package K1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final y f15101c = new y();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15102a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15103b;

    public y(int i11) {
        this.f15102a = false;
        this.f15103b = 0;
    }

    public final int b() {
        return this.f15103b;
    }

    public final boolean c() {
        return this.f15102a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f15102a != yVar.f15102a) {
            return false;
        }
        return this.f15103b == yVar.f15103b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15103b) + (Boolean.hashCode(this.f15102a) * 31);
    }

    @NotNull
    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f15102a + ", emojiSupportMatch=" + ((Object) C3427g.b(this.f15103b)) + ')';
    }

    public y(int i11, boolean z11) {
        this.f15102a = z11;
        this.f15103b = i11;
    }

    public y() {
        this(0, false);
    }
}
