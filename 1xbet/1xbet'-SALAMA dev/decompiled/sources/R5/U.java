package R5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 R5.U[], still in use, count: 1, list:
  (r0v1 R5.U[]) from 0x004c: INVOKE (r0v1 R5.U[]) STATIC call: a.a.T(java.lang.Enum[]):l6.b A[MD:(java.lang.Enum[]):l6.b (m)] (LINE:77)
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
public final class U {
    DATE_INVALID(0),
    EXPIRED(1),
    ID_MISMATCH(2),
    INVALID(3),
    NOT_YET_VALID(4),
    UNTRUSTED(5),
    UNKNOWN(6);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p036e6.c f6103b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6111a;

    static {
        p003a.a.T(uArr);
        f6103b = new p036e6.c(11);
    }

    public U(int i7) {
        super(str, i);
        this.f6111a = i7;
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f6102A.clone();
    }
}
