package Cj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f5140a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f5141b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f5142c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull String data, Boolean bool, @NotNull Function1<? super String, Unit> onValueChanged) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        this.f5140a = data;
        this.f5141b = bool;
        this.f5142c = (AbstractC7737t) onValueChanged;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public static a a(a aVar, String data, Boolean bool) {
        ?? onValueChanged = aVar.f5142c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        return new a(data, bool, onValueChanged);
    }

    @NotNull
    public final String b() {
        return this.f5140a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<String, Unit> c() {
        return this.f5142c;
    }

    public final Boolean d() {
        return this.f5141b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f5140a, aVar.f5140a) && Intrinsics.d(this.f5141b, aVar.f5141b) && Intrinsics.d(this.f5142c, aVar.f5142c);
    }

    public final int hashCode() {
        int hashCode = this.f5140a.hashCode() * 31;
        Boolean bool = this.f5141b;
        return this.f5142c.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "EditTraceVO(data=" + this.f5140a + ", isCorrect=" + this.f5141b + ", onValueChanged=" + this.f5142c + ")";
    }
}
