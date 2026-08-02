package Wg;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f33846a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f33847b;

    public c(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f33846a = params.get("scrollWidgetKey");
        String str = params.get("maxSearchPages");
        this.f33847b = str != null ? h.w0(str) : null;
    }

    public final Integer a() {
        return this.f33847b;
    }

    public final String b() {
        return this.f33846a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f33846a, cVar.f33846a) && Intrinsics.d(this.f33847b, cVar.f33847b);
    }

    public final int hashCode() {
        String str = this.f33846a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f33847b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ScrollAdditionInfo(scrollWidgetKey=" + this.f33846a + ", maxSearchPages=" + this.f33847b + ")";
    }
}
