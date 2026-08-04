package R5;

import p155w1.C1009l0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 R5.x[], still in use, count: 1, list:
  (r0v1 R5.x[]) from 0x001e: INVOKE (r0v1 R5.x[]) STATIC call: a.a.T(java.lang.Enum[]):l6.b A[MD:(java.lang.Enum[]):l6.b (m)] (LINE:31)
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
/* JADX INFO: renamed from: R5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0427x {
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_ALLOW(0),
    /* JADX INFO: Fake field, exist only in values array */
    COMPATIBILITY_MODE(1),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER_ALLOW(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1009l0 f6218b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6220a;

    static {
        p003a.a.T(enumC0427xArr);
        f6218b = new C1009l0(10);
    }

    public EnumC0427x(int i7) {
        super(str, i);
        this.f6220a = i7;
    }

    public static EnumC0427x valueOf(String str) {
        return (EnumC0427x) Enum.valueOf(EnumC0427x.class, str);
    }

    public static EnumC0427x[] values() {
        return (EnumC0427x[]) f6219c.clone();
    }
}
