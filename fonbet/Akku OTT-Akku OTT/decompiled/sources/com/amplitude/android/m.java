package com.amplitude.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m {

    public static final class a extends m {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return "EnterForeground(timestamp=" + this.a + ')';
        }
    }

    public static final class b extends m {
        public final com.amplitude.core.events.a a;

        public b(com.amplitude.core.events.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Event(event=" + this.a + ')';
        }
    }

    public static final class c extends m {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return "ExitForeground(timestamp=" + this.a + ')';
        }
    }
}
