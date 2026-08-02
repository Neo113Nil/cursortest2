package Mc;

import T7.E;
import java.util.concurrent.TimeUnit;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f17825a;

    /* renamed from: b, reason: collision with root package name */
    final long f17826b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17827c;

    public b(T t2, long j11, TimeUnit timeUnit) {
        this.f17825a = t2;
        this.f17826b = j11;
        C9656b.c(timeUnit, "unit is null");
        this.f17827c = timeUnit;
    }

    public final long a() {
        return this.f17826b;
    }

    public final T b() {
        return this.f17825a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (C9656b.a(this.f17825a, bVar.f17825a) && this.f17826b == bVar.f17826b && C9656b.a(this.f17827c, bVar.f17827c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t2 = this.f17825a;
        int hashCode = t2 != null ? t2.hashCode() : 0;
        long j11 = this.f17826b;
        return this.f17827c.hashCode() + (((hashCode * 31) + ((int) (j11 ^ (j11 >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timed[time=");
        sb2.append(this.f17826b);
        sb2.append(", unit=");
        sb2.append(this.f17827c);
        sb2.append(", value=");
        return E.c(this.f17825a, "]", sb2);
    }
}
