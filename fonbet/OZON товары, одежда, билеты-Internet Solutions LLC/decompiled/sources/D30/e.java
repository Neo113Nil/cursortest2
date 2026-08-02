package D30;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f5778a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f5779b;

    public e(String str, Integer num) {
        this.f5778a = str;
        this.f5779b = num;
    }

    public final String a() {
        return this.f5778a;
    }

    public final Integer b() {
        return this.f5779b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f5778a, eVar.f5778a) && Intrinsics.d(this.f5779b, eVar.f5779b);
    }

    public final int hashCode() {
        String str = this.f5778a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5779b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ThrottleStatus(lockedUntil=" + this.f5778a + ", loginMistakeLimit=" + this.f5779b + ")";
    }
}
