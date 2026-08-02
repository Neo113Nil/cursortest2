package E30;

import C.o0;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f7422a = new a(0);
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        private final int f7423a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7424b;

        public b(int i11) {
            super(0);
            this.f7423a = R.plurals.wrong_pass_throttle;
            this.f7424b = i11;
        }

        public final int a() {
            return this.f7424b;
        }

        public final int b() {
            return this.f7423a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7423a == bVar.f7423a && this.f7424b == bVar.f7424b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7424b) + (Integer.hashCode(this.f7423a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Plrls(id=");
            sb2.append(this.f7423a);
            sb2.append(", count=");
            return K00.b.e(this.f7424b, ")", sb2);
        }
    }

    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final int f7425a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final K f7426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, @NotNull K params) {
            super(0);
            Intrinsics.checkNotNullParameter(params, "params");
            this.f7425a = i11;
            this.f7426b = params;
        }

        public final int a() {
            return this.f7425a;
        }

        @NotNull
        public final List<Object> b() {
            return this.f7426b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f7425a == cVar.f7425a && Intrinsics.d(this.f7426b, cVar.f7426b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f7425a) * 31;
            this.f7426b.getClass();
            return 1 + hashCode;
        }

        @NotNull
        public final String toString() {
            return "Str(id=" + this.f7425a + ", params=" + this.f7426b + ")";
        }
    }

    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f7427a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String text) {
            super(0);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f7427a = text;
        }

        @NotNull
        public final String a() {
            return this.f7427a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f7427a, ((d) obj).f7427a);
        }

        public final int hashCode() {
            return this.f7427a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Text(text="), this.f7427a, ")");
        }
    }

    public j(int i11) {
    }
}
