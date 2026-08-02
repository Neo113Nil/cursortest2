package Fc0;

import W.C4852x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d f9354d;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9355a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9356b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4852x f9357c;

    static {
        C4852x HD = C4852x.f33148b;
        Intrinsics.checkNotNullExpressionValue(HD, "HD");
        f9354d = new d(false, 5000L, HD);
    }

    public d(boolean z11, long j11, @NotNull C4852x videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        this.f9355a = z11;
        this.f9356b = j11;
        this.f9357c = videoQuality;
    }

    public final long b() {
        return this.f9356b;
    }

    public final boolean c() {
        return this.f9355a;
    }

    @NotNull
    public final C4852x d() {
        return this.f9357c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9355a == dVar.f9355a && this.f9356b == dVar.f9356b && Intrinsics.d(this.f9357c, dVar.f9357c);
    }

    public final int hashCode() {
        return this.f9357c.hashCode() + Pk0.c.a(Boolean.hashCode(this.f9355a) * 31, 31, this.f9356b);
    }

    @NotNull
    public final String toString() {
        return "CameraVideoOptions(videoEnabled=" + this.f9355a + ", videoChunkDurationMs=" + this.f9356b + ", videoQuality=" + this.f9357c + ")";
    }
}
