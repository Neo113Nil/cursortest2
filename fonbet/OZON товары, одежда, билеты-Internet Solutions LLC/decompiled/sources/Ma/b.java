package Ma;

import G.g;
import Ja.h;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f17770a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17771b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f17772c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17773d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f17774e;

    /* renamed from: f, reason: collision with root package name */
    private final long f17775f;

    /* renamed from: g, reason: collision with root package name */
    private final long f17776g;

    /* renamed from: h, reason: collision with root package name */
    private final long f17777h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f17778i;

    /* renamed from: j, reason: collision with root package name */
    private final h f17779j;

    /* renamed from: k, reason: collision with root package name */
    private final String f17780k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Ma.a f17781l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CRONET;
        public static final a OKHTTP;

        static {
            a aVar = new a("OKHTTP", 0);
            OKHTTP = aVar;
            a aVar2 = new a("CRONET", 1);
            CRONET = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public b(@NotNull a source, boolean z11, @NotNull String tlsVersion, boolean z12, @NotNull String proxy, long j11, long j12, long j13, boolean z13, h hVar, String str, @NotNull Ma.a metricsTiming) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(metricsTiming, "metricsTiming");
        this.f17770a = source;
        this.f17771b = z11;
        this.f17772c = tlsVersion;
        this.f17773d = z12;
        this.f17774e = proxy;
        this.f17775f = j11;
        this.f17776g = j12;
        this.f17777h = j13;
        this.f17778i = z13;
        this.f17779j = hVar;
        this.f17780k = str;
        this.f17781l = metricsTiming;
    }

    @NotNull
    public final Ma.a a() {
        return this.f17781l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17770a == bVar.f17770a && this.f17771b == bVar.f17771b && Intrinsics.d(this.f17772c, bVar.f17772c) && this.f17773d == bVar.f17773d && Intrinsics.d(this.f17774e, bVar.f17774e) && this.f17775f == bVar.f17775f && this.f17776g == bVar.f17776g && this.f17777h == bVar.f17777h && this.f17778i == bVar.f17778i && this.f17779j == bVar.f17779j && Intrinsics.d(this.f17780k, bVar.f17780k) && Intrinsics.d(this.f17781l, bVar.f17781l);
    }

    public final int hashCode() {
        int a11 = C3532b.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(g.a(C3532b.a(g.a(C3532b.a(this.f17770a.hashCode() * 31, 31, this.f17771b), 31, this.f17772c), 31, this.f17773d), 31, this.f17774e), 31, this.f17775f), 31, this.f17776g), 31, this.f17777h), 31, this.f17778i);
        h hVar = this.f17779j;
        int hashCode = (a11 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.f17780k;
        return this.f17781l.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "HttpMetrics(source=" + this.f17770a + ", socketReused=" + this.f17771b + ", tlsVersion=" + this.f17772c + ", isProxy=" + this.f17773d + ", proxy=" + this.f17774e + ", totalTimeMs=" + this.f17775f + ", requestStartupTimestamp=" + this.f17776g + ", requestStartTime=" + this.f17777h + ", isFailed=" + this.f17778i + ", protocol=" + this.f17779j + ", failReason=" + this.f17780k + ", metricsTiming=" + this.f17781l + ")";
    }
}
