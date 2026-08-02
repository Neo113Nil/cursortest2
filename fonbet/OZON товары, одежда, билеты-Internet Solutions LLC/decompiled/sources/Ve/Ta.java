package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Ta {

    /* renamed from: a, reason: collision with root package name */
    public static final Ta f30028a;

    /* renamed from: b, reason: collision with root package name */
    public static final Ta f30029b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Ta[] f30030c;

    static {
        Ta ta2 = new Ta("DEBIT_CARD", 0);
        f30028a = ta2;
        Ta ta3 = new Ta("ERROR", 1);
        f30029b = ta3;
        f30030c = new Ta[]{ta2, ta3};
    }

    public static Ta valueOf(String str) {
        return (Ta) Enum.valueOf(Ta.class, str);
    }

    public static Ta[] values() {
        return (Ta[]) f30030c.clone();
    }
}
