package P5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 P5.N[], still in use, count: 1, list:
  (r0v1 P5.N[]) from 0x0024: INVOKE (r0v1 P5.N[]) STATIC call: a.a.T(java.lang.Enum[]):l6.b A[MD:(java.lang.Enum[]):l6.b (m)] (LINE:37)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class N {
    PLATFORM_ENCODED(0),
    JSON_ENCODED(1),
    UNEXPECTED_STRING(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p036e6.c f5632b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5637a;

    static {
        p003a.a.T(nArr);
        f5632b = new p036e6.c(8);
    }

    public N(int i7) {
        super(str, i);
        this.f5637a = i7;
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f5636f.clone();
    }
}
