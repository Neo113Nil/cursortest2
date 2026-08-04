package R5;

import p155w1.C1013m0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 R5.y[], still in use, count: 1, list:
  (r0v1 R5.y[]) from 0x0028: INVOKE (r0v1 R5.y[]) STATIC call: a.a.T(java.lang.Enum[]):l6.b A[MD:(java.lang.Enum[]):l6.b (m)] (LINE:41)
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
/* JADX INFO: renamed from: R5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0428y {
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS(0),
    /* JADX INFO: Fake field, exist only in values array */
    IF_CONTENT_SCROLLS(1),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(2),
    UNKNOWN(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1013m0 f6221b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6224a;

    static {
        p003a.a.T(enumC0428yArr);
        f6221b = new C1013m0(10);
    }

    public EnumC0428y(int i7) {
        super(str, i);
        this.f6224a = i7;
    }

    public static EnumC0428y valueOf(String str) {
        return (EnumC0428y) Enum.valueOf(EnumC0428y.class, str);
    }

    public static EnumC0428y[] values() {
        return (EnumC0428y[]) f6223d.clone();
    }
}
