package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/SingleLineCodepointTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "<init>", "()V", "", "codepointIndex", "codepoint", "transform", "(II)I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleLineCodepointTransformation implements androidx.compose.foundation.text.input.internal.CodepointTransformation {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation INSTANCE = new androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation();

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int codepointIndex, int codepoint) {
        if (codepoint == 10) {
            return 32;
        }
        if (codepoint == 13) {
            return 65279;
        }
        return codepoint;
    }

    private SingleLineCodepointTransformation() {
    }

    public final java.lang.String toString() {
        return "SingleLineCodepointTransformation";
    }
}
