package O7;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final s f20048a = new a();

    final class a extends s {
        @Override // O7.s
        public final long a() {
            return System.nanoTime();
        }
    }

    protected s() {
    }

    public static s b() {
        return f20048a;
    }

    public abstract long a();
}
