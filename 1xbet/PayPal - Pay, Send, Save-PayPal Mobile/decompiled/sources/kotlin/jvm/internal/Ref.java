package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public class Ref {
    private Ref() {
    }

    /* loaded from: classes3.dex */
    public static final class ObjectRef<T> implements java.io.Serializable {
        public T element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.element);
        }
    }

    /* loaded from: classes17.dex */
    public static final class ByteRef implements java.io.Serializable {
        public byte element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf((int) this.element);
        }
    }

    /* loaded from: classes17.dex */
    public static final class ShortRef implements java.io.Serializable {
        public short element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf((int) this.element);
        }
    }

    /* loaded from: classes3.dex */
    public static final class IntRef implements java.io.Serializable {
        public int element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.element);
        }
    }

    public static final class LongRef implements java.io.Serializable {
        public long element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.element);
        }
    }

    /* loaded from: classes3.dex */
    public static final class FloatRef implements java.io.Serializable {
        public float element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.element);
        }
    }

    /* loaded from: classes17.dex */
    public static final class DoubleRef implements java.io.Serializable {
        public double element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.element);
        }
    }

    /* loaded from: classes17.dex */
    public static final class CharRef implements java.io.Serializable {
        public char element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.element);
        }
    }

    /* loaded from: classes3.dex */
    public static final class BooleanRef implements java.io.Serializable {
        public boolean element;

        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.element);
        }
    }
}
