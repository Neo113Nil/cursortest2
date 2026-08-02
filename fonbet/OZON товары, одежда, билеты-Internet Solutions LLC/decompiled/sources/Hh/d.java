package Hh;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f10991a = new LinkedHashMap();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f10992a;

        /* renamed from: b, reason: collision with root package name */
        private int f10993b;

        public a() {
            this(0);
        }

        public final long a() {
            return this.f10992a;
        }

        public final int b() {
            return this.f10993b;
        }

        public final void c(long j11) {
            this.f10992a = j11;
        }

        public final void d(int i11) {
            this.f10993b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10992a == aVar.f10992a && this.f10993b == aVar.f10993b;
        }

        public final int hashCode() {
            return (Long.hashCode(this.f10992a) * 31) + this.f10993b;
        }

        @NotNull
        public final String toString() {
            StringBuilder b11 = Ql.c.b(this.f10992a, "HolderImpact(totalHitchTime=", this.f10993b, ", totalMeasurements=");
            b11.append(")");
            return b11.toString();
        }

        public a(int i11) {
            this.f10992a = 0L;
            this.f10993b = 0;
        }
    }

    public final void a(@NotNull HashSet widgetMetas, long j11) {
        Intrinsics.checkNotNullParameter(widgetMetas, "widgetMetas");
        Iterator it = widgetMetas.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            LinkedHashMap linkedHashMap = this.f10991a;
            String a11 = fVar.a();
            Object obj = linkedHashMap.get(a11);
            if (obj == null) {
                obj = new a(0);
                linkedHashMap.put(a11, obj);
            }
            a aVar = (a) obj;
            aVar.c(aVar.a() + j11);
            aVar.d(aVar.b() + 1);
        }
    }

    public final Long b(@NotNull String holderName) {
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        a aVar = (a) this.f10991a.get(holderName);
        if (aVar == null) {
            return null;
        }
        return Long.valueOf(aVar.a() / aVar.b());
    }
}
