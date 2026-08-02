package Pa;

import org.jetbrains.annotations.NotNull;

/* renamed from: Pa.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3819a {

    /* renamed from: a, reason: collision with root package name */
    private final long f22112a;

    /* renamed from: b, reason: collision with root package name */
    private int f22113b = 1;

    /* renamed from: c, reason: collision with root package name */
    private long f22114c;

    public C3819a(long j11) {
        this.f22112a = j11;
    }

    public final boolean a() {
        return this.f22114c >= this.f22112a;
    }

    @NotNull
    public final Long b() {
        long min = Math.min(2000 * this.f22113b, this.f22112a - this.f22114c);
        this.f22113b *= 2;
        this.f22114c += min;
        return Long.valueOf(min);
    }
}
