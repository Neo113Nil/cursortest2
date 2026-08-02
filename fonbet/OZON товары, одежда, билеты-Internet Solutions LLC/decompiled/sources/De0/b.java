package De0;

import G.g;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f6676a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f6677b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6678c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6679d;

    public b(@NotNull String url, @NotNull byte[] file, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f6676a = url;
        this.f6677b = file;
        this.f6678c = j11;
        this.f6679d = z11;
    }

    public static b a(b bVar, long j11) {
        String url = bVar.f6676a;
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] file = bVar.f6677b;
        Intrinsics.checkNotNullParameter(file, "file");
        return new b(url, file, j11, bVar.f6679d);
    }

    @NotNull
    public final byte[] b() {
        return this.f6677b;
    }

    @NotNull
    public final String c() {
        return new String(this.f6677b, Charsets.UTF_8);
    }

    public final long d() {
        return this.f6678c;
    }

    @NotNull
    public final String e() {
        return this.f6676a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.mapsdk.common.storage.cache.impl.data.CachedStyleFile");
        b bVar = (b) obj;
        return this.f6678c == bVar.f6678c && Intrinsics.d(this.f6676a, bVar.f6676a) && Arrays.equals(this.f6677b, bVar.f6677b);
    }

    public final boolean f() {
        return this.f6679d;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6677b) + g.a(Long.hashCode(this.f6678c) * 31, 31, this.f6676a);
    }

    @NotNull
    public final String toString() {
        String arrays = Arrays.toString(this.f6677b);
        StringBuilder sb2 = new StringBuilder("CachedStyleFile(url=");
        Nh.a.h(sb2, this.f6676a, ", file=", arrays, ", lastUseUnixTime=");
        sb2.append(this.f6678c);
        sb2.append(", isFallback=");
        return Pk0.a.a(")", sb2, this.f6679d);
    }
}
