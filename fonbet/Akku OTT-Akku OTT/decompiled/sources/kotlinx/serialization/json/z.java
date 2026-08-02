package kotlinx.serialization.json;

@kotlinx.serialization.i(with = A.class)
/* loaded from: classes5.dex */
public abstract class z extends h {
    public static final a Companion = new a();

    public static final class a {
        public final kotlinx.serialization.b<z> serializer() {
            return A.a;
        }
    }

    public abstract String a();

    public String toString() {
        return a();
    }
}
