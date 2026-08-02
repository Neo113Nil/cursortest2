package RZ;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f24902a;

    public c(String str) {
        this.f24902a = str;
    }

    public final String a() {
        return this.f24902a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f24902a, ((c) obj).f24902a);
    }

    public final int hashCode() {
        String str = this.f24902a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("TokenizedWidget(widgetToken="), this.f24902a, ")");
    }
}
