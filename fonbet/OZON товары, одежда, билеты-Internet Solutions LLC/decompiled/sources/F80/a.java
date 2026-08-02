package F80;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f9147a = new a();

    /* renamed from: F80.a$a, reason: collision with other inner class name */
    public static final class C0193a {
        @NotNull
        public static a a() {
            return a.f9147a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(false) * 31);
    }

    @NotNull
    public final String toString() {
        return "FinPikazonConfig(isEnabledPikazon=false, defaultImage=0)";
    }
}
