package S00;

import a10.C4919g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final a f25608f = new a("", -1, -1, (ArrayList) null, 24);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25609a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25610b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25611c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Collection<c> f25612d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4919g f25613e;

    public a(@NotNull String uuid, long j11, long j12, @NotNull Collection<c> decodingTraces, @NotNull C4919g redirectMetrics) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(decodingTraces, "decodingTraces");
        Intrinsics.checkNotNullParameter(redirectMetrics, "redirectMetrics");
        this.f25609a = uuid;
        this.f25610b = j11;
        this.f25611c = j12;
        this.f25612d = decodingTraces;
        this.f25613e = redirectMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(a aVar, long j11, ArrayList arrayList, C4919g c4919g, int i11) {
        String uuid = aVar.f25609a;
        if ((i11 & 2) != 0) {
            j11 = aVar.f25610b;
        }
        long j12 = j11;
        long j13 = aVar.f25611c;
        Collection collection = arrayList;
        if ((i11 & 8) != 0) {
            collection = aVar.f25612d;
        }
        Collection decodingTraces = collection;
        if ((i11 & 16) != 0) {
            c4919g = aVar.f25613e;
        }
        C4919g redirectMetrics = c4919g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(decodingTraces, "decodingTraces");
        Intrinsics.checkNotNullParameter(redirectMetrics, "redirectMetrics");
        return new a(uuid, j12, j13, (Collection<c>) decodingTraces, redirectMetrics);
    }

    public final long c() {
        return this.f25610b;
    }

    @NotNull
    public final Collection<c> d() {
        return this.f25612d;
    }

    @NotNull
    public final C4919g e() {
        return this.f25613e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f25609a, aVar.f25609a) && this.f25610b == aVar.f25610b && this.f25611c == aVar.f25611c && Intrinsics.d(this.f25612d, aVar.f25612d) && Intrinsics.d(this.f25613e, aVar.f25613e);
    }

    @NotNull
    public final String f() {
        return this.f25609a;
    }

    public final int hashCode() {
        return this.f25613e.hashCode() + ((this.f25612d.hashCode() + Pk0.c.a(Pk0.c.a(this.f25609a.hashCode() * 31, 31, this.f25610b), 31, this.f25611c)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PageMetrics(uuid=" + this.f25609a + ", decodingTimeStart=" + this.f25610b + ", decodingTimeEnd=" + this.f25611c + ", decodingTraces=" + this.f25612d + ", redirectMetrics=" + this.f25613e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, long j11, long j12, ArrayList arrayList, int i11) {
        this(str, j11, j12, r14, r7);
        C4919g c4919g;
        List list = (i11 & 8) != 0 ? K.f71697a : arrayList;
        c4919g = C4919g.f36200c;
    }
}
