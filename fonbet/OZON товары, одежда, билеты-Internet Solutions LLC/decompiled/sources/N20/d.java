package N20;

import C.o0;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f18448a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String value) {
            super(0);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f18448a = value;
        }

        @NotNull
        public final String a() {
            return this.f18448a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f18448a, ((a) obj).f18448a);
        }

        public final int hashCode() {
            return this.f18448a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Plain(value="), this.f18448a, ")");
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, String> f18449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Map<String, String> values) {
            super(0);
            Intrinsics.checkNotNullParameter(values, "values");
            this.f18449a = values;
        }

        @NotNull
        public final Map<String, String> a() {
            return this.f18449a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f18449a, ((b) obj).f18449a);
        }

        public final int hashCode() {
            return this.f18449a.hashCode();
        }

        @NotNull
        public final String toString() {
            return P.f(new StringBuilder("Plural(values="), this.f18449a, ")");
        }
    }

    public /* synthetic */ d(int i11) {
        this();
    }

    private d() {
    }
}
