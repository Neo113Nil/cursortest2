package Ec0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7828a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7829b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7830c;

    public a(int i11, String str, boolean z11) {
        Intrinsics.checkNotNullParameter("MEDIA_MUXER", "tag");
        this.f7828a = z11;
        this.f7829b = str;
        this.f7830c = i11;
    }

    public final boolean a() {
        return this.f7828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f7828a == aVar.f7828a && Intrinsics.d(this.f7829b, aVar.f7829b) && this.f7830c == aVar.f7830c;
    }

    public final int hashCode() {
        int a11 = C3532b.a(653329438, 31, this.f7828a);
        String str = this.f7829b;
        return Integer.hashCode(this.f7830c) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConcatenateResult(tag=MEDIA_MUXER, succes=");
        sb2.append(this.f7828a);
        sb2.append(", errorDesc=");
        sb2.append(this.f7829b);
        sb2.append(", combinedDuration=");
        return K00.b.e(this.f7830c, ")", sb2);
    }
}
