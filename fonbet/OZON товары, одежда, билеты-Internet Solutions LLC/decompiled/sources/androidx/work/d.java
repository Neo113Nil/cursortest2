package androidx.work;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final d f45268i = new d(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f45269a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45270b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45271c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f45272d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f45273e;

    /* renamed from: f, reason: collision with root package name */
    private final long f45274f;

    /* renamed from: g, reason: collision with root package name */
    private final long f45275g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Set<b> f45276h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private p f45277a = p.NOT_REQUIRED;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private LinkedHashSet f45278b = new LinkedHashSet();

        @NotNull
        public final d a() {
            return new d(this.f45277a, false, false, false, false, -1L, -1L, C7714v.Y0(this.f45278b));
        }

        @NotNull
        public final void b(@NotNull p networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.f45277a = networkType;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f45279a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f45280b;

        public b(@NotNull Uri uri, boolean z11) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f45279a = uri;
            this.f45280b = z11;
        }

        @NotNull
        public final Uri a() {
            return this.f45279a;
        }

        public final boolean b() {
            return this.f45280b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            b bVar = (b) obj;
            return Intrinsics.d(this.f45279a, bVar.f45279a) && this.f45280b == bVar.f45280b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f45280b) + (this.f45279a.hashCode() * 31);
        }
    }

    public d() {
        this(0);
    }

    public final long a() {
        return this.f45275g;
    }

    public final long b() {
        return this.f45274f;
    }

    @NotNull
    public final Set<b> c() {
        return this.f45276h;
    }

    @NotNull
    public final p d() {
        return this.f45269a;
    }

    public final boolean e() {
        return !this.f45276h.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f45270b == dVar.f45270b && this.f45271c == dVar.f45271c && this.f45272d == dVar.f45272d && this.f45273e == dVar.f45273e && this.f45274f == dVar.f45274f && this.f45275g == dVar.f45275g && this.f45269a == dVar.f45269a) {
            return Intrinsics.d(this.f45276h, dVar.f45276h);
        }
        return false;
    }

    public final boolean f() {
        return this.f45272d;
    }

    public final boolean g() {
        return this.f45270b;
    }

    public final boolean h() {
        return this.f45271c;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f45269a.hashCode() * 31) + (this.f45270b ? 1 : 0)) * 31) + (this.f45271c ? 1 : 0)) * 31) + (this.f45272d ? 1 : 0)) * 31) + (this.f45273e ? 1 : 0)) * 31;
        long j11 = this.f45274f;
        int i11 = (hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f45275g;
        return this.f45276h.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31);
    }

    public final boolean i() {
        return this.f45273e;
    }

    public d(@NotNull p requiredNetworkType, boolean z11, boolean z12, boolean z13, boolean z14, long j11, long j12, @NotNull Set<b> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f45269a = requiredNetworkType;
        this.f45270b = z11;
        this.f45271c = z12;
        this.f45272d = z13;
        this.f45273e = z14;
        this.f45274f = j11;
        this.f45275g = j12;
        this.f45276h = contentUriTriggers;
    }

    public d(int i11) {
        this(p.NOT_REQUIRED, false, false, false, false, -1L, -1L, M.f71699a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(@NotNull d other) {
        this(other.f45269a, r3, r4, other.f45272d, other.f45273e, other.f45274f, other.f45275g, other.f45276h);
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z11 = other.f45270b;
        boolean z12 = other.f45271c;
    }
}
