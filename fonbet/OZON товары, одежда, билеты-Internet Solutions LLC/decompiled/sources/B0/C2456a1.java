package B0;

import org.jetbrains.annotations.NotNull;

/* renamed from: B0.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2456a1 {
    public static final int a(int i11, @NotNull CharSequence charSequence) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    public static final int b(int i11, @NotNull CharSequence charSequence) {
        while (i11 > 0) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
            i11--;
        }
        return 0;
    }
}
