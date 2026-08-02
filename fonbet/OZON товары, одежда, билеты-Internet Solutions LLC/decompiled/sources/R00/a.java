package R00;

import B0.C2454a;
import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f24210a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24211b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f24212c;

    public a(String str, int i11, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f24210a = str;
        this.f24211b = i11;
        this.f24212c = message;
    }

    public final int a() {
        return this.f24211b;
    }

    @NotNull
    public final String b() {
        return this.f24212c;
    }

    public final String c() {
        return this.f24210a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f24210a, aVar.f24210a) && this.f24211b == aVar.f24211b && Intrinsics.d(this.f24212c, aVar.f24212c);
    }

    public final int hashCode() {
        String str = this.f24210a;
        return this.f24212c.hashCode() + C2454a.a(this.f24211b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpIncident(traceId=");
        sb2.append(this.f24210a);
        sb2.append(", code=");
        sb2.append(this.f24211b);
        sb2.append(", message=");
        return o0.c(sb2, this.f24212c, ")");
    }
}
