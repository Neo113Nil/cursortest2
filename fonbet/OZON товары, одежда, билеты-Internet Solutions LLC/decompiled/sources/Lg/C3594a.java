package Lg;

import G.g;
import Pk0.c;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Lg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3594a {

    /* renamed from: a, reason: collision with root package name */
    private final long f17078a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f17079b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17080c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f17081d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f17082e;

    public C3594a(long j11, long j12, @NotNull String name, @NotNull String unit, @NotNull Map attributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f17078a = j11;
        this.f17079b = name;
        this.f17080c = j12;
        this.f17081d = unit;
        this.f17082e = attributes;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>] */
    @NotNull
    public final Map<String, Object> a() {
        return this.f17082e;
    }

    @NotNull
    public final String b() {
        return this.f17079b;
    }

    public final long c() {
        return this.f17078a;
    }

    @NotNull
    public final String d() {
        return this.f17081d;
    }

    public final long e() {
        return this.f17080c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3594a)) {
            return false;
        }
        C3594a c3594a = (C3594a) obj;
        return this.f17078a == c3594a.f17078a && Intrinsics.d(this.f17079b, c3594a.f17079b) && this.f17080c == c3594a.f17080c && this.f17081d.equals(c3594a.f17081d) && this.f17082e.equals(c3594a.f17082e);
    }

    public final int hashCode() {
        return this.f17082e.hashCode() + g.a(c.a(g.a(Long.hashCode(this.f17078a) * 31, 31, this.f17079b), 31, this.f17080c), 31, this.f17081d);
    }

    @NotNull
    public final String toString() {
        return "PerfSampleLite(timeUnixNano=" + this.f17078a + ", name=" + this.f17079b + ", value=" + this.f17080c + ", unit=" + this.f17081d + ", attributes=" + this.f17082e + ')';
    }
}
