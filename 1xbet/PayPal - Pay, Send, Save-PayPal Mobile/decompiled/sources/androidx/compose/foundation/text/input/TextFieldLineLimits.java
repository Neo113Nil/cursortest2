package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "", "Companion", "SingleLine", "MultiLine", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextFieldLineLimits {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.input.TextFieldLineLimits.Companion INSTANCE = androidx.compose.foundation.text.input.TextFieldLineLimits.Companion.getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SingleLine implements androidx.compose.foundation.text.input.TextFieldLineLimits {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine INSTANCE = new androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine();

        private SingleLine() {
        }

        public final java.lang.String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "", "minHeightInLines", "maxHeightInLines", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getMinHeightInLines", "getMaxHeightInLines"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MultiLine implements androidx.compose.foundation.text.input.TextFieldLineLimits {
        public static final int $stable = 0;
        private final int maxHeightInLines;
        private final int minHeightInLines;

        public MultiLine(int i, int i2) {
            this.minHeightInLines = i;
            this.maxHeightInLines = i2;
            if (i <= 0 || i > i2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
        }

        public /* synthetic */ MultiLine(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
        }

        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiLine(minHeightInLines=");
            sb.append(this.minHeightInLines);
            sb.append(", maxHeightInLines=");
            sb.append(this.maxHeightInLines);
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || getClass() != other.getClass()) {
                return false;
            }
            androidx.compose.foundation.text.input.TextFieldLineLimits.MultiLine multiLine = (androidx.compose.foundation.text.input.TextFieldLineLimits.MultiLine) other;
            return this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines;
        }

        public final int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MultiLine() {
            this(r2, r2, 3, null);
            int i = 0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "Default", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "getDefault", "()Landroidx/compose/foundation/text/input/TextFieldLineLimits;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static final androidx.compose.foundation.text.input.TextFieldLineLimits Default;
        static final /* synthetic */ androidx.compose.foundation.text.input.TextFieldLineLimits.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.input.TextFieldLineLimits.Companion();

        private Companion() {
        }

        static {
            int i = 0;
            Default = new androidx.compose.foundation.text.input.TextFieldLineLimits.MultiLine(i, i, 3, null);
        }

        public final androidx.compose.foundation.text.input.TextFieldLineLimits getDefault() {
            return Default;
        }
    }
}
