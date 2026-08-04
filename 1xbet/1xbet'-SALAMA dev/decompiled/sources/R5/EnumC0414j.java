package R5;

import p155w1.C1009l0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 R5.j[], still in use, count: 1, list:
  (r0v1 R5.j[]) from 0x0042: INVOKE (r0v1 R5.j[]) STATIC call: a.a.T(java.lang.Enum[]):l6.b A[MD:(java.lang.Enum[]):l6.b (m)] (LINE:67)
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
/* JADX INFO: renamed from: R5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0414j {
    DEBUG(0),
    ERROR(1),
    LOG(2),
    TIP(3),
    WARNING(4),
    UNKNOWN(5);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1009l0 f6179b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6187a;

    static {
        p003a.a.T(enumC0414jArr);
        f6179b = new C1009l0(9);
    }

    public EnumC0414j(int i7) {
        super(str, i);
        this.f6187a = i7;
    }

    public static EnumC0414j valueOf(String str) {
        return (EnumC0414j) Enum.valueOf(EnumC0414j.class, str);
    }

    public static EnumC0414j[] values() {
        return (EnumC0414j[]) f6186z.clone();
    }
}
