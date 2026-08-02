package Ej0;

import P4.f;
import Y1.b;
import kotlin.random.c;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final String a(int i11) {
        return l.t(new b(i11).a(), " ");
    }

    public static final int b() {
        return c.INSTANCE.f(1, 100);
    }

    public static final long c() {
        return c.INSTANCE.h(1L, 100L);
    }

    @NotNull
    public static final String d() {
        return String.valueOf(c.INSTANCE.f(1, 100));
    }

    @NotNull
    public static final String e() {
        return f.b("toString(...)");
    }
}
