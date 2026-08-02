package I1;

import B4.V;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f11693a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f11694b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11695c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull Function0<Float> function0, @NotNull Function0<Float> function02, boolean z11) {
        this.f11693a = (AbstractC7737t) function0;
        this.f11694b = (AbstractC7737t) function02;
        this.f11695c = z11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<java.lang.Float>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function0<Float> a() {
        return this.f11694b;
    }

    public final boolean b() {
        return this.f11695c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<java.lang.Float>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function0<Float> c() {
        return this.f11693a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(((Number) this.f11693a.invoke()).floatValue());
        sb2.append(", maxValue=");
        sb2.append(((Number) this.f11694b.invoke()).floatValue());
        sb2.append(", reverseScrolling=");
        return V.d(sb2, this.f11695c, ')');
    }
}
