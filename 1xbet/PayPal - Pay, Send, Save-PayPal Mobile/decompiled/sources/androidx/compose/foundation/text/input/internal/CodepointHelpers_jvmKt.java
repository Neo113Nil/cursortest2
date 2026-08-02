package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0004"}, d2 = {"", "", "index", "codePointAt", "(Ljava/lang/CharSequence;I)I", "codePoint", "charCount", "(I)I", "codePointBefore"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CodepointHelpers_jvmKt {
    public static final int codePointAt(java.lang.CharSequence charSequence, int i) {
        return java.lang.Character.codePointAt(charSequence, i);
    }

    public static final int charCount(int i) {
        return java.lang.Character.charCount(i);
    }

    public static final int codePointBefore(java.lang.CharSequence charSequence, int i) {
        return java.lang.Character.codePointBefore(charSequence, i);
    }
}
