package com.chartboost.sdk.tracking;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.hh;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f5137a;
    public final String b;
    public final String c;
    public final String d;
    public final Mediation e;
    public final b f;
    public TrackAd g;
    public boolean h;
    public boolean i;
    public long j;
    public float k;
    public a l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b = new a("LOW", 0);
        public static final a c = new a("HIGH", 1);
        public static final /* synthetic */ a[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            a[] a2 = a();
            d = a2;
            e = EnumEntriesKt.enumEntries(a2);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b b = new b("INFO", 0);
        public static final b c = new b("CRITICAL", 1);
        public static final b d = new b("ERROR", 2);
        public static final /* synthetic */ b[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            b[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{b, c, d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    public /* synthetic */ f(g gVar, String str, String str2, String str3, Mediation mediation, b bVar, TrackAd trackAd, boolean z, boolean z2, long j, float f, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, str, str2, str3, mediation, bVar, trackAd, z, z2, j, f, aVar);
    }

    public final String a() {
        return this.c;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final String c() {
        return this.d;
    }

    public final Mediation d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public final g f() {
        return this.f5137a;
    }

    public final a g() {
        return this.l;
    }

    public final boolean h() {
        return this.i;
    }

    public final long i() {
        return this.j;
    }

    public final long j() {
        return hh.a(this.j);
    }

    public final TrackAd k() {
        return this.g;
    }

    public final b l() {
        return this.f;
    }

    public final boolean m() {
        return this.h;
    }

    public String toString() {
        return "TrackingEvent(name=" + this.f5137a.getValue() + ", message='" + this.b + "', impressionAdType='" + this.c + "', location='" + this.d + "', mediation=" + this.e + ", type=" + this.f + ", trackAd=" + this.g + ", isLatencyEvent=" + this.h + ", shouldCalculateLatency=" + this.i + ", timestamp=" + this.j + ", latency=" + this.k + ", priority=" + this.l + ", timestampInSeconds=" + j() + ")";
    }

    public f(g gVar, String str, String str2, String str3, Mediation mediation, b bVar, TrackAd trackAd, boolean z, boolean z2, long j, float f, a aVar) {
        this.f5137a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mediation;
        this.f = bVar;
        this.g = trackAd;
        this.h = z;
        this.i = z2;
        this.j = j;
        this.k = f;
        this.l = aVar;
    }

    public final void a(TrackAd trackAd) {
        this.g = trackAd;
    }

    public final float b() {
        return this.k;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(float f) {
        this.k = f;
    }

    public final void a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.l = aVar;
    }

    public /* synthetic */ f(g gVar, String str, String str2, String str3, Mediation mediation, b bVar, TrackAd trackAd, boolean z, boolean z2, long j, float f, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, str, str2, str3, mediation, bVar, (i & 64) != 0 ? new TrackAd(null, null, null, null, null, null, null, null, 255, null) : trackAd, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? System.currentTimeMillis() : j, (i & 1024) != 0 ? 0.0f : f, aVar, null);
    }
}
