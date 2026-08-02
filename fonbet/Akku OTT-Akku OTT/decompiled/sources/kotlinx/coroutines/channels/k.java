package kotlinx.coroutines.channels;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
/* loaded from: classes5.dex */
public final class k<T> {
    public static final b Companion = new b();
    public static final c b = new c();
    public final Object a;

    public static final class a extends c {

        @JvmField
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.areEqual(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.k.c
        public final String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    public static final class b {
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Intrinsics.areEqual(this.a, ((k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
