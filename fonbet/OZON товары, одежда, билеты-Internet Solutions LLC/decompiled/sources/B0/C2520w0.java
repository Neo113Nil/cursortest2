package B0;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;
import v1.C10179d;

/* renamed from: B0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2520w0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f1996a;

    public final Integer a(@NotNull KeyEvent keyEvent) {
        int c11 = C10179d.c(keyEvent);
        if ((Integer.MIN_VALUE & c11) != 0) {
            this.f1996a = Integer.valueOf(c11 & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f1996a;
        if (num == null) {
            return Integer.valueOf(c11);
        }
        this.f1996a = null;
        int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), c11);
        Integer valueOf = deadChar != 0 ? Integer.valueOf(deadChar) : null;
        return valueOf == null ? Integer.valueOf(c11) : valueOf;
    }
}
