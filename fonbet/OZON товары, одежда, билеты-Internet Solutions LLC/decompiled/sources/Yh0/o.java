package Yh0;

import Xh0.a;
import g.C6594f;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface o {

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f35109a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1543697476;
        }

        @NotNull
        public final String toString() {
            return "NotStarted";
        }
    }

    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f35110a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -732887477;
        }

        @NotNull
        public final String toString() {
            return "Released";
        }
    }

    public static final class c implements o {

        /* renamed from: a, reason: collision with root package name */
        private final long f35111a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Yh0.b f35112b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final LinkedList f35113c;

        private c() {
            throw null;
        }

        public c(long j11, Yh0.b currentStep, LinkedList steps) {
            Intrinsics.checkNotNullParameter(currentStep, "currentStep");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.f35111a = j11;
            this.f35112b = currentStep;
            this.f35113c = steps;
        }

        public static c a(c cVar, Yh0.b currentStep) {
            long j11 = cVar.f35111a;
            LinkedList steps = cVar.f35113c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(currentStep, "currentStep");
            Intrinsics.checkNotNullParameter(steps, "steps");
            return new c(j11, currentStep, steps);
        }

        @NotNull
        public final Yh0.b b() {
            return this.f35112b;
        }

        public final long c() {
            return this.f35111a;
        }

        @NotNull
        public final List<a.b> d() {
            return this.f35113c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f35111a == cVar.f35111a && Intrinsics.d(this.f35112b, cVar.f35112b) && Intrinsics.d(this.f35113c, cVar.f35113c);
        }

        public final int hashCode() {
            return this.f35113c.hashCode() + ((this.f35112b.hashCode() + (Long.hashCode(this.f35111a) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder b11 = C6594f.b("Started(startTimestamp=", a.C0624a.a(this.f35111a), ", currentStep=");
            b11.append(this.f35112b);
            b11.append(", steps=");
            b11.append(this.f35113c);
            b11.append(")");
            return b11.toString();
        }
    }
}
