package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class u {
    public char[] a;
    public int b;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i3, i * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    public final void b() {
        C1179c c1179c = C1179c.c;
        char[] array = this.a;
        c1179c.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (c1179c) {
            try {
                int i = c1179c.b;
                if (array.length + i < C1178b.a) {
                    c1179c.b = i + array.length;
                    c1179c.a.addLast(array);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        text.getChars(0, text.length(), this.a, this.b);
        this.b += length;
    }

    public final void d(long j) {
        c(String.valueOf(j));
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }
}
