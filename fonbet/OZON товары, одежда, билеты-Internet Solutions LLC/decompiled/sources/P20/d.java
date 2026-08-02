package P20;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f21701a = new a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1332575031;
        }

        @NotNull
        public final String toString() {
            return "Equal";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f21702a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1801745603;
        }

        @NotNull
        public final String toString() {
            return "Greater";
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f21703a = new c(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1290109238;
        }

        @NotNull
        public final String toString() {
            return "Less";
        }
    }

    public d(int i11) {
    }
}
