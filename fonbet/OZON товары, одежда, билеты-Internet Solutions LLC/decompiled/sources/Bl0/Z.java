package Bl0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class Z {

    public static final class a extends Z {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3955a = new a();
    }

    public static final class b extends Z {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3956a;

        public b(ArrayList values) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.f3956a = values;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f3956a, ((b) obj).f3956a);
        }

        public final int hashCode() {
            return this.f3956a.hashCode();
        }

        public final String toString() {
            return "Sent(values=" + this.f3956a + ')';
        }
    }
}
