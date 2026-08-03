package androidx.compose.foundation.text2.input;

/* compiled from: TextFieldLineLimits.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "MultiLine", "SingleLine", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits$SingleLine;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextFieldLineLimits {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text2.input.TextFieldLineLimits.Companion INSTANCE = androidx.compose.foundation.text2.input.TextFieldLineLimits.Companion.$$INSTANCE;

    /* compiled from: TextFieldLineLimits.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits$SingleLine;", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SingleLine implements androidx.compose.foundation.text2.input.TextFieldLineLimits {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine INSTANCE = new androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine();

        private SingleLine() {
        }
    }

    /* compiled from: TextFieldLineLimits.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "minHeightInLines", "", "maxHeightInLines", "(II)V", "getMaxHeightInLines", "()I", "getMinHeightInLines", "equals", "", "other", "", "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MultiLine implements androidx.compose.foundation.text2.input.TextFieldLineLimits {
        public static final int $stable = 0;
        private final int maxHeightInLines;
        private final int minHeightInLines;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MultiLine() {
            this(r2, r2, 3, null);
            int i = 0;
        }

        public MultiLine(int i, int i2) {
            this.minHeightInLines = i;
            this.maxHeightInLines = i2;
            if (1 > i || i > i2) {
                throw new java.lang.IllegalArgumentException(("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i + ", " + i2).toString());
            }
        }

        public /* synthetic */ MultiLine(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
        }

        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        public java.lang.String toString() {
            return "MultiLine(minHeightInLines=" + this.minHeightInLines + ", maxHeightInLines=" + this.maxHeightInLines + ')';
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || getClass() != other.getClass()) {
                return false;
            }
            androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine multiLine = (androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine) other;
            return this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines;
        }

        public int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }
    }

    /* compiled from: TextFieldLineLimits.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldLineLimits$Companion;", "", "()V", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "getDefault", "()Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.text2.input.TextFieldLineLimits.Companion $$INSTANCE = new androidx.compose.foundation.text2.input.TextFieldLineLimits.Companion();
        private static final androidx.compose.foundation.text2.input.TextFieldLineLimits Default;

        private Companion() {
        }

        static {
            int i = 0;
            Default = new androidx.compose.foundation.text2.input.TextFieldLineLimits.MultiLine(i, i, 3, null);
        }

        public final androidx.compose.foundation.text2.input.TextFieldLineLimits getDefault() {
            return Default;
        }
    }
}
