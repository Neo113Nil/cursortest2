package R5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 R5.r[], still in use, count: 1, list:
  (r0v1 R5.r[]) from 0x002e: INVOKE (r0v1 R5.r[]) STATIC call: a.a.T(java.lang.Enum[]):l6.b A[MD:(java.lang.Enum[]):l6.b (m)] (LINE:47)
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
public final class r {
    OPEN(0),
    OPEN_MULTIPLE(1),
    SAVE(2),
    UNKNOWN(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B4.V f6204b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6210a;

    static {
        p003a.a.T(rVarArr);
        f6204b = new B4.V(10);
    }

    public r(int i7) {
        super(str, i);
        this.f6210a = i7;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f6209x.clone();
    }
}
