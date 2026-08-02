package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class W1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f40755a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f40756b;

    public W1(@NotNull String str, Object obj) {
        this.f40755a = str;
        this.f40756b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1)) {
            return false;
        }
        W1 w12 = (W1) obj;
        return Intrinsics.d(this.f40755a, w12.f40755a) && Intrinsics.d(this.f40756b, w12.f40756b);
    }

    public final int hashCode() {
        int hashCode = this.f40755a.hashCode() * 31;
        Object obj = this.f40756b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ValueElement(name=" + this.f40755a + ", value=" + this.f40756b + ')';
    }
}
