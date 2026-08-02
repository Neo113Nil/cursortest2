package Q6;

import C.o0;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f23008a;

    private c(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f23008a = str;
    }

    public static c b(@NonNull String str) {
        return new c(str);
    }

    public final String a() {
        return this.f23008a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f23008a.equals(((c) obj).f23008a);
    }

    public final int hashCode() {
        return this.f23008a.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        return o0.c(new StringBuilder("Encoding{name=\""), this.f23008a, "\"}");
    }
}
