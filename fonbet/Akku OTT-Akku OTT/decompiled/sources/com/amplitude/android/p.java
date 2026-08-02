package com.amplitude.android;

/* loaded from: classes3.dex */
public abstract class p {

    public static final class a extends p {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1419869717;
        }

        public final String toString() {
            return "DeadClick";
        }
    }

    public static final class b extends p {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2068880111;
        }

        public final String toString() {
            return "ElementInteraction";
        }
    }

    public static final class c extends p {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1722948770;
        }

        public final String toString() {
            return "RageClick";
        }
    }
}
