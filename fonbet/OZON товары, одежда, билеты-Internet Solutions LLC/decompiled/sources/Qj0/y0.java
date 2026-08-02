package Qj0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class y0 extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    private final int f23761a;

    public y0(int i11) {
        super(0);
        this.f23761a = i11;
    }

    public final int a() {
        return this.f23761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && this.f23761a == ((y0) obj).f23761a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23761a);
    }

    @NotNull
    public final String toString() {
        return K00.b.e(this.f23761a, ")", new StringBuilder("VideoIndex(videoIndex="));
    }
}
