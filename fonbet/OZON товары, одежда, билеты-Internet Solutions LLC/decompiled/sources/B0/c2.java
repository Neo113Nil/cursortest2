package B0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f1693a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1694b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f1695c;

    /* JADX WARN: Multi-variable type inference failed */
    public c2(int i11, int i12, @NotNull Function0<Z1.m> function0) {
        this.f1693a = i11;
        this.f1694b = i12;
        this.f1695c = (AbstractC7737t) function0;
    }

    public final int a() {
        return this.f1694b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<Z1.m>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function0<Z1.m> b() {
        return this.f1695c;
    }

    public final int c() {
        return this.f1693a;
    }
}
