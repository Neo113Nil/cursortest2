package E0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b1 {
    public static final void a(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i11, int i12, int i13) {
        if (charSequence instanceof D0.a) {
            ((D0.a) charSequence).g(cArr, i11, i12, i13);
            return;
        }
        while (i12 < i13) {
            cArr[i11] = charSequence.charAt(i12);
            i12++;
            i11++;
        }
    }
}
