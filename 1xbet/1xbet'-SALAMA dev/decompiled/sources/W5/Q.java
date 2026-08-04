package W5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f6920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Q[] f6921b;

    static {
        Q q7 = new Q("INSTANCE", 0);
        f6920a = q7;
        f6921b = new Q[]{q7};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) f6921b.clone();
    }
}
